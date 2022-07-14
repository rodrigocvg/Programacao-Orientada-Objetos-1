public class Produto implements Classificavel{
    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Produto compara = (Produto) obj;
        if(this.codigo<compara.codigo){
            return true;
        }
        else{
        return false;
            
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
