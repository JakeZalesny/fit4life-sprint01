class AddMaxes {
    fun get_bench_max(args: Array<String>): Int? {
        print("What is your max bench? ")
        var max_bench: String? = readLine()
        return max_bench?.toInt()
    }

    fun get_max_squat(args: Array<String>): Int? {
        print("What is your max squat? ")
        var max_squat: String? = readLine()
        return max_squat?.toInt()
    }

    fun get_max_deadlift(args: Array<String>): Int? {
        print("What is your max deadlift? ")
        var max_deadlift: String? = readLine()
        return max_deadlift?.toInt()
    }

    fun get_max_curl(args: Array<String>): Int? {
        print("What is your max curl (for 10 reps)? ")
        var max_curl: String? = readLine()
        return max_curl?.toInt()
    }

    fun get_max_closegrip_bench(args: Array<String>): Int? {
        print("What is your max Closegrip Bench Press? ")
        var max_closegrip_bench: String? = readLine()
        return max_closegrip_bench?.toInt()
    }

    fun get_max_shoulder_press(args: Array<String>): Int? {
        print("What is your max Shoulder Press? ")
        var max_shoulder_press: String? = readLine()
        return max_shoulder_press?.toInt()
    }


}