import java.io.*;
import java.util.*;
public class secondsmallest {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        int fi=Integer.MAX_VALUE;
        int se=Integer.MAX_VALUE;
        int th=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]<fi){
               th=se;
               se=fi;
               fi=arr[i];
           }
           else if(arr[i]>fi &&arr[i]<se){
               th=se;
               se=arr[i];
           }
           else if(arr[i]>se&&arr[i]<th){
               th=arr[i];
           }
         }
        System.out.println(fi);
         System.out.println(se);
         System.out.println(th);
    }
}
    

