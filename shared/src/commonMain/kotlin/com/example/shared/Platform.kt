package com.example.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
expect fun randomUUID(): String

expect enum class ExperimentList {
    INTEREST_LISTING,
    SUPER_INTEREST
}