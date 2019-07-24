package com.jsonCoversion;

public class Employee
{
  public static void main(String[] args) 
  {
	Details d = new Details();
	d.setEMployee_no(1255);
	d.setName("tarun");
	d.setSalary(50000000.67);
	 String JsonEmployee  = JsonCovert.ConvertToJson(d);
	 System.out.println(JsonEmployee);
	
  }
}
