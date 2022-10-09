package org.xiaowu.behappy.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "org.xiaowu.behappy",exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "org.xiaowu.behappy")
public class BehappyStatisticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BehappyStatisticsApplication.class, args);
    }

}
