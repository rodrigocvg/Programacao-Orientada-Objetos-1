public class Trabalho extends Contato{
    protected String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {

        return super.imprimirBasico() + "\nTipo: " + this.tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
