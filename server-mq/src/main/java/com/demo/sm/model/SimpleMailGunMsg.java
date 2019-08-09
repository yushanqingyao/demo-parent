package com.demo.sm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.*;

import java.io.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SimpleMailGunMsg {
    /**
     * 发件人
     */
    private String from;
    /**
     * 收件人
     */
    private List<String> to;
    /**
     * 标题
     */
    private String subject;
    /**
     * 内容
     */
    private String text;
    /**
     * 抄送
     */
    private List<String> cc;
    /**
     * 秘抄
     */
    private List<String> bcc;
    /**
     * 附件
     */
//    private List<File> attachment;
    private List<FileInfo> attachment;

    private String contentType;

    public MultiValueMap<String, Object> buildParam() throws IOException {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap();
        map.add("from", from);
        Assert.isTrue(!StringUtils.isEmpty(from), "发件人不能为空");
        map.add("subject", subject);
        map.add("text", text);
        Assert.isTrue(!CollectionUtils.isEmpty(to), "收件人不能为空");
        map.addAll("to", to);
        if (!CollectionUtils.isEmpty(cc)) {
            map.addAll("cc", cc);
        }
        if (!CollectionUtils.isEmpty(bcc)) {
            map.addAll("bcc", bcc);
        }
        if (!CollectionUtils.isEmpty(attachment)) {
            for (FileInfo fileInfo : attachment) {
                File file = new File(fileInfo.getFilePath());
                String newName = fileInfo.getNewName();
                Assert.isTrue(file.exists(), String.format("%s不存在", file.getAbsolutePath()));
                FileInputStream fis = new FileInputStream(file);
                byte[] bytesArray = new byte[(int) file.length()];
                fis.read(bytesArray);
                fis.close();
                ByteArrayResource contentsAsResource = new ByteArrayResource(bytesArray) {
                    @Override
                    public String getFilename() {
                        return newName;
                    }
                };
                map.add("attachment", contentsAsResource);
            }
        }
        return map;
    }

    public static class FileInfo {
        private String id;
        private String newName;
        private String filePath;

        public FileInfo(String id, String newName, String filePath) {
            this.id = id;
            this.newName = newName;
            this.filePath = filePath;
        }

        public String getId() {
            return id;
        }


        public String getNewName() {
            return newName;
        }


        public String getFilePath() {
            return filePath;
        }

    }
}
