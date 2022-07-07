public class Amigos extends Contato{
    protected int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        return super.imprimirBasico() + "\nGrau: " + this.grau;
    }

    @Override
    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    
    
}
