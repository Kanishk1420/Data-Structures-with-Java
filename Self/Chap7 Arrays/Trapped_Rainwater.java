public class Trapped_Rainwater {
    public static int rainwater(int height[]) {
        int first = Integer.MIN_VALUE;
        int last = Integer.MIN_VALUE;
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        for (int i = 0; i < left.length; i++) {
            first = Math.max(first, height[i]);
            System.out.print(first);
            left[i] = first; // hamne yaha isse kyo raha ? because left[i] mei jab ham agge loop sei min dudge tab agge jake first kei final value 6 hogi and similar to right to thats why 
        }
        System.err.println(" ");
        for (int i = right.length - 1; i >= 0; i--) {
            last = Math.max(last, height[i]);
            System.out.print(last);
            right[i] = last;  // hamne yaha isse kyo raha ? because right[i] mei jab ham agge loop sei min dudge tab agge jake last kei final value 6 hogi and similar to right to thats why 
        }
        int trappedWater = 0;
        System.err.println(" ");
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(rainwater(height));
    }
}
// Time complexity is 0(n)