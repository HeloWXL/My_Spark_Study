package scala_study

object FunctionDemo {
  def main(args: Array[String]): Unit = {

    val a = 1
    val b = 2

    /**
      * 定义函数名
      * 参数列表
      * 函数体
      */
    val add = (x:Int,y:Int) => x+y

    println(add(a,b))

  }

}
