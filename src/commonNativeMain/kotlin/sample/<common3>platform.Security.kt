@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.Security

import kotlinx.cinterop.* 

expect interface OS_sec_certificateProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_sec_certificateProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_sec_identityProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_sec_identityProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_sec_objectProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_sec_objectProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_sec_protocol_metadataProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_sec_protocol_metadataProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_sec_protocol_optionsProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_sec_protocol_optionsProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

expect interface OS_sec_trustProtocol: platform.darwin.NSObjectProtocol {
}

expect interface OS_sec_trustProtocolMeta: platform.darwin.NSObjectProtocolMeta {
}

final expect enum class SSLAuthenticate: kotlinx.cinterop.CEnum {
    kNeverAuthenticate,

    kAlwaysAuthenticate,

    kTryAuthenticate;

    open override /*1*/ val value: kotlin.Int

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLAuthenticate
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.Security.SSLAuthenticate

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class SSLCiphersuiteGroup: kotlinx.cinterop.CEnum {
    kSSLCiphersuiteGroupDefault,

    kSSLCiphersuiteGroupCompatibility,

    kSSLCiphersuiteGroupLegacy,

    kSSLCiphersuiteGroupATS,

    kSSLCiphersuiteGroupATSCompatibility;

    open override /*1*/ val value: kotlin.Int

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLCiphersuiteGroup
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.Security.SSLCiphersuiteGroup

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class SSLClientCertificateState: kotlinx.cinterop.CEnum {
    kSSLClientCertNone,

    kSSLClientCertRequested,

    kSSLClientCertSent,

    kSSLClientCertRejected;

    open override /*1*/ val value: kotlin.Int

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLClientCertificateState
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.Security.SSLClientCertificateState

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class SSLConnectionType: kotlinx.cinterop.CEnum {
    kSSLStreamType,

    kSSLDatagramType;

    open override /*1*/ val value: kotlin.Int

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLConnectionType
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.Security.SSLConnectionType

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class SSLProtocolSide: kotlinx.cinterop.CEnum {
    kSSLServerSide,

    kSSLClientSide;

    open override /*1*/ val value: kotlin.Int

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLProtocolSide
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.Security.SSLProtocolSide

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect enum class SSLSessionState: kotlinx.cinterop.CEnum {
    kSSLIdle,

    kSSLHandshake,

    kSSLConnected,

    kSSLClosed,

    kSSLAborted;

    open override /*1*/ val value: kotlin.Int

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.Int): platform.Security.SSLSessionState
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.Security.SSLSessionState

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class SecKeychainAttribute: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class SecKeychainAttributeInfo: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class SecKeychainAttributeList: kotlinx.cinterop.CStructVar {
    final var attr: kotlinx.cinterop.CPointer<platform.Security.SecKeychainAttribute>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class SSLProtocol: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class SSLSessionOption: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

open expect class sec_certificate_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class sec_identity_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class sec_object_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class sec_protocol_metadata_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class sec_protocol_options_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

open expect class sec_trust_t: kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
}

expect fun sec_protocol_metadata_access_distinguished_names(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit): kotlin.Boolean

expect fun sec_protocol_metadata_access_ocsp_response(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit): kotlin.Boolean

expect fun sec_protocol_metadata_access_peer_certificate_chain(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ handler: (platform.Security.sec_certificate_t? /* = platform.darwin.NSObject? */) -> kotlin.Unit): kotlin.Boolean

expect fun sec_protocol_metadata_challenge_parameters_are_equal(/*0*/ metadataA: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ metadataB: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlin.Boolean

expect fun sec_protocol_metadata_copy_peer_public_key(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */

expect fun sec_protocol_metadata_get_early_data_accepted(/*0*/ metadata: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlin.Boolean

expect fun sec_protocol_metadata_peers_are_equal(/*0*/ metadataA: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */, /*1*/ metadataB: platform.Security.sec_protocol_metadata_t? /* = platform.darwin.NSObject? */): kotlin.Boolean

expect fun sec_protocol_options_add_pre_shared_key(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ psk: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */, /*2*/ psk_identity: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */)

expect fun sec_protocol_options_add_tls_application_protocol(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ application_protocol: kotlin.String?)

expect fun sec_protocol_options_add_tls_ciphersuite_group(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ group: platform.Security.SSLCiphersuiteGroup)

expect fun sec_protocol_options_set_local_identity(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ identity: platform.Security.sec_identity_t? /* = platform.darwin.NSObject? */)

expect fun sec_protocol_options_set_peer_authentication_required(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ peer_authentication_required: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_diffie_hellman_parameters(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ params: platform.darwin.dispatch_data_t? /* = platform.darwin.NSObject? */)

expect fun sec_protocol_options_set_tls_false_start_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ false_start_enabled: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_is_fallback_attempt(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ is_fallback_attempt: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_ocsp_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ ocsp_enabled: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_renegotiation_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ renegotiation_enabled: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_resumption_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ resumption_enabled: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_sct_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ sct_enabled: kotlin.Boolean)

expect fun sec_protocol_options_set_tls_server_name(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ server_name: kotlin.String?)

expect fun sec_protocol_options_set_tls_tickets_enabled(/*0*/ options: platform.Security.sec_protocol_options_t? /* = platform.darwin.NSObject? */, /*1*/ tickets_enabled: kotlin.Boolean)


