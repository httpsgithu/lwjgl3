/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FMOD_STUDIO_SYSTEM_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_STUDIO_SYSTEM_CALLBACK")
public interface FMOD_STUDIO_SYSTEM_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_STUDIO_SYSTEM_CALLBACK) (FMOD_STUDIO_SYSTEM * system, FMOD_STUDIO_SYSTEM_CALLBACK_TYPE type, void * commanddata, void * userdata)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("FMOD_STUDIO_SYSTEM *") long system, @NativeType("FMOD_STUDIO_SYSTEM_CALLBACK_TYPE") int type, @NativeType("void *") long commanddata, @NativeType("void *") long userdata);

}