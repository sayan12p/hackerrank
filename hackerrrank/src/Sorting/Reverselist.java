package Sorting;

public class Reverselist {

	public static ListNode reverselist(ListNode head) {
		if(head==null) return null;
		if(head!=null && head.next==null) return head;
		ListNode temp=null;
		ListNode nextnode=null;
		while(head!=null) {
			nextnode=head.next;
			head.next=temp;
			temp=head;
			head=nextnode;
			
		}
		return temp;
	}
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		printList(n1);
		n1=reverselist(n1);
		printList(n1);
	}
	private static void printList(ListNode n) {
		// TODO Auto-generated method stub
		System.out.println("------");
		while (n != null) {
		System.out.print(n.val);
		n = n.next;
		}
		System.out.println();

	}
}
