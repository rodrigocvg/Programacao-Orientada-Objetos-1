public class Main {
    public static void main(String[] args) throws Exception {
        
        
        C1 a1 = new C1(1,2,3);
        a1.mostrar_atributos();

        C1 a2 = new C1();
        a2.mostrar_atributos();

        C2 b1 = new C2(1,2,3,4,5,6);
        b1.mostrar_atributos();
        b1.mostrar_atributos_super();

        C3 b2 = new C3(1,2,3,4,5,6,7,8,9);
        b2.mostrar_atributos();
        b2.mostrar_atributos_super();

    }
}
