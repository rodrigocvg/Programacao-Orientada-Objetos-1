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
    
    public void push(int num) // adicionar um elemento a lista
    {
        this.stack.insert(num);
    }

    //public int size() // tamanho da lista
   // {
    //    return this.stack.size();
   // }
    public void pop() // remover o elemento do topo da lista
    {
        this.stack.pop_front();
    }
   // public int top() // quem esta no topo
    //{
  //      return this.stack.find_num(1);
    //}
    public void print() // imprime pilha.
    {
        this.stack.print();
    }
}
