public class Recursion4 {//calculating fibonacci series
    public static void printFib(int a , int b,int n){//recursive method
        if(n==0){
            return;
        }
        int c=a+b;//3,4,5,6,7 numbers printing
        System.out.println(c);//printing
        printFib(b,c,n-1);//updation
      

    }
    public static void main(String args[]){//main method
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFib(a,b,n-2);//here is main

    }

}
