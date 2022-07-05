public class Item {

    private String titulo;
    private int tempoDuracao;
    private String comentarios;

    public Item(String titulo, int tempoDuracao, String comentarios) {
        this.titulo = titulo;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public Item(){

    }

    public void print(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Tempo de duração de " + this.tempoDuracao + " minutos");
        System.out.println("Comentarios: " + this.comentarios);
    }
}