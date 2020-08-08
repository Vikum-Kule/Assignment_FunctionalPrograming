package functiondata

object Q2 {
  class Rational(a:Int,b:Int){
    def numer=a
    def denom=b
    def sub(num:Rational) = new Rational(this.numer*num.denom - num.numer*this.denom, this.denom*num.denom)
    def neg=new Rational(-this.numer,this.denom)
    override def toString = numer + "/" +denom
};

  def main(args:Array[String])={
    val a=new Rational(3,4)
    val b=new Rational(5,8)
    val c=new Rational(2,7)
    println((a.sub(b)).sub(c));
    
  }

}


