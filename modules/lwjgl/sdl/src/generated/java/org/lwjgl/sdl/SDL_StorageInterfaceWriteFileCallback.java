/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class SDL_StorageInterfaceWriteFileCallback extends Callback implements SDL_StorageInterfaceWriteFileCallbackI {

    /**
     * Creates a {@code SDL_StorageInterfaceWriteFileCallback} instance from the specified function pointer.
     *
     * @return the new {@code SDL_StorageInterfaceWriteFileCallback}
     */
    public static SDL_StorageInterfaceWriteFileCallback create(long functionPointer) {
        SDL_StorageInterfaceWriteFileCallbackI instance = Callback.get(functionPointer);
        return instance instanceof SDL_StorageInterfaceWriteFileCallback
            ? (SDL_StorageInterfaceWriteFileCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SDL_StorageInterfaceWriteFileCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SDL_StorageInterfaceWriteFileCallback} instance that delegates to the specified {@code SDL_StorageInterfaceWriteFileCallbackI} instance. */
    public static SDL_StorageInterfaceWriteFileCallback create(SDL_StorageInterfaceWriteFileCallbackI instance) {
        return instance instanceof SDL_StorageInterfaceWriteFileCallback
            ? (SDL_StorageInterfaceWriteFileCallback)instance
            : new Container(instance.address(), instance);
    }

    protected SDL_StorageInterfaceWriteFileCallback() {
        super(CIF);
    }

    SDL_StorageInterfaceWriteFileCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SDL_StorageInterfaceWriteFileCallback {

        private final SDL_StorageInterfaceWriteFileCallbackI delegate;

        Container(long functionPointer, SDL_StorageInterfaceWriteFileCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userdata, long path, long source, long length) {
            return delegate.invoke(userdata, path, source, length);
        }

    }

}