package com.example.strangeLetter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class StrangeLetterApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(StrangeLetterApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StrangeLetterApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOGGER.info("启动成功！");
        LOGGER.info("地址:\t http://127.0.0.1:{}",env.getProperty("server.port"));
//        SpringApplication.run(StrangeLetterApplication.class, args);
    }

}
