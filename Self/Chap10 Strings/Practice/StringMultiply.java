// This question is solved through long method which will not pass some testcase so BigInteger will pass all testcase

import java.math.BigInteger;

class Solution {
    public static String multiply(String num1 , String num2){
    Long result = Long.parseLong(num1) * Long.parseLong(num2);
    return Long.toString(result);
    }

    public static String multiplywithBig(String num1, String num2){
      BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);
        return result.toString();
    }
    public static void main(String[] args){
    System.out.println(multiply("1234", "9876"));
    System.out.println(multiplywithBig("123456789", "840877629533"));
    }
}