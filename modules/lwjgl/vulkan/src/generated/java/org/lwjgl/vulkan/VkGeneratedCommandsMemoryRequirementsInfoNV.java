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
 * struct VkGeneratedCommandsMemoryRequirementsInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipeline pipeline;
 *     VkIndirectCommandsLayoutNV indirectCommandsLayout;
 *     uint32_t maxSequencesCount;
 * }}</pre>
 */
public class VkGeneratedCommandsMemoryRequirementsInfoNV extends Struct<VkGeneratedCommandsMemoryRequirementsInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINDPOINT,
        PIPELINE,
        INDIRECTCOMMANDSLAYOUT,
        MAXSEQUENCESCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEBINDPOINT = layout.offsetof(2);
        PIPELINE = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        MAXSEQUENCESCOUNT = layout.offsetof(5);
    }

    protected VkGeneratedCommandsMemoryRequirementsInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsMemoryRequirementsInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsMemoryRequirementsInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** @return the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** @return the value of the {@code indirectCommandsLayout} field. */
    @NativeType("VkIndirectCommandsLayoutNV")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** @return the value of the {@code maxSequencesCount} field. */
    @NativeType("uint32_t")
    public int maxSequencesCount() { return nmaxSequencesCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV} value to the {@code sType} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the specified value to the {@code indirectCommandsLayout} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the specified value to the {@code maxSequencesCount} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV maxSequencesCount(@NativeType("uint32_t") int value) { nmaxSequencesCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsMemoryRequirementsInfoNV set(
        int sType,
        long pNext,
        int pipelineBindPoint,
        long pipeline,
        long indirectCommandsLayout,
        int maxSequencesCount
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBindPoint(pipelineBindPoint);
        pipeline(pipeline);
        indirectCommandsLayout(indirectCommandsLayout);
        maxSequencesCount(maxSequencesCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsMemoryRequirementsInfoNV set(VkGeneratedCommandsMemoryRequirementsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV malloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV calloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance for the specified memory address. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV create(long address) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeneratedCommandsMemoryRequirementsInfoNV createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsMemoryRequirementsInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV malloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV calloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PNEXT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return memGetLong(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINE); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return memGetLong(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #maxSequencesCount}. */
    public static int nmaxSequencesCount(long struct) { return memGetInt(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.MAXSEQUENCESCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { memPutLong(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.PIPELINE, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { memPutLong(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.INDIRECTCOMMANDSLAYOUT, value); }
    /** Unsafe version of {@link #maxSequencesCount(int) maxSequencesCount}. */
    public static void nmaxSequencesCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsMemoryRequirementsInfoNV.MAXSEQUENCESCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsMemoryRequirementsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsMemoryRequirementsInfoNV, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsMemoryRequirementsInfoNV ELEMENT_FACTORY = VkGeneratedCommandsMemoryRequirementsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsMemoryRequirementsInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsMemoryRequirementsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsMemoryRequirementsInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsMemoryRequirementsInfoNV.npNext(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkGeneratedCommandsMemoryRequirementsInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkGeneratedCommandsMemoryRequirementsInfoNV.npipeline(address()); }
        /** @return the value of the {@code indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutNV")
        public long indirectCommandsLayout() { return VkGeneratedCommandsMemoryRequirementsInfoNV.nindirectCommandsLayout(address()); }
        /** @return the value of the {@code maxSequencesCount} field. */
        @NativeType("uint32_t")
        public int maxSequencesCount() { return VkGeneratedCommandsMemoryRequirementsInfoNV.nmaxSequencesCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV} value to the {@code sType} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsMemoryRequirementsInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer pipeline(@NativeType("VkPipeline") long value) { VkGeneratedCommandsMemoryRequirementsInfoNV.npipeline(address(), value); return this; }
        /** Sets the specified value to the {@code indirectCommandsLayout} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutNV") long value) { VkGeneratedCommandsMemoryRequirementsInfoNV.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the specified value to the {@code maxSequencesCount} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoNV.Buffer maxSequencesCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoNV.nmaxSequencesCount(address(), value); return this; }

    }

}