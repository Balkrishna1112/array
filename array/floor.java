public class floor {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,55,77,99}; 
        int ta=80 ;
        int ans=binary(arr,ta);
        System.out.print(ans);
    }
    static int binary(int arr[],int ta){
       int s=0;
       int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
        if(ta<arr[mid]){
            e=mid-1;
        }
        else if(ta>arr[mid]){
            s=mid+1;
        }
        else {
            return arr[mid];
        }
    }
    return arr[e];
    }
    
}
