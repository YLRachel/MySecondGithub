package cn.kgc.dc;

import java.util.Scanner;

public class DingCan {

	public static void main(String[] args) {
		String[] name = new String[5];  //������
		String[] address = new String[10];  //�Ͳ͵�ַ
		String[] dishMegs = {"�������","��������","��ת���"};  //��Ʒ
		int[] time = new int[10];   //�Ͳ�ʱ��
		String[] state = new String[10];  //�Ͳ�״̬
		int[] price = {12,14,16};  //����
		int[] sumPrices = new int[10];   //�����ܽ��
		int[] praise = new int[3];    //����
		int[] deal = new int[10];   //����
		int[] dishNum = new int[10];  //���ͺ�
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
			System.out.println("************************************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("************************************************");
			System.out.print("��ѡ��");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("************��Ҫ����************");
					for(int i=0;i<name.length;i++){
						if(name[i]==null){
							System.out.print("������������");
							name[i] = sc.next();
							System.out.println("��Ʒ��\t��Ʒ��\t����\t������\t");
							for(int j=0;j<dishMegs.length;j++){
								System.out.println(j+1+"\t"+dishMegs[j]+"\t"+price[j]+"Ԫ\t"+praise[j]+"��");
							}
							System.out.print("��ѡ���Ʒ�ţ�");
							int num = sc.nextInt();
							dishNum[i] = num;
							
							System.out.print("��ѡ�������");
							int de = sc.nextInt();
							deal[i] = de;
							
							System.out.print("�������Ͳ�ʱ�䣺");
							int hour = sc.nextInt();
							time[i] = hour;
							
							System.out.print("�������Ͳ͵�ַ��");
							String addr = sc.next();
							address[i] = addr;
							
							state[i] = "��Ԥ��";
							sumPrices[i] = price[num-1]*deal[i];
							
							System.out.println("���ͳɹ���");
						}
						System.out.print("����0���أ�");
						int choose = sc.nextInt();
						if(choose==0){
							break;
						}
					}
					break;
				case 2:
					System.out.println("************�鿴�ʹ�************");
					System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��\t����״̬");
					for(int i=0;i<dishNum.length;i++){
						boolean bo = deal[i]!=0?true:false;
						if(bo){
							System.out.println(i+1+"\t"+name[i]+"\t"+dishMegs[i]+deal[i]+"��"+"\t"+time[i]+"\t"+address[i]+"\t"+sumPrices[i]+"\t"+state[i]);
						}
					}
					System.out.print("����0���أ�");
					int choose = sc.nextInt();
					if(choose==0){
						break;
					}
//					break;
				case 3:
					System.out.println("************ǩ�ն���************");
					System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��\t����״̬");
					for(int i=0;i<dishNum.length;i++){
						boolean bo = deal[i]!=0?true:false;
						if(bo){
							System.out.println(i+1+"\t"+name[i]+"\t"+dishMegs[i]+deal[i]+"��"+"\t"+time[i]+"\t"+address[i]+"\t"+sumPrices[i]+"\t"+state[i]);
						}
					}
					System.out.print("��ѡ��Ҫǩ�յĶ�����");
					int num = sc.nextInt();
					state[num-1] = "�����";
					System.out.println("����ǩ�ճɹ���");
					System.out.print("����0���أ�");
					choose = sc.nextInt();
					if(choose==0){
						break;
					}
//					break;
				case 4:
					System.out.println("************ɾ������************");
					System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t�ܽ��\t����״̬");
					for(int i=0;i<dishNum.length;i++){
						boolean bo = deal[i]!=0?true:false;
						if(bo){
							System.out.println(i+1+"\t"+name[i]+"\t"+dishMegs[i]+deal[i]+"��"+"\t"+time[i]+"\t"+address[i]+"\t"+sumPrices[i]+"\t"+state[i]);
						}
					}
					System.out.print("������Ҫɾ���Ķ�����ţ�");
					int nu = sc.nextInt();
					if(state[nu-1]=="�����"){
						deal[nu-1] = 0;
					}else{
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
					}
					System.out.print("����0���أ�");
					choose = sc.nextInt();
					if(choose==0){
						break;
					}
//					break;
				case 5:
					System.out.println("************��Ҫ����************");
					System.out.println("��Ʒ��\t��Ʒ��\t����\t������\t");
					for(int j=0;j<dishMegs.length;j++){
						System.out.println(j+1+"\t"+dishMegs[j]+"\t"+price[j]+"Ԫ\t"+praise[j]+"��");
					}
					System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
					int ch = sc.nextInt();
					praise[ch-1]++;
					System.out.println("���޳ɹ���");
					System.out.print("����0���أ�");
					choose = sc.nextInt();
					if(choose==0){
						break;
					}
					break;
				case 6:
					System.out.println("ллʹ�ã���ӭ�´ι��٣�");
					System.exit(0);
					break;
				default:
					System.out.println("�����������������");
					break;
			}
		}while(true);
		
	}

}
