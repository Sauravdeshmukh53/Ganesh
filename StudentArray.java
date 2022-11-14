import java.util.*;
class Student{
	int roll;
	double marks;
	
	Student(){
		roll =0;
		marks=0.0;
	}
	Student(int roll,double marks){
		this.roll=roll;
		this.marks=marks;
	}
	void printdetails(){
		System.out.println(roll+" "+marks);
	}
}
class StudentArray{
	public static void main(String args[]){
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		size=sc.nextInt();
		
		Student stud[]=new Student[size];
		
		System.out.println("Please 5 student details:");
		for(int i=0;i<size;i++){
			System.out.println("Enter roll and marks");
			int r=sc.nextInt();
			double m=sc.nextDouble();
			stud[i]=new Student(r,m);
		}
		System.out.println("Enter details are:");
		for(int i=0;i<size;i++){
			stud[i].printdetails();
		}
	}
}
