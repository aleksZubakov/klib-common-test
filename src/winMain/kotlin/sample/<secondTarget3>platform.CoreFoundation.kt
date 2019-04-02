@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.CoreFoundation

import kotlinx.cinterop.* 

final actual class CFAllocatorContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var allocate: platform.CoreFoundation.CFAllocatorAllocateCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorAllocateCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var copyDescription: platform.CoreFoundation.CFAllocatorCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var deallocate: platform.CoreFoundation.CFAllocatorDeallocateCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorDeallocateCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var preferredSize: platform.CoreFoundation.CFAllocatorPreferredSizeCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFIndex /* = kotlin.Long */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorPreferredSizeCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFIndex /* = kotlin.Long */>>? */) = TODO()

    final var reallocate: platform.CoreFoundation.CFAllocatorReallocateCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorReallocateCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var release: platform.CoreFoundation.CFAllocatorReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFAllocatorRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFAllocatorRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFArrayCallBacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: platform.CoreFoundation.CFArrayCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFArrayCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var equal: platform.CoreFoundation.CFArrayEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFArrayEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */) = TODO()

    final var release: platform.CoreFoundation.CFArrayReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFArrayReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFArrayRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFArrayRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFBagCallBacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: platform.CoreFoundation.CFBagCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFBagCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var equal: platform.CoreFoundation.CFBagEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFBagEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */) = TODO()

    final var hash: platform.CoreFoundation.CFBagHashCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFBagHashCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>? */) = TODO()

    final var release: platform.CoreFoundation.CFBagReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFBagReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFBagRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFBagRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFBinaryHeapCallBacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var compare: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */>>?) = TODO()

    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFBinaryHeapCompareContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFDictionaryKeyCallBacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: platform.CoreFoundation.CFDictionaryCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var equal: platform.CoreFoundation.CFDictionaryEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */) = TODO()

    final var hash: platform.CoreFoundation.CFDictionaryHashCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryHashCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>? */) = TODO()

    final var release: platform.CoreFoundation.CFDictionaryReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFDictionaryRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFDictionaryValueCallBacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: platform.CoreFoundation.CFDictionaryCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var equal: platform.CoreFoundation.CFDictionaryEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */) = TODO()

    final var release: platform.CoreFoundation.CFDictionaryReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFDictionaryRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDictionaryRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFFileDescriptorContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFGregorianDate public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    actual final var second: kotlin.Double
        get() = TODO()
        set(value: kotlin.Double) = TODO()

    final var day: platform.darwin.SInt8 /* = kotlin.Byte */
        get() = TODO()
        set(value: platform.darwin.SInt8 /* = kotlin.Byte */) = TODO()

    final var hour: platform.darwin.SInt8 /* = kotlin.Byte */
        get() = TODO()
        set(value: platform.darwin.SInt8 /* = kotlin.Byte */) = TODO()

    final var minute: platform.darwin.SInt8 /* = kotlin.Byte */
        get() = TODO()
        set(value: platform.darwin.SInt8 /* = kotlin.Byte */) = TODO()

    final var month: platform.darwin.SInt8 /* = kotlin.Byte */
        get() = TODO()
        set(value: platform.darwin.SInt8 /* = kotlin.Byte */) = TODO()

    final var year: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFGregorianUnits public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    actual final var seconds: kotlin.Double
        get() = TODO()
        set(value: kotlin.Double) = TODO()

    final var days: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var hours: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var minutes: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var months: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var years: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFMachPortContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFMessagePortContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFRange public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var length: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    final var location: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFRunLoopObserverContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFRunLoopSourceContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var cancel: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) -> kotlin.Unit>>?) = TODO()

    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var equal: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>?) = TODO()

    final var hash: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var perform: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var schedule: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) -> kotlin.Unit>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFRunLoopSourceContext1 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var equal: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>?) = TODO()

    final var getPort: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.darwin.mach_port_t /* = kotlin.UInt */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.darwin.mach_port_t /* = kotlin.UInt */>>?) = TODO()

    final var hash: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var perform: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFIndex /* = kotlin.Long */, platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFRunLoopTimerContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFSetCallBacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: platform.CoreFoundation.CFSetCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFSetCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var equal: platform.CoreFoundation.CFSetEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFSetEqualCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean>>? */) = TODO()

    final var hash: platform.CoreFoundation.CFSetHashCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFSetHashCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFHashCode /* = kotlin.ULong */>>? */) = TODO()

    final var release: platform.CoreFoundation.CFSetReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFSetReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFSetRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFSetRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFSocketContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFSocketSignature public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var address: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */) = TODO()

    final var protocol: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var protocolFamily: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var socketType: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFStreamClientContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>?) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>?) = TODO()

    final var retain: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>?) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFStreamError public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var domain: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    final var error: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFStringInlineBuffer public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    actual final val rangeToBuffer: platform.CoreFoundation.CFRange
        get() = TODO()

    final val buffer: kotlinx.cinterop.CArrayPointer<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */>> */
        get() = TODO()

    final var bufferedRangeEnd: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    final var bufferedRangeStart: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    final var directCStringBuffer: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?) = TODO()

    final var directUniCharBuffer: kotlinx.cinterop.CPointer<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?) = TODO()

    final var theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFSwappedFloat32 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var v: platform.posix.uint32_t /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.posix.uint32_t /* = kotlin.UInt */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFSwappedFloat64 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var v: platform.posix.uint64_t /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.posix.uint64_t /* = kotlin.ULong */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual enum class CFTimeZoneNameStyle private constructor(/*0*/ value: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlinx.cinterop.CEnum {
    kCFTimeZoneNameStyleStandard(TODO()),

    kCFTimeZoneNameStyleShortStandard(TODO()),

    kCFTimeZoneNameStyleDaylightSaving(TODO()),

    kCFTimeZoneNameStyleShortDaylightSaving(TODO()),

    kCFTimeZoneNameStyleGeneric(TODO()),

    kCFTimeZoneNameStyleShortGeneric(TODO());

    open override /*1*/ val value: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()

    actual companion object Companion {
        final fun byValue(/*0*/ value: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFTimeZoneNameStyle { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.CoreFoundation.CFTimeZoneNameStyle
            get() = TODO()
            set(value: platform.CoreFoundation.CFTimeZoneNameStyle) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual class CFTreeContext public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var copyDescription: platform.CoreFoundation.CFTreeCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFTreeCopyDescriptionCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */>>? */) = TODO()

    final var info: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var release: platform.CoreFoundation.CFTreeReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFTreeReleaseCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var retain: platform.CoreFoundation.CFTreeRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreFoundation.CFTreeRetainCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var version: platform.CoreFoundation.CFIndex /* = kotlin.Long */
        get() = TODO()
        set(value: platform.CoreFoundation.CFIndex /* = kotlin.Long */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class CFUUIDBytes public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var byte0: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte1: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte10: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte11: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte12: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte13: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte14: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte15: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte2: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte3: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte4: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte5: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte6: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte7: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte8: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var byte9: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class IUnknownVTbl public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var AddRef: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.ULONG /* = kotlin.UInt */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.ULONG /* = kotlin.UInt */>>?) = TODO()

    final var QueryInterface: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CValue<platform.CoreFoundation.REFIID /* = platform.CoreFoundation.CFUUIDBytes */>, kotlinx.cinterop.CPointer<platform.CoreFoundation.LPVOIDVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.LPVOID /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) -> platform.CoreFoundation.HRESULT /* = kotlin.Int */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CValue<platform.CoreFoundation.REFIID /* = platform.CoreFoundation.CFUUIDBytes */>, kotlinx.cinterop.CPointer<platform.CoreFoundation.LPVOIDVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.LPVOID /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) -> platform.CoreFoundation.HRESULT /* = kotlin.Int */>>?) = TODO()

    final var Release: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.ULONG /* = kotlin.UInt */>>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.ULONG /* = kotlin.UInt */>>?) = TODO()

    final var _reserved: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual enum class __CFByteOrder private constructor(/*0*/ value: kotlin.UInt): kotlinx.cinterop.CEnum {
    CFByteOrderUnknown(TODO()),

    CFByteOrderLittleEndian(TODO()),

    CFByteOrderBigEndian(TODO());

    actual open override /*1*/ val value: kotlin.UInt
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.UInt): platform.CoreFoundation.__CFByteOrder { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.CoreFoundation.__CFByteOrder
            get() = TODO()
            set(value: platform.CoreFoundation.__CFByteOrder) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

actual typealias CFBundleRefNum = kotlin.Int

actual typealias CFFileDescriptorNativeDescriptor = kotlin.Int

actual typealias CFIndex = kotlin.Long

actual typealias CFSocketNativeHandle = kotlin.Int

actual typealias CFTimeInterval = kotlin.Double

actual typealias REFIID = platform.CoreFoundation.CFUUIDBytes

actual val kCFBundleExecutableArchitectureI386: kotlin.UInt
    get() = TODO()

actual val kCFBundleExecutableArchitecturePPC: kotlin.UInt
    get() = TODO()

actual val kCFBundleExecutableArchitecturePPC64: kotlin.UInt
    get() = TODO()

actual val kCFBundleExecutableArchitectureX86_64: kotlin.UInt
    get() = TODO()

actual val kCFCopyStringBagCallBacks: platform.CoreFoundation.CFBagCallBacks
    get() = TODO()

actual val kCFCopyStringDictionaryKeyCallBacks: platform.CoreFoundation.CFDictionaryKeyCallBacks
    get() = TODO()

actual val kCFCopyStringSetCallBacks: platform.CoreFoundation.CFSetCallBacks
    get() = TODO()

actual var kCFCoreFoundationVersionNumber: kotlin.Double
    get() = TODO()
    set(value: kotlin.Double) = TODO()

actual val kCFCoreFoundationVersionNumber10_0: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_0_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_10: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_10_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_10_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_10_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_10_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_11_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_11_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_11_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_11_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_1_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_1_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_1_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_1_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_6: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_7: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_2_8: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_6: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_7: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_8: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_3_9: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_10: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_11: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_4_Intel: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_4_PowerPC: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_5_Intel: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_5_PowerPC: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_6_Intel: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_6_PowerPC: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_7: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_8: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_4_9: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_6: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_7: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_5_8: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_6: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_7: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_6_8: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_7: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_7_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_7_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_7_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_7_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_7_5: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_8: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_8_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_8_2: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_8_3: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_8_4: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_9: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_9_1: kotlin.Double
    get() = TODO()

actual val kCFCoreFoundationVersionNumber10_9_2: kotlin.Double
    get() = TODO()

actual val kCFStreamErrorDomainSOCKS: kotlin.Int
    get() = TODO()

actual val kCFStreamErrorDomainSSL: kotlin.Int
    get() = TODO()

actual val kCFStringBinaryHeapCallBacks: platform.CoreFoundation.CFBinaryHeapCallBacks
    get() = TODO()

actual val kCFTypeArrayCallBacks: platform.CoreFoundation.CFArrayCallBacks
    get() = TODO()

actual val kCFTypeBagCallBacks: platform.CoreFoundation.CFBagCallBacks
    get() = TODO()

actual val kCFTypeDictionaryKeyCallBacks: platform.CoreFoundation.CFDictionaryKeyCallBacks
    get() = TODO()

actual val kCFTypeDictionaryValueCallBacks: platform.CoreFoundation.CFDictionaryValueCallBacks
    get() = TODO()

actual val kCFTypeSetCallBacks: platform.CoreFoundation.CFSetCallBacks
    get() = TODO()

actual fun CFConvertDoubleHostToSwapped(/*0*/ arg: kotlin.Double): kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat64> { TODO() }

actual fun CFConvertDoubleSwappedToHost(/*0*/ arg: kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat64>): kotlin.Double { TODO() }

actual fun CFConvertFloatHostToSwapped(/*0*/ arg: kotlin.Float): kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat32> { TODO() }

actual fun CFConvertFloatSwappedToHost(/*0*/ arg: kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat32>): kotlin.Float { TODO() }

actual fun CFRunLoopRun() { TODO() }

actual fun CFTimeZoneResetSystem() { TODO() }

typealias CFAbsoluteTime = platform.CoreFoundation.CFTimeInterval

typealias CFAbsoluteTimeVar = kotlinx.cinterop.DoubleVarOf<platform.CoreFoundation.CFAbsoluteTime>

typealias CFAllocatorAllocateCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFIndex, platform.CoreFoundation.CFOptionFlags, kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFAllocatorAllocateCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorAllocateCallBack>

typealias CFAllocatorCopyDescriptionCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFStringRef?>>

typealias CFAllocatorCopyDescriptionCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorCopyDescriptionCallBack>

typealias CFAllocatorDeallocateCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFAllocatorDeallocateCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorDeallocateCallBack>

typealias CFAllocatorPreferredSizeCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFIndex, platform.CoreFoundation.CFOptionFlags, kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFIndex>>

typealias CFAllocatorPreferredSizeCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorPreferredSizeCallBack>

typealias CFAllocatorReallocateCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.CoreFoundation.CFIndex, platform.CoreFoundation.CFOptionFlags, kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFAllocatorReallocateCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorReallocateCallBack>

typealias CFAllocatorRef = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>

typealias CFAllocatorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorRef>

typealias CFAllocatorReleaseCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFAllocatorReleaseCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorReleaseCallBack>

typealias CFAllocatorRetainCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFAllocatorRetainCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAllocatorRetainCallBack>

typealias CFArrayApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFArrayApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayApplierFunction>

typealias CFArrayCopyDescriptionCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFStringRef?>>

typealias CFArrayCopyDescriptionCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayCopyDescriptionCallBack>

typealias CFArrayEqualCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Boolean>>

typealias CFArrayEqualCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayEqualCallBack>

typealias CFArrayRef = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>

typealias CFArrayRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef>

typealias CFArrayReleaseCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFArrayReleaseCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayReleaseCallBack>

typealias CFArrayRetainCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFArrayRetainCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRetainCallBack>

typealias CFAttributedStringRef = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>

typealias CFAttributedStringRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFAttributedStringRef>

typealias CFBagApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFBagApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagApplierFunction>

typealias CFBagCopyDescriptionCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFStringRef?>>

typealias CFBagCopyDescriptionCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagCopyDescriptionCallBack>

typealias CFBagEqualCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Boolean>>

typealias CFBagEqualCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagEqualCallBack>

typealias CFBagHashCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFHashCode>>

typealias CFBagHashCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagHashCallBack>

typealias CFBagRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>

typealias CFBagRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagRef>

typealias CFBagReleaseCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFBagReleaseCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagReleaseCallBack>

typealias CFBagRetainCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFBagRetainCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBagRetainCallBack>

typealias CFBinaryHeapApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFBinaryHeapApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBinaryHeapApplierFunction>

typealias CFBinaryHeapRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>

typealias CFBinaryHeapRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBinaryHeapRef>

typealias CFBit = platform.darwin.UInt32

typealias CFBitVar = kotlinx.cinterop.UIntVarOf<platform.CoreFoundation.CFBit>

typealias CFBitVectorRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>

typealias CFBitVectorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBitVectorRef>

typealias CFBooleanRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBoolean>

typealias CFBooleanRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBooleanRef>

typealias CFBundleRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>

typealias CFBundleRefNumVar = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.CFBundleRefNum>

typealias CFBundleRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFBundleRef>

typealias CFByteOrder = platform.CoreFoundation.CFIndex

typealias CFByteOrderVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFByteOrder>

typealias CFCalendarIdentifier = platform.CoreFoundation.CFStringRef

typealias CFCalendarIdentifierVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFCalendarIdentifier>

typealias CFCalendarRef = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>

typealias CFCalendarRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFCalendarRef>

typealias CFCalendarUnit = platform.CoreFoundation.CFOptionFlags

typealias CFCalendarUnitVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFCalendarUnit>

typealias CFCharacterSetPredefinedSet = platform.CoreFoundation.CFIndex

typealias CFCharacterSetPredefinedSetVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFCharacterSetPredefinedSet>

typealias CFCharacterSetRef = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>

typealias CFCharacterSetRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFCharacterSetRef>

typealias CFComparatorFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFComparisonResult>>

typealias CFComparatorFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFComparatorFunction>

typealias CFComparisonResult = platform.CoreFoundation.CFIndex

typealias CFComparisonResultVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFComparisonResult>

typealias CFDataRef = kotlinx.cinterop.CPointer<cnames.structs.__CFData>

typealias CFDataRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDataRef>

typealias CFDataSearchFlags = platform.CoreFoundation.CFOptionFlags

typealias CFDataSearchFlagsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFDataSearchFlags>

typealias CFDateFormatterKey = platform.CoreFoundation.CFStringRef

typealias CFDateFormatterKeyVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDateFormatterKey>

typealias CFDateFormatterRef = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>

typealias CFDateFormatterRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDateFormatterRef>

typealias CFDateFormatterStyle = platform.CoreFoundation.CFIndex

typealias CFDateFormatterStyleVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFDateFormatterStyle>

typealias CFDateRef = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>

typealias CFDateRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDateRef>

typealias CFDictionaryApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFDictionaryApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryApplierFunction>

typealias CFDictionaryCopyDescriptionCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFStringRef?>>

typealias CFDictionaryCopyDescriptionCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryCopyDescriptionCallBack>

typealias CFDictionaryEqualCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Boolean>>

typealias CFDictionaryEqualCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryEqualCallBack>

typealias CFDictionaryHashCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFHashCode>>

typealias CFDictionaryHashCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryHashCallBack>

typealias CFDictionaryRef = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>

typealias CFDictionaryRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryRef>

typealias CFDictionaryReleaseCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFDictionaryReleaseCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryReleaseCallBack>

typealias CFDictionaryRetainCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFDictionaryRetainCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryRetainCallBack>

typealias CFErrorDomain = platform.CoreFoundation.CFStringRef

typealias CFErrorDomainVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorDomain>

typealias CFErrorRef = kotlinx.cinterop.CPointer<cnames.structs.__CFError>

typealias CFErrorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef>

typealias CFFileDescriptorCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFFileDescriptorRef?, platform.CoreFoundation.CFOptionFlags, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFFileDescriptorCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFFileDescriptorCallBack>

typealias CFFileDescriptorNativeDescriptorVar = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.CFFileDescriptorNativeDescriptor>

typealias CFFileDescriptorRef = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>

typealias CFFileDescriptorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFFileDescriptorRef>

typealias CFFileSecurityClearOptions = platform.CoreFoundation.CFOptionFlags

typealias CFFileSecurityClearOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFFileSecurityClearOptions>

typealias CFFileSecurityRef = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>

typealias CFFileSecurityRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFFileSecurityRef>

typealias CFGregorianUnitFlags = platform.CoreFoundation.CFOptionFlags

typealias CFGregorianUnitFlagsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFGregorianUnitFlags>

typealias CFHashCode = kotlin.ULong

typealias CFHashCodeVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFHashCode>

typealias CFISO8601DateFormatOptions = platform.CoreFoundation.CFOptionFlags

typealias CFISO8601DateFormatOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFISO8601DateFormatOptions>

typealias CFIndexVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex>

typealias CFLocaleIdentifier = platform.CoreFoundation.CFStringRef

typealias CFLocaleIdentifierVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFLocaleIdentifier>

typealias CFLocaleKey = platform.CoreFoundation.CFStringRef

typealias CFLocaleKeyVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFLocaleKey>

typealias CFLocaleLanguageDirection = platform.CoreFoundation.CFIndex

typealias CFLocaleLanguageDirectionVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFLocaleLanguageDirection>

typealias CFLocaleRef = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>

typealias CFLocaleRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFLocaleRef>

typealias CFMachPortCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMachPortRef?, kotlinx.cinterop.COpaquePointer?, platform.CoreFoundation.CFIndex, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFMachPortCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMachPortCallBack>

typealias CFMachPortInvalidationCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMachPortRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFMachPortInvalidationCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMachPortInvalidationCallBack>

typealias CFMachPortRef = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>

typealias CFMachPortRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMachPortRef>

typealias CFMessagePortCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMessagePortRef?, platform.darwin.SInt32, platform.CoreFoundation.CFDataRef?, kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFDataRef?>>

typealias CFMessagePortCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMessagePortCallBack>

typealias CFMessagePortInvalidationCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMessagePortRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFMessagePortInvalidationCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMessagePortInvalidationCallBack>

typealias CFMessagePortRef = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>

typealias CFMessagePortRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMessagePortRef>

typealias CFMutableArrayRef = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>

typealias CFMutableArrayRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableArrayRef>

typealias CFMutableAttributedStringRef = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>

typealias CFMutableAttributedStringRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableAttributedStringRef>

typealias CFMutableBagRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>

typealias CFMutableBagRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableBagRef>

typealias CFMutableBitVectorRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>

typealias CFMutableBitVectorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableBitVectorRef>

typealias CFMutableCharacterSetRef = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>

typealias CFMutableCharacterSetRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableCharacterSetRef>

typealias CFMutableDataRef = kotlinx.cinterop.CPointer<cnames.structs.__CFData>

typealias CFMutableDataRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableDataRef>

typealias CFMutableDictionaryRef = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>

typealias CFMutableDictionaryRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableDictionaryRef>

typealias CFMutableSetRef = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>

typealias CFMutableSetRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableSetRef>

typealias CFMutableStringRef = kotlinx.cinterop.CPointer<cnames.structs.__CFString>

typealias CFMutableStringRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableStringRef>

typealias CFNotificationCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFNotificationCenterRef?, kotlinx.cinterop.COpaquePointer?, platform.CoreFoundation.CFNotificationName?, kotlinx.cinterop.COpaquePointer?, platform.CoreFoundation.CFDictionaryRef?) -> kotlin.Unit>>

typealias CFNotificationCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNotificationCallback>

typealias CFNotificationCenterRef = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>

typealias CFNotificationCenterRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNotificationCenterRef>

typealias CFNotificationName = platform.CoreFoundation.CFStringRef

typealias CFNotificationNameVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNotificationName>

typealias CFNotificationSuspensionBehavior = platform.CoreFoundation.CFIndex

typealias CFNotificationSuspensionBehaviorVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFNotificationSuspensionBehavior>

typealias CFNullRef = kotlinx.cinterop.CPointer<cnames.structs.__CFNull>

typealias CFNullRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNullRef>

typealias CFNumberFormatterKey = platform.CoreFoundation.CFStringRef

typealias CFNumberFormatterKeyVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNumberFormatterKey>

typealias CFNumberFormatterOptionFlags = platform.CoreFoundation.CFOptionFlags

typealias CFNumberFormatterOptionFlagsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFNumberFormatterOptionFlags>

typealias CFNumberFormatterPadPosition = platform.CoreFoundation.CFIndex

typealias CFNumberFormatterPadPositionVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFNumberFormatterPadPosition>

typealias CFNumberFormatterRef = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>

typealias CFNumberFormatterRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNumberFormatterRef>

typealias CFNumberFormatterRoundingMode = platform.CoreFoundation.CFIndex

typealias CFNumberFormatterRoundingModeVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFNumberFormatterRoundingMode>

typealias CFNumberFormatterStyle = platform.CoreFoundation.CFIndex

typealias CFNumberFormatterStyleVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFNumberFormatterStyle>

typealias CFNumberRef = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>

typealias CFNumberRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFNumberRef>

typealias CFNumberType = platform.CoreFoundation.CFIndex

typealias CFNumberTypeVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFNumberType>

typealias CFOptionFlags = kotlin.ULong

typealias CFOptionFlagsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFOptionFlags>

typealias CFPlugInDynamicRegisterFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFPlugInRef?) -> kotlin.Unit>>

typealias CFPlugInDynamicRegisterFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInDynamicRegisterFunction>

typealias CFPlugInFactoryFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, platform.CoreFoundation.CFUUIDRef?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFPlugInFactoryFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInFactoryFunction>

typealias CFPlugInInstanceDeallocateInstanceDataFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFPlugInInstanceDeallocateInstanceDataFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInInstanceDeallocateInstanceDataFunction>

typealias CFPlugInInstanceGetInterfaceFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFPlugInInstanceRef?, platform.CoreFoundation.CFStringRef?, kotlinx.cinterop.CPointer<kotlinx.cinterop.COpaquePointerVar>?) -> kotlin.Boolean>>

typealias CFPlugInInstanceGetInterfaceFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInInstanceGetInterfaceFunction>

typealias CFPlugInInstanceRef = kotlinx.cinterop.CPointer<cnames.structs.__CFPlugInInstance>

typealias CFPlugInInstanceRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInInstanceRef>

typealias CFPlugInRef = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>

typealias CFPlugInRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInRef>

typealias CFPlugInUnloadFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFPlugInRef?) -> kotlin.Unit>>

typealias CFPlugInUnloadFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPlugInUnloadFunction>

typealias CFPropertyListFormat = platform.CoreFoundation.CFIndex

typealias CFPropertyListFormatVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFPropertyListFormat>

typealias CFPropertyListMutabilityOptions = platform.CoreFoundation.CFOptionFlags

typealias CFPropertyListMutabilityOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFPropertyListMutabilityOptions>

typealias CFPropertyListRef = platform.CoreFoundation.CFTypeRef

typealias CFPropertyListRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPropertyListRef>

typealias CFReadStreamClientCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFReadStreamRef?, platform.CoreFoundation.CFStreamEventType, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFReadStreamClientCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFReadStreamClientCallBack>

typealias CFReadStreamRef = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>

typealias CFReadStreamRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFReadStreamRef>

typealias CFRunLoopActivity = platform.CoreFoundation.CFOptionFlags

typealias CFRunLoopActivityVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFRunLoopActivity>

typealias CFRunLoopMode = platform.CoreFoundation.CFStringRef

typealias CFRunLoopModeVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopMode>

typealias CFRunLoopObserverCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFRunLoopObserverRef?, platform.CoreFoundation.CFRunLoopActivity, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFRunLoopObserverCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopObserverCallBack>

typealias CFRunLoopObserverRef = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>

typealias CFRunLoopObserverRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopObserverRef>

typealias CFRunLoopRef = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>

typealias CFRunLoopRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopRef>

typealias CFRunLoopRunResult = platform.darwin.SInt32

typealias CFRunLoopRunResultVar = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.CFRunLoopRunResult>

typealias CFRunLoopSourceRef = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>

typealias CFRunLoopSourceRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopSourceRef>

typealias CFRunLoopTimerCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFRunLoopTimerRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFRunLoopTimerCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopTimerCallBack>

typealias CFRunLoopTimerRef = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>

typealias CFRunLoopTimerRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFRunLoopTimerRef>

typealias CFSetApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFSetApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetApplierFunction>

typealias CFSetCopyDescriptionCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFStringRef?>>

typealias CFSetCopyDescriptionCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetCopyDescriptionCallBack>

typealias CFSetEqualCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Boolean>>

typealias CFSetEqualCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetEqualCallBack>

typealias CFSetHashCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFHashCode>>

typealias CFSetHashCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetHashCallBack>

typealias CFSetRef = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>

typealias CFSetRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetRef>

typealias CFSetReleaseCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFSetReleaseCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetReleaseCallBack>

typealias CFSetRetainCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef?, kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFSetRetainCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSetRetainCallBack>

typealias CFSocketCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFSocketRef?, platform.CoreFoundation.CFSocketCallBackType, platform.CoreFoundation.CFDataRef?, kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFSocketCallBackType = platform.CoreFoundation.CFOptionFlags

typealias CFSocketCallBackTypeVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFSocketCallBackType>

typealias CFSocketCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSocketCallBack>

typealias CFSocketError = platform.CoreFoundation.CFIndex

typealias CFSocketErrorVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFSocketError>

typealias CFSocketNativeHandleVar = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.CFSocketNativeHandle>

typealias CFSocketRef = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>

typealias CFSocketRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFSocketRef>

typealias CFStreamErrorDomain = platform.CoreFoundation.CFIndex

typealias CFStreamErrorDomainVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFStreamErrorDomain>

typealias CFStreamEventType = platform.CoreFoundation.CFOptionFlags

typealias CFStreamEventTypeVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFStreamEventType>

typealias CFStreamPropertyKey = platform.CoreFoundation.CFStringRef

typealias CFStreamPropertyKeyVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStreamPropertyKey>

typealias CFStreamStatus = platform.CoreFoundation.CFIndex

typealias CFStreamStatusVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFStreamStatus>

typealias CFStringBuiltInEncodings = platform.CoreFoundation.CFStringEncoding

typealias CFStringBuiltInEncodingsVar = kotlinx.cinterop.UIntVarOf<platform.CoreFoundation.CFStringBuiltInEncodings>

typealias CFStringCompareFlags = platform.CoreFoundation.CFOptionFlags

typealias CFStringCompareFlagsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFStringCompareFlags>

typealias CFStringEncoding = platform.darwin.UInt32

typealias CFStringEncodingVar = kotlinx.cinterop.UIntVarOf<platform.CoreFoundation.CFStringEncoding>

typealias CFStringEncodings = platform.CoreFoundation.CFIndex

typealias CFStringEncodingsVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFStringEncodings>

typealias CFStringNormalizationForm = platform.CoreFoundation.CFIndex

typealias CFStringNormalizationFormVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFStringNormalizationForm>

typealias CFStringRef = kotlinx.cinterop.CPointer<cnames.structs.__CFString>

typealias CFStringRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringRef>

typealias CFStringTokenizerRef = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>

typealias CFStringTokenizerRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringTokenizerRef>

typealias CFStringTokenizerTokenType = platform.CoreFoundation.CFOptionFlags

typealias CFStringTokenizerTokenTypeVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFStringTokenizerTokenType>

typealias CFTimeIntervalVar = kotlinx.cinterop.DoubleVarOf<platform.CoreFoundation.CFTimeInterval>

typealias CFTimeZoneRef = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>

typealias CFTimeZoneRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTimeZoneRef>

typealias CFTreeApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFTreeApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTreeApplierFunction>

typealias CFTreeCopyDescriptionCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> platform.CoreFoundation.CFStringRef?>>

typealias CFTreeCopyDescriptionCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTreeCopyDescriptionCallBack>

typealias CFTreeRef = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>

typealias CFTreeRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTreeRef>

typealias CFTreeReleaseCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFTreeReleaseCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTreeReleaseCallBack>

typealias CFTreeRetainCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CFTreeRetainCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTreeRetainCallBack>

typealias CFTypeID = kotlin.ULong

typealias CFTypeIDVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFTypeID>

typealias CFTypeRef = kotlinx.cinterop.COpaquePointer

typealias CFTypeRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTypeRef>

typealias CFURLBookmarkCreationOptions = platform.CoreFoundation.CFOptionFlags

typealias CFURLBookmarkCreationOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFURLBookmarkCreationOptions>

typealias CFURLBookmarkFileCreationOptions = platform.CoreFoundation.CFOptionFlags

typealias CFURLBookmarkFileCreationOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFURLBookmarkFileCreationOptions>

typealias CFURLBookmarkResolutionOptions = platform.CoreFoundation.CFOptionFlags

typealias CFURLBookmarkResolutionOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFURLBookmarkResolutionOptions>

typealias CFURLComponentType = platform.CoreFoundation.CFIndex

typealias CFURLComponentTypeVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFURLComponentType>

typealias CFURLEnumeratorOptions = platform.CoreFoundation.CFOptionFlags

typealias CFURLEnumeratorOptionsVar = kotlinx.cinterop.ULongVarOf<platform.CoreFoundation.CFURLEnumeratorOptions>

typealias CFURLEnumeratorRef = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>

typealias CFURLEnumeratorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFURLEnumeratorRef>

typealias CFURLEnumeratorResult = platform.CoreFoundation.CFIndex

typealias CFURLEnumeratorResultVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFURLEnumeratorResult>

typealias CFURLError = platform.CoreFoundation.CFIndex

typealias CFURLErrorVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFURLError>

typealias CFURLPathStyle = platform.CoreFoundation.CFIndex

typealias CFURLPathStyleVar = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFURLPathStyle>

typealias CFURLRef = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>

typealias CFURLRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFURLRef>

typealias CFUUIDRef = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>

typealias CFUUIDRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFUUIDRef>

typealias CFWriteStreamClientCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFWriteStreamRef?, platform.CoreFoundation.CFStreamEventType, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CFWriteStreamClientCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFWriteStreamClientCallBack>

typealias CFWriteStreamRef = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>

typealias CFWriteStreamRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFWriteStreamRef>

typealias HRESULT = platform.darwin.SInt32

typealias HRESULTVar = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.HRESULT>

typealias LPVOID = kotlinx.cinterop.COpaquePointer

typealias LPVOIDVar = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.LPVOID>

typealias ULONG = platform.darwin.UInt32

typealias ULONGVar = kotlinx.cinterop.UIntVarOf<platform.CoreFoundation.ULONG>

val CFNotificationSuspensionBehaviorCoalesce: platform.CoreFoundation.CFNotificationSuspensionBehavior /* = kotlin.Long */
    get() = TODO()

val CFNotificationSuspensionBehaviorDeliverImmediately: platform.CoreFoundation.CFNotificationSuspensionBehavior /* = kotlin.Long */
    get() = TODO()

val CFNotificationSuspensionBehaviorDrop: platform.CoreFoundation.CFNotificationSuspensionBehavior /* = kotlin.Long */
    get() = TODO()

val CFNotificationSuspensionBehaviorHold: platform.CoreFoundation.CFNotificationSuspensionBehavior /* = kotlin.Long */
    get() = TODO()

const val CF_USE_OSBYTEORDER_H: kotlin.Int = 0

const val COREFOUNDATION_CFPLUGINCOM_SEPARATE: kotlin.Int = 0

const val E_ABORT: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_ACCESSDENIED: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_FAIL: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_HANDLE: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_INVALIDARG: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_NOINTERFACE: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_NOTIMPL: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_OUTOFMEMORY: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_POINTER: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val E_UNEXPECTED: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val FALSE: kotlin.Int = 0

const val SEVERITY_ERROR: kotlin.Int = 0

const val SEVERITY_SUCCESS: kotlin.Int = 0

const val S_FALSE: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val S_OK: platform.CoreFoundation.HRESULT /* = kotlin.Int */ = 0

const val TRUE: kotlin.Int = 0

const val __COREFOUNDATION_CFARRAY__: kotlin.Int = 0

const val __COREFOUNDATION_CFATTRIBUTEDSTRING__: kotlin.Int = 0

const val __COREFOUNDATION_CFAVAILABILITY__: kotlin.Int = 0

const val __COREFOUNDATION_CFBAG__: kotlin.Int = 0

const val __COREFOUNDATION_CFBASE__: kotlin.Int = 0

const val __COREFOUNDATION_CFBINARYHEAP__: kotlin.Int = 0

const val __COREFOUNDATION_CFBITVECTOR__: kotlin.Int = 0

const val __COREFOUNDATION_CFBUNDLE__: kotlin.Int = 0

const val __COREFOUNDATION_CFBYTEORDER__: kotlin.Int = 0

const val __COREFOUNDATION_CFCALENDAR__: kotlin.Int = 0

const val __COREFOUNDATION_CFCHARACTERSET__: kotlin.Int = 0

const val __COREFOUNDATION_CFDATA__: kotlin.Int = 0

const val __COREFOUNDATION_CFDATEFORMATTER__: kotlin.Int = 0

const val __COREFOUNDATION_CFDATE__: kotlin.Int = 0

const val __COREFOUNDATION_CFDICTIONARY__: kotlin.Int = 0

const val __COREFOUNDATION_CFERROR__: kotlin.Int = 0

const val __COREFOUNDATION_CFFILEDESCRIPTOR__: kotlin.Int = 0

const val __COREFOUNDATION_CFFILESECURITY__: kotlin.Int = 0

const val __COREFOUNDATION_CFLOCALE__: kotlin.Int = 0

const val __COREFOUNDATION_CFMACHPORT__: kotlin.Int = 0

const val __COREFOUNDATION_CFMESSAGEPORT__: kotlin.Int = 0

const val __COREFOUNDATION_CFNOTIFICATIONCENTER__: kotlin.Int = 0

const val __COREFOUNDATION_CFNUMBERFORMATTER__: kotlin.Int = 0

const val __COREFOUNDATION_CFNUMBER__: kotlin.Int = 0

const val __COREFOUNDATION_CFPLUGINCOM__: kotlin.Int = 0

const val __COREFOUNDATION_CFPLUGIN__: kotlin.Int = 0

const val __COREFOUNDATION_CFPREFERENCES__: kotlin.Int = 0

const val __COREFOUNDATION_CFPROPERTYLIST__: kotlin.Int = 0

const val __COREFOUNDATION_CFRUNLOOP__: kotlin.Int = 0

const val __COREFOUNDATION_CFSET__: kotlin.Int = 0

const val __COREFOUNDATION_CFSOCKET__: kotlin.Int = 0

const val __COREFOUNDATION_CFSTREAM__: kotlin.Int = 0

const val __COREFOUNDATION_CFSTRINGENCODINGEXT__: kotlin.Int = 0

const val __COREFOUNDATION_CFSTRINGTOKENIZER__: kotlin.Int = 0

const val __COREFOUNDATION_CFSTRING__: kotlin.Int = 0

const val __COREFOUNDATION_CFTIMEZONE__: kotlin.Int = 0

const val __COREFOUNDATION_CFTREE__: kotlin.Int = 0

const val __COREFOUNDATION_CFURLACCESS__: kotlin.Int = 0

const val __COREFOUNDATION_CFURLENUMERATOR__: kotlin.Int = 0

const val __COREFOUNDATION_CFURL__: kotlin.Int = 0

const val __COREFOUNDATION_CFUTILITIES__: kotlin.Int = 0

const val __COREFOUNDATION_CFUUID__: kotlin.Int = 0

const val __COREFOUNDATION_COREFOUNDATION__: kotlin.Int = 0

const val __COREFOUNDATION__: kotlin.Int = 0

const val __kCFStringInlineBufferLength: kotlin.Int = 0

val kCFAbsoluteTimeIntervalSince1904: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */
    get() = TODO()

val kCFAbsoluteTimeIntervalSince1970: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */
    get() = TODO()

val kCFAllocatorDefault: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */
    get() = TODO()

val kCFAllocatorMalloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */
    get() = TODO()

val kCFAllocatorMallocZone: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */
    get() = TODO()

val kCFAllocatorNull: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */
    get() = TODO()

val kCFAllocatorSystemDefault: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */
    get() = TODO()

val kCFAllocatorUseContext: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */
    get() = TODO()

val kCFBookmarkResolutionWithoutMountingMask: platform.CoreFoundation.CFURLBookmarkResolutionOptions /* = kotlin.ULong */
    get() = TODO()

val kCFBookmarkResolutionWithoutUIMask: platform.CoreFoundation.CFURLBookmarkResolutionOptions /* = kotlin.ULong */
    get() = TODO()

val kCFBooleanFalse: platform.CoreFoundation.CFBooleanRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBoolean>? */
    get() = TODO()

val kCFBooleanTrue: platform.CoreFoundation.CFBooleanRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBoolean>? */
    get() = TODO()

val kCFBuddhistCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleDevelopmentRegionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleExecutableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleIdentifierKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleInfoDictionaryVersionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleLocalizationsKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFBundleVersionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFCalendarComponentsWrap: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitDay: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitEra: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitHour: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitMinute: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitMonth: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitQuarter: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitSecond: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitWeek: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitWeekOfMonth: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitWeekOfYear: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitWeekday: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitWeekdayOrdinal: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitYear: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCalendarUnitYearForWeekOfYear: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */
    get() = TODO()

val kCFCharacterSetAlphaNumeric: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetCapitalizedLetter: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetControl: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetDecimalDigit: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetDecomposable: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetIllegal: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetLetter: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetLowercaseLetter: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetNewline: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetNonBase: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetPunctuation: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetSymbol: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetUppercaseLetter: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetWhitespace: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFCharacterSetWhitespaceAndNewline: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */
    get() = TODO()

val kCFChineseCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFCompareAnchored: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareBackwards: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareCaseInsensitive: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareDiacriticInsensitive: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareEqualTo: platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */
    get() = TODO()

val kCFCompareForcedOrdering: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareGreaterThan: platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */
    get() = TODO()

val kCFCompareLessThan: platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */
    get() = TODO()

val kCFCompareLocalized: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareNonliteral: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareNumerically: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

val kCFCompareWidthInsensitive: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */
    get() = TODO()

const val kCFCoreFoundationVersionNumber10_10_2: kotlin.Int = 0

const val kCFCoreFoundationVersionNumber10_10_Max: kotlin.Int = 0

const val kCFCoreFoundationVersionNumber10_11: kotlin.Int = 0

const val kCFCoreFoundationVersionNumber10_11_Max: kotlin.Int = 0

val kCFCoreFoundationVersionNumber_iOS_4_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_4_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_4_2: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_4_3: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_5_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_5_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_6_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_6_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_7_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_7_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_8_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_8_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_8_2: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_8_3: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_8_4: kotlin.Double
    get() = TODO()

const val kCFCoreFoundationVersionNumber_iOS_8_x_Max: kotlin.Int = 0

val kCFCoreFoundationVersionNumber_iOS_9_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_9_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_9_2: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_9_3: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iOS_9_4: kotlin.Double
    get() = TODO()

const val kCFCoreFoundationVersionNumber_iOS_9_x_Max: kotlin.Int = 0

val kCFCoreFoundationVersionNumber_iPhoneOS_2_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iPhoneOS_2_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iPhoneOS_2_2: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iPhoneOS_3_0: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iPhoneOS_3_1: kotlin.Double
    get() = TODO()

val kCFCoreFoundationVersionNumber_iPhoneOS_3_2: kotlin.Double
    get() = TODO()

val kCFDataSearchAnchored: platform.CoreFoundation.CFDataSearchFlags /* = kotlin.ULong */
    get() = TODO()

val kCFDataSearchBackwards: platform.CoreFoundation.CFDataSearchFlags /* = kotlin.ULong */
    get() = TODO()

val kCFDateFormatterAMSymbol: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterCalendar: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterCalendarName: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterDefaultDate: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterDefaultFormat: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterDoesRelativeDateFormattingKey: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterEraSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterFullStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFDateFormatterGregorianStartDate: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterIsLenient: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterLongEraSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterLongStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFDateFormatterMediumStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFDateFormatterMonthSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterNoStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFDateFormatterPMSymbol: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterQuarterSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterShortMonthSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterShortQuarterSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterShortStandaloneMonthSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterShortStandaloneQuarterSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterShortStandaloneWeekdaySymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterShortStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFDateFormatterShortWeekdaySymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterStandaloneMonthSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterStandaloneQuarterSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterStandaloneWeekdaySymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterTimeZone: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterTwoDigitStartDate: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterVeryShortMonthSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterVeryShortStandaloneMonthSymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterVeryShortStandaloneWeekdaySymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterVeryShortWeekdaySymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFDateFormatterWeekdaySymbols: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorDescriptionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorDomainCocoa: platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorDomainMach: platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorDomainOSStatus: platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorDomainPOSIX: platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorFilePathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorLocalizedDescriptionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorLocalizedFailureKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorLocalizedFailureReasonKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorLocalizedRecoverySuggestionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorURLKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFErrorUnderlyingErrorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFFileDescriptorReadCallBack: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFFileDescriptorWriteCallBack: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFFileSecurityClearAccessControlList: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */
    get() = TODO()

val kCFFileSecurityClearGroup: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */
    get() = TODO()

val kCFFileSecurityClearGroupUUID: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */
    get() = TODO()

val kCFFileSecurityClearMode: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */
    get() = TODO()

val kCFFileSecurityClearOwner: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */
    get() = TODO()

val kCFFileSecurityClearOwnerUUID: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianAllUnits: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFGregorianUnitsDays: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianUnitsHours: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianUnitsMinutes: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianUnitsMonths: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianUnitsSeconds: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFGregorianUnitsYears: platform.CoreFoundation.CFGregorianUnitFlags /* = kotlin.ULong */
    get() = TODO()

val kCFHebrewCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFISO8601Calendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFISO8601DateFormatWithColonSeparatorInTime: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithColonSeparatorInTimeZone: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithDashSeparatorInDate: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithDay: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithFractionalSeconds: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithFullDate: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithFullTime: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithInternetDateTime: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithMonth: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithSpaceBetweenDateAndTime: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithTime: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithTimeZone: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithWeekOfYear: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFISO8601DateFormatWithYear: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */
    get() = TODO()

val kCFIndianCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFIslamicCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFIslamicCivilCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFIslamicTabularCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFIslamicUmmAlQuraCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFJapaneseCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleAlternateQuotationBeginDelimiterKey: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleAlternateQuotationEndDelimiterKey: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCalendar: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCalendarIdentifier: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCollationIdentifier: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCollatorIdentifier: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCountryCode: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCurrencyCode: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCurrencySymbol: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleCurrentLocaleDidChangeNotification: platform.CoreFoundation.CFNotificationName? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleDecimalSeparator: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleExemplarCharacterSet: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleGroupingSeparator: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleIdentifier: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleLanguageCode: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleLanguageDirectionBottomToTop: platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */
    get() = TODO()

val kCFLocaleLanguageDirectionLeftToRight: platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */
    get() = TODO()

val kCFLocaleLanguageDirectionRightToLeft: platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */
    get() = TODO()

val kCFLocaleLanguageDirectionTopToBottom: platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */
    get() = TODO()

val kCFLocaleLanguageDirectionUnknown: platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */
    get() = TODO()

val kCFLocaleMeasurementSystem: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleQuotationBeginDelimiterKey: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleQuotationEndDelimiterKey: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleScriptCode: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleUsesMetricSystem: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFLocaleVariantCode: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFMessagePortBecameInvalidError: platform.darwin.SInt32 /* = kotlin.Int */
    get() = TODO()

val kCFMessagePortIsInvalid: platform.darwin.SInt32 /* = kotlin.Int */
    get() = TODO()

val kCFMessagePortReceiveTimeout: platform.darwin.SInt32 /* = kotlin.Int */
    get() = TODO()

val kCFMessagePortSendTimeout: platform.darwin.SInt32 /* = kotlin.Int */
    get() = TODO()

val kCFMessagePortSuccess: platform.darwin.SInt32 /* = kotlin.Int */
    get() = TODO()

val kCFMessagePortTransportError: platform.darwin.SInt32 /* = kotlin.Int */
    get() = TODO()

val kCFNotFound: platform.CoreFoundation.CFIndex /* = kotlin.Long */
    get() = TODO()

val kCFNotificationDeliverImmediately: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFNotificationPostToAllSessions: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFNull: platform.CoreFoundation.CFNullRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNull>? */
    get() = TODO()

val kCFNumberCFIndexType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberCGFloatType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberCharType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberDoubleType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberFloat32Type: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberFloat64Type: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberFloatType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterAlwaysShowDecimalSeparator: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterCurrencyAccountingStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterCurrencyCode: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterCurrencyDecimalSeparator: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterCurrencyGroupingSeparator: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterCurrencyISOCodeStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterCurrencyPluralStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterCurrencyStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterCurrencySymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterDecimalSeparator: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterDecimalStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterDefaultFormat: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterExponentSymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterFormatWidth: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterGroupingSeparator: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterGroupingSize: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterInfinitySymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterInternationalCurrencySymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterIsLenient: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMaxFractionDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMaxIntegerDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMaxSignificantDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMinFractionDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMinIntegerDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMinSignificantDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMinusSign: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterMultiplier: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterNaNSymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterNegativePrefix: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterNegativeSuffix: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterNoStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterOrdinalStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterPadAfterPrefix: platform.CoreFoundation.CFNumberFormatterPadPosition /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterPadAfterSuffix: platform.CoreFoundation.CFNumberFormatterPadPosition /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterPadBeforePrefix: platform.CoreFoundation.CFNumberFormatterPadPosition /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterPadBeforeSuffix: platform.CoreFoundation.CFNumberFormatterPadPosition /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterPaddingCharacter: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterPaddingPosition: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterParseIntegersOnly: platform.CoreFoundation.CFNumberFormatterOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFNumberFormatterPerMillSymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterPercentStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterPercentSymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterPlusSign: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterPositivePrefix: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterPositiveSuffix: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterRoundCeiling: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundDown: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundFloor: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundHalfDown: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundHalfEven: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundHalfUp: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundUp: platform.CoreFoundation.CFNumberFormatterRoundingMode /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterRoundingIncrement: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterRoundingMode: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterScientificStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterSecondaryGroupingSize: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterSpellOutStyle: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */
    get() = TODO()

val kCFNumberFormatterUseGroupingSeparator: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterUseSignificantDigits: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberFormatterZeroSymbol: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFNumberIntType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberLongLongType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberLongType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberMaxType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberNSIntegerType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberNaN: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */
    get() = TODO()

val kCFNumberNegativeInfinity: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */
    get() = TODO()

val kCFNumberPositiveInfinity: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */
    get() = TODO()

val kCFNumberSInt16Type: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberSInt32Type: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberSInt64Type: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberSInt8Type: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFNumberShortType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */
    get() = TODO()

val kCFPersianCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPlugInDynamicRegisterFunctionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPlugInDynamicRegistrationKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPlugInFactoriesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPlugInTypesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPlugInUnloadFunctionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPreferencesAnyApplication: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPreferencesAnyHost: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPreferencesAnyUser: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPreferencesCurrentApplication: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPreferencesCurrentHost: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPreferencesCurrentUser: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFPropertyListBinaryFormat_v1_0: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */
    get() = TODO()

val kCFPropertyListImmutable: platform.CoreFoundation.CFPropertyListMutabilityOptions /* = kotlin.ULong */
    get() = TODO()

val kCFPropertyListMutableContainers: platform.CoreFoundation.CFPropertyListMutabilityOptions /* = kotlin.ULong */
    get() = TODO()

val kCFPropertyListMutableContainersAndLeaves: platform.CoreFoundation.CFPropertyListMutabilityOptions /* = kotlin.ULong */
    get() = TODO()

val kCFPropertyListOpenStepFormat: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */
    get() = TODO()

val kCFPropertyListReadCorruptError: platform.CoreFoundation.CFIndex /* = kotlin.Long */
    get() = TODO()

val kCFPropertyListReadStreamError: platform.CoreFoundation.CFIndex /* = kotlin.Long */
    get() = TODO()

val kCFPropertyListReadUnknownVersionError: platform.CoreFoundation.CFIndex /* = kotlin.Long */
    get() = TODO()

val kCFPropertyListWriteStreamError: platform.CoreFoundation.CFIndex /* = kotlin.Long */
    get() = TODO()

val kCFPropertyListXMLFormat_v1_0: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */
    get() = TODO()

val kCFRepublicOfChinaCalendar: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFRunLoopAfterWaiting: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopAllActivities: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopBeforeSources: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopBeforeTimers: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopBeforeWaiting: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopCommonModes: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFRunLoopDefaultMode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFRunLoopEntry: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopExit: platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */
    get() = TODO()

val kCFRunLoopRunFinished: platform.CoreFoundation.CFRunLoopRunResult /* = kotlin.Int */
    get() = TODO()

val kCFRunLoopRunHandledSource: platform.CoreFoundation.CFRunLoopRunResult /* = kotlin.Int */
    get() = TODO()

val kCFRunLoopRunStopped: platform.CoreFoundation.CFRunLoopRunResult /* = kotlin.Int */
    get() = TODO()

val kCFRunLoopRunTimedOut: platform.CoreFoundation.CFRunLoopRunResult /* = kotlin.Int */
    get() = TODO()

val kCFSocketAcceptCallBack: platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */
    get() = TODO()

val kCFSocketAutomaticallyReenableAcceptCallBack: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFSocketAutomaticallyReenableDataCallBack: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFSocketAutomaticallyReenableReadCallBack: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFSocketAutomaticallyReenableWriteCallBack: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFSocketCloseOnInvalidate: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFSocketCommandKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketConnectCallBack: platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */
    get() = TODO()

val kCFSocketDataCallBack: platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */
    get() = TODO()

val kCFSocketError: platform.CoreFoundation.CFSocketError /* = kotlin.Long */
    get() = TODO()

val kCFSocketErrorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketLeaveErrors: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFSocketNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketNoCallBack: platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */
    get() = TODO()

val kCFSocketReadCallBack: platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */
    get() = TODO()

val kCFSocketRegisterCommand: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketResultKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketRetrieveCommand: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketSuccess: platform.CoreFoundation.CFSocketError /* = kotlin.Long */
    get() = TODO()

val kCFSocketTimeout: platform.CoreFoundation.CFSocketError /* = kotlin.Long */
    get() = TODO()

val kCFSocketValueKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFSocketWriteCallBack: platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */
    get() = TODO()

val kCFStreamErrorDomainCustom: platform.CoreFoundation.CFStreamErrorDomain /* = kotlin.Long */
    get() = TODO()

val kCFStreamErrorDomainMacOSStatus: platform.CoreFoundation.CFStreamErrorDomain /* = kotlin.Long */
    get() = TODO()

val kCFStreamErrorDomainPOSIX: platform.CoreFoundation.CFStreamErrorDomain /* = kotlin.Long */
    get() = TODO()

val kCFStreamEventCanAcceptBytes: platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */
    get() = TODO()

val kCFStreamEventEndEncountered: platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */
    get() = TODO()

val kCFStreamEventErrorOccurred: platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */
    get() = TODO()

val kCFStreamEventHasBytesAvailable: platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */
    get() = TODO()

val kCFStreamEventNone: platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */
    get() = TODO()

val kCFStreamEventOpenCompleted: platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */
    get() = TODO()

var kCFStreamPropertyAppendToFile: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertyDataWritten: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertyFileCurrentOffset: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySOCKSPassword: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySOCKSProxy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySOCKSProxyHost: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySOCKSProxyPort: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySOCKSUser: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySOCKSVersion: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertyShouldCloseNativeSocket: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySocketNativeHandle: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySocketRemoteHostName: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySocketRemotePortNumber: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamPropertySocketSecurityLevel: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSOCKSVersion4: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSOCKSVersion5: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSecurityLevelNegotiatedSSL: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSecurityLevelNone: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSecurityLevelSSLv2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSecurityLevelSSLv3: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

var kCFStreamSocketSecurityLevelTLSv1: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) = TODO()

val kCFStreamStatusAtEnd: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusClosed: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusError: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusNotOpen: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusOpen: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusOpening: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusReading: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStreamStatusWriting: platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingANSEL: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingASCII: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingBig5: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingBig5_E: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingBig5_HKSCS_1999: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingCNS_11643_92_P1: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingCNS_11643_92_P2: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingCNS_11643_92_P3: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSArabic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSBalticRim: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSCanadianFrench: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSChineseSimplif: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSChineseTrad: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSCyrillic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSGreek: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSGreek1: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSGreek2: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSHebrew: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSIcelandic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSJapanese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSKorean: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSLatin1: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSLatin2: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSLatinUS: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSNordic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSPortuguese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSRussian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSThai: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingDOSTurkish: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingEBCDIC_CP037: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingEBCDIC_US: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingEUC_CN: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingEUC_JP: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingEUC_KR: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingEUC_TW: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingGBK_95: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingGB_18030_2000: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingGB_2312_80: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingHZ_GB_2312: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin1: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingISOLatin10: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin2: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin3: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin4: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin5: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin6: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin7: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin8: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatin9: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatinArabic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatinCyrillic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatinGreek: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatinHebrew: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISOLatinThai: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_CN: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_CN_EXT: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_JP: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_JP_1: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_JP_2: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_JP_3: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingISO_2022_KR: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

const val kCFStringEncodingInvalidId: kotlin.UInt = 0u

val kCFStringEncodingJIS_C6226_78: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingJIS_X0201_76: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingJIS_X0208_83: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingJIS_X0208_90: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingJIS_X0212_90: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingKOI8_R: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingKOI8_U: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingKSC_5601_87: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingKSC_5601_92_Johab: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacArabic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacArmenian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacBengali: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacBurmese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacCeltic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacCentralEurRoman: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacChineseSimp: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacChineseTrad: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacCroatian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacCyrillic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacDevanagari: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacDingbats: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacEthiopic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacExtArabic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacFarsi: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacGaelic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacGeorgian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacGreek: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacGujarati: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacGurmukhi: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacHFS: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacHebrew: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacIcelandic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacInuit: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacJapanese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacKannada: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacKhmer: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacKorean: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacLaotian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacMalayalam: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacMongolian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacOriya: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacRoman: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingMacRomanLatin1: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacRomanian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacSinhalese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacSymbol: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacTamil: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacTelugu: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacThai: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacTibetan: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacTurkish: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacUkrainian: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacVT100: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingMacVietnamese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingNextStepJapanese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingNextStepLatin: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingNonLossyASCII: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingShiftJIS: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingShiftJIS_X0213: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingShiftJIS_X0213_00: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingShiftJIS_X0213_MenKuTen: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingUTF16: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUTF16BE: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUTF16LE: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUTF32: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUTF32BE: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUTF32LE: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUTF7: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingUTF7_IMAP: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingUTF8: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingUnicode: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingVISCII: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsArabic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsBalticRim: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsCyrillic: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsGreek: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsHebrew: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsKoreanJohab: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsLatin1: platform.CoreFoundation.CFStringBuiltInEncodings /* = kotlin.UInt */
    get() = TODO()

val kCFStringEncodingWindowsLatin2: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsLatin5: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringEncodingWindowsVietnamese: platform.CoreFoundation.CFStringEncodings /* = kotlin.Long */
    get() = TODO()

val kCFStringNormalizationFormC: platform.CoreFoundation.CFStringNormalizationForm /* = kotlin.Long */
    get() = TODO()

val kCFStringNormalizationFormD: platform.CoreFoundation.CFStringNormalizationForm /* = kotlin.Long */
    get() = TODO()

val kCFStringNormalizationFormKC: platform.CoreFoundation.CFStringNormalizationForm /* = kotlin.Long */
    get() = TODO()

val kCFStringNormalizationFormKD: platform.CoreFoundation.CFStringNormalizationForm /* = kotlin.Long */
    get() = TODO()

val kCFStringTokenizerAttributeLanguage: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerAttributeLatinTranscription: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenHasDerivedSubTokensMask: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenHasHasNumbersMask: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenHasNonLettersMask: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenHasSubTokensMask: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenIsCJWordMask: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenNone: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerTokenNormal: platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerUnitLineBreak: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerUnitParagraph: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerUnitSentence: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerUnitWord: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTokenizerUnitWordBoundary: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kCFStringTransformFullwidthHalfwidth: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformHiraganaKatakana: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinArabic: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinCyrillic: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinGreek: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinHangul: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinHebrew: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinHiragana: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinKatakana: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformLatinThai: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformMandarinLatin: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformStripCombiningMarks: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformStripDiacritics: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformToLatin: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformToUnicodeName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFStringTransformToXMLHex: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFTimeZoneSystemTimeZoneDidChangeNotification: platform.CoreFoundation.CFNotificationName? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLAddedToDirectoryDateKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLApplicationIsScriptableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLAttributeModificationDateKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLBookmarkCreationMinimalBookmarkMask: platform.CoreFoundation.CFURLBookmarkCreationOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkCreationPreferFileIDResolutionMask: platform.CoreFoundation.CFURLBookmarkCreationOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkCreationSecurityScopeAllowOnlyReadAccess: platform.CoreFoundation.CFURLBookmarkCreationOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkCreationSuitableForBookmarkFile: platform.CoreFoundation.CFURLBookmarkCreationOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkCreationWithSecurityScope: platform.CoreFoundation.CFURLBookmarkCreationOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkResolutionWithSecurityScope: platform.CoreFoundation.CFURLBookmarkResolutionOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkResolutionWithoutMountingMask: platform.CoreFoundation.CFURLBookmarkResolutionOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLBookmarkResolutionWithoutUIMask: platform.CoreFoundation.CFURLBookmarkResolutionOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLCanonicalPathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLComponentFragment: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentHost: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentNetLocation: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentParameterString: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentPassword: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentPath: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentPort: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentQuery: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentResourceSpecifier: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentScheme: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentUser: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLComponentUserInfo: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */
    get() = TODO()

val kCFURLContentAccessDateKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLContentModificationDateKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLCreationDateKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLCustomIconKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLDocumentIdentifierKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLEffectiveIconKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLEnumeratorDefaultBehavior: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorDescendRecursively: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorDirectoryPostOrderSuccess: platform.CoreFoundation.CFURLEnumeratorResult /* = kotlin.Long */
    get() = TODO()

val kCFURLEnumeratorEnd: platform.CoreFoundation.CFURLEnumeratorResult /* = kotlin.Long */
    get() = TODO()

val kCFURLEnumeratorError: platform.CoreFoundation.CFURLEnumeratorResult /* = kotlin.Long */
    get() = TODO()

val kCFURLEnumeratorGenerateFileReferenceURLs: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorIncludeDirectoriesPostOrder: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorIncludeDirectoriesPreOrder: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorSkipInvisibles: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorSkipPackageContents: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */
    get() = TODO()

val kCFURLEnumeratorSuccess: platform.CoreFoundation.CFURLEnumeratorResult /* = kotlin.Long */
    get() = TODO()

val kCFURLFileAllocatedSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileDirectoryContents: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileExists: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileLastModificationTime: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileLength: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileOwnerID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFilePOSIXMode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileProtectionComplete: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileProtectionCompleteUnlessOpen: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileProtectionCompleteUntilFirstUserAuthentication: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileProtectionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileProtectionNone: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceIdentifierKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeBlockSpecial: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeCharacterSpecial: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeDirectory: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeNamedPipe: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeRegular: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeSocket: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeSymbolicLink: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileResourceTypeUnknown: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileSecurityKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLFileSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLGenerationIdentifierKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLHFSPathStyle: platform.CoreFoundation.CFURLPathStyle /* = kotlin.Long */
    get() = TODO()

val kCFURLHTTPStatusCode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLHTTPStatusLine: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLHasHiddenExtensionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLImproperArgumentsError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLIsAliasFileKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsApplicationKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsDirectoryKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsExcludedFromBackupKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsExecutableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsHiddenKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsMountTriggerKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsPackageKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsReadableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsRegularFileKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsSymbolicLinkKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsSystemImmutableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsUbiquitousItemKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsUserImmutableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsVolumeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLIsWritableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLKeysOfUnsetValuesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLLabelColorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLLabelNumberKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLLinkCountKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLLocalizedLabelKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLLocalizedNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLLocalizedTypeDescriptionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLPOSIXPathStyle: platform.CoreFoundation.CFURLPathStyle /* = kotlin.Long */
    get() = TODO()

val kCFURLParentDirectoryURLKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLPathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLPreferredIOBlockSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLPropertyKeyUnavailableError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLQuarantinePropertiesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLRemoteHostUnavailableError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLResourceAccessViolationError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLResourceNotFoundError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLTagNamesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLTimeoutError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLTotalFileAllocatedSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLTotalFileSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLTypeIdentifierKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemDownloadingErrorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemDownloadingStatusCurrent: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemDownloadingStatusDownloaded: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemDownloadingStatusKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemDownloadingStatusNotDownloaded: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemHasUnresolvedConflictsKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemIsDownloadedKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemIsDownloadingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemIsUploadedKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemIsUploadingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemPercentDownloadedKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemPercentUploadedKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUbiquitousItemUploadingErrorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLUnknownError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLUnknownPropertyKeyError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLUnknownSchemeError: platform.CoreFoundation.CFURLError /* = kotlin.Long */
    get() = TODO()

val kCFURLVolumeAvailableCapacityForImportantUsageKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeAvailableCapacityForOpportunisticUsageKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeAvailableCapacityKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeCreationDateKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIdentifierKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsAutomountedKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsBrowsableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsEjectableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsEncryptedKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsInternalKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsJournalingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsLocalKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsReadOnlyKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsRemovableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeIsRootFileSystemKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeLocalizedFormatDescriptionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeLocalizedNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeMaximumFileSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeResourceCountKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsAccessPermissionsKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsAdvisoryFileLockingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsCasePreservedNamesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsCaseSensitiveNamesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsCompressionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsExclusiveRenamingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsExtendedSecurityKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsFileCloningKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsHardLinksKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsImmutableFilesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsJournalingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsPersistentIDsKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsRenamingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsRootDirectoryDatesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsSparseFilesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsSwapRenamingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsSymbolicLinksKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsVolumeSizesKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeSupportsZeroRunsKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeTotalCapacityKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeURLForRemountingKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeURLKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLVolumeUUIDStringKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCFURLWindowsPathStyle: platform.CoreFoundation.CFURLPathStyle /* = kotlin.Long */
    get() = TODO()

fun CFAbsoluteTimeAddGregorianUnits(/*0*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*2*/ units: kotlinx.cinterop.CValue<platform.CoreFoundation.CFGregorianUnits>): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFAbsoluteTimeGetCurrent(): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFAbsoluteTimeGetDayOfWeek(/*0*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFAbsoluteTimeGetDayOfYear(/*0*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFAbsoluteTimeGetDifferenceAsGregorianUnits(/*0*/ at1: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*1*/ at2: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*2*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*3*/ unitFlags: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFGregorianUnits> { TODO() }

fun CFAbsoluteTimeGetGregorianDate(/*0*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFGregorianDate> { TODO() }

fun CFAbsoluteTimeGetWeekOfYear(/*0*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFAllocatorAllocate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ size: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ hint: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFAllocatorCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFAllocatorContext>?): platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */ { TODO() }

fun CFAllocatorDeallocate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ ptr: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFAllocatorGetContext(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFAllocatorContext>?) { TODO() }

fun CFAllocatorGetDefault(): platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */ { TODO() }

fun CFAllocatorGetPreferredSizeForSize(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ size: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ hint: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFAllocatorGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFAllocatorReallocate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ ptr: kotlinx.cinterop.CValuesRef<*>?, /*2*/ newsize: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ hint: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFAllocatorSetDefault(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */) { TODO() }

fun CFArrayAppendArray(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ otherArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ otherRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFArrayAppendValue(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFArrayApplyFunction(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ applier: platform.CoreFoundation.CFArrayApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFArrayBSearchValues(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?, /*3*/ comparator: platform.CoreFoundation.CFComparatorFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFArrayContainsValue(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFArrayCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*2*/ numValues: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayCallBacks>?): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFArrayCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFArrayCreateMutable(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayCallBacks>?): platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFArrayCreateMutableCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFArrayExchangeValuesAtIndices(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ idx1: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ idx2: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFArrayGetCount(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFArrayGetCountOfValue(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFArrayGetFirstIndexOfValue(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFArrayGetLastIndexOfValue(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFArrayGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFArrayGetValueAtIndex(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFArrayGetValues(/*0*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFArrayInsertValueAtIndex(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFArrayRemoveAllValues(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */) { TODO() }

fun CFArrayRemoveValueAtIndex(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFArrayReplaceValues(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ newValues: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*3*/ newCount: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFArraySetValueAtIndex(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFArraySortValues(/*0*/ theArray: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ comparator: platform.CoreFoundation.CFComparatorFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFAttributedStringBeginEditing(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */) { TODO() }

fun CFAttributedStringCreate(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ str: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ attributes: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */ { TODO() }

fun CFAttributedStringCreateCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */): platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */ { TODO() }

fun CFAttributedStringCreateMutable(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ maxLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */ { TODO() }

fun CFAttributedStringCreateMutableCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ maxLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */): platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */ { TODO() }

fun CFAttributedStringCreateWithSubstring(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*2*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>): platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */ { TODO() }

fun CFAttributedStringEndEditing(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */) { TODO() }

fun CFAttributedStringGetAttribute(/*0*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ loc: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ attrName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ effectiveRange: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFAttributedStringGetAttributeAndLongestEffectiveRange(/*0*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ loc: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ attrName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ inRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*4*/ longestEffectiveRange: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFAttributedStringGetAttributes(/*0*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ loc: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ effectiveRange: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFAttributedStringGetAttributesAndLongestEffectiveRange(/*0*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ loc: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ inRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ longestEffectiveRange: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFAttributedStringGetLength(/*0*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFAttributedStringGetMutableString(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */): platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFAttributedStringGetString(/*0*/ aStr: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFAttributedStringGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFAttributedStringRemoveAttribute(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ attrName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFAttributedStringReplaceAttributedString(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ replacement: platform.CoreFoundation.CFAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */) { TODO() }

fun CFAttributedStringReplaceString(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ replacement: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFAttributedStringSetAttribute(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ attrName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ value: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) { TODO() }

fun CFAttributedStringSetAttributes(/*0*/ aStr: platform.CoreFoundation.CFMutableAttributedStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAttributedString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ replacement: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*3*/ clearOtherAttributes: kotlin.Boolean) { TODO() }

fun CFAutorelease(/*0*/ arg: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFBagAddValue(/*0*/ theBag: platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBagApplyFunction(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ applier: platform.CoreFoundation.CFBagApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBagContainsValue(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFBagCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*2*/ numValues: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFBagCallBacks>?): platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */ { TODO() }

fun CFBagCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */): platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */ { TODO() }

fun CFBagCreateMutable(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFBagCallBacks>?): platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */ { TODO() }

fun CFBagCreateMutableCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */): platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */ { TODO() }

fun CFBagGetCount(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBagGetCountOfValue(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBagGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFBagGetValue(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFBagGetValueIfPresent(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ candidate: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun CFBagGetValues(/*0*/ theBag: platform.CoreFoundation.CFBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFBagRemoveAllValues(/*0*/ theBag: platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */) { TODO() }

fun CFBagRemoveValue(/*0*/ theBag: platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBagReplaceValue(/*0*/ theBag: platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBagSetValue(/*0*/ theBag: platform.CoreFoundation.CFMutableBagRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBag>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBinaryHeapAddValue(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBinaryHeapApplyFunction(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */, /*1*/ applier: platform.CoreFoundation.CFBinaryHeapApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFBinaryHeapContainsValue(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFBinaryHeapCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFBinaryHeapCallBacks>?, /*3*/ compareContext: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFBinaryHeapCompareContext>?): platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */ { TODO() }

fun CFBinaryHeapCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */): platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */ { TODO() }

fun CFBinaryHeapGetCount(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBinaryHeapGetCountOfValue(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBinaryHeapGetMinimum(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFBinaryHeapGetMinimumIfPresent(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun CFBinaryHeapGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFBinaryHeapGetValues(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */, /*1*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFBinaryHeapRemoveAllValues(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */) { TODO() }

fun CFBinaryHeapRemoveMinimumValue(/*0*/ heap: platform.CoreFoundation.CFBinaryHeapRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBinaryHeap>? */) { TODO() }

fun CFBitVectorContainsBit(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFBitVectorCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ numBits: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */ { TODO() }

fun CFBitVectorCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */): platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */ { TODO() }

fun CFBitVectorCreateMutable(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */ { TODO() }

fun CFBitVectorCreateMutableCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */): platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */ { TODO() }

fun CFBitVectorFlipBitAtIndex(/*0*/ bv: platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFBitVectorFlipBits(/*0*/ bv: platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFBitVectorGetBitAtIndex(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFBit /* = kotlin.UInt */ { TODO() }

fun CFBitVectorGetBits(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?) { TODO() }

fun CFBitVectorGetCount(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBitVectorGetCountOfBit(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBitVectorGetFirstIndexOfBit(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBitVectorGetLastIndexOfBit(/*0*/ bv: platform.CoreFoundation.CFBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFBitVectorGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFBitVectorSetAllBits(/*0*/ bv: platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */) { TODO() }

fun CFBitVectorSetBitAtIndex(/*0*/ bv: platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */) { TODO() }

fun CFBitVectorSetBits(/*0*/ bv: platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ value: platform.CoreFoundation.CFBit /* = kotlin.UInt */) { TODO() }

fun CFBitVectorSetCount(/*0*/ bv: platform.CoreFoundation.CFMutableBitVectorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBitVector>? */, /*1*/ count: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFBooleanGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFBooleanGetValue(/*0*/ boolean: platform.CoreFoundation.CFBooleanRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBoolean>? */): kotlin.Boolean { TODO() }

fun CFBundleCloseBundleResourceMap(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ refNum: platform.CoreFoundation.CFBundleRefNum /* = kotlin.Int */) { TODO() }

fun CFBundleCopyAuxiliaryExecutableURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ executableName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyBuiltInPlugInsURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyBundleLocalizations(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyBundleURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyExecutableArchitectures(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyExecutableArchitecturesForURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyExecutableURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyInfoDictionaryForURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFBundleCopyInfoDictionaryInDirectory(/*0*/ bundleURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFBundleCopyLocalizationsForPreferences(/*0*/ locArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ prefArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyLocalizationsForURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyLocalizedString(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ tableName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFBundleCopyPreferredLocalizationsFromArray(/*0*/ locArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyPrivateFrameworksURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyResourceURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ resourceName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ resourceType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ subDirName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyResourceURLForLocalization(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ resourceName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ resourceType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ subDirName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*4*/ localizationName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyResourceURLInDirectory(/*0*/ bundleURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ resourceName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ resourceType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ subDirName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopyResourceURLsOfType(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ resourceType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ subDirName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyResourceURLsOfTypeForLocalization(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ resourceType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ subDirName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ localizationName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyResourceURLsOfTypeInDirectory(/*0*/ bundleURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ resourceType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ subDirName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleCopyResourcesDirectoryURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopySharedFrameworksURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopySharedSupportURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCopySupportFilesDirectoryURL(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFBundleCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bundleURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */ { TODO() }

fun CFBundleCreateBundlesFromDirectory(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ directoryURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ bundleType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleGetAllBundles(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFBundleGetBundleWithIdentifier(/*0*/ bundleID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */ { TODO() }

fun CFBundleGetDataPointerForName(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ symbolName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFBundleGetDataPointersForNames(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ symbolNames: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ stbl: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFBundleGetDevelopmentRegion(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFBundleGetFunctionPointerForName(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ functionName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFBundleGetFunctionPointersForNames(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ functionNames: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ ftbl: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFBundleGetIdentifier(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFBundleGetInfoDictionary(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFBundleGetLocalInfoDictionary(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFBundleGetMainBundle(): platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */ { TODO() }

fun CFBundleGetPackageInfo(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ packageType: kotlinx.cinterop.CValuesRef<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?, /*2*/ packageCreator: kotlinx.cinterop.CValuesRef<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?) { TODO() }

fun CFBundleGetPackageInfoInDirectory(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ packageType: kotlinx.cinterop.CValuesRef<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?, /*2*/ packageCreator: kotlinx.cinterop.CValuesRef<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?): kotlin.Boolean { TODO() }

fun CFBundleGetPlugIn(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */ { TODO() }

fun CFBundleGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFBundleGetValueForInfoDictionaryKey(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFBundleGetVersionNumber(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.darwin.UInt32 /* = kotlin.UInt */ { TODO() }

fun CFBundleIsExecutableLoaded(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): kotlin.Boolean { TODO() }

fun CFBundleLoadExecutable(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): kotlin.Boolean { TODO() }

fun CFBundleLoadExecutableAndReturnError(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFBundleOpenBundleResourceFiles(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ refNum: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFBundleRefNumVar /* = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.CFBundleRefNum /* = kotlin.Int */> */>?, /*2*/ localizedRefNum: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFBundleRefNumVar /* = kotlinx.cinterop.IntVarOf<platform.CoreFoundation.CFBundleRefNum /* = kotlin.Int */> */>?): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFBundleOpenBundleResourceMap(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFBundleRefNum /* = kotlin.Int */ { TODO() }

fun CFBundlePreflightExecutable(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFBundleUnloadExecutable(/*0*/ bundle: platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */) { TODO() }

fun CFByteOrderGetCurrent(): platform.CoreFoundation.CFByteOrder /* = kotlin.Long */ { TODO() }

fun CFCalendarCopyCurrent(): platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */ { TODO() }

fun CFCalendarCopyLocale(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFCalendarCopyTimeZone(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */): platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */ { TODO() }

fun CFCalendarCreateWithIdentifier(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ identifier: platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */ { TODO() }

fun CFCalendarGetFirstWeekday(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFCalendarGetIdentifier(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */): platform.CoreFoundation.CFCalendarIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFCalendarGetMaximumRangeOfUnit(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ unit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFCalendarGetMinimumDaysInFirstWeek(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFCalendarGetMinimumRangeOfUnit(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ unit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFCalendarGetOrdinalityOfUnit(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ smallerUnit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */, /*2*/ biggerUnit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */, /*3*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFCalendarGetRangeOfUnit(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ smallerUnit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */, /*2*/ biggerUnit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */, /*3*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFCalendarGetTimeRangeOfUnit(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ unit: platform.CoreFoundation.CFCalendarUnit /* = kotlin.ULong */, /*2*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*3*/ startp: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFAbsoluteTimeVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */> */>?, /*4*/ tip: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTimeIntervalVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */> */>?): kotlin.Boolean { TODO() }

fun CFCalendarGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFCalendarSetFirstWeekday(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ wkdy: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFCalendarSetLocale(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */) { TODO() }

fun CFCalendarSetMinimumDaysInFirstWeek(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ mwd: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFCalendarSetTimeZone(/*0*/ calendar: platform.CoreFoundation.CFCalendarRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCalendar>? */, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */) { TODO() }

fun CFCharacterSetAddCharactersInRange(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFCharacterSetAddCharactersInString(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFCharacterSetCreateBitmapRepresentation(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFCharacterSetCreateCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */): platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetCreateInvertedSet(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */): platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetCreateMutable(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetCreateMutableCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */): platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetCreateWithBitmapRepresentation(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetCreateWithCharactersInRange(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>): platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetCreateWithCharactersInString(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetGetPredefined(/*0*/ theSetIdentifier: platform.CoreFoundation.CFCharacterSetPredefinedSet /* = kotlin.Long */): platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */ { TODO() }

fun CFCharacterSetGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFCharacterSetHasMemberInPlane(/*0*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ thePlane: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlin.Boolean { TODO() }

fun CFCharacterSetIntersect(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theOtherSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */) { TODO() }

fun CFCharacterSetInvert(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */) { TODO() }

fun CFCharacterSetIsCharacterMember(/*0*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theChar: platform.darwin.UniChar /* = kotlin.UShort */): kotlin.Boolean { TODO() }

fun CFCharacterSetIsLongCharacterMember(/*0*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theChar: platform.darwin.UTF32Char /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFCharacterSetIsSupersetOfSet(/*0*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theOtherset: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */): kotlin.Boolean { TODO() }

fun CFCharacterSetRemoveCharactersInRange(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFCharacterSetRemoveCharactersInString(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFCharacterSetUnion(/*0*/ theSet: platform.CoreFoundation.CFMutableCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*1*/ theOtherSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */) { TODO() }

fun CFConvertFloat32HostToSwapped(/*0*/ arg: platform.darwin.Float32 /* = kotlin.Float */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat32> { TODO() }

fun CFConvertFloat32SwappedToHost(/*0*/ arg: kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat32>): platform.darwin.Float32 /* = kotlin.Float */ { TODO() }

fun CFConvertFloat64HostToSwapped(/*0*/ arg: platform.darwin.Float64 /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat64> { TODO() }

fun CFConvertFloat64SwappedToHost(/*0*/ arg: kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat64>): platform.darwin.Float64 /* = kotlin.Double */ { TODO() }

fun CFCopyDescription(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFCopyHomeDirectoryURL(): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFCopyTypeIDDescription(/*0*/ type_id: platform.CoreFoundation.CFTypeID /* = kotlin.ULong */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFDataAppendBytes(/*0*/ theData: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFDataCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFDataCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFDataCreateMutable(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFDataCreateMutableCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFDataCreateWithBytesNoCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ bytesDeallocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFDataDeleteBytes(/*0*/ theData: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFDataFind(/*0*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ dataToFind: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ searchRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ compareOptions: platform.CoreFoundation.CFDataSearchFlags /* = kotlin.ULong */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFDataGetBytePtr(/*0*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): kotlinx.cinterop.CPointer<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>? { TODO() }

fun CFDataGetBytes(/*0*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?) { TODO() }

fun CFDataGetLength(/*0*/ theData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFDataGetMutableBytePtr(/*0*/ theData: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): kotlinx.cinterop.CPointer<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>? { TODO() }

fun CFDataGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFDataIncreaseLength(/*0*/ theData: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ extraLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFDataReplaceBytes(/*0*/ theData: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ newBytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*3*/ newLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFDataSetLength(/*0*/ theData: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFDateCompare(/*0*/ theDate: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */, /*1*/ otherDate: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */ { TODO() }

fun CFDateCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */ { TODO() }

fun CFDateFormatterCopyProperty(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*1*/ key: platform.CoreFoundation.CFDateFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFDateFormatterCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */, /*2*/ dateStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */, /*3*/ timeStyle: platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */): platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */ { TODO() }

fun CFDateFormatterCreateDateFormatFromTemplate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ tmplate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*3*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFDateFormatterCreateDateFromString(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*2*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ rangep: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */ { TODO() }

fun CFDateFormatterCreateISO8601Formatter(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatOptions: platform.CoreFoundation.CFISO8601DateFormatOptions /* = kotlin.ULong */): platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */ { TODO() }

fun CFDateFormatterCreateStringWithAbsoluteTime(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*2*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFDateFormatterCreateStringWithDate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*2*/ date: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFDateFormatterGetAbsoluteTimeFromString(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*1*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rangep: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?, /*3*/ atp: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFAbsoluteTimeVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */> */>?): kotlin.Boolean { TODO() }

fun CFDateFormatterGetDateStyle(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */): platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */ { TODO() }

fun CFDateFormatterGetFormat(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFDateFormatterGetLocale(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFDateFormatterGetTimeStyle(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */): platform.CoreFoundation.CFDateFormatterStyle /* = kotlin.Long */ { TODO() }

fun CFDateFormatterGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFDateFormatterSetFormat(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*1*/ formatString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFDateFormatterSetProperty(/*0*/ formatter: platform.CoreFoundation.CFDateFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDateFormatter>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ value: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) { TODO() }

fun CFDateGetAbsoluteTime(/*0*/ theDate: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFDateGetTimeIntervalSinceDate(/*0*/ theDate: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */, /*1*/ otherDate: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CFDateGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFDictionaryAddValue(/*0*/ theDict: platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFDictionaryApplyFunction(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ applier: platform.CoreFoundation.CFDictionaryApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFDictionaryContainsKey(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFDictionaryContainsValue(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFDictionaryCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ keys: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*2*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*3*/ numValues: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*4*/ keyCallBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDictionaryKeyCallBacks>?, /*5*/ valueCallBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDictionaryValueCallBacks>?): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFDictionaryCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFDictionaryCreateMutable(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ keyCallBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDictionaryKeyCallBacks>?, /*3*/ valueCallBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDictionaryValueCallBacks>?): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFDictionaryCreateMutableCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFDictionaryGetCount(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFDictionaryGetCountOfKey(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFDictionaryGetCountOfValue(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFDictionaryGetKeysAndValues(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ keys: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*2*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFDictionaryGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFDictionaryGetValue(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFDictionaryGetValueIfPresent(/*0*/ theDict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun CFDictionaryRemoveAllValues(/*0*/ theDict: platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) { TODO() }

fun CFDictionaryRemoveValue(/*0*/ theDict: platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFDictionaryReplaceValue(/*0*/ theDict: platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFDictionarySetValue(/*0*/ theDict: platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFEqual(/*0*/ cf1: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*1*/ cf2: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Boolean { TODO() }

fun CFErrorCopyDescription(/*0*/ err: platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFErrorCopyFailureReason(/*0*/ err: platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFErrorCopyRecoverySuggestion(/*0*/ err: platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFErrorCopyUserInfo(/*0*/ err: platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFErrorCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ domain: platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ code: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ userInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */ { TODO() }

fun CFErrorCreateWithUserInfoKeysAndValues(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ domain: platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ code: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ userInfoKeys: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*4*/ userInfoValues: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*5*/ numUserInfoValues: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */ { TODO() }

fun CFErrorGetCode(/*0*/ err: platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFErrorGetDomain(/*0*/ err: platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */): platform.CoreFoundation.CFErrorDomain? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFErrorGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFFileDescriptorCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fd: platform.CoreFoundation.CFFileDescriptorNativeDescriptor /* = kotlin.Int */, /*2*/ closeOnInvalidate: kotlin.Boolean, /*3*/ callout: platform.CoreFoundation.CFFileDescriptorCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */, platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFFileDescriptorContext>?): platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */ { TODO() }

fun CFFileDescriptorCreateRunLoopSource(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */, /*2*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun CFFileDescriptorDisableCallBacks(/*0*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */, /*1*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */) { TODO() }

fun CFFileDescriptorEnableCallBacks(/*0*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */, /*1*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */) { TODO() }

fun CFFileDescriptorGetContext(/*0*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFFileDescriptorContext>?) { TODO() }

fun CFFileDescriptorGetNativeDescriptor(/*0*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */): platform.CoreFoundation.CFFileDescriptorNativeDescriptor /* = kotlin.Int */ { TODO() }

fun CFFileDescriptorGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFFileDescriptorInvalidate(/*0*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */) { TODO() }

fun CFFileDescriptorIsValid(/*0*/ f: platform.CoreFoundation.CFFileDescriptorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileDescriptor>? */): kotlin.Boolean { TODO() }

fun CFFileSecurityClearProperties(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ clearPropertyMask: platform.CoreFoundation.CFFileSecurityClearOptions /* = kotlin.ULong */): kotlin.Boolean { TODO() }

fun CFFileSecurityCopyAccessControlList(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ accessControlList: kotlinx.cinterop.CValuesRef<platform.posix.acl_tVar /* = kotlinx.cinterop.CPointerVarOf<platform.posix.acl_t /* = kotlinx.cinterop.CPointer<cnames.structs._acl> */> */>?): kotlin.Boolean { TODO() }

fun CFFileSecurityCopyGroupUUID(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ groupUUID: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFUUIDRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFUUIDRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID> */> */>?): kotlin.Boolean { TODO() }

fun CFFileSecurityCopyOwnerUUID(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ ownerUUID: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFUUIDRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFUUIDRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID> */> */>?): kotlin.Boolean { TODO() }

fun CFFileSecurityCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */ { TODO() }

fun CFFileSecurityCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */): platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */ { TODO() }

fun CFFileSecurityGetGroup(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ group: kotlinx.cinterop.CValuesRef<platform.posix.gid_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.gid_t /* = kotlin.UInt */> */>?): kotlin.Boolean { TODO() }

fun CFFileSecurityGetMode(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ mode: kotlinx.cinterop.CValuesRef<platform.posix.mode_tVar /* = kotlinx.cinterop.UShortVarOf<platform.posix.mode_t /* = kotlin.UShort */> */>?): kotlin.Boolean { TODO() }

fun CFFileSecurityGetOwner(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ owner: kotlinx.cinterop.CValuesRef<platform.posix.uid_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uid_t /* = kotlin.UInt */> */>?): kotlin.Boolean { TODO() }

fun CFFileSecurityGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFFileSecuritySetAccessControlList(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ accessControlList: platform.posix.acl_t? /* = kotlinx.cinterop.CPointer<cnames.structs._acl>? */): kotlin.Boolean { TODO() }

fun CFFileSecuritySetGroup(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ group: platform.posix.gid_t /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFFileSecuritySetGroupUUID(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ groupUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlin.Boolean { TODO() }

fun CFFileSecuritySetMode(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ mode: platform.posix.mode_t /* = kotlin.UShort */): kotlin.Boolean { TODO() }

fun CFFileSecuritySetOwner(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ owner: platform.posix.uid_t /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFFileSecuritySetOwnerUUID(/*0*/ fileSec: platform.CoreFoundation.CFFileSecurityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFFileSecurity>? */, /*1*/ ownerUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlin.Boolean { TODO() }

fun CFGetAllocator(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */ { TODO() }

fun CFGetRetainCount(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFGetTypeID(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFGregorianDateGetAbsoluteTime(/*0*/ gdate: kotlinx.cinterop.CValue<platform.CoreFoundation.CFGregorianDate>, /*1*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFGregorianDateIsValid(/*0*/ gdate: kotlinx.cinterop.CValue<platform.CoreFoundation.CFGregorianDate>, /*1*/ unitFlags: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): kotlin.Boolean { TODO() }

fun CFHash(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFHashCode /* = kotlin.ULong */ { TODO() }

fun CFLocaleCopyAvailableLocaleIdentifiers(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFLocaleCopyCommonISOCurrencyCodes(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFLocaleCopyCurrent(): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFLocaleCopyDisplayNameForPropertyValue(/*0*/ displayLocale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */, /*1*/ key: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ value: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleCopyISOCountryCodes(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFLocaleCopyISOCurrencyCodes(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFLocaleCopyISOLanguageCodes(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFLocaleCopyPreferredLanguages(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFLocaleCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ localeIdentifier: platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFLocaleCreateCanonicalLanguageIdentifierFromString(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ localeIdentifier: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ lcode: platform.darwin.LangCode /* = kotlin.Short */, /*2*/ rcode: platform.darwin.RegionCode /* = kotlin.Short */): platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleCreateCanonicalLocaleIdentifierFromString(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ localeIdentifier: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleCreateComponentsFromLocaleIdentifier(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ localeID: platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFLocaleCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFLocaleCreateLocaleIdentifierFromComponents(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ dictionary: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ lcid: platform.posix.uint32_t /* = kotlin.UInt */): platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleGetIdentifier(/*0*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFLocaleGetLanguageCharacterDirection(/*0*/ isoLangCode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */ { TODO() }

fun CFLocaleGetLanguageLineDirection(/*0*/ isoLangCode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFLocaleLanguageDirection /* = kotlin.Long */ { TODO() }

fun CFLocaleGetSystem(): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFLocaleGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFLocaleGetValue(/*0*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */, /*1*/ key: platform.CoreFoundation.CFLocaleKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier(/*0*/ localeIdentifier: platform.CoreFoundation.CFLocaleIdentifier? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CFMachPortCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ callout: platform.CoreFoundation.CFMachPortCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFIndex /* = kotlin.Long */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFMachPortContext>?, /*3*/ shouldFreeInfo: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun CFMachPortCreateRunLoopSource(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, /*2*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun CFMachPortCreateWithPort(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ portNum: platform.darwin.mach_port_t /* = kotlin.UInt */, /*2*/ callout: platform.CoreFoundation.CFMachPortCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFIndex /* = kotlin.Long */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFMachPortContext>?, /*4*/ shouldFreeInfo: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun CFMachPortGetContext(/*0*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFMachPortContext>?) { TODO() }

fun CFMachPortGetInvalidationCallBack(/*0*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */): platform.CoreFoundation.CFMachPortInvalidationCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */ { TODO() }

fun CFMachPortGetPort(/*0*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */): platform.darwin.mach_port_t /* = kotlin.UInt */ { TODO() }

fun CFMachPortGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFMachPortInvalidate(/*0*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */) { TODO() }

fun CFMachPortIsValid(/*0*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */): kotlin.Boolean { TODO() }

fun CFMachPortSetInvalidationCallBack(/*0*/ port: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, /*1*/ callout: platform.CoreFoundation.CFMachPortInvalidationCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) { TODO() }

fun CFMessagePortCreateLocal(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ callout: platform.CoreFoundation.CFMessagePortCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, platform.darwin.SInt32 /* = kotlin.Int */, platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFMessagePortContext>?, /*4*/ shouldFreeInfo: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */ { TODO() }

fun CFMessagePortCreateRemote(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */ { TODO() }

fun CFMessagePortCreateRunLoopSource(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ local: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, /*2*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun CFMessagePortGetContext(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFMessagePortContext>?) { TODO() }

fun CFMessagePortGetInvalidationCallBack(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */): platform.CoreFoundation.CFMessagePortInvalidationCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */ { TODO() }

fun CFMessagePortGetName(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFMessagePortGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFMessagePortInvalidate(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */) { TODO() }

fun CFMessagePortIsRemote(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */): kotlin.Boolean { TODO() }

fun CFMessagePortIsValid(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */): kotlin.Boolean { TODO() }

fun CFMessagePortSendRequest(/*0*/ remote: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, /*1*/ msgid: platform.darwin.SInt32 /* = kotlin.Int */, /*2*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*3*/ sendTimeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*4*/ rcvTimeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*5*/ replyMode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*6*/ returnData: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDataRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDataRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData> */> */>?): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFMessagePortSetDispatchQueue(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, /*1*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun CFMessagePortSetInvalidationCallBack(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, /*1*/ callout: platform.CoreFoundation.CFMessagePortInvalidationCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) { TODO() }

fun CFMessagePortSetName(/*0*/ ms: platform.CoreFoundation.CFMessagePortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMessagePort>? */, /*1*/ newName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFNotificationCenterAddObserver(/*0*/ center: platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */, /*1*/ observer: kotlinx.cinterop.CValuesRef<*>?, /*2*/ callBack: platform.CoreFoundation.CFNotificationCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFNotificationName? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) -> kotlin.Unit>>? */, /*3*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*4*/ `object`: kotlinx.cinterop.CValuesRef<*>?, /*5*/ suspensionBehavior: platform.CoreFoundation.CFNotificationSuspensionBehavior /* = kotlin.Long */) { TODO() }

fun CFNotificationCenterGetDarwinNotifyCenter(): platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */ { TODO() }

fun CFNotificationCenterGetLocalCenter(): platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */ { TODO() }

fun CFNotificationCenterGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFNotificationCenterPostNotification(/*0*/ center: platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */, /*1*/ name: platform.CoreFoundation.CFNotificationName? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ `object`: kotlinx.cinterop.CValuesRef<*>?, /*3*/ userInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*4*/ deliverImmediately: kotlin.Boolean) { TODO() }

fun CFNotificationCenterPostNotificationWithOptions(/*0*/ center: platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */, /*1*/ name: platform.CoreFoundation.CFNotificationName? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ `object`: kotlinx.cinterop.CValuesRef<*>?, /*3*/ userInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*4*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */) { TODO() }

fun CFNotificationCenterRemoveEveryObserver(/*0*/ center: platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */, /*1*/ observer: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFNotificationCenterRemoveObserver(/*0*/ center: platform.CoreFoundation.CFNotificationCenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNotificationCenter>? */, /*1*/ observer: kotlinx.cinterop.CValuesRef<*>?, /*2*/ name: platform.CoreFoundation.CFNotificationName? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ `object`: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFNullGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFNumberCompare(/*0*/ number: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */, /*1*/ otherNumber: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */ { TODO() }

fun CFNumberCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */, /*2*/ valuePtr: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */ { TODO() }

fun CFNumberFormatterCopyProperty(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*1*/ key: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFNumberFormatterCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */, /*2*/ style: platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */): platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */ { TODO() }

fun CFNumberFormatterCreateNumberFromString(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*2*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ rangep: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?, /*4*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */ { TODO() }

fun CFNumberFormatterCreateStringWithNumber(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*2*/ number: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFNumberFormatterCreateStringWithValue(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*2*/ numberType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */, /*3*/ valuePtr: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFNumberFormatterGetDecimalInfoForCurrencyCode(/*0*/ currencyCode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ defaultFractionDigits: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?, /*2*/ roundingIncrement: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVar /* = kotlinx.cinterop.DoubleVarOf<kotlin.Double> */>?): kotlin.Boolean { TODO() }

fun CFNumberFormatterGetFormat(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFNumberFormatterGetLocale(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */): platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */ { TODO() }

fun CFNumberFormatterGetStyle(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */): platform.CoreFoundation.CFNumberFormatterStyle /* = kotlin.Long */ { TODO() }

fun CFNumberFormatterGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFNumberFormatterGetValueFromString(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*1*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rangep: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?, /*3*/ numberType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */, /*4*/ valuePtr: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFNumberFormatterSetFormat(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*1*/ formatString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFNumberFormatterSetProperty(/*0*/ formatter: platform.CoreFoundation.CFNumberFormatterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumberFormatter>? */, /*1*/ key: platform.CoreFoundation.CFNumberFormatterKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ value: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) { TODO() }

fun CFNumberGetByteSize(/*0*/ number: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFNumberGetType(/*0*/ number: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */): platform.CoreFoundation.CFNumberType /* = kotlin.Long */ { TODO() }

fun CFNumberGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFNumberGetValue(/*0*/ number: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */, /*1*/ theType: platform.CoreFoundation.CFNumberType /* = kotlin.Long */, /*2*/ valuePtr: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFNumberIsFloatType(/*0*/ number: platform.CoreFoundation.CFNumberRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFNumber>? */): kotlin.Boolean { TODO() }

fun CFPlugInAddInstanceForFactory(/*0*/ factoryID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */) { TODO() }

fun CFPlugInCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ plugInURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */ { TODO() }

fun CFPlugInFindFactoriesForPlugInType(/*0*/ typeUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFPlugInFindFactoriesForPlugInTypeInPlugIn(/*0*/ typeUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */, /*1*/ plugIn: platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFPlugInGetBundle(/*0*/ plugIn: platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): platform.CoreFoundation.CFBundleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */ { TODO() }

fun CFPlugInGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFPlugInInstanceCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ factoryUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */, /*2*/ typeUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPlugInInstanceCreateWithInstanceDataSize(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ instanceDataSize: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ deallocateInstanceFunction: platform.CoreFoundation.CFPlugInInstanceDeallocateInstanceDataFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ factoryName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*4*/ getInterfaceFunction: platform.CoreFoundation.CFPlugInInstanceGetInterfaceFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFPlugInInstanceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFPlugInInstance>? */, platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, kotlinx.cinterop.CPointer<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) -> kotlin.Boolean>>? */): platform.CoreFoundation.CFPlugInInstanceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFPlugInInstance>? */ { TODO() }

fun CFPlugInInstanceGetFactoryName(/*0*/ instance: platform.CoreFoundation.CFPlugInInstanceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFPlugInInstance>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFPlugInInstanceGetInstanceData(/*0*/ instance: platform.CoreFoundation.CFPlugInInstanceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFPlugInInstance>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPlugInInstanceGetInterfaceFunctionTable(/*0*/ instance: platform.CoreFoundation.CFPlugInInstanceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFPlugInInstance>? */, /*1*/ interfaceName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ ftbl: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun CFPlugInInstanceGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFPlugInIsLoadOnDemand(/*0*/ plugIn: platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */): kotlin.Boolean { TODO() }

fun CFPlugInRegisterFactoryFunction(/*0*/ factoryUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */, /*1*/ func: platform.CoreFoundation.CFPlugInFactoryFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */): kotlin.Boolean { TODO() }

fun CFPlugInRegisterFactoryFunctionByName(/*0*/ factoryUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */, /*1*/ plugIn: platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*2*/ functionName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFPlugInRegisterPlugInType(/*0*/ factoryUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */, /*1*/ typeUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlin.Boolean { TODO() }

fun CFPlugInRemoveInstanceForFactory(/*0*/ factoryID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */) { TODO() }

fun CFPlugInSetLoadOnDemand(/*0*/ plugIn: platform.CoreFoundation.CFPlugInRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFBundle>? */, /*1*/ flag: kotlin.Boolean) { TODO() }

fun CFPlugInUnregisterFactory(/*0*/ factoryUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlin.Boolean { TODO() }

fun CFPlugInUnregisterPlugInType(/*0*/ factoryUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */, /*1*/ typeUUID: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlin.Boolean { TODO() }

fun CFPreferencesAddSuitePreferencesToApp(/*0*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ suiteID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFPreferencesAppSynchronize(/*0*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFPreferencesAppValueIsForced(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFPreferencesCopyAppValue(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPreferencesCopyApplicationList(/*0*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFPreferencesCopyKeyList(/*0*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFPreferencesCopyMultiple(/*0*/ keysToFetch: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*1*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFPreferencesCopyValue(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPreferencesGetAppBooleanValue(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ keyExistsAndHasValidFormat: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): kotlin.Boolean { TODO() }

fun CFPreferencesGetAppIntegerValue(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ keyExistsAndHasValidFormat: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFPreferencesRemoveSuitePreferencesFromApp(/*0*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ suiteID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFPreferencesSetAppValue(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ value: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFPreferencesSetMultiple(/*0*/ keysToSet: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ keysToRemove: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*4*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFPreferencesSetValue(/*0*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ value: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*4*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFPreferencesSynchronize(/*0*/ applicationID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ userName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ hostName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFPropertyListCreateData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ propertyList: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ format: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */, /*3*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFPropertyListCreateDeepCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ propertyList: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ mutabilityOption: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPropertyListCreateFromStream(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*2*/ streamLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ mutabilityOption: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ format: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFPropertyListFormatVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */> */>?, /*5*/ errorString: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString> */> */>?): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPropertyListCreateFromXMLData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ xmlData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ mutabilityOption: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*3*/ errorString: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString> */> */>?): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPropertyListCreateWithData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*3*/ format: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFPropertyListFormatVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */> */>?, /*4*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPropertyListCreateWithStream(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*2*/ streamLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ format: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFPropertyListFormatVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */> */>?, /*5*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFPropertyListCreateXMLData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ propertyList: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFPropertyListIsValid(/*0*/ plist: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*1*/ format: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */): kotlin.Boolean { TODO() }

fun CFPropertyListWrite(/*0*/ propertyList: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*1*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*2*/ format: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */, /*3*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFPropertyListWriteToStream(/*0*/ propertyList: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*1*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*2*/ format: platform.CoreFoundation.CFPropertyListFormat /* = kotlin.Long */, /*3*/ errorString: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString> */> */>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFRangeMake(/*0*/ loc: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*1*/ len: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFReadStreamClose(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */) { TODO() }

fun CFReadStreamCopyDispatchQueue(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */): platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */ { TODO() }

fun CFReadStreamCopyError(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */): platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */ { TODO() }

fun CFReadStreamCopyProperty(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ propertyName: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFReadStreamCreateWithBytesNoCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ bytesDeallocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */ { TODO() }

fun CFReadStreamCreateWithFile(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fileURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */ { TODO() }

fun CFReadStreamGetBuffer(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ maxBytesToRead: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ numBytesRead: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?): kotlinx.cinterop.CPointer<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>? { TODO() }

fun CFReadStreamGetError(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFStreamError> { TODO() }

fun CFReadStreamGetStatus(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */): platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */ { TODO() }

fun CFReadStreamGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFReadStreamHasBytesAvailable(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */): kotlin.Boolean { TODO() }

fun CFReadStreamOpen(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */): kotlin.Boolean { TODO() }

fun CFReadStreamRead(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ bufferLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFReadStreamScheduleWithRunLoop(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFReadStreamSetClient(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ streamEvents: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*2*/ clientCB: platform.CoreFoundation.CFReadStreamClientCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ clientContext: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStreamClientContext>?): kotlin.Boolean { TODO() }

fun CFReadStreamSetDispatchQueue(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ q: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun CFReadStreamSetProperty(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ propertyName: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ propertyValue: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Boolean { TODO() }

fun CFReadStreamUnscheduleFromRunLoop(/*0*/ stream: platform.CoreFoundation.CFReadStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRelease(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) { TODO() }

fun CFRetain(/*0*/ cf: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFRunLoopAddCommonMode(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopAddObserver(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopAddSource(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopAddTimer(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopContainsObserver(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFRunLoopContainsSource(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFRunLoopContainsTimer(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFRunLoopCopyAllModes(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFRunLoopCopyCurrentMode(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */): platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFRunLoopGetCurrent(): platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */ { TODO() }

fun CFRunLoopGetMain(): platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */ { TODO() }

fun CFRunLoopGetNextTimerFireDate(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFRunLoopGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFRunLoopIsWaiting(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */): kotlin.Boolean { TODO() }

fun CFRunLoopObserverCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ activities: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*2*/ repeats: kotlin.Boolean, /*3*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*4*/ callout: platform.CoreFoundation.CFRunLoopObserverCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */, platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*5*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRunLoopObserverContext>?): platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */ { TODO() }

fun CFRunLoopObserverCreateWithHandler(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ activities: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*2*/ repeats: kotlin.Boolean, /*3*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*4*/ block: ((platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */, platform.CoreFoundation.CFRunLoopActivity /* = kotlin.ULong */) -> kotlin.Unit)?): platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */ { TODO() }

fun CFRunLoopObserverDoesRepeat(/*0*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */): kotlin.Boolean { TODO() }

fun CFRunLoopObserverGetActivities(/*0*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */): platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */ { TODO() }

fun CFRunLoopObserverGetContext(/*0*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRunLoopObserverContext>?) { TODO() }

fun CFRunLoopObserverGetOrder(/*0*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFRunLoopObserverGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFRunLoopObserverInvalidate(/*0*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */) { TODO() }

fun CFRunLoopObserverIsValid(/*0*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */): kotlin.Boolean { TODO() }

fun CFRunLoopPerformBlock(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ mode: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ block: (() -> kotlin.Unit)?) { TODO() }

fun CFRunLoopRemoveObserver(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ observer: platform.CoreFoundation.CFRunLoopObserverRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopObserver>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopRemoveSource(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopRemoveTimer(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*1*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, /*2*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFRunLoopRunInMode(/*0*/ mode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ seconds: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*2*/ returnAfterSourceHandled: kotlin.Boolean): platform.CoreFoundation.CFRunLoopRunResult /* = kotlin.Int */ { TODO() }

fun CFRunLoopSourceCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRunLoopSourceContext>?): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun CFRunLoopSourceGetContext(/*0*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRunLoopSourceContext>?) { TODO() }

fun CFRunLoopSourceGetOrder(/*0*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFRunLoopSourceGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFRunLoopSourceInvalidate(/*0*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */) { TODO() }

fun CFRunLoopSourceIsValid(/*0*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */): kotlin.Boolean { TODO() }

fun CFRunLoopSourceSignal(/*0*/ source: platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */) { TODO() }

fun CFRunLoopStop(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */) { TODO() }

fun CFRunLoopTimerCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fireDate: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*2*/ interval: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*3*/ flags: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*5*/ callout: platform.CoreFoundation.CFRunLoopTimerCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*6*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRunLoopTimerContext>?): platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */ { TODO() }

fun CFRunLoopTimerCreateWithHandler(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fireDate: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */, /*2*/ interval: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*3*/ flags: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*5*/ block: ((platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */) -> kotlin.Unit)?): platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */ { TODO() }

fun CFRunLoopTimerDoesRepeat(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */): kotlin.Boolean { TODO() }

fun CFRunLoopTimerGetContext(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRunLoopTimerContext>?) { TODO() }

fun CFRunLoopTimerGetInterval(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CFRunLoopTimerGetNextFireDate(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFRunLoopTimerGetOrder(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFRunLoopTimerGetTolerance(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CFRunLoopTimerGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFRunLoopTimerInvalidate(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */) { TODO() }

fun CFRunLoopTimerIsValid(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */): kotlin.Boolean { TODO() }

fun CFRunLoopTimerSetNextFireDate(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, /*1*/ fireDate: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */) { TODO() }

fun CFRunLoopTimerSetTolerance(/*0*/ timer: platform.CoreFoundation.CFRunLoopTimerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopTimer>? */, /*1*/ tolerance: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */) { TODO() }

fun CFRunLoopWakeUp(/*0*/ rl: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */) { TODO() }

fun CFSetAddValue(/*0*/ theSet: platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFSetApplyFunction(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ applier: platform.CoreFoundation.CFSetApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFSetContainsValue(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CFSetCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*2*/ numValues: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSetCallBacks>?): platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */ { TODO() }

fun CFSetCreateCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */): platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */ { TODO() }

fun CFSetCreateMutable(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ callBacks: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSetCallBacks>?): platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */ { TODO() }

fun CFSetCreateMutableCopy(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */): platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */ { TODO() }

fun CFSetGetCount(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFSetGetCountOfValue(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFSetGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFSetGetValue(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFSetGetValueIfPresent(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ candidate: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun CFSetGetValues(/*0*/ theSet: platform.CoreFoundation.CFSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?) { TODO() }

fun CFSetRemoveAllValues(/*0*/ theSet: platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */) { TODO() }

fun CFSetRemoveValue(/*0*/ theSet: platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFSetReplaceValue(/*0*/ theSet: platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFSetSetValue(/*0*/ theSet: platform.CoreFoundation.CFMutableSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSet>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFShow(/*0*/ obj: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) { TODO() }

fun CFShowStr(/*0*/ str: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFSocketConnectToAddress(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ address: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketCopyAddress(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFSocketCopyPeerAddress(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFSocketCopyRegisteredSocketSignature(/*0*/ nameServerSignature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*1*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*2*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ signature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*4*/ nameServerAddress: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDataRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDataRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData> */> */>?): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketCopyRegisteredValue(/*0*/ nameServerSignature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*1*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*2*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ value: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFPropertyListRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFPropertyListRef /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*4*/ nameServerAddress: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDataRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDataRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData> */> */>?): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ protocolFamily: platform.darwin.SInt32 /* = kotlin.Int */, /*2*/ socketType: platform.darwin.SInt32 /* = kotlin.Int */, /*3*/ protocol: platform.darwin.SInt32 /* = kotlin.Int */, /*4*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*5*/ callout: platform.CoreFoundation.CFSocketCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */, platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*6*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketContext>?): platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */ { TODO() }

fun CFSocketCreateConnectedToSocketSignature(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ signature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*2*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*3*/ callout: platform.CoreFoundation.CFSocketCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */, platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketContext>?, /*5*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */): platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */ { TODO() }

fun CFSocketCreateRunLoopSource(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*2*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun CFSocketCreateWithNative(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ sock: platform.CoreFoundation.CFSocketNativeHandle /* = kotlin.Int */, /*2*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*3*/ callout: platform.CoreFoundation.CFSocketCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */, platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketContext>?): platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */ { TODO() }

fun CFSocketCreateWithSocketSignature(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ signature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*2*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*3*/ callout: platform.CoreFoundation.CFSocketCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, platform.CoreFoundation.CFSocketCallBackType /* = kotlin.ULong */, platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketContext>?): platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */ { TODO() }

fun CFSocketDisableCallBacks(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */) { TODO() }

fun CFSocketEnableCallBacks(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ callBackTypes: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */) { TODO() }

fun CFSocketGetContext(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketContext>?) { TODO() }

fun CFSocketGetDefaultNameRegistryPortNumber(): platform.darwin.UInt16 /* = kotlin.UShort */ { TODO() }

fun CFSocketGetNative(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */): platform.CoreFoundation.CFSocketNativeHandle /* = kotlin.Int */ { TODO() }

fun CFSocketGetSocketFlags(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */): platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */ { TODO() }

fun CFSocketGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFSocketInvalidate(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */) { TODO() }

fun CFSocketIsValid(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */): kotlin.Boolean { TODO() }

fun CFSocketRegisterSocketSignature(/*0*/ nameServerSignature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*1*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*2*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ signature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketRegisterValue(/*0*/ nameServerSignature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*1*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*2*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ value: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketSendData(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ address: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*3*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketSetAddress(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ address: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFSocketSetDefaultNameRegistryPortNumber(/*0*/ port: platform.darwin.UInt16 /* = kotlin.UShort */) { TODO() }

fun CFSocketSetSocketFlags(/*0*/ s: platform.CoreFoundation.CFSocketRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFSocket>? */, /*1*/ flags: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */) { TODO() }

fun CFSocketUnregister(/*0*/ nameServerSignature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*1*/ timeout: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */, /*2*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFSocketError /* = kotlin.Long */ { TODO() }

fun CFStreamCreateBoundPair(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ readStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFReadStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFReadStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream> */> */>?, /*2*/ writeStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFWriteStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFWriteStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream> */> */>?, /*3*/ transferBufferSize: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFStreamCreatePairWithPeerSocketSignature(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ signature: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFSocketSignature>?, /*2*/ readStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFReadStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFReadStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream> */> */>?, /*3*/ writeStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFWriteStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFWriteStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream> */> */>?) { TODO() }

fun CFStreamCreatePairWithSocket(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ sock: platform.CoreFoundation.CFSocketNativeHandle /* = kotlin.Int */, /*2*/ readStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFReadStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFReadStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream> */> */>?, /*3*/ writeStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFWriteStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFWriteStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream> */> */>?) { TODO() }

fun CFStreamCreatePairWithSocketToHost(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ host: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ port: platform.darwin.UInt32 /* = kotlin.UInt */, /*3*/ readStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFReadStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFReadStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFReadStream> */> */>?, /*4*/ writeStream: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFWriteStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFWriteStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream> */> */>?) { TODO() }

fun CFStringAppend(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ appendedString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFStringAppendCString(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ cStr: kotlin.String?, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */) { TODO() }

fun CFStringAppendCharacters(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ chars: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?, /*2*/ numChars: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFStringAppendFormat(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ formatOptions: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ format: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/) { TODO() }

fun CFStringAppendFormatAndArguments(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ formatOptions: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ format: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ arguments: platform.posix.va_list? /* = kotlinx.cinterop.CPointer<platform.posix.__va_list_tag>? */) { TODO() }

fun CFStringAppendPascalString(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ pStr: platform.darwin.ConstStr255Param? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>? */, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */) { TODO() }

fun CFStringCapitalize(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */) { TODO() }

fun CFStringCompare(/*0*/ theString1: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theString2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ compareOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */): platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */ { TODO() }

fun CFStringCompareWithOptions(/*0*/ theString1: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theString2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rangeToCompare: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ compareOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */): platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */ { TODO() }

fun CFStringCompareWithOptionsAndLocale(/*0*/ theString1: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theString2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rangeToCompare: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ compareOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */, /*4*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */ { TODO() }

fun CFStringConvertEncodingToIANACharSetName(/*0*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringConvertEncodingToNSStringEncoding(/*0*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): kotlin.ULong { TODO() }

fun CFStringConvertEncodingToWindowsCodepage(/*0*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.darwin.UInt32 /* = kotlin.UInt */ { TODO() }

fun CFStringConvertIANACharSetNameToEncoding(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringConvertNSStringEncodingToEncoding(/*0*/ encoding: kotlin.ULong): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringConvertWindowsCodepageToEncoding(/*0*/ codepage: platform.darwin.UInt32 /* = kotlin.UInt */): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringCreateArrayBySeparatingStrings(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ separatorString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFStringCreateArrayWithFindResults(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ stringToFind: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ rangeToSearch: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*4*/ compareOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFStringCreateByCombiningStrings(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ separatorString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateExternalRepresentation(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*3*/ lossByte: platform.darwin.UInt8 /* = kotlin.UByte */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFStringCreateFromExternalRepresentation(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateMutable(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ maxLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateMutableCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ maxLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateMutableWithExternalCharactersNoCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ chars: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?, /*2*/ numChars: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*4*/ externalCharactersAllocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithBytes(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ numBytes: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*4*/ isExternalRepresentation: kotlin.Boolean): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithBytesNoCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ numBytes: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*4*/ isExternalRepresentation: kotlin.Boolean, /*5*/ contentsDeallocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithCString(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ cStr: kotlin.String?, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithCStringNoCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ cStr: kotlin.String?, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*3*/ contentsDeallocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithCharacters(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ chars: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?, /*2*/ numChars: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithCharactersNoCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ chars: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?, /*2*/ numChars: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ contentsDeallocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithFileSystemRepresentation(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ buffer: kotlin.String?): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithFormat(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatOptions: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ format: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithFormatAndArguments(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ formatOptions: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ format: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ arguments: platform.posix.va_list? /* = kotlinx.cinterop.CPointer<platform.posix.__va_list_tag>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithPascalString(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ pStr: platform.darwin.ConstStr255Param? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>? */, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithPascalStringNoCopy(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ pStr: platform.darwin.ConstStr255Param? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>? */, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*3*/ contentsDeallocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringCreateWithSubstring(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ str: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringDelete(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFStringFind(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ stringToFind: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ compareOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFStringFindAndReplace(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ stringToFind: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ replacementString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ rangeToSearch: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*4*/ compareOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringFindCharacterFromSet(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theSet: platform.CoreFoundation.CFCharacterSetRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFCharacterSet>? */, /*2*/ rangeToSearch: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ searchOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */, /*4*/ result: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): kotlin.Boolean { TODO() }

fun CFStringFindWithOptions(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ stringToFind: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rangeToSearch: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ searchOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */, /*4*/ result: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): kotlin.Boolean { TODO() }

fun CFStringFindWithOptionsAndLocale(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ stringToFind: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rangeToSearch: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ searchOptions: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */, /*4*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */, /*5*/ result: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): kotlin.Boolean { TODO() }

fun CFStringFold(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theFlags: platform.CoreFoundation.CFStringCompareFlags /* = kotlin.ULong */, /*2*/ theLocale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */) { TODO() }

fun CFStringGetBytes(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*3*/ lossByte: platform.darwin.UInt8 /* = kotlin.UByte */, /*4*/ isExternalRepresentation: kotlin.Boolean, /*5*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*6*/ maxBufLen: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*7*/ usedBufLen: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringGetCString(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, /*2*/ bufferSize: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFStringGetCStringPtr(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun CFStringGetCharacterAtIndex(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.darwin.UniChar /* = kotlin.UShort */ { TODO() }

fun CFStringGetCharacterFromInlineBuffer(/*0*/ buf: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringInlineBuffer>?, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.darwin.UniChar /* = kotlin.UShort */ { TODO() }

fun CFStringGetCharacters(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?) { TODO() }

fun CFStringGetCharactersPtr(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlinx.cinterop.CPointer<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>? { TODO() }

fun CFStringGetDoubleValue(/*0*/ str: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Double { TODO() }

fun CFStringGetFastestEncoding(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringGetFileSystemRepresentation(/*0*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, /*2*/ maxBufLen: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlin.Boolean { TODO() }

fun CFStringGetHyphenationLocationBeforeIndex(/*0*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ location: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ limitRange: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */, /*5*/ character: kotlinx.cinterop.CValuesRef<platform.darwin.UTF32CharVar /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UTF32Char /* = kotlin.UInt */> */>?): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringGetIntValue(/*0*/ str: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFStringGetLength(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringGetLineBounds(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ lineBeginIndex: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?, /*3*/ lineEndIndex: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?, /*4*/ contentsEndIndex: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?) { TODO() }

fun CFStringGetListOfAvailableEncodings(): kotlinx.cinterop.CPointer<platform.CoreFoundation.CFStringEncodingVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */> */>? { TODO() }

fun CFStringGetLongCharacterForSurrogatePair(/*0*/ surrogateHigh: platform.darwin.UniChar /* = kotlin.UShort */, /*1*/ surrogateLow: platform.darwin.UniChar /* = kotlin.UShort */): platform.darwin.UTF32Char /* = kotlin.UInt */ { TODO() }

fun CFStringGetMaximumSizeForEncoding(/*0*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*1*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringGetMaximumSizeOfFileSystemRepresentation(/*0*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringGetMostCompatibleMacStringEncoding(/*0*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringGetNameOfEncoding(/*0*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringGetParagraphBounds(/*0*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ parBeginIndex: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?, /*3*/ parEndIndex: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?, /*4*/ contentsEndIndex: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFIndexVar /* = kotlinx.cinterop.LongVarOf<platform.CoreFoundation.CFIndex /* = kotlin.Long */> */>?) { TODO() }

fun CFStringGetPascalString(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ buffer: platform.darwin.StringPtr? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>? */, /*2*/ bufferSize: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFStringGetPascalStringPtr(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.darwin.ConstStringPtr? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>? */ { TODO() }

fun CFStringGetRangeOfComposedCharactersAtIndex(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theIndex: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFStringGetSmallestEncoding(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringGetSurrogatePairForLongCharacter(/*0*/ character: platform.darwin.UTF32Char /* = kotlin.UInt */, /*1*/ surrogates: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?): kotlin.Boolean { TODO() }

fun CFStringGetSystemEncoding(): platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */ { TODO() }

fun CFStringGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFStringHasPrefix(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ prefix: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFStringHasSuffix(/*0*/ theString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ suffix: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun CFStringInitInlineBuffer(/*0*/ str: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ buf: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringInlineBuffer>?, /*2*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFStringInsert(/*0*/ str: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*2*/ insertedStr: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFStringIsEncodingAvailable(/*0*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CFStringIsHyphenationAvailableForLocale(/*0*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): kotlin.Boolean { TODO() }

fun CFStringIsSurrogateHighCharacter(/*0*/ character: platform.darwin.UniChar /* = kotlin.UShort */): kotlin.Boolean { TODO() }

fun CFStringIsSurrogateLowCharacter(/*0*/ character: platform.darwin.UniChar /* = kotlin.UShort */): kotlin.Boolean { TODO() }

fun CFStringLowercase(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */) { TODO() }

fun CFStringNormalize(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ theForm: platform.CoreFoundation.CFStringNormalizationForm /* = kotlin.Long */) { TODO() }

fun CFStringPad(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ padString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ indexIntoPad: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFStringReplace(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*2*/ replacement: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFStringReplaceAll(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ replacement: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFStringSetExternalCharactersNoCopy(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ chars: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ capacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */) { TODO() }

fun CFStringTokenizerAdvanceToNextToken(/*0*/ tokenizer: platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */): platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */ { TODO() }

fun CFStringTokenizerCopyBestStringLanguage(/*0*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFStringTokenizerCopyCurrentTokenAttribute(/*0*/ tokenizer: platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */, /*1*/ attribute: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFStringTokenizerCreate(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>, /*3*/ options: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*4*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */ { TODO() }

fun CFStringTokenizerGetCurrentSubTokens(/*0*/ tokenizer: platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */, /*1*/ ranges: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?, /*2*/ maxRangeLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ derivedSubTokens: platform.CoreFoundation.CFMutableArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFStringTokenizerGetCurrentTokenRange(/*0*/ tokenizer: platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFStringTokenizerGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFStringTokenizerGoToTokenAtIndex(/*0*/ tokenizer: platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */, /*1*/ index: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFStringTokenizerTokenType /* = kotlin.ULong */ { TODO() }

fun CFStringTokenizerSetString(/*0*/ tokenizer: platform.CoreFoundation.CFStringTokenizerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFStringTokenizer>? */, /*1*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ range: kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange>) { TODO() }

fun CFStringTransform(/*0*/ string: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ range: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?, /*2*/ transform: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ reverse: kotlin.Boolean): kotlin.Boolean { TODO() }

fun CFStringTrim(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ trimString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFStringTrimWhitespace(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFStringUppercase(/*0*/ theString: platform.CoreFoundation.CFMutableStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */) { TODO() }

fun CFSwapInt16(/*0*/ arg: platform.posix.uint16_t /* = kotlin.UShort */): platform.posix.uint16_t /* = kotlin.UShort */ { TODO() }

fun CFSwapInt16BigToHost(/*0*/ arg: platform.posix.uint16_t /* = kotlin.UShort */): platform.posix.uint16_t /* = kotlin.UShort */ { TODO() }

fun CFSwapInt16HostToBig(/*0*/ arg: platform.posix.uint16_t /* = kotlin.UShort */): platform.posix.uint16_t /* = kotlin.UShort */ { TODO() }

fun CFSwapInt16HostToLittle(/*0*/ arg: platform.posix.uint16_t /* = kotlin.UShort */): platform.posix.uint16_t /* = kotlin.UShort */ { TODO() }

fun CFSwapInt16LittleToHost(/*0*/ arg: platform.posix.uint16_t /* = kotlin.UShort */): platform.posix.uint16_t /* = kotlin.UShort */ { TODO() }

fun CFSwapInt32(/*0*/ arg: platform.posix.uint32_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CFSwapInt32BigToHost(/*0*/ arg: platform.posix.uint32_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CFSwapInt32HostToBig(/*0*/ arg: platform.posix.uint32_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CFSwapInt32HostToLittle(/*0*/ arg: platform.posix.uint32_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CFSwapInt32LittleToHost(/*0*/ arg: platform.posix.uint32_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CFSwapInt64(/*0*/ arg: platform.posix.uint64_t /* = kotlin.ULong */): platform.posix.uint64_t /* = kotlin.ULong */ { TODO() }

fun CFSwapInt64BigToHost(/*0*/ arg: platform.posix.uint64_t /* = kotlin.ULong */): platform.posix.uint64_t /* = kotlin.ULong */ { TODO() }

fun CFSwapInt64HostToBig(/*0*/ arg: platform.posix.uint64_t /* = kotlin.ULong */): platform.posix.uint64_t /* = kotlin.ULong */ { TODO() }

fun CFSwapInt64HostToLittle(/*0*/ arg: platform.posix.uint64_t /* = kotlin.ULong */): platform.posix.uint64_t /* = kotlin.ULong */ { TODO() }

fun CFSwapInt64LittleToHost(/*0*/ arg: platform.posix.uint64_t /* = kotlin.ULong */): platform.posix.uint64_t /* = kotlin.ULong */ { TODO() }

fun CFTimeZoneCopyAbbreviation(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*1*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFTimeZoneCopyAbbreviationDictionary(): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFTimeZoneCopyDefault(): platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */ { TODO() }

fun CFTimeZoneCopyKnownNames(): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CFTimeZoneCopyLocalizedName(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*1*/ style: platform.CoreFoundation.CFTimeZoneNameStyle, /*2*/ locale: platform.CoreFoundation.CFLocaleRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFLocale>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFTimeZoneCopySystem(): platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */ { TODO() }

fun CFTimeZoneCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */ { TODO() }

fun CFTimeZoneCreateWithName(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ tryAbbrev: kotlin.Boolean): platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */ { TODO() }

fun CFTimeZoneCreateWithTimeIntervalFromGMT(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ ti: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */): platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */ { TODO() }

fun CFTimeZoneGetData(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFTimeZoneGetDaylightSavingTimeOffset(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*1*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CFTimeZoneGetName(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFTimeZoneGetNextDaylightSavingTimeTransition(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*1*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun CFTimeZoneGetSecondsFromGMT(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*1*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CFTimeZoneGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFTimeZoneIsDaylightSavingTime(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */, /*1*/ at: platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */): kotlin.Boolean { TODO() }

fun CFTimeZoneSetAbbreviationDictionary(/*0*/ dict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) { TODO() }

fun CFTimeZoneSetDefault(/*0*/ tz: platform.CoreFoundation.CFTimeZoneRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTimeZone>? */) { TODO() }

fun CFTreeAppendChild(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ newChild: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */) { TODO() }

fun CFTreeApplyFunctionToChildren(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ applier: platform.CoreFoundation.CFTreeApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFTreeCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTreeContext>?): platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */ { TODO() }

fun CFTreeFindRoot(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */): platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */ { TODO() }

fun CFTreeGetChildAtIndex(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ idx: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */ { TODO() }

fun CFTreeGetChildCount(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFTreeGetChildren(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ children: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTreeRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTreeRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree> */> */>?) { TODO() }

fun CFTreeGetContext(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTreeContext>?) { TODO() }

fun CFTreeGetFirstChild(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */): platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */ { TODO() }

fun CFTreeGetNextSibling(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */): platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */ { TODO() }

fun CFTreeGetParent(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */): platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */ { TODO() }

fun CFTreeGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFTreeInsertSibling(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ newSibling: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */) { TODO() }

fun CFTreePrependChild(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ newChild: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */) { TODO() }

fun CFTreeRemove(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */) { TODO() }

fun CFTreeRemoveAllChildren(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */) { TODO() }

fun CFTreeSetContext(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ context: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTreeContext>?) { TODO() }

fun CFTreeSortChildren(/*0*/ tree: platform.CoreFoundation.CFTreeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFTree>? */, /*1*/ comparator: platform.CoreFoundation.CFComparatorFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreFoundation.CFComparisonResult /* = kotlin.Long */>>? */, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CFURLCanBeDecomposed(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): kotlin.Boolean { TODO() }

fun CFURLClearResourcePropertyCache(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */) { TODO() }

fun CFURLClearResourcePropertyCacheForKey(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFURLCopyAbsoluteURL(/*0*/ relativeURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCopyFileSystemPath(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ pathStyle: platform.CoreFoundation.CFURLPathStyle /* = kotlin.Long */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyFragment(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ charactersToLeaveEscaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyHostName(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyLastPathComponent(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyNetLocation(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyParameterString(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ charactersToLeaveEscaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyPassword(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyPath(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyPathExtension(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyQueryString(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ charactersToLeaveEscaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyResourcePropertiesForKeys(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ keys: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFURLCopyResourcePropertyForKey(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ propertyValueTypeRefPtr: kotlinx.cinterop.CValuesRef<*>?, /*3*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFURLCopyResourceSpecifier(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyScheme(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyStrictPath(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ isAbsolute: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCopyUserName(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCreateAbsoluteURLWithBytes(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ relativeURLBytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*4*/ baseURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*5*/ useCompatibilityMode: kotlin.Boolean): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateBookmarkData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ options: platform.CoreFoundation.CFURLBookmarkCreationOptions /* = kotlin.ULong */, /*3*/ resourcePropertiesToInclude: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*4*/ relativeToURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*5*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFURLCreateBookmarkDataFromFile(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fileURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ errorRef: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFURLCreateByResolvingBookmarkData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bookmark: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ options: platform.CoreFoundation.CFURLBookmarkResolutionOptions /* = kotlin.ULong */, /*3*/ relativeToURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*4*/ resourcePropertiesToInclude: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*5*/ isStale: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?, /*6*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateCopyAppendingPathComponent(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ pathComponent: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ isDirectory: kotlin.Boolean): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateCopyAppendingPathExtension(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ extension: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateCopyDeletingLastPathComponent(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateCopyDeletingPathExtension(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*3*/ escapeWhitespace: kotlin.Boolean): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CFURLCreateDataAndPropertiesFromResource(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ resourceData: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDataRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDataRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData> */> */>?, /*3*/ properties: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFDictionaryRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFDictionaryRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary> */> */>?, /*4*/ desiredProperties: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*5*/ errorCode: kotlinx.cinterop.CValuesRef<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */>?): kotlin.Boolean { TODO() }

fun CFURLCreateFilePathURL(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateFileReferenceURL(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateFromFSRef(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fsRef: kotlinx.cinterop.CValuesRef<cnames.structs.FSRef>?): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateFromFileSystemRepresentation(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ bufLen: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ isDirectory: kotlin.Boolean): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateFromFileSystemRepresentationRelativeToBase(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ bufLen: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ isDirectory: kotlin.Boolean, /*4*/ baseURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreatePropertyFromResource(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ property: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ errorCode: kotlinx.cinterop.CValuesRef<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */>?): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFURLCreateResourcePropertiesForKeysFromBookmarkData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ resourcePropertiesToReturn: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ bookmark: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CFURLCreateResourcePropertyForKeyFromBookmarkData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ resourcePropertyKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ bookmark: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFURLCreateStringByAddingPercentEscapes(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ originalString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ charactersToLeaveUnescaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ legalURLCharactersToBeEscaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*4*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCreateStringByReplacingPercentEscapes(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ originalString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ charactersToLeaveEscaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCreateStringByReplacingPercentEscapesUsingEncoding(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ origString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ charsToLeaveEscaped: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLCreateWithBytes(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ URLBytes: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ length: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ encoding: platform.CoreFoundation.CFStringEncoding /* = kotlin.UInt */, /*4*/ baseURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateWithFileSystemPath(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ filePath: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ pathStyle: platform.CoreFoundation.CFURLPathStyle /* = kotlin.Long */, /*3*/ isDirectory: kotlin.Boolean): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateWithFileSystemPathRelativeToBase(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ filePath: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ pathStyle: platform.CoreFoundation.CFURLPathStyle /* = kotlin.Long */, /*3*/ isDirectory: kotlin.Boolean, /*4*/ baseURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLCreateWithString(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ URLString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ baseURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLDestroyResource(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ errorCode: kotlinx.cinterop.CValuesRef<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */>?): kotlin.Boolean { TODO() }

fun CFURLEnumeratorCreateForDirectoryURL(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ directoryURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ option: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */, /*3*/ propertyKeys: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFURLEnumeratorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>? */ { TODO() }

fun CFURLEnumeratorCreateForMountedVolumes(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ option: platform.CoreFoundation.CFURLEnumeratorOptions /* = kotlin.ULong */, /*2*/ propertyKeys: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFURLEnumeratorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>? */ { TODO() }

fun CFURLEnumeratorGetDescendentLevel(/*0*/ enumerator: platform.CoreFoundation.CFURLEnumeratorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFURLEnumeratorGetNextURL(/*0*/ enumerator: platform.CoreFoundation.CFURLEnumeratorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>? */, /*1*/ url: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFURLRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFURLRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL> */> */>?, /*2*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFURLEnumeratorResult /* = kotlin.Long */ { TODO() }

fun CFURLEnumeratorGetSourceDidChange(/*0*/ enumerator: platform.CoreFoundation.CFURLEnumeratorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>? */): kotlin.Boolean { TODO() }

fun CFURLEnumeratorGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFURLEnumeratorSkipDescendents(/*0*/ enumerator: platform.CoreFoundation.CFURLEnumeratorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURLEnumerator>? */) { TODO() }

fun CFURLGetBaseURL(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */ { TODO() }

fun CFURLGetByteRangeForComponent(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ component: platform.CoreFoundation.CFURLComponentType /* = kotlin.Long */, /*2*/ rangeIncludingSeparators: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFRange>?): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun CFURLGetBytes(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ bufferLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun CFURLGetFSRef(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ fsRef: kotlinx.cinterop.CValuesRef<cnames.structs.FSRef>?): kotlin.Boolean { TODO() }

fun CFURLGetFileSystemRepresentation(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ resolveAgainstBase: kotlin.Boolean, /*2*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*3*/ maxBufLen: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlin.Boolean { TODO() }

fun CFURLGetPortNumber(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.darwin.SInt32 /* = kotlin.Int */ { TODO() }

fun CFURLGetString(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFURLGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFURLHasDirectoryPath(/*0*/ anURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): kotlin.Boolean { TODO() }

fun CFURLIsFileReferenceURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): kotlin.Boolean { TODO() }

fun CFURLResourceIsReachable(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFURLSetResourcePropertiesForKeys(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ keyedPropertyValues: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFURLSetResourcePropertyForKey(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ propertyValue: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*3*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFURLSetTemporaryResourcePropertyForKey(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ propertyValue: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) { TODO() }

fun CFURLStartAccessingSecurityScopedResource(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): kotlin.Boolean { TODO() }

fun CFURLStopAccessingSecurityScopedResource(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */) { TODO() }

fun CFURLWriteBookmarkDataToFile(/*0*/ bookmarkRef: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ fileURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ options: platform.CoreFoundation.CFURLBookmarkFileCreationOptions /* = kotlin.ULong */, /*3*/ errorRef: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun CFURLWriteDataAndPropertiesToResource(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ dataToWrite: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*2*/ propertiesToWrite: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*3*/ errorCode: kotlinx.cinterop.CValuesRef<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */>?): kotlin.Boolean { TODO() }

fun CFUUIDCreate(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */ { TODO() }

fun CFUUIDCreateFromString(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ uuidStr: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */ { TODO() }

fun CFUUIDCreateFromUUIDBytes(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bytes: kotlinx.cinterop.CValue<platform.CoreFoundation.CFUUIDBytes>): platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */ { TODO() }

fun CFUUIDCreateString(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ uuid: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CFUUIDCreateWithBytes(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ byte0: platform.darwin.UInt8 /* = kotlin.UByte */, /*2*/ byte1: platform.darwin.UInt8 /* = kotlin.UByte */, /*3*/ byte2: platform.darwin.UInt8 /* = kotlin.UByte */, /*4*/ byte3: platform.darwin.UInt8 /* = kotlin.UByte */, /*5*/ byte4: platform.darwin.UInt8 /* = kotlin.UByte */, /*6*/ byte5: platform.darwin.UInt8 /* = kotlin.UByte */, /*7*/ byte6: platform.darwin.UInt8 /* = kotlin.UByte */, /*8*/ byte7: platform.darwin.UInt8 /* = kotlin.UByte */, /*9*/ byte8: platform.darwin.UInt8 /* = kotlin.UByte */, /*10*/ byte9: platform.darwin.UInt8 /* = kotlin.UByte */, /*11*/ byte10: platform.darwin.UInt8 /* = kotlin.UByte */, /*12*/ byte11: platform.darwin.UInt8 /* = kotlin.UByte */, /*13*/ byte12: platform.darwin.UInt8 /* = kotlin.UByte */, /*14*/ byte13: platform.darwin.UInt8 /* = kotlin.UByte */, /*15*/ byte14: platform.darwin.UInt8 /* = kotlin.UByte */, /*16*/ byte15: platform.darwin.UInt8 /* = kotlin.UByte */): platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */ { TODO() }

fun CFUUIDGetConstantUUIDWithBytes(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ byte0: platform.darwin.UInt8 /* = kotlin.UByte */, /*2*/ byte1: platform.darwin.UInt8 /* = kotlin.UByte */, /*3*/ byte2: platform.darwin.UInt8 /* = kotlin.UByte */, /*4*/ byte3: platform.darwin.UInt8 /* = kotlin.UByte */, /*5*/ byte4: platform.darwin.UInt8 /* = kotlin.UByte */, /*6*/ byte5: platform.darwin.UInt8 /* = kotlin.UByte */, /*7*/ byte6: platform.darwin.UInt8 /* = kotlin.UByte */, /*8*/ byte7: platform.darwin.UInt8 /* = kotlin.UByte */, /*9*/ byte8: platform.darwin.UInt8 /* = kotlin.UByte */, /*10*/ byte9: platform.darwin.UInt8 /* = kotlin.UByte */, /*11*/ byte10: platform.darwin.UInt8 /* = kotlin.UByte */, /*12*/ byte11: platform.darwin.UInt8 /* = kotlin.UByte */, /*13*/ byte12: platform.darwin.UInt8 /* = kotlin.UByte */, /*14*/ byte13: platform.darwin.UInt8 /* = kotlin.UByte */, /*15*/ byte14: platform.darwin.UInt8 /* = kotlin.UByte */, /*16*/ byte15: platform.darwin.UInt8 /* = kotlin.UByte */): platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */ { TODO() }

fun CFUUIDGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFUUIDGetUUIDBytes(/*0*/ uuid: platform.CoreFoundation.CFUUIDRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFUUID>? */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFUUIDBytes> { TODO() }

fun CFWriteStreamCanAcceptBytes(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */): kotlin.Boolean { TODO() }

fun CFWriteStreamClose(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */) { TODO() }

fun CFWriteStreamCopyDispatchQueue(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */): platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */ { TODO() }

fun CFWriteStreamCopyError(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */): platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */ { TODO() }

fun CFWriteStreamCopyProperty(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ propertyName: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CFWriteStreamCreateWithAllocatedBuffers(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ bufferAllocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */ { TODO() }

fun CFWriteStreamCreateWithBuffer(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ bufferCapacity: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */ { TODO() }

fun CFWriteStreamCreateWithFile(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ fileURL: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */ { TODO() }

fun CFWriteStreamGetError(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFStreamError> { TODO() }

fun CFWriteStreamGetStatus(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */): platform.CoreFoundation.CFStreamStatus /* = kotlin.Long */ { TODO() }

fun CFWriteStreamGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CFWriteStreamOpen(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */): kotlin.Boolean { TODO() }

fun CFWriteStreamScheduleWithRunLoop(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFWriteStreamSetClient(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ streamEvents: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */, /*2*/ clientCB: platform.CoreFoundation.CFWriteStreamClientCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, platform.CoreFoundation.CFStreamEventType /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ clientContext: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStreamClientContext>?): kotlin.Boolean { TODO() }

fun CFWriteStreamSetDispatchQueue(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ q: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun CFWriteStreamSetProperty(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ propertyName: platform.CoreFoundation.CFStreamPropertyKey? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ propertyValue: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Boolean { TODO() }

fun CFWriteStreamUnscheduleFromRunLoop(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFRunLoopMode? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun CFWriteStreamWrite(/*0*/ stream: platform.CoreFoundation.CFWriteStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFWriteStream>? */, /*1*/ buffer: kotlinx.cinterop.CValuesRef<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?, /*2*/ bufferLength: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun __CFRangeMake(/*0*/ loc: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*1*/ len: platform.CoreFoundation.CFIndex /* = kotlin.Long */): kotlinx.cinterop.CValue<platform.CoreFoundation.CFRange> { TODO() }

fun __CFStringMakeConstantString(/*0*/ cStr: kotlin.String?): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge0")private external fun kniBridge0(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1")private external fun kniBridge1(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge10")private external fun kniBridge10(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlin.ULong): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge100")private external fun kniBridge100(/*0*/ p0: kotlin.UShort): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1000")private external fun kniBridge1000(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1001")private external fun kniBridge1001(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1002")private external fun kniBridge1002(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1003")private external fun kniBridge1003(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1004")private external fun kniBridge1004(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1006")private external fun kniBridge1006(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1007")private external fun kniBridge1007(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1008")private external fun kniBridge1008(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1009")private external fun kniBridge1009(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge101")private external fun kniBridge101(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1010")private external fun kniBridge1010(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1011")private external fun kniBridge1011(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1012")private external fun kniBridge1012(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1013")private external fun kniBridge1013(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1014")private external fun kniBridge1014(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1015")private external fun kniBridge1015(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1016")private external fun kniBridge1016(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1017")private external fun kniBridge1017(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1018")private external fun kniBridge1018(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1019")private external fun kniBridge1019(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge102")private external fun kniBridge102(/*0*/ p0: kotlin.ULong): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1020")private external fun kniBridge1020(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1021")private external fun kniBridge1021(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1022")private external fun kniBridge1022(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1023")private external fun kniBridge1023(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1024")private external fun kniBridge1024(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1025")private external fun kniBridge1025(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1026")private external fun kniBridge1026(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1027")private external fun kniBridge1027(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1028")private external fun kniBridge1028(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1029")private external fun kniBridge1029(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge103")private external fun kniBridge103(/*0*/ p0: kotlin.UShort): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1030")private external fun kniBridge1030(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1031")private external fun kniBridge1031(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1032")private external fun kniBridge1032(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1033")private external fun kniBridge1033(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1034")private external fun kniBridge1034(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1035")private external fun kniBridge1035(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1036")private external fun kniBridge1036(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1037")private external fun kniBridge1037(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1038")private external fun kniBridge1038(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1039")private external fun kniBridge1039(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge104")private external fun kniBridge104(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1040")private external fun kniBridge1040(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1041")private external fun kniBridge1041(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1042")private external fun kniBridge1042(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1043")private external fun kniBridge1043(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1044")private external fun kniBridge1044(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1045")private external fun kniBridge1045(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1046")private external fun kniBridge1046(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1047")private external fun kniBridge1047(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1048")private external fun kniBridge1048(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1049")private external fun kniBridge1049(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge105")private external fun kniBridge105(/*0*/ p0: kotlin.ULong): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1050")private external fun kniBridge1050(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1051")private external fun kniBridge1051(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1052")private external fun kniBridge1052(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1053")private external fun kniBridge1053(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1054")private external fun kniBridge1054(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1055")private external fun kniBridge1055(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1056")private external fun kniBridge1056(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1057")private external fun kniBridge1057(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1058")private external fun kniBridge1058(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1059")private external fun kniBridge1059(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge106")private external fun kniBridge106(/*0*/ p0: kotlin.UShort): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1060")private external fun kniBridge1060(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1061")private external fun kniBridge1061(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1062")private external fun kniBridge1062(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1063")private external fun kniBridge1063(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1064")private external fun kniBridge1064(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1065")private external fun kniBridge1065(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1066")private external fun kniBridge1066(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1067")private external fun kniBridge1067(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1068")private external fun kniBridge1068(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1069")private external fun kniBridge1069(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge107")private external fun kniBridge107(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1070")private external fun kniBridge1070(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1071")private external fun kniBridge1071(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1072")private external fun kniBridge1072(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1073")private external fun kniBridge1073(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1074")private external fun kniBridge1074(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1075")private external fun kniBridge1075(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1076")private external fun kniBridge1076(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1077")private external fun kniBridge1077(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1078")private external fun kniBridge1078(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1079")private external fun kniBridge1079(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge108")private external fun kniBridge108(/*0*/ p0: kotlin.ULong): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1080")private external fun kniBridge1080(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1081")private external fun kniBridge1081(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1082")private external fun kniBridge1082(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1083")private external fun kniBridge1083(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1084")private external fun kniBridge1084(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1085")private external fun kniBridge1085(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1086")private external fun kniBridge1086(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1087")private external fun kniBridge1087(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1088")private external fun kniBridge1088(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge109")private external fun kniBridge109(/*0*/ p0: kotlin.Float, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge110")private external fun kniBridge110(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Float

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1101")private external fun kniBridge1101(): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge111")private external fun kniBridge111(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1118")private external fun kniBridge1118(): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge112")private external fun kniBridge112(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge113")private external fun kniBridge113(/*0*/ p0: kotlin.Float, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1133")private external fun kniBridge1133(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1134")private external fun kniBridge1134(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1135")private external fun kniBridge1135(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1136")private external fun kniBridge1136(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1137")private external fun kniBridge1137(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1138")private external fun kniBridge1138(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1139")private external fun kniBridge1139(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge114")private external fun kniBridge114(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Float

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1140")private external fun kniBridge1140(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1141")private external fun kniBridge1141(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1142")private external fun kniBridge1142(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1143")private external fun kniBridge1143(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1144")private external fun kniBridge1144(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1145")private external fun kniBridge1145(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1146")private external fun kniBridge1146(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1147")private external fun kniBridge1147(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1148")private external fun kniBridge1148(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1149")private external fun kniBridge1149(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge115")private external fun kniBridge115(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1150")private external fun kniBridge1150(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1151")private external fun kniBridge1151(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1152")private external fun kniBridge1152(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1153")private external fun kniBridge1153(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge1154")private external fun kniBridge1154(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge116")private external fun kniBridge116(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge117")private external fun kniBridge117(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge118")private external fun kniBridge118(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Long, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge119")private external fun kniBridge119(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge120")private external fun kniBridge120(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge121")private external fun kniBridge121(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge122")private external fun kniBridge122(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge123")private external fun kniBridge123(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge124")private external fun kniBridge124(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge125")private external fun kniBridge125(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge126")private external fun kniBridge126(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge127")private external fun kniBridge127(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge128")private external fun kniBridge128(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge129")private external fun kniBridge129(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge13")private external fun kniBridge13(/*0*/ p0: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge130")private external fun kniBridge130(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge131")private external fun kniBridge131(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge132")private external fun kniBridge132(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge133")private external fun kniBridge133(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge134")private external fun kniBridge134(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge135")private external fun kniBridge135(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge136")private external fun kniBridge136(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge137")private external fun kniBridge137(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge138")private external fun kniBridge138(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge139")private external fun kniBridge139(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge140")private external fun kniBridge140(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge141")private external fun kniBridge141(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge142")private external fun kniBridge142(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge143")private external fun kniBridge143(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge144")private external fun kniBridge144(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge145")private external fun kniBridge145(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge146")private external fun kniBridge146(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge147")private external fun kniBridge147(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge148")private external fun kniBridge148(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge149")private external fun kniBridge149(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge150")private external fun kniBridge150(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge151")private external fun kniBridge151(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge152")private external fun kniBridge152(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge153")private external fun kniBridge153(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge154")private external fun kniBridge154(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge155")private external fun kniBridge155(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Short, /*2*/ p2: kotlin.Short): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge156")private external fun kniBridge156(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge157")private external fun kniBridge157(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge158")private external fun kniBridge158(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge159")private external fun kniBridge159(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge16")private external fun kniBridge16(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge160")private external fun kniBridge160(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge161")private external fun kniBridge161(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge162")private external fun kniBridge162(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge163")private external fun kniBridge163(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge164")private external fun kniBridge164(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge165")private external fun kniBridge165(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge166")private external fun kniBridge166(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge167")private external fun kniBridge167(): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge168")private external fun kniBridge168(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge169")private external fun kniBridge169(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge170")private external fun kniBridge170(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge171")private external fun kniBridge171(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge172")private external fun kniBridge172(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge173")private external fun kniBridge173(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge174")private external fun kniBridge174(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge175")private external fun kniBridge175(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge176")private external fun kniBridge176(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge177")private external fun kniBridge177(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge178")private external fun kniBridge178(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge179")private external fun kniBridge179(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge180")private external fun kniBridge180(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge181")private external fun kniBridge181(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge182")private external fun kniBridge182(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge183")private external fun kniBridge183(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge184")private external fun kniBridge184(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge185")private external fun kniBridge185(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge186")private external fun kniBridge186(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge187")private external fun kniBridge187(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge188")private external fun kniBridge188(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge189")private external fun kniBridge189(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge190")private external fun kniBridge190(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge191")private external fun kniBridge191(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge192")private external fun kniBridge192(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge193")private external fun kniBridge193(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge194")private external fun kniBridge194(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge195")private external fun kniBridge195(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge196")private external fun kniBridge196(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge197")private external fun kniBridge197(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge198")private external fun kniBridge198(/*0*/ p0: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge199")private external fun kniBridge199(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge2")private external fun kniBridge2(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge200")private external fun kniBridge200(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge201")private external fun kniBridge201(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge202")private external fun kniBridge202(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge203")private external fun kniBridge203(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge204")private external fun kniBridge204(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge205")private external fun kniBridge205(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge206")private external fun kniBridge206(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge207")private external fun kniBridge207(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge208")private external fun kniBridge208(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UShort): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge209")private external fun kniBridge209(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge210")private external fun kniBridge210(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge211")private external fun kniBridge211(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge212")private external fun kniBridge212(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge213")private external fun kniBridge213(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge214")private external fun kniBridge214(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge215")private external fun kniBridge215(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge216")private external fun kniBridge216(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge217")private external fun kniBridge217(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge218")private external fun kniBridge218(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge219")private external fun kniBridge219(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge22")private external fun kniBridge22(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge220")private external fun kniBridge220(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge221")private external fun kniBridge221(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge222")private external fun kniBridge222(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge223")private external fun kniBridge223(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge224")private external fun kniBridge224(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge225")private external fun kniBridge225(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlin.Byte, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge226")private external fun kniBridge226(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge227")private external fun kniBridge227(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge228")private external fun kniBridge228(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge229")private external fun kniBridge229(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge230")private external fun kniBridge230(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge231")private external fun kniBridge231(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge232")private external fun kniBridge232(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge233")private external fun kniBridge233(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Long, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge234")private external fun kniBridge234(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge235")private external fun kniBridge235(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge236")private external fun kniBridge236(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge237")private external fun kniBridge237(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge238")private external fun kniBridge238(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge239")private external fun kniBridge239(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge240")private external fun kniBridge240(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge241")private external fun kniBridge241(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge242")private external fun kniBridge242(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.UByte, /*4*/ p4: kotlin.Byte, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.Long, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge243")private external fun kniBridge243(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge244")private external fun kniBridge244(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.UByte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge245")private external fun kniBridge245(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge246")private external fun kniBridge246(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge247")private external fun kniBridge247(): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge248")private external fun kniBridge248(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.UInt): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge249")private external fun kniBridge249(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge250")private external fun kniBridge250(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge251")private external fun kniBridge251(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge252")private external fun kniBridge252(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge253")private external fun kniBridge253(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge254")private external fun kniBridge254(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge255")private external fun kniBridge255(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge256")private external fun kniBridge256(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge257")private external fun kniBridge257(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge258")private external fun kniBridge258(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge259")private external fun kniBridge259(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge260")private external fun kniBridge260(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge261")private external fun kniBridge261(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge262")private external fun kniBridge262(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge263")private external fun kniBridge263(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge264")private external fun kniBridge264(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge265")private external fun kniBridge265(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge266")private external fun kniBridge266(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge267")private external fun kniBridge267(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge268")private external fun kniBridge268(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge269")private external fun kniBridge269(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge270")private external fun kniBridge270(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge271")private external fun kniBridge271(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge272")private external fun kniBridge272(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge273")private external fun kniBridge273(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge274")private external fun kniBridge274(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge275")private external fun kniBridge275(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge276")private external fun kniBridge276(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge277")private external fun kniBridge277(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge278")private external fun kniBridge278(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge279")private external fun kniBridge279(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge280")private external fun kniBridge280(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge281")private external fun kniBridge281(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge282")private external fun kniBridge282(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge283")private external fun kniBridge283(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge284")private external fun kniBridge284(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge285")private external fun kniBridge285(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge286")private external fun kniBridge286(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge287")private external fun kniBridge287(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge288")private external fun kniBridge288(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge289")private external fun kniBridge289(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge290")private external fun kniBridge290(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge291")private external fun kniBridge291(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Byte): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge292")private external fun kniBridge292(/*0*/ p0: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge293")private external fun kniBridge293(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge294")private external fun kniBridge294(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge295")private external fun kniBridge295(/*0*/ p0: kotlin.UInt): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge296")private external fun kniBridge296(/*0*/ p0: kotlin.ULong): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge297")private external fun kniBridge297(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge298")private external fun kniBridge298(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge299")private external fun kniBridge299(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge3")private external fun kniBridge3(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge300")private external fun kniBridge300(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge301")private external fun kniBridge301(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge302")private external fun kniBridge302(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge303")private external fun kniBridge303(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge304")private external fun kniBridge304(/*0*/ p0: kotlin.UShort): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge305")private external fun kniBridge305(/*0*/ p0: kotlin.UShort): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge306")private external fun kniBridge306(/*0*/ p0: kotlin.UShort, /*1*/ p1: kotlin.UShort): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge307")private external fun kniBridge307(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge308")private external fun kniBridge308(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge309")private external fun kniBridge309(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge310")private external fun kniBridge310(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge311")private external fun kniBridge311(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge312")private external fun kniBridge312(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge313")private external fun kniBridge313()

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge314")private external fun kniBridge314(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge315")private external fun kniBridge315(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge316")private external fun kniBridge316(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge317")private external fun kniBridge317(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge318")private external fun kniBridge318(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge319")private external fun kniBridge319(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge320")private external fun kniBridge320(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge321")private external fun kniBridge321(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge322")private external fun kniBridge322(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge323")private external fun kniBridge323(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge324")private external fun kniBridge324(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge325")private external fun kniBridge325(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge326")private external fun kniBridge326(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge327")private external fun kniBridge327(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge328")private external fun kniBridge328(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge329")private external fun kniBridge329(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge330")private external fun kniBridge330(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge331")private external fun kniBridge331(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge332")private external fun kniBridge332(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge333")private external fun kniBridge333(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge334")private external fun kniBridge334(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge335")private external fun kniBridge335(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge336")private external fun kniBridge336(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge337")private external fun kniBridge337(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge338")private external fun kniBridge338(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge339")private external fun kniBridge339(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge340")private external fun kniBridge340(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge341")private external fun kniBridge341(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge342")private external fun kniBridge342(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge343")private external fun kniBridge343(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge344")private external fun kniBridge344(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge345")private external fun kniBridge345(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.Double): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge346")private external fun kniBridge346(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge347")private external fun kniBridge347(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge348")private external fun kniBridge348(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge349")private external fun kniBridge349(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge350")private external fun kniBridge350(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge351")private external fun kniBridge351(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge352")private external fun kniBridge352(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge353")private external fun kniBridge353(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge354")private external fun kniBridge354(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge355")private external fun kniBridge355(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge356")private external fun kniBridge356(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge357")private external fun kniBridge357(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge358")private external fun kniBridge358(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge359")private external fun kniBridge359(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge360")private external fun kniBridge360(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge361")private external fun kniBridge361(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge362")private external fun kniBridge362(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge363")private external fun kniBridge363(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge364")private external fun kniBridge364(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge365")private external fun kniBridge365(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge366")private external fun kniBridge366(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge367")private external fun kniBridge367(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge368")private external fun kniBridge368(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge369")private external fun kniBridge369(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge370")private external fun kniBridge370(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge371")private external fun kniBridge371(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge372")private external fun kniBridge372(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge373")private external fun kniBridge373(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge374")private external fun kniBridge374(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge375")private external fun kniBridge375(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge376")private external fun kniBridge376(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge377")private external fun kniBridge377(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge378")private external fun kniBridge378(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge379")private external fun kniBridge379(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge38")private external fun kniBridge38(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge380")private external fun kniBridge380(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge381")private external fun kniBridge381(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge382")private external fun kniBridge382(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge383")private external fun kniBridge383(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge384")private external fun kniBridge384(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge385")private external fun kniBridge385(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge386")private external fun kniBridge386(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge387")private external fun kniBridge387(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge388")private external fun kniBridge388(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge389")private external fun kniBridge389(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Long, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge39")private external fun kniBridge39(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge390")private external fun kniBridge390(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge391")private external fun kniBridge391(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge392")private external fun kniBridge392(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge393")private external fun kniBridge393(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge394")private external fun kniBridge394(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge395")private external fun kniBridge395(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge396")private external fun kniBridge396(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge397")private external fun kniBridge397(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge398")private external fun kniBridge398(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge399")private external fun kniBridge399(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge40")private external fun kniBridge40(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge400")private external fun kniBridge400(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge401")private external fun kniBridge401(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge402")private external fun kniBridge402(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge403")private external fun kniBridge403(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge404")private external fun kniBridge404(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge405")private external fun kniBridge405(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge406")private external fun kniBridge406(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge407")private external fun kniBridge407(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge408")private external fun kniBridge408(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge409")private external fun kniBridge409(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge41")private external fun kniBridge41(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge410")private external fun kniBridge410(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge411")private external fun kniBridge411(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge412")private external fun kniBridge412(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge413")private external fun kniBridge413(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge414")private external fun kniBridge414(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge415")private external fun kniBridge415(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Byte, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge416")private external fun kniBridge416(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.Byte, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge417")private external fun kniBridge417(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Long): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge418")private external fun kniBridge418(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge419")private external fun kniBridge419(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge42")private external fun kniBridge42(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge420")private external fun kniBridge420(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge421")private external fun kniBridge421(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge422")private external fun kniBridge422(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge423")private external fun kniBridge423(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge424")private external fun kniBridge424(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge425")private external fun kniBridge425(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge426")private external fun kniBridge426(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge427")private external fun kniBridge427(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge428")private external fun kniBridge428(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge429")private external fun kniBridge429(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge43")private external fun kniBridge43(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge430")private external fun kniBridge430(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge431")private external fun kniBridge431(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge432")private external fun kniBridge432(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge433")private external fun kniBridge433(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge434")private external fun kniBridge434(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge435")private external fun kniBridge435(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge436")private external fun kniBridge436(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge437")private external fun kniBridge437(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge438")private external fun kniBridge438(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge439")private external fun kniBridge439(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge44")private external fun kniBridge44(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge440")private external fun kniBridge440(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge441")private external fun kniBridge441(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge442")private external fun kniBridge442(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge443")private external fun kniBridge443(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge444")private external fun kniBridge444(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge445")private external fun kniBridge445(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge446")private external fun kniBridge446(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge447")private external fun kniBridge447(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge448")private external fun kniBridge448(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge449")private external fun kniBridge449(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge45")private external fun kniBridge45(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge450")private external fun kniBridge450(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge451")private external fun kniBridge451(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge452")private external fun kniBridge452(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge453")private external fun kniBridge453(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge454")private external fun kniBridge454(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge455")private external fun kniBridge455(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge456")private external fun kniBridge456(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge457")private external fun kniBridge457(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge458")private external fun kniBridge458(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge459")private external fun kniBridge459(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge46")private external fun kniBridge46(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge460")private external fun kniBridge460(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge461")private external fun kniBridge461(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge462")private external fun kniBridge462(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge463")private external fun kniBridge463(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge464")private external fun kniBridge464(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge465")private external fun kniBridge465(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge466")private external fun kniBridge466(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge467")private external fun kniBridge467(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge468")private external fun kniBridge468(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge469")private external fun kniBridge469(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge47")private external fun kniBridge47(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge470")private external fun kniBridge470(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge471")private external fun kniBridge471(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge472")private external fun kniBridge472(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge473")private external fun kniBridge473(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge474")private external fun kniBridge474(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge475")private external fun kniBridge475()

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge476")private external fun kniBridge476(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Byte): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge477")private external fun kniBridge477(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge478")private external fun kniBridge478(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge479")private external fun kniBridge479(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge48")private external fun kniBridge48(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge480")private external fun kniBridge480(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreFoundation_kniBridge481")private fun kniBridge481(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge482")private external fun kniBridge482(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge483")private external fun kniBridge483(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge484")private external fun kniBridge484(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge485")private external fun kniBridge485(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge486")private external fun kniBridge486(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge487")private external fun kniBridge487(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge488")private external fun kniBridge488(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge489")private external fun kniBridge489(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge49")private external fun kniBridge49(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge490")private external fun kniBridge490(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge491")private external fun kniBridge491(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge492")private external fun kniBridge492(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge493")private external fun kniBridge493(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge494")private external fun kniBridge494(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge495")private external fun kniBridge495(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge496")private external fun kniBridge496(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge497")private external fun kniBridge497(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge498")private external fun kniBridge498(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge499")private external fun kniBridge499(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Long, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge5")private external fun kniBridge5(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge50")private external fun kniBridge50(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge500")private external fun kniBridge500(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Long, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreFoundation_kniBridge501")private fun kniBridge501(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge502")private external fun kniBridge502(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge503")private external fun kniBridge503(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge504")private external fun kniBridge504(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge505")private external fun kniBridge505(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge506")private external fun kniBridge506(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge507")private external fun kniBridge507(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge508")private external fun kniBridge508(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge509")private external fun kniBridge509(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.Long, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge51")private external fun kniBridge51(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge510")private external fun kniBridge510(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.Long, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreFoundation_kniBridge511")private fun kniBridge511(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge512")private external fun kniBridge512(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge513")private external fun kniBridge513(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge514")private external fun kniBridge514(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge515")private external fun kniBridge515(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge516")private external fun kniBridge516(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge517")private external fun kniBridge517(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge518")private external fun kniBridge518(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge519")private external fun kniBridge519(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge52")private external fun kniBridge52(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge520")private external fun kniBridge520(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge521")private external fun kniBridge521(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge522")private external fun kniBridge522(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge523")private external fun kniBridge523(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlin.Int, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge524")private external fun kniBridge524(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge525")private external fun kniBridge525(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge526")private external fun kniBridge526(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge527")private external fun kniBridge527(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge528")private external fun kniBridge528(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge529")private external fun kniBridge529(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge53")private external fun kniBridge53(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge530")private external fun kniBridge530(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge531")private external fun kniBridge531(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge532")private external fun kniBridge532(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge533")private external fun kniBridge533(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge534")private external fun kniBridge534(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge535")private external fun kniBridge535(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge536")private external fun kniBridge536(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge537")private external fun kniBridge537(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge538")private external fun kniBridge538(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge539")private external fun kniBridge539(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge54")private external fun kniBridge54(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge540")private external fun kniBridge540(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Double): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge541")private external fun kniBridge541(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge542")private external fun kniBridge542(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge543")private external fun kniBridge543(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge544")private external fun kniBridge544(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge545")private external fun kniBridge545(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge546")private external fun kniBridge546(/*0*/ p0: kotlin.UShort)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge547")private external fun kniBridge547(): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge548")private external fun kniBridge548(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge549")private external fun kniBridge549(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge55")private external fun kniBridge55(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge550")private external fun kniBridge550(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge551")private external fun kniBridge551(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge552")private external fun kniBridge552(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge553")private external fun kniBridge553(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge554")private external fun kniBridge554(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge555")private external fun kniBridge555(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge556")private external fun kniBridge556(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge557")private external fun kniBridge557(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge558")private external fun kniBridge558(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge559")private external fun kniBridge559(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge56")private external fun kniBridge56(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge560")private external fun kniBridge560(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge561")private external fun kniBridge561(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge562")private external fun kniBridge562(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge563")private external fun kniBridge563(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge564")private external fun kniBridge564(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge565")private external fun kniBridge565(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge566")private external fun kniBridge566(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge567")private external fun kniBridge567(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge568")private external fun kniBridge568(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge569")private external fun kniBridge569(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge57")private external fun kniBridge57(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge570")private external fun kniBridge570(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge571")private external fun kniBridge571(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge572")private external fun kniBridge572(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge573")private external fun kniBridge573(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge574")private external fun kniBridge574(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge575")private external fun kniBridge575(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge576")private external fun kniBridge576(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge577")private external fun kniBridge577(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge578")private external fun kniBridge578(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge579")private external fun kniBridge579(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge58")private external fun kniBridge58(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge580")private external fun kniBridge580(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge581")private external fun kniBridge581(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge582")private external fun kniBridge582(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge583")private external fun kniBridge583(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge584")private external fun kniBridge584(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge585")private external fun kniBridge585(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge586")private external fun kniBridge586(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge587")private external fun kniBridge587(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge588")private external fun kniBridge588(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge589")private external fun kniBridge589(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge59")private external fun kniBridge59(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge590")private external fun kniBridge590(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge591")private external fun kniBridge591(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge592")private external fun kniBridge592(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge593")private external fun kniBridge593(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge594")private external fun kniBridge594(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge595")private external fun kniBridge595(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge596")private external fun kniBridge596(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge597")private external fun kniBridge597(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge598")private external fun kniBridge598(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge599")private external fun kniBridge599(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge60")private external fun kniBridge60(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge600")private external fun kniBridge600(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge601")private external fun kniBridge601(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge602")private external fun kniBridge602(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge603")private external fun kniBridge603(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge604")private external fun kniBridge604(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge605")private external fun kniBridge605(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge606")private external fun kniBridge606(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge607")private external fun kniBridge607(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge608")private external fun kniBridge608(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge609")private external fun kniBridge609(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge61")private external fun kniBridge61(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge610")private external fun kniBridge610(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge611")private external fun kniBridge611(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge612")private external fun kniBridge612(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge613")private external fun kniBridge613(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge614")private external fun kniBridge614(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge615")private external fun kniBridge615(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge616")private external fun kniBridge616(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge617")private external fun kniBridge617(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge618")private external fun kniBridge618(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge619")private external fun kniBridge619(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge62")private external fun kniBridge62(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge620")private external fun kniBridge620(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge621")private external fun kniBridge621(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge622")private external fun kniBridge622(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge623")private external fun kniBridge623(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge624")private external fun kniBridge624(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge625")private external fun kniBridge625(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge626")private external fun kniBridge626(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge627")private external fun kniBridge627(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge628")private external fun kniBridge628(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge629")private external fun kniBridge629(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge63")private external fun kniBridge63(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge630")private external fun kniBridge630(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge631")private external fun kniBridge631(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge632")private external fun kniBridge632(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge633")private external fun kniBridge633(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge634")private external fun kniBridge634(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge635")private external fun kniBridge635(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge636")private external fun kniBridge636(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge637")private external fun kniBridge637(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge638")private external fun kniBridge638(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge639")private external fun kniBridge639(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UByte, /*2*/ p2: kotlin.UByte, /*3*/ p3: kotlin.UByte, /*4*/ p4: kotlin.UByte, /*5*/ p5: kotlin.UByte, /*6*/ p6: kotlin.UByte, /*7*/ p7: kotlin.UByte, /*8*/ p8: kotlin.UByte, /*9*/ p9: kotlin.UByte, /*10*/ p10: kotlin.UByte, /*11*/ p11: kotlin.UByte, /*12*/ p12: kotlin.UByte, /*13*/ p13: kotlin.UByte, /*14*/ p14: kotlin.UByte, /*15*/ p15: kotlin.UByte, /*16*/ p16: kotlin.UByte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge64")private external fun kniBridge64(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge640")private external fun kniBridge640(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge641")private external fun kniBridge641(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge642")private external fun kniBridge642(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UByte, /*2*/ p2: kotlin.UByte, /*3*/ p3: kotlin.UByte, /*4*/ p4: kotlin.UByte, /*5*/ p5: kotlin.UByte, /*6*/ p6: kotlin.UByte, /*7*/ p7: kotlin.UByte, /*8*/ p8: kotlin.UByte, /*9*/ p9: kotlin.UByte, /*10*/ p10: kotlin.UByte, /*11*/ p11: kotlin.UByte, /*12*/ p12: kotlin.UByte, /*13*/ p13: kotlin.UByte, /*14*/ p14: kotlin.UByte, /*15*/ p15: kotlin.UByte, /*16*/ p16: kotlin.UByte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge643")private external fun kniBridge643(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge644")private external fun kniBridge644(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge645")private external fun kniBridge645(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge646")private external fun kniBridge646(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge647")private external fun kniBridge647(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge648")private external fun kniBridge648(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge649")private external fun kniBridge649(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge65")private external fun kniBridge65(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge650")private external fun kniBridge650(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge651")private external fun kniBridge651(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge652")private external fun kniBridge652(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge653")private external fun kniBridge653(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge654")private external fun kniBridge654(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge655")private external fun kniBridge655(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge656")private external fun kniBridge656(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge657")private external fun kniBridge657(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge658")private external fun kniBridge658(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge659")private external fun kniBridge659(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge66")private external fun kniBridge66(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge660")private external fun kniBridge660(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge661")private external fun kniBridge661(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge662")private external fun kniBridge662(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge663")private external fun kniBridge663(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge664")private external fun kniBridge664(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge665")private external fun kniBridge665(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge666")private external fun kniBridge666(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge667")private external fun kniBridge667(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge668")private external fun kniBridge668(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge669")private external fun kniBridge669(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge67")private external fun kniBridge67(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge670")private external fun kniBridge670(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge671")private external fun kniBridge671(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge672")private external fun kniBridge672(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge673")private external fun kniBridge673(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge674")private external fun kniBridge674(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge675")private external fun kniBridge675(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge676")private external fun kniBridge676(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge677")private external fun kniBridge677(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge678")private external fun kniBridge678(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge679")private external fun kniBridge679(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge68")private external fun kniBridge68(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge680")private external fun kniBridge680(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge681")private external fun kniBridge681(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge682")private external fun kniBridge682(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge683")private external fun kniBridge683(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge684")private external fun kniBridge684(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge685")private external fun kniBridge685(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge686")private external fun kniBridge686(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge687")private external fun kniBridge687(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge688")private external fun kniBridge688(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge689")private external fun kniBridge689(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge69")private external fun kniBridge69(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge690")private external fun kniBridge690(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge691")private external fun kniBridge691(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge692")private external fun kniBridge692(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge693")private external fun kniBridge693(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge694")private external fun kniBridge694(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge695")private external fun kniBridge695(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge696")private external fun kniBridge696(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge697")private external fun kniBridge697(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge698")private external fun kniBridge698(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge699")private external fun kniBridge699(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge70")private external fun kniBridge70(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge700")private external fun kniBridge700(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge701")private external fun kniBridge701(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge702")private external fun kniBridge702(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge703")private external fun kniBridge703(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge704")private external fun kniBridge704(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge705")private external fun kniBridge705(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge706")private external fun kniBridge706(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge707")private external fun kniBridge707(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge708")private external fun kniBridge708(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge709")private external fun kniBridge709(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge71")private external fun kniBridge71(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge710")private external fun kniBridge710(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge711")private external fun kniBridge711(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge712")private external fun kniBridge712(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge713")private external fun kniBridge713(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge714")private external fun kniBridge714(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge715")private external fun kniBridge715(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge716")private external fun kniBridge716(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge717")private external fun kniBridge717(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge718")private external fun kniBridge718(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge719")private external fun kniBridge719(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge72")private external fun kniBridge72(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge720")private external fun kniBridge720(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge721")private external fun kniBridge721(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge722")private external fun kniBridge722(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge723")private external fun kniBridge723(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge724")private external fun kniBridge724(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge725")private external fun kniBridge725(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge726")private external fun kniBridge726(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge727")private external fun kniBridge727(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge728")private external fun kniBridge728(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge729")private external fun kniBridge729(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge73")private external fun kniBridge73(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge730")private external fun kniBridge730(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge731")private external fun kniBridge731(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge732")private external fun kniBridge732(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge733")private external fun kniBridge733(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge734")private external fun kniBridge734(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge735")private external fun kniBridge735(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge736")private external fun kniBridge736(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge737")private external fun kniBridge737(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge738")private external fun kniBridge738(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge739")private external fun kniBridge739(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge74")private external fun kniBridge74(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge740")private external fun kniBridge740(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge741")private external fun kniBridge741(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge742")private external fun kniBridge742(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge743")private external fun kniBridge743(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge744")private external fun kniBridge744(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge745")private external fun kniBridge745(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge746")private external fun kniBridge746(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge747")private external fun kniBridge747(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge748")private external fun kniBridge748(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge749")private external fun kniBridge749(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge75")private external fun kniBridge75(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge750")private external fun kniBridge750(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge751")private external fun kniBridge751(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge752")private external fun kniBridge752(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge753")private external fun kniBridge753(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge754")private external fun kniBridge754(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge755")private external fun kniBridge755(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge756")private external fun kniBridge756(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge757")private external fun kniBridge757(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge758")private external fun kniBridge758(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge759")private external fun kniBridge759(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge76")private external fun kniBridge76(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge760")private external fun kniBridge760(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge761")private external fun kniBridge761(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge762")private external fun kniBridge762(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge763")private external fun kniBridge763(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge764")private external fun kniBridge764(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge765")private external fun kniBridge765(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge766")private external fun kniBridge766(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge767")private external fun kniBridge767(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge768")private external fun kniBridge768(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge769")private external fun kniBridge769(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge77")private external fun kniBridge77(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge770")private external fun kniBridge770(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge771")private external fun kniBridge771(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge772")private external fun kniBridge772(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge773")private external fun kniBridge773(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge774")private external fun kniBridge774(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge775")private external fun kniBridge775(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge776")private external fun kniBridge776(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge777")private external fun kniBridge777(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge778")private external fun kniBridge778(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge779")private external fun kniBridge779(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge78")private external fun kniBridge78(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge780")private external fun kniBridge780(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge781")private external fun kniBridge781(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge782")private external fun kniBridge782(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UShort): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge783")private external fun kniBridge783(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge784")private external fun kniBridge784(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge785")private external fun kniBridge785(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge786")private external fun kniBridge786(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge787")private external fun kniBridge787(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge788")private external fun kniBridge788(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge789")private external fun kniBridge789(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge79")private external fun kniBridge79(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge790")private external fun kniBridge790(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge791")private external fun kniBridge791(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge792")private external fun kniBridge792(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge793")private external fun kniBridge793(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge794")private external fun kniBridge794(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge795")private external fun kniBridge795(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge796")private external fun kniBridge796(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge797")private external fun kniBridge797(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge798")private external fun kniBridge798(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge799")private external fun kniBridge799(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge80")private external fun kniBridge80(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge800")private external fun kniBridge800(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge801")private external fun kniBridge801(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge802")private external fun kniBridge802(): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge803")private external fun kniBridge803(/*0*/ p0: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge804")private external fun kniBridge804(): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge805")private external fun kniBridge805(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge806")private external fun kniBridge806(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge807")private external fun kniBridge807(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge808")private external fun kniBridge808(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge809")private external fun kniBridge809(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge81")private external fun kniBridge81(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge810")private external fun kniBridge810(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge811")private external fun kniBridge811(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge812")private external fun kniBridge812(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge813")private external fun kniBridge813(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge814")private external fun kniBridge814(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge815")private external fun kniBridge815(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge816")private external fun kniBridge816(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge817")private external fun kniBridge817(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge818")private external fun kniBridge818(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge819")private external fun kniBridge819(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge82")private external fun kniBridge82(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge820")private external fun kniBridge820(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge821")private external fun kniBridge821(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge822")private external fun kniBridge822(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge823")private external fun kniBridge823(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge824")private external fun kniBridge824(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge825")private external fun kniBridge825(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge826")private external fun kniBridge826(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge827")private external fun kniBridge827(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge828")private external fun kniBridge828(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge829")private external fun kniBridge829(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge83")private external fun kniBridge83(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge830")private external fun kniBridge830(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge831")private external fun kniBridge831(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge832")private external fun kniBridge832(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge833")private external fun kniBridge833(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge834")private external fun kniBridge834(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge835")private external fun kniBridge835(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge836")private external fun kniBridge836(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge837")private external fun kniBridge837(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge838")private external fun kniBridge838(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge839")private external fun kniBridge839(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge84")private external fun kniBridge84(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge840")private external fun kniBridge840(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge841")private external fun kniBridge841(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge842")private external fun kniBridge842(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge843")private external fun kniBridge843(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge844")private external fun kniBridge844(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge845")private external fun kniBridge845(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge846")private external fun kniBridge846(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge847")private external fun kniBridge847(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge848")private external fun kniBridge848(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge849")private external fun kniBridge849(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge85")private external fun kniBridge85(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge850")private external fun kniBridge850(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge851")private external fun kniBridge851(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge852")private external fun kniBridge852(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge853")private external fun kniBridge853(): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge854")private external fun kniBridge854(): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge855")private external fun kniBridge855(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge856")private external fun kniBridge856(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge857")private external fun kniBridge857(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge858")private external fun kniBridge858(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge859")private external fun kniBridge859(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge86")private external fun kniBridge86(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge860")private external fun kniBridge860(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge861")private external fun kniBridge861(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge862")private external fun kniBridge862(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge863")private external fun kniBridge863(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge864")private external fun kniBridge864(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge865")private external fun kniBridge865(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge866")private external fun kniBridge866(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge867")private external fun kniBridge867(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge868")private external fun kniBridge868(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge869")private external fun kniBridge869(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge87")private external fun kniBridge87(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge870")private external fun kniBridge870(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge871")private external fun kniBridge871(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge872")private external fun kniBridge872(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge873")private external fun kniBridge873(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge874")private external fun kniBridge874(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge875")private external fun kniBridge875(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge876")private external fun kniBridge876(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge877")private external fun kniBridge877(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge878")private external fun kniBridge878(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge879")private external fun kniBridge879(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge88")private external fun kniBridge88(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge880")private external fun kniBridge880(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge881")private external fun kniBridge881(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge882")private external fun kniBridge882(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge883")private external fun kniBridge883(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge884")private external fun kniBridge884(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge885")private external fun kniBridge885(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge886")private external fun kniBridge886(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge887")private external fun kniBridge887(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge888")private external fun kniBridge888(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge889")private external fun kniBridge889(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge89")private external fun kniBridge89(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge890")private external fun kniBridge890(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge891")private external fun kniBridge891(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge892")private external fun kniBridge892(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge893")private external fun kniBridge893(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge894")private external fun kniBridge894(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge895")private external fun kniBridge895(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge896")private external fun kniBridge896(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge897")private external fun kniBridge897(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge898")private external fun kniBridge898(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge899")private external fun kniBridge899(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge9")private external fun kniBridge9(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge90")private external fun kniBridge90(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge900")private external fun kniBridge900(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge901")private external fun kniBridge901(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge902")private external fun kniBridge902(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge903")private external fun kniBridge903(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge904")private external fun kniBridge904(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge905")private external fun kniBridge905(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge906")private external fun kniBridge906(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge907")private external fun kniBridge907(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge908")private external fun kniBridge908(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge909")private external fun kniBridge909(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge91")private external fun kniBridge91(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge910")private external fun kniBridge910(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge911")private external fun kniBridge911(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge912")private external fun kniBridge912(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge913")private external fun kniBridge913(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge914")private external fun kniBridge914(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge915")private external fun kniBridge915(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge916")private external fun kniBridge916(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge917")private external fun kniBridge917(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge918")private external fun kniBridge918(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge919")private external fun kniBridge919(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge92")private external fun kniBridge92(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge920")private external fun kniBridge920(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge921")private external fun kniBridge921(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge922")private external fun kniBridge922(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge923")private external fun kniBridge923(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge924")private external fun kniBridge924(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge925")private external fun kniBridge925(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge926")private external fun kniBridge926(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge927")private external fun kniBridge927(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge928")private external fun kniBridge928(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge929")private external fun kniBridge929(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge93")private external fun kniBridge93(): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge930")private external fun kniBridge930(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge931")private external fun kniBridge931(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge932")private external fun kniBridge932(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge933")private external fun kniBridge933(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge934")private external fun kniBridge934(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge935")private external fun kniBridge935(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge936")private external fun kniBridge936(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge937")private external fun kniBridge937(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge938")private external fun kniBridge938(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge939")private external fun kniBridge939(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge94")private external fun kniBridge94(/*0*/ p0: kotlin.UShort): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge940")private external fun kniBridge940(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge941")private external fun kniBridge941(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge942")private external fun kniBridge942(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge943")private external fun kniBridge943(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge944")private external fun kniBridge944(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge945")private external fun kniBridge945(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge946")private external fun kniBridge946(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge947")private external fun kniBridge947(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge948")private external fun kniBridge948(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge949")private external fun kniBridge949(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge95")private external fun kniBridge95(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge950")private external fun kniBridge950(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge951")private external fun kniBridge951(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge952")private external fun kniBridge952(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge953")private external fun kniBridge953(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge954")private external fun kniBridge954(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge955")private external fun kniBridge955(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge956")private external fun kniBridge956(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge957")private external fun kniBridge957(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge958")private external fun kniBridge958(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge959")private external fun kniBridge959(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge96")private external fun kniBridge96(/*0*/ p0: kotlin.ULong): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge960")private external fun kniBridge960(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge961")private external fun kniBridge961(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge962")private external fun kniBridge962(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge963")private external fun kniBridge963(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge964")private external fun kniBridge964(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge965")private external fun kniBridge965(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge966")private external fun kniBridge966(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge967")private external fun kniBridge967(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge968")private external fun kniBridge968(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge969")private external fun kniBridge969(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge97")private external fun kniBridge97(/*0*/ p0: kotlin.UShort): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge970")private external fun kniBridge970(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge972")private external fun kniBridge972(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge973")private external fun kniBridge973(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge974")private external fun kniBridge974(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge975")private external fun kniBridge975(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge976")private external fun kniBridge976(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge977")private external fun kniBridge977(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge978")private external fun kniBridge978(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge979")private external fun kniBridge979(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge98")private external fun kniBridge98(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge980")private external fun kniBridge980(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge981")private external fun kniBridge981(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge982")private external fun kniBridge982(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge983")private external fun kniBridge983(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge984")private external fun kniBridge984(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge985")private external fun kniBridge985(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge986")private external fun kniBridge986(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge987")private external fun kniBridge987(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge988")private external fun kniBridge988(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge989")private external fun kniBridge989(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge99")private external fun kniBridge99(/*0*/ p0: kotlin.ULong): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge990")private external fun kniBridge990(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge991")private external fun kniBridge991(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge992")private external fun kniBridge992(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge993")private external fun kniBridge993(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge994")private external fun kniBridge994(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge995")private external fun kniBridge995(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge996")private external fun kniBridge996(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge997")private external fun kniBridge997(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreFoundation_kniBridge999")private external fun kniBridge999(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */


