

object a�oBisiesto {
  def main(args: Array[String]): Unit = {
    println("Ingrese el a�o: ")
    val a�o=readInt()
    
    if(a�o%400==0){
      println("A�o bisiesto")
    }
    if( ((a�o%4)==0) && !((a�o%100)==0) ){
      println("A�o bisiesto")
    }else{
      println("Este a�o no es bisiesto")
    }
  }
}