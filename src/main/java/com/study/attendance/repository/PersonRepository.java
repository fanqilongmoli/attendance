package com.study.attendance.repository;

import com.study.attendance.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
