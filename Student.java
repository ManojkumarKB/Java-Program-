package strings;

import java.util.Scanner;

public class Student {
	String name;
	int studentid;
	int []marks;
	Student(String name,int studentid,int []marks)
	{
		this.name=name;
		this.studentid=studentid;
		this.marks=marks;
	}
	void getDetails()
	{
		System.out.println("Student name:"+name);
		System.out.println("Student id:"+studentid);
	}
	char getGrades(int []marks)
	{
		int sum=0;
		for(int i:marks)
		{
			sum=sum+i;
		}
	    float avg=sum/marks.length;
	    if((avg>=90)&&(avg<=100))
	    	return 'A';
	    if((avg>=60)&&(avg<90))
	    	return 'B';
	    if((avg>=50)&&(avg<60))
	    	return 'C';
	    else
	    	return 'F';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter you id");
	    int id=sc.nextInt();
	    System.out.println("Enter the five subject marks");
	    int []marks=new int[5];
	    for(int i=0;i<5;i++)
	    	marks[i]=sc.nextInt();
		Student s1=new Student(name,id,marks);
		s1.getDetails();
		System.out.println("Grade:"+s1.getGrades(marks));
		System.out.println("Enter your name");
		String name2=sc.next();
		System.out.println("Enter your id");
	    int id2=sc.nextInt();
	    System.out.println("Enter the five subject marks");
	    int []marks2=new int[5];
	    for(int i=0;i<5;i++)
	    	marks2[i]=sc.nextInt();
		Student s2=new Student(name2,id2,marks2);
		s2.getDetails();
		System.out.println("Grade:"+s2.getGrades(marks2));
		sc.close();
	}

}
