import java.io.*;
import java.util.*;
public class thirdlargest {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int j=0;j<k;j++){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fi=Integer.MIN_VALUE;
        int se=Integer.MIN_VALUE;
        int th=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]>=fi){
               th=se;
               se=fi;
               fi=arr[i];
           }
           else if(arr[i]<fi &&arr[i]>=se){
               th=se;
               se=arr[i];
           }
           else if(arr[i]<se &&arr[i]>=th){
               th=arr[i];
        }


            
        }
        System.out.print(fi+" ");
         System.out.print(se+" ");
         System.out.print(th+" ");
         System.out.println();
    }
    }
}
    

