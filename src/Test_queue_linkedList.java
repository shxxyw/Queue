
public class Test_queue_linkedList {
	public static void main(String[] args) {
		Linked_List_Queue test = new Linked_List_Queue();
		//�������
		for(int i=1; i<=5;i++)
			test.enqueue(i);
		//�������
		test.print_queue();
	}

}
