//Linked node problem 1 -- taken from Chapter 16 slide 17

public class LinkedNode01a {
   public static void main(String[] args) {
      ListNode listHead = new ListNode(10);
      listHead.next = new ListNode(20);
      System.out.println("listHead: " + "[" + listHead.data + ", " + (listHead.next).data + "]");
      System.out.println();

//Add the new node to the end of the list.
   }
}