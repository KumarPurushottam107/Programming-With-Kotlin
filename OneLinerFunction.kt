fun main() 
{
	
    // Functional Expression 
    
    var sum1 = add(4,5)
    
    println("Sum1 is $sum1")
    
   var sum2 = oneLineSum(8,11)
    
   println("Sum2 is $sum2")
     
   var sum3 = oneLineMax(5,6) 
   
   println("Max is $sum3")
   
    
}


fun add(a : Int, b : Int) : Int
{
    return(a+b)
}

// One Liner Function

fun oneLineSum( a : Int , b : Int) = a+b

fun oneLineMax( a: Int , b : Int ) = if(a>b) a else b 

