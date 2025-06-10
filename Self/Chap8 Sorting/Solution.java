class Solution {
    public static void bubbleSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 2 - i; j++) { // hame yaha pei us element ya number ko sort karna hei
                                                             // example 8 tak
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.err.print(nums[i] + " ");
        }
    }

    public static void Selectionsort(int nums[]) {
        for (int i = 0; i < nums.length - 2; i++) {
            int mispostion = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[mispostion] > nums[j]) {
                    mispostion = j;
                }
                int temp = nums[j];
                nums[j] = nums[mispostion];
                nums[mispostion] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void Countingsort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            System.err.print(nums[i] + " ");
        }
    }

    public static void insertionsort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int previous = i - 1;

            // Move elements that are greater than current
            // to one position ahead of their current position
            while (previous >= 0 && nums[previous] > current) {
                nums[previous + 1] = nums[previous];
                previous--;
            }
            nums[previous + 1] = current;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            System.err.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(nums);
        System.err.println("\n");
        Selectionsort(nums);
        System.err.println("\n");
        Countingsort(nums);
        System.err.println("\n");
        insertionsort(nums);
    }
}