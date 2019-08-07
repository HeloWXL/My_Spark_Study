package scala_study

class Teacher(val name: String, age: Int) extends Person(name, age) {
  /**
    * 如果函数没有参数括号可以省略
    */
  /**
    *重写父类函数
    */
  override def getName: String = {
    "子类重写父类方法" + name
  }


  /**
    * 方法重载
    */
  def print(string: String)={
    println(string)
  }

  def print(int: Int)={
    println(int)
  }

}
