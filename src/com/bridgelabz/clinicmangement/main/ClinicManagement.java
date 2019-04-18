package com.bridgelabz.clinicmangement.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ClinicManagement {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser=new JSONParser();
		
		FileReader reader=new FileReader("E:\\eclipseprograms\\functional_programs\\src\\com\\bridgelabz\\clinicmangement\\model\\Doctors.json");
    	Object obj=jsonParser.parse(reader);
    	JSONObject doctorList=(JSONObject)obj;
    	JSONArray jsonarray=(JSONArray) doctorList.get("Doctors");
    //	Iterator<Object> iterator=new jsonarray.iterator(); 
    	
	}

}
