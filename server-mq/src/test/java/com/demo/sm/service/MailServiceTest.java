package com.demo.sm.service;

import com.demo.sm.model.SimpleMailGunMsg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService service;

    @Test
    public void sendMailGunMsg() throws IOException {
        List<String> to = new ArrayList<>();
        to.add("cjw1010@dingtalk.com");

//        List<FileSystemResource> att = new ArrayList<>();
//        att.add(new FileSystemResource("/Users/zhoukai/Downloads/a.txt"));

        List<SimpleMailGunMsg.FileInfo> att = new ArrayList<>();
        att.add(new SimpleMailGunMsg.FileInfo("id","斗破苍穹.txt","/Users/zhoukai/Downloads/a.txt"));
        SimpleMailGunMsg msg = SimpleMailGunMsg.builder().from("806926235@qq.com").to(to).subject("12点56").text("12点56").attachment(att).build();
        service.sendMailGunMsg(msg);
    }

}