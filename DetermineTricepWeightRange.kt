class DetermineTricepWeightRange(args: Array<String>) {
    fun determine_tricep_high(max_closegrip_bench: Int?): Int? {
        val tricep_high = if(max_closegrip_bench != null && max_closegrip_bench - 20 > 0) max_closegrip_bench - 20
        else 100
        return tricep_high
    }
    fun determine_tricep_medium(max_closegrip_bench: Int?): Int? {
        val tricep_medium = if (max_closegrip_bench != null && max_closegrip_bench - 40 > 0) max_closegrip_bench - 40
        else 80
        return tricep_medium
    }
    fun determine_tricep_light(max_closegrip_bench: Int?): Int? {
        val tricep_light = if (max_closegrip_bench != null && max_closegrip_bench - 60 > 0) max_closegrip_bench - 60
        else 60
        return tricep_light
    }
}