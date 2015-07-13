package com

/**
 * Created by Alexander on 15/7/12.
 */
import com.demo.SomeJavaService
object Main {
  def main(args: Array[String]) {
    println("We're running scala..")
    val service = new SomeJavaService
    println(service.getInfo())
  }
}
