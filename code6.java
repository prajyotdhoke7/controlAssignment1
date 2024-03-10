/*6. Write a program to check whether the given number is divisible by 3 or 7.
Input: 15
Output: 15 is divisible by 3

Input: 28
Output: 28 is divisible by 7
Input: 20
Output: 20 is neither divisible by 3 nor by 7.*/
class Code6{
	public static void main(String[] args){
		//input is 15
		int num1=15;
                if(num1%3==0){
                        System.out.println(num1+" is Divisiable by 3");
                }
                else{
                        System.out.println(num1+" is Divisiable by 7");
                }
		//input is 28
                int num2=28;
                if(num2%3==0){
                        System.out.println(num2+" is Divisiable by 3");
                }
                else{
                        System.out.println(num2+" is Divisiable by 7");
                }
		//input is 20
                int num3=20;
                if(num3%3==0){
                        System.out.println(num3+" is Divisiable by 3");
                }
                else if(num3%7==0){
                        System.out.println(num3+" is Divisiable by 7");
                }
		else{
			System.out.println(num3+" is neither divisiable by 7 nor 3");
		}
	
	}
}
