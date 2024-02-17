package com.pol.pak.student.SchoolStudent.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentAddressTb {
	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 long addId;
	 public String studentCity;
	 public String studentArea;
	 public String studentHomeNo;
	 public String studentDistic;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "student_det_Id", referencedColumnName = "student_id_val")
	 public StudentDetailsTb studDet;

}
