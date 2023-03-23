package org.braindata.Test;

import java.util.Scanner;

import org.braindata.model.Student;

public class StudentTest extends Student{
		public void m1()
		{
			Student s=new Student();
			StudentTest st=new StudentTest();
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Rollno = ");
			st.rollno=sc.nextInt();
			
			System.out.print("Enter Student Name = ");
			st.name=sc.next();
			
		    System.out.print("Enter Student Contact no = ");
			s.mobno=sc.nextLong();
			
			System.out.print("Enter Student Address = ");
			s.addr=sc.next();
				
			System.out.print("Enter Fees = ");
			s.fees=sc.nextDouble();
			    
			System.out.print("Enter  College name = ");
			s.clgname=sc.next();
		   
		    System.out.println();
		    System.out.println("*******STUDENT RECORDS ******");
		    System.out.println("----------------------------------");
			System.out.println("Student Rollno ="+st.rollno);
			System.out.println("Student Name = "+st.name);
		    System.out.println("Student Contact no "+s.mobno);
			System.out.println("Course Fees = "+s.fees);
            System.out.println("Student Address = "+s.addr);
		    System.out.println("College Name = "+s.clgname);
		}
		public static void main(String args[])
		{
			StudentTest st=new StudentTest();
			st.m1();
		}
		
}