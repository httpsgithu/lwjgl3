/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecAV1 {

    public static final int
        STD_VIDEO_AV1_NUM_REF_FRAMES              = 8,
        STD_VIDEO_AV1_REFS_PER_FRAME              = 7,
        STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME        = 8,
        STD_VIDEO_AV1_MAX_TILE_COLS               = 64,
        STD_VIDEO_AV1_MAX_TILE_ROWS               = 64,
        STD_VIDEO_AV1_MAX_SEGMENTS                = 8,
        STD_VIDEO_AV1_SEG_LVL_MAX                 = 8,
        STD_VIDEO_AV1_PRIMARY_REF_NONE            = 7,
        STD_VIDEO_AV1_SELECT_INTEGER_MV           = 2,
        STD_VIDEO_AV1_SELECT_SCREEN_CONTENT_TOOLS = 2,
        STD_VIDEO_AV1_SKIP_MODE_FRAMES            = 2,
        STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS   = 4,
        STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS     = 2,
        STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS   = 8,
        STD_VIDEO_AV1_MAX_NUM_PLANES              = 3,
        STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS        = 6,
        STD_VIDEO_AV1_MAX_NUM_Y_POINTS            = 14,
        STD_VIDEO_AV1_MAX_NUM_CB_POINTS           = 10,
        STD_VIDEO_AV1_MAX_NUM_CR_POINTS           = 10,
        STD_VIDEO_AV1_MAX_NUM_POS_LUMA            = 24,
        STD_VIDEO_AV1_MAX_NUM_POS_CHROMA          = 25;

    public static final int
        STD_VIDEO_AV1_PROFILE_MAIN         = 0,
        STD_VIDEO_AV1_PROFILE_HIGH         = 1,
        STD_VIDEO_AV1_PROFILE_PROFESSIONAL = 2,
        STD_VIDEO_AV1_PROFILE_INVALID      = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_LEVEL_2_0     = 0,
        STD_VIDEO_AV1_LEVEL_2_1     = 1,
        STD_VIDEO_AV1_LEVEL_2_2     = 2,
        STD_VIDEO_AV1_LEVEL_2_3     = 3,
        STD_VIDEO_AV1_LEVEL_3_0     = 4,
        STD_VIDEO_AV1_LEVEL_3_1     = 5,
        STD_VIDEO_AV1_LEVEL_3_2     = 6,
        STD_VIDEO_AV1_LEVEL_3_3     = 7,
        STD_VIDEO_AV1_LEVEL_4_0     = 8,
        STD_VIDEO_AV1_LEVEL_4_1     = 9,
        STD_VIDEO_AV1_LEVEL_4_2     = 10,
        STD_VIDEO_AV1_LEVEL_4_3     = 11,
        STD_VIDEO_AV1_LEVEL_5_0     = 12,
        STD_VIDEO_AV1_LEVEL_5_1     = 13,
        STD_VIDEO_AV1_LEVEL_5_2     = 14,
        STD_VIDEO_AV1_LEVEL_5_3     = 15,
        STD_VIDEO_AV1_LEVEL_6_0     = 16,
        STD_VIDEO_AV1_LEVEL_6_1     = 17,
        STD_VIDEO_AV1_LEVEL_6_2     = 18,
        STD_VIDEO_AV1_LEVEL_6_3     = 19,
        STD_VIDEO_AV1_LEVEL_7_0     = 20,
        STD_VIDEO_AV1_LEVEL_7_1     = 21,
        STD_VIDEO_AV1_LEVEL_7_2     = 22,
        STD_VIDEO_AV1_LEVEL_7_3     = 23,
        STD_VIDEO_AV1_LEVEL_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_FRAME_TYPE_KEY        = 0,
        STD_VIDEO_AV1_FRAME_TYPE_INTER      = 1,
        STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY = 2,
        STD_VIDEO_AV1_FRAME_TYPE_SWITCH     = 3,
        STD_VIDEO_AV1_FRAME_TYPE_INVALID    = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_REFERENCE_NAME_INTRA_FRAME   = 0,
        STD_VIDEO_AV1_REFERENCE_NAME_LAST_FRAME    = 1,
        STD_VIDEO_AV1_REFERENCE_NAME_LAST2_FRAME   = 2,
        STD_VIDEO_AV1_REFERENCE_NAME_LAST3_FRAME   = 3,
        STD_VIDEO_AV1_REFERENCE_NAME_GOLDEN_FRAME  = 4,
        STD_VIDEO_AV1_REFERENCE_NAME_BWDREF_FRAME  = 5,
        STD_VIDEO_AV1_REFERENCE_NAME_ALTREF2_FRAME = 6,
        STD_VIDEO_AV1_REFERENCE_NAME_ALTREF_FRAME  = 7,
        STD_VIDEO_AV1_REFERENCE_NAME_INVALID       = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP        = 0,
        STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH = 1,
        STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SHARP  = 2,
        STD_VIDEO_AV1_INTERPOLATION_FILTER_BILINEAR        = 3,
        STD_VIDEO_AV1_INTERPOLATION_FILTER_SWITCHABLE      = 4,
        STD_VIDEO_AV1_INTERPOLATION_FILTER_INVALID         = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_TX_MODE_ONLY_4X4 = 0,
        STD_VIDEO_AV1_TX_MODE_LARGEST  = 1,
        STD_VIDEO_AV1_TX_MODE_SELECT   = 2,
        STD_VIDEO_AV1_TX_MODE_INVALID  = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_NONE       = 0,
        STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_WIENER     = 1,
        STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SGRPROJ    = 2,
        STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_SWITCHABLE = 3,
        STD_VIDEO_AV1_FRAME_RESTORATION_TYPE_INVALID    = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_COLOR_PRIMARIES_BT_709       = 1,
        STD_VIDEO_AV1_COLOR_PRIMARIES_UNSPECIFIED  = 2,
        STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_M     = 3,
        STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_B_G   = 4,
        STD_VIDEO_AV1_COLOR_PRIMARIES_BT_601       = 5,
        STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_240    = 6,
        STD_VIDEO_AV1_COLOR_PRIMARIES_GENERIC_FILM = 7,
        STD_VIDEO_AV1_COLOR_PRIMARIES_BT_2020      = 8,
        STD_VIDEO_AV1_COLOR_PRIMARIES_XYZ          = 9,
        STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_431    = 10,
        STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_432    = 11,
        STD_VIDEO_AV1_COLOR_PRIMARIES_EBU_3213     = 12,
        STD_VIDEO_AV1_COLOR_PRIMARIES_INVALID      = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_0     = 0,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_709         = 1,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_UNSPECIFIED    = 2,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_3     = 3,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_M       = 4,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_B_G     = 5,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_601         = 6,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_240      = 7,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LINEAR         = 8,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100        = 9,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100_SQRT10 = 10,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_IEC_61966      = 11,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_1361        = 12,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SRGB           = 13,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_10_BIT = 14,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_12_BIT = 15,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_2084     = 16,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_428      = 17,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_HLG            = 18,
        STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_INVALID        = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_IDENTITY    = 0,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_709      = 1,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_UNSPECIFIED = 2,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_RESERVED_3  = 3,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_FCC         = 4,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_470_B_G  = 5,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_601      = 6,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_240   = 7,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_YCGCO = 8,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_NCL = 9,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_BT_2020_CL  = 10,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_SMPTE_2085  = 11,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_NCL = 12,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_CHROMAT_CL  = 13,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_ICTCP       = 14,
        STD_VIDEO_AV1_MATRIX_COEFFICIENTS_INVALID     = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_UNKNOWN   = 0,
        STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_VERTICAL  = 1,
        STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_COLOCATED = 2,
        STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_RESERVED  = 3,
        STD_VIDEO_AV1_CHROMA_SAMPLE_POSITION_INVALID   = 0x7FFFFFFF;

    public static final int VK_STD_VULKAN_VIDEO_CODEC_AV1_DECODE_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);

    public static final String VK_STD_VULKAN_VIDEO_CODEC_AV1_DECODE_EXTENSION_NAME = "VK_STD_vulkan_video_codec_av1_decode";

    private STDVulkanVideoCodecAV1() {}

}