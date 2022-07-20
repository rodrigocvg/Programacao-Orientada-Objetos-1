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

    
    public void push(int num) 
    {
        this.fila.push_back(num);
    }
    
    public int size() 
    {
        return this.fila.size();
    }
    
    public void pop() 
    {
        this.fila.pop_front();
    }
    
   public int front() 
    {
        return this.fila.find_pos(1);
   }

    public void print() 
    {
        this.fila.print();
    }
}
