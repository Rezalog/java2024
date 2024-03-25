package day01;

class Car13{
	public int speed;
	public int maxSpeed;
	public String model;
	public Car13(){
		this.model="기본차";
		this.maxSpeed=150;
	}
	public Car13(int maxSpeed){
		this();
		this.maxSpeed=maxSpeed;
	}
	public Car13(int maxSpeed,String model){
		this();
		this.maxSpeed=maxSpeed;
		this.model=model;
	}
}
class Ex13{

public static void main(String[] args){

	Car13 car2=new Car13();
	System.out.println(car2.model);
}

}





