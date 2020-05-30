object A3_q3 extends App{
 
 	var b:Int=0;
	def add(n:Int,a:Int): Unit = a<=n match {
		case false =>;
		case true  =>b= a+b;
		add(n,a+1);

	}
	def sum(n:Int):Unit = {
		add(n,1);
		print(b);	
	}
	sum(10);
	
}