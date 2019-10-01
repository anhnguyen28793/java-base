package vn.com.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BaseApplication {
    private static final Logger LOGGER = LogManager.getLogger(BaseApplication.class);

    public static void main(String[] args) {
        LOGGER.info("TESSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTT");

        SpringApplication.run(BaseApplication.class, args);
    }

}
