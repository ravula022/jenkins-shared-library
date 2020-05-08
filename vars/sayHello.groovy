#!/usr/bin/env groovy
import com.jenkins.libs.GloblVars;
def call(String name = 'human') {
  echo "Hello, ${name}."
  println GlobalVars.foo
}