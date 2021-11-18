public class duplicate1 {
    public static void main(String[] args) {
        int arr[]={2,6,3,9,1,9,8,4,5};
        System.out.print(dup(arr));
    }
        
        static int dup(int arr[]){
        int s=arr[0];
        int f=arr[0];
        do{
             s++;
             f+=2;
        }
        while(s!=f);
        f=arr[0];
        while(s!=f){
       s++;
       f++;
        }
      return arr[s]; 
    }
}
