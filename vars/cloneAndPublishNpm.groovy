#!/usr/bin/env groovy

def call() {
  String repoUrl = 'git@github.com:HankRoughknuckles/dummy-js.git'

  sh """
    echo 'Cloning the repo'"
    git clone ${repoUrl}
    cd dummy-js
    echo "something to add..." >> README.md
    git commit -am "added something to the readme"
  """
}
