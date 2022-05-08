// might have to modify the default values

class DetermineBicepsWeightRange(args: Array<String>) {
    fun determine_biceps_high(max_curl: Int?): Int? {
        val biceps_high = if(max_curl != null && max_curl - 5 > 0) max_curl - 5 else 20
        return biceps_high
    }

    fun determine_biceps_medium(max_curl: Int?): Int? {
        val biceps_medium = if(max_curl != null && max_curl - 10 > 0) max_curl - 10 else 15
        return biceps_medium
    }

    fun determine_biceps_light(max_curl: Int?): Int? {
        val biceps_light = if(max_curl != null && max_curl - 15 > 0) max_curl - 15 else 10
        return biceps_light
    }
}