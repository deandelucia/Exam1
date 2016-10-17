package com.cisc181.core;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	UUID CourseID;
	String CourseName;
	int GradePoints;
	eMajor Major;
	
	Course(){
		CourseID = UUID.randomUUID();
		CourseName = "";
		GradePoints = 0;
		Major = this.Major;
		
	}
	Course(UUID CID, String CN, int p, eMajor m){
		CourseID = CID;
		CourseName = CN;
		GradePoints = p;
		Major = m;
	}
}
