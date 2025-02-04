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
 * struct VkCheckpointData2NV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipelineStageFlags2 stage;
 *     void * pCheckpointMarker;
 * }}</pre>
 */
public class VkCheckpointData2NV extends Struct<VkCheckpointData2NV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STAGE,
        PCHECKPOINTMARKER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGE = layout.offsetof(2);
        PCHECKPOINTMARKER = layout.offsetof(3);
    }

    protected VkCheckpointData2NV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCheckpointData2NV create(long address, @Nullable ByteBuffer container) {
        return new VkCheckpointData2NV(address, container);
    }

    /**
     * Creates a {@code VkCheckpointData2NV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCheckpointData2NV(ByteBuffer container) {
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
    /** @return the value of the {@code stage} field. */
    @NativeType("VkPipelineStageFlags2")
    public long stage() { return nstage(address()); }
    /** @return the value of the {@code pCheckpointMarker} field. */
    @NativeType("void *")
    public long pCheckpointMarker() { return npCheckpointMarker(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCheckpointData2NV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV} value to the {@code sType} field. */
    public VkCheckpointData2NV sType$Default() { return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCheckpointData2NV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCheckpointData2NV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCheckpointData2NV set(VkCheckpointData2NV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCheckpointData2NV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCheckpointData2NV malloc() {
        return new VkCheckpointData2NV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCheckpointData2NV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCheckpointData2NV calloc() {
        return new VkCheckpointData2NV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCheckpointData2NV} instance allocated with {@link BufferUtils}. */
    public static VkCheckpointData2NV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCheckpointData2NV(memAddress(container), container);
    }

    /** Returns a new {@code VkCheckpointData2NV} instance for the specified memory address. */
    public static VkCheckpointData2NV create(long address) {
        return new VkCheckpointData2NV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCheckpointData2NV createSafe(long address) {
        return address == NULL ? null : new VkCheckpointData2NV(address, null);
    }

    /**
     * Returns a new {@link VkCheckpointData2NV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCheckpointData2NV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCheckpointData2NV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCheckpointData2NV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCheckpointData2NV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCheckpointData2NV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCheckpointData2NV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCheckpointData2NV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCheckpointData2NV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCheckpointData2NV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCheckpointData2NV malloc(MemoryStack stack) {
        return new VkCheckpointData2NV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCheckpointData2NV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCheckpointData2NV calloc(MemoryStack stack) {
        return new VkCheckpointData2NV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCheckpointData2NV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCheckpointData2NV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCheckpointData2NV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCheckpointData2NV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCheckpointData2NV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCheckpointData2NV.PNEXT); }
    /** Unsafe version of {@link #stage}. */
    public static long nstage(long struct) { return memGetLong(struct + VkCheckpointData2NV.STAGE); }
    /** Unsafe version of {@link #pCheckpointMarker}. */
    public static long npCheckpointMarker(long struct) { return memGetAddress(struct + VkCheckpointData2NV.PCHECKPOINTMARKER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCheckpointData2NV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCheckpointData2NV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkCheckpointData2NV} structs. */
    public static class Buffer extends StructBuffer<VkCheckpointData2NV, Buffer> implements NativeResource {

        private static final VkCheckpointData2NV ELEMENT_FACTORY = VkCheckpointData2NV.create(-1L);

        /**
         * Creates a new {@code VkCheckpointData2NV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCheckpointData2NV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCheckpointData2NV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCheckpointData2NV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCheckpointData2NV.npNext(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("VkPipelineStageFlags2")
        public long stage() { return VkCheckpointData2NV.nstage(address()); }
        /** @return the value of the {@code pCheckpointMarker} field. */
        @NativeType("void *")
        public long pCheckpointMarker() { return VkCheckpointData2NV.npCheckpointMarker(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCheckpointData2NV.Buffer sType(@NativeType("VkStructureType") int value) { VkCheckpointData2NV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV} value to the {@code sType} field. */
        public VkCheckpointData2NV.Buffer sType$Default() { return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCheckpointData2NV.Buffer pNext(@NativeType("void *") long value) { VkCheckpointData2NV.npNext(address(), value); return this; }

    }

}