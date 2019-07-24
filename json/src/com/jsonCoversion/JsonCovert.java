package com.jsonCoversion;

import org.codehaus.jackson.map.ObjectMapper; 


public class JsonCovert
{
 private  static ObjectMapper mapper;
 
 static 
 {
	 mapper = new ObjectMapper();
 }
 public static String ConvertToJson(Object obj) 
 {
	 try{
	 String jsonResult= "";
	 jsonResult= mapper.writeValueAsString( obj);
	return jsonResult;
	 }
	 catch(Exception e){System.out.println("error");}
	return null;
 }
}
