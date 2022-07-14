public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Cliente compara = (Cliente)obj;
        if(this.nome.compareTo(compara.nome)<0){
            return true;
        }
        else{
            return false;
        }
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
