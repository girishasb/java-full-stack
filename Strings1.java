public class Strings1 {
    public static void main(String[] args) {
        String firstName="tony";
        String LastName="Stark";
        String fullname=firstName+"@"+LastName;

        System.out.println(fullname.length());

        //charAt
        for(int i=0;i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }

}
