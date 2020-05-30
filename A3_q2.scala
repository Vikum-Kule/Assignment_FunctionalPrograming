object test extends App{

	
	def primeSub(n:Int,p:Int): Boolean=p match{  
	   case x if (x==n)=> true; 
	   case x if(n%x==0) =>false;
	   case x =>primeSub(n,x+1); 
	}

	def add(n:Int,a:Int=1):Unit= {
		if(a<=n){
			if(primeSub(a,2)){
				print(" "+a);
			}
			add(n,a+1);
		}
	}	

	// def add(n:Int,a:Int):Unit= (a<n) match {
	// 	case false =>;
	// 	case true  =>primeSub(a,2);add(n,a+1);
		

	// }
	def primeSeq(n:Int):Unit = {
		add(n,1);
	}

	primeSeq(9);
	
}