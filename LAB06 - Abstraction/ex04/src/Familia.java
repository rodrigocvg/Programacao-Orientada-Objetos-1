public class Familia extends Contato{
    protected String parentesco;

    

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }


    @Override
    public String imprimirContato(){
        return this.imprimirBasico() + "\nParentesco: " + this.parentesco;
    }


    @Override
    public String getParentesco() {
        return this.parentesco;
    }



    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
