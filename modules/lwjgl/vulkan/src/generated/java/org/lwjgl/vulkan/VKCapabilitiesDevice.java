/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.util.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Reports the enabled capabilities and function pointers of a Vulkan {@code VkDevice}.
 * 
 * <p>The addresses are cached for future use. This class also allows developers to query the capabilities made available to the Vulkan device handle.</p>
 */
@SuppressWarnings("SimplifiableIfStatement")
public class VKCapabilitiesDevice {

    /** Function pointers for VK10 */
    public final long
        vkGetDeviceProcAddr,
        vkDestroyDevice,
        vkGetDeviceQueue,
        vkQueueSubmit,
        vkQueueWaitIdle,
        vkDeviceWaitIdle,
        vkAllocateMemory,
        vkFreeMemory,
        vkMapMemory,
        vkUnmapMemory,
        vkFlushMappedMemoryRanges,
        vkInvalidateMappedMemoryRanges,
        vkGetDeviceMemoryCommitment,
        vkBindBufferMemory,
        vkBindImageMemory,
        vkGetBufferMemoryRequirements,
        vkGetImageMemoryRequirements,
        vkGetImageSparseMemoryRequirements,
        vkQueueBindSparse,
        vkCreateFence,
        vkDestroyFence,
        vkResetFences,
        vkGetFenceStatus,
        vkWaitForFences,
        vkCreateSemaphore,
        vkDestroySemaphore,
        vkCreateEvent,
        vkDestroyEvent,
        vkGetEventStatus,
        vkSetEvent,
        vkResetEvent,
        vkCreateQueryPool,
        vkDestroyQueryPool,
        vkGetQueryPoolResults,
        vkCreateBuffer,
        vkDestroyBuffer,
        vkCreateBufferView,
        vkDestroyBufferView,
        vkCreateImage,
        vkDestroyImage,
        vkGetImageSubresourceLayout,
        vkCreateImageView,
        vkDestroyImageView,
        vkCreateShaderModule,
        vkDestroyShaderModule,
        vkCreatePipelineCache,
        vkDestroyPipelineCache,
        vkGetPipelineCacheData,
        vkMergePipelineCaches,
        vkCreateGraphicsPipelines,
        vkCreateComputePipelines,
        vkDestroyPipeline,
        vkCreatePipelineLayout,
        vkDestroyPipelineLayout,
        vkCreateSampler,
        vkDestroySampler,
        vkCreateDescriptorSetLayout,
        vkDestroyDescriptorSetLayout,
        vkCreateDescriptorPool,
        vkDestroyDescriptorPool,
        vkResetDescriptorPool,
        vkAllocateDescriptorSets,
        vkFreeDescriptorSets,
        vkUpdateDescriptorSets,
        vkCreateFramebuffer,
        vkDestroyFramebuffer,
        vkCreateRenderPass,
        vkDestroyRenderPass,
        vkGetRenderAreaGranularity,
        vkCreateCommandPool,
        vkDestroyCommandPool,
        vkResetCommandPool,
        vkAllocateCommandBuffers,
        vkFreeCommandBuffers,
        vkBeginCommandBuffer,
        vkEndCommandBuffer,
        vkResetCommandBuffer,
        vkCmdBindPipeline,
        vkCmdSetViewport,
        vkCmdSetScissor,
        vkCmdSetLineWidth,
        vkCmdSetDepthBias,
        vkCmdSetBlendConstants,
        vkCmdSetDepthBounds,
        vkCmdSetStencilCompareMask,
        vkCmdSetStencilWriteMask,
        vkCmdSetStencilReference,
        vkCmdBindDescriptorSets,
        vkCmdBindIndexBuffer,
        vkCmdBindVertexBuffers,
        vkCmdDraw,
        vkCmdDrawIndexed,
        vkCmdDrawIndirect,
        vkCmdDrawIndexedIndirect,
        vkCmdDispatch,
        vkCmdDispatchIndirect,
        vkCmdCopyBuffer,
        vkCmdCopyImage,
        vkCmdBlitImage,
        vkCmdCopyBufferToImage,
        vkCmdCopyImageToBuffer,
        vkCmdUpdateBuffer,
        vkCmdFillBuffer,
        vkCmdClearColorImage,
        vkCmdClearDepthStencilImage,
        vkCmdClearAttachments,
        vkCmdResolveImage,
        vkCmdSetEvent,
        vkCmdResetEvent,
        vkCmdWaitEvents,
        vkCmdPipelineBarrier,
        vkCmdBeginQuery,
        vkCmdEndQuery,
        vkCmdResetQueryPool,
        vkCmdWriteTimestamp,
        vkCmdCopyQueryPoolResults,
        vkCmdPushConstants,
        vkCmdBeginRenderPass,
        vkCmdNextSubpass,
        vkCmdEndRenderPass,
        vkCmdExecuteCommands;

    /** Function pointers for VK11 */
    public final long
        vkBindBufferMemory2,
        vkBindImageMemory2,
        vkGetDeviceGroupPeerMemoryFeatures,
        vkCmdSetDeviceMask,
        vkCmdDispatchBase,
        vkGetImageMemoryRequirements2,
        vkGetBufferMemoryRequirements2,
        vkGetImageSparseMemoryRequirements2,
        vkTrimCommandPool,
        vkGetDeviceQueue2,
        vkCreateSamplerYcbcrConversion,
        vkDestroySamplerYcbcrConversion,
        vkCreateDescriptorUpdateTemplate,
        vkDestroyDescriptorUpdateTemplate,
        vkUpdateDescriptorSetWithTemplate,
        vkGetDescriptorSetLayoutSupport;

    /** Function pointers for VK12 */
    public final long
        vkCmdDrawIndirectCount,
        vkCmdDrawIndexedIndirectCount,
        vkCreateRenderPass2,
        vkCmdBeginRenderPass2,
        vkCmdNextSubpass2,
        vkCmdEndRenderPass2,
        vkResetQueryPool,
        vkGetSemaphoreCounterValue,
        vkWaitSemaphores,
        vkSignalSemaphore,
        vkGetBufferDeviceAddress,
        vkGetBufferOpaqueCaptureAddress,
        vkGetDeviceMemoryOpaqueCaptureAddress;

    /** Function pointers for VK13 */
    public final long
        vkCreatePrivateDataSlot,
        vkDestroyPrivateDataSlot,
        vkSetPrivateData,
        vkGetPrivateData,
        vkCmdSetEvent2,
        vkCmdResetEvent2,
        vkCmdWaitEvents2,
        vkCmdPipelineBarrier2,
        vkCmdWriteTimestamp2,
        vkQueueSubmit2,
        vkCmdCopyBuffer2,
        vkCmdCopyImage2,
        vkCmdCopyBufferToImage2,
        vkCmdCopyImageToBuffer2,
        vkCmdBlitImage2,
        vkCmdResolveImage2,
        vkCmdBeginRendering,
        vkCmdEndRendering,
        vkCmdSetCullMode,
        vkCmdSetFrontFace,
        vkCmdSetPrimitiveTopology,
        vkCmdSetViewportWithCount,
        vkCmdSetScissorWithCount,
        vkCmdBindVertexBuffers2,
        vkCmdSetDepthTestEnable,
        vkCmdSetDepthWriteEnable,
        vkCmdSetDepthCompareOp,
        vkCmdSetDepthBoundsTestEnable,
        vkCmdSetStencilTestEnable,
        vkCmdSetStencilOp,
        vkCmdSetRasterizerDiscardEnable,
        vkCmdSetDepthBiasEnable,
        vkCmdSetPrimitiveRestartEnable,
        vkGetDeviceBufferMemoryRequirements,
        vkGetDeviceImageMemoryRequirements,
        vkGetDeviceImageSparseMemoryRequirements;

    /** Function pointers for VK14 */
    public final long
        vkCmdSetLineStipple,
        vkMapMemory2,
        vkUnmapMemory2,
        vkCmdBindIndexBuffer2,
        vkGetRenderingAreaGranularity,
        vkGetDeviceImageSubresourceLayout,
        vkGetImageSubresourceLayout2,
        vkCmdPushDescriptorSet,
        vkCmdPushDescriptorSetWithTemplate,
        vkCmdSetRenderingAttachmentLocations,
        vkCmdSetRenderingInputAttachmentIndices,
        vkCmdBindDescriptorSets2,
        vkCmdPushConstants2,
        vkCmdPushDescriptorSet2,
        vkCmdPushDescriptorSetWithTemplate2,
        vkCopyMemoryToImage,
        vkCopyImageToMemory,
        vkCopyImageToImage,
        vkTransitionImageLayout;

    /** Function pointers for AMD_anti_lag */
    public final long
        vkAntiLagUpdateAMD;

    /** Function pointers for AMD_buffer_marker */
    public final long
        vkCmdWriteBufferMarkerAMD,
        vkCmdWriteBufferMarker2AMD;

    /** Function pointers for AMD_display_native_hdr */
    public final long
        vkSetLocalDimmingAMD;

    /** Function pointers for AMD_draw_indirect_count */
    public final long
        vkCmdDrawIndirectCountAMD,
        vkCmdDrawIndexedIndirectCountAMD;

    /** Function pointers for AMD_shader_info */
    public final long
        vkGetShaderInfoAMD;

    /** Function pointers for AMDX_shader_enqueue */
    public final long
        vkCreateExecutionGraphPipelinesAMDX,
        vkGetExecutionGraphPipelineScratchSizeAMDX,
        vkGetExecutionGraphPipelineNodeIndexAMDX,
        vkCmdInitializeGraphScratchMemoryAMDX,
        vkCmdDispatchGraphAMDX,
        vkCmdDispatchGraphIndirectAMDX,
        vkCmdDispatchGraphIndirectCountAMDX;

    /** Function pointers for ANDROID_external_memory_android_hardware_buffer */
    public final long
        vkGetAndroidHardwareBufferPropertiesANDROID,
        vkGetMemoryAndroidHardwareBufferANDROID;

    /** Function pointers for EXT_attachment_feedback_loop_dynamic_state */
    public final long
        vkCmdSetAttachmentFeedbackLoopEnableEXT;

    /** Function pointers for EXT_buffer_device_address */
    public final long
        vkGetBufferDeviceAddressEXT;

    /** Function pointers for EXT_calibrated_timestamps */
    public final long
        vkGetCalibratedTimestampsEXT;

    /** Function pointers for EXT_color_write_enable */
    public final long
        vkCmdSetColorWriteEnableEXT;

    /** Function pointers for EXT_conditional_rendering */
    public final long
        vkCmdBeginConditionalRenderingEXT,
        vkCmdEndConditionalRenderingEXT;

    /** Function pointers for EXT_debug_marker */
    public final long
        vkDebugMarkerSetObjectTagEXT,
        vkDebugMarkerSetObjectNameEXT,
        vkCmdDebugMarkerBeginEXT,
        vkCmdDebugMarkerEndEXT,
        vkCmdDebugMarkerInsertEXT;

    /** Function pointers for EXT_depth_bias_control */
    public final long
        vkCmdSetDepthBias2EXT;

    /** Function pointers for EXT_depth_clamp_control */
    public final long
        vkCmdSetDepthClampRangeEXT;

    /** Function pointers for EXT_descriptor_buffer */
    public final long
        vkGetDescriptorSetLayoutSizeEXT,
        vkGetDescriptorSetLayoutBindingOffsetEXT,
        vkGetDescriptorEXT,
        vkCmdBindDescriptorBuffersEXT,
        vkCmdSetDescriptorBufferOffsetsEXT,
        vkCmdBindDescriptorBufferEmbeddedSamplersEXT,
        vkGetBufferOpaqueCaptureDescriptorDataEXT,
        vkGetImageOpaqueCaptureDescriptorDataEXT,
        vkGetImageViewOpaqueCaptureDescriptorDataEXT,
        vkGetSamplerOpaqueCaptureDescriptorDataEXT,
        vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;

    /** Function pointers for EXT_device_fault */
    public final long
        vkGetDeviceFaultInfoEXT;

    /** Function pointers for EXT_device_generated_commands */
    public final long
        vkGetGeneratedCommandsMemoryRequirementsEXT,
        vkCmdPreprocessGeneratedCommandsEXT,
        vkCmdExecuteGeneratedCommandsEXT,
        vkCreateIndirectCommandsLayoutEXT,
        vkDestroyIndirectCommandsLayoutEXT,
        vkCreateIndirectExecutionSetEXT,
        vkDestroyIndirectExecutionSetEXT,
        vkUpdateIndirectExecutionSetPipelineEXT,
        vkUpdateIndirectExecutionSetShaderEXT;

    /** Function pointers for EXT_discard_rectangles */
    public final long
        vkCmdSetDiscardRectangleEXT,
        vkCmdSetDiscardRectangleEnableEXT,
        vkCmdSetDiscardRectangleModeEXT;

    /** Function pointers for EXT_display_control */
    public final long
        vkDisplayPowerControlEXT,
        vkRegisterDeviceEventEXT,
        vkRegisterDisplayEventEXT,
        vkGetSwapchainCounterEXT;

    /** Function pointers for EXT_extended_dynamic_state */
    public final long
        vkCmdSetCullModeEXT,
        vkCmdSetFrontFaceEXT,
        vkCmdSetPrimitiveTopologyEXT,
        vkCmdSetViewportWithCountEXT,
        vkCmdSetScissorWithCountEXT,
        vkCmdBindVertexBuffers2EXT,
        vkCmdSetDepthTestEnableEXT,
        vkCmdSetDepthWriteEnableEXT,
        vkCmdSetDepthCompareOpEXT,
        vkCmdSetDepthBoundsTestEnableEXT,
        vkCmdSetStencilTestEnableEXT,
        vkCmdSetStencilOpEXT;

    /** Function pointers for EXT_extended_dynamic_state2 */
    public final long
        vkCmdSetPatchControlPointsEXT,
        vkCmdSetRasterizerDiscardEnableEXT,
        vkCmdSetDepthBiasEnableEXT,
        vkCmdSetLogicOpEXT,
        vkCmdSetPrimitiveRestartEnableEXT;

    /** Function pointers for EXT_extended_dynamic_state3 */
    public final long
        vkCmdSetDepthClampEnableEXT,
        vkCmdSetPolygonModeEXT,
        vkCmdSetRasterizationSamplesEXT,
        vkCmdSetSampleMaskEXT,
        vkCmdSetAlphaToCoverageEnableEXT,
        vkCmdSetAlphaToOneEnableEXT,
        vkCmdSetLogicOpEnableEXT,
        vkCmdSetColorBlendEnableEXT,
        vkCmdSetColorBlendEquationEXT,
        vkCmdSetColorWriteMaskEXT,
        vkCmdSetTessellationDomainOriginEXT,
        vkCmdSetRasterizationStreamEXT,
        vkCmdSetConservativeRasterizationModeEXT,
        vkCmdSetExtraPrimitiveOverestimationSizeEXT,
        vkCmdSetDepthClipEnableEXT,
        vkCmdSetSampleLocationsEnableEXT,
        vkCmdSetColorBlendAdvancedEXT,
        vkCmdSetProvokingVertexModeEXT,
        vkCmdSetLineRasterizationModeEXT,
        vkCmdSetLineStippleEnableEXT,
        vkCmdSetDepthClipNegativeOneToOneEXT,
        vkCmdSetViewportWScalingEnableNV,
        vkCmdSetViewportSwizzleNV,
        vkCmdSetCoverageToColorEnableNV,
        vkCmdSetCoverageToColorLocationNV,
        vkCmdSetCoverageModulationModeNV,
        vkCmdSetCoverageModulationTableEnableNV,
        vkCmdSetCoverageModulationTableNV,
        vkCmdSetShadingRateImageEnableNV,
        vkCmdSetRepresentativeFragmentTestEnableNV,
        vkCmdSetCoverageReductionModeNV;

    /** Function pointers for EXT_external_memory_host */
    public final long
        vkGetMemoryHostPointerPropertiesEXT;

    /** Function pointers for EXT_external_memory_metal */
    public final long
        vkGetMemoryMetalHandleEXT,
        vkGetMemoryMetalHandlePropertiesEXT;

    /** Function pointers for EXT_full_screen_exclusive */
    public final long
        vkAcquireFullScreenExclusiveModeEXT,
        vkReleaseFullScreenExclusiveModeEXT,
        vkGetDeviceGroupSurfacePresentModes2EXT;

    /** Function pointers for EXT_hdr_metadata */
    public final long
        vkSetHdrMetadataEXT;

    /** Function pointers for EXT_host_image_copy */
    public final long
        vkCopyMemoryToImageEXT,
        vkCopyImageToMemoryEXT,
        vkCopyImageToImageEXT,
        vkTransitionImageLayoutEXT,
        vkGetImageSubresourceLayout2EXT;

    /** Function pointers for EXT_host_query_reset */
    public final long
        vkResetQueryPoolEXT;

    /** Function pointers for EXT_image_drm_format_modifier */
    public final long
        vkGetImageDrmFormatModifierPropertiesEXT;

    /** Function pointers for EXT_line_rasterization */
    public final long
        vkCmdSetLineStippleEXT;

    /** Function pointers for EXT_mesh_shader */
    public final long
        vkCmdDrawMeshTasksEXT,
        vkCmdDrawMeshTasksIndirectEXT,
        vkCmdDrawMeshTasksIndirectCountEXT;

    /** Function pointers for EXT_metal_objects */
    public final long
        vkExportMetalObjectsEXT;

    /** Function pointers for EXT_multi_draw */
    public final long
        vkCmdDrawMultiEXT,
        vkCmdDrawMultiIndexedEXT;

    /** Function pointers for EXT_opacity_micromap */
    public final long
        vkCreateMicromapEXT,
        vkDestroyMicromapEXT,
        vkCmdBuildMicromapsEXT,
        vkBuildMicromapsEXT,
        vkCopyMicromapEXT,
        vkCopyMicromapToMemoryEXT,
        vkCopyMemoryToMicromapEXT,
        vkWriteMicromapsPropertiesEXT,
        vkCmdCopyMicromapEXT,
        vkCmdCopyMicromapToMemoryEXT,
        vkCmdCopyMemoryToMicromapEXT,
        vkCmdWriteMicromapsPropertiesEXT,
        vkGetDeviceMicromapCompatibilityEXT,
        vkGetMicromapBuildSizesEXT;

    /** Function pointers for EXT_pageable_device_local_memory */
    public final long
        vkSetDeviceMemoryPriorityEXT;

    /** Function pointers for EXT_pipeline_properties */
    public final long
        vkGetPipelinePropertiesEXT;

    /** Function pointers for EXT_private_data */
    public final long
        vkCreatePrivateDataSlotEXT,
        vkDestroyPrivateDataSlotEXT,
        vkSetPrivateDataEXT,
        vkGetPrivateDataEXT;

    /** Function pointers for EXT_sample_locations */
    public final long
        vkCmdSetSampleLocationsEXT;

    /** Function pointers for EXT_shader_module_identifier */
    public final long
        vkGetShaderModuleIdentifierEXT,
        vkGetShaderModuleCreateInfoIdentifierEXT;

    /** Function pointers for EXT_shader_object */
    public final long
        vkCreateShadersEXT,
        vkDestroyShaderEXT,
        vkGetShaderBinaryDataEXT,
        vkCmdBindShadersEXT,
        vkCmdSetVertexInputEXT;

    /** Function pointers for EXT_swapchain_maintenance1 */
    public final long
        vkReleaseSwapchainImagesEXT;

    /** Function pointers for EXT_transform_feedback */
    public final long
        vkCmdBindTransformFeedbackBuffersEXT,
        vkCmdBeginTransformFeedbackEXT,
        vkCmdEndTransformFeedbackEXT,
        vkCmdBeginQueryIndexedEXT,
        vkCmdEndQueryIndexedEXT,
        vkCmdDrawIndirectByteCountEXT;

    /** Function pointers for EXT_validation_cache */
    public final long
        vkCreateValidationCacheEXT,
        vkDestroyValidationCacheEXT,
        vkMergeValidationCachesEXT,
        vkGetValidationCacheDataEXT;

    /** Function pointers for GOOGLE_display_timing */
    public final long
        vkGetRefreshCycleDurationGOOGLE,
        vkGetPastPresentationTimingGOOGLE;

    /** Function pointers for HUAWEI_cluster_culling_shader */
    public final long
        vkCmdDrawClusterHUAWEI,
        vkCmdDrawClusterIndirectHUAWEI;

    /** Function pointers for HUAWEI_invocation_mask */
    public final long
        vkCmdBindInvocationMaskHUAWEI;

    /** Function pointers for HUAWEI_subpass_shading */
    public final long
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI,
        vkCmdSubpassShadingHUAWEI;

    /** Function pointers for INTEL_performance_query */
    public final long
        vkInitializePerformanceApiINTEL,
        vkUninitializePerformanceApiINTEL,
        vkCmdSetPerformanceMarkerINTEL,
        vkCmdSetPerformanceStreamMarkerINTEL,
        vkCmdSetPerformanceOverrideINTEL,
        vkAcquirePerformanceConfigurationINTEL,
        vkReleasePerformanceConfigurationINTEL,
        vkQueueSetPerformanceConfigurationINTEL,
        vkGetPerformanceParameterINTEL;

    /** Function pointers for KHR_acceleration_structure */
    public final long
        vkCreateAccelerationStructureKHR,
        vkDestroyAccelerationStructureKHR,
        vkCmdBuildAccelerationStructuresKHR,
        vkCmdBuildAccelerationStructuresIndirectKHR,
        vkBuildAccelerationStructuresKHR,
        vkCopyAccelerationStructureKHR,
        vkCopyAccelerationStructureToMemoryKHR,
        vkCopyMemoryToAccelerationStructureKHR,
        vkWriteAccelerationStructuresPropertiesKHR,
        vkCmdCopyAccelerationStructureKHR,
        vkCmdCopyAccelerationStructureToMemoryKHR,
        vkCmdCopyMemoryToAccelerationStructureKHR,
        vkGetAccelerationStructureDeviceAddressKHR,
        vkCmdWriteAccelerationStructuresPropertiesKHR,
        vkGetDeviceAccelerationStructureCompatibilityKHR,
        vkGetAccelerationStructureBuildSizesKHR;

    /** Function pointers for KHR_bind_memory2 */
    public final long
        vkBindBufferMemory2KHR,
        vkBindImageMemory2KHR;

    /** Function pointers for KHR_buffer_device_address */
    public final long
        vkGetBufferDeviceAddressKHR,
        vkGetBufferOpaqueCaptureAddressKHR,
        vkGetDeviceMemoryOpaqueCaptureAddressKHR;

    /** Function pointers for KHR_calibrated_timestamps */
    public final long
        vkGetCalibratedTimestampsKHR;

    /** Function pointers for KHR_copy_commands2 */
    public final long
        vkCmdCopyBuffer2KHR,
        vkCmdCopyImage2KHR,
        vkCmdCopyBufferToImage2KHR,
        vkCmdCopyImageToBuffer2KHR,
        vkCmdBlitImage2KHR,
        vkCmdResolveImage2KHR;

    /** Function pointers for KHR_create_renderpass2 */
    public final long
        vkCreateRenderPass2KHR,
        vkCmdBeginRenderPass2KHR,
        vkCmdNextSubpass2KHR,
        vkCmdEndRenderPass2KHR;

    /** Function pointers for KHR_deferred_host_operations */
    public final long
        vkCreateDeferredOperationKHR,
        vkDestroyDeferredOperationKHR,
        vkGetDeferredOperationMaxConcurrencyKHR,
        vkGetDeferredOperationResultKHR,
        vkDeferredOperationJoinKHR;

    /** Function pointers for KHR_descriptor_update_template */
    public final long
        vkCreateDescriptorUpdateTemplateKHR,
        vkDestroyDescriptorUpdateTemplateKHR,
        vkUpdateDescriptorSetWithTemplateKHR,
        vkCmdPushDescriptorSetWithTemplateKHR;

    /** Function pointers for KHR_device_group */
    public final long
        vkGetDeviceGroupPeerMemoryFeaturesKHR,
        vkCmdSetDeviceMaskKHR,
        vkCmdDispatchBaseKHR,
        vkGetDeviceGroupPresentCapabilitiesKHR,
        vkGetDeviceGroupSurfacePresentModesKHR,
        vkAcquireNextImage2KHR;

    /** Function pointers for KHR_display_swapchain */
    public final long
        vkCreateSharedSwapchainsKHR;

    /** Function pointers for KHR_draw_indirect_count */
    public final long
        vkCmdDrawIndirectCountKHR,
        vkCmdDrawIndexedIndirectCountKHR;

    /** Function pointers for KHR_dynamic_rendering */
    public final long
        vkCmdBeginRenderingKHR,
        vkCmdEndRenderingKHR;

    /** Function pointers for KHR_dynamic_rendering_local_read */
    public final long
        vkCmdSetRenderingAttachmentLocationsKHR,
        vkCmdSetRenderingInputAttachmentIndicesKHR;

    /** Function pointers for KHR_external_fence_fd */
    public final long
        vkImportFenceFdKHR,
        vkGetFenceFdKHR;

    /** Function pointers for KHR_external_fence_win32 */
    public final long
        vkImportFenceWin32HandleKHR,
        vkGetFenceWin32HandleKHR;

    /** Function pointers for KHR_external_memory_fd */
    public final long
        vkGetMemoryFdKHR,
        vkGetMemoryFdPropertiesKHR;

    /** Function pointers for KHR_external_memory_win32 */
    public final long
        vkGetMemoryWin32HandleKHR,
        vkGetMemoryWin32HandlePropertiesKHR;

    /** Function pointers for KHR_external_semaphore_fd */
    public final long
        vkImportSemaphoreFdKHR,
        vkGetSemaphoreFdKHR;

    /** Function pointers for KHR_external_semaphore_win32 */
    public final long
        vkImportSemaphoreWin32HandleKHR,
        vkGetSemaphoreWin32HandleKHR;

    /** Function pointers for KHR_fragment_shading_rate */
    public final long
        vkCmdSetFragmentShadingRateKHR;

    /** Function pointers for KHR_get_memory_requirements2 */
    public final long
        vkGetImageMemoryRequirements2KHR,
        vkGetBufferMemoryRequirements2KHR,
        vkGetImageSparseMemoryRequirements2KHR;

    /** Function pointers for KHR_line_rasterization */
    public final long
        vkCmdSetLineStippleKHR;

    /** Function pointers for KHR_maintenance1 */
    public final long
        vkTrimCommandPoolKHR;

    /** Function pointers for KHR_maintenance3 */
    public final long
        vkGetDescriptorSetLayoutSupportKHR;

    /** Function pointers for KHR_maintenance4 */
    public final long
        vkGetDeviceBufferMemoryRequirementsKHR,
        vkGetDeviceImageMemoryRequirementsKHR,
        vkGetDeviceImageSparseMemoryRequirementsKHR;

    /** Function pointers for KHR_maintenance5 */
    public final long
        vkCmdBindIndexBuffer2KHR,
        vkGetRenderingAreaGranularityKHR,
        vkGetDeviceImageSubresourceLayoutKHR,
        vkGetImageSubresourceLayout2KHR;

    /** Function pointers for KHR_maintenance6 */
    public final long
        vkCmdBindDescriptorSets2KHR,
        vkCmdPushConstants2KHR,
        vkCmdPushDescriptorSet2KHR,
        vkCmdPushDescriptorSetWithTemplate2KHR,
        vkCmdSetDescriptorBufferOffsets2EXT,
        vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;

    /** Function pointers for KHR_map_memory2 */
    public final long
        vkMapMemory2KHR,
        vkUnmapMemory2KHR;

    /** Function pointers for KHR_performance_query */
    public final long
        vkAcquireProfilingLockKHR,
        vkReleaseProfilingLockKHR;

    /** Function pointers for KHR_pipeline_binary */
    public final long
        vkCreatePipelineBinariesKHR,
        vkDestroyPipelineBinaryKHR,
        vkGetPipelineKeyKHR,
        vkGetPipelineBinaryDataKHR,
        vkReleaseCapturedPipelineDataKHR;

    /** Function pointers for KHR_pipeline_executable_properties */
    public final long
        vkGetPipelineExecutablePropertiesKHR,
        vkGetPipelineExecutableStatisticsKHR,
        vkGetPipelineExecutableInternalRepresentationsKHR;

    /** Function pointers for KHR_present_wait */
    public final long
        vkWaitForPresentKHR;

    /** Function pointers for KHR_push_descriptor */
    public final long
        vkCmdPushDescriptorSetKHR;

    /** Function pointers for KHR_ray_tracing_maintenance1 */
    public final long
        vkCmdTraceRaysIndirect2KHR;

    /** Function pointers for KHR_ray_tracing_pipeline */
    public final long
        vkCmdTraceRaysKHR,
        vkCreateRayTracingPipelinesKHR,
        vkGetRayTracingShaderGroupHandlesKHR,
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR,
        vkCmdTraceRaysIndirectKHR,
        vkGetRayTracingShaderGroupStackSizeKHR,
        vkCmdSetRayTracingPipelineStackSizeKHR;

    /** Function pointers for KHR_sampler_ycbcr_conversion */
    public final long
        vkCreateSamplerYcbcrConversionKHR,
        vkDestroySamplerYcbcrConversionKHR;

    /** Function pointers for KHR_shared_presentable_image */
    public final long
        vkGetSwapchainStatusKHR;

    /** Function pointers for KHR_swapchain */
    public final long
        vkCreateSwapchainKHR,
        vkDestroySwapchainKHR,
        vkGetSwapchainImagesKHR,
        vkAcquireNextImageKHR,
        vkQueuePresentKHR;

    /** Function pointers for KHR_synchronization2 */
    public final long
        vkCmdSetEvent2KHR,
        vkCmdResetEvent2KHR,
        vkCmdWaitEvents2KHR,
        vkCmdPipelineBarrier2KHR,
        vkCmdWriteTimestamp2KHR,
        vkQueueSubmit2KHR;

    /** Function pointers for KHR_timeline_semaphore */
    public final long
        vkGetSemaphoreCounterValueKHR,
        vkWaitSemaphoresKHR,
        vkSignalSemaphoreKHR;

    /** Function pointers for KHR_video_decode_queue */
    public final long
        vkCmdDecodeVideoKHR;

    /** Function pointers for KHR_video_encode_queue */
    public final long
        vkGetEncodedVideoSessionParametersKHR,
        vkCmdEncodeVideoKHR;

    /** Function pointers for KHR_video_queue */
    public final long
        vkCreateVideoSessionKHR,
        vkDestroyVideoSessionKHR,
        vkGetVideoSessionMemoryRequirementsKHR,
        vkBindVideoSessionMemoryKHR,
        vkCreateVideoSessionParametersKHR,
        vkUpdateVideoSessionParametersKHR,
        vkDestroyVideoSessionParametersKHR,
        vkCmdBeginVideoCodingKHR,
        vkCmdEndVideoCodingKHR,
        vkCmdControlVideoCodingKHR;

    /** Function pointers for NV_clip_space_w_scaling */
    public final long
        vkCmdSetViewportWScalingNV;

    /** Function pointers for NV_cluster_acceleration_structure */
    public final long
        vkGetClusterAccelerationStructureBuildSizesNV,
        vkCmdBuildClusterAccelerationStructureIndirectNV;

    /** Function pointers for NV_cooperative_vector */
    public final long
        vkConvertCooperativeVectorMatrixNV,
        vkCmdConvertCooperativeVectorMatrixNV;

    /** Function pointers for NV_copy_memory_indirect */
    public final long
        vkCmdCopyMemoryIndirectNV,
        vkCmdCopyMemoryToImageIndirectNV;

    /** Function pointers for NV_cuda_kernel_launch */
    public final long
        vkCreateCudaModuleNV,
        vkGetCudaModuleCacheNV,
        vkCreateCudaFunctionNV,
        vkDestroyCudaModuleNV,
        vkDestroyCudaFunctionNV,
        vkCmdCudaLaunchKernelNV;

    /** Function pointers for NV_device_diagnostic_checkpoints */
    public final long
        vkCmdSetCheckpointNV,
        vkGetQueueCheckpointDataNV,
        vkGetQueueCheckpointData2NV;

    /** Function pointers for NV_device_generated_commands */
    public final long
        vkGetGeneratedCommandsMemoryRequirementsNV,
        vkCmdPreprocessGeneratedCommandsNV,
        vkCmdExecuteGeneratedCommandsNV,
        vkCmdBindPipelineShaderGroupNV,
        vkCreateIndirectCommandsLayoutNV,
        vkDestroyIndirectCommandsLayoutNV;

    /** Function pointers for NV_device_generated_commands_compute */
    public final long
        vkGetPipelineIndirectMemoryRequirementsNV,
        vkCmdUpdatePipelineIndirectBufferNV,
        vkGetPipelineIndirectDeviceAddressNV;

    /** Function pointers for NV_external_memory_rdma */
    public final long
        vkGetMemoryRemoteAddressNV;

    /** Function pointers for NV_external_memory_win32 */
    public final long
        vkGetMemoryWin32HandleNV;

    /** Function pointers for NV_fragment_shading_rate_enums */
    public final long
        vkCmdSetFragmentShadingRateEnumNV;

    /** Function pointers for NV_low_latency2 */
    public final long
        vkSetLatencySleepModeNV,
        vkLatencySleepNV,
        vkSetLatencyMarkerNV,
        vkGetLatencyTimingsNV,
        vkQueueNotifyOutOfBandNV;

    /** Function pointers for NV_memory_decompression */
    public final long
        vkCmdDecompressMemoryNV,
        vkCmdDecompressMemoryIndirectCountNV;

    /** Function pointers for NV_mesh_shader */
    public final long
        vkCmdDrawMeshTasksNV,
        vkCmdDrawMeshTasksIndirectNV,
        vkCmdDrawMeshTasksIndirectCountNV;

    /** Function pointers for NV_optical_flow */
    public final long
        vkCreateOpticalFlowSessionNV,
        vkDestroyOpticalFlowSessionNV,
        vkBindOpticalFlowSessionImageNV,
        vkCmdOpticalFlowExecuteNV;

    /** Function pointers for NV_partitioned_acceleration_structure */
    public final long
        vkGetPartitionedAccelerationStructuresBuildSizesNV,
        vkCmdBuildPartitionedAccelerationStructuresNV;

    /** Function pointers for NV_ray_tracing */
    public final long
        vkCreateAccelerationStructureNV,
        vkDestroyAccelerationStructureNV,
        vkGetAccelerationStructureMemoryRequirementsNV,
        vkBindAccelerationStructureMemoryNV,
        vkCmdBuildAccelerationStructureNV,
        vkCmdCopyAccelerationStructureNV,
        vkCmdTraceRaysNV,
        vkCreateRayTracingPipelinesNV,
        vkGetRayTracingShaderGroupHandlesNV,
        vkGetAccelerationStructureHandleNV,
        vkCmdWriteAccelerationStructuresPropertiesNV,
        vkCompileDeferredNV;

    /** Function pointers for NV_scissor_exclusive */
    public final long
        vkCmdSetExclusiveScissorEnableNV,
        vkCmdSetExclusiveScissorNV;

    /** Function pointers for NV_shading_rate_image */
    public final long
        vkCmdBindShadingRateImageNV,
        vkCmdSetViewportShadingRatePaletteNV,
        vkCmdSetCoarseSampleOrderNV;

    /** Function pointers for NVX_binary_import */
    public final long
        vkCreateCuModuleNVX,
        vkCreateCuFunctionNVX,
        vkDestroyCuModuleNVX,
        vkDestroyCuFunctionNVX,
        vkCmdCuLaunchKernelNVX;

    /** Function pointers for NVX_image_view_handle */
    public final long
        vkGetImageViewHandleNVX,
        vkGetImageViewHandle64NVX,
        vkGetImageViewAddressNVX;

    /** Function pointers for QCOM_tile_properties */
    public final long
        vkGetFramebufferTilePropertiesQCOM,
        vkGetDynamicRenderingTilePropertiesQCOM;

    /** Function pointers for VALVE_descriptor_set_host_mapping */
    public final long
        vkGetDescriptorSetLayoutHostMappingInfoVALVE,
        vkGetDescriptorSetHostMappingVALVE;

    /** The Vulkan API version number. */
    public final int apiVersion;

    /** When true, {@code VK10} is supported. */
    public final boolean Vulkan10;
    /** When true, {@code VK11} is supported. */
    public final boolean Vulkan11;
    /** When true, {@code VK12} is supported. */
    public final boolean Vulkan12;
    /** When true, {@code VK13} is supported. */
    public final boolean Vulkan13;
    /** When true, {@code VK14} is supported. */
    public final boolean Vulkan14;
    /** When true, {@code AMD_anti_lag} is supported. */
    public final boolean VK_AMD_anti_lag;
    /** When true, {@code AMD_buffer_marker} is supported. */
    public final boolean VK_AMD_buffer_marker;
    /** When true, {@code AMD_device_coherent_memory} is supported. */
    public final boolean VK_AMD_device_coherent_memory;
    /** When true, {@code AMD_display_native_hdr} is supported. */
    public final boolean VK_AMD_display_native_hdr;
    /** When true, {@code AMD_draw_indirect_count} is supported. */
    public final boolean VK_AMD_draw_indirect_count;
    /** When true, {@code AMD_gcn_shader} is supported. */
    public final boolean VK_AMD_gcn_shader;
    /** When true, {@code AMD_gpu_shader_half_float} is supported. */
    public final boolean VK_AMD_gpu_shader_half_float;
    /** When true, {@code AMD_gpu_shader_int16} is supported. */
    public final boolean VK_AMD_gpu_shader_int16;
    /** When true, {@code AMD_memory_overallocation_behavior} is supported. */
    public final boolean VK_AMD_memory_overallocation_behavior;
    /** When true, {@code AMD_mixed_attachment_samples} is supported. */
    public final boolean VK_AMD_mixed_attachment_samples;
    /** When true, {@code AMD_negative_viewport_height} is supported. */
    public final boolean VK_AMD_negative_viewport_height;
    /** When true, {@code AMD_pipeline_compiler_control} is supported. */
    public final boolean VK_AMD_pipeline_compiler_control;
    /** When true, {@code AMD_rasterization_order} is supported. */
    public final boolean VK_AMD_rasterization_order;
    /** When true, {@code AMD_shader_ballot} is supported. */
    public final boolean VK_AMD_shader_ballot;
    /** When true, {@code AMD_shader_core_properties} is supported. */
    public final boolean VK_AMD_shader_core_properties;
    /** When true, {@code AMD_shader_core_properties2} is supported. */
    public final boolean VK_AMD_shader_core_properties2;
    /** When true, {@code AMD_shader_early_and_late_fragment_tests} is supported. */
    public final boolean VK_AMD_shader_early_and_late_fragment_tests;
    /** When true, {@code AMD_shader_explicit_vertex_parameter} is supported. */
    public final boolean VK_AMD_shader_explicit_vertex_parameter;
    /** When true, {@code AMD_shader_fragment_mask} is supported. */
    public final boolean VK_AMD_shader_fragment_mask;
    /** When true, {@code AMD_shader_image_load_store_lod} is supported. */
    public final boolean VK_AMD_shader_image_load_store_lod;
    /** When true, {@code AMD_shader_info} is supported. */
    public final boolean VK_AMD_shader_info;
    /** When true, {@code AMD_shader_trinary_minmax} is supported. */
    public final boolean VK_AMD_shader_trinary_minmax;
    /** When true, {@code AMD_texture_gather_bias_lod} is supported. */
    public final boolean VK_AMD_texture_gather_bias_lod;
    /** When true, {@code AMDX_shader_enqueue} is supported. */
    public final boolean VK_AMDX_shader_enqueue;
    /** When true, {@code ANDROID_external_format_resolve} is supported. */
    public final boolean VK_ANDROID_external_format_resolve;
    /** When true, {@code ANDROID_external_memory_android_hardware_buffer} is supported. */
    public final boolean VK_ANDROID_external_memory_android_hardware_buffer;
    /** When true, {@code ARM_pipeline_opacity_micromap} is supported. */
    public final boolean VK_ARM_pipeline_opacity_micromap;
    /** When true, {@code ARM_rasterization_order_attachment_access} is supported. */
    public final boolean VK_ARM_rasterization_order_attachment_access;
    /** When true, {@code ARM_render_pass_striped} is supported. */
    public final boolean VK_ARM_render_pass_striped;
    /** When true, {@code ARM_scheduling_controls} is supported. */
    public final boolean VK_ARM_scheduling_controls;
    /** When true, {@code ARM_shader_core_builtins} is supported. */
    public final boolean VK_ARM_shader_core_builtins;
    /** When true, {@code ARM_shader_core_properties} is supported. */
    public final boolean VK_ARM_shader_core_properties;
    /** When true, {@code EXT_4444_formats} is supported. */
    public final boolean VK_EXT_4444_formats;
    /** When true, {@code EXT_astc_decode_mode} is supported. */
    public final boolean VK_EXT_astc_decode_mode;
    /** When true, {@code EXT_attachment_feedback_loop_dynamic_state} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_dynamic_state;
    /** When true, {@code EXT_attachment_feedback_loop_layout} is supported. */
    public final boolean VK_EXT_attachment_feedback_loop_layout;
    /** When true, {@code EXT_blend_operation_advanced} is supported. */
    public final boolean VK_EXT_blend_operation_advanced;
    /** When true, {@code EXT_border_color_swizzle} is supported. */
    public final boolean VK_EXT_border_color_swizzle;
    /** When true, {@code EXT_buffer_device_address} is supported. */
    public final boolean VK_EXT_buffer_device_address;
    /** When true, {@code EXT_calibrated_timestamps} is supported. */
    public final boolean VK_EXT_calibrated_timestamps;
    /** When true, {@code EXT_color_write_enable} is supported. */
    public final boolean VK_EXT_color_write_enable;
    /** When true, {@code EXT_conditional_rendering} is supported. */
    public final boolean VK_EXT_conditional_rendering;
    /** When true, {@code EXT_conservative_rasterization} is supported. */
    public final boolean VK_EXT_conservative_rasterization;
    /** When true, {@code EXT_custom_border_color} is supported. */
    public final boolean VK_EXT_custom_border_color;
    /** When true, {@code EXT_debug_marker} is supported. */
    public final boolean VK_EXT_debug_marker;
    /** When true, {@code EXT_depth_bias_control} is supported. */
    public final boolean VK_EXT_depth_bias_control;
    /** When true, {@code EXT_depth_clamp_control} is supported. */
    public final boolean VK_EXT_depth_clamp_control;
    /** When true, {@code EXT_depth_clamp_zero_one} is supported. */
    public final boolean VK_EXT_depth_clamp_zero_one;
    /** When true, {@code EXT_depth_clip_control} is supported. */
    public final boolean VK_EXT_depth_clip_control;
    /** When true, {@code EXT_depth_clip_enable} is supported. */
    public final boolean VK_EXT_depth_clip_enable;
    /** When true, {@code EXT_depth_range_unrestricted} is supported. */
    public final boolean VK_EXT_depth_range_unrestricted;
    /** When true, {@code EXT_descriptor_buffer} is supported. */
    public final boolean VK_EXT_descriptor_buffer;
    /** When true, {@code EXT_descriptor_indexing} is supported. */
    public final boolean VK_EXT_descriptor_indexing;
    /** When true, {@code EXT_device_address_binding_report} is supported. */
    public final boolean VK_EXT_device_address_binding_report;
    /** When true, {@code EXT_device_fault} is supported. */
    public final boolean VK_EXT_device_fault;
    /** When true, {@code EXT_device_generated_commands} is supported. */
    public final boolean VK_EXT_device_generated_commands;
    /** When true, {@code EXT_device_memory_report} is supported. */
    public final boolean VK_EXT_device_memory_report;
    /** When true, {@code EXT_discard_rectangles} is supported. */
    public final boolean VK_EXT_discard_rectangles;
    /** When true, {@code EXT_display_control} is supported. */
    public final boolean VK_EXT_display_control;
    /** When true, {@code EXT_dynamic_rendering_unused_attachments} is supported. */
    public final boolean VK_EXT_dynamic_rendering_unused_attachments;
    /** When true, {@code EXT_extended_dynamic_state} is supported. */
    public final boolean VK_EXT_extended_dynamic_state;
    /** When true, {@code EXT_extended_dynamic_state2} is supported. */
    public final boolean VK_EXT_extended_dynamic_state2;
    /** When true, {@code EXT_extended_dynamic_state3} is supported. */
    public final boolean VK_EXT_extended_dynamic_state3;
    /** When true, {@code EXT_external_memory_acquire_unmodified} is supported. */
    public final boolean VK_EXT_external_memory_acquire_unmodified;
    /** When true, {@code EXT_external_memory_dma_buf} is supported. */
    public final boolean VK_EXT_external_memory_dma_buf;
    /** When true, {@code EXT_external_memory_host} is supported. */
    public final boolean VK_EXT_external_memory_host;
    /** When true, {@code EXT_external_memory_metal} is supported. */
    public final boolean VK_EXT_external_memory_metal;
    /** When true, {@code EXT_filter_cubic} is supported. */
    public final boolean VK_EXT_filter_cubic;
    /** When true, {@code EXT_fragment_density_map} is supported. */
    public final boolean VK_EXT_fragment_density_map;
    /** When true, {@code EXT_fragment_density_map2} is supported. */
    public final boolean VK_EXT_fragment_density_map2;
    /** When true, {@code EXT_fragment_shader_interlock} is supported. */
    public final boolean VK_EXT_fragment_shader_interlock;
    /** When true, {@code EXT_frame_boundary} is supported. */
    public final boolean VK_EXT_frame_boundary;
    /** When true, {@code EXT_full_screen_exclusive} is supported. */
    public final boolean VK_EXT_full_screen_exclusive;
    /** When true, {@code EXT_global_priority} is supported. */
    public final boolean VK_EXT_global_priority;
    /** When true, {@code EXT_global_priority_query} is supported. */
    public final boolean VK_EXT_global_priority_query;
    /** When true, {@code EXT_graphics_pipeline_library} is supported. */
    public final boolean VK_EXT_graphics_pipeline_library;
    /** When true, {@code EXT_hdr_metadata} is supported. */
    public final boolean VK_EXT_hdr_metadata;
    /** When true, {@code EXT_host_image_copy} is supported. */
    public final boolean VK_EXT_host_image_copy;
    /** When true, {@code EXT_host_query_reset} is supported. */
    public final boolean VK_EXT_host_query_reset;
    /** When true, {@code EXT_image_2d_view_of_3d} is supported. */
    public final boolean VK_EXT_image_2d_view_of_3d;
    /** When true, {@code EXT_image_compression_control} is supported. */
    public final boolean VK_EXT_image_compression_control;
    /** When true, {@code EXT_image_compression_control_swapchain} is supported. */
    public final boolean VK_EXT_image_compression_control_swapchain;
    /** When true, {@code EXT_image_drm_format_modifier} is supported. */
    public final boolean VK_EXT_image_drm_format_modifier;
    /** When true, {@code EXT_image_robustness} is supported. */
    public final boolean VK_EXT_image_robustness;
    /** When true, {@code EXT_image_sliced_view_of_3d} is supported. */
    public final boolean VK_EXT_image_sliced_view_of_3d;
    /** When true, {@code EXT_image_view_min_lod} is supported. */
    public final boolean VK_EXT_image_view_min_lod;
    /** When true, {@code EXT_index_type_uint8} is supported. */
    public final boolean VK_EXT_index_type_uint8;
    /** When true, {@code EXT_inline_uniform_block} is supported. */
    public final boolean VK_EXT_inline_uniform_block;
    /** When true, {@code EXT_legacy_dithering} is supported. */
    public final boolean VK_EXT_legacy_dithering;
    /** When true, {@code EXT_legacy_vertex_attributes} is supported. */
    public final boolean VK_EXT_legacy_vertex_attributes;
    /** When true, {@code EXT_line_rasterization} is supported. */
    public final boolean VK_EXT_line_rasterization;
    /** When true, {@code EXT_load_store_op_none} is supported. */
    public final boolean VK_EXT_load_store_op_none;
    /** When true, {@code EXT_map_memory_placed} is supported. */
    public final boolean VK_EXT_map_memory_placed;
    /** When true, {@code EXT_memory_budget} is supported. */
    public final boolean VK_EXT_memory_budget;
    /** When true, {@code EXT_memory_priority} is supported. */
    public final boolean VK_EXT_memory_priority;
    /** When true, {@code EXT_mesh_shader} is supported. */
    public final boolean VK_EXT_mesh_shader;
    /** When true, {@code EXT_metal_objects} is supported. */
    public final boolean VK_EXT_metal_objects;
    /** When true, {@code EXT_multi_draw} is supported. */
    public final boolean VK_EXT_multi_draw;
    /** When true, {@code EXT_multisampled_render_to_single_sampled} is supported. */
    public final boolean VK_EXT_multisampled_render_to_single_sampled;
    /** When true, {@code EXT_mutable_descriptor_type} is supported. */
    public final boolean VK_EXT_mutable_descriptor_type;
    /** When true, {@code EXT_nested_command_buffer} is supported. */
    public final boolean VK_EXT_nested_command_buffer;
    /** When true, {@code EXT_non_seamless_cube_map} is supported. */
    public final boolean VK_EXT_non_seamless_cube_map;
    /** When true, {@code EXT_opacity_micromap} is supported. */
    public final boolean VK_EXT_opacity_micromap;
    /** When true, {@code EXT_pageable_device_local_memory} is supported. */
    public final boolean VK_EXT_pageable_device_local_memory;
    /** When true, {@code EXT_pci_bus_info} is supported. */
    public final boolean VK_EXT_pci_bus_info;
    /** When true, {@code EXT_physical_device_drm} is supported. */
    public final boolean VK_EXT_physical_device_drm;
    /** When true, {@code EXT_pipeline_creation_cache_control} is supported. */
    public final boolean VK_EXT_pipeline_creation_cache_control;
    /** When true, {@code EXT_pipeline_creation_feedback} is supported. */
    public final boolean VK_EXT_pipeline_creation_feedback;
    /** When true, {@code EXT_pipeline_library_group_handles} is supported. */
    public final boolean VK_EXT_pipeline_library_group_handles;
    /** When true, {@code EXT_pipeline_properties} is supported. */
    public final boolean VK_EXT_pipeline_properties;
    /** When true, {@code EXT_pipeline_protected_access} is supported. */
    public final boolean VK_EXT_pipeline_protected_access;
    /** When true, {@code EXT_pipeline_robustness} is supported. */
    public final boolean VK_EXT_pipeline_robustness;
    /** When true, {@code EXT_post_depth_coverage} is supported. */
    public final boolean VK_EXT_post_depth_coverage;
    /** When true, {@code EXT_present_mode_fifo_latest_ready} is supported. */
    public final boolean VK_EXT_present_mode_fifo_latest_ready;
    /** When true, {@code EXT_primitive_topology_list_restart} is supported. */
    public final boolean VK_EXT_primitive_topology_list_restart;
    /** When true, {@code EXT_primitives_generated_query} is supported. */
    public final boolean VK_EXT_primitives_generated_query;
    /** When true, {@code EXT_private_data} is supported. */
    public final boolean VK_EXT_private_data;
    /** When true, {@code EXT_provoking_vertex} is supported. */
    public final boolean VK_EXT_provoking_vertex;
    /** When true, {@code EXT_queue_family_foreign} is supported. */
    public final boolean VK_EXT_queue_family_foreign;
    /** When true, {@code EXT_rasterization_order_attachment_access} is supported. */
    public final boolean VK_EXT_rasterization_order_attachment_access;
    /** When true, {@code EXT_rgba10x6_formats} is supported. */
    public final boolean VK_EXT_rgba10x6_formats;
    /** When true, {@code EXT_robustness2} is supported. */
    public final boolean VK_EXT_robustness2;
    /** When true, {@code EXT_sample_locations} is supported. */
    public final boolean VK_EXT_sample_locations;
    /** When true, {@code EXT_sampler_filter_minmax} is supported. */
    public final boolean VK_EXT_sampler_filter_minmax;
    /** When true, {@code EXT_scalar_block_layout} is supported. */
    public final boolean VK_EXT_scalar_block_layout;
    /** When true, {@code EXT_separate_stencil_usage} is supported. */
    public final boolean VK_EXT_separate_stencil_usage;
    /** When true, {@code EXT_shader_atomic_float} is supported. */
    public final boolean VK_EXT_shader_atomic_float;
    /** When true, {@code EXT_shader_atomic_float2} is supported. */
    public final boolean VK_EXT_shader_atomic_float2;
    /** When true, {@code EXT_shader_demote_to_helper_invocation} is supported. */
    public final boolean VK_EXT_shader_demote_to_helper_invocation;
    /** When true, {@code EXT_shader_image_atomic_int64} is supported. */
    public final boolean VK_EXT_shader_image_atomic_int64;
    /** When true, {@code EXT_shader_module_identifier} is supported. */
    public final boolean VK_EXT_shader_module_identifier;
    /** When true, {@code EXT_shader_object} is supported. */
    public final boolean VK_EXT_shader_object;
    /** When true, {@code EXT_shader_replicated_composites} is supported. */
    public final boolean VK_EXT_shader_replicated_composites;
    /** When true, {@code EXT_shader_stencil_export} is supported. */
    public final boolean VK_EXT_shader_stencil_export;
    /** When true, {@code EXT_shader_subgroup_ballot} is supported. */
    public final boolean VK_EXT_shader_subgroup_ballot;
    /** When true, {@code EXT_shader_subgroup_vote} is supported. */
    public final boolean VK_EXT_shader_subgroup_vote;
    /** When true, {@code EXT_shader_tile_image} is supported. */
    public final boolean VK_EXT_shader_tile_image;
    /** When true, {@code EXT_shader_viewport_index_layer} is supported. */
    public final boolean VK_EXT_shader_viewport_index_layer;
    /** When true, {@code EXT_subgroup_size_control} is supported. */
    public final boolean VK_EXT_subgroup_size_control;
    /** When true, {@code EXT_subpass_merge_feedback} is supported. */
    public final boolean VK_EXT_subpass_merge_feedback;
    /** When true, {@code EXT_swapchain_maintenance1} is supported. */
    public final boolean VK_EXT_swapchain_maintenance1;
    /** When true, {@code EXT_texel_buffer_alignment} is supported. */
    public final boolean VK_EXT_texel_buffer_alignment;
    /** When true, {@code EXT_texture_compression_astc_hdr} is supported. */
    public final boolean VK_EXT_texture_compression_astc_hdr;
    /** When true, {@code EXT_tooling_info} is supported. */
    public final boolean VK_EXT_tooling_info;
    /** When true, {@code EXT_transform_feedback} is supported. */
    public final boolean VK_EXT_transform_feedback;
    /** When true, {@code EXT_validation_cache} is supported. */
    public final boolean VK_EXT_validation_cache;
    /** When true, {@code EXT_vertex_attribute_divisor} is supported. */
    public final boolean VK_EXT_vertex_attribute_divisor;
    /** When true, {@code EXT_vertex_attribute_robustness} is supported. */
    public final boolean VK_EXT_vertex_attribute_robustness;
    /** When true, {@code EXT_vertex_input_dynamic_state} is supported. */
    public final boolean VK_EXT_vertex_input_dynamic_state;
    /** When true, {@code EXT_ycbcr_2plane_444_formats} is supported. */
    public final boolean VK_EXT_ycbcr_2plane_444_formats;
    /** When true, {@code EXT_ycbcr_image_arrays} is supported. */
    public final boolean VK_EXT_ycbcr_image_arrays;
    /** When true, {@code GOOGLE_decorate_string} is supported. */
    public final boolean VK_GOOGLE_decorate_string;
    /** When true, {@code GOOGLE_display_timing} is supported. */
    public final boolean VK_GOOGLE_display_timing;
    /** When true, {@code GOOGLE_hlsl_functionality1} is supported. */
    public final boolean VK_GOOGLE_hlsl_functionality1;
    /** When true, {@code GOOGLE_user_type} is supported. */
    public final boolean VK_GOOGLE_user_type;
    /** When true, {@code HUAWEI_cluster_culling_shader} is supported. */
    public final boolean VK_HUAWEI_cluster_culling_shader;
    /** When true, {@code HUAWEI_hdr_vivid} is supported. */
    public final boolean VK_HUAWEI_hdr_vivid;
    /** When true, {@code HUAWEI_invocation_mask} is supported. */
    public final boolean VK_HUAWEI_invocation_mask;
    /** When true, {@code HUAWEI_subpass_shading} is supported. */
    public final boolean VK_HUAWEI_subpass_shading;
    /** When true, {@code IMG_filter_cubic} is supported. */
    public final boolean VK_IMG_filter_cubic;
    /** When true, {@code IMG_format_pvrtc} is supported. */
    public final boolean VK_IMG_format_pvrtc;
    /** When true, {@code IMG_relaxed_line_rasterization} is supported. */
    public final boolean VK_IMG_relaxed_line_rasterization;
    /** When true, {@code INTEL_performance_query} is supported. */
    public final boolean VK_INTEL_performance_query;
    /** When true, {@code INTEL_shader_integer_functions2} is supported. */
    public final boolean VK_INTEL_shader_integer_functions2;
    /** When true, {@code KHR_16bit_storage} is supported. */
    public final boolean VK_KHR_16bit_storage;
    /** When true, {@code KHR_8bit_storage} is supported. */
    public final boolean VK_KHR_8bit_storage;
    /** When true, {@code KHR_acceleration_structure} is supported. */
    public final boolean VK_KHR_acceleration_structure;
    /** When true, {@code KHR_bind_memory2} is supported. */
    public final boolean VK_KHR_bind_memory2;
    /** When true, {@code KHR_buffer_device_address} is supported. */
    public final boolean VK_KHR_buffer_device_address;
    /** When true, {@code KHR_calibrated_timestamps} is supported. */
    public final boolean VK_KHR_calibrated_timestamps;
    /** When true, {@code KHR_compute_shader_derivatives} is supported. */
    public final boolean VK_KHR_compute_shader_derivatives;
    /** When true, {@code KHR_cooperative_matrix} is supported. */
    public final boolean VK_KHR_cooperative_matrix;
    /** When true, {@code KHR_copy_commands2} is supported. */
    public final boolean VK_KHR_copy_commands2;
    /** When true, {@code KHR_create_renderpass2} is supported. */
    public final boolean VK_KHR_create_renderpass2;
    /** When true, {@code KHR_dedicated_allocation} is supported. */
    public final boolean VK_KHR_dedicated_allocation;
    /** When true, {@code KHR_deferred_host_operations} is supported. */
    public final boolean VK_KHR_deferred_host_operations;
    /** When true, {@code KHR_depth_clamp_zero_one} is supported. */
    public final boolean VK_KHR_depth_clamp_zero_one;
    /** When true, {@code KHR_depth_stencil_resolve} is supported. */
    public final boolean VK_KHR_depth_stencil_resolve;
    /** When true, {@code KHR_descriptor_update_template} is supported. */
    public final boolean VK_KHR_descriptor_update_template;
    /** When true, {@code KHR_device_group} is supported. */
    public final boolean VK_KHR_device_group;
    /** When true, {@code KHR_display_swapchain} is supported. */
    public final boolean VK_KHR_display_swapchain;
    /** When true, {@code KHR_draw_indirect_count} is supported. */
    public final boolean VK_KHR_draw_indirect_count;
    /** When true, {@code KHR_driver_properties} is supported. */
    public final boolean VK_KHR_driver_properties;
    /** When true, {@code KHR_dynamic_rendering} is supported. */
    public final boolean VK_KHR_dynamic_rendering;
    /** When true, {@code KHR_dynamic_rendering_local_read} is supported. */
    public final boolean VK_KHR_dynamic_rendering_local_read;
    /** When true, {@code KHR_external_fence} is supported. */
    public final boolean VK_KHR_external_fence;
    /** When true, {@code KHR_external_fence_fd} is supported. */
    public final boolean VK_KHR_external_fence_fd;
    /** When true, {@code KHR_external_fence_win32} is supported. */
    public final boolean VK_KHR_external_fence_win32;
    /** When true, {@code KHR_external_memory} is supported. */
    public final boolean VK_KHR_external_memory;
    /** When true, {@code KHR_external_memory_fd} is supported. */
    public final boolean VK_KHR_external_memory_fd;
    /** When true, {@code KHR_external_memory_win32} is supported. */
    public final boolean VK_KHR_external_memory_win32;
    /** When true, {@code KHR_external_semaphore} is supported. */
    public final boolean VK_KHR_external_semaphore;
    /** When true, {@code KHR_external_semaphore_fd} is supported. */
    public final boolean VK_KHR_external_semaphore_fd;
    /** When true, {@code KHR_external_semaphore_win32} is supported. */
    public final boolean VK_KHR_external_semaphore_win32;
    /** When true, {@code KHR_format_feature_flags2} is supported. */
    public final boolean VK_KHR_format_feature_flags2;
    /** When true, {@code KHR_fragment_shader_barycentric} is supported. */
    public final boolean VK_KHR_fragment_shader_barycentric;
    /** When true, {@code KHR_fragment_shading_rate} is supported. */
    public final boolean VK_KHR_fragment_shading_rate;
    /** When true, {@code KHR_get_memory_requirements2} is supported. */
    public final boolean VK_KHR_get_memory_requirements2;
    /** When true, {@code KHR_global_priority} is supported. */
    public final boolean VK_KHR_global_priority;
    /** When true, {@code KHR_image_format_list} is supported. */
    public final boolean VK_KHR_image_format_list;
    /** When true, {@code KHR_imageless_framebuffer} is supported. */
    public final boolean VK_KHR_imageless_framebuffer;
    /** When true, {@code KHR_incremental_present} is supported. */
    public final boolean VK_KHR_incremental_present;
    /** When true, {@code KHR_index_type_uint8} is supported. */
    public final boolean VK_KHR_index_type_uint8;
    /** When true, {@code KHR_line_rasterization} is supported. */
    public final boolean VK_KHR_line_rasterization;
    /** When true, {@code KHR_load_store_op_none} is supported. */
    public final boolean VK_KHR_load_store_op_none;
    /** When true, {@code KHR_maintenance1} is supported. */
    public final boolean VK_KHR_maintenance1;
    /** When true, {@code KHR_maintenance2} is supported. */
    public final boolean VK_KHR_maintenance2;
    /** When true, {@code KHR_maintenance3} is supported. */
    public final boolean VK_KHR_maintenance3;
    /** When true, {@code KHR_maintenance4} is supported. */
    public final boolean VK_KHR_maintenance4;
    /** When true, {@code KHR_maintenance5} is supported. */
    public final boolean VK_KHR_maintenance5;
    /** When true, {@code KHR_maintenance6} is supported. */
    public final boolean VK_KHR_maintenance6;
    /** When true, {@code KHR_maintenance7} is supported. */
    public final boolean VK_KHR_maintenance7;
    /** When true, {@code KHR_maintenance8} is supported. */
    public final boolean VK_KHR_maintenance8;
    /** When true, {@code KHR_map_memory2} is supported. */
    public final boolean VK_KHR_map_memory2;
    /** When true, {@code KHR_multiview} is supported. */
    public final boolean VK_KHR_multiview;
    /** When true, {@code KHR_performance_query} is supported. */
    public final boolean VK_KHR_performance_query;
    /** When true, {@code KHR_pipeline_binary} is supported. */
    public final boolean VK_KHR_pipeline_binary;
    /** When true, {@code KHR_pipeline_executable_properties} is supported. */
    public final boolean VK_KHR_pipeline_executable_properties;
    /** When true, {@code KHR_pipeline_library} is supported. */
    public final boolean VK_KHR_pipeline_library;
    /** When true, {@code KHR_portability_subset} is supported. */
    public final boolean VK_KHR_portability_subset;
    /** When true, {@code KHR_present_id} is supported. */
    public final boolean VK_KHR_present_id;
    /** When true, {@code KHR_present_wait} is supported. */
    public final boolean VK_KHR_present_wait;
    /** When true, {@code KHR_push_descriptor} is supported. */
    public final boolean VK_KHR_push_descriptor;
    /** When true, {@code KHR_ray_query} is supported. */
    public final boolean VK_KHR_ray_query;
    /** When true, {@code KHR_ray_tracing_maintenance1} is supported. */
    public final boolean VK_KHR_ray_tracing_maintenance1;
    /** When true, {@code KHR_ray_tracing_pipeline} is supported. */
    public final boolean VK_KHR_ray_tracing_pipeline;
    /** When true, {@code KHR_ray_tracing_position_fetch} is supported. */
    public final boolean VK_KHR_ray_tracing_position_fetch;
    /** When true, {@code KHR_relaxed_block_layout} is supported. */
    public final boolean VK_KHR_relaxed_block_layout;
    /** When true, {@code KHR_sampler_mirror_clamp_to_edge} is supported. */
    public final boolean VK_KHR_sampler_mirror_clamp_to_edge;
    /** When true, {@code KHR_sampler_ycbcr_conversion} is supported. */
    public final boolean VK_KHR_sampler_ycbcr_conversion;
    /** When true, {@code KHR_separate_depth_stencil_layouts} is supported. */
    public final boolean VK_KHR_separate_depth_stencil_layouts;
    /** When true, {@code KHR_shader_atomic_int64} is supported. */
    public final boolean VK_KHR_shader_atomic_int64;
    /** When true, {@code KHR_shader_clock} is supported. */
    public final boolean VK_KHR_shader_clock;
    /** When true, {@code KHR_shader_draw_parameters} is supported. */
    public final boolean VK_KHR_shader_draw_parameters;
    /** When true, {@code KHR_shader_expect_assume} is supported. */
    public final boolean VK_KHR_shader_expect_assume;
    /** When true, {@code KHR_shader_float16_int8} is supported. */
    public final boolean VK_KHR_shader_float16_int8;
    /** When true, {@code KHR_shader_float_controls} is supported. */
    public final boolean VK_KHR_shader_float_controls;
    /** When true, {@code KHR_shader_float_controls2} is supported. */
    public final boolean VK_KHR_shader_float_controls2;
    /** When true, {@code KHR_shader_integer_dot_product} is supported. */
    public final boolean VK_KHR_shader_integer_dot_product;
    /** When true, {@code KHR_shader_maximal_reconvergence} is supported. */
    public final boolean VK_KHR_shader_maximal_reconvergence;
    /** When true, {@code KHR_shader_non_semantic_info} is supported. */
    public final boolean VK_KHR_shader_non_semantic_info;
    /** When true, {@code KHR_shader_quad_control} is supported. */
    public final boolean VK_KHR_shader_quad_control;
    /** When true, {@code KHR_shader_relaxed_extended_instruction} is supported. */
    public final boolean VK_KHR_shader_relaxed_extended_instruction;
    /** When true, {@code KHR_shader_subgroup_extended_types} is supported. */
    public final boolean VK_KHR_shader_subgroup_extended_types;
    /** When true, {@code KHR_shader_subgroup_rotate} is supported. */
    public final boolean VK_KHR_shader_subgroup_rotate;
    /** When true, {@code KHR_shader_subgroup_uniform_control_flow} is supported. */
    public final boolean VK_KHR_shader_subgroup_uniform_control_flow;
    /** When true, {@code KHR_shader_terminate_invocation} is supported. */
    public final boolean VK_KHR_shader_terminate_invocation;
    /** When true, {@code KHR_shared_presentable_image} is supported. */
    public final boolean VK_KHR_shared_presentable_image;
    /** When true, {@code KHR_spirv_1_4} is supported. */
    public final boolean VK_KHR_spirv_1_4;
    /** When true, {@code KHR_storage_buffer_storage_class} is supported. */
    public final boolean VK_KHR_storage_buffer_storage_class;
    /** When true, {@code KHR_swapchain} is supported. */
    public final boolean VK_KHR_swapchain;
    /** When true, {@code KHR_swapchain_mutable_format} is supported. */
    public final boolean VK_KHR_swapchain_mutable_format;
    /** When true, {@code KHR_synchronization2} is supported. */
    public final boolean VK_KHR_synchronization2;
    /** When true, {@code KHR_timeline_semaphore} is supported. */
    public final boolean VK_KHR_timeline_semaphore;
    /** When true, {@code KHR_uniform_buffer_standard_layout} is supported. */
    public final boolean VK_KHR_uniform_buffer_standard_layout;
    /** When true, {@code KHR_variable_pointers} is supported. */
    public final boolean VK_KHR_variable_pointers;
    /** When true, {@code KHR_vertex_attribute_divisor} is supported. */
    public final boolean VK_KHR_vertex_attribute_divisor;
    /** When true, {@code KHR_video_decode_av1} is supported. */
    public final boolean VK_KHR_video_decode_av1;
    /** When true, {@code KHR_video_decode_h264} is supported. */
    public final boolean VK_KHR_video_decode_h264;
    /** When true, {@code KHR_video_decode_h265} is supported. */
    public final boolean VK_KHR_video_decode_h265;
    /** When true, {@code KHR_video_decode_queue} is supported. */
    public final boolean VK_KHR_video_decode_queue;
    /** When true, {@code KHR_video_encode_av1} is supported. */
    public final boolean VK_KHR_video_encode_av1;
    /** When true, {@code KHR_video_encode_h264} is supported. */
    public final boolean VK_KHR_video_encode_h264;
    /** When true, {@code KHR_video_encode_h265} is supported. */
    public final boolean VK_KHR_video_encode_h265;
    /** When true, {@code KHR_video_encode_quantization_map} is supported. */
    public final boolean VK_KHR_video_encode_quantization_map;
    /** When true, {@code KHR_video_encode_queue} is supported. */
    public final boolean VK_KHR_video_encode_queue;
    /** When true, {@code KHR_video_maintenance1} is supported. */
    public final boolean VK_KHR_video_maintenance1;
    /** When true, {@code KHR_video_maintenance2} is supported. */
    public final boolean VK_KHR_video_maintenance2;
    /** When true, {@code KHR_video_queue} is supported. */
    public final boolean VK_KHR_video_queue;
    /** When true, {@code KHR_vulkan_memory_model} is supported. */
    public final boolean VK_KHR_vulkan_memory_model;
    /** When true, {@code KHR_win32_keyed_mutex} is supported. */
    public final boolean VK_KHR_win32_keyed_mutex;
    /** When true, {@code KHR_workgroup_memory_explicit_layout} is supported. */
    public final boolean VK_KHR_workgroup_memory_explicit_layout;
    /** When true, {@code KHR_zero_initialize_workgroup_memory} is supported. */
    public final boolean VK_KHR_zero_initialize_workgroup_memory;
    /** When true, {@code MESA_image_alignment_control} is supported. */
    public final boolean VK_MESA_image_alignment_control;
    /** When true, {@code MSFT_layered_driver} is supported. */
    public final boolean VK_MSFT_layered_driver;
    /** When true, {@code NV_acquire_winrt_display} is supported. */
    public final boolean VK_NV_acquire_winrt_display;
    /** When true, {@code NV_clip_space_w_scaling} is supported. */
    public final boolean VK_NV_clip_space_w_scaling;
    /** When true, {@code NV_cluster_acceleration_structure} is supported. */
    public final boolean VK_NV_cluster_acceleration_structure;
    /** When true, {@code NV_command_buffer_inheritance} is supported. */
    public final boolean VK_NV_command_buffer_inheritance;
    /** When true, {@code NV_compute_shader_derivatives} is supported. */
    public final boolean VK_NV_compute_shader_derivatives;
    /** When true, {@code NV_cooperative_matrix} is supported. */
    public final boolean VK_NV_cooperative_matrix;
    /** When true, {@code NV_cooperative_matrix2} is supported. */
    public final boolean VK_NV_cooperative_matrix2;
    /** When true, {@code NV_cooperative_vector} is supported. */
    public final boolean VK_NV_cooperative_vector;
    /** When true, {@code NV_copy_memory_indirect} is supported. */
    public final boolean VK_NV_copy_memory_indirect;
    /** When true, {@code NV_corner_sampled_image} is supported. */
    public final boolean VK_NV_corner_sampled_image;
    /** When true, {@code NV_coverage_reduction_mode} is supported. */
    public final boolean VK_NV_coverage_reduction_mode;
    /** When true, {@code NV_cuda_kernel_launch} is supported. */
    public final boolean VK_NV_cuda_kernel_launch;
    /** When true, {@code NV_dedicated_allocation} is supported. */
    public final boolean VK_NV_dedicated_allocation;
    /** When true, {@code NV_dedicated_allocation_image_aliasing} is supported. */
    public final boolean VK_NV_dedicated_allocation_image_aliasing;
    /** When true, {@code NV_descriptor_pool_overallocation} is supported. */
    public final boolean VK_NV_descriptor_pool_overallocation;
    /** When true, {@code NV_device_diagnostic_checkpoints} is supported. */
    public final boolean VK_NV_device_diagnostic_checkpoints;
    /** When true, {@code NV_device_diagnostics_config} is supported. */
    public final boolean VK_NV_device_diagnostics_config;
    /** When true, {@code NV_device_generated_commands} is supported. */
    public final boolean VK_NV_device_generated_commands;
    /** When true, {@code NV_device_generated_commands_compute} is supported. */
    public final boolean VK_NV_device_generated_commands_compute;
    /** When true, {@code NV_displacement_micromap} is supported. */
    public final boolean VK_NV_displacement_micromap;
    /** When true, {@code NV_extended_sparse_address_space} is supported. */
    public final boolean VK_NV_extended_sparse_address_space;
    /** When true, {@code NV_external_memory} is supported. */
    public final boolean VK_NV_external_memory;
    /** When true, {@code NV_external_memory_rdma} is supported. */
    public final boolean VK_NV_external_memory_rdma;
    /** When true, {@code NV_external_memory_win32} is supported. */
    public final boolean VK_NV_external_memory_win32;
    /** When true, {@code NV_fill_rectangle} is supported. */
    public final boolean VK_NV_fill_rectangle;
    /** When true, {@code NV_fragment_coverage_to_color} is supported. */
    public final boolean VK_NV_fragment_coverage_to_color;
    /** When true, {@code NV_fragment_shader_barycentric} is supported. */
    public final boolean VK_NV_fragment_shader_barycentric;
    /** When true, {@code NV_fragment_shading_rate_enums} is supported. */
    public final boolean VK_NV_fragment_shading_rate_enums;
    /** When true, {@code NV_framebuffer_mixed_samples} is supported. */
    public final boolean VK_NV_framebuffer_mixed_samples;
    /** When true, {@code NV_geometry_shader_passthrough} is supported. */
    public final boolean VK_NV_geometry_shader_passthrough;
    /** When true, {@code NV_glsl_shader} is supported. */
    public final boolean VK_NV_glsl_shader;
    /** When true, {@code NV_inherited_viewport_scissor} is supported. */
    public final boolean VK_NV_inherited_viewport_scissor;
    /** When true, {@code NV_linear_color_attachment} is supported. */
    public final boolean VK_NV_linear_color_attachment;
    /** When true, {@code NV_low_latency} is supported. */
    public final boolean VK_NV_low_latency;
    /** When true, {@code NV_low_latency2} is supported. */
    public final boolean VK_NV_low_latency2;
    /** When true, {@code NV_memory_decompression} is supported. */
    public final boolean VK_NV_memory_decompression;
    /** When true, {@code NV_mesh_shader} is supported. */
    public final boolean VK_NV_mesh_shader;
    /** When true, {@code NV_optical_flow} is supported. */
    public final boolean VK_NV_optical_flow;
    /** When true, {@code NV_partitioned_acceleration_structure} is supported. */
    public final boolean VK_NV_partitioned_acceleration_structure;
    /** When true, {@code NV_per_stage_descriptor_set} is supported. */
    public final boolean VK_NV_per_stage_descriptor_set;
    /** When true, {@code NV_present_barrier} is supported. */
    public final boolean VK_NV_present_barrier;
    /** When true, {@code NV_raw_access_chains} is supported. */
    public final boolean VK_NV_raw_access_chains;
    /** When true, {@code NV_ray_tracing} is supported. */
    public final boolean VK_NV_ray_tracing;
    /** When true, {@code NV_ray_tracing_invocation_reorder} is supported. */
    public final boolean VK_NV_ray_tracing_invocation_reorder;
    /** When true, {@code NV_ray_tracing_linear_swept_spheres} is supported. */
    public final boolean VK_NV_ray_tracing_linear_swept_spheres;
    /** When true, {@code NV_ray_tracing_motion_blur} is supported. */
    public final boolean VK_NV_ray_tracing_motion_blur;
    /** When true, {@code NV_ray_tracing_validation} is supported. */
    public final boolean VK_NV_ray_tracing_validation;
    /** When true, {@code NV_representative_fragment_test} is supported. */
    public final boolean VK_NV_representative_fragment_test;
    /** When true, {@code NV_sample_mask_override_coverage} is supported. */
    public final boolean VK_NV_sample_mask_override_coverage;
    /** When true, {@code NV_scissor_exclusive} is supported. */
    public final boolean VK_NV_scissor_exclusive;
    /** When true, {@code NV_shader_atomic_float16_vector} is supported. */
    public final boolean VK_NV_shader_atomic_float16_vector;
    /** When true, {@code NV_shader_image_footprint} is supported. */
    public final boolean VK_NV_shader_image_footprint;
    /** When true, {@code NV_shader_sm_builtins} is supported. */
    public final boolean VK_NV_shader_sm_builtins;
    /** When true, {@code NV_shader_subgroup_partitioned} is supported. */
    public final boolean VK_NV_shader_subgroup_partitioned;
    /** When true, {@code NV_shading_rate_image} is supported. */
    public final boolean VK_NV_shading_rate_image;
    /** When true, {@code NV_viewport_array2} is supported. */
    public final boolean VK_NV_viewport_array2;
    /** When true, {@code NV_viewport_swizzle} is supported. */
    public final boolean VK_NV_viewport_swizzle;
    /** When true, {@code NV_win32_keyed_mutex} is supported. */
    public final boolean VK_NV_win32_keyed_mutex;
    /** When true, {@code NVX_binary_import} is supported. */
    public final boolean VK_NVX_binary_import;
    /** When true, {@code NVX_image_view_handle} is supported. */
    public final boolean VK_NVX_image_view_handle;
    /** When true, {@code NVX_multiview_per_view_attributes} is supported. */
    public final boolean VK_NVX_multiview_per_view_attributes;
    /** When true, {@code QCOM_filter_cubic_clamp} is supported. */
    public final boolean VK_QCOM_filter_cubic_clamp;
    /** When true, {@code QCOM_filter_cubic_weights} is supported. */
    public final boolean VK_QCOM_filter_cubic_weights;
    /** When true, {@code QCOM_fragment_density_map_offset} is supported. */
    public final boolean VK_QCOM_fragment_density_map_offset;
    /** When true, {@code QCOM_image_processing} is supported. */
    public final boolean VK_QCOM_image_processing;
    /** When true, {@code QCOM_image_processing2} is supported. */
    public final boolean VK_QCOM_image_processing2;
    /** When true, {@code QCOM_multiview_per_view_render_areas} is supported. */
    public final boolean VK_QCOM_multiview_per_view_render_areas;
    /** When true, {@code QCOM_multiview_per_view_viewports} is supported. */
    public final boolean VK_QCOM_multiview_per_view_viewports;
    /** When true, {@code QCOM_render_pass_shader_resolve} is supported. */
    public final boolean VK_QCOM_render_pass_shader_resolve;
    /** When true, {@code QCOM_render_pass_store_ops} is supported. */
    public final boolean VK_QCOM_render_pass_store_ops;
    /** When true, {@code QCOM_render_pass_transform} is supported. */
    public final boolean VK_QCOM_render_pass_transform;
    /** When true, {@code QCOM_rotated_copy_commands} is supported. */
    public final boolean VK_QCOM_rotated_copy_commands;
    /** When true, {@code QCOM_tile_properties} is supported. */
    public final boolean VK_QCOM_tile_properties;
    /** When true, {@code QCOM_ycbcr_degamma} is supported. */
    public final boolean VK_QCOM_ycbcr_degamma;
    /** When true, {@code SEC_amigo_profiling} is supported. */
    public final boolean VK_SEC_amigo_profiling;
    /** When true, {@code STD_vulkan_video_codec_av1} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_av1;
    /** When true, {@code STD_vulkan_video_codec_h264} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h264;
    /** When true, {@code STD_vulkan_video_codec_h265} is supported. */
    public final boolean STD_VIDEO_STD_vulkan_video_codec_h265;
    /** When true, {@code VALVE_descriptor_set_host_mapping} is supported. */
    public final boolean VK_VALVE_descriptor_set_host_mapping;
    /** When true, {@code VALVE_mutable_descriptor_type} is supported. */
    public final boolean VK_VALVE_mutable_descriptor_type;

    VKCapabilitiesDevice(FunctionProvider provider, VKCapabilitiesInstance capsInstance, int apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[597];

        Vulkan10 = check_VK10(provider, caps, ext);
        Vulkan11 = check_VK11(provider, caps, ext);
        Vulkan12 = check_VK12(provider, caps, ext);
        Vulkan13 = check_VK13(provider, caps, ext);
        Vulkan14 = check_VK14(provider, caps, ext);
        VK_AMD_anti_lag = check_AMD_anti_lag(provider, caps, ext);
        VK_AMD_buffer_marker = check_AMD_buffer_marker(provider, caps, ext);
        VK_AMD_device_coherent_memory = ext.contains("VK_AMD_device_coherent_memory");
        VK_AMD_display_native_hdr = check_AMD_display_native_hdr(provider, caps, ext);
        VK_AMD_draw_indirect_count = check_AMD_draw_indirect_count(provider, caps, ext);
        VK_AMD_gcn_shader = ext.contains("VK_AMD_gcn_shader");
        VK_AMD_gpu_shader_half_float = ext.contains("VK_AMD_gpu_shader_half_float");
        VK_AMD_gpu_shader_int16 = ext.contains("VK_AMD_gpu_shader_int16");
        VK_AMD_memory_overallocation_behavior = ext.contains("VK_AMD_memory_overallocation_behavior");
        VK_AMD_mixed_attachment_samples = ext.contains("VK_AMD_mixed_attachment_samples");
        VK_AMD_negative_viewport_height = ext.contains("VK_AMD_negative_viewport_height");
        VK_AMD_pipeline_compiler_control = ext.contains("VK_AMD_pipeline_compiler_control");
        VK_AMD_rasterization_order = ext.contains("VK_AMD_rasterization_order");
        VK_AMD_shader_ballot = ext.contains("VK_AMD_shader_ballot");
        VK_AMD_shader_core_properties = ext.contains("VK_AMD_shader_core_properties");
        VK_AMD_shader_core_properties2 = ext.contains("VK_AMD_shader_core_properties2");
        VK_AMD_shader_early_and_late_fragment_tests = ext.contains("VK_AMD_shader_early_and_late_fragment_tests");
        VK_AMD_shader_explicit_vertex_parameter = ext.contains("VK_AMD_shader_explicit_vertex_parameter");
        VK_AMD_shader_fragment_mask = ext.contains("VK_AMD_shader_fragment_mask");
        VK_AMD_shader_image_load_store_lod = ext.contains("VK_AMD_shader_image_load_store_lod");
        VK_AMD_shader_info = check_AMD_shader_info(provider, caps, ext);
        VK_AMD_shader_trinary_minmax = ext.contains("VK_AMD_shader_trinary_minmax");
        VK_AMD_texture_gather_bias_lod = ext.contains("VK_AMD_texture_gather_bias_lod");
        VK_AMDX_shader_enqueue = check_AMDX_shader_enqueue(provider, caps, ext);
        VK_ANDROID_external_format_resolve = ext.contains("VK_ANDROID_external_format_resolve");
        VK_ANDROID_external_memory_android_hardware_buffer = check_ANDROID_external_memory_android_hardware_buffer(provider, caps, ext);
        VK_ARM_pipeline_opacity_micromap = ext.contains("VK_ARM_pipeline_opacity_micromap");
        VK_ARM_rasterization_order_attachment_access = ext.contains("VK_ARM_rasterization_order_attachment_access");
        VK_ARM_render_pass_striped = ext.contains("VK_ARM_render_pass_striped");
        VK_ARM_scheduling_controls = ext.contains("VK_ARM_scheduling_controls");
        VK_ARM_shader_core_builtins = ext.contains("VK_ARM_shader_core_builtins");
        VK_ARM_shader_core_properties = ext.contains("VK_ARM_shader_core_properties");
        VK_EXT_4444_formats = ext.contains("VK_EXT_4444_formats");
        VK_EXT_astc_decode_mode = ext.contains("VK_EXT_astc_decode_mode");
        VK_EXT_attachment_feedback_loop_dynamic_state = check_EXT_attachment_feedback_loop_dynamic_state(provider, caps, ext);
        VK_EXT_attachment_feedback_loop_layout = ext.contains("VK_EXT_attachment_feedback_loop_layout");
        VK_EXT_blend_operation_advanced = ext.contains("VK_EXT_blend_operation_advanced");
        VK_EXT_border_color_swizzle = ext.contains("VK_EXT_border_color_swizzle");
        VK_EXT_buffer_device_address = check_EXT_buffer_device_address(provider, caps, ext);
        VK_EXT_calibrated_timestamps = check_EXT_calibrated_timestamps(provider, caps, ext);
        VK_EXT_color_write_enable = check_EXT_color_write_enable(provider, caps, ext);
        VK_EXT_conditional_rendering = check_EXT_conditional_rendering(provider, caps, ext);
        VK_EXT_conservative_rasterization = ext.contains("VK_EXT_conservative_rasterization");
        VK_EXT_custom_border_color = ext.contains("VK_EXT_custom_border_color");
        VK_EXT_debug_marker = check_EXT_debug_marker(provider, caps, ext);
        VK_EXT_depth_bias_control = check_EXT_depth_bias_control(provider, caps, ext);
        VK_EXT_depth_clamp_control = check_EXT_depth_clamp_control(provider, caps, ext);
        VK_EXT_depth_clamp_zero_one = ext.contains("VK_EXT_depth_clamp_zero_one");
        VK_EXT_depth_clip_control = ext.contains("VK_EXT_depth_clip_control");
        VK_EXT_depth_clip_enable = ext.contains("VK_EXT_depth_clip_enable");
        VK_EXT_depth_range_unrestricted = ext.contains("VK_EXT_depth_range_unrestricted");
        VK_EXT_descriptor_buffer = check_EXT_descriptor_buffer(provider, caps, ext);
        VK_EXT_descriptor_indexing = ext.contains("VK_EXT_descriptor_indexing");
        VK_EXT_device_address_binding_report = ext.contains("VK_EXT_device_address_binding_report");
        VK_EXT_device_fault = check_EXT_device_fault(provider, caps, ext);
        VK_EXT_device_generated_commands = check_EXT_device_generated_commands(provider, caps, ext);
        VK_EXT_device_memory_report = ext.contains("VK_EXT_device_memory_report");
        VK_EXT_discard_rectangles = check_EXT_discard_rectangles(provider, caps, ext);
        VK_EXT_display_control = check_EXT_display_control(provider, caps, ext);
        VK_EXT_dynamic_rendering_unused_attachments = ext.contains("VK_EXT_dynamic_rendering_unused_attachments");
        VK_EXT_extended_dynamic_state = check_EXT_extended_dynamic_state(provider, caps, ext);
        VK_EXT_extended_dynamic_state2 = check_EXT_extended_dynamic_state2(provider, caps, ext);
        VK_EXT_extended_dynamic_state3 = check_EXT_extended_dynamic_state3(provider, caps, ext);
        VK_EXT_external_memory_acquire_unmodified = ext.contains("VK_EXT_external_memory_acquire_unmodified");
        VK_EXT_external_memory_dma_buf = ext.contains("VK_EXT_external_memory_dma_buf");
        VK_EXT_external_memory_host = check_EXT_external_memory_host(provider, caps, ext);
        VK_EXT_external_memory_metal = check_EXT_external_memory_metal(provider, caps, ext);
        VK_EXT_filter_cubic = ext.contains("VK_EXT_filter_cubic");
        VK_EXT_fragment_density_map = ext.contains("VK_EXT_fragment_density_map");
        VK_EXT_fragment_density_map2 = ext.contains("VK_EXT_fragment_density_map2");
        VK_EXT_fragment_shader_interlock = ext.contains("VK_EXT_fragment_shader_interlock");
        VK_EXT_frame_boundary = ext.contains("VK_EXT_frame_boundary");
        VK_EXT_full_screen_exclusive = check_EXT_full_screen_exclusive(provider, caps, ext);
        VK_EXT_global_priority = ext.contains("VK_EXT_global_priority");
        VK_EXT_global_priority_query = ext.contains("VK_EXT_global_priority_query");
        VK_EXT_graphics_pipeline_library = ext.contains("VK_EXT_graphics_pipeline_library");
        VK_EXT_hdr_metadata = check_EXT_hdr_metadata(provider, caps, ext);
        VK_EXT_host_image_copy = check_EXT_host_image_copy(provider, caps, ext);
        VK_EXT_host_query_reset = check_EXT_host_query_reset(provider, caps, ext);
        VK_EXT_image_2d_view_of_3d = ext.contains("VK_EXT_image_2d_view_of_3d");
        VK_EXT_image_compression_control = check_EXT_image_compression_control(provider, caps, ext);
        VK_EXT_image_compression_control_swapchain = ext.contains("VK_EXT_image_compression_control_swapchain");
        VK_EXT_image_drm_format_modifier = check_EXT_image_drm_format_modifier(provider, caps, ext);
        VK_EXT_image_robustness = ext.contains("VK_EXT_image_robustness");
        VK_EXT_image_sliced_view_of_3d = ext.contains("VK_EXT_image_sliced_view_of_3d");
        VK_EXT_image_view_min_lod = ext.contains("VK_EXT_image_view_min_lod");
        VK_EXT_index_type_uint8 = ext.contains("VK_EXT_index_type_uint8");
        VK_EXT_inline_uniform_block = ext.contains("VK_EXT_inline_uniform_block");
        VK_EXT_legacy_dithering = ext.contains("VK_EXT_legacy_dithering");
        VK_EXT_legacy_vertex_attributes = ext.contains("VK_EXT_legacy_vertex_attributes");
        VK_EXT_line_rasterization = check_EXT_line_rasterization(provider, caps, ext);
        VK_EXT_load_store_op_none = ext.contains("VK_EXT_load_store_op_none");
        VK_EXT_map_memory_placed = ext.contains("VK_EXT_map_memory_placed");
        VK_EXT_memory_budget = ext.contains("VK_EXT_memory_budget");
        VK_EXT_memory_priority = ext.contains("VK_EXT_memory_priority");
        VK_EXT_mesh_shader = check_EXT_mesh_shader(provider, caps, ext);
        VK_EXT_metal_objects = check_EXT_metal_objects(provider, caps, ext);
        VK_EXT_multi_draw = check_EXT_multi_draw(provider, caps, ext);
        VK_EXT_multisampled_render_to_single_sampled = ext.contains("VK_EXT_multisampled_render_to_single_sampled");
        VK_EXT_mutable_descriptor_type = ext.contains("VK_EXT_mutable_descriptor_type");
        VK_EXT_nested_command_buffer = ext.contains("VK_EXT_nested_command_buffer");
        VK_EXT_non_seamless_cube_map = ext.contains("VK_EXT_non_seamless_cube_map");
        VK_EXT_opacity_micromap = check_EXT_opacity_micromap(provider, caps, ext);
        VK_EXT_pageable_device_local_memory = check_EXT_pageable_device_local_memory(provider, caps, ext);
        VK_EXT_pci_bus_info = ext.contains("VK_EXT_pci_bus_info");
        VK_EXT_physical_device_drm = ext.contains("VK_EXT_physical_device_drm");
        VK_EXT_pipeline_creation_cache_control = ext.contains("VK_EXT_pipeline_creation_cache_control");
        VK_EXT_pipeline_creation_feedback = ext.contains("VK_EXT_pipeline_creation_feedback");
        VK_EXT_pipeline_library_group_handles = ext.contains("VK_EXT_pipeline_library_group_handles");
        VK_EXT_pipeline_properties = check_EXT_pipeline_properties(provider, caps, ext);
        VK_EXT_pipeline_protected_access = ext.contains("VK_EXT_pipeline_protected_access");
        VK_EXT_pipeline_robustness = ext.contains("VK_EXT_pipeline_robustness");
        VK_EXT_post_depth_coverage = ext.contains("VK_EXT_post_depth_coverage");
        VK_EXT_present_mode_fifo_latest_ready = ext.contains("VK_EXT_present_mode_fifo_latest_ready");
        VK_EXT_primitive_topology_list_restart = ext.contains("VK_EXT_primitive_topology_list_restart");
        VK_EXT_primitives_generated_query = ext.contains("VK_EXT_primitives_generated_query");
        VK_EXT_private_data = check_EXT_private_data(provider, caps, ext);
        VK_EXT_provoking_vertex = ext.contains("VK_EXT_provoking_vertex");
        VK_EXT_queue_family_foreign = ext.contains("VK_EXT_queue_family_foreign");
        VK_EXT_rasterization_order_attachment_access = ext.contains("VK_EXT_rasterization_order_attachment_access");
        VK_EXT_rgba10x6_formats = ext.contains("VK_EXT_rgba10x6_formats");
        VK_EXT_robustness2 = ext.contains("VK_EXT_robustness2");
        VK_EXT_sample_locations = check_EXT_sample_locations(provider, caps, ext);
        VK_EXT_sampler_filter_minmax = ext.contains("VK_EXT_sampler_filter_minmax");
        VK_EXT_scalar_block_layout = ext.contains("VK_EXT_scalar_block_layout");
        VK_EXT_separate_stencil_usage = ext.contains("VK_EXT_separate_stencil_usage");
        VK_EXT_shader_atomic_float = ext.contains("VK_EXT_shader_atomic_float");
        VK_EXT_shader_atomic_float2 = ext.contains("VK_EXT_shader_atomic_float2");
        VK_EXT_shader_demote_to_helper_invocation = ext.contains("VK_EXT_shader_demote_to_helper_invocation");
        VK_EXT_shader_image_atomic_int64 = ext.contains("VK_EXT_shader_image_atomic_int64");
        VK_EXT_shader_module_identifier = check_EXT_shader_module_identifier(provider, caps, ext);
        VK_EXT_shader_object = check_EXT_shader_object(provider, caps, ext);
        VK_EXT_shader_replicated_composites = ext.contains("VK_EXT_shader_replicated_composites");
        VK_EXT_shader_stencil_export = ext.contains("VK_EXT_shader_stencil_export");
        VK_EXT_shader_subgroup_ballot = ext.contains("VK_EXT_shader_subgroup_ballot");
        VK_EXT_shader_subgroup_vote = ext.contains("VK_EXT_shader_subgroup_vote");
        VK_EXT_shader_tile_image = ext.contains("VK_EXT_shader_tile_image");
        VK_EXT_shader_viewport_index_layer = ext.contains("VK_EXT_shader_viewport_index_layer");
        VK_EXT_subgroup_size_control = ext.contains("VK_EXT_subgroup_size_control");
        VK_EXT_subpass_merge_feedback = ext.contains("VK_EXT_subpass_merge_feedback");
        VK_EXT_swapchain_maintenance1 = check_EXT_swapchain_maintenance1(provider, caps, ext);
        VK_EXT_texel_buffer_alignment = ext.contains("VK_EXT_texel_buffer_alignment");
        VK_EXT_texture_compression_astc_hdr = ext.contains("VK_EXT_texture_compression_astc_hdr");
        VK_EXT_tooling_info = ext.contains("VK_EXT_tooling_info");
        VK_EXT_transform_feedback = check_EXT_transform_feedback(provider, caps, ext);
        VK_EXT_validation_cache = check_EXT_validation_cache(provider, caps, ext);
        VK_EXT_vertex_attribute_divisor = ext.contains("VK_EXT_vertex_attribute_divisor");
        VK_EXT_vertex_attribute_robustness = ext.contains("VK_EXT_vertex_attribute_robustness");
        VK_EXT_vertex_input_dynamic_state = check_EXT_vertex_input_dynamic_state(provider, caps, ext);
        VK_EXT_ycbcr_2plane_444_formats = ext.contains("VK_EXT_ycbcr_2plane_444_formats");
        VK_EXT_ycbcr_image_arrays = ext.contains("VK_EXT_ycbcr_image_arrays");
        VK_GOOGLE_decorate_string = ext.contains("VK_GOOGLE_decorate_string");
        VK_GOOGLE_display_timing = check_GOOGLE_display_timing(provider, caps, ext);
        VK_GOOGLE_hlsl_functionality1 = ext.contains("VK_GOOGLE_hlsl_functionality1");
        VK_GOOGLE_user_type = ext.contains("VK_GOOGLE_user_type");
        VK_HUAWEI_cluster_culling_shader = check_HUAWEI_cluster_culling_shader(provider, caps, ext);
        VK_HUAWEI_hdr_vivid = ext.contains("VK_HUAWEI_hdr_vivid");
        VK_HUAWEI_invocation_mask = check_HUAWEI_invocation_mask(provider, caps, ext);
        VK_HUAWEI_subpass_shading = check_HUAWEI_subpass_shading(provider, caps, ext);
        VK_IMG_filter_cubic = ext.contains("VK_IMG_filter_cubic");
        VK_IMG_format_pvrtc = ext.contains("VK_IMG_format_pvrtc");
        VK_IMG_relaxed_line_rasterization = ext.contains("VK_IMG_relaxed_line_rasterization");
        VK_INTEL_performance_query = check_INTEL_performance_query(provider, caps, ext);
        VK_INTEL_shader_integer_functions2 = ext.contains("VK_INTEL_shader_integer_functions2");
        VK_KHR_16bit_storage = ext.contains("VK_KHR_16bit_storage");
        VK_KHR_8bit_storage = ext.contains("VK_KHR_8bit_storage");
        VK_KHR_acceleration_structure = check_KHR_acceleration_structure(provider, caps, ext);
        VK_KHR_bind_memory2 = check_KHR_bind_memory2(provider, caps, ext);
        VK_KHR_buffer_device_address = check_KHR_buffer_device_address(provider, caps, ext);
        VK_KHR_calibrated_timestamps = check_KHR_calibrated_timestamps(provider, caps, ext);
        VK_KHR_compute_shader_derivatives = ext.contains("VK_KHR_compute_shader_derivatives");
        VK_KHR_cooperative_matrix = ext.contains("VK_KHR_cooperative_matrix");
        VK_KHR_copy_commands2 = check_KHR_copy_commands2(provider, caps, ext);
        VK_KHR_create_renderpass2 = check_KHR_create_renderpass2(provider, caps, ext);
        VK_KHR_dedicated_allocation = ext.contains("VK_KHR_dedicated_allocation");
        VK_KHR_deferred_host_operations = check_KHR_deferred_host_operations(provider, caps, ext);
        VK_KHR_depth_clamp_zero_one = ext.contains("VK_KHR_depth_clamp_zero_one");
        VK_KHR_depth_stencil_resolve = ext.contains("VK_KHR_depth_stencil_resolve");
        VK_KHR_descriptor_update_template = check_KHR_descriptor_update_template(provider, caps, ext);
        VK_KHR_device_group = check_KHR_device_group(provider, caps, ext);
        VK_KHR_display_swapchain = check_KHR_display_swapchain(provider, caps, ext);
        VK_KHR_draw_indirect_count = check_KHR_draw_indirect_count(provider, caps, ext);
        VK_KHR_driver_properties = ext.contains("VK_KHR_driver_properties");
        VK_KHR_dynamic_rendering = check_KHR_dynamic_rendering(provider, caps, ext);
        VK_KHR_dynamic_rendering_local_read = check_KHR_dynamic_rendering_local_read(provider, caps, ext);
        VK_KHR_external_fence = ext.contains("VK_KHR_external_fence");
        VK_KHR_external_fence_fd = check_KHR_external_fence_fd(provider, caps, ext);
        VK_KHR_external_fence_win32 = check_KHR_external_fence_win32(provider, caps, ext);
        VK_KHR_external_memory = ext.contains("VK_KHR_external_memory");
        VK_KHR_external_memory_fd = check_KHR_external_memory_fd(provider, caps, ext);
        VK_KHR_external_memory_win32 = check_KHR_external_memory_win32(provider, caps, ext);
        VK_KHR_external_semaphore = ext.contains("VK_KHR_external_semaphore");
        VK_KHR_external_semaphore_fd = check_KHR_external_semaphore_fd(provider, caps, ext);
        VK_KHR_external_semaphore_win32 = check_KHR_external_semaphore_win32(provider, caps, ext);
        VK_KHR_format_feature_flags2 = ext.contains("VK_KHR_format_feature_flags2");
        VK_KHR_fragment_shader_barycentric = ext.contains("VK_KHR_fragment_shader_barycentric");
        VK_KHR_fragment_shading_rate = check_KHR_fragment_shading_rate(provider, caps, ext);
        VK_KHR_get_memory_requirements2 = check_KHR_get_memory_requirements2(provider, caps, ext);
        VK_KHR_global_priority = ext.contains("VK_KHR_global_priority");
        VK_KHR_image_format_list = ext.contains("VK_KHR_image_format_list");
        VK_KHR_imageless_framebuffer = ext.contains("VK_KHR_imageless_framebuffer");
        VK_KHR_incremental_present = ext.contains("VK_KHR_incremental_present");
        VK_KHR_index_type_uint8 = ext.contains("VK_KHR_index_type_uint8");
        VK_KHR_line_rasterization = check_KHR_line_rasterization(provider, caps, ext);
        VK_KHR_load_store_op_none = ext.contains("VK_KHR_load_store_op_none");
        VK_KHR_maintenance1 = check_KHR_maintenance1(provider, caps, ext);
        VK_KHR_maintenance2 = ext.contains("VK_KHR_maintenance2");
        VK_KHR_maintenance3 = check_KHR_maintenance3(provider, caps, ext);
        VK_KHR_maintenance4 = check_KHR_maintenance4(provider, caps, ext);
        VK_KHR_maintenance5 = check_KHR_maintenance5(provider, caps, ext);
        VK_KHR_maintenance6 = check_KHR_maintenance6(provider, caps, ext);
        VK_KHR_maintenance7 = ext.contains("VK_KHR_maintenance7");
        VK_KHR_maintenance8 = ext.contains("VK_KHR_maintenance8");
        VK_KHR_map_memory2 = check_KHR_map_memory2(provider, caps, ext);
        VK_KHR_multiview = ext.contains("VK_KHR_multiview");
        VK_KHR_performance_query = check_KHR_performance_query(provider, caps, ext);
        VK_KHR_pipeline_binary = check_KHR_pipeline_binary(provider, caps, ext);
        VK_KHR_pipeline_executable_properties = check_KHR_pipeline_executable_properties(provider, caps, ext);
        VK_KHR_pipeline_library = ext.contains("VK_KHR_pipeline_library");
        VK_KHR_portability_subset = ext.contains("VK_KHR_portability_subset");
        VK_KHR_present_id = ext.contains("VK_KHR_present_id");
        VK_KHR_present_wait = check_KHR_present_wait(provider, caps, ext);
        VK_KHR_push_descriptor = check_KHR_push_descriptor(provider, caps, ext);
        VK_KHR_ray_query = ext.contains("VK_KHR_ray_query");
        VK_KHR_ray_tracing_maintenance1 = check_KHR_ray_tracing_maintenance1(provider, caps, ext);
        VK_KHR_ray_tracing_pipeline = check_KHR_ray_tracing_pipeline(provider, caps, ext);
        VK_KHR_ray_tracing_position_fetch = ext.contains("VK_KHR_ray_tracing_position_fetch");
        VK_KHR_relaxed_block_layout = ext.contains("VK_KHR_relaxed_block_layout");
        VK_KHR_sampler_mirror_clamp_to_edge = ext.contains("VK_KHR_sampler_mirror_clamp_to_edge");
        VK_KHR_sampler_ycbcr_conversion = check_KHR_sampler_ycbcr_conversion(provider, caps, ext);
        VK_KHR_separate_depth_stencil_layouts = ext.contains("VK_KHR_separate_depth_stencil_layouts");
        VK_KHR_shader_atomic_int64 = ext.contains("VK_KHR_shader_atomic_int64");
        VK_KHR_shader_clock = ext.contains("VK_KHR_shader_clock");
        VK_KHR_shader_draw_parameters = ext.contains("VK_KHR_shader_draw_parameters");
        VK_KHR_shader_expect_assume = ext.contains("VK_KHR_shader_expect_assume");
        VK_KHR_shader_float16_int8 = ext.contains("VK_KHR_shader_float16_int8");
        VK_KHR_shader_float_controls = ext.contains("VK_KHR_shader_float_controls");
        VK_KHR_shader_float_controls2 = ext.contains("VK_KHR_shader_float_controls2");
        VK_KHR_shader_integer_dot_product = ext.contains("VK_KHR_shader_integer_dot_product");
        VK_KHR_shader_maximal_reconvergence = ext.contains("VK_KHR_shader_maximal_reconvergence");
        VK_KHR_shader_non_semantic_info = ext.contains("VK_KHR_shader_non_semantic_info");
        VK_KHR_shader_quad_control = ext.contains("VK_KHR_shader_quad_control");
        VK_KHR_shader_relaxed_extended_instruction = ext.contains("VK_KHR_shader_relaxed_extended_instruction");
        VK_KHR_shader_subgroup_extended_types = ext.contains("VK_KHR_shader_subgroup_extended_types");
        VK_KHR_shader_subgroup_rotate = ext.contains("VK_KHR_shader_subgroup_rotate");
        VK_KHR_shader_subgroup_uniform_control_flow = ext.contains("VK_KHR_shader_subgroup_uniform_control_flow");
        VK_KHR_shader_terminate_invocation = ext.contains("VK_KHR_shader_terminate_invocation");
        VK_KHR_shared_presentable_image = check_KHR_shared_presentable_image(provider, caps, ext);
        VK_KHR_spirv_1_4 = ext.contains("VK_KHR_spirv_1_4");
        VK_KHR_storage_buffer_storage_class = ext.contains("VK_KHR_storage_buffer_storage_class");
        VK_KHR_swapchain = check_KHR_swapchain(provider, caps, ext);
        VK_KHR_swapchain_mutable_format = ext.contains("VK_KHR_swapchain_mutable_format");
        VK_KHR_synchronization2 = check_KHR_synchronization2(provider, caps, ext);
        VK_KHR_timeline_semaphore = check_KHR_timeline_semaphore(provider, caps, ext);
        VK_KHR_uniform_buffer_standard_layout = ext.contains("VK_KHR_uniform_buffer_standard_layout");
        VK_KHR_variable_pointers = ext.contains("VK_KHR_variable_pointers");
        VK_KHR_vertex_attribute_divisor = ext.contains("VK_KHR_vertex_attribute_divisor");
        VK_KHR_video_decode_av1 = ext.contains("VK_KHR_video_decode_av1");
        VK_KHR_video_decode_h264 = ext.contains("VK_KHR_video_decode_h264");
        VK_KHR_video_decode_h265 = ext.contains("VK_KHR_video_decode_h265");
        VK_KHR_video_decode_queue = check_KHR_video_decode_queue(provider, caps, ext);
        VK_KHR_video_encode_av1 = ext.contains("VK_KHR_video_encode_av1");
        VK_KHR_video_encode_h264 = ext.contains("VK_KHR_video_encode_h264");
        VK_KHR_video_encode_h265 = ext.contains("VK_KHR_video_encode_h265");
        VK_KHR_video_encode_quantization_map = ext.contains("VK_KHR_video_encode_quantization_map");
        VK_KHR_video_encode_queue = check_KHR_video_encode_queue(provider, caps, ext);
        VK_KHR_video_maintenance1 = ext.contains("VK_KHR_video_maintenance1");
        VK_KHR_video_maintenance2 = ext.contains("VK_KHR_video_maintenance2");
        VK_KHR_video_queue = check_KHR_video_queue(provider, caps, ext);
        VK_KHR_vulkan_memory_model = ext.contains("VK_KHR_vulkan_memory_model");
        VK_KHR_win32_keyed_mutex = ext.contains("VK_KHR_win32_keyed_mutex");
        VK_KHR_workgroup_memory_explicit_layout = ext.contains("VK_KHR_workgroup_memory_explicit_layout");
        VK_KHR_zero_initialize_workgroup_memory = ext.contains("VK_KHR_zero_initialize_workgroup_memory");
        VK_MESA_image_alignment_control = ext.contains("VK_MESA_image_alignment_control");
        VK_MSFT_layered_driver = ext.contains("VK_MSFT_layered_driver");
        VK_NV_acquire_winrt_display = ext.contains("VK_NV_acquire_winrt_display");
        VK_NV_clip_space_w_scaling = check_NV_clip_space_w_scaling(provider, caps, ext);
        VK_NV_cluster_acceleration_structure = check_NV_cluster_acceleration_structure(provider, caps, ext);
        VK_NV_command_buffer_inheritance = ext.contains("VK_NV_command_buffer_inheritance");
        VK_NV_compute_shader_derivatives = ext.contains("VK_NV_compute_shader_derivatives");
        VK_NV_cooperative_matrix = ext.contains("VK_NV_cooperative_matrix");
        VK_NV_cooperative_matrix2 = ext.contains("VK_NV_cooperative_matrix2");
        VK_NV_cooperative_vector = check_NV_cooperative_vector(provider, caps, ext);
        VK_NV_copy_memory_indirect = check_NV_copy_memory_indirect(provider, caps, ext);
        VK_NV_corner_sampled_image = ext.contains("VK_NV_corner_sampled_image");
        VK_NV_coverage_reduction_mode = ext.contains("VK_NV_coverage_reduction_mode");
        VK_NV_cuda_kernel_launch = check_NV_cuda_kernel_launch(provider, caps, ext);
        VK_NV_dedicated_allocation = ext.contains("VK_NV_dedicated_allocation");
        VK_NV_dedicated_allocation_image_aliasing = ext.contains("VK_NV_dedicated_allocation_image_aliasing");
        VK_NV_descriptor_pool_overallocation = ext.contains("VK_NV_descriptor_pool_overallocation");
        VK_NV_device_diagnostic_checkpoints = check_NV_device_diagnostic_checkpoints(provider, caps, ext);
        VK_NV_device_diagnostics_config = ext.contains("VK_NV_device_diagnostics_config");
        VK_NV_device_generated_commands = check_NV_device_generated_commands(provider, caps, ext);
        VK_NV_device_generated_commands_compute = check_NV_device_generated_commands_compute(provider, caps, ext);
        VK_NV_displacement_micromap = ext.contains("VK_NV_displacement_micromap");
        VK_NV_extended_sparse_address_space = ext.contains("VK_NV_extended_sparse_address_space");
        VK_NV_external_memory = ext.contains("VK_NV_external_memory");
        VK_NV_external_memory_rdma = check_NV_external_memory_rdma(provider, caps, ext);
        VK_NV_external_memory_win32 = check_NV_external_memory_win32(provider, caps, ext);
        VK_NV_fill_rectangle = ext.contains("VK_NV_fill_rectangle");
        VK_NV_fragment_coverage_to_color = ext.contains("VK_NV_fragment_coverage_to_color");
        VK_NV_fragment_shader_barycentric = ext.contains("VK_NV_fragment_shader_barycentric");
        VK_NV_fragment_shading_rate_enums = check_NV_fragment_shading_rate_enums(provider, caps, ext);
        VK_NV_framebuffer_mixed_samples = ext.contains("VK_NV_framebuffer_mixed_samples");
        VK_NV_geometry_shader_passthrough = ext.contains("VK_NV_geometry_shader_passthrough");
        VK_NV_glsl_shader = ext.contains("VK_NV_glsl_shader");
        VK_NV_inherited_viewport_scissor = ext.contains("VK_NV_inherited_viewport_scissor");
        VK_NV_linear_color_attachment = ext.contains("VK_NV_linear_color_attachment");
        VK_NV_low_latency = ext.contains("VK_NV_low_latency");
        VK_NV_low_latency2 = check_NV_low_latency2(provider, caps, ext);
        VK_NV_memory_decompression = check_NV_memory_decompression(provider, caps, ext);
        VK_NV_mesh_shader = check_NV_mesh_shader(provider, caps, ext);
        VK_NV_optical_flow = check_NV_optical_flow(provider, caps, ext);
        VK_NV_partitioned_acceleration_structure = check_NV_partitioned_acceleration_structure(provider, caps, ext);
        VK_NV_per_stage_descriptor_set = ext.contains("VK_NV_per_stage_descriptor_set");
        VK_NV_present_barrier = ext.contains("VK_NV_present_barrier");
        VK_NV_raw_access_chains = ext.contains("VK_NV_raw_access_chains");
        VK_NV_ray_tracing = check_NV_ray_tracing(provider, caps, ext);
        VK_NV_ray_tracing_invocation_reorder = ext.contains("VK_NV_ray_tracing_invocation_reorder");
        VK_NV_ray_tracing_linear_swept_spheres = ext.contains("VK_NV_ray_tracing_linear_swept_spheres");
        VK_NV_ray_tracing_motion_blur = ext.contains("VK_NV_ray_tracing_motion_blur");
        VK_NV_ray_tracing_validation = ext.contains("VK_NV_ray_tracing_validation");
        VK_NV_representative_fragment_test = ext.contains("VK_NV_representative_fragment_test");
        VK_NV_sample_mask_override_coverage = ext.contains("VK_NV_sample_mask_override_coverage");
        VK_NV_scissor_exclusive = check_NV_scissor_exclusive(provider, caps, ext);
        VK_NV_shader_atomic_float16_vector = ext.contains("VK_NV_shader_atomic_float16_vector");
        VK_NV_shader_image_footprint = ext.contains("VK_NV_shader_image_footprint");
        VK_NV_shader_sm_builtins = ext.contains("VK_NV_shader_sm_builtins");
        VK_NV_shader_subgroup_partitioned = ext.contains("VK_NV_shader_subgroup_partitioned");
        VK_NV_shading_rate_image = check_NV_shading_rate_image(provider, caps, ext);
        VK_NV_viewport_array2 = ext.contains("VK_NV_viewport_array2");
        VK_NV_viewport_swizzle = ext.contains("VK_NV_viewport_swizzle");
        VK_NV_win32_keyed_mutex = ext.contains("VK_NV_win32_keyed_mutex");
        VK_NVX_binary_import = check_NVX_binary_import(provider, caps, ext);
        VK_NVX_image_view_handle = check_NVX_image_view_handle(provider, caps, ext);
        VK_NVX_multiview_per_view_attributes = ext.contains("VK_NVX_multiview_per_view_attributes");
        VK_QCOM_filter_cubic_clamp = ext.contains("VK_QCOM_filter_cubic_clamp");
        VK_QCOM_filter_cubic_weights = ext.contains("VK_QCOM_filter_cubic_weights");
        VK_QCOM_fragment_density_map_offset = ext.contains("VK_QCOM_fragment_density_map_offset");
        VK_QCOM_image_processing = ext.contains("VK_QCOM_image_processing");
        VK_QCOM_image_processing2 = ext.contains("VK_QCOM_image_processing2");
        VK_QCOM_multiview_per_view_render_areas = ext.contains("VK_QCOM_multiview_per_view_render_areas");
        VK_QCOM_multiview_per_view_viewports = ext.contains("VK_QCOM_multiview_per_view_viewports");
        VK_QCOM_render_pass_shader_resolve = ext.contains("VK_QCOM_render_pass_shader_resolve");
        VK_QCOM_render_pass_store_ops = ext.contains("VK_QCOM_render_pass_store_ops");
        VK_QCOM_render_pass_transform = ext.contains("VK_QCOM_render_pass_transform");
        VK_QCOM_rotated_copy_commands = ext.contains("VK_QCOM_rotated_copy_commands");
        VK_QCOM_tile_properties = check_QCOM_tile_properties(provider, caps, ext);
        VK_QCOM_ycbcr_degamma = ext.contains("VK_QCOM_ycbcr_degamma");
        VK_SEC_amigo_profiling = ext.contains("VK_SEC_amigo_profiling");
        STD_VIDEO_STD_vulkan_video_codec_av1 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_av1");
        STD_VIDEO_STD_vulkan_video_codec_h264 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h264");
        STD_VIDEO_STD_vulkan_video_codec_h265 = ext.contains("STD_VIDEO_STD_vulkan_video_codec_h265");
        VK_VALVE_descriptor_set_host_mapping = check_VALVE_descriptor_set_host_mapping(provider, caps, ext);
        VK_VALVE_mutable_descriptor_type = ext.contains("VK_VALVE_mutable_descriptor_type");

        vkGetDeviceProcAddr = caps[0];
        vkDestroyDevice = caps[1];
        vkGetDeviceQueue = caps[2];
        vkQueueSubmit = caps[3];
        vkQueueWaitIdle = caps[4];
        vkDeviceWaitIdle = caps[5];
        vkAllocateMemory = caps[6];
        vkFreeMemory = caps[7];
        vkMapMemory = caps[8];
        vkUnmapMemory = caps[9];
        vkFlushMappedMemoryRanges = caps[10];
        vkInvalidateMappedMemoryRanges = caps[11];
        vkGetDeviceMemoryCommitment = caps[12];
        vkBindBufferMemory = caps[13];
        vkBindImageMemory = caps[14];
        vkGetBufferMemoryRequirements = caps[15];
        vkGetImageMemoryRequirements = caps[16];
        vkGetImageSparseMemoryRequirements = caps[17];
        vkQueueBindSparse = caps[18];
        vkCreateFence = caps[19];
        vkDestroyFence = caps[20];
        vkResetFences = caps[21];
        vkGetFenceStatus = caps[22];
        vkWaitForFences = caps[23];
        vkCreateSemaphore = caps[24];
        vkDestroySemaphore = caps[25];
        vkCreateEvent = caps[26];
        vkDestroyEvent = caps[27];
        vkGetEventStatus = caps[28];
        vkSetEvent = caps[29];
        vkResetEvent = caps[30];
        vkCreateQueryPool = caps[31];
        vkDestroyQueryPool = caps[32];
        vkGetQueryPoolResults = caps[33];
        vkCreateBuffer = caps[34];
        vkDestroyBuffer = caps[35];
        vkCreateBufferView = caps[36];
        vkDestroyBufferView = caps[37];
        vkCreateImage = caps[38];
        vkDestroyImage = caps[39];
        vkGetImageSubresourceLayout = caps[40];
        vkCreateImageView = caps[41];
        vkDestroyImageView = caps[42];
        vkCreateShaderModule = caps[43];
        vkDestroyShaderModule = caps[44];
        vkCreatePipelineCache = caps[45];
        vkDestroyPipelineCache = caps[46];
        vkGetPipelineCacheData = caps[47];
        vkMergePipelineCaches = caps[48];
        vkCreateGraphicsPipelines = caps[49];
        vkCreateComputePipelines = caps[50];
        vkDestroyPipeline = caps[51];
        vkCreatePipelineLayout = caps[52];
        vkDestroyPipelineLayout = caps[53];
        vkCreateSampler = caps[54];
        vkDestroySampler = caps[55];
        vkCreateDescriptorSetLayout = caps[56];
        vkDestroyDescriptorSetLayout = caps[57];
        vkCreateDescriptorPool = caps[58];
        vkDestroyDescriptorPool = caps[59];
        vkResetDescriptorPool = caps[60];
        vkAllocateDescriptorSets = caps[61];
        vkFreeDescriptorSets = caps[62];
        vkUpdateDescriptorSets = caps[63];
        vkCreateFramebuffer = caps[64];
        vkDestroyFramebuffer = caps[65];
        vkCreateRenderPass = caps[66];
        vkDestroyRenderPass = caps[67];
        vkGetRenderAreaGranularity = caps[68];
        vkCreateCommandPool = caps[69];
        vkDestroyCommandPool = caps[70];
        vkResetCommandPool = caps[71];
        vkAllocateCommandBuffers = caps[72];
        vkFreeCommandBuffers = caps[73];
        vkBeginCommandBuffer = caps[74];
        vkEndCommandBuffer = caps[75];
        vkResetCommandBuffer = caps[76];
        vkCmdBindPipeline = caps[77];
        vkCmdSetViewport = caps[78];
        vkCmdSetScissor = caps[79];
        vkCmdSetLineWidth = caps[80];
        vkCmdSetDepthBias = caps[81];
        vkCmdSetBlendConstants = caps[82];
        vkCmdSetDepthBounds = caps[83];
        vkCmdSetStencilCompareMask = caps[84];
        vkCmdSetStencilWriteMask = caps[85];
        vkCmdSetStencilReference = caps[86];
        vkCmdBindDescriptorSets = caps[87];
        vkCmdBindIndexBuffer = caps[88];
        vkCmdBindVertexBuffers = caps[89];
        vkCmdDraw = caps[90];
        vkCmdDrawIndexed = caps[91];
        vkCmdDrawIndirect = caps[92];
        vkCmdDrawIndexedIndirect = caps[93];
        vkCmdDispatch = caps[94];
        vkCmdDispatchIndirect = caps[95];
        vkCmdCopyBuffer = caps[96];
        vkCmdCopyImage = caps[97];
        vkCmdBlitImage = caps[98];
        vkCmdCopyBufferToImage = caps[99];
        vkCmdCopyImageToBuffer = caps[100];
        vkCmdUpdateBuffer = caps[101];
        vkCmdFillBuffer = caps[102];
        vkCmdClearColorImage = caps[103];
        vkCmdClearDepthStencilImage = caps[104];
        vkCmdClearAttachments = caps[105];
        vkCmdResolveImage = caps[106];
        vkCmdSetEvent = caps[107];
        vkCmdResetEvent = caps[108];
        vkCmdWaitEvents = caps[109];
        vkCmdPipelineBarrier = caps[110];
        vkCmdBeginQuery = caps[111];
        vkCmdEndQuery = caps[112];
        vkCmdResetQueryPool = caps[113];
        vkCmdWriteTimestamp = caps[114];
        vkCmdCopyQueryPoolResults = caps[115];
        vkCmdPushConstants = caps[116];
        vkCmdBeginRenderPass = caps[117];
        vkCmdNextSubpass = caps[118];
        vkCmdEndRenderPass = caps[119];
        vkCmdExecuteCommands = caps[120];
        vkBindBufferMemory2 = caps[121];
        vkBindImageMemory2 = caps[122];
        vkGetDeviceGroupPeerMemoryFeatures = caps[123];
        vkCmdSetDeviceMask = caps[124];
        vkCmdDispatchBase = caps[125];
        vkGetImageMemoryRequirements2 = caps[126];
        vkGetBufferMemoryRequirements2 = caps[127];
        vkGetImageSparseMemoryRequirements2 = caps[128];
        vkTrimCommandPool = caps[129];
        vkGetDeviceQueue2 = caps[130];
        vkCreateSamplerYcbcrConversion = caps[131];
        vkDestroySamplerYcbcrConversion = caps[132];
        vkCreateDescriptorUpdateTemplate = caps[133];
        vkDestroyDescriptorUpdateTemplate = caps[134];
        vkUpdateDescriptorSetWithTemplate = caps[135];
        vkGetDescriptorSetLayoutSupport = caps[136];
        vkCmdDrawIndirectCount = caps[137];
        vkCmdDrawIndexedIndirectCount = caps[138];
        vkCreateRenderPass2 = caps[139];
        vkCmdBeginRenderPass2 = caps[140];
        vkCmdNextSubpass2 = caps[141];
        vkCmdEndRenderPass2 = caps[142];
        vkResetQueryPool = caps[143];
        vkGetSemaphoreCounterValue = caps[144];
        vkWaitSemaphores = caps[145];
        vkSignalSemaphore = caps[146];
        vkGetBufferDeviceAddress = caps[147];
        vkGetBufferOpaqueCaptureAddress = caps[148];
        vkGetDeviceMemoryOpaqueCaptureAddress = caps[149];
        vkCreatePrivateDataSlot = caps[150];
        vkDestroyPrivateDataSlot = caps[151];
        vkSetPrivateData = caps[152];
        vkGetPrivateData = caps[153];
        vkCmdSetEvent2 = caps[154];
        vkCmdResetEvent2 = caps[155];
        vkCmdWaitEvents2 = caps[156];
        vkCmdPipelineBarrier2 = caps[157];
        vkCmdWriteTimestamp2 = caps[158];
        vkQueueSubmit2 = caps[159];
        vkCmdCopyBuffer2 = caps[160];
        vkCmdCopyImage2 = caps[161];
        vkCmdCopyBufferToImage2 = caps[162];
        vkCmdCopyImageToBuffer2 = caps[163];
        vkCmdBlitImage2 = caps[164];
        vkCmdResolveImage2 = caps[165];
        vkCmdBeginRendering = caps[166];
        vkCmdEndRendering = caps[167];
        vkCmdSetCullMode = caps[168];
        vkCmdSetFrontFace = caps[169];
        vkCmdSetPrimitiveTopology = caps[170];
        vkCmdSetViewportWithCount = caps[171];
        vkCmdSetScissorWithCount = caps[172];
        vkCmdBindVertexBuffers2 = caps[173];
        vkCmdSetDepthTestEnable = caps[174];
        vkCmdSetDepthWriteEnable = caps[175];
        vkCmdSetDepthCompareOp = caps[176];
        vkCmdSetDepthBoundsTestEnable = caps[177];
        vkCmdSetStencilTestEnable = caps[178];
        vkCmdSetStencilOp = caps[179];
        vkCmdSetRasterizerDiscardEnable = caps[180];
        vkCmdSetDepthBiasEnable = caps[181];
        vkCmdSetPrimitiveRestartEnable = caps[182];
        vkGetDeviceBufferMemoryRequirements = caps[183];
        vkGetDeviceImageMemoryRequirements = caps[184];
        vkGetDeviceImageSparseMemoryRequirements = caps[185];
        vkCmdSetLineStipple = caps[186];
        vkMapMemory2 = caps[187];
        vkUnmapMemory2 = caps[188];
        vkCmdBindIndexBuffer2 = caps[189];
        vkGetRenderingAreaGranularity = caps[190];
        vkGetDeviceImageSubresourceLayout = caps[191];
        vkGetImageSubresourceLayout2 = caps[192];
        vkCmdPushDescriptorSet = caps[193];
        vkCmdPushDescriptorSetWithTemplate = caps[194];
        vkCmdSetRenderingAttachmentLocations = caps[195];
        vkCmdSetRenderingInputAttachmentIndices = caps[196];
        vkCmdBindDescriptorSets2 = caps[197];
        vkCmdPushConstants2 = caps[198];
        vkCmdPushDescriptorSet2 = caps[199];
        vkCmdPushDescriptorSetWithTemplate2 = caps[200];
        vkCopyMemoryToImage = caps[201];
        vkCopyImageToMemory = caps[202];
        vkCopyImageToImage = caps[203];
        vkTransitionImageLayout = caps[204];
        vkAntiLagUpdateAMD = caps[205];
        vkCmdWriteBufferMarkerAMD = caps[206];
        vkCmdWriteBufferMarker2AMD = caps[207];
        vkSetLocalDimmingAMD = caps[208];
        vkCmdDrawIndirectCountAMD = caps[209];
        vkCmdDrawIndexedIndirectCountAMD = caps[210];
        vkGetShaderInfoAMD = caps[211];
        vkCreateExecutionGraphPipelinesAMDX = caps[212];
        vkGetExecutionGraphPipelineScratchSizeAMDX = caps[213];
        vkGetExecutionGraphPipelineNodeIndexAMDX = caps[214];
        vkCmdInitializeGraphScratchMemoryAMDX = caps[215];
        vkCmdDispatchGraphAMDX = caps[216];
        vkCmdDispatchGraphIndirectAMDX = caps[217];
        vkCmdDispatchGraphIndirectCountAMDX = caps[218];
        vkGetAndroidHardwareBufferPropertiesANDROID = caps[219];
        vkGetMemoryAndroidHardwareBufferANDROID = caps[220];
        vkCmdSetAttachmentFeedbackLoopEnableEXT = caps[221];
        vkGetBufferDeviceAddressEXT = caps[222];
        vkGetCalibratedTimestampsEXT = caps[223];
        vkCmdSetColorWriteEnableEXT = caps[224];
        vkCmdBeginConditionalRenderingEXT = caps[225];
        vkCmdEndConditionalRenderingEXT = caps[226];
        vkDebugMarkerSetObjectTagEXT = caps[227];
        vkDebugMarkerSetObjectNameEXT = caps[228];
        vkCmdDebugMarkerBeginEXT = caps[229];
        vkCmdDebugMarkerEndEXT = caps[230];
        vkCmdDebugMarkerInsertEXT = caps[231];
        vkCmdSetDepthBias2EXT = caps[232];
        vkCmdSetDepthClampRangeEXT = caps[233];
        vkGetDescriptorSetLayoutSizeEXT = caps[234];
        vkGetDescriptorSetLayoutBindingOffsetEXT = caps[235];
        vkGetDescriptorEXT = caps[236];
        vkCmdBindDescriptorBuffersEXT = caps[237];
        vkCmdSetDescriptorBufferOffsetsEXT = caps[238];
        vkCmdBindDescriptorBufferEmbeddedSamplersEXT = caps[239];
        vkGetBufferOpaqueCaptureDescriptorDataEXT = caps[240];
        vkGetImageOpaqueCaptureDescriptorDataEXT = caps[241];
        vkGetImageViewOpaqueCaptureDescriptorDataEXT = caps[242];
        vkGetSamplerOpaqueCaptureDescriptorDataEXT = caps[243];
        vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = caps[244];
        vkGetDeviceFaultInfoEXT = caps[245];
        vkGetGeneratedCommandsMemoryRequirementsEXT = caps[246];
        vkCmdPreprocessGeneratedCommandsEXT = caps[247];
        vkCmdExecuteGeneratedCommandsEXT = caps[248];
        vkCreateIndirectCommandsLayoutEXT = caps[249];
        vkDestroyIndirectCommandsLayoutEXT = caps[250];
        vkCreateIndirectExecutionSetEXT = caps[251];
        vkDestroyIndirectExecutionSetEXT = caps[252];
        vkUpdateIndirectExecutionSetPipelineEXT = caps[253];
        vkUpdateIndirectExecutionSetShaderEXT = caps[254];
        vkCmdSetDiscardRectangleEXT = caps[255];
        vkCmdSetDiscardRectangleEnableEXT = caps[256];
        vkCmdSetDiscardRectangleModeEXT = caps[257];
        vkDisplayPowerControlEXT = caps[258];
        vkRegisterDeviceEventEXT = caps[259];
        vkRegisterDisplayEventEXT = caps[260];
        vkGetSwapchainCounterEXT = caps[261];
        vkCmdSetCullModeEXT = caps[262];
        vkCmdSetFrontFaceEXT = caps[263];
        vkCmdSetPrimitiveTopologyEXT = caps[264];
        vkCmdSetViewportWithCountEXT = caps[265];
        vkCmdSetScissorWithCountEXT = caps[266];
        vkCmdBindVertexBuffers2EXT = caps[267];
        vkCmdSetDepthTestEnableEXT = caps[268];
        vkCmdSetDepthWriteEnableEXT = caps[269];
        vkCmdSetDepthCompareOpEXT = caps[270];
        vkCmdSetDepthBoundsTestEnableEXT = caps[271];
        vkCmdSetStencilTestEnableEXT = caps[272];
        vkCmdSetStencilOpEXT = caps[273];
        vkCmdSetPatchControlPointsEXT = caps[274];
        vkCmdSetRasterizerDiscardEnableEXT = caps[275];
        vkCmdSetDepthBiasEnableEXT = caps[276];
        vkCmdSetLogicOpEXT = caps[277];
        vkCmdSetPrimitiveRestartEnableEXT = caps[278];
        vkCmdSetDepthClampEnableEXT = caps[279];
        vkCmdSetPolygonModeEXT = caps[280];
        vkCmdSetRasterizationSamplesEXT = caps[281];
        vkCmdSetSampleMaskEXT = caps[282];
        vkCmdSetAlphaToCoverageEnableEXT = caps[283];
        vkCmdSetAlphaToOneEnableEXT = caps[284];
        vkCmdSetLogicOpEnableEXT = caps[285];
        vkCmdSetColorBlendEnableEXT = caps[286];
        vkCmdSetColorBlendEquationEXT = caps[287];
        vkCmdSetColorWriteMaskEXT = caps[288];
        vkCmdSetTessellationDomainOriginEXT = caps[289];
        vkCmdSetRasterizationStreamEXT = caps[290];
        vkCmdSetConservativeRasterizationModeEXT = caps[291];
        vkCmdSetExtraPrimitiveOverestimationSizeEXT = caps[292];
        vkCmdSetDepthClipEnableEXT = caps[293];
        vkCmdSetSampleLocationsEnableEXT = caps[294];
        vkCmdSetColorBlendAdvancedEXT = caps[295];
        vkCmdSetProvokingVertexModeEXT = caps[296];
        vkCmdSetLineRasterizationModeEXT = caps[297];
        vkCmdSetLineStippleEnableEXT = caps[298];
        vkCmdSetDepthClipNegativeOneToOneEXT = caps[299];
        vkCmdSetViewportWScalingEnableNV = caps[300];
        vkCmdSetViewportSwizzleNV = caps[301];
        vkCmdSetCoverageToColorEnableNV = caps[302];
        vkCmdSetCoverageToColorLocationNV = caps[303];
        vkCmdSetCoverageModulationModeNV = caps[304];
        vkCmdSetCoverageModulationTableEnableNV = caps[305];
        vkCmdSetCoverageModulationTableNV = caps[306];
        vkCmdSetShadingRateImageEnableNV = caps[307];
        vkCmdSetRepresentativeFragmentTestEnableNV = caps[308];
        vkCmdSetCoverageReductionModeNV = caps[309];
        vkGetMemoryHostPointerPropertiesEXT = caps[310];
        vkGetMemoryMetalHandleEXT = caps[311];
        vkGetMemoryMetalHandlePropertiesEXT = caps[312];
        vkAcquireFullScreenExclusiveModeEXT = caps[313];
        vkReleaseFullScreenExclusiveModeEXT = caps[314];
        vkGetDeviceGroupSurfacePresentModes2EXT = caps[315];
        vkSetHdrMetadataEXT = caps[316];
        vkCopyMemoryToImageEXT = caps[317];
        vkCopyImageToMemoryEXT = caps[318];
        vkCopyImageToImageEXT = caps[319];
        vkTransitionImageLayoutEXT = caps[320];
        vkGetImageSubresourceLayout2EXT = caps[321];
        vkResetQueryPoolEXT = caps[322];
        vkGetImageDrmFormatModifierPropertiesEXT = caps[323];
        vkCmdSetLineStippleEXT = caps[324];
        vkCmdDrawMeshTasksEXT = caps[325];
        vkCmdDrawMeshTasksIndirectEXT = caps[326];
        vkCmdDrawMeshTasksIndirectCountEXT = caps[327];
        vkExportMetalObjectsEXT = caps[328];
        vkCmdDrawMultiEXT = caps[329];
        vkCmdDrawMultiIndexedEXT = caps[330];
        vkCreateMicromapEXT = caps[331];
        vkDestroyMicromapEXT = caps[332];
        vkCmdBuildMicromapsEXT = caps[333];
        vkBuildMicromapsEXT = caps[334];
        vkCopyMicromapEXT = caps[335];
        vkCopyMicromapToMemoryEXT = caps[336];
        vkCopyMemoryToMicromapEXT = caps[337];
        vkWriteMicromapsPropertiesEXT = caps[338];
        vkCmdCopyMicromapEXT = caps[339];
        vkCmdCopyMicromapToMemoryEXT = caps[340];
        vkCmdCopyMemoryToMicromapEXT = caps[341];
        vkCmdWriteMicromapsPropertiesEXT = caps[342];
        vkGetDeviceMicromapCompatibilityEXT = caps[343];
        vkGetMicromapBuildSizesEXT = caps[344];
        vkSetDeviceMemoryPriorityEXT = caps[345];
        vkGetPipelinePropertiesEXT = caps[346];
        vkCreatePrivateDataSlotEXT = caps[347];
        vkDestroyPrivateDataSlotEXT = caps[348];
        vkSetPrivateDataEXT = caps[349];
        vkGetPrivateDataEXT = caps[350];
        vkCmdSetSampleLocationsEXT = caps[351];
        vkGetShaderModuleIdentifierEXT = caps[352];
        vkGetShaderModuleCreateInfoIdentifierEXT = caps[353];
        vkCreateShadersEXT = caps[354];
        vkDestroyShaderEXT = caps[355];
        vkGetShaderBinaryDataEXT = caps[356];
        vkCmdBindShadersEXT = caps[357];
        vkCmdSetVertexInputEXT = caps[358];
        vkReleaseSwapchainImagesEXT = caps[359];
        vkCmdBindTransformFeedbackBuffersEXT = caps[360];
        vkCmdBeginTransformFeedbackEXT = caps[361];
        vkCmdEndTransformFeedbackEXT = caps[362];
        vkCmdBeginQueryIndexedEXT = caps[363];
        vkCmdEndQueryIndexedEXT = caps[364];
        vkCmdDrawIndirectByteCountEXT = caps[365];
        vkCreateValidationCacheEXT = caps[366];
        vkDestroyValidationCacheEXT = caps[367];
        vkMergeValidationCachesEXT = caps[368];
        vkGetValidationCacheDataEXT = caps[369];
        vkGetRefreshCycleDurationGOOGLE = caps[370];
        vkGetPastPresentationTimingGOOGLE = caps[371];
        vkCmdDrawClusterHUAWEI = caps[372];
        vkCmdDrawClusterIndirectHUAWEI = caps[373];
        vkCmdBindInvocationMaskHUAWEI = caps[374];
        vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI = caps[375];
        vkCmdSubpassShadingHUAWEI = caps[376];
        vkInitializePerformanceApiINTEL = caps[377];
        vkUninitializePerformanceApiINTEL = caps[378];
        vkCmdSetPerformanceMarkerINTEL = caps[379];
        vkCmdSetPerformanceStreamMarkerINTEL = caps[380];
        vkCmdSetPerformanceOverrideINTEL = caps[381];
        vkAcquirePerformanceConfigurationINTEL = caps[382];
        vkReleasePerformanceConfigurationINTEL = caps[383];
        vkQueueSetPerformanceConfigurationINTEL = caps[384];
        vkGetPerformanceParameterINTEL = caps[385];
        vkCreateAccelerationStructureKHR = caps[386];
        vkDestroyAccelerationStructureKHR = caps[387];
        vkCmdBuildAccelerationStructuresKHR = caps[388];
        vkCmdBuildAccelerationStructuresIndirectKHR = caps[389];
        vkBuildAccelerationStructuresKHR = caps[390];
        vkCopyAccelerationStructureKHR = caps[391];
        vkCopyAccelerationStructureToMemoryKHR = caps[392];
        vkCopyMemoryToAccelerationStructureKHR = caps[393];
        vkWriteAccelerationStructuresPropertiesKHR = caps[394];
        vkCmdCopyAccelerationStructureKHR = caps[395];
        vkCmdCopyAccelerationStructureToMemoryKHR = caps[396];
        vkCmdCopyMemoryToAccelerationStructureKHR = caps[397];
        vkGetAccelerationStructureDeviceAddressKHR = caps[398];
        vkCmdWriteAccelerationStructuresPropertiesKHR = caps[399];
        vkGetDeviceAccelerationStructureCompatibilityKHR = caps[400];
        vkGetAccelerationStructureBuildSizesKHR = caps[401];
        vkBindBufferMemory2KHR = caps[402];
        vkBindImageMemory2KHR = caps[403];
        vkGetBufferDeviceAddressKHR = caps[404];
        vkGetBufferOpaqueCaptureAddressKHR = caps[405];
        vkGetDeviceMemoryOpaqueCaptureAddressKHR = caps[406];
        vkGetCalibratedTimestampsKHR = caps[407];
        vkCmdCopyBuffer2KHR = caps[408];
        vkCmdCopyImage2KHR = caps[409];
        vkCmdCopyBufferToImage2KHR = caps[410];
        vkCmdCopyImageToBuffer2KHR = caps[411];
        vkCmdBlitImage2KHR = caps[412];
        vkCmdResolveImage2KHR = caps[413];
        vkCreateRenderPass2KHR = caps[414];
        vkCmdBeginRenderPass2KHR = caps[415];
        vkCmdNextSubpass2KHR = caps[416];
        vkCmdEndRenderPass2KHR = caps[417];
        vkCreateDeferredOperationKHR = caps[418];
        vkDestroyDeferredOperationKHR = caps[419];
        vkGetDeferredOperationMaxConcurrencyKHR = caps[420];
        vkGetDeferredOperationResultKHR = caps[421];
        vkDeferredOperationJoinKHR = caps[422];
        vkCreateDescriptorUpdateTemplateKHR = caps[423];
        vkDestroyDescriptorUpdateTemplateKHR = caps[424];
        vkUpdateDescriptorSetWithTemplateKHR = caps[425];
        vkCmdPushDescriptorSetWithTemplateKHR = caps[426];
        vkGetDeviceGroupPeerMemoryFeaturesKHR = caps[427];
        vkCmdSetDeviceMaskKHR = caps[428];
        vkCmdDispatchBaseKHR = caps[429];
        vkGetDeviceGroupPresentCapabilitiesKHR = caps[430];
        vkGetDeviceGroupSurfacePresentModesKHR = caps[431];
        vkAcquireNextImage2KHR = caps[432];
        vkCreateSharedSwapchainsKHR = caps[433];
        vkCmdDrawIndirectCountKHR = caps[434];
        vkCmdDrawIndexedIndirectCountKHR = caps[435];
        vkCmdBeginRenderingKHR = caps[436];
        vkCmdEndRenderingKHR = caps[437];
        vkCmdSetRenderingAttachmentLocationsKHR = caps[438];
        vkCmdSetRenderingInputAttachmentIndicesKHR = caps[439];
        vkImportFenceFdKHR = caps[440];
        vkGetFenceFdKHR = caps[441];
        vkImportFenceWin32HandleKHR = caps[442];
        vkGetFenceWin32HandleKHR = caps[443];
        vkGetMemoryFdKHR = caps[444];
        vkGetMemoryFdPropertiesKHR = caps[445];
        vkGetMemoryWin32HandleKHR = caps[446];
        vkGetMemoryWin32HandlePropertiesKHR = caps[447];
        vkImportSemaphoreFdKHR = caps[448];
        vkGetSemaphoreFdKHR = caps[449];
        vkImportSemaphoreWin32HandleKHR = caps[450];
        vkGetSemaphoreWin32HandleKHR = caps[451];
        vkCmdSetFragmentShadingRateKHR = caps[452];
        vkGetImageMemoryRequirements2KHR = caps[453];
        vkGetBufferMemoryRequirements2KHR = caps[454];
        vkGetImageSparseMemoryRequirements2KHR = caps[455];
        vkCmdSetLineStippleKHR = caps[456];
        vkTrimCommandPoolKHR = caps[457];
        vkGetDescriptorSetLayoutSupportKHR = caps[458];
        vkGetDeviceBufferMemoryRequirementsKHR = caps[459];
        vkGetDeviceImageMemoryRequirementsKHR = caps[460];
        vkGetDeviceImageSparseMemoryRequirementsKHR = caps[461];
        vkCmdBindIndexBuffer2KHR = caps[462];
        vkGetRenderingAreaGranularityKHR = caps[463];
        vkGetDeviceImageSubresourceLayoutKHR = caps[464];
        vkGetImageSubresourceLayout2KHR = caps[465];
        vkCmdBindDescriptorSets2KHR = caps[466];
        vkCmdPushConstants2KHR = caps[467];
        vkCmdPushDescriptorSet2KHR = caps[468];
        vkCmdPushDescriptorSetWithTemplate2KHR = caps[469];
        vkCmdSetDescriptorBufferOffsets2EXT = caps[470];
        vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = caps[471];
        vkMapMemory2KHR = caps[472];
        vkUnmapMemory2KHR = caps[473];
        vkAcquireProfilingLockKHR = caps[474];
        vkReleaseProfilingLockKHR = caps[475];
        vkCreatePipelineBinariesKHR = caps[476];
        vkDestroyPipelineBinaryKHR = caps[477];
        vkGetPipelineKeyKHR = caps[478];
        vkGetPipelineBinaryDataKHR = caps[479];
        vkReleaseCapturedPipelineDataKHR = caps[480];
        vkGetPipelineExecutablePropertiesKHR = caps[481];
        vkGetPipelineExecutableStatisticsKHR = caps[482];
        vkGetPipelineExecutableInternalRepresentationsKHR = caps[483];
        vkWaitForPresentKHR = caps[484];
        vkCmdPushDescriptorSetKHR = caps[485];
        vkCmdTraceRaysIndirect2KHR = caps[486];
        vkCmdTraceRaysKHR = caps[487];
        vkCreateRayTracingPipelinesKHR = caps[488];
        vkGetRayTracingShaderGroupHandlesKHR = caps[489];
        vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = caps[490];
        vkCmdTraceRaysIndirectKHR = caps[491];
        vkGetRayTracingShaderGroupStackSizeKHR = caps[492];
        vkCmdSetRayTracingPipelineStackSizeKHR = caps[493];
        vkCreateSamplerYcbcrConversionKHR = caps[494];
        vkDestroySamplerYcbcrConversionKHR = caps[495];
        vkGetSwapchainStatusKHR = caps[496];
        vkCreateSwapchainKHR = caps[497];
        vkDestroySwapchainKHR = caps[498];
        vkGetSwapchainImagesKHR = caps[499];
        vkAcquireNextImageKHR = caps[500];
        vkQueuePresentKHR = caps[501];
        vkCmdSetEvent2KHR = caps[502];
        vkCmdResetEvent2KHR = caps[503];
        vkCmdWaitEvents2KHR = caps[504];
        vkCmdPipelineBarrier2KHR = caps[505];
        vkCmdWriteTimestamp2KHR = caps[506];
        vkQueueSubmit2KHR = caps[507];
        vkGetSemaphoreCounterValueKHR = caps[508];
        vkWaitSemaphoresKHR = caps[509];
        vkSignalSemaphoreKHR = caps[510];
        vkCmdDecodeVideoKHR = caps[511];
        vkGetEncodedVideoSessionParametersKHR = caps[512];
        vkCmdEncodeVideoKHR = caps[513];
        vkCreateVideoSessionKHR = caps[514];
        vkDestroyVideoSessionKHR = caps[515];
        vkGetVideoSessionMemoryRequirementsKHR = caps[516];
        vkBindVideoSessionMemoryKHR = caps[517];
        vkCreateVideoSessionParametersKHR = caps[518];
        vkUpdateVideoSessionParametersKHR = caps[519];
        vkDestroyVideoSessionParametersKHR = caps[520];
        vkCmdBeginVideoCodingKHR = caps[521];
        vkCmdEndVideoCodingKHR = caps[522];
        vkCmdControlVideoCodingKHR = caps[523];
        vkCmdSetViewportWScalingNV = caps[524];
        vkGetClusterAccelerationStructureBuildSizesNV = caps[525];
        vkCmdBuildClusterAccelerationStructureIndirectNV = caps[526];
        vkConvertCooperativeVectorMatrixNV = caps[527];
        vkCmdConvertCooperativeVectorMatrixNV = caps[528];
        vkCmdCopyMemoryIndirectNV = caps[529];
        vkCmdCopyMemoryToImageIndirectNV = caps[530];
        vkCreateCudaModuleNV = caps[531];
        vkGetCudaModuleCacheNV = caps[532];
        vkCreateCudaFunctionNV = caps[533];
        vkDestroyCudaModuleNV = caps[534];
        vkDestroyCudaFunctionNV = caps[535];
        vkCmdCudaLaunchKernelNV = caps[536];
        vkCmdSetCheckpointNV = caps[537];
        vkGetQueueCheckpointDataNV = caps[538];
        vkGetQueueCheckpointData2NV = caps[539];
        vkGetGeneratedCommandsMemoryRequirementsNV = caps[540];
        vkCmdPreprocessGeneratedCommandsNV = caps[541];
        vkCmdExecuteGeneratedCommandsNV = caps[542];
        vkCmdBindPipelineShaderGroupNV = caps[543];
        vkCreateIndirectCommandsLayoutNV = caps[544];
        vkDestroyIndirectCommandsLayoutNV = caps[545];
        vkGetPipelineIndirectMemoryRequirementsNV = caps[546];
        vkCmdUpdatePipelineIndirectBufferNV = caps[547];
        vkGetPipelineIndirectDeviceAddressNV = caps[548];
        vkGetMemoryRemoteAddressNV = caps[549];
        vkGetMemoryWin32HandleNV = caps[550];
        vkCmdSetFragmentShadingRateEnumNV = caps[551];
        vkSetLatencySleepModeNV = caps[552];
        vkLatencySleepNV = caps[553];
        vkSetLatencyMarkerNV = caps[554];
        vkGetLatencyTimingsNV = caps[555];
        vkQueueNotifyOutOfBandNV = caps[556];
        vkCmdDecompressMemoryNV = caps[557];
        vkCmdDecompressMemoryIndirectCountNV = caps[558];
        vkCmdDrawMeshTasksNV = caps[559];
        vkCmdDrawMeshTasksIndirectNV = caps[560];
        vkCmdDrawMeshTasksIndirectCountNV = caps[561];
        vkCreateOpticalFlowSessionNV = caps[562];
        vkDestroyOpticalFlowSessionNV = caps[563];
        vkBindOpticalFlowSessionImageNV = caps[564];
        vkCmdOpticalFlowExecuteNV = caps[565];
        vkGetPartitionedAccelerationStructuresBuildSizesNV = caps[566];
        vkCmdBuildPartitionedAccelerationStructuresNV = caps[567];
        vkCreateAccelerationStructureNV = caps[568];
        vkDestroyAccelerationStructureNV = caps[569];
        vkGetAccelerationStructureMemoryRequirementsNV = caps[570];
        vkBindAccelerationStructureMemoryNV = caps[571];
        vkCmdBuildAccelerationStructureNV = caps[572];
        vkCmdCopyAccelerationStructureNV = caps[573];
        vkCmdTraceRaysNV = caps[574];
        vkCreateRayTracingPipelinesNV = caps[575];
        vkGetRayTracingShaderGroupHandlesNV = caps[576];
        vkGetAccelerationStructureHandleNV = caps[577];
        vkCmdWriteAccelerationStructuresPropertiesNV = caps[578];
        vkCompileDeferredNV = caps[579];
        vkCmdSetExclusiveScissorEnableNV = caps[580];
        vkCmdSetExclusiveScissorNV = caps[581];
        vkCmdBindShadingRateImageNV = caps[582];
        vkCmdSetViewportShadingRatePaletteNV = caps[583];
        vkCmdSetCoarseSampleOrderNV = caps[584];
        vkCreateCuModuleNVX = caps[585];
        vkCreateCuFunctionNVX = caps[586];
        vkDestroyCuModuleNVX = caps[587];
        vkDestroyCuFunctionNVX = caps[588];
        vkCmdCuLaunchKernelNVX = caps[589];
        vkGetImageViewHandleNVX = caps[590];
        vkGetImageViewHandle64NVX = caps[591];
        vkGetImageViewAddressNVX = caps[592];
        vkGetFramebufferTilePropertiesQCOM = caps[593];
        vkGetDynamicRenderingTilePropertiesQCOM = caps[594];
        vkGetDescriptorSetLayoutHostMappingInfoVALVE = caps[595];
        vkGetDescriptorSetHostMappingVALVE = caps[596];
    }

    private static boolean check_VK10(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 
            76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 
            110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120
        },
            "vkGetDeviceProcAddr", "vkDestroyDevice", "vkGetDeviceQueue", "vkQueueSubmit", "vkQueueWaitIdle", "vkDeviceWaitIdle", "vkAllocateMemory", 
            "vkFreeMemory", "vkMapMemory", "vkUnmapMemory", "vkFlushMappedMemoryRanges", "vkInvalidateMappedMemoryRanges", "vkGetDeviceMemoryCommitment", 
            "vkBindBufferMemory", "vkBindImageMemory", "vkGetBufferMemoryRequirements", "vkGetImageMemoryRequirements", "vkGetImageSparseMemoryRequirements", 
            "vkQueueBindSparse", "vkCreateFence", "vkDestroyFence", "vkResetFences", "vkGetFenceStatus", "vkWaitForFences", "vkCreateSemaphore", 
            "vkDestroySemaphore", "vkCreateEvent", "vkDestroyEvent", "vkGetEventStatus", "vkSetEvent", "vkResetEvent", "vkCreateQueryPool", 
            "vkDestroyQueryPool", "vkGetQueryPoolResults", "vkCreateBuffer", "vkDestroyBuffer", "vkCreateBufferView", "vkDestroyBufferView", "vkCreateImage", 
            "vkDestroyImage", "vkGetImageSubresourceLayout", "vkCreateImageView", "vkDestroyImageView", "vkCreateShaderModule", "vkDestroyShaderModule", 
            "vkCreatePipelineCache", "vkDestroyPipelineCache", "vkGetPipelineCacheData", "vkMergePipelineCaches", "vkCreateGraphicsPipelines", 
            "vkCreateComputePipelines", "vkDestroyPipeline", "vkCreatePipelineLayout", "vkDestroyPipelineLayout", "vkCreateSampler", "vkDestroySampler", 
            "vkCreateDescriptorSetLayout", "vkDestroyDescriptorSetLayout", "vkCreateDescriptorPool", "vkDestroyDescriptorPool", "vkResetDescriptorPool", 
            "vkAllocateDescriptorSets", "vkFreeDescriptorSets", "vkUpdateDescriptorSets", "vkCreateFramebuffer", "vkDestroyFramebuffer", "vkCreateRenderPass", 
            "vkDestroyRenderPass", "vkGetRenderAreaGranularity", "vkCreateCommandPool", "vkDestroyCommandPool", "vkResetCommandPool", 
            "vkAllocateCommandBuffers", "vkFreeCommandBuffers", "vkBeginCommandBuffer", "vkEndCommandBuffer", "vkResetCommandBuffer", "vkCmdBindPipeline", 
            "vkCmdSetViewport", "vkCmdSetScissor", "vkCmdSetLineWidth", "vkCmdSetDepthBias", "vkCmdSetBlendConstants", "vkCmdSetDepthBounds", 
            "vkCmdSetStencilCompareMask", "vkCmdSetStencilWriteMask", "vkCmdSetStencilReference", "vkCmdBindDescriptorSets", "vkCmdBindIndexBuffer", 
            "vkCmdBindVertexBuffers", "vkCmdDraw", "vkCmdDrawIndexed", "vkCmdDrawIndirect", "vkCmdDrawIndexedIndirect", "vkCmdDispatch", 
            "vkCmdDispatchIndirect", "vkCmdCopyBuffer", "vkCmdCopyImage", "vkCmdBlitImage", "vkCmdCopyBufferToImage", "vkCmdCopyImageToBuffer", 
            "vkCmdUpdateBuffer", "vkCmdFillBuffer", "vkCmdClearColorImage", "vkCmdClearDepthStencilImage", "vkCmdClearAttachments", "vkCmdResolveImage", 
            "vkCmdSetEvent", "vkCmdResetEvent", "vkCmdWaitEvents", "vkCmdPipelineBarrier", "vkCmdBeginQuery", "vkCmdEndQuery", "vkCmdResetQueryPool", 
            "vkCmdWriteTimestamp", "vkCmdCopyQueryPoolResults", "vkCmdPushConstants", "vkCmdBeginRenderPass", "vkCmdNextSubpass", "vkCmdEndRenderPass", 
            "vkCmdExecuteCommands"
        ) || reportMissing("VK", "Vulkan10");
    }

    private static boolean check_VK11(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136
        },
            "vkBindBufferMemory2", "vkBindImageMemory2", "vkGetDeviceGroupPeerMemoryFeatures", "vkCmdSetDeviceMask", "vkCmdDispatchBase", 
            "vkGetImageMemoryRequirements2", "vkGetBufferMemoryRequirements2", "vkGetImageSparseMemoryRequirements2", "vkTrimCommandPool", "vkGetDeviceQueue2", 
            "vkCreateSamplerYcbcrConversion", "vkDestroySamplerYcbcrConversion", "vkCreateDescriptorUpdateTemplate", "vkDestroyDescriptorUpdateTemplate", 
            "vkUpdateDescriptorSetWithTemplate", "vkGetDescriptorSetLayoutSupport"
        ) || reportMissing("VK", "Vulkan11");
    }

    private static boolean check_VK12(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan12")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149
        },
            "vkCmdDrawIndirectCount", "vkCmdDrawIndexedIndirectCount", "vkCreateRenderPass2", "vkCmdBeginRenderPass2", "vkCmdNextSubpass2", 
            "vkCmdEndRenderPass2", "vkResetQueryPool", "vkGetSemaphoreCounterValue", "vkWaitSemaphores", "vkSignalSemaphore", "vkGetBufferDeviceAddress", 
            "vkGetBufferOpaqueCaptureAddress", "vkGetDeviceMemoryOpaqueCaptureAddress"
        ) || reportMissing("VK", "Vulkan12");
    }

    private static boolean check_VK13(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan13")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 
            179, 180, 181, 182, 183, 184, 185
        },
            "vkCreatePrivateDataSlot", "vkDestroyPrivateDataSlot", "vkSetPrivateData", "vkGetPrivateData", "vkCmdSetEvent2", "vkCmdResetEvent2", 
            "vkCmdWaitEvents2", "vkCmdPipelineBarrier2", "vkCmdWriteTimestamp2", "vkQueueSubmit2", "vkCmdCopyBuffer2", "vkCmdCopyImage2", 
            "vkCmdCopyBufferToImage2", "vkCmdCopyImageToBuffer2", "vkCmdBlitImage2", "vkCmdResolveImage2", "vkCmdBeginRendering", "vkCmdEndRendering", 
            "vkCmdSetCullMode", "vkCmdSetFrontFace", "vkCmdSetPrimitiveTopology", "vkCmdSetViewportWithCount", "vkCmdSetScissorWithCount", 
            "vkCmdBindVertexBuffers2", "vkCmdSetDepthTestEnable", "vkCmdSetDepthWriteEnable", "vkCmdSetDepthCompareOp", "vkCmdSetDepthBoundsTestEnable", 
            "vkCmdSetStencilTestEnable", "vkCmdSetStencilOp", "vkCmdSetRasterizerDiscardEnable", "vkCmdSetDepthBiasEnable", "vkCmdSetPrimitiveRestartEnable", 
            "vkGetDeviceBufferMemoryRequirements", "vkGetDeviceImageMemoryRequirements", "vkGetDeviceImageSparseMemoryRequirements"
        ) || reportMissing("VK", "Vulkan13");
    }

    private static boolean check_VK14(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("Vulkan14")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204
        },
            "vkCmdSetLineStipple", "vkMapMemory2", "vkUnmapMemory2", "vkCmdBindIndexBuffer2", "vkGetRenderingAreaGranularity", 
            "vkGetDeviceImageSubresourceLayout", "vkGetImageSubresourceLayout2", "vkCmdPushDescriptorSet", "vkCmdPushDescriptorSetWithTemplate", 
            "vkCmdSetRenderingAttachmentLocations", "vkCmdSetRenderingInputAttachmentIndices", "vkCmdBindDescriptorSets2", "vkCmdPushConstants2", 
            "vkCmdPushDescriptorSet2", "vkCmdPushDescriptorSetWithTemplate2", "vkCopyMemoryToImage", "vkCopyImageToMemory", "vkCopyImageToImage", 
            "vkTransitionImageLayout"
        ) || reportMissing("VK", "Vulkan14");
    }

    private static boolean check_AMD_anti_lag(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_anti_lag")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            205
        },
            "vkAntiLagUpdateAMD"
        ) || reportMissing("VK", "VK_AMD_anti_lag");
    }

    private static boolean check_AMD_buffer_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_buffer_marker")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan13") || ext.contains("VK_KHR_synchronization2") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            206, flag0 + 207
        },
            "vkCmdWriteBufferMarkerAMD", "vkCmdWriteBufferMarker2AMD"
        ) || reportMissing("VK", "VK_AMD_buffer_marker");
    }

    private static boolean check_AMD_display_native_hdr(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_display_native_hdr")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            208
        },
            "vkSetLocalDimmingAMD"
        ) || reportMissing("VK", "VK_AMD_display_native_hdr");
    }

    private static boolean check_AMD_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            209, 210
        },
            "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndexedIndirectCountAMD"
        ) || reportMissing("VK", "VK_AMD_draw_indirect_count");
    }

    private static boolean check_AMD_shader_info(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMD_shader_info")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            211
        },
            "vkGetShaderInfoAMD"
        ) || reportMissing("VK", "VK_AMD_shader_info");
    }

    private static boolean check_AMDX_shader_enqueue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_AMDX_shader_enqueue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            212, 213, 214, 215, 216, 217, 218
        },
            "vkCreateExecutionGraphPipelinesAMDX", "vkGetExecutionGraphPipelineScratchSizeAMDX", "vkGetExecutionGraphPipelineNodeIndexAMDX", 
            "vkCmdInitializeGraphScratchMemoryAMDX", "vkCmdDispatchGraphAMDX", "vkCmdDispatchGraphIndirectAMDX", "vkCmdDispatchGraphIndirectCountAMDX"
        ) || reportMissing("VK", "VK_AMDX_shader_enqueue");
    }

    private static boolean check_ANDROID_external_memory_android_hardware_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_ANDROID_external_memory_android_hardware_buffer")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            219, 220
        },
            "vkGetAndroidHardwareBufferPropertiesANDROID", "vkGetMemoryAndroidHardwareBufferANDROID"
        ) || reportMissing("VK", "VK_ANDROID_external_memory_android_hardware_buffer");
    }

    private static boolean check_EXT_attachment_feedback_loop_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_attachment_feedback_loop_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            221
        },
            "vkCmdSetAttachmentFeedbackLoopEnableEXT"
        ) || reportMissing("VK", "VK_EXT_attachment_feedback_loop_dynamic_state");
    }

    private static boolean check_EXT_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            222
        },
            "vkGetBufferDeviceAddressEXT"
        ) || reportMissing("VK", "VK_EXT_buffer_device_address");
    }

    private static boolean check_EXT_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            223
        },
            "vkGetCalibratedTimestampsEXT"
        ) || reportMissing("VK", "VK_EXT_calibrated_timestamps");
    }

    private static boolean check_EXT_color_write_enable(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_color_write_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            224
        },
            "vkCmdSetColorWriteEnableEXT"
        ) || reportMissing("VK", "VK_EXT_color_write_enable");
    }

    private static boolean check_EXT_conditional_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_conditional_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            225, 226
        },
            "vkCmdBeginConditionalRenderingEXT", "vkCmdEndConditionalRenderingEXT"
        ) || reportMissing("VK", "VK_EXT_conditional_rendering");
    }

    private static boolean check_EXT_debug_marker(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_debug_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            227, 228, 229, 230, 231
        },
            "vkDebugMarkerSetObjectTagEXT", "vkDebugMarkerSetObjectNameEXT", "vkCmdDebugMarkerBeginEXT", "vkCmdDebugMarkerEndEXT", "vkCmdDebugMarkerInsertEXT"
        ) || reportMissing("VK", "VK_EXT_debug_marker");
    }

    private static boolean check_EXT_depth_bias_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_depth_bias_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            232
        },
            "vkCmdSetDepthBias2EXT"
        ) || reportMissing("VK", "VK_EXT_depth_bias_control");
    }

    private static boolean check_EXT_depth_clamp_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_depth_clamp_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            233
        },
            "vkCmdSetDepthClampRangeEXT"
        ) || reportMissing("VK", "VK_EXT_depth_clamp_control");
    }

    private static boolean check_EXT_descriptor_buffer(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_descriptor_buffer")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_acceleration_structure") || ext.contains("VK_NV_ray_tracing") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            234, 235, 236, 237, 238, 239, 240, 241, 242, 243, flag0 + 244
        },
            "vkGetDescriptorSetLayoutSizeEXT", "vkGetDescriptorSetLayoutBindingOffsetEXT", "vkGetDescriptorEXT", "vkCmdBindDescriptorBuffersEXT", 
            "vkCmdSetDescriptorBufferOffsetsEXT", "vkCmdBindDescriptorBufferEmbeddedSamplersEXT", "vkGetBufferOpaqueCaptureDescriptorDataEXT", 
            "vkGetImageOpaqueCaptureDescriptorDataEXT", "vkGetImageViewOpaqueCaptureDescriptorDataEXT", "vkGetSamplerOpaqueCaptureDescriptorDataEXT", 
            "vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT"
        ) || reportMissing("VK", "VK_EXT_descriptor_buffer");
    }

    private static boolean check_EXT_device_fault(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_device_fault")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            245
        },
            "vkGetDeviceFaultInfoEXT"
        ) || reportMissing("VK", "VK_EXT_device_fault");
    }

    private static boolean check_EXT_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            246, 247, 248, 249, 250, 251, 252, 253, 254
        },
            "vkGetGeneratedCommandsMemoryRequirementsEXT", "vkCmdPreprocessGeneratedCommandsEXT", "vkCmdExecuteGeneratedCommandsEXT", 
            "vkCreateIndirectCommandsLayoutEXT", "vkDestroyIndirectCommandsLayoutEXT", "vkCreateIndirectExecutionSetEXT", "vkDestroyIndirectExecutionSetEXT", 
            "vkUpdateIndirectExecutionSetPipelineEXT", "vkUpdateIndirectExecutionSetShaderEXT"
        ) || reportMissing("VK", "VK_EXT_device_generated_commands");
    }

    private static boolean check_EXT_discard_rectangles(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_discard_rectangles")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            255, 256, 257
        },
            "vkCmdSetDiscardRectangleEXT", "vkCmdSetDiscardRectangleEnableEXT", "vkCmdSetDiscardRectangleModeEXT"
        ) || reportMissing("VK", "VK_EXT_discard_rectangles");
    }

    private static boolean check_EXT_display_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_display_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            258, 259, 260, 261
        },
            "vkDisplayPowerControlEXT", "vkRegisterDeviceEventEXT", "vkRegisterDisplayEventEXT", "vkGetSwapchainCounterEXT"
        ) || reportMissing("VK", "VK_EXT_display_control");
    }

    private static boolean check_EXT_extended_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273
        },
            "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", 
            "vkCmdBindVertexBuffers2EXT", "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", 
            "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state");
    }

    private static boolean check_EXT_extended_dynamic_state2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            274, 275, 276, 277, 278
        },
            "vkCmdSetPatchControlPointsEXT", "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", 
            "vkCmdSetPrimitiveRestartEnableEXT"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state2");
    }

    private static boolean check_EXT_extended_dynamic_state3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_extended_dynamic_state3")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_maintenance2") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_EXT_transform_feedback") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_EXT_conservative_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("VK_EXT_depth_clip_enable") ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains("VK_EXT_sample_locations") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("VK_EXT_blend_operation_advanced") ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("VK_EXT_provoking_vertex") ? 0 : Integer.MIN_VALUE;
        int flag8 = ext.contains("VK_EXT_line_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("VK_EXT_depth_clip_control") ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("VK_NV_clip_space_w_scaling") ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("VK_NV_viewport_swizzle") ? 0 : Integer.MIN_VALUE;
        int flag13 = ext.contains("VK_NV_fragment_coverage_to_color") ? 0 : Integer.MIN_VALUE;
        int flag15 = ext.contains("VK_NV_framebuffer_mixed_samples") ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains("VK_NV_shading_rate_image") ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains("VK_NV_representative_fragment_test") ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains("VK_NV_coverage_reduction_mode") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            279, 280, 281, 282, 283, 284, 285, 286, 287, 288, flag0 + 289, flag1 + 290, flag2 + 291, flag2 + 292, flag4 + 293, flag5 + 294, flag6 + 295, 
            flag7 + 296, flag8 + 297, flag8 + 298, flag10 + 299, flag11 + 300, flag12 + 301, flag13 + 302, flag13 + 303, flag15 + 304, flag15 + 305, 
            flag15 + 306, flag18 + 307, flag19 + 308, flag20 + 309
        },
            "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", "vkCmdSetSampleMaskEXT", 
            "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", "vkCmdSetColorBlendEnableEXT", 
            "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetRasterizationStreamEXT", 
            "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", 
            "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", 
            "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", 
            "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", 
            "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", 
            "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV"
        ) || reportMissing("VK", "VK_EXT_extended_dynamic_state3");
    }

    private static boolean check_EXT_external_memory_host(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_external_memory_host")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            310
        },
            "vkGetMemoryHostPointerPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_external_memory_host");
    }

    private static boolean check_EXT_external_memory_metal(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_external_memory_metal")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            311, 312
        },
            "vkGetMemoryMetalHandleEXT", "vkGetMemoryMetalHandlePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_external_memory_metal");
    }

    private static boolean check_EXT_full_screen_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_full_screen_exclusive")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_device_group") || ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            313, 314, flag0 + 315
        },
            "vkAcquireFullScreenExclusiveModeEXT", "vkReleaseFullScreenExclusiveModeEXT", "vkGetDeviceGroupSurfacePresentModes2EXT"
        ) || reportMissing("VK", "VK_EXT_full_screen_exclusive");
    }

    private static boolean check_EXT_hdr_metadata(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_hdr_metadata")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            316
        },
            "vkSetHdrMetadataEXT"
        ) || reportMissing("VK", "VK_EXT_hdr_metadata");
    }

    private static boolean check_EXT_host_image_copy(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_image_copy")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            317, 318, 319, 320, 321
        },
            "vkCopyMemoryToImageEXT", "vkCopyImageToMemoryEXT", "vkCopyImageToImageEXT", "vkTransitionImageLayoutEXT", "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_host_image_copy");
    }

    private static boolean check_EXT_host_query_reset(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_host_query_reset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            322
        },
            "vkResetQueryPoolEXT"
        ) || reportMissing("VK", "VK_EXT_host_query_reset");
    }

    private static boolean check_EXT_image_compression_control(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_compression_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            321
        },
            "vkGetImageSubresourceLayout2EXT"
        ) || reportMissing("VK", "VK_EXT_image_compression_control");
    }

    private static boolean check_EXT_image_drm_format_modifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_image_drm_format_modifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            323
        },
            "vkGetImageDrmFormatModifierPropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_image_drm_format_modifier");
    }

    private static boolean check_EXT_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            324
        },
            "vkCmdSetLineStippleEXT"
        ) || reportMissing("VK", "VK_EXT_line_rasterization");
    }

    private static boolean check_EXT_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_mesh_shader")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            325, 326, flag0 + 327
        },
            "vkCmdDrawMeshTasksEXT", "vkCmdDrawMeshTasksIndirectEXT", "vkCmdDrawMeshTasksIndirectCountEXT"
        ) || reportMissing("VK", "VK_EXT_mesh_shader");
    }

    private static boolean check_EXT_metal_objects(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_metal_objects")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            328
        },
            "vkExportMetalObjectsEXT"
        ) || reportMissing("VK", "VK_EXT_metal_objects");
    }

    private static boolean check_EXT_multi_draw(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_multi_draw")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            329, 330
        },
            "vkCmdDrawMultiEXT", "vkCmdDrawMultiIndexedEXT"
        ) || reportMissing("VK", "VK_EXT_multi_draw");
    }

    private static boolean check_EXT_opacity_micromap(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_opacity_micromap")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344
        },
            "vkCreateMicromapEXT", "vkDestroyMicromapEXT", "vkCmdBuildMicromapsEXT", "vkBuildMicromapsEXT", "vkCopyMicromapEXT", "vkCopyMicromapToMemoryEXT", 
            "vkCopyMemoryToMicromapEXT", "vkWriteMicromapsPropertiesEXT", "vkCmdCopyMicromapEXT", "vkCmdCopyMicromapToMemoryEXT", 
            "vkCmdCopyMemoryToMicromapEXT", "vkCmdWriteMicromapsPropertiesEXT", "vkGetDeviceMicromapCompatibilityEXT", "vkGetMicromapBuildSizesEXT"
        ) || reportMissing("VK", "VK_EXT_opacity_micromap");
    }

    private static boolean check_EXT_pageable_device_local_memory(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pageable_device_local_memory")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            345
        },
            "vkSetDeviceMemoryPriorityEXT"
        ) || reportMissing("VK", "VK_EXT_pageable_device_local_memory");
    }

    private static boolean check_EXT_pipeline_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_pipeline_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            346
        },
            "vkGetPipelinePropertiesEXT"
        ) || reportMissing("VK", "VK_EXT_pipeline_properties");
    }

    private static boolean check_EXT_private_data(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_private_data")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            347, 348, 349, 350
        },
            "vkCreatePrivateDataSlotEXT", "vkDestroyPrivateDataSlotEXT", "vkSetPrivateDataEXT", "vkGetPrivateDataEXT"
        ) || reportMissing("VK", "VK_EXT_private_data");
    }

    private static boolean check_EXT_sample_locations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_sample_locations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            351
        },
            "vkCmdSetSampleLocationsEXT"
        ) || reportMissing("VK", "VK_EXT_sample_locations");
    }

    private static boolean check_EXT_shader_module_identifier(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_module_identifier")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            352, 353
        },
            "vkGetShaderModuleIdentifierEXT", "vkGetShaderModuleCreateInfoIdentifierEXT"
        ) || reportMissing("VK", "VK_EXT_shader_module_identifier");
    }

    private static boolean check_EXT_shader_object(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_shader_object")) {
            return false;
        }

        int flag0 = ext.contains("VK_EXT_transform_feedback") ? 0 : Integer.MIN_VALUE;
        int flag1 = ext.contains("VK_EXT_conservative_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag3 = ext.contains("VK_EXT_depth_clip_enable") ? 0 : Integer.MIN_VALUE;
        int flag4 = ext.contains("VK_EXT_sample_locations") ? 0 : Integer.MIN_VALUE;
        int flag5 = ext.contains("VK_EXT_blend_operation_advanced") ? 0 : Integer.MIN_VALUE;
        int flag6 = ext.contains("VK_EXT_provoking_vertex") ? 0 : Integer.MIN_VALUE;
        int flag7 = ext.contains("VK_EXT_line_rasterization") ? 0 : Integer.MIN_VALUE;
        int flag9 = ext.contains("VK_EXT_depth_clip_control") ? 0 : Integer.MIN_VALUE;
        int flag10 = ext.contains("VK_NV_clip_space_w_scaling") ? 0 : Integer.MIN_VALUE;
        int flag11 = ext.contains("VK_NV_viewport_swizzle") ? 0 : Integer.MIN_VALUE;
        int flag12 = ext.contains("VK_NV_fragment_coverage_to_color") ? 0 : Integer.MIN_VALUE;
        int flag14 = ext.contains("VK_NV_framebuffer_mixed_samples") ? 0 : Integer.MIN_VALUE;
        int flag17 = ext.contains("VK_NV_shading_rate_image") ? 0 : Integer.MIN_VALUE;
        int flag18 = ext.contains("VK_NV_representative_fragment_test") ? 0 : Integer.MIN_VALUE;
        int flag19 = ext.contains("VK_NV_coverage_reduction_mode") ? 0 : Integer.MIN_VALUE;
        int flag20 = ext.contains("VK_EXT_depth_clamp_control") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            354, 355, 356, 357, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 358, 274, 275, 276, 277, 278, 289, 279, 280, 281, 282, 283, 284, 
            285, 286, 287, 288, flag0 + 290, flag1 + 291, flag1 + 292, flag3 + 293, flag4 + 294, flag5 + 295, flag6 + 296, flag7 + 297, flag7 + 298, 
            flag9 + 299, flag10 + 300, flag11 + 301, flag12 + 302, flag12 + 303, flag14 + 304, flag14 + 305, flag14 + 306, flag17 + 307, flag18 + 308, 
            flag19 + 309, flag20 + 233
        },
            "vkCreateShadersEXT", "vkDestroyShaderEXT", "vkGetShaderBinaryDataEXT", "vkCmdBindShadersEXT", "vkCmdSetCullModeEXT", "vkCmdSetFrontFaceEXT", 
            "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetViewportWithCountEXT", "vkCmdSetScissorWithCountEXT", "vkCmdBindVertexBuffers2EXT", 
            "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthBoundsTestEnableEXT", 
            "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilOpEXT", "vkCmdSetVertexInputEXT", "vkCmdSetPatchControlPointsEXT", 
            "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetDepthBiasEnableEXT", "vkCmdSetLogicOpEXT", "vkCmdSetPrimitiveRestartEnableEXT", 
            "vkCmdSetTessellationDomainOriginEXT", "vkCmdSetDepthClampEnableEXT", "vkCmdSetPolygonModeEXT", "vkCmdSetRasterizationSamplesEXT", 
            "vkCmdSetSampleMaskEXT", "vkCmdSetAlphaToCoverageEnableEXT", "vkCmdSetAlphaToOneEnableEXT", "vkCmdSetLogicOpEnableEXT", 
            "vkCmdSetColorBlendEnableEXT", "vkCmdSetColorBlendEquationEXT", "vkCmdSetColorWriteMaskEXT", "vkCmdSetRasterizationStreamEXT", 
            "vkCmdSetConservativeRasterizationModeEXT", "vkCmdSetExtraPrimitiveOverestimationSizeEXT", "vkCmdSetDepthClipEnableEXT", 
            "vkCmdSetSampleLocationsEnableEXT", "vkCmdSetColorBlendAdvancedEXT", "vkCmdSetProvokingVertexModeEXT", "vkCmdSetLineRasterizationModeEXT", 
            "vkCmdSetLineStippleEnableEXT", "vkCmdSetDepthClipNegativeOneToOneEXT", "vkCmdSetViewportWScalingEnableNV", "vkCmdSetViewportSwizzleNV", 
            "vkCmdSetCoverageToColorEnableNV", "vkCmdSetCoverageToColorLocationNV", "vkCmdSetCoverageModulationModeNV", 
            "vkCmdSetCoverageModulationTableEnableNV", "vkCmdSetCoverageModulationTableNV", "vkCmdSetShadingRateImageEnableNV", 
            "vkCmdSetRepresentativeFragmentTestEnableNV", "vkCmdSetCoverageReductionModeNV", "vkCmdSetDepthClampRangeEXT"
        ) || reportMissing("VK", "VK_EXT_shader_object");
    }

    private static boolean check_EXT_swapchain_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_swapchain_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            359
        },
            "vkReleaseSwapchainImagesEXT"
        ) || reportMissing("VK", "VK_EXT_swapchain_maintenance1");
    }

    private static boolean check_EXT_transform_feedback(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_transform_feedback")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            360, 361, 362, 363, 364, 365
        },
            "vkCmdBindTransformFeedbackBuffersEXT", "vkCmdBeginTransformFeedbackEXT", "vkCmdEndTransformFeedbackEXT", "vkCmdBeginQueryIndexedEXT", 
            "vkCmdEndQueryIndexedEXT", "vkCmdDrawIndirectByteCountEXT"
        ) || reportMissing("VK", "VK_EXT_transform_feedback");
    }

    private static boolean check_EXT_validation_cache(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_validation_cache")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            366, 367, 368, 369
        },
            "vkCreateValidationCacheEXT", "vkDestroyValidationCacheEXT", "vkMergeValidationCachesEXT", "vkGetValidationCacheDataEXT"
        ) || reportMissing("VK", "VK_EXT_validation_cache");
    }

    private static boolean check_EXT_vertex_input_dynamic_state(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_EXT_vertex_input_dynamic_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            358
        },
            "vkCmdSetVertexInputEXT"
        ) || reportMissing("VK", "VK_EXT_vertex_input_dynamic_state");
    }

    private static boolean check_GOOGLE_display_timing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_GOOGLE_display_timing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            370, 371
        },
            "vkGetRefreshCycleDurationGOOGLE", "vkGetPastPresentationTimingGOOGLE"
        ) || reportMissing("VK", "VK_GOOGLE_display_timing");
    }

    private static boolean check_HUAWEI_cluster_culling_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_cluster_culling_shader")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            372, 373
        },
            "vkCmdDrawClusterHUAWEI", "vkCmdDrawClusterIndirectHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_cluster_culling_shader");
    }

    private static boolean check_HUAWEI_invocation_mask(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_invocation_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            374
        },
            "vkCmdBindInvocationMaskHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_invocation_mask");
    }

    private static boolean check_HUAWEI_subpass_shading(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_HUAWEI_subpass_shading")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            375, 376
        },
            "vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", "vkCmdSubpassShadingHUAWEI"
        ) || reportMissing("VK", "VK_HUAWEI_subpass_shading");
    }

    private static boolean check_INTEL_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_INTEL_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            377, 378, 379, 380, 381, 382, 383, 384, 385
        },
            "vkInitializePerformanceApiINTEL", "vkUninitializePerformanceApiINTEL", "vkCmdSetPerformanceMarkerINTEL", "vkCmdSetPerformanceStreamMarkerINTEL", 
            "vkCmdSetPerformanceOverrideINTEL", "vkAcquirePerformanceConfigurationINTEL", "vkReleasePerformanceConfigurationINTEL", 
            "vkQueueSetPerformanceConfigurationINTEL", "vkGetPerformanceParameterINTEL"
        ) || reportMissing("VK", "VK_INTEL_performance_query");
    }

    private static boolean check_KHR_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401
        },
            "vkCreateAccelerationStructureKHR", "vkDestroyAccelerationStructureKHR", "vkCmdBuildAccelerationStructuresKHR", 
            "vkCmdBuildAccelerationStructuresIndirectKHR", "vkBuildAccelerationStructuresKHR", "vkCopyAccelerationStructureKHR", 
            "vkCopyAccelerationStructureToMemoryKHR", "vkCopyMemoryToAccelerationStructureKHR", "vkWriteAccelerationStructuresPropertiesKHR", 
            "vkCmdCopyAccelerationStructureKHR", "vkCmdCopyAccelerationStructureToMemoryKHR", "vkCmdCopyMemoryToAccelerationStructureKHR", 
            "vkGetAccelerationStructureDeviceAddressKHR", "vkCmdWriteAccelerationStructuresPropertiesKHR", "vkGetDeviceAccelerationStructureCompatibilityKHR", 
            "vkGetAccelerationStructureBuildSizesKHR"
        ) || reportMissing("VK", "VK_KHR_acceleration_structure");
    }

    private static boolean check_KHR_bind_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_bind_memory2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            402, 403
        },
            "vkBindBufferMemory2KHR", "vkBindImageMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_bind_memory2");
    }

    private static boolean check_KHR_buffer_device_address(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_buffer_device_address")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            404, 405, 406
        },
            "vkGetBufferDeviceAddressKHR", "vkGetBufferOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddressKHR"
        ) || reportMissing("VK", "VK_KHR_buffer_device_address");
    }

    private static boolean check_KHR_calibrated_timestamps(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_calibrated_timestamps")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            407
        },
            "vkGetCalibratedTimestampsKHR"
        ) || reportMissing("VK", "VK_KHR_calibrated_timestamps");
    }

    private static boolean check_KHR_copy_commands2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_copy_commands2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            408, 409, 410, 411, 412, 413
        },
            "vkCmdCopyBuffer2KHR", "vkCmdCopyImage2KHR", "vkCmdCopyBufferToImage2KHR", "vkCmdCopyImageToBuffer2KHR", "vkCmdBlitImage2KHR", 
            "vkCmdResolveImage2KHR"
        ) || reportMissing("VK", "VK_KHR_copy_commands2");
    }

    private static boolean check_KHR_create_renderpass2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_create_renderpass2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            414, 415, 416, 417
        },
            "vkCreateRenderPass2KHR", "vkCmdBeginRenderPass2KHR", "vkCmdNextSubpass2KHR", "vkCmdEndRenderPass2KHR"
        ) || reportMissing("VK", "VK_KHR_create_renderpass2");
    }

    private static boolean check_KHR_deferred_host_operations(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_deferred_host_operations")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            418, 419, 420, 421, 422
        },
            "vkCreateDeferredOperationKHR", "vkDestroyDeferredOperationKHR", "vkGetDeferredOperationMaxConcurrencyKHR", "vkGetDeferredOperationResultKHR", 
            "vkDeferredOperationJoinKHR"
        ) || reportMissing("VK", "VK_KHR_deferred_host_operations");
    }

    private static boolean check_KHR_descriptor_update_template(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_descriptor_update_template")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_push_descriptor") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            423, 424, 425, flag0 + 426
        },
            "vkCreateDescriptorUpdateTemplateKHR", "vkDestroyDescriptorUpdateTemplateKHR", "vkUpdateDescriptorSetWithTemplateKHR", 
            "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_descriptor_update_template");
    }

    private static boolean check_KHR_device_group(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_device_group")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_surface") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_KHR_swapchain") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            427, 428, 429, flag0 + 430, flag0 + 431, flag2 + 432
        },
            "vkGetDeviceGroupPeerMemoryFeaturesKHR", "vkCmdSetDeviceMaskKHR", "vkCmdDispatchBaseKHR", "vkGetDeviceGroupPresentCapabilitiesKHR", 
            "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_device_group");
    }

    private static boolean check_KHR_display_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_display_swapchain")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            433
        },
            "vkCreateSharedSwapchainsKHR"
        ) || reportMissing("VK", "VK_KHR_display_swapchain");
    }

    private static boolean check_KHR_draw_indirect_count(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_draw_indirect_count")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            434, 435
        },
            "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndexedIndirectCountKHR"
        ) || reportMissing("VK", "VK_KHR_draw_indirect_count");
    }

    private static boolean check_KHR_dynamic_rendering(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            436, 437
        },
            "vkCmdBeginRenderingKHR", "vkCmdEndRenderingKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering");
    }

    private static boolean check_KHR_dynamic_rendering_local_read(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_dynamic_rendering_local_read")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            438, 439
        },
            "vkCmdSetRenderingAttachmentLocationsKHR", "vkCmdSetRenderingInputAttachmentIndicesKHR"
        ) || reportMissing("VK", "VK_KHR_dynamic_rendering_local_read");
    }

    private static boolean check_KHR_external_fence_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            440, 441
        },
            "vkImportFenceFdKHR", "vkGetFenceFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_fd");
    }

    private static boolean check_KHR_external_fence_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_fence_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            442, 443
        },
            "vkImportFenceWin32HandleKHR", "vkGetFenceWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_fence_win32");
    }

    private static boolean check_KHR_external_memory_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            444, 445
        },
            "vkGetMemoryFdKHR", "vkGetMemoryFdPropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_fd");
    }

    private static boolean check_KHR_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            446, 447
        },
            "vkGetMemoryWin32HandleKHR", "vkGetMemoryWin32HandlePropertiesKHR"
        ) || reportMissing("VK", "VK_KHR_external_memory_win32");
    }

    private static boolean check_KHR_external_semaphore_fd(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_fd")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            448, 449
        },
            "vkImportSemaphoreFdKHR", "vkGetSemaphoreFdKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_fd");
    }

    private static boolean check_KHR_external_semaphore_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_external_semaphore_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            450, 451
        },
            "vkImportSemaphoreWin32HandleKHR", "vkGetSemaphoreWin32HandleKHR"
        ) || reportMissing("VK", "VK_KHR_external_semaphore_win32");
    }

    private static boolean check_KHR_fragment_shading_rate(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_fragment_shading_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            452
        },
            "vkCmdSetFragmentShadingRateKHR"
        ) || reportMissing("VK", "VK_KHR_fragment_shading_rate");
    }

    private static boolean check_KHR_get_memory_requirements2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_get_memory_requirements2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            453, 454, 455
        },
            "vkGetImageMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2KHR"
        ) || reportMissing("VK", "VK_KHR_get_memory_requirements2");
    }

    private static boolean check_KHR_line_rasterization(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_line_rasterization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            456
        },
            "vkCmdSetLineStippleKHR"
        ) || reportMissing("VK", "VK_KHR_line_rasterization");
    }

    private static boolean check_KHR_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance1")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            457
        },
            "vkTrimCommandPoolKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance1");
    }

    private static boolean check_KHR_maintenance3(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance3")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            458
        },
            "vkGetDescriptorSetLayoutSupportKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance3");
    }

    private static boolean check_KHR_maintenance4(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance4")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            459, 460, 461
        },
            "vkGetDeviceBufferMemoryRequirementsKHR", "vkGetDeviceImageMemoryRequirementsKHR", "vkGetDeviceImageSparseMemoryRequirementsKHR"
        ) || reportMissing("VK", "VK_KHR_maintenance4");
    }

    private static boolean check_KHR_maintenance5(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance5")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            462, 463, 464, 465
        },
            "vkCmdBindIndexBuffer2KHR", "vkGetRenderingAreaGranularityKHR", "vkGetDeviceImageSubresourceLayoutKHR", "vkGetImageSubresourceLayout2KHR"
        ) || reportMissing("VK", "VK_KHR_maintenance5");
    }

    private static boolean check_KHR_maintenance6(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_maintenance6")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_push_descriptor") ? 0 : Integer.MIN_VALUE;
        int flag2 = ext.contains("VK_EXT_descriptor_buffer") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            466, 467, flag0 + 468, flag0 + 469, flag2 + 470, flag2 + 471
        },
            "vkCmdBindDescriptorSets2KHR", "vkCmdPushConstants2KHR", "vkCmdPushDescriptorSet2KHR", "vkCmdPushDescriptorSetWithTemplate2KHR", 
            "vkCmdSetDescriptorBufferOffsets2EXT", "vkCmdBindDescriptorBufferEmbeddedSamplers2EXT"
        ) || reportMissing("VK", "VK_KHR_maintenance6");
    }

    private static boolean check_KHR_map_memory2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_map_memory2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            472, 473
        },
            "vkMapMemory2KHR", "vkUnmapMemory2KHR"
        ) || reportMissing("VK", "VK_KHR_map_memory2");
    }

    private static boolean check_KHR_performance_query(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_performance_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            474, 475
        },
            "vkAcquireProfilingLockKHR", "vkReleaseProfilingLockKHR"
        ) || reportMissing("VK", "VK_KHR_performance_query");
    }

    private static boolean check_KHR_pipeline_binary(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_binary")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            476, 477, 478, 479, 480
        },
            "vkCreatePipelineBinariesKHR", "vkDestroyPipelineBinaryKHR", "vkGetPipelineKeyKHR", "vkGetPipelineBinaryDataKHR", 
            "vkReleaseCapturedPipelineDataKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_binary");
    }

    private static boolean check_KHR_pipeline_executable_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_pipeline_executable_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            481, 482, 483
        },
            "vkGetPipelineExecutablePropertiesKHR", "vkGetPipelineExecutableStatisticsKHR", "vkGetPipelineExecutableInternalRepresentationsKHR"
        ) || reportMissing("VK", "VK_KHR_pipeline_executable_properties");
    }

    private static boolean check_KHR_present_wait(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_present_wait")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            484
        },
            "vkWaitForPresentKHR"
        ) || reportMissing("VK", "VK_KHR_present_wait");
    }

    private static boolean check_KHR_push_descriptor(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_push_descriptor")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") || ext.contains("VK_KHR_descriptor_update_template") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            485, flag0 + 426
        },
            "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSetWithTemplateKHR"
        ) || reportMissing("VK", "VK_KHR_push_descriptor");
    }

    private static boolean check_KHR_ray_tracing_maintenance1(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_maintenance1")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_ray_tracing_pipeline") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            flag0 + 486
        },
            "vkCmdTraceRaysIndirect2KHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_maintenance1");
    }

    private static boolean check_KHR_ray_tracing_pipeline(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_ray_tracing_pipeline")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            487, 488, 489, 490, 491, 492, 493
        },
            "vkCmdTraceRaysKHR", "vkCreateRayTracingPipelinesKHR", "vkGetRayTracingShaderGroupHandlesKHR", "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", 
            "vkCmdTraceRaysIndirectKHR", "vkGetRayTracingShaderGroupStackSizeKHR", "vkCmdSetRayTracingPipelineStackSizeKHR"
        ) || reportMissing("VK", "VK_KHR_ray_tracing_pipeline");
    }

    private static boolean check_KHR_sampler_ycbcr_conversion(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_sampler_ycbcr_conversion")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            494, 495
        },
            "vkCreateSamplerYcbcrConversionKHR", "vkDestroySamplerYcbcrConversionKHR"
        ) || reportMissing("VK", "VK_KHR_sampler_ycbcr_conversion");
    }

    private static boolean check_KHR_shared_presentable_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_shared_presentable_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            496
        },
            "vkGetSwapchainStatusKHR"
        ) || reportMissing("VK", "VK_KHR_shared_presentable_image");
    }

    private static boolean check_KHR_swapchain(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_swapchain")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan11") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            497, 498, 499, 500, 501, flag0 + 430, flag0 + 431, flag0 + 432
        },
            "vkCreateSwapchainKHR", "vkDestroySwapchainKHR", "vkGetSwapchainImagesKHR", "vkAcquireNextImageKHR", "vkQueuePresentKHR", 
            "vkGetDeviceGroupPresentCapabilitiesKHR", "vkGetDeviceGroupSurfacePresentModesKHR", "vkAcquireNextImage2KHR"
        ) || reportMissing("VK", "VK_KHR_swapchain");
    }

    private static boolean check_KHR_synchronization2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_synchronization2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            502, 503, 504, 505, 506, 507
        },
            "vkCmdSetEvent2KHR", "vkCmdResetEvent2KHR", "vkCmdWaitEvents2KHR", "vkCmdPipelineBarrier2KHR", "vkCmdWriteTimestamp2KHR", "vkQueueSubmit2KHR"
        ) || reportMissing("VK", "VK_KHR_synchronization2");
    }

    private static boolean check_KHR_timeline_semaphore(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_timeline_semaphore")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            508, 509, 510
        },
            "vkGetSemaphoreCounterValueKHR", "vkWaitSemaphoresKHR", "vkSignalSemaphoreKHR"
        ) || reportMissing("VK", "VK_KHR_timeline_semaphore");
    }

    private static boolean check_KHR_video_decode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_decode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            511
        },
            "vkCmdDecodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_decode_queue");
    }

    private static boolean check_KHR_video_encode_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_encode_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            512, 513
        },
            "vkGetEncodedVideoSessionParametersKHR", "vkCmdEncodeVideoKHR"
        ) || reportMissing("VK", "VK_KHR_video_encode_queue");
    }

    private static boolean check_KHR_video_queue(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_KHR_video_queue")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            514, 515, 516, 517, 518, 519, 520, 521, 522, 523
        },
            "vkCreateVideoSessionKHR", "vkDestroyVideoSessionKHR", "vkGetVideoSessionMemoryRequirementsKHR", "vkBindVideoSessionMemoryKHR", 
            "vkCreateVideoSessionParametersKHR", "vkUpdateVideoSessionParametersKHR", "vkDestroyVideoSessionParametersKHR", "vkCmdBeginVideoCodingKHR", 
            "vkCmdEndVideoCodingKHR", "vkCmdControlVideoCodingKHR"
        ) || reportMissing("VK", "VK_KHR_video_queue");
    }

    private static boolean check_NV_clip_space_w_scaling(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_clip_space_w_scaling")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            524
        },
            "vkCmdSetViewportWScalingNV"
        ) || reportMissing("VK", "VK_NV_clip_space_w_scaling");
    }

    private static boolean check_NV_cluster_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cluster_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            525, 526
        },
            "vkGetClusterAccelerationStructureBuildSizesNV", "vkCmdBuildClusterAccelerationStructureIndirectNV"
        ) || reportMissing("VK", "VK_NV_cluster_acceleration_structure");
    }

    private static boolean check_NV_cooperative_vector(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cooperative_vector")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            527, 528
        },
            "vkConvertCooperativeVectorMatrixNV", "vkCmdConvertCooperativeVectorMatrixNV"
        ) || reportMissing("VK", "VK_NV_cooperative_vector");
    }

    private static boolean check_NV_copy_memory_indirect(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_copy_memory_indirect")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            529, 530
        },
            "vkCmdCopyMemoryIndirectNV", "vkCmdCopyMemoryToImageIndirectNV"
        ) || reportMissing("VK", "VK_NV_copy_memory_indirect");
    }

    private static boolean check_NV_cuda_kernel_launch(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_cuda_kernel_launch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            531, 532, 533, 534, 535, 536
        },
            "vkCreateCudaModuleNV", "vkGetCudaModuleCacheNV", "vkCreateCudaFunctionNV", "vkDestroyCudaModuleNV", "vkDestroyCudaFunctionNV", 
            "vkCmdCudaLaunchKernelNV"
        ) || reportMissing("VK", "VK_NV_cuda_kernel_launch");
    }

    private static boolean check_NV_device_diagnostic_checkpoints(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_diagnostic_checkpoints")) {
            return false;
        }

        int flag0 = ext.contains("Vulkan13") || ext.contains("VK_KHR_synchronization2") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            537, 538, flag0 + 539
        },
            "vkCmdSetCheckpointNV", "vkGetQueueCheckpointDataNV", "vkGetQueueCheckpointData2NV"
        ) || reportMissing("VK", "VK_NV_device_diagnostic_checkpoints");
    }

    private static boolean check_NV_device_generated_commands(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            540, 541, 542, 543, 544, 545
        },
            "vkGetGeneratedCommandsMemoryRequirementsNV", "vkCmdPreprocessGeneratedCommandsNV", "vkCmdExecuteGeneratedCommandsNV", 
            "vkCmdBindPipelineShaderGroupNV", "vkCreateIndirectCommandsLayoutNV", "vkDestroyIndirectCommandsLayoutNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands");
    }

    private static boolean check_NV_device_generated_commands_compute(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_device_generated_commands_compute")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            546, 547, 548
        },
            "vkGetPipelineIndirectMemoryRequirementsNV", "vkCmdUpdatePipelineIndirectBufferNV", "vkGetPipelineIndirectDeviceAddressNV"
        ) || reportMissing("VK", "VK_NV_device_generated_commands_compute");
    }

    private static boolean check_NV_external_memory_rdma(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_rdma")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            549
        },
            "vkGetMemoryRemoteAddressNV"
        ) || reportMissing("VK", "VK_NV_external_memory_rdma");
    }

    private static boolean check_NV_external_memory_win32(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_external_memory_win32")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            550
        },
            "vkGetMemoryWin32HandleNV"
        ) || reportMissing("VK", "VK_NV_external_memory_win32");
    }

    private static boolean check_NV_fragment_shading_rate_enums(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_fragment_shading_rate_enums")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            551
        },
            "vkCmdSetFragmentShadingRateEnumNV"
        ) || reportMissing("VK", "VK_NV_fragment_shading_rate_enums");
    }

    private static boolean check_NV_low_latency2(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_low_latency2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            552, 553, 554, 555, 556
        },
            "vkSetLatencySleepModeNV", "vkLatencySleepNV", "vkSetLatencyMarkerNV", "vkGetLatencyTimingsNV", "vkQueueNotifyOutOfBandNV"
        ) || reportMissing("VK", "VK_NV_low_latency2");
    }

    private static boolean check_NV_memory_decompression(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_memory_decompression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            557, 558
        },
            "vkCmdDecompressMemoryNV", "vkCmdDecompressMemoryIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_memory_decompression");
    }

    private static boolean check_NV_mesh_shader(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_mesh_shader")) {
            return false;
        }

        int flag0 = ext.contains("VK_KHR_draw_indirect_count") || ext.contains("Vulkan12") ? 0 : Integer.MIN_VALUE;

        return checkFunctions(provider, caps, new int[] {
            559, 560, flag0 + 561
        },
            "vkCmdDrawMeshTasksNV", "vkCmdDrawMeshTasksIndirectNV", "vkCmdDrawMeshTasksIndirectCountNV"
        ) || reportMissing("VK", "VK_NV_mesh_shader");
    }

    private static boolean check_NV_optical_flow(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_optical_flow")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            562, 563, 564, 565
        },
            "vkCreateOpticalFlowSessionNV", "vkDestroyOpticalFlowSessionNV", "vkBindOpticalFlowSessionImageNV", "vkCmdOpticalFlowExecuteNV"
        ) || reportMissing("VK", "VK_NV_optical_flow");
    }

    private static boolean check_NV_partitioned_acceleration_structure(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_partitioned_acceleration_structure")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            566, 567
        },
            "vkGetPartitionedAccelerationStructuresBuildSizesNV", "vkCmdBuildPartitionedAccelerationStructuresNV"
        ) || reportMissing("VK", "VK_NV_partitioned_acceleration_structure");
    }

    private static boolean check_NV_ray_tracing(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_ray_tracing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579
        },
            "vkCreateAccelerationStructureNV", "vkDestroyAccelerationStructureNV", "vkGetAccelerationStructureMemoryRequirementsNV", 
            "vkBindAccelerationStructureMemoryNV", "vkCmdBuildAccelerationStructureNV", "vkCmdCopyAccelerationStructureNV", "vkCmdTraceRaysNV", 
            "vkCreateRayTracingPipelinesNV", "vkGetRayTracingShaderGroupHandlesNV", "vkGetAccelerationStructureHandleNV", 
            "vkCmdWriteAccelerationStructuresPropertiesNV", "vkCompileDeferredNV"
        ) || reportMissing("VK", "VK_NV_ray_tracing");
    }

    private static boolean check_NV_scissor_exclusive(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_scissor_exclusive")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            580, 581
        },
            "vkCmdSetExclusiveScissorEnableNV", "vkCmdSetExclusiveScissorNV"
        ) || reportMissing("VK", "VK_NV_scissor_exclusive");
    }

    private static boolean check_NV_shading_rate_image(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NV_shading_rate_image")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            582, 583, 584
        },
            "vkCmdBindShadingRateImageNV", "vkCmdSetViewportShadingRatePaletteNV", "vkCmdSetCoarseSampleOrderNV"
        ) || reportMissing("VK", "VK_NV_shading_rate_image");
    }

    private static boolean check_NVX_binary_import(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_binary_import")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            585, 586, 587, 588, 589
        },
            "vkCreateCuModuleNVX", "vkCreateCuFunctionNVX", "vkDestroyCuModuleNVX", "vkDestroyCuFunctionNVX", "vkCmdCuLaunchKernelNVX"
        ) || reportMissing("VK", "VK_NVX_binary_import");
    }

    private static boolean check_NVX_image_view_handle(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_NVX_image_view_handle")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            590, 591, 592
        },
            "vkGetImageViewHandleNVX", "vkGetImageViewHandle64NVX", "vkGetImageViewAddressNVX"
        ) || reportMissing("VK", "VK_NVX_image_view_handle");
    }

    private static boolean check_QCOM_tile_properties(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_QCOM_tile_properties")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            593, 594
        },
            "vkGetFramebufferTilePropertiesQCOM", "vkGetDynamicRenderingTilePropertiesQCOM"
        ) || reportMissing("VK", "VK_QCOM_tile_properties");
    }

    private static boolean check_VALVE_descriptor_set_host_mapping(FunctionProvider provider, long[] caps, Set<String> ext) {
        if (!ext.contains("VK_VALVE_descriptor_set_host_mapping")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            595, 596
        },
            "vkGetDescriptorSetLayoutHostMappingInfoVALVE", "vkGetDescriptorSetHostMappingVALVE"
        ) || reportMissing("VK", "VK_VALVE_descriptor_set_host_mapping");
    }

}
