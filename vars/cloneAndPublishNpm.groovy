def call() {
  String repoUrl = 'git@github.com:HankRoughknuckles/dummy-js.git'
  sh "echo 'Cloning the repo'"
  sh "git clone ${repoUrl} ${avroTsDirName}"
}
