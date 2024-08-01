package javapractices2;

class StaticVsInstance {
	int marks=100; //Non static
	static int rollno=200; //Static
}


public class StaticVsInstanceExample {

	public static void main(String[] args) {
		// Static

		StaticVsInstance s1= new StaticVsInstance();
		System.out.println("S1 Marks: "+s1.marks);

		StaticVsInstance s2= new StaticVsInstance();
		System.out.println("S2 Marks: "+s2.marks);

		StaticVsInstance s3= new StaticVsInstance();
		System.out.println("S3 Marks: "+s3.marks);

		System.out.println("###################################");

		s1.marks=101;// as per the assigned only value applied to that particular object

		System.out.println("S1 Marks: "+s1.marks);
		System.out.println("S2 Marks: "+s2.marks);
		System.out.println("S3 Marks: "+s3.marks);

		System.out.println("###################################");


		//Non Static

		System.out.println("S1 Rollno: "+s1.rollno);
		System.out.println("S2 Rollno: "+s2.rollno);
		System.out.println("S3 Rollno: "+s3.rollno);
		
		System.out.println("###################################");

		s1.rollno=201;// same value applied to all objects

		System.out.println("S1 Rollno: "+s1.rollno);
		System.out.println("S2 Rollno: "+s2.rollno);
		System.out.println("S3 Rollno: "+s3.rollno);

	}

}
