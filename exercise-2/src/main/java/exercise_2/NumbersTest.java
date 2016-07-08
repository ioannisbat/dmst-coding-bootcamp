package exercise_2;

import java.util.Scanner;

public class NumbersTest {
	public static void main(String[] args)
	  {
		RomanNumerals roman = new RomanNumerals();
		GreekNumerals greek = new GreekNumerals();
		
	    Scanner input = new Scanner(System.in);

	    System.out.println("Give an arithmetic expression of 2 numbers:");
	    String exp = input.nextLine();

	    while(!exp.equals(""))
	    {
	      int num1 = 0,num2 = 0, ap = 0;
	      char tem=' ';
	      int sb = 0;
	      while(sb < exp.length())
	      {
	        tem = exp.charAt(sb);
	        if (exp.charAt(sb) == '+') break;
	        else if (exp.charAt(sb) == '-') break;
	        else if (exp.charAt(sb) == '*') break;
	        else if (exp.charAt(sb) == '/') break;
	        sb++;
	      }

	      num1 = search(exp.substring(0, sb));
	      num2 = search(exp.substring(sb+1, exp.length()));
	    		  
	      switch(tem)
	      {
	        case '+': ap = num1+num2;
	                  break;
	        case '-': ap = num1-num2;
	                  break;
	        case '*': ap = num1*num2;
	                  break;
	        case '/': ap = num1/num2;
	                  break;
	      }
	      
	      System.out.printf("The result in Hindu-Arabic Numerals is: %d\n", ap);
	      System.out.printf("The result in Roman Numerals is: %s\n", roman.toroman(ap));
	      System.out.printf("The result in Greek Numerals is: %s\n", greek.togreek(ap));

	      System.out.println("Give an arithmitic expression of 2 numbers:");
	      exp = input.nextLine();
	    }
	    System.out.println("The end...You didn't give an arithmetic expression");
	    input.close();
	  }
	
	public static Integer search (String sub)
	{
		RomanNumerals roman = new RomanNumerals();
		GreekNumerals greek = new GreekNumerals();
		
		int num = 0;
		
		if (sub.contains("I") || sub.contains("V") || sub.contains("X") || sub.contains("L") || sub.contains("C") || sub.contains("D"))
	      {
	        num = roman.fromroman(sub);
	      }
	      else if (Character.isDigit(sub.charAt(0)))
	      {
	        num = Integer.parseInt(sub);
	      }
	      else 
	      {
	        num = greek.fromgreek(sub);
	      }
		return num;
	}
}