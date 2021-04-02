class Point (xc: Int, yc: Int){
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit ={
    x = x + dx
    y = y + dy
    println("x is: " + x)
    println("y is: " + y)
  }
}

class Location( val xc: Int,  val yc: Int,val zc :Int) extends Point(xc, yc){
  var z: Int = zc
  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("x is : " + x);
    println ("y is : " + y);
    println ("z is : " + z);
  }
}
object  Test{
  def main(args: Array[String]): Unit = {
    val pt = new Point(1,2)
    pt.move(2,5)

    val ptz =new Location(1,1,1)
    ptz.move(2,2,2)
  }
}
