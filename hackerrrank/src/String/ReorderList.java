package String;

class ListNode{
	int val;
	ListNode next;
	
	public ListNode(int val) {
		this.val=val;
		this.next=null;
	}
	
	
}
public class ReorderList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		printList(n1);
		reorderlist(n1);
		printList(n1);
	}

	private static void reorderlist(ListNode head) {
		// TODO Auto-generated method stub
		if(head!=null && head.next!=null) {
	ListNode slow=head;
	ListNode fast=head;
	while(fast!=null && fast.next!=null && fast.next.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		System.out.println("after "+ slow.val+" "+fast.val);
	}
	ListNode second=slow.next;
	slow.next=null;
	second=reverseorder(second);
	ListNode p1=head;
	ListNode p2=second;
	while(p2!=null) {
		ListNode temp1=p1.next;
		ListNode temp2=p2.next;
		p1.next=p2;
		p2.next=temp1;
		p1=temp1;
		p2=temp2;
		if(p1!=null && p2!=null)
		System.out.println("in merge "+ p1.val+" "+p2.val);
	}
		}
	}

	private static ListNode reverseorder(ListNode head) {
		// TODO Auto-generated method stub
		if(head==null || head.next==null) {
		return head;}
			ListNode pre=head;
			ListNode cur=head.next;
			while(cur!=null) {
				ListNode temp=cur.next;
				cur.next=pre;
				pre=cur;
				cur=temp;
				System.out.println("in reverse "+ pre.val);	
			}
			head.next=null;
			return pre;	
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
