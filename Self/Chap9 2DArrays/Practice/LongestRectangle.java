public class LongestRectangle {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
  int n = dimensions.length;
        int maxArea = 0; 
        int maxDiag = 0;

        for (int i = 0; i < n; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int currDiag = l * l + w * w;

            if (currDiag > maxDiag || (currDiag == maxDiag && l * w > maxArea)) { 
            // If diagonals are equal, pick the rectangle with larger area
                maxDiag = currDiag;
                maxArea = l * w;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int dimensions[][] = {{2,6},{5,1},{3,10},{8,4}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
}
