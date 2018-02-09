
object Calificaciones {
  def main(args: Array[String]): Unit = {
    var counter=1
    var xy=0
    
    while (counter<=5) {
      println("Ingresa la calificacion: ")
      var x=readInt()
      xy += x
      counter+=1
    }
    
    val y=xy/5
    println("promedio: "+y)
    if(y>=90 && y<100){
      print("Excelente")
    }
    else if(y>=80 && y<89){
      print("Bien")
    }
    else if(y>=70 && y<79){
      print("Regular")
    }
    else if(y<=69){
      print("Terrible")
    }
  }
}