package exercises.Activity04.A

open class LibraryItemList() {

    var item = mutableListOf<String>(
        "Bible\n", "Guinness Book of World Records\n", "Nature\n", "Space\n",
        "Britannica Encyclopedia\n",
        "National Geographic Magazine\n",
        "Harvard Business Review\n",
        "Fortune 500 Magazine\n",
        "Wired Magazine\n",
        "People Magazine"
    )

    init {
        println("Hello! This is from the LibraryItemList class.")
    }

}