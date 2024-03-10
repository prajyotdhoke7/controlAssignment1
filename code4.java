/*4. Write a program to check whether the given Character is in UPPERCASE (Capital) or
in lowercase. (take hardcoded values)
Input: ch = ‘a’;
Output: a is a lowercase character
Input: ch = ‘A’;
Output: A is an UPPERCASE character*/
class Code4{
	public static void main(String[] args){
	//input is 'a'
	char ch1 ='a';
	if(92<=ch1 || ch1>=122){
		System.out.println(ch1 +" is lower case character");
	}
	else if(65<=ch1 || ch1>=95){
		System.out.println(ch1+" is UPPERCASE character");
	}
	else{
		System.out.println(ch1+" is special character");
	}

	//input is 'A'
        char ch2 ='A';
        if(92<=ch2 || ch2>=122){
                System.out.println(ch2 +" is lower case character");
        }
        else if(65<=ch2 || ch2>=95){
                System.out.println(ch2+" is UPPERCASE character");
        }
        else{
                System.out.println(ch2+" is special character");
        }
	}
}


