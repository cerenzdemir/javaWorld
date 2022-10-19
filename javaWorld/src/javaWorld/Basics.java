package javaWorld;

public class Basics {

	public static void main(String[] args) {
		// Variables
		int studentNumber = 12;
		String message = "Student Number : ";
		System.out.println(message + studentNumber);

		double number = 12.5;
		char character = '*';
		int numbertwo = 12;

		// Conditionals
		int numberThree = 20;
		if (numberThree < 20) {
			System.out.println("Number is less than 20");
				} 
		else if (numberThree == 20) {
			System.out.println("Number is equal to 20");
				} else {
					System.out.println("Number is not less than 20");
				}
				//
		int sayı1 = 226;
		int sayı2 = 25;
	    int sayı3 = 26;
		int biggestNum=sayı1;
				
		    if(biggestNum<sayı2) {
					biggestNum=sayı2;
				}
			if (biggestNum<sayı3) {
					biggestNum=sayı3;
				}
			 System.out.println("Biggest = "+ biggestNum );
				
				//char
		char grade = 'A';
				
				switch (grade) {
				    case'A':
				        System.out.println("Perfect!: you passed");
				        break;
				    case'B':
				        System.out.println("Excellent!: you passed");
				        break;
				    case'C':
				        System.out.println("Good! : you passed");
				        break;
				    case'D':
				        System.out.println("Not bad! : you passed");
				        break;
				    case'F':
				        System.out.println("Unfortunately : you failed");
				        break;
				    default:
				        System.out.println("Invalid grade entry");
				}
				
				//For cycle
				for(int i=1;i<=10;i++) {
					System.out.println(i);
				}	
				System.out.println("Cycle is finished");
				
				for(int k=1;k<=10;k+=2) {
					System.out.println(k);
				}
				System.out.println("Finish");
				
				for(int g=2;g<=10;g+=2) {
					System.out.println(g);
				}
				System.out.println("Finish");
				
				//While
				int z=1;
				while(z<10) {
				      System.out.println(z);
				}
				System.out.println("While cycle is finis");
				
				//Do-While
				int j=100;
				do {
					System.out.println(j);
					j+=2;
				}while(j<10);
				System.out.println("Do-While cycle is finish");
				
				
				//
				int numberFour=25;
				int remainder=numberFour%2;
				//System.out.println(remainder);
				boolean isPrime = true;
				for (int c=2; c<numberFour;c++) {
					if(numberFour % c == 0){
						isPrime = false;
					}
				if(isPrime) {
					System.out.println("Number is prime");
					}else{
				 	System.out.println("Number is not prime");
				}
				
				String student1= "Ceren";
				String student2= "Ali";
				String student3= "Ayşe";
				String student4= "Mahmut";
				
				System.out.println(student1);
				System.out.println(student2);
				System.out.println(student3);
				System.out.println(student4);
				
				System.out.println("---------------------------");
				
				String[] students = new String[4];
				students[0]="Ceren";
				students[1]="Ali";
				students[2]="Ayşe";
				students[3]="Mahmut";
				
				for (int y=0;y<students.length;y++) {
					System.out.println(students[y]);
				}
				for(String student:students) {System.out.println(student);
				{
				System.out.println(student);
					}
				}	
	}

}
