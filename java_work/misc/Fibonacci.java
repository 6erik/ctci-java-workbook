// cd to /misc and run 'java Fibonacci.java'
// uses recursion to find nth fibonacci term


public class Fibonacci {
    public static int getFib(int num) {
        int result = 0;
        if (num <= 2) {
            result = 1;
        }
        else if (num > 2) {
            result = getFib(num-2) + getFib(num-1);
        }

        return result;
    }

    public static void printFib(int num) {
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            if (i <= 1) {
                nums[i] = 1;
            } else {
                nums[i] = nums[i-1] + nums[i-2];
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        System.out.println(getFib(7));

        printFib(7);
    }
}
