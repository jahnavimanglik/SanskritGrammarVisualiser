package sanskrit;
import java.util.Scanner;
public class Sanskrit {
void sandhi(){
    Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        s = s.trim();
        int n= s.length();
        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a'){
            if(s.charAt(i+1)=='n'){
                if(s.charAt(i+2)=='a'){
                if(s.charAt(i+3)=='m'||s.charAt(i+3)=='n'){
                    String str = s.substring(0,i)+"k "+ "+ "+ s.substring(i+3);
                    System.out.println(str);
                    System.out.println("Anunaasik sandhi");
                    break;
                }
                }
            }
            }//.
        }
        for(int i = 0; i<n;i++){
            char ch = s.charAt(i);
        if(ch=='n'){
            if(s.charAt(i+1)=='n'){
                if(s.charAt(i+2)=='m'||s.charAt(i+2)=='n'){
                    String str = s.substring(0,i)+"t "+ "+ "+ s.substring(i+2);
                    System.out.println(str);
                    System.out.println("Anunaasik sandhi");
                    break;
                }
                }
            }
            }//.
}
    public static void main(String[] args) {
        Sanskrit ob = new Sanskrit();
        ob.sandhi();
    }
    
}
