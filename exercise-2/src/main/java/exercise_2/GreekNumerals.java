package exercise_2;

public class GreekNumerals {
	public Integer fromgreek(String sub)
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

	  public String togreek(int ap)
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
