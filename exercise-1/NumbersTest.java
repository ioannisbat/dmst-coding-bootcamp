import java.util.Scanner;

public class NumbersTest
{
  public static void main(String[] args)
  {
    System.out.println("\u2160");

    Scanner input = new Scanner(System.in);

    System.out.println("Give an arithmitic expression of 2 numbers:");
    String exp = input.nextLine();

    while(!exp.equals(""))
    {
      char tem=' ';
      int sb = 0;
      for(int i = 0; i < exp.length(); i++)
      {
        if (exp.charAt(i) == '+')
        {
          tem = '+';
          sb = i;
          break;
        }
        if (exp.charAt(i) == '-')
        {
          tem = '-';
          sb = i;
          break;
        }
        if (exp.charAt(i) == '*')
        {
          tem = '*';
          sb = i;
          break;
        }
        if (exp.charAt(i) == '/')
        {
          tem = '/';
          sb = i;
          break;
        }
      }

      int num1 = Integer.parseInt(exp.substring(0, sb));
      int num2 = Integer.parseInt(exp.substring(sb+1, exp.length()));
      int ap = 0;

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

      System.out.print("Roman Numerals: ");
      for (int i = 2100; i <= 2110; i++) {
      System.out.print((char) i);
      }
      System.out.println();

      System.out.println("Give an arithmitic expression of 2 numbers:");
      exp = input.nextLine();
    }
    System.out.println("The end...You didn't give an arithmitic expression");
  }
}
