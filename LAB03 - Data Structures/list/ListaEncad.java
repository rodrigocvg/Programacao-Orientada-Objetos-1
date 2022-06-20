public class ListaEncad {
    private No prim;

    public ListaEncad(){
        prim = null;
    }

    public void push_front(int i){
        No novo = new No();
        novo.setElemento(i);
        novo.setProximo(prim);
        prim = novo;
    }

    public void push_back(int i){
        No fimL = prim;
        No inicio = prim;
        fimL.setElemento(fimL.getElemento());
        inicio = fimL;

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


      
    
    //public void insert(int pos){
        
	//}


    public void print() {
        while (prim != null) {
            System.out.print(prim.getElemento() + " ");
            prim = prim.getProximo();
        }
    }





}
