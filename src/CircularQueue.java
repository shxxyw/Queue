import java.io.*;
public class CircularQueue {
	public static int front=-1,rear=-1,val,max=5;
	public static int [] queue =new int[max];
	public static void main(String[] args)throws IOException {
			//设置每个键位操作
		String strM;
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		int value;
		while( rear<max && val!=3) {
			System.out.println("1：加入一个数据  2：取一个数据 3：结束操作");
			strM=in.readLine();
			val=Integer.parseInt(strM);
			//判断加入情况
			if(val==1) {
				//非满情况  1. rear=4 front=-1为最一直没有取数据的情况 所有空间均利用
				//      2. rear=4 front=0 为第二种满的情况 此时浪费一个空间	
				if((rear+1)!=front&&!(rear==max-1&&front<=0)) {
				System.out.println("请输入数据");
				value=Integer.parseInt(in.readLine());
				rear++;
				if(rear==max)
					rear=0;
				
				queue[rear]=value;
				}else {//队列为满
					System.out.println("队列已满");
					break;
				}
			}
			//取出数据
			if(val==2) {
				if(front==rear) {
					System.out.println("数据为空");
					break;
				}else {
					front++;
					if(front==max)
						front=0;
						
						System.out.println("取出数据为:"+queue[front]);;
						queue[front]=0;
				}
			}
		}
		
//		输出剩下队列的情况
		System.out.println("剩余队列的情况为：");
		if(front==rear) {
			System.out.println("队列已空");
		}else {
			while(front!=rear) {
				System.out.print(" ["+queue[++front]+"] ");
				queue[front]=0;
			}
		}
	}
}
