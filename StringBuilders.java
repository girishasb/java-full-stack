public class StringBuilders {
    public static void main (String args[]){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //charAt index 0
        System.out.println(sb.charAt(0));

        //sb.setChar at index 0
        sb.setCharAt(0,'P');
        sb.insert(0,'S');
        sb.insert(2,'n');
        sb.delete(2,3);
        System.out.println(sb);

    }

}
