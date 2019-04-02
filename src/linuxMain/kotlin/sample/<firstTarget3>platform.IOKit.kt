@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.IOKit

import kotlinx.cinterop.* 

final enum class EvCmd private constructor(/*0*/ value: kotlin.UInt): kotlinx.cinterop.CEnum {
    EVNOP(TODO()),

    EVHIDE(TODO()),

    EVSHOW(TODO()),

    EVMOVE(TODO()),

    EVLEVEL(TODO());

    open override /*1*/ val value: kotlin.UInt
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.IOKit.EvCmd { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.IOKit.EvCmd
            get() = TODO()
            set(value: platform.IOKit.EvCmd) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class IOAsyncCompletionContent public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOColorEntry public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var blue: platform.IOKit.IOColorComponent /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.IOKit.IOColorComponent /* = kotlin.UShort */) = TODO()

    final var green: platform.IOKit.IOColorComponent /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.IOKit.IOColorComponent /* = kotlin.UShort */) = TODO()

    final var index: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var red: platform.IOKit.IOColorComponent /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.IOKit.IOColorComponent /* = kotlin.UShort */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IODetailedTimingInformationV1 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var horizontalActive: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalBlanking: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalBorder: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalSyncOffset: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalSyncWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var pixelClock: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalActive: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalBlanking: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalBorder: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalSyncOffset: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalSyncWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IODetailedTimingInformationV2 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val __reservedA: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final val __reservedB: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final var bitsPerColorComponent: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var colorimetry: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var dynamicRange: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var horizontalActive: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalBlanking: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalBorderLeft: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalBorderRight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalScaled: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalScaledInset: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalSyncConfig: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalSyncLevel: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalSyncOffset: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var horizontalSyncPulseWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxPixelClock: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var minPixelClock: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var numLinks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var pixelClock: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var pixelEncoding: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var scalerFlags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var signalConfig: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var signalLevels: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalActive: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalBlanking: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalBlankingExtension: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalBorderBottom: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalBorderTop: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalScaled: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalScaledInset: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalSyncConfig: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalSyncLevel: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalSyncOffset: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var verticalSyncPulseWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IODisplayModeInformation public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var flags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var imageHeight: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var imageWidth: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var maxDepthIndex: platform.IOKit.IOIndex /* = kotlin.Int */
        get() = TODO()
        set(value: platform.IOKit.IOIndex /* = kotlin.Int */) = TODO()

    final var nominalHeight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var nominalWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var refreshRate: platform.IOKit.IOFixed1616 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOFixed1616 /* = kotlin.UInt */) = TODO()

    final val reserved: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IODisplayScalerInformation public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val __reservedA: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final val __reservedB: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final val __reservedC: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final var maxHorizontalPixels: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalPixels: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var scalerFeatures: platform.IOKit.IOOptionBits /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOOptionBits /* = kotlin.UInt */) = TODO()

    final var version: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IODisplayTimingRange public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val __reservedA: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final val __reservedB: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final val __reservedD: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final var __reservedE: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final val __reservedF: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final var charSizeHorizontalActive: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeHorizontalBlanking: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeHorizontalBorderLeft: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeHorizontalBorderRight: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeHorizontalSyncOffset: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeHorizontalSyncPulse: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeHorizontalTotal: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalActive: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalBlanking: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalBorderBottom: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalBorderTop: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalSyncOffset: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalSyncPulse: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var charSizeVerticalTotal: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var maxFrameRate: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalActiveClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalBlankingClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalBorderLeft: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalBorderRight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalPulseWidthClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalSyncOffsetClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxHorizontalTotal: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxLineRate: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxLink0PixelClock: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxLink1PixelClock: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxNumLinks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxPixelClock: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var maxPixelError: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalActiveClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalBlankingClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalBorderBottom: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalBorderTop: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalPulseWidthClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalSyncOffsetClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var maxVerticalTotal: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minFrameRate: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minHorizontalActiveClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minHorizontalBlankingClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minHorizontalBorderLeft: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minHorizontalBorderRight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minHorizontalPulseWidthClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minHorizontalSyncOffsetClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minLineRate: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minLink0PixelClock: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minLink1PixelClock: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minPixelClock: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var minVerticalActiveClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minVerticalBlankingClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minVerticalBorderBottom: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minVerticalBorderTop: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minVerticalPulseWidthClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minVerticalSyncOffsetClocks: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var supportedBitsPerColorComponent: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var supportedColorimetryModes: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var supportedDynamicRangeModes: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var supportedPixelEncoding: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var supportedSignalConfigs: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var supportedSignalLevels: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var supportedSyncFlags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var version: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOFBDPLinkConfig public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val __reservedA: kotlinx.cinterop.CArrayPointer<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */>> */
        get() = TODO()

    final val __reservedB: kotlinx.cinterop.CArrayPointer<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */>> */
        get() = TODO()

    final var bitRate: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var downspread: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var idlePatterns: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var laneCount: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var maxBitRate: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var maxDownspread: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var maxLaneCount: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var preEmphasis: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var scrambler: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    final var t1Time: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var t2Time: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var t3Time: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var version: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var voltage: platform.posix.uint8_t /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.posix.uint8_t /* = kotlin.UByte */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOFBDisplayModeDescription public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val info: platform.IOKit.IODisplayModeInformation
        get() = TODO()

    final val timingInfo: platform.IOKit.IOTimingInformation
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOFBHDRMetaData public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val v1: platform.IOKit.IOFBHDRMetaDataV1
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOFBHDRMetaDataV1 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val __reservedA: kotlinx.cinterop.CArrayPointer<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */>> */
        get() = TODO()

    final var desiredLightLevel_Avg: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var desiredLightLevel_Max: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var desiredLuminance_Max: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var desiredLuminance_Min: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_X: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_X0: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_X1: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_X2: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_Y: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_Y0: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_Y1: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    final var displayPrimary_Y2: platform.posix.uint16_t /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.posix.uint16_t /* = kotlin.UShort */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOFramebufferInformation public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var activeHeight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var activeWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var baseAddress: platform.IOKit.IOPhysicalAddress /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOPhysicalAddress /* = kotlin.UInt */) = TODO()

    final var bitsPerPixel: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var bytesPerPlane: platform.IOKit.IOByteCount /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOByteCount /* = kotlin.UInt */) = TODO()

    final var bytesPerRow: platform.IOKit.IOByteCount /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOByteCount /* = kotlin.UInt */) = TODO()

    final var flags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var pixelType: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final val reserved: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOGBounds public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var maxx: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var maxy: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var minx: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var miny: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOGPoint public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var y: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOGSize public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var height: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var width: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOHardwareCursorDescriptor public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var bitDepth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var colorEncodings: kotlinx.cinterop.CPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?) = TODO()

    final var flags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var height: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var majorVersion: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var maskBitDepth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var minorVersion: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var numColors: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final val specialEncodings: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final var supportedSpecialEncodings: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var width: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOHardwareCursorInfo public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var colorMap: kotlinx.cinterop.CPointer<platform.IOKit.IOColorEntry>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.IOKit.IOColorEntry>?) = TODO()

    final var cursorHeight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var cursorHotSpotX: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var cursorHotSpotY: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var cursorWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var hardwareCursorData: kotlinx.cinterop.CPointer<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.darwin.UInt8Var /* = kotlinx.cinterop.UByteVarOf<platform.darwin.UInt8 /* = kotlin.UByte */> */>?) = TODO()

    final var majorVersion: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var minorVersion: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final val reserved: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IONamedValue public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?) = TODO()

    final var value: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOPhysicalRange public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var address: platform.IOKit.IOPhysicalAddress /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOPhysicalAddress /* = kotlin.UInt */) = TODO()

    final var length: platform.IOKit.IOByteCount /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOByteCount /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOPixelInformation public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var activeHeight: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var activeWidth: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var bitsPerComponent: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var bitsPerPixel: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var bytesPerPlane: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var bytesPerRow: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var componentCount: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final val componentMasks: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    final var flags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final val pixelFormat: platform.IOKit.IOPixelEncoding /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>> */
        get() = TODO()

    final var pixelType: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final val reserved: kotlinx.cinterop.CArrayPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOServiceInterestContent public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val messageArgument: kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */>> */
        get() = TODO()

    final var messageType: platform.darwin.natural_t /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.natural_t /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOServiceInterestContent64 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val messageArgument: kotlinx.cinterop.CArrayPointer<platform.libkern.io_user_reference_tVar /* = kotlinx.cinterop.ULongVarOf<platform.libkern.io_user_reference_t /* = kotlin.ULong */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVarOf<platform.libkern.io_user_reference_t /* = kotlin.ULong */>> */
        get() = TODO()

    final var messageType: platform.darwin.natural_t /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.natural_t /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOTimingInformation public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var appleTimingID: platform.IOKit.IOAppleTimingID /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOAppleTimingID /* = kotlin.UInt */) = TODO()

    final val detailedInfo: platform.IOKit.anonymousStruct1
        get() = TODO()

    final var flags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class IOVirtualRange public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var address: platform.IOKit.IOVirtualAddress /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.IOKit.IOVirtualAddress /* = kotlin.ULong */) = TODO()

    final var length: platform.IOKit.IOByteCount /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.IOKit.IOByteCount /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class NXEventData public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val compound: platform.IOKit.anonymousStruct10
        get() = TODO()

    final val key: platform.IOKit.anonymousStruct7
        get() = TODO()

    final val mouse: platform.IOKit.anonymousStruct3
        get() = TODO()

    final val mouseMove: platform.IOKit.anonymousStruct5
        get() = TODO()

    final val proximity: platform.IOKit.anonymousStruct14
        get() = TODO()

    final val scrollWheel: platform.IOKit.anonymousStruct9
        get() = TODO()

    final val tablet: platform.IOKit.anonymousStruct12
        get() = TODO()

    final val tracking: platform.IOKit.anonymousStruct8
        get() = TODO()

    final val zoom: platform.IOKit.anonymousStruct9
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class NXEventSystemDevice public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var dev_type: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    final var id: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    final var `interface`: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    final var interface_addr: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class NXEventSystemDeviceList public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val dev: kotlinx.cinterop.CArrayPointer<platform.IOKit.NXEventSystemDevice> /* = kotlinx.cinterop.CPointer<platform.IOKit.NXEventSystemDevice> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final enum class NXMouseButton private constructor(/*0*/ value: kotlin.UInt): kotlinx.cinterop.CEnum {
    NX_OneButton(TODO()),

    NX_LeftButton(TODO()),

    NX_RightButton(TODO());

    open override /*1*/ val value: kotlin.UInt
        get() = TODO()

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.IOKit.NXMouseButton { TODO() }
    }

    final class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        final var value: platform.IOKit.NXMouseButton
            get() = TODO()
            set(value: platform.IOKit.NXMouseButton) = TODO()

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final class OSNotificationHeader public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class OSNotificationHeader64 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXEvent public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val data: platform.IOKit.NXEventData
        get() = TODO()

    final var ext_pid: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var flags: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final val location: platform.IOKit.anonymousStruct15
        get() = TODO()

    final var service_id: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var time: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var type: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var window: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXEventExt public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val extension: platform.IOKit.NXEventExtension /* = platform.IOKit._NXEventExtension */
        get() = TODO()

    final val payload: platform.IOKit.NXEvent /* = platform.IOKit._NXEvent */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXEventExtension public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val audit: platform.darwin.audit_token_t
        get() = TODO()

    final var flags: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXPoint public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.IOKit.NXCoord /* = kotlin.Float */
        get() = TODO()
        set(value: platform.IOKit.NXCoord /* = kotlin.Float */) = TODO()

    final var y: platform.IOKit.NXCoord /* = kotlin.Float */
        get() = TODO()
        set(value: platform.IOKit.NXCoord /* = kotlin.Float */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXSize public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var height: platform.IOKit.NXCoord /* = kotlin.Float */
        get() = TODO()
        set(value: platform.IOKit.NXCoord /* = kotlin.Float */) = TODO()

    final var width: platform.IOKit.NXCoord /* = kotlin.Float */
        get() = TODO()
        set(value: platform.IOKit.NXCoord /* = kotlin.Float */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXTabletPointData public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var buttons: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var deviceID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var pressure: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var rotation: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var tangentialPressure: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final val tilt: platform.IOKit.anonymousStruct2
        get() = TODO()

    final var vendor1: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var vendor2: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var vendor3: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var x: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var y: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var z: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class _NXTabletProximityData public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var capabilityMask: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var deviceID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var enterProximity: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var pointerID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var pointerSerialNumber: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var pointerType: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var reserved1: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var systemTabletID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var tabletID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var uniqueID: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var vendorID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var vendorPointerType: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class __IOFixedPoint32 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()
        set(value: platform.posix.int32_t /* = kotlin.Int */) = TODO()

    final var y: platform.posix.int32_t /* = kotlin.Int */
        get() = TODO()
        set(value: platform.posix.int32_t /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct1 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val v1: platform.IOKit.IODetailedTimingInformationV1
        get() = TODO()

    final val v2: platform.IOKit.IODetailedTimingInformationV2
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct10 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val misc: platform.IOKit.anonymousStruct11
        get() = TODO()

    final var reserved: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var subType: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct11 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val C: kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>> */
        get() = TODO()

    final val F: kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.FloatVar /* = kotlinx.cinterop.FloatVarOf<kotlin.Float> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<kotlin.Float>> */
        get() = TODO()

    final val L: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */>> */
        get() = TODO()

    final val S: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt16Var /* = kotlinx.cinterop.ShortVarOf<platform.darwin.SInt16 /* = kotlin.Short */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVarOf<platform.darwin.SInt16 /* = kotlin.Short */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct12 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var buttons: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var deviceID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var pressure: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final val reserved: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */>> */
        get() = TODO()

    final var rotation: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var tangentialPressure: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final val tilt: platform.IOKit.anonymousStruct13
        get() = TODO()

    final var vendor1: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var vendor2: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var vendor3: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var x: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var y: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var z: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct13 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var y: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct14 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var capabilityMask: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var deviceID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var enterProximity: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var pointerID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var pointerSerialNumber: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var pointerType: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var reserved1: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final val reserved2: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */>> */
        get() = TODO()

    final var systemTabletID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var tabletID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var uniqueID: platform.darwin.UInt64 /* = kotlin.ULong */
        get() = TODO()
        set(value: platform.darwin.UInt64 /* = kotlin.ULong */) = TODO()

    final var vendorID: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var vendorPointerType: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct15 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var y: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct2 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var x: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var y: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct3 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var buttonNumber: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var click: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var eventNum: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var pressure: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var reserved2: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var reserved3: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var subType: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var subx: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var suby: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final val tablet: platform.IOKit.anonymousStruct4
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct4 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val point: platform.IOKit.NXTabletPointData /* = platform.IOKit._NXTabletPointData */
        get() = TODO()

    final val proximity: platform.IOKit.NXTabletProximityData /* = platform.IOKit._NXTabletProximityData */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct5 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var dx: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var dy: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved1: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var reserved2: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var subType: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var subx: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final var suby: platform.darwin.UInt8 /* = kotlin.UByte */
        get() = TODO()
        set(value: platform.darwin.UInt8 /* = kotlin.UByte */) = TODO()

    final val tablet: platform.IOKit.anonymousStruct6
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct6 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final val point: platform.IOKit.NXTabletPointData /* = platform.IOKit._NXTabletPointData */
        get() = TODO()

    final val proximity: platform.IOKit.NXTabletProximityData /* = platform.IOKit._NXTabletProximityData */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct7 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var charCode: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var charSet: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var keyCode: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var keyboardType: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var origCharCode: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var origCharSet: platform.darwin.UInt16 /* = kotlin.UShort */
        get() = TODO()
        set(value: platform.darwin.UInt16 /* = kotlin.UShort */) = TODO()

    final var repeat: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var reserved1: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved2: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved3: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved4: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final val reserved5: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct8 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var eventNum: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var reserved: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var reserved1: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved2: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved3: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved4: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved5: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final val reserved6: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */>> */
        get() = TODO()

    final var trackingNum: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var userData: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct9 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var deltaAxis1: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var deltaAxis2: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var deltaAxis3: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final var fixedDeltaAxis1: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var fixedDeltaAxis2: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var fixedDeltaAxis3: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var pointDeltaAxis1: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var pointDeltaAxis2: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var pointDeltaAxis3: platform.darwin.SInt32 /* = kotlin.Int */
        get() = TODO()
        set(value: platform.darwin.SInt32 /* = kotlin.Int */) = TODO()

    final var reserved1: platform.darwin.SInt16 /* = kotlin.Short */
        get() = TODO()
        set(value: platform.darwin.SInt16 /* = kotlin.Short */) = TODO()

    final val reserved8: kotlinx.cinterop.CArrayPointer<platform.darwin.SInt32Var /* = kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<platform.darwin.SInt32 /* = kotlin.Int */>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class evsioKeymapping public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var mapping: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?) = TODO()

    final var size: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class evsioMouseScaling public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var numScaleLevels: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    final val scaleFactors: kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ShortVar /* = kotlinx.cinterop.ShortVarOf<kotlin.Short> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVarOf<kotlin.Short>> */
        get() = TODO()

    final val scaleThresholds: kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ShortVar /* = kotlinx.cinterop.ShortVarOf<kotlin.Short> */> /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVarOf<kotlin.Short>> */
        get() = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

typealias IOAddressRange = platform.IOKit.IOVirtualRange

typealias IOAlignment = kotlin.UInt

typealias IOAlignmentVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOAlignment>

typealias IOAppleTimingID = platform.darwin.UInt32

typealias IOAppleTimingIDVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOAppleTimingID>

typealias IOAsyncCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.IOKit.IOReturn, kotlinx.cinterop.CPointer<kotlinx.cinterop.COpaquePointerVar>?, platform.posix.uint32_t) -> kotlin.Unit>>

typealias IOAsyncCallback0 = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.IOKit.IOReturn) -> kotlin.Unit>>

typealias IOAsyncCallback0Var = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOAsyncCallback0>

typealias IOAsyncCallback1 = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.IOKit.IOReturn, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias IOAsyncCallback1Var = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOAsyncCallback1>

typealias IOAsyncCallback2 = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.IOKit.IOReturn, kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias IOAsyncCallback2Var = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOAsyncCallback2>

typealias IOAsyncCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOAsyncCallback>

typealias IOByteCount = platform.IOKit.IOByteCount32

typealias IOByteCount32 = platform.darwin.UInt32

typealias IOByteCount32Var = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOByteCount32>

typealias IOByteCount64 = platform.darwin.UInt64

typealias IOByteCount64Var = kotlinx.cinterop.ULongVarOf<platform.IOKit.IOByteCount64>

typealias IOByteCountVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOByteCount>

typealias IOCacheMode = platform.darwin.UInt32

typealias IOCacheModeVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOCacheMode>

typealias IOColorComponent = platform.darwin.UInt16

typealias IOColorComponentVar = kotlinx.cinterop.UShortVarOf<platform.IOKit.IOColorComponent>

typealias IODetailedTimingInformation = platform.IOKit.IODetailedTimingInformationV2

typealias IODeviceNumber = kotlin.UInt

typealias IODeviceNumberVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IODeviceNumber>

typealias IODisplayModeID = platform.darwin.SInt32

typealias IODisplayModeIDVar = kotlinx.cinterop.IntVarOf<platform.IOKit.IODisplayModeID>

typealias IODisplayProductID = platform.darwin.UInt32

typealias IODisplayProductIDVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IODisplayProductID>

typealias IODisplayVendorID = platform.darwin.UInt32

typealias IODisplayVendorIDVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IODisplayVendorID>

typealias IOFixed = platform.darwin.SInt32

typealias IOFixed1616 = platform.darwin.UInt32

typealias IOFixed1616Var = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOFixed1616>

typealias IOFixedPoint32 = platform.IOKit.__IOFixedPoint32

typealias IOFixedVar = kotlinx.cinterop.IntVarOf<platform.IOKit.IOFixed>

typealias IOIndex = platform.darwin.SInt32

typealias IOIndexVar = kotlinx.cinterop.IntVarOf<platform.IOKit.IOIndex>

typealias IOItemCount = platform.darwin.UInt32

typealias IOItemCountVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOItemCount>

typealias IOLogicalAddress = platform.IOKit.IOVirtualAddress

typealias IOLogicalAddressVar = kotlinx.cinterop.ULongVarOf<platform.IOKit.IOLogicalAddress>

typealias IONotificationPortRef = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>

typealias IONotificationPortRefVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IONotificationPortRef>

typealias IOOptionBits = platform.darwin.UInt32

typealias IOOptionBitsVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOOptionBits>

typealias IOPhysicalAddress = platform.IOKit.IOPhysicalAddress32

typealias IOPhysicalAddress32 = platform.darwin.UInt32

typealias IOPhysicalAddress32Var = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOPhysicalAddress32>

typealias IOPhysicalAddress64 = platform.darwin.UInt64

typealias IOPhysicalAddress64Var = kotlinx.cinterop.ULongVarOf<platform.IOKit.IOPhysicalAddress64>

typealias IOPhysicalAddressVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOPhysicalAddress>

typealias IOPhysicalLength = platform.IOKit.IOPhysicalLength32

typealias IOPhysicalLength32 = platform.darwin.UInt32

typealias IOPhysicalLength32Var = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOPhysicalLength32>

typealias IOPhysicalLength64 = platform.darwin.UInt64

typealias IOPhysicalLength64Var = kotlinx.cinterop.ULongVarOf<platform.IOKit.IOPhysicalLength64>

typealias IOPhysicalLengthVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOPhysicalLength>

typealias IOPixelAperture = platform.IOKit.IOIndex

typealias IOPixelApertureVar = kotlinx.cinterop.IntVarOf<platform.IOKit.IOPixelAperture>

typealias IOPixelEncoding = kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ByteVar>

typealias IOPixelEncodingVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOPixelEncoding>

typealias IOReturn = platform.darwin.kern_return_t

typealias IOReturnVar = kotlinx.cinterop.IntVarOf<platform.IOKit.IOReturn>

typealias IOSelect = platform.darwin.UInt32

typealias IOSelectVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOSelect>

typealias IOServiceInterestCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.IOKit.io_service_t, platform.posix.uint32_t, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias IOServiceInterestCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOServiceInterestCallback>

typealias IOServiceMatchingCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer?, platform.IOKit.io_iterator_t) -> kotlin.Unit>>

typealias IOServiceMatchingCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.IOServiceMatchingCallback>

typealias IOVersion = platform.darwin.UInt32

typealias IOVersionVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.IOVersion>

typealias IOVirtualAddress = platform.darwin.mach_vm_address_t

typealias IOVirtualAddressVar = kotlinx.cinterop.ULongVarOf<platform.IOKit.IOVirtualAddress>

typealias NXCoord = kotlin.Float

typealias NXCoordVar = kotlinx.cinterop.FloatVarOf<platform.IOKit.NXCoord>

typealias NXEvent = platform.IOKit._NXEvent

typealias NXEventExt = platform.IOKit._NXEventExt

typealias NXEventExtension = platform.IOKit._NXEventExtension

typealias NXEventPtr = kotlinx.cinterop.CPointer<platform.IOKit._NXEvent>

typealias NXEventPtrVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.NXEventPtr>

typealias NXEventSystemInfoData = kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.IntVar>

typealias NXEventSystemInfoDataVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.NXEventSystemInfoData>

typealias NXEventSystemInfoType = kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>

typealias NXEventSystemInfoTypeVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.NXEventSystemInfoType>

typealias NXKeyMapping = platform.IOKit.evsioKeymapping

typealias NXMouseScaling = platform.IOKit.evsioMouseScaling

typealias NXPoint = platform.IOKit._NXPoint

typealias NXSize = platform.IOKit._NXSize

typealias NXTabletPointData = platform.IOKit._NXTabletPointData

typealias NXTabletPointDataPtr = kotlinx.cinterop.CPointer<platform.IOKit._NXTabletPointData>

typealias NXTabletPointDataPtrVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.NXTabletPointDataPtr>

typealias NXTabletProximityData = platform.IOKit._NXTabletProximityData

typealias NXTabletProximityDataPtr = kotlinx.cinterop.CPointer<platform.IOKit._NXTabletProximityData>

typealias NXTabletProximityDataPtrVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.NXTabletProximityDataPtr>

typealias OSAsyncReference = kotlinx.cinterop.CArrayPointer<platform.darwin.natural_tVar>

typealias OSAsyncReference64 = kotlinx.cinterop.CArrayPointer<platform.libkern.io_user_reference_tVar>

typealias OSAsyncReference64Var = kotlinx.cinterop.CPointerVarOf<platform.IOKit.OSAsyncReference64>

typealias OSAsyncReferenceVar = kotlinx.cinterop.CPointerVarOf<platform.IOKit.OSAsyncReference>

typealias io_connect_t = platform.IOKit.io_object_t

typealias io_connect_tVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_connect_t>

typealias io_enumerator_t = platform.IOKit.io_object_t

typealias io_enumerator_tVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_enumerator_t>

typealias io_iterator_t = platform.IOKit.io_object_t

typealias io_iterator_tVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t>

typealias io_object_t = platform.darwin.mach_port_t

typealias io_object_tVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_object_t>

typealias io_registry_entry_t = platform.IOKit.io_object_t

typealias io_registry_entry_tVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_registry_entry_t>

typealias io_service_t = platform.IOKit.io_object_t

typealias io_service_tVar = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_service_t>

const val EVENT_SYSTEM_VERSION: kotlin.Int = 0

const val EV_CURSOR_HEIGHT: kotlin.Int = 0

const val EV_CURSOR_WIDTH: kotlin.Int = 0

const val EV_LB: kotlin.Int = 0

const val EV_MAXPRESSURE: kotlin.Int = 0

const val EV_MINPRESSURE: kotlin.Int = 0

const val EV_MOUSEBUTTONMASK: kotlin.Int = 0

const val EV_RB: kotlin.Int = 0

const val EV_SCREEN_MAX_BRIGHTNESS: kotlin.Int = 0

const val EV_SCREEN_MIN_BRIGHTNESS: kotlin.Int = 0

const val EV_TICKS_PER_SEC: kotlin.Int = 0

const val EV_TICK_TIME: kotlin.Int = 0

val IO16BitDirectPixels: kotlin.String
    get() = TODO()

val IO1BitIndexedPixels: kotlin.String
    get() = TODO()

val IO2BitIndexedPixels: kotlin.String
    get() = TODO()

val IO32BitDirectPixels: kotlin.String
    get() = TODO()

val IO4BitIndexedPixels: kotlin.String
    get() = TODO()

val IO8BitIndexedPixels: kotlin.String
    get() = TODO()

val IO8BitOverlayPixels: kotlin.String
    get() = TODO()

const val IOGRAPHICSTYPES_REV: kotlin.Int = 0

const val IOKIT: kotlin.Int = 0

val IOPagedPixels: kotlin.String
    get() = TODO()

const val IOPhysSize: kotlin.Int = 0

val IOYUV422Pixels: kotlin.String
    get() = TODO()

const val IO_12BPP_TRANSFER_TABLE_SIZE: kotlin.Int = 0

const val IO_15BPP_TRANSFER_TABLE_SIZE: kotlin.Int = 0

const val IO_24BPP_TRANSFER_TABLE_SIZE: kotlin.Int = 0

const val IO_2BPP_TRANSFER_TABLE_SIZE: kotlin.Int = 0

const val IO_8BPP_TRANSFER_TABLE_SIZE: kotlin.Int = 0

const val IO_DISPLAY_CAN_BLIT: kotlin.Int = 0

const val IO_DISPLAY_CAN_FILL: kotlin.Int = 0

const val IO_OBJECT_NULL: platform.IOKit.io_object_t /* = kotlin.UInt */ = 0u

const val IO_SampleTypeAlpha: kotlin.Int = 0

const val IO_SampleTypeSkip: kotlin.Int = 0

const val NUM_SUPPORTED_INTERFACES: kotlin.Int = 0

const val NX_ALLEVENTS: kotlin.Int = 0

const val NX_ALPHASHIFTMASK: kotlin.Int = 0

const val NX_ALPHASHIFT_STATELESS_MASK: kotlin.Int = 0

const val NX_ALTERNATEMASK: kotlin.Int = 0

const val NX_APPDEFINED: kotlin.Int = 0

const val NX_APPDEFINEDMASK: kotlin.Int = 0

const val NX_ASCIISET: kotlin.Int = 0

const val NX_BROADCAST: kotlin.Int = 0

const val NX_BYPSCONTEXT: kotlin.Int = 0

const val NX_BYTYPE: kotlin.Int = 0

const val NX_COMMANDMASK: kotlin.Int = 0

const val NX_CONTROLMASK: kotlin.Int = 0

const val NX_DEVICELALTKEYMASK: kotlin.Int = 0

const val NX_DEVICELCMDKEYMASK: kotlin.Int = 0

const val NX_DEVICELCTLKEYMASK: kotlin.Int = 0

const val NX_DEVICELSHIFTKEYMASK: kotlin.Int = 0

const val NX_DEVICERALTKEYMASK: kotlin.Int = 0

const val NX_DEVICERCMDKEYMASK: kotlin.Int = 0

const val NX_DEVICERCTLKEYMASK: kotlin.Int = 0

const val NX_DEVICERSHIFTKEYMASK: kotlin.Int = 0

const val NX_DEVICE_ALPHASHIFT_STATELESS_MASK: kotlin.Int = 0

const val NX_DINGBATSSET: kotlin.Int = 0

const val NX_EVENT_EXTENSION_AUDIT_TOKEN: kotlin.Int = 0

const val NX_EVENT_EXTENSION_LOCATION_DEVICE_SCALED: kotlin.Int = 0

const val NX_EVENT_EXTENSION_LOCATION_INVALID: kotlin.Int = 0

const val NX_EVENT_EXTENSION_LOCATION_TYPE_FLOAT: kotlin.Int = 0

const val NX_EVENT_EXTENSION_MOUSE_DELTA_TYPE_FLOAT: kotlin.Int = 0

val NX_EVS_DEVICE_INFO: kotlin.String
    get() = TODO()

const val NX_EVS_DEVICE_INFO_COUNT: kotlin.ULong = 0u

const val NX_EVS_DEVICE_INTERFACE_ACE: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_ADB: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_BUS_ACE: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_HIL: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_NeXT: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_OTHER: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_SERIAL_ACE: kotlin.Int = 0

const val NX_EVS_DEVICE_INTERFACE_TYPE5: kotlin.Int = 0

const val NX_EVS_DEVICE_MAX: kotlin.Int = 0

const val NX_EVS_DEVICE_TYPE_KEYBOARD: kotlin.Int = 0

const val NX_EVS_DEVICE_TYPE_MOUSE: kotlin.Int = 0

const val NX_EVS_DEVICE_TYPE_OTHER: kotlin.Int = 0

const val NX_EVS_DEVICE_TYPE_TABLET: kotlin.Int = 0

const val NX_EVS_INFO_MAX: kotlin.Int = 0

const val NX_EXPLICIT: kotlin.Int = 0

const val NX_FIRSTEVENT: kotlin.Int = 0

const val NX_FIRSTWINDOW: kotlin.Int = 0

const val NX_FLAGSCHANGED: kotlin.Int = 0

const val NX_FLAGSCHANGEDMASK: kotlin.Int = 0

const val NX_HELPMASK: kotlin.Int = 0

const val NX_KEYDOWN: kotlin.Int = 0

const val NX_KEYDOWNMASK: kotlin.Int = 0

const val NX_KEYUP: kotlin.Int = 0

const val NX_KEYUPMASK: kotlin.Int = 0

const val NX_KITDEFINED: kotlin.Int = 0

const val NX_KITDEFINEDMASK: kotlin.Int = 0

const val NX_LASTEVENT: kotlin.Int = 0

const val NX_LASTKEY: kotlin.Int = 0

const val NX_LASTLEFT: kotlin.Int = 0

const val NX_LASTRIGHT: kotlin.Int = 0

const val NX_LMOUSEDOWN: kotlin.Int = 0

const val NX_LMOUSEDOWNMASK: kotlin.Int = 0

const val NX_LMOUSEDRAGGED: kotlin.Int = 0

const val NX_LMOUSEDRAGGEDMASK: kotlin.Int = 0

const val NX_LMOUSEUP: kotlin.Int = 0

const val NX_LMOUSEUPMASK: kotlin.Int = 0

const val NX_MAXMOUSESCALINGS: kotlin.Int = 0

const val NX_MOUSEENTERED: kotlin.Int = 0

const val NX_MOUSEENTEREDMASK: kotlin.Int = 0

const val NX_MOUSEEXITED: kotlin.Int = 0

const val NX_MOUSEEXITEDMASK: kotlin.Int = 0

const val NX_MOUSEMOVED: kotlin.Int = 0

const val NX_MOUSEMOVEDMASK: kotlin.Int = 0

const val NX_MOUSEWINDOW: kotlin.Int = 0

const val NX_NEXTWINDOW: kotlin.Int = 0

const val NX_NONCOALSESCEDMASK: kotlin.Int = 0

const val NX_NOWINDOW: kotlin.Int = 0

const val NX_NULLEVENT: kotlin.Int = 0

const val NX_NULLEVENTMASK: kotlin.Int = 0

const val NX_NUMERICPADMASK: kotlin.Int = 0

const val NX_NUMPROCS: kotlin.Int = 0

const val NX_OMOUSEDOWN: kotlin.Int = 0

const val NX_OMOUSEDOWNMASK: kotlin.Int = 0

const val NX_OMOUSEDRAGGED: kotlin.Int = 0

const val NX_OMOUSEDRAGGEDMASK: kotlin.Int = 0

const val NX_OMOUSEUP: kotlin.Int = 0

const val NX_OMOUSEUPMASK: kotlin.Int = 0

const val NX_RMOUSEDOWN: kotlin.Int = 0

const val NX_RMOUSEDOWNMASK: kotlin.Int = 0

const val NX_RMOUSEDRAGGED: kotlin.Int = 0

const val NX_RMOUSEDRAGGEDMASK: kotlin.Int = 0

const val NX_RMOUSEUP: kotlin.Int = 0

const val NX_RMOUSEUPMASK: kotlin.Int = 0

const val NX_SCROLLWHEELMOVED: kotlin.Int = 0

const val NX_SCROLLWHEELMOVEDMASK: kotlin.Int = 0

const val NX_SECONDARYFNMASK: kotlin.Int = 0

const val NX_SHIFTMASK: kotlin.Int = 0

const val NX_STYLUSPROXIMITYMASK: kotlin.Int = 0

const val NX_SUBTYPE_ACCESSIBILITY: kotlin.Int = 0

const val NX_SUBTYPE_AUX_CONTROL_BUTTONS: kotlin.Int = 0

const val NX_SUBTYPE_AUX_MOUSE_BUTTONS: kotlin.Int = 0

const val NX_SUBTYPE_DEFAULT: kotlin.Int = 0

const val NX_SUBTYPE_EJECT_KEY: kotlin.Int = 0

const val NX_SUBTYPE_HIDPARAMETER_MODIFIED: kotlin.Int = 0

const val NX_SUBTYPE_MENU: kotlin.Int = 0

const val NX_SUBTYPE_MOUSE_TOUCH: kotlin.Int = 0

const val NX_SUBTYPE_POWER_KEY: kotlin.Int = 0

const val NX_SUBTYPE_RESTART_EVENT: kotlin.Int = 0

const val NX_SUBTYPE_SHUTDOWN_EVENT: kotlin.Int = 0

const val NX_SUBTYPE_SLEEP_EVENT: kotlin.Int = 0

const val NX_SUBTYPE_SLOWKEYS_ABORT: kotlin.Int = 0

const val NX_SUBTYPE_SLOWKEYS_END: kotlin.Int = 0

const val NX_SUBTYPE_SLOWKEYS_START: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_ALTERNATE: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_ALTERNATE_DOWN: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_ALTERNATE_LOCK: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_ALTERNATE_UP: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_COMMAND: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_COMMAND_DOWN: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_COMMAND_LOCK: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_COMMAND_UP: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_CONTROL: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_CONTROL_DOWN: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_CONTROL_LOCK: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_CONTROL_UP: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_FN_DOWN: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_FN_LOCK: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_FN_UP: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_OFF: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_ON: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_RELEASE: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_SHIFT: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_SHIFT_DOWN: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_SHIFT_LOCK: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_SHIFT_UP: kotlin.Int = 0

const val NX_SUBTYPE_STICKYKEYS_TOGGLEMOUSEDRIVING: kotlin.Int = 0

const val NX_SUBTYPE_TABLET_POINT: kotlin.Int = 0

const val NX_SUBTYPE_TABLET_PROXIMITY: kotlin.Int = 0

const val NX_SYMBOLSET: kotlin.Int = 0

const val NX_SYSDEFINED: kotlin.Int = 0

const val NX_SYSDEFINEDMASK: kotlin.Int = 0

const val NX_TABLETPOINTER: kotlin.Int = 0

const val NX_TABLETPOINTERMASK: kotlin.Int = 0

const val NX_TABLETPROXIMITY: kotlin.Int = 0

const val NX_TABLETPROXIMITYMASK: kotlin.Int = 0

const val NX_TABLET_BUTTON_PENLOWERSIDEMASK: kotlin.Int = 0

const val NX_TABLET_BUTTON_PENTIPMASK: kotlin.Int = 0

const val NX_TABLET_BUTTON_PENUPPERSIDEMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_ABSXMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_ABSYMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_ABSZMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_BUTTONSMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_DEVICEIDMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_ORIENTINFOMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_PRESSUREMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_ROTATIONMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_TANGENTIALPRESSUREMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_TILTXMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_TILTYMASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_VENDOR1MASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_VENDOR2MASK: kotlin.Int = 0

const val NX_TABLET_CAPABILITY_VENDOR3MASK: kotlin.Int = 0

const val NX_TABLET_POINTER_CURSOR: kotlin.Int = 0

const val NX_TABLET_POINTER_ERASER: kotlin.Int = 0

const val NX_TABLET_POINTER_PEN: kotlin.Int = 0

const val NX_TABLET_POINTER_UNKNOWN: kotlin.Int = 0

const val NX_TOPWINDOW: kotlin.Int = 0

const val NX_TRANSMIT: kotlin.Int = 0

const val NX_UNDIMMASK: kotlin.Int = 0

const val NX_WAKEMASK: kotlin.Int = 0

const val NX_ZOOM: kotlin.Int = 0

const val NX_ZOOMMASK: kotlin.Int = 0

const val STDFB_4BPS_TO_5BPS_MAP_SIZE: kotlin.Int = 0

const val STDFB_5BPS_TO_4BPS_MAP_SIZE: kotlin.Int = 0

const val STDFB_BM256_TO_BM38_MAP_SIZE: kotlin.Int = 0

const val STDFB_BM38_TO_256_WITH_LOGICAL_SIZE: kotlin.ULong = 0u

const val STDFB_BM38_TO_BM256_MAP_SIZE: kotlin.Int = 0

const val _NXSIZE_: kotlin.Int = 0

const val __OLD_NX_EVS_DEVICE_INFO: kotlin.Int = 0

val kAndConnections: kotlin.UInt
    get() = TODO()

val kAppleDisplayTypeKey: kotlin.String
    get() = TODO()

const val kAppleOnboardGUID: kotlin.ULong = 0u

val kAppleSenseKey: kotlin.String
    get() = TODO()

val kConnectionAudioStreaming: kotlin.UInt
    get() = TODO()

val kConnectionBlueGammaScale: kotlin.UInt
    get() = TODO()

val kConnectionChanged: kotlin.UInt
    get() = TODO()

val kConnectionCheckEnable: kotlin.UInt
    get() = TODO()

val kConnectionColorDepthsSupported: kotlin.UInt
    get() = TODO()

val kConnectionColorMode: kotlin.UInt
    get() = TODO()

val kConnectionColorModesSupported: kotlin.UInt
    get() = TODO()

val kConnectionControllerColorDepth: kotlin.UInt
    get() = TODO()

val kConnectionControllerDepthsSupported: kotlin.UInt
    get() = TODO()

val kConnectionControllerDitherControl: kotlin.UInt
    get() = TODO()

val kConnectionDisplayFlags: kotlin.UInt
    get() = TODO()

val kConnectionDisplayParameterCount: kotlin.UInt
    get() = TODO()

val kConnectionDisplayParameters: kotlin.UInt
    get() = TODO()

val kConnectionEnable: kotlin.UInt
    get() = TODO()

val kConnectionEnableAudio: kotlin.UInt
    get() = TODO()

val kConnectionFlags: kotlin.UInt
    get() = TODO()

val kConnectionFlushParameters: kotlin.UInt
    get() = TODO()

val kConnectionGammaScale: kotlin.UInt
    get() = TODO()

val kConnectionGreenGammaScale: kotlin.UInt
    get() = TODO()

val kConnectionHandleDisplayPortEvent: kotlin.UInt
    get() = TODO()

val kConnectionOverscan: kotlin.UInt
    get() = TODO()

val kConnectionPanelTimingDisable: kotlin.UInt
    get() = TODO()

val kConnectionPostWake: kotlin.UInt
    get() = TODO()

val kConnectionPower: kotlin.UInt
    get() = TODO()

val kConnectionProbe: kotlin.UInt
    get() = TODO()

val kConnectionRedGammaScale: kotlin.UInt
    get() = TODO()

val kConnectionStartOfFrameTime: kotlin.UInt
    get() = TODO()

val kConnectionSupportsAppleSense: kotlin.UInt
    get() = TODO()

val kConnectionSupportsHLDDCSense: kotlin.UInt
    get() = TODO()

val kConnectionSupportsLLDDCSense: kotlin.UInt
    get() = TODO()

val kConnectionSyncEnable: kotlin.UInt
    get() = TODO()

val kConnectionSyncFlags: kotlin.UInt
    get() = TODO()

val kConnectionVBLMultiplier: kotlin.UInt
    get() = TODO()

val kConnectionVideoBest: kotlin.UInt
    get() = TODO()

val kDisplayBlueGamma: kotlin.String
    get() = TODO()

val kDisplayBluePointX: kotlin.String
    get() = TODO()

val kDisplayBluePointY: kotlin.String
    get() = TODO()

val kDisplayBrightnessAffectsGamma: kotlin.String
    get() = TODO()

val kDisplayBundleKey: kotlin.String
    get() = TODO()

val kDisplayCSProfile: kotlin.String
    get() = TODO()

val kDisplayFixedPixelFormat: kotlin.String
    get() = TODO()

val kDisplayGammaChannels: kotlin.String
    get() = TODO()

val kDisplayGammaEntryCount: kotlin.String
    get() = TODO()

val kDisplayGammaEntrySize: kotlin.String
    get() = TODO()

val kDisplayGammaTable: kotlin.String
    get() = TODO()

val kDisplayGreenGamma: kotlin.String
    get() = TODO()

val kDisplayGreenPointX: kotlin.String
    get() = TODO()

val kDisplayGreenPointY: kotlin.String
    get() = TODO()

val kDisplayHorizontalImageSize: kotlin.String
    get() = TODO()

val kDisplayModeAcceleratorBackedFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeAlwaysShowFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeBuiltInFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeDefaultFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeInterlacedFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeNativeFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeNeverShowFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeNotGraphicsQualityFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeNotPresetFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeNotResizeFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeRequiresPanFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeSafeFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeSafetyFlags: kotlin.UInt
    get() = TODO()

val kDisplayModeSimulscanFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeStretchedFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeTelevisionFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeValidFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeValidForAirPlayFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeValidForHiResFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeValidForMirroringFlag: kotlin.UInt
    get() = TODO()

val kDisplayModeValidateAgainstDisplay: kotlin.UInt
    get() = TODO()

val kDisplayProductID: kotlin.String
    get() = TODO()

val kDisplayProductIDGeneric: kotlin.UInt
    get() = TODO()

val kDisplayProductName: kotlin.String
    get() = TODO()

val kDisplayRedGamma: kotlin.String
    get() = TODO()

val kDisplayRedPointX: kotlin.String
    get() = TODO()

val kDisplayRedPointY: kotlin.String
    get() = TODO()

val kDisplaySerialNumber: kotlin.String
    get() = TODO()

val kDisplaySerialString: kotlin.String
    get() = TODO()

val kDisplaySubPixelConfiguration: kotlin.String
    get() = TODO()

val kDisplaySubPixelConfigurationDelta: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelConfigurationQuad: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelConfigurationStripe: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelConfigurationStripeOffset: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelConfigurationUndefined: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelLayout: kotlin.String
    get() = TODO()

val kDisplaySubPixelLayoutBGR: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelLayoutQuadGBL: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelLayoutQuadGBR: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelLayoutRGB: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelLayoutUndefined: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelShape: kotlin.String
    get() = TODO()

val kDisplaySubPixelShapeElliptical: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelShapeOval: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelShapeRectangular: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelShapeRound: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelShapeSquare: kotlin.UInt
    get() = TODO()

val kDisplaySubPixelShapeUndefined: kotlin.UInt
    get() = TODO()

val kDisplayVendorID: kotlin.String
    get() = TODO()

val kDisplayVendorIDUnknown: kotlin.UInt
    get() = TODO()

val kDisplayVerticalImageSize: kotlin.String
    get() = TODO()

val kDisplayViewAngleAffectsGamma: kotlin.String
    get() = TODO()

val kDisplayWeekOfManufacture: kotlin.String
    get() = TODO()

val kDisplayWhiteGamma: kotlin.String
    get() = TODO()

val kDisplayWhitePointX: kotlin.String
    get() = TODO()

val kDisplayWhitePointY: kotlin.String
    get() = TODO()

val kDisplayYearOfManufacture: kotlin.String
    get() = TODO()

val kFirstIOKitNotificationType: kotlin.UInt
    get() = TODO()

val kFramebufferDisableAltivecAccess: kotlin.UInt
    get() = TODO()

val kFramebufferSupportsCopybackCache: kotlin.UInt
    get() = TODO()

val kFramebufferSupportsGammaCorrection: kotlin.UInt
    get() = TODO()

val kFramebufferSupportsWritethruCache: kotlin.UInt
    get() = TODO()

val kHardwareCursorDescriptorMajorVersion: kotlin.UInt
    get() = TODO()

val kHardwareCursorDescriptorMinorVersion: kotlin.UInt
    get() = TODO()

val kHardwareCursorInfoMajorVersion: kotlin.UInt
    get() = TODO()

val kHardwareCursorInfoMinorVersion: kotlin.UInt
    get() = TODO()

val kIO16BitFloatPixels: kotlin.String
    get() = TODO()

val kIO30BitDirectPixels: kotlin.String
    get() = TODO()

val kIO32BitFloatPixels: kotlin.String
    get() = TODO()

val kIO64BitDirectPixels: kotlin.String
    get() = TODO()

val kIOAnalogSetupExpected: kotlin.UInt
    get() = TODO()

val kIOAnalogSignalLevel_0700_0000: kotlin.UInt
    get() = TODO()

val kIOAnalogSignalLevel_0700_0300: kotlin.UInt
    get() = TODO()

val kIOAnalogSignalLevel_0714_0286: kotlin.UInt
    get() = TODO()

val kIOAnalogSignalLevel_1000_0400: kotlin.UInt
    get() = TODO()

val kIOAppPowerStateInterest: kotlin.String
    get() = TODO()

val kIOAsyncCalloutCount: kotlin.UInt
    get() = TODO()

val kIOAsyncCalloutFuncIndex: kotlin.UInt
    get() = TODO()

val kIOAsyncCalloutRefconIndex: kotlin.UInt
    get() = TODO()

val kIOAsyncCompletionNotificationType: kotlin.UInt
    get() = TODO()

val kIOAsyncReservedCount: kotlin.UInt
    get() = TODO()

val kIOAsyncReservedIndex: kotlin.UInt
    get() = TODO()

val kIOAudioPlane: kotlin.String
    get() = TODO()

val kIOBitsPerColorComponent10: kotlin.UInt
    get() = TODO()

val kIOBitsPerColorComponent12: kotlin.UInt
    get() = TODO()

val kIOBitsPerColorComponent16: kotlin.UInt
    get() = TODO()

val kIOBitsPerColorComponent6: kotlin.UInt
    get() = TODO()

val kIOBitsPerColorComponent8: kotlin.UInt
    get() = TODO()

val kIOBitsPerColorComponentNotSupported: kotlin.UInt
    get() = TODO()

val kIOBootDeviceKey: kotlin.String
    get() = TODO()

val kIOBootDevicePathKey: kotlin.String
    get() = TODO()

val kIOBootDeviceSizeKey: kotlin.String
    get() = TODO()

val kIOBundleResourceFileKey: kotlin.String
    get() = TODO()

val kIOBusBadgeKey: kotlin.String
    get() = TODO()

val kIOBusyInterest: kotlin.String
    get() = TODO()

val kIOCFPlugInTypesKey: kotlin.String
    get() = TODO()

val kIOCLUTPixels: kotlin.UInt
    get() = TODO()

val kIOCSyncDisable: kotlin.UInt
    get() = TODO()

val kIOCapturedAttribute: kotlin.UInt
    get() = TODO()

val kIOCatalogueKey: kotlin.String
    get() = TODO()

val kIOClamshellStateAttribute: kotlin.UInt
    get() = TODO()

val kIOClassKey: kotlin.String
    get() = TODO()

val kIOColorimetryAdobeRGB: kotlin.UInt
    get() = TODO()

val kIOColorimetryBT2020: kotlin.UInt
    get() = TODO()

val kIOColorimetryBT2100: kotlin.UInt
    get() = TODO()

val kIOColorimetryBT601: kotlin.UInt
    get() = TODO()

val kIOColorimetryBT709: kotlin.UInt
    get() = TODO()

val kIOColorimetryDCIP3: kotlin.UInt
    get() = TODO()

val kIOColorimetryNativeRGB: kotlin.UInt
    get() = TODO()

val kIOColorimetryNotSupported: kotlin.UInt
    get() = TODO()

val kIOColorimetryWGRGB: kotlin.UInt
    get() = TODO()

val kIOColorimetrysRGB: kotlin.UInt
    get() = TODO()

val kIOColorimetryxvYCC: kotlin.UInt
    get() = TODO()

val kIOCommandPoolSizeKey: kotlin.String
    get() = TODO()

val kIOConnectMethodVarOutputSize: kotlin.Int
    get() = TODO()

val kIOConnectionBuiltIn: kotlin.UInt
    get() = TODO()

val kIOConnectionStereoSync: kotlin.UInt
    get() = TODO()

val kIOCopybackCache: kotlin.UInt
    get() = TODO()

val kIOCopybackInnerCache: kotlin.UInt
    get() = TODO()

val kIOCursorControlAttribute: kotlin.UInt
    get() = TODO()

val kIODPEventAutomatedTestRequest: kotlin.UInt
    get() = TODO()

val kIODPEventContentProtection: kotlin.UInt
    get() = TODO()

val kIODPEventForceRetrain: kotlin.UInt
    get() = TODO()

val kIODPEventIdle: kotlin.UInt
    get() = TODO()

val kIODPEventMCCS: kotlin.UInt
    get() = TODO()

val kIODPEventRemoteControlCommandPending: kotlin.UInt
    get() = TODO()

val kIODPEventSinkSpecific: kotlin.UInt
    get() = TODO()

val kIODPEventStart: kotlin.UInt
    get() = TODO()

val kIODTNVRAMPanicInfoKey: kotlin.String
    get() = TODO()

val kIODefaultCache: kotlin.UInt
    get() = TODO()

val kIODefaultMatchCategoryKey: kotlin.String
    get() = TODO()

val kIODefaultMemoryType: kotlin.UInt
    get() = TODO()

val kIODeferCLUTSetAttribute: kotlin.UInt
    get() = TODO()

val kIODetailedTimingValid: kotlin.UInt
    get() = TODO()

val kIODeviceIconKey: kotlin.String
    get() = TODO()

val kIODeviceTreePlane: kotlin.String
    get() = TODO()

val kIODigitalSignal: kotlin.UInt
    get() = TODO()

val kIODisplayAmbientLightSensorKey: kotlin.String
    get() = TODO()

val kIODisplayAttributesKey: kotlin.String
    get() = TODO()

val kIODisplayAudioBalanceLRKey: kotlin.String
    get() = TODO()

val kIODisplayAudioBassKey: kotlin.String
    get() = TODO()

val kIODisplayAudioMuteAndScreenBlankKey: kotlin.String
    get() = TODO()

val kIODisplayAudioProcessorModeKey: kotlin.String
    get() = TODO()

val kIODisplayAudioTrebleKey: kotlin.String
    get() = TODO()

val kIODisplayBlueGammaScaleKey: kotlin.String
    get() = TODO()

val kIODisplayBrightnessFadeKey: kotlin.String
    get() = TODO()

val kIODisplayBrightnessKey: kotlin.String
    get() = TODO()

val kIODisplayBrightnessProbeKey: kotlin.String
    get() = TODO()

val kIODisplayCapabilityStringKey: kotlin.String
    get() = TODO()

val kIODisplayColorMode: kotlin.UInt
    get() = TODO()

val kIODisplayConnectFlagsKey: kotlin.String
    get() = TODO()

val kIODisplayContrastKey: kotlin.String
    get() = TODO()

val kIODisplayControllerIDKey: kotlin.String
    get() = TODO()

val kIODisplayDitherAll: kotlin.UInt
    get() = TODO()

val kIODisplayDitherDefault: kotlin.UInt
    get() = TODO()

val kIODisplayDitherDisable: kotlin.UInt
    get() = TODO()

val kIODisplayDitherFrameRateControl: kotlin.UInt
    get() = TODO()

val kIODisplayDitherRGBShift: kotlin.UInt
    get() = TODO()

val kIODisplayDitherSpatial: kotlin.UInt
    get() = TODO()

val kIODisplayDitherTemporal: kotlin.UInt
    get() = TODO()

val kIODisplayDitherYCbCr422Shift: kotlin.UInt
    get() = TODO()

val kIODisplayDitherYCbCr444Shift: kotlin.UInt
    get() = TODO()

val kIODisplayEDIDKey: kotlin.String
    get() = TODO()

val kIODisplayEDIDOriginalKey: kotlin.String
    get() = TODO()

val kIODisplayFirmwareLevelKey: kotlin.String
    get() = TODO()

val kIODisplayGUIDKey: kotlin.String
    get() = TODO()

val kIODisplayGammaScaleKey: kotlin.String
    get() = TODO()

val kIODisplayGreenGammaScaleKey: kotlin.String
    get() = TODO()

val kIODisplayHasBacklightKey: kotlin.String
    get() = TODO()

val kIODisplayHorizontalPositionKey: kotlin.String
    get() = TODO()

val kIODisplayHorizontalSizeKey: kotlin.String
    get() = TODO()

val kIODisplayIsDigitalKey: kotlin.String
    get() = TODO()

val kIODisplayLinearBrightnessKey: kotlin.String
    get() = TODO()

val kIODisplayLinearBrightnessProbeKey: kotlin.String
    get() = TODO()

val kIODisplayLocationKey: kotlin.String
    get() = TODO()

val kIODisplayMCCSVersionKey: kotlin.String
    get() = TODO()

val kIODisplayManufacturerSpecificKey: kotlin.String
    get() = TODO()

val kIODisplayMaxValueKey: kotlin.String
    get() = TODO()

val kIODisplayMicrophoneVolumeKey: kotlin.String
    get() = TODO()

val kIODisplayMinValueKey: kotlin.String
    get() = TODO()

val kIODisplayModeIDBootProgrammable: kotlin.Int
    get() = TODO()

val kIODisplayModeIDReservedBase: kotlin.Int
    get() = TODO()

val kIODisplayNeedsCEAUnderscan: kotlin.UInt
    get() = TODO()

val kIODisplayOverrideMatchingKey: kotlin.String
    get() = TODO()

val kIODisplayOverscanKey: kotlin.String
    get() = TODO()

val kIODisplayParallelogramKey: kotlin.String
    get() = TODO()

val kIODisplayParametersCommitKey: kotlin.String
    get() = TODO()

val kIODisplayParametersDefaultKey: kotlin.String
    get() = TODO()

val kIODisplayParametersFlushKey: kotlin.String
    get() = TODO()

val kIODisplayParametersKey: kotlin.String
    get() = TODO()

val kIODisplayPincushionKey: kotlin.String
    get() = TODO()

val kIODisplayPowerModeKey: kotlin.String
    get() = TODO()

val kIODisplayPowerStateKey: kotlin.String
    get() = TODO()

val kIODisplayPowerStateMinUsable: kotlin.UInt
    get() = TODO()

val kIODisplayPowerStateOff: kotlin.UInt
    get() = TODO()

val kIODisplayPowerStateOn: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBits10: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBits12: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBits14: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBits16: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBits6: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBits8: kotlin.UInt
    get() = TODO()

val kIODisplayRGBColorComponentBitsUnknown: kotlin.UInt
    get() = TODO()

val kIODisplayRedGammaScaleKey: kotlin.String
    get() = TODO()

val kIODisplayRotationKey: kotlin.String
    get() = TODO()

val kIODisplaySelectedColorModeKey: kotlin.String
    get() = TODO()

val kIODisplaySpeakerSelectKey: kotlin.String
    get() = TODO()

val kIODisplaySpeakerVolumeKey: kotlin.String
    get() = TODO()

val kIODisplaySupportsBasicAudioKey: kotlin.String
    get() = TODO()

val kIODisplaySupportsUnderscanKey: kotlin.String
    get() = TODO()

val kIODisplaySupportsYCbCr422Key: kotlin.String
    get() = TODO()

val kIODisplaySupportsYCbCr444Key: kotlin.String
    get() = TODO()

val kIODisplayTechnologyTypeKey: kotlin.String
    get() = TODO()

val kIODisplayTheatreModeKey: kotlin.String
    get() = TODO()

val kIODisplayTheatreModeWindowKey: kotlin.String
    get() = TODO()

val kIODisplayTrapezoidKey: kotlin.String
    get() = TODO()

val kIODisplayUsableLinearBrightnessKey: kotlin.String
    get() = TODO()

val kIODisplayUsageTimeKey: kotlin.String
    get() = TODO()

val kIODisplayValueKey: kotlin.String
    get() = TODO()

val kIODisplayVerticalPositionKey: kotlin.String
    get() = TODO()

val kIODisplayVerticalSizeKey: kotlin.String
    get() = TODO()

val kIODisplayVideoBestKey: kotlin.String
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBits10: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBits12: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBits14: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBits16: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBits6: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBits8: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr422ColorComponentBitsUnknown: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBits10: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBits12: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBits14: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBits16: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBits6: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBits8: kotlin.UInt
    get() = TODO()

val kIODisplayYCbCr444ColorComponentBitsUnknown: kotlin.UInt
    get() = TODO()

val kIODriverPowerAttribute: kotlin.UInt
    get() = TODO()

val kIODynamicRangeDolbyNormalMode: kotlin.UInt
    get() = TODO()

val kIODynamicRangeDolbyTunnelMode: kotlin.UInt
    get() = TODO()

val kIODynamicRangeHDR10: kotlin.UInt
    get() = TODO()

val kIODynamicRangeNotSupported: kotlin.UInt
    get() = TODO()

val kIODynamicRangeSDR: kotlin.UInt
    get() = TODO()

val kIODynamicRangeTraditionalGammaHDR: kotlin.UInt
    get() = TODO()

val kIOFBAVSignalTypeDP: kotlin.UInt
    get() = TODO()

val kIOFBAVSignalTypeDVI: kotlin.UInt
    get() = TODO()

val kIOFBAVSignalTypeHDMI: kotlin.UInt
    get() = TODO()

val kIOFBAVSignalTypeKey: kotlin.String
    get() = TODO()

val kIOFBAVSignalTypeUnknown: kotlin.UInt
    get() = TODO()

val kIOFBAVSignalTypeVGA: kotlin.UInt
    get() = TODO()

val kIOFBBitRateHBR: kotlin.UInt
    get() = TODO()

val kIOFBBitRateHBR2: kotlin.UInt
    get() = TODO()

val kIOFBBitRateRBR: kotlin.UInt
    get() = TODO()

val kIOFBBitsPerComponentKey: kotlin.String
    get() = TODO()

val kIOFBBitsPerPixelKey: kotlin.String
    get() = TODO()

val kIOFBBlueGammaScaleAttribute: kotlin.UInt
    get() = TODO()

val kIOFBBytesPerPlaneKey: kotlin.String
    get() = TODO()

val kIOFBBytesPerRowKey: kotlin.String
    get() = TODO()

val kIOFBCLUTDeferKey: kotlin.String
    get() = TODO()

val kIOFBChangedInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBComponentCountKey: kotlin.String
    get() = TODO()

val kIOFBConfigKey: kotlin.String
    get() = TODO()

val kIOFBConnectInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBCursorInfoKey: kotlin.String
    get() = TODO()

val kIOFBDetailedTimingsKey: kotlin.String
    get() = TODO()

val kIOFBDiagnoseConnectType: kotlin.UInt
    get() = TODO()

val kIOFBDisplayPortConfigurationDataKey: kotlin.String
    get() = TODO()

val kIOFBDisplayPortInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBDisplayPortLinkChangeInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBDisplayPortTrainingAttribute: kotlin.UInt
    get() = TODO()

val kIOFBDisplayState: kotlin.UInt
    get() = TODO()

val kIOFBDisplayState_AlreadyActive: kotlin.UInt
    get() = TODO()

val kIOFBDisplayState_Mask: kotlin.UInt
    get() = TODO()

val kIOFBDisplayState_PipelineBlack: kotlin.UInt
    get() = TODO()

val kIOFBDisplayState_RestoredProfile: kotlin.UInt
    get() = TODO()

val kIOFBFlagsKey: kotlin.String
    get() = TODO()

val kIOFBFrameInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBGammaCountKey: kotlin.String
    get() = TODO()

val kIOFBGammaWidthKey: kotlin.String
    get() = TODO()

val kIOFBGreenGammaScaleAttribute: kotlin.UInt
    get() = TODO()

val kIOFBHBLInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBHDCPLimit_AllowAll: kotlin.UInt
    get() = TODO()

val kIOFBHDCPLimit_NoHDCP1x: kotlin.UInt
    get() = TODO()

val kIOFBHDCPLimit_NoHDCP20Type0: kotlin.UInt
    get() = TODO()

val kIOFBHDCPLimit_NoHDCP20Type1: kotlin.UInt
    get() = TODO()

val kIOFBHDMIDongleROMKey: kotlin.String
    get() = TODO()

val kIOFBHDRMetaDataAttribute: kotlin.UInt
    get() = TODO()

val kIOFBHeightKey: kotlin.String
    get() = TODO()

val kIOFBHostAccessFlagsKey: kotlin.String
    get() = TODO()

val kIOFBLimitHDCPAttribute: kotlin.UInt
    get() = TODO()

val kIOFBLimitHDCPStateAttribute: kotlin.UInt
    get() = TODO()

val kIOFBLinkDownspreadMax: kotlin.UInt
    get() = TODO()

val kIOFBLinkDownspreadNone: kotlin.UInt
    get() = TODO()

val kIOFBLinkPreEmphasisLevel0: kotlin.UInt
    get() = TODO()

val kIOFBLinkPreEmphasisLevel1: kotlin.UInt
    get() = TODO()

val kIOFBLinkPreEmphasisLevel2: kotlin.UInt
    get() = TODO()

val kIOFBLinkPreEmphasisLevel3: kotlin.UInt
    get() = TODO()

val kIOFBLinkScramblerAlternate: kotlin.UInt
    get() = TODO()

val kIOFBLinkScramblerNormal: kotlin.UInt
    get() = TODO()

val kIOFBLinkVoltageLevel0: kotlin.UInt
    get() = TODO()

val kIOFBLinkVoltageLevel1: kotlin.UInt
    get() = TODO()

val kIOFBLinkVoltageLevel2: kotlin.UInt
    get() = TODO()

val kIOFBLinkVoltageLevel3: kotlin.UInt
    get() = TODO()

val kIOFBMCCSInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBMemorySizeKey: kotlin.String
    get() = TODO()

val kIOFBModeAIDKey: kotlin.String
    get() = TODO()

val kIOFBModeDFKey: kotlin.String
    get() = TODO()

val kIOFBModeDMKey: kotlin.String
    get() = TODO()

val kIOFBModeIDKey: kotlin.String
    get() = TODO()

val kIOFBModePIKey: kotlin.String
    get() = TODO()

val kIOFBModeTMKey: kotlin.String
    get() = TODO()

val kIOFBModesKey: kotlin.String
    get() = TODO()

val kIOFBNS_Dim: kotlin.UInt
    get() = TODO()

val kIOFBNS_DisplayStateMask: kotlin.UInt
    get() = TODO()

val kIOFBNS_DisplayStateShift: kotlin.UInt
    get() = TODO()

val kIOFBNS_Doze: kotlin.UInt
    get() = TODO()

val kIOFBNS_GenerationMask: kotlin.UInt
    get() = TODO()

val kIOFBNS_GenerationShift: kotlin.UInt
    get() = TODO()

val kIOFBNS_MessageMask: kotlin.UInt
    get() = TODO()

val kIOFBNS_Rendezvous: kotlin.UInt
    get() = TODO()

val kIOFBNS_Sleep: kotlin.UInt
    get() = TODO()

val kIOFBNS_UnDim: kotlin.UInt
    get() = TODO()

val kIOFBNS_Wake: kotlin.UInt
    get() = TODO()

val kIOFBNeedsRefreshKey: kotlin.String
    get() = TODO()

val kIOFBOfflineInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBOnlineInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBProbeOptionsKey: kotlin.String
    get() = TODO()

val kIOFBRedGammaScaleAttribute: kotlin.UInt
    get() = TODO()

val kIOFBRefreshRateKey: kotlin.String
    get() = TODO()

val kIOFBScalerInfoKey: kotlin.String
    get() = TODO()

val kIOFBServerConnectType: kotlin.UInt
    get() = TODO()

const val kIOFBSetGammaSyncNoSync: kotlin.Int = 0

const val kIOFBSetGammaSyncNotSpecified: kotlin.Int = 0

const val kIOFBSetGammaSyncVerticalBlankSync: kotlin.Int = 0

val kIOFBSharedConnectType: kotlin.UInt
    get() = TODO()

val kIOFBStop: kotlin.UInt
    get() = TODO()

val kIOFBSystemAperture: kotlin.UInt
    get() = TODO()

val kIOFBTimingRangeKey: kotlin.String
    get() = TODO()

val kIOFBUserRequestProbe: kotlin.UInt
    get() = TODO()

val kIOFBVBLInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBVariableRefreshRate: kotlin.UInt
    get() = TODO()

val kIOFBWakeInterruptType: kotlin.UInt
    get() = TODO()

val kIOFBWidthKey: kotlin.String
    get() = TODO()

val kIOFireWirePlane: kotlin.String
    get() = TODO()

val kIOFirstMatchNotification: kotlin.String
    get() = TODO()

val kIOFirstPublishNotification: kotlin.String
    get() = TODO()

val kIOFixedCLUTPixels: kotlin.UInt
    get() = TODO()

val kIOFramebufferInfoKey: kotlin.String
    get() = TODO()

val kIOGeneralInterest: kotlin.String
    get() = TODO()

val kIOHSyncDisable: kotlin.UInt
    get() = TODO()

val kIOHardwareCursorAttribute: kotlin.UInt
    get() = TODO()

val kIOHibernateEFIGfxStatusKey: kotlin.String
    get() = TODO()

val kIOHibernatePreviewActive: kotlin.UInt
    get() = TODO()

val kIOHibernatePreviewActiveKey: kotlin.String
    get() = TODO()

val kIOHibernatePreviewUpdates: kotlin.UInt
    get() = TODO()

val kIOIconKey: kotlin.String
    get() = TODO()

val kIOInhibitCache: kotlin.UInt
    get() = TODO()

val kIOInterestCalloutCount: kotlin.UInt
    get() = TODO()

val kIOInterestCalloutFuncIndex: kotlin.UInt
    get() = TODO()

val kIOInterestCalloutRefconIndex: kotlin.UInt
    get() = TODO()

val kIOInterestCalloutServiceIndex: kotlin.UInt
    get() = TODO()

val kIOInterlacedCEATiming: kotlin.UInt
    get() = TODO()

val kIOKitBuildVersionKey: kotlin.String
    get() = TODO()

val kIOKitDebugKey: kotlin.String
    get() = TODO()

val kIOKitDiagnosticsKey: kotlin.String
    get() = TODO()

val kIOKitNoticationMsgSizeMask: kotlin.UInt
    get() = TODO()

val kIOKitNoticationTypeMask: kotlin.UInt
    get() = TODO()

val kIOKitNoticationTypeSizeAdjShift: kotlin.UInt
    get() = TODO()

val kIOLocationMatchKey: kotlin.String
    get() = TODO()

val kIOMapAnywhere: kotlin.UInt
    get() = TODO()

val kIOMapCacheMask: kotlin.UInt
    get() = TODO()

val kIOMapCacheShift: kotlin.UInt
    get() = TODO()

val kIOMapCopybackCache: kotlin.UInt
    get() = TODO()

val kIOMapCopybackInnerCache: kotlin.UInt
    get() = TODO()

val kIOMapDefaultCache: kotlin.UInt
    get() = TODO()

val kIOMapInhibitCache: kotlin.UInt
    get() = TODO()

val kIOMapOverwrite: kotlin.UInt
    get() = TODO()

val kIOMapPostedWrite: kotlin.UInt
    get() = TODO()

val kIOMapPrefault: kotlin.UInt
    get() = TODO()

val kIOMapReadOnly: kotlin.UInt
    get() = TODO()

val kIOMapReference: kotlin.UInt
    get() = TODO()

val kIOMapStatic: kotlin.UInt
    get() = TODO()

val kIOMapUnique: kotlin.UInt
    get() = TODO()

val kIOMapUserOptionsMask: kotlin.UInt
    get() = TODO()

val kIOMapWriteCombineCache: kotlin.UInt
    get() = TODO()

val kIOMapWriteThruCache: kotlin.UInt
    get() = TODO()

val kIOMapperIDKey: kotlin.String
    get() = TODO()

val kIOMasterPortDefault: platform.darwin.mach_port_t /* = kotlin.UInt */
    get() = TODO()

val kIOMatchCategoryKey: kotlin.String
    get() = TODO()

val kIOMatchedNotification: kotlin.String
    get() = TODO()

val kIOMatchedServiceCountKey: kotlin.String
    get() = TODO()

val kIOMatchingCalloutCount: kotlin.UInt
    get() = TODO()

val kIOMatchingCalloutFuncIndex: kotlin.UInt
    get() = TODO()

val kIOMatchingCalloutRefconIndex: kotlin.UInt
    get() = TODO()

val kIOMaxPixelBits: kotlin.UInt
    get() = TODO()

val kIOMaximumBlockCountReadKey: kotlin.String
    get() = TODO()

val kIOMaximumBlockCountWriteKey: kotlin.String
    get() = TODO()

val kIOMaximumByteCountReadKey: kotlin.String
    get() = TODO()

val kIOMaximumByteCountWriteKey: kotlin.String
    get() = TODO()

val kIOMaximumPriorityCountKey: kotlin.String
    get() = TODO()

val kIOMaximumSegmentAddressableBitCountKey: kotlin.String
    get() = TODO()

val kIOMaximumSegmentByteCountReadKey: kotlin.String
    get() = TODO()

val kIOMaximumSegmentByteCountWriteKey: kotlin.String
    get() = TODO()

val kIOMaximumSegmentCountReadKey: kotlin.String
    get() = TODO()

val kIOMaximumSegmentCountWriteKey: kotlin.String
    get() = TODO()

val kIOMaximumSwapWriteKey: kotlin.String
    get() = TODO()

val kIOMinimumSaturationByteCountKey: kotlin.String
    get() = TODO()

val kIOMinimumSegmentAlignmentByteCountKey: kotlin.String
    get() = TODO()

val kIOMirrorAttribute: kotlin.UInt
    get() = TODO()

val kIOMirrorDefault: kotlin.UInt
    get() = TODO()

val kIOMirrorDefaultAttribute: kotlin.UInt
    get() = TODO()

val kIOMirrorForced: kotlin.UInt
    get() = TODO()

val kIOMirrorHWClipped: kotlin.UInt
    get() = TODO()

val kIOMirrorIsMirrored: kotlin.UInt
    get() = TODO()

val kIOMirrorIsPrimary: kotlin.UInt
    get() = TODO()

val kIOMonoDirectPixels: kotlin.UInt
    get() = TODO()

val kIOMonoInverseDirectPixels: kotlin.UInt
    get() = TODO()

val kIONTSCTiming: kotlin.UInt
    get() = TODO()

val kIONVRAMActivateCSRConfigPropertyKey: kotlin.String
    get() = TODO()

val kIONVRAMDeletePropertyKey: kotlin.String
    get() = TODO()

val kIONVRAMSyncNowPropertyKey: kotlin.String
    get() = TODO()

val kIONameMatchKey: kotlin.String
    get() = TODO()

val kIONameMatchedKey: kotlin.String
    get() = TODO()

val kIONoSeparateSyncControl: kotlin.UInt
    get() = TODO()

val kIOPALTiming: kotlin.UInt
    get() = TODO()

val kIOParentMatchKey: kotlin.String
    get() = TODO()

val kIOPathMatchKey: kotlin.String
    get() = TODO()

val kIOPixelEncodingNotSupported: kotlin.UInt
    get() = TODO()

val kIOPixelEncodingRGB444: kotlin.UInt
    get() = TODO()

val kIOPixelEncodingYCbCr420: kotlin.UInt
    get() = TODO()

val kIOPixelEncodingYCbCr422: kotlin.UInt
    get() = TODO()

val kIOPixelEncodingYCbCr444: kotlin.UInt
    get() = TODO()

val kIOPlatformDeviceMessageKey: kotlin.String
    get() = TODO()

val kIOPlatformSerialNumberKey: kotlin.String
    get() = TODO()

val kIOPlatformUUIDKey: kotlin.String
    get() = TODO()

val kIOPostedWrite: kotlin.UInt
    get() = TODO()

val kIOPowerAttribute: kotlin.UInt
    get() = TODO()

val kIOPowerPlane: kotlin.String
    get() = TODO()

val kIOPowerStateAttribute: kotlin.UInt
    get() = TODO()

val kIOPriorityPowerStateInterest: kotlin.String
    get() = TODO()

val kIOProbeScoreKey: kotlin.String
    get() = TODO()

val kIOPropertyExistsMatchKey: kotlin.String
    get() = TODO()

val kIOPropertyMatchKey: kotlin.String
    get() = TODO()

val kIOProviderClassKey: kotlin.String
    get() = TODO()

val kIOPublishNotification: kotlin.String
    get() = TODO()

val kIORGBDirectPixels: kotlin.UInt
    get() = TODO()

val kIORGBSignedDirectPixels: kotlin.UInt
    get() = TODO()

val kIORGBSignedFloatingPointPixels: kotlin.UInt
    get() = TODO()

val kIORangeBitsPerColorComponent10: kotlin.UInt
    get() = TODO()

val kIORangeBitsPerColorComponent12: kotlin.UInt
    get() = TODO()

val kIORangeBitsPerColorComponent16: kotlin.UInt
    get() = TODO()

val kIORangeBitsPerColorComponent6: kotlin.UInt
    get() = TODO()

val kIORangeBitsPerColorComponent8: kotlin.UInt
    get() = TODO()

val kIORangeBitsPerColorComponentNotSupported: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryAdobeRGB: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryBT2020: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryBT2100: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryBT601: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryBT709: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryDCIP3: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryNativeRGB: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryNotSupported: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryWGRGB: kotlin.UInt
    get() = TODO()

val kIORangeColorimetrysRGB: kotlin.UInt
    get() = TODO()

val kIORangeColorimetryxvYCC: kotlin.UInt
    get() = TODO()

val kIORangeDynamicRangeDolbyNormalMode: kotlin.UInt
    get() = TODO()

val kIORangeDynamicRangeDolbyTunnelMode: kotlin.UInt
    get() = TODO()

val kIORangeDynamicRangeHDR10: kotlin.UInt
    get() = TODO()

val kIORangeDynamicRangeNotSupported: kotlin.UInt
    get() = TODO()

val kIORangeDynamicRangeSDR: kotlin.UInt
    get() = TODO()

val kIORangeDynamicRangeTraditionalGammaHDR: kotlin.UInt
    get() = TODO()

val kIORangePixelEncodingNotSupported: kotlin.UInt
    get() = TODO()

val kIORangePixelEncodingRGB444: kotlin.UInt
    get() = TODO()

val kIORangePixelEncodingYCbCr420: kotlin.UInt
    get() = TODO()

val kIORangePixelEncodingYCbCr422: kotlin.UInt
    get() = TODO()

val kIORangePixelEncodingYCbCr444: kotlin.UInt
    get() = TODO()

val kIORangeSupportsCompositeSync: kotlin.UInt
    get() = TODO()

val kIORangeSupportsInterlacedCEATiming: kotlin.UInt
    get() = TODO()

val kIORangeSupportsInterlacedCEATimingWithConfirm: kotlin.UInt
    get() = TODO()

val kIORangeSupportsSeparateSyncs: kotlin.UInt
    get() = TODO()

val kIORangeSupportsSignal_0700_0000: kotlin.UInt
    get() = TODO()

val kIORangeSupportsSignal_0700_0300: kotlin.UInt
    get() = TODO()

val kIORangeSupportsSignal_0714_0286: kotlin.UInt
    get() = TODO()

val kIORangeSupportsSignal_1000_0400: kotlin.UInt
    get() = TODO()

val kIORangeSupportsSyncOnGreen: kotlin.UInt
    get() = TODO()

val kIORangeSupportsVSyncSerration: kotlin.UInt
    get() = TODO()

val kIORegistryEntryIDKey: kotlin.String
    get() = TODO()

val kIORegistryEntryPropertyKeysKey: kotlin.String
    get() = TODO()

val kIORegistryIterateParents: kotlin.UInt
    get() = TODO()

val kIORegistryIterateRecursively: kotlin.UInt
    get() = TODO()

val kIORegistryPlanesKey: kotlin.String
    get() = TODO()

val kIOResourceMatchKey: kotlin.String
    get() = TODO()

val kIOResourceMatchedKey: kotlin.String
    get() = TODO()

val kIOResourcesClass: kotlin.String
    get() = TODO()

const val kIOReturnAborted: kotlin.Int = 0

const val kIOReturnBadArgument: kotlin.Int = 0

const val kIOReturnBadMedia: kotlin.Int = 0

const val kIOReturnBadMessageID: kotlin.Int = 0

const val kIOReturnBusy: kotlin.Int = 0

const val kIOReturnCannotLock: kotlin.Int = 0

const val kIOReturnCannotWire: kotlin.Int = 0

const val kIOReturnDMAError: kotlin.Int = 0

const val kIOReturnDeviceError: kotlin.Int = 0

const val kIOReturnError: kotlin.Int = 0

const val kIOReturnExclusiveAccess: kotlin.Int = 0

const val kIOReturnIOError: kotlin.Int = 0

const val kIOReturnIPCError: kotlin.Int = 0

const val kIOReturnInternalError: kotlin.Int = 0

const val kIOReturnInvalid: kotlin.Int = 0

const val kIOReturnIsoTooNew: kotlin.Int = 0

const val kIOReturnIsoTooOld: kotlin.Int = 0

const val kIOReturnLockedRead: kotlin.Int = 0

const val kIOReturnLockedWrite: kotlin.Int = 0

const val kIOReturnMessageTooLarge: kotlin.Int = 0

const val kIOReturnNoBandwidth: kotlin.Int = 0

const val kIOReturnNoChannels: kotlin.Int = 0

const val kIOReturnNoCompletion: kotlin.Int = 0

const val kIOReturnNoDevice: kotlin.Int = 0

const val kIOReturnNoFrames: kotlin.Int = 0

const val kIOReturnNoInterrupt: kotlin.Int = 0

const val kIOReturnNoMedia: kotlin.Int = 0

const val kIOReturnNoMemory: kotlin.Int = 0

const val kIOReturnNoPower: kotlin.Int = 0

const val kIOReturnNoResources: kotlin.Int = 0

const val kIOReturnNoSpace: kotlin.Int = 0

const val kIOReturnNotAligned: kotlin.Int = 0

const val kIOReturnNotAttached: kotlin.Int = 0

const val kIOReturnNotFound: kotlin.Int = 0

const val kIOReturnNotOpen: kotlin.Int = 0

const val kIOReturnNotPermitted: kotlin.Int = 0

const val kIOReturnNotPrivileged: kotlin.Int = 0

const val kIOReturnNotReadable: kotlin.Int = 0

const val kIOReturnNotReady: kotlin.Int = 0

const val kIOReturnNotResponding: kotlin.Int = 0

const val kIOReturnNotWritable: kotlin.Int = 0

const val kIOReturnOffline: kotlin.Int = 0

const val kIOReturnOverrun: kotlin.Int = 0

const val kIOReturnPortExists: kotlin.Int = 0

const val kIOReturnRLDError: kotlin.Int = 0

const val kIOReturnStillOpen: kotlin.Int = 0

const val kIOReturnSuccess: kotlin.Int = 0

const val kIOReturnTimeout: kotlin.Int = 0

const val kIOReturnUnderrun: kotlin.Int = 0

const val kIOReturnUnformattedMedia: kotlin.Int = 0

const val kIOReturnUnsupported: kotlin.Int = 0

const val kIOReturnUnsupportedMode: kotlin.Int = 0

const val kIOReturnVMError: kotlin.Int = 0

val kIOScaleCanBorderInsetOnly: kotlin.UInt
    get() = TODO()

val kIOScaleCanDownSamplePixels: kotlin.UInt
    get() = TODO()

val kIOScaleCanRotate: kotlin.UInt
    get() = TODO()

val kIOScaleCanScaleInterlaced: kotlin.UInt
    get() = TODO()

val kIOScaleCanSupportInset: kotlin.UInt
    get() = TODO()

val kIOScaleCanUpSamplePixels: kotlin.UInt
    get() = TODO()

val kIOScaleInvertX: kotlin.UInt
    get() = TODO()

val kIOScaleInvertY: kotlin.UInt
    get() = TODO()

val kIOScaleRotate0: kotlin.UInt
    get() = TODO()

val kIOScaleRotate180: kotlin.UInt
    get() = TODO()

val kIOScaleRotate270: kotlin.UInt
    get() = TODO()

val kIOScaleRotate90: kotlin.UInt
    get() = TODO()

val kIOScaleRotateFlags: kotlin.UInt
    get() = TODO()

val kIOScaleStretchOnly: kotlin.UInt
    get() = TODO()

val kIOScaleStretchToFit: kotlin.UInt
    get() = TODO()

val kIOScaleSwapAxes: kotlin.UInt
    get() = TODO()

val kIOScalingInfoValid: kotlin.UInt
    get() = TODO()

val kIOServiceClass: kotlin.String
    get() = TODO()

val kIOServiceInteractionAllowed: kotlin.UInt
    get() = TODO()

val kIOServiceMatchedNotificationType: kotlin.UInt
    get() = TODO()

val kIOServiceMessageNotificationType: kotlin.UInt
    get() = TODO()

val kIOServicePlane: kotlin.String
    get() = TODO()

val kIOServicePublishNotificationType: kotlin.UInt
    get() = TODO()

val kIOServiceTerminatedNotificationType: kotlin.UInt
    get() = TODO()

val kIOSyncOnBlue: kotlin.UInt
    get() = TODO()

val kIOSyncOnGreen: kotlin.UInt
    get() = TODO()

val kIOSyncOnRed: kotlin.UInt
    get() = TODO()

val kIOSyncPositivePolarity: kotlin.UInt
    get() = TODO()

val kIOSystemPowerAttribute: kotlin.UInt
    get() = TODO()

val kIOTerminatedNotification: kotlin.String
    get() = TODO()

val kIOTimingIDAppleNTSC_FF: kotlin.UInt
    get() = TODO()

val kIOTimingIDAppleNTSC_FFconv: kotlin.UInt
    get() = TODO()

val kIOTimingIDAppleNTSC_ST: kotlin.UInt
    get() = TODO()

val kIOTimingIDAppleNTSC_STconv: kotlin.UInt
    get() = TODO()

val kIOTimingIDApplePAL_FF: kotlin.UInt
    get() = TODO()

val kIOTimingIDApplePAL_FFconv: kotlin.UInt
    get() = TODO()

val kIOTimingIDApplePAL_ST: kotlin.UInt
    get() = TODO()

val kIOTimingIDApplePAL_STconv: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_0x0_0hz_Offline: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_1024x768_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_1152x870_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_512x384_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_560x384_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_640x400_67hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_640x480_67hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_640x818_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_640x870_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_832x624_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDApple_FixedRateLCD: kotlin.UInt
    get() = TODO()

val kIOTimingIDFilmRate_48hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDGTF_640x480_120hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDInvalid: kotlin.UInt
    get() = TODO()

val kIOTimingIDSMPTE240M_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDSony_1600x1024_76hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDSony_1920x1080_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDSony_1920x1080_72hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDSony_1920x1200_76hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1024x768_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1024x768_70hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1024x768_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1024x768_85hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1152x864_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1280x1024_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1280x1024_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1280x1024_85hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1280x960_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1280x960_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1280x960_85hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1360x768_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1600x1200_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1600x1200_65hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1600x1200_70hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1600x1200_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1600x1200_80hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1600x1200_85hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1792x1344_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1792x1344_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1856x1392_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1856x1392_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1920x1440_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_1920x1440_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_640x480_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_640x480_72hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_640x480_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_640x480_85hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_800x600_56hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_800x600_60hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_800x600_72hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_800x600_75hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_800x600_85hz: kotlin.UInt
    get() = TODO()

val kIOTimingIDVESA_848x480_60hz: kotlin.UInt
    get() = TODO()

val kIOTriStateSyncs: kotlin.UInt
    get() = TODO()

val kIOUSBPlane: kotlin.String
    get() = TODO()

val kIOUserClientClassKey: kotlin.String
    get() = TODO()

val kIOUserClientCreatorKey: kotlin.String
    get() = TODO()

val kIOUserClientCrossEndianCompatibleKey: kotlin.String
    get() = TODO()

val kIOUserClientCrossEndianKey: kotlin.String
    get() = TODO()

val kIOUserClientSharedInstanceKey: kotlin.String
    get() = TODO()

val kIOVRAMSaveAttribute: kotlin.UInt
    get() = TODO()

val kIOVSyncDisable: kotlin.UInt
    get() = TODO()

val kIOWSAA_Accelerated: kotlin.UInt
    get() = TODO()

val kIOWSAA_DeferEnd: kotlin.UInt
    get() = TODO()

val kIOWSAA_DeferStart: kotlin.UInt
    get() = TODO()

val kIOWSAA_DriverOpen: kotlin.UInt
    get() = TODO()

val kIOWSAA_From_Accelerated: kotlin.UInt
    get() = TODO()

val kIOWSAA_Hibernate: kotlin.UInt
    get() = TODO()

val kIOWSAA_NonConsoleDevice: kotlin.UInt
    get() = TODO()

val kIOWSAA_Reserved: kotlin.UInt
    get() = TODO()

val kIOWSAA_Sleep: kotlin.UInt
    get() = TODO()

val kIOWSAA_StateMask: kotlin.UInt
    get() = TODO()

val kIOWSAA_To_Accelerated: kotlin.UInt
    get() = TODO()

val kIOWSAA_Transactional: kotlin.UInt
    get() = TODO()

val kIOWSAA_Unaccelerated: kotlin.UInt
    get() = TODO()

val kIOWillTerminateNotification: kotlin.String
    get() = TODO()

val kIOWindowServerActiveAttribute: kotlin.UInt
    get() = TODO()

val kIOWriteCombineCache: kotlin.UInt
    get() = TODO()

val kIOWriteThruCache: kotlin.UInt
    get() = TODO()

val kInvertingEncodedPixel: kotlin.UInt
    get() = TODO()

val kInvertingEncoding: kotlin.UInt
    get() = TODO()

val kInvertingEncodingShift: kotlin.UInt
    get() = TODO()

val kLastIOKitNotificationType: kotlin.UInt
    get() = TODO()

val kMaxAsyncArgs: kotlin.UInt
    get() = TODO()

val kMicrosecondScale: kotlin.UInt
    get() = TODO()

val kMillisecondScale: kotlin.UInt
    get() = TODO()

const val kNXEventDataVersion: kotlin.Int = 0

const val kNXEventVersion: kotlin.Int = 0

val kNanosecondScale: kotlin.UInt
    get() = TODO()

val kOSAsyncCompleteMessageID: kotlin.UInt
    get() = TODO()

val kOSAsyncRef64Count: kotlin.UInt
    get() = TODO()

val kOSAsyncRef64Size: kotlin.UInt
    get() = TODO()

val kOSAsyncRefCount: kotlin.UInt
    get() = TODO()

val kOSAsyncRefSize: kotlin.UInt
    get() = TODO()

val kOSBuildVersionKey: kotlin.String
    get() = TODO()

val kOSNotificationMessageID: kotlin.UInt
    get() = TODO()

val kOrConnections: kotlin.UInt
    get() = TODO()

val kSecondScale: kotlin.UInt
    get() = TODO()

val kSetCLUTByValue: kotlin.UInt
    get() = TODO()

val kSetCLUTImmediately: kotlin.UInt
    get() = TODO()

val kSetCLUTWithLuminance: kotlin.UInt
    get() = TODO()

val kTickScale: kotlin.UInt
    get() = TODO()

val kTransparentEncodedPixel: kotlin.UInt
    get() = TODO()

val kTransparentEncoding: kotlin.UInt
    get() = TODO()

val kTransparentEncodingShift: kotlin.UInt
    get() = TODO()

const val sub_iokit_HDA: kotlin.Int = 0

const val sub_iokit_acpi: kotlin.Int = 0

const val sub_iokit_ahci: kotlin.Int = 0

const val sub_iokit_appleembeddedsleepwakehandler: kotlin.Int = 0

const val sub_iokit_appleppm: kotlin.Int = 0

const val sub_iokit_audio_video: kotlin.Int = 0

const val sub_iokit_baseband: kotlin.Int = 0

const val sub_iokit_block_storage: kotlin.Int = 0

const val sub_iokit_bluetooth: kotlin.Int = 0

const val sub_iokit_cec: kotlin.Int = 0

const val sub_iokit_common: kotlin.Int = 0

const val sub_iokit_firewire: kotlin.Int = 0

const val sub_iokit_graphics: kotlin.Int = 0

const val sub_iokit_graphics_acceleration: kotlin.Int = 0

const val sub_iokit_hidsystem: kotlin.Int = 0

const val sub_iokit_hsic: kotlin.Int = 0

const val sub_iokit_keystore: kotlin.Int = 0

const val sub_iokit_networking: kotlin.Int = 0

const val sub_iokit_platform: kotlin.Int = 0

const val sub_iokit_pmu: kotlin.Int = 0

const val sub_iokit_powermanagement: kotlin.Int = 0

const val sub_iokit_reserved: kotlin.Int = 0

const val sub_iokit_scsi: kotlin.Int = 0

const val sub_iokit_sdio: kotlin.Int = 0

const val sub_iokit_smbus: kotlin.Int = 0

const val sub_iokit_thunderbolt: kotlin.Int = 0

const val sub_iokit_usb: kotlin.Int = 0

const val sub_iokit_usbaudio: kotlin.Int = 0

const val sub_iokit_vendor_specific: kotlin.Int = 0

const val sub_iokit_wlan: kotlin.Int = 0

const val sys_iokit: kotlin.Int = 0

fun IOBSDNameMatching(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ options: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ bsdName: kotlin.String?): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun IOCatalogueGetData(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ flag: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ buffer: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>?, /*3*/ size: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOCatalogueModuleLoaded(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ name: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOCatalogueReset(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ flag: platform.posix.uint32_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOCatalogueSendData(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ flag: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ buffer: kotlin.String?, /*3*/ size: platform.posix.uint32_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOCatalogueTerminate(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ flag: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ description: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectAddClient(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ client: platform.IOKit.io_connect_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectAddRef(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectCallAsyncMethod(/*0*/ connection: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ selector: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ wake_port: platform.darwin.mach_port_t /* = kotlin.UInt */, /*3*/ reference: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*4*/ referenceCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*5*/ input: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*6*/ inputCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*7*/ inputStruct: kotlinx.cinterop.CValuesRef<*>?, /*8*/ inputStructCnt: platform.posix.size_t /* = kotlin.ULong */, /*9*/ output: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*10*/ outputCnt: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?, /*11*/ outputStruct: kotlinx.cinterop.CValuesRef<*>?, /*12*/ outputStructCnt: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectCallAsyncScalarMethod(/*0*/ connection: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ selector: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ wake_port: platform.darwin.mach_port_t /* = kotlin.UInt */, /*3*/ reference: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*4*/ referenceCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*5*/ input: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*6*/ inputCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*7*/ output: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*8*/ outputCnt: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectCallAsyncStructMethod(/*0*/ connection: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ selector: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ wake_port: platform.darwin.mach_port_t /* = kotlin.UInt */, /*3*/ reference: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*4*/ referenceCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*5*/ inputStruct: kotlinx.cinterop.CValuesRef<*>?, /*6*/ inputStructCnt: platform.posix.size_t /* = kotlin.ULong */, /*7*/ outputStruct: kotlinx.cinterop.CValuesRef<*>?, /*8*/ outputStructCnt: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectCallMethod(/*0*/ connection: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ selector: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ input: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*3*/ inputCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*4*/ inputStruct: kotlinx.cinterop.CValuesRef<*>?, /*5*/ inputStructCnt: platform.posix.size_t /* = kotlin.ULong */, /*6*/ output: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*7*/ outputCnt: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?, /*8*/ outputStruct: kotlinx.cinterop.CValuesRef<*>?, /*9*/ outputStructCnt: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectCallScalarMethod(/*0*/ connection: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ selector: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ input: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*3*/ inputCnt: platform.posix.uint32_t /* = kotlin.UInt */, /*4*/ output: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?, /*5*/ outputCnt: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectCallStructMethod(/*0*/ connection: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ selector: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ inputStruct: kotlinx.cinterop.CValuesRef<*>?, /*3*/ inputStructCnt: platform.posix.size_t /* = kotlin.ULong */, /*4*/ outputStruct: kotlinx.cinterop.CValuesRef<*>?, /*5*/ outputStructCnt: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectGetService(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ service: kotlinx.cinterop.CValuesRef<platform.IOKit.io_service_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_service_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectMapMemory(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ memoryType: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ intoTask: platform.darwin.task_port_t /* = kotlin.UInt */, /*3*/ atAddress: kotlinx.cinterop.CValuesRef<platform.darwin.mach_vm_address_tVar /* = kotlinx.cinterop.ULongVarOf<platform.darwin.mach_vm_address_t /* = kotlin.ULong */> */>?, /*4*/ ofSize: kotlinx.cinterop.CValuesRef<platform.darwin.mach_vm_size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.darwin.mach_vm_size_t /* = kotlin.ULong */> */>?, /*5*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectMapMemory64(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ memoryType: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ intoTask: platform.darwin.task_port_t /* = kotlin.UInt */, /*3*/ atAddress: kotlinx.cinterop.CValuesRef<platform.darwin.mach_vm_address_tVar /* = kotlinx.cinterop.ULongVarOf<platform.darwin.mach_vm_address_t /* = kotlin.ULong */> */>?, /*4*/ ofSize: kotlinx.cinterop.CValuesRef<platform.darwin.mach_vm_size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.darwin.mach_vm_size_t /* = kotlin.ULong */> */>?, /*5*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectRelease(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectSetCFProperties(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ properties: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectSetCFProperty(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ propertyName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ property: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectSetNotificationPort(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ type: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ port: platform.darwin.mach_port_t /* = kotlin.UInt */, /*3*/ reference: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap0(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap1(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ p1: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap2(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ p1: platform.posix.uintptr_t /* = kotlin.ULong */, /*3*/ p2: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap3(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ p1: platform.posix.uintptr_t /* = kotlin.ULong */, /*3*/ p2: platform.posix.uintptr_t /* = kotlin.ULong */, /*4*/ p3: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap4(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ p1: platform.posix.uintptr_t /* = kotlin.ULong */, /*3*/ p2: platform.posix.uintptr_t /* = kotlin.ULong */, /*4*/ p3: platform.posix.uintptr_t /* = kotlin.ULong */, /*5*/ p4: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap5(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ p1: platform.posix.uintptr_t /* = kotlin.ULong */, /*3*/ p2: platform.posix.uintptr_t /* = kotlin.ULong */, /*4*/ p3: platform.posix.uintptr_t /* = kotlin.ULong */, /*5*/ p4: platform.posix.uintptr_t /* = kotlin.ULong */, /*6*/ p5: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectTrap6(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ p1: platform.posix.uintptr_t /* = kotlin.ULong */, /*3*/ p2: platform.posix.uintptr_t /* = kotlin.ULong */, /*4*/ p3: platform.posix.uintptr_t /* = kotlin.ULong */, /*5*/ p4: platform.posix.uintptr_t /* = kotlin.ULong */, /*6*/ p5: platform.posix.uintptr_t /* = kotlin.ULong */, /*7*/ p6: platform.posix.uintptr_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectUnmapMemory(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ memoryType: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ fromTask: platform.darwin.task_port_t /* = kotlin.UInt */, /*3*/ atAddress: platform.darwin.mach_vm_address_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOConnectUnmapMemory64(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */, /*1*/ memoryType: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ fromTask: platform.darwin.task_port_t /* = kotlin.UInt */, /*3*/ atAddress: platform.darwin.mach_vm_address_t /* = kotlin.ULong */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOCreateReceivePort(/*0*/ msgType: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ recvPort: kotlinx.cinterop.CValuesRef<platform.darwin.mach_port_tVar /* = kotlinx.cinterop.UIntVarOf<platform.darwin.mach_port_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IODispatchCalloutFromMessage(/*0*/ unused: kotlinx.cinterop.CValuesRef<*>?, /*1*/ msg: kotlinx.cinterop.CValuesRef<platform.darwin.mach_msg_header_t>?, /*2*/ reference: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun IOIteratorIsValid(/*0*/ iterator: platform.IOKit.io_iterator_t /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun IOIteratorNext(/*0*/ iterator: platform.IOKit.io_iterator_t /* = kotlin.UInt */): platform.IOKit.io_object_t /* = kotlin.UInt */ { TODO() }

fun IOIteratorReset(/*0*/ iterator: platform.IOKit.io_iterator_t /* = kotlin.UInt */) { TODO() }

fun IOKitGetBusyState(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ busyState: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOKitWaitQuiet(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ waitTime: kotlinx.cinterop.CValuesRef<platform.darwin.mach_timespec_t /* = platform.darwin.mach_timespec */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOMasterPort(/*0*/ bootstrapPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ masterPort: kotlinx.cinterop.CValuesRef<platform.darwin.mach_port_tVar /* = kotlinx.cinterop.UIntVarOf<platform.darwin.mach_port_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IONotificationPortCreate(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */): platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */ { TODO() }

fun IONotificationPortDestroy(/*0*/ notify: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */) { TODO() }

fun IONotificationPortGetMachPort(/*0*/ notify: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */): platform.darwin.mach_port_t /* = kotlin.UInt */ { TODO() }

fun IONotificationPortGetRunLoopSource(/*0*/ notify: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */): platform.CoreFoundation.CFRunLoopSourceRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoopSource>? */ { TODO() }

fun IONotificationPortSetDispatchQueue(/*0*/ notify: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */, /*1*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun IONotificationPortSetImportanceReceiver(/*0*/ notify: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOObjectConformsTo(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */, /*1*/ className: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun IOObjectCopyBundleIdentifierForClass(/*0*/ classname: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun IOObjectCopyClass(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun IOObjectCopySuperclassForClass(/*0*/ classname: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun IOObjectGetClass(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */, /*1*/ className: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOObjectGetKernelRetainCount(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun IOObjectGetRetainCount(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun IOObjectGetUserRetainCount(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.posix.uint32_t /* = kotlin.UInt */ { TODO() }

fun IOObjectIsEqualTo(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */, /*1*/ anObject: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun IOObjectRelease(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOObjectRetain(/*0*/ `object`: platform.IOKit.io_object_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOOpenFirmwarePathMatching(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ options: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ path: kotlin.String?): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun IORegistryCreateIterator(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */, /*3*/ iterator: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryCopyFromPath(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ path: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.IOKit.io_registry_entry_t /* = kotlin.UInt */ { TODO() }

fun IORegistryEntryCopyPath(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun IORegistryEntryCreateCFProperties(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ properties: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFMutableDictionaryRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFMutableDictionaryRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary> */> */>?, /*2*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*3*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryCreateCFProperty(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*3*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun IORegistryEntryCreateIterator(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */, /*3*/ iterator: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryFromPath(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ path: platform.libkern.io_string_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.IOKit.io_registry_entry_t /* = kotlin.UInt */ { TODO() }

fun IORegistryEntryGetChildEntry(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ child: kotlinx.cinterop.CValuesRef<platform.IOKit.io_registry_entry_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_registry_entry_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetChildIterator(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ iterator: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetLocationInPlane(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ location: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetName(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ name: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetNameInPlane(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ name: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetParentEntry(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ parent: kotlinx.cinterop.CValuesRef<platform.IOKit.io_registry_entry_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_registry_entry_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetParentIterator(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ iterator: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetPath(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ path: platform.libkern.io_string_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetProperty(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ propertyName: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ buffer: platform.libkern.io_struct_inband_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*3*/ size: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryGetRegistryEntryID(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ entryID: kotlinx.cinterop.CValuesRef<platform.posix.uint64_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uint64_t /* = kotlin.ULong */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntryIDMatching(/*0*/ entryID: platform.posix.uint64_t /* = kotlin.ULong */): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun IORegistryEntryInPlane(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.posix.boolean_t /* = kotlin.UInt */ { TODO() }

fun IORegistryEntrySearchCFProperty(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ plane: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ key: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*4*/ options: platform.IOKit.IOOptionBits /* = kotlin.UInt */): platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun IORegistryEntrySetCFProperties(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ properties: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryEntrySetCFProperty(/*0*/ entry: platform.IOKit.io_registry_entry_t /* = kotlin.UInt */, /*1*/ propertyName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ property: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryGetRootEntry(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */): platform.IOKit.io_registry_entry_t /* = kotlin.UInt */ { TODO() }

fun IORegistryIteratorEnterEntry(/*0*/ iterator: platform.IOKit.io_iterator_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IORegistryIteratorExitEntry(/*0*/ iterator: platform.IOKit.io_iterator_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceAddInterestNotification(/*0*/ notifyPort: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */, /*1*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*2*/ interestType: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*3*/ callback: platform.IOKit.IOServiceInterestCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.IOKit.io_service_t /* = kotlin.UInt */, platform.posix.uint32_t /* = kotlin.UInt */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ refCon: kotlinx.cinterop.CValuesRef<*>?, /*5*/ notification: kotlinx.cinterop.CValuesRef<platform.IOKit.io_object_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_object_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceAddMatchingNotification(/*0*/ notifyPort: platform.IOKit.IONotificationPortRef? /* = kotlinx.cinterop.CPointer<cnames.structs.IONotificationPort>? */, /*1*/ notificationType: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ matching: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*3*/ callback: platform.IOKit.IOServiceMatchingCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, platform.IOKit.io_iterator_t /* = kotlin.UInt */) -> kotlin.Unit>>? */, /*4*/ refCon: kotlinx.cinterop.CValuesRef<*>?, /*5*/ notification: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceAddNotification(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ notificationType: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ matching: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*3*/ wakePort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*4*/ reference: platform.posix.uintptr_t /* = kotlin.ULong */, /*5*/ notification: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceAuthorize(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ options: platform.posix.uint32_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceClose(/*0*/ connect: platform.IOKit.io_connect_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceGetBusyState(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ busyState: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceGetMatchingService(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ matching: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.IOKit.io_service_t /* = kotlin.UInt */ { TODO() }

fun IOServiceGetMatchingServices(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ matching: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ existing: kotlinx.cinterop.CValuesRef<platform.IOKit.io_iterator_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_iterator_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceMatchPropertyTable(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ matching: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ matches: kotlinx.cinterop.CValuesRef<platform.posix.boolean_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.boolean_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceMatching(/*0*/ name: kotlin.String?): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun IOServiceNameMatching(/*0*/ name: kotlin.String?): platform.CoreFoundation.CFMutableDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun IOServiceOFPathToBSDName(/*0*/ masterPort: platform.darwin.mach_port_t /* = kotlin.UInt */, /*1*/ openFirmwarePath: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */, /*2*/ bsdName: platform.libkern.io_name_t? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>? */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceOpen(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ owningTask: platform.darwin.task_port_t /* = kotlin.UInt */, /*2*/ type: platform.posix.uint32_t /* = kotlin.UInt */, /*3*/ connect: kotlinx.cinterop.CValuesRef<platform.IOKit.io_connect_tVar /* = kotlinx.cinterop.UIntVarOf<platform.IOKit.io_connect_t /* = kotlin.UInt */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceOpenAsFileDescriptor(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ oflag: kotlin.Int): kotlin.Int { TODO() }

fun IOServiceRequestProbe(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ options: platform.posix.uint32_t /* = kotlin.UInt */): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun IOServiceWaitQuiet(/*0*/ service: platform.IOKit.io_service_t /* = kotlin.UInt */, /*1*/ waitTime: kotlinx.cinterop.CValuesRef<platform.darwin.mach_timespec_t /* = platform.darwin.mach_timespec */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

fun OSGetNotificationFromMessage(/*0*/ msg: kotlinx.cinterop.CValuesRef<platform.darwin.mach_msg_header_t>?, /*1*/ index: platform.posix.uint32_t /* = kotlin.UInt */, /*2*/ type: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?, /*3*/ reference: kotlinx.cinterop.CValuesRef<platform.posix.uintptr_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.uintptr_t /* = kotlin.ULong */> */>?, /*4*/ content: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*5*/ size: kotlinx.cinterop.CValuesRef<platform.darwin.vm_size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.darwin.vm_size_t /* = kotlin.ULong */> */>?): platform.darwin.kern_return_t /* = kotlin.Int */ { TODO() }

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge0")private external fun kniBridge0(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge1")private external fun kniBridge1(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge10")private external fun kniBridge10(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge13")private external fun kniBridge13(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge16")private external fun kniBridge16(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge2")private external fun kniBridge2(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge22")private external fun kniBridge22(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge3")private external fun kniBridge3(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge38")private external fun kniBridge38(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge39")private external fun kniBridge39(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge40")private external fun kniBridge40(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge41")private external fun kniBridge41(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge42")private external fun kniBridge42(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge43")private external fun kniBridge43(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge44")private external fun kniBridge44(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge45")private external fun kniBridge45(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge46")private external fun kniBridge46(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge47")private external fun kniBridge47(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge48")private external fun kniBridge48(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.ULong, /*6*/ p6: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*9*/ p9: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge49")private external fun kniBridge49(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.UInt, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.UInt, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlin.ULong, /*9*/ p9: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*10*/ p10: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*11*/ p11: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*12*/ p12: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge5")private external fun kniBridge5(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge50")private external fun kniBridge50(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge51")private external fun kniBridge51(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.UInt, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.ULong, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge52")private external fun kniBridge52(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge53")private external fun kniBridge53(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.UInt, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*6*/ p6: kotlin.UInt, /*7*/ p7: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*8*/ p8: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge54")private external fun kniBridge54(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge55")private external fun kniBridge55(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge56")private external fun kniBridge56(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge57")private external fun kniBridge57(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge58")private external fun kniBridge58(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge59")private external fun kniBridge59(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlin.ULong, /*6*/ p6: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge60")private external fun kniBridge60(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlin.ULong, /*5*/ p5: kotlin.ULong, /*6*/ p6: kotlin.ULong, /*7*/ p7: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge61")private external fun kniBridge61(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge62")private external fun kniBridge62(/*0*/ p0: kotlin.UInt): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge63")private external fun kniBridge63(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge64")private external fun kniBridge64(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge65")private external fun kniBridge65(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge66")private external fun kniBridge66(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge67")private external fun kniBridge67(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge68")private external fun kniBridge68(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge69")private external fun kniBridge69(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge70")private external fun kniBridge70(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge71")private external fun kniBridge71(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge72")private external fun kniBridge72(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge73")private external fun kniBridge73(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge74")private external fun kniBridge74(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge75")private external fun kniBridge75(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge76")private external fun kniBridge76(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge77")private external fun kniBridge77(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge78")private external fun kniBridge78(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge79")private external fun kniBridge79(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge80")private external fun kniBridge80(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge81")private external fun kniBridge81(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge82")private external fun kniBridge82(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge83")private external fun kniBridge83(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge84")private external fun kniBridge84(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge85")private external fun kniBridge85(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge86")private external fun kniBridge86(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge87")private external fun kniBridge87(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge88")private external fun kniBridge88(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge89")private external fun kniBridge89(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge9")private external fun kniBridge9(/*0*/ p0: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge90")private external fun kniBridge90(/*0*/ p0: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge91")private external fun kniBridge91(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge92")private external fun kniBridge92(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge93")private external fun kniBridge93(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge94")private external fun kniBridge94(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge95")private external fun kniBridge95(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge96")private external fun kniBridge96(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge97")private external fun kniBridge97(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlin.UInt): kotlin.Int

@kotlin.native.SymbolName(name = "platform_IOKit_kniBridge98")private external fun kniBridge98(): kotlin.UInt


