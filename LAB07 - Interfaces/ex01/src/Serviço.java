public class Serviço implements Classificavel{
    private float preco;

    public Serviço(float preco) {
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Serviço compara = (Serviço)obj;
        if(this.preco<compara.preco){
            return true;
        }
        else{
        return false;
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
