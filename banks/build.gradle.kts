plugins {
    id("java")
    id("io.freefair.lombok").version("8.6")
}

group = "en.pchz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "en.pchz.banks.Program"
    }
}

task("amogus", JavaExec::class) {
    mainClass.set("en.pchz.banks.Program")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.test {
    useJUnitPlatform()
}

