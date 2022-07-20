public class ListaEncad {
    private No prim;
    private No ult;
    int tam;

    public ListaEncad(){
        prim = null;
        tam = 0;
    }

    public void insert(int n) throws NullPointerException, IndexOutOfBoundsException{
        if(prim==null) 
        {
            try{
                prim = new No();
                ult = prim;
                No N = new No();
                N.setElemento(n);
                N.setProximo(null);
                ult.setProximo(N);
                ult = N;
                tam++;
            }
            catch(NullPointerException e){
                System.out.println("Erro");
            }
           
        }
        else 
        {
            No N = new No();
            N.setElemento(n);
            N.setProximo(null);
            ult.setProximo(N);
            ult = N;
            tam++;
        }
    }
    public void erase_data(int n){
        No fimL = prim.getProximo();
        No inicio = prim;
        
        if(prim==null) 
            System.out.println("Lista não possui nenhum elemento");
            
        else while(fimL != null) 
        {
            inicio.setProximo(null);
            inicio = null;
            inicio = fimL;
            fimL = fimL.getProximo();
        }
        this.prim=null;
        this.ult=prim;
        System.gc();
        }
     
    public void push_front(int i){

        No inicio = prim;
        No fimL = prim.getProximo();

        while(fimL != null) 
        {
            if (fimL.getElemento() == i) 
            {
                if(fimL.getProximo()==null) 
                {
                    ult=inicio;
                    ult.setProximo(null);
                    fimL.setProximo(prim.getProximo());
                    prim.setProximo(fimL);
                    break;
                }
                else 
                {
                    ult=inicio;
                    ult.setProximo(fimL.getProximo());
                    fimL.setProximo(prim.getProximo());
                    prim.setProximo(prim);
                    break;
                }
            }
            prim = prim.getProximo();
            inicio = inicio.getProximo();
        }
    }

    public void push_back(int i){
        No inicio = prim;
        No fimL = prim.getProximo();
        
        while(fimL != null) 
        {
            if (fimL.getElemento() == i) 
            {
                if(fimL.getProximo()==null) 
                {
                    break;
                }
                else 
                {
                    prim.setProximo(fimL.getProximo());
                    ult.setProximo(fimL);
                    fimL.setProximo(null);
                    ult=fimL;
                    break;
                }
            }
            fimL = fimL.getProximo();
            inicio = inicio.getProximo();
        }

    }

    public No pop_back(){
    No referencia = prim;
    prim = prim.getProximo();
        return referencia;

    }
    
    public No pop_front(){
        No aux = this.prim;
        No fimL = prim;
        if (fimL != null) {
            fimL = fimL.getProximo();
            aux.setProximo(aux.getProximo());
        }
        return aux;
    }

    public int size(){
        return tam;
    }

    public int front() {
        No primeiro = prim.getProximo();
        return primeiro.getElemento();
    }

    public int back(){
        return this.ult.getElemento();
    }

      



    public void print() {
        while (prim != null) {
            System.out.print(prim.getElemento() + " ");
            prim = prim.getProximo();
        }
    }

    public int find_pos(int pos)
    {
        if(this.prim == null)
        {
            System.out.println("Lista é nula");
        }
        else
        {
            No prime = prim.getProximo();
            for(int i =1;i<size();i++)
            {
                if(i==pos)
                    return prime.getElemento();
                    prime = prime.getProximo();
            }
        }
        System.out.println("Valor não encontrado");
        return -1;
    }





}
