/*
rules = [
  "Scala3NewSyntax"
]
*/
package object p {
  val a = ???
  def b = ???
  println("hello")
  println("goodbye")
}

trait Mixin

package object q
  extends Mixin/* assert: Scala3NewSyntax.PackageObjectInitialisation
          ^^^^^
          Package object with parents can not be replaced by top level definitions.
          */
