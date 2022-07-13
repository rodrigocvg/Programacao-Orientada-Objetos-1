public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    


    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }
    
    public String imprimirBasico(){
        return "Apelido: " + this.apelido + "\nNome: " + nome + "\nEmail: " + email + "\nAniversario: " + aniversario;
    }

    public abstract String imprimirContato();

    public String getParentesco() {
        return null;
    }

    public int getGrau() {
        return 0;
    }

    public String getTipo() {
        return null;
    }


}
