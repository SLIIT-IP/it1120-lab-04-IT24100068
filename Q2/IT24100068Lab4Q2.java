import java.util.Scanner;
public class IT24100068Lab4Q2{
	public static void main(String[]args){
		int examMarks,labMarks,percentageExam,percentageLab, sumOfpercentage;
		double finalMark;
		Scanner input= new Scanner(System.in);
		System.out.println("please enter exam marks(out of 100) :");
		examMarks=input.nextInt();
		if(examMarks >=0 || examMarks<=100)
		{
		System.out.println("please enter lab submission marks (out of 100) :");
		labMarks=input.nextInt();

		if(labMarks >=0 || labMarks<=100)
		{
		System.out.println("please enter given for the exam :");
		percentageExam=input.nextInt();

		System.out.println("please enter given for the lab submission :");
		percentageLab=input.nextInt();

		sumOfpercentage = percentageExam+ percentageLab;  
		if(sumOfpercentage ==100){

		finalMark=(examMarks*percentageExam/100) + (labMarks*percentageLab/100);
		System.out.println("Final Exam Mark is : " +finalMark);
		}
		else{
		System.out.println("The percentages must add up to 100. Terminating progra. ");
		}
	    }
		else{
		System.out.println("Invalid input for exam marks. Terminating progra. ");
		}
	    }
	}
}

