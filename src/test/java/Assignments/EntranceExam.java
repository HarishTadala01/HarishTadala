package Assignments;

public class EntranceExam {

	public static void main(String[] args) {
		String exam="UPSC";
		int Pre_Marks = 70;
		int Main_Marks = 65;
		int Interview_Marks = 97;
		String Position = "Civil Servant";
		//String Position = "IAS";

		if (Pre_Marks>=65 && Main_Marks>=55) { 
			
			if (Interview_Marks>=70) {
				
				if (Position=="Civil Servant") {
					System.out.println("Congratulation now you became the IAS Officer");
					
				} else {
					System.out.println("Please select any other Civil Service officer rank IPS or IFS or IRS");
				}
			} else {
				System.out.println("Please be prepared for interview 2nd chance");
			}

		} else {
			System.out.println("Better luck next time");
		}

	}

}
