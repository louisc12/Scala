package princ

object Rosembrock {
  
  def Example (Punto:Punto2D):Double ={
    val resultado=(Math.pow(Punto.X,2))-(4*Punto.X)+(Math.pow(Punto.Y, 2)-(Punto.Y)-(Punto.X*Punto.Y))
    resultado
  } 
   def Sphere (Punto:Punto2D):Double ={
    val resultado:Double=Math.pow(Punto.X,2)+Math.pow(Punto.Y,2) 
    resultado
  }  
   
   def Rosembrock (Punto:Punto2D):Double ={
    val resultado=(1-Punto.X)+(100*Math.pow((Punto.Y-Math.pow(Punto.X,2)),2))
    resultado    
  }
}