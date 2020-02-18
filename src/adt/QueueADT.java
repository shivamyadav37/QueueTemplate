package adt;

public interface QueueADT<E> {
    /**
     * Inserts item at the rear of the queue.
     *
     * @param item the data that is to be stored in the node.
     * @return true when the node is added to the queue.
     */
    //add method inserts item at the rear of the queue
    boolean add(E item);

    // remove method , removes the entry 
    E remove();

    E peek();

    E poll();

    E element();
}
