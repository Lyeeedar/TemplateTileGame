tasks.register<JavaExec>("longTest") {
	main = "com.lyeeedar.headless.LongTest"
	classpath = project.the<SourceSetContainer>()["main"].runtimeClasspath
	standardInput = System.`in`
	workingDir = file("../assets")
}