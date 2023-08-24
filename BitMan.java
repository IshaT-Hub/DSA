import java.util.*;

public class BitMan {

    public static void oddoreven(int n) {
        int bitmask = 1; 
        if((n & bitmask) == 0 ){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static int getithBit(int n, int i){
        int bitmask = (1<<i);
        if ((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static int setithBit(int n, int i){
        int bitmask = (1<<i);
            return n|bitmask;
        
    }

    public static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
            return n & bitmask;
        
    }

    public static int updateBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearithBit(n, i);
        }
        else{
            return setithBit(n, i);
        }
    }

    public static boolean powerof2(int n){
        return (n&(n-1)) == 0;
    }

    public static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            if(( n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1)!=0){  //LSB
                ans = ans * a;
            }
            a = a * a ;
            n= n>>1;
        }
        return ans;
    }

    public static int counttotalSetBits(int n){
    
        int count =0;
        //int sum=0;
        for(int i=1; i<=n; i++){
            while(n>0){
                if((i&1)!=0){
                    count++;
                    //sum += count;
                }
                n = n>>1;
            }
            //sum += count;
        }
        return count;
        
    }

    public static void main(String[] args) {
        System.out.println(counttotalSetBits(4));
    }
    //     int x=3,y=4;
    //     System.out.println("Before swap: x = "+x+" and y = "+y);//swap using xorx=x^y;y=x^y;x=x^y;System.out.println("After swap: x = "+x+" and y = "+y);}}
    //     x=x^y;
    //     y=x^y;
    //     x=x^y;
    //     System.out.println("After swap: x = "+x+" and y = "+y);
    // }
}