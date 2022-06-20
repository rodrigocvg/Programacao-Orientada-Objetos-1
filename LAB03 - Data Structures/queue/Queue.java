public class Queue {

    private ListaEncad fila;

    public Queue() 
    {
        this.fila = new ListaEncad();
    }

    public Queue(ListaEncad l) 
    {
        this.fila=l;
    }

    public ListaEncad getQueue() 
    {
        return this.fila;
    }

    public void setQueue(ListaEncad l) 
    {
        this.fila = l;
    }

    
    public void push(int num) // insere novo elemento na Queue
    {
        this.fila.push_back(num);
    }
    
    public int size() // tamanho da Queue
    {
        return this.fila.size();
    }
    
    public void pop() // remove o primeiro da Queue
    {
        this.fila.pop_front();
    }
    
   // public int front() // mostra quem esta em primeiro na Queue
   // {
     //   return this.fila.find_num(1);
   // }

    public void print() // imprimo a Queue
    {
        this.fila.print();
    }
}
