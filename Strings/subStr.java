public class subStr{
    public static String substr(String str, int si,int ei){
        String substrr = "";
        for(int i=0;i<ei;i++){
            substrr += str.charAt(i);
        }
        return substrr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.print(substr(str,0,5));
    }
}