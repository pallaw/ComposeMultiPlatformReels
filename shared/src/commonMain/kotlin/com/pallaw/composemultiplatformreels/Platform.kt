package com.pallaw.composemultiplatformreels

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform