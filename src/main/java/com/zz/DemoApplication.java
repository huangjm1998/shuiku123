package com.zz;

import com.zz.common.config.SocketTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
        //new SocketTest(9999).start();
    }

//     static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
//    @Async
//    @Scheduled(fixedDelay = 5000)
//    public void test11(){
//       logger.info ("=======>:"+"杨丹玲是个哈皮");
//    }


}
