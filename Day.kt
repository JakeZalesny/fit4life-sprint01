import kotlin.random.Random
abstract class Random

class Day(val group: String?) {
    fun determine_muscle_group(group: String?): MutableMap<Int, String>{
        val muscle_group: MutableMap<Int, String> = when(group?.uppercase()){
            "SHOULDERS" -> Workouts().shoulders
            "CHEST" -> Workouts().chest
            "ABS" -> Workouts().abs
            "TRICEPS" -> Workouts().triceps
            "BACK" -> Workouts().back
            "LEGS" -> Workouts().legs
            else -> Workouts().shoulders
        }
        return muscle_group
    }

    fun rand(start: Int, end: Int): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }


    fun determine_high_weight_sets(muscle_group: MutableMap<Int, String>, muscle_high: Int?) {
        val first_random_value: Int = rand(1, 10)
        var second_random_value: Int = rand(1, 10)
        while(second_random_value == first_random_value)
            second_random_value = rand(1, 10)

        var third_random_value: Int = rand(1, 10)
        while(third_random_value == second_random_value || third_random_value == first_random_value)
            third_random_value = rand(1, 10)

        println(" ")
        println("1. " + muscle_group[first_random_value] + " 4 x 4 on " + muscle_high + " lbs")
        println("2. " + muscle_group[second_random_value] + " 4 x 4 on " + muscle_high + " lbs")
        println("3. " + muscle_group[third_random_value] + " 4 x 4 on " + muscle_high + " lbs")
        return

    }

    fun determine_medium_weight_sets(muscle_group: MutableMap<Int, String>, muscle_medium: Int?){
        val first_random_value: Int = rand(1, 10)
        var second_random_value: Int = rand(1, 10)
        while(second_random_value == first_random_value)
            second_random_value = rand(1, 10)

        var third_random_value: Int = rand(1, 10)
        while(third_random_value == second_random_value || third_random_value == first_random_value)
            third_random_value = rand(1, 10)

        println("4. " + muscle_group[first_random_value] + " 4 x 7 on " + muscle_medium + " lbs")
        println("5. " + muscle_group[second_random_value] + " 4 x 7 on " + muscle_medium + " lbs")
        println("6. " + muscle_group[third_random_value] + " 4 x 7 on " + muscle_medium + " lbs")
        return
    }

    fun determine_low_weight_sets(muscle_group: MutableMap<Int, String>, muscle_light: Int?){
        val first_random_value: Int = rand(1, 10)
        var second_random_value: Int = rand(1, 10)
        while(second_random_value == first_random_value)
            second_random_value = rand(1, 10)

        var third_random_value: Int = rand(1, 10)
        while(third_random_value == second_random_value || third_random_value == first_random_value)
            third_random_value = rand(1, 10)

        println("7. " + muscle_group[first_random_value] + " 4 x 10 on " + muscle_light + " lbs")
        println("8. " + muscle_group[second_random_value] + " 4 x 10 on " + muscle_light + " lbs")
        println("9. " + muscle_group[third_random_value] + " 4 x 10 on " + muscle_light + " lbs")
        println("")
        return
    }
}