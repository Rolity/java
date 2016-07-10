package org.hsx.classdemo03;
//一般类中应该保留无参构造方法，这样方便实例化直接调用
public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
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
	public String toString() {
		return "hello world!!!";
	}
}
