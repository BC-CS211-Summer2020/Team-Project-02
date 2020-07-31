//compiler directive to eliminate superfluous warnings.
@SuppressWarnings("unchecked")

public class ListClient3 {
        public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> newList1 = new ArrayList<Integer>();
        
        newList1.add(42);
        newList1.add(18);
        list1.addAll(newList1); // Testing addAll method within main method
        
        System.out.println("TESTING AN ARRAYLIST: ");
        processList(list1);
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        List<Integer> newList2 = new LinkedList<Integer>();
        
        newList2.add(42);
        newList2.add(18);
        list2.addAll(newList2); // Testing addAll method within main method
        
        System.out.println("TESTING A LINKEDLIST: ");
        processList(list2);
    }

    public static void processList(List<Integer> list) { // Melina Perraut (added additional test cases and println statements)
        list.add(93);
        list.add(2, 27); // Adding value at an index
        System.out.println("Original list: " + list.toString());
        
        System.out.println("Size of original list: " + list.size());
        System.out.println("Value at index 1 of original list: " + list.get(1));
        try{ //Diane - added try/catch
            System.out.println("Value at index 5 of original list: " + list.get(5)); // Should throw IndexOutOfBoundsException
            System.out.println("Failure: no exception thrown.");
        } catch (Exception e) {
            System.out.println("Success: threw " + e.toString()); 
        }
        
        System.out.println("Position of first occurrence of 18 in original list: " + list.indexOf(18));
        System.out.println("Position of first occurrence of -5 in original list: " + list.indexOf(-5)); // Should return -1
        System.out.println("Does the original list contain 93? " + list.contains(93));
        System.out.println("Does the original list contain 26? " + list.contains(26)); 
        System.out.println("Is the list currently empty? " + list.isEmpty());
        list.set(0, 24);
        System.out.println("Altered list after setting index 0 of list to 24: " + list.toString());
                
        list.remove(2);
        list.remove(0);
        System.out.println("Altered list after removing values at index 2 and 0: " + list.toString());
        
        list.clear();
        System.out.println("Altered list after clearing all values: " + list.toString());
        System.out.println("Is the list currently empty? " + list.isEmpty());
        
    }
}
