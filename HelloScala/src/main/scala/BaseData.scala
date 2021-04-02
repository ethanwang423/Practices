package com.samsung.basedata
class BaseData {
   val defalutValue = 100
  //Return type Int
  def getId(input:Int) :Int = {
    return defalutValue+input
  }
  //Empty return
  def getName():Unit ={
    //do something
  }
}
