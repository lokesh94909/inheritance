
public class SingleInhertance extends java.lang.Object {
	
	//every class in java implements single inhertance by extending java.lang.object
	//to prove
	
	void m1(){
		System.out.println("inside m1");
	}
	public static void main(String[] args) {
		
		SingleInhertance obj=new SingleInhertance();
		obj.m1();
		obj.hashCode();
		obj.getClass();
		
		//all these methods we havent written implemention but even though they were excecuting since every class extends java.lang.Object 
		
		
	}
	
	

}
