public class trycatch {
    public static void main(String[] args) {
        
        int []n = {10,2,30,40,500};
        int[] m = {1,2,3,0,4};
        for(int i = 0; i < n.length; i++){
            try {
                int ans = n[i] / m[i];
                System.out.println( ans);
            } catch (ArithmeticException e){
                System.out.println(e);
            } 
        }
    }
}


