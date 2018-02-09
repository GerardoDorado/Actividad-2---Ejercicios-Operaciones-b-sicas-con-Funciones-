
object areaPerimetro {
  def main(args: Array[String]): Unit = {
    var opcion=0;
  
    do{
      println("Cual àrea y perimetro deseas càlcular: ")
      println("(1) - CIRCULO")
      println("(2) - TRIANGULO EQUILATERO")
      println("(3) - RECTANGULO")
      println("-----------------")
      println("(5) - SALIR")
      println("-----------------")
      opcion=readByte()
      
      opcion match {
        case 1 => obtenerPerimetroAreaCirculo()
        case 2 => obtenerPerimetroAreaTriangulo()
        case 3 => obtenerPerimetroAreaRectangulo()
        case 5 => println("Sale bye!!!")
        case _ => "NO SE ENCUENTRA ESTA OPCION"
      }
    }while(!opcion.equals(5))  
  }
  
  def obtenerPerimetroAreaCirculo(){
    println("Que deseas obtener... ¿(1)Area? o ¿(2)Perimetro?")
    val x = readByte()
    
    println("Ingresa el radio del circulo: ")
    val radio=readDouble()
    
    if(x==1){
      println("Area: "+math.Pi*(math.pow(radio, 2)))  
    }else if(x==2){
      println("Perimetro: "+2*math.Pi*radio)
    }else
      println("Opcion incorrecta")
  }
  
  def obtenerPerimetroAreaTriangulo(){
    println("Que deseas obtener... ¿(1)Area? o ¿(2)Perimetro?")
    val x = readByte()
    
    println("Ingresa la altura del triangulo: ")
    val a=readDouble()
    
    if(x==1){
      println("Area: "+(a*a)/2)
    }else if(x==2){
      println("Perimetro: "+3*a)
    }else
      println("Opcion incorrecta")
  }
  
  def obtenerPerimetroAreaRectangulo(){
    println("Que deseas obtener... ¿(1)Area? o ¿(2)Perimetro?")
    val x = readByte()
    
    println("Ingresa la base del rectangulo: ")
    val a=readDouble()
    
    println("Ingresa la altura del rectangulo: ")
    val b=readDouble()
    
    if(x==1){
      println("Area: "+a*b)
    }else if(x==2){
      println("Perimetro: "+2*(a+b))
    }else
      println("Opcion incorrecta")
  }
}