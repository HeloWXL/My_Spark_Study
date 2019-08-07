package scala_study

object SetDemo {
  def main(args: Array[String]): Unit = {
    //无序，唯一
    val set = Set("R", "java", "scala", "python")
    println(set)

    println("=" * 100)

    //过滤容器里面的元素，判断每一个元素是否满足某个条件
    set.filter(x => x.startsWith("s")).foreach(println)

    val ints = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //获取所有偶数
    ints.filter(x => x % 2 == 0).foreach(println)

    println("=" * 100)

    /**
      * 可变set
      */
    val set1 = scala.collection.mutable.Set[String]()
    set1.add("java")
    set1.add("scala")
    println(set1)


    //类型转换
    set1.toList
    set1.toArray
  }

}
