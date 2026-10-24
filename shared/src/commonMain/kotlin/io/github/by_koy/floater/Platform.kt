package io.github.by_koy.floater

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform