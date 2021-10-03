import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Entre com o nome: ");
        p.nome = sc.nextLine();
        System.out.println("Entre com o cpf: ");
        p.cpf = sc.nextInt();
        System.out.println("Entre com a quantidade de endereços: ");
        p.qtdEnd = sc.nextInt();

        for(int i=0; i< p.qtdEnd; i++){
            sc.nextLine();
            Endereco e = new Endereco();
            System.out.println("Entre com a rua: ");
            e.setRua(sc.nextLine());
            System.out.println("Entre com o bairro: ");
            e.setBairro(sc.nextLine());
            System.out.println("Entre com o número: ");
            e.setNum(sc.nextInt());
            p.addEndereco(e);
        }

        p.mostraInfo();
        sc.close();
    }
}
