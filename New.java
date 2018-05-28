//submitted by Himashree Kalita (Roll No.- 150103004)
import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		sc.close();
		String str= s.toLowerCase();
		char[] str1= str.toCharArray();
		//to find the no. of occurrences of each unique character
		for(int i=0;i<str.length();i++)
		{
			char ch=str1[i];
			int count=1;
			if(ch=='#');
			else
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str1[j]==ch)
					{
						count++;
						str1[j]='#';
					}
				}
				System.out.println("Number of occurrences of " +ch+ " is "+ count);
					
			}
			
		}
		
          //to capitalize every alternate character
		char[] str2= str.toCharArray();
		for(int i=0;i<str.length();i=i+2)
		{
			char c=str2[i];
			str2[i]= Character.toUpperCase(c);
		}
		String str3= new String(str2);
		System.out.println("String with every alternate character capitalized is " + str3);

	}

}
