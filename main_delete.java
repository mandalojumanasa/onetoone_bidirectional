package TEST;

import java.util.Scanner;

public class main_delete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the boy id");
	int a=sc.nextInt();
	System.out.println("enter the girl id");
	int b=sc.nextInt();
	Dto_user d1=new Dto_user();
	Dto_girl g1=new Dto_girl();
	d1.setBid(a);
	g1.setGid(b);
	Delete_user.std(d1, g1);
//	Delete_user.std(g1);
	System.out.println("data deleted succesfully");
}
}
