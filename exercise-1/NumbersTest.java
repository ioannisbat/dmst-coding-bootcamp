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
      else if (sub1.contains("Α") || sub1.contains("Β") || sub1.contains("Γ") || sub1.contains("Δ") || sub1.contains("Ε") || sub1.contains("ς") || sub1.contains("Ζ") || sub1.contains("Η") || sub1.contains("Θ") || sub1.contains("Ι") || sub1.contains("Κ") || sub1.contains("Λ") || sub1.contains("Μ") || sub1.contains("Ν") || sub1.contains("Ξ") || sub1.contains("Ο") || sub1.contains("Π") || sub1.contains("Q") || sub1.contains("Ρ") || sub1.contains("Σ") || sub1.contains("Τ") || sub1.contains("Υ") || sub1.contains("Φ") || sub1.contains("Χ") || sub1.contains("Υ") || sub1.contains("Ω") || sub1.contains("W"))
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
      else if (sub2.contains("Α") || sub2.contains("Β") || sub2.contains("Γ") || sub2.contains("Δ") || sub2.contains("Ε") || sub2.contains("ς") || sub2.contains("Ζ") || sub2.contains("Η") || sub2.contains("Θ") || sub2.contains("Ι") || sub2.contains("Κ") || sub2.contains("Λ") || sub2.contains("Μ") || sub2.contains("Ν") || sub2.contains("Ξ") || sub2.contains("Ο") || sub2.contains("Π") || sub2.contains("Q") || sub2.contains("Ρ") || sub2.contains("Σ") || sub2.contains("Τ") || sub2.contains("Υ") || sub2.contains("Φ") || sub2.contains("Χ") || sub2.contains("Υ") || sub2.contains("Ω") || sub2.contains("W"))
      {
        //num2 = fromgreek(sub2);
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
      //System.out.printf("The result in Greek Numerals is: %s\n", togreek(ap));

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
        case 'Α': num += 1;
        break;
        case 'Β': num += 2;
        break;
        case 'Γ': num += 3;
        break;
        case 'Γ': num += 3;
        break;
        case 'Δ': num += 4;
        break;
        case 'Ε': num += 5;
        break;
        case 'ς': num += 6;
        break;
        case 'Ζ': num += 7;
        break;
        case 'Η': num += 8;
        break;
        case 'Θ': num += 9;
        break;
        case 'Ι': num += 10;
        break;
        case 'Κ': num += 20;
        break;
        case 'Λ': num += 30;
        break;
        case 'Μ': num += 40;
        break;
        case 'Ν': num += 50;
        break;
        case 'Ξ': num += 60;
        break;
        case 'Ο': num += 70;
        break;
        case 'Π': num += 80;
        break;
        case 'Q': num += 90;
        break;
        case 'Ρ': num += 100;
        break;
        case 'Σ': num += 200;
        break;
        case 'Τ': num += 300;
        break;
        case 'Y': num += 400;
        break;
        case 'Φ': num += 500;
        break;
        case 'Χ': num += 600;
        break;
        case 'Υ': num += 700;
        break;
        case 'Ω': num += 800;
        break;
        case 'W': num += 900;
        break;
      }
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
      case 1: part += "Α";
      break;
      case 2: part += "Β";
      break;
      case 3: part += "Γ";
      break;
      case 4: part += "Δ";
      break;
      case 5: part += "Ε";
      break;
      case 6: part += "ς";
      break;
      case 7: part += "Ζ";
      break;
      case 8: part += "Η";
      break;
      case 9: part += "Θ";
      break;
    }
    switch((ap/10)%10)
    {
      case 0:;
      break;
      case 1: part += "Ι";
      break;
      case 2: part += "Κ";
      break;
      case 3: part += "Λ";
      break;
      case 4: part += "Μ";
      break;
      case 5: part += "Ν";
      break;
      case 6: part += "Ξ";
      break;
      case 7: part += "Ο";
      break;
      case 8: part += "Π";
      break;
      case 9: part += "Q";
      break;
    }
    switch(ap%10)
    {
      case 0:;
      break;
      case 1: part += "Ρ";
      break;
      case 2: part += "Σ";
      break;
      case 3: part += "Τ";
      break;
      case 4: part += "Υ";
      break;
      case 5: part += "Φ";
      break;
      case 6: part += "Χ";
      break;
      case 7: part += "Ψ";
      break;
      case 8: part += "Ω";
      break;
      case 9: part += "W";
      break;
    }
    return part;
  }
  */
}
