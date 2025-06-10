public class Pattern3 {
    public static void main(String[] args) {
        int n=4;
        //Half pyramid Reverse
        for(int i=1;i<=n; i++){
            //inner loop ->sace print
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop ->star print
            for (int j=1;j<=i; j++){
                System.out.print("*");
                //for pyramid/triangle
                //System.out.print("* ")
            }
            System.out.println();


        }


    }

}
