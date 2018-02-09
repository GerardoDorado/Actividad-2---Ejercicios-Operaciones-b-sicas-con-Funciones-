

object añoBisiesto {
  def main(args: Array[String]): Unit = {
    println("Ingrese el año: ")
    val año=readInt()
    
    if(año%400==0){
      println("Año bisiesto")
    }
    if( ((año%4)==0) && !((año%100)==0) ){
      println("Año bisiesto")
    }else{
      println("Este año no es bisiesto")
    }
  }
}