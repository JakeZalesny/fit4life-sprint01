class DetermineLegsWeightRange(args: Array<String>) {
    fun determine_squat_high(max_squat: Int?): Int? {
        val squat_high: Int? = if(max_squat != null && max_squat - 90 > 0) max_squat - 90 else 135
        return squat_high
    }

    fun determine_squat_medium(max_squat: Int?): Int? {
        val squat_medium: Int? = if(max_squat != null && max_squat - 110 > 0) max_squat - 110 else 110
        return squat_medium
    }

    fun determine_squat_light(max_squat: Int?): Int? {
        val squat_light: Int? = if(max_squat != null && max_squat - 130 > 0) max_squat - 130 else 90
        return squat_light
    }

    fun determine_normal_high(max_squat: Int?): Int? {
        val normal_high: Int? = if(max_squat != null && max_squat - 145 > 0) max_squat - 145 else 100
        return normal_high
    }

    fun determine_normal_medium(max_squat: Int?): Int? {
        val normal_medium: Int? = if(max_squat != null && max_squat - 165 > 0) max_squat - 165 else 80
        return normal_medium
    }

    fun determine_normal_light(max_squat: Int?): Int? {
        val normal_light: Int? = if(max_squat != null && max_squat - 185 > 0) max_squat - 185 else 60
        return normal_light
    }
}