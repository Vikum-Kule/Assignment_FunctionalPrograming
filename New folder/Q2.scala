object VolCalculator extends App{
	def Vol(x:Double): Double = (x*x*x)*(22.0/7.0)*(4.0/3.0);
	print(Vol(5.0));
}