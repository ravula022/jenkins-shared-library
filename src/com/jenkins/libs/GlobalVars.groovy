#!/usr/bin/env groovy
package com.jenkins.libs;

def data(){
   static String foo = "bar"
   println "Test Method" + foo
   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   //println GlobalVars.foo
}


   def test(){
    println "Test Method" + foo
   }
}

