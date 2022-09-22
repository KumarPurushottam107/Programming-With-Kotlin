fun main() 
{
    
    /* 
     
     Default Parameter :-   It is very useful feature of Kotlin. We can provide a default value for a Parameter
     						such parameter is known as Default Parameter.
    						If during the function call we don't provide the value for default parameter than its 
                            default value will be applied. Else the value we provide will be applied.
    
   */
    
    
    // by providing the value of defualt porameter
    
    var  finalAmt : Int = calcAmount( 400 , 0.04)
	
    println("finalAmt is $finalAmt")
    
    finalAmt = calcAmount( 300 )
	    
    println("finalAmt is $finalAmt")

    
    
}
	
    
fun calcAmount( amt : Int , interest : Double = 0.05) : Int
{
    return( amt + amt*interest ).toInt()
}
    
