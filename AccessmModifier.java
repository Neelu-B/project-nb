package com.nb.Training;

public class AccessmModifier {
	public int flag;
	private char[] data;
	public void msg()
	{
		System.out.println("Private Scope...");
	}
		public static void main(String[] args) {
		AccessmModifier obj=new AccessmModifier();
		System.out.println(obj.data);
		obj.msg();
		new Other().func();
	}
	protected void func()
	{
		System.out.println("Protected Scope..");
	}
	void met()
	{
		System.out.println("Package Scope..");
	}
}
class Other {
	void func() {
		AccessmModifier ref=new AccessmModifier();
		ref.flag=70;
		ref.met();
		ref.func();
	}
}

	
	
