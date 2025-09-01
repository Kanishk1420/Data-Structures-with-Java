class StringcompressionII {
public static int compress(char[] chars){
String chari = new String(chars);
StringBuilder sb = new StringBuilder("");
for (int i = 0; i < chari.length(); i++) {
    Integer count = 1;
    while (i<chari.length()-1 && chari.charAt(i)==chari.charAt(i+1)) {
        i++;
        count++;
    }
    sb.append(chari.charAt(i));
    if (count>1) {
       sb.append(count.toString()); 
    }
}
String compressed = sb.toString();
 for (int i = 0; i < compressed.length(); i++) {
            chars[i] = compressed.charAt(i);
        }
return compressed.length();
}

public static void main(String[] args){
char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = compress(chars);
        System.out.println("New length: " + newLength);
        System.out.print("Compressed: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
}
}