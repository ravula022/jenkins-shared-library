#!/usr/bin/env groovy
import com.jenkins.libs.GlobalVars;
def call(String name = 'human') {
  echo "Hello, ${name}."
  //GlobalVars.
  //test()
  //println GlobalVars.foo
}

def wasFilePath(string filePath = '/home/webspere'){
    echo "file Path :: ${filePath}"
    ut = new GlobalVars()
    ut.buildPath(filePath)
}
