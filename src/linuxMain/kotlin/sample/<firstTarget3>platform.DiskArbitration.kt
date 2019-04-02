@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.DiskArbitration

import kotlinx.cinterop.* 

typealias DAApprovalSessionRef = kotlinx.cinterop.CPointer<cnames.structs.__DASession>

typealias DAApprovalSessionRefVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DAApprovalSessionRef>

typealias DADiskAppearedCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskAppearedCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskAppearedCallback>

typealias DADiskClaimCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, platform.DiskArbitration.DADissenterRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskClaimCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskClaimCallback>

typealias DADiskClaimOptions = platform.darwin.UInt32

typealias DADiskClaimOptionsVar = kotlinx.cinterop.UIntVarOf<platform.DiskArbitration.DADiskClaimOptions>

typealias DADiskClaimReleaseCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> platform.DiskArbitration.DADissenterRef?>>

typealias DADiskClaimReleaseCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskClaimReleaseCallback>

typealias DADiskDescriptionChangedCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, platform.CoreFoundation.CFArrayRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskDescriptionChangedCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskDescriptionChangedCallback>

typealias DADiskDisappearedCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskDisappearedCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskDisappearedCallback>

typealias DADiskEjectApprovalCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> platform.DiskArbitration.DADissenterRef?>>

typealias DADiskEjectApprovalCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskEjectApprovalCallback>

typealias DADiskEjectCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, platform.DiskArbitration.DADissenterRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskEjectCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskEjectCallback>

typealias DADiskEjectOptions = platform.darwin.UInt32

typealias DADiskEjectOptionsVar = kotlinx.cinterop.UIntVarOf<platform.DiskArbitration.DADiskEjectOptions>

typealias DADiskMountApprovalCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> platform.DiskArbitration.DADissenterRef?>>

typealias DADiskMountApprovalCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskMountApprovalCallback>

typealias DADiskMountCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, platform.DiskArbitration.DADissenterRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskMountCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskMountCallback>

typealias DADiskMountOptions = platform.darwin.UInt32

typealias DADiskMountOptionsVar = kotlinx.cinterop.UIntVarOf<platform.DiskArbitration.DADiskMountOptions>

typealias DADiskOptions = platform.darwin.UInt32

typealias DADiskOptionsVar = kotlinx.cinterop.UIntVarOf<platform.DiskArbitration.DADiskOptions>

typealias DADiskPeekCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskPeekCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskPeekCallback>

typealias DADiskRef = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>

typealias DADiskRefVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskRef>

typealias DADiskRenameCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, platform.DiskArbitration.DADissenterRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskRenameCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskRenameCallback>

typealias DADiskRenameOptions = platform.darwin.UInt32

typealias DADiskRenameOptionsVar = kotlinx.cinterop.UIntVarOf<platform.DiskArbitration.DADiskRenameOptions>

typealias DADiskUnmountApprovalCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, kotlinx.cinterop.COpaquePointer?) -> platform.DiskArbitration.DADissenterRef?>>

typealias DADiskUnmountApprovalCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskUnmountApprovalCallback>

typealias DADiskUnmountCallback = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef?, platform.DiskArbitration.DADissenterRef?, kotlinx.cinterop.COpaquePointer?) -> kotlin.Unit>>

typealias DADiskUnmountCallbackVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADiskUnmountCallback>

typealias DADiskUnmountOptions = platform.darwin.UInt32

typealias DADiskUnmountOptionsVar = kotlinx.cinterop.UIntVarOf<platform.DiskArbitration.DADiskUnmountOptions>

typealias DADissenterRef = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>

typealias DADissenterRefVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DADissenterRef>

typealias DAReturn = platform.darwin.mach_error_t

typealias DAReturnVar = kotlinx.cinterop.IntVarOf<platform.DiskArbitration.DAReturn>

typealias DASessionRef = kotlinx.cinterop.CPointer<cnames.structs.__DASession>

typealias DASessionRefVar = kotlinx.cinterop.CPointerVarOf<platform.DiskArbitration.DASessionRef>

const val err_local_diskarbitration: kotlin.Int = 0

val kDADiskClaimOptionDefault: kotlin.UInt
    get() = TODO()

val kDADiskDescriptionBusNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionBusPathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceGUIDKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceInternalKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceModelKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDevicePathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceProtocolKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceRevisionKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceUnitKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionDeviceVendorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

var kDADiskDescriptionMatchMediaUnformatted: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) = TODO()

var kDADiskDescriptionMatchMediaWhole: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) = TODO()

var kDADiskDescriptionMatchVolumeMountable: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) = TODO()

var kDADiskDescriptionMatchVolumeUnrecognized: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */) = TODO()

val kDADiskDescriptionMediaBSDMajorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaBSDMinorKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaBSDNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaBSDUnitKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaBlockSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaContentKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaEjectableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaIconKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaKindKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaLeafKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaPathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaRemovableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaSizeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaTypeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaUUIDKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaWholeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionMediaWritableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumeKindKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumeMountableKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumeNameKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumeNetworkKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumePathKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumeTypeKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

val kDADiskDescriptionVolumeUUIDKey: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */
    get() = TODO()

var kDADiskDescriptionWatchVolumeName: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */) = TODO()

var kDADiskDescriptionWatchVolumePath: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */
    get() = TODO()
    set(value: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */) = TODO()

val kDADiskEjectOptionDefault: kotlin.UInt
    get() = TODO()

val kDADiskMountOptionDefault: kotlin.UInt
    get() = TODO()

val kDADiskMountOptionWhole: kotlin.UInt
    get() = TODO()

val kDADiskOptionDefault: kotlin.UInt
    get() = TODO()

val kDADiskRenameOptionDefault: kotlin.UInt
    get() = TODO()

val kDADiskUnmountOptionDefault: kotlin.UInt
    get() = TODO()

val kDADiskUnmountOptionForce: kotlin.UInt
    get() = TODO()

val kDADiskUnmountOptionWhole: kotlin.UInt
    get() = TODO()

val kDAReturnBadArgument: kotlin.Int
    get() = TODO()

val kDAReturnBusy: kotlin.Int
    get() = TODO()

val kDAReturnError: kotlin.Int
    get() = TODO()

val kDAReturnExclusiveAccess: kotlin.Int
    get() = TODO()

val kDAReturnNoResources: kotlin.Int
    get() = TODO()

val kDAReturnNotFound: kotlin.Int
    get() = TODO()

val kDAReturnNotMounted: kotlin.Int
    get() = TODO()

val kDAReturnNotPermitted: kotlin.Int
    get() = TODO()

val kDAReturnNotPrivileged: kotlin.Int
    get() = TODO()

val kDAReturnNotReady: kotlin.Int
    get() = TODO()

val kDAReturnNotWritable: kotlin.Int
    get() = TODO()

val kDAReturnSuccess: kotlin.Int
    get() = TODO()

val kDAReturnUnsupported: kotlin.Int
    get() = TODO()

fun DAApprovalSessionCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.DiskArbitration.DAApprovalSessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */ { TODO() }

fun DAApprovalSessionGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun DAApprovalSessionScheduleWithRunLoop(/*0*/ session: platform.DiskArbitration.DAApprovalSessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun DAApprovalSessionUnscheduleFromRunLoop(/*0*/ session: platform.DiskArbitration.DAApprovalSessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun DADiskClaim(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ options: platform.DiskArbitration.DADiskClaimOptions /* = kotlin.UInt */, /*2*/ release: platform.DiskArbitration.DADiskClaimReleaseCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */>>? */, /*3*/ releaseContext: kotlinx.cinterop.CValuesRef<*>?, /*4*/ callback: platform.DiskArbitration.DADiskClaimCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*5*/ callbackContext: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DADiskCopyDescription(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */): platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */ { TODO() }

fun DADiskCopyIOMedia(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */): platform.IOKit.io_service_t /* = kotlin.UInt */ { TODO() }

fun DADiskCopyWholeDisk(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */): platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */ { TODO() }

fun DADiskCreateFromBSDName(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*2*/ name: kotlin.String?): platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */ { TODO() }

fun DADiskCreateFromIOMedia(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*2*/ media: platform.IOKit.io_service_t /* = kotlin.UInt */): platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */ { TODO() }

fun DADiskCreateFromVolumePath(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*2*/ path: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */): platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */ { TODO() }

fun DADiskEject(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ options: platform.DiskArbitration.DADiskEjectOptions /* = kotlin.UInt */, /*2*/ callback: platform.DiskArbitration.DADiskEjectCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DADiskGetBSDName(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */): kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar /* = kotlinx.cinterop.ByteVarOf<kotlin.Byte> */>? { TODO() }

fun DADiskGetOptions(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */): platform.DiskArbitration.DADiskOptions /* = kotlin.UInt */ { TODO() }

fun DADiskGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun DADiskIsClaimed(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */): kotlin.Boolean { TODO() }

fun DADiskMount(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ path: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ options: platform.DiskArbitration.DADiskMountOptions /* = kotlin.UInt */, /*3*/ callback: platform.DiskArbitration.DADiskMountCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DADiskMountWithArguments(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ path: platform.CoreFoundation.CFURLRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFURL>? */, /*2*/ options: platform.DiskArbitration.DADiskMountOptions /* = kotlin.UInt */, /*3*/ callback: platform.DiskArbitration.DADiskMountCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<*>?, /*5*/ arguments: kotlinx.cinterop.CValuesRef<platform.CoreFoundation.CFStringRefVar /* = kotlinx.cinterop.CPointerVarOf<platform.CoreFoundation.CFStringRef /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString> */> */>?) { TODO() }

fun DADiskRename(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ name: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */, /*2*/ options: platform.DiskArbitration.DADiskRenameOptions /* = kotlin.UInt */, /*3*/ callback: platform.DiskArbitration.DADiskRenameCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DADiskSetOptions(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ options: platform.DiskArbitration.DADiskOptions /* = kotlin.UInt */, /*2*/ value: kotlin.Boolean): platform.DiskArbitration.DAReturn /* = kotlin.Int */ { TODO() }

fun DADiskUnclaim(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */) { TODO() }

fun DADiskUnmount(/*0*/ disk: platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, /*1*/ options: platform.DiskArbitration.DADiskUnmountOptions /* = kotlin.UInt */, /*2*/ callback: platform.DiskArbitration.DADiskUnmountCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DADissenterCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */, /*1*/ status: platform.DiskArbitration.DAReturn /* = kotlin.Int */, /*2*/ string: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */): platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */ { TODO() }

fun DADissenterGetStatus(/*0*/ dissenter: platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */): platform.DiskArbitration.DAReturn /* = kotlin.Int */ { TODO() }

fun DADissenterGetStatusString(/*0*/ dissenter: platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */): platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */ { TODO() }

fun DARegisterDiskAppearedCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ callback: platform.DiskArbitration.DADiskAppearedCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DARegisterDiskDescriptionChangedCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ watch: platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, /*3*/ callback: platform.DiskArbitration.DADiskDescriptionChangedCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, platform.CoreFoundation.CFArrayRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFArray>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DARegisterDiskDisappearedCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ callback: platform.DiskArbitration.DADiskDisappearedCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DARegisterDiskEjectApprovalCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ callback: platform.DiskArbitration.DADiskEjectApprovalCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DARegisterDiskMountApprovalCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ callback: platform.DiskArbitration.DADiskMountApprovalCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DARegisterDiskPeekCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ order: platform.CoreFoundation.CFIndex /* = kotlin.Long */, /*3*/ callback: platform.DiskArbitration.DADiskPeekCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> kotlin.Unit>>? */, /*4*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DARegisterDiskUnmountApprovalCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ match: platform.CoreFoundation.CFDictionaryRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFDictionary>? */, /*2*/ callback: platform.DiskArbitration.DADiskUnmountApprovalCallback? /* = kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(platform.DiskArbitration.DADiskRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADisk>? */, kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */) -> platform.DiskArbitration.DADissenterRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DADissenter>? */>>? */, /*3*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DASessionCreate(/*0*/ allocator: platform.CoreFoundation.CFAllocatorRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFAllocator>? */): platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */ { TODO() }

fun DASessionGetTypeID(): platform.CoreFoundation.CFTypeID /* = kotlin.ULong */ { TODO() }

fun DASessionScheduleWithRunLoop(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun DASessionSetDispatchQueue(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ queue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */) { TODO() }

fun DASessionUnscheduleFromRunLoop(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ runLoop: platform.CoreFoundation.CFRunLoopRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFRunLoop>? */, /*2*/ runLoopMode: platform.CoreFoundation.CFStringRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__CFString>? */) { TODO() }

fun DAUnregisterApprovalCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ callback: kotlinx.cinterop.CValuesRef<*>?, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

fun DAUnregisterCallback(/*0*/ session: platform.DiskArbitration.DASessionRef? /* = kotlinx.cinterop.CPointer<cnames.structs.__DASession>? */, /*1*/ callback: kotlinx.cinterop.CValuesRef<*>?, /*2*/ context: kotlinx.cinterop.CValuesRef<*>?) { TODO() }

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge0")private external fun kniBridge0(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge1")private external fun kniBridge1(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge10")private external fun kniBridge10(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge11")private external fun kniBridge11(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge12")private external fun kniBridge12(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge13")private external fun kniBridge13(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge14")private external fun kniBridge14(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge15")private external fun kniBridge15(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge16")private external fun kniBridge16(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge17")private external fun kniBridge17(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.Int, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge18")private external fun kniBridge18(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Int

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge19")private external fun kniBridge19(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge2")private external fun kniBridge2(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge20")private external fun kniBridge20(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge21")private external fun kniBridge21(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge22")private external fun kniBridge22(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge23")private external fun kniBridge23(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge24")private external fun kniBridge24(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge25")private external fun kniBridge25(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge26")private external fun kniBridge26(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.UInt, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge27")private external fun kniBridge27(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge28")private external fun kniBridge28(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge29")private external fun kniBridge29(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge3")private external fun kniBridge3(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge30")private external fun kniBridge30(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge31")private external fun kniBridge31(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*5*/ p5: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge32")private external fun kniBridge32(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.Byte

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge33")private external fun kniBridge33(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge34")private external fun kniBridge34(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlin.Long, /*3*/ p3: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*4*/ p4: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge35")private external fun kniBridge35(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlin.UInt

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge36")private external fun kniBridge36(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlin.UInt, /*2*/ p2: kotlin.Byte): kotlin.Int

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge37")private external fun kniBridge37(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge38")private external fun kniBridge38(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge39")private external fun kniBridge39(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge4")private external fun kniBridge4(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge40")private external fun kniBridge40(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge41")private external fun kniBridge41(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge42")private external fun kniBridge42(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge43")private external fun kniBridge43(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge44")private external fun kniBridge44(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge45")private external fun kniBridge45(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge46")private external fun kniBridge46(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge47")private external fun kniBridge47(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge48")private external fun kniBridge48(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge49")private external fun kniBridge49(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge5")private external fun kniBridge5(): kotlin.ULong

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge50")private external fun kniBridge50(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge51")private external fun kniBridge51(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge52")private external fun kniBridge52(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge53")private external fun kniBridge53(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge54")private external fun kniBridge54(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge55")private external fun kniBridge55(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge56")private external fun kniBridge56(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge57")private external fun kniBridge57(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge58")private external fun kniBridge58(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge59")private external fun kniBridge59(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge6")private external fun kniBridge6(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge60")private external fun kniBridge60(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge61")private external fun kniBridge61(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge62")private external fun kniBridge62(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge63")private external fun kniBridge63(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge64")private external fun kniBridge64(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge65")private external fun kniBridge65(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge66")private external fun kniBridge66(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge67")private external fun kniBridge67(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge68")private external fun kniBridge68(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge69")private external fun kniBridge69(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge7")private external fun kniBridge7(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge70")private external fun kniBridge70(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge71")private external fun kniBridge71(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge72")private external fun kniBridge72(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge73")private external fun kniBridge73(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge74")private external fun kniBridge74(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge75")private external fun kniBridge75(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge76")private external fun kniBridge76(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge77")private external fun kniBridge77(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge78")private external fun kniBridge78(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge79")private external fun kniBridge79(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge8")private external fun kniBridge8(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*1*/ p1: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */, /*2*/ p2: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge80")private external fun kniBridge80(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge81")private external fun kniBridge81(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge82")private external fun kniBridge82(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge83")private external fun kniBridge83(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge84")private external fun kniBridge84(): kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge85")private external fun kniBridge85(/*0*/ p0: kotlinx.cinterop.NativePtr /* = kotlin.native.internal.NativePtr */)

@kotlin.native.SymbolName(name = "platform_DiskArbitration_kniBridge9")private external fun kniBridge9(): kotlin.ULong


