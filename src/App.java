import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            try {
                File myObj = new File("Example.txt");
                Scanner sc = new Scanner(myObj);

                while (sc.hasNextLine() ){
                    String data = sc.nextLine();
                    System.out.println(data);
                     
                }

                sc.close();

                
                
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
}
