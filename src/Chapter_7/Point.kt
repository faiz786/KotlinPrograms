

//fun main(args : Array<String>)
//{
//    println("Hello World")
//}

//package ch07.PointPlusMember

//data class Point(val x: Int, val y: Int) {
//    operator fun plus(other: Point): Point {
//        return Point(x + other.x, y + other.y)
//    }
//}
//
//fun main(args: Array<String>) {
//    val p1 = Point(10, 20)
//    val p2 = Point(30, 40)
//    println(p1 + p2)
//}

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x,-y)
operator fun Point.unaryPlus() = Point(x+x,y+y)

operator fun Point.plus(other:Point):Point

{
    return Point(x+other.x,y+other.y)
}

operator fun Point.minus(other:Point):Point

{
    return Point(x-other.x,y-other.y)
}




val point = Point(10,20)

//println()

fun main(args : Array<String>)
{
    println(-point)
    println(+point)
    val p1 = Point(10,20)
    val p2 = Point(20,40)
    println(p1+p2)
    println(p1-p2)
}




