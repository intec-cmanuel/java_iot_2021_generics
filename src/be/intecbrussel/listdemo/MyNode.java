package be.intecbrussel.listdemo;

public class MyNode<E> {
    private MyNode<E> nextNode;
    private E value;

    public MyNode (E value) {
        this.value = value;
    }

    public void addNode(MyNode<E> node){
        if (nextNode == null) {
            nextNode = node;
            return;
        }

        nextNode.addNode(node);
    }

    public E get(int index){

        if (index == 0) {
            return value;
        }

        if (nextNode == null) {
            throw new IndexOutOfBoundsException();
        }

        return nextNode.get(--index);
    }

}
