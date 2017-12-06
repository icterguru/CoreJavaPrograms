package com;

import dao.TestDB;
import dao.employeedatabase;

public class CustomerClass 
{
	public static void main(String[] args)
	{
		employeedatabase edb=new employeedatabase();
		edb.createConnection();
		edb.getManagerNames();
		edb.doInsertEmployee();
		edb.readNInsertEmpList();
		System.out.println("*************");
	}
}