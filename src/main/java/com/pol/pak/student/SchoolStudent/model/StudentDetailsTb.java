package com.pol.pak.student.SchoolStudent.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDetailsTb {
	
	@Id
	@SequenceGenerator(
			name = "student_id",
			sequenceName = "student_id",
			allocationSize = 1
			
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_id"
			
			)
	@Column(name = "student_id_val")
	public long studentId;
	public String studentName;
	public int studentage;
	public String studentFatherName;
	public String studentmothername;
	public String studentLocation;

}
