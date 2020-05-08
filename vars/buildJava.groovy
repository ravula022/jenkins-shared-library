/* write the groovy code here */
def AuthorName="Ravi Avula"
def call(Map config=[:], Closure body) {
    node {
        git url: "https://github.com/ravula022/java-demo.git"

        stage("Build") {
            sh "echo Build the Java project ::"
        }
        stage("Test") {
            sh "echo test the Java project::"
        }

        body()
    }
}