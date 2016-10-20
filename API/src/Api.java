import java.util.Scanner;

public class Api
	{
		static String answer;

		public static void main(String[] args)
			{
				//getVowels();
				greetUser();
				if (answer.substring(answer.length()-1).equals("s"))
					{
						System.out.println("that is a plural word");
					}
				else
					{
						System.out.println("not a plural word");
					}
				

			}
		public static String greetUser()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("type a word");
		 answer=userInput.nextLine();
		
		return answer;
		}
		public static void getVowels()
		{
			greetUser();
			for(int i=0;i<=(answer.length()-1); i++)
				{
					
				
		        switch (answer.substring(i, i+1))
		        {
		            case "a":
		            case "e":
		            		
		            case  "i":
		            case  "o":
		            	
		            case "u":
		            		{
		            			System.out.println(indexOf(i));
		            		
		                     break;
		            		}
		         

			
		}
		}
	}
	}
