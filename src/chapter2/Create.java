package chapter2;

public class Create {
	private String name;
	private char sex;
	private int age;
	private String sno;
	public Create(String sno,String name){
		this(sno,name,'男');
	}
	public Create(String sno, String name, char sex) {
		this(sno,name,sex,18);
	}
	public Create(String sno, String name, char sex,int age) {
		this.sno = sno;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	@Override
	public String toString() {
		return sno+"\n"+name+"\n"+sex+"\n"+age;
	}
	public static void main(String[] args){
		Create c = new Create("20182241","xingyuema");
		System.out.println(c.toString());
	}
}
