package com.pol.pak.student.SchoolStudent.service;

import com.pol.pak.student.SchoolStudent.reqResModel.StudentBaseDetailsReq;
import com.pol.pak.student.SchoolStudent.reqResModel.StudentBaseDetailsRes;

public interface StudentDetailsServ {
	
	public StudentBaseDetailsRes saveStudentDetails(StudentBaseDetailsReq req);

}
