package functiondata

object Q3 {
  def main(args:Array[String])={
  val acnt1 = new Account("973254553V","70637012","K.M.D.R Bandara",20000);
  val acnt2 = new Account("199732504553","83977472","K.M.T Bandara",15000);
  println("Initial Balances: \n");
  println(acnt1);
  println(acnt2);
  acnt1.transferMoney(acnt2,15000);
  println("Balances after Transfer: \n");
  println(acnt1);
  println(acnt2);
}

class Account(id:String, accNo:String, name:String, amount:Double){
  val nic = id;
  val accountNumber = accNo;
  val fullName = name;
  var balance = amount;

  def withdraw(amount: Double) = this.balance -= amount;
  def deposit(amount: Double) = this.balance += amount;
  def transferMoney(bankAccount: Account,amount:Double): Unit ={
    this.withdraw(amount);
    bankAccount.deposit(amount);
  }
  override def toString: String = "NIC: "+this.nic+"\nAccountNumber: "+this.accountNumber+"\nFull Name: "+this.fullName+"\nBalance: "+this.balance+"\n";
}
}