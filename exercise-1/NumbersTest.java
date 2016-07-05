import java.util.Scanner;

public class NumbersTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Give an arithmitic expression of 2 numbers:");
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

      String sub1 = exp.substring(0, sb);
      String sub2 = exp.substring(sb+1, exp.length());

      if (sub1.contains("I") || sub1.contains("V") || sub1.contains("X") || sub1.contains("L") || sub1.contains("C") || sub1.contains("D"))
      {
        num1 = fromroman(sub1);
      }
      else if (sub1.contains("Α"))
      {
        //num1 = fromgreek(sub1);
      }
      else
      {
        num1 = Integer.parseInt(sub1);
      }

      if (sub2.contains("I") || sub2.contains("V") || sub2.contains("X") || sub2.contains("L") || sub2.contains("C") || sub2.contains("D"))
      {
        num2 = fromroman(sub2);
      }
      else
      {
        num2 = Integer.parseInt(sub2);
      }

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
      System.out.printf("The result in Roman Numerals is: %s\n", toroman(ap));
      System.out.printf("The result in Greek Numerals is: \n");

      System.out.println("Give an arithmitic expression of 2 numbers:");
      exp = input.nextLine();
    }
    System.out.println("The end...You didn't give an arithmitic expression");
  }

  public static Integer fromroman(String sub)
  {
    int num = 0;
    int l = 0;
    while (l < sub.length()-1)
    {
      if (sub.charAt(l) == 'D')
      {
        num += 500;
        l++;
      }
      else if (sub.charAt(l) == 'C')
      {
        if (sub.charAt(l+1) == 'D')
        {
          num += 400;
          l += 2;
        }
        if (sub.charAt(l+1) == 'M')
        {
          num += 900;
          l += 2;
        }
        else
        {
          num += 100;
          l++;
        }
      }
      else if (sub.charAt(l) == 'L')
      {
        num += 50;
        l++;
      }
      else if (sub.charAt(l) == 'X')
      {
        if (sub.charAt(l+1) == 'C')
        {
          num += 90;
          l += 2;
        }
        else if (sub.charAt(l+1) == 'L')
        {
          num += 40;
          l += 2;
        }
        else
        {
          num += 10;
          l++;
        }
      }
      else if (sub.charAt(l) == 'V')
      {
        num += 5;
        l++;
      }
      else if (sub.charAt(l) == 'I')
      {
        if (sub.charAt(l+1) == 'X')
        {
          num += 9;
          l += 2;
        }
        else if (sub.charAt(l+1) == 'V')
        {
          num += 4;
          l += 2;
        }
        else
        {
          num += 1;
          l++;
        }
      }
    }
    if (l == sub.length()-1)
    {
      if (sub.charAt(l) == 'D') num += 500;
      else if (sub.charAt(l) == 'C') num += 100;
      else if (sub.charAt(l) == 'L') num += 50;
      else if (sub.charAt(l) == 'X') num += 10;
      else if (sub.charAt(l) == 'V') num += 5;
      else if (sub.charAt(l) == 'I') num += 1;
    }
    return num;
  }

  public static String toroman(int ap)
  {
    String part = "";
    switch(ap/100)
    {
      case 0:;
      break;
      case 1: part += "C";
      break;
      case 2: part += "CC";
      break;
      case 3: part += "CCC";
      break;
      case 4: part += "CD";
      break;
      case 5: part += "D";
      break;
      case 6: part += "DC";
      break;
      case 7: part += "DCC";
      break;
      case 8: part += "DCCC";
      break;
      case 9: part += "CM";
      break;
    }
    switch((ap/10)%10)
    {
      case 0:;
      break;
      case 1: part += "X";
      break;
      case 2: part += "XX";
      break;
      case 3: part += "XXX";
      break;
      case 4: part += "XL";
      break;
      case 5: part += "L";
      break;
      case 6: part += "LX";
      break;
      case 7: part += "LXX";
      break;
      case 8: part += "LXXX";
      break;
      case 9: part += "XC";
      break;
    }
    switch(ap%10)
    {
      case 0:;
      break;
      case 1: part += "I";
      break;
      case 2: part += "II";
      break;
      case 3: part += "III";
      break;
      case 4: part += "IV";
      break;
      case 5: part += "V";
      break;
      case 6: part += "VI";
      break;
      case 7: part += "VII";
      break;
      case 8: part += "VIII";
      break;
      case 9: part += "IX";
      break;
    }
    return part;
  }

  /*public static Integer fromgreek(String sub)
  {
    int num = 0;
    int l = 0;
    while (l < sub.length())
    {
      switch(sub.charAt(l))
      {
        case 'Τ': num += 300;
        break;
        case 'Ρ': num += 100;
        break;
        case 'Α': num += 1;
        break;
      }
    }
    return num;
  }
  */
}
