plugins {
    id("org.pkl-lang") version "0.26.3"
}

pkl {
    evaluators {
        register("evalPkl") {
            sourceModules.addAll(files("main.pkl"))
            outputFile.set(layout.buildDirectory.file("terraform/main.tf.json"))
            outputFormat.set("json")
        }
    }
}

