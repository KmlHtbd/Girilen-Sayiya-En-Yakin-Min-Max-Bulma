import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;

public class CloseMinMax {
    //find number's index in array method
    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i++;
            }
        }
        return -1;
    }
    //get number by index number
    public static int getNumber(int arr[], int index){
        int i = 0;
        while (i< arr.length){
            if (i==index){
                return arr[i];
            }else
                i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        //Orginal Array
        int[] list = {15,12,788,1,-1,-778,2,0};
        //New Array extend length
        int[] list2 = Arrays.copyOf(list, 9);
        // Add number to new array
        list2[8] = 5;
        //Sort new array
        Arrays.sort(list2);
        //print closest numbers
        System.out.println("Girilen sayıdan küçük en yakın sayı:"+getNumber(list2,(findIndex(list2,5)-1)));
        System.out.println("Girilen sayıdan büyük en yakın sayı:"+getNumber(list2,(findIndex(list2,5)+1)));
    }
}