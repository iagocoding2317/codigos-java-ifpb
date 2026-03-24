public class Pessoa {
    private String nome;
    private int telefone;
    private String endereco;

    public Pessoa(String nome, int telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public int getTelefone(){
        return telefone;
    }
    public String getEndereco(){
        return endereco;
    }

    public void Informacoes(){
        System.out.println("Nome: " + getNome() + "Telefone: " + getTelefone() + "Endereço: " + getEndereco());
    }
    
}
