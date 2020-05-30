object A2_q1 extends App {
	def slary(normal:Double=0, OT :Double=0):Double = {
		var salary_pr_week: Double=0;
		salary_pr_week=(normal*150.00+ OT*75.00)*0.9;
		return salary_pr_week;
	}

	print(slary(40,20));
} 