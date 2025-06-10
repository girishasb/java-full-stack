public class Bits {
    public static void main(String[] args) {
        //Get bit 
        
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;

        if((bitmask&n)==0){
            System.out.println("bit was a zero");
        }
        else{
            System.out.println("bit was one");

        }
            
        
    }
}
