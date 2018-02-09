

object prestamosBanco {
  def main(args: Array[String]): Unit = {
    var puntos=0
    
    println("Ingrese su nombre: ")
    val nombre=readLine()
    
    println("Historia credicticia: \n(b)Buena\n(m)Mala")
    val hc=readLine()
    
    println("Ingrese la cantidad del pedido: ")
    val pedido = readDouble()
    
    println("Ingrese su salario anual: ")
    val salarioAnual=readDouble()
    
    println("Valor de sus propiedades: ")
    val valorPropiedades=readDouble()
    
    if(salarioAnual >= ((50*pedido)/100) ){
      puntos+=puntos+5
      print("s")
    }
    
    if( (salarioAnual >= ((25*pedido)/100)) && (salarioAnual < ((50*pedido)/100) )){
      puntos+=puntos+3
      print("d")
    }
    
    if((salarioAnual >= ((10*pedido)/100)) && (salarioAnual < ((25*pedido)/100) )){
      puntos+=puntos+1
      print("f")
    }
    
    if(valorPropiedades>(pedido*2)){
      puntos+=puntos+5
      print("g")
    }
    
    if(valorPropiedades<(pedido*2)&&valorPropiedades>=pedido){
      puntos+=puntos+3
    }
    
    if(hc.equals("b")){
      if(puntos>6){
        println("Felicidades señor(a):"+nombre+" el banco le ah aprobado el prestamo!!!")
      }else{
        println("Lo sentimos señor(a):"+nombre+" el banco no puede otorgarle el prestamo!!!")
      }
    }else{
      println("Lo sentimos señor(a):"+nombre+" el banco no puede otorgarle el prestamo!!!")
    }
    
    println("Puntos: "+puntos)
  }
}