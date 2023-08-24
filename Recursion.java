public class Recursion {

    public static void printInc(int n){
        if(n ==1){             // Base case
            System.out.print(1);   
            return;
        }
        printInc(n-1);
        System.out.print(" "+n+" ");  // Logic 
        //printDec(n-1);              // Inner function
    }

    public static void printDec(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fN = n * fnm1;
        return fN;
    }

    public static int sumofn(int n){
        if(n==1){
            return 1 ;
        }
        int s1 = sumofn(n-1);
        int sum = n + s1;
        return sum;
    }

    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibofn = fibnm1 + fibnm2;
        return fibofn;
    }

    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }

    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }
        int pownm1 = power(x, n-1);
        int pow = x * pownm1;
        return pow;
    }

        public static void main(String[] args) {
        //int n = 8;
        //printInc(n);
        //printDec(n);
        //System.out.println(fact(n));
        //System.out.println(sumofn(n));
        //System.out.println(fibonacci(n));
        // System.out.println(fibonacci(16));
        // System.out.println(fibonacci(17));
        // System.out.println(fibonacci(18));
        //int arr[] = {1,2,6,4,5};
        System.out.println(power(2, 10));
    }
}
