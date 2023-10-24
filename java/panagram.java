import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String res = "";
        
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) != -1) {
                res = res + i;
            }
        }
        
        if (res.length() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
