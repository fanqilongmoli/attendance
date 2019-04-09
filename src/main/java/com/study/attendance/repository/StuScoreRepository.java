package com.study.attendance.repository;

import com.study.attendance.bean.StuScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuScoreRepository extends JpaRepository<StuScore,Long> {
}
