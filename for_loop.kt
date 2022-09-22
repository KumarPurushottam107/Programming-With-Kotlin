fun main() 
{
    
    /*
      
      for loop in Kotlin iterates through anything that provides iterator.
      
      there is no tredition for loop in kotlin ulike java and other languages. 
      
      for loop in kotlin is used to iterate through ranges, arrays, maps and so on. ( Anything that provides an iterator )
      
	
    */
    
    for( i in 1..5)
    {
        print(" $i ")
    }
    
    println()
    
    var languages = arrayOf("Rubby","Kotlin","Python","Java")
    
    for( item in languages)
    {
        print(" $item ")
    }
    
    println() 
    
    var text = "Kotlin"
    
    for(letter in text)
    {
        print(" $letter ")
    }
    
    
}

/*

OUTPUT
 1  2  3  4  5 
 Rubby  Kotlin  Python  Java 
 K  o  t  l  i  n 


*/

