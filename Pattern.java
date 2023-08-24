import java.util.*;

import javax.xml.transform.Templates;

public class Pattern {

    public static void subArray(int number[]){

        int Currsum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        
        prefix[0] = number[0];

        for( int i=1; i<prefix.length; i++ ){
            prefix[i] = prefix[i-1] + number[i];
        }
        for(int i=0; i<number.length; i++){
            int start = i;
            
            for(int j=i; j<number.length; j++){
                int end = j;

                Currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<Currsum){
                    maxSum = Currsum;
                }
                //System.out.println();
            }
            //System.out.println();
        }

        System.out.println("maxSum :"+ maxSum);
             
    }

    public static void Kadanes(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            
            cs = cs + number[i];
            
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }

        System.out.println("Max of all :" + ms);

    }

    public static void bubbleSort(int arr[]){
        
        for(int turn=0; turn<arr.length-1; turn++){
            
            for(int j=0; j<arr.length-1 - turn; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    
                }
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();   
    }

    public static void SelectionSort(int arr[]){
        //outer loop for counting turns
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]> arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int Temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i] = Temp;
        }
    }

    public static void InsertionSort(int arr[]){
        for(int i=1; i < arr.length ; i++){
            int curr= arr[i];
            int prev= i-1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static int diag(int arr[][]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            //sd
            sum+=arr[i][i];
            //pd
            if(i!=arr.length-i-1){
            sum+=arr[i][arr.length -i-1];
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0; int col = matrix[0].length -1 ;
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = {{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};

         int key=33;     
         staircaseSearch(matrix, key);      

        //InsertionSort(arr);
        //InsertionSort(arr);
        //printArray(arr);
    }

}
