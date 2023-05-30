package TEST;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dto_user {
	@Id
private int bid;
private String name;
private int age;
@OneToOne
private Dto_girl g;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Dto_girl getG() {
	return g;
}
public void setG(Dto_girl g) {
	this.g = g;
}


}
