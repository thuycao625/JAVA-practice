import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortString {
    public static void main(String args[]) {

        String s1 = "is2 Thi1s T4est 3a";

        String[] sArray = s1.split("\\s");

//
//        for(int i = 0 ; i < sArray.length ; i++){
//
//            char [] newArray = sArray[i].toCharArray();
//            for(int j = 0 ; j < newArray.length ; j++){
//                if(isNumeric(String.valueOf(newArray[j])) == true){
//
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(sArray));


        for(int i=0;i < sArray.length -1;i++)
        {
            for(int j=0;j< sArray.length-1;j++)
            {
                char [] arr1 = sArray[i].toCharArray();
                for(int a = 0 ; a < arr1.length ; a++){
                    System.out.println("hhhh"+ arr1[j]);
                }
                char [] arr2 = sArray[i].toCharArray();

                if(checkNum(arr1,arr1.length)>checkNum(arr2, arr2.length))
                {
                    String t = sArray[j];
                    sArray[j] = sArray[j+1];
                    sArray[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(sArray));


    }


    static int checkNum(char arr[], int n)
    {
        int m = 0;
        for(int i=0;i<n;i++)
        {
            if(Character.isDigit(arr[i]))
            {
                 m=((int)arr[i]-48);
            }
        }
        return(m);
    }



}
