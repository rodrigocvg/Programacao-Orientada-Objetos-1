public class App {
    public static void main(String[] args){
        Cliente c[] = new Cliente[5];
        Produto p[] = new Produto[5];
        Serviço s[] = new Serviço[5];

        Classficador c1 = new Classficador();

        

        c[0] = new Cliente("Maria");
        c[1] = new Cliente("Joao");
        c[2] = new Cliente("Ana");
        c[3] = new Cliente("Bento");
        c[4] = new Cliente("Julio");

        p[0] = new Produto(984827);
        p[1] = new Produto(38383);
        p[2] = new Produto(12);
        p[3] = new Produto(10000000);
        p[4] = new Produto(9);

        s[0] = new Serviço(149.99f);
        s[1] = new Serviço(345.15f);
        s[2] = new Serviço(0.2f);
        s[3] = new Serviço(1400f);
        s[4] = new Serviço(300.15f);


        for(int i=0;i<c.length;i++){
            System.out.println(c[i].getNome());
        }
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].getCodigo());
        }
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].getPreco());
        }

            
            c1.ordena(c);
            c1.ordena(p);
            c1.ordena(s);
            
            
        System.out.println("Vetores ordenados: ");

        for(int i=0;i<c.length;i++){
            System.out.println(c[i].getNome());
        }
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].getCodigo());
        }
        for(int i=0;i<s.length;i++){
            System.out.println(s[i].getPreco());
        }


        }
}
