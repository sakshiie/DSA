
abstract class Parent
{
	abstract void m1();
	
}
abstract class child extends Parent
{

}
abstract class child2 extends Parent
{
	void m1(){
		System.out.println("m1");

}
}
class Abstraction
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
