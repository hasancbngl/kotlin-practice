class Methods {
    companion object {
        val months = arrayOf(
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        )

        class SimpleDate(var month: String) {
            fun monthsUntilJingleBells(): Int {
                return months.indexOf("December") - months.indexOf(month)
            }
        }

        fun main() {
            val date = SimpleDate("July")
            println(date.monthsUntilJingleBells())
        }
    }
}