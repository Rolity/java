package org.hsx.classdemo01;

public class ClassInstanceDemo03 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Class<?> c = null;
		try {
			c = Class.forName("org.hsx.classdemo01.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getName());
	}

}
