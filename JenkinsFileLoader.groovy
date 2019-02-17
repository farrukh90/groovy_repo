#!/usr/bin/env groovy

new Example(this).runBuild()

class Example {
   static void main(String[] args) {
      // Using a simple println statement to print output to the console
      println('Hello World');
   }
}
