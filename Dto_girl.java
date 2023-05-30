package TEST;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dto_girl {
	@Id
private int gid;
private String name;
private int age;
@OneToOne
private Dto_user b;

public int getGid() {
	return gid;
}

public void setGid(int gid) {
	this.gid = gid;
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

public Dto_user getB() {
	return b;
}

public void setB(Dto_user b) {
	this.b = b;
}


}
