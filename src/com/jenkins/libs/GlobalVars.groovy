#!/usr/bin/env groovy
package com.jenkins.libs;

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   //println GlobalVars.foo

   def test(){
    println "Test Method" + GlobalVars.foo
   }
}

