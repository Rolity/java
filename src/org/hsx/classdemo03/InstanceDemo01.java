package org.hsx.classdemo03;

import java.lang.reflect.Constructor;

public class InstanceDemo01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> c = null;
		Person per = null;
		c = Class.forName("org.hsx.classdemo03.Person");
		Constructor<?> cons[] = c.getConstructors();  //得到全部构造方法，一般默认参数多的构造方法排在前面
		per = (Person) cons[0].newInstance("HELLO",1);
		System.out.println(per);

	}

}
