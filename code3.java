/*3. Write a program to check whether the given number is even or odd and also check
whether the given number is greater than 10 or not. (take hardcoded values)
Input: num =13;
Output: 13 is an odd number and greater than 10.
Input: num =8;
Output: 8 is an even number and less than 10;
Input: num =10;
Output: 10 is an even number and equal to 10;*/
class Code3{
    public static void main(String[] args){
        //input is 13
        int num1=13;
        if (num1%2==0 && num1>10){
            System.out.println(num1+" is an Even number and greater than 10.");
        }
	else if(num1%2==0 && num1<10){
		System.out.println(num1+" is an Even number and Less than 10.");
	}
	
	else if(num1%2!=0 && num1>10){
		System.out.println(num1+" is an odd number and greater than 10.");
	}
	else if(num1%2!=0 && num1<10){
		System.out.println(num1+" is an odd number and Less than 10.");
	}
	// input is 8 
	int num2=8;
        if (num2%2==0 && num2>10){
            System.out.println(num1+" is an Even number and greater than 10.");
        }
        else if(num2%2==0 && num2<10){
                System.out.println(num1+" is an Even number and Less than 10.");
        }

        else if(num2%2!=0 && num2>10){
                System.out.println(num1+" is an odd number and greater than 10.");
        }
        else if(num2%2!=0 && num2<10){
                System.out.println(num1+" is an odd number and Less than 10.");
        }
	//input is10 
	int num3=10;
        if (num3%2==0 && num3>10){
            System.out.println(num1+" is an Even number and greater than 10.");
        }
        else if(num3%2==0 && num3<10){
                System.out.println(num1+" is an Even number and Less than 10.");
        }

        else if(num3%2!=0 && num3>10){
                System.out.println(num1+" is an odd number and greater than 10.");
        }
        else if(num3%2!=0 && num3<10){
                System.out.println(num1+" is an odd number and Less than 10.");
        }
	else if (num3%2==0 && num3==10){
		System.out.println(num3 +"is an even number and equal to 10.");
	}
	else if (num3%2!=0 && num3==10){
                System.out.println(num3 +"is an odd number and equal to 10.");
        }
    }
}
