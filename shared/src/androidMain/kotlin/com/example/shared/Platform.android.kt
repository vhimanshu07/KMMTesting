package com.example.shared

import java.util.UUID

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

actual fun randomUUID() = UUID.randomUUID().toString()

actual enum class ExperimentList {
    INTEREST_LISTING,
    SUPER_INTEREST

}