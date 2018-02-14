package Chapter_10

fun foo(x: Int) = println(x)


fun main(args: Array<String>) {
    val kFunction = ::foo
    kFunction.call(42)
}