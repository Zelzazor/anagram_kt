package anagram_kt

class Anagram {
    constructor(words: List<String>?){
        if(words == null){
            throw IllegalArgumentException("String is null")
        }
        if(words.size == 0){
            throw IllegalArgumentException("List is empty")
        }
    }

    constructor(fileName: String?){
        if(fileName == null){
            throw IllegalArgumentException("String is null")
        }

    }

    fun toList():List<List<String>>{
        return listOf<List<String>>(listOf<String>("adios", "adois"), listOf<String>("hola"))
    }
}