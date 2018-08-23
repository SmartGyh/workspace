package linkedList;

public class MyLinkedList {
	class Node {
		int val;
		Node next = null;

		public Node(int val) {
			this.val = val;
		}
	}

	Node head = null;// 这是初始化的头结点，在定义链表时就存在
	// Node tail = head;
	// public MyLinkedList(int val){
	// head.val = val;
	// }
	
	public int size(){
		int size = 0;
		Node node = head;
		try {
			while(true){
				node = node.next;
				size++;
			}
		} catch (Exception e) {
			return size;
		}
	}

	public int get(int index) {// 返回对应链表的值
		try {
			Node node = head;
			if (index == 0) {
				return node.val;
			}
			for (int i = 1; i <= index; i++) {
				node = head.next;
			}
			return node.val;
		} catch (Exception e) {
			return 0;
		}
	}

	public void addAtHead(int val) {// 增加新的头结点
		Node node = new Node(val);
		node.next = head;
		head = node;
	}

	public void addAtTail(int val){//增加尾部节点
		
		Node node = head;
		for(int i = 1;i < size();i++){
			node = node.next;
		}
		Node newNode = new Node(val);
		node.next = newNode;
	}

	public void addAtIndex(int index, int val) {// 在指定位置增加节点
		Node node = head;
		if (index == 0) {
			addAtHead(val);
		}
		if (index == 1){
			Node newNode = new Node(val);
			newNode.next = head.next;
			head.next = newNode;
		}
		for (int i = 1; i < index; i++) {
			node = node.next;
			if (i == index - 1) {
				Node newNode = new Node(val);
				newNode.next = node.next;
				node.next = newNode;
			}
		}
	}

	public void deleteAtIndex(int index) {// 删除指定位置节点
		Node node = head;
		if (index == 0) {
			head = node.next;
		}
		for (int i = 1; i < index; i++) {
			node = node.next;
		}
		node.next = node.next.next;
	}
	
	public void iterator(){
		Node node = head;
		for(int i = 0;i < size();i++){
			System.out.println("第"+i+"个node："+node.val);
			node = node.next;
		}
	}
}
