# Scala Generics Type Erasure Bug

This example demonstrates a common issue encountered when using generics in Scala: type erasure.  Type erasure means that the specific type parameter (T in this case) is lost at runtime. This can lead to unexpected behavior when working with collections of generic objects.

The `bug.scala` file showcases this problem by creating a list containing objects of different types, both `MyClass[Int]` and `MyClass[String]`. When attempting to use the `map` function, which expects a function of type T => U, the compiler doesn't retain the type information (Int and String). This could lead to exceptions or unexpected results.

The solution file `bugSolution.scala` offers methods to work around this.

## Solution
The solution demonstrates ways to maintain type information during operations on generic collections.