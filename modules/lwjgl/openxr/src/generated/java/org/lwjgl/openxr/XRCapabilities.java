/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import java.util.Set;

import static org.lwjgl.system.Checks.*;

@SuppressWarnings("SimplifiableIfStatement")
public class XRCapabilities {

    // XR10
    public final long
        xrDestroyInstance,
        xrGetInstanceProperties,
        xrPollEvent,
        xrResultToString,
        xrStructureTypeToString,
        xrGetSystem,
        xrGetSystemProperties,
        xrEnumerateEnvironmentBlendModes,
        xrCreateSession,
        xrDestroySession,
        xrEnumerateReferenceSpaces,
        xrCreateReferenceSpace,
        xrGetReferenceSpaceBoundsRect,
        xrCreateActionSpace,
        xrLocateSpace,
        xrDestroySpace,
        xrEnumerateViewConfigurations,
        xrGetViewConfigurationProperties,
        xrEnumerateViewConfigurationViews,
        xrEnumerateSwapchainFormats,
        xrCreateSwapchain,
        xrDestroySwapchain,
        xrEnumerateSwapchainImages,
        xrAcquireSwapchainImage,
        xrWaitSwapchainImage,
        xrReleaseSwapchainImage,
        xrBeginSession,
        xrEndSession,
        xrRequestExitSession,
        xrWaitFrame,
        xrBeginFrame,
        xrEndFrame,
        xrLocateViews,
        xrStringToPath,
        xrPathToString,
        xrCreateActionSet,
        xrDestroyActionSet,
        xrCreateAction,
        xrDestroyAction,
        xrSuggestInteractionProfileBindings,
        xrAttachSessionActionSets,
        xrGetCurrentInteractionProfile,
        xrGetActionStateBoolean,
        xrGetActionStateFloat,
        xrGetActionStateVector2f,
        xrGetActionStatePose,
        xrSyncActions,
        xrEnumerateBoundSourcesForAction,
        xrGetInputSourceLocalizedName,
        xrApplyHapticFeedback,
        xrStopHapticFeedback;

    // XR11
    public final long
        xrLocateSpaces;

    // ALMALENCE_digital_lens_control
    public final long
        xrSetDigitalLensControlALMALENCE;

    // EXT_conformance_automation
    public final long
        xrSetInputDeviceActiveEXT,
        xrSetInputDeviceStateBoolEXT,
        xrSetInputDeviceStateFloatEXT,
        xrSetInputDeviceStateVector2fEXT,
        xrSetInputDeviceLocationEXT;

    // EXT_debug_utils
    public final long
        xrSetDebugUtilsObjectNameEXT,
        xrCreateDebugUtilsMessengerEXT,
        xrDestroyDebugUtilsMessengerEXT,
        xrSubmitDebugUtilsMessageEXT,
        xrSessionBeginDebugUtilsLabelRegionEXT,
        xrSessionEndDebugUtilsLabelRegionEXT,
        xrSessionInsertDebugUtilsLabelEXT;

    // EXT_future
    public final long
        xrPollFutureEXT,
        xrCancelFutureEXT;

    // EXT_hand_tracking
    public final long
        xrCreateHandTrackerEXT,
        xrDestroyHandTrackerEXT,
        xrLocateHandJointsEXT;

    // EXT_performance_settings
    public final long
        xrPerfSettingsSetPerformanceLevelEXT;

    // EXT_plane_detection
    public final long
        xrCreatePlaneDetectorEXT,
        xrDestroyPlaneDetectorEXT,
        xrBeginPlaneDetectionEXT,
        xrGetPlaneDetectionStateEXT,
        xrGetPlaneDetectionsEXT,
        xrGetPlanePolygonBufferEXT;

    // EXT_thermal_query
    public final long
        xrThermalGetTemperatureTrendEXT;

    // FB_body_tracking
    public final long
        xrCreateBodyTrackerFB,
        xrDestroyBodyTrackerFB,
        xrLocateBodyJointsFB,
        xrGetBodySkeletonFB;

    // FB_color_space
    public final long
        xrEnumerateColorSpacesFB,
        xrSetColorSpaceFB;

    // FB_display_refresh_rate
    public final long
        xrEnumerateDisplayRefreshRatesFB,
        xrGetDisplayRefreshRateFB,
        xrRequestDisplayRefreshRateFB;

    // FB_eye_tracking_social
    public final long
        xrCreateEyeTrackerFB,
        xrDestroyEyeTrackerFB,
        xrGetEyeGazesFB;

    // FB_face_tracking
    public final long
        xrCreateFaceTrackerFB,
        xrDestroyFaceTrackerFB,
        xrGetFaceExpressionWeightsFB;

    // FB_face_tracking2
    public final long
        xrCreateFaceTracker2FB,
        xrDestroyFaceTracker2FB,
        xrGetFaceExpressionWeights2FB;

    // FB_foveation
    public final long
        xrCreateFoveationProfileFB,
        xrDestroyFoveationProfileFB;

    // FB_hand_tracking_mesh
    public final long
        xrGetHandMeshFB;

    // FB_haptic_pcm
    public final long
        xrGetDeviceSampleRateFB;

    // FB_keyboard_tracking
    public final long
        xrQuerySystemTrackedKeyboardFB,
        xrCreateKeyboardSpaceFB;

    // FB_passthrough
    public final long
        xrCreatePassthroughFB,
        xrDestroyPassthroughFB,
        xrPassthroughStartFB,
        xrPassthroughPauseFB,
        xrCreatePassthroughLayerFB,
        xrDestroyPassthroughLayerFB,
        xrPassthroughLayerPauseFB,
        xrPassthroughLayerResumeFB,
        xrPassthroughLayerSetStyleFB,
        xrCreateGeometryInstanceFB,
        xrDestroyGeometryInstanceFB,
        xrGeometryInstanceSetTransformFB;

    // FB_passthrough_keyboard_hands
    public final long
        xrPassthroughLayerSetKeyboardHandsIntensityFB;

    // FB_render_model
    public final long
        xrEnumerateRenderModelPathsFB,
        xrGetRenderModelPropertiesFB,
        xrLoadRenderModelFB;

    // FB_scene
    public final long
        xrGetSpaceBoundingBox2DFB,
        xrGetSpaceBoundingBox3DFB,
        xrGetSpaceSemanticLabelsFB,
        xrGetSpaceBoundary2DFB,
        xrGetSpaceRoomLayoutFB;

    // FB_scene_capture
    public final long
        xrRequestSceneCaptureFB;

    // FB_spatial_entity
    public final long
        xrCreateSpatialAnchorFB,
        xrGetSpaceUuidFB,
        xrEnumerateSpaceSupportedComponentsFB,
        xrSetSpaceComponentStatusFB,
        xrGetSpaceComponentStatusFB;

    // FB_spatial_entity_container
    public final long
        xrGetSpaceContainerFB;

    // FB_spatial_entity_query
    public final long
        xrQuerySpacesFB,
        xrRetrieveSpaceQueryResultsFB;

    // FB_spatial_entity_sharing
    public final long
        xrShareSpacesFB;

    // FB_spatial_entity_storage
    public final long
        xrSaveSpaceFB,
        xrEraseSpaceFB;

    // FB_spatial_entity_storage_batch
    public final long
        xrSaveSpaceListFB;

    // FB_spatial_entity_user
    public final long
        xrCreateSpaceUserFB,
        xrGetSpaceUserIdFB,
        xrDestroySpaceUserFB;

    // FB_swapchain_update_state
    public final long
        xrUpdateSwapchainFB,
        xrGetSwapchainStateFB;

    // FB_triangle_mesh
    public final long
        xrCreateTriangleMeshFB,
        xrDestroyTriangleMeshFB,
        xrTriangleMeshGetVertexBufferFB,
        xrTriangleMeshGetIndexBufferFB,
        xrTriangleMeshBeginUpdateFB,
        xrTriangleMeshEndUpdateFB,
        xrTriangleMeshBeginVertexBufferUpdateFB,
        xrTriangleMeshEndVertexBufferUpdateFB;

    // HTC_anchor
    public final long
        xrCreateSpatialAnchorHTC,
        xrGetSpatialAnchorNameHTC;

    // HTC_body_tracking
    public final long
        xrCreateBodyTrackerHTC,
        xrDestroyBodyTrackerHTC,
        xrLocateBodyJointsHTC,
        xrGetBodySkeletonHTC;

    // HTC_facial_tracking
    public final long
        xrCreateFacialTrackerHTC,
        xrDestroyFacialTrackerHTC,
        xrGetFacialExpressionsHTC;

    // HTC_foveation
    public final long
        xrApplyFoveationHTC;

    // HTC_passthrough
    public final long
        xrCreatePassthroughHTC,
        xrDestroyPassthroughHTC;

    // HTCX_vive_tracker_interaction
    public final long
        xrEnumerateViveTrackerPathsHTCX;

    // KHR_convert_timespec_time
    public final long
        xrConvertTimespecTimeToTimeKHR,
        xrConvertTimeToTimespecTimeKHR;

    // KHR_locate_spaces
    public final long
        xrLocateSpacesKHR;

    // KHR_opengl_enable
    public final long
        xrGetOpenGLGraphicsRequirementsKHR;

    // KHR_visibility_mask
    public final long
        xrGetVisibilityMaskKHR;

    // KHR_vulkan_enable
    public final long
        xrGetVulkanInstanceExtensionsKHR,
        xrGetVulkanDeviceExtensionsKHR,
        xrGetVulkanGraphicsDeviceKHR,
        xrGetVulkanGraphicsRequirementsKHR;

    // KHR_vulkan_enable2
    public final long
        xrCreateVulkanInstanceKHR,
        xrCreateVulkanDeviceKHR,
        xrGetVulkanGraphicsDevice2KHR,
        xrGetVulkanGraphicsRequirements2KHR;

    // KHR_win32_convert_performance_counter_time
    public final long
        xrConvertWin32PerformanceCounterToTimeKHR,
        xrConvertTimeToWin32PerformanceCounterKHR;

    // META_colocation_discovery
    public final long
        xrStartColocationDiscoveryMETA,
        xrStopColocationDiscoveryMETA,
        xrStartColocationAdvertisementMETA,
        xrStopColocationAdvertisementMETA;

    // META_environment_depth
    public final long
        xrCreateEnvironmentDepthProviderMETA,
        xrDestroyEnvironmentDepthProviderMETA,
        xrStartEnvironmentDepthProviderMETA,
        xrStopEnvironmentDepthProviderMETA,
        xrCreateEnvironmentDepthSwapchainMETA,
        xrDestroyEnvironmentDepthSwapchainMETA,
        xrEnumerateEnvironmentDepthSwapchainImagesMETA,
        xrGetEnvironmentDepthSwapchainStateMETA,
        xrAcquireEnvironmentDepthImageMETA,
        xrSetEnvironmentDepthHandRemovalMETA;

    // META_foveation_eye_tracked
    public final long
        xrGetFoveationEyeTrackedStateMETA;

    // META_passthrough_color_lut
    public final long
        xrCreatePassthroughColorLutMETA,
        xrDestroyPassthroughColorLutMETA,
        xrUpdatePassthroughColorLutMETA;

    // META_passthrough_preferences
    public final long
        xrGetPassthroughPreferencesMETA;

    // META_performance_metrics
    public final long
        xrEnumeratePerformanceMetricsCounterPathsMETA,
        xrSetPerformanceMetricsStateMETA,
        xrGetPerformanceMetricsStateMETA,
        xrQueryPerformanceMetricsCounterMETA;

    // META_recommended_layer_resolution
    public final long
        xrGetRecommendedLayerResolutionMETA;

    // META_spatial_entity_mesh
    public final long
        xrGetSpaceTriangleMeshMETA;

    // META_spatial_entity_sharing
    public final long
        xrShareSpacesMETA;

    // META_virtual_keyboard
    public final long
        xrCreateVirtualKeyboardMETA,
        xrDestroyVirtualKeyboardMETA,
        xrCreateVirtualKeyboardSpaceMETA,
        xrSuggestVirtualKeyboardLocationMETA,
        xrGetVirtualKeyboardScaleMETA,
        xrSetVirtualKeyboardModelVisibilityMETA,
        xrGetVirtualKeyboardModelAnimationStatesMETA,
        xrGetVirtualKeyboardDirtyTexturesMETA,
        xrGetVirtualKeyboardTextureDataMETA,
        xrSendVirtualKeyboardInputMETA,
        xrChangeVirtualKeyboardTextContextMETA;

    // ML_compat
    public final long
        xrCreateSpaceFromCoordinateFrameUIDML;

    // ML_facial_expression
    public final long
        xrCreateFacialExpressionClientML,
        xrDestroyFacialExpressionClientML,
        xrGetFacialExpressionBlendShapePropertiesML;

    // ML_localization_map
    public final long
        xrEnableLocalizationEventsML,
        xrQueryLocalizationMapsML,
        xrRequestMapLocalizationML,
        xrImportLocalizationMapML,
        xrCreateExportedLocalizationMapML,
        xrDestroyExportedLocalizationMapML,
        xrGetExportedLocalizationMapDataML;

    // ML_marker_understanding
    public final long
        xrCreateMarkerDetectorML,
        xrDestroyMarkerDetectorML,
        xrSnapshotMarkerDetectorML,
        xrGetMarkerDetectorStateML,
        xrGetMarkersML,
        xrGetMarkerReprojectionErrorML,
        xrGetMarkerLengthML,
        xrGetMarkerNumberML,
        xrGetMarkerStringML,
        xrCreateMarkerSpaceML;

    // ML_spatial_anchors
    public final long
        xrCreateSpatialAnchorsAsyncML,
        xrCreateSpatialAnchorsCompleteML,
        xrGetSpatialAnchorStateML;

    // ML_spatial_anchors_storage
    public final long
        xrCreateSpatialAnchorsStorageML,
        xrDestroySpatialAnchorsStorageML,
        xrQuerySpatialAnchorsAsyncML,
        xrQuerySpatialAnchorsCompleteML,
        xrPublishSpatialAnchorsAsyncML,
        xrPublishSpatialAnchorsCompleteML,
        xrDeleteSpatialAnchorsAsyncML,
        xrDeleteSpatialAnchorsCompleteML,
        xrUpdateSpatialAnchorsExpirationAsyncML,
        xrUpdateSpatialAnchorsExpirationCompleteML;

    // ML_system_notifications
    public final long
        xrSetSystemNotificationsML;

    // ML_user_calibration
    public final long
        xrEnableUserCalibrationEventsML;

    // ML_world_mesh_detection
    public final long
        xrCreateWorldMeshDetectorML,
        xrDestroyWorldMeshDetectorML,
        xrRequestWorldMeshStateAsyncML,
        xrRequestWorldMeshStateCompleteML,
        xrGetWorldMeshBufferRecommendSizeML,
        xrAllocateWorldMeshBufferML,
        xrFreeWorldMeshBufferML,
        xrRequestWorldMeshAsyncML,
        xrRequestWorldMeshCompleteML;

    // MNDX_force_feedback_curl
    public final long
        xrApplyForceFeedbackCurlMNDX;

    // MSFT_composition_layer_reprojection
    public final long
        xrEnumerateReprojectionModesMSFT;

    // MSFT_controller_model
    public final long
        xrGetControllerModelKeyMSFT,
        xrLoadControllerModelMSFT,
        xrGetControllerModelPropertiesMSFT,
        xrGetControllerModelStateMSFT;

    // MSFT_hand_tracking_mesh
    public final long
        xrCreateHandMeshSpaceMSFT,
        xrUpdateHandMeshMSFT;

    // MSFT_perception_anchor_interop
    public final long
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT,
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT;

    // MSFT_scene_marker
    public final long
        xrGetSceneMarkerRawDataMSFT,
        xrGetSceneMarkerDecodedStringMSFT;

    // MSFT_scene_understanding
    public final long
        xrEnumerateSceneComputeFeaturesMSFT,
        xrCreateSceneObserverMSFT,
        xrDestroySceneObserverMSFT,
        xrCreateSceneMSFT,
        xrDestroySceneMSFT,
        xrComputeNewSceneMSFT,
        xrGetSceneComputeStateMSFT,
        xrGetSceneComponentsMSFT,
        xrLocateSceneComponentsMSFT,
        xrGetSceneMeshBuffersMSFT;

    // MSFT_scene_understanding_serialization
    public final long
        xrDeserializeSceneMSFT,
        xrGetSerializedSceneFragmentDataMSFT;

    // MSFT_spatial_anchor
    public final long
        xrCreateSpatialAnchorMSFT,
        xrCreateSpatialAnchorSpaceMSFT,
        xrDestroySpatialAnchorMSFT;

    // MSFT_spatial_anchor_persistence
    public final long
        xrCreateSpatialAnchorStoreConnectionMSFT,
        xrDestroySpatialAnchorStoreConnectionMSFT,
        xrPersistSpatialAnchorMSFT,
        xrEnumeratePersistedSpatialAnchorNamesMSFT,
        xrCreateSpatialAnchorFromPersistedNameMSFT,
        xrUnpersistSpatialAnchorMSFT,
        xrClearSpatialAnchorStoreMSFT;

    // MSFT_spatial_graph_bridge
    public final long
        xrCreateSpatialGraphNodeSpaceMSFT,
        xrTryCreateSpatialGraphStaticNodeBindingMSFT,
        xrDestroySpatialGraphNodeBindingMSFT,
        xrGetSpatialGraphNodeBindingPropertiesMSFT;

    // OCULUS_audio_device_guid
    public final long
        xrGetAudioOutputDeviceGuidOculus,
        xrGetAudioInputDeviceGuidOculus;

    // OCULUS_external_camera
    public final long
        xrEnumerateExternalCamerasOCULUS;

    // QCOM_tracking_optimization_settings
    public final long
        xrSetTrackingOptimizationSettingsHintQCOM;

    // VARJO_environment_depth_estimation
    public final long
        xrSetEnvironmentDepthEstimationVARJO;

    // VARJO_marker_tracking
    public final long
        xrSetMarkerTrackingVARJO,
        xrSetMarkerTrackingTimeoutVARJO,
        xrSetMarkerTrackingPredictionVARJO,
        xrGetMarkerSizeVARJO,
        xrCreateMarkerSpaceVARJO;

    // VARJO_view_offset
    public final long
        xrSetViewOffsetVARJO;

    /** The OpenXR API version number. */
    public final long apiVersion;

    /** When true, {@code XR10} is supported. */
    public final boolean OpenXR10;
    /** When true, {@code XR11} is supported. */
    public final boolean OpenXR11;
    /** When true, {@code ALMALENCE_digital_lens_control} is supported. */
    public final boolean XR_ALMALENCE_digital_lens_control;
    /** When true, {@code BD_controller_interaction} is supported. */
    public final boolean XR_BD_controller_interaction;
    /** When true, {@code EPIC_view_configuration_fov} is supported. */
    public final boolean XR_EPIC_view_configuration_fov;
    /** When true, {@code EXT_active_action_set_priority} is supported. */
    public final boolean XR_EXT_active_action_set_priority;
    /** When true, {@code EXT_composition_layer_inverted_alpha} is supported. */
    public final boolean XR_EXT_composition_layer_inverted_alpha;
    /** When true, {@code EXT_conformance_automation} is supported. */
    public final boolean XR_EXT_conformance_automation;
    /** When true, {@code EXT_debug_utils} is supported. */
    public final boolean XR_EXT_debug_utils;
    /** When true, {@code EXT_dpad_binding} is supported. */
    public final boolean XR_EXT_dpad_binding;
    /** When true, {@code EXT_eye_gaze_interaction} is supported. */
    public final boolean XR_EXT_eye_gaze_interaction;
    /** When true, {@code EXT_future} is supported. */
    public final boolean XR_EXT_future;
    /** When true, {@code EXT_hand_interaction} is supported. */
    public final boolean XR_EXT_hand_interaction;
    /** When true, {@code EXT_hand_joints_motion_range} is supported. */
    public final boolean XR_EXT_hand_joints_motion_range;
    /** When true, {@code EXT_hand_tracking} is supported. */
    public final boolean XR_EXT_hand_tracking;
    /** When true, {@code EXT_hand_tracking_data_source} is supported. */
    public final boolean XR_EXT_hand_tracking_data_source;
    /** When true, {@code EXT_hp_mixed_reality_controller} is supported. */
    public final boolean XR_EXT_hp_mixed_reality_controller;
    /** When true, {@code EXT_local_floor} is supported. */
    public final boolean XR_EXT_local_floor;
    /** When true, {@code EXT_palm_pose} is supported. */
    public final boolean XR_EXT_palm_pose;
    /** When true, {@code EXT_performance_settings} is supported. */
    public final boolean XR_EXT_performance_settings;
    /** When true, {@code EXT_plane_detection} is supported. */
    public final boolean XR_EXT_plane_detection;
    /** When true, {@code EXT_samsung_odyssey_controller} is supported. */
    public final boolean XR_EXT_samsung_odyssey_controller;
    /** When true, {@code EXT_thermal_query} is supported. */
    public final boolean XR_EXT_thermal_query;
    /** When true, {@code EXT_user_presence} is supported. */
    public final boolean XR_EXT_user_presence;
    /** When true, {@code EXT_uuid} is supported. */
    public final boolean XR_EXT_uuid;
    /** When true, {@code EXT_view_configuration_depth_range} is supported. */
    public final boolean XR_EXT_view_configuration_depth_range;
    /** When true, {@code EXT_win32_appcontainer_compatible} is supported. */
    public final boolean XR_EXT_win32_appcontainer_compatible;
    /** When true, {@code EXTX_overlay} is supported. */
    public final boolean XR_EXTX_overlay;
    /** When true, {@code FB_body_tracking} is supported. */
    public final boolean XR_FB_body_tracking;
    /** When true, {@code FB_color_space} is supported. */
    public final boolean XR_FB_color_space;
    /** When true, {@code FB_composition_layer_alpha_blend} is supported. */
    public final boolean XR_FB_composition_layer_alpha_blend;
    /** When true, {@code FB_composition_layer_depth_test} is supported. */
    public final boolean XR_FB_composition_layer_depth_test;
    /** When true, {@code FB_composition_layer_image_layout} is supported. */
    public final boolean XR_FB_composition_layer_image_layout;
    /** When true, {@code FB_composition_layer_secure_content} is supported. */
    public final boolean XR_FB_composition_layer_secure_content;
    /** When true, {@code FB_composition_layer_settings} is supported. */
    public final boolean XR_FB_composition_layer_settings;
    /** When true, {@code FB_display_refresh_rate} is supported. */
    public final boolean XR_FB_display_refresh_rate;
    /** When true, {@code FB_eye_tracking_social} is supported. */
    public final boolean XR_FB_eye_tracking_social;
    /** When true, {@code FB_face_tracking} is supported. */
    public final boolean XR_FB_face_tracking;
    /** When true, {@code FB_face_tracking2} is supported. */
    public final boolean XR_FB_face_tracking2;
    /** When true, {@code FB_foveation} is supported. */
    public final boolean XR_FB_foveation;
    /** When true, {@code FB_foveation_configuration} is supported. */
    public final boolean XR_FB_foveation_configuration;
    /** When true, {@code FB_foveation_vulkan} is supported. */
    public final boolean XR_FB_foveation_vulkan;
    /** When true, {@code FB_hand_tracking_aim} is supported. */
    public final boolean XR_FB_hand_tracking_aim;
    /** When true, {@code FB_hand_tracking_capsules} is supported. */
    public final boolean XR_FB_hand_tracking_capsules;
    /** When true, {@code FB_hand_tracking_mesh} is supported. */
    public final boolean XR_FB_hand_tracking_mesh;
    /** When true, {@code FB_haptic_amplitude_envelope} is supported. */
    public final boolean XR_FB_haptic_amplitude_envelope;
    /** When true, {@code FB_haptic_pcm} is supported. */
    public final boolean XR_FB_haptic_pcm;
    /** When true, {@code FB_keyboard_tracking} is supported. */
    public final boolean XR_FB_keyboard_tracking;
    /** When true, {@code FB_passthrough} is supported. */
    public final boolean XR_FB_passthrough;
    /** When true, {@code FB_passthrough_keyboard_hands} is supported. */
    public final boolean XR_FB_passthrough_keyboard_hands;
    /** When true, {@code FB_render_model} is supported. */
    public final boolean XR_FB_render_model;
    /** When true, {@code FB_scene} is supported. */
    public final boolean XR_FB_scene;
    /** When true, {@code FB_scene_capture} is supported. */
    public final boolean XR_FB_scene_capture;
    /** When true, {@code FB_space_warp} is supported. */
    public final boolean XR_FB_space_warp;
    /** When true, {@code FB_spatial_entity} is supported. */
    public final boolean XR_FB_spatial_entity;
    /** When true, {@code FB_spatial_entity_container} is supported. */
    public final boolean XR_FB_spatial_entity_container;
    /** When true, {@code FB_spatial_entity_query} is supported. */
    public final boolean XR_FB_spatial_entity_query;
    /** When true, {@code FB_spatial_entity_sharing} is supported. */
    public final boolean XR_FB_spatial_entity_sharing;
    /** When true, {@code FB_spatial_entity_storage} is supported. */
    public final boolean XR_FB_spatial_entity_storage;
    /** When true, {@code FB_spatial_entity_storage_batch} is supported. */
    public final boolean XR_FB_spatial_entity_storage_batch;
    /** When true, {@code FB_spatial_entity_user} is supported. */
    public final boolean XR_FB_spatial_entity_user;
    /** When true, {@code FB_swapchain_update_state} is supported. */
    public final boolean XR_FB_swapchain_update_state;
    /** When true, {@code FB_swapchain_update_state_opengl_es} is supported. */
    public final boolean XR_FB_swapchain_update_state_opengl_es;
    /** When true, {@code FB_swapchain_update_state_vulkan} is supported. */
    public final boolean XR_FB_swapchain_update_state_vulkan;
    /** When true, {@code FB_touch_controller_pro} is supported. */
    public final boolean XR_FB_touch_controller_pro;
    /** When true, {@code FB_touch_controller_proximity} is supported. */
    public final boolean XR_FB_touch_controller_proximity;
    /** When true, {@code FB_triangle_mesh} is supported. */
    public final boolean XR_FB_triangle_mesh;
    /** When true, {@code HTC_anchor} is supported. */
    public final boolean XR_HTC_anchor;
    /** When true, {@code HTC_body_tracking} is supported. */
    public final boolean XR_HTC_body_tracking;
    /** When true, {@code HTC_facial_tracking} is supported. */
    public final boolean XR_HTC_facial_tracking;
    /** When true, {@code HTC_foveation} is supported. */
    public final boolean XR_HTC_foveation;
    /** When true, {@code HTC_hand_interaction} is supported. */
    public final boolean XR_HTC_hand_interaction;
    /** When true, {@code HTC_passthrough} is supported. */
    public final boolean XR_HTC_passthrough;
    /** When true, {@code HTC_vive_cosmos_controller_interaction} is supported. */
    public final boolean XR_HTC_vive_cosmos_controller_interaction;
    /** When true, {@code HTC_vive_focus3_controller_interaction} is supported. */
    public final boolean XR_HTC_vive_focus3_controller_interaction;
    /** When true, {@code HTC_vive_wrist_tracker_interaction} is supported. */
    public final boolean XR_HTC_vive_wrist_tracker_interaction;
    /** When true, {@code HTCX_vive_tracker_interaction} is supported. */
    public final boolean XR_HTCX_vive_tracker_interaction;
    /** When true, {@code HUAWEI_controller_interaction} is supported. */
    public final boolean XR_HUAWEI_controller_interaction;
    /** When true, {@code KHR_binding_modification} is supported. */
    public final boolean XR_KHR_binding_modification;
    /** When true, {@code KHR_composition_layer_color_scale_bias} is supported. */
    public final boolean XR_KHR_composition_layer_color_scale_bias;
    /** When true, {@code KHR_composition_layer_cube} is supported. */
    public final boolean XR_KHR_composition_layer_cube;
    /** When true, {@code KHR_composition_layer_cylinder} is supported. */
    public final boolean XR_KHR_composition_layer_cylinder;
    /** When true, {@code KHR_composition_layer_depth} is supported. */
    public final boolean XR_KHR_composition_layer_depth;
    /** When true, {@code KHR_composition_layer_equirect} is supported. */
    public final boolean XR_KHR_composition_layer_equirect;
    /** When true, {@code KHR_composition_layer_equirect2} is supported. */
    public final boolean XR_KHR_composition_layer_equirect2;
    /** When true, {@code KHR_convert_timespec_time} is supported. */
    public final boolean XR_KHR_convert_timespec_time;
    /** When true, {@code KHR_loader_init} is supported. */
    public final boolean XR_KHR_loader_init;
    /** When true, {@code KHR_locate_spaces} is supported. */
    public final boolean XR_KHR_locate_spaces;
    /** When true, {@code KHR_maintenance1} is supported. */
    public final boolean XR_KHR_maintenance1;
    /** When true, {@code KHR_opengl_enable} is supported. */
    public final boolean XR_KHR_opengl_enable;
    /** When true, {@code KHR_swapchain_usage_input_attachment_bit} is supported. */
    public final boolean XR_KHR_swapchain_usage_input_attachment_bit;
    /** When true, {@code KHR_visibility_mask} is supported. */
    public final boolean XR_KHR_visibility_mask;
    /** When true, {@code KHR_vulkan_enable} is supported. */
    public final boolean XR_KHR_vulkan_enable;
    /** When true, {@code KHR_vulkan_enable2} is supported. */
    public final boolean XR_KHR_vulkan_enable2;
    /** When true, {@code KHR_vulkan_swapchain_format_list} is supported. */
    public final boolean XR_KHR_vulkan_swapchain_format_list;
    /** When true, {@code KHR_win32_convert_performance_counter_time} is supported. */
    public final boolean XR_KHR_win32_convert_performance_counter_time;
    /** When true, {@code META_automatic_layer_filter} is supported. */
    public final boolean XR_META_automatic_layer_filter;
    /** When true, {@code META_colocation_discovery} is supported. */
    public final boolean XR_META_colocation_discovery;
    /** When true, {@code META_environment_depth} is supported. */
    public final boolean XR_META_environment_depth;
    /** When true, {@code META_foveation_eye_tracked} is supported. */
    public final boolean XR_META_foveation_eye_tracked;
    /** When true, {@code META_headset_id} is supported. */
    public final boolean XR_META_headset_id;
    /** When true, {@code META_local_dimming} is supported. */
    public final boolean XR_META_local_dimming;
    /** When true, {@code META_passthrough_color_lut} is supported. */
    public final boolean XR_META_passthrough_color_lut;
    /** When true, {@code META_passthrough_layer_resumed_event} is supported. */
    public final boolean XR_META_passthrough_layer_resumed_event;
    /** When true, {@code META_passthrough_preferences} is supported. */
    public final boolean XR_META_passthrough_preferences;
    /** When true, {@code META_performance_metrics} is supported. */
    public final boolean XR_META_performance_metrics;
    /** When true, {@code META_recommended_layer_resolution} is supported. */
    public final boolean XR_META_recommended_layer_resolution;
    /** When true, {@code META_spatial_entity_group_sharing} is supported. */
    public final boolean XR_META_spatial_entity_group_sharing;
    /** When true, {@code META_spatial_entity_mesh} is supported. */
    public final boolean XR_META_spatial_entity_mesh;
    /** When true, {@code META_spatial_entity_sharing} is supported. */
    public final boolean XR_META_spatial_entity_sharing;
    /** When true, {@code META_touch_controller_plus} is supported. */
    public final boolean XR_META_touch_controller_plus;
    /** When true, {@code META_virtual_keyboard} is supported. */
    public final boolean XR_META_virtual_keyboard;
    /** When true, {@code META_vulkan_swapchain_create_info} is supported. */
    public final boolean XR_META_vulkan_swapchain_create_info;
    /** When true, {@code ML_compat} is supported. */
    public final boolean XR_ML_compat;
    /** When true, {@code ML_facial_expression} is supported. */
    public final boolean XR_ML_facial_expression;
    /** When true, {@code ML_frame_end_info} is supported. */
    public final boolean XR_ML_frame_end_info;
    /** When true, {@code ML_global_dimmer} is supported. */
    public final boolean XR_ML_global_dimmer;
    /** When true, {@code ML_localization_map} is supported. */
    public final boolean XR_ML_localization_map;
    /** When true, {@code ML_marker_understanding} is supported. */
    public final boolean XR_ML_marker_understanding;
    /** When true, {@code ML_ml2_controller_interaction} is supported. */
    public final boolean XR_ML_ml2_controller_interaction;
    /** When true, {@code ML_spatial_anchors} is supported. */
    public final boolean XR_ML_spatial_anchors;
    /** When true, {@code ML_spatial_anchors_storage} is supported. */
    public final boolean XR_ML_spatial_anchors_storage;
    /** When true, {@code ML_system_notifications} is supported. */
    public final boolean XR_ML_system_notifications;
    /** When true, {@code ML_user_calibration} is supported. */
    public final boolean XR_ML_user_calibration;
    /** When true, {@code ML_view_configuration_depth_range_change} is supported. */
    public final boolean XR_ML_view_configuration_depth_range_change;
    /** When true, {@code ML_world_mesh_detection} is supported. */
    public final boolean XR_ML_world_mesh_detection;
    /** When true, {@code MND_headless} is supported. */
    public final boolean XR_MND_headless;
    /** When true, {@code MND_swapchain_usage_input_attachment_bit} is supported. */
    public final boolean XR_MND_swapchain_usage_input_attachment_bit;
    /** When true, {@code MNDX_egl_enable} is supported. */
    public final boolean XR_MNDX_egl_enable;
    /** When true, {@code MNDX_force_feedback_curl} is supported. */
    public final boolean XR_MNDX_force_feedback_curl;
    /** When true, {@code MSFT_composition_layer_reprojection} is supported. */
    public final boolean XR_MSFT_composition_layer_reprojection;
    /** When true, {@code MSFT_controller_model} is supported. */
    public final boolean XR_MSFT_controller_model;
    /** When true, {@code MSFT_first_person_observer} is supported. */
    public final boolean XR_MSFT_first_person_observer;
    /** When true, {@code MSFT_hand_interaction} is supported. */
    public final boolean XR_MSFT_hand_interaction;
    /** When true, {@code MSFT_hand_tracking_mesh} is supported. */
    public final boolean XR_MSFT_hand_tracking_mesh;
    /** When true, {@code MSFT_holographic_window_attachment} is supported. */
    public final boolean XR_MSFT_holographic_window_attachment;
    /** When true, {@code MSFT_perception_anchor_interop} is supported. */
    public final boolean XR_MSFT_perception_anchor_interop;
    /** When true, {@code MSFT_scene_marker} is supported. */
    public final boolean XR_MSFT_scene_marker;
    /** When true, {@code MSFT_scene_understanding} is supported. */
    public final boolean XR_MSFT_scene_understanding;
    /** When true, {@code MSFT_scene_understanding_serialization} is supported. */
    public final boolean XR_MSFT_scene_understanding_serialization;
    /** When true, {@code MSFT_secondary_view_configuration} is supported. */
    public final boolean XR_MSFT_secondary_view_configuration;
    /** When true, {@code MSFT_spatial_anchor} is supported. */
    public final boolean XR_MSFT_spatial_anchor;
    /** When true, {@code MSFT_spatial_anchor_persistence} is supported. */
    public final boolean XR_MSFT_spatial_anchor_persistence;
    /** When true, {@code MSFT_spatial_graph_bridge} is supported. */
    public final boolean XR_MSFT_spatial_graph_bridge;
    /** When true, {@code MSFT_unbounded_reference_space} is supported. */
    public final boolean XR_MSFT_unbounded_reference_space;
    /** When true, {@code OCULUS_audio_device_guid} is supported. */
    public final boolean XR_OCULUS_audio_device_guid;
    /** When true, {@code OCULUS_external_camera} is supported. */
    public final boolean XR_OCULUS_external_camera;
    /** When true, {@code OPPO_controller_interaction} is supported. */
    public final boolean XR_OPPO_controller_interaction;
    /** When true, {@code QCOM_tracking_optimization_settings} is supported. */
    public final boolean XR_QCOM_tracking_optimization_settings;
    /** When true, {@code ULTRALEAP_hand_tracking_forearm} is supported. */
    public final boolean XR_ULTRALEAP_hand_tracking_forearm;
    /** When true, {@code VALVE_analog_threshold} is supported. */
    public final boolean XR_VALVE_analog_threshold;
    /** When true, {@code VARJO_composition_layer_depth_test} is supported. */
    public final boolean XR_VARJO_composition_layer_depth_test;
    /** When true, {@code VARJO_environment_depth_estimation} is supported. */
    public final boolean XR_VARJO_environment_depth_estimation;
    /** When true, {@code VARJO_foveated_rendering} is supported. */
    public final boolean XR_VARJO_foveated_rendering;
    /** When true, {@code VARJO_marker_tracking} is supported. */
    public final boolean XR_VARJO_marker_tracking;
    /** When true, {@code VARJO_quad_views} is supported. */
    public final boolean XR_VARJO_quad_views;
    /** When true, {@code VARJO_view_offset} is supported. */
    public final boolean XR_VARJO_view_offset;
    /** When true, {@code VARJO_xr4_controller_interaction} is supported. */
    public final boolean XR_VARJO_xr4_controller_interaction;
    /** When true, {@code YVR_controller_interaction} is supported. */
    public final boolean XR_YVR_controller_interaction;

    XRCapabilities(FunctionProvider provider, long apiVersion, Set<String> ext) {
        this.apiVersion = apiVersion;

        long[] caps = new long[308];

        OpenXR10 = check_XR10(provider, caps, ext);
        OpenXR11 = check_XR11(provider, caps, ext);
        XR_ALMALENCE_digital_lens_control = check_ALMALENCE_digital_lens_control(provider, caps, ext);
        XR_BD_controller_interaction = ext.contains("XR_BD_controller_interaction");
        XR_EPIC_view_configuration_fov = ext.contains("XR_EPIC_view_configuration_fov");
        XR_EXT_active_action_set_priority = ext.contains("XR_EXT_active_action_set_priority");
        XR_EXT_composition_layer_inverted_alpha = ext.contains("XR_EXT_composition_layer_inverted_alpha");
        XR_EXT_conformance_automation = check_EXT_conformance_automation(provider, caps, ext);
        XR_EXT_debug_utils = check_EXT_debug_utils(provider, caps, ext);
        XR_EXT_dpad_binding = ext.contains("XR_EXT_dpad_binding");
        XR_EXT_eye_gaze_interaction = ext.contains("XR_EXT_eye_gaze_interaction");
        XR_EXT_future = check_EXT_future(provider, caps, ext);
        XR_EXT_hand_interaction = ext.contains("XR_EXT_hand_interaction");
        XR_EXT_hand_joints_motion_range = ext.contains("XR_EXT_hand_joints_motion_range");
        XR_EXT_hand_tracking = check_EXT_hand_tracking(provider, caps, ext);
        XR_EXT_hand_tracking_data_source = ext.contains("XR_EXT_hand_tracking_data_source");
        XR_EXT_hp_mixed_reality_controller = ext.contains("XR_EXT_hp_mixed_reality_controller");
        XR_EXT_local_floor = ext.contains("XR_EXT_local_floor");
        XR_EXT_palm_pose = ext.contains("XR_EXT_palm_pose");
        XR_EXT_performance_settings = check_EXT_performance_settings(provider, caps, ext);
        XR_EXT_plane_detection = check_EXT_plane_detection(provider, caps, ext);
        XR_EXT_samsung_odyssey_controller = ext.contains("XR_EXT_samsung_odyssey_controller");
        XR_EXT_thermal_query = check_EXT_thermal_query(provider, caps, ext);
        XR_EXT_user_presence = ext.contains("XR_EXT_user_presence");
        XR_EXT_uuid = ext.contains("XR_EXT_uuid");
        XR_EXT_view_configuration_depth_range = ext.contains("XR_EXT_view_configuration_depth_range");
        XR_EXT_win32_appcontainer_compatible = ext.contains("XR_EXT_win32_appcontainer_compatible");
        XR_EXTX_overlay = ext.contains("XR_EXTX_overlay");
        XR_FB_body_tracking = check_FB_body_tracking(provider, caps, ext);
        XR_FB_color_space = check_FB_color_space(provider, caps, ext);
        XR_FB_composition_layer_alpha_blend = ext.contains("XR_FB_composition_layer_alpha_blend");
        XR_FB_composition_layer_depth_test = ext.contains("XR_FB_composition_layer_depth_test");
        XR_FB_composition_layer_image_layout = ext.contains("XR_FB_composition_layer_image_layout");
        XR_FB_composition_layer_secure_content = ext.contains("XR_FB_composition_layer_secure_content");
        XR_FB_composition_layer_settings = ext.contains("XR_FB_composition_layer_settings");
        XR_FB_display_refresh_rate = check_FB_display_refresh_rate(provider, caps, ext);
        XR_FB_eye_tracking_social = check_FB_eye_tracking_social(provider, caps, ext);
        XR_FB_face_tracking = check_FB_face_tracking(provider, caps, ext);
        XR_FB_face_tracking2 = check_FB_face_tracking2(provider, caps, ext);
        XR_FB_foveation = check_FB_foveation(provider, caps, ext);
        XR_FB_foveation_configuration = ext.contains("XR_FB_foveation_configuration");
        XR_FB_foveation_vulkan = ext.contains("XR_FB_foveation_vulkan");
        XR_FB_hand_tracking_aim = ext.contains("XR_FB_hand_tracking_aim");
        XR_FB_hand_tracking_capsules = ext.contains("XR_FB_hand_tracking_capsules");
        XR_FB_hand_tracking_mesh = check_FB_hand_tracking_mesh(provider, caps, ext);
        XR_FB_haptic_amplitude_envelope = ext.contains("XR_FB_haptic_amplitude_envelope");
        XR_FB_haptic_pcm = check_FB_haptic_pcm(provider, caps, ext);
        XR_FB_keyboard_tracking = check_FB_keyboard_tracking(provider, caps, ext);
        XR_FB_passthrough = check_FB_passthrough(provider, caps, ext);
        XR_FB_passthrough_keyboard_hands = check_FB_passthrough_keyboard_hands(provider, caps, ext);
        XR_FB_render_model = check_FB_render_model(provider, caps, ext);
        XR_FB_scene = check_FB_scene(provider, caps, ext);
        XR_FB_scene_capture = check_FB_scene_capture(provider, caps, ext);
        XR_FB_space_warp = ext.contains("XR_FB_space_warp");
        XR_FB_spatial_entity = check_FB_spatial_entity(provider, caps, ext);
        XR_FB_spatial_entity_container = check_FB_spatial_entity_container(provider, caps, ext);
        XR_FB_spatial_entity_query = check_FB_spatial_entity_query(provider, caps, ext);
        XR_FB_spatial_entity_sharing = check_FB_spatial_entity_sharing(provider, caps, ext);
        XR_FB_spatial_entity_storage = check_FB_spatial_entity_storage(provider, caps, ext);
        XR_FB_spatial_entity_storage_batch = check_FB_spatial_entity_storage_batch(provider, caps, ext);
        XR_FB_spatial_entity_user = check_FB_spatial_entity_user(provider, caps, ext);
        XR_FB_swapchain_update_state = check_FB_swapchain_update_state(provider, caps, ext);
        XR_FB_swapchain_update_state_opengl_es = ext.contains("XR_FB_swapchain_update_state_opengl_es");
        XR_FB_swapchain_update_state_vulkan = ext.contains("XR_FB_swapchain_update_state_vulkan");
        XR_FB_touch_controller_pro = ext.contains("XR_FB_touch_controller_pro");
        XR_FB_touch_controller_proximity = ext.contains("XR_FB_touch_controller_proximity");
        XR_FB_triangle_mesh = check_FB_triangle_mesh(provider, caps, ext);
        XR_HTC_anchor = check_HTC_anchor(provider, caps, ext);
        XR_HTC_body_tracking = check_HTC_body_tracking(provider, caps, ext);
        XR_HTC_facial_tracking = check_HTC_facial_tracking(provider, caps, ext);
        XR_HTC_foveation = check_HTC_foveation(provider, caps, ext);
        XR_HTC_hand_interaction = ext.contains("XR_HTC_hand_interaction");
        XR_HTC_passthrough = check_HTC_passthrough(provider, caps, ext);
        XR_HTC_vive_cosmos_controller_interaction = ext.contains("XR_HTC_vive_cosmos_controller_interaction");
        XR_HTC_vive_focus3_controller_interaction = ext.contains("XR_HTC_vive_focus3_controller_interaction");
        XR_HTC_vive_wrist_tracker_interaction = ext.contains("XR_HTC_vive_wrist_tracker_interaction");
        XR_HTCX_vive_tracker_interaction = check_HTCX_vive_tracker_interaction(provider, caps, ext);
        XR_HUAWEI_controller_interaction = ext.contains("XR_HUAWEI_controller_interaction");
        XR_KHR_binding_modification = ext.contains("XR_KHR_binding_modification");
        XR_KHR_composition_layer_color_scale_bias = ext.contains("XR_KHR_composition_layer_color_scale_bias");
        XR_KHR_composition_layer_cube = ext.contains("XR_KHR_composition_layer_cube");
        XR_KHR_composition_layer_cylinder = ext.contains("XR_KHR_composition_layer_cylinder");
        XR_KHR_composition_layer_depth = ext.contains("XR_KHR_composition_layer_depth");
        XR_KHR_composition_layer_equirect = ext.contains("XR_KHR_composition_layer_equirect");
        XR_KHR_composition_layer_equirect2 = ext.contains("XR_KHR_composition_layer_equirect2");
        XR_KHR_convert_timespec_time = check_KHR_convert_timespec_time(provider, caps, ext);
        XR_KHR_loader_init = ext.contains("XR_KHR_loader_init");
        XR_KHR_locate_spaces = check_KHR_locate_spaces(provider, caps, ext);
        XR_KHR_maintenance1 = ext.contains("XR_KHR_maintenance1");
        XR_KHR_opengl_enable = check_KHR_opengl_enable(provider, caps, ext);
        XR_KHR_swapchain_usage_input_attachment_bit = ext.contains("XR_KHR_swapchain_usage_input_attachment_bit");
        XR_KHR_visibility_mask = check_KHR_visibility_mask(provider, caps, ext);
        XR_KHR_vulkan_enable = check_KHR_vulkan_enable(provider, caps, ext);
        XR_KHR_vulkan_enable2 = check_KHR_vulkan_enable2(provider, caps, ext);
        XR_KHR_vulkan_swapchain_format_list = ext.contains("XR_KHR_vulkan_swapchain_format_list");
        XR_KHR_win32_convert_performance_counter_time = check_KHR_win32_convert_performance_counter_time(provider, caps, ext);
        XR_META_automatic_layer_filter = ext.contains("XR_META_automatic_layer_filter");
        XR_META_colocation_discovery = check_META_colocation_discovery(provider, caps, ext);
        XR_META_environment_depth = check_META_environment_depth(provider, caps, ext);
        XR_META_foveation_eye_tracked = check_META_foveation_eye_tracked(provider, caps, ext);
        XR_META_headset_id = ext.contains("XR_META_headset_id");
        XR_META_local_dimming = ext.contains("XR_META_local_dimming");
        XR_META_passthrough_color_lut = check_META_passthrough_color_lut(provider, caps, ext);
        XR_META_passthrough_layer_resumed_event = ext.contains("XR_META_passthrough_layer_resumed_event");
        XR_META_passthrough_preferences = check_META_passthrough_preferences(provider, caps, ext);
        XR_META_performance_metrics = check_META_performance_metrics(provider, caps, ext);
        XR_META_recommended_layer_resolution = check_META_recommended_layer_resolution(provider, caps, ext);
        XR_META_spatial_entity_group_sharing = ext.contains("XR_META_spatial_entity_group_sharing");
        XR_META_spatial_entity_mesh = check_META_spatial_entity_mesh(provider, caps, ext);
        XR_META_spatial_entity_sharing = check_META_spatial_entity_sharing(provider, caps, ext);
        XR_META_touch_controller_plus = ext.contains("XR_META_touch_controller_plus");
        XR_META_virtual_keyboard = check_META_virtual_keyboard(provider, caps, ext);
        XR_META_vulkan_swapchain_create_info = ext.contains("XR_META_vulkan_swapchain_create_info");
        XR_ML_compat = check_ML_compat(provider, caps, ext);
        XR_ML_facial_expression = check_ML_facial_expression(provider, caps, ext);
        XR_ML_frame_end_info = ext.contains("XR_ML_frame_end_info");
        XR_ML_global_dimmer = ext.contains("XR_ML_global_dimmer");
        XR_ML_localization_map = check_ML_localization_map(provider, caps, ext);
        XR_ML_marker_understanding = check_ML_marker_understanding(provider, caps, ext);
        XR_ML_ml2_controller_interaction = ext.contains("XR_ML_ml2_controller_interaction");
        XR_ML_spatial_anchors = check_ML_spatial_anchors(provider, caps, ext);
        XR_ML_spatial_anchors_storage = check_ML_spatial_anchors_storage(provider, caps, ext);
        XR_ML_system_notifications = check_ML_system_notifications(provider, caps, ext);
        XR_ML_user_calibration = check_ML_user_calibration(provider, caps, ext);
        XR_ML_view_configuration_depth_range_change = ext.contains("XR_ML_view_configuration_depth_range_change");
        XR_ML_world_mesh_detection = check_ML_world_mesh_detection(provider, caps, ext);
        XR_MND_headless = ext.contains("XR_MND_headless");
        XR_MND_swapchain_usage_input_attachment_bit = ext.contains("XR_MND_swapchain_usage_input_attachment_bit");
        XR_MNDX_egl_enable = ext.contains("XR_MNDX_egl_enable");
        XR_MNDX_force_feedback_curl = check_MNDX_force_feedback_curl(provider, caps, ext);
        XR_MSFT_composition_layer_reprojection = check_MSFT_composition_layer_reprojection(provider, caps, ext);
        XR_MSFT_controller_model = check_MSFT_controller_model(provider, caps, ext);
        XR_MSFT_first_person_observer = ext.contains("XR_MSFT_first_person_observer");
        XR_MSFT_hand_interaction = ext.contains("XR_MSFT_hand_interaction");
        XR_MSFT_hand_tracking_mesh = check_MSFT_hand_tracking_mesh(provider, caps, ext);
        XR_MSFT_holographic_window_attachment = ext.contains("XR_MSFT_holographic_window_attachment");
        XR_MSFT_perception_anchor_interop = check_MSFT_perception_anchor_interop(provider, caps, ext);
        XR_MSFT_scene_marker = check_MSFT_scene_marker(provider, caps, ext);
        XR_MSFT_scene_understanding = check_MSFT_scene_understanding(provider, caps, ext);
        XR_MSFT_scene_understanding_serialization = check_MSFT_scene_understanding_serialization(provider, caps, ext);
        XR_MSFT_secondary_view_configuration = ext.contains("XR_MSFT_secondary_view_configuration");
        XR_MSFT_spatial_anchor = check_MSFT_spatial_anchor(provider, caps, ext);
        XR_MSFT_spatial_anchor_persistence = check_MSFT_spatial_anchor_persistence(provider, caps, ext);
        XR_MSFT_spatial_graph_bridge = check_MSFT_spatial_graph_bridge(provider, caps, ext);
        XR_MSFT_unbounded_reference_space = ext.contains("XR_MSFT_unbounded_reference_space");
        XR_OCULUS_audio_device_guid = check_OCULUS_audio_device_guid(provider, caps, ext);
        XR_OCULUS_external_camera = check_OCULUS_external_camera(provider, caps, ext);
        XR_OPPO_controller_interaction = ext.contains("XR_OPPO_controller_interaction");
        XR_QCOM_tracking_optimization_settings = check_QCOM_tracking_optimization_settings(provider, caps, ext);
        XR_ULTRALEAP_hand_tracking_forearm = ext.contains("XR_ULTRALEAP_hand_tracking_forearm");
        XR_VALVE_analog_threshold = ext.contains("XR_VALVE_analog_threshold");
        XR_VARJO_composition_layer_depth_test = ext.contains("XR_VARJO_composition_layer_depth_test");
        XR_VARJO_environment_depth_estimation = check_VARJO_environment_depth_estimation(provider, caps, ext);
        XR_VARJO_foveated_rendering = ext.contains("XR_VARJO_foveated_rendering");
        XR_VARJO_marker_tracking = check_VARJO_marker_tracking(provider, caps, ext);
        XR_VARJO_quad_views = ext.contains("XR_VARJO_quad_views");
        XR_VARJO_view_offset = check_VARJO_view_offset(provider, caps, ext);
        XR_VARJO_xr4_controller_interaction = ext.contains("XR_VARJO_xr4_controller_interaction");
        XR_YVR_controller_interaction = ext.contains("XR_YVR_controller_interaction");

        xrDestroyInstance = caps[0];
        xrGetInstanceProperties = caps[1];
        xrPollEvent = caps[2];
        xrResultToString = caps[3];
        xrStructureTypeToString = caps[4];
        xrGetSystem = caps[5];
        xrGetSystemProperties = caps[6];
        xrEnumerateEnvironmentBlendModes = caps[7];
        xrCreateSession = caps[8];
        xrDestroySession = caps[9];
        xrEnumerateReferenceSpaces = caps[10];
        xrCreateReferenceSpace = caps[11];
        xrGetReferenceSpaceBoundsRect = caps[12];
        xrCreateActionSpace = caps[13];
        xrLocateSpace = caps[14];
        xrDestroySpace = caps[15];
        xrEnumerateViewConfigurations = caps[16];
        xrGetViewConfigurationProperties = caps[17];
        xrEnumerateViewConfigurationViews = caps[18];
        xrEnumerateSwapchainFormats = caps[19];
        xrCreateSwapchain = caps[20];
        xrDestroySwapchain = caps[21];
        xrEnumerateSwapchainImages = caps[22];
        xrAcquireSwapchainImage = caps[23];
        xrWaitSwapchainImage = caps[24];
        xrReleaseSwapchainImage = caps[25];
        xrBeginSession = caps[26];
        xrEndSession = caps[27];
        xrRequestExitSession = caps[28];
        xrWaitFrame = caps[29];
        xrBeginFrame = caps[30];
        xrEndFrame = caps[31];
        xrLocateViews = caps[32];
        xrStringToPath = caps[33];
        xrPathToString = caps[34];
        xrCreateActionSet = caps[35];
        xrDestroyActionSet = caps[36];
        xrCreateAction = caps[37];
        xrDestroyAction = caps[38];
        xrSuggestInteractionProfileBindings = caps[39];
        xrAttachSessionActionSets = caps[40];
        xrGetCurrentInteractionProfile = caps[41];
        xrGetActionStateBoolean = caps[42];
        xrGetActionStateFloat = caps[43];
        xrGetActionStateVector2f = caps[44];
        xrGetActionStatePose = caps[45];
        xrSyncActions = caps[46];
        xrEnumerateBoundSourcesForAction = caps[47];
        xrGetInputSourceLocalizedName = caps[48];
        xrApplyHapticFeedback = caps[49];
        xrStopHapticFeedback = caps[50];
        xrLocateSpaces = caps[51];
        xrSetDigitalLensControlALMALENCE = caps[52];
        xrSetInputDeviceActiveEXT = caps[53];
        xrSetInputDeviceStateBoolEXT = caps[54];
        xrSetInputDeviceStateFloatEXT = caps[55];
        xrSetInputDeviceStateVector2fEXT = caps[56];
        xrSetInputDeviceLocationEXT = caps[57];
        xrSetDebugUtilsObjectNameEXT = caps[58];
        xrCreateDebugUtilsMessengerEXT = caps[59];
        xrDestroyDebugUtilsMessengerEXT = caps[60];
        xrSubmitDebugUtilsMessageEXT = caps[61];
        xrSessionBeginDebugUtilsLabelRegionEXT = caps[62];
        xrSessionEndDebugUtilsLabelRegionEXT = caps[63];
        xrSessionInsertDebugUtilsLabelEXT = caps[64];
        xrPollFutureEXT = caps[65];
        xrCancelFutureEXT = caps[66];
        xrCreateHandTrackerEXT = caps[67];
        xrDestroyHandTrackerEXT = caps[68];
        xrLocateHandJointsEXT = caps[69];
        xrPerfSettingsSetPerformanceLevelEXT = caps[70];
        xrCreatePlaneDetectorEXT = caps[71];
        xrDestroyPlaneDetectorEXT = caps[72];
        xrBeginPlaneDetectionEXT = caps[73];
        xrGetPlaneDetectionStateEXT = caps[74];
        xrGetPlaneDetectionsEXT = caps[75];
        xrGetPlanePolygonBufferEXT = caps[76];
        xrThermalGetTemperatureTrendEXT = caps[77];
        xrCreateBodyTrackerFB = caps[78];
        xrDestroyBodyTrackerFB = caps[79];
        xrLocateBodyJointsFB = caps[80];
        xrGetBodySkeletonFB = caps[81];
        xrEnumerateColorSpacesFB = caps[82];
        xrSetColorSpaceFB = caps[83];
        xrEnumerateDisplayRefreshRatesFB = caps[84];
        xrGetDisplayRefreshRateFB = caps[85];
        xrRequestDisplayRefreshRateFB = caps[86];
        xrCreateEyeTrackerFB = caps[87];
        xrDestroyEyeTrackerFB = caps[88];
        xrGetEyeGazesFB = caps[89];
        xrCreateFaceTrackerFB = caps[90];
        xrDestroyFaceTrackerFB = caps[91];
        xrGetFaceExpressionWeightsFB = caps[92];
        xrCreateFaceTracker2FB = caps[93];
        xrDestroyFaceTracker2FB = caps[94];
        xrGetFaceExpressionWeights2FB = caps[95];
        xrCreateFoveationProfileFB = caps[96];
        xrDestroyFoveationProfileFB = caps[97];
        xrGetHandMeshFB = caps[98];
        xrGetDeviceSampleRateFB = caps[99];
        xrQuerySystemTrackedKeyboardFB = caps[100];
        xrCreateKeyboardSpaceFB = caps[101];
        xrCreatePassthroughFB = caps[102];
        xrDestroyPassthroughFB = caps[103];
        xrPassthroughStartFB = caps[104];
        xrPassthroughPauseFB = caps[105];
        xrCreatePassthroughLayerFB = caps[106];
        xrDestroyPassthroughLayerFB = caps[107];
        xrPassthroughLayerPauseFB = caps[108];
        xrPassthroughLayerResumeFB = caps[109];
        xrPassthroughLayerSetStyleFB = caps[110];
        xrCreateGeometryInstanceFB = caps[111];
        xrDestroyGeometryInstanceFB = caps[112];
        xrGeometryInstanceSetTransformFB = caps[113];
        xrPassthroughLayerSetKeyboardHandsIntensityFB = caps[114];
        xrEnumerateRenderModelPathsFB = caps[115];
        xrGetRenderModelPropertiesFB = caps[116];
        xrLoadRenderModelFB = caps[117];
        xrGetSpaceBoundingBox2DFB = caps[118];
        xrGetSpaceBoundingBox3DFB = caps[119];
        xrGetSpaceSemanticLabelsFB = caps[120];
        xrGetSpaceBoundary2DFB = caps[121];
        xrGetSpaceRoomLayoutFB = caps[122];
        xrRequestSceneCaptureFB = caps[123];
        xrCreateSpatialAnchorFB = caps[124];
        xrGetSpaceUuidFB = caps[125];
        xrEnumerateSpaceSupportedComponentsFB = caps[126];
        xrSetSpaceComponentStatusFB = caps[127];
        xrGetSpaceComponentStatusFB = caps[128];
        xrGetSpaceContainerFB = caps[129];
        xrQuerySpacesFB = caps[130];
        xrRetrieveSpaceQueryResultsFB = caps[131];
        xrShareSpacesFB = caps[132];
        xrSaveSpaceFB = caps[133];
        xrEraseSpaceFB = caps[134];
        xrSaveSpaceListFB = caps[135];
        xrCreateSpaceUserFB = caps[136];
        xrGetSpaceUserIdFB = caps[137];
        xrDestroySpaceUserFB = caps[138];
        xrUpdateSwapchainFB = caps[139];
        xrGetSwapchainStateFB = caps[140];
        xrCreateTriangleMeshFB = caps[141];
        xrDestroyTriangleMeshFB = caps[142];
        xrTriangleMeshGetVertexBufferFB = caps[143];
        xrTriangleMeshGetIndexBufferFB = caps[144];
        xrTriangleMeshBeginUpdateFB = caps[145];
        xrTriangleMeshEndUpdateFB = caps[146];
        xrTriangleMeshBeginVertexBufferUpdateFB = caps[147];
        xrTriangleMeshEndVertexBufferUpdateFB = caps[148];
        xrCreateSpatialAnchorHTC = caps[149];
        xrGetSpatialAnchorNameHTC = caps[150];
        xrCreateBodyTrackerHTC = caps[151];
        xrDestroyBodyTrackerHTC = caps[152];
        xrLocateBodyJointsHTC = caps[153];
        xrGetBodySkeletonHTC = caps[154];
        xrCreateFacialTrackerHTC = caps[155];
        xrDestroyFacialTrackerHTC = caps[156];
        xrGetFacialExpressionsHTC = caps[157];
        xrApplyFoveationHTC = caps[158];
        xrCreatePassthroughHTC = caps[159];
        xrDestroyPassthroughHTC = caps[160];
        xrEnumerateViveTrackerPathsHTCX = caps[161];
        xrConvertTimespecTimeToTimeKHR = caps[162];
        xrConvertTimeToTimespecTimeKHR = caps[163];
        xrLocateSpacesKHR = caps[164];
        xrGetOpenGLGraphicsRequirementsKHR = caps[165];
        xrGetVisibilityMaskKHR = caps[166];
        xrGetVulkanInstanceExtensionsKHR = caps[167];
        xrGetVulkanDeviceExtensionsKHR = caps[168];
        xrGetVulkanGraphicsDeviceKHR = caps[169];
        xrGetVulkanGraphicsRequirementsKHR = caps[170];
        xrCreateVulkanInstanceKHR = caps[171];
        xrCreateVulkanDeviceKHR = caps[172];
        xrGetVulkanGraphicsDevice2KHR = caps[173];
        xrGetVulkanGraphicsRequirements2KHR = caps[174];
        xrConvertWin32PerformanceCounterToTimeKHR = caps[175];
        xrConvertTimeToWin32PerformanceCounterKHR = caps[176];
        xrStartColocationDiscoveryMETA = caps[177];
        xrStopColocationDiscoveryMETA = caps[178];
        xrStartColocationAdvertisementMETA = caps[179];
        xrStopColocationAdvertisementMETA = caps[180];
        xrCreateEnvironmentDepthProviderMETA = caps[181];
        xrDestroyEnvironmentDepthProviderMETA = caps[182];
        xrStartEnvironmentDepthProviderMETA = caps[183];
        xrStopEnvironmentDepthProviderMETA = caps[184];
        xrCreateEnvironmentDepthSwapchainMETA = caps[185];
        xrDestroyEnvironmentDepthSwapchainMETA = caps[186];
        xrEnumerateEnvironmentDepthSwapchainImagesMETA = caps[187];
        xrGetEnvironmentDepthSwapchainStateMETA = caps[188];
        xrAcquireEnvironmentDepthImageMETA = caps[189];
        xrSetEnvironmentDepthHandRemovalMETA = caps[190];
        xrGetFoveationEyeTrackedStateMETA = caps[191];
        xrCreatePassthroughColorLutMETA = caps[192];
        xrDestroyPassthroughColorLutMETA = caps[193];
        xrUpdatePassthroughColorLutMETA = caps[194];
        xrGetPassthroughPreferencesMETA = caps[195];
        xrEnumeratePerformanceMetricsCounterPathsMETA = caps[196];
        xrSetPerformanceMetricsStateMETA = caps[197];
        xrGetPerformanceMetricsStateMETA = caps[198];
        xrQueryPerformanceMetricsCounterMETA = caps[199];
        xrGetRecommendedLayerResolutionMETA = caps[200];
        xrGetSpaceTriangleMeshMETA = caps[201];
        xrShareSpacesMETA = caps[202];
        xrCreateVirtualKeyboardMETA = caps[203];
        xrDestroyVirtualKeyboardMETA = caps[204];
        xrCreateVirtualKeyboardSpaceMETA = caps[205];
        xrSuggestVirtualKeyboardLocationMETA = caps[206];
        xrGetVirtualKeyboardScaleMETA = caps[207];
        xrSetVirtualKeyboardModelVisibilityMETA = caps[208];
        xrGetVirtualKeyboardModelAnimationStatesMETA = caps[209];
        xrGetVirtualKeyboardDirtyTexturesMETA = caps[210];
        xrGetVirtualKeyboardTextureDataMETA = caps[211];
        xrSendVirtualKeyboardInputMETA = caps[212];
        xrChangeVirtualKeyboardTextContextMETA = caps[213];
        xrCreateSpaceFromCoordinateFrameUIDML = caps[214];
        xrCreateFacialExpressionClientML = caps[215];
        xrDestroyFacialExpressionClientML = caps[216];
        xrGetFacialExpressionBlendShapePropertiesML = caps[217];
        xrEnableLocalizationEventsML = caps[218];
        xrQueryLocalizationMapsML = caps[219];
        xrRequestMapLocalizationML = caps[220];
        xrImportLocalizationMapML = caps[221];
        xrCreateExportedLocalizationMapML = caps[222];
        xrDestroyExportedLocalizationMapML = caps[223];
        xrGetExportedLocalizationMapDataML = caps[224];
        xrCreateMarkerDetectorML = caps[225];
        xrDestroyMarkerDetectorML = caps[226];
        xrSnapshotMarkerDetectorML = caps[227];
        xrGetMarkerDetectorStateML = caps[228];
        xrGetMarkersML = caps[229];
        xrGetMarkerReprojectionErrorML = caps[230];
        xrGetMarkerLengthML = caps[231];
        xrGetMarkerNumberML = caps[232];
        xrGetMarkerStringML = caps[233];
        xrCreateMarkerSpaceML = caps[234];
        xrCreateSpatialAnchorsAsyncML = caps[235];
        xrCreateSpatialAnchorsCompleteML = caps[236];
        xrGetSpatialAnchorStateML = caps[237];
        xrCreateSpatialAnchorsStorageML = caps[238];
        xrDestroySpatialAnchorsStorageML = caps[239];
        xrQuerySpatialAnchorsAsyncML = caps[240];
        xrQuerySpatialAnchorsCompleteML = caps[241];
        xrPublishSpatialAnchorsAsyncML = caps[242];
        xrPublishSpatialAnchorsCompleteML = caps[243];
        xrDeleteSpatialAnchorsAsyncML = caps[244];
        xrDeleteSpatialAnchorsCompleteML = caps[245];
        xrUpdateSpatialAnchorsExpirationAsyncML = caps[246];
        xrUpdateSpatialAnchorsExpirationCompleteML = caps[247];
        xrSetSystemNotificationsML = caps[248];
        xrEnableUserCalibrationEventsML = caps[249];
        xrCreateWorldMeshDetectorML = caps[250];
        xrDestroyWorldMeshDetectorML = caps[251];
        xrRequestWorldMeshStateAsyncML = caps[252];
        xrRequestWorldMeshStateCompleteML = caps[253];
        xrGetWorldMeshBufferRecommendSizeML = caps[254];
        xrAllocateWorldMeshBufferML = caps[255];
        xrFreeWorldMeshBufferML = caps[256];
        xrRequestWorldMeshAsyncML = caps[257];
        xrRequestWorldMeshCompleteML = caps[258];
        xrApplyForceFeedbackCurlMNDX = caps[259];
        xrEnumerateReprojectionModesMSFT = caps[260];
        xrGetControllerModelKeyMSFT = caps[261];
        xrLoadControllerModelMSFT = caps[262];
        xrGetControllerModelPropertiesMSFT = caps[263];
        xrGetControllerModelStateMSFT = caps[264];
        xrCreateHandMeshSpaceMSFT = caps[265];
        xrUpdateHandMeshMSFT = caps[266];
        xrCreateSpatialAnchorFromPerceptionAnchorMSFT = caps[267];
        xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = caps[268];
        xrGetSceneMarkerRawDataMSFT = caps[269];
        xrGetSceneMarkerDecodedStringMSFT = caps[270];
        xrEnumerateSceneComputeFeaturesMSFT = caps[271];
        xrCreateSceneObserverMSFT = caps[272];
        xrDestroySceneObserverMSFT = caps[273];
        xrCreateSceneMSFT = caps[274];
        xrDestroySceneMSFT = caps[275];
        xrComputeNewSceneMSFT = caps[276];
        xrGetSceneComputeStateMSFT = caps[277];
        xrGetSceneComponentsMSFT = caps[278];
        xrLocateSceneComponentsMSFT = caps[279];
        xrGetSceneMeshBuffersMSFT = caps[280];
        xrDeserializeSceneMSFT = caps[281];
        xrGetSerializedSceneFragmentDataMSFT = caps[282];
        xrCreateSpatialAnchorMSFT = caps[283];
        xrCreateSpatialAnchorSpaceMSFT = caps[284];
        xrDestroySpatialAnchorMSFT = caps[285];
        xrCreateSpatialAnchorStoreConnectionMSFT = caps[286];
        xrDestroySpatialAnchorStoreConnectionMSFT = caps[287];
        xrPersistSpatialAnchorMSFT = caps[288];
        xrEnumeratePersistedSpatialAnchorNamesMSFT = caps[289];
        xrCreateSpatialAnchorFromPersistedNameMSFT = caps[290];
        xrUnpersistSpatialAnchorMSFT = caps[291];
        xrClearSpatialAnchorStoreMSFT = caps[292];
        xrCreateSpatialGraphNodeSpaceMSFT = caps[293];
        xrTryCreateSpatialGraphStaticNodeBindingMSFT = caps[294];
        xrDestroySpatialGraphNodeBindingMSFT = caps[295];
        xrGetSpatialGraphNodeBindingPropertiesMSFT = caps[296];
        xrGetAudioOutputDeviceGuidOculus = caps[297];
        xrGetAudioInputDeviceGuidOculus = caps[298];
        xrEnumerateExternalCamerasOCULUS = caps[299];
        xrSetTrackingOptimizationSettingsHintQCOM = caps[300];
        xrSetEnvironmentDepthEstimationVARJO = caps[301];
        xrSetMarkerTrackingVARJO = caps[302];
        xrSetMarkerTrackingTimeoutVARJO = caps[303];
        xrSetMarkerTrackingPredictionVARJO = caps[304];
        xrGetMarkerSizeVARJO = caps[305];
        xrCreateMarkerSpaceVARJO = caps[306];
        xrSetViewOffsetVARJO = caps[307];
    }

    private static boolean check_XR10(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("OpenXR10")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50
        },
            "xrDestroyInstance", "xrGetInstanceProperties", "xrPollEvent", "xrResultToString", "xrStructureTypeToString", "xrGetSystem", 
            "xrGetSystemProperties", "xrEnumerateEnvironmentBlendModes", "xrCreateSession", "xrDestroySession", "xrEnumerateReferenceSpaces", 
            "xrCreateReferenceSpace", "xrGetReferenceSpaceBoundsRect", "xrCreateActionSpace", "xrLocateSpace", "xrDestroySpace", 
            "xrEnumerateViewConfigurations", "xrGetViewConfigurationProperties", "xrEnumerateViewConfigurationViews", "xrEnumerateSwapchainFormats", 
            "xrCreateSwapchain", "xrDestroySwapchain", "xrEnumerateSwapchainImages", "xrAcquireSwapchainImage", "xrWaitSwapchainImage", 
            "xrReleaseSwapchainImage", "xrBeginSession", "xrEndSession", "xrRequestExitSession", "xrWaitFrame", "xrBeginFrame", "xrEndFrame", "xrLocateViews", 
            "xrStringToPath", "xrPathToString", "xrCreateActionSet", "xrDestroyActionSet", "xrCreateAction", "xrDestroyAction", 
            "xrSuggestInteractionProfileBindings", "xrAttachSessionActionSets", "xrGetCurrentInteractionProfile", "xrGetActionStateBoolean", 
            "xrGetActionStateFloat", "xrGetActionStateVector2f", "xrGetActionStatePose", "xrSyncActions", "xrEnumerateBoundSourcesForAction", 
            "xrGetInputSourceLocalizedName", "xrApplyHapticFeedback", "xrStopHapticFeedback"
        ) || reportMissing("XR", "OpenXR10");
    }

    private static boolean check_XR11(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("OpenXR11")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            51
        },
            "xrLocateSpaces"
        ) || reportMissing("XR", "OpenXR11");
    }

    private static boolean check_ALMALENCE_digital_lens_control(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ALMALENCE_digital_lens_control")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            52
        },
            "xrSetDigitalLensControlALMALENCE"
        ) || reportMissing("XR", "XR_ALMALENCE_digital_lens_control");
    }

    private static boolean check_EXT_conformance_automation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_conformance_automation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            53, 54, 55, 56, 57
        },
            "xrSetInputDeviceActiveEXT", "xrSetInputDeviceStateBoolEXT", "xrSetInputDeviceStateFloatEXT", "xrSetInputDeviceStateVector2fEXT", 
            "xrSetInputDeviceLocationEXT"
        ) || reportMissing("XR", "XR_EXT_conformance_automation");
    }

    private static boolean check_EXT_debug_utils(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_debug_utils")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            58, 59, 60, 61, 62, 63, 64
        },
            "xrSetDebugUtilsObjectNameEXT", "xrCreateDebugUtilsMessengerEXT", "xrDestroyDebugUtilsMessengerEXT", "xrSubmitDebugUtilsMessageEXT", 
            "xrSessionBeginDebugUtilsLabelRegionEXT", "xrSessionEndDebugUtilsLabelRegionEXT", "xrSessionInsertDebugUtilsLabelEXT"
        ) || reportMissing("XR", "XR_EXT_debug_utils");
    }

    private static boolean check_EXT_future(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_future")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            65, 66
        },
            "xrPollFutureEXT", "xrCancelFutureEXT"
        ) || reportMissing("XR", "XR_EXT_future");
    }

    private static boolean check_EXT_hand_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_hand_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            67, 68, 69
        },
            "xrCreateHandTrackerEXT", "xrDestroyHandTrackerEXT", "xrLocateHandJointsEXT"
        ) || reportMissing("XR", "XR_EXT_hand_tracking");
    }

    private static boolean check_EXT_performance_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_performance_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            70
        },
            "xrPerfSettingsSetPerformanceLevelEXT"
        ) || reportMissing("XR", "XR_EXT_performance_settings");
    }

    private static boolean check_EXT_plane_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_plane_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            71, 72, 73, 74, 75, 76
        },
            "xrCreatePlaneDetectorEXT", "xrDestroyPlaneDetectorEXT", "xrBeginPlaneDetectionEXT", "xrGetPlaneDetectionStateEXT", "xrGetPlaneDetectionsEXT", 
            "xrGetPlanePolygonBufferEXT"
        ) || reportMissing("XR", "XR_EXT_plane_detection");
    }

    private static boolean check_EXT_thermal_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_EXT_thermal_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            77
        },
            "xrThermalGetTemperatureTrendEXT"
        ) || reportMissing("XR", "XR_EXT_thermal_query");
    }

    private static boolean check_FB_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            78, 79, 80, 81
        },
            "xrCreateBodyTrackerFB", "xrDestroyBodyTrackerFB", "xrLocateBodyJointsFB", "xrGetBodySkeletonFB"
        ) || reportMissing("XR", "XR_FB_body_tracking");
    }

    private static boolean check_FB_color_space(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_color_space")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            82, 83
        },
            "xrEnumerateColorSpacesFB", "xrSetColorSpaceFB"
        ) || reportMissing("XR", "XR_FB_color_space");
    }

    private static boolean check_FB_display_refresh_rate(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_display_refresh_rate")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            84, 85, 86
        },
            "xrEnumerateDisplayRefreshRatesFB", "xrGetDisplayRefreshRateFB", "xrRequestDisplayRefreshRateFB"
        ) || reportMissing("XR", "XR_FB_display_refresh_rate");
    }

    private static boolean check_FB_eye_tracking_social(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_eye_tracking_social")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            87, 88, 89
        },
            "xrCreateEyeTrackerFB", "xrDestroyEyeTrackerFB", "xrGetEyeGazesFB"
        ) || reportMissing("XR", "XR_FB_eye_tracking_social");
    }

    private static boolean check_FB_face_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            90, 91, 92
        },
            "xrCreateFaceTrackerFB", "xrDestroyFaceTrackerFB", "xrGetFaceExpressionWeightsFB"
        ) || reportMissing("XR", "XR_FB_face_tracking");
    }

    private static boolean check_FB_face_tracking2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_face_tracking2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            93, 94, 95
        },
            "xrCreateFaceTracker2FB", "xrDestroyFaceTracker2FB", "xrGetFaceExpressionWeights2FB"
        ) || reportMissing("XR", "XR_FB_face_tracking2");
    }

    private static boolean check_FB_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            96, 97
        },
            "xrCreateFoveationProfileFB", "xrDestroyFoveationProfileFB"
        ) || reportMissing("XR", "XR_FB_foveation");
    }

    private static boolean check_FB_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            98
        },
            "xrGetHandMeshFB"
        ) || reportMissing("XR", "XR_FB_hand_tracking_mesh");
    }

    private static boolean check_FB_haptic_pcm(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_haptic_pcm")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            99
        },
            "xrGetDeviceSampleRateFB"
        ) || reportMissing("XR", "XR_FB_haptic_pcm");
    }

    private static boolean check_FB_keyboard_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_keyboard_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            100, 101
        },
            "xrQuerySystemTrackedKeyboardFB", "xrCreateKeyboardSpaceFB"
        ) || reportMissing("XR", "XR_FB_keyboard_tracking");
    }

    private static boolean check_FB_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113
        },
            "xrCreatePassthroughFB", "xrDestroyPassthroughFB", "xrPassthroughStartFB", "xrPassthroughPauseFB", "xrCreatePassthroughLayerFB", 
            "xrDestroyPassthroughLayerFB", "xrPassthroughLayerPauseFB", "xrPassthroughLayerResumeFB", "xrPassthroughLayerSetStyleFB", 
            "xrCreateGeometryInstanceFB", "xrDestroyGeometryInstanceFB", "xrGeometryInstanceSetTransformFB"
        ) || reportMissing("XR", "XR_FB_passthrough");
    }

    private static boolean check_FB_passthrough_keyboard_hands(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_passthrough_keyboard_hands")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            114
        },
            "xrPassthroughLayerSetKeyboardHandsIntensityFB"
        ) || reportMissing("XR", "XR_FB_passthrough_keyboard_hands");
    }

    private static boolean check_FB_render_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_render_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            115, 116, 117
        },
            "xrEnumerateRenderModelPathsFB", "xrGetRenderModelPropertiesFB", "xrLoadRenderModelFB"
        ) || reportMissing("XR", "XR_FB_render_model");
    }

    private static boolean check_FB_scene(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            118, 119, 120, 121, 122
        },
            "xrGetSpaceBoundingBox2DFB", "xrGetSpaceBoundingBox3DFB", "xrGetSpaceSemanticLabelsFB", "xrGetSpaceBoundary2DFB", "xrGetSpaceRoomLayoutFB"
        ) || reportMissing("XR", "XR_FB_scene");
    }

    private static boolean check_FB_scene_capture(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_scene_capture")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            123
        },
            "xrRequestSceneCaptureFB"
        ) || reportMissing("XR", "XR_FB_scene_capture");
    }

    private static boolean check_FB_spatial_entity(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            124, 125, 126, 127, 128
        },
            "xrCreateSpatialAnchorFB", "xrGetSpaceUuidFB", "xrEnumerateSpaceSupportedComponentsFB", "xrSetSpaceComponentStatusFB", 
            "xrGetSpaceComponentStatusFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity");
    }

    private static boolean check_FB_spatial_entity_container(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_container")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            129
        },
            "xrGetSpaceContainerFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_container");
    }

    private static boolean check_FB_spatial_entity_query(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_query")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            130, 131
        },
            "xrQuerySpacesFB", "xrRetrieveSpaceQueryResultsFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_query");
    }

    private static boolean check_FB_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            132
        },
            "xrShareSpacesFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_sharing");
    }

    private static boolean check_FB_spatial_entity_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            133, 134
        },
            "xrSaveSpaceFB", "xrEraseSpaceFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage");
    }

    private static boolean check_FB_spatial_entity_storage_batch(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_storage_batch")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            135
        },
            "xrSaveSpaceListFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_storage_batch");
    }

    private static boolean check_FB_spatial_entity_user(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_spatial_entity_user")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            136, 137, 138
        },
            "xrCreateSpaceUserFB", "xrGetSpaceUserIdFB", "xrDestroySpaceUserFB"
        ) || reportMissing("XR", "XR_FB_spatial_entity_user");
    }

    private static boolean check_FB_swapchain_update_state(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_swapchain_update_state")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            139, 140
        },
            "xrUpdateSwapchainFB", "xrGetSwapchainStateFB"
        ) || reportMissing("XR", "XR_FB_swapchain_update_state");
    }

    private static boolean check_FB_triangle_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_FB_triangle_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            141, 142, 143, 144, 145, 146, 147, 148
        },
            "xrCreateTriangleMeshFB", "xrDestroyTriangleMeshFB", "xrTriangleMeshGetVertexBufferFB", "xrTriangleMeshGetIndexBufferFB", 
            "xrTriangleMeshBeginUpdateFB", "xrTriangleMeshEndUpdateFB", "xrTriangleMeshBeginVertexBufferUpdateFB", "xrTriangleMeshEndVertexBufferUpdateFB"
        ) || reportMissing("XR", "XR_FB_triangle_mesh");
    }

    private static boolean check_HTC_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            149, 150
        },
            "xrCreateSpatialAnchorHTC", "xrGetSpatialAnchorNameHTC"
        ) || reportMissing("XR", "XR_HTC_anchor");
    }

    private static boolean check_HTC_body_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_body_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            151, 152, 153, 154
        },
            "xrCreateBodyTrackerHTC", "xrDestroyBodyTrackerHTC", "xrLocateBodyJointsHTC", "xrGetBodySkeletonHTC"
        ) || reportMissing("XR", "XR_HTC_body_tracking");
    }

    private static boolean check_HTC_facial_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_facial_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            155, 156, 157
        },
            "xrCreateFacialTrackerHTC", "xrDestroyFacialTrackerHTC", "xrGetFacialExpressionsHTC"
        ) || reportMissing("XR", "XR_HTC_facial_tracking");
    }

    private static boolean check_HTC_foveation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_foveation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            158
        },
            "xrApplyFoveationHTC"
        ) || reportMissing("XR", "XR_HTC_foveation");
    }

    private static boolean check_HTC_passthrough(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTC_passthrough")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            159, 160
        },
            "xrCreatePassthroughHTC", "xrDestroyPassthroughHTC"
        ) || reportMissing("XR", "XR_HTC_passthrough");
    }

    private static boolean check_HTCX_vive_tracker_interaction(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_HTCX_vive_tracker_interaction")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            161
        },
            "xrEnumerateViveTrackerPathsHTCX"
        ) || reportMissing("XR", "XR_HTCX_vive_tracker_interaction");
    }

    private static boolean check_KHR_convert_timespec_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_convert_timespec_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            162, 163
        },
            "xrConvertTimespecTimeToTimeKHR", "xrConvertTimeToTimespecTimeKHR"
        ) || reportMissing("XR", "XR_KHR_convert_timespec_time");
    }

    private static boolean check_KHR_locate_spaces(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_locate_spaces")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            164
        },
            "xrLocateSpacesKHR"
        ) || reportMissing("XR", "XR_KHR_locate_spaces");
    }

    private static boolean check_KHR_opengl_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_opengl_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            165
        },
            "xrGetOpenGLGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_opengl_enable");
    }

    private static boolean check_KHR_visibility_mask(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_visibility_mask")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            166
        },
            "xrGetVisibilityMaskKHR"
        ) || reportMissing("XR", "XR_KHR_visibility_mask");
    }

    private static boolean check_KHR_vulkan_enable(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            167, 168, 169, 170
        },
            "xrGetVulkanInstanceExtensionsKHR", "xrGetVulkanDeviceExtensionsKHR", "xrGetVulkanGraphicsDeviceKHR", "xrGetVulkanGraphicsRequirementsKHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable");
    }

    private static boolean check_KHR_vulkan_enable2(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_vulkan_enable2")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            171, 172, 173, 174
        },
            "xrCreateVulkanInstanceKHR", "xrCreateVulkanDeviceKHR", "xrGetVulkanGraphicsDevice2KHR", "xrGetVulkanGraphicsRequirements2KHR"
        ) || reportMissing("XR", "XR_KHR_vulkan_enable2");
    }

    private static boolean check_KHR_win32_convert_performance_counter_time(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_KHR_win32_convert_performance_counter_time")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            175, 176
        },
            "xrConvertWin32PerformanceCounterToTimeKHR", "xrConvertTimeToWin32PerformanceCounterKHR"
        ) || reportMissing("XR", "XR_KHR_win32_convert_performance_counter_time");
    }

    private static boolean check_META_colocation_discovery(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_colocation_discovery")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            177, 178, 179, 180
        },
            "xrStartColocationDiscoveryMETA", "xrStopColocationDiscoveryMETA", "xrStartColocationAdvertisementMETA", "xrStopColocationAdvertisementMETA"
        ) || reportMissing("XR", "XR_META_colocation_discovery");
    }

    private static boolean check_META_environment_depth(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_environment_depth")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            181, 182, 183, 184, 185, 186, 187, 188, 189, 190
        },
            "xrCreateEnvironmentDepthProviderMETA", "xrDestroyEnvironmentDepthProviderMETA", "xrStartEnvironmentDepthProviderMETA", 
            "xrStopEnvironmentDepthProviderMETA", "xrCreateEnvironmentDepthSwapchainMETA", "xrDestroyEnvironmentDepthSwapchainMETA", 
            "xrEnumerateEnvironmentDepthSwapchainImagesMETA", "xrGetEnvironmentDepthSwapchainStateMETA", "xrAcquireEnvironmentDepthImageMETA", 
            "xrSetEnvironmentDepthHandRemovalMETA"
        ) || reportMissing("XR", "XR_META_environment_depth");
    }

    private static boolean check_META_foveation_eye_tracked(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_foveation_eye_tracked")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            191
        },
            "xrGetFoveationEyeTrackedStateMETA"
        ) || reportMissing("XR", "XR_META_foveation_eye_tracked");
    }

    private static boolean check_META_passthrough_color_lut(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_color_lut")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            192, 193, 194
        },
            "xrCreatePassthroughColorLutMETA", "xrDestroyPassthroughColorLutMETA", "xrUpdatePassthroughColorLutMETA"
        ) || reportMissing("XR", "XR_META_passthrough_color_lut");
    }

    private static boolean check_META_passthrough_preferences(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_passthrough_preferences")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            195
        },
            "xrGetPassthroughPreferencesMETA"
        ) || reportMissing("XR", "XR_META_passthrough_preferences");
    }

    private static boolean check_META_performance_metrics(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_performance_metrics")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            196, 197, 198, 199
        },
            "xrEnumeratePerformanceMetricsCounterPathsMETA", "xrSetPerformanceMetricsStateMETA", "xrGetPerformanceMetricsStateMETA", 
            "xrQueryPerformanceMetricsCounterMETA"
        ) || reportMissing("XR", "XR_META_performance_metrics");
    }

    private static boolean check_META_recommended_layer_resolution(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_recommended_layer_resolution")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            200
        },
            "xrGetRecommendedLayerResolutionMETA"
        ) || reportMissing("XR", "XR_META_recommended_layer_resolution");
    }

    private static boolean check_META_spatial_entity_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            201
        },
            "xrGetSpaceTriangleMeshMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_mesh");
    }

    private static boolean check_META_spatial_entity_sharing(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_spatial_entity_sharing")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            202
        },
            "xrShareSpacesMETA"
        ) || reportMissing("XR", "XR_META_spatial_entity_sharing");
    }

    private static boolean check_META_virtual_keyboard(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_META_virtual_keyboard")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213
        },
            "xrCreateVirtualKeyboardMETA", "xrDestroyVirtualKeyboardMETA", "xrCreateVirtualKeyboardSpaceMETA", "xrSuggestVirtualKeyboardLocationMETA", 
            "xrGetVirtualKeyboardScaleMETA", "xrSetVirtualKeyboardModelVisibilityMETA", "xrGetVirtualKeyboardModelAnimationStatesMETA", 
            "xrGetVirtualKeyboardDirtyTexturesMETA", "xrGetVirtualKeyboardTextureDataMETA", "xrSendVirtualKeyboardInputMETA", 
            "xrChangeVirtualKeyboardTextContextMETA"
        ) || reportMissing("XR", "XR_META_virtual_keyboard");
    }

    private static boolean check_ML_compat(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_compat")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            214
        },
            "xrCreateSpaceFromCoordinateFrameUIDML"
        ) || reportMissing("XR", "XR_ML_compat");
    }

    private static boolean check_ML_facial_expression(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_facial_expression")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            215, 216, 217
        },
            "xrCreateFacialExpressionClientML", "xrDestroyFacialExpressionClientML", "xrGetFacialExpressionBlendShapePropertiesML"
        ) || reportMissing("XR", "XR_ML_facial_expression");
    }

    private static boolean check_ML_localization_map(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_localization_map")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            218, 219, 220, 221, 222, 223, 224
        },
            "xrEnableLocalizationEventsML", "xrQueryLocalizationMapsML", "xrRequestMapLocalizationML", "xrImportLocalizationMapML", 
            "xrCreateExportedLocalizationMapML", "xrDestroyExportedLocalizationMapML", "xrGetExportedLocalizationMapDataML"
        ) || reportMissing("XR", "XR_ML_localization_map");
    }

    private static boolean check_ML_marker_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_marker_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            225, 226, 227, 228, 229, 230, 231, 232, 233, 234
        },
            "xrCreateMarkerDetectorML", "xrDestroyMarkerDetectorML", "xrSnapshotMarkerDetectorML", "xrGetMarkerDetectorStateML", "xrGetMarkersML", 
            "xrGetMarkerReprojectionErrorML", "xrGetMarkerLengthML", "xrGetMarkerNumberML", "xrGetMarkerStringML", "xrCreateMarkerSpaceML"
        ) || reportMissing("XR", "XR_ML_marker_understanding");
    }

    private static boolean check_ML_spatial_anchors(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_spatial_anchors")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            235, 236, 237
        },
            "xrCreateSpatialAnchorsAsyncML", "xrCreateSpatialAnchorsCompleteML", "xrGetSpatialAnchorStateML"
        ) || reportMissing("XR", "XR_ML_spatial_anchors");
    }

    private static boolean check_ML_spatial_anchors_storage(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_spatial_anchors_storage")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            238, 239, 240, 241, 242, 243, 244, 245, 246, 247
        },
            "xrCreateSpatialAnchorsStorageML", "xrDestroySpatialAnchorsStorageML", "xrQuerySpatialAnchorsAsyncML", "xrQuerySpatialAnchorsCompleteML", 
            "xrPublishSpatialAnchorsAsyncML", "xrPublishSpatialAnchorsCompleteML", "xrDeleteSpatialAnchorsAsyncML", "xrDeleteSpatialAnchorsCompleteML", 
            "xrUpdateSpatialAnchorsExpirationAsyncML", "xrUpdateSpatialAnchorsExpirationCompleteML"
        ) || reportMissing("XR", "XR_ML_spatial_anchors_storage");
    }

    private static boolean check_ML_system_notifications(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_system_notifications")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            248
        },
            "xrSetSystemNotificationsML"
        ) || reportMissing("XR", "XR_ML_system_notifications");
    }

    private static boolean check_ML_user_calibration(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_user_calibration")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            249
        },
            "xrEnableUserCalibrationEventsML"
        ) || reportMissing("XR", "XR_ML_user_calibration");
    }

    private static boolean check_ML_world_mesh_detection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_ML_world_mesh_detection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            250, 251, 252, 253, 254, 255, 256, 257, 258
        },
            "xrCreateWorldMeshDetectorML", "xrDestroyWorldMeshDetectorML", "xrRequestWorldMeshStateAsyncML", "xrRequestWorldMeshStateCompleteML", 
            "xrGetWorldMeshBufferRecommendSizeML", "xrAllocateWorldMeshBufferML", "xrFreeWorldMeshBufferML", "xrRequestWorldMeshAsyncML", 
            "xrRequestWorldMeshCompleteML"
        ) || reportMissing("XR", "XR_ML_world_mesh_detection");
    }

    private static boolean check_MNDX_force_feedback_curl(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MNDX_force_feedback_curl")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            259
        },
            "xrApplyForceFeedbackCurlMNDX"
        ) || reportMissing("XR", "XR_MNDX_force_feedback_curl");
    }

    private static boolean check_MSFT_composition_layer_reprojection(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_composition_layer_reprojection")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            260
        },
            "xrEnumerateReprojectionModesMSFT"
        ) || reportMissing("XR", "XR_MSFT_composition_layer_reprojection");
    }

    private static boolean check_MSFT_controller_model(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_controller_model")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            261, 262, 263, 264
        },
            "xrGetControllerModelKeyMSFT", "xrLoadControllerModelMSFT", "xrGetControllerModelPropertiesMSFT", "xrGetControllerModelStateMSFT"
        ) || reportMissing("XR", "XR_MSFT_controller_model");
    }

    private static boolean check_MSFT_hand_tracking_mesh(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_hand_tracking_mesh")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            265, 266
        },
            "xrCreateHandMeshSpaceMSFT", "xrUpdateHandMeshMSFT"
        ) || reportMissing("XR", "XR_MSFT_hand_tracking_mesh");
    }

    private static boolean check_MSFT_perception_anchor_interop(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_perception_anchor_interop")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            267, 268
        },
            "xrCreateSpatialAnchorFromPerceptionAnchorMSFT", "xrTryGetPerceptionAnchorFromSpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_perception_anchor_interop");
    }

    private static boolean check_MSFT_scene_marker(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_marker")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            269, 270
        },
            "xrGetSceneMarkerRawDataMSFT", "xrGetSceneMarkerDecodedStringMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_marker");
    }

    private static boolean check_MSFT_scene_understanding(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            271, 272, 273, 274, 275, 276, 277, 278, 279, 280
        },
            "xrEnumerateSceneComputeFeaturesMSFT", "xrCreateSceneObserverMSFT", "xrDestroySceneObserverMSFT", "xrCreateSceneMSFT", "xrDestroySceneMSFT", 
            "xrComputeNewSceneMSFT", "xrGetSceneComputeStateMSFT", "xrGetSceneComponentsMSFT", "xrLocateSceneComponentsMSFT", "xrGetSceneMeshBuffersMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding");
    }

    private static boolean check_MSFT_scene_understanding_serialization(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_scene_understanding_serialization")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            281, 282
        },
            "xrDeserializeSceneMSFT", "xrGetSerializedSceneFragmentDataMSFT"
        ) || reportMissing("XR", "XR_MSFT_scene_understanding_serialization");
    }

    private static boolean check_MSFT_spatial_anchor(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            283, 284, 285
        },
            "xrCreateSpatialAnchorMSFT", "xrCreateSpatialAnchorSpaceMSFT", "xrDestroySpatialAnchorMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor");
    }

    private static boolean check_MSFT_spatial_anchor_persistence(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_anchor_persistence")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            286, 287, 288, 289, 290, 291, 292
        },
            "xrCreateSpatialAnchorStoreConnectionMSFT", "xrDestroySpatialAnchorStoreConnectionMSFT", "xrPersistSpatialAnchorMSFT", 
            "xrEnumeratePersistedSpatialAnchorNamesMSFT", "xrCreateSpatialAnchorFromPersistedNameMSFT", "xrUnpersistSpatialAnchorMSFT", 
            "xrClearSpatialAnchorStoreMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_anchor_persistence");
    }

    private static boolean check_MSFT_spatial_graph_bridge(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_MSFT_spatial_graph_bridge")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            293, 294, 295, 296
        },
            "xrCreateSpatialGraphNodeSpaceMSFT", "xrTryCreateSpatialGraphStaticNodeBindingMSFT", "xrDestroySpatialGraphNodeBindingMSFT", 
            "xrGetSpatialGraphNodeBindingPropertiesMSFT"
        ) || reportMissing("XR", "XR_MSFT_spatial_graph_bridge");
    }

    private static boolean check_OCULUS_audio_device_guid(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_audio_device_guid")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            297, 298
        },
            "xrGetAudioOutputDeviceGuidOculus", "xrGetAudioInputDeviceGuidOculus"
        ) || reportMissing("XR", "XR_OCULUS_audio_device_guid");
    }

    private static boolean check_OCULUS_external_camera(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_OCULUS_external_camera")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            299
        },
            "xrEnumerateExternalCamerasOCULUS"
        ) || reportMissing("XR", "XR_OCULUS_external_camera");
    }

    private static boolean check_QCOM_tracking_optimization_settings(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_QCOM_tracking_optimization_settings")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            300
        },
            "xrSetTrackingOptimizationSettingsHintQCOM"
        ) || reportMissing("XR", "XR_QCOM_tracking_optimization_settings");
    }

    private static boolean check_VARJO_environment_depth_estimation(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_environment_depth_estimation")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            301
        },
            "xrSetEnvironmentDepthEstimationVARJO"
        ) || reportMissing("XR", "XR_VARJO_environment_depth_estimation");
    }

    private static boolean check_VARJO_marker_tracking(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_marker_tracking")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            302, 303, 304, 305, 306
        },
            "xrSetMarkerTrackingVARJO", "xrSetMarkerTrackingTimeoutVARJO", "xrSetMarkerTrackingPredictionVARJO", "xrGetMarkerSizeVARJO", 
            "xrCreateMarkerSpaceVARJO"
        ) || reportMissing("XR", "XR_VARJO_marker_tracking");
    }

    private static boolean check_VARJO_view_offset(FunctionProvider provider, long[] caps, java.util.Set<String> ext) {
        if (!ext.contains("XR_VARJO_view_offset")) {
            return false;
        }

        return checkFunctions(provider, caps, new int[] {
            307
        },
            "xrSetViewOffsetVARJO"
        ) || reportMissing("XR", "XR_VARJO_view_offset");
    }

}
