#!/usr/bin/env groovy

// Jenkins file or pipeline scripts editor in your job
new MyClass(this).runBuild()

// Class declaration
class MyClass implements Serializable {
    def script
    MyClass(def script) {
        this.script=script
    }
    def runBuild() {
        script.echo script.currentBuild.toString()
    }
}
