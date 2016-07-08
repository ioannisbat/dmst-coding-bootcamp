package src;

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
      else if (Character.isDigit(sub1.charAt(0)))
      {
        num1 = Integer.parseInt(sub1);
      }
      else 
      {
        num1 = fromgreek(sub1);
      }

      if (sub2.contains("I") || sub2.contains("V") || sub2.contains("X") || sub2.contains("L") || sub2.contains("C") || sub2.contains("D"))
      {
        num2 = fromroman(sub2);
      }
      else if (Character.isDigit(sub2.charAt(0)))
      {
    	num2 = Integer.parseInt(sub2);
      }
      else
      {
    	num2 = fromgreek(sub2);
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
      System.out.printf("The result in Greek Numerals is: %s\n", togreek(ap));

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

  public static Integer fromgreek(String sub)
  {
    int num = 0;
    int l = 0;
    while (l < sub.length())
    {
      switch(sub.charAt(l))
      {
        case 'a': num += 1;
        break;
        case 'b': num += 2;
        break;
        case 'g': num += 3;
        break;
        case 'd': num += 4;
        break;
        case 'e': num += 5;
        break;
        case '.': num += 6;
        break;
        case 'z': num += 7;
        break;
        case 'h': num += 8;
        break;
        case 'u': num += 9;
        break;
        case 'i': num += 10;
        break;
        case 'k': num += 20;
        break;
        case 'l': num += 30;
        break;
        case 'm': num += 40;
        break;
        case 'n': num += 50;
        break;
        case 'j': num += 60;
        break;
        case 'o': num += 70;
        break;
        case 'p': num += 80;
        break;
        case 'q': num += 90;
        break;
        case 'r': num += 100;
        break;
        case 's': num += 200;
        break;
        case 't': num += 300;
        break;
        case 'y': num += 400;
        break;
        case 'f': num += 500;
        break;
        case 'x': num += 600;
        break;
        case 'c': num += 700;
        break;
        case 'v': num += 800;
        break;
        case 'w': num += 900;
        break;
      }
      l++;
    }
    return num;
  }

  public static String togreek(int ap)
  {
    String part = "";

    switch(ap/100)
    {
      case 0:;
      break;
      case 1: part += "r";
      break;
      case 2: part += "s";
      break;
      case 3: part += "t";
      break;
      case 4: part += "y";
      break;
      case 5: part += "f";
      break;
      case 6: part += "x";
      break;
      case 7: part += "c";
      break;
      case 8: part += "v";
      break;
      case 9: part += "w";
      break;
    }
    switch((ap/10)%10)
    {
      case 0:;
      break;
      case 1: part += "i";
      break;
      case 2: part += "k";
      break;
      case 3: part += "l";
      break;
      case 4: part += "m";
      break;
      case 5: part += "n";
      break;
      case 6: part += "j";
      break;
      case 7: part += "o";
      break;
      case 8: part += "p";
      break;
      case 9: part += "q";
      break;
    }
    
    switch(ap%10)
    {
      case 0:;
      break;
      case 1: part += "a";
      break;
      case 2: part += "b";
      break;
      case 3: part += "g";
      break;
      case 4: part += "d";
      break;
      case 5: part += "e";
      break;
      case 6: part += ".";
      break;
      case 7: part += "z";
      break;
      case 8: part += "h";
      break;
      case 9: part += "u";
      break;
    }
    return part;
  }
}
