fun main(args: Array<String>) {
    val w:Int = readln().toIntOrNull() ?: 0
    if(w in 1..100) {
        if (w % 2 == 0 && w > 2) {
            println("YES")
        } else {
            println("NO")
        }
    } else {
        println("please enter weight between 1 and a 100")
    }
}
