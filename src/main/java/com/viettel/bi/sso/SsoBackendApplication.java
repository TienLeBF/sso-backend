package com.viettel.bi.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class })

public class SsoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoBackendApplication.class, args);
    }

}
