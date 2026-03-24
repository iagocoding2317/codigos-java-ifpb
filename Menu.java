import java.util.Scanner;

public class Menu {

    Cadastro cad = new Cadastro();
    Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opcao;

        do {
            System.out.println("Escolha: 1- Cadastro, 2- Listar, 3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("CADASTRO DE PESSOAS");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Telefone: ");
                int telefone = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Endereço: ");
                String endereco = sc.nextLine();

                cad.cadastrarPessoa(new Pessoa(nome, telefone, endereco));
                break;

            case 2:
                cad.listarPessoa();
                break;

            case 3:
                System.out.println("Fim");
                break;

            default:
                System.out.println("Escolha algum número possível");
            }

        } while (opcao != 3);

        sc.close();
    }
}
