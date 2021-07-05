package anagram_kt

class Anagram {
    private val anagrams: MutableMap<String, MutableList<String>> = mutableMapOf<String, MutableList<String>>()
    
  
    constructor(words: List<String>?){
        if(words == null){
            throw IllegalArgumentException("String is null")
        }
        if(words.size == 0){
            throw IllegalArgumentException("List is empty")
        }
               retrieveAnagrams(words);
    }

    constructor(fileName: String?){
        if(fileName == null){
            throw IllegalArgumentException("String is null")
        }

    }

    fun toList():List<List<String>>{
        var list: MutableList<List<String>> = mutableListOf<List<String>>()
         anagrams.forEach{ _, setOfAnagrams ->
            if(setOfAnagrams.size > 1){
                list.add(setOfAnagrams)
                
            }
        }  
        return list //la pampara 
         
    }

    private fun retrieveAnagrams(words: List<String>){
        for(i in 0..words.size-1){
            var word_sorted: String = words[i].split("").sorted().joinToString("")
            var setOfAnagrams: MutableList<String>? = anagrams[word_sorted];
            if(setOfAnagrams != null){
                setOfAnagrams.add(words[i])
            }
            else{
                anagrams.set(word_sorted, mutableListOf<String>(words[i]))
            }
        }
    } 

}