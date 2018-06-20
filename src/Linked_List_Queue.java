
public class Linked_List_Queue {
	public QueueNode front;//����ǰ��ָ��
	public QueueNode rear;//����β��ָ��
	public Linked_List_Queue() {//���캯��
		front=null;
		rear=null;
	}
	//enqueue:�������ݴ���
	public boolean enqueue(int value) {
		QueueNode newNode = new QueueNode(value); 
		if(rear==null) {//�ж��Ƿ�Ϊ��һ���ڵ�
			front=newNode;
		}else {
			rear.next=newNode;
		}
		rear=newNode;
		return true;
	}
	
	//dequeue:��������ȡ��
	public int dequeue() {
		int value;
		if(front!=null) {
			if(front==rear)
				rear=null;
			 value=front.data;
			 front=front.next;
		return value;
		}
		return -1;
	}
	//�������
	public void print_queue() {
		System.out.println("����ǰ�˳�����˼���˳�����");
		QueueNode tmp = front;
		while(tmp!=null) {
			System.out.print(" ["+tmp.data+"] ");
			tmp=tmp.next;
		}
	}
}
