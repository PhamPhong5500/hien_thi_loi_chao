import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter greating : ");
        String greating = sc.nextLine();
        String result = "hello" + greating;
        System.out.println(result);

//        String myName = "Phong" ;
//        System.out.printf("My name's %s " , myName);
        sc.close();
    }
}
