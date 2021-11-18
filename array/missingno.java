public class missingno {
    public static void main(String[] args) {
        int []arr={0,1,2,4};
   // int ba=(sort(arr));
        System.out.print(sort(arr));
    }

       public static int sort(int []arr){
            int i=0;
            int correct=arr[i];
           
            while(i<arr.length){
                if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                 swap(arr, i, correct);
                 
                }
                else{
                    i++;
                    
                }
            }
            for( int j=0;j<arr.length;j++){
                if(arr[j]!=j){
                    return j;

                }
            }
            
                return arr.length;
        }
            
        
            static void swap(int []arr,int s,int e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;

            }
}
