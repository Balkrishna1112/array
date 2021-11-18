public class removeelement {
    public static void main(String[] args) {
        int arr[]={23,4,5,677,56,90};
        int k=5;
        int arr1[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                continue;
            }
            else
            arr1[i]=arr[i];
        }
        for(int e:arr1){
            System.out.print(e+" ");
        }
    }
    
}
