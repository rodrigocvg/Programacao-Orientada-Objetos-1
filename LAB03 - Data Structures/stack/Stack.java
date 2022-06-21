public class Stack {
    private ListaEncad stack;

    public Stack() 
    {
        this.stack = new ListaEncad();
    }

    public Stack(ListaEncad lista) 
    {
        this.stack=lista;
    }

    public ListaEncad getLista() 
    {
        return this.stack;
    }
    
    public void push(int num) 
    {
        this.stack.insert(num);
    }

    public int size(){
        return this.stack.size();
    }
    public void pop() 
    {
        this.stack.pop_front();
    }
    public int top() 
    {
        return this.stack.find_pos(1);
    }
    public void print() 
    {
        this.stack.print();
    }
}
