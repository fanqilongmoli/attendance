package com.study.attendance.repository;

import com.study.attendance.bean.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes,Long> {
}
