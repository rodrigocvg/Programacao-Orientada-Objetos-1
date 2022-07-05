public class CD extends Item{

    private String artista;


    public CD(String titulo, int tempoDuracao, String comentarios, String artista) {
        super(titulo, tempoDuracao, comentarios);
        this.artista = artista;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Artista: " + this.artista);
    }
}