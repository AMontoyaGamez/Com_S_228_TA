import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample<E> implements Collection<E> {
	private ArrayList<E> example;
	
	public CollectionExample() {
		example = new ArrayList<E>();
	}

	@Override
	public int size() {
		return example.size();
	}

	@Override
	public boolean isEmpty() {
		return example.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return example.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return example.iterator();
	}

	@Override
	public E[] toArray() {
		return (E[]) example.toArray();
	}

	@Override
	public <E> E[] toArray(E[] a) {
		return example.toArray(a);
	}

	@Override
	public boolean add(E e) {
		return example.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return example.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return example.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return example.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return example.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return example.retainAll(c);
	}

	@Override
	public void clear() {
		example.clear();
	}
}
