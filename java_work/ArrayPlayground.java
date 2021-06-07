public class ArrayPlayground {
    public static int testingArrays() {
        System.out.println(">>Running testingArrays() method \n");
        
        // Ways to create array
        // 1. declare with [] after type to use array. use 'new int[SIZE]' to allocate SIZE slots
        int[] intArr1;
        intArr1 = new int[5];
        printIntArray(intArr1);

        // 1a. or in-line with 4 integer elements
        int[] intArr2 = new int[4];
        printIntArray(intArr2);



        return 0;
    }

    public static void printIntArray(int[] arr) {
        System.out.println(">Running printIntArray method ");
        String arrayString = "{";

        for (int i=0; i<arr.length; i++) {
            arrayString += arr[i];
            if (i < arr.length-1) {
                arrayString += ", ";
            }
        }
        arrayString += "}";

        System.out.println(arrayString);
    }

    public static void main(String args[]) {
        testingArrays();
    }
}
