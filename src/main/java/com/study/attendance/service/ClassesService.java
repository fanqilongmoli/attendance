package com.study.attendance.service;

import com.study.attendance.bean.Classes;
import com.study.attendance.repository.ClassesRepository;
import com.study.attendance.vo.OkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    ClassesRepository classesRepository;

    public OkResult add(Classes classes) {
        classesRepository.save(classes);
        return new OkResult(true);
    }

    public List<Classes> list() {
        return classesRepository.findAll();
    }

    public OkResult del(Long id) {
        classesRepository.deleteById(id);
        return new OkResult(true);
    }
}
