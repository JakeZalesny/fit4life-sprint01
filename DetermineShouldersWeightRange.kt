class DetermineShouldersWeightRange(args: Array<String>) {
    fun determine_shoulders_high(max_shoulder: Int?): Int? {
        val shoulders_high = if(max_shoulder != null && max_shoulder - 5 > 0) max_shoulder - 5 else 20
        return shoulders_high
    }

    fun determine_shoulders_medium(max_shoulder: Int?): Int? {
        val shoulders_medium = if(max_shoulder != null && max_shoulder - 10 > 0) max_shoulder - 10 else 15
        return shoulders_medium
    }

    fun determine_shoulders_light(max_shoulder: Int?): Int? {
        val shoulders_light = if(max_shoulder != null && max_shoulder - 15 > 0) max_shoulder - 15 else 10
        return shoulders_light
    }
}