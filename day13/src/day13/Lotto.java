package day13;
import java.util.*;
public class Lotto {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int lottoAr[]=new int[6];
		int userAr[]=new int[6];
		int bonus,bonusUser;
		int count=0;
		for(int i=0;i<6;i++) {
			lottoAr[i]=random.nextInt(45)+1;
			
		}
		bonus=random.nextInt(45)+1;
		System.out.println("Lotto:"+Arrays.toString(lottoAr)+",bonus:"+bonus);
		System.out.print("���� 6�� �Է�:");
		for(int i=0;i<6;i++) {
			userAr[i]=sc.nextInt();
			
		}
		System.out.println("���ʽ� �� �Է�:");
		bonusUser=sc.nextInt();
		System.out.println("User:"+Arrays.toString(userAr)+",bonus:"+bonusUser);
		for(int j=0;j<6;j++) {
			for(int i=0;i<6;i++) {
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
				
			}
			
		}
		System.out.println("�� ���� ����:"+count);
		if(count==6) {
			System.out.println("���ϵ帳�ϴ�! 1���Դϴ�.");
		}else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("���ϵ帳�ϴ�! 2���Դϴ�.");
			}else {
				System.out.println("���ϵ帳�ϴ�! 3���Դϴ�.");
			}
		}else if(count==4) {
			System.out.println("���ϵ帳�ϴ�! 4���Դϴ�.");
		}else if(count==3) {
			System.out.println("���ϵ帳�ϴ�! 5���Դϴ�.");
		}else {
			System.out.println("�ƽ����� ������ȸ��~�̤�");
		}
		
		
		
	}

}