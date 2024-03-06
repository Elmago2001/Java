import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
        Scanner cad=new Scanner(System.in);
         System.out.println("Cual es tu nombre");
         String nombre= cad.nextLine();
         System.out.println("tu nombre tiene\t"+nombre.length()+" letras");
         for(int f=0; f<nombre.length(); f++){
            System.out.println(nombre.charAt(f));
         }
         cad.close();

    }
}
