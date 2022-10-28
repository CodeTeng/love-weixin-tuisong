package ydzhao.weixin.tuisong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author teng
 */
@SpringBootApplication
@EnableScheduling
public class MainStart {
    public static void main(String[] args) {
        SpringApplication.run(MainStart.class, args);
    }
}
