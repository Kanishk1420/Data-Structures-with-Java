public class Gmail {
public static void gmail(String str){
StringBuilder sb = new StringBuilder(" ");
for(int i=0; i<str.length();i++){
  if(str.charAt(i)=='@')
    break;
  if(str.charAt(i)!='a'&& str.charAt(i) != 'e'&& str.charAt(i) != 'i'&& str.charAt(i) != 'o'&& str.charAt(i) != 'u')
    sb.append(str.charAt(i)); 
}
  System.out.println(sb.toString());
}

public static void main(String[] args){
String str = "Kanishkgupta2003@outlook.com";
gmail(str);
}
}
