/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecH265 {

    public static final int
        STD_VIDEO_H265_CPB_CNT_LIST_SIZE                        = 32,
        STD_VIDEO_H265_SUBLAYERS_LIST_SIZE                      = 7,
        STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS               = 6,
        STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS            = 16,
        STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS               = 6,
        STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS            = 64,
        STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS             = 6,
        STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS          = 64,
        STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS             = 2,
        STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS          = 64,
        STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE               = 6,
        STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE     = 19,
        STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE     = 21,
        STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE   = 3,
        STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE = 128,
        STD_VIDEO_H265_MAX_NUM_LIST_REF                         = 15,
        STD_VIDEO_H265_MAX_CHROMA_PLANES                        = 2,
        STD_VIDEO_H265_MAX_SHORT_TERM_REF_PIC_SETS              = 64,
        STD_VIDEO_H265_MAX_DPB_SIZE                             = 16,
        STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS               = 32,
        STD_VIDEO_H265_MAX_LONG_TERM_PICS                       = 16,
        STD_VIDEO_H265_MAX_DELTA_POC                            = 48,
        STD_VIDEO_H265_NO_REFERENCE_PICTURE                     = 0xFF;

    public static final int
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME = 0,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_420        = 1,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_422        = 2,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_444        = 3,
        STD_VIDEO_H265_CHROMA_FORMAT_IDC_INVALID    = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_H265_PROFILE_IDC_MAIN                    = 1,
        STD_VIDEO_H265_PROFILE_IDC_MAIN_10                 = 2,
        STD_VIDEO_H265_PROFILE_IDC_MAIN_STILL_PICTURE      = 3,
        STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS = 4,
        STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS          = 9,
        STD_VIDEO_H265_PROFILE_IDC_INVALID                 = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_H264_LEVEL_IDC_1_0     = 0,
        STD_VIDEO_H264_LEVEL_IDC_2_0     = 1,
        STD_VIDEO_H264_LEVEL_IDC_2_1     = 2,
        STD_VIDEO_H264_LEVEL_IDC_3_0     = 3,
        STD_VIDEO_H264_LEVEL_IDC_3_1     = 4,
        STD_VIDEO_H264_LEVEL_IDC_4_0     = 5,
        STD_VIDEO_H264_LEVEL_IDC_4_1     = 6,
        STD_VIDEO_H264_LEVEL_IDC_5_0     = 7,
        STD_VIDEO_H264_LEVEL_IDC_5_1     = 8,
        STD_VIDEO_H264_LEVEL_IDC_5_2     = 9,
        STD_VIDEO_H264_LEVEL_IDC_6_0     = 10,
        STD_VIDEO_H264_LEVEL_IDC_6_1     = 11,
        STD_VIDEO_H264_LEVEL_IDC_6_2     = 12,
        STD_VIDEO_H264_LEVEL_IDC_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_H265_SLICE_TYPE_B       = 0,
        STD_VIDEO_H265_SLICE_TYPE_P       = 1,
        STD_VIDEO_H265_SLICE_TYPE_I       = 2,
        STD_VIDEO_H265_SLICE_TYPE_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_H265_PICTURE_TYPE_P       = 0,
        STD_VIDEO_H265_PICTURE_TYPE_B       = 1,
        STD_VIDEO_H265_PICTURE_TYPE_I       = 2,
        STD_VIDEO_H265_PICTURE_TYPE_IDR     = 3,
        STD_VIDEO_H265_PICTURE_TYPE_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_H265_ASPECT_RATIO_IDC_UNSPECIFIED  = 0,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_SQUARE       = 1,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_12_11        = 2,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_10_11        = 3,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_16_11        = 4,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_40_33        = 5,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_24_11        = 6,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_20_11        = 7,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_32_11        = 8,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_80_33        = 9,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_18_11        = 10,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_15_11        = 11,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_64_33        = 12,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_160_99       = 13,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_4_3          = 14,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_3_2          = 15,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_2_1          = 16,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_EXTENDED_SAR = 255,
        STD_VIDEO_H265_ASPECT_RATIO_IDC_INVALID      = 0x7FFFFFFF;

    public static final int VK_STD_VULKAN_VIDEO_CODEC_H265_DECODE_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);

    public static final String VK_STD_VULKAN_VIDEO_CODEC_H265_DECODE_EXTENSION_NAME = "VK_STD_vulkan_video_codec_h265_decode";

    public static final int STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE = 8;

    public static final int VK_STD_VULKAN_VIDEO_CODEC_H265_ENCODE_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);

    public static final String VK_STD_VULKAN_VIDEO_CODEC_H265_ENCODE_EXTENSION_NAME = "VK_STD_vulkan_video_codec_h265_encode";

    public static final int
        STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE   = 15,
        STD_VIDEO_ENCODE_H265_CHROMA_LIST_SIZE = 15,
        STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM = 2;

    private STDVulkanVideoCodecH265() {}

}