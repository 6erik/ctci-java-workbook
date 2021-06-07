// cd to /misc and run 'java Fibonacci.java'
// uses recursion to find nth fibonacci term


public class Fibonacci {
    public static int getFib(int i) {
        int result = 0;
        if (i <= 2) {
            result = 1;
        }
        else if (i > 2) {
            result = getFib(i-2) + getFib(i-1);
        }

        return result;
    }

    public static void main(String args[]) {
        System.out.println(getFib(7));
    }
}
