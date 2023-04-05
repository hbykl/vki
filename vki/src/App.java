import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double kilo,boy,vki;
        Scanner input=new Scanner(System.in);

        System.out.println("Boyunuzu m cinsinden giriniz");
        boy=input.nextDouble();

        System.out.println("Kilonuzu kg cinsinden giriniz");
        kilo=input.nextDouble();
        
        vki=kilo/(boy* boy);
        System.out.println("Vücut kitle indeksiniz="+vki);
        
    }
}
