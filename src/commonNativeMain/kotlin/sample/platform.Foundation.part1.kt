package platform.Foundation

open expect class NSArray : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge532")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge536")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge524")
    open external override /*1*/ fun init(): kotlin.collections.List<*>

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge528")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge534")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSArray>,
        platform.Foundation.NSArrayMeta {
    }
}
