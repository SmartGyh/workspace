package linkedList;

public class MyLinkedList_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.addAtHead(1);
		mll.addAtHead(2);
//		System.out.println(mll.size());
		mll.addAtTail(3);
		mll.addAtIndex(1, 2);
		mll.iterator();
//		System.out.println("删除之前："+mll.get(1));
//		mll.deleteAtIndex(1);
//		System.out.println("删除之后："+mll.get(1));
		int arr[] = new int[1];
	}

}
