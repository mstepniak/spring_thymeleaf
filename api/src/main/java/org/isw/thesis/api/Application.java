package org.isw.thesis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Author MichalS.
 * Mail: michas1991@gmail.com
 */
@SpringBootApplication
@ImportResource({"classpath:app.xml"})
@ComponentScan(basePackages = "org.isw.thesis")
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
