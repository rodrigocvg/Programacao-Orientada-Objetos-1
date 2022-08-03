import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        ListaEncad l = new ListaEncad();
        l.insert(0);
        l.insert(2);
        l.insert(30);
        
        System.out.println("Posição 1: " + l.find_pos(1));
        l.print();
        l.erase_data(0);
        l.print();

        Stack st = new Stack();
        st.push(30);
        st.push(29);
        st.push(34565);
        st.push(2);
        st.print();

        st.pop();
        st.print();

        Queue q = new Queue();
        q.push(2);
        q.push(5);
        q.print();
    }
    
}
