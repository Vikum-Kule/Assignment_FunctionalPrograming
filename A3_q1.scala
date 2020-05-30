object A3_q1 extends App{


	def primeSub(n:Int,p:Int): Boolean=p match{  
	   case x if n==x => true; 
	   case x if(n%x==0) => false;
	   case x =>primeSub(n,x+1); 
	}

	def prime(n:Int)= n match{
		case 0=>print("false") ;
		case 1=>print("false") ;
		case x if x>1=> println(primeSub(n,2)); 	
	}

	prime(1);
}