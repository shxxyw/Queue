import java.io.*;
public class InitalQueue {
	public static int front=-1,rear=-1,max=20;
	public static int val;
	public static char ch;
	public static int [] queue = new int [max];
	
	public static void main(String[] args)throws IOException {
//		inputStreamReader为转换流 将字节流转换成字符流
	BufferedReader in= new BufferedReader(
	   new InputStreamReader(System.in));
	String strM;
	int M=0;
	while(rear<max && M!=3) {
		
		System.out.print("\n 1:存一个数   2：取一个数  3：结束");
		strM =in.readLine();
		M = Integer.parseInt(strM);
		switch(M) {
			case 1:
				System.out.print("请输入数值：");
				val = Integer.parseInt(in.readLine());
				queue[++rear]=val;
				break;
			case 2:
				if(rear>front) {
					front++;
					System.out.print("取出的数值为"+queue[front]+"\n");
					queue[front]=0;
				}
				else {
					System.out.println("队列已空");
					break;
				}
				break;
			default:
				System.out.println();
				break;
			}
		}
	//队列满判断
			if (rear==max-1) {
				System.out.println("队列已满");
			}
	//输出队列
			if(front>=rear) {
				System.out.println("队列为空状态，没有元素了");
			}
			else {
				while(rear>front) {
					System.out.print(" ["+queue[++front]+"] ");
				}
				System.out.println();
			}
	}
}
