

object indiceMasaCorporal {
  def main(args: Array[String]): Unit = {
    
    println("Ingresa tu peso en (KG): ")
    val p=readDouble()
    
    println("Ingresa tu estatura en (Centimetros): ")
    val c =readDouble()
    
    val ms=(p/( (c/100) * 2))
    
    print("Actualmente su estado de saludo es: ")
    
    if(ms<16){
      println("Criterio de ingreso al hospital ")
    }else if(ms>=16&&ms<17){
      println("Infrapeso")
    }else if(ms>17&&ms<18){
      println("Bajo peso")
    }else if(ms>=18&&ms<25){
      println("Peso normal (saludable)"+ms)
    }else if(ms>=25&&ms<30){
      println("sobrepeso (obesidad de grado I)")
    }else if(ms>=30&&ms<35){
      println("sobrepeso crónico (obesidad de grado II)")
    }else if(ms>=35&&ms<40){
      println("obesidad premórbida (obesidad de grado III)")
    }else if(ms>=40){
      println("obesidad mórbida (obesidad de grado IV)")
    }
  }
}