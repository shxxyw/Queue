import java.io.*;
public class InitalQueue {
	public static int front=-1,rear=-1,max=20;
	public static int val;
	public static char ch;
	public static int [] queue = new int [max];
	
	public static void main(String[] args)throws IOException {
//		inputStreamReaderΪת���� ���ֽ���ת�����ַ���
	BufferedReader in= new BufferedReader(
	   new InputStreamReader(System.in));
	String strM;
	int M=0;
	while(rear<max && M!=3) {
		
		System.out.print("\n 1:��һ����   2��ȡһ����  3������");
		strM =in.readLine();
		M = Integer.parseInt(strM);
		switch(M) {
			case 1:
				System.out.print("��������ֵ��");
				val = Integer.parseInt(in.readLine());
				queue[++rear]=val;
				break;
			case 2:
				if(rear>front) {
					front++;
					System.out.print("ȡ������ֵΪ"+queue[front]+"\n");
					queue[front]=0;
				}
				else {
					System.out.println("�����ѿ�");
					break;
				}
				break;
			default:
				System.out.println();
				break;
			}
		}
	//�������ж�
			if (rear==max-1) {
				System.out.println("��������");
			}
	//�������
			if(front>=rear) {
				System.out.println("����Ϊ��״̬��û��Ԫ����");
			}
			else {
				while(rear>front) {
					System.out.print(" ["+queue[++front]+"] ");
				}
				System.out.println();
			}
	}
}
