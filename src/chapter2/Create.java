package chapter2;

/**
 * 
 * @author blue
 * @Description 重叠构造器模式
 * @defect 当有许多参数的时候，客户端代码会很难编写，并且仍然较难以阅读
 *
 */

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
