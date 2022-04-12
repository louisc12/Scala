package princ

object BestGodWorse {
 
def ReflejoR (Medio:Punto2D,Worse:Punto2D) :Punto2D={
    val ReflejoX = (2*Medio.X )- Worse.X
    val ReflejoY = (2*Medio.Y) - Worse.Y
    Punto2D(ReflejoX,ReflejoY,Rosembrock.Rosembrock)
  }
  def ExtencionR (Reflejo:Punto2D,Medio:Punto2D):Punto2D={
    val ExtencionX= (2*Reflejo.X) - Medio.X
    val ExtencionY= (2*Reflejo.Y) - Medio.Y
    Punto2D(ExtencionX,ExtencionY,Rosembrock.Rosembrock)
  }
  
  def ContraccionR (Worse:Punto2D,Medio:Punto2D):Punto2D={
    val ContraccionX= (Worse.X + Medio.X)/2
    val ContraccionY= (Worse.Y + Medio.Y)/2
    Punto2D(ContraccionX,ContraccionY,Rosembrock.Rosembrock)
  }
  
  def MedioR (Best:Punto2D,Good:Punto2D) : Punto2D = {
    val MedioX:Double = (Best.X + Good.X)/2
    val MedioY:Double = (Best.Y + Good.Y)/2
    Punto2D(MedioX,MedioY,Rosembrock.Rosembrock)
  }
  def EncogimientoR (Best:Punto2D,Worse:Punto2D):Punto2D={
    val EncogimientoX= (Best.X + Worse.X)/2
    val EncogimientoY= (Best.Y + Worse.Y)/2
    Punto2D(EncogimientoX,EncogimientoY,Rosembrock.Rosembrock)
  }
   
   
   def MedioS (Best:Punto2D,Good:Punto2D) : Punto2D = {
    val MedioX:Double = (Best.X + Good.X)/2
    val MedioY:Double = (Best.Y + Good.Y)/2
    Punto2D(MedioX,MedioY,Rosembrock.Sphere)
  }
  
  def ReflejoS (Medio:Punto2D,Worse:Punto2D) :Punto2D={
   val ReflejoX = (2*Medio.X )- Worse.X
    val ReflejoY = (2*Medio.Y) - Worse.Y
    Punto2D(ReflejoX,ReflejoY,Rosembrock.Sphere)
  }
  
  def ExtencionS (Reflejo:Punto2D,Medio:Punto2D):Punto2D={
   val ExtencionX= (2*Reflejo.X) - Medio.X
    val ExtencionY= (2*Reflejo.Y) - Medio.Y
    Punto2D(ExtencionX,ExtencionY,Rosembrock.Sphere)
  }
  
  def ContraccionS (Worse:Punto2D,Medio:Punto2D):Punto2D={
    val ContraccionX= (Worse.X + Medio.X)/2
    val ContraccionY= (Worse.Y + Medio.Y)/2
    Punto2D(ContraccionX,ContraccionY,Rosembrock.Sphere)
  }
  
   def EncogimientoS (Best:Punto2D,Worse:Punto2D):Punto2D={
    val EncogimientoX= (Best.X + Worse.X)/2
    val EncogimientoY= (Best.Y + Worse.Y)/2
    Punto2D(EncogimientoX,EncogimientoY,Rosembrock.Sphere)
  }
   
   
    def MedioE (Best:Punto2D,Good:Punto2D) : Punto2D = {
    val MedioX:Double = (Best.X + Good.X)/2
    val MedioY:Double = (Best.Y + Good.Y)/2
    Punto2D(MedioX,MedioY,Rosembrock.Example)
  }
  
  def ReflejoE (Medio:Punto2D,Worse:Punto2D) :Punto2D={
    val ReflejoX = (2*Medio.X )- Worse.X
    val ReflejoY = (2*Medio.Y) - Worse.Y
    Punto2D(ReflejoX,ReflejoY,Rosembrock.Example)
  }
  
  def ExtencionE (Reflejo:Punto2D,Medio:Punto2D):Punto2D={
    val ExtencionX= (2*Reflejo.X) - Medio.X
    val ExtencionY= (2*Reflejo.Y) - Medio.Y
    Punto2D(ExtencionX,ExtencionY,Rosembrock.Example)
  }
  
  def ContraccionE (Worse:Punto2D,Medio:Punto2D):Punto2D={
    val ContraccionX= (Worse.X + Medio.X)/2
    val ContraccionY= (Worse.Y + Medio.Y)/2
    Punto2D(ContraccionX,ContraccionY,Rosembrock.Example)
  }
  
   def EncogimientoE (Best:Punto2D,Worse:Punto2D):Punto2D={
    val EncogimientoX= (Best.X + Worse.X)/2
    val EncogimientoY= (Best.Y + Worse.Y)/2
    Punto2D(EncogimientoX,EncogimientoY,Rosembrock.Example)
  }
}
