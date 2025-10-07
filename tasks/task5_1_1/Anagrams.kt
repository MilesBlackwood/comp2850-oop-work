// Task 5.1.1: anagram checking using a function
fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main(){
    
    
    print("Enter the first word:\n")
    val string_1 = readln()
    print("Enter the second word:\n")
    val string_2 = readln()
    val output = anagrams(string_1, string_2)
    print("$output\n")

}