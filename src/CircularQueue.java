import java.io.*;
public class CircularQueue {
	public static int front=-1,rear=-1,val,max=5;
	public static int [] queue =new int[max];
	public static void main(String[] args)throws IOException {
			//����ÿ����λ����
		String strM;
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		int value;
		while( rear<max && val!=3) {
			System.out.println("1������һ������  2��ȡһ������ 3����������");
			strM=in.readLine();
			val=Integer.parseInt(strM);
			//�жϼ������
			if(val==1) {
				//�������  1. rear=4 front=-1Ϊ��һֱû��ȡ���ݵ���� ���пռ������
				//      2. rear=4 front=0 Ϊ�ڶ���������� ��ʱ�˷�һ���ռ�	
				if((rear+1)!=front&&!(rear==max-1&&front<=0)) {
				System.out.println("����������");
				value=Integer.parseInt(in.readLine());
				rear++;
				if(rear==max)
					rear=0;
				
				queue[rear]=value;
				}else {//����Ϊ��
					System.out.println("��������");
					break;
				}
			}
			//ȡ������
			if(val==2) {
				if(front==rear) {
					System.out.println("����Ϊ��");
					break;
				}else {
					front++;
					if(front==max)
						front=0;
						
						System.out.println("ȡ������Ϊ:"+queue[front]);;
						queue[front]=0;
				}
			}
		}
		
//		���ʣ�¶��е����
		System.out.println("ʣ����е����Ϊ��");
		if(front==rear) {
			System.out.println("�����ѿ�");
		}else {
			while(front!=rear) {
				System.out.print(" ["+queue[++front]+"] ");
				queue[front]=0;
			}
		}
	}
}
