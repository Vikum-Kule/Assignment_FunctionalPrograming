object A2_q2 extends App{
	def attendees(price:Int): Int = {
		var atend:Int =120+(15-price)/5*20; 
		return atend;
	}
	def rev(price:Int): Int = {
		var revenue:Int= attendees(price)* price;
		return revenue;
	}

	def cal_cost(price:Int): Int = {
		var cost:Int=500+(3*attendees(price));
		return cost;
	}

	def cal_profit(price:Int): Unit ={
		var profit:Int=rev(price)-cal_cost(price);
		println("tiket price:"+price+" "+"profit:"+profit);
	}

	cal_profit(5);
	cal_profit(10);
	cal_profit(15);
	cal_profit(20);
}