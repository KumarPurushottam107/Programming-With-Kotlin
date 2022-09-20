class Alien
{
    var name : String? = null 
}


fun main() 
{
    // null handling 
    
    /* Below Line will give error
       var str : String = null */ 
    
    
    // Correct form of above line
       var str : String? = null 
    
     println(str) // output = null
     
     
     /* Below Code will give error 
     println(str.length) */
     
     // correct form of above line 
     println(str?.length)
    
     var tittu = Alien() 
    
     println(tittu.name)
    
    
    /* below code will give error 
       var tittu = new Alien()
       println(tittu.name.length) */
       
    // correct form of above code 
       println(tittu.name?.length)
       
    /* below code will give error
       var kittu = Alien()
       kittu = null */
       
    // correct form of above line 
	   var kittu : Alien? = Alien()
       kittu = null 
    
    
    /* below code will give error
       println(kittu.name) */
    
    // corrct form of above line
       println(kittu?.name)
       
   var city : String = ""
    
    println("Length of the city is " + city.length)
       
       
       
       
    
    
}
