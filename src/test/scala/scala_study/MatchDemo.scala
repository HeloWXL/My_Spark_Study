package scala_study

object MatchDemo {

  def main(args: Array[String]): Unit = {

    //被包在花括号内没有match的一组case语句是一个偏函数
    //其中左边表示参数类型 右边表示返回类型
    def isNum(a: Int) = a match {
      case 1 => println("one")
      case 2 => println("two")
      // 模式匹配的时候还可以添加守卫条件
      case a:Int if(a > 20)=> println("这个数大于20")
      case _ => println("no")
    }

    isNum(23)
    isNum(1)


    def matchCat(d: Cat) = d match {
      case Cat("花花", 12) => println("花花：12")
      case Cat("布丁", 6) => println("布丁：6")
      case d: Dog => println("dog")
      case _ => println("no")
    }

    val cat = Cat("花花", 13)

    matchCat(cat)


    val cats = List(Cat("花花", 13), Cat("布丁", 13), Cat("草草", 13))

    //过滤花花和布丁
    cats.filter(d => d match {
      case Cat("布丁", 13) => true
      case Cat("花花", 13) => true
      case _ => false
    }).foreach(println)


    val map = Map("1500100004" -> "葛德曜", "1500100002" -> "宣谷芹", "1500100003" -> "边昂雄")

    //在Scala中Option类型样例类用来表示可能存在或也可能不存在的值(Option的子类有Some和None)。Some包装了某个值，None表示没有值
    val sname = map.get("1500100006") match {
      case Some(name) => name
      case None => "no"
    }

    println(sname)


  }
}

case class Cat(name: String, age: Int)