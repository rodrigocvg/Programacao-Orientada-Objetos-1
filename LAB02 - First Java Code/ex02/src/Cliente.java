public class Cliente {
    public int CPF;
    public String nome;
    public String datanasc;
    public int CEP;

    public float saldo;

    Cliente(int CPF, String nome, String datanasc, int CEP) {
        this.CPF = CPF;
        this.nome = nome;
        this.datanasc = datanasc;
        this.CEP = CEP;
        this.saldo = 500f;
    }

    public void comprar(Produto p, Funcionário f){
        System.out.println("Realizando a compra do produto " + p.nome);
        this.saldo -= p.preço;
        f.QtdVendas += 1;
        System.out.println("Saldo novo após a compra: " + this.saldo);

    }


}
