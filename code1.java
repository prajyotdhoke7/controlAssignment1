/*1. Write a program to check whether the given number is positive or not.(take hardcoded
values)
Input: num = 5;
Output: 5 is a positive number.
Input: num = -9;
Output: -9 is a negative number.*/
class Code1{
	public static void main(String[] args){
		//input is 5
		int num1=5;
		if (num1>0){
			System.out.println("Number is positive");
		}
		else if(num1<0){
			System.out.println("Number is negative");
		}
		else{
			System.out.println("Number is zero");
		}
		
		//input is -9
		int num2=-9;
                if (num2>0){
                        System.out.println("Number is positive");
                }
                else if(num2<0){
                        System.out.println("Number is negative");
                }
                else{
                        System.out.println("Number is zero");
                }
	}
}
