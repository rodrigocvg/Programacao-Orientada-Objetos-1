public class Familia extends Contato{
    protected String parentesco;

    

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }



    public String imprimirContato(){
        return super.imprimirBasico() + "\nParentesco: " + this.parentesco;
    }
}
