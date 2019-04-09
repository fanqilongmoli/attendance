package com.study.attendance.repository;

import com.study.attendance.bean.LeaveT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTRepository extends JpaRepository<LeaveT,Long> {
}
