public class palindromeString{
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "NIIIN";
        System.out.print(isPalindrome(str));
    }
}