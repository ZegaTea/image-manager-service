package com.ttc.faceid;

import com.ttc.faceid.base.Base;
import com.ttc.faceid.util.config.Constant;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.management.ManagementFactory;
import java.util.Properties;

/**
 * Created by tudv on 2019/09/11
 */
@SpringBootApplication
@EnableScheduling
public class ImageManagerServiceMain extends Base {
    public static void main(String[] args) {
        Properties pros = new Properties();
        pros.put("server.port", Constant.SERVICE_PORT);

        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder()
                .sources(ImageManagerServiceMain.class)
                .properties(pros);
        applicationBuilder.run(args);

        logger.info("Service start at port {}\t{}", Constant.SERVICE_PORT, ManagementFactory.getRuntimeMXBean().getName());

    }
}
