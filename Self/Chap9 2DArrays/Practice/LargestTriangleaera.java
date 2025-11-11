public class LargestTriangleaera {
    public static double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        
        // Try all combinations of 3 points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    // Get coordinates of the 3 points
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];
                    
                    // Calculate area using cross product formula
                    double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
                    
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        return maxArea;
    }
    
    public static void main(String[] args) {
        int points[][] = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points)); // Output: 2.0
        
        int points2[][] = {{1,0},{0,0},{0,1}};
        System.out.println(largestTriangleArea(points2)); // Output: 0.5
    }
}
