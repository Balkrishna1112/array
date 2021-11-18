public class sortzeroone {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,0,1,1,0,1,1,1,0}; 
        int s=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[e]==1){
                e--;
            }
            else if(arr[s]==0){
                s++;
            }
            else {
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }


        static void swap(int arr[],int s,int e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
        
    
}
