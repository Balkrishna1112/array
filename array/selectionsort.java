import java.util.Arrays;
public class selectionsort {
    public static void main(String[] args) {
        int arr []={1,88,999,90,77,876,564,345,675};      //unstable sort bez if  5(a) and 5(b) is their than too it changes the position  5(b) and 5(a)
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                    min=j;
               }
            }
            swap(arr,i,min);
        }
    }
    static void swap(int arr[],int s,int e){
        int temp=arr[s];
        arr[s] =arr[e];
        arr[e]=temp;
    }
    
}
