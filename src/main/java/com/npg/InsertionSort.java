package com.npg;

public class InsertionSort {


   

    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        int temp = 0;
        for(int unSortedIndex = 1; unSortedIndex <= intArray.length-1; unSortedIndex++){
            temp = intArray[unSortedIndex];
            int i;
            for( i=unSortedIndex; i>0 && intArray[i-1] > temp;i--){
                
                intArray[i] = intArray[i-1];
            }
            intArray[i]=temp;

        }






       

        
        /*for (int unSortedIndex = 1;unSortedIndex<intArray.length;unSortedIndex++){
            int newElement = intArray[unSortedIndex];

            int i;

            for(i=unSortedIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;

        }*/


        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    
}
