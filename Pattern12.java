public class Pattern12 {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half numbers
            //u can use for both-> for(int j=1;j<=2*i-1;j++){ 

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd half numbers
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st half numbers
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
          

            System.out.println();
        }
    }


}
