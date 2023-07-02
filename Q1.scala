object Q1 {
  def getInterest (amount: Double) : Double = 
    amount match{
    case amount if amount <0 =>0

    case amount if amount<20000 => amount*0.02

    case amount if amount<200000 => amount*0.04
      
    case amount if amount<2000000 => amount*0.035

    case amount if amount>=2000000 => amount*0.065
    }

  def main (args : Array [String]) : Unit = {
    val deposite = 500000;
    val interest = getInterest(deposite);
    println (s"The interest earned on Rs.$deposite is Rs.$interest");
  }

}
