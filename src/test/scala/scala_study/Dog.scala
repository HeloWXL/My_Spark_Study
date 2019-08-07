package scala_study

class Dog {
  val id = 1
  private var name = "花花"

  def printName(): Unit ={
    //在Dog类中可以访问伴生对象Dog的私有属性
    println(Dog.CONSTANT + name )
  }

}
/**
  * 伴生对象
  */
object Dog {

  //伴生对象中的私有属性
  private val CONSTANT = "汪汪汪 ："

  /**
    * scala object  特有的函数，直接通过名称加括号调用
    *
    */
  def apply(): Unit = println("apply")

  def main(args: Array[String]) {
    val p = new Dog
    //访问私有的字段name
    p.name = "圆圆"
    p.printName()

    /**
      * 调用apply方法
      */
    Dog()
  }
}
