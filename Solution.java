
import java.util.Scanner;

public class Solution{
    static void plusMinus(int[] arr){
        int len = arr.length;
        float positiveCount =0;
        float negativeCount=0;
        float zeroCount=0;
        for(int i=0;i<len;i++){
            int element =arr[i];
            if(element>0){
                positiveCount +=1;

            }
            else if(element<0){
                negativeCount++;
            }
            else if(element==0){
                zeroCount++;
            }
        }
        System.out.printf("%1.6f\n",positiveCount/len);
        System.out.printf("%1.6f\n",negativeCount/len);
        System.out.printf("%1.6f\n",zeroCount/len);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0;arr_i<n;arr_i++){
            arr[arr_i] = in.nextInt();

        }
        plusMinus(arr);
        in.close();
    }
}


