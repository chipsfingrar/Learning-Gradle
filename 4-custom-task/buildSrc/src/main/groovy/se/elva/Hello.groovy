package se.elva

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Hello extends DefaultTask {
    @TaskAction
    def greet() {
        println 'hello im a task'
    }
}

