package princ

case class Punto2D  (X:Double, Y:Double,Fit:Punto2D => Double) extends Ordered [Punto2D] {
  
  val fitness:Double = Fit(this)
  
  def compare(externo:Punto2D):Int={     
    if (this.fitness<externo.fitness)
      return -1
    else{
      if(this.fitness==externo.fitness)
        return 0
      else
        return 1
    }
  }
  
  
}