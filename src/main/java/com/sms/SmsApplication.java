package com.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);

        // 自动打开网页
        String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://localhost/pages/login.html";
        Runtime run = Runtime.getRuntime();
        try{
            run.exec(cmd);
            System.out.println("浏览器打开项目成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
