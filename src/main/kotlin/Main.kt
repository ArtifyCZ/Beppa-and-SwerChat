fun main() {
    (1..readln().toInt()).forEach { _ ->
        val n = readln().toInt()
        val a = readln().split(' ').map { it.toInt() }
        val b = readln().split(' ').map { it.toInt() }

        val moved = run {
            var i = n - 1
            var j = n - 1

            while (0 <= i && 0 <= j) {
                if(a[i] != b[j]) {
                    i--
                } else {
                    j--
                    i--
                }
            }

            j + 1
        }
        
        println(moved)
    }
}
