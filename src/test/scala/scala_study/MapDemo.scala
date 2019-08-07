package scala_study

object MapDemo {
  def main(args: Array[String]): Unit = {
    var map = Map[Int, String]()
    //增加一个元素,返回一个新的map
    map += (1 -> "scala")
    map = map + (2 -> "java")
    map = map.+(3 -> "hadoop")
    println(map)

    //使用—>符号
    val map1 = Map("shu" -> "xue", "java" -> "scala")
    //使用元组
    val map2 = Map(("shu","xue"), ("java","scala"))

    println(map1)
    println(map2)

    //根据key获取值
    println(map1.get("shu").get)
    println(map2("java"))

    //使用getOrElse 给出默认值
    println(map1.getOrElse("scala",0))
  }
}
