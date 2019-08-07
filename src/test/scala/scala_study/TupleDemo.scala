package scala_study

object TupleDemo {
  def main(args: Array[String]): Unit = {
    /**
      * tuple
      * 不可变列表
      * 可以通过索引获取里面的元素
      *
      */
    //定义元组
    val tuple = ("c","1","b")
    //获取元组中的值
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    //4表示该元组的长度
    val tuple1 = Tuple4(1,2,3,4)
    println(tuple1._4)

  }

}
