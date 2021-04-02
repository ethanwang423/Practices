
import com.samsung.basedata.BaseData

import Array._
import java.io.{FileNotFoundException, FileReader, IOException}

object Main {
  def  main(args: Array[String]): Unit = {

    var baseDt = new BaseData()
      println(baseDt.getId(200))




    //
    var factor = 10
    val multiplier = (i:Int)=>i*factor
    println("multiplier vaule is "+multiplier(100))


    //creating string
    var myString:String = "Hello China"
    println(myString)

    val buf = new StringBuilder
    buf ++= "You"
    buf ++= "are right"
    println(buf)
    println("buf lenght is "+ buf.length())

    //arrry
    var testArray:Array[Int] = new Array[Int](10)
    var x = 0
    for(x <- 0 to 9){
      testArray(x) = 10 - x
      print(testArray(x)+"\t")
    }

    //merge array
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 = concat(myList1,myList2)
    for(x <- myList3){
      print(x+"\t")
    }
  //rang array
    var myArray1 = range(10,20,2)
    for(x<-myArray1){
      print(x+"\t")
    }
    //collections List/Set/Map/Tuple/Option/Iterator
    val x1 = List(1,2,3,4)
    val x2 = Set(1,3,5,7)
    val x3 = Map("one" -> 1, "two" -> 2, "three" -> 3)
    val x4 = (10, "Runoob")
    val x5:Option[Int] = Some(5)

    //Iterator
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext) {
      println(it.next())
    }

    //Find max/min vaule
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    println("Max：" + ita.max )
    println("Min：" + itb.min )


    //match
    def matchTest(name:String): Any =name match {
      case "one" => 100
      case "two" => 200
      case _=> 1
    }
    println(matchTest("two"))
  }

  //exception
  try {
    val f = new FileReader("abc.txt")
  } catch {
    case ex: FileNotFoundException =>{
      println("Missing file exception")
    }
    case ex:IOException=>{
      println("IO Exception")
    }
  }
  finally {
    println("Exiting finally...")
  }

}
