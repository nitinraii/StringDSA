import java.util.*;
public class vowels{
    public static void main(String args[]){
         int vowels = 0, nonvowels = 0;
         int capitalvowels =0;
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
         
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u' ){
                vowels++;
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'  || ch == 'U' ){
                capitalvowels++;
            }
            else{
                nonvowels++;
            }
               
            }
            System.out.print(vowels);

        }
        
    }
