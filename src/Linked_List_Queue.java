
public class Linked_List_Queue {
	public QueueNode front;//队列前端指针
	public QueueNode rear;//队列尾端指针
	public Linked_List_Queue() {//构造函数
		front=null;
		rear=null;
	}
	//enqueue:队列数据存入
	public boolean enqueue(int value) {
		QueueNode newNode = new QueueNode(value); 
		if(rear==null) {//判断是否为第一个节点
			front=newNode;
		}else {
			rear.next=newNode;
		}
		rear=newNode;
		return true;
	}
	
	//dequeue:队列数据取出
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
	//输出队列
	public void print_queue() {
		System.out.println("按先前端出到后端加入顺序输出");
		QueueNode tmp = front;
		while(tmp!=null) {
			System.out.print(" ["+tmp.data+"] ");
			tmp=tmp.next;
		}
	}
}
