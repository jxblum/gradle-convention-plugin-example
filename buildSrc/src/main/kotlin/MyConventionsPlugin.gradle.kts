
tasks.register("hello") {
    description = "Prints a welcome message"
    doLast {
        println("Welcome from the custom Gradle conventions plugin")
    }
}
