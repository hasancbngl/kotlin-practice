class Challenge {
    /* Challenge 1:
    Check out the Wizard class below and run the project.
    Right now, `fullName` doesn't change when you update a wizard's first or last name.
    Change the Wizard's fullName to a read-only computed property to fix that!
    **Bonus Challenge**
    Add a custom setter that will split a full name into a first and last name.
    Only set firstName and lastName if the value contains exactly two names separated by a space
    Hint: Use `.split(" ")` to split the value passed in into a list of strings

    Challenge 2:
    Add a "commonMagicalIngredients" list as a companion object property on Wizard.
    Fill it with any magical ingredients you like!*/

    class Wizard(var firstName: String, var lastName: String) {
        var fullName: String
            get() = "$firstName $lastName"
            set(newFullName) {
                val names = newFullName.split(" ")
                if (names.size != 2) {
                    println("$newFullName is not a proper full name for a Wizard.")
                } else {
                    firstName = names.first()
                    lastName = names.last()
                }
            }

        companion object {
            var commonMagicalIngredients = mutableListOf<String>(
                "Eye of Haystack Needle",
                "The Force",
                "Wow-Wow Sauce!"
            )
        }
    }

    companion object {
        fun main() {
            val wizard = Wizard("Hermione", "Sidious")
            println(wizard.fullName)

            wizard.lastName = "Skywalker"
            println(wizard.fullName)

            wizard.fullName = "Jack walker"
            wizard.fullName = "ThePunisher"
            wizard.fullName = "On The Road"
            println("First name: ${wizard.firstName} LastName: ${wizard.lastName} Magical ingredients: ${Wizard.commonMagicalIngredients}")

            Wizard.commonMagicalIngredients.add("Meow of Cat")
            println(Wizard.commonMagicalIngredients)
        }
    }
}