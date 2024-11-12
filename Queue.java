public class Queue<E>{
    //Clase dentro de clase
    private static class Node<E>{
        public E data;
        public Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    
    //Atributos de clase
    private Node<E> front;
    private Node<E> rear;
    private int size;

    //Métodos de la Cola
    //Offer
    public boolean offer(E data){
        Node<E> newNode = new Node<>(data);
        if(rear != null){
            rear.next = newNode;
        }
        rear = newNode;
        if(front == null){ //La cola estaba vacia
            front = rear;
        }
        size++;
        return true;
    }

    //Peek
    public E peek(){
        return (front != null) ? front.data : null;
    }

    //isEmpty
    public boolean isEmpty(){
        return size == 0;
        //return front == null;
    }

    //size
    public int size(){
        return size;
    }

    //Poll = remove = pop = delete
    public E poll(){
        if(isEmpty()){
            return null;
        }
        E data = front.data;
        front = front.next;
        if(front == null){
            rear = front;
        }
        size--;
        return data;
    }

}