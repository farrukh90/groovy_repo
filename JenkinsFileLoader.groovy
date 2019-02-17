class MyClass implements Serializable {

    def script

    MyClass(def script) {
        this.script=script
    }

    def runBuild() {
        script.echo script.currentBuild.toString()
    }
}
