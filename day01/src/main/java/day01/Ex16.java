package day01;

public class Ex16 {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String path1 = clazz.getResource("./").getPath();
		String path2 = clazz.getResource("/").getPath();

		System.out.println(path1);
		System.out.println(path2);
	}
}
