import java.util.*

fun main() 
{
    
    // Map in Kotlin can be used from Map in Java
    
    var countryCapital = TreeMap<String,String>()
    
    countryCapital["India"] = "New Delhi"
    countryCapital["Japan"] = "Tokyo"
	  countryCapital["Germany"] = "Berlin"
    countryCapital["Argentina"] = "Buenos Aires"
    
    for((country, capital) in countryCapital)
    {
        println("$country : $capital")
    }


}
