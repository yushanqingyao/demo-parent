package com.demo.sm.service;

import com.demo.sm.model.SimpleMailGunMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class MailService {

    @Autowired
    @Qualifier("mailRestTemplate")
    private RestTemplate template;

    public boolean sendMailGunMsg(SimpleMailGunMsg msg) throws IOException {
        HttpHeaders header = new HttpHeaders();
        if (msg.getContentType() != null && msg.getContentType().length() > 0) {
            header.add("content-type", msg.getContentType());
        }


        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<>(msg.buildParam(), header);
        ResponseEntity<String> exchange = template.exchange("https://api.mailgun.net/v3/mail.bluespirit.5t5tt.com/messages", HttpMethod.POST, httpEntity, String.class);
        String body = exchange.getBody();
        System.out.println(body);

        return true;
    }
}
