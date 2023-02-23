//
fun towersOfHanoi(n: Int, source: String, midRode: String, dest: String) {
    if (n == 1) {
        println("Moving disk 1 from $source to $dest")
        return
    }
    towersOfHanoi(n - 1, source, dest, midRode)
    println("Moving disk $n from $source to $dest")
    towersOfHanoi(n - 1, midRode, source, dest)
}

fun main(){
    val n = 4 // Number of disks
    towersOfHanoi(n, "Initial", "MidRode", "Final Destination")
}