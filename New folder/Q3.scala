object CostCal extends App{
	def Cost(x:Double):Double ={
		var a:Double=0;
		if(x<=50){
			a=(x*24.95)*(0.6)+3;
		}else{
			a=(x*24.95)*(0.6)+3+((x-50)*0.75);
		
		}
		return a;
	}
	println(Cost(60));
   }