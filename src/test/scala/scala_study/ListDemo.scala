package scala_study

import scala.collection.mutable.ListBuffer

object ListDemo {
  def main(args: Array[String]): Unit = {
    //创建一个不可变集合
    val list = List("shujia", "java", "scala", "hadoop")
    //将0插入到lst1的前面生成一个新的List
    val list2 = 0 :: list
    val list3 = list.::(0)
    val list4 = 0 +: list
    val list5 = list.+:(0)

    //将一个元素添加到lst1的后面产生一个新的集合
    val list6 = list2 :+ 3

    //将2个list合并成一个新的List
    val list7 = list2 ++ list3
    //将lst1插入到lst0前面生成一个新的集合
    val list8 = list ++: list2

    println(list.mkString(","))
    println(list.head)
    println(list.tail) //取出不包含第一个元素的所有元素。返回一个新的列表
    println(list.take(2)) //从前面取
    println(list.takeRight(2)) //从后面取
    val list1 = List((1,"a"), (4,"b"), (3,"c"), (2,"v"), (5,"d"), (6,"ds"), (7,"c"), (8,"c"), (9,"a"))
    println(list1)

    println(list1.max)//取最大值
    println(list1.min)//取最小值
    println(list1.reverse)//反转
    println(list1.sortBy(x => x._1)) //排序，根据某一个字段排序，默认升序

    //创建一个可变的集合
    val lst0 = ListBuffer[Int](1,2,3)
    //创建一个空的可变列表
    val lst1 = new ListBuffer[Int]
    //向lst1中追加元素，注意：没有生成新的集合
    lst1 += 4
    lst1.append(5)

    //将lst1中的元素最近到lst0中， 注意：没有生成新的集合
    lst0 ++= lst1

    //将lst0和lst1合并成一个新的ListBuffer 注意：生成了一个集合
    val lst2= lst0 ++ lst1

    //将元素追加到lst0的后面生成一个新的集合
    val lst3 = lst0 :+ 5
  }

}
