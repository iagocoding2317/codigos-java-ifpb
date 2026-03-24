public class Cadastro {
    private Pessoa[] p = new Pessoa[100];
    private int qtdPessoa = 0;

    public void cadastrarPessoa(Pessoa pes){
        if(qtdPessoa < p.length){
            p[qtdPessoa++] = pes;
        } else {
            System.out.println("Limite alcançado");
        }
    }

    public void listarPessoa(){
        for(int i = 0; i < qtdPessoa; i++){
            p[i].Informacoes();
        }
    }
    




}
