package com.gao.springboot.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

//使得@ConfigurationProperties生效有两种方式:
// 1.某个地方加上@EnableConfigurationProperties(Person.class)，这种方式内部也是将Person.class注册为spring的一个bean
// 2.此类加上@Component
//@Component
@ConfigurationProperties(prefix = "com.example.demo")
public class Person {

    private String name;

    private Integer age;

    private Map<String, Phone> map;

//    private List<String> address;
//    private Phone phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, Phone> getMap() {
        return map;
    }

    public void setMap(Map<String, Phone> map) {
        this.map = map;
    }

//    public List<String> getAddress() {
//        return address;
//    }
//
//    public void setAddress(List<String> address) {
//        this.address = address;
//    }
//
//    public Phone getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Phone phone) {
//        this.phone = phone;
//    }

}
