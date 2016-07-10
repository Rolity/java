package org.hsx.classdemo02;

public class InstanceDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c =null;
		try {
			c = Class.forName("org.hsx.classdemo02.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Person p = (Person)c.newInstance();
			System.out.println(p);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
