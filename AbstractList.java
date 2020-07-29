public abstract class AbstractList<E> {

	/*
	 * methods:
	 *     public int size();
    public E get(int index);
    public int indexOf(E value);
    public boolean isEmpty();
    public boolean contains(E value);
    public void add(E value);
    public void add(int index, E value);
    public void remove(int index);
    public void set(int index, E value);
    public void clear();
    addAll(list<E> name);
    checkIndex(int index);
    class iterator & iterator();
	 */
	private int size;
	
	public int size() { //returns size
	return size;	
	}
	
	public E get(int index) { //returns value at given index
		
	}
	
	public int indexOf(E value) { //returns the index of the first appearance of the given value
		
	}
	
	public boolean isEmpty() { //returns true if empty and false if not empty
		
	}
	
	public boolean contains(E value) { //returns true if the list contains the given value and false if it does not
		
	}
	
	public void add(E value) { // adds given value to the end of the list
		
	}
	
	// pre : 0 <= index <= size() (throws IndexOutOfBoundsException if not)
    	// post: inserts the given value at the given index, shifting subsequent
    	//       values right
	public void add(int index, E value) {
		
	}
	
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    	// post: removes value at the given index, shifting subsequent values left
	public void remove(int index) {
		
	}
	
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    	// post: replaces the value at the given index with the given value
	public void set(int index, E value) {
		
	}
	
	// post: list is empty
	public void clear() {
		
	}
	
	// post: appends all values in the given list to the end of this list
	public void addAll(List<E> other) {
		
	}
	
	// post: throws an IndexOutOfBoundsException if the given index is
    	//       not a legal index of the current list
	private void checkIndex(int index) {
		
	}
	
	// TO-DO: determine whether ArrayList & LinkedList's Iterator objects should be added to abstract superclass
}
