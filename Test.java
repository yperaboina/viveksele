package pack1;

public class Test {
/*	
	public void m1(){
		System.out.println("no-org");
		
	}
	
*/	

	public void m1(int x){
		System.out.println("int-org");
		
	}
	
	public void m1(float f){
		System.out.println("float-org");
		
	}
	
	public static void main (String[] args){
		
		Test t= new Test();
		//t.m1('a'); //int-org
		t.m1(10l); //float-org
		
		
	}
}
