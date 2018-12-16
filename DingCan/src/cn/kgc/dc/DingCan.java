package cn.kgc.dc;

import java.util.Scanner;

public class DingCan {

	public static void main(String[] args) {
		String[] name = new String[5];  //订餐人
		String[] address = new String[10];  //送餐地址
		String[] dishMegs = {"胡闯渔粉","宫保鸡丁","旋转火锅"};  //菜品
		int[] time = new int[10];   //送餐时间
		String[] state = new String[10];  //送餐状态
		int[] price = {12,14,16};  //单价
		int[] sumPrices = new int[10];   //订单总金额
		int[] praise = new int[3];    //点赞
		int[] deal = new int[10];   //份数
		int[] dishNum = new int[10];  //订餐号
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("欢迎使用“吃货联盟订餐系统”");
			System.out.println("************************************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("************************************************");
			System.out.print("请选择：");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("************我要订餐************");
					for(int i=0;i<name.length;i++){
						if(name[i]==null){
							System.out.print("请输入姓名：");
							name[i] = sc.next();
							System.out.println("菜品号\t菜品名\t单价\t点赞数\t");
							for(int j=0;j<dishMegs.length;j++){
								System.out.println(j+1+"\t"+dishMegs[j]+"\t"+price[j]+"元\t"+praise[j]+"赞");
							}
							System.out.print("请选择菜品号：");
							int num = sc.nextInt();
							dishNum[i] = num;
							
							System.out.print("请选择份数：");
							int de = sc.nextInt();
							deal[i] = de;
							
							System.out.print("请输入送餐时间：");
							int hour = sc.nextInt();
							time[i] = hour;
							
							System.out.print("请输入送餐地址：");
							String addr = sc.next();
							address[i] = addr;
							
							state[i] = "已预订";
							sumPrices[i] = price[num-1]*deal[i];
							
							System.out.println("订餐成功！");
						}
						System.out.print("输入0返回：");
						int choose = sc.nextInt();
						if(choose==0){
							break;
						}
					}
					break;
				case 2:
					System.out.println("************查看餐袋************");
					System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
					for(int i=0;i<dishNum.length;i++){
						boolean bo = deal[i]!=0?true:false;
						if(bo){
							System.out.println(i+1+"\t"+name[i]+"\t"+dishMegs[i]+deal[i]+"份"+"\t"+time[i]+"\t"+address[i]+"\t"+sumPrices[i]+"\t"+state[i]);
						}
					}
					System.out.print("输入0返回：");
					int choose = sc.nextInt();
					if(choose==0){
						break;
					}
//					break;
				case 3:
					System.out.println("************签收订单************");
					System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
					for(int i=0;i<dishNum.length;i++){
						boolean bo = deal[i]!=0?true:false;
						if(bo){
							System.out.println(i+1+"\t"+name[i]+"\t"+dishMegs[i]+deal[i]+"份"+"\t"+time[i]+"\t"+address[i]+"\t"+sumPrices[i]+"\t"+state[i]);
						}
					}
					System.out.print("请选择要签收的订单：");
					int num = sc.nextInt();
					state[num-1] = "已完成";
					System.out.println("订单签收成功！");
					System.out.print("输入0返回：");
					choose = sc.nextInt();
					if(choose==0){
						break;
					}
//					break;
				case 4:
					System.out.println("************删除订单************");
					System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
					for(int i=0;i<dishNum.length;i++){
						boolean bo = deal[i]!=0?true:false;
						if(bo){
							System.out.println(i+1+"\t"+name[i]+"\t"+dishMegs[i]+deal[i]+"份"+"\t"+time[i]+"\t"+address[i]+"\t"+sumPrices[i]+"\t"+state[i]);
						}
					}
					System.out.print("请输入要删除的订单序号：");
					int nu = sc.nextInt();
					if(state[nu-1]=="已完成"){
						deal[nu-1] = 0;
					}else{
						System.out.println("您选择的订单未签收，不能删除！");
					}
					System.out.print("输入0返回：");
					choose = sc.nextInt();
					if(choose==0){
						break;
					}
//					break;
				case 5:
					System.out.println("************我要点赞************");
					System.out.println("菜品号\t菜品名\t单价\t点赞数\t");
					for(int j=0;j<dishMegs.length;j++){
						System.out.println(j+1+"\t"+dishMegs[j]+"\t"+price[j]+"元\t"+praise[j]+"赞");
					}
					System.out.print("请选择您要点赞的菜品序号：");
					int ch = sc.nextInt();
					praise[ch-1]++;
					System.out.println("点赞成功！");
					System.out.print("输入0返回：");
					choose = sc.nextInt();
					if(choose==0){
						break;
					}
					break;
				case 6:
					System.out.println("谢谢使用，欢迎下次光临！");
					System.exit(0);
					break;
				default:
					System.out.println("输入错误，请重新输入");
					break;
			}
		}while(true);
		
	}

}
