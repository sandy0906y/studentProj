package com.pol.pak.student.SchoolStudent.repocitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pol.pak.student.SchoolStudent.model.StudentAddressTb;

@Repository
public interface AddressSaveRepo extends JpaRepository<StudentAddressTb, Long>{

}
