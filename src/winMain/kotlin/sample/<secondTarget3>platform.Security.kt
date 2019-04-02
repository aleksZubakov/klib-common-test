@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.Security

import kotlinx.cinterop.* 

actual interface OS_sec_certificateProtocol: platform.darwin.NSObjectProtocol {
}

actual interface OS_sec_certificateProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

actual interface OS_sec_identityProtocol: platform.darwin.NSObjectProtocol {
}

actual interface OS_sec_identityProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

actual interface OS_sec_objectProtocol: platform.darwin.NSObjectProtocol {
}

actual interface OS_sec_objectProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

actual interface OS_sec_protocol_metadataProtocol: platform.darwin.NSObjectProtocol {
}

actual interface OS_sec_protocol_metadataProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

actual interface OS_sec_protocol_optionsProtocol: platform.darwin.NSObjectProtocol {
}

actual interface OS_sec_protocol_optionsProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

actual interface OS_sec_trustProtocol: platform.darwin.NSObjectProtocol {
}

actual interface OS_sec_trustProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

final actual enum class SSLAuthenticate private constructor(/*0*/ value: kotlin.Int): kotlinx.cinterop.CEnum {
    kNeverAuthenticate(TODO()),

    kAlwaysAuthenticate(TODO()),

    kTryAuthenticate(TODO());

    actual open override /*1*/ val value: kotlin.Int
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLAuthenticate { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.Security.SSLAuthenticate
            get() = TODO()
            set(value: platform.Security.SSLAuthenticate) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual enum class SSLCiphersuiteGroup private constructor(/*0*/ value: kotlin.Int): kotlinx.cinterop.CEnum {
    kSSLCiphersuiteGroupDefault(TODO()),

    kSSLCiphersuiteGroupCompatibility(TODO()),

    kSSLCiphersuiteGroupLegacy(TODO()),

    kSSLCiphersuiteGroupATS(TODO()),

    kSSLCiphersuiteGroupATSCompatibility(TODO());

    actual open override /*1*/ val value: kotlin.Int
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLCiphersuiteGroup { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.Security.SSLCiphersuiteGroup
            get() = TODO()
            set(value: platform.Security.SSLCiphersuiteGroup) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual enum class SSLClientCertificateState private constructor(/*0*/ value: kotlin.Int): kotlinx.cinterop.CEnum {
    kSSLClientCertNone(TODO()),

    kSSLClientCertRequested(TODO()),

    kSSLClientCertSent(TODO()),

    kSSLClientCertRejected(TODO());

    actual open override /*1*/ val value: kotlin.Int
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLClientCertificateState { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.Security.SSLClientCertificateState
            get() = TODO()
            set(value: platform.Security.SSLClientCertificateState) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual enum class SSLConnectionType private constructor(/*0*/ value: kotlin.Int): kotlinx.cinterop.CEnum {
    kSSLStreamType(TODO()),

    kSSLDatagramType(TODO());

    actual open override /*1*/ val value: kotlin.Int
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLConnectionType { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.Security.SSLConnectionType
            get() = TODO()
            set(value: platform.Security.SSLConnectionType) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual enum class SSLProtocolSide private constructor(/*0*/ value: kotlin.Int): kotlinx.cinterop.CEnum {
    kSSLServerSide(TODO()),

    kSSLClientSide(TODO());

    actual open override /*1*/ val value: kotlin.Int
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLProtocolSide { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.Security.SSLProtocolSide
            get() = TODO()
            set(value: platform.Security.SSLProtocolSide) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual enum class SSLSessionState private constructor(/*0*/ value: kotlin.Int): kotlinx.cinterop.CEnum {
    kSSLIdle(TODO()),

    kSSLHandshake(TODO()),

    kSSLConnected(TODO()),

    kSSLClosed(TODO()),

    kSSLAborted(TODO());

    actual open override /*1*/ val value: kotlin.Int
        get() = TODO()

    actual companion object Companion {
        final actual fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLSessionState { TODO() }
    }

    final actual class Var public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CEnumVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
        actual final var value: platform.Security.SSLSessionState
            get() = TODO()
            set(value: platform.Security.SSLSessionState) = TODO()

        actual companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type(TODO() as kotlin.Int) {
        }
    }
}

final actual class SecKeychainAttribute public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var data: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
        get() = TODO()
        set(value: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) = TODO()

    final var length: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var tag: platform.Security.SecKeychainAttrType /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.Security.SecKeychainAttrType /* = kotlin.UInt */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class SecKeychainAttributeInfo public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    final var count: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    final var format: kotlinx.cinterop.CPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?) = TODO()

    final var tag: kotlinx.cinterop.CPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.darwin.UInt32Var /* = kotlinx.cinterop.UIntVarOf<platform.darwin.UInt32 /* = kotlin.UInt */> */>?) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

final actual class SecKeychainAttributeList public constructor(/*0*/ rawPtr: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.CStructVar(TODO() as kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) {
    actual final var attr: kotlinx.cinterop.CPointer<platform.Security.SecKeychainAttribute>?
        get() = TODO()
        set(value: kotlinx.cinterop.CPointer<platform.Security.SecKeychainAttribute>?) = TODO()

    final var count: platform.darwin.UInt32 /* = kotlin.UInt */
        get() = TODO()
        set(value: platform.darwin.UInt32 /* = kotlin.UInt */) = TODO()

    actual companion object Companion: kotlinx.cinterop.CStructVar.Type(TODO() as kotlin.Long, TODO() as kotlin.Int) {
    }
}

actual typealias SSLProtocol = kotlin.Int

actual typealias SSLSessionOption = kotlin.Int

actual typealias sec_certificate_t = platform.darwin.NSObject?

actual typealias sec_identity_t = platform.darwin.NSObject?

actual typealias sec_object_t = platform.darwin.NSObject?

actual typealias sec_protocol_metadata_t = platform.darwin.NSObject?

actual typealias sec_protocol_options_t = platform.darwin.NSObject?

actual typealias sec_trust_t = platform.darwin.NSObject?

actual fun sec_protocol_metadata_access_distinguished_names(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit): kotlin.Boolean { TODO() }

actual fun sec_protocol_metadata_access_ocsp_response(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit): kotlin.Boolean { TODO() }

actual fun sec_protocol_metadata_access_peer_certificate_chain(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.Security.sec_certificate_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit): kotlin.Boolean { TODO() }

actual fun sec_protocol_metadata_challenge_parameters_are_equal(/*0*/ metadataA: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ metadataB: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlin.Boolean { TODO() }

actual fun sec_protocol_metadata_copy_peer_public_key(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */ { TODO() }

actual fun sec_protocol_metadata_get_early_data_accepted(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlin.Boolean { TODO() }

actual fun sec_protocol_metadata_peers_are_equal(/*0*/ metadataA: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ metadataB: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlin.Boolean { TODO() }

actual fun sec_protocol_options_add_pre_shared_key(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ psk: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */, /*2*/ psk_identity: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */) { TODO() }

actual fun sec_protocol_options_add_tls_application_protocol(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ application_protocol: kotlin.String?) { TODO() }

actual fun sec_protocol_options_add_tls_ciphersuite_group(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ group: platform.Security.SSLCiphersuiteGroup) { TODO() }

actual fun sec_protocol_options_set_local_identity(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ identity: platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */) { TODO() }

actual fun sec_protocol_options_set_peer_authentication_required(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ peer_authentication_required: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_diffie_hellman_parameters(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ params: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */) { TODO() }

actual fun sec_protocol_options_set_tls_false_start_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ false_start_enabled: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_is_fallback_attempt(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ is_fallback_attempt: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_ocsp_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ ocsp_enabled: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_renegotiation_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ renegotiation_enabled: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_resumption_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ resumption_enabled: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_sct_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ sct_enabled: kotlin.Boolean) { TODO() }

actual fun sec_protocol_options_set_tls_server_name(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ server_name: kotlin.String?) { TODO() }

actual fun sec_protocol_options_set_tls_tickets_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ tickets_enabled: kotlin.Boolean) { TODO() }

typealias SSLCipherSuite = platform.posix.uint16_t

typealias SSLCipherSuiteVar = kotlinx.cinterop.UShortVarOf<platform.Security.SSLCipherSuite>

typealias SSLConnectionRef = kotlinx.cinterop.COpaquePointer

typealias SSLConnectionRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SSLConnectionRef>

typealias SSLContextRef = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>

typealias SSLContextRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SSLContextRef>

typealias SSLProtocolVar = kotlinx.cinterop.IntVarOf<platform.Security.SSLProtocol>

typealias SSLReadFunc = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.Security.SSLConnectionRef?, kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.CPointer<platform.posix.size_tVar>?) -> platform.darwin.OSStatus>>

typealias SSLReadFuncVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SSLReadFunc>

typealias SSLSessionOptionVar = kotlinx.cinterop.IntVarOf<platform.Security.SSLSessionOption>

typealias SSLWriteFunc = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.Security.SSLConnectionRef?, kotlinx.cinterop.COpaquePointer?, kotlinx.cinterop.CPointer<platform.posix.size_tVar>?) -> platform.darwin.OSStatus>>

typealias SSLWriteFuncVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SSLWriteFunc>

typealias SecACLRef = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>

typealias SecACLRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecACLRef>

typealias SecAccessControlCreateFlags = platform.CoreFoundation.CFOptionFlags

typealias SecAccessControlCreateFlagsVar = kotlinx.cinterop.ULongVarOf<platform.Security.SecAccessControlCreateFlags>

typealias SecAccessControlRef = kotlinx.cinterop.CPointer<cnames.structs.__SecAccessControl>

typealias SecAccessControlRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecAccessControlRef>

typealias SecAccessRef = kotlinx.cinterop.CPointer<cnames.structs.__SecAccess>

typealias SecAccessRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecAccessRef>

typealias SecCertificateRef = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>

typealias SecCertificateRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecCertificateRef>

typealias SecIdentityRef = kotlinx.cinterop.CPointer<cnames.structs.__SecIdentity>

typealias SecIdentityRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecIdentityRef>

typealias SecKeyAlgorithm = platform.CoreFoundation.CFStringRef

typealias SecKeyAlgorithmVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeyAlgorithm>

typealias SecKeyKeyExchangeParameter = platform.CoreFoundation.CFStringRef

typealias SecKeyKeyExchangeParameterVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeyKeyExchangeParameter>

typealias SecKeyOperationType = platform.CoreFoundation.CFIndex

typealias SecKeyOperationTypeVar = kotlinx.cinterop.LongVarOf<platform.Security.SecKeyOperationType>

typealias SecKeyRef = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>

typealias SecKeyRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeyRef>

typealias SecKeychainAttrType = platform.darwin.OSType

typealias SecKeychainAttrTypeVar = kotlinx.cinterop.UIntVarOf<platform.Security.SecKeychainAttrType>

typealias SecKeychainAttributePtr = kotlinx.cinterop.CPointer<platform.Security.SecKeychainAttribute>

typealias SecKeychainAttributePtrVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeychainAttributePtr>

typealias SecKeychainItemRef = kotlinx.cinterop.CPointer<cnames.structs.__SecKeychainItem>

typealias SecKeychainItemRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeychainItemRef>

typealias SecKeychainRef = kotlinx.cinterop.CPointer<cnames.structs.__SecKeychain>

typealias SecKeychainRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeychainRef>

typealias SecKeychainSearchRef = kotlinx.cinterop.CPointer<cnames.structs.__SecKeychainSearch>

typealias SecKeychainSearchRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeychainSearchRef>

typealias SecKeychainStatus = platform.darwin.UInt32

typealias SecKeychainStatusVar = kotlinx.cinterop.UIntVarOf<platform.Security.SecKeychainStatus>

typealias SecPadding = platform.posix.uint32_t

typealias SecPaddingVar = kotlinx.cinterop.UIntVarOf<platform.Security.SecPadding>

typealias SecPasswordRef = kotlinx.cinterop.CPointer<cnames.structs.__SecPassword>

typealias SecPasswordRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecPasswordRef>

typealias SecPolicyRef = kotlinx.cinterop.CPointer<cnames.structs.__SecPolicy>

typealias SecPolicyRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecPolicyRef>

typealias SecRandomRef = kotlinx.cinterop.CPointer<cnames.structs.__SecRandom>

typealias SecRandomRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecRandomRef>

typealias SecTrustCallback = ((platform.Security.SecTrustRef?, platform.Security.SecTrustResultType) -> kotlin.Unit)?

typealias SecTrustCallbackVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.SecTrustCallback>

typealias SecTrustRef = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>

typealias SecTrustRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecTrustRef>

typealias SecTrustResultType = platform.posix.uint32_t

typealias SecTrustResultTypeVar = kotlinx.cinterop.UIntVarOf<platform.Security.SecTrustResultType>

typealias SecTrustedApplicationRef = kotlinx.cinterop.CPointer<cnames.structs.__SecTrustedApplication>

typealias SecTrustedApplicationRefVar = kotlinx.cinterop.CPointerVarOf<platform.Security.SecTrustedApplicationRef>

typealias sec_certificate_tVar = kotlinx.cinterop.ObjCObjectVar<platform.Security.sec_certificate_t>

typealias sec_identity_tVar = kotlinx.cinterop.ObjCObjectVar<platform.Security.sec_identity_t>

typealias sec_object_tVar = kotlinx.cinterop.ObjCObjectVar<platform.Security.sec_object_t>

typealias sec_protocol_challenge_complete_t = ((platform.Security.sec_identity_t?) -> kotlin.Unit)?

typealias sec_protocol_challenge_complete_tVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.sec_protocol_challenge_complete_t>

typealias sec_protocol_challenge_t = ((platform.Security.sec_protocol_metadata_t?, platform.Security.sec_protocol_challenge_complete_t?) -> kotlin.Unit)?

typealias sec_protocol_challenge_tVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.sec_protocol_challenge_t>

typealias sec_protocol_key_update_complete_t = (() -> kotlin.Unit)?

typealias sec_protocol_key_update_complete_tVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.sec_protocol_key_update_complete_t>

typealias sec_protocol_key_update_t = ((platform.Security.sec_protocol_metadata_t?, platform.Security.sec_protocol_key_update_complete_t?) -> kotlin.Unit)?

typealias sec_protocol_key_update_tVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.sec_protocol_key_update_t>

typealias sec_protocol_metadata_tVar = kotlinx.cinterop.ObjCObjectVar<platform.Security.sec_protocol_metadata_t>

typealias sec_protocol_options_tVar = kotlinx.cinterop.ObjCObjectVar<platform.Security.sec_protocol_options_t>

typealias sec_protocol_verify_complete_t = ((kotlin.Boolean) -> kotlin.Unit)?

typealias sec_protocol_verify_complete_tVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.sec_protocol_verify_complete_t>

typealias sec_protocol_verify_t = ((platform.Security.sec_protocol_metadata_t?, platform.Security.sec_trust_t?, platform.Security.sec_protocol_verify_complete_t?) -> kotlin.Unit)?

typealias sec_protocol_verify_tVar = kotlinx.cinterop.ObjCBlockVar<platform.Security.sec_protocol_verify_t>

typealias sec_trust_tVar = kotlinx.cinterop.ObjCObjectVar<platform.Security.sec_trust_t>

const val SEC_OS_IPHONE: kotlin.Int = 0

const val SEC_OS_OSX: kotlin.Int = 0

const val SEC_OS_OSX_INCLUDES: kotlin.Int = 0

val SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DHE_DSS_WITH_DES_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DHE_RSA_WITH_DES_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_DSS_EXPORT_WITH_DES40_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_DSS_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_DSS_WITH_DES_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_RSA_EXPORT_WITH_DES40_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_RSA_WITH_DES_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_anon_EXPORT_WITH_RC4_40_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_anon_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_anon_WITH_DES_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_DH_anon_WITH_RC4_128_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_FORTEZZA_DMS_WITH_FORTEZZA_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_FORTEZZA_DMS_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_NO_SUCH_CIPHERSUITE: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_NULL_WITH_NULL_NULL: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_EXPORT_WITH_DES40_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_EXPORT_WITH_RC4_40_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_3DES_EDE_CBC_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_DES_CBC_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_DES_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_IDEA_CBC_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_IDEA_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_NULL_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_RC2_CBC_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_RC4_128_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val SSL_RSA_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_AES_128_CCM_8_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_AES_128_CCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_CHACHA20_POLY1305_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_AES_256_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_DSS_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_NULL_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_NULL_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_PSK_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_AES_256_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DHE_RSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_AES_256_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_DSS_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_AES_256_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_RSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_AES_256_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_DH_anon_WITH_RC4_128_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_ECDSA_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDHE_RSA_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_ECDSA_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_RSA_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_anon_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_anon_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_anon_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_ECDH_anon_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_EMPTY_RENEGOTIATION_INFO_SCSV: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_NULL_WITH_NULL_NULL: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_NULL_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_NULL_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_PSK_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_AES_256_CBC_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_NULL_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_NULL_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_PSK_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_3DES_EDE_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_AES_128_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_AES_128_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_AES_128_GCM_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_AES_256_CBC_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_AES_256_CBC_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_AES_256_GCM_SHA384: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_NULL_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_NULL_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_NULL_SHA256: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_RC4_128_MD5: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val TLS_RSA_WITH_RC4_128_SHA: platform.Security.SSLCipherSuite /* = kotlin.UShort */
    get() = TODO()

val errSSLBadCert: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLBadCertificateStatusResponse: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLBadCipherSuite: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLBadConfiguration: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLBadRecordMac: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLBufferOverflow: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLCertExpired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLCertNotYetValid: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLCertificateRequired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

const val errSSLClientAuthCompleted: platform.darwin.OSStatus /* = kotlin.Int */ = 0

val errSSLClientCertRequested: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLClientHelloReceived: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLClosedAbort: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLClosedGraceful: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLClosedNoNotify: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLConfigurationFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLConnectionRefused: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLCrypto: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLDecodeError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLDecompressFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLDecryptionFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLFatalAlert: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLHandshakeFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLHostNameMismatch: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLIllegalParam: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLInappropriateFallback: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLInternal: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

const val errSSLLast: platform.darwin.OSStatus /* = kotlin.Int */ = 0

val errSSLMissingExtension: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLModuleAttach: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLNegotiation: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLNetworkTimeout: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLNoRootCert: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerAccessDenied: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerAuthCompleted: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerBadCert: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerBadRecordMac: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerCertExpired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerCertRevoked: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerCertUnknown: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerDecodeError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerDecompressFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerDecryptError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerDecryptionFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerExportRestriction: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerHandshakeFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerInsufficientSecurity: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerInternalError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerNoRenegotiation: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerProtocolVersion: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerRecordOverflow: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerUnexpectedMsg: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerUnknownCA: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerUnsupportedCert: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLPeerUserCancelled: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLProtocol: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLRecordOverflow: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

const val errSSLServerAuthCompleted: platform.darwin.OSStatus /* = kotlin.Int */ = 0

val errSSLSessionNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLTransportReset: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLUnexpectedMessage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLUnexpectedRecord: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLUnknownPSKIdentity: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLUnknownRootCert: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLUnrecognizedName: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLUnsupportedExtension: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLWeakPeerEphemeralDHKey: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLWouldBlock: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSSLXCertChainInvalid: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecACLAddFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecACLChangeFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecACLDeleteFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecACLNotSimple: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecACLReplaceFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAddinLoadFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAddinUnloadFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAlgorithmMismatch: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAllocate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAlreadyLoggedIn: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAppleAddAppACLSubject: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAppleInvalidKeyEndDate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAppleInvalidKeyStartDate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecApplePublicKeyIncomplete: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAppleSSLv2Rollback: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAppleSignatureMismatch: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAttachHandleBusy: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAttributeNotInContext: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecAuthFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecBadReq: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecBlockSizeMismatch: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecBufferTooSmall: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLAlreadySigned: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLBadURI: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLExpired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLNotTrusted: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLNotValidYet: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLPolicyFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCRLServerDown: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCallbackFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCertificateCannotOperate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCertificateExpired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCertificateNotValidYet: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCertificateRevoked: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCertificateSuspended: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCodeSigningBadCertChainLength: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCodeSigningBadPathLengthConstraint: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCodeSigningDevelopment: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCodeSigningNoBasicConstraints: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCodeSigningNoExtendedKeyUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecConversionError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCoreFoundationUnknown: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecCreateChainFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDataNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDataNotModifiable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDataTooLarge: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDatabaseLocked: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDatastoreIsOpen: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDecode: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDeviceError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDeviceFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDeviceReset: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDeviceVerifyFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDiskFull: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDskFull: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDuplicateCallback: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDuplicateItem: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecDuplicateKeychain: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecEMMLoadFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecEMMUnloadFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecEndOfData: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecEventNotificationCallbackNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecExtendedKeyUsageNotCritical: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecFieldSpecifiedMultiple: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecFileTooBig: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecFunctionFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecFunctionIntegrityFail: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecHostNameMismatch: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIDPFailure: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIO: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInDarkWake: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIncompatibleDatabaseBlob: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIncompatibleFieldFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIncompatibleKeyBlob: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIncompatibleVersion: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecIncompleteCertRevocationCheck: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInputLengthError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInsufficientClientID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInsufficientCredentials: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInteractionNotAllowed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInteractionRequired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInternalComponent: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInternalError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvaldCRLAuthority: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidACL: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAccessCredentials: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAccessRequest: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAction: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAddinFunctionTable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAlgorithm: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAlgorithmParms: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeAccessCredentials: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeBase: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeBlockSize: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeDLDBHandle: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeEffectiveBits: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeEndDate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeInitVector: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeIterationCount: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeKey: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeKeyLength: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeKeyType: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeLabel: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeMode: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeOutputSize: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributePadding: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributePassphrase: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributePrime: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributePrivateKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributePublicKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeRandom: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeRounds: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeSalt: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeSeed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeStartDate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeSubprime: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeSymmetricKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeVersion: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAttributeWrappedKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAuthority: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidAuthorityKeyID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidBaseACLs: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidBundleInfo: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCRL: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCRLEncoding: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCRLGroup: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCRLIndex: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCRLType: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCallback: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCertAuthority: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCertificateGroup: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidCertificateRef: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidContext: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidDBList: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidDBLocation: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidData: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidDatabaseBlob: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidDigestAlgorithm: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidEncoding: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidExtendedKeyUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidFormType: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidGUID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidHandle: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidHandleUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidIDLinkage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidIdentifier: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidIndex: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidIndexInfo: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidInputVector: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidItemRef: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyAttributeMask: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyBlob: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyHierarchy: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyLabel: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyRef: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyUsageForPolicy: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeyUsageMask: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidKeychain: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidLoginName: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidModifyMode: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidName: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidNetworkAddress: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidNewOwner: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidNumberOfFields: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidOutputVector: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidOwnerEdit: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidPVC: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidParsingModule: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidPassthroughID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidPasswordRef: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidPointer: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidPolicyIdentifiers: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidPrefsDomain: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidQuery: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidReason: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidRecord: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidRequestInputs: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidRequestor: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidResponseVector: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidRoot: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidSampleValue: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidScope: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidSearchRef: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidServiceMask: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidSignature: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidStopOnPolicy: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidSubServiceID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidSubjectKeyID: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidSubjectName: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidTimeString: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidTrustSetting: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidTrustSettings: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidTuple: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidTupleCredendtials: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidTupleGroup: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidValidityPeriod: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecInvalidValue: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecItemNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecKeyBlobTypeIncorrect: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecKeyHeaderInconsistent: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecKeyIsSensitive: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecKeySizeNotAllowed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecKeyUsageIncorrect: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecLibraryReferenceNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMDSError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMemoryError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAlgorithmParms: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeAccessCredentials: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeBase: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeBlockSize: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeDLDBHandle: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeEffectiveBits: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeEndDate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeInitVector: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeIterationCount: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeKey: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeKeyLength: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeKeyType: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeLabel: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeMode: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeOutputSize: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributePadding: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributePassphrase: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributePrime: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributePrivateKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributePublicKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeRandom: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeRounds: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeSalt: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeSeed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeStartDate: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeSubprime: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeSymmetricKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeVersion: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingAttributeWrappedKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingEntitlement: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingRequiredExtension: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMissingValue: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeCSRVerifyFailure: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeFailedConsistencyCheck: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeNoRequestPending: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeRequestAlreadyPending: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeRequestQueued: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeRequestRedirected: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeServerAlreadyExists: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeServerError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeServerNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMobileMeServerServiceErr: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecModuleManagerInitializeFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecModuleManagerNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecModuleManifestVerifyFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecModuleNotLoaded: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMultiplePrivKeys: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecMultipleValuesUnsupported: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNetworkFailure: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoAccessForItem: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoBasicConstraints: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoBasicConstraintsCA: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoCertificateModule: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoDefaultAuthority: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoDefaultKeychain: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoFieldValues: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoPolicyModule: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoStorageModule: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoSuchAttr: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoSuchClass: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoSuchKeychain: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNoTrustSettings: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNotInitialized: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNotLoggedIn: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNotSigner: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecNotTrusted: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPBadRequest: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPBadResponse: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPNoSigner: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPNotTrustedToAnchor: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPResponderInternalError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPResponderMalformedReq: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPResponderSignatureRequired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPResponderTryLater: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPResponderUnauthorized: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPResponseNonceMismatch: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPSignatureError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPStatusUnrecognized: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOCSPUnavailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOpWr: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecOutputLengthError: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPVCAlreadyConfigured: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPVCReferentNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecParam: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPassphraseRequired: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPathLengthConstraintExceeded: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPkcs12VerifyFailure: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPolicyNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPrivilegeNotGranted: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPrivilegeNotSupported: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecPublicKeyInconsistent: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecQuerySizeUnknown: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecQuotaExceeded: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecReadOnly: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecReadOnlyAttr: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecRecordModified: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecRejectedForm: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecRequestDescriptor: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecRequestLost: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecRequestRejected: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecResourceSignBadCertChainLength: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecResourceSignBadExtKeyUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSMIMEBadExtendedKeyUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSMIMEBadKeyUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSMIMEEmailAddressesNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSMIMEKeyUsageNotCritical: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSMIMENoEmailAddress: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSMIMESubjAltNameNotCritical: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSSLBadExtendedKeyUsage: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSelfCheckFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecServiceNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSigningTimeMissing: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecStagedOperationInProgress: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecStagedOperationNotStarted: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecSuccess: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTagNotFound: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampAddInfoNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampBadAlg: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampBadDataFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampBadRequest: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampInvalid: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampMissing: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampNotTrusted: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampRejection: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampRevocationNotification: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampRevocationWarning: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampServiceNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampSystemFailure: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampTimeNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampUnacceptedExtension: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampUnacceptedPolicy: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTimestampWaiting: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTrustNotAvailable: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecTrustSettingDeny: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnimplemented: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnknownCRLExtension: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnknownCertExtension: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnknownCriticalExtensionFlag: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnknownFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnknownQualifiedCertStatement: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnknownTag: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedAddressType: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedFieldFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedIndexInfo: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedKeyAttributeMask: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedKeyFormat: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedKeyLabel: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedKeySize: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedKeyUsageMask: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedLocality: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedNumAttributes: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedNumIndexes: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedNumRecordTypes: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedNumSelectionPreds: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedOperator: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedQueryLimits: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedService: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUnsupportedVectorOfBuffers: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecUserCanceled: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecVerificationFailure: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecVerifyActionFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecVerifyFailed: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecWrPerm: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val errSecWrongSecVersion: platform.darwin.OSStatus /* = kotlin.Int */
    get() = TODO()

val kDTLSProtocol1: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kSSLProtocol2: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kSSLProtocol3: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kSSLProtocol3Only: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kSSLProtocolAll: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kSSLProtocolUnknown: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kSSLSessionConfig_3DES_fallback: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_ATSv1: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_ATSv1_noPFS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_RC4_fallback: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_TLSv1_3DES_fallback: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_TLSv1_RC4_fallback: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_TLSv1_fallback: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_anonymous: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_default: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_legacy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_legacy_DHE: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionConfig_standard: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSSLSessionOptionAllowRenegotiation: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionAllowServerIdentityChange: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionBreakOnCertRequested: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionBreakOnClientAuth: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionBreakOnClientHello: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionBreakOnServerAuth: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionEnableSessionTickets: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionFallback: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionFalseStart: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSSLSessionOptionSendOneByteRecord: platform.Security.SSLSessionOption /* = kotlin.Int */
    get() = TODO()

val kSecAccessControlAnd: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlApplicationPassword: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlBiometryAny: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlBiometryCurrentSet: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlDevicePasscode: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlOr: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlPrivateKeyUsage: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlTouchIDAny: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlTouchIDCurrentSet: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAccessControlUserPresence: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */
    get() = TODO()

val kSecAttrAccess: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessControl: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessGroup: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessGroupToken: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessible: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleAfterFirstUnlock: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleAlways: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleAlwaysThisDeviceOnly: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleWhenPasscodeSetThisDeviceOnly: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleWhenUnlocked: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccessibleWhenUnlockedThisDeviceOnly: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAccount: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrApplicationLabel: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrApplicationTag: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeDPA: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeDefault: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeHTMLForm: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeHTTPBasic: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeHTTPDigest: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeMSN: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeNTLM: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrAuthenticationTypeRPA: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanDecrypt: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanDerive: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanEncrypt: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanSign: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanUnwrap: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanVerify: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCanWrap: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCertificateEncoding: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCertificateType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrComment: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCreationDate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrCreator: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrDescription: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrEffectiveKeySize: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrGeneric: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrIsExtractable: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrIsInvisible: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrIsNegative: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrIsPermanent: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrIsSensitive: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrIssuer: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyClass: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyClassPrivate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyClassPublic: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyClassSymmetric: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeySizeInBits: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyType3DES: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeAES: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeCAST: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeDES: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeDSA: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeEC: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeECDSA: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeECSECPrimeRandom: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeRC2: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeRC4: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrKeyTypeRSA: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrLabel: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrModificationDate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPRF: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPRFHmacAlgSHA1: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPRFHmacAlgSHA224: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPRFHmacAlgSHA256: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPRFHmacAlgSHA384: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPRFHmacAlgSHA512: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPath: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPersistantReference: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPersistentReference: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPort: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocol: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolAFP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolAppleTalk: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolDAAP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolEPPC: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolFTP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolFTPAccount: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolFTPProxy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolFTPS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolHTTP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolHTTPProxy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolHTTPS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolHTTPSProxy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolIMAP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolIMAPS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolIPP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolIRC: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolIRCS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolLDAP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolLDAPS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolNNTP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolNNTPS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolPOP3: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolPOP3S: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolRTSP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolRTSPProxy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolSMB: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolSMTP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolSOCKS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolSSH: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolTelnet: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrProtocolTelnetS: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrPublicKeyHash: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrRounds: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSalt: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSecurityDomain: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSerialNumber: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrServer: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrService: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSubject: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSubjectKeyID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSyncViewHint: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSynchronizable: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrSynchronizableAny: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrTokenID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrTokenIDSecureEnclave: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecAttrType: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecClass: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecClassCertificate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecClassGenericPassword: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecClassIdentity: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecClassInternetPassword: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecClassKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportExportAccess: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportExportKeychain: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportExportPassphrase: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportItemCertChain: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportItemIdentity: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportItemKeyID: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportItemLabel: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecImportItemTrust: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeCofactor: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeCofactorX963SHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeStandard: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDHKeyExchangeStandardX963SHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureDigestX962: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureDigestX962SHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureDigestX962SHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureDigestX962SHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureDigestX962SHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureDigestX962SHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureMessageX962SHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureMessageX962SHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureMessageX962SHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureMessageX962SHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureMessageX962SHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECDSASignatureRFC4754: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA224AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA256AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA384AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorVariableIVX963SHA512AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorX963SHA1AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorX963SHA224AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorX963SHA256AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorX963SHA384AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionCofactorX963SHA512AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA224AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA256AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA384AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardVariableIVX963SHA512AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardX963SHA1AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardX963SHA224AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardX963SHA256AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardX963SHA384AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmECIESEncryptionStandardX963SHA512AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA1AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA224AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA256AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA384AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionOAEPSHA512AESGCM: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionPKCS1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSAEncryptionRaw: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPKCS1v15Raw: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPKCS1v15SHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPSSSHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPSSSHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPSSSHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPSSSHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureDigestPSSSHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePKCS1v15SHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePSSSHA1: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePSSSHA224: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePSSSHA256: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePSSSHA384: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureMessagePSSSHA512: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyAlgorithmRSASignatureRaw: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyKeyExchangeParameterRequestedSize: platform.Security.SecKeyKeyExchangeParameter? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyKeyExchangeParameterSharedInfo: platform.Security.SecKeyKeyExchangeParameter? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecKeyOperationTypeDecrypt: platform.Security.SecKeyOperationType /* = kotlin.Long */
    get() = TODO()

val kSecKeyOperationTypeEncrypt: platform.Security.SecKeyOperationType /* = kotlin.Long */
    get() = TODO()

val kSecKeyOperationTypeKeyExchange: platform.Security.SecKeyOperationType /* = kotlin.Long */
    get() = TODO()

val kSecKeyOperationTypeSign: platform.Security.SecKeyOperationType /* = kotlin.Long */
    get() = TODO()

val kSecKeyOperationTypeVerify: platform.Security.SecKeyOperationType /* = kotlin.Long */
    get() = TODO()

val kSecMatchCaseInsensitive: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchDiacriticInsensitive: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchEmailAddressIfPresent: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchIssuers: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchItemList: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchLimit: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchLimitAll: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchLimitOne: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchPolicy: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchSearchList: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchSubjectContains: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchSubjectEndsWith: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchSubjectStartsWith: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchSubjectWholeString: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchTrustedOnly: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchValidOnDate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecMatchWidthInsensitive: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPaddingNone: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingOAEP: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1MD2: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1MD5: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1SHA1: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1SHA224: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1SHA256: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1SHA384: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingPKCS1SHA512: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPaddingSigRaw: platform.Security.SecPadding /* = kotlin.UInt */
    get() = TODO()

val kSecPolicyAppleCodeSigning: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleEAP: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleIDValidation: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleIPsec: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyApplePKINITClient: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyApplePKINITServer: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyApplePassbookSigning: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyApplePayIssuerEncryption: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleRevocation: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleSMIME: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleSSL: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleTimeStamping: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyAppleX509Basic: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyClient: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyMacAppStoreReceipt: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyOid: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyRevocationFlags: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPolicyTeamIdentifier: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPrivateKeyAttrs: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPropertyTypeError: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPropertyTypeTitle: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecPublicKeyAttrs: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecRandomDefault: platform.Security.SecRandomRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecRandom>? */
    get() = TODO()

val kSecReturnAttributes: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecReturnData: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecReturnPersistentRef: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecReturnRef: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecRevocationCRLMethod: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kSecRevocationNetworkAccessDisabled: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kSecRevocationOCSPMethod: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kSecRevocationPreferCRL: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kSecRevocationRequirePositiveResponse: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kSecRevocationUseAnyAvailableMethod: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */
    get() = TODO()

val kSecSharedPassword: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustCertificateTransparency: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustCertificateTransparencyWhiteList: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustEvaluationDate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustExtendedValidation: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustOrganizationName: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustResultConfirm: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultDeny: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultFatalTrustFailure: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultInvalid: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultOtherError: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultProceed: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultRecoverableTrustFailure: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultUnspecified: platform.Security.SecTrustResultType /* = kotlin.UInt */
    get() = TODO()

val kSecTrustResultValue: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustRevocationChecked: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecTrustRevocationValidUntilDate: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseAuthenticationContext: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseAuthenticationUI: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseAuthenticationUIAllow: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseAuthenticationUIFail: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseAuthenticationUISkip: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseItemList: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseKeychain: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseNoAuthenticationUI: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecUseOperationPrompt: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecValueData: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecValuePersistentRef: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kSecValueRef: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kTLSProtocol1: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kTLSProtocol11: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kTLSProtocol12: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kTLSProtocol13: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kTLSProtocol1Only: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

val kTLSProtocolMaxSupported: platform.Security.SSLProtocol /* = kotlin.Int */
    get() = TODO()

fun SSLAddDistinguishedName(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ derDN: kotlinx.cinterop.CValuesRef<*>?, /*2*/ derDNLen: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLClose(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLContextGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SSLCopyALPNProtocols(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ protocols: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLCopyDistinguishedNames(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ names: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLCopyPeerTrust(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ trust: kotlinx.cinterop.CValuesRef<platform.Security.SecTrustRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SecTrustRef /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLCopyRequestedPeerName(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerName: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, /*2*/ peerNameLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLCopyRequestedPeerNameLength(/*0*/ ctx: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerNameLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLCreateContext(/*0*/ alloc: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ protocolSide: platform.Security.SSLProtocolSide, /*2*/ connectionType: platform.Security.SSLConnectionType): platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */ { TODO() }

fun SSLGetBufferedReadSize(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ bufSize: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetClientCertificateState(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ clientState: kotlinx.cinterop.CValuesRef<platform.Security.SSLClientCertificateState.Var>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetConnection(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ connection: kotlinx.cinterop.CValuesRef<platform.Security.SSLConnectionRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SSLConnectionRef /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetDatagramWriteSize(/*0*/ dtlsContext: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ bufSize: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetEnabledCiphers(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ ciphers: kotlinx.cinterop.CValuesRef<platform.Security.SSLCipherSuiteVar /* = kotlinx.cinterop.UShortVarOf<platform.Security.SSLCipherSuite /* = kotlin.UShort */> */>?, /*2*/ numCiphers: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetMaxDatagramRecordSize(/*0*/ dtlsContext: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ maxSize: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetNegotiatedCipher(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ cipherSuite: kotlinx.cinterop.CValuesRef<platform.Security.SSLCipherSuiteVar /* = kotlinx.cinterop.UShortVarOf<platform.Security.SSLCipherSuite /* = kotlin.UShort */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetNegotiatedProtocolVersion(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ protocol: kotlinx.cinterop.CValuesRef<platform.Security.SSLProtocolVar /* = kotlinx.cinterop.IntVarOf<platform.Security.SSLProtocol /* = kotlin.Int */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetNumberEnabledCiphers(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ numCiphers: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetNumberSupportedCiphers(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ numCiphers: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetPeerDomainName(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerName: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>?, /*2*/ peerNameLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetPeerDomainNameLength(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerNameLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetPeerID(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerID: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.COpaquePointerVar /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.COpaquePointer /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?, /*2*/ peerIDLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetProtocolVersionMax(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ maxVersion: kotlinx.cinterop.CValuesRef<platform.Security.SSLProtocolVar /* = kotlinx.cinterop.IntVarOf<platform.Security.SSLProtocol /* = kotlin.Int */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetProtocolVersionMin(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ minVersion: kotlinx.cinterop.CValuesRef<platform.Security.SSLProtocolVar /* = kotlinx.cinterop.IntVarOf<platform.Security.SSLProtocol /* = kotlin.Int */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetSessionOption(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ option: platform.Security.SSLSessionOption /* = kotlin.Int */, /*2*/ value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetSessionState(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ state: kotlinx.cinterop.CValuesRef<platform.Security.SSLSessionState.Var>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLGetSupportedCiphers(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ ciphers: kotlinx.cinterop.CValuesRef<platform.Security.SSLCipherSuiteVar /* = kotlinx.cinterop.UShortVarOf<platform.Security.SSLCipherSuite /* = kotlin.UShort */> */>?, /*2*/ numCiphers: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLHandshake(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLReHandshake(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLRead(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ data: kotlinx.cinterop.CValuesRef<*>?, /*2*/ dataLength: platform.posix.size_t /* = kotlin.ULong */, /*3*/ processed: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetALPNProtocols(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ protocols: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetCertificate(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ certRefs: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetClientSideAuthenticate(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ auth: platform.Security.SSLAuthenticate): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetConnection(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ connection: platform.Security.SSLConnectionRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetDatagramHelloCookie(/*0*/ dtlsContext: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ cookie: kotlinx.cinterop.CValuesRef<*>?, /*2*/ cookieLen: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetEnabledCiphers(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ ciphers: kotlinx.cinterop.CValuesRef<platform.Security.SSLCipherSuiteVar /* = kotlinx.cinterop.UShortVarOf<platform.Security.SSLCipherSuite /* = kotlin.UShort */> */>?, /*2*/ numCiphers: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetEncryptionCertificate(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ certRefs: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetError(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ status: platform.darwin.OSStatus /* = kotlin.Int */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetIOFuncs(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ readFunc: platform.Security.SSLReadFunc? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.Security.SSLConnectionRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CPointer<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?) -> platform.darwin.OSStatus /* = kotlin.Int */>>? */, /*2*/ writeFunc: platform.Security.SSLWriteFunc? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.Security.SSLConnectionRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, kotlinx.cinterop.CPointer<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?) -> platform.darwin.OSStatus /* = kotlin.Int */>>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetMaxDatagramRecordSize(/*0*/ dtlsContext: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ maxSize: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetOCSPResponse(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ response: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetPeerDomainName(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerName: kotlin.String?, /*2*/ peerNameLen: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetPeerID(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ peerID: kotlinx.cinterop.CValuesRef<*>?, /*2*/ peerIDLen: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetProtocolVersionMax(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ maxVersion: platform.Security.SSLProtocol /* = kotlin.Int */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetProtocolVersionMin(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ minVersion: platform.Security.SSLProtocol /* = kotlin.Int */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetSessionConfig(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ config: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetSessionOption(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ option: platform.Security.SSLSessionOption /* = kotlin.Int */, /*2*/ value: kotlin.Boolean): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLSetSessionTicketsEnabled(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ enabled: kotlin.Boolean): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SSLWrite(/*0*/ context: platform.Security.SSLContextRef? /* = kotlinx.cinterop.CPointer<cnames.structs.SSLContext>? */, /*1*/ data: kotlinx.cinterop.CValuesRef<*>?, /*2*/ dataLength: platform.posix.size_t /* = kotlin.ULong */, /*3*/ processed: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecAccessControlCreateWithFlags(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ protection: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ flags: platform.Security.SecAccessControlCreateFlags /* = kotlin.ULong */, /*3*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.Security.SecAccessControlRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecAccessControl>? */ { TODO() }

fun SecAccessControlGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SecAddSharedWebCredential(/*0*/ fqdn: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ account: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ password: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*3*/ completionHandler: (platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */) -> kotlin.Unit) { TODO() }

fun SecCertificateCopyCommonName(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */, /*1*/ commonName: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecCertificateCopyData(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecCertificateCopyEmailAddresses(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */, /*1*/ emailAddresses: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecCertificateCopyKey(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */ { TODO() }

fun SecCertificateCopyNormalizedIssuerSequence(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecCertificateCopyNormalizedSubjectSequence(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecCertificateCopyPublicKey(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */ { TODO() }

fun SecCertificateCopySerialNumber(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecCertificateCopySerialNumberData(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecCertificateCopySubjectSummary(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun SecCertificateCreateWithData(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */ { TODO() }

fun SecCertificateGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SecCopyErrorMessageString(/*0*/ status: platform.darwin.OSStatus /* = kotlin.Int */, /*1*/ reserved: kotlinx.cinterop.CValuesRef<*>?): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun SecCreateSharedWebCredentialPassword(): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun SecIdentityCopyCertificate(/*0*/ identityRef: platform.Security.SecIdentityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecIdentity>? */, /*1*/ certificateRef: kotlinx.cinterop.CValuesRef<platform.Security.SecCertificateRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SecCertificateRef /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecIdentityCopyPrivateKey(/*0*/ identityRef: platform.Security.SecIdentityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecIdentity>? */, /*1*/ privateKeyRef: kotlinx.cinterop.CValuesRef<platform.Security.SecKeyRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeyRef /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecIdentityGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SecItemAdd(/*0*/ attributes: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ result: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTypeRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTypeRef /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecItemCopyMatching(/*0*/ query: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ result: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFTypeRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFTypeRef /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecItemDelete(/*0*/ query: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecItemUpdate(/*0*/ query: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ attributesToUpdate: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecKeyCopyAttributes(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun SecKeyCopyExternalRepresentation(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecKeyCopyKeyExchangeResult(/*0*/ privateKey: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ algorithm: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ publicKey: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*3*/ parameters: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*4*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecKeyCopyPublicKey(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */): platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */ { TODO() }

fun SecKeyCreateDecryptedData(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ algorithm: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ ciphertext: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*3*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecKeyCreateEncryptedData(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ algorithm: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ plaintext: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*3*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecKeyCreateRandomKey(/*0*/ parameters: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */ { TODO() }

fun SecKeyCreateSignature(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ algorithm: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ dataToSign: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*3*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecKeyCreateWithData(/*0*/ keyData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ attributes: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */ { TODO() }

fun SecKeyDecrypt(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ padding: platform.Security.SecPadding /* = kotlin.UInt */, /*2*/ cipherText: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*3*/ cipherTextLen: platform.posix.size_t /* = kotlin.ULong */, /*4*/ plainText: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*5*/ plainTextLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecKeyEncrypt(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ padding: platform.Security.SecPadding /* = kotlin.UInt */, /*2*/ plainText: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*3*/ plainTextLen: platform.posix.size_t /* = kotlin.ULong */, /*4*/ cipherText: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*5*/ cipherTextLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecKeyGeneratePair(/*0*/ parameters: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*1*/ publicKey: kotlinx.cinterop.CValuesRef<platform.Security.SecKeyRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeyRef /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey> */> */>?, /*2*/ privateKey: kotlinx.cinterop.CValuesRef<platform.Security.SecKeyRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SecKeyRef /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecKeyGetBlockSize(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */): platform.posix.size_t /* = kotlin.ULong */ { TODO() }

fun SecKeyGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SecKeyIsAlgorithmSupported(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ operation: platform.Security.SecKeyOperationType /* = kotlin.Long */, /*2*/ algorithm: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): kotlin.Boolean { TODO() }

fun SecKeyRawSign(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ padding: platform.Security.SecPadding /* = kotlin.UInt */, /*2*/ dataToSign: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*3*/ dataToSignLen: platform.posix.size_t /* = kotlin.ULong */, /*4*/ sig: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*5*/ sigLen: kotlinx.cinterop.CValuesRef<platform.posix.size_tVar /* = kotlinx.cinterop.ULongVarOf<platform.posix.size_t /* = kotlin.ULong */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecKeyRawVerify(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ padding: platform.Security.SecPadding /* = kotlin.UInt */, /*2*/ signedData: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*3*/ signedDataLen: platform.posix.size_t /* = kotlin.ULong */, /*4*/ sig: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*5*/ sigLen: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecKeyVerifySignature(/*0*/ key: platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */, /*1*/ algorithm: platform.Security.SecKeyAlgorithm? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ signedData: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*3*/ signature: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*4*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun SecPKCS12Import(/*0*/ pkcs12_data: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */, /*1*/ options: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ items: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecPolicyCopyProperties(/*0*/ policyRef: platform.Security.SecPolicyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecPolicy>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun SecPolicyCreateBasicX509(): platform.Security.SecPolicyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecPolicy>? */ { TODO() }

fun SecPolicyCreateRevocation(/*0*/ revocationFlags: platform.CoreFoundation.CFOptionFlags /* = kotlin.ULong */): platform.Security.SecPolicyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecPolicy>? */ { TODO() }

fun SecPolicyCreateSSL(/*0*/ server: kotlin.Boolean, /*1*/ hostname: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.Security.SecPolicyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecPolicy>? */ { TODO() }

fun SecPolicyCreateWithProperties(/*0*/ policyIdentifier: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*1*/ properties: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */): platform.Security.SecPolicyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecPolicy>? */ { TODO() }

fun SecPolicyGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SecRandomCopyBytes(/*0*/ rnd: platform.Security.SecRandomRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecRandom>? */, /*1*/ count: platform.posix.size_t /* = kotlin.ULong */, /*2*/ bytes: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int { TODO() }

fun SecRequestSharedWebCredential(/*0*/ fqdn: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*1*/ account: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ completionHandler: (platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, platform.CoreFoundation.CFErrorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError>? */) -> kotlin.Unit) { TODO() }

fun SecTrustCopyCustomAnchorCertificates(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ anchors: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustCopyExceptions(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */ { TODO() }

fun SecTrustCopyPolicies(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ policies: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFArrayRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFArrayRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustCopyProperties(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun SecTrustCopyPublicKey(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.Security.SecKeyRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecKey>? */ { TODO() }

fun SecTrustCopyResult(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun SecTrustCreateWithCertificates(/*0*/ certificates: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*1*/ policies: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */, /*2*/ trust: kotlinx.cinterop.CValuesRef<platform.Security.SecTrustRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.Security.SecTrustRef /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust> */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustEvaluate(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ result: kotlinx.cinterop.CValuesRef<platform.Security.SecTrustResultTypeVar /* = kotlinx.cinterop.UIntVarOf<platform.Security.SecTrustResultType /* = kotlin.UInt */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustEvaluateAsync(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */, /*2*/ result: platform.Security.SecTrustCallback? /* = ((platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, platform.Security.SecTrustResultType /* = kotlin.UInt */) -> kotlin.Unit)? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustEvaluateWithError(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ error: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFErrorRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFErrorRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFError> */> */>?): kotlin.Boolean { TODO() }

fun SecTrustGetCertificateAtIndex(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ ix: platform.CoreFoundation.CFIndex /* = kotlin.Long */): platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */ { TODO() }

fun SecTrustGetCertificateCount(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.CoreFoundation.CFIndex /* = kotlin.Long */ { TODO() }

fun SecTrustGetNetworkFetchAllowed(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ allowFetch: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.BooleanVar /* = kotlinx.cinterop.BooleanVarOf<kotlin.Boolean> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustGetTrustResult(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ result: kotlinx.cinterop.CValuesRef<platform.Security.SecTrustResultTypeVar /* = kotlinx.cinterop.UIntVarOf<platform.Security.SecTrustResultType /* = kotlin.UInt */> */>?): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun SecTrustGetVerifyTime(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.CoreFoundation.CFAbsoluteTime /* = kotlin.Double */ { TODO() }

fun SecTrustSetAnchorCertificates(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ anchorCertificates: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustSetAnchorCertificatesOnly(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ anchorCertificatesOnly: kotlin.Boolean): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustSetExceptions(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ exceptions: platform.CoreFoundation.CFDataRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFData>? */): kotlin.Boolean { TODO() }

fun SecTrustSetNetworkFetchAllowed(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ allowFetch: kotlin.Boolean): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustSetOCSPResponse(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ responseData: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustSetPolicies(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ policies: platform.CoreFoundation.CFTypeRef? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

fun SecTrustSetVerifyDate(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */, /*1*/ verifyDate: platform.CoreFoundation.CFDateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDate>? */): platform.darwin.OSStatus /* = kotlin.Int */ { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge0")private external fun kniBridge0(/*0*/ p0: kotlin.Int, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge1")private external fun kniBridge1(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge10")private external fun kniBridge10(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge100")private external fun kniBridge100(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge101")private external fun kniBridge101(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge102")private external fun kniBridge102(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge103")private external fun kniBridge103(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge104")private external fun kniBridge104(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge105")private external fun kniBridge105(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge106")private external fun kniBridge106(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge107")private external fun kniBridge107(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge108")private external fun kniBridge108(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge109")private external fun kniBridge109(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge110")private external fun kniBridge110(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge111")private external fun kniBridge111(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge112")private external fun kniBridge112(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge113")private external fun kniBridge113(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge114")private external fun kniBridge114(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge115")private external fun kniBridge115(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge116")private external fun kniBridge116(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge117")private external fun kniBridge117(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge118")private external fun kniBridge118(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge119")private external fun kniBridge119(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge120")private external fun kniBridge120(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge121")private external fun kniBridge121(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge122")private external fun kniBridge122(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge123")private external fun kniBridge123(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge124")private external fun kniBridge124(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge125")private external fun kniBridge125(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge126")private external fun kniBridge126(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge127")private external fun kniBridge127(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge128")private external fun kniBridge128(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge129")private external fun kniBridge129(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge13")private external fun kniBridge13(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge130")private external fun kniBridge130(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge131")private external fun kniBridge131(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge132")private external fun kniBridge132(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge133")private external fun kniBridge133(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge134")private external fun kniBridge134(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge135")private external fun kniBridge135(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge136")private external fun kniBridge136(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge137")private external fun kniBridge137(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UShort

@kotlin.native.SymbolName(name = "platform_Security_kniBridge138")private external fun kniBridge138(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge139")private external fun kniBridge139(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge140")private fun kniBridge140(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge141")private external fun kniBridge141(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge142")private fun kniBridge142(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge143")private external fun kniBridge143(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge144")private fun kniBridge144(/*0*/ p0: kotlin.UShort, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge145")private external fun kniBridge145(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge146")private fun kniBridge146(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge147")private external fun kniBridge147(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge148")private external fun kniBridge148(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge149")private external fun kniBridge149(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge150")private external fun kniBridge150(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge151")private external fun kniBridge151(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge152")private external fun kniBridge152(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UShort)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge153")private external fun kniBridge153(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge154")private external fun kniBridge154(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge155")private external fun kniBridge155(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge156")private external fun kniBridge156(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge157")private external fun kniBridge157(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge158")private external fun kniBridge158(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge159")private external fun kniBridge159(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge16")private external fun kniBridge16(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge160")private external fun kniBridge160(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge161")private external fun kniBridge161(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge162")private external fun kniBridge162(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge163")private external fun kniBridge163(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge164")private external fun kniBridge164(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge165")private external fun kniBridge165(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge166")private external fun kniBridge166(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge167")private external fun kniBridge167(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge168")private external fun kniBridge168(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge169")private fun kniBridge169(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge170")private external fun kniBridge170(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge171")private external fun kniBridge171(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge172")private fun kniBridge172(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge173")private external fun kniBridge173(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge174")private external fun kniBridge174(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge175")private fun kniBridge175(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge176")private external fun kniBridge176(/*0*/ p0: kotlin.Byte, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_Security_kniBridge177")private external fun kniBridge177(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge178")private external fun kniBridge178(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge179")private external fun kniBridge179(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge180")private external fun kniBridge180(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge181")private external fun kniBridge181(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge182")private external fun kniBridge182(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge183")private external fun kniBridge183(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge185")private external fun kniBridge185(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge186")private external fun kniBridge186(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge187")private external fun kniBridge187(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge188")private external fun kniBridge188(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge189")private external fun kniBridge189(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge190")private external fun kniBridge190(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge191")private external fun kniBridge191(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge192")private external fun kniBridge192(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge193")private external fun kniBridge193(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge194")private external fun kniBridge194(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge195")private external fun kniBridge195(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge196")private external fun kniBridge196(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge197")private external fun kniBridge197(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge198")private external fun kniBridge198(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge199")private external fun kniBridge199(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge2")private external fun kniBridge2(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge200")private external fun kniBridge200(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge201")private external fun kniBridge201(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge202")private external fun kniBridge202(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge203")private external fun kniBridge203(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge204")private external fun kniBridge204(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge205")private external fun kniBridge205(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge206")private external fun kniBridge206(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge207")private external fun kniBridge207(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge208")private external fun kniBridge208(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge209")private external fun kniBridge209(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge210")private external fun kniBridge210(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge211")private external fun kniBridge211(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge212")private external fun kniBridge212(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge213")private external fun kniBridge213(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge214")private external fun kniBridge214(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge215")private external fun kniBridge215(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge216")private external fun kniBridge216(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge217")private external fun kniBridge217(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge218")private external fun kniBridge218(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge219")private external fun kniBridge219(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge22")private external fun kniBridge22(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge220")private external fun kniBridge220(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge224")private external fun kniBridge224(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge225")private external fun kniBridge225(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge226")private external fun kniBridge226(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge227")private external fun kniBridge227(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge228")private external fun kniBridge228(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge229")private external fun kniBridge229(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge230")private external fun kniBridge230(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge231")private external fun kniBridge231(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge232")private external fun kniBridge232(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge233")private external fun kniBridge233(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge234")private external fun kniBridge234(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge235")private external fun kniBridge235(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge236")private external fun kniBridge236(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge237")private external fun kniBridge237(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge238")private external fun kniBridge238(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge239")private external fun kniBridge239(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge240")private external fun kniBridge240(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge241")private external fun kniBridge241(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge242")private external fun kniBridge242(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge243")private external fun kniBridge243(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge244")private external fun kniBridge244(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge245")private external fun kniBridge245(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge246")private external fun kniBridge246(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge247")private external fun kniBridge247(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge248")private external fun kniBridge248(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge249")private external fun kniBridge249(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge250")private external fun kniBridge250(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge251")private external fun kniBridge251(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge252")private external fun kniBridge252(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge253")private external fun kniBridge253(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge254")private external fun kniBridge254(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge255")private external fun kniBridge255(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge256")private external fun kniBridge256(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge257")private external fun kniBridge257(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge258")private external fun kniBridge258(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge259")private external fun kniBridge259(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge260")private external fun kniBridge260(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge261")private external fun kniBridge261(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge262")private external fun kniBridge262(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge263")private external fun kniBridge263(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge264")private external fun kniBridge264(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge265")private external fun kniBridge265(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge266")private external fun kniBridge266(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge267")private external fun kniBridge267(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge268")private external fun kniBridge268(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge269")private external fun kniBridge269(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlin.ULong, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge270")private external fun kniBridge270(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge271")private external fun kniBridge271(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge272")private external fun kniBridge272(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge273")private external fun kniBridge273(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge274")private external fun kniBridge274(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge275")private external fun kniBridge275(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge276")private external fun kniBridge276(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge277")private external fun kniBridge277(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge278")private external fun kniBridge278(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge279")private external fun kniBridge279(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge280")private external fun kniBridge280(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge281")private external fun kniBridge281(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge282")private external fun kniBridge282(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge283")private external fun kniBridge283(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge284")private external fun kniBridge284(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge285")private external fun kniBridge285(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge286")private external fun kniBridge286(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge295")private external fun kniBridge295(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge296")private external fun kniBridge296(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge3")private external fun kniBridge3(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge302")private external fun kniBridge302(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge303")private external fun kniBridge303(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge304")private external fun kniBridge304(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge305")private external fun kniBridge305(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge306")private external fun kniBridge306(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge307")private external fun kniBridge307(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge311")private external fun kniBridge311(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge314")private external fun kniBridge314(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge315")private external fun kniBridge315(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge316")private external fun kniBridge316(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge317")private external fun kniBridge317(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge318")private external fun kniBridge318(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge319")private external fun kniBridge319(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge320")private external fun kniBridge320(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge321")private external fun kniBridge321(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge322")private external fun kniBridge322(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge323")private external fun kniBridge323(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge324")private external fun kniBridge324(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge325")private external fun kniBridge325(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge328")private external fun kniBridge328(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge329")private external fun kniBridge329(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge330")private external fun kniBridge330(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge331")private external fun kniBridge331(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge332")private external fun kniBridge332(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge333")private external fun kniBridge333(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge334")private external fun kniBridge334(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge335")private external fun kniBridge335(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge336")private external fun kniBridge336(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge337")private external fun kniBridge337(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge338")private external fun kniBridge338(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge339")private external fun kniBridge339(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge340")private external fun kniBridge340(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge341")private external fun kniBridge341(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge342")private external fun kniBridge342(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge343")private external fun kniBridge343(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge344")private external fun kniBridge344(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge345")private external fun kniBridge345(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge346")private external fun kniBridge346(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge347")private external fun kniBridge347(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge348")private external fun kniBridge348(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge349")private external fun kniBridge349(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge350")private external fun kniBridge350(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge351")private external fun kniBridge351(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge352")private external fun kniBridge352(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge353")private external fun kniBridge353(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge354")private external fun kniBridge354(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge355")private external fun kniBridge355(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge356")private external fun kniBridge356(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge357")private external fun kniBridge357(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge358")private external fun kniBridge358(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge359")private external fun kniBridge359(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge360")private external fun kniBridge360(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge361")private external fun kniBridge361(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge362")private external fun kniBridge362(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge363")private external fun kniBridge363(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge364")private external fun kniBridge364(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge365")private external fun kniBridge365(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge366")private external fun kniBridge366(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge367")private external fun kniBridge367(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge368")private external fun kniBridge368(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge369")private external fun kniBridge369(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge370")private external fun kniBridge370(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge371")private external fun kniBridge371(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge372")private external fun kniBridge372(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge373")private external fun kniBridge373(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge374")private external fun kniBridge374(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge375")private external fun kniBridge375(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge376")private external fun kniBridge376(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge377")private external fun kniBridge377(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge378")private external fun kniBridge378(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge379")private external fun kniBridge379(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge38")private external fun kniBridge38(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge380")private external fun kniBridge380(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge381")private external fun kniBridge381(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge382")private external fun kniBridge382(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge383")private external fun kniBridge383(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge384")private external fun kniBridge384(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge385")private external fun kniBridge385(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge386")private external fun kniBridge386(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge387")private external fun kniBridge387(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge388")private external fun kniBridge388(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge389")private external fun kniBridge389(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge39")private external fun kniBridge39(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge390")private external fun kniBridge390(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge391")private external fun kniBridge391(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge392")private external fun kniBridge392(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge393")private external fun kniBridge393(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge394")private external fun kniBridge394(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge395")private external fun kniBridge395(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge396")private external fun kniBridge396(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge397")private external fun kniBridge397(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge398")private external fun kniBridge398(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge399")private external fun kniBridge399(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge40")private external fun kniBridge40(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge400")private external fun kniBridge400(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge401")private external fun kniBridge401(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge402")private external fun kniBridge402(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge403")private external fun kniBridge403(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge404")private external fun kniBridge404(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge405")private external fun kniBridge405(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge406")private external fun kniBridge406(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge407")private external fun kniBridge407(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge408")private external fun kniBridge408(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge409")private external fun kniBridge409(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge41")private external fun kniBridge41(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge410")private external fun kniBridge410(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge411")private external fun kniBridge411(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge412")private external fun kniBridge412(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge413")private external fun kniBridge413(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge414")private external fun kniBridge414(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge415")private external fun kniBridge415(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge416")private external fun kniBridge416(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge417")private external fun kniBridge417(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge418")private external fun kniBridge418(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge419")private external fun kniBridge419(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge42")private external fun kniBridge42(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge420")private external fun kniBridge420(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge421")private external fun kniBridge421(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge424")private external fun kniBridge424(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge425")private external fun kniBridge425(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge426")private external fun kniBridge426(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge427")private external fun kniBridge427(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge428")private external fun kniBridge428(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge429")private external fun kniBridge429(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge43")private external fun kniBridge43(/*0*/ p0: kotlin.Byte, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge430")private external fun kniBridge430(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge431")private external fun kniBridge431(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge432")private external fun kniBridge432(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge433")private external fun kniBridge433(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge434")private external fun kniBridge434(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge435")private external fun kniBridge435(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge436")private external fun kniBridge436(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge437")private external fun kniBridge437(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge44")private external fun kniBridge44(/*0*/ p0: kotlin.ULong): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge440")private external fun kniBridge440(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge441")private external fun kniBridge441(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge442")private external fun kniBridge442(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge443")private external fun kniBridge443(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge444")private external fun kniBridge444(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge445")private external fun kniBridge445(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge446")private external fun kniBridge446(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge447")private external fun kniBridge447(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge448")private external fun kniBridge448(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge449")private external fun kniBridge449(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge45")private external fun kniBridge45(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge450")private external fun kniBridge450(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge451")private external fun kniBridge451(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge452")private external fun kniBridge452(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge453")private external fun kniBridge453(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge454")private external fun kniBridge454(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge455")private external fun kniBridge455(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge456")private external fun kniBridge456(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge457")private external fun kniBridge457(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge458")private external fun kniBridge458(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge459")private external fun kniBridge459(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge46")private external fun kniBridge46(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge460")private external fun kniBridge460(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge461")private external fun kniBridge461(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge462")private external fun kniBridge462(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge463")private external fun kniBridge463(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge464")private external fun kniBridge464(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge465")private external fun kniBridge465(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge466")private external fun kniBridge466(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge467")private external fun kniBridge467(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge47")private external fun kniBridge47(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge48")private external fun kniBridge48(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge49")private external fun kniBridge49(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge5")private external fun kniBridge5(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge50")private external fun kniBridge50(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge51")private external fun kniBridge51(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge52")private external fun kniBridge52(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge53")private external fun kniBridge53(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge54")private external fun kniBridge54(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge55")private external fun kniBridge55(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Byte): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge56")private external fun kniBridge56(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge57")private external fun kniBridge57(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge58")private external fun kniBridge58(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Double

@kotlin.native.SymbolName(name = "platform_Security_kniBridge59")private external fun kniBridge59(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge60")private external fun kniBridge60(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge61")private fun kniBridge61(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge62")private external fun kniBridge62(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge63")private external fun kniBridge63(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge64")private external fun kniBridge64(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge65")private external fun kniBridge65(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Long

@kotlin.native.SymbolName(name = "platform_Security_kniBridge66")private external fun kniBridge66(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Long): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge67")private external fun kniBridge67(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge68")private external fun kniBridge68(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_Security_kniBridge69")private external fun kniBridge69(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge70")private external fun kniBridge70(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge71")private external fun kniBridge71(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge72")private external fun kniBridge72(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge73")private fun kniBridge73(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge74")private external fun kniBridge74(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.internal.ExportForCppRuntime(name = "platform_Security_kniBridge75")private fun kniBridge75(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */) { TODO() }

@kotlin.native.SymbolName(name = "platform_Security_kniBridge76")private external fun kniBridge76(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge77")private external fun kniBridge77(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_Security_kniBridge78")private external fun kniBridge78(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlin.Int): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge79")private external fun kniBridge79(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge80")private external fun kniBridge80(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlin.Byte): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge81")private external fun kniBridge81(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge82")private external fun kniBridge82(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge83")private external fun kniBridge83(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge84")private external fun kniBridge84(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge85")private external fun kniBridge85(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge86")private external fun kniBridge86(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge87")private external fun kniBridge87(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge88")private external fun kniBridge88(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge89")private external fun kniBridge89(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge9")private external fun kniBridge9(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_Security_kniBridge90")private external fun kniBridge90(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge91")private external fun kniBridge91(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge92")private external fun kniBridge92(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge93")private external fun kniBridge93(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge94")private external fun kniBridge94(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge95")private external fun kniBridge95(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge96")private external fun kniBridge96(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge97")private external fun kniBridge97(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.ULong): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge98")private external fun kniBridge98(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_Security_kniBridge99")private external fun kniBridge99(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

fun sec_certificate_copy_ref(/*0*/ certificate: platform.Security.sec_certificate_t? /* = platform.darwin.NSObject? */): platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */ { TODO() }

fun sec_certificate_create(/*0*/ certificate: platform.Security.SecCertificateRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecCertificate>? */): platform.Security.sec_certificate_t? /* = platform.darwin.NSObject? */ { TODO() }

fun sec_identity_copy_certificates_ref(/*0*/ identity: platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */): platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */ { TODO() }

fun sec_identity_copy_ref(/*0*/ identity: platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */): platform.Security.SecIdentityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecIdentity>? */ { TODO() }

fun sec_identity_create(/*0*/ identity: platform.Security.SecIdentityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecIdentity>? */): platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */ { TODO() }

fun sec_identity_create_with_certificates(/*0*/ identity: platform.Security.SecIdentityRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecIdentity>? */, /*1*/ certificates: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */): platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */ { TODO() }

fun sec_protocol_metadata_access_supported_signature_algorithms(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.posix.uint16_t /* = kotlin.UShort */) -> kotlin.Unit): kotlin.Boolean { TODO() }

fun sec_protocol_metadata_create_secret(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ label_len: platform.posix.size_t /* = kotlin.ULong */, /*2*/ label: kotlin.String?, /*3*/ exporter_length: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */ { TODO() }

fun sec_protocol_metadata_create_secret_with_context(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ label_len: platform.posix.size_t /* = kotlin.ULong */, /*2*/ label: kotlin.String?, /*3*/ context_len: platform.posix.size_t /* = kotlin.ULong */, /*4*/ context: kotlinx.cinterop.CValuesRef<platform.posix.uint8_tVar /* = kotlinx.cinterop.UByteVarOf<platform.posix.uint8_t /* = kotlin.UByte */> */>?, /*5*/ exporter_length: platform.posix.size_t /* = kotlin.ULong */): platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */ { TODO() }

fun sec_protocol_metadata_get_negotiated_ciphersuite(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): platform.Security.SSLCipherSuite /* = kotlin.UShort */ { TODO() }

fun sec_protocol_metadata_get_negotiated_protocol(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun sec_protocol_metadata_get_negotiated_protocol_version(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): platform.Security.SSLProtocol /* = kotlin.Int */ { TODO() }

fun sec_protocol_options_add_tls_ciphersuite(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ ciphersuite: platform.Security.SSLCipherSuite /* = kotlin.UShort */) { TODO() }

fun sec_protocol_options_set_challenge_block(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ challenge_block: platform.Security.sec_protocol_challenge_t? /* = ((platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, platform.Security.sec_protocol_challenge_complete_t? /* = ((platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit)? */) -> kotlin.Unit)? */, /*2*/ challenge_queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun sec_protocol_options_set_key_update_block(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ key_update_block: platform.Security.sec_protocol_key_update_t? /* = ((platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, platform.Security.sec_protocol_key_update_complete_t? /* = (() -> kotlin.Unit)? */) -> kotlin.Unit)? */, /*2*/ key_update_queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun sec_protocol_options_set_tls_max_version(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ version: platform.Security.SSLProtocol /* = kotlin.Int */) { TODO() }

fun sec_protocol_options_set_tls_min_version(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ version: platform.Security.SSLProtocol /* = kotlin.Int */) { TODO() }

fun sec_protocol_options_set_verify_block(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ verify_block: platform.Security.sec_protocol_verify_t? /* = ((platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, platform.Security.sec_trust_t? /* = platform.darwin.NSObject? */, platform.Security.sec_protocol_verify_complete_t? /* = ((kotlin.Boolean) -> kotlin.Unit)? */) -> kotlin.Unit)? */, /*2*/ verify_block_queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun sec_trust_copy_ref(/*0*/ trust: platform.Security.sec_trust_t? /* = platform.darwin.NSObject? */): platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */ { TODO() }

fun sec_trust_create(/*0*/ trust: platform.Security.SecTrustRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__SecTrust>? */): platform.Security.sec_trust_t? /* = platform.darwin.NSObject? */ { TODO() }


