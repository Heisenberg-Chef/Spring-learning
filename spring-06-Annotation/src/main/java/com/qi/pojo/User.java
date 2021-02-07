package com.qi.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


// 等价于在 <bean id ......> 配置好了
@Component
@Data
public class User {
//    @Value("Ray")
    public String name = "Heisenberg";

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
