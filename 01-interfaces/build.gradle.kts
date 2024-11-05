plugins {
    java
    application
}

application {
    // Set default main class
    mainClass.set("it.unibo.sampleapp.TestBankAccount")
}

// Task personalizzato per eseguire la classe TestBankAccount
tasks.register("runBanckAccount", JavaExec) {
    group = "application"
    mainClass.set("it.unibo.encapsulation.interfaces.TestBankAccount")
    classpath = sourceSets.main.runtimeClasspath
}

// Task personalizzato per eseguire la classe TestSimpleBankAccount
tasks.register("runSimpleBank", JavaExec) {
    group = "application"
    mainClass.set("it.unibo.encapsulation.interfaces.TestSimpleBankAccount")
    classpath = sourceSets.main.runtimeClasspath
}
