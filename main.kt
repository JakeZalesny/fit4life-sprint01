import Workouts
import Day
import DecideSplit

class Director {
    fun direct(args: Array<String>) {
        val bench_press_max = AddMaxes().get_bench_max(args)
        val squat_max = AddMaxes().get_max_squat(args)
        val deadlift_max = AddMaxes().get_max_deadlift(args)
        val curl_max = AddMaxes().get_max_curl(args)
        val close_grip_bench_max = AddMaxes().get_max_closegrip_bench(args)
        val max_shoulder_press = AddMaxes().get_max_shoulder_press(args)

        var deadlift_high = DetermineBackWeightRange(args).determine_deadlift_weight_high(deadlift_max)
        var deadlift_medium = DetermineBackWeightRange(args).determine_deadlift_weight_medium(deadlift_max)
        var deadlift_light = DetermineBackWeightRange(args).determine_deadlift_weight_light(deadlift_max)
        var normal_back_heavy = DetermineBackWeightRange(args).determine_normal_weight_high(deadlift_max)
        var normal_back_medium = DetermineBackWeightRange(args).determine_normal_weight_medium(deadlift_max)
        var normal_back_light = DetermineBackWeightRange(args).determine_normal_weight_light(deadlift_max)

        var bench_high = DetermineChestWeightRange(args).determine_bench_high(bench_press_max)
        var bench_medium = DetermineChestWeightRange(args).determine_bench_medium(bench_press_max)
        var bench_light = DetermineChestWeightRange(args).determine_bench_light(bench_press_max)
        var normal_chest_heavy = DetermineChestWeightRange(args).determine_normal_heavy(bench_press_max)
        var normal_chest_medium = DetermineChestWeightRange(args).determine_normal_medium(bench_press_max)
        var normal_chest_light = DetermineChestWeightRange(args).determine_normal_light(bench_press_max)

        var squat_high = DetermineLegsWeightRange(args).determine_squat_high(squat_max)
        var squat_medium = DetermineLegsWeightRange(args).determine_squat_medium(squat_max)
        var squat_light = DetermineLegsWeightRange(args).determine_squat_light(squat_max)
        var normal_legs_heavy = DetermineLegsWeightRange(args).determine_normal_high(squat_max)
        var normal_legs_medium = DetermineLegsWeightRange(args).determine_normal_medium(squat_max)
        var normal_legs_light = DetermineLegsWeightRange(args).determine_normal_light(squat_max)

        var biceps_high = DetermineBicepsWeightRange(args).determine_biceps_high(curl_max)
        var biceps_medium = DetermineBicepsWeightRange(args).determine_biceps_medium(curl_max)
        var biceps_light = DetermineBicepsWeightRange(args).determine_biceps_light(curl_max)

        var triceps_high = DetermineTricepWeightRange(args).determine_tricep_high(close_grip_bench_max)
        var triceps_medium = DetermineTricepWeightRange(args).determine_tricep_medium(close_grip_bench_max)
        var triceps_light = DetermineTricepWeightRange(args).determine_tricep_light(close_grip_bench_max)

        var shoulders_high = DetermineShouldersWeightRange(args).determine_shoulders_high(max_shoulder_press)
        var shoulders_medium = DetermineShouldersWeightRange(args).determine_shoulders_medium(max_shoulder_press)
        var shoulders_light = DetermineShouldersWeightRange(args).determine_shoulders_light(max_shoulder_press)

        val monday_split = DecideSplit().set_monday(args)
        val tuesday_split = DecideSplit().set_tuesday(args)
        val wednesday_split = DecideSplit().set_wednesday(args)
        val thursday_split = DecideSplit().set_thursday(args)
        val friday_split = DecideSplit().set_friday(args)
        val saturday_split = DecideSplit().set_saturday(args)
        val sunday_split = DecideSplit().set_sunday(args)

        val monday = Day(monday_split)
        val tuesday = Day(tuesday_split)
        val wednesday = Day(wednesday_split)
        val thursday = Day(thursday_split)
        val friday = Day(friday_split)
        val saturday = Day(saturday_split)
        val sunday = Day(sunday_split)

        val monday_group = monday.determine_muscle_group(monday_split)
        val monday_muscle_high = when (monday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val monday_muscle_medium = when (monday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val monday_muscle_light = when (monday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }
        println(monday_split?.uppercase() + ": ")
        monday.determine_high_weight_sets(monday_group, monday_muscle_high)
        monday.determine_medium_weight_sets(monday_group, monday_muscle_medium)
        monday.determine_low_weight_sets(monday_group, monday_muscle_light)

        val tuesday_group = tuesday.determine_muscle_group(monday_split)
        val tuesday_muscle_high = when (tuesday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val tuesday_muscle_medium = when (tuesday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val tuesday_muscle_light = when (tuesday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }

        println(tuesday_split?.uppercase() + ": ")
        tuesday.determine_high_weight_sets(tuesday_group, tuesday_muscle_high)
        tuesday.determine_medium_weight_sets(tuesday_group, tuesday_muscle_medium)
        tuesday.determine_low_weight_sets(tuesday_group, tuesday_muscle_light)

        val wednesday_group = wednesday.determine_muscle_group(monday_split)
        val wednesday_muscle_high = when (wednesday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val wednesday_muscle_medium = when (wednesday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val wednesday_muscle_light = when (wednesday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }

        println(wednesday_split?.uppercase() + ": ")
        wednesday.determine_high_weight_sets(wednesday_group, wednesday_muscle_high)
        wednesday.determine_medium_weight_sets(wednesday_group, wednesday_muscle_medium)
        wednesday.determine_low_weight_sets(wednesday_group, wednesday_muscle_light)

        val thursday_group = thursday.determine_muscle_group(monday_split)
        val thursday_muscle_high = when (thursday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val thursday_muscle_medium = when (thursday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val thursday_muscle_light = when (thursday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }

        println(thursday_split?.uppercase() + ": ")
        thursday.determine_high_weight_sets(thursday_group, thursday_muscle_high)
        thursday.determine_medium_weight_sets(thursday_group, thursday_muscle_medium)
        thursday.determine_low_weight_sets(thursday_group, thursday_muscle_light)

        val friday_group = friday.determine_muscle_group(monday_split)
        val friday_muscle_high = when (friday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val friday_muscle_medium = when (friday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val friday_muscle_light = when (friday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }

        println(friday_split?.uppercase() + ": ")
        friday.determine_high_weight_sets(friday_group, friday_muscle_high)
        friday.determine_medium_weight_sets(friday_group, friday_muscle_medium)
        friday.determine_low_weight_sets(friday_group, friday_muscle_light)

        val saturday_group = saturday.determine_muscle_group(saturday_split)
        val saturday_muscle_high = when (saturday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val saturday_muscle_medium = when (saturday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val saturday_muscle_light = when (saturday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }

        println(saturday_split?.uppercase())
        saturday.determine_high_weight_sets(saturday_group, saturday_muscle_high)
        saturday.determine_medium_weight_sets(saturday_group, saturday_muscle_medium)
        saturday.determine_low_weight_sets(saturday_group, saturday_muscle_light)

        val sunday_group = sunday.determine_muscle_group(sunday_split)
        val sunday_muscle_high = when (sunday_split) {
            "CHEST" -> normal_chest_heavy
            "LEGS" -> normal_legs_heavy
            "BICEPS" -> biceps_high
            "TRICEPS" -> triceps_high
            "BICEPS" -> biceps_high
            "SHOULDERS" -> shoulders_high
            "BACK" -> normal_back_heavy
            else -> normal_back_heavy
        }

        val sunday_muscle_medium = when (sunday_split) {
            "CHEST" -> normal_chest_medium
            "LEGS" -> normal_legs_medium
            "BICEPS" -> biceps_medium
            "TRICEPS" -> triceps_medium
            "BICEPS" -> biceps_medium
            "SHOULDERS" -> shoulders_medium
            "BACK" -> normal_back_medium
            else -> normal_back_medium
        }

        val sunday_muscle_light = when (sunday_split) {
            "CHEST" -> normal_chest_light
            "LEGS" -> normal_legs_light
            "BICEPS" -> biceps_light
            "TRICEPS" -> triceps_light
            "BICEPS" -> biceps_light
            "SHOULDERS" -> shoulders_light
            "BACK" -> normal_back_light
            else -> normal_back_light
        }

        println(sunday_split?.uppercase() + ": ")
        sunday.determine_high_weight_sets(sunday_group, sunday_muscle_high)
        sunday.determine_medium_weight_sets(sunday_group, sunday_muscle_medium)
        sunday.determine_low_weight_sets(sunday_group, sunday_muscle_light)
    }
}

fun main(args: Array<String>){
    val director = Director()
    director.direct(args)

}
