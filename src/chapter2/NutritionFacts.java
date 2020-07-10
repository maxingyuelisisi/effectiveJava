package chapter2;
/**
 * 
 * @author blue
 * @description 当有多个构造器参数时要考虑构建器，以下就是构建器 
 */
//用食品信息来说明
public class NutritionFacts {
	private final String name;		//食品名称
	private final double price;		//食品单价
	private final int calories;		//食品所含卡路里
	private final int fat;			//食品所含脂肪
	private final double energy;		//食品所含能量
	
	//内部静态类-构建器
	public static class Builder{
		//Required parameters
		private final String name;		//食品名称
		private final double price;		//食品单价
		//Optional parameters - initialized to default values
		private int calories = 0;		//食品所含卡路里
		private int fat = 0;			//食品所含脂肪
		private double energy = 0;		//食品所含能量
		public Builder(String name,double price){
			this.name = name;
			this.price = price;
		}
		public Builder colaries(int val){
			this.calories = val;
			return this;
		}
		public Builder fat(int val){
			this.fat = val;
			return this;
		}
		public Builder energy(int val){
			this.energy = val;
			return this;
		}
		public NutritionFacts build(){
			return new NutritionFacts(this);
		}
	}
	private NutritionFacts(Builder builder){
		name = builder.name;
		price = builder.price;
		calories = builder.calories;
		fat = builder.fat;
		energy = builder.energy;
	}
	@Override
	public String toString() {
		return name+"\n"+price+"\n"+calories+"\n"+fat+"\n"+energy+"\n";
	}
	public static void main(String[] args){
		NutritionFacts nf = new NutritionFacts.Builder("烤面筋", 20.1).fat(21).colaries(20).energy(30).build();
		System.out.println(nf.toString());
	}
}










