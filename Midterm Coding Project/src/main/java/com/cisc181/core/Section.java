package com.cisc181.core;
import java.util.UUID;

public class Section {
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
	Section(){
		CourseID = UUID.randomUUID();
		SemesterID = UUID.randomUUID();
		SectionID = UUID.randomUUID();
		RoomID = 0;
		}
	
	Section(UUID CID, UUID Sem, UUID Sec, int RID){
		CourseID = CID;
		SemesterID = Sem;
		SectionID = Sec;
		RoomID = RID;
	}
}
