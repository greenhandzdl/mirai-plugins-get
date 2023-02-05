plugins {
    val kotlinVersion = "1.8.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.13.4"

    id("io.ktor.plugin") version "2.2.3"
}

dependencies {
    //导入io.ktor.http
    implementation("io.ktor:ktor-client-core:2.2.3")
    implementation("io.ktor:ktor-client-okhttp:2.2.3")

}



group = "com.greenhandzdl.get"
version = "0.0.1"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    jcenter()
    mavenCentral()
}
