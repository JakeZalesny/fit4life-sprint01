class DecideSplit {

    fun set_monday(args: Array<String>):String? {
        print("What muscle group do you want to work on Mondays? ")
        val mondayString = readLine()
        return mondayString
    }

    fun set_tuesday(args: Array<String>):String? {
        print("What muscle group do you want to work on Tuesdays? ")
        val tuesdayString = readLine()
        return tuesdayString
    }

    fun set_wednesday(args: Array<String>):String? {
        print("What muscle group do you want to work on Wednesdays? ")
        val wednesdayString = readLine()
        return wednesdayString
    }

    fun set_thursday(args: Array<String>):String? {
        print("What muscle group do you want to work on Thursdays? ")
        val thursdayString = readLine()
        return thursdayString
    }

    fun set_friday(args: Array<String>):String? {
        print("What muscle group do you want to work on Fridays? ")
        val fridayString = readLine()
        return fridayString
    }

    fun set_saturday(args: Array<String>):String? {
        print("What muscle group do you want to work on Saturdays? ")
        val saturdayString = readLine()
        return saturdayString
    }

    fun set_sunday(args: Array<String>):String? {
        print("What muscle group do you want to work on Sundays?")
        val saturdayString = readLine()
        return saturdayString

    }
    fun add_additional(args: Array<String>):String? {
        print("Would you like to add any workouts? ")
        var answer: String? = readLine()

        if (answer?.uppercase() == "NO") {
            return null
        }

        print("Which muscle group would you like to add")
        var additional_group: String? = readLine()
        return additional_group
    }
}