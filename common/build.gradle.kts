plugins {
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    maven("https://repo.alessiodp.com/releases/")
}

dependencies {
    compileOnly("org.spongepowered:configurate-hocon:4.1.2")
    compileOnly("org.slf4j:slf4j-api:1.7.36")
    compileOnly("net.byteflux:libby-core:1.1.5")
}

tasks {
    shadowJar {
        relocate("net.byteflux.libby", "me.adrianed.authmevelocity.libs.libby")
        relocate("org.spongepowered", "me.adrianed.authmevelocity.libs.sponge")
    }
}