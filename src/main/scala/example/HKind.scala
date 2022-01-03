package example

object HKind extends App {

  trait Functor2[T[F[_]]]

  trait Functor[F[_]] {
    def map[A, B](container: F[A])(fn: A => B): F[B]
  }

  implicit val listFunctor = new Functor[List] {
    def map[A, B](container: List[A])(f: A => B): List[B] = container.map(f)
  }

  implicit val optionFunctor = new Functor[Option] {
    def map[A, B](container: Option[A])(f: A => B): Option[B] = container.map(f)
  }

  def inc(container: List[Int])(implicit functor: Functor[List]) = functor.map(container)(_ + 1)

  def incOption(container: Option[Int])(implicit functor: Functor[Option]) =
    functor.map(container)(_ + 1)

  println(inc(List(1, 2, 3, 4)))
  println(incOption(Some(10)))
}
