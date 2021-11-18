public class sortzeroesonestwos {
    public static void main(String[] args) {
        int arr[]={1,0,2,1,2,0,0,2,1,1,2,1,2,0};
        int l=0;
        int mid=0;
        int e=arr.length-1;
        while(mid<e){
            if(arr[mid]==0){
                swap(arr,mid,l);
                mid++;
                l++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,e);
            
                e--;
            }

        }
        for(int k:arr){
            System.out.print(k+" ");
        }

    }
    static void swap(int arr[],int s,int d){
        int temp=arr[s];
        arr[s]=arr[d];
        arr[d]=temp;
    }

    
}
