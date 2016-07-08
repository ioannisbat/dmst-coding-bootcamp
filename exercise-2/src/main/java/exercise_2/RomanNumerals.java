package exercise_2;

public class RomanNumerals {
	public Integer fromroman(String sub)
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

	  public String toroman(int ap)
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
}
