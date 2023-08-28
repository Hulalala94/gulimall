package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.Integrate MyBatis
 *      1)import dependencies
 *      <dependency>
 *          <groupeId>com.baomidou</groupeId>
 *          <artifactId>mybatis-plus-boot-starter</artifactId>
 *          <version>3.2.0</version>
 *      </dependency>
 *      2)configuration
 *        1.Configure Data Source配置数据源
 *          1）导入数据库的驱动
 *          2)在application.yml里面配置数据源相关信息
 *        2.配置mybatis-plus
 *          1）使用@MapperScan
 *          2）告诉Mybatis-plus，sql映射文件位置
 *
 *
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
