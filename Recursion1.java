public class Recursion1 {
    public static void printNumb(int n) {//method declaration
        if(n==6){
            return;

        }
        System.out.println(n);
        printNumb(n+1);//recursive call
    }

    public static void main (String args[]){
        int n=1;
        printNumb(n);//n=5


    }
}
