rootProject.name = "template"

include(":core")
project(":core").projectDir = File("engine/core")

include(":android")
project(":android").projectDir = File("engine/android")

include(":desktop")
project(":desktop").projectDir = File("engine/desktop")

include(":headless")
project(":headless").projectDir = File("engine/headless")

includeBuild("engine/gradle-plugins")