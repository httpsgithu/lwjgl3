/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_rasterization_order_attachment_access = "EXTRasterizationOrderAttachmentAccess".nativeClassVK("EXT_rasterization_order_attachment_access", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_EXTENSION_NAME".."VK_EXT_rasterization_order_attachment_access"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT".."1000342000"
    )

    EnumConstant(
        "PIPELINE_COLOR_BLEND_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT".enum(0x00000001),
        "PIPELINE_DEPTH_STENCIL_STATE_CREATE_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_EXT".enum(0x00000010),
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT".enum(0x00000020),
        "SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT".enum(0x00000040)
    )
}