package TEST;

import java.util.Scanner;

public class main_class {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the boy id");
	int bid=sc.nextInt();
	System.out.println("enter the girl id");
	int gid=sc.nextInt();
	System.out.println("enter the boy name");
	String name=sc.next();
	System.out.println("enter the girl name");
	String name1=sc.next();
	System.out.println("enter the boy age");
	int age=sc.nextInt();
	System.out.println("enter the girl age");
	int age1=sc.nextInt();
	Dto_user dt1=new Dto_user();
	Dto_girl g2=new Dto_girl();
	dt1.setBid(bid);
	dt1.setName(name);
	dt1.setAge(age);
	g2.setGid(gid);
	g2.setName(name1);
	g2.setAge(age1);
	Dao_user.std(dt1,g2);

}
}
