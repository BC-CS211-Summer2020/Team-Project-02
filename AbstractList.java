/*CSS 211 Summer 2020
 * Team #2
 * Alex Filbert
 * Diane Lansinger (project lead)
 * Melina Perraut (code co-lead)
 * Zhexiu Tan
 * Arash Yazdidoost
 * Angie Zou (code co-lead)
 * 
 * Team Project #2
 * Building Java Programs (Reges & Step, 5th edition)
 * Ch. 16, p. 1027, Programming Exercise #3
 * TeamProject02
 *
 * Final Submission:  08-03-20
*/

import java.util.*;

// Diane Lansinger - implemented List<E>
public abstract class AbstractList<E> implements List<E> {

	/*
	 * methods: public int size(); public E get(int index); public int indexOf(E
	 * value); public boolean isEmpty(); public boolean contains(E value); public
	 * void add(E value); public void add(int index, E value); public void
	 * remove(int index); public void set(int index, E value); public void clear();
	 * addAll(list<E> name); checkIndex(int index); class iterator & iterator();
	 */
	protected int size;

	// post: returns the current number of elements in the list
	public int size() {
		return size;
	}

	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: returns the value at the given index in the list
	public E get(int index) { // ZheXiu Tan, Alex Filbert

		Iterator<E> it = Iterator();
		int idx = -1;
		while (it.hasNext())
		{
			idx++;
			E item = it.next();
			if (idx == index) return item;
		}

        return null;
	}

	// *Substantially differs between ArrayList & LinkedList classes
	// post : returns the position of the first occurrence of the given
	// value (-1 if not found)
	public int indexOf(E value) { // ZheXiu Tan, Alex Filbert
		
		Iterator<E> it = Iterator();
		int index = -1;
		while (it.hasNext())
		{
			index++;
			if (value.equals(it.next())) return index;
		}

        return -1;
        
	}
	
	// *Substantially differs between ArrayList & LinkedList classes
	// post: creates a comma-separated, bracketed version of the list
	public String toString() { // ZheXiu Tan, Alex Filbert
		
	}

	// post: returns true if list is empty, false otherwise
	public boolean isEmpty() { // returns true if empty and false if not empty
		return size == 0;
	}

	// post: returns true if the given value is contained in the list,
	// false otherwise
	public boolean contains(E value) { // returns true if the list contains the given value and false if it does not
		return indexOf(value) >= 0;
	}

	// Diane Lansinger, Arash Yazdidoost
	// *Differs between ArrayList & LinkedList classes
	// post: appends the given value to the end of the list (index of added value = size)
	public void add(E value) {
        add(size, value);
    }
		
	// Diane Lansinger, Arash Yazdidoost
	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index <= size() (throws IndexOutOfBoundsException if not)
	// post: inserts the given value at the given index, shifting subsequent
	// values right
	public void add(int index, E value){
		checkIndex(index);
		size++;
	}
	
	
	// post: appends all values in the given list to the end of this list
	public void addAll(List<E> other) {
		for (E value : other) {
			add(value);
		}
	}

	// Diane Lansinger, Arash, Yazdidoost
	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: removes value at the given index, shifting subsequent values left
	public void remove(int index){
		checkIndex(index);
		Iterator<E> i = iterator();

		while (index-- > 1){
			i.next();
		}
		i.remove();
		size--;
	}
	

	// Diane Lansinger, Arash, Yazdidoost
	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: replaces the value at the given index with the given value
	public void set(int index, E value) {
		checkIndex(index);
	}

	// *Substantially differs between ArrayList & LinkedList classes
	// post: list is empty
	public void clear() { // Melina & Angie (will work to see if clear{} method can be in AbstractList class)

	}

	// post: throws an IndexOutOfBoundsException if the given index is
	// not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}

	// Diane Lansinger
	// added for remove() method
	// contract:  subclasses must implement this method
	public abstract Iterator<E> iterator();
}
