package org.hsx.classdemo01;

import org.hsx.classdemo02.Person;

public class ClassInstanceDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person();   //ʵ��������
		Class<?> c = per.getClass();  //ΪClass����ʵ����
		System.out.println(c.getName());
	}

}
