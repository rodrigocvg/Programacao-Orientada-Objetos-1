public class DVD extends Item{

    private String diretor;

    public DVD(String titulo, int tempoDuracao, String comentarios, String diretor) {
        super(titulo, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Diretor: " + this.diretor);
    }
}
