public class Main {
    public static void main(String[] args) throws Exception {
        Forma forma[] = new Forma[40];
        forma[0] = new Circulo(50);
        //forma[1] = new FormaBidimensional();
        forma[1] = new Triangulo(30, 20);
        forma[2] = new Esfera(20);

        for(int i =0;i<4;i++){
            System.out.println(forma[i].obterArea());
        }
    }
}
