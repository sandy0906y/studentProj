package com.pol.pak.student.SchoolStudent.reqResModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentBaseDetailsRes {
	
	public String studentName;
	public long studentId;

}
