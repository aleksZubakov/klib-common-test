@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.darwin

import kotlinx.cinterop.* 

final expect class BTREEINFO: kotlinx.cinterop.CStructVar {
    final var cachesize: kotlin.UInt

    final var compare: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?) -> kotlin.Int>>?

    final var flags: kotlin.ULong

    final var lorder: kotlin.Int

    final var maxkeypage: kotlin.Int

    final var minkeypage: kotlin.Int

    final var psize: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {

    }
}

final expect class CompileTimeAssertionChecks_DNS_SD: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class DBM: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class DBT: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class DBTYPE: kotlinx.cinterop.CEnum {
    DB_BTREE,

    DB_HASH,

    DB_RECNO;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.darwin.DBTYPE
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.darwin.DBTYPE

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class FixedPoint: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class FixedRect: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class Float32Point: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class Float80: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class Float96: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class HASHINFO: kotlinx.cinterop.CStructVar {
    final var bsize: kotlin.UInt

    final var cachesize: kotlin.UInt

    final var ffactor: kotlin.UInt

    final var lorder: kotlin.Int

    final var nelem: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class MPOOL: kotlinx.cinterop.CStructVar {
    final var fd: kotlin.Int

    final val lqh: platform.darwin._lqh

    final var pagesize: kotlin.ULong

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSObject: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "class", bridge = "objcKniBridge98")open external override /*1*/ fun `class`(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "conformsToProtocol:", bridge = "objcKniBridge112")open external override /*1*/ fun conformsToProtocol(/*0*/ aProtocol: objcnames.classes.Protocol?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copy", bridge = "objcKniBridge82")open external fun copy(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge120")open external override /*1*/ fun description(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "finalize", bridge = "objcKniBridge80")open external fun finalize()

    @kotlinx.cinterop.ObjCMethod(selector = "forwardInvocation:", bridge = "objcKniBridge92")open external fun forwardInvocation(/*0*/ anInvocation: platform.Foundation.NSInvocation?)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge78")open external fun init(): platform.darwin.NSObject?

    @kotlinx.cinterop.ObjCMethod(selector = "isEqual:", bridge = "objcKniBridge96")open external override /*1*/ fun isEqual(/*0*/ `object`: kotlin.Any?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isKindOfClass:", bridge = "objcKniBridge108")open external override /*1*/ fun isKindOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isMemberOfClass:", bridge = "objcKniBridge110")open external override /*1*/ fun isMemberOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isProxy", bridge = "objcKniBridge106")open external override /*1*/ fun isProxy(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopy", bridge = "objcKniBridge84")open external fun mutableCopy(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "superclass", bridge = "objcKniBridge118")open external override /*1*/ fun superclass(): kotlinx.cinterop.ObjCClass?

    companion object Companion: kotlinx.cinterop.ObjCClassOf<platform.darwin.NSObject>, platform.darwin.NSObjectMeta {
    }
}

open expect class NSObjectMeta: kotlinx.cinterop.ObjCObjectBaseMeta, platform.darwin.NSObjectProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge52")open external fun alloc(): platform.darwin.NSObject?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge50")open external fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.darwin.NSObject?

    @kotlinx.cinterop.ObjCMethod(selector = "class", bridge = "objcKniBridge72")open external fun `class`(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "conformsToProtocol:", bridge = "objcKniBridge56")open external fun conformsToProtocol(/*0*/ protocol: objcnames.classes.Protocol?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "debugDescription", bridge = "objcKniBridge76")open external fun debugDescription(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge74")open external fun description(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "initialize", bridge = "objcKniBridge46")open external fun initialize()

    @kotlinx.cinterop.ObjCMethod(selector = "isSubclassOfClass:", bridge = "objcKniBridge62")open external fun isSubclassOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "load", bridge = "objcKniBridge44")open external fun load()

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge48")open external fun new(): platform.darwin.NSObject?

    @kotlinx.cinterop.ObjCMethod(selector = "superclass", bridge = "objcKniBridge70")open external fun superclass(): kotlinx.cinterop.ObjCClass?
}

expect interface NSObjectProtocol: kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "class", bridge = "objcKniBridge4")fun `class`(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "conformsToProtocol:", bridge = "objcKniBridge18")fun conformsToProtocol(/*0*/ aProtocol: objcnames.classes.Protocol?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge26")fun description(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "isEqual:", bridge = "objcKniBridge2")fun isEqual(/*0*/ `object`: kotlin.Any?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isKindOfClass:", bridge = "objcKniBridge14")fun isKindOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isMemberOfClass:", bridge = "objcKniBridge16")fun isMemberOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isProxy", bridge = "objcKniBridge12")fun isProxy(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "superclass", bridge = "objcKniBridge24")fun superclass(): kotlinx.cinterop.ObjCClass?
}

expect interface NSObjectProtocolMeta: kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

final expect enum class NXByteOrder: kotlinx.cinterop.CEnum {
    NX_UnknownByteOrder,

    NX_LittleEndian,

    NX_BigEndian;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.darwin.NXByteOrder
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.darwin.NXByteOrder

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class NumVersion: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class NumVersionVariant: kotlinx.cinterop.CStructVar {
    final val parts: platform.darwin.NumVersion

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

expect interface OS_at_encoderProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_at_encoderProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_dispatch_dataProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_dataProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_dispatch_groupProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_groupProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_dispatch_ioProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_ioProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_dispatch_objectProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_dispatch_objectProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_dispatch_queueProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_queueProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_dispatch_queue_attrProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_queue_attrProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_dispatch_queue_concurrentProtocol: platform.darwin.OS_dispatch_queueProtocol {
}

expect interface OS_dispatch_queue_concurrentProtocolMeta: platform.darwin.OS_dispatch_queueProtocolMeta {
}

expect interface OS_dispatch_queue_globalProtocol: platform.darwin.OS_dispatch_queueProtocol {
}

expect interface OS_dispatch_queue_globalProtocolMeta: platform.darwin.OS_dispatch_queueProtocolMeta {
}

expect interface OS_dispatch_queue_mainProtocol: platform.darwin.OS_dispatch_queue_serialProtocol {
}

expect interface OS_dispatch_queue_mainProtocolMeta: platform.darwin.OS_dispatch_queue_serialProtocolMeta {
}

expect interface OS_dispatch_queue_serialProtocol: platform.darwin.OS_dispatch_queueProtocol {
}

expect interface OS_dispatch_queue_serialProtocolMeta: platform.darwin.OS_dispatch_queueProtocolMeta {
}

expect interface OS_dispatch_semaphoreProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_semaphoreProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_dispatch_sourceProtocol: platform.darwin.OS_dispatch_objectProtocol {
}

expect interface OS_dispatch_sourceProtocolMeta: platform.darwin.OS_dispatch_objectProtocolMeta {
}

expect interface OS_os_logProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_os_logProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

final expect class Point: kotlinx.cinterop.CStructVar {
    final var h: kotlin.Short

    final var v: kotlin.Short

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ProcessSerialNumber: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class RECNOINFO: kotlinx.cinterop.CStructVar {
    final var bval: kotlin.UByte

    final var cachesize: kotlin.UInt

    final var flags: kotlin.ULong

    final var lorder: kotlin.Int

    final var psize: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class Rect: kotlinx.cinterop.CStructVar {
    final var bottom: kotlin.Short

    final var left: kotlin.Short

    final var right: kotlin.Short

    final var top: kotlin.Short

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class TimeRecord: kotlinx.cinterop.CStructVar {
    final val value: platform.darwin.CompTimeValue /* = platform.darwin.wide */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class UnsignedWide: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class VersRec: kotlinx.cinterop.CStructVar {
    final var countryCode: kotlin.Short

    final val numericVersion: platform.darwin.NumVersion

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class _MM_CMPINT_ENUM: kotlinx.cinterop.CEnum {
    _MM_CMPINT_EQ,

    _MM_CMPINT_LT,

    _MM_CMPINT_LE,

    _MM_CMPINT_UNUSED,

    _MM_CMPINT_NE,

    _MM_CMPINT_NLT,

    _MM_CMPINT_NLE;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.darwin._MM_CMPINT_ENUM
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.darwin._MM_CMPINT_ENUM

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class _MM_MANTISSA_NORM_ENUM: kotlinx.cinterop.CEnum {
    _MM_MANT_NORM_1_2,

    _MM_MANT_NORM_p5_2,

    _MM_MANT_NORM_p5_1,

    _MM_MANT_NORM_p75_1p5;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.darwin._MM_MANTISSA_NORM_ENUM
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.darwin._MM_MANTISSA_NORM_ENUM

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class _MM_MANTISSA_SIGN_ENUM: kotlinx.cinterop.CEnum {
    _MM_MANT_SIGN_src,

    _MM_MANT_SIGN_zero,

    _MM_MANT_SIGN_nan;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.darwin._MM_MANTISSA_SIGN_ENUM
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.darwin._MM_MANTISSA_SIGN_ENUM

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class _TXTRecordRef_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _Unwind_Exception: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __db: kotlinx.cinterop.CStructVar {
    final var close: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?) -> kotlin.Int>>?

    final var del: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlin.UInt) -> kotlin.Int>>?

    final var fd: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?) -> kotlin.Int>>?

    final var get: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlin.UInt) -> kotlin.Int>>?

    final var put: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlin.UInt) -> kotlin.Int>>?

    final var seq: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlinx.cinterop.CPointer<platform.darwin.DBT>?, kotlin.UInt) -> kotlin.Int>>?

    final var sync: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CPointer<platform.darwin.__db>?, kotlin.UInt) -> kotlin.Int>>?

    final var type: platform.darwin.DBTYPE

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __nl_cat_d: kotlinx.cinterop.CStructVar {
    final var __size: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _bkt: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _hqh: kotlinx.cinterop.CStructVar {
    final var tqh_first: kotlinx.cinterop.CPointer<platform.darwin._bkt>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _lqh: kotlinx.cinterop.CStructVar {
    final var tqh_first: kotlinx.cinterop.CPointer<platform.darwin._bkt>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _stringlist: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class aiocb: kotlinx.cinterop.CStructVar {
    final var aio_fildes: kotlin.Int

    final var aio_lio_opcode: kotlin.Int

    final var aio_reqprio: kotlin.Int

    final val aio_sigevent: platform.posix.sigevent

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct1: kotlinx.cinterop.CStructVar {
    final var A: kotlinx.cinterop.CPointer<platform.darwin.dns_address_record_t>?

    final var AAAA: kotlinx.cinterop.CPointer<platform.darwin.dns_in6_address_record_t>?

    final var AFSDB: kotlinx.cinterop.CPointer<platform.darwin.dns_AFSDB_record_t>?

    final var CNAME: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var DNSNULL: kotlinx.cinterop.CPointer<platform.darwin.dns_raw_resource_record_t>?

    final var HINFO: kotlinx.cinterop.CPointer<platform.darwin.dns_HINFO_record_t>?

    final var ISDN: kotlinx.cinterop.CPointer<platform.darwin.dns_ISDN_record_t>?

    final var LOC: kotlinx.cinterop.CPointer<platform.darwin.dns_LOC_record_t>?

    final var MB: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var MD: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var MF: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var MG: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var MINFO: kotlinx.cinterop.CPointer<platform.darwin.dns_MINFO_record_t>?

    final var MR: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var MX: kotlinx.cinterop.CPointer<platform.darwin.dns_MX_record_t>?

    final var NS: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var PTR: kotlinx.cinterop.CPointer<platform.darwin.dns_domain_name_record_t>?

    final var RP: kotlinx.cinterop.CPointer<platform.darwin.dns_RP_record_t>?

    final var RT: kotlinx.cinterop.CPointer<platform.darwin.dns_RT_record_t>?

    final var SOA: kotlinx.cinterop.CPointer<platform.darwin.dns_SOA_record_t>?

    final var SRV: kotlinx.cinterop.CPointer<platform.darwin.dns_SRV_record_t>?

    final var TXT: kotlinx.cinterop.CPointer<platform.darwin.dns_TXT_record_t>?

    final var WKS: kotlinx.cinterop.CPointer<platform.darwin.dns_WKS_record_t>?

    final var X25: kotlinx.cinterop.CPointer<platform.darwin.dns_X25_record_t>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct5: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct6: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct7: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct8: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct9: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class at_block_buffer_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class at_size_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class at_texel_region_t: kotlinx.cinterop.CStructVar {
    final val validSize: platform.darwin.at_size_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_evclass_map: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_expire_after: kotlinx.cinterop.CStructVar {
    final var op_type: kotlin.UByte

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_mask: kotlinx.cinterop.CStructVar {
    final var am_failure: kotlin.UInt

    final var am_success: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_qctrl: kotlinx.cinterop.CStructVar {
    final var aq_bufsz: kotlin.Int

    final var aq_delay: kotlin.Int

    final var aq_hiwater: kotlin.Int

    final var aq_lowater: kotlin.Int

    final var aq_minfree: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_session: kotlinx.cinterop.CStructVar {
    final var as_aia_p: kotlinx.cinterop.CPointer<platform.darwin.auditinfo_addr_t /* = platform.darwin.auditinfo_addr */>?

    final val as_mask: platform.darwin.au_mask_t /* = platform.darwin.au_mask */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_tid: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class au_tid_addr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class audit_fstat: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class audit_stat: kotlinx.cinterop.CStructVar {
    final var as_audit: kotlin.Int

    final var as_auditctl: kotlin.Int

    final var as_dropped: kotlin.Int

    final var as_enqueue: kotlin.Int

    final var as_generated: kotlin.Int

    final var as_kernel: kotlin.Int

    final var as_memused: kotlin.UInt

    final var as_nonattrib: kotlin.Int

    final var as_numevent: kotlin.UInt

    final var as_rblocked: kotlin.Int

    final var as_totalsize: kotlin.Int

    final var as_version: kotlin.UInt

    final var as_wblocked: kotlin.Int

    final var as_written: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class audit_token_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class auditinfo: kotlinx.cinterop.CStructVar {
    final val ai_mask: platform.darwin.au_mask_t /* = platform.darwin.au_mask */

    final val ai_termid: platform.darwin.au_tid_t /* = platform.darwin.au_tid */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class auditinfo_addr: kotlinx.cinterop.CStructVar {
    final val ai_mask: platform.darwin.au_mask_t /* = platform.darwin.au_mask */

    final val ai_termid: platform.darwin.au_tid_addr_t /* = platform.darwin.au_tid_addr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class auditpinfo: kotlinx.cinterop.CStructVar {
    final val ap_mask: platform.darwin.au_mask_t /* = platform.darwin.au_mask */

    final val ap_termid: platform.darwin.au_tid_t /* = platform.darwin.au_tid */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class auditpinfo_addr: kotlinx.cinterop.CStructVar {
    final val ap_mask: platform.darwin.au_mask_t /* = platform.darwin.au_mask */

    final val ap_termid: platform.darwin.au_tid_addr_t /* = platform.darwin.au_tid_addr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class build_tool_version: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class build_version_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class bz_stream: kotlinx.cinterop.CStructVar {
    final var avail_in: kotlin.UInt

    final var avail_out: kotlin.UInt

    final var total_in_hi32: kotlin.UInt

    final var total_in_lo32: kotlin.UInt

    final var total_out_hi32: kotlin.UInt

    final var total_out_lo32: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class cache_attributes_s: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class compression_stream: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class data_in_code_entry: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class datum: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_AFSDB_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_HINFO_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_ISDN_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_LOC_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_MINFO_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_MX_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_RP_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_RT_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_SOA_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_SRV_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_TXT_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_WKS_record_t: kotlinx.cinterop.CStructVar {
    final val addr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_X25_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_address_record_t: kotlinx.cinterop.CStructVar {
    final val addr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_domain_name_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_header_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_in6_address_record_t: kotlinx.cinterop.CStructVar {
    final val addr: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_question_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_raw_resource_record_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_reply_t: kotlinx.cinterop.CStructVar {
    final var header: kotlinx.cinterop.CPointer<platform.darwin.dns_header_t>?

    final var server: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dns_resource_record_t: kotlinx.cinterop.CStructVar {
    final val data: platform.darwin.anonymousStruct1

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dwarf_eh_bases: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dyld_info_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dyld_kernel_image_info: kotlinx.cinterop.CStructVar {
    final val fsid: platform.darwin.fsid_t /* = platform.darwin.fsid */

    final val fsobjid: platform.darwin.fsobj_id_t /* = platform.darwin.fsobj_id */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dyld_kernel_process_info: kotlinx.cinterop.CStructVar {
    final val cache_image_info: platform.darwin.dyld_kernel_image_info

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylib: kotlinx.cinterop.CStructVar {
    final val name: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylib_command: kotlinx.cinterop.CStructVar {
    final val dylib: platform.darwin.dylib

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylib_module: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylib_module_64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylib_reference: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylib_table_of_contents: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dylinker_command: kotlinx.cinterop.CStructVar {
    final val name: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dysymtab_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class encryption_info_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class encryption_info_command_64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class entry_point_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fsid: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fsobj_id: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fstab: kotlinx.cinterop.CStructVar {
    final var fs_freq: kotlin.Int

    final var fs_passno: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fvmfile_command: kotlinx.cinterop.CStructVar {
    final val name: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fvmlib: kotlinx.cinterop.CStructVar {
    final val name: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fvmlib_command: kotlinx.cinterop.CStructVar {
    final val fvmlib: platform.darwin.fvmlib

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class glob_t: kotlinx.cinterop.CStructVar {
    final var gl_flags: kotlin.Int

    final var gl_matchc: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class gpu_energy_data: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_basic_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_can_has_debugger_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_cpu_load_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_load_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_preferred_user_arch: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_priority_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class host_sched_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ident_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifaddrs: kotlinx.cinterop.CStructVar {
    final var ifa_addr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ifa_dstaddr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ifa_flags: kotlin.UInt

    final var ifa_netmask: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ifa_next: kotlinx.cinterop.CPointer<platform.darwin.ifaddrs>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifmaddrs: kotlinx.cinterop.CStructVar {
    final var ifma_addr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ifma_lladdr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ifma_name: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ifma_next: kotlinx.cinterop.CPointer<platform.darwin.ifmaddrs>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class image_offset: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class io_stat_entry: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class io_stat_info: kotlinx.cinterop.CStructVar {
    final val disk_reads: platform.darwin.io_stat_entry

    final val metadata: platform.darwin.io_stat_entry

    final val paging: platform.darwin.io_stat_entry

    final val total_io: platform.darwin.io_stat_entry

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class iovec: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kernel_resource_sizes: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kmod_info: kotlinx.cinterop.CStructVar {
    final var next: kotlinx.cinterop.CPointer<platform.darwin.kmod_info>?

    final var reference_list: kotlinx.cinterop.CPointer<platform.darwin.kmod_reference_t /* = platform.darwin.kmod_reference */>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kmod_info_32_v1: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kmod_info_64_v1: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kmod_reference: kotlinx.cinterop.CStructVar {
    final var info: kotlinx.cinterop.CPointer<platform.darwin.kmod_info>?

    final var next: kotlinx.cinterop.CPointer<platform.darwin.kmod_reference>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class lastlogx: kotlinx.cinterop.CStructVar {
    final val ll_tv: platform.posix.timeval

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class lc_str: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class linkedit_data_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class linker_option_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class load_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_header: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_header_64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_audit_trailer_t: kotlinx.cinterop.CStructVar {
    final val msgh_audit: platform.darwin.audit_token_t

    final val msgh_sender: platform.darwin.security_token_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_base_t: kotlinx.cinterop.CStructVar {
    final val body: platform.darwin.mach_msg_body_t

    final val header: platform.darwin.mach_msg_header_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_body_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_context_trailer_t: kotlinx.cinterop.CStructVar {
    final val msgh_audit: platform.darwin.audit_token_t

    final val msgh_sender: platform.darwin.security_token_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_descriptor_t: kotlinx.cinterop.CStructVar {
    final val ool_ports: platform.darwin.mach_msg_ool_ports_descriptor_t

    final val out_of_line: platform.darwin.mach_msg_ool_descriptor_t

    final val port: platform.darwin.mach_msg_port_descriptor_t

    final val type: platform.darwin.mach_msg_type_descriptor_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_empty_rcv_t: kotlinx.cinterop.CStructVar {
    final val header: platform.darwin.mach_msg_header_t

    final val trailer: platform.darwin.mach_msg_trailer_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_empty_send_t: kotlinx.cinterop.CStructVar {
    final val header: platform.darwin.mach_msg_header_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_empty_t: kotlinx.cinterop.CStructVar {
    final val rcv: platform.darwin.mach_msg_empty_rcv_t

    final val send: platform.darwin.mach_msg_empty_send_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_header_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_mac_trailer_t: kotlinx.cinterop.CStructVar {
    final var msgh_ad: kotlin.Int

    final val msgh_audit: platform.darwin.audit_token_t

    final val msgh_labels: platform.darwin.msg_labels_t

    final val msgh_sender: platform.darwin.security_token_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_ool_descriptor32_t: kotlinx.cinterop.CStructVar {
    final var pad1: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_ool_descriptor64_t: kotlinx.cinterop.CStructVar {
    final var pad1: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_ool_descriptor_t: kotlinx.cinterop.CStructVar {
    final var pad1: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_ool_ports_descriptor32_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_ool_ports_descriptor64_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_ool_ports_descriptor_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_port_descriptor_t: kotlinx.cinterop.CStructVar {
    final var pad2: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_security_trailer_t: kotlinx.cinterop.CStructVar {
    final val msgh_sender: platform.darwin.security_token_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_seqno_trailer_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_trailer_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_msg_type_descriptor_t: kotlinx.cinterop.CStructVar {
    final var pad3: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_port_info_ext: kotlinx.cinterop.CStructVar {
    final val mpie_status: platform.darwin.mach_port_status_t /* = platform.darwin.mach_port_status */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_port_limits: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_port_options: kotlinx.cinterop.CStructVar {
    final val mpl: platform.darwin.mach_port_limits_t /* = platform.darwin.mach_port_limits */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_port_qos: kotlinx.cinterop.CStructVar {
    final var name: kotlin.UInt

    final var prealloc: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_port_status: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_task_basic_info: kotlinx.cinterop.CStructVar {
    final val system_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    final val user_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_timespec: kotlinx.cinterop.CStructVar {
    final var tv_sec: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_vm_read_entry: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mach_voucher_attr_recipe_data: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class memory_object_attr_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class memory_object_behave_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class memory_object_perf_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class msg_labels_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class note_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nt_sid_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class objc_object: kotlinx.cinterop.CStructVar {
    final var isa: kotlinx.cinterop.ObjCClass

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class os_activity_scope_state_s: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class os_unfair_lock_s: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class persona_token: kotlinx.cinterop.CStructVar {
    final val originator: platform.darwin.proc_persona_info

    final val proximate: platform.darwin.proc_persona_info

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_bases: kotlinx.cinterop.CStructVar {
    final val fifo: platform.darwin.policy_fifo_base_data_t /* = platform.darwin.policy_fifo_base */

    final val rr: platform.darwin.policy_rr_base_data_t /* = platform.darwin.policy_rr_base */

    final val ts: platform.darwin.policy_timeshare_base_data_t /* = platform.darwin.policy_timeshare_base */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_fifo_base: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_fifo_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_fifo_limit: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_infos: kotlinx.cinterop.CStructVar {
    final val fifo: platform.darwin.policy_fifo_info_data_t /* = platform.darwin.policy_fifo_info */

    final val rr: platform.darwin.policy_rr_info_data_t /* = platform.darwin.policy_rr_info */

    final val ts: platform.darwin.policy_timeshare_info_data_t /* = platform.darwin.policy_timeshare_info */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_limits: kotlinx.cinterop.CStructVar {
    final val fifo: platform.darwin.policy_fifo_limit_data_t /* = platform.darwin.policy_fifo_limit */

    final val rr: platform.darwin.policy_rr_limit_data_t /* = platform.darwin.policy_rr_limit */

    final val ts: platform.darwin.policy_timeshare_limit_data_t /* = platform.darwin.policy_timeshare_limit */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_rr_base: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_rr_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_rr_limit: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_timeshare_base: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_timeshare_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class policy_timeshare_limit: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class prebind_cksum_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class prebound_dylib_command: kotlinx.cinterop.CStructVar {
    final val linked_modules: platform.darwin.lc_str

    final val name: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class printf_info: kotlinx.cinterop.CStructVar {
    final var alt: kotlin.UInt

    final var extra: kotlin.UInt

    final var get_prec: kotlin.UInt

    final var get_width: kotlin.UInt

    final var group: kotlin.UInt

    final var is_char: kotlin.UInt

    final var is_intmax: kotlin.UInt

    final var is_long: kotlin.UInt

    final var is_long_double: kotlin.UInt

    final var is_ptrdiff: kotlin.UInt

    final var is_quad: kotlin.UInt

    final var is_short: kotlin.UInt

    final var is_size: kotlin.UInt

    final var is_vec: kotlin.UInt

    final var left: kotlin.UInt

    final var prec: kotlin.Int

    final var showsign: kotlin.UInt

    final var sofar: kotlin.Int

    final var space: kotlin.UInt

    final var wide: kotlin.UInt

    final var width: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class proc_persona_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class processor_basic_info: kotlinx.cinterop.CStructVar {
    final var slot_num: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class processor_cpu_load_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class processor_set_basic_info: kotlinx.cinterop.CStructVar {
    final var default_policy: kotlin.Int

    final var processor_count: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class processor_set_load_info: kotlinx.cinterop.CStructVar {
    final var task_count: kotlin.Int

    final var thread_count: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class routines_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class routines_command_64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rpath_command: kotlinx.cinterop.CStructVar {
    final val path: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class section: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class section_64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class security_token_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class segment_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class segment_command_64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double2x2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double2x3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double2x4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double3x2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double3x3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double3x4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double4x2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double4x3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_double4x4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float2x2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float2x3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float2x4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float3x2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float3x3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float3x4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float4x2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float4x3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_float4x4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_quatd: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class simd_quatf: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class source_version_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sub_client_command: kotlinx.cinterop.CStructVar {
    final val client: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sub_framework_command: kotlinx.cinterop.CStructVar {
    final val umbrella: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sub_library_command: kotlinx.cinterop.CStructVar {
    final val sub_library: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sub_umbrella_command: kotlinx.cinterop.CStructVar {
    final val sub_umbrella: platform.darwin.lc_str

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class symseg_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class symtab_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_absolutetime_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_affinity_tag_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_basic_info: kotlinx.cinterop.CStructVar {
    final val system_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    final val user_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_basic_info_32: kotlinx.cinterop.CStructVar {
    final val system_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    final val user_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_basic_info_64: kotlinx.cinterop.CStructVar {
    final val system_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    final val user_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_category_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_dyld_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_events_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_extmod_info: kotlinx.cinterop.CStructVar {
    final val extmod_statistics: platform.darwin.vm_extmod_statistics_data_t /* = platform.darwin.vm_extmod_statistics */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_flags_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_inspect_basic_counts: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_kernelmemory_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_power_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_power_info_v2: kotlinx.cinterop.CStructVar {
    final val cpu_energy: platform.darwin.task_power_info_data_t /* = platform.darwin.task_power_info */

    final val gpu_energy: platform.darwin.gpu_energy_data

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_qos_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_thread_times_info: kotlinx.cinterop.CStructVar {
    final val system_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    final val user_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_trace_memory_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_vm_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class task_wait_state_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_affinity_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_background_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_basic_info: kotlinx.cinterop.CStructVar {
    final val system_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    final val user_time: platform.darwin.time_value_t /* = platform.darwin.time_value */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_extended_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_extended_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_identifier_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_latency_qos_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_precedence_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_standard_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_throughput_qos_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class thread_time_constraint_policy: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class time_value: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class tlv_descriptor: kotlinx.cinterop.CStructVar {
    final var key: kotlin.ULong

    final var offset: kotlin.ULong

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ttyent: kotlinx.cinterop.CStructVar {
    final var ty_status: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class twolevel_hint: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class twolevel_hints_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class unw_context_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class unw_cursor_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class unw_proc_info_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class utmpx: kotlinx.cinterop.CStructVar {
    final val ut_tv: platform.posix.timeval

    final var ut_type: kotlin.Short

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class uuid_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class version_min_command: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_extmod_statistics: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_page_info_basic: kotlinx.cinterop.CStructVar {
    final var __pad: kotlin.Int

    final var depth: kotlin.Int

    final var disposition: kotlin.Int

    final var ref_count: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_purgeable_info: kotlinx.cinterop.CStructVar {
    final val obsolete_data: platform.darwin.vm_purgeable_stat_t /* = platform.darwin.vm_purgeable_stat */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_purgeable_stat: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_read_entry: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_basic_info: kotlinx.cinterop.CStructVar {
    final var user_wired_count: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_basic_info_64: kotlinx.cinterop.CStructVar {
    final var user_wired_count: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_extended_info: kotlinx.cinterop.CStructVar {
    final var external_pager: kotlin.UByte

    final var pages_dirtied: kotlin.UInt

    final var pages_resident: kotlin.UInt

    final var pages_reusable: kotlin.UInt

    final var pages_shared_now_private: kotlin.UInt

    final var pages_swapped_out: kotlin.UInt

    final var ref_count: kotlin.UInt

    final var shadow_depth: kotlin.UShort

    final var share_mode: kotlin.UByte

    final var user_tag: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_submap_info: kotlinx.cinterop.CStructVar {
    final var external_pager: kotlin.UByte

    final var pages_dirtied: kotlin.UInt

    final var pages_resident: kotlin.UInt

    final var pages_shared_now_private: kotlin.UInt

    final var pages_swapped_out: kotlin.UInt

    final var ref_count: kotlin.UInt

    final var shadow_depth: kotlin.UShort

    final var share_mode: kotlin.UByte

    final var user_tag: kotlin.UInt

    final var user_wired_count: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_submap_info_64: kotlinx.cinterop.CStructVar {
    final var external_pager: kotlin.UByte

    final var pages_dirtied: kotlin.UInt

    final var pages_resident: kotlin.UInt

    final var pages_reusable: kotlin.UInt

    final var pages_shared_now_private: kotlin.UInt

    final var pages_swapped_out: kotlin.UInt

    final var ref_count: kotlin.UInt

    final var shadow_depth: kotlin.UShort

    final var share_mode: kotlin.UByte

    final var user_tag: kotlin.UInt

    final var user_wired_count: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_submap_short_info_64: kotlinx.cinterop.CStructVar {
    final var external_pager: kotlin.UByte

    final var ref_count: kotlin.UInt

    final var shadow_depth: kotlin.UShort

    final var share_mode: kotlin.UByte

    final var user_tag: kotlin.UInt

    final var user_wired_count: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_region_top_info: kotlinx.cinterop.CStructVar {
    final var obj_id: kotlin.UInt

    final var private_pages_resident: kotlin.UInt

    final var ref_count: kotlin.UInt

    final var share_mode: kotlin.UByte

    final var shared_pages_resident: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_statistics: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class vm_statistics64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class wide: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class wordexp_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_avx512_state: kotlinx.cinterop.CStructVar {
    final val ash: platform.darwin.x86_state_hdr_t /* = platform.darwin.x86_state_hdr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_avx_state: kotlinx.cinterop.CStructVar {
    final val ash: platform.darwin.x86_state_hdr_t /* = platform.darwin.x86_state_hdr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_debug_state: kotlinx.cinterop.CStructVar {
    final val dsh: platform.darwin.x86_state_hdr_t /* = platform.darwin.x86_state_hdr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_exception_state: kotlinx.cinterop.CStructVar {
    final val esh: platform.darwin.x86_state_hdr_t /* = platform.darwin.x86_state_hdr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_float_state: kotlinx.cinterop.CStructVar {
    final val fsh: platform.darwin.x86_state_hdr_t /* = platform.darwin.x86_state_hdr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_state_hdr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class x86_thread_state: kotlinx.cinterop.CStructVar {
    final val tsh: platform.darwin.x86_state_hdr_t /* = platform.darwin.x86_state_hdr */

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class AbsoluteTime: kotlinx.cinterop.CStructVar {
}

final expect class BKT: kotlinx.cinterop.CStructVar {
}

final expect class CharParameter: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class CompTimeValue: kotlinx.cinterop.CStructVar {
}

final expect class DB: kotlinx.cinterop.CStructVar {
}

final expect class Float32: kotlin.Number, kotlin.Comparable<kotlin.Float> {
}

final expect class Float64: kotlin.Number, kotlin.Comparable<kotlin.Double> {
}

final expect class NSInteger: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class SInt16: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class SInt32: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class SInt64: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class SInt8: kotlin.Number, kotlin.Comparable<kotlin.Byte> {
}

final expect class ShortFixed: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class Size: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class StringList: kotlinx.cinterop.CStructVar {
}

final expect class StyleParameter: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class TXTRecordRef: kotlinx.cinterop.CStructVar {
}

final expect class alarm_type_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

open expect class at_encoder_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

final expect class at_error_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class au_evclass_map_t: kotlinx.cinterop.CStructVar {
}

final expect class au_expire_after_t: kotlinx.cinterop.CStructVar {
}

final expect class au_fstat_t: kotlinx.cinterop.CStructVar {
}

final expect class au_mask_t: kotlinx.cinterop.CStructVar {
}

final expect class au_qctrl_t: kotlinx.cinterop.CStructVar {
}

final expect class au_session_t: kotlinx.cinterop.CStructVar {
}

final expect class au_stat_t: kotlinx.cinterop.CStructVar {
}

final expect class au_tid_addr_t: kotlinx.cinterop.CStructVar {
}

final expect class au_tid_t: kotlinx.cinterop.CStructVar {
}

final expect class auditinfo_addr_t: kotlinx.cinterop.CStructVar {
}

final expect class auditinfo_t: kotlinx.cinterop.CStructVar {
}

final expect class auditpinfo_addr_t: kotlinx.cinterop.CStructVar {
}

final expect class auditpinfo_t: kotlinx.cinterop.CStructVar {
}

final expect class cache_attributes_t: kotlinx.cinterop.CStructVar {
}

final expect class cache_t: kotlinx.cinterop.COpaque {
}

final expect class clock_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class clock_id_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class clock_res_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class compression_status: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

open expect class dispatch_data_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

final expect class dispatch_fd_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

open expect class dispatch_group_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_io_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_object_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

final expect class dispatch_once_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

open expect class dispatch_queue_attr_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_queue_concurrent_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_queue_global_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_queue_main_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

final expect class dispatch_queue_priority_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

open expect class dispatch_queue_serial_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_queue_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_semaphore_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class dispatch_source_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

final expect class dnssd_sock_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class dyld_kernel_image_info_t: kotlinx.cinterop.CStructVar {
}

final expect class dyld_kernel_process_info_t: kotlinx.cinterop.CStructVar {
}

final expect class exception_behavior_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class exception_type_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class extended80: kotlinx.cinterop.CStructVar {
}

final expect class extended96: kotlinx.cinterop.CStructVar {
}

final expect class fsid_t: kotlinx.cinterop.CStructVar {
}

final expect class fsobj_id_t: kotlinx.cinterop.CStructVar {
}

final expect class host_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_can_has_debugger_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_cpu_load_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_load_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_preferred_user_arch_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_priority_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_purgable_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class host_sched_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class i386_exception_state_t: kotlinx.cinterop.CStructVar {
}

final expect class i386_float_state_t: kotlinx.cinterop.CStructVar {
}

final expect class i386_thread_state_t: kotlinx.cinterop.CStructVar {
}

final expect class integer_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class kern_return_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class kernel_resource_sizes_data_t: kotlinx.cinterop.CStructVar {
}

final expect class kmod_control_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class kmod_info_32_v1_t: kotlinx.cinterop.CStructVar {
}

final expect class kmod_info_64_v1_t: kotlinx.cinterop.CStructVar {
}

final expect class kmod_info_t: kotlinx.cinterop.CStructVar {
}

final expect class kmod_reference_t: kotlinx.cinterop.CStructVar {
}

final expect class kmod_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class mach_msg_format_0_trailer_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_msg_max_trailer_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_port_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class mach_port_info_ext_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_port_limits_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_port_options_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_port_qos_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_port_status_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_task_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_timespec_t: kotlinx.cinterop.CStructVar {
}

final expect class mach_voucher_attr_recipe_data_t: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double2x2: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double2x3: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double2x4: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double3x2: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double3x3: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double3x4: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double4x2: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double4x3: kotlinx.cinterop.CStructVar {
}

final expect class matrix_double4x4: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float2x2: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float2x3: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float2x4: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float3x2: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float3x3: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float3x4: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float4x2: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float4x3: kotlinx.cinterop.CStructVar {
}

final expect class matrix_float4x4: kotlinx.cinterop.CStructVar {
}

final expect class memory_object_attr_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class memory_object_behave_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class memory_object_copy_strategy_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class memory_object_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class memory_object_perf_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class memory_object_return_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

open expect class os_log_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

final expect class os_unfair_lock: kotlinx.cinterop.CStructVar {
}

final expect class policy_base_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_fifo_base_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_fifo_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_fifo_limit_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_limit_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_rr_base_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_rr_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_rr_limit_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class policy_timeshare_base_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_timeshare_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class policy_timeshare_limit_data_t: kotlinx.cinterop.CStructVar {
}

final expect class processor_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class processor_cpu_load_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class processor_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class processor_set_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class processor_set_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class processor_set_load_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class simd_bool: kotlin.Comparable<kotlin.Boolean> {
}

final expect class simd_char1: kotlin.Number, kotlin.Comparable<kotlin.Byte> {
}

final expect class simd_double1: kotlin.Number, kotlin.Comparable<kotlin.Double> {
}

final expect class simd_float1: kotlin.Number, kotlin.Comparable<kotlin.Float> {
}

final expect class simd_int1: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class simd_long1: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class simd_short1: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class sleep_type_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class task_absolutetime_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_affinity_tag_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_basic_info_32_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_basic_info_64_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_category_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_dyld_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_events_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_extmod_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_flags_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_inspect_basic_counts_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_kernelmemory_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_power_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_power_info_v2_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_purgable_info_t: kotlinx.cinterop.CStructVar {
}

final expect class task_role: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class task_special_port_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class task_thread_times_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_trace_memory_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_vm_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class task_wait_state_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_affinity_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_background_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_extended_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_extended_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_identifier_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_latency_qos_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_precedence_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_standard_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_state_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class thread_throughput_qos_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class thread_time_constraint_policy_data_t: kotlinx.cinterop.CStructVar {
}

final expect class time_value_t: kotlinx.cinterop.CStructVar {
}

final expect class token_t: kotlinx.cinterop.COpaque {
}

final expect class unw_fpreg_t: kotlin.Number, kotlin.Comparable<kotlin.Double> {
}

final expect class unw_regnum_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_behavior_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_extmod_statistics_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_machine_attribute_val_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_page_info_basic_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_page_info_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_prot_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_purgable_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_purgeable_stat_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_basic_info_data_64_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_basic_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_extended_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_flavor_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class vm_region_submap_info_data_64_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_submap_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_submap_short_info_data_64_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_region_top_info_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_statistics64_data_t: kotlinx.cinterop.CStructVar {
}

final expect class vm_statistics_data_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_avx512_state32_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_avx512_state64_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_avx512_state_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_avx_state32_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_avx_state64_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_avx_state_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_debug_state32_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_debug_state64_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_debug_state_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_exception_state32_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_exception_state64_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_exception_state_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_float_state32_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_float_state64_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_float_state_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_state_hdr_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_thread_state32_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_thread_state64_t: kotlinx.cinterop.CStructVar {
}

final expect class x86_thread_state_t: kotlinx.cinterop.CStructVar {
}

expect val ASL_KEY_AUX_DATA: kotlin.String

expect val ASL_KEY_AUX_TITLE: kotlin.String

expect val ASL_KEY_AUX_URL: kotlin.String

expect val ASL_KEY_AUX_UTI: kotlin.String

expect val ASL_KEY_EXPIRE_TIME: kotlin.String

expect val ASL_KEY_FACILITY: kotlin.String

expect val ASL_KEY_FINAL_NOTIFICATION: kotlin.String

expect val ASL_KEY_GID: kotlin.String

expect val ASL_KEY_HOST: kotlin.String

expect val ASL_KEY_LEVEL: kotlin.String

expect val ASL_KEY_MODULE: kotlin.String

expect val ASL_KEY_MSG: kotlin.String

expect val ASL_KEY_MSG_ID: kotlin.String

expect val ASL_KEY_OPTION: kotlin.String

expect val ASL_KEY_OS_ACTIVITY_ID: kotlin.String

expect val ASL_KEY_PID: kotlin.String

expect val ASL_KEY_READ_GID: kotlin.String

expect val ASL_KEY_READ_UID: kotlin.String

expect val ASL_KEY_REF_PID: kotlin.String

expect val ASL_KEY_REF_PROC: kotlin.String

expect val ASL_KEY_SENDER: kotlin.String

expect val ASL_KEY_SENDER_INSTANCE: kotlin.String

expect val ASL_KEY_SENDER_MACH_UUID: kotlin.String

expect val ASL_KEY_SESSION: kotlin.String

expect val ASL_KEY_TIME: kotlin.String

expect val ASL_KEY_TIME_NSEC: kotlin.String

expect val ASL_KEY_UID: kotlin.String

expect val ASL_MSG_FMT_BSD: kotlin.String

expect val ASL_MSG_FMT_MSG: kotlin.String

expect val ASL_MSG_FMT_RAW: kotlin.String

expect val ASL_MSG_FMT_STD: kotlin.String

expect val ASL_MSG_FMT_XML: kotlin.String

expect val ASL_STRING_ALERT: kotlin.String

expect val ASL_STRING_CRIT: kotlin.String

expect val ASL_STRING_DEBUG: kotlin.String

expect val ASL_STRING_EMERG: kotlin.String

expect val ASL_STRING_ERR: kotlin.String

expect val ASL_STRING_INFO: kotlin.String

expect val ASL_STRING_NOTICE: kotlin.String

expect val ASL_STRING_WARNING: kotlin.String

expect val ASL_TIME_FMT_LCL: kotlin.String

expect val ASL_TIME_FMT_SEC: kotlin.String

expect val ASL_TIME_FMT_UTC: kotlin.String

expect val AUDITDEV_FILENAME: kotlin.String

expect val CHECKINT_NO_ERROR: kotlin.UInt

expect val CHECKINT_OVERFLOW_ERROR: kotlin.UInt

expect val CHECKINT_TYPE_ERROR: kotlin.UInt

expect val COPYFILE_DISABLE_VAR: kotlin.String

expect val DBM_SUFFIX: kotlin.String

expect val DEBUG_ASSERT_COMPONENT_NAME_STRING: kotlin.String

expect val DISPATCH_WALLTIME_NOW: kotlin.ULong

expect val FSTAB: kotlin.String

expect val FSTAB_RO: kotlin.String

expect val FSTAB_RQ: kotlin.String

expect val FSTAB_RW: kotlin.String

expect val FSTAB_SW: kotlin.String

expect val FSTAB_XX: kotlin.String

expect val KERNEL_AUDIT_TOKEN: platform.darwin.audit_token_t

expect val KERNEL_SECURITY_TOKEN: platform.darwin.security_token_t

expect val MAGIC: kotlin.String

expect val OSBigEndian: kotlin.UInt

expect val OSLittleEndian: kotlin.UInt

expect val OSUnknownByteOrder: kotlin.UInt

expect val PA_CHAR: kotlin.UInt

expect val PA_DOUBLE: kotlin.UInt

expect val PA_FLOAT: kotlin.UInt

expect val PA_INT: kotlin.UInt

expect val PA_POINTER: kotlin.UInt

expect val PA_STRING: kotlin.UInt

expect val PA_VECTOR: kotlin.UInt

expect val PA_WCHAR: kotlin.UInt

expect val PA_WSTRING: kotlin.UInt

expect val REMOVEFILE_CROSS_MOUNT: kotlin.UInt

expect val REMOVEFILE_KEEP_PARENT: kotlin.UInt

expect val REMOVEFILE_PROCEED: kotlin.UInt

expect val REMOVEFILE_RECURSIVE: kotlin.UInt

expect val REMOVEFILE_SECURE_1_PASS: kotlin.UInt

expect val REMOVEFILE_SECURE_1_PASS_ZERO: kotlin.UInt

expect val REMOVEFILE_SECURE_35_PASS: kotlin.UInt

expect val REMOVEFILE_SECURE_3_PASS: kotlin.UInt

expect val REMOVEFILE_SECURE_7_PASS: kotlin.UInt

expect val REMOVEFILE_SKIP: kotlin.UInt

expect val REMOVEFILE_STATE_CONFIRM_CALLBACK: kotlin.UInt

expect val REMOVEFILE_STATE_CONFIRM_CONTEXT: kotlin.UInt

expect val REMOVEFILE_STATE_ERRNO: kotlin.UInt

expect val REMOVEFILE_STATE_ERROR_CALLBACK: kotlin.UInt

expect val REMOVEFILE_STATE_ERROR_CONTEXT: kotlin.UInt

expect val REMOVEFILE_STATE_STATUS_CALLBACK: kotlin.UInt

expect val REMOVEFILE_STATE_STATUS_CONTEXT: kotlin.UInt

expect val REMOVEFILE_STOP: kotlin.UInt

expect val SECT_BSS: kotlin.String

expect val SECT_COMMON: kotlin.String

expect val SECT_DATA: kotlin.String

expect val SECT_FVMLIB_INIT0: kotlin.String

expect val SECT_FVMLIB_INIT1: kotlin.String

expect val SECT_ICON_HEADER: kotlin.String

expect val SECT_ICON_TIFF: kotlin.String

expect val SECT_OBJC_MODULES: kotlin.String

expect val SECT_OBJC_REFS: kotlin.String

expect val SECT_OBJC_STRINGS: kotlin.String

expect val SECT_OBJC_SYMBOLS: kotlin.String

expect val SECT_TEXT: kotlin.String

expect val SEG_DATA: kotlin.String

expect val SEG_ICON: kotlin.String

expect val SEG_IMPORT: kotlin.String

expect val SEG_LINKEDIT: kotlin.String

expect val SEG_OBJC: kotlin.String

expect val SEG_PAGEZERO: kotlin.String

expect val SEG_TEXT: kotlin.String

expect val SEG_UNIXSTACK: kotlin.String

expect val TMAGIC: kotlin.String

expect val TVERSION: kotlin.String

expect val UNW_EBADFRAME: kotlin.Int

expect val UNW_EBADREG: kotlin.Int

expect val UNW_EBADVERSION: kotlin.Int

expect val UNW_EINVAL: kotlin.Int

expect val UNW_EINVALIDIP: kotlin.Int

expect val UNW_ENOINFO: kotlin.Int

expect val UNW_ENOMEM: kotlin.Int

expect val UNW_EREADONLYREG: kotlin.Int

expect val UNW_ESTOPUNWIND: kotlin.Int

expect val UNW_ESUCCESS: kotlin.Int

expect val UNW_EUNSPEC: kotlin.Int

expect val UNW_PPC_AP: kotlin.UInt

expect val UNW_PPC_CR0: kotlin.UInt

expect val UNW_PPC_CR1: kotlin.UInt

expect val UNW_PPC_CR2: kotlin.UInt

expect val UNW_PPC_CR3: kotlin.UInt

expect val UNW_PPC_CR4: kotlin.UInt

expect val UNW_PPC_CR5: kotlin.UInt

expect val UNW_PPC_CR6: kotlin.UInt

expect val UNW_PPC_CR7: kotlin.UInt

expect val UNW_PPC_CTR: kotlin.UInt

expect val UNW_PPC_F0: kotlin.UInt

expect val UNW_PPC_F1: kotlin.UInt

expect val UNW_PPC_F10: kotlin.UInt

expect val UNW_PPC_F11: kotlin.UInt

expect val UNW_PPC_F12: kotlin.UInt

expect val UNW_PPC_F13: kotlin.UInt

expect val UNW_PPC_F14: kotlin.UInt

expect val UNW_PPC_F15: kotlin.UInt

expect val UNW_PPC_F16: kotlin.UInt

expect val UNW_PPC_F17: kotlin.UInt

expect val UNW_PPC_F18: kotlin.UInt

expect val UNW_PPC_F19: kotlin.UInt

expect val UNW_PPC_F2: kotlin.UInt

expect val UNW_PPC_F20: kotlin.UInt

expect val UNW_PPC_F21: kotlin.UInt

expect val UNW_PPC_F22: kotlin.UInt

expect val UNW_PPC_F23: kotlin.UInt

expect val UNW_PPC_F24: kotlin.UInt

expect val UNW_PPC_F25: kotlin.UInt

expect val UNW_PPC_F26: kotlin.UInt

expect val UNW_PPC_F27: kotlin.UInt

expect val UNW_PPC_F28: kotlin.UInt

expect val UNW_PPC_F29: kotlin.UInt

expect val UNW_PPC_F3: kotlin.UInt

expect val UNW_PPC_F30: kotlin.UInt

expect val UNW_PPC_F31: kotlin.UInt

expect val UNW_PPC_F4: kotlin.UInt

expect val UNW_PPC_F5: kotlin.UInt

expect val UNW_PPC_F6: kotlin.UInt

expect val UNW_PPC_F7: kotlin.UInt

expect val UNW_PPC_F8: kotlin.UInt

expect val UNW_PPC_F9: kotlin.UInt

expect val UNW_PPC_LR: kotlin.UInt

expect val UNW_PPC_MQ: kotlin.UInt

expect val UNW_PPC_R0: kotlin.UInt

expect val UNW_PPC_R1: kotlin.UInt

expect val UNW_PPC_R10: kotlin.UInt

expect val UNW_PPC_R11: kotlin.UInt

expect val UNW_PPC_R12: kotlin.UInt

expect val UNW_PPC_R13: kotlin.UInt

expect val UNW_PPC_R14: kotlin.UInt

expect val UNW_PPC_R15: kotlin.UInt

expect val UNW_PPC_R16: kotlin.UInt

expect val UNW_PPC_R17: kotlin.UInt

expect val UNW_PPC_R18: kotlin.UInt

expect val UNW_PPC_R19: kotlin.UInt

expect val UNW_PPC_R2: kotlin.UInt

expect val UNW_PPC_R20: kotlin.UInt

expect val UNW_PPC_R21: kotlin.UInt

expect val UNW_PPC_R22: kotlin.UInt

expect val UNW_PPC_R23: kotlin.UInt

expect val UNW_PPC_R24: kotlin.UInt

expect val UNW_PPC_R25: kotlin.UInt

expect val UNW_PPC_R26: kotlin.UInt

expect val UNW_PPC_R27: kotlin.UInt

expect val UNW_PPC_R28: kotlin.UInt

expect val UNW_PPC_R29: kotlin.UInt

expect val UNW_PPC_R3: kotlin.UInt

expect val UNW_PPC_R30: kotlin.UInt

expect val UNW_PPC_R31: kotlin.UInt

expect val UNW_PPC_R4: kotlin.UInt

expect val UNW_PPC_R5: kotlin.UInt

expect val UNW_PPC_R6: kotlin.UInt

expect val UNW_PPC_R7: kotlin.UInt

expect val UNW_PPC_R8: kotlin.UInt

expect val UNW_PPC_R9: kotlin.UInt

expect val UNW_PPC_SPEFSCR: kotlin.UInt

expect val UNW_PPC_SPE_ACC: kotlin.UInt

expect val UNW_PPC_V0: kotlin.UInt

expect val UNW_PPC_V1: kotlin.UInt

expect val UNW_PPC_V10: kotlin.UInt

expect val UNW_PPC_V11: kotlin.UInt

expect val UNW_PPC_V12: kotlin.UInt

expect val UNW_PPC_V13: kotlin.UInt

expect val UNW_PPC_V14: kotlin.UInt

expect val UNW_PPC_V15: kotlin.UInt

expect val UNW_PPC_V16: kotlin.UInt

expect val UNW_PPC_V17: kotlin.UInt

expect val UNW_PPC_V18: kotlin.UInt

expect val UNW_PPC_V19: kotlin.UInt

expect val UNW_PPC_V2: kotlin.UInt

expect val UNW_PPC_V20: kotlin.UInt

expect val UNW_PPC_V21: kotlin.UInt

expect val UNW_PPC_V22: kotlin.UInt

expect val UNW_PPC_V23: kotlin.UInt

expect val UNW_PPC_V24: kotlin.UInt

expect val UNW_PPC_V25: kotlin.UInt

expect val UNW_PPC_V26: kotlin.UInt

expect val UNW_PPC_V27: kotlin.UInt

expect val UNW_PPC_V28: kotlin.UInt

expect val UNW_PPC_V29: kotlin.UInt

expect val UNW_PPC_V3: kotlin.UInt

expect val UNW_PPC_V30: kotlin.UInt

expect val UNW_PPC_V31: kotlin.UInt

expect val UNW_PPC_V4: kotlin.UInt

expect val UNW_PPC_V5: kotlin.UInt

expect val UNW_PPC_V6: kotlin.UInt

expect val UNW_PPC_V7: kotlin.UInt

expect val UNW_PPC_V8: kotlin.UInt

expect val UNW_PPC_V9: kotlin.UInt

expect val UNW_PPC_VRSAVE: kotlin.UInt

expect val UNW_PPC_VSCR: kotlin.UInt

expect val UNW_PPC_XER: kotlin.UInt

expect val UNW_REG_IP: kotlin.Int

expect val UNW_REG_SP: kotlin.Int

expect val UNW_X86_64_R10: kotlin.UInt

expect val UNW_X86_64_R11: kotlin.UInt

expect val UNW_X86_64_R12: kotlin.UInt

expect val UNW_X86_64_R13: kotlin.UInt

expect val UNW_X86_64_R14: kotlin.UInt

expect val UNW_X86_64_R15: kotlin.UInt

expect val UNW_X86_64_R8: kotlin.UInt

expect val UNW_X86_64_R9: kotlin.UInt

expect val UNW_X86_64_RAX: kotlin.UInt

expect val UNW_X86_64_RBP: kotlin.UInt

expect val UNW_X86_64_RBX: kotlin.UInt

expect val UNW_X86_64_RCX: kotlin.UInt

expect val UNW_X86_64_RDI: kotlin.UInt

expect val UNW_X86_64_RDX: kotlin.UInt

expect val UNW_X86_64_RSI: kotlin.UInt

expect val UNW_X86_64_RSP: kotlin.UInt

expect val UNW_X86_EAX: kotlin.UInt

expect val UNW_X86_EBP: kotlin.UInt

expect val UNW_X86_EBX: kotlin.UInt

expect val UNW_X86_ECX: kotlin.UInt

expect val UNW_X86_EDI: kotlin.UInt

expect val UNW_X86_EDX: kotlin.UInt

expect val UNW_X86_ESI: kotlin.UInt

expect val UNW_X86_ESP: kotlin.UInt

expect val UTMPX_CHANGE_NOTIFICATION: kotlin.String

expect val UTMPX_FILE: kotlin.String

expect val _PATH_FSTAB: kotlin.String

expect val _PATH_TTYS: kotlin.String

expect val _PATH_UTMPX: kotlin.String

expect val _TTYS_OFF: kotlin.String

expect val _TTYS_ON: kotlin.String

expect val _TTYS_ONERROR: kotlin.String

expect val _TTYS_ONOPTION: kotlin.String

expect val _TTYS_SECURE: kotlin.String

expect val _TTYS_SLOT: kotlin.String

expect val _TTYS_WINDOW: kotlin.String

expect val __dso_handle: platform.darwin.mach_header

expect val _dispatch_data_empty: cnames.structs.dispatch_data_s

expect val _dispatch_main_q: cnames.structs.dispatch_queue_s

expect val _dispatch_queue_attr_concurrent: cnames.structs.dispatch_queue_attr_s

expect val _dispatch_source_type_data_add: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_data_or: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_data_replace: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_mach_recv: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_mach_send: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_memorypressure: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_proc: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_read: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_signal: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_timer: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_vnode: cnames.structs.dispatch_source_type_s

expect val _dispatch_source_type_write: cnames.structs.dispatch_source_type_s

expect val _os_log_default: cnames.structs.os_log_s

expect val alphaStage: kotlin.UInt

expect val betaStage: kotlin.UInt

expect val bold: kotlin.UInt

expect val condense: kotlin.UInt

expect val developStage: kotlin.UInt

expect val extend: kotlin.UInt

expect val finalStage: kotlin.UInt

expect val italic: kotlin.UInt

expect val kDNSServiceClass_IN: kotlin.UInt

expect val kDNSServiceErr_AlreadyRegistered: kotlin.Int

expect val kDNSServiceErr_BadFlags: kotlin.Int

expect val kDNSServiceErr_BadInterfaceIndex: kotlin.Int

expect val kDNSServiceErr_BadKey: kotlin.Int

expect val kDNSServiceErr_BadParam: kotlin.Int

expect val kDNSServiceErr_BadReference: kotlin.Int

expect val kDNSServiceErr_BadSig: kotlin.Int

expect val kDNSServiceErr_BadState: kotlin.Int

expect val kDNSServiceErr_BadTime: kotlin.Int

expect val kDNSServiceErr_DoubleNAT: kotlin.Int

expect val kDNSServiceErr_Firewall: kotlin.Int

expect val kDNSServiceErr_Incompatible: kotlin.Int

expect val kDNSServiceErr_Invalid: kotlin.Int

expect val kDNSServiceErr_NATPortMappingDisabled: kotlin.Int

expect val kDNSServiceErr_NATPortMappingUnsupported: kotlin.Int

expect val kDNSServiceErr_NATTraversal: kotlin.Int

expect val kDNSServiceErr_NameConflict: kotlin.Int

expect val kDNSServiceErr_NoAuth: kotlin.Int

expect val kDNSServiceErr_NoError: kotlin.Int

expect val kDNSServiceErr_NoMemory: kotlin.Int

expect val kDNSServiceErr_NoRouter: kotlin.Int

expect val kDNSServiceErr_NoSuchKey: kotlin.Int

expect val kDNSServiceErr_NoSuchName: kotlin.Int

expect val kDNSServiceErr_NoSuchRecord: kotlin.Int

expect val kDNSServiceErr_NotInitialized: kotlin.Int

expect val kDNSServiceErr_PollingMode: kotlin.Int

expect val kDNSServiceErr_Refused: kotlin.Int

expect val kDNSServiceErr_ServiceNotRunning: kotlin.Int

expect val kDNSServiceErr_Timeout: kotlin.Int

expect val kDNSServiceErr_Transient: kotlin.Int

expect val kDNSServiceErr_Unknown: kotlin.Int

expect val kDNSServiceErr_Unsupported: kotlin.Int

expect val kDNSServiceFlagsAdd: kotlin.UInt

expect val kDNSServiceFlagsAllowExpiredAnswers: kotlin.UInt

expect val kDNSServiceFlagsAllowRemoteQuery: kotlin.UInt

expect val kDNSServiceFlagsAutoTrigger: kotlin.UInt

expect val kDNSServiceFlagsBackgroundTrafficClass: kotlin.UInt

expect val kDNSServiceFlagsBogus: kotlin.UInt

expect val kDNSServiceFlagsBrowseDomains: kotlin.UInt

expect val kDNSServiceFlagsDefault: kotlin.UInt

expect val kDNSServiceFlagsExpiredAnswer: kotlin.UInt

expect val kDNSServiceFlagsForce: kotlin.UInt

expect val kDNSServiceFlagsForceMulticast: kotlin.UInt

expect val kDNSServiceFlagsIncludeAWDL: kotlin.UInt

expect val kDNSServiceFlagsIncludeP2P: kotlin.UInt

expect val kDNSServiceFlagsIndeterminate: kotlin.UInt

expect val kDNSServiceFlagsInsecure: kotlin.UInt

expect val kDNSServiceFlagsKnownUnique: kotlin.UInt

expect val kDNSServiceFlagsLongLivedQuery: kotlin.UInt

expect val kDNSServiceFlagsMoreComing: kotlin.UInt

expect val kDNSServiceFlagsNoAutoRename: kotlin.UInt

expect val kDNSServiceFlagsNonBrowsable: kotlin.UInt

expect val kDNSServiceFlagsPrivateFour: kotlin.UInt

expect val kDNSServiceFlagsPrivateOne: kotlin.UInt

expect val kDNSServiceFlagsPrivateThree: kotlin.UInt

expect val kDNSServiceFlagsPrivateTwo: kotlin.UInt

expect val kDNSServiceFlagsRegistrationDomains: kotlin.UInt

expect val kDNSServiceFlagsReturnIntermediates: kotlin.UInt

expect val kDNSServiceFlagsSecure: kotlin.UInt

expect val kDNSServiceFlagsShareConnection: kotlin.UInt

expect val kDNSServiceFlagsShared: kotlin.UInt

expect val kDNSServiceFlagsSuppressUnusable: kotlin.UInt

expect val kDNSServiceFlagsThresholdFinder: kotlin.UInt

expect val kDNSServiceFlagsThresholdOne: kotlin.UInt

expect val kDNSServiceFlagsThresholdReached: kotlin.UInt

expect val kDNSServiceFlagsTimeout: kotlin.UInt

expect val kDNSServiceFlagsUnicastResponse: kotlin.UInt

expect val kDNSServiceFlagsUnique: kotlin.UInt

expect val kDNSServiceFlagsValidate: kotlin.UInt

expect val kDNSServiceFlagsValidateOptional: kotlin.UInt

expect val kDNSServiceFlagsWakeOnResolve: kotlin.UInt

expect val kDNSServiceFlagsWakeOnlyService: kotlin.UInt

expect val kDNSServiceProperty_DaemonVersion: kotlin.String

expect val kDNSServiceProtocol_IPv4: kotlin.UInt

expect val kDNSServiceProtocol_IPv6: kotlin.UInt

expect val kDNSServiceProtocol_TCP: kotlin.UInt

expect val kDNSServiceProtocol_UDP: kotlin.UInt

expect val kDNSServiceType_A: kotlin.UInt

expect val kDNSServiceType_A6: kotlin.UInt

expect val kDNSServiceType_AAAA: kotlin.UInt

expect val kDNSServiceType_AFSDB: kotlin.UInt

expect val kDNSServiceType_ANY: kotlin.UInt

expect val kDNSServiceType_APL: kotlin.UInt

expect val kDNSServiceType_ATMA: kotlin.UInt

expect val kDNSServiceType_AXFR: kotlin.UInt

expect val kDNSServiceType_CERT: kotlin.UInt

expect val kDNSServiceType_CNAME: kotlin.UInt

expect val kDNSServiceType_DHCID: kotlin.UInt

expect val kDNSServiceType_DNAME: kotlin.UInt

expect val kDNSServiceType_DNSKEY: kotlin.UInt

expect val kDNSServiceType_DS: kotlin.UInt

expect val kDNSServiceType_EID: kotlin.UInt

expect val kDNSServiceType_GID: kotlin.UInt

expect val kDNSServiceType_GPOS: kotlin.UInt

expect val kDNSServiceType_HINFO: kotlin.UInt

expect val kDNSServiceType_HIP: kotlin.UInt

expect val kDNSServiceType_IPSECKEY: kotlin.UInt

expect val kDNSServiceType_ISDN: kotlin.UInt

expect val kDNSServiceType_IXFR: kotlin.UInt

expect val kDNSServiceType_KEY: kotlin.UInt

expect val kDNSServiceType_KX: kotlin.UInt

expect val kDNSServiceType_LOC: kotlin.UInt

expect val kDNSServiceType_MAILA: kotlin.UInt

expect val kDNSServiceType_MAILB: kotlin.UInt

expect val kDNSServiceType_MB: kotlin.UInt

expect val kDNSServiceType_MD: kotlin.UInt

expect val kDNSServiceType_MF: kotlin.UInt

expect val kDNSServiceType_MG: kotlin.UInt

expect val kDNSServiceType_MINFO: kotlin.UInt

expect val kDNSServiceType_MR: kotlin.UInt

expect val kDNSServiceType_MX: kotlin.UInt

expect val kDNSServiceType_NAPTR: kotlin.UInt

expect val kDNSServiceType_NIMLOC: kotlin.UInt

expect val kDNSServiceType_NS: kotlin.UInt

expect val kDNSServiceType_NSAP: kotlin.UInt

expect val kDNSServiceType_NSAP_PTR: kotlin.UInt

expect val kDNSServiceType_NSEC: kotlin.UInt

expect val kDNSServiceType_NSEC3: kotlin.UInt

expect val kDNSServiceType_NSEC3PARAM: kotlin.UInt

expect val kDNSServiceType_NULL: kotlin.UInt

expect val kDNSServiceType_NXT: kotlin.UInt

expect val kDNSServiceType_OPT: kotlin.UInt

expect val kDNSServiceType_PTR: kotlin.UInt

expect val kDNSServiceType_PX: kotlin.UInt

expect val kDNSServiceType_RP: kotlin.UInt

expect val kDNSServiceType_RRSIG: kotlin.UInt

expect val kDNSServiceType_RT: kotlin.UInt

expect val kDNSServiceType_SIG: kotlin.UInt

expect val kDNSServiceType_SINK: kotlin.UInt

expect val kDNSServiceType_SOA: kotlin.UInt

expect val kDNSServiceType_SPF: kotlin.UInt

expect val kDNSServiceType_SRV: kotlin.UInt

expect val kDNSServiceType_SSHFP: kotlin.UInt

expect val kDNSServiceType_TKEY: kotlin.UInt

expect val kDNSServiceType_TSIG: kotlin.UInt

expect val kDNSServiceType_TXT: kotlin.UInt

expect val kDNSServiceType_UID: kotlin.UInt

expect val kDNSServiceType_UINFO: kotlin.UInt

expect val kDNSServiceType_UNSPEC: kotlin.UInt

expect val kDNSServiceType_WKS: kotlin.UInt

expect val kDNSServiceType_X25: kotlin.UInt

expect val kNilOptions: kotlin.UInt

expect val kNotifyASLDBUpdate: kotlin.String

expect val kNotifyClockSet: kotlin.String

expect val kNotifyDSCacheInvalidation: kotlin.String

expect val kNotifyDSCacheInvalidationGroup: kotlin.String

expect val kNotifyDSCacheInvalidationHost: kotlin.String

expect val kNotifyDSCacheInvalidationService: kotlin.String

expect val kNotifyDSCacheInvalidationUser: kotlin.String

expect val kNotifySCHostNameChange: kotlin.String

expect val kNotifySCNetworkChange: kotlin.String

expect val kNotifyTimeZoneChange: kotlin.String

expect val kNotifyVFSLowDiskSpace: kotlin.String

expect val kNotifyVFSLowDiskSpaceOtherFS: kotlin.String

expect val kNotifyVFSLowDiskSpaceRootFS: kotlin.String

expect val kNotifyVFSMount: kotlin.String

expect val kNotifyVFSUnmount: kotlin.String

expect val kNotifyVFSUpdate: kotlin.String

expect val kUnknownType: kotlin.UInt

expect val kVariableLengthArray: kotlin.UInt

expect val matrix_identity_double2x2: platform.darwin.simd_double2x2

expect val matrix_identity_double3x3: platform.darwin.simd_double3x3

expect val matrix_identity_double4x4: platform.darwin.simd_double4x4

expect val matrix_identity_float2x2: platform.darwin.simd_float2x2

expect val matrix_identity_float3x3: platform.darwin.simd_float3x3

expect val matrix_identity_float4x4: platform.darwin.simd_float4x4

expect val noErr: kotlin.UInt

expect val normal: kotlin.UInt

expect val outline: kotlin.UInt

expect val shadow: kotlin.UInt

expect val underline: kotlin.UInt

expect fun BZ2_bzCompress(/*0*/ strm: kotlinx.cinterop.CValuesRef<platform.darwin.bz_stream>?, /*1*/ action: kotlin.Int): kotlin.Int

expect fun BZ2_bzCompressEnd(/*0*/ strm: kotlinx.cinterop.CValuesRef<platform.darwin.bz_stream>?): kotlin.Int

expect fun BZ2_bzCompressInit(/*0*/ strm: kotlinx.cinterop.CValuesRef<platform.darwin.bz_stream>?, /*1*/ blockSize100k: kotlin.Int, /*2*/ verbosity: kotlin.Int, /*3*/ workFactor: kotlin.Int): kotlin.Int

expect fun BZ2_bzDecompress(/*0*/ strm: kotlinx.cinterop.CValuesRef<platform.darwin.bz_stream>?): kotlin.Int

expect fun BZ2_bzDecompressEnd(/*0*/ strm: kotlinx.cinterop.CValuesRef<platform.darwin.bz_stream>?): kotlin.Int

expect fun BZ2_bzDecompressInit(/*0*/ strm: kotlinx.cinterop.CValuesRef<platform.darwin.bz_stream>?, /*1*/ verbosity: kotlin.Int, /*2*/ small: kotlin.Int): kotlin.Int

expect fun BZ2_bzclose(/*0*/ b: kotlinx.cinterop.CValuesRef<*>?)

expect fun BZ2_bzflush(/*0*/ b: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun BZ2_bzread(/*0*/ b: kotlinx.cinterop.CValuesRef<*>?, /*1*/ buf: kotlinx.cinterop.CValuesRef<*>?, /*2*/ len: kotlin.Int): kotlin.Int

expect fun BZ2_bzwrite(/*0*/ b: kotlinx.cinterop.CValuesRef<*>?, /*1*/ buf: kotlinx.cinterop.CValuesRef<*>?, /*2*/ len: kotlin.Int): kotlin.Int

expect fun NXHostByteOrder(): platform.darwin.NXByteOrder

expect fun NXSwapBigIntToHost(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NXSwapBigLongLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapBigLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapBigShortToHost(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NXSwapHostIntToBig(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NXSwapHostIntToLittle(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NXSwapHostLongLongToBig(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapHostLongLongToLittle(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapHostLongToBig(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapHostLongToLittle(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapHostShortToBig(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NXSwapHostShortToLittle(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NXSwapInt(/*0*/ inv: kotlin.UInt): kotlin.UInt

expect fun NXSwapLittleIntToHost(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NXSwapLittleLongLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapLittleLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NXSwapLittleShortToHost(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NXSwapLong(/*0*/ inv: kotlin.ULong): kotlin.ULong

expect fun NXSwapLongLong(/*0*/ inv: kotlin.ULong): kotlin.ULong

expect fun NXSwapShort(/*0*/ inv: kotlin.UShort): kotlin.UShort

expect fun TXTRecordDeallocate(/*0*/ txtRecord: kotlinx.cinterop.CValuesRef<platform.darwin.TXTRecordRef /* = platform.darwin._TXTRecordRef_t */>?)

expect fun _Block_object_assign(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?, /*2*/ arg2: kotlin.Int)

expect fun _Block_object_dispose(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlin.Int)

expect fun _Block_release(/*0*/ aBlock: kotlinx.cinterop.CValuesRef<*>?)

expect fun _Unwind_DeleteException(/*0*/ exception_object: kotlinx.cinterop.CValuesRef<platform.darwin._Unwind_Exception>?)

expect fun _Unwind_Resume(/*0*/ exception_object: kotlinx.cinterop.CValuesRef<platform.darwin._Unwind_Exception>?)

expect fun __deregister_frame(/*0*/ fde: kotlinx.cinterop.CValuesRef<*>?)

expect fun __invert_d2(/*0*/ arg0: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun __invert_d3(/*0*/ arg0: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun __invert_d4(/*0*/ arg0: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun __invert_f2(/*0*/ arg0: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun __invert_f3(/*0*/ arg0: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun __invert_f4(/*0*/ arg0: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun __os_warn_unused(/*0*/ x: kotlin.Boolean): kotlin.Boolean

expect fun __register_frame(/*0*/ fde: kotlinx.cinterop.CValuesRef<*>?)

expect fun __tg_acos(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_acos(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_acosh(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_acosh(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_asin(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_asin(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_asinh(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_asinh(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_atan(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_atan(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_atan2(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_atan2(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_atanh(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_atanh(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_carg(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_carg(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_cbrt(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_cbrt(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_ceil(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_ceil(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_cimag(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_cimag(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_copysign(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_copysign(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_cos(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_cos(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_cosh(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_cosh(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_cospi(/*0*/ x: kotlin.Double): kotlin.Double

expect fun __tg_cospi(/*0*/ x: kotlin.Float): kotlin.Float

expect fun __tg_creal(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_creal(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_erf(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_erf(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_erfc(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_erfc(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_exp(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_exp(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_exp(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun __tg_exp(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun __tg_exp10(/*0*/ x: kotlin.Double): kotlin.Double

expect fun __tg_exp10(/*0*/ x: kotlin.Float): kotlin.Float

expect fun __tg_exp2(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_exp2(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_expm1(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_expm1(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_fabs(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_fabs(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_fdim(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_fdim(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_floor(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_floor(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_fma(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double, /*2*/ __z: kotlin.Double): kotlin.Double

expect fun __tg_fma(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float, /*2*/ __z: kotlin.Float): kotlin.Float

expect fun __tg_fmax(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_fmax(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_fmin(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_fmin(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_fmod(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_fmod(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_hypot(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_hypot(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_ilogb(/*0*/ __x: kotlin.Double): kotlin.Int

expect fun __tg_ilogb(/*0*/ __x: kotlin.Float): kotlin.Int

expect fun __tg_ldexp(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Int): kotlin.Double

expect fun __tg_ldexp(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Int): kotlin.Float

expect fun __tg_lgamma(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_lgamma(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_llrint(/*0*/ __x: kotlin.Double): kotlin.Long

expect fun __tg_llrint(/*0*/ __x: kotlin.Float): kotlin.Long

expect fun __tg_llround(/*0*/ __x: kotlin.Double): kotlin.Long

expect fun __tg_llround(/*0*/ __x: kotlin.Float): kotlin.Long

expect fun __tg_log(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_log(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_log(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun __tg_log(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun __tg_log10(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_log10(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_log1p(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_log1p(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_log2(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_log2(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_logb(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_logb(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_lrint(/*0*/ __x: kotlin.Double): kotlin.Long

expect fun __tg_lrint(/*0*/ __x: kotlin.Float): kotlin.Long

expect fun __tg_lround(/*0*/ __x: kotlin.Double): kotlin.Long

expect fun __tg_lround(/*0*/ __x: kotlin.Float): kotlin.Long

expect fun __tg_nearbyint(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_nearbyint(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_nextafter(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_nextafter(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_pow(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_pow(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_remainder(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Double): kotlin.Double

expect fun __tg_remainder(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Float): kotlin.Float

expect fun __tg_rint(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_rint(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_round(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_round(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_scalbln(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Long): kotlin.Double

expect fun __tg_scalbln(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Long): kotlin.Float

expect fun __tg_scalbn(/*0*/ __x: kotlin.Double, /*1*/ __y: kotlin.Int): kotlin.Double

expect fun __tg_scalbn(/*0*/ __x: kotlin.Float, /*1*/ __y: kotlin.Int): kotlin.Float

expect fun __tg_sin(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_sin(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_sinh(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_sinh(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_sinpi(/*0*/ x: kotlin.Double): kotlin.Double

expect fun __tg_sinpi(/*0*/ x: kotlin.Float): kotlin.Float

expect fun __tg_sqrt(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_sqrt(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_tan(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_tan(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_tanh(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_tanh(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_tanpi(/*0*/ x: kotlin.Double): kotlin.Double

expect fun __tg_tanpi(/*0*/ x: kotlin.Float): kotlin.Float

expect fun __tg_tgamma(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_tgamma(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tg_trunc(/*0*/ __x: kotlin.Double): kotlin.Double

expect fun __tg_trunc(/*0*/ __x: kotlin.Float): kotlin.Float

expect fun __tzcnt_u16(/*0*/ __X: kotlin.UShort): kotlin.UShort

expect fun __tzcnt_u32(/*0*/ __X: kotlin.UInt): kotlin.UInt

expect fun __tzcnt_u64(/*0*/ __X: kotlin.ULong): kotlin.ULong

expect fun _bit_scan_forward(/*0*/ __A: kotlin.Int): kotlin.Int

expect fun _bit_scan_reverse(/*0*/ __A: kotlin.Int): kotlin.Int

expect fun _dispatch_object_validate(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */)

expect fun _mm_clflush(/*0*/ __p: kotlinx.cinterop.CValuesRef<*>?)

expect fun _mm_free(/*0*/ __p: kotlinx.cinterop.CValuesRef<*>?)

expect fun _mm_getcsr(): kotlin.UInt

expect fun _mm_lfence()

expect fun _mm_mfence()

expect fun _mm_pause()

expect fun _mm_setcsr(/*0*/ __i: kotlin.UInt)

expect fun _mm_sfence()

expect fun _mm_tzcnt_32(/*0*/ __X: kotlin.UInt): kotlin.Int

expect fun _mm_tzcnt_64(/*0*/ __X: kotlin.ULong): kotlin.Long

expect fun _os_activity_label_useraction(/*0*/ dso: kotlinx.cinterop.CValuesRef<*>?, /*1*/ name: kotlin.String?)

expect fun _os_activity_set_breadcrumb(/*0*/ dso: kotlinx.cinterop.CValuesRef<*>?, /*1*/ name: kotlin.String?)

expect fun _os_log_create(/*0*/ dso: kotlinx.cinterop.CValuesRef<*>?, /*1*/ subsystem: kotlin.String?, /*2*/ category: kotlin.String?): platform.darwin.os_log_t? /* = platform.darwin.NSObject? */

expect fun _os_log_sensitive_deprecated()

expect fun _simd_angle(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlin.Double

expect fun _simd_angle(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlin.Float

expect fun _simd_intermediate(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ q2: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun _simd_intermediate(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ q2: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun _simd_sinc(/*0*/ x: kotlin.Double): kotlin.Double

expect fun _simd_sinc(/*0*/ x: kotlin.Float): kotlin.Float

expect fun _simd_slerp_internal(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ t: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun _simd_slerp_internal(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ t: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun _simd_squad(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ qa: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ qb: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*3*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*4*/ t: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun _simd_squad(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ qa: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ qb: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*3*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*4*/ t: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun aio_cancel(/*0*/ fd: kotlin.Int, /*1*/ aiocbp: kotlinx.cinterop.CValuesRef<platform.darwin.aiocb>?): kotlin.Int

expect fun aio_error(/*0*/ aiocbp: kotlinx.cinterop.CValuesRef<platform.darwin.aiocb>?): kotlin.Int

expect fun aio_fsync(/*0*/ op: kotlin.Int, /*1*/ aiocbp: kotlinx.cinterop.CValuesRef<platform.darwin.aiocb>?): kotlin.Int

expect fun aio_read(/*0*/ aiocbp: kotlinx.cinterop.CValuesRef<platform.darwin.aiocb>?): kotlin.Int

expect fun aio_write(/*0*/ aiocbp: kotlinx.cinterop.CValuesRef<platform.darwin.aiocb>?): kotlin.Int

expect fun ascii2addr(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun asl_close_auxiliary_file(/*0*/ descriptor: kotlin.Int): kotlin.Int

expect fun asl_log_message(/*0*/ level: kotlin.Int, /*1*/ format: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun at_encoder_get_block_counts(/*0*/ encoder: platform.darwin.at_encoder_t? /* = platform.darwin.NSObject? */, /*1*/ imageSize: kotlinx.cinterop.CValue<platform.darwin.at_size_t>): kotlinx.cinterop.CValue<platform.darwin.at_size_t>

expect fun at_encoder_get_block_dimensions(/*0*/ encoder: platform.darwin.at_encoder_t? /* = platform.darwin.NSObject? */): kotlinx.cinterop.CValue<platform.darwin.at_size_t>

expect fun audit(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun auditctl(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun auditon(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun cache_destroy(/*0*/ cache: kotlinx.cinterop.CValuesRef<platform.darwin.cache_t /* = cnames.structs.cache_s */>?): kotlin.Int

expect fun cache_key_is_equal_cb_cstring(/*0*/ key1: kotlinx.cinterop.CValuesRef<*>?, /*1*/ key2: kotlinx.cinterop.CValuesRef<*>?, /*2*/ unused: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean

expect fun cache_key_is_equal_cb_integer(/*0*/ key1: kotlinx.cinterop.CValuesRef<*>?, /*1*/ key2: kotlinx.cinterop.CValuesRef<*>?, /*2*/ unused: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean

expect fun cache_release_cb_free(/*0*/ key_or_value: kotlinx.cinterop.CValuesRef<*>?, /*1*/ unused: kotlinx.cinterop.CValuesRef<*>?)

expect fun cache_release_value(/*0*/ cache: kotlinx.cinterop.CValuesRef<platform.darwin.cache_t /* = cnames.structs.cache_s */>?, /*1*/ value: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun cache_remove(/*0*/ cache: kotlinx.cinterop.CValuesRef<platform.darwin.cache_t /* = cnames.structs.cache_s */>?, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun cache_remove_all(/*0*/ cache: kotlinx.cinterop.CValuesRef<platform.darwin.cache_t /* = cnames.structs.cache_s */>?): kotlin.Int

expect fun cache_value_make_nonpurgeable_cb(/*0*/ value: kotlinx.cinterop.CValuesRef<*>?, /*1*/ unused: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean

expect fun cache_value_make_purgeable_cb(/*0*/ value: kotlinx.cinterop.CValuesRef<*>?, /*1*/ unused: kotlinx.cinterop.CValuesRef<*>?)

expect fun dbm_clearerr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?): kotlin.Int

expect fun dbm_close(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?)

expect fun dbm_delete(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?, /*1*/ arg1: kotlinx.cinterop.CValue<platform.darwin.datum>): kotlin.Int

expect fun dbm_dirfno(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?): kotlin.Int

expect fun dbm_error(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?): kotlin.Int

expect fun dbm_fetch(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?, /*1*/ arg1: kotlinx.cinterop.CValue<platform.darwin.datum>): kotlinx.cinterop.CValue<platform.darwin.datum>

expect fun dbm_firstkey(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?): kotlinx.cinterop.CValue<platform.darwin.datum>

expect fun dbm_forder(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?, /*1*/ arg1: kotlinx.cinterop.CValue<platform.darwin.datum>): kotlin.Long

expect fun dbm_nextkey(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?): kotlinx.cinterop.CValue<platform.darwin.datum>

expect fun dbm_store(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.DBM>?, /*1*/ arg1: kotlinx.cinterop.CValue<platform.darwin.datum>, /*2*/ arg2: kotlinx.cinterop.CValue<platform.darwin.datum>, /*3*/ arg3: kotlin.Int): kotlin.Int

expect fun dbopen(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.Int, /*3*/ arg3: platform.darwin.DBTYPE, /*4*/ arg4: kotlinx.cinterop.CValuesRef<*>?): kotlinx.cinterop.CPointer<platform.darwin.DB /* = platform.darwin.__db */>?

expect fun dispatch_activate(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_assert_queue(/*0*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_assert_queue_barrier(/*0*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_assert_queue_not(/*0*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_data_create_concat(/*0*/ data1: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */, /*1*/ data2: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */): platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */

expect fun dispatch_debug(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */, /*1*/ message: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun dispatch_get_current_queue(): platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */

expect fun dispatch_get_global_queue(/*0*/ identifier: kotlin.Long, /*1*/ flags: kotlin.ULong): platform.darwin.dispatch_queue_global_t? /* = platform.darwin.NSObject? */

expect fun dispatch_get_main_queue(): platform.darwin.dispatch_queue_main_t? /* = platform.darwin.NSObject? */

expect fun dispatch_group_create(): platform.darwin.dispatch_group_t? /* = platform.darwin.NSObject? */

expect fun dispatch_group_enter(/*0*/ group: platform.darwin.dispatch_group_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_group_leave(/*0*/ group: platform.darwin.dispatch_group_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_main()

expect fun dispatch_queue_attr_make_initially_inactive(/*0*/ attr: platform.darwin.dispatch_queue_attr_t? /* = platform.darwin.NSObject? */): platform.darwin.dispatch_queue_attr_t? /* = platform.darwin.NSObject? */

expect fun dispatch_queue_create(/*0*/ label: kotlin.String?, /*1*/ attr: platform.darwin.dispatch_queue_attr_t? /* = platform.darwin.NSObject? */): platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */

expect fun dispatch_queue_create_with_target(/*0*/ label: kotlin.String?, /*1*/ attr: platform.darwin.dispatch_queue_attr_t? /* = platform.darwin.NSObject? */, /*2*/ target: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */): platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */

external expect fun dispatch_release(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_resume(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */)

external expect fun dispatch_retain(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_semaphore_create(/*0*/ value: kotlin.Long): platform.darwin.dispatch_semaphore_t? /* = platform.darwin.NSObject? */

expect fun dispatch_semaphore_signal(/*0*/ dsema: platform.darwin.dispatch_semaphore_t? /* = platform.darwin.NSObject? */): kotlin.Long

expect fun dispatch_set_context(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */, /*1*/ context: kotlinx.cinterop.CValuesRef<*>?)

expect fun dispatch_set_target_queue(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */, /*1*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_source_cancel(/*0*/ source: platform.darwin.dispatch_source_t? /* = platform.darwin.NSObject? */)

expect fun dispatch_source_get_data(/*0*/ source: platform.darwin.dispatch_source_t? /* = platform.darwin.NSObject? */): kotlin.ULong

expect fun dispatch_source_get_mask(/*0*/ source: platform.darwin.dispatch_source_t? /* = platform.darwin.NSObject? */): kotlin.ULong

expect fun dispatch_source_merge_data(/*0*/ source: platform.darwin.dispatch_source_t? /* = platform.darwin.NSObject? */, /*1*/ value: kotlin.ULong)

expect fun dispatch_source_testcancel(/*0*/ source: platform.darwin.dispatch_source_t? /* = platform.darwin.NSObject? */): kotlin.Long

expect fun dispatch_suspend(/*0*/ `object`: platform.darwin.dispatch_object_t? /* = platform.darwin.NSObject? */)

expect fun dns_free_question(/*0*/ q: kotlinx.cinterop.CValuesRef<platform.darwin.dns_question_t>?)

expect fun dns_free_reply(/*0*/ r: kotlinx.cinterop.CValuesRef<platform.darwin.dns_reply_t>?)

expect fun dns_free_resource_record(/*0*/ rr: kotlinx.cinterop.CValuesRef<platform.darwin.dns_resource_record_t>?)

expect fun dns_print_question(/*0*/ q: kotlinx.cinterop.CValuesRef<platform.darwin.dns_question_t>?, /*1*/ f: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?)

expect fun dns_print_resource_record(/*0*/ r: kotlinx.cinterop.CValuesRef<platform.darwin.dns_resource_record_t>?, /*1*/ f: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?)

expect fun endfsent()

expect fun endttyent(): kotlin.Int

expect fun endutxent()

expect fun endutxent_wtmp()

expect fun fmtmsg(/*0*/ arg0: kotlin.Long, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.String?, /*4*/ arg4: kotlin.String?, /*5*/ arg5: kotlin.String?): kotlin.Int

expect fun freeifaddrs(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.ifaddrs>?)

expect fun freeifmaddrs(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.ifmaddrs>?)

expect fun getaudit(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.auditinfo>?): kotlin.Int

expect fun getaudit_addr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.auditinfo_addr>?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun getfsent(): kotlinx.cinterop.CPointer<platform.darwin.fstab>?

expect fun getfsfile(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.darwin.fstab>?

expect fun getfsspec(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.darwin.fstab>?

expect fun getlastlogxbyname(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.darwin.lastlogx>?): kotlinx.cinterop.CPointer<platform.darwin.lastlogx>?

expect fun getttyent(): kotlinx.cinterop.CPointer<platform.darwin.ttyent>?

expect fun getttynam(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.darwin.ttyent>?

expect fun getutxent(): kotlinx.cinterop.CPointer<platform.darwin.utmpx>?

expect fun getutxent_wtmp(): kotlinx.cinterop.CPointer<platform.darwin.utmpx>?

expect fun getutxid(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.utmpx>?): kotlinx.cinterop.CPointer<platform.darwin.utmpx>?

expect fun getutxline(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.utmpx>?): kotlinx.cinterop.CPointer<platform.darwin.utmpx>?

expect fun globfree(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.glob_t>?)

expect fun inet_aton(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.in_addr>?): kotlin.Int

expect fun inet_pton(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun login_tty(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun logwtmp(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.String?)

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun matrix_multiply(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun matrix_scale(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun matrix_scale(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun mbr_string_to_sid(/*0*/ string: kotlin.String?, /*1*/ sid: kotlinx.cinterop.CValuesRef<platform.darwin.nt_sid_t>?): kotlin.Int

expect fun mpool_close(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.MPOOL>?): kotlin.Int

expect fun mpool_put(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.MPOOL>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?, /*2*/ arg2: kotlin.UInt): kotlin.Int

expect fun mpool_sync(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.MPOOL>?): kotlin.Int

expect fun notify_is_valid_token(/*0*/ `val`: kotlin.Int): kotlin.Boolean

expect fun os_log_create(/*0*/ subsystem: kotlin.String?, /*1*/ category: kotlin.String?): platform.darwin.os_log_t? /* = platform.darwin.NSObject? */

expect fun os_log_is_debug_enabled(/*0*/ log: platform.darwin.os_log_t? /* = platform.darwin.NSObject? */): kotlin.Boolean

expect fun os_log_is_enabled(/*0*/ log: platform.darwin.os_log_t? /* = platform.darwin.NSObject? */): kotlin.Boolean

external expect fun os_release(/*0*/ `object`: kotlinx.cinterop.CValuesRef<*>?)

expect fun os_trace_debug_enabled(): kotlin.Boolean

expect fun os_trace_info_enabled(): kotlin.Boolean

expect fun pututxline(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.utmpx>?): kotlinx.cinterop.CPointer<platform.darwin.utmpx>?

expect fun sel_isMapped(/*0*/ sel: kotlinx.cinterop.CValuesRef<*>?): kotlin.Boolean

expect fun setaudit(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.auditinfo>?): kotlin.Int

expect fun setaudit_addr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.auditinfo_addr>?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun setfsent(): kotlin.Int

expect fun setttyent(): kotlin.Int

expect fun setutxent()

expect fun setutxent_wtmp(/*0*/ arg0: kotlin.Int)

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_add(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_add(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_add(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_angle(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlin.Double

expect fun simd_angle(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlin.Float

expect fun simd_bezier(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ q2: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*3*/ q3: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*4*/ t: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_bezier(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ q2: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*3*/ q3: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*4*/ t: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_clamp(/*0*/ x: kotlin.Double, /*1*/ min: kotlin.Double, /*2*/ max: kotlin.Double): kotlin.Double

expect fun simd_clamp(/*0*/ x: kotlin.Float, /*1*/ min: kotlin.Float, /*2*/ max: kotlin.Float): kotlin.Float

expect fun simd_conjugate(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_conjugate(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_determinant(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlin.Double

expect fun simd_determinant(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlin.Double

expect fun simd_determinant(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlin.Double

expect fun simd_determinant(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlin.Float

expect fun simd_determinant(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlin.Float

expect fun simd_determinant(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlin.Float

expect fun simd_dot(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlin.Double

expect fun simd_dot(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlin.Float

expect fun simd_fast_recip(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_fast_recip(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_fast_rsqrt(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_fast_rsqrt(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_fract(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_fract(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_inverse(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_inverse(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_inverse(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_inverse(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_inverse(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_inverse(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_inverse(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_inverse(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_length(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlin.Double

expect fun simd_length(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlin.Float

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*2*/ __b: kotlin.Double, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_linear_combination(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*2*/ __b: kotlin.Float, /*3*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_matrix3x3(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_matrix3x3(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_matrix4x4(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_matrix4x4(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_max(/*0*/ x: kotlin.Double, /*1*/ y: kotlin.Double): kotlin.Double

expect fun simd_max(/*0*/ x: kotlin.Float, /*1*/ y: kotlin.Float): kotlin.Float

expect fun simd_min(/*0*/ x: kotlin.Double, /*1*/ y: kotlin.Double): kotlin.Double

expect fun simd_min(/*0*/ x: kotlin.Float, /*1*/ y: kotlin.Float): kotlin.Float

expect fun simd_mix(/*0*/ x: kotlin.Double, /*1*/ y: kotlin.Double, /*2*/ t: kotlin.Double): kotlin.Double

expect fun simd_mix(/*0*/ x: kotlin.Float, /*1*/ y: kotlin.Float, /*2*/ t: kotlin.Float): kotlin.Float

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_mul(/*0*/ __a: kotlin.Double, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_mul(/*0*/ a: kotlin.Double, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_mul(/*0*/ __a: kotlin.Float, /*1*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_mul(/*0*/ a: kotlin.Float, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_mul(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_mul(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ a: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_mul(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_mul(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ a: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_mul(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_muladd(/*0*/ x: kotlin.Double, /*1*/ y: kotlin.Double, /*2*/ z: kotlin.Double): kotlin.Double

expect fun simd_muladd(/*0*/ x: kotlin.Float, /*1*/ y: kotlin.Float, /*2*/ z: kotlin.Float): kotlin.Float

expect fun simd_negate(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_negate(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_normalize(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_normalize(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_precise_recip(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_precise_recip(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_precise_rsqrt(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_precise_rsqrt(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_quaternion(/*0*/ ix: kotlin.Double, /*1*/ iy: kotlin.Double, /*2*/ iz: kotlin.Double, /*3*/ r: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_quaternion(/*0*/ ix: kotlin.Float, /*1*/ iy: kotlin.Float, /*2*/ iz: kotlin.Float, /*3*/ r: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_quaternion(/*0*/ matrix: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_quaternion(/*0*/ matrix: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_quaternion(/*0*/ matrix: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_quaternion(/*0*/ matrix: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_real(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlin.Double

expect fun simd_real(/*0*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlin.Float

expect fun simd_recip(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_recip(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_rsqrt(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_rsqrt(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_sign(/*0*/ x: kotlin.Double): kotlin.Double

expect fun simd_sign(/*0*/ x: kotlin.Float): kotlin.Float

expect fun simd_slerp(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ t: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_slerp(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ t: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_slerp_longest(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ t: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_slerp_longest(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ t: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_smoothstep(/*0*/ edge0: kotlin.Double, /*1*/ edge1: kotlin.Double, /*2*/ x: kotlin.Double): kotlin.Double

expect fun simd_smoothstep(/*0*/ edge0: kotlin.Float, /*1*/ edge1: kotlin.Float, /*2*/ x: kotlin.Float): kotlin.Float

expect fun simd_spline(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*2*/ q2: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*3*/ q3: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*4*/ t: kotlin.Double): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_spline(/*0*/ q0: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q1: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*2*/ q2: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*3*/ q3: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*4*/ t: kotlin.Float): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_step(/*0*/ edge: kotlin.Double, /*1*/ x: kotlin.Double): kotlin.Double

expect fun simd_step(/*0*/ edge: kotlin.Float, /*1*/ x: kotlin.Float): kotlin.Float

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_sub(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>, /*1*/ __y: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun simd_sub(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatd>): kotlinx.cinterop.CValue<platform.darwin.simd_quatd>

expect fun simd_sub(/*0*/ p: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>, /*1*/ q: kotlinx.cinterop.CValue<platform.darwin.simd_quatf>): kotlinx.cinterop.CValue<platform.darwin.simd_quatf>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x2>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x3>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x3>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_double2x4>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_double3x4>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_double4x4>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x2>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x3>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x3>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x2>): kotlinx.cinterop.CValue<platform.darwin.simd_float2x4>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x3>): kotlinx.cinterop.CValue<platform.darwin.simd_float3x4>

expect fun simd_transpose(/*0*/ __x: kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>): kotlinx.cinterop.CValue<platform.darwin.simd_float4x4>

expect fun sl_free(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.StringList /* = platform.darwin._stringlist */>?, /*1*/ arg1: kotlin.Int)

expect fun sl_init(): kotlinx.cinterop.CPointer<platform.darwin.StringList /* = platform.darwin._stringlist */>?

expect fun ttyunlock(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun unw_get_proc_info(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.unw_cursor_t>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.darwin.unw_proc_info_t>?): kotlin.Int

expect fun unw_getcontext(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.unw_context_t>?): kotlin.Int

expect fun unw_init_local(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.unw_cursor_t>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.darwin.unw_context_t>?): kotlin.Int

expect fun unw_is_signal_frame(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.unw_cursor_t>?): kotlin.Int

expect fun unw_resume(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.unw_cursor_t>?): kotlin.Int

expect fun unw_step(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.darwin.unw_cursor_t>?): kotlin.Int

expect fun utmpxname(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun wtmpxname(/*0*/ arg0: kotlin.String?): kotlin.Int


