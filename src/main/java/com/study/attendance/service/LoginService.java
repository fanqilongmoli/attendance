package com.study.attendance.service;

import com.study.attendance.bean.Person;
import com.study.attendance.exception.BaseRuntimeException;
import com.study.attendance.params.LoginParams;
import com.study.attendance.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    PersonRepository personRepository;

    public Person login(LoginParams loginParams) {

        Person personEx = new Person();
        personEx.setType(loginParams.getUserType());
        personEx.setUsername(loginParams.getUsername());
        Person person = personRepository.findOne(Example.of(personEx)).orElse(null);
        if (person != null) {
            return person;
        }
        throw new BaseRuntimeException("用户不存在");
    }
}
