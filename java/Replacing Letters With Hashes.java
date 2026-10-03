// Write a function that replaces all letters within a specified range with the hash symbol #.

// Examples
// Program.replace("abcdef", "c-e"); // "ab###f"

// Program.replace("rattle", "r-z"); // "#a##le"

// Program.replace("microscopic", "i-i"); // "m#croscop#c"

// Program.replace("", "a-z"); // ""
// Notes
// The range will always be in order: for m-n, character m will always come before or equal n.
// Strings will contain lower-case letters only.
// Return an empty string if the input is an empty string.

public class Program {
  public static String replace(String text, String range) { 
  String ans="";
    char s=range.charAt(0);
    char t=range.charAt(2);
    for(int i=0;i<text.length();i++){
      char c=text.charAt(i);
      if(c>=s && c<=t){
        ans+="#";
      }
      else{
        ans+=c;
      }
    }
    return ans; 
  }
}
