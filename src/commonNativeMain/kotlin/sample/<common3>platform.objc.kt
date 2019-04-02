@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.objc

import kotlinx.cinterop.* 

final expect class objc_class: kotlinx.cinterop.CStructVar {
    final var isa: kotlinx.cinterop.ObjCClass

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class objc_method_description: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class objc_property_attribute_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class objc_super: kotlinx.cinterop.CStructVar {
    final var receiver: kotlin.Any

    final var super_class: kotlinx.cinterop.ObjCClass

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

expect val OBJC_SYNC_NOT_OWNING_THREAD_ERROR: kotlin.Int

expect val OBJC_SYNC_SUCCESS: kotlin.Int

expect var _dealloc: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Any?>>?

expect fun _objc_flush_caches(/*0*/ cls: kotlinx.cinterop.ObjCClass?)

expect fun _objc_msgForward_stret(/*0*/ receiver: kotlin.Any, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun class_addProperty(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?, /*2*/ attributes: kotlinx.cinterop.CValuesRef<platform.objc.objc_property_attribute_t>?, /*3*/ attributeCount: kotlin.UInt): kotlin.Boolean

expect fun class_getSuperclass(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlinx.cinterop.ObjCClass?

expect fun class_getVersion(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlin.Int

expect fun class_isMetaClass(/*0*/ cls: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

expect fun class_replaceProperty(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ name: kotlin.String?, /*2*/ attributes: kotlinx.cinterop.CValuesRef<platform.objc.objc_property_attribute_t>?, /*3*/ attributeCount: kotlin.UInt)

expect fun class_respondsToMethod(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean

expect fun class_respondsToSelector(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ sel: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean

expect fun class_setSuperclass(/*0*/ cls: kotlinx.cinterop.ObjCClass, /*1*/ newSuper: kotlinx.cinterop.ObjCClass): kotlinx.cinterop.ObjCClass

expect fun class_setVersion(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ version: kotlin.Int)

expect fun objc_begin_catch(/*0*/ exc_buf: kotlinx.cinterop.CValuesRef<*>?): kotlin.Any

expect fun objc_disposeClassPair(/*0*/ cls: kotlinx.cinterop.ObjCClass)

expect fun objc_end_catch()

expect fun objc_enumerationMutation(/*0*/ obj: kotlin.Any)

expect fun objc_exception_rethrow()

expect fun objc_exception_throw(/*0*/ exception: kotlin.Any)

expect fun objc_getAssociatedObject(/*0*/ `object`: kotlin.Any, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?): kotlin.Any?

expect fun objc_getClass(/*0*/ name: kotlin.String?): kotlin.Any?

external expect fun objc_getClassList(/*0*/ buffer: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ObjCObjectVar<kotlinx.cinterop.ObjCClass?>>?, /*1*/ bufferCount: kotlin.Int): kotlin.Int

expect fun objc_getMetaClass(/*0*/ name: kotlin.String?): kotlin.Any?

expect fun objc_getRequiredClass(/*0*/ name: kotlin.String?): kotlinx.cinterop.ObjCClass

external expect fun objc_loadWeak(/*0*/ location: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?): kotlin.Any?

expect fun objc_lookUpClass(/*0*/ name: kotlin.String?): kotlinx.cinterop.ObjCClass?

expect fun objc_msgSendSuper_stret(/*0*/ `super`: kotlinx.cinterop.CValuesRef<platform.objc.objc_super>?, /*1*/ op: kotlinx.cinterop.CValuesRef<*>?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun objc_msgSend_stret(/*0*/ self: kotlin.Any?, /*1*/ op: kotlinx.cinterop.CValuesRef<*>?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun objc_registerClassPair(/*0*/ cls: kotlinx.cinterop.ObjCClass)

expect fun objc_removeAssociatedObjects(/*0*/ `object`: kotlin.Any)

expect fun objc_setEnumerationMutationHandler(/*0*/ handler: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Any?) -> kotlin.Unit>>?)

expect fun objc_setForwardHandler(/*0*/ fwd: kotlinx.cinterop.CValuesRef<*>?, /*1*/ fwd_stret: kotlinx.cinterop.CValuesRef<*>?)

external expect fun objc_storeWeak(/*0*/ location: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/ obj: kotlin.Any?): kotlin.Any?

expect fun objc_sync_enter(/*0*/ obj: kotlin.Any): kotlin.Int

expect fun objc_sync_exit(/*0*/ obj: kotlin.Any): kotlin.Int

expect fun objc_terminate()

expect fun object_getClass(/*0*/ obj: kotlin.Any?): kotlinx.cinterop.ObjCClass?

expect fun object_isClass(/*0*/ obj: kotlin.Any?): kotlin.Boolean

expect fun object_setClass(/*0*/ obj: kotlin.Any?, /*1*/ cls: kotlinx.cinterop.ObjCClass): kotlinx.cinterop.ObjCClass?

expect fun sel_isEqual(/*0*/ lhs: kotlinx.cinterop.CValuesRef<*>?, /*1*/ rhs: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean


