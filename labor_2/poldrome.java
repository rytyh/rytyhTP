import java.util.Scanner;
public class polindrom {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String word=s.nextLine();
        int d=word.length();
        String slo="";
        for(int i=d-1;i>=0;i-- ){
            slo=slo+word.charAt(i);
        }
        if(word.equals(slo)){
            System.out.println(word+"  polindrom");
        }
        else {
            System.out.println(word+" ne polindrom");
        }
    }
}
