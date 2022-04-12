package princ

import java.util.Scanner
import scala.util.Random

object oPrincipal {
  def main (args:Array[String])={
  val scan:Scanner = new Scanner(System.in)
  var rd = Random
  var limite=5
  
  println("Metodo para optimizar")
  println("1.-Rosembrock")
  println("2.-Sphere")
  println("3.-Example")
  val opcion:Int =scan.nextInt()
  
  if(opcion==1){
     println("Rosembrock")
     var P1R:Punto2D=new Punto2D(1.2,0.0,Rosembrock.Rosembrock)
     var P2R:Punto2D=new Punto2D(rd.nextInt(limite),rd.nextInt(limite),Rosembrock.Rosembrock)
     var P3R:Punto2D=new Punto2D(rd.nextInt(limite),rd.nextInt(limite),Rosembrock.Rosembrock)
    
     println("Puntos Aleatorios")
     println(" X="+ P1R.X+ " Y="+P1R.Y, " Fit="+P1R.fitness)
     println(" X="+ P2R.X+ " Y="+P2R.Y, " Fit="+P2R.fitness)
     println(" X="+ P3R.X+ " Y="+P3R.Y, " Fit="+P3R.fitness)
  
     var evaluarFitR:Double=0
     var listaR:List[Punto2D]=List()
     listaR=listaR:+P1R
     listaR= P2R +: listaR
     listaR= P3R +: listaR   
     listaR=listaR.sortWith(OrdenarR) 
    
     var BestR = listaR(0)
     var GoodR = listaR(1)
     var WorseR=listaR(2)
     
     do{
       var MedioR:Punto2D = BestGodWorse.MedioR(BestR, GoodR)
       var ReflejoR:Punto2D= BestGodWorse.ReflejoR(MedioR, WorseR)  
 
       if (ReflejoR.fitness <= GoodR.fitness) {
         if (BestR.fitness <= ReflejoR.fitness) {
           WorseR=ReflejoR 
           } else {
             var ExtencionR:Punto2D = BestGodWorse.ExtencionR(ReflejoR, MedioR)
             if (ExtencionR.fitness <= BestR.fitness) { 
              WorseR = ExtencionR
              } else {
                WorseR = ReflejoR
              }
            }         
         }else { 
           if (ReflejoR.fitness <= WorseR.fitness) {
             WorseR = ReflejoR
             }
           var ContraccionR:Punto2D = BestGodWorse.ContraccionR(WorseR, MedioR)
           if (ContraccionR.fitness <= WorseR.fitness) {
             WorseR = ContraccionR
             } else {
               var EncojimientoR:Punto2D = BestGodWorse.EncogimientoR(BestR, WorseR)
               WorseR = EncojimientoR
               GoodR = MedioR
               }
            } 
       var lista2R:List[Punto2D]=List()
       lista2R=lista2R:+BestR
       lista2R= GoodR +: lista2R
       lista2R= WorseR +: lista2R       
       println("Puntos BEST GOOD WORSE")
       println(" X="+ BestR.X+ " Y="+BestR.Y, " Fit="+BestR.fitness)
       println(" X="+ GoodR.X+ " Y="+GoodR.Y, " Fit="+GoodR.fitness)
       println(" X="+ WorseR.X+ " Y="+WorseR.Y, " Fit="+WorseR.fitness)
         
       lista2R=lista2R.sortWith(OrdenarR)         
       BestR=lista2R(0)
       GoodR=lista2R(1)
       WorseR=lista2R(2)
       
       evaluarFitR=BestR.fitness-GoodR.fitness
       println(evaluarFitR)
    
       }while (Math.abs(BestR.fitness - GoodR.fitness) >= .0001);
        println(" La optimizacion por Rosembrock es")
        println(" X="+ BestR.X+ " Y="+BestR.Y, " Fit="+BestR.fitness)
   }
 else if(opcion==2){
     println("Sphere")
     var P1S:Punto2D=new Punto2D(rd.nextInt(limite),rd.nextInt(limite),Rosembrock.Sphere)
     var P2S:Punto2D=new Punto2D(rd.nextInt(limite),rd.nextInt(limite),Rosembrock.Sphere)
     var P3S:Punto2D=new Punto2D(rd.nextInt(limite),rd.nextInt(limite),Rosembrock.Sphere)
    
     println("Puntos Aleatorios")
     println(" X="+ P1S.X+ " Y="+P1S.Y, " Fit="+P1S.fitness)
     println(" X="+ P2S.X+ " Y="+P2S.Y, " Fit="+P2S.fitness)
     println(" X="+ P3S.X+ " Y="+P3S.Y, " Fit="+P3S.fitness)
  
     var evaluarFitS:Double=0
     var listaS:List[Punto2D]=List()
     listaS=listaS:+P1S
     listaS= P2S +: listaS
     listaS= P3S +: listaS   
     listaS=listaS.sortWith(OrdenarS) 
    
     var BestS = listaS(0)
     var GoodS = listaS(1)
     var WorseS=listaS(2)
     
     do{
    var MedioS:Punto2D = BestGodWorse.MedioS(BestS, GoodS)
    var ReflejoS:Punto2D= BestGodWorse.ReflejoS(MedioS, WorseS)  
    if (ReflejoS.fitness <= GoodS.fitness) {
      if (BestS.fitness <= ReflejoS.fitness) {
         WorseS=ReflejoS
        } else {       
          var ExtencionS:Punto2D = BestGodWorse.ExtencionS(ReflejoS, MedioS)
          if (ExtencionS.fitness <= BestS.fitness) {
            WorseS = ExtencionS
          } else {
            WorseS = ReflejoS
          }
        }
      }else {
        if (ReflejoS.fitness <= WorseS.fitness) {
          WorseS = ReflejoS
        }    
        var ContraccionS:Punto2D = BestGodWorse.ContraccionS(WorseS, MedioS)
        if (ContraccionS.fitness <= WorseS.fitness) {
          WorseS = ContraccionS
        } else {   
          var EncojimientoS:Punto2D = BestGodWorse.EncogimientoS(BestS, WorseS)
          WorseS = EncojimientoS
          GoodS= MedioS
          }
        }
  var lista2S:List[Punto2D]=List()
     lista2S=lista2S:+BestS
     lista2S= GoodS +: lista2S
     lista2S= WorseS +: lista2S       
     println("Puntos BEST GOOD WORSE")
     println(" X="+ BestS.X+ " Y="+BestS.Y, " Fit="+BestS.fitness)
     println(" X="+ GoodS.X+ " Y="+GoodS.Y, " Fit="+GoodS.fitness)
     println(" X="+ WorseS.X+ " Y="+WorseS.Y, " Fit="+WorseS.fitness)
         
     lista2S=lista2S.sortWith(OrdenarS)         
     BestS=lista2S(0)
     GoodS=lista2S(1)
     WorseS=lista2S(2)

     evaluarFitS=BestS.fitness-GoodS.fitness  
     println(evaluarFitS)
  
  }while (Math.abs(BestS.fitness - GoodS.fitness) >= .0001);
        println(" La optimizacion por Sphere es")
        println(" X="+ BestS.X+ " Y="+BestS.Y, " Fit="+BestS.fitness)
        
         }
   
  else if(opcion==3){
    println("Example") 
    var P1E:Punto2D=new Punto2D(0,0,Rosembrock.Example)
    var P2E:Punto2D=new Punto2D(1.2,0,Rosembrock.Example)
    var P3E:Punto2D=new Punto2D(0,0.8,Rosembrock.Example)
    
    println("Puntos Aleatorios")
    println(" X="+ P1E.X+ " Y="+P1E.Y, " Fit="+P1E.fitness)
    println(" X="+ P2E.X+ " Y="+P2E.Y, " Fit="+P2E.fitness)
    println(" X="+ P3E.X+ " Y="+P3E.Y, " Fit="+P3E.fitness)
  
    var evaluarFitE:Double=0
    var listaE:List[Punto2D]=List()
    listaE=listaE:+P1E
    listaE= P2E +: listaE
    listaE= P3E +: listaE   
    listaE=listaE.sortWith(OrdenarE) 
     
    var BestE = listaE(0)
    var GoodE = listaE(1)
    var WorseE=listaE(2)
    
    do{

      var MedioE:Punto2D = BestGodWorse.MedioE(BestE, GoodE)
      var ReflejoE:Punto2D= BestGodWorse.ReflejoE(MedioE, WorseE)  
 
      if (ReflejoE.fitness <= GoodE.fitness) {
        if (BestE.fitness <= ReflejoE.fitness) {
          WorseE=ReflejoE
        } else {       
          var ExtencionE:Punto2D = BestGodWorse.ExtencionE(ReflejoE, MedioE)
          if (ExtencionE.fitness <= BestE.fitness) {
            WorseE = ExtencionE
          } else {
            WorseE = ReflejoE
          }
        }
      }else {
        if (ReflejoE.fitness <= WorseE.fitness) {
          WorseE = ReflejoE
        }    
        var ContraccionE:Punto2D = BestGodWorse.ContraccionE(WorseE, MedioE)
        if (ContraccionE.fitness <= WorseE.fitness) {
          WorseE = ContraccionE
        } else {   
          var EncojimientoE:Punto2D = BestGodWorse.EncogimientoE(BestE, WorseE)
          WorseE = EncojimientoE
          GoodE = MedioE
          }
      }
       var lista2E:List[Punto2D]=List()
      lista2E=lista2E:+BestE
      lista2E= GoodE +: lista2E
      lista2E= WorseE +: lista2E       
      println("Puntos BEST GOOD WORSE")
      println(" X="+ BestE.X+ " Y="+BestE.Y, " Fit="+BestE.fitness)
      println(" X="+ GoodE.X+ " Y="+GoodE.Y, " Fit="+GoodE.fitness)
      println(" X="+ WorseE.X+ " Y="+WorseE.Y, " Fit="+WorseE.fitness)
         
      lista2E=lista2E.sortWith(OrdenarE)         
      BestE=lista2E(0)
      GoodE=lista2E(1)
      WorseE=lista2E(2)
        
      evaluarFitE=BestE.fitness-GoodE.fitness   
      println(evaluarFitE)  
  
      }while (Math.abs(BestE.fitness - GoodE.fitness) >= .00000001);       
        println(" La optimizacion por Example es")
        println(" X="+ BestE.X+ " Y="+BestE.Y, " Fit="+BestE.fitness)

    }   
  }
  def OrdenarR(P1:Punto2D,P2:Punto2D):Boolean={   
    if(Rosembrock.Rosembrock(P1)<Rosembrock.Rosembrock(P2))      
      return true
    else
      return false       
  }
    
   def OrdenarE(P1:Punto2D,P2:Punto2D):Boolean={   
    if(Rosembrock.Example(P1)<Rosembrock.Example(P2))      
      return true
    else
      return false       
  }
    def OrdenarS(P1:Punto2D,P2:Punto2D):Boolean={   
    if(Rosembrock.Sphere(P1)<Rosembrock.Sphere(P2))      
      return true
    else
      return false       
  }

}