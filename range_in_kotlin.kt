fun main() {
    
   // Range is a class in Kotlin. We can use its predefined functions
   
    var nums = 1 .. 5 // nums is in range 1 to 5
    
    for(a in nums)
    {
        print(" $a ")
    }
    
    println()
    
    nums = 1 .. 12 // nums is in range 1 to 12 
    
   for(a in nums step 3)
    {
        print(" $a ")
    }
    
        println()

    
    var nums1 = 6 downTo 1 // nums in in range 16 to 1 i.e in descreasing order
    
   for(a in nums1 )
   {
		print(" $a ")   
   }
   
       println()

   
	// To print nums1 in reverse order   
   
    for(a in nums1.reversed() )
   {	
		print(" $a ")   
   }
   
       println()

   
   println("Total size of nums " + nums1.count()) // It will give total element in range object
   
   
  var chars = 'F' .. 'O'
    
  
  for(a in chars )
  {
   		print(" $a ")     
  }
  
  
      println()

	// To print chars in reverse order
    
    for(a in chars.reversed() )
   {	
		print(" $a ")   
   }
   
       println()
   
}

/*

OUTPUT 

 1  2  3  4  5 
 1  4  7  10 
 6  5  4  3  2  1 
 1  2  3  4  5  6 
Total size of nums 6
 F  G  H  I  J  K  L  M  N  O 
 O  N  M  L  K  J  I  H  G  F 
 
 */



