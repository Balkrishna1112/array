import java.util.Arrays;
public class insertsort {
    public static void main(String[] args) {
        int arr[]={3,33,44,56,1,2,77,67,89,90};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
             while(j>0&&arr1[j-1]>arr1[j]){
                 swap(arr1,j-1,j);
             }
            }
        }
    }
    static void swap(int arr [],int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
}
