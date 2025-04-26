package day17_c_AccessModifiers.pack1;

public class TestOne {

	private int x = 100; // private - within the class only
	int y = 200; // default - within the same package
	protected int z = 300; // protected - within the project, via inheritance only
	public int a = 5; // public - within the project, without inheritance

	private void m1() {
		System.out.println("This is private method m1 from subpackage, class - TestOne");
	}

	void m2() {
		System.out.println("This is default method m2 from subpackage, class - TestOne");
	}

	protected void m3() {
		System.out.println("This is protected method m3 from subpackage, class - TestOne");
	}
	
	public void m4() {
		System.out.println("This is public method m4 from subpackage, class - TestOne");
	}
}
