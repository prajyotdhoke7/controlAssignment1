/*Write a program to find the maximum between two distinct numbers. (take hardcoded
values)
Input 1:
num1 = 5
num2 = 9
Output: 9 is maximum between 5,9
Input 1:
num1 = 1
num2 = 2
Output: 2 is maximum between 1,2*/

class Code7{
        public static void main(String[] args){
		int num1=5;
		int num2=9;
		if(num1>num2){
			System.out.println(num1+" is maximum between" +num1+","+num2);
		}
		else if (num1<num2){
			System.out.println(num2+" is MAXIMUM between "+num1+","+num2);
		}
		else{
			System.out.println(num1+" is equal to "+num2);
		}
		int num3=1;
                int num4=2;
                if(num3>num4){
                        System.out.println(num3+" is maximum between" +num3+","+num4);
                }
                else if (num3<num4){
                        System.out.println(num4+" is MAXIMUM between "+num3+","+num4);
                }
                else{
                        System.out.println(num3+" is equal to "+num4);
                }

        }
}
