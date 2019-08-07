package scala_study

object MethodDemo {
  def main(args: Array[String]): Unit = {

    val a =1
    println(add(a))

    //加一个下划线 将方法转成函数
    val add_bak = add _

  }
  /**
    * def ；定义函数的关键字
    * add ：函数名称
    * a  :函数参数
    * (a: Int) ;参数类型
    * Int :函数的返回值
    */
  def add(a: Int): Int ={
    a+1
  }

}
