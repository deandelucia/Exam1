package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	Enrollment(){
		SectionID = UUID.randomUUID();
		StudentID = UUID.randomUUID();
		EnrollmentID = UUID.randomUUID();
		Grade = 0;
		
	}
	Enrollment(UUID SecID, UUID SID, UUID EID, double g){
		SectionID = SecID;
		StudentID = SID;
		EnrollmentID = EID;
		Grade = g;
	}
	Enrollment(UUID SecID, UUID SID){
		SectionID = SecID;
		StudentID = SID;
		EnrollmentID = UUID.randomUUID();
	}
	public void SetGrade(double grade){
		Grade = grade;
	}
}
