import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int numForm;
        System.out.println("Digite quantas formas deseja criar: ");
        Scanner sc = new Scanner(System.in);
        numForm = sc.nextInt();
        Forma forma[] = new Forma[numForm];
        //forma[0] = new Circulo(50);
        //forma[1] = new FormaBidimensional();
       // forma[1] = new Triangulo(30, 20);
        //forma[2] = new Esfera(20);

        for(int i =0;i<numForm;i++){
            System.out.println("Digite a forma que deseja criar: ");
            String form;
            form = sc.next();
            if(form.equals("Quadrado") || form.equals("quadrado")){
                System.out.println("Digite o tamanho do lado do quadrado: ");
                float lado;
                lado = sc.nextFloat();
                forma[i] = new Quadrado(lado);
            }
            else if(form.equals("Circulo")){
                System.out.println("Digite o raio do círculo");
                float raio = sc.nextFloat();
                forma[i] = new Circulo(raio);
            }
            else if(form.equals("Triangulo")){
                System.out.println("Digite a base do triangulo");
                float base = sc.nextFloat();
                System.out.println("Digite a altura do triangulo");
                float altura = sc.nextFloat();
                forma[i] = new Triangulo(base,altura);
            }
            else if(form.equals("Esfera")){
                System.out.println("Digite o raio da esfera");
                float raio = sc.nextFloat();
                forma[i] = new Esfera(raio);
            }
            else if(form.equals("Cubo")){
                System.out.println("Digite o lado do cubo");
                float ladoC = sc.nextFloat();
                forma[i] = new Cubo(ladoC);
            }
            else if(form.equals("Tetraedro")){
                System.out.println("Digite a area da base do tetraedro");
                float areaBase = sc.nextFloat();
                System.out.println("Digite a altura do tetraedro: ");
                float alturaT = sc.nextFloat();
                System.out.println("Digite o lado do tetraedro: ");
                float ladoT = sc.nextFloat();
                forma[i] = new Tetraedro(areaBase,alturaT,ladoT);
            }
            
        }

        for(int i =0;i<numForm;i++){
            if(forma[i].obterVolume() == 0){
                forma[i].mostraInfo();
                System.out.println(" de área igual a " + forma[i].obterArea());
            }
            else{
                forma[i].mostraInfo();
                System.out.println(" de volume igual a " + forma[i].obterVolume());
            }
        }
    }
}
