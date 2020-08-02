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
 * Building Java Programs (Reges & Stepp, 5th edition)
 * Ch. 16, p. 1027, Programming Exercise #3
 * TeamProject02
 *
 * Final Submission:  08-03-20
*/
// Generic interface for a List of E objects.

public interface List<E> extends Iterable<E> {
    public int size();
    public E get(int index);
    public int indexOf(E value);
    public boolean isEmpty();
    public boolean contains(E value);
    public void add(E value);
    public void add(int index, E value);
    public void addAll(List<E> other);
    public void remove(int index);
    public void set(int index, E value);
    public void clear();
    
}
