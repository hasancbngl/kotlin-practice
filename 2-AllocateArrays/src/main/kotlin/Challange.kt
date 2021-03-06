class Challange {
    /*
* Challenge:
* Using an array of the days of the week, practice your collections skills.
* 1. Change the value of an element by accessing them using an index.
* 2. Add one element, and remove one element, e.g. add another Friday, remove Monday! :]
* Note: Arrays cannot change their size. First convert to a MutableList. To convert, use `toMutableList()` on the Array.
* 3. Print the changed List to check that all the elements are there.
* 4. After removing an element, check if it's in the list, and print the result.
* */
    companion object{
        val daysOfTheWeek = arrayOf(
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        )
        fun changeDay() {
            println(daysOfTheWeek)
            daysOfTheWeek[2] = "a"
            println(daysOfTheWeek[2])

            val list = daysOfTheWeek.toMutableList()
            list.remove("Monday")
            list.add("friday")
            println(list)
            var isMondayInList = "Monday" in list
            println(isMondayInList)
        }
    }
}