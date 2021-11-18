public class fab {
    public static void main(String[] args) {
        System.out.print(fabl(5));
    }
    static int fabl(int n){
        if( n==1)
        return 0;
        if(n==2)
        return 1;
        else
        return fabl(n-1)+fabl(n-2); 
    }
    
}
