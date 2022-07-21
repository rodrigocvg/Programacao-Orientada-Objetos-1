
import java.io.IOException;

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
    
    public void push(int num)  throws IOException{
        try{
            this.stack.insert(num);
        }
        catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public int size(){
        return this.stack.size();
    }
    public void pop() 
    {
        this.stack.pop_front();
    }
    public int top() throws IOException
    {
        return this.stack.find_pos(1);
    }
    public void print() 
    {
        this.stack.print();
    }
}
