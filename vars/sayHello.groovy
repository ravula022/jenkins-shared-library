#!/usr/bin/env groovy
import com.jenkins.libs.GlobalVars;
def call(String name = 'human') {
  echo "Hello, ${name}."
  ut = new GlobalVars()
  ut.test()
  //test()
}