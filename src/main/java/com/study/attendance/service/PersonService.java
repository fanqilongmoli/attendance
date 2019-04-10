package com.study.attendance.service;

import com.study.attendance.bean.Classes;
import com.study.attendance.bean.Person;
import com.study.attendance.repository.ClassesRepository;
import com.study.attendance.repository.PersonRepository;
import com.study.attendance.utils.ConstantValue;
import com.study.attendance.vo.OkResult;
import com.study.attendance.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ClassesRepository classesRepository;

    public OkResult add(Person person) {
        personRepository.save(person);
        return new OkResult(true);
    }

    public List<PersonVo> list(Person person) {
        List<PersonVo> personVos = new ArrayList<>();
        final Person probe = new Person();
        probe.setType(person.getType());
        final List<Person> all = personRepository.findAll(Example.of(probe));
        all.forEach(person1 -> {
            PersonVo personVo = new PersonVo();
            personVo.setId(person1.getId());
            personVo.setUsername(person1.getUsername());
            personVo.setNo(person1.getNo());
            personVo.setSex(person1.getSex());
            personVo.setPhone(person1.getPhone());
            if (person.getType() == ConstantValue.TYPR_STUDENT){
                final Classes classes = classesRepository.findById(person1.getClassesId()).orElse(null);
                if (classes!=null){
                    personVo.setClassesId(classes.getName());
                }else {
                    personVo.setClassesId("---");
                }
            }
            personVos.add(personVo);

        });
        return personVos;
    }

    public OkResult del(Person person) {
        personRepository.deleteById(person.getId());
        return new OkResult(true);
    }
}
