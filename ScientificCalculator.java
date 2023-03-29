
public class ScientificCalculator extends BasicCalculator {

    // Returns the sum of the elements in a given array
    @Override
    public int summation(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ;
        return sum;
    }

    // Returns the result of number_1^number_2
    // Be carreful!!! Don't use Math.pow() methods
    @Override
    public int pow(int number_1, int number_2) {
        int sum = 1;
        while (number_2 != 0) {
            sum *= number_1;
            number_2--;
        }
        return sum;
    }

    // Returns the element in the fibonacci series according to the given index.
    // Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    // For example:
    // If the index is entered as 6, the function returns the value 8.
    // If the index is entered as 9, the function returns 34.
    // If index is entered as 1, the function returns 0.
    @Override
    public int fibonacci(int index) {
        int a = 0, b = 1, c = 1, step = 2;
        if(index ==1)
        return 0;

        while (index != step) {
            c = a + b;

            step++;
            a = b;
            b = c;
        }

        return c;
    }

    // Calculates and returns the factorial value based on the given number.
    // For example:
    // if the number is 5, the result is 5! = 5*4*3*2*1 = 120
    @Override
    public int factorial(int number) {
        int fac = 1;
        while (number != 0) {
            fac *= number;
            number--;
        }
        return fac;
    }

    // Find the minimum element of the given array
    @Override
    public int min(int[] arr) {
        int num1, num2,min1,min2=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            
          num1=arr[i];
          num2=arr[i+1];
         min1 = num1<num2 ? num1 :num2;
         min2 = min1<min2 ? min1 : min2;


        }
        return min2;
        
    }

    // Find the maximum element of the given array
    @Override
    public int max(int[] arr) {
        int num1, num2,max1,max2=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            
          num1=arr[i];
          num2=arr[i+1];
         max1 = num1>num2 ? num1 :num2;
         max2 = max1>max2 ? max1 : max2;


        }
        return max2;
    }

}
