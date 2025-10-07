fun isValid(word: String): Boolean{

    if (word.length != 5){
        return false
    }
    else{
        for (char in word){
            if(!char.isLetter()){
                return false
            }
            else{
                Pass
            }

        }
    }
    return true
}

fun readWordList(filename: String): MutableList<String>{

}

fun pickRandomWord(words: MutableList<String>): String{

}

fun obtainGuess(attempt: Int): String{

}

fun evaluateGuess(guess: String, target:String): List<Int>{

}

fun displayGuess(guess: String, matches: List<Int>): List<Int>{

}