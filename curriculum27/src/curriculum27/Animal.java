package curriculum27;

public class Animal {
	public String name;
	public double height;
	public int speed;

	public Animal(String name, double height, int speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}

	public void showInfo() { //出力
		System.out.println();
		System.out.println("動物名；" + name + "");
		System.out.println("体長:" + height + "");
		System.out.println("速度:" + speed + "");
	}
}
