package TEST;

import java.util.Scanner;

public class main_fetch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the bid");
	int a=sc.nextInt();
	System.out.println("enter the gid");
	int b=sc.nextInt();
	Dto_user d1=new Dto_user();
	Dto_girl g1=new Dto_girl();
	d1.setBid(a);
	g1.setGid(b);
	Dao_fetch.rad(d1, g1);
	System.out.println("data fetched succesfully");
}
}
