public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }


    public ContaCorrente verifica(ContaEspecial c){
        if(this.limite > 0){
            return c;
        }
        else{
            ContaComum c1 = new ContaComum();
            return c1;
        }
    }

    @Override
    public boolean debitaValor ( float val , int pwd ) {
        if (this.isSenha(pwd) )
            return ( false ); // senha deve ser válida
        if ( this.getEstado(pwd)!= 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > this.getSaldo(pwd) )
            return ( false );

        this.creditaValor(pwd, val);
        if ( this.getSaldo(pwd) == 0 )
            this.setEstado(pwd, 1);//continua ativa
        return ( true ) ;
    }
}


