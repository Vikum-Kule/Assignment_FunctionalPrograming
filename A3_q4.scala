object A3_q4 extends App{
	def even(n:Int):Boolean =n match {
		case 0 =>true;
		case _ =>odd(n-1);  
	}

	def odd(n:Int): Boolean ={!(even(n));}

	print(even(6));

}