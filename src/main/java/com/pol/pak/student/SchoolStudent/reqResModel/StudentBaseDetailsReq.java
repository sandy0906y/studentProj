package com.pol.pak.student.SchoolStudent.reqResModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentBaseDetailsReq {
	
	public String studentName;
	public int studentage;
	public String studentFatherName;
	public String studentMotherName;
	public String studentLocation;
	public String studentCity;
	public String studentArea;
	public String studentHomeNo;
	public String studentDistic;

}
