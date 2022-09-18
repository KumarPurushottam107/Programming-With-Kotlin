fun main() 
{
 	
    var name1 : String = ""
    var name2 : String = ""
    
    name1 = "Ram"
    name2 = "Ram"
    
    if(name1 == name2) println("same") else  println("not same") // same
    
    if(name1.equals(name2)) println("same") else  println("not same") // same

 	name1 = "Ram"
    name2 = "RaM"
    
    if(name1 == name2) println("same") else  println("not same") // not same
    
    if(name1.equals(name2)) println("same") else  println("not same") // not same

    if(name1.equals(name2,true)) println("same") else  println("not same") // same   ( Note true is the parameter for ignore case )
    
    
  }
