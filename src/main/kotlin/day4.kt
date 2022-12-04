fun main() {
    val sample1 = part1(readFileLines("day4/sample.txt"))
    check(sample1 == 2) { println(sample1) }
    val part1 = part1(readFileLines("day4/input.txt"))
    println("Part 1: $part1")

    val sample2 = part2(readFileLines("day4/sample.txt"))
    check(sample2 == 5) { println(sample2) }
    val part2 = part2(readFileLines("day4/input.txt"))
    println("Part 2: $part2")
}

private fun part1(lines: List<String>): Int {
    return lines
        .map { it.split(",") }
        .map {
            val range1 = it[0].split("-").map { it.toInt() }
            val range2 = it[1].split("-").map { it.toInt() }
            if (
                (range1[0] >= range2[0] && range1[1] <= range2[1])
                || (range1[0] <= range2[0] && range1[1] >= range2[1])
            ) {
                1
            } else {
                0
            }
        }
        .sum()
}

private fun part2(lines: List<String>): Int {
    return 0
}

