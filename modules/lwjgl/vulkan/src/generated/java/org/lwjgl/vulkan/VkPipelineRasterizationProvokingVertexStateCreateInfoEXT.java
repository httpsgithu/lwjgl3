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
 * struct VkPipelineRasterizationProvokingVertexStateCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkProvokingVertexModeEXT provokingVertexMode;
 * }}</pre>
 */
public class VkPipelineRasterizationProvokingVertexStateCreateInfoEXT extends Struct<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROVOKINGVERTEXMODE;

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
        PROVOKINGVERTEXMODE = layout.offsetof(2);
    }

    protected VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code provokingVertexMode} field. */
    @NativeType("VkProvokingVertexModeEXT")
    public int provokingVertexMode() { return nprovokingVertexMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code provokingVertexMode} field. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT provokingVertexMode(@NativeType("VkProvokingVertexModeEXT") int value) { nprovokingVertexMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(
        int sType,
        long pNext,
        int provokingVertexMode
    ) {
        sType(sType);
        pNext(pNext);
        provokingVertexMode(provokingVertexMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT set(VkPipelineRasterizationProvokingVertexStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT malloc() {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT calloc() {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT create(long address) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRasterizationProvokingVertexStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRasterizationProvokingVertexStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #provokingVertexMode}. */
    public static int nprovokingVertexMode(long struct) { return memGetInt(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PROVOKINGVERTEXMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #provokingVertexMode(int) provokingVertexMode}. */
    public static void nprovokingVertexMode(long struct, int value) { memPutInt(struct + VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.PROVOKINGVERTEXMODE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationProvokingVertexStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationProvokingVertexStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationProvokingVertexStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRasterizationProvokingVertexStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code provokingVertexMode} field. */
        @NativeType("VkProvokingVertexModeEXT")
        public int provokingVertexMode() { return VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nprovokingVertexMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code provokingVertexMode} field. */
        public VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.Buffer provokingVertexMode(@NativeType("VkProvokingVertexModeEXT") int value) { VkPipelineRasterizationProvokingVertexStateCreateInfoEXT.nprovokingVertexMode(address(), value); return this; }

    }

}