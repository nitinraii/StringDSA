public class comparestring{
    public static void main(String args[]){
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1 == s3){
            System.out.println("it is equal");
        }
        else{
            System.out.println("not equal");
        }
        if(s1.equals(s3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}