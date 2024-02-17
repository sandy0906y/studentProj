package com.pol.pak.student.SchoolStudent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pol.pak.student.SchoolStudent.model.StudentAddressTb;
import com.pol.pak.student.SchoolStudent.model.StudentDetailsTb;
import com.pol.pak.student.SchoolStudent.repocitory.AddressSaveRepo;
import com.pol.pak.student.SchoolStudent.reqResModel.StudentBaseDetailsReq;
import com.pol.pak.student.SchoolStudent.reqResModel.StudentBaseDetailsRes;

@Service
public class StudentDetailsServImp implements StudentDetailsServ{
	
	@Autowired
	AddressSaveRepo dataSaveRepo;

	@Override
	public StudentBaseDetailsRes saveStudentDetails(StudentBaseDetailsReq req) {
		// TODO Auto-generated method stub
		
		StudentDetailsTb studet = StudentDetailsTb.builder()
				.studentName(req.getStudentName())
				.studentFatherName(req.getStudentFatherName())
				.studentage(req.getStudentage())
				.studentmothername(req.getStudentMotherName())
				.studentLocation(req.getStudentLocation())
				.build();
		
		StudentAddressTb addDet = StudentAddressTb.builder()
				.studentCity(req.getStudentCity())
				.studentArea(req.getStudentArea())
				.studentDistic(req.getStudentDistic())
				.studentHomeNo(req.getStudentHomeNo())
				.studDet(studet)
				.build();
		
		dataSaveRepo.save(addDet);
		
		
		
		return new StudentBaseDetailsRes(studet.getStudentName(),studet.getStudentId());
	}

}
