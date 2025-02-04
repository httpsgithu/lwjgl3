/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVFramebufferBlit {

    static { GLES.initialize(); }

    public static final int
        GL_READ_FRAMEBUFFER_NV = 0x8CA8,
        GL_DRAW_FRAMEBUFFER_NV = 0x8CA9;

    public static final int
        GL_DRAW_FRAMEBUFFER_BINDING_NV = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING_NV = 0x8CAA;

    protected NVFramebufferBlit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlitFramebufferNV ] ---

    /** {@code void glBlitFramebufferNV(GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static native void glBlitFramebufferNV(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

}