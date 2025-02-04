/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke hb_buffer_message_func_t} */
@FunctionalInterface
@NativeType("hb_buffer_message_func_t")
public interface hb_buffer_message_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code hb_bool_t (* hb_buffer_message_func_t) (hb_buffer_t * buffer, hb_font_t * font, char const * message, void * user_data)} */
    @NativeType("hb_bool_t") int invoke(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_font_t *") long font, @NativeType("char const *") long message, @NativeType("void *") long user_data);

}