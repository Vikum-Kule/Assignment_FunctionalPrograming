object A3_q6 extends App{

	def fib(a:Int,b:Int,n:Int,i:Int): Unit= (i==n) match {
		case false =>print(" "+b);var new_a:Int=b;var new_b=a+b;fib(new_a,new_b,n,i+1);
		case true => ;
	}

	def findFib(n:Int)={
		if(n==0){
			print(0);
	}
		else if(n==1){
			print(" "+0+" "+1);
		}
	
		else{
			print(0);
			fib(0,1,n,1);
		}
	}
	findFib(10);
}