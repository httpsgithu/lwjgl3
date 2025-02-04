/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_vulkan_memory_model = "KHRVulkanMemoryModel".nativeClassVK("KHR_vulkan_memory_model", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VULKAN_MEMORY_MODEL_SPEC_VERSION".."3"
    )

    StringConstant(
        "KHR_VULKAN_MEMORY_MODEL_EXTENSION_NAME".."VK_KHR_vulkan_memory_model"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR".."1000211000"
    )
}