package prueba;
import java.util.LinkedList;

//Using a LinkedList as a Stack = LinkedStack (?)
public class LinkedStack<E>
{
    LinkedList<E> Storage = new LinkedList<>();
  
    public void push(E item)
    {
        Storage.push(item);
    }
    
    public E pop()
    {
        return Storage.pop();
    }
    
    public int size()
    {
        return Storage.size();
    }
    
    public E peek()
    {
        return Storage.peek();
    }
    
    public void clear()
    {
        Storage.clear();
    }
    
    public boolean isEmpty()
    {
        return Storage.isEmpty();
    }
}
