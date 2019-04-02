@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.libkern

import kotlinx.cinterop.* 

final class anonymousStruct1 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var opaque1: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var opaque2: kotlin.Long
        get() = TODO()
        set(value: kotlin.Long) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final class anonymousStruct2 public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var opaque1: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var opaque2: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var opaque3: kotlin.Int
        get() = TODO()
        set(value: kotlin.Int) = TODO()

    companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

typealias OSAtomic_int64_aligned64_t = platform.posix.int64_t

typealias OSAtomic_int64_aligned64_tVar = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t>

typealias OSFifoQueueHead = platform.libkern.anonymousStruct2

typealias OSQueueHead = platform.libkern.anonymousStruct1

typealias OSSpinLock = platform.posix.int32_t

typealias OSSpinLockVar = kotlinx.cinterop.IntVarOf<platform.libkern.OSSpinLock>

typealias SInt = kotlin.Int

typealias SIntVar = kotlinx.cinterop.IntVarOf<platform.libkern.SInt>

typealias UInt = kotlin.UInt

typealias UIntVar = kotlinx.cinterop.UIntVarOf<platform.libkern.UInt>

typealias io_async_ref64_t = kotlinx.cinterop.CArrayPointer<platform.libkern.io_user_reference_tVar>

typealias io_async_ref64_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_async_ref64_t>

typealias io_async_ref_t = kotlinx.cinterop.CArrayPointer<platform.libkern.io_user_reference_tVar>

typealias io_async_ref_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_async_ref_t>

typealias io_buf_ptr_t = kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>

typealias io_buf_ptr_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_buf_ptr_t>

typealias io_name_t = kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ByteVar>

typealias io_name_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_name_t>

typealias io_object_t = platform.darwin.mach_port_t

typealias io_object_tVar = kotlinx.cinterop.UIntVarOf<platform.libkern.io_object_t>

typealias io_scalar_inband64_t = kotlinx.cinterop.CArrayPointer<platform.libkern.io_user_scalar_tVar>

typealias io_scalar_inband64_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_scalar_inband64_t>

typealias io_scalar_inband_t = kotlinx.cinterop.CArrayPointer<platform.libkern.io_user_scalar_tVar>

typealias io_scalar_inband_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_scalar_inband_t>

typealias io_string_inband_t = kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ByteVar>

typealias io_string_inband_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_string_inband_t>

typealias io_string_t = kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ByteVar>

typealias io_string_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_string_t>

typealias io_struct_inband_t = kotlinx.cinterop.CArrayPointer<kotlinx.cinterop.ByteVar>

typealias io_struct_inband_tVar = kotlinx.cinterop.CPointerVarOf<platform.libkern.io_struct_inband_t>

typealias io_user_reference_t = platform.posix.uint64_t

typealias io_user_reference_tVar = kotlinx.cinterop.ULongVarOf<platform.libkern.io_user_reference_t>

typealias io_user_scalar_t = platform.posix.uint64_t

typealias io_user_scalar_tVar = kotlinx.cinterop.ULongVarOf<platform.libkern.io_user_scalar_t>

const val OSATOMIC_DEPRECATED: kotlin.Int = 0

const val OSSPINLOCK_DEPRECATED: kotlin.Int = 0

const val OSTYPES_K64_REV: kotlin.Int = 0

const val OS_SPINLOCK_INIT: kotlin.Int = 0

fun OSAtomicAdd32(/*0*/ __theAmount: platform.posix.int32_t /* = kotlin.Int */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicAdd32Barrier(/*0*/ __theAmount: platform.posix.int32_t /* = kotlin.Int */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicAdd64(/*0*/ __theAmount: platform.posix.int64_t /* = kotlin.Long */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun OSAtomicAdd64Barrier(/*0*/ __theAmount: platform.posix.int64_t /* = kotlin.Long */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun OSAtomicAnd32(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicAnd32Barrier(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicAnd32Orig(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicAnd32OrigBarrier(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicCompareAndSwap32(/*0*/ __oldValue: platform.posix.int32_t /* = kotlin.Int */, /*1*/ __newValue: platform.posix.int32_t /* = kotlin.Int */, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwap32Barrier(/*0*/ __oldValue: platform.posix.int32_t /* = kotlin.Int */, /*1*/ __newValue: platform.posix.int32_t /* = kotlin.Int */, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwap64(/*0*/ __oldValue: platform.posix.int64_t /* = kotlin.Long */, /*1*/ __newValue: platform.posix.int64_t /* = kotlin.Long */, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwap64Barrier(/*0*/ __oldValue: platform.posix.int64_t /* = kotlin.Long */, /*1*/ __newValue: platform.posix.int64_t /* = kotlin.Long */, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwapInt(/*0*/ __oldValue: kotlin.Int, /*1*/ __newValue: kotlin.Int, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVar /* = kotlinx.cinterop.IntVarOf<kotlin.Int> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwapIntBarrier(/*0*/ __oldValue: kotlin.Int, /*1*/ __newValue: kotlin.Int, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVar /* = kotlinx.cinterop.IntVarOf<kotlin.Int> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwapLong(/*0*/ __oldValue: kotlin.Long, /*1*/ __newValue: kotlin.Long, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.LongVar /* = kotlinx.cinterop.LongVarOf<kotlin.Long> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwapLongBarrier(/*0*/ __oldValue: kotlin.Long, /*1*/ __newValue: kotlin.Long, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.LongVar /* = kotlinx.cinterop.LongVarOf<kotlin.Long> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwapPtr(/*0*/ __oldValue: kotlinx.cinterop.CValuesRef<*>?, /*1*/ __newValue: kotlinx.cinterop.CValuesRef<*>?, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun OSAtomicCompareAndSwapPtrBarrier(/*0*/ __oldValue: kotlinx.cinterop.CValuesRef<*>?, /*1*/ __newValue: kotlinx.cinterop.CValuesRef<*>?, /*2*/ __theValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): kotlin.Boolean { TODO() }

fun OSAtomicDecrement32(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicDecrement32Barrier(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicDecrement64(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun OSAtomicDecrement64Barrier(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun OSAtomicDequeue(/*0*/ __list: kotlinx.cinterop.CValuesRef<platform.libkern.OSQueueHead /* = platform.libkern.anonymousStruct1 */>?, /*1*/ __offset: platform.posix.size_t /* = kotlin.ULong */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun OSAtomicEnqueue(/*0*/ __list: kotlinx.cinterop.CValuesRef<platform.libkern.OSQueueHead /* = platform.libkern.anonymousStruct1 */>?, /*1*/ __new: kotlinx.cinterop.CValuesRef<*>?, /*2*/ __offset: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun OSAtomicFifoDequeue(/*0*/ __list: kotlinx.cinterop.CValuesRef<platform.libkern.OSFifoQueueHead /* = platform.libkern.anonymousStruct2 */>?, /*1*/ __offset: platform.posix.size_t /* = kotlin.ULong */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun OSAtomicFifoEnqueue(/*0*/ __list: kotlinx.cinterop.CValuesRef<platform.libkern.OSFifoQueueHead /* = platform.libkern.anonymousStruct2 */>?, /*1*/ __new: kotlinx.cinterop.CValuesRef<*>?, /*2*/ __offset: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun OSAtomicIncrement32(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicIncrement32Barrier(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.int32_tVar /* = kotlinx.cinterop.IntVarOf<platform.posix.int32_t /* = kotlin.Int */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicIncrement64(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun OSAtomicIncrement64Barrier(/*0*/ __theValue: kotlinx.cinterop.CValuesRef<platform.libkern.OSAtomic_int64_aligned64_tVar /* = kotlinx.cinterop.LongVarOf<platform.libkern.OSAtomic_int64_aligned64_t /* = kotlin.Long */> */>?): platform.posix.int64_t /* = kotlin.Long */ { TODO() }

fun OSAtomicOr32(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicOr32Barrier(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicOr32Orig(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicOr32OrigBarrier(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicTestAndClear(/*0*/ __n: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theAddress: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun OSAtomicTestAndClearBarrier(/*0*/ __n: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theAddress: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun OSAtomicTestAndSet(/*0*/ __n: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theAddress: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun OSAtomicTestAndSetBarrier(/*0*/ __n: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theAddress: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

fun OSAtomicXor32(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicXor32Barrier(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicXor32Orig(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSAtomicXor32OrigBarrier(/*0*/ __theMask: platform.posix.uint32_t /* = kotlin.UInt */, /*1*/ __theValue: kotlinx.cinterop.CValuesRef<platform.posix.uint32_tVar /* = kotlinx.cinterop.UIntVarOf<platform.posix.uint32_t /* = kotlin.UInt */> */>?): platform.posix.int32_t /* = kotlin.Int */ { TODO() }

fun OSMemoryBarrier() { TODO() }

fun OSSpinLockLock(/*0*/ __lock: kotlinx.cinterop.CValuesRef<platform.libkern.OSSpinLockVar /* = kotlinx.cinterop.IntVarOf<platform.libkern.OSSpinLock /* = kotlin.Int */> */>?) { TODO() }

fun OSSpinLockTry(/*0*/ __lock: kotlinx.cinterop.CValuesRef<platform.libkern.OSSpinLockVar /* = kotlinx.cinterop.IntVarOf<platform.libkern.OSSpinLock /* = kotlin.Int */> */>?): kotlin.Boolean { TODO() }

fun OSSpinLockUnlock(/*0*/ __lock: kotlinx.cinterop.CValuesRef<platform.libkern.OSSpinLockVar /* = kotlinx.cinterop.IntVarOf<platform.libkern.OSSpinLock /* = kotlin.Int */> */>?) { TODO() }

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge0")private external fun kniBridge0(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge1")private external fun kniBridge1(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge10")private external fun kniBridge10(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge13")private external fun kniBridge13(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge16")private external fun kniBridge16(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge2")private external fun kniBridge2(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge22")private external fun kniBridge22(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge3")private external fun kniBridge3(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlin.UInt, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge38")private external fun kniBridge38()

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge39")private external fun kniBridge39(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge40")private external fun kniBridge40(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge41")private external fun kniBridge41(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge42")private external fun kniBridge42(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge43")private external fun kniBridge43(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge44")private external fun kniBridge44(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge45")private external fun kniBridge45(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge5")private external fun kniBridge5(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlin.Long, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_libkern_kniBridge9")private external fun kniBridge9(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long


