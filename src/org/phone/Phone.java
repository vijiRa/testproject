package org.phone;

public class Phone {
	public void phoneInfo() {
		System.out.println("Phone Info");
	}
	public void phoneInfo(String name,int camera) {
		System.out.println("Phone name "+name);
		System.out.println("Phone camera "+camera);
		System.out.println("hello");
	}
	public void phoneInfo(int camera, String name) {
		System.out.println("Phone camera "+camera);
		System.out.println("Phone name "+name);
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo();
		p.phoneInfo("Vivo", 48);
		p.phoneInfo(32, "Samsung");
	}
	

}
