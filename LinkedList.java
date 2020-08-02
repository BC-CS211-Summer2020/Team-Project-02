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
 *
 * Class LinkedList<E> - can be used to store a list of values of type E, altered to extend AbstractList<E>
*/

import java.util.*;

public class LinkedList<E> extends AbstractList<E> {
    private ListNode<E> front; // first value in the list
    private ListNode<E> back; // last value in the list
    // private int size; // current number of elements // Diane - removed this, will
    // use super class (AbstractList) size declaration

    // post: constructs an empty list
    public LinkedList() {
        front = new ListNode<E>(null);
        back = new ListNode<E>(null);
        clear();
    }
    /*
     * // This method has been block commented out, will be handled via AbstractList
     * // post: returns the current number of elements in the list public int size()
     * { return size; }
     * 
     * // This method has been block commented out, will be handled via AbstractList
     * // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not) //
     * post: returns the value at the given index in the list public E get(int
     * index) { checkIndex(index); ListNode<E> current = nodeAt(index); return
     * current.data; }
     * 
     * // This method has been block commented out, will be handled via AbstractList
     * // post: creates a comma-separated, bracketed version of the list public
     * String toString() { if (size == 0) { return "[]"; } else { String result =
     * "[" + front.next.data; ListNode<E> current = front.next.next; while (current
     * != back) { result += ", " + current.data; current = current.next; } result +=
     * "]"; return result; } }
     * 
     * // This method has been block commented out, will be handled via AbstractList
     * // post : returns the position of the first occurrence of the given // value
     * (-1 if not found) public int indexOf(E value) { int index = 0; ListNode<E>
     * current = front.next; while (current != back) { if
     * (current.data.equals(value)) { return index; } index++; current =
     * current.next; } return -1; }
     * 
     * // post: returns true if list is empty, false otherwise public boolean
     * isEmpty() { return size == 0; }
     * 
     * // This method has been block commented out, will be handled via AbstractList
     * // post: returns true if the given value is contained in the list, // false
     * otherwise public boolean contains(E value) { return indexOf(value) >= 0; }
     */
    // Diane Lansinger & Arash Yazdidoost
    // This method has been block commented out, will be handled via AbstractList
    // post: appends the given value to the end of the list
    /*
     * public void add(E value) { add(size, value); }
     */

    // Diane Lansinger & Arash Yazdidoost
    // pre: 0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    // values right
    public void add(int index, E value) {
        // block commented out below, will be handled via AbstractList
        /*
         * if (index < 0 || index > size) { throw new
         * IndexOutOfBoundsException("index: " + index); }
         */
        // super.add(index, value); // super calls AbstractList
        ListNode<E> current = nodeAt(index - 1);
        ListNode<E> newNode = new ListNode<E>(value, current.next, current);
        current.next = newNode;
        newNode.next.prev = newNode;
        super.add(index, value); // super calls AbstractList - CHANGED POSITION
        // size++;
    }

    // post: appends all values in the given list to the end of this list
    public void addAll(List<E> other) {
        for (E value : other) {
            add(value);
        }
    }

    // Diane Lansinger & Arash Yazdidoost
    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    // block commented out below, will be handled via AbstractList
    /*
     * public void remove(int index) { checkIndex(index); super.remove(index); //
     * super calls AbstractList ListNode<E> current = nodeAt(index - 1);
     * current.next = current.next.next; current.next.prev = current; size--; }
     */

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the value at the given index with the given value
    public void set(int index, E value) {
        /* checkIndex(index); */
        super.set(index, value);
        ListNode<E> current = nodeAt(index);
        current.data = value;
    }

    // post: list is empty
    public void clear() {
        front.next = back;
        back.prev = front;
        // size = 0;
        super.clear();
    }

    // post: returns an iterator for this list
    public Iterator<E> iterator() {
        return new LinkedIterator();
    }

    // pre : 0 <= index < size()
    // post: returns the node at a specific index. Uses the fact that the list
    // is doubly-linked to start from the front or the back, whichever
    // is closer.
    private ListNode<E> nodeAt(int index) {
        ListNode<E> current;
        if (index < size / 2) {
            current = front;
            for (int i = 0; i < index + 1; i++) {
                current = current.next;
            }
        } else {
            current = back;
            for (int i = size; i >= index + 1; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    /*
     * // This method has been block commented out, will be handled via AbstractList
     * // post: throws an IndexOutOfBoundsException if the given index is // not a
     * legal index of the current list private void checkIndex(int index) { if
     * (index < 0 || index >= size()) { throw new
     * IndexOutOfBoundsException("index: " + index); } }
     */
    private static class ListNode<E> {
        public E data; // data stored in this node
        public ListNode<E> next; // link to next node in the list
        public ListNode<E> prev; // link to previous node in the list

        // post: constructs a node with given data and given links
        public ListNode(E data, ListNode<E> next, ListNode<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        // post: constructs a node with given data and null links
        public ListNode(E data) {
            this(data, null, null);
        }
    }

    private class LinkedIterator implements Iterator<E> {
        private ListNode<E> current; // location of next value to return
        private boolean removeOK; // whether it's okay to remove now

        // post: constructs an iterator for the given list
        public LinkedIterator() {
            current = front.next;
            removeOK = true; // Diane - changed from false to true
        }

        // post: returns true if there are more elements left, false otherwise
        public boolean hasNext() {
            return current != back;
        }

        // pre : hasNext()
        // post: returns the next element in the iteration
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E result = current.data;
            current = current.next;
            removeOK = true;
            return result;
        }

        // Diane Lansinger & Arash Yazdidoost
        // pre : next() has been called without a call on remove (i.e., at most
        // one call per call on next)
        // post: removes the last element returned by the iterator
        public void remove() {
            if (!removeOK) {
                throw new IllegalStateException();
            }
            /*
             * ListNode<E> prev2 = current.prev.prev; prev2.next = current; current.prev =
             * prev2;
             */
            /* size--; */ // block commented out, will be handled via AbstractList
            ListNode<E> prev = current.prev;
            prev.next = current.next;
            current.next.prev = prev;
            removeOK = false;
        }
    }
}
