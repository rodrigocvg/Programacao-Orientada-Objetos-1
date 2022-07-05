public class Horista extends Funcionario{

    private int horas;

    public Horista(String nome, String dataNasc) {
        super(1000, nome, dataNasc);
    }

    public void trabalhar(){
        this.horas += 8;
        super.setSalario(this.getSalario() + this.horas * 50);
    }
    
}
