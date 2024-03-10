/*5. Write a program to check whether the given number is divisible by 7 or not.
Input : 105
Output: Divisible by 7
Input: -31
Output: Not divisible by 7*/
class Code5{
	public static void main(String[] args){
		//input is 105
		int num1=105; 
		if(num1%7==0){
			System.out.println(num1+" is Divisiable by 7");
		}
		else{
			System.out.println(num1+" is not Divisiable by7");
		}
		//input is -31
                int num2=-31;
                if(num2%7==0){
                        System.out.println(num2+" is Divisiable by 7");
                }
                else{
                        System.out.println(num2+" is not Divisiable by7");
                }
	}
}
