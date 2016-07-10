package org.hsx.classdemo01;

import org.hsx.classdemo02.Person;

public class ClassInstanceDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person();   //实例化对象
		Class<?> c = per.getClass();  //为Class对象实例化
		System.out.println(c.getName());
	}

}
