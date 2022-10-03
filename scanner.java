import java.util.Scanner;

public class scanner {
    
    public static void main(String[] args) {
        
    
        try (Scanner sc = new Scanner(System.in)) {
            String inpt = sc.next();

            System.out.println("Scanning " + inpt);
        }

            

}
}