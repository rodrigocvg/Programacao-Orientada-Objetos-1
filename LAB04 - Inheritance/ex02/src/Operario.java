public class Operario extends Funcionario {

    private int produzido;

    public Operario(String nome, String dataNasc) {
        super(0, nome, dataNasc);
        this.setProduzido(0);
    }

    public void produzir(){
        this.setProduzido(this.getProduzido()+1);
        this.setSalario(this.getSalario() + 15f * this.produzido);
    }

    public int getProduzido() {
        return produzido;
    }

    public void setProduzido(int produzido) {
        this.produzido = produzido;
    }
    
}
