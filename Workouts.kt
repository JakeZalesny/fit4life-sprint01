class Workouts() {
    val shoulders = mutableMapOf<Int, String>(
        1 to "Seated Dumbell Press",
        2 to "Arnolds",
        3 to "Standing Dumbell Flies",
        4 to "Face Pulls",
        5 to "EZ bar High Pull",
        6 to "Seated Barbell Press",
        7 to "Machine Shoulder Press",
        8 to "Bent Over Reverse Fly",
        9 to "Dumbell Incline Row",
        10 to "Barbell Overhead Press",
        11 to "Single Arm Front Cable Raise")

    val triceps = mutableMapOf<Int, String>(
        1 to "Close Grip Bench Press",
        2 to "Cable push down",
        3 to "Dips",
        4 to "Dumbell Skull-Crushers",
        5 to "EZ bar Skull-Crushers",
        6 to "JM Press",
        7 to "Dumbell Bench Press",
        8 to "Tricep Kickback",
        9 to "Overhead Cable Extension",
        10 to "Standing Dumbell Extension",
        11 to "EZ Bar Reverse Grip Bench Press",
    )

    val biceps = mutableMapOf<Int, String>(
        1 to "Standing Curls",
        2 to "Jailhouse Curls/Concentration Curls",
        3 to "Preacher Curls",
        4 to "Seated Wide Grip Curls",
        5 to "Close-Grip Underhand Pull-Ups",
        6 to "Hammer Curls",
        7 to "Static Hold Curls",
        8 to "Incline Dumbell Curl",
        9 to "Reverse Grip Bent-Over Row",
        10 to "Barbell Curl",
        11 to "Facing-Away Cable Curl"

    )

    val back = mutableMapOf<Int, String>(
        1 to "Deadlift",
        2 to "Overhand Pull-Up",
        3 to "Bent-Over Barbell Row",
        4 to "Landmine Row",
        5 to "Single-Arm Row",
        6 to "Lat Pulldown (Wide Grip)",
        7 to "Seated Cable Row (Close Grip)",
        8 to "Cable/Dumbell Shrug",
        9 to "Seated Cable Row (Wide Grip)",
        10 to "Lat Pulldown (Close Grip)",
        11 to "Chest Supported Row"
    )

        val chest = mutableMapOf<Int, String>(
            1 to "Bench Press",
            2 to "Lower Incline Flies",
            3 to "Incline Dumbell Press",
            4 to "Incline Barbell Press",
            5 to "Fly Machine",
            6 to "Chest-Dips",
            7 to "Cross-Over Flies",
            8 to "Elbows In Incline Push-Ups",
            9 to "Cable Crossover",
            10 to "Incline Flies",
            11 to "Decline Dumbell Press"

    )
        val legs = mutableMapOf<Int, String>(
            1 to "Squats",
            2 to "Box Squats",
            3 to "Decline Squats",
            4 to "Leg-Press Machine",
            5 to "Saturday Nigh Rides/Hip Thrusters",
            6 to "Donkey Squat Machine",
            7 to "Bulgarian Squats",
            8 to "Front Squat",
            9 to "Weighted Lunges",
            10 to "Goblet Squat",
            11 to "Leg Curl Machine",
        )

        val abs = mutableMapOf<Int, String>(
            1 to "Crunches",
            2 to "Star Crunches",
            3 to "Knees up Toe Touches",
            4 to "Toe Touch V-Ups",
            5 to "Crunch Machine",
            6 to "Hanging Knee to Chests",
            7 to "Crucifix Crunches/Bear-Hugs",
            8 to "Triangle Leg Raises",
            9 to "Medicine Ball Russian Twist",
            10 to "Beast Slams"
        )
    fun get_shoulders():MutableMap<Int, String> {
        return shoulders
    }

    fun get_triceps():MutableMap<Int, String> {
        return triceps
    }

    fun get_biceps():MutableMap<Int, String> {
        return biceps
    }

    fun get_back():MutableMap<Int, String> {
        return back
    }

    fun get_chest():MutableMap<Int, String> {
        return chest
    }

    fun get_legs():MutableMap<Int, String> {
        return legs


    }

    fun get_abs():MutableMap<Int, String>{
        return abs
    }

    fun add_workout(group: String, workout: String ){
        var counter: Int = 11
        // if (group.uppercase() == "SHOULDERS") {
            //shoulders.put(counter, workout)
        when (group.uppercase()) {
            "SHOULDERS" -> shoulders[counter] = workout
            "TRICEPS" -> triceps[counter] = workout
            "BICEPS" -> biceps[counter] = workout
            "BACK" -> back[counter] = workout
            "LEGS" -> legs[counter] = workout
        }
        counter++
    }
    fun delete_workout(){

    }


}


