import java.util.Arrays;
public class mergesort {
    public static void main(String[] args) {
        int arr[]={1,2,33,67,8,9,88,78};
        sort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int arr[],int beg,int end){
        if(beg<end){
            int mid=beg+(end-beg)/2;
            sort(arr,beg,mid);
            sort(arr,mid+1,end);
            merge(arr,beg,mid,end);

        }
    }
    static void merge(int arr[],int beg,int mid,int end){
        int l=mid-beg+1;
        int r=end-mid;
        int arr1[]=new int[l];
        int arr2[]=new int[r];
        for(int i=0;i<l;i++){
            arr1[i]=arr[beg+i];
        }
        for(int j=0;j<r;j++){
            arr2[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=beg;
        while(i<l&&j<r){
            if(arr1[i]<arr2[j]){
            arr[k]=arr1[i];
            i++;
        }
        else{
            arr[k]=arr2[j];
            j++;
        }
        k++;
    }
    while(i<l){
        arr[k]=arr1[i];
        i++;
        k++;
    }
    while(j<r){
        arr[k]=arr2[j];
        j++;
        k++;
    }
    
}
}
