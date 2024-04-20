plugins{
    java
    alias(libs.plugins.spring.boot)
    id("com.dorongold.task-tree") version "3.0.0"
    id("com.maxirail.common-conventions")
}

dependencies{
    implementation(project(":service"))
    implementation(libs.spring.boot.web)
    developmentOnly("org.springframework.boot:spring-boot-devtools:2.6.4")
    testImplementation(libs.spring.boot.test)
}
