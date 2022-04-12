package princ

object oPrincipal {
  def main(args:Array[String])={
    val dato1:punto3d= new punto3d(4,7,1)
    val dato2:punto3d= new punto3d(6,2,5)
    val escalar:Double=7
    
    val sum: punto3d = dato1 + dato2
    val res: punto3d = dato1 - dato2
    val resul: punto3d = dato1 * escalar
    val resul2: punto3d = dato2 * escalar
    
    println("primer punto"+dato1)
    println("segundo punto"+dato2)
    println("Suma: "+sum)
    println("Resta: "+res)
    println("Multiplicacion escalar: "+resul)
    println("Multiplicacion escalar: "+resul2) 
  }
}