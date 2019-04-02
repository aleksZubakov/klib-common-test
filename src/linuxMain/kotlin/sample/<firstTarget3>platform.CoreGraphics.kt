@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.CoreGraphics

import kotlinx.cinterop.* 

final class CGAffineTransform public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var a: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var b: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var c: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var d: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var tx: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var ty: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGBlendMode private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGBlendModeNormal(TODO()),

    kCGBlendModeMultiply(TODO()),

    kCGBlendModeScreen(TODO()),

    kCGBlendModeOverlay(TODO()),

    kCGBlendModeDarken(TODO()),

    kCGBlendModeLighten(TODO()),

    kCGBlendModeColorDodge(TODO()),

    kCGBlendModeColorBurn(TODO()),

    kCGBlendModeSoftLight(TODO()),

    kCGBlendModeHardLight(TODO()),

    kCGBlendModeDifference(TODO()),

    kCGBlendModeExclusion(TODO()),

    kCGBlendModeHue(TODO()),

    kCGBlendModeSaturation(TODO()),

    kCGBlendModeColor(TODO()),

    kCGBlendModeLuminosity(TODO()),

    kCGBlendModeClear(TODO()),

    kCGBlendModeCopy(TODO()),

    kCGBlendModeSourceIn(TODO()),

    kCGBlendModeSourceOut(TODO()),

    kCGBlendModeSourceAtop(TODO()),

    kCGBlendModeDestinationOver(TODO()),

    kCGBlendModeDestinationIn(TODO()),

    kCGBlendModeDestinationOut(TODO()),

    kCGBlendModeDestinationAtop(TODO()),

    kCGBlendModeXOR(TODO()),

    kCGBlendModePlusDarker(TODO()),

    kCGBlendModePlusLighter(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGBlendMode { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGBlendMode
            get() = TODO()
            set(value: platform.CoreGraphics.CGBlendMode) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final enum class CGColorRenderingIntent private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGRenderingIntentDefault(TODO()),

    kCGRenderingIntentAbsoluteColorimetric(TODO()),

    kCGRenderingIntentRelativeColorimetric(TODO()),

    kCGRenderingIntentPerceptual(TODO()),

    kCGRenderingIntentSaturation(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGColorRenderingIntent { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGColorRenderingIntent
            get() = TODO()
            set(value: platform.CoreGraphics.CGColorRenderingIntent) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGDataConsumerCallbacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var putBytes: platform.CoreGraphics.CGDataConsumerPutBytesCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */) -> platform.posix.size_t /* = kotlin.ULong */>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataConsumerPutBytesCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */) -> platform.posix.size_t /* = kotlin.ULong */>>? */) = TODO()

    final var releaseConsumer: platform.CoreGraphics.CGDataConsumerReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataConsumerReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class CGDataProviderDirectCallbacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var getBytePointer: platform.CoreGraphics.CGDataProviderGetBytePointerCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderGetBytePointerCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */>>? */) = TODO()

    final var getBytesAtPosition: platform.CoreGraphics.CGDataProviderGetBytesAtPositionCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.off_t /* = kotlin.Long */, platform.posix.size_t /* = kotlin.ULong */) -> platform.posix.size_t /* = kotlin.ULong */>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderGetBytesAtPositionCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.off_t /* = kotlin.Long */, platform.posix.size_t /* = kotlin.ULong */) -> platform.posix.size_t /* = kotlin.ULong */>>? */) = TODO()

    final var releaseBytePointer: platform.CoreGraphics.CGDataProviderReleaseBytePointerCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderReleaseBytePointerCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var releaseInfo: platform.CoreGraphics.CGDataProviderReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var version: kotlin.UInt
        get() = TODO()
        set(value: kotlin.UInt) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class CGDataProviderSequentialCallbacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var getBytes: platform.CoreGraphics.CGDataProviderGetBytesCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */) -> platform.posix.size_t /* = kotlin.ULong */>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderGetBytesCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */) -> platform.posix.size_t /* = kotlin.ULong */>>? */) = TODO()

    final var releaseInfo: platform.CoreGraphics.CGDataProviderReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var rewind: platform.CoreGraphics.CGDataProviderRewindCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderRewindCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var skipForward: platform.CoreGraphics.CGDataProviderSkipForwardCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.off_t /* = kotlin.Long */) -> platform.posix.off_t /* = kotlin.Long */>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGDataProviderSkipForwardCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.off_t /* = kotlin.Long */) -> platform.posix.off_t /* = kotlin.Long */>>? */) = TODO()

    final var version: kotlin.UInt
        get() = TODO()
        set(value: kotlin.UInt) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class CGDeviceColor public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var blue: kotlin.Float
        get() = TODO()
        set(value: kotlin.Float) = TODO()

    final var green: kotlin.Float
        get() = TODO()
        set(value: kotlin.Float) = TODO()

    final var red: kotlin.Float
        get() = TODO()
        set(value: kotlin.Float) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGDisplayStreamFrameStatus private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGDisplayStreamFrameStatusFrameComplete(TODO()),

    kCGDisplayStreamFrameStatusFrameIdle(TODO()),

    kCGDisplayStreamFrameStatusFrameBlank(TODO()),

    kCGDisplayStreamFrameStatusStopped(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGDisplayStreamFrameStatus { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGDisplayStreamFrameStatus
            get() = TODO()
            set(value: platform.CoreGraphics.CGDisplayStreamFrameStatus) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final enum class CGDisplayStreamUpdateRectType private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGDisplayStreamUpdateRefreshedRects(TODO()),

    kCGDisplayStreamUpdateMovedRects(TODO()),

    kCGDisplayStreamUpdateDirtyRects(TODO()),

    kCGDisplayStreamUpdateReducedDirtyRects(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGDisplayStreamUpdateRectType { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGDisplayStreamUpdateRectType
            get() = TODO()
            set(value: platform.CoreGraphics.CGDisplayStreamUpdateRectType) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGFunctionCallbacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var evaluate: platform.CoreGraphics.CGFunctionEvaluateCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFunctionEvaluateCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) -> kotlin.Unit>>? */) = TODO()

    final var releaseInfo: platform.CoreGraphics.CGFunctionReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFunctionReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var version: kotlin.UInt
        get() = TODO()
        set(value: kotlin.UInt) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGImageAlphaInfo private constructor(/*0*/ value: platform.posix.uint32_t /* = kotlin.UInt */): kotlinx.cinterop.CEnum {
    kCGImageAlphaNone(TODO()),

    kCGImageAlphaPremultipliedLast(TODO()),

    kCGImageAlphaPremultipliedFirst(TODO()),

    kCGImageAlphaLast(TODO()),

    kCGImageAlphaFirst(TODO()),

    kCGImageAlphaNoneSkipLast(TODO()),

    kCGImageAlphaNoneSkipFirst(TODO()),

    kCGImageAlphaOnly(TODO());

    open override /*1*/ val value: platform.posix.uint32_t /* = kotlin.UInt */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.uint32_t /* = kotlin.UInt */): platform.CoreGraphics.CGImageAlphaInfo { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGImageAlphaInfo
            get() = TODO()
            set(value: platform.CoreGraphics.CGImageAlphaInfo) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final enum class CGLineCap private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGLineCapButt(TODO()),

    kCGLineCapRound(TODO()),

    kCGLineCapSquare(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGLineCap { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGLineCap
            get() = TODO()
            set(value: platform.CoreGraphics.CGLineCap) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final enum class CGLineJoin private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGLineJoinMiter(TODO()),

    kCGLineJoinRound(TODO()),

    kCGLineJoinBevel(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGLineJoin { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGLineJoin
            get() = TODO()
            set(value: platform.CoreGraphics.CGLineJoin) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final enum class CGPDFDataFormat private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    CGPDFDataFormatRaw(TODO()),

    CGPDFDataFormatJPEGEncoded(TODO()),

    CGPDFDataFormatJPEG2000(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGPDFDataFormat { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGPDFDataFormat
            get() = TODO()
            set(value: platform.CoreGraphics.CGPDFDataFormat) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGPSConverterCallbacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var beginDocument: platform.CoreGraphics.CGPSConverterBeginDocumentCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterBeginDocumentCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var beginPage: platform.CoreGraphics.CGPSConverterBeginPageCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */, platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterBeginPageCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */, platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) -> kotlin.Unit>>? */) = TODO()

    final var endDocument: platform.CoreGraphics.CGPSConverterEndDocumentCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlin.Boolean) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterEndDocumentCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlin.Boolean) -> kotlin.Unit>>? */) = TODO()

    final var endPage: platform.CoreGraphics.CGPSConverterEndPageCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */, platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterEndPageCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */, platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) -> kotlin.Unit>>? */) = TODO()

    final var noteMessage: platform.CoreGraphics.CGPSConverterMessageCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterMessageCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) -> kotlin.Unit>>? */) = TODO()

    final var noteProgress: platform.CoreGraphics.CGPSConverterProgressCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterProgressCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var releaseInfo: platform.CoreGraphics.CGPSConverterReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPSConverterReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var version: kotlin.UInt
        get() = TODO()
        set(value: kotlin.UInt) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGPathDrawingMode private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGPathFill(TODO()),

    kCGPathEOFill(TODO()),

    kCGPathStroke(TODO()),

    kCGPathFillStroke(TODO()),

    kCGPathEOFillStroke(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGPathDrawingMode { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGPathDrawingMode
            get() = TODO()
            set(value: platform.CoreGraphics.CGPathDrawingMode) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGPathElement public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var points: kotlinx.cinterop.CPointer<platform.CoreGraphics.CGPoint>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.CoreGraphics.CGPoint>?) = TODO()

    final var type: platform.CoreGraphics.CGPathElementType
        get() = TODO()
        set(value: platform.CoreGraphics.CGPathElementType) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGPathElementType private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGPathElementMoveToPoint(TODO()),

    kCGPathElementAddLineToPoint(TODO()),

    kCGPathElementAddQuadCurveToPoint(TODO()),

    kCGPathElementAddCurveToPoint(TODO()),

    kCGPathElementCloseSubpath(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGPathElementType { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGPathElementType
            get() = TODO()
            set(value: platform.CoreGraphics.CGPathElementType) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGPatternCallbacks public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var drawPattern: platform.CoreGraphics.CGPatternDrawPatternCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPatternDrawPatternCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) -> kotlin.Unit>>? */) = TODO()

    final var releaseInfo: platform.CoreGraphics.CGPatternReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */
        get() = TODO()
        set(value: platform.CoreGraphics.CGPatternReleaseInfoCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) = TODO()

    final var version: kotlin.UInt
        get() = TODO()
        set(value: kotlin.UInt) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGPatternTiling private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGPatternTilingNoDistortion(TODO()),

    kCGPatternTilingConstantSpacingMinimalDistortion(TODO()),

    kCGPatternTilingConstantSpacing(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGPatternTiling { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGPatternTiling
            get() = TODO()
            set(value: platform.CoreGraphics.CGPatternTiling) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGPoint public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var y: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class CGRect public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val origin: platform.CoreGraphics.CGPoint
        get() = TODO()

    final val size: platform.CoreGraphics.CGSize
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGRectEdge private constructor(/*0*/ value: platform.posix.uint32_t /* = kotlin.UInt */): kotlinx.cinterop.CEnum {
    CGRectMinXEdge(TODO()),

    CGRectMinYEdge(TODO()),

    CGRectMaxXEdge(TODO()),

    CGRectMaxYEdge(TODO());

    open override /*1*/ val value: platform.posix.uint32_t /* = kotlin.UInt */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.uint32_t /* = kotlin.UInt */): platform.CoreGraphics.CGRectEdge { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGRectEdge
            get() = TODO()
            set(value: platform.CoreGraphics.CGRectEdge) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGScreenUpdateMoveDelta public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var dX: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()
        set(value: platform.posix.int32_t /* = kotlin.Int */) = TODO()

    final var dY: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()
        set(value: platform.posix.int32_t /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class CGSize public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var height: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var width: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class CGTextDrawingMode private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGTextFill(TODO()),

    kCGTextStroke(TODO()),

    kCGTextFillStroke(TODO()),

    kCGTextInvisible(TODO()),

    kCGTextFillClip(TODO()),

    kCGTextStrokeClip(TODO()),

    kCGTextFillStrokeClip(TODO()),

    kCGTextClip(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGTextDrawingMode { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGTextDrawingMode
            get() = TODO()
            set(value: platform.CoreGraphics.CGTextDrawingMode) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final enum class CGTextEncoding private constructor(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): kotlinx.cinterop.CEnum {
    kCGEncodingFontSpecific(TODO()),

    kCGEncodingMacRoman(TODO());

    open override /*1*/ val value: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGTextEncoding { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.CoreGraphics.CGTextEncoding
            get() = TODO()
            set(value: platform.CoreGraphics.CGTextEncoding) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class CGVector public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var dx: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    final var dy: platform.CoreGraphics.CGFloat /* = kotlin.Double */
        get() = TODO()
        set(value: platform.CoreGraphics.CGFloat /* = kotlin.Double */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class __CGEventTapInformation public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var avgUsecLatency: kotlin.Float
        get() = TODO()
        set(value: kotlin.Float) = TODO()

    final var enabled: kotlin.Boolean
        get() = TODO()
        set(value: kotlin.Boolean) = TODO()

    final var eventTapID: platform.posix.uint32_t /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.posix.uint32_t /* = kotlin.UInt */) = TODO()

    final var eventsOfInterest: platform.CoreGraphics.CGEventMask /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.CoreGraphics.CGEventMask /* = kotlin.ULong */) = TODO()

    final var maxUsecLatency: kotlin.Float
        get() = TODO()
        set(value: kotlin.Float) = TODO()

    final var minUsecLatency: kotlin.Float
        get() = TODO()
        set(value: kotlin.Float) = TODO()

    final var options: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */) = TODO()

    final var processBeingTapped: platform.posix.pid_t /* = kotlin.Int */
        get() = TODO()
        set(value: platform.posix.pid_t /* = kotlin.Int */) = TODO()

    final var tapPoint: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */) = TODO()

    final var tappingProcess: platform.posix.pid_t /* = kotlin.Int */
        get() = TODO()
        set(value: platform.posix.pid_t /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

typealias CGBitmapContextReleaseDataCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGBitmapContextReleaseDataCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGBitmapContextReleaseDataCallback>

typealias CGBitmapInfo = platform.posix.uint32_t

typealias CGBitmapInfoVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGBitmapInfo>

typealias CGButtonCount = platform.posix.uint32_t

typealias CGButtonCountVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGButtonCount>

typealias CGCaptureOptions = platform.posix.uint32_t

typealias CGCaptureOptionsVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGCaptureOptions>

typealias CGCharCode = platform.posix.uint16_t

typealias CGCharCodeVar = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGCharCode>

typealias CGColorConversionInfoRef = kotlinx.cinterop.CPointer<cnames.structs.CGColorConversionInfo>

typealias CGColorConversionInfoRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGColorConversionInfoRef>

typealias CGColorConversionInfoTransformType = platform.posix.uint32_t

typealias CGColorConversionInfoTransformTypeVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGColorConversionInfoTransformType>

typealias CGColorRef = kotlinx.cinterop.CPointer<cnames.structs.CGColor>

typealias CGColorRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGColorRef>

typealias CGColorSpaceModel = platform.posix.int32_t

typealias CGColorSpaceModelVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGColorSpaceModel>

typealias CGColorSpaceRef = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>

typealias CGColorSpaceRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGColorSpaceRef>

typealias CGConfigureOption = platform.posix.uint32_t

typealias CGConfigureOptionVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGConfigureOption>

typealias CGContextRef = kotlinx.cinterop.CPointer<cnames.structs.CGContext>

typealias CGContextRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGContextRef>

typealias CGDataConsumerPutBytesCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?, platform.posix.size_t) -> platform.posix.size_t>>

typealias CGDataConsumerPutBytesCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataConsumerPutBytesCallback>

typealias CGDataConsumerRef = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>

typealias CGDataConsumerRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataConsumerRef>

typealias CGDataConsumerReleaseInfoCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGDataConsumerReleaseInfoCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataConsumerReleaseInfoCallback>

typealias CGDataProviderGetBytePointerCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlinx.cinterop.COpaquePointer?>>

typealias CGDataProviderGetBytePointerCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderGetBytePointerCallback>

typealias CGDataProviderGetBytesAtPositionCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?, platform.posix.off_t, platform.posix.size_t) -> platform.posix.size_t>>

typealias CGDataProviderGetBytesAtPositionCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderGetBytesAtPositionCallback>

typealias CGDataProviderGetBytesCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?, platform.posix.size_t) -> platform.posix.size_t>>

typealias CGDataProviderGetBytesCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderGetBytesCallback>

typealias CGDataProviderRef = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>

typealias CGDataProviderRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderRef>

typealias CGDataProviderReleaseBytePointerCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGDataProviderReleaseBytePointerCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderReleaseBytePointerCallback>

typealias CGDataProviderReleaseDataCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?, platform.posix.size_t) -> kotlin.Unit>>

typealias CGDataProviderReleaseDataCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderReleaseDataCallback>

typealias CGDataProviderReleaseInfoCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGDataProviderReleaseInfoCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderReleaseInfoCallback>

typealias CGDataProviderRewindCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGDataProviderRewindCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderRewindCallback>

typealias CGDataProviderSkipForwardCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.posix.off_t) -> platform.posix.off_t>>

typealias CGDataProviderSkipForwardCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDataProviderSkipForwardCallback>

typealias CGDirectDisplayID = platform.posix.uint32_t

typealias CGDirectDisplayIDVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDirectDisplayID>

typealias CGDisplayBlendFraction = kotlin.Float

typealias CGDisplayBlendFractionVar = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGDisplayBlendFraction>

typealias CGDisplayChangeSummaryFlags = platform.posix.uint32_t

typealias CGDisplayChangeSummaryFlagsVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDisplayChangeSummaryFlags>

typealias CGDisplayConfigRef = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>

typealias CGDisplayConfigRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDisplayConfigRef>

typealias CGDisplayCount = platform.posix.uint32_t

typealias CGDisplayCountVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDisplayCount>

typealias CGDisplayErr = platform.CoreGraphics.CGError

typealias CGDisplayErrVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGDisplayErr>

typealias CGDisplayFadeInterval = kotlin.Float

typealias CGDisplayFadeIntervalVar = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGDisplayFadeInterval>

typealias CGDisplayFadeReservationToken = platform.posix.uint32_t

typealias CGDisplayFadeReservationTokenVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDisplayFadeReservationToken>

typealias CGDisplayModeRef = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>

typealias CGDisplayModeRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDisplayModeRef>

typealias CGDisplayReconfigurationCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGDirectDisplayID, platform.CoreGraphics.CGDisplayChangeSummaryFlags, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGDisplayReconfigurationCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDisplayReconfigurationCallBack>

typealias CGDisplayReservationInterval = kotlin.Float

typealias CGDisplayReservationIntervalVar = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGDisplayReservationInterval>

typealias CGDisplayStreamFrameAvailableHandler = ((platform.CoreGraphics.CGDisplayStreamFrameStatus, platform.posix.uint64_t, platform.CoreGraphics.IOSurfaceRef?, platform.CoreGraphics.CGDisplayStreamUpdateRef?) -> kotlin.Unit)?

typealias CGDisplayStreamFrameAvailableHandlerVar = kotlinx.cinterop.ObjCBlockVar<platform.CoreGraphics.CGDisplayStreamFrameAvailableHandler>

typealias CGDisplayStreamRef = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStream>

typealias CGDisplayStreamRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDisplayStreamRef>

typealias CGDisplayStreamUpdateRef = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>

typealias CGDisplayStreamUpdateRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDisplayStreamUpdateRef>

typealias CGError = platform.posix.int32_t

typealias CGErrorVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGError>

typealias CGEventErr = platform.CoreGraphics.CGError

typealias CGEventErrVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGEventErr>

typealias CGEventField = platform.posix.uint32_t

typealias CGEventFieldVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventField>

typealias CGEventFilterMask = platform.posix.uint32_t

typealias CGEventFilterMaskVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventFilterMask>

typealias CGEventFlags = platform.posix.uint64_t

typealias CGEventFlagsVar = kotlinx.cinterop.ULongVarOf<platform.CoreGraphics.CGEventFlags>

typealias CGEventMask = platform.posix.uint64_t

typealias CGEventMaskVar = kotlinx.cinterop.ULongVarOf<platform.CoreGraphics.CGEventMask>

typealias CGEventMouseSubtype = platform.posix.uint32_t

typealias CGEventMouseSubtypeVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventMouseSubtype>

typealias CGEventRef = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>

typealias CGEventRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGEventRef>

typealias CGEventSourceKeyboardType = platform.posix.uint32_t

typealias CGEventSourceKeyboardTypeVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventSourceKeyboardType>

typealias CGEventSourceRef = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>

typealias CGEventSourceRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGEventSourceRef>

typealias CGEventSourceStateID = platform.posix.int32_t

typealias CGEventSourceStateIDVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGEventSourceStateID>

typealias CGEventSuppressionState = platform.posix.uint32_t

typealias CGEventSuppressionStateVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventSuppressionState>

typealias CGEventTapCallBack = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGEventTapProxy?, platform.CoreGraphics.CGEventType, platform.CoreGraphics.CGEventRef?, kotlinx.cinterop.COpaquePointer?) -> platform.CoreGraphics.CGEventRef?>>

typealias CGEventTapCallBackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGEventTapCallBack>

typealias CGEventTapInformation = platform.CoreGraphics.__CGEventTapInformation

typealias CGEventTapLocation = platform.posix.uint32_t

typealias CGEventTapLocationVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventTapLocation>

typealias CGEventTapOptions = platform.posix.uint32_t

typealias CGEventTapOptionsVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventTapOptions>

typealias CGEventTapPlacement = platform.posix.uint32_t

typealias CGEventTapPlacementVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventTapPlacement>

typealias CGEventTapProxy = kotlinx.cinterop.CPointer<cnames.structs.__CGEventTapProxy>

typealias CGEventTapProxyVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGEventTapProxy>

typealias CGEventTimestamp = platform.posix.uint64_t

typealias CGEventTimestampVar = kotlinx.cinterop.ULongVarOf<platform.CoreGraphics.CGEventTimestamp>

typealias CGEventType = platform.posix.uint32_t

typealias CGEventTypeVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGEventType>

typealias CGFloat = kotlin.Double

typealias CGFloatVar = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat>

typealias CGFontIndex = kotlin.UShort

typealias CGFontIndexVar = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGFontIndex>

typealias CGFontPostScriptFormat = platform.posix.int32_t

typealias CGFontPostScriptFormatVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGFontPostScriptFormat>

typealias CGFontRef = kotlinx.cinterop.CPointer<cnames.structs.CGFont>

typealias CGFontRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGFontRef>

typealias CGFunctionEvaluateCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar>?, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar>?) -> kotlin.Unit>>

typealias CGFunctionEvaluateCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGFunctionEvaluateCallback>

typealias CGFunctionRef = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>

typealias CGFunctionRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGFunctionRef>

typealias CGFunctionReleaseInfoCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGFunctionReleaseInfoCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGFunctionReleaseInfoCallback>

typealias CGGammaValue = kotlin.Float

typealias CGGammaValueVar = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue>

typealias CGGesturePhase = platform.posix.uint32_t

typealias CGGesturePhaseVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGGesturePhase>

typealias CGGlyph = platform.CoreGraphics.CGFontIndex

typealias CGGlyphDeprecatedEnum = platform.posix.int32_t

typealias CGGlyphDeprecatedEnumVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGGlyphDeprecatedEnum>

typealias CGGlyphVar = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph>

typealias CGGradientDrawingOptions = platform.posix.uint32_t

typealias CGGradientDrawingOptionsVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGGradientDrawingOptions>

typealias CGGradientRef = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>

typealias CGGradientRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGGradientRef>

typealias CGImageByteOrderInfo = platform.posix.uint32_t

typealias CGImageByteOrderInfoVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGImageByteOrderInfo>

typealias CGImagePixelFormatInfo = platform.posix.uint32_t

typealias CGImagePixelFormatInfoVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGImagePixelFormatInfo>

typealias CGImageRef = kotlinx.cinterop.CPointer<cnames.structs.CGImage>

typealias CGImageRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGImageRef>

typealias CGInterpolationQuality = platform.posix.int32_t

typealias CGInterpolationQualityVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGInterpolationQuality>

typealias CGKeyCode = platform.posix.uint16_t

typealias CGKeyCodeVar = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGKeyCode>

typealias CGLayerRef = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>

typealias CGLayerRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGLayerRef>

typealias CGMomentumScrollPhase = platform.posix.uint32_t

typealias CGMomentumScrollPhaseVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGMomentumScrollPhase>

typealias CGMouseButton = platform.posix.uint32_t

typealias CGMouseButtonVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGMouseButton>

typealias CGMutablePathRef = kotlinx.cinterop.CPointer<cnames.structs.CGPath>

typealias CGMutablePathRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGMutablePathRef>

typealias CGOpenGLDisplayMask = platform.posix.uint32_t

typealias CGOpenGLDisplayMaskVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGOpenGLDisplayMask>

typealias CGPDFAccessPermissions = platform.posix.uint32_t

typealias CGPDFAccessPermissionsVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGPDFAccessPermissions>

typealias CGPDFArrayApplierBlock = ((platform.posix.size_t, platform.CoreGraphics.CGPDFObjectRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Boolean)?

typealias CGPDFArrayApplierBlockVar = kotlinx.cinterop.ObjCBlockVar<platform.CoreGraphics.CGPDFArrayApplierBlock>

typealias CGPDFArrayRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>

typealias CGPDFArrayRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFArrayRef>

typealias CGPDFBoolean = kotlin.UByte

typealias CGPDFBooleanVar = kotlinx.cinterop.UByteVarOf<platform.CoreGraphics.CGPDFBoolean>

typealias CGPDFBox = platform.posix.int32_t

typealias CGPDFBoxVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGPDFBox>

typealias CGPDFContentStreamRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>

typealias CGPDFContentStreamRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFContentStreamRef>

typealias CGPDFDictionaryApplierBlock = ((kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, platform.CoreGraphics.CGPDFObjectRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Boolean)?

typealias CGPDFDictionaryApplierBlockVar = kotlinx.cinterop.ObjCBlockVar<platform.CoreGraphics.CGPDFDictionaryApplierBlock>

typealias CGPDFDictionaryApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?, platform.CoreGraphics.CGPDFObjectRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGPDFDictionaryApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFDictionaryApplierFunction>

typealias CGPDFDictionaryRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>

typealias CGPDFDictionaryRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFDictionaryRef>

typealias CGPDFDocumentRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>

typealias CGPDFDocumentRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFDocumentRef>

typealias CGPDFInteger = kotlin.Long

typealias CGPDFIntegerVar = kotlinx.cinterop.LongVarOf<platform.CoreGraphics.CGPDFInteger>

typealias CGPDFObjectRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>

typealias CGPDFObjectRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFObjectRef>

typealias CGPDFObjectType = platform.posix.int32_t

typealias CGPDFObjectTypeVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGPDFObjectType>

typealias CGPDFOperatorCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGPDFScannerRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGPDFOperatorCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFOperatorCallback>

typealias CGPDFOperatorTableRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>

typealias CGPDFOperatorTableRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFOperatorTableRef>

typealias CGPDFPageRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>

typealias CGPDFPageRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFPageRef>

typealias CGPDFReal = platform.CoreGraphics.CGFloat

typealias CGPDFRealVar = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGPDFReal>

typealias CGPDFScannerRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>

typealias CGPDFScannerRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFScannerRef>

typealias CGPDFStreamRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream>

typealias CGPDFStreamRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStreamRef>

typealias CGPDFStringRef = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString>

typealias CGPDFStringRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStringRef>

typealias CGPSConverterBeginDocumentCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGPSConverterBeginDocumentCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterBeginDocumentCallback>

typealias CGPSConverterBeginPageCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.posix.size_t, platform.CoreFoundation.CFDictionaryRef?) -> kotlin.Unit>>

typealias CGPSConverterBeginPageCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterBeginPageCallback>

typealias CGPSConverterEndDocumentCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlin.Boolean) -> kotlin.Unit>>

typealias CGPSConverterEndDocumentCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterEndDocumentCallback>

typealias CGPSConverterEndPageCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.posix.size_t, platform.CoreFoundation.CFDictionaryRef?) -> kotlin.Unit>>

typealias CGPSConverterEndPageCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterEndPageCallback>

typealias CGPSConverterMessageCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.CoreFoundation.CFStringRef?) -> kotlin.Unit>>

typealias CGPSConverterMessageCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterMessageCallback>

typealias CGPSConverterProgressCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGPSConverterProgressCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterProgressCallback>

typealias CGPSConverterRef = kotlinx.cinterop.CPointer<cnames.structs.CGPSConverter>

typealias CGPSConverterRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterRef>

typealias CGPSConverterReleaseInfoCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGPSConverterReleaseInfoCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPSConverterReleaseInfoCallback>

typealias CGPathApplierFunction = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGPathElement>?) -> kotlin.Unit>>

typealias CGPathApplierFunctionVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPathApplierFunction>

typealias CGPathApplyBlock = ((kotlinx.cinterop.CPointer<platform.CoreGraphics.CGPathElement>?) -> kotlin.Unit)?

typealias CGPathApplyBlockVar = kotlinx.cinterop.ObjCBlockVar<platform.CoreGraphics.CGPathApplyBlock>

typealias CGPathRef = kotlinx.cinterop.CPointer<cnames.structs.CGPath>

typealias CGPathRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPathRef>

typealias CGPatternDrawPatternCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.CoreGraphics.CGContextRef?) -> kotlin.Unit>>

typealias CGPatternDrawPatternCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPatternDrawPatternCallback>

typealias CGPatternRef = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>

typealias CGPatternRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPatternRef>

typealias CGPatternReleaseInfoCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGPatternReleaseInfoCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPatternReleaseInfoCallback>

typealias CGRectCount = platform.posix.uint32_t

typealias CGRectCountVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGRectCount>

typealias CGRefreshRate = kotlin.Double

typealias CGRefreshRateVar = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGRefreshRate>

typealias CGScreenRefreshCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.posix.uint32_t, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGScreenRefreshCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGScreenRefreshCallback>

typealias CGScreenUpdateMoveCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CValue<platform.CoreGraphics.CGScreenUpdateMoveDelta>, platform.posix.size_t, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias CGScreenUpdateMoveCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGScreenUpdateMoveCallback>

typealias CGScreenUpdateOperation = platform.posix.uint32_t

typealias CGScreenUpdateOperationVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGScreenUpdateOperation>

typealias CGScrollEventUnit = platform.posix.uint32_t

typealias CGScrollEventUnitVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGScrollEventUnit>

typealias CGScrollPhase = platform.posix.uint32_t

typealias CGScrollPhaseVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGScrollPhase>

typealias CGShadingRef = kotlinx.cinterop.CPointer<cnames.structs.CGShading>

typealias CGShadingRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGShadingRef>

typealias CGWheelCount = platform.posix.uint32_t

typealias CGWheelCountVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGWheelCount>

typealias CGWindowBackingType = platform.posix.uint32_t

typealias CGWindowBackingTypeVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGWindowBackingType>

typealias CGWindowID = platform.posix.uint32_t

typealias CGWindowIDVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGWindowID>

typealias CGWindowImageOption = platform.posix.uint32_t

typealias CGWindowImageOptionVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGWindowImageOption>

typealias CGWindowLevel = platform.posix.int32_t

typealias CGWindowLevelKey = platform.posix.int32_t

typealias CGWindowLevelKeyVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGWindowLevelKey>

typealias CGWindowLevelVar = kotlinx.cinterop.IntVarOf<platform.CoreGraphics.CGWindowLevel>

typealias CGWindowListOption = platform.posix.uint32_t

typealias CGWindowListOptionVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGWindowListOption>

typealias CGWindowSharingType = platform.posix.uint32_t

typealias CGWindowSharingTypeVar = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGWindowSharingType>

typealias IOSurfaceRef = kotlinx.cinterop.CPointer<cnames.structs.__IOSurface>

typealias IOSurfaceRefVar = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.IOSurfaceRef>

val CGAffineTransformIdentity: platform.CoreGraphics.CGAffineTransform
    get() = TODO()

const val CGDisplayNoErr: platform.posix.int32_t /* = kotlin.Int */ = 0

const val CGEventNoErr: platform.posix.int32_t /* = kotlin.Int */ = 0

const val CGFLOAT_DEFINED: kotlin.Int = 0

const val CGFLOAT_IS_DOUBLE: kotlin.Int = 0

val CGFLOAT_MAX: kotlin.Double
    get() = TODO()

val CGFLOAT_MIN: kotlin.Double
    get() = TODO()

val CGGlyphMax: platform.CoreGraphics.CGGlyphDeprecatedEnum /* = kotlin.Int */
    get() = TODO()

val CGGlyphMin: platform.CoreGraphics.CGGlyphDeprecatedEnum /* = kotlin.Int */
    get() = TODO()

val CGPointZero: platform.CoreGraphics.CGPoint
    get() = TODO()

val CGRectInfinite: platform.CoreGraphics.CGRect
    get() = TODO()

val CGRectNull: platform.CoreGraphics.CGRect
    get() = TODO()

val CGRectZero: platform.CoreGraphics.CGRect
    get() = TODO()

val CGSizeZero: platform.CoreGraphics.CGSize
    get() = TODO()

const val CGVECTOR_DEFINED: kotlin.Int = 0

val kCGAnnotatedSessionEventTap: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */
    get() = TODO()

const val kCGAssistiveTechHighWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGAssistiveTechHighWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGBackingStoreBuffered: platform.CoreGraphics.CGWindowBackingType /* = kotlin.UInt */
    get() = TODO()

val kCGBackingStoreNonretained: platform.CoreGraphics.CGWindowBackingType /* = kotlin.UInt */
    get() = TODO()

val kCGBackingStoreRetained: platform.CoreGraphics.CGWindowBackingType /* = kotlin.UInt */
    get() = TODO()

const val kCGBackstopMenuLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGBackstopMenuLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGBaseWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGBaseWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGBitmapAlphaInfoMask: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGBitmapByteOrder16Big: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

const val kCGBitmapByteOrder16Host: platform.posix.uint32_t /* = kotlin.UInt */ = 0u

val kCGBitmapByteOrder16Little: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGBitmapByteOrder32Big: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

const val kCGBitmapByteOrder32Host: platform.posix.uint32_t /* = kotlin.UInt */ = 0u

val kCGBitmapByteOrder32Little: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGBitmapByteOrderDefault: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGBitmapByteOrderMask: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGBitmapFloatComponents: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGBitmapFloatInfoMask: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */
    get() = TODO()

val kCGCaptureNoFill: platform.CoreGraphics.CGCaptureOptions /* = kotlin.UInt */
    get() = TODO()

val kCGCaptureNoOptions: platform.CoreGraphics.CGCaptureOptions /* = kotlin.UInt */
    get() = TODO()

val kCGColorBlack: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorClear: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorConversionBlackPointCompensation: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorConversionTRCSize: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorConversionTransformApplySpace: platform.CoreGraphics.CGColorConversionInfoTransformType /* = kotlin.UInt */
    get() = TODO()

val kCGColorConversionTransformFromSpace: platform.CoreGraphics.CGColorConversionInfoTransformType /* = kotlin.UInt */
    get() = TODO()

val kCGColorConversionTransformToSpace: platform.CoreGraphics.CGColorConversionInfoTransformType /* = kotlin.UInt */
    get() = TODO()

val kCGColorSpaceACESCGLinear: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceAdobeRGB1998: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceDCIP3: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceDisplayP3: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceExtendedGray: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceExtendedLinearGray: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceExtendedLinearSRGB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceExtendedSRGB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericCMYK: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericGray: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericGrayGamma2_2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericLab: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericRGB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericRGBLinear: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceGenericXYZ: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceITUR_2020: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceITUR_709: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceLinearGray: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceLinearSRGB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceModelCMYK: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelDeviceN: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelIndexed: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelLab: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelMonochrome: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelPattern: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelRGB: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelUnknown: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceModelXYZ: platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */
    get() = TODO()

val kCGColorSpaceROMMRGB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorSpaceSRGB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGColorWhite: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGConfigureForAppOnly: platform.CoreGraphics.CGConfigureOption /* = kotlin.UInt */
    get() = TODO()

val kCGConfigureForSession: platform.CoreGraphics.CGConfigureOption /* = kotlin.UInt */
    get() = TODO()

val kCGConfigurePermanently: platform.CoreGraphics.CGConfigureOption /* = kotlin.UInt */
    get() = TODO()

const val kCGCursorWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGCursorWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGDesktopIconWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGDesktopIconWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGDesktopWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGDesktopWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGDisplayAddFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayBeginConfigurationFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayBitsPerPixel: kotlin.String
    get() = TODO()

val kCGDisplayBitsPerSample: kotlin.String
    get() = TODO()

val kCGDisplayBlendNormal: kotlin.Double
    get() = TODO()

val kCGDisplayBlendSolidColor: kotlin.Double
    get() = TODO()

val kCGDisplayBytesPerRow: kotlin.String
    get() = TODO()

val kCGDisplayDesktopShapeChangedFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayDisabledFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayEnabledFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

const val kCGDisplayFadeReservationInvalidToken: kotlin.Int = 0

val kCGDisplayHeight: kotlin.String
    get() = TODO()

val kCGDisplayIOFlags: kotlin.String
    get() = TODO()

val kCGDisplayMirrorFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayMode: kotlin.String
    get() = TODO()

val kCGDisplayModeIsInterlaced: kotlin.String
    get() = TODO()

val kCGDisplayModeIsSafeForHardware: kotlin.String
    get() = TODO()

val kCGDisplayModeIsStretched: kotlin.String
    get() = TODO()

val kCGDisplayModeIsTelevisionOutput: kotlin.String
    get() = TODO()

val kCGDisplayModeUsableForDesktopGUI: kotlin.String
    get() = TODO()

val kCGDisplayMovedFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayRefreshRate: kotlin.String
    get() = TODO()

val kCGDisplayRemoveFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplaySamplesPerPixel: kotlin.String
    get() = TODO()

val kCGDisplaySetMainFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplaySetModeFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayShowDuplicateLowResolutionModes: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamColorSpace: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamDestinationRect: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamMinimumFrameTime: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamPreserveAspectRatio: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamQueueDepth: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamShowCursor: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamSourceRect: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamYCbCrMatrix: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamYCbCrMatrix_ITU_R_601_4: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamYCbCrMatrix_ITU_R_709_2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayStreamYCbCrMatrix_SMPTE_240M_1995: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGDisplayUnMirrorFlag: platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */
    get() = TODO()

val kCGDisplayWidth: kotlin.String
    get() = TODO()

const val kCGDockWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGDockWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGDraggingWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGDraggingWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGErrorCannotComplete: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorFailure: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorIllegalArgument: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorInvalidConnection: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorInvalidContext: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorInvalidOperation: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorNoneAvailable: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorNotImplemented: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorRangeCheck: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorSuccess: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

val kCGErrorTypeCheck: platform.CoreGraphics.CGError /* = kotlin.Int */
    get() = TODO()

const val kCGEventFilterMaskPermitAllEvents: kotlin.UInt = 0u

val kCGEventFilterMaskPermitLocalKeyboardEvents: platform.CoreGraphics.CGEventFilterMask /* = kotlin.UInt */
    get() = TODO()

val kCGEventFilterMaskPermitLocalMouseEvents: platform.CoreGraphics.CGEventFilterMask /* = kotlin.UInt */
    get() = TODO()

val kCGEventFilterMaskPermitSystemDefinedEvents: platform.CoreGraphics.CGEventFilterMask /* = kotlin.UInt */
    get() = TODO()

val kCGEventFlagMaskAlphaShift: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskAlternate: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskCommand: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskControl: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskHelp: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskNonCoalesced: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskNumericPad: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskSecondaryFn: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagMaskShift: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */
    get() = TODO()

val kCGEventFlagsChanged: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventKeyDown: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventKeyUp: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventLeftMouseDown: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventLeftMouseDragged: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventLeftMouseUp: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

const val kCGEventMaskForAllEvents: platform.CoreGraphics.CGEventMask /* = kotlin.ULong */ = 0u

val kCGEventMouseMoved: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventMouseSubtypeDefault: platform.CoreGraphics.CGEventMouseSubtype /* = kotlin.UInt */
    get() = TODO()

val kCGEventMouseSubtypeTabletPoint: platform.CoreGraphics.CGEventMouseSubtype /* = kotlin.UInt */
    get() = TODO()

val kCGEventMouseSubtypeTabletProximity: platform.CoreGraphics.CGEventMouseSubtype /* = kotlin.UInt */
    get() = TODO()

val kCGEventNull: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventOtherMouseDown: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventOtherMouseDragged: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventOtherMouseUp: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventRightMouseDown: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventRightMouseDragged: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventRightMouseUp: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventScrollWheel: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventSourceGroupID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGEventSourceStateCombinedSessionState: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */
    get() = TODO()

val kCGEventSourceStateHIDSystemState: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */
    get() = TODO()

val kCGEventSourceStateID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGEventSourceStatePrivate: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */
    get() = TODO()

val kCGEventSourceUnixProcessID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGEventSourceUserData: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGEventSourceUserID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGEventSuppressionStateRemoteMouseDrag: platform.CoreGraphics.CGEventSuppressionState /* = kotlin.UInt */
    get() = TODO()

val kCGEventSuppressionStateSuppressionInterval: platform.CoreGraphics.CGEventSuppressionState /* = kotlin.UInt */
    get() = TODO()

const val kCGEventSupressionStateRemoteMouseDrag: platform.posix.uint32_t /* = kotlin.UInt */ = 0u

const val kCGEventSupressionStateSupressionInterval: platform.posix.uint32_t /* = kotlin.UInt */ = 0u

val kCGEventTabletPointer: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventTabletProximity: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventTapDisabledByTimeout: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventTapDisabledByUserInput: platform.CoreGraphics.CGEventType /* = kotlin.UInt */
    get() = TODO()

val kCGEventTapOptionDefault: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */
    get() = TODO()

val kCGEventTapOptionListenOnly: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */
    get() = TODO()

val kCGEventTargetProcessSerialNumber: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGEventTargetUnixProcessID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

const val kCGFloatingWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGFloatingWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGFontIndexInvalid: platform.CoreGraphics.CGFontIndex /* = kotlin.UShort */
    get() = TODO()

val kCGFontIndexMax: platform.CoreGraphics.CGFontIndex /* = kotlin.UShort */
    get() = TODO()

val kCGFontPostScriptFormatType1: platform.CoreGraphics.CGFontPostScriptFormat /* = kotlin.Int */
    get() = TODO()

val kCGFontPostScriptFormatType3: platform.CoreGraphics.CGFontPostScriptFormat /* = kotlin.Int */
    get() = TODO()

val kCGFontPostScriptFormatType42: platform.CoreGraphics.CGFontPostScriptFormat /* = kotlin.Int */
    get() = TODO()

val kCGFontVariationAxisDefaultValue: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGFontVariationAxisMaxValue: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGFontVariationAxisMinValue: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGFontVariationAxisName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGGesturePhaseBegan: platform.CoreGraphics.CGGesturePhase /* = kotlin.UInt */
    get() = TODO()

val kCGGesturePhaseCancelled: platform.CoreGraphics.CGGesturePhase /* = kotlin.UInt */
    get() = TODO()

val kCGGesturePhaseChanged: platform.CoreGraphics.CGGesturePhase /* = kotlin.UInt */
    get() = TODO()

val kCGGesturePhaseEnded: platform.CoreGraphics.CGGesturePhase /* = kotlin.UInt */
    get() = TODO()

val kCGGesturePhaseMayBegin: platform.CoreGraphics.CGGesturePhase /* = kotlin.UInt */
    get() = TODO()

val kCGGesturePhaseNone: platform.CoreGraphics.CGGesturePhase /* = kotlin.UInt */
    get() = TODO()

val kCGGlyphMax: platform.CoreGraphics.CGFontIndex /* = kotlin.UShort */
    get() = TODO()

val kCGGradientDrawsAfterEndLocation: platform.CoreGraphics.CGGradientDrawingOptions /* = kotlin.UInt */
    get() = TODO()

val kCGGradientDrawsBeforeStartLocation: platform.CoreGraphics.CGGradientDrawingOptions /* = kotlin.UInt */
    get() = TODO()

val kCGHIDEventTap: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */
    get() = TODO()

val kCGHeadInsertEventTap: platform.CoreGraphics.CGEventTapPlacement /* = kotlin.UInt */
    get() = TODO()

const val kCGHelpWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGHelpWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGIODisplayModeID: kotlin.String
    get() = TODO()

val kCGImageByteOrder16Big: platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImageByteOrder16Little: platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImageByteOrder32Big: platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImageByteOrder32Little: platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImageByteOrderDefault: platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImageByteOrderMask: platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImagePixelFormatMask: platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImagePixelFormatPacked: platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImagePixelFormatRGB101010: platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImagePixelFormatRGB555: platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImagePixelFormatRGB565: platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */
    get() = TODO()

val kCGImagePixelFormatRGBCIF10: platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */
    get() = TODO()

val kCGInterpolationDefault: platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */
    get() = TODO()

val kCGInterpolationHigh: platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */
    get() = TODO()

val kCGInterpolationLow: platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */
    get() = TODO()

val kCGInterpolationMedium: platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */
    get() = TODO()

val kCGInterpolationNone: platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */
    get() = TODO()

val kCGKeyboardEventAutorepeat: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGKeyboardEventKeyboardType: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGKeyboardEventKeycode: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

const val kCGMainMenuWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGMainMenuWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGMaxDisplayReservationInterval: platform.CoreGraphics.CGDisplayReservationInterval /* = kotlin.Float */
    get() = TODO()

const val kCGMaximumWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGMaximumWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGMinimumWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGMinimumWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGModalPanelWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGModalPanelWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGMomentumScrollPhaseBegin: platform.CoreGraphics.CGMomentumScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGMomentumScrollPhaseContinue: platform.CoreGraphics.CGMomentumScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGMomentumScrollPhaseEnd: platform.CoreGraphics.CGMomentumScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGMomentumScrollPhaseNone: platform.CoreGraphics.CGMomentumScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGMouseButtonCenter: platform.CoreGraphics.CGMouseButton /* = kotlin.UInt */
    get() = TODO()

val kCGMouseButtonLeft: platform.CoreGraphics.CGMouseButton /* = kotlin.UInt */
    get() = TODO()

val kCGMouseButtonRight: platform.CoreGraphics.CGMouseButton /* = kotlin.UInt */
    get() = TODO()

val kCGMouseDownEventMaskingDeadSwitchTimeout: kotlin.Double
    get() = TODO()

val kCGMouseEventButtonNumber: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventClickState: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventDeltaX: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventDeltaY: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventInstantMouser: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventNumber: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventPressure: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventSubtype: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventWindowUnderMousePointer: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGMouseEventWindowUnderMousePointerThatCanHandleThisEvent: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

const val kCGNormalWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGNormalWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGNotifyEventTapAdded: kotlin.String
    get() = TODO()

val kCGNotifyEventTapRemoved: kotlin.String
    get() = TODO()

val kCGNotifyGUIConsoleSessionChanged: kotlin.String
    get() = TODO()

val kCGNotifyGUISessionUserChanged: kotlin.String
    get() = TODO()

const val kCGNullDirectDisplay: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */ = 0u

const val kCGNullWindowID: platform.CoreGraphics.CGWindowID /* = kotlin.UInt */ = 0u

const val kCGNumReservedBaseWindowLevels: kotlin.Int = 0

const val kCGNumReservedWindowLevels: kotlin.Int = 0

val kCGNumberOfEventSuppressionStates: platform.CoreGraphics.CGEventSuppressionState /* = kotlin.UInt */
    get() = TODO()

const val kCGNumberOfEventSupressionStates: platform.posix.uint32_t /* = kotlin.UInt */ = 0u

val kCGNumberOfWindowLevelKeys: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGOverlayWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGOverlayWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGPDFAllowsCommenting: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsContentAccessibility: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsContentCopying: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsDocumentAssembly: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsDocumentChanges: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsFormFieldEntry: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsHighQualityPrinting: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFAllowsLowQualityPrinting: platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */
    get() = TODO()

val kCGPDFArtBox: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */
    get() = TODO()

val kCGPDFBleedBox: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */
    get() = TODO()

val kCGPDFContextAccessPermissions: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextAllowsCopying: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextAllowsPrinting: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextArtBox: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextAuthor: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextBleedBox: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextCreator: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextCropBox: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextEncryptionKeyLength: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextKeywords: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextMediaBox: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextOutputIntent: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextOutputIntents: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextOwnerPassword: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextSubject: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextTitle: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextTrimBox: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFContextUserPassword: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFCropBox: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */
    get() = TODO()

val kCGPDFMediaBox: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeArray: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeBoolean: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeDictionary: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeInteger: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeName: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeNull: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeReal: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeStream: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFObjectTypeString: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */
    get() = TODO()

val kCGPDFOutlineChildren: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFOutlineDestination: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFOutlineDestinationRect: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFOutlineTitle: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFTrimBox: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */
    get() = TODO()

val kCGPDFXDestinationOutputProfile: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFXInfo: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFXOutputCondition: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFXOutputConditionIdentifier: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFXOutputIntentSubtype: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGPDFXRegistryName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

const val kCGPopUpMenuWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGPopUpMenuWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGScreenSaverWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGScreenSaverWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGScreenUpdateOperationMove: platform.CoreGraphics.CGScreenUpdateOperation /* = kotlin.UInt */
    get() = TODO()

val kCGScreenUpdateOperationReducedDirtyRectangleCount: platform.CoreGraphics.CGScreenUpdateOperation /* = kotlin.UInt */
    get() = TODO()

val kCGScreenUpdateOperationRefresh: platform.CoreGraphics.CGScreenUpdateOperation /* = kotlin.UInt */
    get() = TODO()

val kCGScrollEventUnitLine: platform.CoreGraphics.CGScrollEventUnit /* = kotlin.UInt */
    get() = TODO()

val kCGScrollEventUnitPixel: platform.CoreGraphics.CGScrollEventUnit /* = kotlin.UInt */
    get() = TODO()

val kCGScrollPhaseBegan: platform.CoreGraphics.CGScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGScrollPhaseCancelled: platform.CoreGraphics.CGScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGScrollPhaseChanged: platform.CoreGraphics.CGScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGScrollPhaseEnded: platform.CoreGraphics.CGScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGScrollPhaseMayBegin: platform.CoreGraphics.CGScrollPhase /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventDeltaAxis1: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventDeltaAxis2: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventDeltaAxis3: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventFixedPtDeltaAxis1: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventFixedPtDeltaAxis2: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventFixedPtDeltaAxis3: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventInstantMouser: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventIsContinuous: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventMomentumPhase: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventPointDeltaAxis1: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventPointDeltaAxis2: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventPointDeltaAxis3: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventScrollCount: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGScrollWheelEventScrollPhase: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGSessionConsoleSetKey: kotlin.String
    get() = TODO()

val kCGSessionEventTap: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */
    get() = TODO()

val kCGSessionLoginDoneKey: kotlin.String
    get() = TODO()

val kCGSessionOnConsoleKey: kotlin.String
    get() = TODO()

val kCGSessionUserIDKey: kotlin.String
    get() = TODO()

val kCGSessionUserNameKey: kotlin.String
    get() = TODO()

const val kCGStatusWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGStatusWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGTabletEventDeviceID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventPointButtons: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventPointPressure: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventPointX: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventPointY: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventPointZ: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventRotation: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventTangentialPressure: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventTiltX: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventTiltY: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventVendor1: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventVendor2: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletEventVendor3: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventCapabilityMask: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventDeviceID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventEnterProximity: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventPointerID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventPointerType: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventSystemTabletID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventTabletID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventVendorID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventVendorPointerSerialNumber: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventVendorPointerType: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTabletProximityEventVendorUniqueID: platform.CoreGraphics.CGEventField /* = kotlin.UInt */
    get() = TODO()

val kCGTailAppendEventTap: platform.CoreGraphics.CGEventTapPlacement /* = kotlin.UInt */
    get() = TODO()

const val kCGTornOffMenuWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGTornOffMenuWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

const val kCGUtilityWindowLevel: platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ = 0

val kCGUtilityWindowLevelKey: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */
    get() = TODO()

val kCGWindowAlpha: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

const val kCGWindowBackingCFNumberType: platform.CoreFoundation.CFIndex /* = kotlin.Long */ = 0L

val kCGWindowBackingLocationVideoMemory: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowBounds: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

const val kCGWindowIDCFNumberType: platform.CoreFoundation.CFIndex /* = kotlin.Long */ = 0L

val kCGWindowImageBestResolution: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowImageBoundsIgnoreFraming: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowImageDefault: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowImageNominalResolution: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowImageOnlyShadows: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowImageShouldBeOpaque: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowIsOnscreen: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowLayer: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowListExcludeDesktopElements: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowListOptionAll: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowListOptionIncludingWindow: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowListOptionOnScreenAboveWindow: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowListOptionOnScreenBelowWindow: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowListOptionOnScreenOnly: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */
    get() = TODO()

val kCGWindowMemoryUsage: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowNumber: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowOwnerName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowOwnerPID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

const val kCGWindowSharingCFNumberType: platform.CoreFoundation.CFIndex /* = kotlin.Long */ = 0L

val kCGWindowSharingNone: platform.CoreGraphics.CGWindowSharingType /* = kotlin.UInt */
    get() = TODO()

val kCGWindowSharingReadOnly: platform.CoreGraphics.CGWindowSharingType /* = kotlin.UInt */
    get() = TODO()

val kCGWindowSharingReadWrite: platform.CoreGraphics.CGWindowSharingType /* = kotlin.UInt */
    get() = TODO()

val kCGWindowSharingState: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowStoreType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kCGWindowWorkspace: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

fun CGAcquireDisplayFadeReservation(/*0*/ seconds: platform.CoreGraphics.CGDisplayReservationInterval /* = kotlin.Float */, /*1*/ token: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDisplayFadeReservationTokenVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDisplayFadeReservationToken /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGAffineTransformConcat(/*0*/ t1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>, /*1*/ t2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformEqualToTransform(/*0*/ t1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>, /*1*/ t2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlin.Boolean { TODO() }

fun CGAffineTransformInvert(/*0*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformIsIdentity(/*0*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlin.Boolean { TODO() }

fun CGAffineTransformMake(/*0*/ a: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ b: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ c: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ d: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ tx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ ty: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformMakeRotation(/*0*/ angle: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformMakeScale(/*0*/ sx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ sy: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformMakeTranslation(/*0*/ tx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ ty: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformRotate(/*0*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>, /*1*/ angle: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformScale(/*0*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>, /*1*/ sx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ sy: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAffineTransformTranslate(/*0*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>, /*1*/ tx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ ty: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGAssociateMouseAndMouseCursorPosition(/*0*/ connected: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGBeginDisplayConfiguration(/*0*/ config: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDisplayConfigRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGDisplayConfigRef /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef> */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGBitmapContextCreate(/*0*/ data: kotlinx.cinterop.CValuesRef<*>?, /*1*/ width: platform.posix.size_t /* = kotlin.ULong */, /*2*/ height: platform.posix.size_t /* = kotlin.ULong */, /*3*/ bitsPerComponent: platform.posix.size_t /* = kotlin.ULong */, /*4*/ bytesPerRow: platform.posix.size_t /* = kotlin.ULong */, /*5*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*6*/ bitmapInfo: platform.posix.uint32_t /* = kotlin.UInt */): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGBitmapContextCreateImage(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGBitmapContextCreateWithData(/*0*/ data: kotlinx.cinterop.CValuesRef<*>?, /*1*/ width: platform.posix.size_t /* = kotlin.ULong */, /*2*/ height: platform.posix.size_t /* = kotlin.ULong */, /*3*/ bitsPerComponent: platform.posix.size_t /* = kotlin.ULong */, /*4*/ bytesPerRow: platform.posix.size_t /* = kotlin.ULong */, /*5*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*6*/ bitmapInfo: platform.posix.uint32_t /* = kotlin.UInt */, /*7*/ releaseCallback: platform.CoreGraphics.CGBitmapContextReleaseDataCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*8*/ releaseInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGBitmapContextGetAlphaInfo(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGImageAlphaInfo { TODO() }

fun CGBitmapContextGetBitmapInfo(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */ { TODO() }

fun CGBitmapContextGetBitsPerComponent(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGBitmapContextGetBitsPerPixel(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGBitmapContextGetBytesPerRow(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGBitmapContextGetColorSpace(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGBitmapContextGetData(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CGBitmapContextGetHeight(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGBitmapContextGetWidth(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGCancelDisplayConfiguration(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGCaptureAllDisplays(): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGCaptureAllDisplaysWithOptions(/*0*/ options: platform.CoreGraphics.CGCaptureOptions /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGColorConversionInfoCreate(/*0*/ src: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ dst: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGColorConversionInfoRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorConversionInfo>? */ { TODO() }

fun CGColorConversionInfoCreateFromList(/*0*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ arg1: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*2*/ arg2: platform.CoreGraphics.CGColorConversionInfoTransformType /* = kotlin.UInt */, /*3*/ arg3: platform.CoreGraphics.CGColorRenderingIntent, /*4*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): platform.CoreGraphics.CGColorConversionInfoRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorConversionInfo>? */ { TODO() }

fun CGColorConversionInfoCreateFromListWithArguments(/*0*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ arg1: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*2*/ arg2: platform.CoreGraphics.CGColorConversionInfoTransformType /* = kotlin.UInt */, /*3*/ arg3: platform.CoreGraphics.CGColorRenderingIntent, /*4*/ arg4: platform.posix.va_list? /* = kotlinx.cinterop.CPointer<platform.posix.__va_list_tag>? */): platform.CoreGraphics.CGColorConversionInfoRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorConversionInfo>? */ { TODO() }

fun CGColorConversionInfoGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGColorCreate(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateCopy(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateCopyByMatchingToColorSpace(/*0*/ arg0: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ intent: platform.CoreGraphics.CGColorRenderingIntent, /*2*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */, /*3*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateCopyWithAlpha(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */, /*1*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateGenericCMYK(/*0*/ cyan: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ magenta: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ yellow: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ black: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateGenericGray(/*0*/ gray: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateGenericRGB(/*0*/ red: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ green: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ blue: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorCreateWithPattern(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ pattern: platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */, /*2*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorEqualToColor(/*0*/ color1: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */, /*1*/ color2: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): kotlin.Boolean { TODO() }

fun CGColorGetAlpha(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGColorGetColorSpace(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorGetComponents(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>? { TODO() }

fun CGColorGetConstantColor(/*0*/ colorName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorGetNumberOfComponents(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGColorGetPattern(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */ { TODO() }

fun CGColorGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGColorRelease(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */) { TODO() }

fun CGColorRetain(/*0*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */): platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */ { TODO() }

fun CGColorSpaceCopyICCData(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGColorSpaceCopyICCProfile(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGColorSpaceCopyName(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGColorSpaceCopyPropertyList(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CGColorSpaceCreateCalibratedGray(/*0*/ whitePoint: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*1*/ blackPoint: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ gamma: platform.CoreGraphics.CGFloat /* = kotlin.Double */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateCalibratedRGB(/*0*/ whitePoint: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*1*/ blackPoint: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ gamma: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*3*/ matrix: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateDeviceCMYK(): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateDeviceGray(): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateDeviceRGB(): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateICCBased(/*0*/ nComponents: platform.posix.size_t /* = kotlin.ULong */, /*1*/ range: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ profile: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */, /*3*/ alternate: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateIndexed(/*0*/ baseSpace: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ lastIndex: platform.posix.size_t /* = kotlin.ULong */, /*2*/ colorTable: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>?): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateLab(/*0*/ whitePoint: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*1*/ blackPoint: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ range: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreatePattern(/*0*/ baseSpace: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateWithICCData(/*0*/ data: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateWithICCProfile(/*0*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateWithName(/*0*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateWithPlatformColorSpace(/*0*/ ref: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceCreateWithPropertyList(/*0*/ plist: platform.CoreFoundation.CFPropertyListRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceGetBaseColorSpace(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceGetColorTable(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ table: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?) { TODO() }

fun CGColorSpaceGetColorTableCount(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGColorSpaceGetModel(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGColorSpaceModel /* = kotlin.Int */ { TODO() }

fun CGColorSpaceGetName(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGColorSpaceGetNumberOfComponents(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGColorSpaceGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGColorSpaceIsWideGamutRGB(/*0*/ arg0: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): kotlin.Boolean { TODO() }

fun CGColorSpaceRelease(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */) { TODO() }

fun CGColorSpaceRetain(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGColorSpaceSupportsOutput(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): kotlin.Boolean { TODO() }

fun CGCompleteDisplayConfiguration(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ option: platform.CoreGraphics.CGConfigureOption /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGConfigureDisplayFadeEffect(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ fadeOutSeconds: platform.CoreGraphics.CGDisplayFadeInterval /* = kotlin.Float */, /*2*/ fadeInSeconds: platform.CoreGraphics.CGDisplayFadeInterval /* = kotlin.Float */, /*3*/ fadeRed: kotlin.Float, /*4*/ fadeGreen: kotlin.Float, /*5*/ fadeBlue: kotlin.Float): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGConfigureDisplayMirrorOfDisplay(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*2*/ master: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGConfigureDisplayMode(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*2*/ mode: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGConfigureDisplayOrigin(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*2*/ x: platform.posix.int32_t /* = kotlin.Int */, /*3*/ y: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGConfigureDisplayStereoOperation(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*2*/ stereo: platform.posix.boolean_t /* = kotlin.UInt */, /*3*/ forceBlueLine: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGConfigureDisplayWithDisplayMode(/*0*/ config: platform.CoreGraphics.CGDisplayConfigRef? /* = kotlinx.cinterop.CPointer<cnames.structs._CGDisplayConfigRef>? */, /*1*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*2*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */, /*3*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGContextAddArc(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ radius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ startAngle: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ endAngle: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ clockwise: kotlin.Int) { TODO() }

fun CGContextAddArcToPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x1: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y1: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ x2: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ y2: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ radius: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextAddCurveToPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ cp1x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ cp1y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ cp2x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ cp2y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextAddEllipseInRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextAddLineToPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextAddLines(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ points: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPoint>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextAddPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */) { TODO() }

fun CGContextAddQuadCurveToPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ cpx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ cpy: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextAddRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextAddRects(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rects: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextBeginPage(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ mediaBox: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?) { TODO() }

fun CGContextBeginPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextBeginTransparencyLayer(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ auxiliaryInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) { TODO() }

fun CGContextBeginTransparencyLayerWithRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ auxInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) { TODO() }

fun CGContextClearRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextClip(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextClipToMask(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ mask: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */) { TODO() }

fun CGContextClipToRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextClipToRects(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rects: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextClosePath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextConcatCTM(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ transform: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>) { TODO() }

fun CGContextConvertPointToDeviceSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGContextConvertPointToUserSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGContextConvertRectToDeviceSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGContextConvertRectToUserSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGContextConvertSizeToDeviceSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ size: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun CGContextConvertSizeToUserSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ size: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun CGContextCopyPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGContextDrawImage(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */) { TODO() }

fun CGContextDrawLayerAtPoint(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*2*/ layer: platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */) { TODO() }

fun CGContextDrawLayerInRect(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ layer: platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */) { TODO() }

fun CGContextDrawLinearGradient(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ gradient: platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */, /*2*/ startPoint: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*3*/ endPoint: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*4*/ options: platform.CoreGraphics.CGGradientDrawingOptions /* = kotlin.UInt */) { TODO() }

fun CGContextDrawPDFDocument(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*3*/ page: kotlin.Int) { TODO() }

fun CGContextDrawPDFPage(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */) { TODO() }

fun CGContextDrawPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ mode: platform.CoreGraphics.CGPathDrawingMode) { TODO() }

fun CGContextDrawRadialGradient(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ gradient: platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */, /*2*/ startCenter: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*3*/ startRadius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ endCenter: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*5*/ endRadius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ options: platform.CoreGraphics.CGGradientDrawingOptions /* = kotlin.UInt */) { TODO() }

fun CGContextDrawShading(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ shading: platform.CoreGraphics.CGShadingRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGShading>? */) { TODO() }

fun CGContextDrawTiledImage(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */) { TODO() }

fun CGContextEOClip(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextEOFillPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextEndPage(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextEndTransparencyLayer(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextFillEllipseInRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextFillPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextFillRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextFillRects(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rects: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextFlush(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextGetCTM(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGContextGetClipBoundingBox(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGContextGetInterpolationQuality(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */ { TODO() }

fun CGContextGetPathBoundingBox(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGContextGetPathCurrentPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGContextGetTextMatrix(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGContextGetTextPosition(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGContextGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGContextGetUserSpaceToDeviceSpaceTransform(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGContextIsPathEmpty(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): kotlin.Boolean { TODO() }

fun CGContextMoveToPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextPathContainsPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*2*/ mode: platform.CoreGraphics.CGPathDrawingMode): kotlin.Boolean { TODO() }

fun CGContextRelease(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextReplacePathWithStrokedPath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextResetClip(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextRestoreGState(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextRetain(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGContextRotateCTM(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ angle: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSaveGState(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextScaleCTM(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ sx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ sy: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSelectFont(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ name: kotlin.String?, /*2*/ size: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ textEncoding: platform.CoreGraphics.CGTextEncoding) { TODO() }

fun CGContextSetAllowsAntialiasing(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ allowsAntialiasing: kotlin.Boolean) { TODO() }

fun CGContextSetAllowsFontSmoothing(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ allowsFontSmoothing: kotlin.Boolean) { TODO() }

fun CGContextSetAllowsFontSubpixelPositioning(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ allowsFontSubpixelPositioning: kotlin.Boolean) { TODO() }

fun CGContextSetAllowsFontSubpixelQuantization(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ allowsFontSubpixelQuantization: kotlin.Boolean) { TODO() }

fun CGContextSetAlpha(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetBlendMode(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ mode: platform.CoreGraphics.CGBlendMode) { TODO() }

fun CGContextSetCMYKFillColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ cyan: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ magenta: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ yellow: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ black: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetCMYKStrokeColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ cyan: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ magenta: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ yellow: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ black: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetCharacterSpacing(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ spacing: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetFillColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) { TODO() }

fun CGContextSetFillColorSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */) { TODO() }

fun CGContextSetFillColorWithColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */) { TODO() }

fun CGContextSetFillPattern(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ pattern: platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */, /*2*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) { TODO() }

fun CGContextSetFlatness(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ flatness: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetFont(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */) { TODO() }

fun CGContextSetFontSize(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ size: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetGrayFillColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ gray: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetGrayStrokeColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ gray: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetInterpolationQuality(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ quality: platform.CoreGraphics.CGInterpolationQuality /* = kotlin.Int */) { TODO() }

fun CGContextSetLineCap(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ cap: platform.CoreGraphics.CGLineCap) { TODO() }

fun CGContextSetLineDash(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ phase: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ lengths: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*3*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextSetLineJoin(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ join: platform.CoreGraphics.CGLineJoin) { TODO() }

fun CGContextSetLineWidth(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ width: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetMiterLimit(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ limit: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetPatternPhase(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ phase: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>) { TODO() }

fun CGContextSetRGBFillColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ red: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ green: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ blue: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetRGBStrokeColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ red: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ green: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ blue: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ alpha: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetRenderingIntent(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ intent: platform.CoreGraphics.CGColorRenderingIntent) { TODO() }

fun CGContextSetShadow(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ offset: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*2*/ blur: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSetShadowWithColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ offset: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*2*/ blur: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */) { TODO() }

fun CGContextSetShouldAntialias(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ shouldAntialias: kotlin.Boolean) { TODO() }

fun CGContextSetShouldSmoothFonts(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ shouldSmoothFonts: kotlin.Boolean) { TODO() }

fun CGContextSetShouldSubpixelPositionFonts(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ shouldSubpixelPositionFonts: kotlin.Boolean) { TODO() }

fun CGContextSetShouldSubpixelQuantizeFonts(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ shouldSubpixelQuantizeFonts: kotlin.Boolean) { TODO() }

fun CGContextSetStrokeColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) { TODO() }

fun CGContextSetStrokeColorSpace(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */) { TODO() }

fun CGContextSetStrokeColorWithColor(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ color: platform.CoreGraphics.CGColorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColor>? */) { TODO() }

fun CGContextSetStrokePattern(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ pattern: platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */, /*2*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) { TODO() }

fun CGContextSetTextDrawingMode(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ mode: platform.CoreGraphics.CGTextDrawingMode) { TODO() }

fun CGContextSetTextMatrix(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>) { TODO() }

fun CGContextSetTextPosition(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextShowGlyphs(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ g: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextShowGlyphsAtPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ glyphs: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*4*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextShowGlyphsAtPositions(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ glyphs: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*2*/ Lpositions: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPoint>?, /*3*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextShowGlyphsWithAdvances(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ glyphs: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*2*/ advances: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGSize>?, /*3*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextShowText(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ string: kotlin.String?, /*2*/ length: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextShowTextAtPoint(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ string: kotlin.String?, /*4*/ length: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextStrokeEllipseInRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextStrokeLineSegments(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ points: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPoint>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGContextStrokePath(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextStrokeRect(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGContextStrokeRectWithWidth(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ width: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGContextSynchronize(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGContextTranslateCTM(/*0*/ c: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ tx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ ty: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGCursorIsDrawnInFramebuffer(): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGCursorIsVisible(): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDataConsumerCreate(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ cbks: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDataConsumerCallbacks>?): platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */ { TODO() }

fun CGDataConsumerCreateWithCFData(/*0*/ data: platform.CoreFoundation.CFMutableDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */ { TODO() }

fun CGDataConsumerCreateWithURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */ { TODO() }

fun CGDataConsumerGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGDataConsumerRelease(/*0*/ consumer: platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */) { TODO() }

fun CGDataConsumerRetain(/*0*/ consumer: platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */): platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */ { TODO() }

fun CGDataProviderCopyData(/*0*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGDataProviderCreateDirect(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ size: platform.posix.off_t /* = kotlin.Long */, /*2*/ callbacks: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDataProviderDirectCallbacks>?): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDataProviderCreateSequential(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ callbacks: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDataProviderSequentialCallbacks>?): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDataProviderCreateWithCFData(/*0*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDataProviderCreateWithData(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ data: kotlinx.cinterop.CValuesRef<*>?, /*2*/ size: platform.posix.size_t /* = kotlin.ULong */, /*3*/ releaseData: platform.CoreGraphics.CGDataProviderReleaseDataCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Unit>>? */): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDataProviderCreateWithFilename(/*0*/ filename: kotlin.String?): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDataProviderCreateWithURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDataProviderGetInfo(/*0*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun CGDataProviderGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGDataProviderRelease(/*0*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */) { TODO() }

fun CGDataProviderRetain(/*0*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGDirectDisplayCopyCurrentMetalDevice(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): objcnames.protocols.MTLDeviceProtocol? { TODO() }

fun CGDisplayAvailableModes(/*0*/ dsp: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGDisplayBestModeForParameters(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ bitsPerPixel: platform.posix.size_t /* = kotlin.ULong */, /*2*/ width: platform.posix.size_t /* = kotlin.ULong */, /*3*/ height: platform.posix.size_t /* = kotlin.ULong */, /*4*/ exactMatch: kotlinx.cinterop.CValuesRef<platform.posix.boolean_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.boolean_t /* = kotlin.UInt */> */>?): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGDisplayBestModeForParametersAndRefreshRate(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ bitsPerPixel: platform.posix.size_t /* = kotlin.ULong */, /*2*/ width: platform.posix.size_t /* = kotlin.ULong */, /*3*/ height: platform.posix.size_t /* = kotlin.ULong */, /*4*/ refreshRate: platform.CoreGraphics.CGRefreshRate /* = kotlin.Double */, /*5*/ exactMatch: kotlinx.cinterop.CValuesRef<platform.posix.boolean_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.boolean_t /* = kotlin.UInt */> */>?): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGDisplayBounds(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGDisplayCapture(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayCaptureWithOptions(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ options: platform.CoreGraphics.CGCaptureOptions /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayCopyAllDisplayModes(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGDisplayCopyColorSpace(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGDisplayCopyDisplayMode(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */ { TODO() }

fun CGDisplayCreateImage(/*0*/ displayID: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGDisplayCreateImageForRect(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGDisplayCurrentMode(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGDisplayFade(/*0*/ token: platform.CoreGraphics.CGDisplayFadeReservationToken /* = kotlin.UInt */, /*1*/ duration: platform.CoreGraphics.CGDisplayFadeInterval /* = kotlin.Float */, /*2*/ startBlend: platform.CoreGraphics.CGDisplayBlendFraction /* = kotlin.Float */, /*3*/ endBlend: platform.CoreGraphics.CGDisplayBlendFraction /* = kotlin.Float */, /*4*/ redBlend: kotlin.Float, /*5*/ greenBlend: kotlin.Float, /*6*/ blueBlend: kotlin.Float, /*7*/ synchronous: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayFadeOperationInProgress(): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayGammaTableCapacity(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayGetDrawingContext(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGDisplayHideCursor(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayIDToOpenGLDisplayMask(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGOpenGLDisplayMask /* = kotlin.UInt */ { TODO() }

fun CGDisplayIOServicePort(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.IOKit.io_service_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsActive(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsAlwaysInMirrorSet(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsAsleep(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsBuiltin(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsCaptured(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsInHWMirrorSet(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsInMirrorSet(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsMain(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsOnline(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayIsStereo(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayMirrorsDisplay(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */ { TODO() }

fun CGDisplayModeCopyPixelEncoding(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGDisplayModeGetHeight(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayModeGetIODisplayModeID(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun CGDisplayModeGetIOFlags(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayModeGetPixelHeight(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayModeGetPixelWidth(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayModeGetRefreshRate(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): kotlin.Double { TODO() }

fun CGDisplayModeGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGDisplayModeGetWidth(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayModeIsUsableForDesktopGUI(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): kotlin.Boolean { TODO() }

fun CGDisplayModeRelease(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */) { TODO() }

fun CGDisplayModeRetain(/*0*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */): platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */ { TODO() }

fun CGDisplayModelNumber(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayMoveCursorToPoint(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayPixelsHigh(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayPixelsWide(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayPrimaryDisplay(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */ { TODO() }

fun CGDisplayRegisterReconfigurationCallback(/*0*/ callback: platform.CoreGraphics.CGDisplayReconfigurationCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*1*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayRelease(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayRemoveReconfigurationCallback(/*0*/ callback: platform.CoreGraphics.CGDisplayReconfigurationCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, platform.CoreGraphics.CGDisplayChangeSummaryFlags /* = kotlin.UInt */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*1*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayRestoreColorSyncSettings() { TODO() }

fun CGDisplayRotation(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): kotlin.Double { TODO() }

fun CGDisplayScreenSize(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun CGDisplaySerialNumber(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGDisplaySetDisplayMode(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ mode: platform.CoreGraphics.CGDisplayModeRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayMode>? */, /*2*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplaySetStereoOperation(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ stereo: platform.posix.boolean_t /* = kotlin.UInt */, /*2*/ forceBlueLine: platform.posix.boolean_t /* = kotlin.UInt */, /*3*/ option: platform.CoreGraphics.CGConfigureOption /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayShowCursor(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayStreamCreate(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ outputWidth: platform.posix.size_t /* = kotlin.ULong */, /*2*/ outputHeight: platform.posix.size_t /* = kotlin.ULong */, /*3*/ pixelFormat: platform.posix.int32_t /* = kotlin.Int */, /*4*/ properties: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*5*/ handler: platform.CoreGraphics.CGDisplayStreamFrameAvailableHandler? /* = ((platform.CoreGraphics.CGDisplayStreamFrameStatus, platform.posix.uint64_t /* = kotlin.ULong */, platform.CoreGraphics.IOSurfaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__IOSurface>? */, platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */) -> kotlin.Unit)? */): platform.CoreGraphics.CGDisplayStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStream>? */ { TODO() }

fun CGDisplayStreamCreateWithDispatchQueue(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ outputWidth: platform.posix.size_t /* = kotlin.ULong */, /*2*/ outputHeight: platform.posix.size_t /* = kotlin.ULong */, /*3*/ pixelFormat: platform.posix.int32_t /* = kotlin.Int */, /*4*/ properties: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*5*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */, /*6*/ handler: platform.CoreGraphics.CGDisplayStreamFrameAvailableHandler? /* = ((platform.CoreGraphics.CGDisplayStreamFrameStatus, platform.posix.uint64_t /* = kotlin.ULong */, platform.CoreGraphics.IOSurfaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__IOSurface>? */, platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */) -> kotlin.Unit)? */): platform.CoreGraphics.CGDisplayStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStream>? */ { TODO() }

fun CGDisplayStreamGetRunLoopSource(/*0*/ displayStream: platform.CoreGraphics.CGDisplayStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStream>? */): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun CGDisplayStreamGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGDisplayStreamStart(/*0*/ displayStream: platform.CoreGraphics.CGDisplayStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStream>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayStreamStop(/*0*/ displayStream: platform.CoreGraphics.CGDisplayStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStream>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayStreamUpdateCreateMergedUpdate(/*0*/ firstUpdate: platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */, /*1*/ secondUpdate: platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */): platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */ { TODO() }

fun CGDisplayStreamUpdateGetDropCount(/*0*/ updateRef: platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGDisplayStreamUpdateGetMovedRectsDelta(/*0*/ updateRef: platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */, /*1*/ dx: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ dy: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?) { TODO() }

fun CGDisplayStreamUpdateGetRects(/*0*/ updateRef: platform.CoreGraphics.CGDisplayStreamUpdateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDisplayStreamUpdate>? */, /*1*/ rectType: platform.CoreGraphics.CGDisplayStreamUpdateRectType, /*2*/ rectCount: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>? { TODO() }

fun CGDisplayStreamUpdateGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGDisplaySwitchToMode(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ mode: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGDisplayUnitNumber(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayUsesOpenGLAcceleration(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun CGDisplayVendorNumber(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGEnableEventStateCombining(/*0*/ combineState: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGEventCreate(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateCopy(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGEventCreateFromData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateKeyboardEvent(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ virtualKey: platform.CoreGraphics.CGKeyCode /* = kotlin.UShort */, /*2*/ keyDown: kotlin.Boolean): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateMouseEvent(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ mouseType: platform.CoreGraphics.CGEventType /* = kotlin.UInt */, /*2*/ mouseCursorPosition: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*3*/ mouseButton: platform.CoreGraphics.CGMouseButton /* = kotlin.UInt */): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateScrollWheelEvent(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ units: platform.CoreGraphics.CGScrollEventUnit /* = kotlin.UInt */, /*2*/ wheelCount: platform.posix.uint32_t /* = kotlin.UInt */, /*3*/ wheel1: platform.posix.int32_t /* = kotlin.Int */, /*4*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateScrollWheelEvent2(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ units: platform.CoreGraphics.CGScrollEventUnit /* = kotlin.UInt */, /*2*/ wheelCount: platform.posix.uint32_t /* = kotlin.UInt */, /*3*/ wheel1: platform.posix.int32_t /* = kotlin.Int */, /*4*/ wheel2: platform.posix.int32_t /* = kotlin.Int */, /*5*/ wheel3: platform.posix.int32_t /* = kotlin.Int */): platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */ { TODO() }

fun CGEventCreateSourceFromEvent(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */ { TODO() }

fun CGEventGetDoubleValueField(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ field: platform.CoreGraphics.CGEventField /* = kotlin.UInt */): kotlin.Double { TODO() }

fun CGEventGetFlags(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */ { TODO() }

fun CGEventGetIntegerValueField(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ field: platform.CoreGraphics.CGEventField /* = kotlin.UInt */): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun CGEventGetLocation(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGEventGetTimestamp(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): platform.CoreGraphics.CGEventTimestamp /* = kotlin.ULong */ { TODO() }

fun CGEventGetType(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): platform.CoreGraphics.CGEventType /* = kotlin.UInt */ { TODO() }

fun CGEventGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGEventGetUnflippedLocation(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGEventKeyboardGetUnicodeString(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ maxStringLength: platform.darwin.UniCharCount /* = kotlin.ULong */, /*2*/ actualStringLength: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharCountVar /* = kotlinx.cinterop.ULongVarOf<platform.darwin.UniCharCount /* = kotlin.ULong */> */>?, /*3*/ unicodeString: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?) { TODO() }

fun CGEventKeyboardSetUnicodeString(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ stringLength: platform.darwin.UniCharCount /* = kotlin.ULong */, /*2*/ unicodeString: kotlinx.cinterop.CValuesRef<platform.darwin.UniCharVar /* = kotlinx.cinterop.UShortVarOf<platform.darwin.UniChar /* = kotlin.UShort */> */>?) { TODO() }

fun CGEventPost(/*0*/ tap: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */, /*1*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */) { TODO() }

fun CGEventPostToPSN(/*0*/ processSerialNumber: kotlinx.cinterop.CValuesRef<*>?, /*1*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */) { TODO() }

fun CGEventPostToPid(/*0*/ pid: platform.posix.pid_t /* = kotlin.Int */, /*1*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */) { TODO() }

fun CGEventSetDoubleValueField(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ field: platform.CoreGraphics.CGEventField /* = kotlin.UInt */, /*2*/ value: kotlin.Double) { TODO() }

fun CGEventSetFlags(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ flags: platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */) { TODO() }

fun CGEventSetIntegerValueField(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ field: platform.CoreGraphics.CGEventField /* = kotlin.UInt */, /*2*/ value: platform.posix.int64_t /* = kotlin.Long */) { TODO() }

fun CGEventSetLocation(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ location: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>) { TODO() }

fun CGEventSetSource(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */) { TODO() }

fun CGEventSetTimestamp(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ timestamp: platform.CoreGraphics.CGEventTimestamp /* = kotlin.ULong */) { TODO() }

fun CGEventSetType(/*0*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, /*1*/ type: platform.CoreGraphics.CGEventType /* = kotlin.UInt */) { TODO() }

fun CGEventSourceButtonState(/*0*/ stateID: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */, /*1*/ button: platform.CoreGraphics.CGMouseButton /* = kotlin.UInt */): kotlin.Boolean { TODO() }

fun CGEventSourceCounterForEventType(/*0*/ stateID: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */, /*1*/ eventType: platform.CoreGraphics.CGEventType /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun CGEventSourceCreate(/*0*/ stateID: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */): platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */ { TODO() }

fun CGEventSourceFlagsState(/*0*/ stateID: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */): platform.CoreGraphics.CGEventFlags /* = kotlin.ULong */ { TODO() }

fun CGEventSourceGetKeyboardType(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */): platform.CoreGraphics.CGEventSourceKeyboardType /* = kotlin.UInt */ { TODO() }

fun CGEventSourceGetLocalEventsFilterDuringSuppressionState(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ state: platform.CoreGraphics.CGEventSuppressionState /* = kotlin.UInt */): platform.CoreGraphics.CGEventFilterMask /* = kotlin.UInt */ { TODO() }

fun CGEventSourceGetLocalEventsSuppressionInterval(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CGEventSourceGetPixelsPerLine(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */): kotlin.Double { TODO() }

fun CGEventSourceGetSourceStateID(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */): platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */ { TODO() }

fun CGEventSourceGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGEventSourceGetUserData(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun CGEventSourceKeyState(/*0*/ stateID: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */, /*1*/ key: platform.CoreGraphics.CGKeyCode /* = kotlin.UShort */): kotlin.Boolean { TODO() }

fun CGEventSourceSecondsSinceLastEventType(/*0*/ stateID: platform.CoreGraphics.CGEventSourceStateID /* = kotlin.Int */, /*1*/ eventType: platform.CoreGraphics.CGEventType /* = kotlin.UInt */): platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */ { TODO() }

fun CGEventSourceSetKeyboardType(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ keyboardType: platform.CoreGraphics.CGEventSourceKeyboardType /* = kotlin.UInt */) { TODO() }

fun CGEventSourceSetLocalEventsFilterDuringSuppressionState(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ filter: platform.CoreGraphics.CGEventFilterMask /* = kotlin.UInt */, /*2*/ state: platform.CoreGraphics.CGEventSuppressionState /* = kotlin.UInt */) { TODO() }

fun CGEventSourceSetLocalEventsSuppressionInterval(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ seconds: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */) { TODO() }

fun CGEventSourceSetPixelsPerLine(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ pixelsPerLine: kotlin.Double) { TODO() }

fun CGEventSourceSetUserData(/*0*/ source: platform.CoreGraphics.CGEventSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventSource>? */, /*1*/ userData: platform.posix.int64_t /* = kotlin.Long */) { TODO() }

fun CGEventTapCreate(/*0*/ tap: platform.CoreGraphics.CGEventTapLocation /* = kotlin.UInt */, /*1*/ place: platform.CoreGraphics.CGEventTapPlacement /* = kotlin.UInt */, /*2*/ options: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */, /*3*/ eventsOfInterest: platform.CoreGraphics.CGEventMask /* = kotlin.ULong */, /*4*/ callback: platform.CoreGraphics.CGEventTapCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGEventTapProxy? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventTapProxy>? */, platform.CoreGraphics.CGEventType /* = kotlin.UInt */, platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */>>? */, /*5*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun CGEventTapCreateForPSN(/*0*/ processSerialNumber: kotlinx.cinterop.CValuesRef<*>?, /*1*/ place: platform.CoreGraphics.CGEventTapPlacement /* = kotlin.UInt */, /*2*/ options: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */, /*3*/ eventsOfInterest: platform.CoreGraphics.CGEventMask /* = kotlin.ULong */, /*4*/ callback: platform.CoreGraphics.CGEventTapCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGEventTapProxy? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventTapProxy>? */, platform.CoreGraphics.CGEventType /* = kotlin.UInt */, platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */>>? */, /*5*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun CGEventTapCreateForPid(/*0*/ pid: platform.posix.pid_t /* = kotlin.Int */, /*1*/ place: platform.CoreGraphics.CGEventTapPlacement /* = kotlin.UInt */, /*2*/ options: platform.CoreGraphics.CGEventTapOptions /* = kotlin.UInt */, /*3*/ eventsOfInterest: platform.CoreGraphics.CGEventMask /* = kotlin.ULong */, /*4*/ callback: platform.CoreGraphics.CGEventTapCallBack? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGEventTapProxy? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventTapProxy>? */, platform.CoreGraphics.CGEventType /* = kotlin.UInt */, platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */>>? */, /*5*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun CGEventTapEnable(/*0*/ tap: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */, /*1*/ enable: kotlin.Boolean) { TODO() }

fun CGEventTapIsEnabled(/*0*/ tap: platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */): kotlin.Boolean { TODO() }

fun CGEventTapPostEvent(/*0*/ proxy: platform.CoreGraphics.CGEventTapProxy? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEventTapProxy>? */, /*1*/ event: platform.CoreGraphics.CGEventRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CGEvent>? */) { TODO() }

fun CGFontCanCreatePostScriptSubset(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ format: platform.CoreGraphics.CGFontPostScriptFormat /* = kotlin.Int */): kotlin.Boolean { TODO() }

fun CGFontCopyFullName(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGFontCopyGlyphNameForGlyph(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ glyph: platform.CoreGraphics.CGGlyph /* = kotlin.UShort */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGFontCopyPostScriptName(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGFontCopyTableForTag(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ tag: platform.posix.uint32_t /* = kotlin.UInt */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGFontCopyTableTags(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGFontCopyVariationAxes(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGFontCopyVariations(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGFontCreateCopyWithVariations(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ variations: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */ { TODO() }

fun CGFontCreatePostScriptEncoding(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ encoding: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGFontCreatePostScriptSubset(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ subsetName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ format: platform.CoreGraphics.CGFontPostScriptFormat /* = kotlin.Int */, /*3*/ glyphs: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*4*/ count: platform.posix.size_t /* = kotlin.ULong */, /*5*/ encoding: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGFontCreateWithDataProvider(/*0*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */): platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */ { TODO() }

fun CGFontCreateWithFontName(/*0*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */ { TODO() }

fun CGFontCreateWithPlatformFont(/*0*/ platformFontReference: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */ { TODO() }

fun CGFontGetAscent(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlin.Int { TODO() }

fun CGFontGetCapHeight(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlin.Int { TODO() }

fun CGFontGetDescent(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlin.Int { TODO() }

fun CGFontGetFontBBox(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGFontGetGlyphAdvances(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ glyphs: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */, /*3*/ advances: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVar /* = kotlinx.cinterop.IntVarOf<kotlin.Int> */>?): kotlin.Boolean { TODO() }

fun CGFontGetGlyphBBoxes(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ glyphs: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGlyphVar /* = kotlinx.cinterop.UShortVarOf<platform.CoreGraphics.CGGlyph /* = kotlin.UShort */> */>?, /*2*/ count: platform.posix.size_t /* = kotlin.ULong */, /*3*/ bboxes: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?): kotlin.Boolean { TODO() }

fun CGFontGetGlyphWithGlyphName(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreGraphics.CGGlyph /* = kotlin.UShort */ { TODO() }

fun CGFontGetItalicAngle(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGFontGetLeading(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlin.Int { TODO() }

fun CGFontGetNumberOfGlyphs(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGFontGetStemV(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGFontGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGFontGetUnitsPerEm(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlin.Int { TODO() }

fun CGFontGetXHeight(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): kotlin.Int { TODO() }

fun CGFontRelease(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */) { TODO() }

fun CGFontRetain(/*0*/ font: platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */): platform.CoreGraphics.CGFontRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFont>? */ { TODO() }

fun CGFunctionCreate(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ domainDimension: platform.posix.size_t /* = kotlin.ULong */, /*2*/ domain: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*3*/ rangeDimension: platform.posix.size_t /* = kotlin.ULong */, /*4*/ range: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*5*/ callbacks: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFunctionCallbacks>?): platform.CoreGraphics.CGFunctionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>? */ { TODO() }

fun CGFunctionGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGFunctionRelease(/*0*/ function: platform.CoreGraphics.CGFunctionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>? */) { TODO() }

fun CGFunctionRetain(/*0*/ function: platform.CoreGraphics.CGFunctionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>? */): platform.CoreGraphics.CGFunctionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>? */ { TODO() }

fun CGGetActiveDisplayList(/*0*/ maxDisplays: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ activeDisplays: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDirectDisplayIDVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */> */>?, /*2*/ displayCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetDisplayTransferByFormula(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ redMin: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*2*/ redMax: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*3*/ redGamma: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*4*/ greenMin: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*5*/ greenMax: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*6*/ greenGamma: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*7*/ blueMin: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*8*/ blueMax: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*9*/ blueGamma: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetDisplayTransferByTable(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ capacity: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ redTable: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*3*/ greenTable: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*4*/ blueTable: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*5*/ sampleCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetDisplaysWithOpenGLDisplayMask(/*0*/ mask: platform.CoreGraphics.CGOpenGLDisplayMask /* = kotlin.UInt */, /*1*/ maxDisplays: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ displays: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDirectDisplayIDVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */> */>?, /*3*/ matchingDisplayCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetDisplaysWithPoint(/*0*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*1*/ maxDisplays: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ displays: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDirectDisplayIDVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */> */>?, /*3*/ matchingDisplayCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetDisplaysWithRect(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ maxDisplays: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ displays: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDirectDisplayIDVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */> */>?, /*3*/ matchingDisplayCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetEventTapList(/*0*/ maxNumberOfTaps: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ tapList: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGEventTapInformation /* = platform.CoreGraphics.__CGEventTapInformation */>?, /*2*/ eventTapCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGetLastMouseDelta(/*0*/ deltaX: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?, /*1*/ deltaY: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?) { TODO() }

fun CGGetOnlineDisplayList(/*0*/ maxDisplays: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ onlineDisplays: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGDirectDisplayIDVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */> */>?, /*2*/ displayCount: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGGradientCreateWithColorComponents(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ locations: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*3*/ count: platform.posix.size_t /* = kotlin.ULong */): platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */ { TODO() }

fun CGGradientCreateWithColors(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ colors: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ locations: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?): platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */ { TODO() }

fun CGGradientGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGGradientRelease(/*0*/ gradient: platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */) { TODO() }

fun CGGradientRetain(/*0*/ gradient: platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */): platform.CoreGraphics.CGGradientRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGGradient>? */ { TODO() }

fun CGImageCreate(/*0*/ width: platform.posix.size_t /* = kotlin.ULong */, /*1*/ height: platform.posix.size_t /* = kotlin.ULong */, /*2*/ bitsPerComponent: platform.posix.size_t /* = kotlin.ULong */, /*3*/ bitsPerPixel: platform.posix.size_t /* = kotlin.ULong */, /*4*/ bytesPerRow: platform.posix.size_t /* = kotlin.ULong */, /*5*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*6*/ bitmapInfo: platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */, /*7*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */, /*8*/ decode: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*9*/ shouldInterpolate: kotlin.Boolean, /*10*/ intent: platform.CoreGraphics.CGColorRenderingIntent): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateCopy(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateCopyWithColorSpace(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */, /*1*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateWithImageInRect(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */, /*1*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateWithJPEGDataProvider(/*0*/ source: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */, /*1*/ decode: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ shouldInterpolate: kotlin.Boolean, /*3*/ intent: platform.CoreGraphics.CGColorRenderingIntent): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateWithMask(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */, /*1*/ mask: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateWithMaskingColors(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */, /*1*/ components: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageCreateWithPNGDataProvider(/*0*/ source: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */, /*1*/ decode: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*2*/ shouldInterpolate: kotlin.Boolean, /*3*/ intent: platform.CoreGraphics.CGColorRenderingIntent): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageGetAlphaInfo(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGImageAlphaInfo { TODO() }

fun CGImageGetBitmapInfo(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGBitmapInfo /* = kotlin.UInt */ { TODO() }

fun CGImageGetBitsPerComponent(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGImageGetBitsPerPixel(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGImageGetByteOrderInfo(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGImageByteOrderInfo /* = kotlin.UInt */ { TODO() }

fun CGImageGetBytesPerRow(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGImageGetColorSpace(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */ { TODO() }

fun CGImageGetDataProvider(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */ { TODO() }

fun CGImageGetDecode(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): kotlinx.cinterop.CPointer<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>? { TODO() }

fun CGImageGetHeight(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGImageGetPixelFormatInfo(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGImagePixelFormatInfo /* = kotlin.UInt */ { TODO() }

fun CGImageGetRenderingIntent(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGColorRenderingIntent { TODO() }

fun CGImageGetShouldInterpolate(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): kotlin.Boolean { TODO() }

fun CGImageGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGImageGetUTType(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGImageGetWidth(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGImageIsMask(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): kotlin.Boolean { TODO() }

fun CGImageMaskCreate(/*0*/ width: platform.posix.size_t /* = kotlin.ULong */, /*1*/ height: platform.posix.size_t /* = kotlin.ULong */, /*2*/ bitsPerComponent: platform.posix.size_t /* = kotlin.ULong */, /*3*/ bitsPerPixel: platform.posix.size_t /* = kotlin.ULong */, /*4*/ bytesPerRow: platform.posix.size_t /* = kotlin.ULong */, /*5*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */, /*6*/ decode: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*7*/ shouldInterpolate: kotlin.Boolean): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGImageRelease(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */) { TODO() }

fun CGImageRetain(/*0*/ image: platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGInhibitLocalEvents(/*0*/ inhibit: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGLayerCreateWithContext(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ size: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*2*/ auxiliaryInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */ { TODO() }

fun CGLayerGetContext(/*0*/ layer: platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGLayerGetSize(/*0*/ layer: platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun CGLayerGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGLayerRelease(/*0*/ layer: platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */) { TODO() }

fun CGLayerRetain(/*0*/ layer: platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */): platform.CoreGraphics.CGLayerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGLayer>? */ { TODO() }

fun CGMainDisplayID(): platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */ { TODO() }

fun CGOpenGLDisplayMaskToDisplayID(/*0*/ mask: platform.CoreGraphics.CGOpenGLDisplayMask /* = kotlin.UInt */): platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */ { TODO() }

fun CGPDFArrayApplyBlock(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ block: platform.CoreGraphics.CGPDFArrayApplierBlock? /* = ((platform.posix.size_t /* = kotlin.ULong */, platform.CoreGraphics.CGPDFObjectRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean)? */, /*2*/ info: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CGPDFArrayGetArray(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetBoolean(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFBooleanVar /* = kotlinx.cinterop.UByteVarOf<platform.CoreGraphics.CGPDFBoolean /* = kotlin.UByte */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetCount(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGPDFArrayGetDictionary(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFDictionaryRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFDictionaryRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetInteger(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFIntegerVar /* = kotlinx.cinterop.LongVarOf<platform.CoreGraphics.CGPDFInteger /* = kotlin.Long */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetName(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetNull(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */): kotlin.Boolean { TODO() }

fun CGPDFArrayGetNumber(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFRealVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGPDFReal /* = kotlin.Double */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetObject(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFObjectRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFObjectRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetStream(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFArrayGetString(/*0*/ array: platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */, /*1*/ index: platform.posix.size_t /* = kotlin.ULong */, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFContentStreamCreateWithPage(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */): platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */ { TODO() }

fun CGPDFContentStreamCreateWithStream(/*0*/ stream: platform.CoreGraphics.CGPDFStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream>? */, /*1*/ streamResources: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*2*/ parent: platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */): platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */ { TODO() }

fun CGPDFContentStreamGetResource(/*0*/ cs: platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */, /*1*/ category: kotlin.String?, /*2*/ name: kotlin.String?): platform.CoreGraphics.CGPDFObjectRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>? */ { TODO() }

fun CGPDFContentStreamGetStreams(/*0*/ cs: platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGPDFContentStreamRelease(/*0*/ cs: platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */) { TODO() }

fun CGPDFContentStreamRetain(/*0*/ cs: platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */): platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */ { TODO() }

fun CGPDFContextAddDestinationAtPoint(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>) { TODO() }

fun CGPDFContextAddDocumentMetadata(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ metadata: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */) { TODO() }

fun CGPDFContextBeginPage(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ pageInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) { TODO() }

fun CGPDFContextClose(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGPDFContextCreate(/*0*/ consumer: platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */, /*1*/ mediaBox: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*2*/ auxiliaryInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGPDFContextCreateWithURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*1*/ mediaBox: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*2*/ auxiliaryInfo: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */ { TODO() }

fun CGPDFContextEndPage(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */) { TODO() }

fun CGPDFContextSetDestinationForRect(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGPDFContextSetOutline(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ outline: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) { TODO() }

fun CGPDFContextSetURLForRect(/*0*/ context: platform.CoreGraphics.CGContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGContext>? */, /*1*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGPDFDictionaryApplyBlock(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ block: platform.CoreGraphics.CGPDFDictionaryApplierBlock? /* = ((kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, platform.CoreGraphics.CGPDFObjectRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Boolean)? */, /*2*/ info: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CGPDFDictionaryApplyFunction(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ function: platform.CoreGraphics.CGPDFDictionaryApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, platform.CoreGraphics.CGPDFObjectRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*2*/ info: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CGPDFDictionaryGetArray(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetBoolean(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFBooleanVar /* = kotlinx.cinterop.UByteVarOf<platform.CoreGraphics.CGPDFBoolean /* = kotlin.UByte */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetCount(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGPDFDictionaryGetDictionary(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFDictionaryRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFDictionaryRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetInteger(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFIntegerVar /* = kotlinx.cinterop.LongVarOf<platform.CoreGraphics.CGPDFInteger /* = kotlin.Long */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetName(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetNumber(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFRealVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGPDFReal /* = kotlin.Double */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetObject(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFObjectRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFObjectRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetStream(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDictionaryGetString(/*0*/ dict: platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */, /*1*/ key: kotlin.String?, /*2*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFDocumentAllowsCopying(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): kotlin.Boolean { TODO() }

fun CGPDFDocumentAllowsPrinting(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): kotlin.Boolean { TODO() }

fun CGPDFDocumentCreateWithProvider(/*0*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */): platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */ { TODO() }

fun CGPDFDocumentCreateWithURL(/*0*/ url: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */ { TODO() }

fun CGPDFDocumentGetAccessPermissions(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.CoreGraphics.CGPDFAccessPermissions /* = kotlin.UInt */ { TODO() }

fun CGPDFDocumentGetArtBox(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ page: kotlin.Int): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPDFDocumentGetBleedBox(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ page: kotlin.Int): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPDFDocumentGetCatalog(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */ { TODO() }

fun CGPDFDocumentGetCropBox(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ page: kotlin.Int): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPDFDocumentGetID(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.CoreGraphics.CGPDFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray>? */ { TODO() }

fun CGPDFDocumentGetInfo(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */ { TODO() }

fun CGPDFDocumentGetMediaBox(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ page: kotlin.Int): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPDFDocumentGetNumberOfPages(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGPDFDocumentGetOutline(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGPDFDocumentGetPage(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ pageNumber: platform.posix.size_t /* = kotlin.ULong */): platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */ { TODO() }

fun CGPDFDocumentGetRotationAngle(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ page: kotlin.Int): kotlin.Int { TODO() }

fun CGPDFDocumentGetTrimBox(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ page: kotlin.Int): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPDFDocumentGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGPDFDocumentGetVersion(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ majorVersion: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVar /* = kotlinx.cinterop.IntVarOf<kotlin.Int> */>?, /*2*/ minorVersion: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVar /* = kotlinx.cinterop.IntVarOf<kotlin.Int> */>?) { TODO() }

fun CGPDFDocumentIsEncrypted(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): kotlin.Boolean { TODO() }

fun CGPDFDocumentIsUnlocked(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): kotlin.Boolean { TODO() }

fun CGPDFDocumentRelease(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */) { TODO() }

fun CGPDFDocumentRetain(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */): platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */ { TODO() }

fun CGPDFDocumentUnlockWithPassword(/*0*/ document: platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */, /*1*/ password: kotlin.String?): kotlin.Boolean { TODO() }

fun CGPDFObjectGetType(/*0*/ `object`: platform.CoreGraphics.CGPDFObjectRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>? */): platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */ { TODO() }

fun CGPDFObjectGetValue(/*0*/ `object`: platform.CoreGraphics.CGPDFObjectRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject>? */, /*1*/ type: platform.CoreGraphics.CGPDFObjectType /* = kotlin.Int */, /*2*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun CGPDFOperatorTableCreate(): platform.CoreGraphics.CGPDFOperatorTableRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>? */ { TODO() }

fun CGPDFOperatorTableRelease(/*0*/ table: platform.CoreGraphics.CGPDFOperatorTableRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>? */) { TODO() }

fun CGPDFOperatorTableRetain(/*0*/ table: platform.CoreGraphics.CGPDFOperatorTableRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>? */): platform.CoreGraphics.CGPDFOperatorTableRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>? */ { TODO() }

fun CGPDFOperatorTableSetCallback(/*0*/ table: platform.CoreGraphics.CGPDFOperatorTableRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>? */, /*1*/ name: kotlin.String?, /*2*/ callback: platform.CoreGraphics.CGPDFOperatorCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */) { TODO() }

fun CGPDFPageGetBoxRect(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */, /*1*/ box: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPDFPageGetDictionary(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */): platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */ { TODO() }

fun CGPDFPageGetDocument(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */): platform.CoreGraphics.CGPDFDocumentRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDocument>? */ { TODO() }

fun CGPDFPageGetDrawingTransform(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */, /*1*/ box: platform.CoreGraphics.CGPDFBox /* = kotlin.Int */, /*2*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*3*/ rotate: kotlin.Int, /*4*/ preserveAspectRatio: kotlin.Boolean): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun CGPDFPageGetPageNumber(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGPDFPageGetRotationAngle(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */): kotlin.Int { TODO() }

fun CGPDFPageGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGPDFPageRelease(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */) { TODO() }

fun CGPDFPageRetain(/*0*/ page: platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */): platform.CoreGraphics.CGPDFPageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFPage>? */ { TODO() }

fun CGPDFScannerCreate(/*0*/ cs: platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */, /*1*/ table: platform.CoreGraphics.CGPDFOperatorTableRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFOperatorTable>? */, /*2*/ info: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */ { TODO() }

fun CGPDFScannerGetContentStream(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */): platform.CoreGraphics.CGPDFContentStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFContentStream>? */ { TODO() }

fun CGPDFScannerPopArray(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFArray> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopBoolean(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFBooleanVar /* = kotlinx.cinterop.UByteVarOf<platform.CoreGraphics.CGPDFBoolean /* = kotlin.UByte */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopDictionary(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFDictionaryRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFDictionaryRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopInteger(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFIntegerVar /* = kotlinx.cinterop.LongVarOf<platform.CoreGraphics.CGPDFInteger /* = kotlin.Long */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopName(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopNumber(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFRealVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGPDFReal /* = kotlin.Double */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopObject(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFObjectRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFObjectRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFObject> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopStream(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFStreamRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStreamRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerPopString(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */, /*1*/ value: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreGraphics.CGPDFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString> */> */>?): kotlin.Boolean { TODO() }

fun CGPDFScannerRelease(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */) { TODO() }

fun CGPDFScannerRetain(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */): platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */ { TODO() }

fun CGPDFScannerScan(/*0*/ scanner: platform.CoreGraphics.CGPDFScannerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFScanner>? */): kotlin.Boolean { TODO() }

fun CGPDFStreamCopyData(/*0*/ stream: platform.CoreGraphics.CGPDFStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream>? */, /*1*/ format: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPDFDataFormat.Var>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun CGPDFStreamGetDictionary(/*0*/ stream: platform.CoreGraphics.CGPDFStreamRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFStream>? */): platform.CoreGraphics.CGPDFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFDictionary>? */ { TODO() }

fun CGPDFStringCopyDate(/*0*/ string: platform.CoreGraphics.CGPDFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString>? */): platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */ { TODO() }

fun CGPDFStringCopyTextString(/*0*/ string: platform.CoreGraphics.CGPDFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun CGPDFStringGetBytePtr(/*0*/ string: platform.CoreGraphics.CGPDFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar /* = kotlinx.cinterop.UByteVarOf<kotlin.UByte> */>? { TODO() }

fun CGPDFStringGetLength(/*0*/ string: platform.CoreGraphics.CGPDFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPDFString>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun CGPSConverterAbort(/*0*/ converter: platform.CoreGraphics.CGPSConverterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPSConverter>? */): kotlin.Boolean { TODO() }

fun CGPSConverterConvert(/*0*/ converter: platform.CoreGraphics.CGPSConverterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPSConverter>? */, /*1*/ provider: platform.CoreGraphics.CGDataProviderRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataProvider>? */, /*2*/ consumer: platform.CoreGraphics.CGDataConsumerRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGDataConsumer>? */, /*3*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): kotlin.Boolean { TODO() }

fun CGPSConverterCreate(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ callbacks: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPSConverterCallbacks>?, /*2*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.CoreGraphics.CGPSConverterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPSConverter>? */ { TODO() }

fun CGPSConverterGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGPSConverterIsConverting(/*0*/ converter: platform.CoreGraphics.CGPSConverterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPSConverter>? */): kotlin.Boolean { TODO() }

fun CGPathAddArc(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ radius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ startAngle: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ endAngle: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*7*/ clockwise: kotlin.Boolean) { TODO() }

fun CGPathAddArcToPoint(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ x1: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ y1: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ x2: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ y2: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ radius: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathAddCurveToPoint(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ cp1x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ cp1y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ cp2x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ cp2y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*7*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathAddEllipseInRect(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGPathAddLineToPoint(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathAddLines(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ points: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPoint>?, /*3*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGPathAddPath(/*0*/ path1: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ path2: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */) { TODO() }

fun CGPathAddQuadCurveToPoint(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ cpx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ cpy: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathAddRect(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>) { TODO() }

fun CGPathAddRects(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ rects: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*3*/ count: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun CGPathAddRelativeArc(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ matrix: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ radius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ startAngle: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*6*/ delta: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathAddRoundedRect(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*3*/ cornerWidth: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ cornerHeight: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathApply(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ info: kotlinx.cinterop.CValuesRef<*>?, /*2*/ function: platform.CoreGraphics.CGPathApplierFunction? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGPathElement>?) -> kotlin.Unit>>? */) { TODO() }

fun CGPathApplyWithBlock(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ block: platform.CoreGraphics.CGPathApplyBlock? /* = ((kotlinx.cinterop.CPointer<platform.CoreGraphics.CGPathElement>?) -> kotlin.Unit)? */) { TODO() }

fun CGPathCloseSubpath(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */) { TODO() }

fun CGPathContainsPoint(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*3*/ eoFill: kotlin.Boolean): kotlin.Boolean { TODO() }

fun CGPathCreateCopy(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateCopyByDashingPath(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ phase: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ lengths: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGFloatVar /* = kotlinx.cinterop.DoubleVarOf<platform.CoreGraphics.CGFloat /* = kotlin.Double */> */>?, /*4*/ count: platform.posix.size_t /* = kotlin.ULong */): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateCopyByStrokingPath(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ lineWidth: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ lineCap: platform.CoreGraphics.CGLineCap, /*4*/ lineJoin: platform.CoreGraphics.CGLineJoin, /*5*/ miterLimit: platform.CoreGraphics.CGFloat /* = kotlin.Double */): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateCopyByTransformingPath(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateMutable(): platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateMutableCopy(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateMutableCopyByTransformingPath(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?): platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateWithEllipseInRect(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateWithRect(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathCreateWithRoundedRect(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ cornerWidth: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ cornerHeight: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ transform: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPathEqualToPath(/*0*/ path1: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ path2: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): kotlin.Boolean { TODO() }

fun CGPathGetBoundingBox(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPathGetCurrentPoint(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGPathGetPathBoundingBox(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGPathGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGPathIsEmpty(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): kotlin.Boolean { TODO() }

fun CGPathIsRect(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ rect: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?): kotlin.Boolean { TODO() }

fun CGPathMoveToPoint(/*0*/ path: platform.CoreGraphics.CGMutablePathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */, /*1*/ m: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGAffineTransform>?, /*2*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */) { TODO() }

fun CGPathRelease(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */) { TODO() }

fun CGPathRetain(/*0*/ path: platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */): platform.CoreGraphics.CGPathRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPath>? */ { TODO() }

fun CGPatternCreate(/*0*/ info: kotlinx.cinterop.CValuesRef<*>?, /*1*/ bounds: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*2*/ matrix: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>, /*3*/ xStep: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ yStep: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ tiling: platform.CoreGraphics.CGPatternTiling, /*6*/ isColored: kotlin.Boolean, /*7*/ callbacks: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPatternCallbacks>?): platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */ { TODO() }

fun CGPatternGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGPatternRelease(/*0*/ pattern: platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */) { TODO() }

fun CGPatternRetain(/*0*/ pattern: platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */): platform.CoreGraphics.CGPatternRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGPattern>? */ { TODO() }

fun CGPointApplyAffineTransform(/*0*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*1*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGPointCreateDictionaryRepresentation(/*0*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGPointEqualToPoint(/*0*/ point1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*1*/ point2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): kotlin.Boolean { TODO() }

fun CGPointMake(/*0*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun CGPointMakeWithDictionaryRepresentation(/*0*/ dict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ point: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGPoint>?): kotlin.Boolean { TODO() }

fun CGPostKeyboardEvent(/*0*/ keyChar: platform.CoreGraphics.CGCharCode /* = kotlin.UShort */, /*1*/ virtualKey: platform.CoreGraphics.CGKeyCode /* = kotlin.UShort */, /*2*/ keyDown: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGPostMouseEvent(/*0*/ mouseCursorPosition: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*1*/ updateMouseCursorPosition: platform.posix.boolean_t /* = kotlin.UInt */, /*2*/ buttonCount: platform.CoreGraphics.CGButtonCount /* = kotlin.UInt */, /*3*/ mouseButtonDown: platform.posix.boolean_t /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGPostScrollWheelEvent(/*0*/ wheelCount: platform.CoreGraphics.CGWheelCount /* = kotlin.UInt */, /*1*/ wheel1: platform.posix.int32_t /* = kotlin.Int */, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGRectApplyAffineTransform(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectContainsPoint(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): kotlin.Boolean { TODO() }

fun CGRectContainsRect(/*0*/ rect1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ rect2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlin.Boolean { TODO() }

fun CGRectCreateDictionaryRepresentation(/*0*/ arg0: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGRectDivide(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ slice: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*2*/ remainder: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?, /*3*/ amount: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ edge: platform.CoreGraphics.CGRectEdge) { TODO() }

fun CGRectEqualToRect(/*0*/ rect1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ rect2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlin.Boolean { TODO() }

fun CGRectGetHeight(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetMaxX(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetMaxY(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetMidX(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetMidY(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetMinX(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetMinY(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectGetWidth(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): platform.CoreGraphics.CGFloat /* = kotlin.Double */ { TODO() }

fun CGRectInset(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ dx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ dy: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectIntegral(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectIntersection(/*0*/ r1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ r2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectIntersectsRect(/*0*/ rect1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ rect2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlin.Boolean { TODO() }

fun CGRectIsEmpty(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlin.Boolean { TODO() }

fun CGRectIsInfinite(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlin.Boolean { TODO() }

fun CGRectIsNull(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlin.Boolean { TODO() }

fun CGRectMake(/*0*/ x: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ y: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ width: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ height: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectMakeWithDictionaryRepresentation(/*0*/ dict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ rect: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?): kotlin.Boolean { TODO() }

fun CGRectOffset(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ dx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ dy: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectStandardize(/*0*/ rect: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRectUnion(/*0*/ r1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ r2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect> { TODO() }

fun CGRegisterScreenRefreshCallback(/*0*/ callback: platform.CoreGraphics.CGScreenRefreshCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.posix.uint32_t /* = kotlin.UInt */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>?, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*1*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGReleaseAllDisplays(): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGReleaseDisplayFadeReservation(/*0*/ token: platform.CoreGraphics.CGDisplayFadeReservationToken /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGReleaseScreenRefreshRects(/*0*/ rects: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGRect>?) { TODO() }

fun CGRestorePermanentDisplayConfiguration() { TODO() }

fun CGScreenRegisterMoveCallback(/*0*/ callback: platform.CoreGraphics.CGScreenUpdateMoveCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CValue<platform.CoreGraphics.CGScreenUpdateMoveDelta>, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>?, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*1*/ userInfo: kotlinx.cinterop.CValuesRef<*>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGScreenUnregisterMoveCallback(/*0*/ callback: platform.CoreGraphics.CGScreenUpdateMoveCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CValue<platform.CoreGraphics.CGScreenUpdateMoveDelta>, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>?, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*1*/ userInfo: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CGSessionCopyCurrentDictionary(): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGSetDisplayTransferByByteTable(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ tableSize: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ redTable: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*3*/ greenTable: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*4*/ blueTable: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGSetDisplayTransferByFormula(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ redMin: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*2*/ redMax: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*3*/ redGamma: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*4*/ greenMin: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*5*/ greenMax: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*6*/ greenGamma: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*7*/ blueMin: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*8*/ blueMax: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */, /*9*/ blueGamma: platform.CoreGraphics.CGGammaValue /* = kotlin.Float */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGSetDisplayTransferByTable(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */, /*1*/ tableSize: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ redTable: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*3*/ greenTable: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?, /*4*/ blueTable: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGGammaValueVar /* = kotlinx.cinterop.FloatVarOf<platform.CoreGraphics.CGGammaValue /* = kotlin.Float */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGSetLocalEventsFilterDuringSuppressionState(/*0*/ filter: platform.CoreGraphics.CGEventFilterMask /* = kotlin.UInt */, /*1*/ state: platform.CoreGraphics.CGEventSuppressionState /* = kotlin.UInt */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGSetLocalEventsSuppressionInterval(/*0*/ seconds: platform.CoreFoundation.CFTimeInterval /* = kotlin.Double */): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGShadingCreateAxial(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ start: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*2*/ end: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*3*/ function: platform.CoreGraphics.CGFunctionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>? */, /*4*/ extendStart: kotlin.Boolean, /*5*/ extendEnd: kotlin.Boolean): platform.CoreGraphics.CGShadingRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGShading>? */ { TODO() }

fun CGShadingCreateRadial(/*0*/ space: platform.CoreGraphics.CGColorSpaceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGColorSpace>? */, /*1*/ start: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*2*/ startRadius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ end: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*4*/ endRadius: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ function: platform.CoreGraphics.CGFunctionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGFunction>? */, /*6*/ extendStart: kotlin.Boolean, /*7*/ extendEnd: kotlin.Boolean): platform.CoreGraphics.CGShadingRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGShading>? */ { TODO() }

fun CGShadingGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun CGShadingRelease(/*0*/ shading: platform.CoreGraphics.CGShadingRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGShading>? */) { TODO() }

fun CGShadingRetain(/*0*/ shading: platform.CoreGraphics.CGShadingRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGShading>? */): platform.CoreGraphics.CGShadingRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGShading>? */ { TODO() }

fun CGShieldingWindowID(/*0*/ display: platform.CoreGraphics.CGDirectDisplayID /* = kotlin.UInt */): platform.CoreGraphics.CGWindowID /* = kotlin.UInt */ { TODO() }

fun CGShieldingWindowLevel(): platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ { TODO() }

fun CGSizeApplyAffineTransform(/*0*/ size: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*1*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun CGSizeCreateDictionaryRepresentation(/*0*/ size: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun CGSizeEqualToSize(/*0*/ size1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*1*/ size2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>): kotlin.Boolean { TODO() }

fun CGSizeMake(/*0*/ width: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ height: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun CGSizeMakeWithDictionaryRepresentation(/*0*/ dict: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ size: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGSize>?): kotlin.Boolean { TODO() }

fun CGUnregisterScreenRefreshCallback(/*0*/ callback: platform.CoreGraphics.CGScreenRefreshCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.posix.uint32_t /* = kotlin.UInt */, kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>?, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*1*/ userInfo: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun CGVectorMake(/*0*/ dx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ dy: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGVector> { TODO() }

fun CGWaitForScreenRefreshRects(/*0*/ rects: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<platform.CoreGraphics.CGRect> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>> */>?, /*1*/ count: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGWaitForScreenUpdateRects(/*0*/ requestedOperations: platform.CoreGraphics.CGScreenUpdateOperation /* = kotlin.UInt */, /*1*/ currentOperation: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGScreenUpdateOperationVar /* = kotlinx.cinterop.UIntVarOf<platform.CoreGraphics.CGScreenUpdateOperation /* = kotlin.UInt */> */>?, /*2*/ rects: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<platform.CoreGraphics.CGRect> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<platform.CoreGraphics.CGRect>> */>?, /*3*/ rectCount: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?, /*4*/ delta: kotlinx.cinterop.CValuesRef<platform.CoreGraphics.CGScreenUpdateMoveDelta>?): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGWarpMouseCursorPosition(/*0*/ newCursorPosition: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): platform.CoreGraphics.CGError /* = kotlin.Int */ { TODO() }

fun CGWindowLevelForKey(/*0*/ key: platform.CoreGraphics.CGWindowLevelKey /* = kotlin.Int */): platform.CoreGraphics.CGWindowLevel /* = kotlin.Int */ { TODO() }

fun CGWindowListCopyWindowInfo(/*0*/ option: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */, /*1*/ relativeToWindow: platform.CoreGraphics.CGWindowID /* = kotlin.UInt */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGWindowListCreate(/*0*/ option: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */, /*1*/ relativeToWindow: platform.CoreGraphics.CGWindowID /* = kotlin.UInt */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGWindowListCreateDescriptionFromArray(/*0*/ windowArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun CGWindowListCreateImage(/*0*/ screenBounds: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ listOption: platform.CoreGraphics.CGWindowListOption /* = kotlin.UInt */, /*2*/ windowID: platform.CoreGraphics.CGWindowID /* = kotlin.UInt */, /*3*/ imageOption: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGWindowListCreateImageFromArray(/*0*/ screenBounds: kotlinx.cinterop.CValue<platform.CoreGraphics.CGRect>, /*1*/ windowArray: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*2*/ imageOption: platform.CoreGraphics.CGWindowImageOption /* = kotlin.UInt */): platform.CoreGraphics.CGImageRef? /* = kotlinx.cinterop.CPointer<cnames.structs.CGImage>? */ { TODO() }

fun CGWindowServerCFMachPort(): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun CGWindowServerCreateServerPort(): platform.CoreFoundation.CFMachPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFMachPort>? */ { TODO() }

fun __CGAffineTransformMake(/*0*/ a: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*1*/ b: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*2*/ c: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*3*/ d: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*4*/ tx: platform.CoreGraphics.CGFloat /* = kotlin.Double */, /*5*/ ty: platform.CoreGraphics.CGFloat /* = kotlin.Double */): kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform> { TODO() }

fun __CGPointApplyAffineTransform(/*0*/ point: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*1*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint> { TODO() }

fun __CGPointEqualToPoint(/*0*/ point1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>, /*1*/ point2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGPoint>): kotlin.Boolean { TODO() }

fun __CGSizeApplyAffineTransform(/*0*/ size: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*1*/ t: kotlinx.cinterop.CValue<platform.CoreGraphics.CGAffineTransform>): kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize> { TODO() }

fun __CGSizeEqualToSize(/*0*/ size1: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>, /*1*/ size2: kotlinx.cinterop.CValue<platform.CoreGraphics.CGSize>): kotlin.Boolean { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge0")private external fun kniBridge0(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge1")private external fun kniBridge1(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge10")private external fun kniBridge10(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge100")private external fun kniBridge100(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge101")private external fun kniBridge101(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge102")private external fun kniBridge102(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge103")private external fun kniBridge103(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge104")private external fun kniBridge104(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge105")private external fun kniBridge105(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge106")private external fun kniBridge106(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge107")private external fun kniBridge107(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge108")private external fun kniBridge108(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge109")private external fun kniBridge109(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge110")private external fun kniBridge110(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge111")private external fun kniBridge111(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge112")private external fun kniBridge112(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge113")private external fun kniBridge113(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge114")private external fun kniBridge114(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge115")private external fun kniBridge115(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge116")private external fun kniBridge116(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge117")private external fun kniBridge117(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge118")private external fun kniBridge118(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge119")private external fun kniBridge119(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge120")private external fun kniBridge120(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge121")private external fun kniBridge121(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge122")private external fun kniBridge122(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge123")private external fun kniBridge123(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge124")private external fun kniBridge124(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge125")private external fun kniBridge125(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge126")private external fun kniBridge126(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge127")private external fun kniBridge127(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge128")private external fun kniBridge128(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge129")private external fun kniBridge129(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge13")private external fun kniBridge13(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge130")private external fun kniBridge130(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge131")private external fun kniBridge131(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge132")private external fun kniBridge132(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge133")private external fun kniBridge133(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge134")private external fun kniBridge134(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge135")private external fun kniBridge135(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge136")private external fun kniBridge136(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge137")private external fun kniBridge137(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge138")private external fun kniBridge138(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge139")private external fun kniBridge139(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UShort): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge140")private external fun kniBridge140(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge141")private external fun kniBridge141(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Int, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge142")private external fun kniBridge142(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge143")private external fun kniBridge143(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge144")private external fun kniBridge144(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge145")private external fun kniBridge145(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge146")private external fun kniBridge146(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge147")private external fun kniBridge147(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge148")private external fun kniBridge148(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge149")private external fun kniBridge149(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge150")private external fun kniBridge150(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge151")private external fun kniBridge151(/*0*/ p0: kotlin.ULong, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.UInt, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*9*/ p9: kotlin.Byte, /*10*/ p10: kotlin.Int): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge152")private external fun kniBridge152(/*0*/ p0: kotlin.ULong, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*7*/ p7: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge153")private external fun kniBridge153(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge154")private external fun kniBridge154(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Int): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge155")private external fun kniBridge155(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Int): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge156")private external fun kniBridge156(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge157")private external fun kniBridge157(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge158")private external fun kniBridge158(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge159")private external fun kniBridge159(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge16")private external fun kniBridge16(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge160")private external fun kniBridge160(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge161")private external fun kniBridge161(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge162")private external fun kniBridge162(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge163")private external fun kniBridge163(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge164")private external fun kniBridge164(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge165")private external fun kniBridge165(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge166")private external fun kniBridge166(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge167")private external fun kniBridge167(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge168")private external fun kniBridge168(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge169")private external fun kniBridge169(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge170")private external fun kniBridge170(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge171")private external fun kniBridge171(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge172")private external fun kniBridge172(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge173")private external fun kniBridge173(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge174")private external fun kniBridge174(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge175")private external fun kniBridge175(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge176")private external fun kniBridge176(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge177")private external fun kniBridge177(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge178")private external fun kniBridge178(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge179")private external fun kniBridge179(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge180")private external fun kniBridge180(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge181")private external fun kniBridge181(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge182")private external fun kniBridge182(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge183")private external fun kniBridge183(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge184")private external fun kniBridge184(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge185")private external fun kniBridge185(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge186")private external fun kniBridge186(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge187")private external fun kniBridge187(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge188")private external fun kniBridge188(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge189")private external fun kniBridge189(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlin.Int, /*5*/ p5: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge190")private external fun kniBridge190(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge191")private external fun kniBridge191(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge192")private external fun kniBridge192(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge193")private external fun kniBridge193(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge194")private external fun kniBridge194(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge195")private external fun kniBridge195(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge196")private external fun kniBridge196(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.Double, /*7*/ p7: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge197")private external fun kniBridge197(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge198")private external fun kniBridge198(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge199")private external fun kniBridge199(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge2")private external fun kniBridge2(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge200")private external fun kniBridge200(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge201")private external fun kniBridge201(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge202")private external fun kniBridge202(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge203")private external fun kniBridge203(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.Double, /*7*/ p7: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge204")private external fun kniBridge204(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge205")private external fun kniBridge205(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge206")private external fun kniBridge206(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge207")private external fun kniBridge207(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge208")private external fun kniBridge208(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge209")private external fun kniBridge209(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge210")private external fun kniBridge210(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge211")private external fun kniBridge211(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Byte): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge212")private external fun kniBridge212(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge213")private external fun kniBridge213(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreGraphics_kniBridge214")private fun kniBridge214(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge215")private external fun kniBridge215(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge216")private external fun kniBridge216(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge217")private external fun kniBridge217(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge218")private external fun kniBridge218(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge219")private external fun kniBridge219(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge22")private external fun kniBridge22(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge220")private external fun kniBridge220(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge221")private external fun kniBridge221(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge222")private external fun kniBridge222(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge223")private external fun kniBridge223(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge224")private external fun kniBridge224(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge225")private external fun kniBridge225(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge226")private external fun kniBridge226(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge227")private external fun kniBridge227(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge228")private external fun kniBridge228(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge229")private external fun kniBridge229(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge230")private external fun kniBridge230(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge231")private external fun kniBridge231(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge232")private external fun kniBridge232(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge233")private external fun kniBridge233(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge234")private external fun kniBridge234(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreGraphics_kniBridge235")private fun kniBridge235(/*0*/ p0: kotlin.ULong, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge236")private external fun kniBridge236(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge237")private external fun kniBridge237(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge238")private external fun kniBridge238(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge239")private external fun kniBridge239(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge240")private external fun kniBridge240(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge241")private external fun kniBridge241(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge242")private external fun kniBridge242(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge243")private external fun kniBridge243(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge244")private external fun kniBridge244(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge245")private external fun kniBridge245(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge246")private external fun kniBridge246(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge247")private external fun kniBridge247(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreGraphics_kniBridge248")private fun kniBridge248(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge249")private external fun kniBridge249(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge250")private external fun kniBridge250(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge251")private external fun kniBridge251(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge252")private external fun kniBridge252(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge253")private external fun kniBridge253(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge254")private external fun kniBridge254(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge255")private external fun kniBridge255(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlin.Byte, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge256")private external fun kniBridge256(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge257")private external fun kniBridge257(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge258")private external fun kniBridge258(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge259")private external fun kniBridge259(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge260")private external fun kniBridge260(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge261")private external fun kniBridge261(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge262")private external fun kniBridge262(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge263")private external fun kniBridge263(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge264")private external fun kniBridge264(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge265")private external fun kniBridge265(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge266")private external fun kniBridge266(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge267")private external fun kniBridge267(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge268")private external fun kniBridge268(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge269")private external fun kniBridge269(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge270")private external fun kniBridge270(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge271")private external fun kniBridge271(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge272")private external fun kniBridge272(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge273")private external fun kniBridge273(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge274")private external fun kniBridge274(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge275")private external fun kniBridge275(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge276")private external fun kniBridge276(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge277")private external fun kniBridge277(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge278")private external fun kniBridge278(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge279")private external fun kniBridge279(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge280")private external fun kniBridge280(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge281")private external fun kniBridge281(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge282")private external fun kniBridge282(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge283")private external fun kniBridge283(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge284")private external fun kniBridge284(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge285")private external fun kniBridge285(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge286")private external fun kniBridge286(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge287")private external fun kniBridge287(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.Byte, /*5*/ p5: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge288")private external fun kniBridge288(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.Byte, /*7*/ p7: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge289")private external fun kniBridge289(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge290")private external fun kniBridge290(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge291")private external fun kniBridge291(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge292")private external fun kniBridge292(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge293")private external fun kniBridge293(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge294")private external fun kniBridge294(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge295")private external fun kniBridge295(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge296")private external fun kniBridge296(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge297")private external fun kniBridge297(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge298")private external fun kniBridge298(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge299")private external fun kniBridge299(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge3")private external fun kniBridge3(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge300")private external fun kniBridge300(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge301")private external fun kniBridge301(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge302")private external fun kniBridge302(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge303")private external fun kniBridge303(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge304")private external fun kniBridge304(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge305")private external fun kniBridge305(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge306")private external fun kniBridge306(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge307")private external fun kniBridge307(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge308")private external fun kniBridge308(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge309")private external fun kniBridge309(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge310")private external fun kniBridge310(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge311")private external fun kniBridge311(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge312")private external fun kniBridge312(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge313")private external fun kniBridge313(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge314")private external fun kniBridge314(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge315")private external fun kniBridge315(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge316")private external fun kniBridge316(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge317")private external fun kniBridge317(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge318")private external fun kniBridge318(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge319")private external fun kniBridge319(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge320")private external fun kniBridge320(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge321")private external fun kniBridge321(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge322")private external fun kniBridge322(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge323")private external fun kniBridge323(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge324")private external fun kniBridge324(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge325")private external fun kniBridge325(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Int): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge326")private external fun kniBridge326(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge327")private external fun kniBridge327(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge328")private external fun kniBridge328(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge329")private external fun kniBridge329(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge330")private external fun kniBridge330(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge331")private external fun kniBridge331(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge332")private external fun kniBridge332(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge333")private external fun kniBridge333(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge334")private external fun kniBridge334(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge335")private external fun kniBridge335(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge336")private external fun kniBridge336(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge337")private external fun kniBridge337(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge338")private external fun kniBridge338(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge339")private external fun kniBridge339(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge340")private external fun kniBridge340(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge341")private external fun kniBridge341(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge342")private external fun kniBridge342(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge343")private external fun kniBridge343(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge344")private external fun kniBridge344(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge345")private external fun kniBridge345(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge346")private external fun kniBridge346(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge347")private external fun kniBridge347(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge348")private external fun kniBridge348(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge349")private external fun kniBridge349(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge350")private external fun kniBridge350(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge351")private external fun kniBridge351(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge352")private external fun kniBridge352(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge353")private external fun kniBridge353(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge354")private external fun kniBridge354(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge355")private external fun kniBridge355(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge356")private external fun kniBridge356(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge357")private external fun kniBridge357(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge358")private external fun kniBridge358(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge359")private external fun kniBridge359(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge360")private external fun kniBridge360(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge361")private external fun kniBridge361(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge362")private external fun kniBridge362(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge363")private external fun kniBridge363(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge364")private external fun kniBridge364(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge365")private external fun kniBridge365(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge366")private external fun kniBridge366(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge367")private external fun kniBridge367(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge368")private external fun kniBridge368(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge369")private external fun kniBridge369(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge370")private external fun kniBridge370(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge371")private external fun kniBridge371(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge372")private external fun kniBridge372(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge373")private external fun kniBridge373(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge374")private external fun kniBridge374(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge375")private external fun kniBridge375(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge376")private external fun kniBridge376(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge377")private external fun kniBridge377(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge378")private external fun kniBridge378(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge379")private external fun kniBridge379(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge38")private external fun kniBridge38(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge380")private external fun kniBridge380(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge381")private external fun kniBridge381(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge382")private external fun kniBridge382(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge383")private external fun kniBridge383(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge384")private external fun kniBridge384(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge385")private external fun kniBridge385(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge386")private external fun kniBridge386(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge387")private external fun kniBridge387(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge388")private external fun kniBridge388(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge389")private external fun kniBridge389(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge39")private external fun kniBridge39(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge390")private external fun kniBridge390(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge391")private external fun kniBridge391(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge392")private external fun kniBridge392(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge393")private external fun kniBridge393(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge394")private external fun kniBridge394(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge395")private external fun kniBridge395(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge396")private external fun kniBridge396(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge397")private external fun kniBridge397(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge398")private external fun kniBridge398(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge399")private external fun kniBridge399(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge40")private external fun kniBridge40(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge400")private external fun kniBridge400(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge401")private external fun kniBridge401(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge402")private external fun kniBridge402(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge403")private external fun kniBridge403(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge404")private external fun kniBridge404(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge405")private external fun kniBridge405(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge406")private external fun kniBridge406(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge407")private external fun kniBridge407(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge408")private external fun kniBridge408(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge409")private external fun kniBridge409(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge41")private external fun kniBridge41(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge410")private external fun kniBridge410(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge411")private external fun kniBridge411(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.UInt, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge412")private external fun kniBridge412(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge413")private external fun kniBridge413(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge414")private external fun kniBridge414(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge415")private external fun kniBridge415(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge416")private external fun kniBridge416(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge417")private external fun kniBridge417(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge418")private external fun kniBridge418(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge419")private external fun kniBridge419(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge42")private external fun kniBridge42(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge420")private external fun kniBridge420(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge421")private external fun kniBridge421(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge422")private external fun kniBridge422(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge423")private external fun kniBridge423(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge424")private external fun kniBridge424(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge425")private external fun kniBridge425(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge426")private external fun kniBridge426(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge427")private external fun kniBridge427(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge428")private external fun kniBridge428(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge429")private external fun kniBridge429(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge43")private external fun kniBridge43(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge430")private external fun kniBridge430(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge431")private external fun kniBridge431(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge432")private external fun kniBridge432(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge433")private external fun kniBridge433(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge434")private external fun kniBridge434(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge435")private external fun kniBridge435(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge436")private external fun kniBridge436(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge437")private external fun kniBridge437(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge438")private external fun kniBridge438(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge439")private external fun kniBridge439(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge44")private external fun kniBridge44(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge440")private external fun kniBridge440(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge441")private external fun kniBridge441(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge442")private external fun kniBridge442(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge443")private external fun kniBridge443(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge444")private external fun kniBridge444(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge445")private external fun kniBridge445(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge446")private external fun kniBridge446(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge447")private external fun kniBridge447(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge448")private external fun kniBridge448(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge449")private external fun kniBridge449(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge45")private external fun kniBridge45(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge450")private external fun kniBridge450(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge451")private external fun kniBridge451(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge452")private external fun kniBridge452(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge453")private external fun kniBridge453(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge454")private external fun kniBridge454(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge455")private external fun kniBridge455(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge456")private external fun kniBridge456(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge457")private external fun kniBridge457(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge458")private external fun kniBridge458(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge459")private external fun kniBridge459(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge46")private external fun kniBridge46(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge460")private external fun kniBridge460(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge461")private external fun kniBridge461(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge462")private external fun kniBridge462(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge463")private external fun kniBridge463(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge464")private external fun kniBridge464(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge465")private external fun kniBridge465(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge466")private external fun kniBridge466(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge467")private external fun kniBridge467(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge468")private external fun kniBridge468(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge469")private external fun kniBridge469(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge47")private external fun kniBridge47(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge470")private external fun kniBridge470(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge471")private external fun kniBridge471(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge472")private external fun kniBridge472(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge473")private external fun kniBridge473(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge474")private external fun kniBridge474(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge475")private external fun kniBridge475(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge476")private external fun kniBridge476(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge477")private external fun kniBridge477(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge478")private external fun kniBridge478(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge479")private external fun kniBridge479(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge48")private external fun kniBridge48(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge480")private external fun kniBridge480(/*0*/ p0: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge481")private external fun kniBridge481(): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge482")private external fun kniBridge482(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge483")private external fun kniBridge483(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge484")private external fun kniBridge484(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge485")private external fun kniBridge485(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge486")private external fun kniBridge486(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge487")private external fun kniBridge487(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge488")private external fun kniBridge488(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge489")private external fun kniBridge489(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge49")private external fun kniBridge49(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge490")private external fun kniBridge490(/*0*/ p0: kotlin.UInt): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge491")private external fun kniBridge491(/*0*/ p0: kotlin.UInt): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge492")private external fun kniBridge492(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge493")private external fun kniBridge493(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge494")private external fun kniBridge494(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge495")private external fun kniBridge495(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge496")private external fun kniBridge496(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge497")private external fun kniBridge497(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge498")private external fun kniBridge498(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge499")private external fun kniBridge499(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge5")private external fun kniBridge5(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge50")private external fun kniBridge50(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Double, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge500")private external fun kniBridge500(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge501")private external fun kniBridge501(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge502")private external fun kniBridge502(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge503")private external fun kniBridge503(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge504")private external fun kniBridge504(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge505")private external fun kniBridge505(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge506")private external fun kniBridge506(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge507")private external fun kniBridge507(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.Float, /*2*/ p2: kotlin.Float, /*3*/ p3: kotlin.Float, /*4*/ p4: kotlin.Float, /*5*/ p5: kotlin.Float, /*6*/ p6: kotlin.Float, /*7*/ p7: kotlin.Float, /*8*/ p8: kotlin.Float, /*9*/ p9: kotlin.Float): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge508")private external fun kniBridge508(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*9*/ p9: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge509")private external fun kniBridge509(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge51")private external fun kniBridge51(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge510")private external fun kniBridge510(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge511")private external fun kniBridge511(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge512")private external fun kniBridge512(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge513")private external fun kniBridge513()

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge514")private external fun kniBridge514(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge515")private external fun kniBridge515(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge516")private external fun kniBridge516(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge517")private external fun kniBridge517(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge518")private external fun kniBridge518(): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge519")private external fun kniBridge519(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge52")private external fun kniBridge52(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge520")private external fun kniBridge520(): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge521")private external fun kniBridge521(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge522")private external fun kniBridge522(): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge523")private external fun kniBridge523(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge524")private external fun kniBridge524(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge525")private external fun kniBridge525(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge526")private external fun kniBridge526(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge527")private external fun kniBridge527(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge528")private external fun kniBridge528(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge529")private external fun kniBridge529(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge53")private external fun kniBridge53(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge530")private external fun kniBridge530(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge531")private external fun kniBridge531(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge532")private external fun kniBridge532(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge533")private external fun kniBridge533(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge534")private external fun kniBridge534(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge535")private external fun kniBridge535(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge536")private external fun kniBridge536(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.Int, /*3*/ p3: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge537")private external fun kniBridge537(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge538")private external fun kniBridge538(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge539")private external fun kniBridge539(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge54")private external fun kniBridge54(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge540")private external fun kniBridge540(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge541")private external fun kniBridge541(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge542")private external fun kniBridge542()

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge543")private external fun kniBridge543(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge544")private external fun kniBridge544(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge545")private external fun kniBridge545(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge546")private external fun kniBridge546(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge547")private external fun kniBridge547(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge548")private external fun kniBridge548(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge549")private external fun kniBridge549(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge55")private external fun kniBridge55(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge550")private external fun kniBridge550(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge551")private external fun kniBridge551(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge552")private external fun kniBridge552(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge553")private external fun kniBridge553(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge554")private external fun kniBridge554(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge555")private external fun kniBridge555(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge556")private external fun kniBridge556(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge557")private external fun kniBridge557(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge558")private external fun kniBridge558(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge559")private external fun kniBridge559(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge56")private external fun kniBridge56(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge560")private external fun kniBridge560(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge561")private external fun kniBridge561(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge562")private external fun kniBridge562(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge563")private external fun kniBridge563(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge564")private external fun kniBridge564(/*0*/ p0: kotlin.UInt): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge565")private external fun kniBridge565(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge566")private external fun kniBridge566(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge567")private external fun kniBridge567(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Float, /*2*/ p2: kotlin.Float, /*3*/ p3: kotlin.Float, /*4*/ p4: kotlin.Float, /*5*/ p5: kotlin.Float): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge568")private external fun kniBridge568(/*0*/ p0: kotlin.Float, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge569")private external fun kniBridge569(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge57")private external fun kniBridge57(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge570")private external fun kniBridge570(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.Float, /*2*/ p2: kotlin.Float, /*3*/ p3: kotlin.Float, /*4*/ p4: kotlin.Float, /*5*/ p5: kotlin.Float, /*6*/ p6: kotlin.Float, /*7*/ p7: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge571")private external fun kniBridge571(): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge572")private external fun kniBridge572(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge573")private external fun kniBridge573(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge574")private external fun kniBridge574(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge575")private external fun kniBridge575(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge576")private external fun kniBridge576(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge577")private external fun kniBridge577(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge578")private external fun kniBridge578(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreGraphics_kniBridge579")private fun kniBridge579(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge58")private external fun kniBridge58(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge580")private external fun kniBridge580(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.internal.ExportForCppRuntime(name = "platform_CoreGraphics_kniBridge581")private fun kniBridge581(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge582")private external fun kniBridge582(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge583")private external fun kniBridge583(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge584")private external fun kniBridge584(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge585")private external fun kniBridge585(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge586")private external fun kniBridge586(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge587")private external fun kniBridge587(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge588")private external fun kniBridge588(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge589")private external fun kniBridge589(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge59")private external fun kniBridge59(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge590")private external fun kniBridge590(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge591")private external fun kniBridge591(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge592")private external fun kniBridge592(): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge593")private external fun kniBridge593(): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge594")private external fun kniBridge594(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge595")private external fun kniBridge595(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge596")private external fun kniBridge596(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge597")private external fun kniBridge597(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge598")private external fun kniBridge598(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge599")private external fun kniBridge599(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge60")private external fun kniBridge60(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge600")private external fun kniBridge600(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge601")private external fun kniBridge601(/*0*/ p0: kotlin.UShort, /*1*/ p1: kotlin.UShort, /*2*/ p2: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge602")private external fun kniBridge602(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge603")private external fun kniBridge603(/*0*/ p0: kotlin.Double): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge604")private external fun kniBridge604(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge605")private external fun kniBridge605(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge606")private external fun kniBridge606(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge607")private external fun kniBridge607(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge608")private external fun kniBridge608(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge609")private external fun kniBridge609(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge61")private external fun kniBridge61(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge610")private external fun kniBridge610(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UShort, /*2*/ p2: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge611")private external fun kniBridge611(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge612")private external fun kniBridge612(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.Int, /*4*/ p4: kotlin.Int, /*5*/ p5: kotlin.Int): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge613")private external fun kniBridge613(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge614")private external fun kniBridge614(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge615")private external fun kniBridge615(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge616")private external fun kniBridge616(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge617")private external fun kniBridge617(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge618")private external fun kniBridge618(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge619")private external fun kniBridge619(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge62")private external fun kniBridge62(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge620")private external fun kniBridge620(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge621")private external fun kniBridge621(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge622")private external fun kniBridge622(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge623")private external fun kniBridge623(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge624")private external fun kniBridge624(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge625")private external fun kniBridge625(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge626")private external fun kniBridge626(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge627")private external fun kniBridge627(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge628")private external fun kniBridge628(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge629")private external fun kniBridge629(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge63")private external fun kniBridge63(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge630")private external fun kniBridge630(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge631")private external fun kniBridge631(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge632")private external fun kniBridge632(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge633")private external fun kniBridge633(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge634")private external fun kniBridge634(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge635")private external fun kniBridge635(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge636")private external fun kniBridge636(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge637")private external fun kniBridge637(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge638")private external fun kniBridge638(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge639")private external fun kniBridge639(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge64")private external fun kniBridge64(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge640")private external fun kniBridge640(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge641")private external fun kniBridge641(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge642")private external fun kniBridge642(/*0*/ p0: kotlin.Int): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge643")private external fun kniBridge643(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge644")private external fun kniBridge644(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge645")private external fun kniBridge645(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge646")private external fun kniBridge646(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge647")private external fun kniBridge647(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge648")private external fun kniBridge648(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge649")private external fun kniBridge649(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.UShort): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge65")private external fun kniBridge65(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge650")private external fun kniBridge650(/*0*/ p0: kotlin.Int): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge651")private external fun kniBridge651(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.UInt): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge652")private external fun kniBridge652(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge653")private external fun kniBridge653(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge654")private external fun kniBridge654(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge655")private external fun kniBridge655(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge656")private external fun kniBridge656(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge657")private external fun kniBridge657(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Double)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge658")private external fun kniBridge658(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge659")private external fun kniBridge659(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge66")private external fun kniBridge66(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge660")private external fun kniBridge660(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge661")private external fun kniBridge661(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge662")private external fun kniBridge662(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge663")private external fun kniBridge663(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge664")private external fun kniBridge664(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge665")private external fun kniBridge665(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge666")private external fun kniBridge666(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge667")private external fun kniBridge667(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge668")private external fun kniBridge668(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge669")private external fun kniBridge669(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge67")private external fun kniBridge67(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge670")private external fun kniBridge670(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge671")private external fun kniBridge671(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge672")private external fun kniBridge672(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge673")private external fun kniBridge673(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge674")private external fun kniBridge674(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge675")private external fun kniBridge675(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge676")private external fun kniBridge676(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge677")private external fun kniBridge677(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge678")private external fun kniBridge678(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge679")private external fun kniBridge679(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge68")private external fun kniBridge68(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge680")private external fun kniBridge680(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge681")private external fun kniBridge681(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge682")private external fun kniBridge682(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge683")private external fun kniBridge683(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge684")private external fun kniBridge684(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge685")private external fun kniBridge685(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge686")private external fun kniBridge686(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge687")private external fun kniBridge687(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge688")private external fun kniBridge688(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge689")private external fun kniBridge689(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge69")private external fun kniBridge69(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge690")private external fun kniBridge690(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge691")private external fun kniBridge691(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge692")private external fun kniBridge692(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge693")private external fun kniBridge693(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge694")private external fun kniBridge694(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge695")private external fun kniBridge695(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge696")private external fun kniBridge696(): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge697")private external fun kniBridge697(): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge698")private external fun kniBridge698(): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge699")private external fun kniBridge699(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge70")private external fun kniBridge70(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge700")private external fun kniBridge700(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge701")private external fun kniBridge701(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge702")private external fun kniBridge702(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge703")private external fun kniBridge703(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge704")private external fun kniBridge704(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge705")private external fun kniBridge705(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge706")private external fun kniBridge706(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge707")private external fun kniBridge707(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge708")private external fun kniBridge708(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge709")private external fun kniBridge709(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge71")private external fun kniBridge71(/*0*/ p0: kotlin.ULong, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge710")private external fun kniBridge710(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge711")private external fun kniBridge711(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge712")private external fun kniBridge712(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge713")private external fun kniBridge713(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge714")private external fun kniBridge714(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge715")private external fun kniBridge715(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge716")private external fun kniBridge716(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge717")private external fun kniBridge717(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge718")private external fun kniBridge718(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge719")private external fun kniBridge719(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge72")private external fun kniBridge72(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge720")private external fun kniBridge720(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge721")private external fun kniBridge721(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge722")private external fun kniBridge722(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge723")private external fun kniBridge723(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge724")private external fun kniBridge724(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge725")private external fun kniBridge725(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge726")private external fun kniBridge726(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge727")private external fun kniBridge727(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge728")private external fun kniBridge728(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge729")private external fun kniBridge729(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge73")private external fun kniBridge73(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge730")private external fun kniBridge730(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge731")private external fun kniBridge731(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge732")private external fun kniBridge732(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge733")private external fun kniBridge733(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge734")private external fun kniBridge734(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge735")private external fun kniBridge735(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge736")private external fun kniBridge736(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge737")private external fun kniBridge737(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge738")private external fun kniBridge738(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge739")private external fun kniBridge739(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge74")private external fun kniBridge74(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge740")private external fun kniBridge740(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge741")private external fun kniBridge741(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge742")private external fun kniBridge742(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge743")private external fun kniBridge743(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge744")private external fun kniBridge744(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge745")private external fun kniBridge745(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge746")private external fun kniBridge746(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge747")private external fun kniBridge747(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge748")private external fun kniBridge748(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge749")private external fun kniBridge749(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge75")private external fun kniBridge75(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge750")private external fun kniBridge750(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge751")private external fun kniBridge751(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge752")private external fun kniBridge752(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge753")private external fun kniBridge753(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge754")private external fun kniBridge754(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge755")private external fun kniBridge755(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge756")private external fun kniBridge756(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge757")private external fun kniBridge757(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge76")private external fun kniBridge76(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge77")private external fun kniBridge77(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge78")private external fun kniBridge78(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge79")private external fun kniBridge79(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge80")private external fun kniBridge80(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge81")private external fun kniBridge81(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge82")private external fun kniBridge82(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge83")private external fun kniBridge83(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge84")private external fun kniBridge84(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge85")private external fun kniBridge85(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge86")private external fun kniBridge86(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge87")private external fun kniBridge87(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge88")private external fun kniBridge88(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge89")private external fun kniBridge89(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge9")private external fun kniBridge9(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge90")private external fun kniBridge90(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge91")private external fun kniBridge91(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge92")private external fun kniBridge92(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge93")private external fun kniBridge93(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge94")private external fun kniBridge94(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Double, /*4*/ p4: kotlin.Double, /*5*/ p5: kotlin.Int, /*6*/ p6: kotlin.Byte, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge95")private external fun kniBridge95(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge96")private external fun kniBridge96(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge97")private external fun kniBridge97(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge98")private external fun kniBridge98(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_CoreGraphics_kniBridge99")private external fun kniBridge99(/*0*/ p0: kotlin.Double, /*1*/ p1: kotlin.Double, /*2*/ p2: kotlin.Double, /*3*/ p3: kotlin.Double): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */


