public class Recursion2 {//printing n natural  numbers sum
    public static void printSum(int i ,int n ,int sum) {//method declaration
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;//
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);

    }
    public static void main (String args[]){
        printSum(1,5,0);
        

    }
}
