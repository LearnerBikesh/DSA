import java.util.Arrays;

public class Q1_5 {
    public static void main(String[] args) {
        // Q1:- Peak element (GfG) - 'https://www.geeksforgeeks.org/problems/peak-element/1'
        int arr[] = {1,2,3};
//        System.out.println(peakElement(arr, arr.length));

        // Q2:- Find the minimum and maximum element in the array
//        System.out.println(Arrays.toString(getMinMax(new long[]{2,3,44} , 3)));


        // Q3:- Check whether a number is prime or not
//        System.out.println(isPrime(167));

        // Q4:- Swap two number
        // There is lots of way you can swap two number , using object(if you want to do this using method , third variable , addition , multiplication , xor operator
        int a = 40;
        int b = 29;
        System.out.println("Before swapping :- " + "a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:- " + "a = " + a + " b = " + b);

        // Q5:- Reverse the array
        int[] arr2 = {1,2,3,4,6,7,8};
        System.out.println(Arrays.toString(arr2));
        reverse(arr2 , arr2.length);
        System.out.println(Arrays.toString(arr2));

    }

    public static int peakElement(int[] arr, int n){
        if(n==1) return 0;
        for(int i = 0; i < n; i++){
            if(i==0) {
                if (arr[i] > arr[i + 1]) return 0;
            }
            else if(i == n - 1) {
                if (arr[n - 1] > arr[n - 2]) return n-1;
            }
            else if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) return i;
        }

        return -1;
    }
    public static long[] getMinMax(long a[], long n) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(a[i] <= min){
                min = a[i];
            }
            if(a[i] >= max){
                max = a[i];
            }
        }

        return new long[]{min, max};
    }
    public static boolean isPrime(int num){
        if(num < 1){
            System.out.println("Please enter positive number");
            return false;
        }

        int n = 2;
        while(n*n <= num){
            if(num % n == 0){
                System.out.println(n + " divides your input");
                return false;
            }
            n++;
        }
        return true;
    }
    public static void reverse(int[] arr ,int n){
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
