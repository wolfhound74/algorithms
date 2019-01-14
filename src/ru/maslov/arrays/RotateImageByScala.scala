package ru.maslov.arrays

object RotateImageByScala extends App {
  val matrix: Array[Array[Int]] = Array(
    Array(1, 2, 3),
    Array(4, 5, 6),
    Array(7, 8, 9)
  )

  val start = System.currentTimeMillis()
  rotate(matrix)
  println(System.currentTimeMillis() - start)

  def rotate(matrix: Array[Array[Int]]): Unit = {
    val rows = (for (it <- matrix) yield it.iterator).reverse

    for (i <- matrix.indices) {
      matrix(i) = for {
        row <- rows
      } yield {
        row.next
      }
    }
  }

}
