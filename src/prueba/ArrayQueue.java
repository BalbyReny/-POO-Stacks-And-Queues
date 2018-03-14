package prueba;
import java.util.ArrayDeque;

//Using an ArrayDeque as a Queue = ArrayQueue (?)
public class ArrayQueue<E>
{
    ArrayDeque<E> Storage = new ArrayDeque<>();
    
    public boolean add(E e)
    {
        return Storage.add(e);
    }
    
    public E peekFirst()
    {
        return Storage.peekFirst();
    }
    
    public E peekLast()
    {
        return Storage.peekLast();
    }
    
    public boolean isEmpty()
    {
        return Storage.isEmpty();
    }
    
    public E pollFirst()
    {
        return Storage.pollFirst();
    }
    
    public int size()
    {
        return Storage.size();
    }
}   