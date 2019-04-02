@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.CoreFoundation


import kotlinx.cinterop.*

final expect class CFAllocatorContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {

    }
}

final expect class CFArrayCallBacks: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFBagCallBacks: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFBinaryHeapCallBacks: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFBinaryHeapCompareContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFDictionaryKeyCallBacks: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFDictionaryValueCallBacks: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFFileDescriptorContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFGregorianDate: kotlinx.cinterop.CStructVar {
    final var second: kotlin.Double

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFGregorianUnits: kotlinx.cinterop.CStructVar {
    final var seconds: kotlin.Double

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFMachPortContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFMessagePortContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFRange: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFRunLoopObserverContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFRunLoopSourceContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFRunLoopSourceContext1: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFRunLoopTimerContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFSetCallBacks: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFSocketContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFSocketSignature: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFStreamClientContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFStreamError: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFStringInlineBuffer: kotlinx.cinterop.CStructVar {
    final val rangeToBuffer: platform.CoreFoundation.CFRange

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFSwappedFloat32: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFSwappedFloat64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class CFTimeZoneNameStyle: kotlinx.cinterop.CEnum {
    kCFTimeZoneNameStyleStandard,

    kCFTimeZoneNameStyleShortStandard,

    kCFTimeZoneNameStyleDaylightSaving,

    kCFTimeZoneNameStyleShortDaylightSaving,

    kCFTimeZoneNameStyleGeneric,

    kCFTimeZoneNameStyleShortGeneric;

    companion object Companion {
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.CoreFoundation.CFTimeZoneNameStyle

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class CFTreeContext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class CFUUIDBytes: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class IUnknownVTbl: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class __CFByteOrder: kotlinx.cinterop.CEnum {
    CFByteOrderUnknown,

    CFByteOrderLittleEndian,

    CFByteOrderBigEndian;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.CoreFoundation.__CFByteOrder
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.CoreFoundation.__CFByteOrder

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class CFBundleRefNum: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class CFFileDescriptorNativeDescriptor: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class CFIndex: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class CFSocketNativeHandle: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class CFTimeInterval: kotlin.Number, kotlin.Comparable<kotlin.Double> {
}

final expect class REFIID: kotlinx.cinterop.CStructVar {
}

expect val kCFBundleExecutableArchitectureI386: kotlin.UInt

expect val kCFBundleExecutableArchitecturePPC: kotlin.UInt

expect val kCFBundleExecutableArchitecturePPC64: kotlin.UInt

expect val kCFBundleExecutableArchitectureX86_64: kotlin.UInt

expect val kCFCopyStringBagCallBacks: platform.CoreFoundation.CFBagCallBacks

expect val kCFCopyStringDictionaryKeyCallBacks: platform.CoreFoundation.CFDictionaryKeyCallBacks

expect val kCFCopyStringSetCallBacks: platform.CoreFoundation.CFSetCallBacks

expect var kCFCoreFoundationVersionNumber: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_0: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_0_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_10: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_10_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_10_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_10_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_10_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_11_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_11_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_11_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_11_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_1_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_1_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_1_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_1_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_6: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_7: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_2_8: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_6: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_7: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_8: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_3_9: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_10: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_11: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_4_Intel: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_4_PowerPC: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_5_Intel: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_5_PowerPC: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_6_Intel: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_6_PowerPC: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_7: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_8: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_4_9: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_6: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_7: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_5_8: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_6: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_7: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_6_8: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_7: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_7_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_7_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_7_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_7_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_7_5: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_8: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_8_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_8_2: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_8_3: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_8_4: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_9: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_9_1: kotlin.Double

expect val kCFCoreFoundationVersionNumber10_9_2: kotlin.Double

expect val kCFStreamErrorDomainSOCKS: kotlin.Int

expect val kCFStreamErrorDomainSSL: kotlin.Int

expect val kCFStringBinaryHeapCallBacks: platform.CoreFoundation.CFBinaryHeapCallBacks

expect val kCFTypeArrayCallBacks: platform.CoreFoundation.CFArrayCallBacks

expect val kCFTypeBagCallBacks: platform.CoreFoundation.CFBagCallBacks

expect val kCFTypeDictionaryKeyCallBacks: platform.CoreFoundation.CFDictionaryKeyCallBacks

expect val kCFTypeDictionaryValueCallBacks: platform.CoreFoundation.CFDictionaryValueCallBacks

expect val kCFTypeSetCallBacks: platform.CoreFoundation.CFSetCallBacks

expect fun CFConvertDoubleHostToSwapped(/*0*/ arg: kotlin.Double): kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat64>

expect fun CFConvertDoubleSwappedToHost(/*0*/ arg: kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat64>): kotlin.Double

expect fun CFConvertFloatHostToSwapped(/*0*/ arg: kotlin.Float): kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat32>

expect fun CFConvertFloatSwappedToHost(/*0*/ arg: kotlinx.cinterop.CValue<platform.CoreFoundation.CFSwappedFloat32>): kotlin.Float

expect fun CFRunLoopRun()

expect fun CFTimeZoneResetSystem()


