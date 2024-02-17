package com.pol.pak.student.SchoolStudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pol.pak.student.SchoolStudent.reqResModel.StudentBaseDetailsReq;
import com.pol.pak.student.SchoolStudent.reqResModel.StudentBaseDetailsRes;
import com.pol.pak.student.SchoolStudent.service.StudentDetailsServImp;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	StudentDetailsServImp studentSave;
	
	@PostMapping("/saveDet")
	public StudentBaseDetailsRes saveStudentDetails(@RequestBody StudentBaseDetailsReq req) {
		
		
		return studentSave.saveStudentDetails(req);
		
	}

}
