package list;

public class MainClass {
	Node head, tail;
	void insert(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		if(head==null) {
			head=temp;
			tail=temp;
			temp=null;
		}
		else {
			tail.next=temp;
			tail=temp;
		}
	}
	
	void showData() {
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
		
		
	}
	/*
	 * Removing the Duplicate part from the linkList
	 */
	public  Node removeDuplicates() {
		// Slow is pointing to the current node
	    Node slow = head;
	    //Node fast is pointing to the next node
	    Node fast = head.next;

	    while(fast != null)
	    {
	    	// If data not match it will continue otherwise it will skip
	        if(fast.data != slow.data)
	        {
	            slow.next = fast;
	            slow = fast;
	        }

	        fast = fast.next;
	    }

	    // If there are any trailing values, nullify the last know unique value
	    slow.next = null;

	    return head;

	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass test=new MainClass();
		test.insert(1);
		test.insert(2);
		test.insert(2);
		test.insert(3);
		test.insert(3);
		test.insert(4);
		
		test.showData();
		test.removeDuplicates();
		System.out.println("After Removiing the Duplicate Values");
		test.showData();
		

	}

}
