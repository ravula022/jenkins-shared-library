#!/usr/bin/env groovy
import com.jenkins.libs.GlobalVars;
def call(String name = 'human' String filePath) {
  echo "Hello, ${name}."
  //GlobalVars.
  //test()
  //println GlobalVars.foo
  echo "file Path :: ${filePath}"
  ut = new GlobalVars()
  ut.buildPath(filePath)
}


