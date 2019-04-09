package com.study.attendance.repository;

import com.study.attendance.bean.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study,Long> {
}
