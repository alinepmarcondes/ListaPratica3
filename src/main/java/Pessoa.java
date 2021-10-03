public class Pessoa {

    public String nome;
    public int cpf;
    public int qtdEnd;
    public Endereco[] enderecos = new Endereco[10];

    public void Pessoa(String nome, int cpf, int qtdEnd){
        this.nome = nome;
        this.cpf = cpf;
        this.qtdEnd =  qtdEnd;
    }

    public void addEndereco(Endereco endereco){
        for(int i = 0; i < this.enderecos.length; i++){
            if(this.enderecos[i] == null){
                enderecos[i] = endereco;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        for(int i = 0; i < this.enderecos.length; i++){
            if(this.enderecos[i] != null){
                System.out.println("Rua: " + this.enderecos[i].getRua());
                System.out.println("Bairro: " + this.enderecos[i].getBairro());
                System.out.println("Número: " + this.enderecos[i].getNum());
            }
        }
    }
}
