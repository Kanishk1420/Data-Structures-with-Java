public class Pairs { 
    public static void pairing(int n[]){
    for (int i = 0; i < n.length; i++) {
    for (int j = 0; j < n.length; j++) {
        if (n[i]==n[j]||n[j]<n[i]) {
            System.out.print("");
        }
        else{
            System.err.print("("+n[i]+","+n[j]+")");
            
        }
    }
    System.out.println();
    }
   
    }
    public static void optimizedparing(int n[]){
    int pairs = 0;
    for(int i = 0; i<n.length; i++){
        for (int j = i+1; j < n.length; j++) {
            System.out.print("("+n[i]+","+n[j]+")");
            pairs++;
        }
        System.out.println();
    }
     System.out.println("Total no of pairs "+pairs);
    }
    public static void main(String[] args){
     int n[] = {2,4,6,8,10};
     pairing(n);
     optimizedparing(n);
    }
}

// Time complexity is 0(n2) two nested loops o(n)*o(n)