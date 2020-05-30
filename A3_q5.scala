object A3_q5 extends App{
	var sum:Int=0;
	def findEven(n:Int):Unit=(n%2)==0 match{
		case true => sum=n+sum;
		case false =>; 	
	}

	def add(n:Int,a:Int): Unit = a<=n match {
		case false =>print(sum);
		case true  =>findEven(a);
		add(n,a+1);

	}
	def main(n:Int):Unit={
		add(n,1);
	}
	main(5);
}