class DetermineBackWeightRange(args: Array<String>) {

    fun determine_deadlift_weight_high(max_deadlift: Int? ): Int? {
        val deadlift_high: Int? = if(max_deadlift != null) max_deadlift - 20 else -1
        return deadlift_high
    }

    fun determine_deadlift_weight_medium(max_deadlift: Int?): Int? {
        val deadlift_medium: Int? = if(max_deadlift != null) max_deadlift - 40 else 135
        return deadlift_medium
    }

    fun determine_deadlift_weight_light(max_deadlift: Int?): Int? {
        val deadlift_light: Int? = if(max_deadlift != null) max_deadlift - 60 else -1
        return deadlift_light
    }

    fun determine_normal_weight_high(max_deadlift: Int?): Int? {
        val normal_high: Int? = if(max_deadlift != null && max_deadlift - 255 > 0) max_deadlift - 255 else 50
        return normal_high
    }

    fun determine_normal_weight_medium(max_deadlift: Int?): Int? {
        val normal_medium: Int? = if(max_deadlift != null && max_deadlift - 275 > 0) max_deadlift - 275 else 35
        return normal_medium
    }

    fun determine_normal_weight_light(max_deadlift: Int?): Int? {
        val normal_light: Int? = if(max_deadlift != null && max_deadlift - 295 > 0) max_deadlift - 295 else 25
        return normal_light
    }
}