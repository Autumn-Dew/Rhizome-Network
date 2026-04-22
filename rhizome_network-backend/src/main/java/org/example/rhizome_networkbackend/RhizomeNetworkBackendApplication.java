package org.example.rhizome_networkbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.rhizome_networkbackend.mappers") // 扫描 Mapper 接口
public class RhizomeNetworkBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhizomeNetworkBackendApplication.class, args);
    }

}
