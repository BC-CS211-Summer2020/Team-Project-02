/*CSS 211 Summer 2020
 * Team #2
 * Alex Filbert
 * Diane Lansinger (lead)
 * Melina Perraut
 * Zhexiu Tan
 * Arash Yazdidoost
 * Angie Zou
 * 
 * Team Project #2
 * Building Java Programs (Reges & Step, 5th edition)
 * Ch. 16, p. 1027, Programming Exercise #3
 * TeamProject02
 *
 * Final Submission:  08-03-20
*/

import java.util.*;

public abstract class AbstractList<E> {

	/*
	 * methods: public int size(); public E get(int index); public int indexOf(E
	 * value); public boolean isEmpty(); public boolean contains(E value); public
	 * void add(E value); public void add(int index, E value); public void
	 * remove(int index); public void set(int index, E value); public void clear();
	 * addAll(list<E> name); checkIndex(int index); class iterator & iterator();
	 */
	private int size;

	// post: returns the current number of elements in the list
	public int size() {
		return size;
	}

	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
	// post: returns the value at the given index in the list
	public E get(int index) { // returns value at given index

	}

	// *Substantially differs between ArrayList & LinkedList classes
	// post : returns the position of the first occurrence of the given
	// value (-1 if not found)
	public int indexOf(E value) { // returns the index of the first appearance of the given value

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

	// *Differs between ArrayList & LinkedList classes
	// post: appends the given value to the end of the list
	public void add(E value) { // adds given value to the end of the list
		add(size, value);
	}

	// *Substantially differs between ArrayList & LinkedList classes
	// pre : 0 <= index <= size() (throws IndexOutOfBoundsException if not)
	// post: inserts the given value at the given index, shifting subsequent
	// values right
	public void add(int index, E value) {

	}
	
	// post: appends all values in the given list to the end of this list
	public void addAll(List<E> other) {
		for (E value : other) {
			add(value);
		}
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

	// post: throws an IndexOutOfBoundsException if the given index is
	// not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}
}
