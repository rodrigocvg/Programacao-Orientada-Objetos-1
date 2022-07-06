public class UsaBanco {
    public static void main(String[] args) throws Exception {
        

        ContaCorrente cc[] = new ContaCorrente[30];
        cc[0] = new ContaEspecial(1500, 545656, 5536, 0);
        System.out.println("Debitando 500 reais");
        cc[0].debitaValor(500,5536);
        System.out.print("Valor do saldo atual = ");
        System.out.println(cc[0].getSaldo(5536));
        System.out.println("Creditando 250 reais");
        cc[0].creditaValor(5536, 250);
        System.out.print("Valor do saldo atual = ");
        System.out.println(cc[0].getSaldo(5536));
        

        cc[1] = new ContaComum(2300, 2345, 1234);
        System.out.println("Debitando 300 reais");
        cc[1].debitaValor(300,1234);
        System.out.print("Valor do saldo atual = ");
        System.out.println(cc[1].getSaldo(1234));
        System.out.println("Creditando 4000 reais");
        cc[1].creditaValor(1234, 4000);
        System.out.print("Valor do saldo atual = ");
        System.out.println(cc[1].getSaldo(1234));



    }
}
