package com.csu.ohio.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csu.ohio.student.entity.SemesterEntity;

public interface SemesterDAO extends JpaRepository<SemesterEntity, String> {

}
