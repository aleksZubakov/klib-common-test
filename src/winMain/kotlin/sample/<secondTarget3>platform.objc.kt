@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.objc

import kotlinx.cinterop.* 

final actual class objc_class public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    actual final var isa: kotlinx.cinterop.ObjCClass
        get() = TODO()
        set(value: kotlinx.cinterop.ObjCClass) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class objc_method_description public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var name: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var types: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class objc_property_attribute_t public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?) = TODO()

    final var value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class objc_super public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    actual final var receiver: kotlin.Any
        get() = TODO()
        set(value: kotlin.Any) = TODO()

    actual final var super_class: kotlinx.cinterop.ObjCClass
        get() = TODO()
        set(value: kotlinx.cinterop.ObjCClass) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

actual val OBJC_SYNC_NOT_OWNING_THREAD_ERROR: kotlin.Int
    get() = TODO()

actual val OBJC_SYNC_SUCCESS: kotlin.Int
    get() = TODO()

actual var _dealloc: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Any?>>?) = TODO()

actual fun _objc_flush_caches(/*0*/ cls: kotlinx.cinterop.ObjCClass?) { TODO() }

actual fun _objc_msgForward_stret(/*0*/ receiver: kotlin.Any, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/) { TODO() }

actual fun class_addProperty(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?, /*2*/ attributes: kotlinx.cinterop.CValuesRef<platform.objc.objc_property_attribute_t>?, /*3*/ attributeCount: kotlin.UInt): kotlin.Boolean { TODO() }

actual fun class_getSuperclass(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlinx.cinterop.ObjCClass? { TODO() }

actual fun class_getVersion(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlin.Int { TODO() }

actual fun class_isMetaClass(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlin.Boolean { TODO() }

actual fun class_replaceProperty(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?, /*2*/ attributes: kotlinx.cinterop.CValuesRef<platform.objc.objc_property_attribute_t>?, /*3*/ attributeCount: kotlin.UInt) { TODO() }

actual fun class_respondsToMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

actual fun class_respondsToSelector(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

actual fun class_setSuperclass(/*0*/ cls: kotlinx.cinterop.ObjCClass, /*1*/ newSuper: kotlinx.cinterop.ObjCClass): kotlinx.cinterop.ObjCClass { TODO() }

actual fun class_setVersion(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ version: kotlin.Int) { TODO() }

actual fun objc_begin_catch(/*0*/ exc_buf: kotlinx.cinterop.CValuesRef<*>?): kotlin.Any { TODO() }

actual fun objc_disposeClassPair(/*0*/ cls: kotlinx.cinterop.ObjCClass) { TODO() }

actual fun objc_end_catch() { TODO() }

actual fun objc_enumerationMutation(/*0*/ obj: kotlin.Any) { TODO() }

actual fun objc_exception_rethrow() { TODO() }

actual fun objc_exception_throw(/*0*/ exception: kotlin.Any) { TODO() }

actual fun objc_getAssociatedObject(/*0*/ `object`: kotlin.Any, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?): kotlin.Any? { TODO() }

actual fun objc_getClass(/*0*/ name: kotlin.String?): kotlin.Any? { TODO() }

external actual fun objc_getClassList(/*0*/ buffer: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ObjCObjectVar<kotlinx.cinterop.ObjCClass?>>?, /*1*/ bufferCount: kotlin.Int): kotlin.Int

actual fun objc_getMetaClass(/*0*/ name: kotlin.String?): kotlin.Any? { TODO() }

actual fun objc_getRequiredClass(/*0*/ name: kotlin.String?): kotlinx.cinterop.ObjCClass { TODO() }

external actual fun objc_loadWeak(/*0*/ location: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?): kotlin.Any?

actual fun objc_lookUpClass(/*0*/ name: kotlin.String?): kotlinx.cinterop.ObjCClass? { TODO() }

actual fun objc_msgSendSuper_stret(/*0*/ `super`: kotlinx.cinterop.CValuesRef<platform.objc.objc_super>?, /*1*/ op: kotlinx.cinterop.CValuesRef<*>?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/) { TODO() }

actual fun objc_msgSend_stret(/*0*/ self: kotlin.Any?, /*1*/ op: kotlinx.cinterop.CValuesRef<*>?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/) { TODO() }

actual fun objc_registerClassPair(/*0*/ cls: kotlinx.cinterop.ObjCClass) { TODO() }

actual fun objc_removeAssociatedObjects(/*0*/ `object`: kotlin.Any) { TODO() }

actual fun objc_setEnumerationMutationHandler(/*0*/ handler: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Unit>>?) { TODO() }

actual fun objc_setForwardHandler(/*0*/ fwd: kotlinx.cinterop.CValuesRef<*>?, /*1*/ fwd_stret: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

external actual fun objc_storeWeak(/*0*/ location: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/ obj: kotlin.Any?): kotlin.Any?

actual fun objc_sync_enter(/*0*/ obj: kotlin.Any): kotlin.Int { TODO() }

actual fun objc_sync_exit(/*0*/ obj: kotlin.Any): kotlin.Int { TODO() }

actual fun objc_terminate() { TODO() }

actual fun object_getClass(/*0*/ obj: kotlin.Any?): kotlinx.cinterop.ObjCClass? { TODO() }

actual fun object_isClass(/*0*/ obj: kotlin.Any?): kotlin.Boolean { TODO() }

actual fun object_setClass(/*0*/ obj: kotlin.Any?, /*1*/ cls: kotlinx.cinterop.ObjCClass): kotlinx.cinterop.ObjCClass? { TODO() }

actual fun sel_isEqual(/*0*/ lhs: kotlinx.cinterop.CValuesRef<*>?, /*1*/ rhs: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean { TODO() }

typealias Category = kotlinx.cinterop.CPointer<cnames.structs.objc_category>

typealias CategoryVar = kotlinx.cinterop.CPointerVarOf<platform.objc.Category>

typealias Ivar = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>

typealias IvarVar = kotlinx.cinterop.CPointerVarOf<platform.objc.Ivar>

typealias Method = kotlinx.cinterop.CPointer<cnames.structs.objc_method>

typealias MethodVar = kotlinx.cinterop.CPointerVarOf<platform.objc.Method>

typealias marg_list = kotlinx.cinterop.COpaquePointer

typealias marg_listVar = kotlinx.cinterop.CPointerVarOf<platform.objc.marg_list>

typealias objc_AssociationPolicy = platform.posix.uintptr_t

typealias objc_AssociationPolicyVar = kotlinx.cinterop.ULongVarOf<platform.objc.objc_AssociationPolicy>

typealias objc_exception_handler = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias objc_exception_handlerVar = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_exception_handler>

typealias objc_exception_matcher = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, kotlin.Any?) -> kotlin.Int>>

typealias objc_exception_matcherVar = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_exception_matcher>

typealias objc_exception_preprocessor = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Any?>>

typealias objc_exception_preprocessorVar = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_exception_preprocessor>

typealias objc_hook_getImageName = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar>>?) -> kotlin.Boolean>>

typealias objc_hook_getImageNameVar = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_hook_getImageName>

typealias objc_property_t = kotlinx.cinterop.CPointer<cnames.structs.objc_property>

typealias objc_property_tVar = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_property_t>

typealias objc_uncaught_exception_handler = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Unit>>

typealias objc_uncaught_exception_handlerVar = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_uncaught_exception_handler>

val OBJC_ASSOCIATION_ASSIGN: platform.objc.objc_AssociationPolicy /* = kotlin.ULong */
    get() = TODO()

val OBJC_ASSOCIATION_COPY: platform.objc.objc_AssociationPolicy /* = kotlin.ULong */
    get() = TODO()

val OBJC_ASSOCIATION_COPY_NONATOMIC: platform.objc.objc_AssociationPolicy /* = kotlin.ULong */
    get() = TODO()

val OBJC_ASSOCIATION_RETAIN: platform.objc.objc_AssociationPolicy /* = kotlin.ULong */
    get() = TODO()

val OBJC_ASSOCIATION_RETAIN_NONATOMIC: platform.objc.objc_AssociationPolicy /* = kotlin.ULong */
    get() = TODO()

const val OBJC_NEXT_METHOD_LIST: kotlin.Int = 0

const val OBSOLETE_OBJC_GETCLASSES: kotlin.Int = 0

const val _C_ARY_B: kotlin.Int = 0

const val _C_ARY_E: kotlin.Int = 0

const val _C_ATOM: kotlin.Int = 0

const val _C_BFLD: kotlin.Int = 0

const val _C_BOOL: kotlin.Int = 0

const val _C_CHARPTR: kotlin.Int = 0

const val _C_CHR: kotlin.Int = 0

const val _C_CLASS: kotlin.Int = 0

const val _C_CONST: kotlin.Int = 0

const val _C_DBL: kotlin.Int = 0

const val _C_FLT: kotlin.Int = 0

const val _C_ID: kotlin.Int = 0

const val _C_INT: kotlin.Int = 0

const val _C_LNG: kotlin.Int = 0

const val _C_LNG_LNG: kotlin.Int = 0

const val _C_PTR: kotlin.Int = 0

const val _C_SEL: kotlin.Int = 0

const val _C_SHT: kotlin.Int = 0

const val _C_STRUCT_B: kotlin.Int = 0

const val _C_STRUCT_E: kotlin.Int = 0

const val _C_UCHR: kotlin.Int = 0

const val _C_UINT: kotlin.Int = 0

const val _C_ULNG: kotlin.Int = 0

const val _C_ULNG_LNG: kotlin.Int = 0

const val _C_UNDEF: kotlin.Int = 0

const val _C_UNION_B: kotlin.Int = 0

const val _C_UNION_E: kotlin.Int = 0

const val _C_USHT: kotlin.Int = 0

const val _C_VECTOR: kotlin.Int = 0

const val _C_VOID: kotlin.Int = 0

var _alloc: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Any?>>?) = TODO()

var _copy: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Any?>>?) = TODO()

var _error: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, platform.posix.va_list? /* = kotlinx.cinterop.CPointer<platform.posix.__va_list_tag>? */) -> kotlin.Unit>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, platform.posix.va_list? /* = kotlinx.cinterop.CPointer<platform.posix.__va_list_tag>? */) -> kotlin.Unit>>?) = TODO()

var _realloc: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */) -> kotlin.Any?>>?) = TODO()

var _zoneAlloc: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Any?>>?) = TODO()

var _zoneCopy: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Any?>>?) = TODO()

var _zoneRealloc: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Any?>>?
    get() = TODO()
    set(value: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?, platform.posix.size_t /* = kotlin.ULong */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Any?>>?) = TODO()

fun class_addIvar(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?, /*2*/ size: platform.posix.size_t /* = kotlin.ULong */, /*3*/ alignment: platform.posix.uint8_t /* = kotlin.UByte */, /*4*/ types: kotlin.String?): kotlin.Boolean { TODO() }

fun class_addMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?, /*2*/ imp: platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*3*/ types: kotlin.String?): kotlin.Boolean { TODO() }

fun class_addProtocol(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ protocol: objcnames.classes.Protocol): kotlin.Boolean { TODO() }

fun class_conformsToProtocol(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ protocol: objcnames.classes.Protocol?): kotlin.Boolean { TODO() }

fun class_copyIvarList(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<platform.objc.IvarVar /* = kotlinx.cinterop.CPointerVarOf<platform.objc.Ivar /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar> */> */>? { TODO() }

fun class_copyMethodList(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<platform.objc.MethodVar /* = kotlinx.cinterop.CPointerVarOf<platform.objc.Method /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method> */> */>? { TODO() }

fun class_copyPropertyList(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<platform.objc.objc_property_tVar /* = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_property_t /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property> */> */>? { TODO() }

fun class_copyProtocolList(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<objcnames.classes.Protocol?>>? { TODO() }

fun class_createInstance(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ extraBytes: platform.posix.size_t /* = kotlin.ULong */): kotlin.Any? { TODO() }

fun class_getClassMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?): platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */ { TODO() }

fun class_getClassVariable(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?): platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */ { TODO() }

fun class_getImageName(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun class_getInstanceMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?): platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */ { TODO() }

fun class_getInstanceSize(/*0*/ cls: kotlinx.cinterop.ObjCClass?): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun class_getInstanceVariable(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?): platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */ { TODO() }

fun class_getIvarLayout(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlinx.cinterop.CPointer<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>? { TODO() }

fun class_getMethodImplementation(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun class_getMethodImplementation_stret(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun class_getName(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun class_getProperty(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?): platform.objc.objc_property_t? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property>? */ { TODO() }

fun class_getWeakIvarLayout(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlinx.cinterop.CPointer<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>? { TODO() }

fun class_lookupMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun class_replaceMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?, /*2*/ imp: platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*3*/ types: kotlin.String?): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun class_setIvarLayout(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ layout: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?) { TODO() }

fun class_setWeakIvarLayout(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ layout: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?) { TODO() }

fun imp_getBlock(/*0*/ anImp: platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Any? { TODO() }

fun imp_implementationWithBlock(/*0*/ block: kotlin.Any): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun imp_removeBlock(/*0*/ anImp: platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Boolean { TODO() }

fun ivar_getName(/*0*/ v: platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun ivar_getOffset(/*0*/ v: platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */): platform.posix.ptrdiff_t /* = kotlin.Long */ { TODO() }

fun ivar_getTypeEncoding(/*0*/ v: platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

@kotlin.native.SymbolName(name = "platform_objc_kniBridge0")private external fun kniBridge0(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge1")private external fun kniBridge1(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge100")private external fun kniBridge100(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge101")private external fun kniBridge101(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge102")private external fun kniBridge102(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge103")private external fun kniBridge103(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge104")private external fun kniBridge104(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge105")private external fun kniBridge105(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge106")private external fun kniBridge106(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge107")private external fun kniBridge107()

@kotlin.native.SymbolName(name = "platform_objc_kniBridge108")private external fun kniBridge108(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge109")private external fun kniBridge109()

@kotlin.native.SymbolName(name = "platform_objc_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge110")private external fun kniBridge110()

@kotlin.native.SymbolName(name = "platform_objc_kniBridge111")private external fun kniBridge111(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge112")private external fun kniBridge112(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge113")private external fun kniBridge113(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge114")private external fun kniBridge114(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_objc_kniBridge115")private external fun kniBridge115(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_objc_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge13")private external fun kniBridge13(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge16")private external fun kniBridge16(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_objc_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_objc_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge2")private external fun kniBridge2(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge22")private external fun kniBridge22(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge3")private external fun kniBridge3(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlin.UByte, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge38")private external fun kniBridge38(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge39")private external fun kniBridge39(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge40")private external fun kniBridge40(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge41")private external fun kniBridge41(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge42")private external fun kniBridge42(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge43")private external fun kniBridge43(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge44")private external fun kniBridge44(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge45")private external fun kniBridge45(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge46")private external fun kniBridge46(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge47")private external fun kniBridge47(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge48")private external fun kniBridge48(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge49")private external fun kniBridge49(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge5")private external fun kniBridge5(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge50")private external fun kniBridge50(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_objc_kniBridge51")private external fun kniBridge51(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge52")private external fun kniBridge52(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge53")private external fun kniBridge53(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge54")private external fun kniBridge54(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge55")private external fun kniBridge55(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge56")private external fun kniBridge56(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge57")private external fun kniBridge57(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge58")private external fun kniBridge58(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge59")private external fun kniBridge59(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge60")private external fun kniBridge60(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_objc_kniBridge61")private external fun kniBridge61(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge62")private external fun kniBridge62(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge63")private external fun kniBridge63(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge64")private external fun kniBridge64(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge65")private external fun kniBridge65(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge66")private external fun kniBridge66(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge67")private external fun kniBridge67(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge68")private external fun kniBridge68(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge69")private external fun kniBridge69(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge70")private external fun kniBridge70(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Byte, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge71")private external fun kniBridge71(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge72")private external fun kniBridge72(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge73")private external fun kniBridge73(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge74")private external fun kniBridge74(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Byte, /*3*/ p3: kotlin.Byte): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge75")private external fun kniBridge75(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge76")private external fun kniBridge76(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge77")private external fun kniBridge77(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge78")private external fun kniBridge78(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.Byte, /*4*/ p4: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge79")private external fun kniBridge79(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge80")private external fun kniBridge80(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.UInt, /*4*/ p4: kotlin.Byte, /*5*/ p5: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge81")private external fun kniBridge81(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge82")private external fun kniBridge82(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge83")private external fun kniBridge83(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge84")private external fun kniBridge84(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge85")private external fun kniBridge85(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge86")private external fun kniBridge86(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge87")private external fun kniBridge87(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge88")private external fun kniBridge88(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge89")private external fun kniBridge89(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge9")private external fun kniBridge9(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge90")private external fun kniBridge90(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge91")private external fun kniBridge91(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge92")private external fun kniBridge92(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_objc_kniBridge95")private external fun kniBridge95(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge96")private external fun kniBridge96(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_objc_kniBridge97")private external fun kniBridge97(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge98")private external fun kniBridge98(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_objc_kniBridge99")private external fun kniBridge99(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

fun method_copyArgumentType(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */, /*1*/ index: kotlin.UInt): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun method_copyReturnType(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun method_exchangeImplementations(/*0*/ m1: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */, /*1*/ m2: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */) { TODO() }

fun method_getArgumentType(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */, /*1*/ index: kotlin.UInt, /*2*/ dst: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, /*3*/ dst_len: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun method_getDescription(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */): kotlinx.cinterop.CPointer<platform.objc.objc_method_description>? { TODO() }

fun method_getImplementation(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun method_getName(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun method_getNumberOfArguments(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */): kotlin.UInt { TODO() }

fun method_getReturnType(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */, /*1*/ dst: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, /*2*/ dst_len: platform.posix.size_t /* = kotlin.ULong */) { TODO() }

fun method_getTypeEncoding(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun method_invoke_stret(/*0*/ receiver: kotlin.Any?, /*1*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/) { TODO() }

fun method_setImplementation(/*0*/ m: platform.objc.Method? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_method>? */, /*1*/ imp: platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.IMP? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }

fun objc_allocateClassPair(/*0*/ superclass: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?, /*2*/ extraBytes: platform.posix.size_t /* = kotlin.ULong */): kotlinx.cinterop.ObjCClass? { TODO() }

fun objc_allocateProtocol(/*0*/ name: kotlin.String?): objcnames.classes.Protocol? { TODO() }

fun objc_copyClassList(/*0*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlinx.cinterop.ObjCClass?>>? { TODO() }

fun objc_copyClassNamesForImage(/*0*/ image: kotlin.String?, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>? { TODO() }

fun objc_copyImageNames(/*0*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>? { TODO() }

fun objc_copyProtocolList(/*0*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<objcnames.classes.Protocol?>>? { TODO() }

fun objc_duplicateClass(/*0*/ original: kotlinx.cinterop.ObjCClass, /*1*/ name: kotlin.String?, /*2*/ extraBytes: platform.posix.size_t /* = kotlin.ULong */): kotlinx.cinterop.ObjCClass { TODO() }

fun objc_getProtocol(/*0*/ name: kotlin.String?): objcnames.classes.Protocol? { TODO() }

fun objc_registerProtocol(/*0*/ proto: objcnames.classes.Protocol) { TODO() }

fun objc_setAssociatedObject(/*0*/ `object`: kotlin.Any, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?, /*2*/ value: kotlin.Any?, /*3*/ policy: platform.objc.objc_AssociationPolicy /* = kotlin.ULong */) { TODO() }

fun objc_setExceptionMatcher(/*0*/ fn: platform.objc.objc_exception_matcher? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, kotlin.Any?) -> kotlin.Int>>? */): platform.objc.objc_exception_matcher? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, kotlin.Any?) -> kotlin.Int>>? */ { TODO() }

fun objc_setExceptionPreprocessor(/*0*/ fn: platform.objc.objc_exception_preprocessor? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Any?>>? */): platform.objc.objc_exception_preprocessor? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Any?>>? */ { TODO() }

fun objc_setHook_getImageName(/*0*/ newValue: platform.objc.objc_hook_getImageName? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>?) -> kotlin.Boolean>>? */, /*1*/ outOldValue: kotlinx.cinterop.CValuesRef<platform.objc.objc_hook_getImageNameVar /* = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_hook_getImageName /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.ObjCClass?, kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVar> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<kotlin.Byte>>> */>?) -> kotlin.Boolean>> */> */>?) { TODO() }

fun objc_setUncaughtExceptionHandler(/*0*/ fn: platform.objc.objc_uncaught_exception_handler? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Unit>>? */): platform.objc.objc_uncaught_exception_handler? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Unit>>? */ { TODO() }

fun object_getIvar(/*0*/ obj: kotlin.Any?, /*1*/ ivar: platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */): kotlin.Any? { TODO() }

fun object_setIvar(/*0*/ obj: kotlin.Any?, /*1*/ ivar: platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */, /*2*/ value: kotlin.Any?) { TODO() }

fun object_setIvarWithStrongDefault(/*0*/ obj: kotlin.Any?, /*1*/ ivar: platform.objc.Ivar? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_ivar>? */, /*2*/ value: kotlin.Any?) { TODO() }

fun property_copyAttributeList(/*0*/ property: platform.objc.objc_property_t? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property>? */, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<platform.objc.objc_property_attribute_t>? { TODO() }

fun property_copyAttributeValue(/*0*/ property: platform.objc.objc_property_t? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property>? */, /*1*/ attributeName: kotlin.String?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun property_getAttributes(/*0*/ property: platform.objc.objc_property_t? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun property_getName(/*0*/ property: platform.objc.objc_property_t? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun protocol_addMethodDescription(/*0*/ proto: objcnames.classes.Protocol, /*1*/ name: kotlinx.cinterop.CValuesRef<*>?, /*2*/ types: kotlin.String?, /*3*/ isRequiredMethod: kotlin.Boolean, /*4*/ isInstanceMethod: kotlin.Boolean) { TODO() }

fun protocol_addProperty(/*0*/ proto: objcnames.classes.Protocol, /*1*/ name: kotlin.String?, /*2*/ attributes: kotlinx.cinterop.CValuesRef<platform.objc.objc_property_attribute_t>?, /*3*/ attributeCount: kotlin.UInt, /*4*/ isRequiredProperty: kotlin.Boolean, /*5*/ isInstanceProperty: kotlin.Boolean) { TODO() }

fun protocol_addProtocol(/*0*/ proto: objcnames.classes.Protocol, /*1*/ addition: objcnames.classes.Protocol) { TODO() }

fun protocol_conformsToProtocol(/*0*/ proto: objcnames.classes.Protocol?, /*1*/ other: objcnames.classes.Protocol?): kotlin.Boolean { TODO() }

fun protocol_copyMethodDescriptionList(/*0*/ proto: objcnames.classes.Protocol, /*1*/ isRequiredMethod: kotlin.Boolean, /*2*/ isInstanceMethod: kotlin.Boolean, /*3*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<platform.objc.objc_method_description>? { TODO() }

fun protocol_copyPropertyList(/*0*/ proto: objcnames.classes.Protocol, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<platform.objc.objc_property_tVar /* = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_property_t /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property> */> */>? { TODO() }

fun protocol_copyPropertyList2(/*0*/ proto: objcnames.classes.Protocol, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?, /*2*/ isRequiredProperty: kotlin.Boolean, /*3*/ isInstanceProperty: kotlin.Boolean): kotlinx.cinterop.CPointer<platform.objc.objc_property_tVar /* = kotlinx.cinterop.CPointerVarOf<platform.objc.objc_property_t /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property> */> */>? { TODO() }

fun protocol_copyProtocolList(/*0*/ proto: objcnames.classes.Protocol, /*1*/ outCount: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVar /* = kotlinx.cinterop.UIntVarOf<kotlin.UInt> */>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<objcnames.classes.Protocol?>>? { TODO() }

fun protocol_getMethodDescription(/*0*/ proto: objcnames.classes.Protocol, /*1*/ aSel: kotlinx.cinterop.CValuesRef<*>?, /*2*/ isRequiredMethod: kotlin.Boolean, /*3*/ isInstanceMethod: kotlin.Boolean): kotlinx.cinterop.CValue<platform.objc.objc_method_description> { TODO() }

fun protocol_getName(/*0*/ proto: objcnames.classes.Protocol): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun protocol_getProperty(/*0*/ proto: objcnames.classes.Protocol, /*1*/ name: kotlin.String?, /*2*/ isRequiredProperty: kotlin.Boolean, /*3*/ isInstanceProperty: kotlin.Boolean): platform.objc.objc_property_t? /* = kotlinx.cinterop.CPointer<cnames.structs.objc_property>? */ { TODO() }

fun protocol_isEqual(/*0*/ proto: objcnames.classes.Protocol?, /*1*/ other: objcnames.classes.Protocol?): kotlin.Boolean { TODO() }

fun sel_getName(/*0*/ sel: kotlinx.cinterop.CValuesRef<*>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun sel_registerName(/*0*/ str: kotlin.String?): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */ { TODO() }


