package com.study.attendance;

import com.study.attendance.bean.Person;
import com.study.attendance.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceApplication {


    public static void main(String[] args) {
        SpringApplication.run(AttendanceApplication.class, args);


    }

}
