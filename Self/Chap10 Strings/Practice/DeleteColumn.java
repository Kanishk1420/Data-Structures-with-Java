public class DeleteColumn {
    public static int minDeletionSize(String[] str) {
        int count = 0;
        for (int col = 0; col < str[0].length(); col++) {
            for(int row = 0; row < str.length - 1; row++){
                if(str[row].charAt(col) > str[row + 1].charAt(col)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str[] = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(str));
    }
}
// hint go through the columns iterative instead row 
// Index:  0   1   2  ← Need to check 3 columns
// Row 0: 'c' 'b' 'a'  ← str[0].length() = 3
// Row 1: 'd' 'a' 'f'
// Row 2: 'g' 'h' 'i'