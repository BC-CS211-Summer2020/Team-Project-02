//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class ListClient3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
    }

    public static void processList(List<Integer> list) { // Melina Perraut (added additional test cases and println statements)
        list.add(42);
        list.add(18);
        list.add(93);
        list.add(2, 27); // Adding value at an index
        System.out.println("Original list: " + list.toString());
        
        System.out.println("Size of original list: " + list.size());
        System.out.println("Value at index 1 of original list: " + list.get(1));
        System.out.println("Value at index 5 of original list: " + list.get(5)); // Should throw IndexOutOfBoundsException
        System.out.println("Position of first occurrence of 18 in original list: " + list.indexOf(18));
        System.out.println("Position of first occurrence of -5 in original list: " + list.indexOf(-5)); // Should return -1
        System.out.println("Does the original list contain 93? " + list.contains(93));
        System.out.println("Does the original list contain 26? " + list.contains(26)); 
        System.out.println("Is the list currently empty? " + list.isEmpty());
        // To test from AbstractList class: addAll(List<E> other), set(int index, E value)
        
        list.remove(2);
        list.remove(0);
        System.out.println("Altered list after removing values at index 2 and 0: " + list.toString());
        
        list.clear();
        System.out.println("Altered list after clearing all values: " + list.toString());
        System.out.println("Is the list currently empty? " + list.isEmpty());
        
    }
}
