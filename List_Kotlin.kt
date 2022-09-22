fun main() 
{
    
    // List container in Kotlin 
    
    /*
     	List container is a collection of items with a specific order. 
        
        There are two types of List :- 
        a) Read Only List - List ( Keyword )
        b) Mutable List - MutableList ( Keyword )
        
        When using List or MutableList we must specify the type it can contain
        for ex List<Int>, MutableList<String>, List<Car> here Car is a class. 
        
        
        
   */
    
    // Read Only List
    var name = listOf("Amri","Avinash","Abishek","Sumit","Ashutosh","Ujjwal")
    
    // Mutable List
    var nums = mutableListOf(4, 0, 3, 9) 
    
    // Mutable List
    var prime = mutableListOf<Int>()  
    prime.add(2)  
    prime.add(3)  
    prime.add(5)  
    
  
    
    for(i in name)
    {
        print(" $i ")
        
    }
    
    println()

    
    for(i in nums)
    {
        print(" $i ")
        
        
    }
    
    println()
    
    for(i in prime)
    {
        print(" $i ")
        
        
    }
    
    println()
    
    
    // Testing mutability of Read Only List
    
    // name[2] = "Raman" // This is giving error
    
    
    
    // Testing mutability of Mutable List
    
    println("nums after change the value at index 2 ")
    
    nums[2] = 1000 
    
    for(i in nums)
    {
        print(" $i ")
        
        
    }
    
    println()
    
    
    
    
    println()
    
    
    
    
}
