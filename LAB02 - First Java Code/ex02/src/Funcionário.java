public class Funcionário {
    public int CPF;
    public String nome;
    public String dataNasc;
    public String dataIng;

    public int QtdVendas;

    Funcionário(int CPF, String nome, String dataNasc, String dataIng) {
        this.CPF = CPF;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.dataIng = dataIng;
        this.QtdVendas = 0;
    }


}