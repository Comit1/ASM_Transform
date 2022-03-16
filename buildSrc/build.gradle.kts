plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
//    implementation(gradleApi())
//    implementation(localGroovy())
    implementation("com.android.tools.build:gradle-api:7.0.4")
    implementation("com.android.tools.build:gradle:7.0.4")
    compileOnly("commons-io:commons-io:2.6")
    compileOnly("commons-codec:commons-codec:1.15")
//    compileOnly("org.ow2.asm:asm-commons:9.2")
//    compileOnly("org.ow2.asm:asm-tree:9.2")
}