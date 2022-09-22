fun main() {
    
   // when as an expression
   
   var name : String  = "Amri" 
    
    var quality = when(name)
    {
        "Amri" -> "Dedication and Smartness"
        
        "Avinash" -> "Symbol of Power"
        
        "Ashutosh" -> "Sharp and Humorous"
        
        else -> "Invalid Name"
        
    }
    
   println(quality)  // Output will be Dedication and Smartness
     
   
}
