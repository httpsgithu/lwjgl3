/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_descriptor_indexing = "EXTDescriptorIndexing".nativeClassVK("EXT_descriptor_indexing", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DESCRIPTOR_INDEXING_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME".."VK_EXT_descriptor_indexing"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT".."1000161000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES_EXT".."1000161001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES_EXT".."1000161002",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT".."1000161003",
        "STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT_EXT".."1000161004"
    )

    EnumConstant(
        "DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT".enum(0x00000001),
        "DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT".enum(0x00000002),
        "DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT".enum(0x00000004),
        "DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        "DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "ERROR_FRAGMENTATION_EXT".."-1000161000"
    )
}