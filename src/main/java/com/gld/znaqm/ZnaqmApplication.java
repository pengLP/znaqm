package com.gld.znaqm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.gld.znaqm.mapper")
public class ZnaqmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZnaqmApplication.class, args);
    }

}
