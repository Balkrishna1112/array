import java.util.List;
import java.util.ArrayList;

public class alldisappered {
    public List<Integer>find(int []arr)  {
        int i=0;
        while(i<arr.length){
        int correct=arr[i]-1;
        if(arr[i]!=arr[correct]){
            swap(arr,i,correct);
        }
        else{
        i++;}

        }
         
         List<Integer>ans=new ArrayList<>();
         for(int j=0;j<arr.length;j++){
             if(arr[i]!=i+1){
                 ans.add(i+1);
             }
         }
         return ans;
    }
    static void swap(int []arr,int e,int a){
        int temp=arr[e];
        arr[e]=arr[a];
        arr[a]=temp;

    }
}
