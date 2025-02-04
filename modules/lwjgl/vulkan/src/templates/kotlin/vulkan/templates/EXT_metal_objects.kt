/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_metal_objects = "EXTMetalObjects".nativeClassVK("EXT_metal_objects", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_METAL_OBJECTS_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_METAL_OBJECTS_EXTENSION_NAME".."VK_EXT_metal_objects"
    )

    EnumConstant(
        "STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT".."1000311000",
        "STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT".."1000311001",
        "STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT".."1000311002",
        "STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT".."1000311003",
        "STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT".."1000311004",
        "STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT".."1000311005",
        "STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT".."1000311006",
        "STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT".."1000311007",
        "STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT".."1000311008",
        "STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT".."1000311009",
        "STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT".."1000311010",
        "STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT".."1000311011"
    )

    EnumConstant(
        "EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT".enum(0x00000001),
        "EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT".enum(0x00000002),
        "EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT".enum(0x00000004),
        "EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT".enum(0x00000008),
        "EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT".enum(0x00000010),
        "EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT".enum(0x00000020)
    )

    void(
        "ExportMetalObjectsEXT",

        VkDevice("device"),
        VkExportMetalObjectsInfoEXT.p("pMetalObjectsInfo")
    )
}