//Linked node problem 3 -- taken from Chapter 16 slide 19

public class LinkedNode03a {
   public static void main(String[] args) {
      ListNode listHead1 = null;
      listHead1 = new ListNode(10);
      listHead1.next = new ListNode(20);
      System.out.println("listHead1: " + "[" + listHead1.data + ", " + (listHead1.next).data + "]");
      ListNode listHead2 = null;
      listHead2 = new ListNode(30);
      listHead2.next = new ListNode(40);
      System.out.println("listHead2: " + "[" + listHead2.data + ", " + (listHead2.next).data + "]");
      System.out.println();
   
   //Move node with 30 between 10 node and 20 node; don't lose 40 node.
   }
}