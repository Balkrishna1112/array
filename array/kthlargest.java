import java.io.*;
import java.util.*;
public class kthlargest {
    public static void main(String[] args) {
        int arr[]={2,3,55,33,22,11,88,99,7,8,9,0};
        Arrays.sort(arr);
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.print(arr[k-1]);
    }
    
}
