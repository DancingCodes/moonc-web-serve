package love.moonc.mooncserve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("love.moonc.mooncserve.mapper")
public class MooncServeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MooncServeApplication.class, args);
    }
}
