package com.cisc181.core;
import java.util.Date;
import java.util.UUID;
public class Semester {
	UUID SemesterID;
	Date StartDate;
	Date EndDate;
	
	Semester(){
		SemesterID = UUID.randomUUID();
		StartDate = new Date();
		EndDate = new Date();
		
	}
	Semester(UUID SID, Date SD, Date ED){
		SemesterID = SID;
		StartDate = SD;
		EndDate = ED;
	}
}
