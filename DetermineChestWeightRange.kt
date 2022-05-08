class DetermineChestWeightRange(args: Array<String>) {
    fun determine_bench_high(max_bench_press: Int?): Int? {
        val bench_high: Int? = if(max_bench_press != null && max_bench_press - 45 > 0) max_bench_press - 45 else 115
        return bench_high
    }

    fun determine_bench_medium(max_bench_press: Int?): Int? {
        val bench_medium: Int? = if(max_bench_press != null && max_bench_press - 50 > 0) max_bench_press - 50 else 100
        return bench_medium
    }

    fun determine_bench_light(max_bench_press: Int?): Int? {
        val bench_light: Int? = if(max_bench_press != null && max_bench_press - 55 > 0) max_bench_press - 55 else 90
        return bench_light
    }

    fun determine_normal_heavy(max_bench_press: Int?): Int? {
        val normal_heavy: Int? = if(max_bench_press != null && max_bench_press - 105 > 0) max_bench_press - 105 else 60
        return normal_heavy
    }

    fun determine_normal_medium(max_bench_press: Int?): Int? {
        val normal_medium: Int? = if(max_bench_press != null && max_bench_press - 115 > 0) max_bench_press - 115 else 45
        return normal_medium
    }

    fun determine_normal_light(max_bench_press: Int?): Int? {
        val normal_light: Int? = if(max_bench_press != null && max_bench_press - 125 > 0) max_bench_press - 125 else 30
        return normal_light
    }

}
