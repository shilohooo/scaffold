package com.cuckooji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author cuckooji
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CuckoojiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CuckoojiApplication.class, args);
    }
}
