package com.backbase.stream.compositions.integration.legalentity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class Application extends SpringBootServletInitializer {
    public static void main(final String[] args) {
        log.debug("Starting application with parameters {}", Arrays.toString(args));
        SpringApplication.run(Application.class, args);
    }
}
