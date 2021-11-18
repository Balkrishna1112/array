import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) { 
        int arr[]={1,33,45,89,0,65,76,87};
        sort( arr);
        System.out.print(Arrays.toString(arr));
  }
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                   
                }
             
            }
        }
    }
    static void swap(int arr[],int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
