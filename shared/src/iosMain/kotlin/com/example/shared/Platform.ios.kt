package com.example.shared

import platform.Foundation.NSUUID
import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String =
        UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

actual fun randomUUID(): String = NSUUID().UUIDString()

actual enum class ExperimentList {
    INTEREST_LISTING,
    SUPER_INTEREST

}