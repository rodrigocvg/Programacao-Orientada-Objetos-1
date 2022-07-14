public class App {
    public static void main(String[] args) throws NullPointerException {
        Cliente c[] = new Cliente[5];
        Produto p[] = new Produto[5];
        Serviço s[] = new Serviço[5];

        Classficador c1 = new Classficador();

        

        c[0] = new Cliente("Joao");
        c[1] = new Cliente("Maria");
        p[0] = new Produto(984827);
        p[1] = new Produto(38383);
        s[1] = new Serviço(149.99f);
        s[0] = new Serviço(345.15f);

        try{
            c1.ordena(c);
            c1.ordena(p);
            c1.ordena(s);
        }
        catch(NullPointerException e){
            System.out.println("Erro");
        }

        for(int i =0;i<2;i++){
            System.out.println(c[i].getNome());
        }

        for(int i =0;i<2;i++){
            System.out.println(p[i].getCodigo());
        }

        for(int i =0;i<2;i++){
            System.out.println(s[i].getPreco());
        }


        }
}
