public class maxsumsubarray {
    public static void main(String[] args) {
        int arr[]={-1,5,-6,6,9,9,-5,-3,-3};
     System.out.print(max(arr));
    }
    static int max(int arr[]){
        int sum=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
    
}
