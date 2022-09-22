fun main() 
{
    
    /* 
     
     Named Parameter :-   It is very useful feature of Kotlin specially when you are writing long lines of code or 
     					  your required functions are in various other classes. 
                          Using Named Parameter you can call functions by passing values with associated parameter name . 
                          So that you can know which value is given to which parameter. 
    
   */
    
    
    // by providing the value of defualt porameter
    
    var  finalAmt : Int = calcAmount( amt = 400 , interest = 0.10)
	
    println("finalAmt is $finalAmt")
    
    finalAmt = calcAmount( interest = 0.10 , amt = 400  )
	    
    println("finalAmt is $finalAmt")

    
    
}
	
    
fun calcAmount( amt : Int , interest : Double = 0.05) : Int
{
    return( amt + amt*interest ).toInt()
}
    
