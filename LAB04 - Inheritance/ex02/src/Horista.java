public class Horista extends Funcionario{

    private int horas;

    public Horista(String nome, String dataNasc) {
        super(0, nome, dataNasc);
    }

    public void trabalhar(){
        this.horas += 8;
        super.setSalario(this.horas * 50);
    }
    
}
