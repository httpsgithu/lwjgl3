/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkSurfacePresentModeEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPresentModeKHR presentMode;
 * }}</pre>
 */
public class VkSurfacePresentModeEXT extends Struct<VkSurfacePresentModeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODE = layout.offsetof(2);
    }

    protected VkSurfacePresentModeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentModeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentModeEXT(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentModeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentModeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code presentMode} field. */
    @NativeType("VkPresentModeKHR")
    public int presentMode() { return npresentMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfacePresentModeEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT} value to the {@code sType} field. */
    public VkSurfacePresentModeEXT sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfacePresentModeEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentMode} field. */
    public VkSurfacePresentModeEXT presentMode(@NativeType("VkPresentModeKHR") int value) { npresentMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentModeEXT set(
        int sType,
        long pNext,
        int presentMode
    ) {
        sType(sType);
        pNext(pNext);
        presentMode(presentMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentModeEXT set(VkSurfacePresentModeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentModeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeEXT malloc() {
        return new VkSurfacePresentModeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeEXT calloc() {
        return new VkSurfacePresentModeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentModeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentModeEXT} instance for the specified memory address. */
    public static VkSurfacePresentModeEXT create(long address) {
        return new VkSurfacePresentModeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfacePresentModeEXT createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentModeEXT(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentModeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfacePresentModeEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentModeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentModeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfacePresentModeEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentModeEXT.PNEXT); }
    /** Unsafe version of {@link #presentMode}. */
    public static int npresentMode(long struct) { return memGetInt(struct + VkSurfacePresentModeEXT.PRESENTMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfacePresentModeEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentModeEXT.PNEXT, value); }
    /** Unsafe version of {@link #presentMode(int) presentMode}. */
    public static void npresentMode(long struct, int value) { memPutInt(struct + VkSurfacePresentModeEXT.PRESENTMODE, value); }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentModeEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeEXT, Buffer> implements NativeResource {

        private static final VkSurfacePresentModeEXT ELEMENT_FACTORY = VkSurfacePresentModeEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentModeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentModeEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkSurfacePresentModeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentModeEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentModeEXT.npNext(address()); }
        /** @return the value of the {@code presentMode} field. */
        @NativeType("VkPresentModeKHR")
        public int presentMode() { return VkSurfacePresentModeEXT.npresentMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfacePresentModeEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentModeEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT} value to the {@code sType} field. */
        public VkSurfacePresentModeEXT.Buffer sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfacePresentModeEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentModeEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentMode} field. */
        public VkSurfacePresentModeEXT.Buffer presentMode(@NativeType("VkPresentModeKHR") int value) { VkSurfacePresentModeEXT.npresentMode(address(), value); return this; }

    }

}