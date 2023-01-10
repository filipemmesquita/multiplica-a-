import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Multiplica Aí!!");
        Scanner sc = new Scanner((System.in));
        System.out.println("Insira um número: ");
        int inputV = sc.nextInt();
        System.out.println("Tabela de multiplicação de "+ inputV);
        for(int i=0; i<10;i++){
            System.out.println(inputV+" * "+i+" = "+(inputV*i));
        }
    }
}
