#!/usr/bin/env groovy
package com.jenkins.libs;

class GlobalVars {
   static String foo = "bar"
   println("This is from SRC folder ::" GlobalVars.foo);
}