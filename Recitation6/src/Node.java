
public class Node<E> {
	private E data;
	private Node<E> next;
	private Node<E> prev;
	
	public Node(E data) {
		this.data = data;
	}
	
	public void setNext(Node<E> nextNode) {
		this.next = nextNode;
	}
	
	public Node<E> getNext() {
		return this.next;
	}
	
	public void setPrev(Node<E> prevNode) {
		this.prev = prevNode;
	}
	
	public Node<E> getPrev(){
		return this.prev;
	}
}
