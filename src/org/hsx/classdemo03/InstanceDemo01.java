package org.hsx.classdemo03;

import java.lang.reflect.Constructor;

public class InstanceDemo01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> c = null;
		Person per = null;
		c = Class.forName("org.hsx.classdemo03.Person");
		Constructor<?> cons[] = c.getConstructors();  //�õ�ȫ�����췽����һ��Ĭ�ϲ�����Ĺ��췽������ǰ��
		per = (Person) cons[0].newInstance("HELLO",1);
		System.out.println(per);

	}

}
