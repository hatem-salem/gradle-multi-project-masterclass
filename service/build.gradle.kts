plugins{
    `java-library`
    id("com.maxirail.common-conventions")
}

dependencies{
    api(project(":model"))
    implementation(libs.spring.boot.starter)

}
