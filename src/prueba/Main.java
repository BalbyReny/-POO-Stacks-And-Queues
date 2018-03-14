package prueba;

public class Main 
{
    public static void main(String[] xd)
    {
        //Crear una LinkedStack
        LinkedStack<String> Pila = new LinkedStack<>();
        
        //Crear un ArrayQueue
        ArrayQueue<Integer> Cola = new ArrayQueue<>();
        
        //Agregar elementos a la Pila
        Pila.push("Rojo");
        Pila.push("Naranja");
        Pila.push("Amarillo");
        Pila.push("Verde");
        Pila.push("Azul");
        Pila.push("Morado");
        Pila.push("Rosa");
        
        //Agregar elementos a la Cola
        Cola.add(1);
        Cola.add(2);
        Cola.add(3);
        Cola.add(4);
        Cola.add(5);
        
        //Preguntar los tamaños de ambas estructuras
        System.out.println(" | La Pila actualmente tiene "+Pila.size()+" elementos.");
        System.out.println(" | La Cola actualmente tiene "+Cola.size()+" elementos.");
        
        //Mostrar algunos elementos de ambas estructuras
        if(!Pila.isEmpty())
            System.out.println("| El primer elemento de la Pila es:"+Pila.peek());
        if(!Cola.isEmpty())
        {
            System.out.println("| El primer elemento de la Cola es:"+Cola.peekFirst());
            System.out.println("| El último elemento de la Cola es:"+Cola.peekLast());
        }  
    }
}