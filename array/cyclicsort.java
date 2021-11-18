import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int []arr={6,5,7,8,1,2,3,0,4,9};
        sort(arr);
        System.out.print(Arrays.toString(arr));}

        static void sort(int []arr){
            int i=0;
            while(i<arr.length){
        int correct=arr[i];
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }
        else{
            i++;
        }
    }
    }
    
            static void swap(int []arr,int i,int correct){
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }
    }
        
        



    
    

