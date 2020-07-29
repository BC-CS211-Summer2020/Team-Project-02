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
	
	// post: returns the current number of elements in the list
	public int size() {
	return size;	
	}
	
    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the value at the given index in the list
	public E get(int index) { //returns value at given index
		
	}
	
	// post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
	public int indexOf(E value) { //returns the index of the first appearance of the given value
		
	}
	
	// post: returns true if list is empty, false otherwise
	public boolean isEmpty() { //returns true if empty and false if not empty
        return size == 0;
	}
	
    // post: returns true if the given value is contained in the list,
    //       false otherwise
	public boolean contains(E value) { //returns true if the list contains the given value and false if it does not
        return indexOf(value) >= 0;
	}
	
    // post: appends the given value to the end of the list
	public void add(E value) { // adds given value to the end of the list
        add(size, value);
	}
	
		// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
	public void add(int index, E value) {
		
	}
	
	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
	public void remove(int index) {
		
	}
	
	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the value at the given index with the given value
	public void set(int index, E value) {
		
	}
	
	// *Substantially differs between ArrayList & LinkedList classes
	// post: list is empty
	public void clear() {
		
	}
	
	// post: appends all values in the given list to the end of this list
	public void addAll(List<E> other) {
		for (E value: other) {
            add(value);
        }
	}
	
	// post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
	}
	
	// TO-DO: determine whether ArrayList & LinkedList's Iterator objects should be added to abstract superclass
	
}
