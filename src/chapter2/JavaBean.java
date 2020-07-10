package chapter2;

import chapter2.NutritionFacts.Builder;

/**
 * 
 * @author blue
 * @Description 在构造器中赋值
 * @Defect 1、在构造过程中JavaBean可能处于不一致的状态 2、JavaBean模式使得把类做成不可变的可能性不复存在
 *
 */
public class JavaBean {
	private String name = "xxx"; // 食品名称
	private double price = -1; // 食品单价
	private int calories; // 食品所含卡路里
	private int fat; // 食品所含脂肪
	private double energy; // 食品所含能量

	public JavaBean() {
	}

	public void setName(String val) {
		this.name = val;
	}

	public void setPrice(double val) {
		this.price = val;
	}

	public void setColaries(int val) {
		this.calories = val;
	}

	public void setFat(int val) {
		this.fat = val;
	}

	public void setEnergy(double val) {
		this.energy = val;
	}
	
	@Override
	public String toString() {
		return name+"\n"+price+"\n"+calories+"\n"+fat+"\n"+energy+"\n";
	}
	
	//客户端代码
	public static void main(String[] args){
		JavaBean jb = new JavaBean();
		jb.setName("xxx食品");
		jb.setPrice(20.2);
		jb.setColaries(10);
		jb.setFat(9);
		jb.setEnergy(4);
		System.out.println(jb.toString());
	}
	
}
