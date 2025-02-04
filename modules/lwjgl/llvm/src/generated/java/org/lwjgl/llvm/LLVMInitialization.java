/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class LLVMInitialization {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeCore                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeCore"),
            InitializeTransformUtils         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeTransformUtils"),
            InitializeScalarOpts             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeScalarOpts"),
            InitializeObjCARCOpts            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInitializeObjCARCOpts"),
            InitializeVectorization          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeVectorization"),
            InitializeInstCombine            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInitializeInstCombine"),
            InitializeAggressiveInstCombiner = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInitializeAggressiveInstCombiner"),
            InitializeIPO                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeIPO"),
            InitializeInstrumentation        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInitializeInstrumentation"),
            InitializeAnalysis               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeAnalysis"),
            InitializeIPA                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeIPA"),
            InitializeCodeGen                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeCodeGen"),
            InitializeTarget                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMInitializeTarget");

    }

    protected LLVMInitialization() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeCore ] ---

    /** {@code void LLVMInitializeCore(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeCore(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCore;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeTransformUtils ] ---

    /** {@code void LLVMInitializeTransformUtils(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeTransformUtils(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeTransformUtils;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeScalarOpts ] ---

    /** {@code void LLVMInitializeScalarOpts(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeScalarOpts(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeScalarOpts;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeObjCARCOpts ] ---

    /** {@code void LLVMInitializeObjCARCOpts(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeObjCARCOpts(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeObjCARCOpts;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeVectorization ] ---

    /** {@code void LLVMInitializeVectorization(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeVectorization(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeVectorization;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeInstCombine ] ---

    /** {@code void LLVMInitializeInstCombine(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeInstCombine(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeInstCombine;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeAggressiveInstCombiner ] ---

    /** {@code void LLVMInitializeAggressiveInstCombiner(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeAggressiveInstCombiner(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeAggressiveInstCombiner;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeIPO ] ---

    /** {@code void LLVMInitializeIPO(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeIPO(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeIPO;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeInstrumentation ] ---

    /** {@code void LLVMInitializeInstrumentation(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeInstrumentation(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeInstrumentation;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeAnalysis ] ---

    /** {@code void LLVMInitializeAnalysis(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeAnalysis(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeAnalysis;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeIPA ] ---

    /** {@code void LLVMInitializeIPA(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeIPA(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeIPA;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeCodeGen ] ---

    /** {@code void LLVMInitializeCodeGen(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeCodeGen(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCodeGen;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMInitializeTarget ] ---

    /** {@code void LLVMInitializeTarget(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeTarget(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeTarget;
        if (CHECKS) {
            check(R);
        }
        invokePV(R, __functionAddress);
    }

}