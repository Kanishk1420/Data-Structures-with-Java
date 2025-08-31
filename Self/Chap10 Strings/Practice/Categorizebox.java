public class Categorizebox {
    public static String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long)length*width*height;
        boolean isBulky = false;
        boolean isHeavy = false;
        
        if (length>=Math.pow(10,4) || width>=Math.pow(10,4) || height>=Math.pow(10,4) || volume>= Math.pow(10, 9))
            isBulky = true;
        if(mass >= 100)
            isHeavy = true;
            
        if (isBulky && isHeavy)
            return "Both";
        if(!isBulky && !isHeavy)
            return "Neither";
        if(isBulky && !isHeavy)
            return "Bulky";
        return "Heavy";
    }
    public static void main(String[] args){
        System.out.println(categorizeBox(2909, 3968,3272,727));  // Now outputs "Both"
    }
}
