package Sorting;



class ListNode{
	int val;
	ListNode next;
	
	public ListNode(int val) {
		this.val=val;
		this.next=null;
	}
	
	
}

public class InsertionSortUsingLinkedList {

	public static ListNode insertionSortList(ListNode head) {
		if(head==null ) return head;
		
		ListNode helper=new ListNode(0);
		ListNode cur=head;
		ListNode pre=helper;
		ListNode next=null;
		while(cur!=null) {
			next=cur.next;
			while(pre.next!=null &&pre.next.val<cur.val) {
				pre=pre.next;
			}
			cur.next=pre.next;
			pre.next=cur;
			pre=helper;
			cur=next;
		}
		return helper.next;
	}
	public static void main(String[] args) {
		ListNode n1 = new ListNode(-1);
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(0);
	
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next=n5;
		ListNode result=insertionSortList(n1);
		printList(result);
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
