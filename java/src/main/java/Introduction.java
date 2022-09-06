import java.util.Arrays;

public class Introduction {

    // returns the sum of the first n natural numbers
    int sum(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sum(n-1);
    }

    // returns the sum of the first n even numbers’ squares
    int evenSquares(int n) {
        if (n < 1) {
            return 0;
        }
        return n*n + evenSquares(n-1);
    }

    // returns the nth Fibonacci number
    int fib(int n) {

        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // returns true if string s with the length l contains char c, otherwise false.
    boolean linear(String s, char c, int l) {
        char[] array = s.toCharArray();
        for (char c_check : array) {
            if (c_check == c) {
                return true;
            }
        }
        return false;
    }

    // returns true if value is in arr, otherwise false. The elements in arr are sorted
    boolean binarySearch(int[] arr, int value) {
        int begin = 0;
        int end = arr.length - 1;
        int mid = (begin + end) / 2;


        System.out.println("value = " + value);
        System.out.println("mid = " + mid);
        System.out.println("arr[mid] = " + arr[mid]);

        if (value < arr[mid]) {
            System.out.println("value < arr[mid]");
            end = mid - 1;
            binarySearch(Arrays.copyOfRange(arr, begin, end + 1), value);
        } else if (value > arr[mid]) {
            System.out.println("value > arr[mid]");
            begin = mid + 1;
            binarySearch(Arrays.copyOfRange(arr, begin, end + 1), value);
        } else {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Introduction introduction = new Introduction();

        //System.out.println(introduction.sum(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            5));
        //System.out.println(introduction.evenSquares(3));
        //System.out.println(introduction.fib(10));
        //System.out.println(introduction.linear("simon",'p', 5));
        System.out.println(introduction.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10} , 20));

    }

}
