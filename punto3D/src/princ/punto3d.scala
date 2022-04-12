package princ

case class punto3d(X:Double,Y:Double,Z:Double) {
  def+(ext:punto3d):punto3d ={
    val nuevox = this.X + ext.X
    val nuevoy = this.Y + ext.Y
    val nuevoz = this.Z + ext.Z
    
    return new punto3d(nuevox, nuevoy, nuevoz)
  }
  
  def-(ext:punto3d):punto3d ={
    val nuevox = this.X - ext.X
    val nuevoy = this.Y - ext.Y
    val nuevoz = this.Z - ext.Z
    
    return new punto3d(nuevox, nuevoy, nuevoz)
  }
  
  def*(ext:Double):punto3d ={ 
    val nuevox = this.X * ext
    val nuevoy = this.Y * ext
    val nuevoz = this.Z * ext
    
    return new punto3d(nuevox, nuevoy, nuevox)
  }
}