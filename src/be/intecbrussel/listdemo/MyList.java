package be.intecbrussel.listdemo;

public class MyList<E> {
    private MyNode<E> firstNode;

    public boolean isEmpty(){
        return firstNode == null;
    }

    public void add (E value) {
        MyNode<E> node = new MyNode<>(value);

        if (firstNode == null) {
            firstNode = node;
            return;
        }

        firstNode.addNode(node);
    }

    public E get (int index) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return firstNode.get(index);
    }
}
