import java.io.*;
import java.util.*;
public class secondlargest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        int fi=Integer.MIN_VALUE;
        int se=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(arr[i]>fi){
               se=fi;
               fi=arr[i];
           }
           else if(arr[i]<fi &&arr[i]>se){
               se=arr[i];
           }
         }
        System.out.println(fi);
         System.out.println(se);
    }
}
    
    
    
    

