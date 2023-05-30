package TEST;

import java.util.Scanner;

public class main_update {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the bid");
	int a=sc.nextInt();
	System.out.println("enter the bage");
	int b=sc.nextInt();
	System.out.println("enter the gid");
	int c=sc.nextInt();
	System.out.println("enter the gage");
	int d=sc.nextInt();
	Dto_user d1=new Dto_user();
	Dto_girl g1=new Dto_girl();
	d1.setBid(a);
	d1.setAge(b);
	g1.setGid(c);
	g1.setAge(d);
	Dao_update.upt(d1, g1);
	System.out.println("data updated succesfully");
}
}
