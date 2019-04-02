@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.Foundation

import kotlinx.cinterop.*

open expect class NSArrayMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSFastEnumerationProtocolMeta {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge518")
    open external override /*1*/ fun alloc(): kotlin.collections.List<*>?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge516")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): kotlin.collections.List<*>?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge514")
    open external override /*1*/ fun new(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge520")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSAssertionHandler : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3712")
    open external override /*1*/ fun init(): platform.Foundation.NSAssertionHandler?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSAssertionHandler>,
        platform.Foundation.NSAssertionHandlerMeta {
    }
}

open expect class NSAssertionHandlerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3706")
    open external override /*1*/ fun alloc(): platform.Foundation.NSAssertionHandler?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3704")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSAssertionHandler?

    @kotlinx.cinterop.ObjCMethod(selector = "currentHandler", bridge = "objcKniBridge3700")
    open external fun currentHandler(): platform.Foundation.NSAssertionHandler

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3702")
    open external override /*1*/ fun new(): platform.Foundation.NSAssertionHandler?

    final val currentHandler: platform.Foundation.NSAssertionHandler
}

open expect class NSAttributedString : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge2068")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2072")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2064")
    open external override /*1*/ fun init(): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2066")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge2070")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "string", bridge = "objcKniBridge2062")
    open external fun string(): kotlin.String

    final val string: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSAttributedString>,
        platform.Foundation.NSAttributedStringMeta {
    }
}

open expect class NSAttributedStringMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2056")
    open external override /*1*/ fun alloc(): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2054")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2052")
    open external override /*1*/ fun new(): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2058")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSBlockOperation : platform.Foundation.NSOperation {
    @kotlinx.cinterop.ObjCMethod(selector = "addExecutionBlock:", bridge = "objcKniBridge5260")
    open external fun addExecutionBlock(/*0*/ block: () -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "executionBlocks", bridge = "objcKniBridge5262")
    open external fun executionBlocks(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5264")
    open external override /*1*/ fun init(): platform.Foundation.NSBlockOperation?

    final val executionBlocks: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSBlockOperation>,
        platform.Foundation.NSBlockOperationMeta {
    }
}

open expect class NSBlockOperationMeta : platform.Foundation.NSOperationMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5258")
    open external override /*1*/ fun alloc(): platform.Foundation.NSBlockOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5256")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSBlockOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "blockOperationWithBlock:", bridge = "objcKniBridge5252")
    open external fun blockOperationWithBlock(/*0*/ block: () -> kotlin.Unit): platform.Foundation.NSBlockOperation

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5254")
    open external override /*1*/ fun new(): platform.Foundation.NSBlockOperation?
}

open expect class NSBundle : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "URLForAuxiliaryExecutable:", bridge = "objcKniBridge1478")
    open external fun URLForAuxiliaryExecutable(/*0*/ executableName: kotlin.String): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "URLForResource:withExtension:", bridge = "objcKniBridge1482")
    open external fun URLForResource(/*0*/ name: kotlin.String?, /*1*/
                                           withExtension: kotlin.String?
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "URLForResource:withExtension:subdirectory:", bridge = "objcKniBridge1484")
    open external fun URLForResource(/*0*/ name: kotlin.String?, /*1*/
                                           withExtension: kotlin.String?, /*2*/
                                           subdirectory: kotlin.String?
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(
        selector = "URLForResource:withExtension:subdirectory:localization:",
        bridge = "objcKniBridge1486"
    )
    open external fun URLForResource(/*0*/ name: kotlin.String?, /*1*/
                                           withExtension: kotlin.String?, /*2*/
                                           subdirectory: kotlin.String?, /*3*/
                                           localization: kotlin.String?
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "URLsForResourcesWithExtension:subdirectory:", bridge = "objcKniBridge1488")
    open external fun URLsForResourcesWithExtension(/*0*/ ext: kotlin.String?, /*1*/
                                                          subdirectory: kotlin.String?
    ): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(
        selector = "URLsForResourcesWithExtension:subdirectory:localization:",
        bridge = "objcKniBridge1490"
    )
    open external fun URLsForResourcesWithExtension(/*0*/ ext: kotlin.String?, /*1*/
                                                          subdirectory: kotlin.String?, /*2*/
                                                          localization: kotlin.String?
    ): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "appStoreReceiptURL", bridge = "objcKniBridge1524")
    open external fun appStoreReceiptURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "builtInPlugInsPath", bridge = "objcKniBridge1538")
    open external fun builtInPlugInsPath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "builtInPlugInsURL", bridge = "objcKniBridge1522")
    open external fun builtInPlugInsURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "bundleIdentifier", bridge = "objcKniBridge1540")
    open external fun bundleIdentifier(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "bundlePath", bridge = "objcKniBridge1526")
    open external fun bundlePath(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "bundleURL", bridge = "objcKniBridge1510")
    open external fun bundleURL(): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "classNamed:", bridge = "objcKniBridge1506")
    open external fun classNamed(/*0*/ className: kotlin.String): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "developmentLocalization", bridge = "objcKniBridge1552")
    open external fun developmentLocalization(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "executableArchitectures", bridge = "objcKniBridge1554")
    open external fun executableArchitectures(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "executablePath", bridge = "objcKniBridge1530")
    open external fun executablePath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "executableURL", bridge = "objcKniBridge1514")
    open external fun executableURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "infoDictionary", bridge = "objcKniBridge1542")
    open external fun infoDictionary(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1556")
    open external override /*1*/ fun init(): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithPath:", bridge = "objcKniBridge1466")
    open external fun initWithPath(/*0*/ path: kotlin.String): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithURL:", bridge = "objcKniBridge1468")
    open external fun initWithURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "isLoaded", bridge = "objcKniBridge1508")
    open external fun isLoaded(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "load", bridge = "objcKniBridge1470")
    open external fun load(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "loadAndReturnError:", bridge = "objcKniBridge1476")
    open external fun loadAndReturnError(/*0*/ error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "localizations", bridge = "objcKniBridge1550")
    open external fun localizations(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "localizedInfoDictionary", bridge = "objcKniBridge1544")
    open external fun localizedInfoDictionary(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "localizedStringForKey:value:table:", bridge = "objcKniBridge1502")
    open external fun localizedStringForKey(/*0*/ key: kotlin.String, /*1*/
                                                  value: kotlin.String?, /*2*/
                                                  table: kotlin.String?
    ): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "objectForInfoDictionaryKey:", bridge = "objcKniBridge1504")
    open external fun objectForInfoDictionaryKey(/*0*/ key: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "pathForAuxiliaryExecutable:", bridge = "objcKniBridge1480")
    open external fun pathForAuxiliaryExecutable(/*0*/ executableName: kotlin.String): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "pathForResource:ofType:", bridge = "objcKniBridge1492")
    open external fun pathForResource(/*0*/ name: kotlin.String?, /*1*/ ofType: kotlin.String?): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "pathForResource:ofType:inDirectory:", bridge = "objcKniBridge1494")
    open external fun pathForResource(/*0*/ name: kotlin.String?, /*1*/
                                            ofType: kotlin.String?, /*2*/
                                            inDirectory: kotlin.String?
    ): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(
        selector = "pathForResource:ofType:inDirectory:forLocalization:",
        bridge = "objcKniBridge1496"
    )
    open external fun pathForResource(/*0*/ name: kotlin.String?, /*1*/
                                            ofType: kotlin.String?, /*2*/
                                            inDirectory: kotlin.String?, /*3*/
                                            forLocalization: kotlin.String?
    ): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "pathsForResourcesOfType:inDirectory:", bridge = "objcKniBridge1498")
    open external fun pathsForResourcesOfType(/*0*/ ext: kotlin.String?, /*1*/
                                                    inDirectory: kotlin.String?
    ): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(
        selector = "pathsForResourcesOfType:inDirectory:forLocalization:",
        bridge = "objcKniBridge1500"
    )
    open external fun pathsForResourcesOfType(/*0*/ ext: kotlin.String?, /*1*/
                                                    inDirectory: kotlin.String?, /*2*/
                                                    forLocalization: kotlin.String?
    ): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "preferredLocalizations", bridge = "objcKniBridge1548")
    open external fun preferredLocalizations(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "preflightAndReturnError:", bridge = "objcKniBridge1474")
    open external fun preflightAndReturnError(/*0*/ error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "principalClass", bridge = "objcKniBridge1546")
    open external fun principalClass(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "privateFrameworksPath", bridge = "objcKniBridge1532")
    open external fun privateFrameworksPath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "privateFrameworksURL", bridge = "objcKniBridge1516")
    open external fun privateFrameworksURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "resourcePath", bridge = "objcKniBridge1528")
    open external fun resourcePath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "resourceURL", bridge = "objcKniBridge1512")
    open external fun resourceURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "sharedFrameworksPath", bridge = "objcKniBridge1534")
    open external fun sharedFrameworksPath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "sharedFrameworksURL", bridge = "objcKniBridge1518")
    open external fun sharedFrameworksURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "sharedSupportPath", bridge = "objcKniBridge1536")
    open external fun sharedSupportPath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "sharedSupportURL", bridge = "objcKniBridge1520")
    open external fun sharedSupportURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "unload", bridge = "objcKniBridge1472")
    open external fun unload(): kotlin.Boolean

    final val appStoreReceiptURL: platform.Foundation.NSURL?

    final val builtInPlugInsPath: kotlin.String?

    final val builtInPlugInsURL: platform.Foundation.NSURL?

    final val bundleIdentifier: kotlin.String?

    final val bundlePath: kotlin.String

    final val bundleURL: platform.Foundation.NSURL

    final val developmentLocalization: kotlin.String?

    final val executableArchitectures: kotlin.collections.List<*>?

    final val executablePath: kotlin.String?

    final val executableURL: platform.Foundation.NSURL?

    final val infoDictionary: kotlin.collections.Map<kotlin.Any?, *>?

    final val loaded: kotlin.Boolean

    final val localizations: kotlin.collections.List<*>

    final val localizedInfoDictionary: kotlin.collections.Map<kotlin.Any?, *>?

    final val preferredLocalizations: kotlin.collections.List<*>

    final val principalClass: kotlinx.cinterop.ObjCClass?

    final val privateFrameworksPath: kotlin.String?

    final val privateFrameworksURL: platform.Foundation.NSURL?

    final val resourcePath: kotlin.String?

    final val resourceURL: platform.Foundation.NSURL?

    final val sharedFrameworksPath: kotlin.String?

    final val sharedFrameworksURL: platform.Foundation.NSURL?

    final val sharedSupportPath: kotlin.String?

    final val sharedSupportURL: platform.Foundation.NSURL?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSBundle>,
        platform.Foundation.NSBundleMeta {
    }
}

open expect class NSBundleMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLForResource:withExtension:subdirectory:inBundleWithURL:",
        bridge = "objcKniBridge1442"
    )
    open external fun URLForResource(/*0*/ name: kotlin.String?, /*1*/
                                           withExtension: kotlin.String?, /*2*/
                                           subdirectory: kotlin.String?, /*3*/
                                           inBundleWithURL: platform.Foundation.NSURL
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(
        selector = "URLsForResourcesWithExtension:subdirectory:inBundleWithURL:",
        bridge = "objcKniBridge1444"
    )
    open external fun URLsForResourcesWithExtension(/*0*/ ext: kotlin.String?, /*1*/
                                                          subdirectory: kotlin.String?, /*2*/
                                                          inBundleWithURL: platform.Foundation.NSURL
    ): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "allBundles", bridge = "objcKniBridge1456")
    open external fun allBundles(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "allFrameworks", bridge = "objcKniBridge1458")
    open external fun allFrameworks(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1464")
    open external override /*1*/ fun alloc(): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1462")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "bundleForClass:", bridge = "objcKniBridge1438")
    open external fun bundleForClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass): platform.Foundation.NSBundle

    @kotlinx.cinterop.ObjCMethod(selector = "bundleWithIdentifier:", bridge = "objcKniBridge1440")
    open external fun bundleWithIdentifier(/*0*/ identifier: kotlin.String): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "bundleWithPath:", bridge = "objcKniBridge1434")
    open external fun bundleWithPath(/*0*/ path: kotlin.String): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "bundleWithURL:", bridge = "objcKniBridge1436")
    open external fun bundleWithURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "mainBundle", bridge = "objcKniBridge1454")
    open external fun mainBundle(): platform.Foundation.NSBundle

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1460")
    open external override /*1*/ fun new(): platform.Foundation.NSBundle?

    @kotlinx.cinterop.ObjCMethod(selector = "pathForResource:ofType:inDirectory:", bridge = "objcKniBridge1446")
    open external fun pathForResource(/*0*/ name: kotlin.String?, /*1*/
                                            ofType: kotlin.String?, /*2*/
                                            inDirectory: kotlin.String
    ): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "pathsForResourcesOfType:inDirectory:", bridge = "objcKniBridge1448")
    open external fun pathsForResourcesOfType(/*0*/ ext: kotlin.String?, /*1*/
                                                    inDirectory: kotlin.String
    ): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "preferredLocalizationsFromArray:", bridge = "objcKniBridge1450")
    open external fun preferredLocalizationsFromArray(/*0*/ localizationsArray: kotlin.collections.List<*>): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(
        selector = "preferredLocalizationsFromArray:forPreferences:",
        bridge = "objcKniBridge1452"
    )
    open external fun preferredLocalizationsFromArray(/*0*/ localizationsArray: kotlin.collections.List<*>, /*1*/
                                                            forPreferences: kotlin.collections.List<*>?
    ): kotlin.collections.List<*>

    final val allBundles: kotlin.collections.List<*>

    final val allFrameworks: kotlin.collections.List<*>

    final val mainBundle: platform.Foundation.NSBundle
}

open expect class NSByteCountFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "allowsNonnumericFormatting", bridge = "objcKniBridge6166")
    open external fun allowsNonnumericFormatting(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "includesActualByteCount", bridge = "objcKniBridge6178")
    open external fun includesActualByteCount(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "includesCount", bridge = "objcKniBridge6174")
    open external fun includesCount(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "includesUnit", bridge = "objcKniBridge6170")
    open external fun includesUnit(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6194")
    open external override /*1*/ fun init(): platform.Foundation.NSByteCountFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6196")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSByteCountFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "isAdaptive", bridge = "objcKniBridge6182")
    open external fun isAdaptive(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setAdaptive:", bridge = "objcKniBridge6184")
    open external fun setAdaptive(/*0*/ adaptive: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setAllowsNonnumericFormatting:", bridge = "objcKniBridge6168")
    open external fun setAllowsNonnumericFormatting(/*0*/ allowsNonnumericFormatting: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesActualByteCount:", bridge = "objcKniBridge6180")
    open external fun setIncludesActualByteCount(/*0*/ includesActualByteCount: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesCount:", bridge = "objcKniBridge6176")
    open external fun setIncludesCount(/*0*/ includesCount: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesUnit:", bridge = "objcKniBridge6172")
    open external fun setIncludesUnit(/*0*/ includesUnit: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setZeroPadsFractionDigits:", bridge = "objcKniBridge6188")
    open external fun setZeroPadsFractionDigits(/*0*/ zeroPadsFractionDigits: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromByteCount:", bridge = "objcKniBridge6156")
    open external fun stringFromByteCount(/*0*/ byteCount: kotlin.Long): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "zeroPadsFractionDigits", bridge = "objcKniBridge6186")
    open external fun zeroPadsFractionDigits(): kotlin.Boolean

    final var adaptive: kotlin.Boolean

    final var allowsNonnumericFormatting: kotlin.Boolean

    final var includesActualByteCount: kotlin.Boolean

    final var includesCount: kotlin.Boolean

    final var includesUnit: kotlin.Boolean

    final var zeroPadsFractionDigits: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSByteCountFormatter>,
        platform.Foundation.NSByteCountFormatterMeta {
    }
}

open expect class NSByteCountFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6154")
    open external override /*1*/ fun alloc(): platform.Foundation.NSByteCountFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6152")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSByteCountFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6150")
    open external override /*1*/ fun new(): platform.Foundation.NSByteCountFormatter?
}

open expect class NSCache : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge6218")
    open external fun delegate(): platform.Foundation.NSCacheDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "evictsObjectsWithDiscardedContent", bridge = "objcKniBridge6230")
    open external fun evictsObjectsWithDiscardedContent(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6234")
    open external override /*1*/ fun init(): platform.Foundation.NSCache?

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge6214")
    open external fun name(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "objectForKey:", bridge = "objcKniBridge6204")
    open external fun objectForKey(/*0*/ key: kotlin.Any?): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge6212")
    open external fun removeAllObjects()

    @kotlinx.cinterop.ObjCMethod(selector = "removeObjectForKey:", bridge = "objcKniBridge6210")
    open external fun removeObjectForKey(/*0*/ key: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge6220")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSCacheDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setEvictsObjectsWithDiscardedContent:", bridge = "objcKniBridge6232")
    open external fun setEvictsObjectsWithDiscardedContent(/*0*/ evictsObjectsWithDiscardedContent: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge6216")
    open external fun setName(/*0*/ name: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setObject:forKey:", bridge = "objcKniBridge6206")
    open external fun setObject(/*0*/ obj: kotlin.Any?, /*1*/ forKey: kotlin.Any?)

    final var delegate: platform.Foundation.NSCacheDelegateProtocol?

    final var evictsObjectsWithDiscardedContent: kotlin.Boolean

    final var name: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCache>,
        platform.Foundation.NSCacheMeta {
    }
}

expect interface NSCacheDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSCacheDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSCacheMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6202")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCache?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6200")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCache?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6198")
    open external override /*1*/ fun new(): platform.Foundation.NSCache?
}

open expect class NSCachedURLResponse : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5780")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "data", bridge = "objcKniBridge5768")
    open external fun data(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5778")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5774")
    open external override /*1*/ fun init(): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5776")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithResponse:data:", bridge = "objcKniBridge5762")
    open external fun initWithResponse(/*0*/ response: platform.Foundation.NSURLResponse, /*1*/
                                             data: platform.Foundation.NSData
    ): platform.Foundation.NSCachedURLResponse

    @kotlinx.cinterop.ObjCMethod(
        selector = "initWithResponse:data:userInfo:storagePolicy:",
        bridge = "objcKniBridge5764"
    )
    open external fun initWithResponse(/*0*/ response: platform.Foundation.NSURLResponse, /*1*/
                                             data: platform.Foundation.NSData, /*2*/
                                             userInfo: kotlin.collections.Map<kotlin.Any?, *>?, /*3*/
                                             storagePolicy: platform.Foundation.NSURLCacheStoragePolicy
    ): platform.Foundation.NSCachedURLResponse

    @kotlinx.cinterop.ObjCMethod(selector = "response", bridge = "objcKniBridge5766")
    open external fun response(): platform.Foundation.NSURLResponse

    @kotlinx.cinterop.ObjCMethod(selector = "storagePolicy", bridge = "objcKniBridge5772")
    open external fun storagePolicy(): platform.Foundation.NSURLCacheStoragePolicy

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge5770")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>?

    final val data: platform.Foundation.NSData

    final val response: platform.Foundation.NSURLResponse

    final val storagePolicy: platform.Foundation.NSURLCacheStoragePolicy

    final val userInfo: kotlin.collections.Map<kotlin.Any?, *>?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCachedURLResponse>,
        platform.Foundation.NSCachedURLResponseMeta {
    }
}

open expect class NSCachedURLResponseMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSSecureCodingProtocolMeta, platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5758")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5756")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5754")
    open external override /*1*/ fun new(): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5760")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSCalendar : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "AMSymbol", bridge = "objcKniBridge1774")
    open external fun AMSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "PMSymbol", bridge = "objcKniBridge1776")
    open external fun PMSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "componentsInTimeZone:fromDate:", bridge = "objcKniBridge1682")
    open external fun componentsInTimeZone(/*0*/ timezone: platform.Foundation.NSTimeZone, /*1*/
                                                 fromDate: platform.Foundation.NSDate
    ): platform.Foundation.NSDateComponents

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1782")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "date:matchesComponents:", bridge = "objcKniBridge1718")
    open external fun date(/*0*/ date: platform.Foundation.NSDate, /*1*/
                                 matchesComponents: platform.Foundation.NSDateComponents
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "dateFromComponents:", bridge = "objcKniBridge1660")
    open external fun dateFromComponents(/*0*/ comps: platform.Foundation.NSDateComponents): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1784")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "eraSymbols", bridge = "objcKniBridge1738")
    open external fun eraSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1778")
    open external override /*1*/ fun init(): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1780")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "isDate:inSameDayAsDate:", bridge = "objcKniBridge1688")
    open external fun isDate(/*0*/ date1: platform.Foundation.NSDate, /*1*/
                                   inSameDayAsDate: platform.Foundation.NSDate
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isDateInToday:", bridge = "objcKniBridge1690")
    open external fun isDateInToday(/*0*/ date: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isDateInTomorrow:", bridge = "objcKniBridge1694")
    open external fun isDateInTomorrow(/*0*/ date: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isDateInWeekend:", bridge = "objcKniBridge1696")
    open external fun isDateInWeekend(/*0*/ date: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isDateInYesterday:", bridge = "objcKniBridge1692")
    open external fun isDateInYesterday(/*0*/ date: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "locale", bridge = "objcKniBridge1722")
    open external fun locale(): platform.Foundation.NSLocale?

    @kotlinx.cinterop.ObjCMethod(selector = "longEraSymbols", bridge = "objcKniBridge1740")
    open external fun longEraSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "monthSymbols", bridge = "objcKniBridge1742")
    open external fun monthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "quarterSymbols", bridge = "objcKniBridge1766")
    open external fun quarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "setLocale:", bridge = "objcKniBridge1724")
    open external fun setLocale(/*0*/ locale: platform.Foundation.NSLocale?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTimeZone:", bridge = "objcKniBridge1728")
    open external fun setTimeZone(/*0*/ timeZone: platform.Foundation.NSTimeZone)

    @kotlinx.cinterop.ObjCMethod(selector = "shortMonthSymbols", bridge = "objcKniBridge1744")
    open external fun shortMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortQuarterSymbols", bridge = "objcKniBridge1768")
    open external fun shortQuarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortStandaloneMonthSymbols", bridge = "objcKniBridge1750")
    open external fun shortStandaloneMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortStandaloneQuarterSymbols", bridge = "objcKniBridge1772")
    open external fun shortStandaloneQuarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortStandaloneWeekdaySymbols", bridge = "objcKniBridge1762")
    open external fun shortStandaloneWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortWeekdaySymbols", bridge = "objcKniBridge1756")
    open external fun shortWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "standaloneMonthSymbols", bridge = "objcKniBridge1748")
    open external fun standaloneMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "standaloneQuarterSymbols", bridge = "objcKniBridge1770")
    open external fun standaloneQuarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "standaloneWeekdaySymbols", bridge = "objcKniBridge1760")
    open external fun standaloneWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "startOfDayForDate:", bridge = "objcKniBridge1680")
    open external fun startOfDayForDate(/*0*/ date: platform.Foundation.NSDate): platform.Foundation.NSDate

    @kotlinx.cinterop.ObjCMethod(selector = "timeZone", bridge = "objcKniBridge1726")
    open external fun timeZone(): platform.Foundation.NSTimeZone

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortMonthSymbols", bridge = "objcKniBridge1746")
    open external fun veryShortMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortStandaloneMonthSymbols", bridge = "objcKniBridge1752")
    open external fun veryShortStandaloneMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortStandaloneWeekdaySymbols", bridge = "objcKniBridge1764")
    open external fun veryShortStandaloneWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortWeekdaySymbols", bridge = "objcKniBridge1758")
    open external fun veryShortWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "weekdaySymbols", bridge = "objcKniBridge1754")
    open external fun weekdaySymbols(): kotlin.collections.List<*>

    final val AMSymbol: kotlin.String

    final val PMSymbol: kotlin.String

    final val eraSymbols: kotlin.collections.List<*>

    final var locale: platform.Foundation.NSLocale?

    final val longEraSymbols: kotlin.collections.List<*>

    final val monthSymbols: kotlin.collections.List<*>

    final val quarterSymbols: kotlin.collections.List<*>

    final val shortMonthSymbols: kotlin.collections.List<*>

    final val shortQuarterSymbols: kotlin.collections.List<*>

    final val shortStandaloneMonthSymbols: kotlin.collections.List<*>

    final val shortStandaloneQuarterSymbols: kotlin.collections.List<*>

    final val shortStandaloneWeekdaySymbols: kotlin.collections.List<*>

    final val shortWeekdaySymbols: kotlin.collections.List<*>

    final val standaloneMonthSymbols: kotlin.collections.List<*>

    final val standaloneQuarterSymbols: kotlin.collections.List<*>

    final val standaloneWeekdaySymbols: kotlin.collections.List<*>

    final var timeZone: platform.Foundation.NSTimeZone

    final val veryShortMonthSymbols: kotlin.collections.List<*>

    final val veryShortStandaloneMonthSymbols: kotlin.collections.List<*>

    final val veryShortStandaloneWeekdaySymbols: kotlin.collections.List<*>

    final val veryShortWeekdaySymbols: kotlin.collections.List<*>

    final val weekdaySymbols: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCalendar>,
        platform.Foundation.NSCalendarMeta {
    }
}

open expect class NSCalendarMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1644")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1642")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "autoupdatingCurrentCalendar", bridge = "objcKniBridge1638")
    open external fun autoupdatingCurrentCalendar(): platform.Foundation.NSCalendar

    @kotlinx.cinterop.ObjCMethod(selector = "currentCalendar", bridge = "objcKniBridge1636")
    open external fun currentCalendar(): platform.Foundation.NSCalendar

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1640")
    open external override /*1*/ fun new(): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1646")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean

    final val autoupdatingCurrentCalendar: platform.Foundation.NSCalendar

    final val currentCalendar: platform.Foundation.NSCalendar
}

open expect class NSCharacterSet : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "bitmapRepresentation", bridge = "objcKniBridge1192")
    open external fun bitmapRepresentation(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1198")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1202")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1196")
    open external override /*1*/ fun init(): platform.Foundation.NSCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1182")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "invertedSet", bridge = "objcKniBridge1194")
    open external fun invertedSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "isSupersetOfSet:", bridge = "objcKniBridge1188")
    open external fun isSupersetOfSet(/*0*/ theOtherSet: platform.Foundation.NSCharacterSet): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge1200")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    final val bitmapRepresentation: platform.Foundation.NSData

    final val invertedSet: platform.Foundation.NSCharacterSet

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCharacterSet>,
        platform.Foundation.NSCharacterSetMeta {
    }
}

open expect class NSCharacterSetMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1178")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1176")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "alphanumericCharacterSet", bridge = "objcKniBridge1160")
    open external fun alphanumericCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "capitalizedLetterCharacterSet", bridge = "objcKniBridge1168")
    open external fun capitalizedLetterCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithBitmapRepresentation:", bridge = "objcKniBridge1140")
    open external fun characterSetWithBitmapRepresentation(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithCharactersInString:", bridge = "objcKniBridge1138")
    open external fun characterSetWithCharactersInString(/*0*/ aString: kotlin.String): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithContentsOfFile:", bridge = "objcKniBridge1142")
    open external fun characterSetWithContentsOfFile(/*0*/ fName: kotlin.String): platform.Foundation.NSCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithRange:", bridge = "objcKniBridge1136")
    open external fun characterSetWithRange(/*0*/ aRange: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "controlCharacterSet", bridge = "objcKniBridge1144")
    open external fun controlCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "decimalDigitCharacterSet", bridge = "objcKniBridge1150")
    open external fun decimalDigitCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "decomposableCharacterSet", bridge = "objcKniBridge1162")
    open external fun decomposableCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "illegalCharacterSet", bridge = "objcKniBridge1164")
    open external fun illegalCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "letterCharacterSet", bridge = "objcKniBridge1152")
    open external fun letterCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "lowercaseLetterCharacterSet", bridge = "objcKniBridge1154")
    open external fun lowercaseLetterCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1174")
    open external override /*1*/ fun new(): platform.Foundation.NSCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "newlineCharacterSet", bridge = "objcKniBridge1172")
    open external fun newlineCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "nonBaseCharacterSet", bridge = "objcKniBridge1158")
    open external fun nonBaseCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "punctuationCharacterSet", bridge = "objcKniBridge1166")
    open external fun punctuationCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1180")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "symbolCharacterSet", bridge = "objcKniBridge1170")
    open external fun symbolCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "uppercaseLetterCharacterSet", bridge = "objcKniBridge1156")
    open external fun uppercaseLetterCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "whitespaceAndNewlineCharacterSet", bridge = "objcKniBridge1148")
    open external fun whitespaceAndNewlineCharacterSet(): platform.Foundation.NSCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "whitespaceCharacterSet", bridge = "objcKniBridge1146")
    open external fun whitespaceCharacterSet(): platform.Foundation.NSCharacterSet

    final val alphanumericCharacterSet: platform.Foundation.NSCharacterSet

    final val capitalizedLetterCharacterSet: platform.Foundation.NSCharacterSet

    final val controlCharacterSet: platform.Foundation.NSCharacterSet

    final val decimalDigitCharacterSet: platform.Foundation.NSCharacterSet

    final val decomposableCharacterSet: platform.Foundation.NSCharacterSet

    final val illegalCharacterSet: platform.Foundation.NSCharacterSet

    final val letterCharacterSet: platform.Foundation.NSCharacterSet

    final val lowercaseLetterCharacterSet: platform.Foundation.NSCharacterSet

    final val newlineCharacterSet: platform.Foundation.NSCharacterSet

    final val nonBaseCharacterSet: platform.Foundation.NSCharacterSet

    final val punctuationCharacterSet: platform.Foundation.NSCharacterSet

    final val symbolCharacterSet: platform.Foundation.NSCharacterSet

    final val uppercaseLetterCharacterSet: platform.Foundation.NSCharacterSet

    final val whitespaceAndNewlineCharacterSet: platform.Foundation.NSCharacterSet

    final val whitespaceCharacterSet: platform.Foundation.NSCharacterSet
}

open expect class NSCoder : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "decodeDataObject", bridge = "objcKniBridge472")
    open external fun decodeDataObject(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeDataObject:", bridge = "objcKniBridge470")
    open external fun encodeDataObject(/*0*/ data: platform.Foundation.NSData)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge478")
    open external override /*1*/ fun init(): platform.Foundation.NSCoder?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCoder>,
        platform.Foundation.NSCoderMeta {
    }
}

open expect class NSCoderMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge466")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCoder?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge464")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCoder?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge462")
    open external override /*1*/ fun new(): platform.Foundation.NSCoder?
}

expect interface NSCodingProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge13")
    fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge15")
    fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSCodingProtocol?
}

expect interface NSCodingProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

open expect class NSComparisonPredicate : platform.Foundation.NSPredicate {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6302")
    open external override /*1*/ fun init(): platform.Foundation.NSComparisonPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6286")
    open external override /*1*/ fun initWithCoder(/*0*/ coder: platform.Foundation.NSCoder): platform.Foundation.NSComparisonPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "leftExpression", bridge = "objcKniBridge6292")
    open external fun leftExpression(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithSubstitutionVariables:", bridge = "objcKniBridge6300")
    open external override /*1*/ fun predicateWithSubstitutionVariables(/*0*/ variables: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSComparisonPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "rightExpression", bridge = "objcKniBridge6294")
    open external fun rightExpression(): platform.Foundation.NSExpression

    final val leftExpression: platform.Foundation.NSExpression

    final val rightExpression: platform.Foundation.NSExpression

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSComparisonPredicate>,
        platform.Foundation.NSComparisonPredicateMeta {
    }
}

open expect class NSComparisonPredicateMeta : platform.Foundation.NSPredicateMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6280")
    open external override /*1*/ fun alloc(): platform.Foundation.NSComparisonPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6278")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSComparisonPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6276")
    open external override /*1*/ fun new(): platform.Foundation.NSComparisonPredicate?
}

open expect class NSCompoundPredicate : platform.Foundation.NSPredicate {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6410")
    open external override /*1*/ fun init(): platform.Foundation.NSCompoundPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6402")
    open external override /*1*/ fun initWithCoder(/*0*/ coder: platform.Foundation.NSCoder): platform.Foundation.NSCompoundPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithSubstitutionVariables:", bridge = "objcKniBridge6408")
    open external override /*1*/ fun predicateWithSubstitutionVariables(/*0*/ variables: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSCompoundPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "subpredicates", bridge = "objcKniBridge6406")
    open external fun subpredicates(): kotlin.collections.List<*>

    final val subpredicates: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCompoundPredicate>,
        platform.Foundation.NSCompoundPredicateMeta {
    }
}

open expect class NSCompoundPredicateMeta : platform.Foundation.NSPredicateMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6398")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCompoundPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6396")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCompoundPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "andPredicateWithSubpredicates:", bridge = "objcKniBridge6388")
    open external fun andPredicateWithSubpredicates(/*0*/ subpredicates: kotlin.collections.List<*>): platform.Foundation.NSCompoundPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6394")
    open external override /*1*/ fun new(): platform.Foundation.NSCompoundPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "notPredicateWithSubpredicate:", bridge = "objcKniBridge6392")
    open external fun notPredicateWithSubpredicate(/*0*/ predicate: platform.Foundation.NSPredicate): platform.Foundation.NSCompoundPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "orPredicateWithSubpredicates:", bridge = "objcKniBridge6390")
    open external fun orPredicateWithSubpredicates(/*0*/ subpredicates: kotlin.collections.List<*>): platform.Foundation.NSCompoundPredicate
}

open expect class NSCondition : platform.darwin.NSObject, platform.Foundation.NSLockingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "broadcast", bridge = "objcKniBridge5152")
    open external fun broadcast()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5158")
    open external override /*1*/ fun init(): platform.Foundation.NSCondition?

    @kotlinx.cinterop.ObjCMethod(selector = "lock", bridge = "objcKniBridge5160")
    open external override /*1*/ fun lock()

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge5154")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge5156")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "signal", bridge = "objcKniBridge5150")
    open external fun signal()

    @kotlinx.cinterop.ObjCMethod(selector = "unlock", bridge = "objcKniBridge5162")
    open external override /*1*/ fun unlock()

    @kotlinx.cinterop.ObjCMethod(selector = "wait", bridge = "objcKniBridge5146")
    open external fun wait()

    @kotlinx.cinterop.ObjCMethod(selector = "waitUntilDate:", bridge = "objcKniBridge5148")
    open external fun waitUntilDate(/*0*/ limit: platform.Foundation.NSDate): kotlin.Boolean

    final var name: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCondition>,
        platform.Foundation.NSConditionMeta {
    }
}

open expect class NSConditionLock : platform.darwin.NSObject, platform.Foundation.NSLockingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5114")
    open external override /*1*/ fun init(): platform.Foundation.NSConditionLock?

    @kotlinx.cinterop.ObjCMethod(selector = "lock", bridge = "objcKniBridge5116")
    open external override /*1*/ fun lock()

    @kotlinx.cinterop.ObjCMethod(selector = "lockBeforeDate:", bridge = "objcKniBridge5104")
    open external fun lockBeforeDate(/*0*/ limit: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge5110")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge5112")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "tryLock", bridge = "objcKniBridge5098")
    open external fun tryLock(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "unlock", bridge = "objcKniBridge5118")
    open external override /*1*/ fun unlock()

    final var name: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSConditionLock>,
        platform.Foundation.NSConditionLockMeta {
    }
}

open expect class NSConditionLockMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSLockingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5092")
    open external override /*1*/ fun alloc(): platform.Foundation.NSConditionLock?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5090")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSConditionLock?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5088")
    open external override /*1*/ fun new(): platform.Foundation.NSConditionLock?
}

open expect class NSConditionMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSLockingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5144")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCondition?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5142")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCondition?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5140")
    open external override /*1*/ fun new(): platform.Foundation.NSCondition?
}

expect interface NSCopyingProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge2")
    fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any
}

expect interface NSCopyingProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

open expect class NSCountedSet : platform.Foundation.NSMutableSet {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1282")
    open external override /*1*/ fun init(): platform.Foundation.NSCountedSet

    @kotlinx.cinterop.ObjCMethod(selector = "initWithArray:", bridge = "objcKniBridge1274")
    open external fun initWithArray(/*0*/ array: kotlin.collections.List<*>): platform.Foundation.NSCountedSet

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1280")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSCountedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSet:", bridge = "objcKniBridge1276")
    open external fun initWithSet(/*0*/ set: kotlin.collections.Set<*>): platform.Foundation.NSCountedSet

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSCountedSet>,
        platform.Foundation.NSCountedSetMeta {
    }
}

open expect class NSCountedSetMeta : platform.Foundation.NSMutableSetMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1272")
    open external override /*1*/ fun alloc(): platform.Foundation.NSCountedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1270")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSCountedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1268")
    open external override /*1*/ fun new(): platform.Foundation.NSCountedSet?
}

open expect class NSData : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge496")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge500")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge492")
    open external override /*1*/ fun init(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge494")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge498")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSData>,
        platform.Foundation.NSDataMeta {
    }
}

open expect class NSDataDetector : platform.Foundation.NSRegularExpression {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5556")
    open external override /*1*/ fun init(): platform.Foundation.NSDataDetector?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5558")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDataDetector?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDataDetector>,
        platform.Foundation.NSDataDetectorMeta {
    }
}

open expect class NSDataDetectorMeta : platform.Foundation.NSRegularExpressionMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5548")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDataDetector?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5546")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDataDetector?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5544")
    open external override /*1*/ fun new(): platform.Foundation.NSDataDetector?
}

open expect class NSDataMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge484")
    open external override /*1*/ fun alloc(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge482")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge480")
    open external override /*1*/ fun new(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge486")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSDate : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1630")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1632")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1622")
    open external override /*1*/ fun init(): platform.Foundation.NSDate

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1626")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDate?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDate>,
        platform.Foundation.NSDateMeta {
    }
}

open expect class NSDateComponents : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "calendar", bridge = "objcKniBridge1804")
    open external fun calendar(): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1880")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "date", bridge = "objcKniBridge1872")
    open external fun date(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1882")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1876")
    open external override /*1*/ fun init(): platform.Foundation.NSDateComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1878")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDateComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "isLeapMonth", bridge = "objcKniBridge1868")
    open external fun isLeapMonth(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isValidDate", bridge = "objcKniBridge1874")
    open external fun isValidDate(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isValidDateInCalendar:", bridge = "objcKniBridge1802")
    open external fun isValidDateInCalendar(/*0*/ calendar: platform.Foundation.NSCalendar): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setCalendar:", bridge = "objcKniBridge1806")
    open external fun setCalendar(/*0*/ calendar: platform.Foundation.NSCalendar?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLeapMonth:", bridge = "objcKniBridge1870")
    open external fun setLeapMonth(/*0*/ leapMonth: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setTimeZone:", bridge = "objcKniBridge1810")
    open external fun setTimeZone(/*0*/ timeZone: platform.Foundation.NSTimeZone?)

    @kotlinx.cinterop.ObjCMethod(selector = "timeZone", bridge = "objcKniBridge1808")
    open external fun timeZone(): platform.Foundation.NSTimeZone?

    final var calendar: platform.Foundation.NSCalendar?

    final val date: platform.Foundation.NSDate?

    final var leapMonth: kotlin.Boolean

    final var timeZone: platform.Foundation.NSTimeZone?

    final val validDate: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDateComponents>,
        platform.Foundation.NSDateComponentsMeta {
    }
}

open expect class NSDateComponentsFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "allowsFractionalUnits", bridge = "objcKniBridge6446")
    open external fun allowsFractionalUnits(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "calendar", bridge = "objcKniBridge6438")
    open external fun calendar(): platform.Foundation.NSCalendar?

    @kotlinx.cinterop.ObjCMethod(selector = "collapsesLargestUnit", bridge = "objcKniBridge6454")
    open external fun collapsesLargestUnit(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "includesApproximationPhrase", bridge = "objcKniBridge6458")
    open external fun includesApproximationPhrase(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "includesTimeRemainingPhrase", bridge = "objcKniBridge6462")
    open external fun includesTimeRemainingPhrase(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6470")
    open external override /*1*/ fun init(): platform.Foundation.NSDateComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6472")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDateComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "referenceDate", bridge = "objcKniBridge6442")
    open external fun referenceDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "setAllowsFractionalUnits:", bridge = "objcKniBridge6448")
    open external fun setAllowsFractionalUnits(/*0*/ allowsFractionalUnits: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setCalendar:", bridge = "objcKniBridge6440")
    open external fun setCalendar(/*0*/ calendar: platform.Foundation.NSCalendar?)

    @kotlinx.cinterop.ObjCMethod(selector = "setCollapsesLargestUnit:", bridge = "objcKniBridge6456")
    open external fun setCollapsesLargestUnit(/*0*/ collapsesLargestUnit: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesApproximationPhrase:", bridge = "objcKniBridge6460")
    open external fun setIncludesApproximationPhrase(/*0*/ includesApproximationPhrase: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesTimeRemainingPhrase:", bridge = "objcKniBridge6464")
    open external fun setIncludesTimeRemainingPhrase(/*0*/ includesTimeRemainingPhrase: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setReferenceDate:", bridge = "objcKniBridge6444")
    open external fun setReferenceDate(/*0*/ referenceDate: platform.Foundation.NSDate?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromDate:toDate:", bridge = "objcKniBridge6422")
    open external fun stringFromDate(/*0*/ startDate: platform.Foundation.NSDate, /*1*/
                                           toDate: platform.Foundation.NSDate
    ): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromDateComponents:", bridge = "objcKniBridge6420")
    open external fun stringFromDateComponents(/*0*/ components: platform.Foundation.NSDateComponents): kotlin.String?

    final var allowsFractionalUnits: kotlin.Boolean

    final var calendar: platform.Foundation.NSCalendar?

    final var collapsesLargestUnit: kotlin.Boolean

    final var includesApproximationPhrase: kotlin.Boolean

    final var includesTimeRemainingPhrase: kotlin.Boolean

    final var referenceDate: platform.Foundation.NSDate?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDateComponentsFormatter>,
        platform.Foundation.NSDateComponentsFormatterMeta {
    }
}

open expect class NSDateComponentsFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6418")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDateComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6416")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDateComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6414")
    open external override /*1*/ fun new(): platform.Foundation.NSDateComponentsFormatter?
}

open expect class NSDateComponentsMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1790")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDateComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1788")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDateComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1786")
    open external override /*1*/ fun new(): platform.Foundation.NSDateComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1792")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSDateFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "AMSymbol", bridge = "objcKniBridge2204")
    open external fun AMSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "PMSymbol", bridge = "objcKniBridge2208")
    open external fun PMSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "calendar", bridge = "objcKniBridge2168")
    open external fun calendar(): platform.Foundation.NSCalendar

    @kotlinx.cinterop.ObjCMethod(selector = "dateFormat", bridge = "objcKniBridge2140")
    open external fun dateFormat(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "dateFromString:", bridge = "objcKniBridge2132")
    open external fun dateFromString(/*0*/ string: kotlin.String): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "defaultDate", bridge = "objcKniBridge2180")
    open external fun defaultDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "doesRelativeDateFormatting", bridge = "objcKniBridge2268")
    open external fun doesRelativeDateFormatting(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "eraSymbols", bridge = "objcKniBridge2184")
    open external fun eraSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "generatesCalendarDates", bridge = "objcKniBridge2156")
    open external fun generatesCalendarDates(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "getObjectValue:forString:range:error:", bridge = "objcKniBridge2128")
    open external fun getObjectValue(/*0*/ obj: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                           forString: kotlin.String, /*2*/
                                           range: kotlinx.cinterop.CPointer<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>?, /*3*/
                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "gregorianStartDate", bridge = "objcKniBridge2264")
    open external fun gregorianStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2272")
    open external override /*1*/ fun init(): platform.Foundation.NSDateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2274")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "isLenient", bridge = "objcKniBridge2172")
    open external fun isLenient(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "locale", bridge = "objcKniBridge2152")
    open external fun locale(): platform.Foundation.NSLocale

    @kotlinx.cinterop.ObjCMethod(selector = "longEraSymbols", bridge = "objcKniBridge2212")
    open external fun longEraSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "monthSymbols", bridge = "objcKniBridge2188")
    open external fun monthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "quarterSymbols", bridge = "objcKniBridge2248")
    open external fun quarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "setAMSymbol:", bridge = "objcKniBridge2206")
    open external fun setAMSymbol(/*0*/ AMSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setCalendar:", bridge = "objcKniBridge2170")
    open external fun setCalendar(/*0*/ calendar: platform.Foundation.NSCalendar?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDateFormat:", bridge = "objcKniBridge2142")
    open external fun setDateFormat(/*0*/ dateFormat: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDefaultDate:", bridge = "objcKniBridge2182")
    open external fun setDefaultDate(/*0*/ defaultDate: platform.Foundation.NSDate?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDoesRelativeDateFormatting:", bridge = "objcKniBridge2270")
    open external fun setDoesRelativeDateFormatting(/*0*/ doesRelativeDateFormatting: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setEraSymbols:", bridge = "objcKniBridge2186")
    open external fun setEraSymbols(/*0*/ eraSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setGeneratesCalendarDates:", bridge = "objcKniBridge2158")
    open external fun setGeneratesCalendarDates(/*0*/ generatesCalendarDates: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setGregorianStartDate:", bridge = "objcKniBridge2266")
    open external fun setGregorianStartDate(/*0*/ gregorianStartDate: platform.Foundation.NSDate?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLenient:", bridge = "objcKniBridge2174")
    open external fun setLenient(/*0*/ lenient: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocale:", bridge = "objcKniBridge2154")
    open external fun setLocale(/*0*/ locale: platform.Foundation.NSLocale?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocalizedDateFormatFromTemplate:", bridge = "objcKniBridge2134")
    open external fun setLocalizedDateFormatFromTemplate(/*0*/ dateFormatTemplate: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setLongEraSymbols:", bridge = "objcKniBridge2214")
    open external fun setLongEraSymbols(/*0*/ longEraSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setMonthSymbols:", bridge = "objcKniBridge2190")
    open external fun setMonthSymbols(/*0*/ monthSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPMSymbol:", bridge = "objcKniBridge2210")
    open external fun setPMSymbol(/*0*/ PMSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setQuarterSymbols:", bridge = "objcKniBridge2250")
    open external fun setQuarterSymbols(/*0*/ quarterSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShortMonthSymbols:", bridge = "objcKniBridge2194")
    open external fun setShortMonthSymbols(/*0*/ shortMonthSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShortQuarterSymbols:", bridge = "objcKniBridge2254")
    open external fun setShortQuarterSymbols(/*0*/ shortQuarterSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShortStandaloneMonthSymbols:", bridge = "objcKniBridge2226")
    open external fun setShortStandaloneMonthSymbols(/*0*/ shortStandaloneMonthSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShortStandaloneQuarterSymbols:", bridge = "objcKniBridge2262")
    open external fun setShortStandaloneQuarterSymbols(/*0*/ shortStandaloneQuarterSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShortStandaloneWeekdaySymbols:", bridge = "objcKniBridge2242")
    open external fun setShortStandaloneWeekdaySymbols(/*0*/ shortStandaloneWeekdaySymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShortWeekdaySymbols:", bridge = "objcKniBridge2202")
    open external fun setShortWeekdaySymbols(/*0*/ shortWeekdaySymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setStandaloneMonthSymbols:", bridge = "objcKniBridge2222")
    open external fun setStandaloneMonthSymbols(/*0*/ standaloneMonthSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setStandaloneQuarterSymbols:", bridge = "objcKniBridge2258")
    open external fun setStandaloneQuarterSymbols(/*0*/ standaloneQuarterSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setStandaloneWeekdaySymbols:", bridge = "objcKniBridge2238")
    open external fun setStandaloneWeekdaySymbols(/*0*/ standaloneWeekdaySymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTimeZone:", bridge = "objcKniBridge2166")
    open external fun setTimeZone(/*0*/ timeZone: platform.Foundation.NSTimeZone?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTwoDigitStartDate:", bridge = "objcKniBridge2178")
    open external fun setTwoDigitStartDate(/*0*/ twoDigitStartDate: platform.Foundation.NSDate?)

    @kotlinx.cinterop.ObjCMethod(selector = "setVeryShortMonthSymbols:", bridge = "objcKniBridge2218")
    open external fun setVeryShortMonthSymbols(/*0*/ veryShortMonthSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setVeryShortStandaloneMonthSymbols:", bridge = "objcKniBridge2230")
    open external fun setVeryShortStandaloneMonthSymbols(/*0*/ veryShortStandaloneMonthSymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setVeryShortStandaloneWeekdaySymbols:", bridge = "objcKniBridge2246")
    open external fun setVeryShortStandaloneWeekdaySymbols(/*0*/ veryShortStandaloneWeekdaySymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setVeryShortWeekdaySymbols:", bridge = "objcKniBridge2234")
    open external fun setVeryShortWeekdaySymbols(/*0*/ veryShortWeekdaySymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setWeekdaySymbols:", bridge = "objcKniBridge2198")
    open external fun setWeekdaySymbols(/*0*/ weekdaySymbols: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "shortMonthSymbols", bridge = "objcKniBridge2192")
    open external fun shortMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortQuarterSymbols", bridge = "objcKniBridge2252")
    open external fun shortQuarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortStandaloneMonthSymbols", bridge = "objcKniBridge2224")
    open external fun shortStandaloneMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortStandaloneQuarterSymbols", bridge = "objcKniBridge2260")
    open external fun shortStandaloneQuarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortStandaloneWeekdaySymbols", bridge = "objcKniBridge2240")
    open external fun shortStandaloneWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "shortWeekdaySymbols", bridge = "objcKniBridge2200")
    open external fun shortWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "standaloneMonthSymbols", bridge = "objcKniBridge2220")
    open external fun standaloneMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "standaloneQuarterSymbols", bridge = "objcKniBridge2256")
    open external fun standaloneQuarterSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "standaloneWeekdaySymbols", bridge = "objcKniBridge2236")
    open external fun standaloneWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromDate:", bridge = "objcKniBridge2130")
    open external fun stringFromDate(/*0*/ date: platform.Foundation.NSDate): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "timeZone", bridge = "objcKniBridge2164")
    open external fun timeZone(): platform.Foundation.NSTimeZone

    @kotlinx.cinterop.ObjCMethod(selector = "twoDigitStartDate", bridge = "objcKniBridge2176")
    open external fun twoDigitStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortMonthSymbols", bridge = "objcKniBridge2216")
    open external fun veryShortMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortStandaloneMonthSymbols", bridge = "objcKniBridge2228")
    open external fun veryShortStandaloneMonthSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortStandaloneWeekdaySymbols", bridge = "objcKniBridge2244")
    open external fun veryShortStandaloneWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "veryShortWeekdaySymbols", bridge = "objcKniBridge2232")
    open external fun veryShortWeekdaySymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "weekdaySymbols", bridge = "objcKniBridge2196")
    open external fun weekdaySymbols(): kotlin.collections.List<*>

    final var AMSymbol: kotlin.String

    final var PMSymbol: kotlin.String

    final var calendar: platform.Foundation.NSCalendar

    final var dateFormat: kotlin.String

    final var defaultDate: platform.Foundation.NSDate?

    final var doesRelativeDateFormatting: kotlin.Boolean

    final var eraSymbols: kotlin.collections.List<*>

    final var generatesCalendarDates: kotlin.Boolean

    final var gregorianStartDate: platform.Foundation.NSDate?

    final var lenient: kotlin.Boolean

    final var locale: platform.Foundation.NSLocale

    final var longEraSymbols: kotlin.collections.List<*>

    final var monthSymbols: kotlin.collections.List<*>

    final var quarterSymbols: kotlin.collections.List<*>

    final var shortMonthSymbols: kotlin.collections.List<*>

    final var shortQuarterSymbols: kotlin.collections.List<*>

    final var shortStandaloneMonthSymbols: kotlin.collections.List<*>

    final var shortStandaloneQuarterSymbols: kotlin.collections.List<*>

    final var shortStandaloneWeekdaySymbols: kotlin.collections.List<*>

    final var shortWeekdaySymbols: kotlin.collections.List<*>

    final var standaloneMonthSymbols: kotlin.collections.List<*>

    final var standaloneQuarterSymbols: kotlin.collections.List<*>

    final var standaloneWeekdaySymbols: kotlin.collections.List<*>

    final var timeZone: platform.Foundation.NSTimeZone

    final var twoDigitStartDate: platform.Foundation.NSDate?

    final var veryShortMonthSymbols: kotlin.collections.List<*>

    final var veryShortStandaloneMonthSymbols: kotlin.collections.List<*>

    final var veryShortStandaloneWeekdaySymbols: kotlin.collections.List<*>

    final var veryShortWeekdaySymbols: kotlin.collections.List<*>

    final var weekdaySymbols: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDateFormatter>,
        platform.Foundation.NSDateFormatterMeta {
    }
}

open expect class NSDateFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2126")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2124")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2122")
    open external override /*1*/ fun new(): platform.Foundation.NSDateFormatter?
}

open expect class NSDateInterval : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "containsDate:", bridge = "objcKniBridge2040")
    open external fun containsDate(/*0*/ date: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge2048")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2050")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "endDate", bridge = "objcKniBridge2044")
    open external fun endDate(): platform.Foundation.NSDate

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2024")
    open external override /*1*/ fun init(): platform.Foundation.NSDateInterval

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2026")
    open external override /*1*/ fun initWithCoder(/*0*/ coder: platform.Foundation.NSCoder): platform.Foundation.NSDateInterval

    @kotlinx.cinterop.ObjCMethod(selector = "initWithStartDate:endDate:", bridge = "objcKniBridge2030")
    open external fun initWithStartDate(/*0*/ startDate: platform.Foundation.NSDate, /*1*/
                                              endDate: platform.Foundation.NSDate
    ): platform.Foundation.NSDateInterval

    @kotlinx.cinterop.ObjCMethod(selector = "intersectionWithDateInterval:", bridge = "objcKniBridge2038")
    open external fun intersectionWithDateInterval(/*0*/ dateInterval: platform.Foundation.NSDateInterval): platform.Foundation.NSDateInterval?

    @kotlinx.cinterop.ObjCMethod(selector = "intersectsDateInterval:", bridge = "objcKniBridge2036")
    open external fun intersectsDateInterval(/*0*/ dateInterval: platform.Foundation.NSDateInterval): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isEqualToDateInterval:", bridge = "objcKniBridge2034")
    open external fun isEqualToDateInterval(/*0*/ dateInterval: platform.Foundation.NSDateInterval): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "startDate", bridge = "objcKniBridge2042")
    open external fun startDate(): platform.Foundation.NSDate

    final val endDate: platform.Foundation.NSDate

    final val startDate: platform.Foundation.NSDate

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDateInterval>,
        platform.Foundation.NSDateIntervalMeta {
    }
}

open expect class NSDateIntervalFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "calendar", bridge = "objcKniBridge2290")
    open external fun calendar(): platform.Foundation.NSCalendar

    @kotlinx.cinterop.ObjCMethod(selector = "dateTemplate", bridge = "objcKniBridge2298")
    open external fun dateTemplate(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2310")
    open external override /*1*/ fun init(): platform.Foundation.NSDateIntervalFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2312")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDateIntervalFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "locale", bridge = "objcKniBridge2286")
    open external fun locale(): platform.Foundation.NSLocale

    @kotlinx.cinterop.ObjCMethod(selector = "setCalendar:", bridge = "objcKniBridge2292")
    open external fun setCalendar(/*0*/ calendar: platform.Foundation.NSCalendar?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDateTemplate:", bridge = "objcKniBridge2300")
    open external fun setDateTemplate(/*0*/ dateTemplate: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocale:", bridge = "objcKniBridge2288")
    open external fun setLocale(/*0*/ locale: platform.Foundation.NSLocale?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTimeZone:", bridge = "objcKniBridge2296")
    open external fun setTimeZone(/*0*/ timeZone: platform.Foundation.NSTimeZone?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromDate:toDate:", bridge = "objcKniBridge2282")
    open external fun stringFromDate(/*0*/ fromDate: platform.Foundation.NSDate, /*1*/
                                           toDate: platform.Foundation.NSDate
    ): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromDateInterval:", bridge = "objcKniBridge2284")
    open external fun stringFromDateInterval(/*0*/ dateInterval: platform.Foundation.NSDateInterval): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "timeZone", bridge = "objcKniBridge2294")
    open external fun timeZone(): platform.Foundation.NSTimeZone

    final var calendar: platform.Foundation.NSCalendar

    final var dateTemplate: kotlin.String

    final var locale: platform.Foundation.NSLocale

    final var timeZone: platform.Foundation.NSTimeZone

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDateIntervalFormatter>,
        platform.Foundation.NSDateIntervalFormatterMeta {
    }
}

open expect class NSDateIntervalFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2280")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDateIntervalFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2278")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDateIntervalFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2276")
    open external override /*1*/ fun new(): platform.Foundation.NSDateIntervalFormatter?
}

open expect class NSDateIntervalMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2020")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDateInterval?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2018")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDateInterval?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2016")
    open external override /*1*/ fun new(): platform.Foundation.NSDateInterval?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2022")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSDateMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1618")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1616")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1614")
    open external override /*1*/ fun new(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1620")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

final expect class NSDecimal : kotlinx.cinterop.CStructVar {
    final var _exponent: kotlin.Int

    final var _isCompact: kotlin.UInt

    final var _isNegative: kotlin.UInt

    final var _length: kotlin.UInt

    final var _reserved: kotlin.UInt

    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSDecimalNumber : platform.Foundation.NSNumber {
    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByAdding:", bridge = "objcKniBridge3750")
    open external fun decimalNumberByAdding(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByAdding:withBehavior:", bridge = "objcKniBridge3752")
    open external fun decimalNumberByAdding(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber, /*1*/
                                                  withBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByDividingBy:", bridge = "objcKniBridge3762")
    open external fun decimalNumberByDividingBy(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByDividingBy:withBehavior:", bridge = "objcKniBridge3764")
    open external fun decimalNumberByDividingBy(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber, /*1*/
                                                      withBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByMultiplyingBy:", bridge = "objcKniBridge3758")
    open external fun decimalNumberByMultiplyingBy(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByMultiplyingBy:withBehavior:", bridge = "objcKniBridge3760")
    open external fun decimalNumberByMultiplyingBy(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber, /*1*/
                                                         withBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByMultiplyingByPowerOf10:", bridge = "objcKniBridge3770")
    open external fun decimalNumberByMultiplyingByPowerOf10(/*0*/ power: kotlin.Short): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(
        selector = "decimalNumberByMultiplyingByPowerOf10:withBehavior:",
        bridge = "objcKniBridge3772"
    )
    open external fun decimalNumberByMultiplyingByPowerOf10(/*0*/ power: kotlin.Short, /*1*/
                                                                  withBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberByRoundingAccordingToBehavior:", bridge = "objcKniBridge3774")
    open external fun decimalNumberByRoundingAccordingToBehavior(/*0*/ behavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol?): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberBySubtracting:", bridge = "objcKniBridge3754")
    open external fun decimalNumberBySubtracting(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberBySubtracting:withBehavior:", bridge = "objcKniBridge3756")
    open external fun decimalNumberBySubtracting(/*0*/ decimalNumber: platform.Foundation.NSDecimalNumber, /*1*/
                                                       withBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalValue", bridge = "objcKniBridge3778")
    open external fun decimalValue(): kotlinx.cinterop.CValue<platform.Foundation.NSDecimal>

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3814")
    open external override /*1*/ fun init(): platform.Foundation.NSDecimalNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithBool:", bridge = "objcKniBridge3806")
    open external override /*1*/ fun initWithBool(/*0*/ value: kotlin.Boolean): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithChar:", bridge = "objcKniBridge3782")
    open external override /*1*/ fun initWithChar(/*0*/ value: kotlin.Byte): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3780")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDecimalNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDecimal:", bridge = "objcKniBridge3744")
    open external fun initWithDecimal(/*0*/ dcm: kotlinx.cinterop.CValue<platform.Foundation.NSDecimal>): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDouble:", bridge = "objcKniBridge3804")
    open external override /*1*/ fun initWithDouble(/*0*/ value: kotlin.Double): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithFloat:", bridge = "objcKniBridge3802")
    open external override /*1*/ fun initWithFloat(/*0*/ value: kotlin.Float): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithInt:", bridge = "objcKniBridge3790")
    open external override /*1*/ fun initWithInt(/*0*/ value: kotlin.Int): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithLong:", bridge = "objcKniBridge3794")
    open external override /*1*/ fun initWithLong(/*0*/ value: kotlin.Long): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithLongLong:", bridge = "objcKniBridge3798")
    open external override /*1*/ fun initWithLongLong(/*0*/ value: kotlin.Long): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithMantissa:exponent:isNegative:", bridge = "objcKniBridge3742")
    open external fun initWithMantissa(/*0*/ mantissa: kotlin.ULong, /*1*/
                                             exponent: kotlin.Short, /*2*/
                                             isNegative: kotlin.Boolean
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithShort:", bridge = "objcKniBridge3786")
    open external override /*1*/ fun initWithShort(/*0*/ value: kotlin.Short): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithString:", bridge = "objcKniBridge3746")
    open external fun initWithString(/*0*/ numberValue: kotlin.String?): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithString:locale:", bridge = "objcKniBridge3748")
    open external fun initWithString(/*0*/ numberValue: kotlin.String?, /*1*/
                                           locale: kotlin.Any?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedChar:", bridge = "objcKniBridge3784")
    open external override /*1*/ fun initWithUnsignedChar(/*0*/ value: kotlin.UByte): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedInt:", bridge = "objcKniBridge3792")
    open external override /*1*/ fun initWithUnsignedInt(/*0*/ value: kotlin.UInt): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedLong:", bridge = "objcKniBridge3796")
    open external override /*1*/ fun initWithUnsignedLong(/*0*/ value: kotlin.ULong): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedLongLong:", bridge = "objcKniBridge3800")
    open external override /*1*/ fun initWithUnsignedLongLong(/*0*/ value: kotlin.ULong): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedShort:", bridge = "objcKniBridge3788")
    open external override /*1*/ fun initWithUnsignedShort(/*0*/ value: kotlin.UShort): platform.Foundation.NSNumber

    final val decimalValue: kotlinx.cinterop.CValue<platform.Foundation.NSDecimal>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDecimalNumber>,
        platform.Foundation.NSDecimalNumberMeta {
    }
}

expect interface NSDecimalNumberBehaviorsProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "roundingMode", bridge = "objcKniBridge49")
    fun roundingMode(): platform.Foundation.NSRoundingMode

    @kotlinx.cinterop.ObjCMethod(selector = "scale", bridge = "objcKniBridge51")
    fun scale(): kotlin.Short
}

expect interface NSDecimalNumberBehaviorsProtocolMeta :
    kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

open expect class NSDecimalNumberHandler : platform.darwin.NSObject,
    platform.Foundation.NSDecimalNumberBehaviorsProtocol, platform.Foundation.NSCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3838")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3828")
    open external override /*1*/ fun init(): platform.Foundation.NSDecimalNumberHandler?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3830")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDecimalNumberHandler?

    @kotlinx.cinterop.ObjCMethod(
        selector = "initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:",
        bridge = "objcKniBridge3826"
    )
    open external fun initWithRoundingMode(/*0*/ roundingMode: platform.Foundation.NSRoundingMode, /*1*/
                                                 scale: kotlin.Short, /*2*/
                                                 raiseOnExactness: kotlin.Boolean, /*3*/
                                                 raiseOnOverflow: kotlin.Boolean, /*4*/
                                                 raiseOnUnderflow: kotlin.Boolean, /*5*/
                                                 raiseOnDivideByZero: kotlin.Boolean
    ): platform.Foundation.NSDecimalNumberHandler

    @kotlinx.cinterop.ObjCMethod(selector = "roundingMode", bridge = "objcKniBridge3832")
    open external override /*1*/ fun roundingMode(): platform.Foundation.NSRoundingMode

    @kotlinx.cinterop.ObjCMethod(selector = "scale", bridge = "objcKniBridge3834")
    open external override /*1*/ fun scale(): kotlin.Short

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDecimalNumberHandler>,
        platform.Foundation.NSDecimalNumberHandlerMeta {
    }
}

open expect class NSDecimalNumberHandlerMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSDecimalNumberBehaviorsProtocolMeta, platform.Foundation.NSCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3824")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDecimalNumberHandler?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3822")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDecimalNumberHandler?

    @kotlinx.cinterop.ObjCMethod(
        selector = "decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:",
        bridge = "objcKniBridge3816"
    )
    open external fun decimalNumberHandlerWithRoundingMode(/*0*/ roundingMode: platform.Foundation.NSRoundingMode, /*1*/
                                                                 scale: kotlin.Short, /*2*/
                                                                 raiseOnExactness: kotlin.Boolean, /*3*/
                                                                 raiseOnOverflow: kotlin.Boolean, /*4*/
                                                                 raiseOnUnderflow: kotlin.Boolean, /*5*/
                                                                 raiseOnDivideByZero: kotlin.Boolean
    ): platform.Foundation.NSDecimalNumberHandler

    @kotlinx.cinterop.ObjCMethod(selector = "defaultDecimalNumberHandler", bridge = "objcKniBridge3818")
    open external fun defaultDecimalNumberHandler(): platform.Foundation.NSDecimalNumberHandler

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3820")
    open external override /*1*/ fun new(): platform.Foundation.NSDecimalNumberHandler?

    final val defaultDecimalNumberHandler: platform.Foundation.NSDecimalNumberHandler
}

open expect class NSDecimalNumberMeta : platform.Foundation.NSNumberMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3740")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDecimalNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3738")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDecimalNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberWithDecimal:", bridge = "objcKniBridge3716")
    open external fun decimalNumberWithDecimal(/*0*/ dcm: kotlinx.cinterop.CValue<platform.Foundation.NSDecimal>): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(
        selector = "decimalNumberWithMantissa:exponent:isNegative:",
        bridge = "objcKniBridge3714"
    )
    open external fun decimalNumberWithMantissa(/*0*/ mantissa: kotlin.ULong, /*1*/
                                                      exponent: kotlin.Short, /*2*/
                                                      isNegative: kotlin.Boolean
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberWithString:", bridge = "objcKniBridge3718")
    open external fun decimalNumberWithString(/*0*/ numberValue: kotlin.String?): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "decimalNumberWithString:locale:", bridge = "objcKniBridge3720")
    open external fun decimalNumberWithString(/*0*/ numberValue: kotlin.String?, /*1*/
                                                    locale: kotlin.Any?
    ): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "defaultBehavior", bridge = "objcKniBridge3732")
    open external fun defaultBehavior(): platform.Foundation.NSDecimalNumberBehaviorsProtocol

    @kotlinx.cinterop.ObjCMethod(selector = "maximumDecimalNumber", bridge = "objcKniBridge3728")
    open external fun maximumDecimalNumber(): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "minimumDecimalNumber", bridge = "objcKniBridge3726")
    open external fun minimumDecimalNumber(): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3736")
    open external override /*1*/ fun new(): platform.Foundation.NSDecimalNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "notANumber", bridge = "objcKniBridge3730")
    open external fun notANumber(): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "one", bridge = "objcKniBridge3724")
    open external fun one(): platform.Foundation.NSDecimalNumber

    @kotlinx.cinterop.ObjCMethod(selector = "setDefaultBehavior:", bridge = "objcKniBridge3734")
    open external fun setDefaultBehavior(/*0*/ defaultBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol)

    @kotlinx.cinterop.ObjCMethod(selector = "zero", bridge = "objcKniBridge3722")
    open external fun zero(): platform.Foundation.NSDecimalNumber

    final var defaultBehavior: platform.Foundation.NSDecimalNumberBehaviorsProtocol

    final val maximumDecimalNumber: platform.Foundation.NSDecimalNumber

    final val minimumDecimalNumber: platform.Foundation.NSDecimalNumber

    final val notANumber: platform.Foundation.NSDecimalNumber

    final val one: platform.Foundation.NSDecimalNumber

    final val zero: platform.Foundation.NSDecimalNumber
}

final expect enum class NSDecodingFailurePolicy : kotlinx.cinterop.CEnum {
    NSDecodingFailurePolicyRaiseException,

    NSDecodingFailurePolicySetErrorAndReturn;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSDecodingFailurePolicy

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSDictionary : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge840")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge844")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge832")
    open external override /*1*/ fun init(): kotlin.collections.Map<kotlin.Any?, *>

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge836")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "keyEnumerator", bridge = "objcKniBridge830")
    open external fun keyEnumerator(): platform.Foundation.NSEnumerator

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge842")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "objectForKey:", bridge = "objcKniBridge828")
    open external fun objectForKey(/*0*/ aKey: kotlin.Any?): kotlin.Any?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDictionary>,
        platform.Foundation.NSDictionaryMeta {
    }
}

open expect class NSDictionaryMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSFastEnumerationProtocolMeta {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge824")
    open external override /*1*/ fun alloc(): kotlin.collections.Map<kotlin.Any?, *>?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge822")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): kotlin.collections.Map<kotlin.Any?, *>?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge820")
    open external override /*1*/ fun new(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge826")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSDimension : platform.Foundation.NSUnit, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "converter", bridge = "objcKniBridge2748")
    open external fun converter(): platform.Foundation.NSUnitConverter

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2756")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2752")
    open external override /*1*/ fun init(): platform.Foundation.NSDimension?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2754")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSDimension?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2750")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSDimension

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2746")
    open external fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                           converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSDimension

    final val converter: platform.Foundation.NSUnitConverter

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDimension>,
        platform.Foundation.NSDimensionMeta {
    }
}

open expect class NSDimensionMeta : platform.Foundation.NSUnitMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2742")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDimension?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2740")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDimension?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2736")
    open external fun baseUnit(): platform.Foundation.NSDimension

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2738")
    open external override /*1*/ fun new(): platform.Foundation.NSDimension?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2744")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSDirectoryEnumerator : platform.Foundation.NSEnumerator {
    @kotlinx.cinterop.ObjCMethod(selector = "directoryAttributes", bridge = "objcKniBridge4282")
    open external fun directoryAttributes(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "fileAttributes", bridge = "objcKniBridge4280")
    open external fun fileAttributes(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4286")
    open external override /*1*/ fun init(): platform.Foundation.NSDirectoryEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "skipDescendants", bridge = "objcKniBridge4278")
    open external fun skipDescendants()

    @kotlinx.cinterop.ObjCMethod(selector = "skipDescendents", bridge = "objcKniBridge4276")
    open external fun skipDescendents()

    final val directoryAttributes: kotlin.collections.Map<kotlin.Any?, *>?

    final val fileAttributes: kotlin.collections.Map<kotlin.Any?, *>?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSDirectoryEnumerator>,
        platform.Foundation.NSDirectoryEnumeratorMeta {
    }
}

open expect class NSDirectoryEnumeratorMeta : platform.Foundation.NSEnumeratorMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4274")
    open external override /*1*/ fun alloc(): platform.Foundation.NSDirectoryEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4272")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSDirectoryEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4270")
    open external override /*1*/ fun new(): platform.Foundation.NSDirectoryEnumerator?
}

expect interface NSDiscardableContentProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "beginContentAccess", bridge = "objcKniBridge18")
    fun beginContentAccess(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "discardContentIfPossible", bridge = "objcKniBridge22")
    fun discardContentIfPossible()

    @kotlinx.cinterop.ObjCMethod(selector = "endContentAccess", bridge = "objcKniBridge20")
    fun endContentAccess()

    @kotlinx.cinterop.ObjCMethod(selector = "isContentDiscarded", bridge = "objcKniBridge24")
    fun isContentDiscarded(): kotlin.Boolean
}

expect interface NSDiscardableContentProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

open expect class NSEnergyFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2678")
    open external override /*1*/ fun init(): platform.Foundation.NSEnergyFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2680")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSEnergyFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "isForFoodEnergyUse", bridge = "objcKniBridge2674")
    open external fun isForFoodEnergyUse(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "numberFormatter", bridge = "objcKniBridge2666")
    open external fun numberFormatter(): platform.Foundation.NSNumberFormatter

    @kotlinx.cinterop.ObjCMethod(selector = "setForFoodEnergyUse:", bridge = "objcKniBridge2676")
    open external fun setForFoodEnergyUse(/*0*/ forFoodEnergyUse: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setNumberFormatter:", bridge = "objcKniBridge2668")
    open external fun setNumberFormatter(/*0*/ numberFormatter: platform.Foundation.NSNumberFormatter?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromJoules:", bridge = "objcKniBridge2660")
    open external fun stringFromJoules(/*0*/ numberInJoules: kotlin.Double): kotlin.String

    final var forFoodEnergyUse: kotlin.Boolean

    final var numberFormatter: platform.Foundation.NSNumberFormatter

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSEnergyFormatter>,
        platform.Foundation.NSEnergyFormatterMeta {
    }
}

open expect class NSEnergyFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2656")
    open external override /*1*/ fun alloc(): platform.Foundation.NSEnergyFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2654")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSEnergyFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2652")
    open external override /*1*/ fun new(): platform.Foundation.NSEnergyFormatter?
}

open expect class NSEnumerator : platform.darwin.NSObject, platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge510")
    open external override /*1*/ fun init(): platform.Foundation.NSEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "nextObject", bridge = "objcKniBridge508")
    open external fun nextObject(): kotlin.Any?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSEnumerator>,
        platform.Foundation.NSEnumeratorMeta {
    }
}

open expect class NSEnumeratorMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSFastEnumerationProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge506")
    open external override /*1*/ fun alloc(): platform.Foundation.NSEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge504")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge502")
    open external override /*1*/ fun new(): platform.Foundation.NSEnumerator?
}

open expect class NSError : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge816")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge818")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "helpAnchor", bridge = "objcKniBridge810")
    open external fun helpAnchor(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge812")
    open external override /*1*/ fun init(): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge814")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "localizedDescription", bridge = "objcKniBridge800")
    open external fun localizedDescription(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "localizedFailureReason", bridge = "objcKniBridge802")
    open external fun localizedFailureReason(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "localizedRecoveryOptions", bridge = "objcKniBridge806")
    open external fun localizedRecoveryOptions(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "localizedRecoverySuggestion", bridge = "objcKniBridge804")
    open external fun localizedRecoverySuggestion(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "recoveryAttempter", bridge = "objcKniBridge808")
    open external fun recoveryAttempter(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge798")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>

    final val helpAnchor: kotlin.String?

    final val localizedDescription: kotlin.String

    final val localizedFailureReason: kotlin.String?

    final val localizedRecoveryOptions: kotlin.collections.List<*>?

    final val localizedRecoverySuggestion: kotlin.String?

    final val recoveryAttempter: kotlin.Any?

    final val userInfo: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSError>,
        platform.Foundation.NSErrorMeta {
    }
}

open expect class NSErrorMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge788")
    open external override /*1*/ fun alloc(): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge786")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge784")
    open external override /*1*/ fun new(): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge790")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSException : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "callStackReturnAddresses", bridge = "objcKniBridge3688")
    open external fun callStackReturnAddresses(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "callStackSymbols", bridge = "objcKniBridge3690")
    open external fun callStackSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge3696")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3698")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3692")
    open external override /*1*/ fun init(): platform.Foundation.NSException?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3694")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSException?

    @kotlinx.cinterop.ObjCMethod(selector = "raise", bridge = "objcKniBridge3680")
    open external fun raise()

    @kotlinx.cinterop.ObjCMethod(selector = "reason", bridge = "objcKniBridge3684")
    open external fun reason(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge3686")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>?

    final val callStackReturnAddresses: kotlin.collections.List<*>

    final val callStackSymbols: kotlin.collections.List<*>

    final val reason: kotlin.String?

    final val userInfo: kotlin.collections.Map<kotlin.Any?, *>?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSException>,
        platform.Foundation.NSExceptionMeta {
    }
}

open expect class NSExceptionMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3676")
    open external override /*1*/ fun alloc(): platform.Foundation.NSException?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3674")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSException?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3672")
    open external override /*1*/ fun new(): platform.Foundation.NSException?
}

open expect class NSExpression : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "allowEvaluation", bridge = "objcKniBridge6352")
    open external fun allowEvaluation()

    @kotlinx.cinterop.ObjCMethod(selector = "arguments", bridge = "objcKniBridge6366")
    open external fun arguments(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "collection", bridge = "objcKniBridge6368")
    open external fun collection(): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "constantValue", bridge = "objcKniBridge6356")
    open external fun constantValue(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge6386")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge6384")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "expressionBlock", bridge = "objcKniBridge6380")
    open external fun expressionBlock(): (kotlin.Any?, kotlin.collections.List<*>?, platform.Foundation.NSMutableDictionary?) -> kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "expressionValueWithObject:context:", bridge = "objcKniBridge6350")
    open external fun expressionValueWithObject(/*0*/ `object`: kotlin.Any?, /*1*/
                                                      context: platform.Foundation.NSMutableDictionary?
    ): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "falseExpression", bridge = "objcKniBridge6378")
    open external fun falseExpression(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "function", bridge = "objcKniBridge6360")
    open external fun function(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6382")
    open external override /*1*/ fun init(): platform.Foundation.NSExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6348")
    open external override /*1*/ fun initWithCoder(/*0*/ coder: platform.Foundation.NSCoder): platform.Foundation.NSExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "keyPath", bridge = "objcKniBridge6358")
    open external fun keyPath(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "leftExpression", bridge = "objcKniBridge6372")
    open external fun leftExpression(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "operand", bridge = "objcKniBridge6364")
    open external fun operand(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "predicate", bridge = "objcKniBridge6370")
    open external fun predicate(): platform.Foundation.NSPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "rightExpression", bridge = "objcKniBridge6374")
    open external fun rightExpression(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "trueExpression", bridge = "objcKniBridge6376")
    open external fun trueExpression(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "variable", bridge = "objcKniBridge6362")
    open external fun variable(): kotlin.String

    final val arguments: kotlin.collections.List<*>?

    final val collection: kotlin.Any

    final val constantValue: kotlin.Any?

    final val expressionBlock: (kotlin.Any?, kotlin.collections.List<*>?, platform.Foundation.NSMutableDictionary?) -> kotlin.Any?

    final val falseExpression: platform.Foundation.NSExpression

    final val function: kotlin.String

    final val keyPath: kotlin.String

    final val leftExpression: platform.Foundation.NSExpression

    final val operand: platform.Foundation.NSExpression

    final val predicate: platform.Foundation.NSPredicate

    final val rightExpression: platform.Foundation.NSExpression

    final val trueExpression: platform.Foundation.NSExpression

    final val variable: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSExpression>,
        platform.Foundation.NSExpressionMeta {
    }
}

open expect class NSExpressionMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6342")
    open external override /*1*/ fun alloc(): platform.Foundation.NSExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6340")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForAggregate:", bridge = "objcKniBridge6320")
    open external fun expressionForAggregate(/*0*/ subexpressions: kotlin.collections.List<*>): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForAnyKey", bridge = "objcKniBridge6332")
    open external fun expressionForAnyKey(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForBlock:arguments:", bridge = "objcKniBridge6334")
    open external fun expressionForBlock(/*0*/ block: (kotlin.Any?, kotlin.collections.List<*>?, platform.Foundation.NSMutableDictionary?) -> kotlin.Any?, /*1*/
                                               arguments: kotlin.collections.List<*>?
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(
        selector = "expressionForConditional:trueExpression:falseExpression:",
        bridge = "objcKniBridge6336"
    )
    open external fun expressionForConditional(/*0*/ predicate: platform.Foundation.NSPredicate, /*1*/
                                                     trueExpression: platform.Foundation.NSExpression, /*2*/
                                                     falseExpression: platform.Foundation.NSExpression
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForConstantValue:", bridge = "objcKniBridge6310")
    open external fun expressionForConstantValue(/*0*/ obj: kotlin.Any?): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForEvaluatedObject", bridge = "objcKniBridge6312")
    open external fun expressionForEvaluatedObject(): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForFunction:arguments:", bridge = "objcKniBridge6318")
    open external fun expressionForFunction(/*0*/ name: kotlin.String, /*1*/
                                                  arguments: kotlin.collections.List<*>
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(
        selector = "expressionForFunction:selectorName:arguments:",
        bridge = "objcKniBridge6330"
    )
    open external fun expressionForFunction(/*0*/ target: platform.Foundation.NSExpression, /*1*/
                                                  selectorName: kotlin.String, /*2*/
                                                  arguments: kotlin.collections.List<*>?
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForIntersectSet:with:", bridge = "objcKniBridge6324")
    open external fun expressionForIntersectSet(/*0*/ left: platform.Foundation.NSExpression, /*1*/
                                                      with: platform.Foundation.NSExpression
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForKeyPath:", bridge = "objcKniBridge6316")
    open external fun expressionForKeyPath(/*0*/ keyPath: kotlin.String): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForMinusSet:with:", bridge = "objcKniBridge6326")
    open external fun expressionForMinusSet(/*0*/ left: platform.Foundation.NSExpression, /*1*/
                                                  with: platform.Foundation.NSExpression
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(
        selector = "expressionForSubquery:usingIteratorVariable:predicate:",
        bridge = "objcKniBridge6328"
    )
    open external fun expressionForSubquery(/*0*/ expression: platform.Foundation.NSExpression, /*1*/
                                                  usingIteratorVariable: kotlin.String, /*2*/
                                                  predicate: platform.Foundation.NSPredicate
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForUnionSet:with:", bridge = "objcKniBridge6322")
    open external fun expressionForUnionSet(/*0*/ left: platform.Foundation.NSExpression, /*1*/
                                                  with: platform.Foundation.NSExpression
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionForVariable:", bridge = "objcKniBridge6314")
    open external fun expressionForVariable(/*0*/ string: kotlin.String): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionWithFormat:", bridge = "objcKniBridge6306")
    open external fun expressionWithFormat(/*0*/ expressionFormat: kotlin.String): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "expressionWithFormat:argumentArray:", bridge = "objcKniBridge6304")
    open external fun expressionWithFormat(/*0*/ expressionFormat: kotlin.String, /*1*/
                                                 argumentArray: kotlin.collections.List<*>
    ): platform.Foundation.NSExpression

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6338")
    open external override /*1*/ fun new(): platform.Foundation.NSExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge6344")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSExtensionContext : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cancelRequestWithError:", bridge = "objcKniBridge6482")
    open external fun cancelRequestWithError(/*0*/ error: platform.Foundation.NSError)

    @kotlinx.cinterop.ObjCMethod(
        selector = "completeRequestReturningItems:completionHandler:",
        bridge = "objcKniBridge6480"
    )
    open external fun completeRequestReturningItems(/*0*/ items: kotlin.collections.List<*>?, /*1*/
                                                          completionHandler: ((kotlin.Boolean) -> kotlin.Unit)?
    )

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6488")
    open external override /*1*/ fun init(): platform.Foundation.NSExtensionContext?

    @kotlinx.cinterop.ObjCMethod(selector = "inputItems", bridge = "objcKniBridge6486")
    open external fun inputItems(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "openURL:completionHandler:", bridge = "objcKniBridge6484")
    open external fun openURL(/*0*/ URL: platform.Foundation.NSURL, /*1*/
                                    completionHandler: ((kotlin.Boolean) -> kotlin.Unit)?
    )

    final val inputItems: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSExtensionContext>,
        platform.Foundation.NSExtensionContextMeta {
    }
}

open expect class NSExtensionContextMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6478")
    open external override /*1*/ fun alloc(): platform.Foundation.NSExtensionContext?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6476")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSExtensionContext?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6474")
    open external override /*1*/ fun new(): platform.Foundation.NSExtensionContext?
}

open expect class NSExtensionItem : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "attachments", bridge = "objcKniBridge6506")
    open external fun attachments(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "attributedContentText", bridge = "objcKniBridge6502")
    open external fun attributedContentText(): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "attributedTitle", bridge = "objcKniBridge6498")
    open external fun attributedTitle(): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge6518")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge6520")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6514")
    open external override /*1*/ fun init(): platform.Foundation.NSExtensionItem?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6516")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSExtensionItem?

    @kotlinx.cinterop.ObjCMethod(selector = "setAttachments:", bridge = "objcKniBridge6508")
    open external fun setAttachments(/*0*/ attachments: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setAttributedContentText:", bridge = "objcKniBridge6504")
    open external fun setAttributedContentText(/*0*/ attributedContentText: platform.Foundation.NSAttributedString?)

    @kotlinx.cinterop.ObjCMethod(selector = "setAttributedTitle:", bridge = "objcKniBridge6500")
    open external fun setAttributedTitle(/*0*/ attributedTitle: platform.Foundation.NSAttributedString?)

    @kotlinx.cinterop.ObjCMethod(selector = "setUserInfo:", bridge = "objcKniBridge6512")
    open external fun setUserInfo(/*0*/ userInfo: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge6510")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>?

    final var attachments: kotlin.collections.List<*>?

    final var attributedContentText: platform.Foundation.NSAttributedString?

    final var attributedTitle: platform.Foundation.NSAttributedString?

    final var userInfo: kotlin.collections.Map<kotlin.Any?, *>?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSExtensionItem>,
        platform.Foundation.NSExtensionItemMeta {
    }
}

open expect class NSExtensionItemMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6494")
    open external override /*1*/ fun alloc(): platform.Foundation.NSExtensionItem?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6492")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSExtensionItem?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6490")
    open external override /*1*/ fun new(): platform.Foundation.NSExtensionItem?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge6496")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

expect interface NSExtensionRequestHandlingProtocol : platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "beginRequestWithExtensionContext:", bridge = "objcKniBridge242")
    fun beginRequestWithExtensionContext(/*0*/ context: platform.Foundation.NSExtensionContext)
}

expect interface NSExtensionRequestHandlingProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

expect interface NSFastEnumerationProtocol : kotlinx.cinterop.ObjCObject {
}

expect interface NSFastEnumerationProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

final expect class NSFastEnumerationState : kotlinx.cinterop.CStructVar {
    final var itemsPtr: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?

    final var state: kotlin.ULong

    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSFileAccessIntent : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "URL", bridge = "objcKniBridge6532")
    open external fun URL(): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6534")
    open external override /*1*/ fun init(): platform.Foundation.NSFileAccessIntent?

    final val URL: platform.Foundation.NSURL

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileAccessIntent>,
        platform.Foundation.NSFileAccessIntentMeta {
    }
}

open expect class NSFileAccessIntentMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6530")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileAccessIntent?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6528")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileAccessIntent?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6526")
    open external override /*1*/ fun new(): platform.Foundation.NSFileAccessIntent?
}

open expect class NSFileCoordinator : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cancel", bridge = "objcKniBridge6568")
    open external fun cancel()

    @kotlinx.cinterop.ObjCMethod(
        selector = "coordinateAccessWithIntents:queue:byAccessor:",
        bridge = "objcKniBridge6550"
    )
    open external fun coordinateAccessWithIntents(/*0*/ intents: kotlin.collections.List<*>, /*1*/
                                                        queue: platform.Foundation.NSOperationQueue, /*2*/
                                                        byAccessor: (platform.Foundation.NSError?) -> kotlin.Unit
    )

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6574")
    open external override /*1*/ fun init(): platform.Foundation.NSFileCoordinator?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithFilePresenter:", bridge = "objcKniBridge6548")
    open external fun initWithFilePresenter(/*0*/ filePresenterOrNil: platform.Foundation.NSFilePresenterProtocol?): platform.Foundation.NSFileCoordinator

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(selector = "itemAtURL:didChangeUbiquityAttributes:", bridge = "objcKniBridge6566")
    open external fun itemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                      didChangeUbiquityAttributes: kotlin.collections.Set<*>
    )

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(selector = "itemAtURL:willMoveToURL:", bridge = "objcKniBridge6562")
    open external fun itemAtURL(/*0*/ oldURL: platform.Foundation.NSURL, /*1*/ willMoveToURL: platform.Foundation.NSURL)

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(selector = "itemAtURL:didMoveToURL:", bridge = "objcKniBridge6564")
    open external fun itemAtURL(/*0*/ oldURL: platform.Foundation.NSURL, /*1*/ didMoveToURL: platform.Foundation.NSURL)

    @kotlinx.cinterop.ObjCMethod(selector = "purposeIdentifier", bridge = "objcKniBridge6570")
    open external fun purposeIdentifier(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "setPurposeIdentifier:", bridge = "objcKniBridge6572")
    open external fun setPurposeIdentifier(/*0*/ purposeIdentifier: kotlin.String)

    final var purposeIdentifier: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileCoordinator>,
        platform.Foundation.NSFileCoordinatorMeta {
    }
}

open expect class NSFileCoordinatorMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "addFilePresenter:", bridge = "objcKniBridge6536")
    open external fun addFilePresenter(/*0*/ filePresenter: platform.Foundation.NSFilePresenterProtocol)

    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6546")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileCoordinator?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6544")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileCoordinator?

    @kotlinx.cinterop.ObjCMethod(selector = "filePresenters", bridge = "objcKniBridge6540")
    open external fun filePresenters(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6542")
    open external override /*1*/ fun new(): platform.Foundation.NSFileCoordinator?

    @kotlinx.cinterop.ObjCMethod(selector = "removeFilePresenter:", bridge = "objcKniBridge6538")
    open external fun removeFilePresenter(/*0*/ filePresenter: platform.Foundation.NSFilePresenterProtocol)

    final val filePresenters: kotlin.collections.List<*>
}

open expect class NSFileHandle : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "availableData", bridge = "objcKniBridge3970")
    open external fun availableData(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "closeFile", bridge = "objcKniBridge3964")
    open external fun closeFile()

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3976")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3974")
    open external override /*1*/ fun init(): platform.Foundation.NSFileHandle?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3968")
    open external override /*1*/ fun initWithCoder(/*0*/ coder: platform.Foundation.NSCoder): platform.Foundation.NSFileHandle?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithFileDescriptor:closeOnDealloc:", bridge = "objcKniBridge3966")
    open external fun initWithFileDescriptor(/*0*/ fd: kotlin.Int, /*1*/
                                                   closeOnDealloc: kotlin.Boolean
    ): platform.Foundation.NSFileHandle

    @kotlinx.cinterop.ObjCMethod(selector = "offsetInFile", bridge = "objcKniBridge3972")
    open external fun offsetInFile(): kotlin.ULong

    @kotlinx.cinterop.ObjCMethod(selector = "readDataToEndOfFile", bridge = "objcKniBridge3950")
    open external fun readDataToEndOfFile(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "seekToEndOfFile", bridge = "objcKniBridge3956")
    open external fun seekToEndOfFile(): kotlin.ULong

    @kotlinx.cinterop.ObjCMethod(selector = "seekToFileOffset:", bridge = "objcKniBridge3958")
    open external fun seekToFileOffset(/*0*/ offset: kotlin.ULong)

    @kotlinx.cinterop.ObjCMethod(selector = "synchronizeFile", bridge = "objcKniBridge3962")
    open external fun synchronizeFile()

    @kotlinx.cinterop.ObjCMethod(selector = "truncateFileAtOffset:", bridge = "objcKniBridge3960")
    open external fun truncateFileAtOffset(/*0*/ offset: kotlin.ULong)

    @kotlinx.cinterop.ObjCMethod(selector = "writeData:", bridge = "objcKniBridge3954")
    open external fun writeData(/*0*/ data: platform.Foundation.NSData)

    final val availableData: platform.Foundation.NSData

    final val offsetInFile: kotlin.ULong

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileHandle>,
        platform.Foundation.NSFileHandleMeta {
    }
}

open expect class NSFileHandleMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3946")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileHandle?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3944")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileHandle?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3942")
    open external override /*1*/ fun new(): platform.Foundation.NSFileHandle?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3948")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSFileManager : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLForPublishingUbiquitousItemAtURL:expirationDate:error:",
        bridge = "objcKniBridge4254"
    )
    open external fun URLForPublishingUbiquitousItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                expirationDate: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSDate?>>?, /*2*/
                                                                error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "URLForUbiquityContainerIdentifier:", bridge = "objcKniBridge4252")
    open external fun URLForUbiquityContainerIdentifier(/*0*/ containerIdentifier: kotlin.String?): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "attributesOfFileSystemForPath:error:", bridge = "objcKniBridge4170")
    open external fun attributesOfFileSystemForPath(/*0*/ path: kotlin.String, /*1*/
                                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "attributesOfItemAtPath:error:", bridge = "objcKniBridge4168")
    open external fun attributesOfItemAtPath(/*0*/ path: kotlin.String, /*1*/
                                                   error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "changeCurrentDirectoryPath:", bridge = "objcKniBridge4208")
    open external fun changeCurrentDirectoryPath(/*0*/ path: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "changeFileAttributes:atPath:", bridge = "objcKniBridge4196")
    open external fun changeFileAttributes(/*0*/ attributes: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                                 atPath: kotlin.String
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "componentsToDisplayForPath:", bridge = "objcKniBridge4226")
    open external fun componentsToDisplayForPath(/*0*/ path: kotlin.String): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(
        selector = "containerURLForSecurityApplicationGroupIdentifier:",
        bridge = "objcKniBridge4258"
    )
    open external fun containerURLForSecurityApplicationGroupIdentifier(/*0*/ groupIdentifier: kotlin.String): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "contentsAtPath:", bridge = "objcKniBridge4234")
    open external fun contentsAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "contentsEqualAtPath:andPath:", bridge = "objcKniBridge4222")
    open external fun contentsEqualAtPath(/*0*/ path1: kotlin.String, /*1*/ andPath: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "contentsOfDirectoryAtPath:error:", bridge = "objcKniBridge4164")
    open external fun contentsOfDirectoryAtPath(/*0*/ path: kotlin.String, /*1*/
                                                      error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "copyItemAtPath:toPath:error:", bridge = "objcKniBridge4176")
    open external fun copyItemAtPath(/*0*/ srcPath: kotlin.String, /*1*/
                                           toPath: kotlin.String, /*2*/
                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyItemAtURL:toURL:error:", bridge = "objcKniBridge4184")
    open external fun copyItemAtURL(/*0*/ srcURL: platform.Foundation.NSURL, /*1*/
                                          toURL: platform.Foundation.NSURL, /*2*/
                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(
        selector = "createDirectoryAtPath:withIntermediateDirectories:attributes:error:",
        bridge = "objcKniBridge4162"
    )
    open external fun createDirectoryAtPath(/*0*/ path: kotlin.String, /*1*/
                                                  withIntermediateDirectories: kotlin.Boolean, /*2*/
                                                  attributes: kotlin.collections.Map<kotlin.Any?, *>?, /*3*/
                                                  error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "createDirectoryAtPath:attributes:", bridge = "objcKniBridge4206")
    open external fun createDirectoryAtPath(/*0*/ path: kotlin.String, /*1*/
                                                  attributes: kotlin.collections.Map<kotlin.Any?, *>
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(
        selector = "createDirectoryAtURL:withIntermediateDirectories:attributes:error:",
        bridge = "objcKniBridge4156"
    )
    open external fun createDirectoryAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                 withIntermediateDirectories: kotlin.Boolean, /*2*/
                                                 attributes: kotlin.collections.Map<kotlin.Any?, *>?, /*3*/
                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "createFileAtPath:contents:attributes:", bridge = "objcKniBridge4236")
    open external fun createFileAtPath(/*0*/ path: kotlin.String, /*1*/
                                             contents: platform.Foundation.NSData?, /*2*/
                                             attributes: kotlin.collections.Map<kotlin.Any?, *>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "createSymbolicLinkAtPath:pathContent:", bridge = "objcKniBridge4204")
    open external fun createSymbolicLinkAtPath(/*0*/ path: kotlin.String, /*1*/
                                                     pathContent: kotlin.String
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(
        selector = "createSymbolicLinkAtPath:withDestinationPath:error:",
        bridge = "objcKniBridge4172"
    )
    open external fun createSymbolicLinkAtPath(/*0*/ path: kotlin.String, /*1*/
                                                     withDestinationPath: kotlin.String, /*2*/
                                                     error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(
        selector = "createSymbolicLinkAtURL:withDestinationURL:error:",
        bridge = "objcKniBridge4158"
    )
    open external fun createSymbolicLinkAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                    withDestinationURL: platform.Foundation.NSURL, /*2*/
                                                    error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "currentDirectoryPath", bridge = "objcKniBridge4264")
    open external fun currentDirectoryPath(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge4260")
    open external fun delegate(): platform.Foundation.NSFileManagerDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "destinationOfSymbolicLinkAtPath:error:", bridge = "objcKniBridge4174")
    open external fun destinationOfSymbolicLinkAtPath(/*0*/ path: kotlin.String, /*1*/
                                                            error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "directoryContentsAtPath:", bridge = "objcKniBridge4198")
    open external fun directoryContentsAtPath(/*0*/ path: kotlin.String): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "displayNameAtPath:", bridge = "objcKniBridge4224")
    open external fun displayNameAtPath(/*0*/ path: kotlin.String): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "enumeratorAtPath:", bridge = "objcKniBridge4228")
    open external fun enumeratorAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSDirectoryEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "evictUbiquitousItemAtURL:error:", bridge = "objcKniBridge4250")
    open external fun evictUbiquitousItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                     error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "fileAttributesAtPath:traverseLink:", bridge = "objcKniBridge4194")
    open external fun fileAttributesAtPath(/*0*/ path: kotlin.String, /*1*/
                                                 traverseLink: kotlin.Boolean
    ): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "fileExistsAtPath:", bridge = "objcKniBridge4210")
    open external fun fileExistsAtPath(/*0*/ path: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "fileSystemAttributesAtPath:", bridge = "objcKniBridge4200")
    open external fun fileSystemAttributesAtPath(/*0*/ path: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(
        selector = "getFileProviderServicesForItemAtURL:completionHandler:",
        bridge = "objcKniBridge4256"
    )
    open external fun getFileProviderServicesForItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                completionHandler: (kotlin.collections.Map<kotlin.Any?, *>?, platform.Foundation.NSError?) -> kotlin.Unit
    )

    @kotlinx.cinterop.ObjCMethod(
        selector = "getRelationship:ofDirectoryAtURL:toItemAtURL:error:",
        bridge = "objcKniBridge4152"
    )
    open external fun getRelationship(/*0*/ outRelationship: kotlinx.cinterop.CPointer<platform.Foundation.NSURLRelationship.Var>?, /*1*/
                                            ofDirectoryAtURL: platform.Foundation.NSURL, /*2*/
                                            toItemAtURL: platform.Foundation.NSURL, /*3*/
                                            error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4268")
    open external override /*1*/ fun init(): platform.Foundation.NSFileManager?

    @kotlinx.cinterop.ObjCMethod(selector = "isDeletableFileAtPath:", bridge = "objcKniBridge4220")
    open external fun isDeletableFileAtPath(/*0*/ path: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isExecutableFileAtPath:", bridge = "objcKniBridge4218")
    open external fun isExecutableFileAtPath(/*0*/ path: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isReadableFileAtPath:", bridge = "objcKniBridge4214")
    open external fun isReadableFileAtPath(/*0*/ path: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isUbiquitousItemAtURL:", bridge = "objcKniBridge4246")
    open external fun isUbiquitousItemAtURL(/*0*/ url: platform.Foundation.NSURL): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isWritableFileAtPath:", bridge = "objcKniBridge4216")
    open external fun isWritableFileAtPath(/*0*/ path: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "linkItemAtPath:toPath:error:", bridge = "objcKniBridge4180")
    open external fun linkItemAtPath(/*0*/ srcPath: kotlin.String, /*1*/
                                           toPath: kotlin.String, /*2*/
                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "linkItemAtURL:toURL:error:", bridge = "objcKniBridge4188")
    open external fun linkItemAtURL(/*0*/ srcURL: platform.Foundation.NSURL, /*1*/
                                          toURL: platform.Foundation.NSURL, /*2*/
                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "moveItemAtPath:toPath:error:", bridge = "objcKniBridge4178")
    open external fun moveItemAtPath(/*0*/ srcPath: kotlin.String, /*1*/
                                           toPath: kotlin.String, /*2*/
                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "moveItemAtURL:toURL:error:", bridge = "objcKniBridge4186")
    open external fun moveItemAtURL(/*0*/ srcURL: platform.Foundation.NSURL, /*1*/
                                          toURL: platform.Foundation.NSURL, /*2*/
                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "pathContentOfSymbolicLinkAtPath:", bridge = "objcKniBridge4202")
    open external fun pathContentOfSymbolicLinkAtPath(/*0*/ path: kotlin.String): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "removeItemAtPath:error:", bridge = "objcKniBridge4182")
    open external fun removeItemAtPath(/*0*/ path: kotlin.String, /*1*/
                                             error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "removeItemAtURL:error:", bridge = "objcKniBridge4190")
    open external fun removeItemAtURL(/*0*/ URL: platform.Foundation.NSURL, /*1*/
                                            error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setAttributes:ofItemAtPath:error:", bridge = "objcKniBridge4160")
    open external fun setAttributes(/*0*/ attributes: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                          ofItemAtPath: kotlin.String, /*2*/
                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge4262")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSFileManagerDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(
        selector = "setUbiquitous:itemAtURL:destinationURL:error:",
        bridge = "objcKniBridge4244"
    )
    open external fun setUbiquitous(/*0*/ flag: kotlin.Boolean, /*1*/
                                          itemAtURL: platform.Foundation.NSURL, /*2*/
                                          destinationURL: platform.Foundation.NSURL, /*3*/
                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "startDownloadingUbiquitousItemAtURL:error:", bridge = "objcKniBridge4248")
    open external fun startDownloadingUbiquitousItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "subpathsAtPath:", bridge = "objcKniBridge4232")
    open external fun subpathsAtPath(/*0*/ path: kotlin.String): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "subpathsOfDirectoryAtPath:error:", bridge = "objcKniBridge4166")
    open external fun subpathsOfDirectoryAtPath(/*0*/ path: kotlin.String, /*1*/
                                                      error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "trashItemAtURL:resultingItemURL:error:", bridge = "objcKniBridge4192")
    open external fun trashItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                           resultingItemURL: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSURL?>>?, /*2*/
                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "ubiquityIdentityToken", bridge = "objcKniBridge4266")
    open external fun ubiquityIdentityToken(): platform.darwin.NSObjectProtocol?

    final val currentDirectoryPath: kotlin.String

    final var delegate: platform.Foundation.NSFileManagerDelegateProtocol?

    final val ubiquityIdentityToken: platform.darwin.NSObjectProtocol?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileManager>,
        platform.Foundation.NSFileManagerMeta {
    }
}

expect interface NSFileManagerDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSFileManagerDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSFileManagerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4142")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileManager?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4140")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileManager?

    @kotlinx.cinterop.ObjCMethod(selector = "defaultManager", bridge = "objcKniBridge4136")
    open external fun defaultManager(): platform.Foundation.NSFileManager

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4138")
    open external override /*1*/ fun new(): platform.Foundation.NSFileManager?

    final val defaultManager: platform.Foundation.NSFileManager
}

expect interface NSFilePresenterProtocol : platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "presentedItemOperationQueue", bridge = "objcKniBridge281")
    fun presentedItemOperationQueue(): platform.Foundation.NSOperationQueue

    @kotlinx.cinterop.ObjCMethod(selector = "presentedItemURL", bridge = "objcKniBridge279")
    fun presentedItemURL(): platform.Foundation.NSURL?
}

expect interface NSFilePresenterProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSFileProviderService : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(
        selector = "getFileProviderConnectionWithCompletionHandler:",
        bridge = "objcKniBridge4294"
    )
    open external fun getFileProviderConnectionWithCompletionHandler(/*0*/ completionHandler: (platform.Foundation.NSXPCConnection?, platform.Foundation.NSError?) -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4298")
    open external override /*1*/ fun init(): platform.Foundation.NSFileProviderService?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileProviderService>,
        platform.Foundation.NSFileProviderServiceMeta {
    }
}

open expect class NSFileProviderServiceMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4292")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileProviderService?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4290")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileProviderService?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4288")
    open external override /*1*/ fun new(): platform.Foundation.NSFileProviderService?
}

open expect class NSFileSecurity : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4132")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4134")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4130")
    open external override /*1*/ fun init(): platform.Foundation.NSFileSecurity?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4128")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSFileSecurity?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileSecurity>,
        platform.Foundation.NSFileSecurityMeta {
    }
}

open expect class NSFileSecurityMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4124")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileSecurity?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4122")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileSecurity?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4120")
    open external override /*1*/ fun new(): platform.Foundation.NSFileSecurity?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4126")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSFileVersion : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "URL", bridge = "objcKniBridge6598")
    open external fun URL(): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "hasLocalContents", bridge = "objcKniBridge6616")
    open external fun hasLocalContents(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "hasThumbnail", bridge = "objcKniBridge6618")
    open external fun hasThumbnail(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6620")
    open external override /*1*/ fun init(): platform.Foundation.NSFileVersion?

    @kotlinx.cinterop.ObjCMethod(selector = "isConflict", bridge = "objcKniBridge6610")
    open external fun isConflict(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isResolved", bridge = "objcKniBridge6612")
    open external fun isResolved(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "localizedName", bridge = "objcKniBridge6600")
    open external fun localizedName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "localizedNameOfSavingComputer", bridge = "objcKniBridge6602")
    open external fun localizedNameOfSavingComputer(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "modificationDate", bridge = "objcKniBridge6606")
    open external fun modificationDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "originatorNameComponents", bridge = "objcKniBridge6604")
    open external fun originatorNameComponents(): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "persistentIdentifier", bridge = "objcKniBridge6608")
    open external fun persistentIdentifier(): platform.Foundation.NSCodingProtocol

    @kotlinx.cinterop.ObjCMethod(selector = "removeAndReturnError:", bridge = "objcKniBridge6596")
    open external fun removeAndReturnError(/*0*/ outError: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setResolved:", bridge = "objcKniBridge6614")
    open external fun setResolved(/*0*/ resolved: kotlin.Boolean)

    final val URL: platform.Foundation.NSURL

    final val conflict: kotlin.Boolean

    final val hasLocalContents: kotlin.Boolean

    final val hasThumbnail: kotlin.Boolean

    final val localizedName: kotlin.String?

    final val localizedNameOfSavingComputer: kotlin.String?

    final val modificationDate: platform.Foundation.NSDate?

    final val originatorNameComponents: platform.Foundation.NSPersonNameComponents?

    final val persistentIdentifier: platform.Foundation.NSCodingProtocol

    final var resolved: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileVersion>,
        platform.Foundation.NSFileVersionMeta {
    }
}

open expect class NSFileVersionMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6592")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileVersion?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6590")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileVersion?

    @kotlinx.cinterop.ObjCMethod(selector = "currentVersionOfItemAtURL:", bridge = "objcKniBridge6576")
    open external fun currentVersionOfItemAtURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSFileVersion?

    @kotlinx.cinterop.ObjCMethod(
        selector = "getNonlocalVersionsOfItemAtURL:completionHandler:",
        bridge = "objcKniBridge6582"
    )
    open external fun getNonlocalVersionsOfItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                           completionHandler: (kotlin.collections.List<*>?, platform.Foundation.NSError?) -> kotlin.Unit
    )

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6588")
    open external override /*1*/ fun new(): platform.Foundation.NSFileVersion?

    @kotlinx.cinterop.ObjCMethod(selector = "otherVersionsOfItemAtURL:", bridge = "objcKniBridge6578")
    open external fun otherVersionsOfItemAtURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "removeOtherVersionsOfItemAtURL:error:", bridge = "objcKniBridge6586")
    open external fun removeOtherVersionsOfItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "unresolvedConflictVersionsOfItemAtURL:", bridge = "objcKniBridge6580")
    open external fun unresolvedConflictVersionsOfItemAtURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "versionOfItemAtURL:forPersistentIdentifier:", bridge = "objcKniBridge6584")
    open external fun versionOfItemAtURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                               forPersistentIdentifier: kotlin.Any
    ): platform.Foundation.NSFileVersion?
}

open expect class NSFileWrapper : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "addFileWrapper:", bridge = "objcKniBridge6648")
    open external fun addFileWrapper(/*0*/ child: platform.Foundation.NSFileWrapper): kotlin.String

    @kotlinx.cinterop.ObjCMethod(
        selector = "addRegularFileWithContents:preferredFilename:",
        bridge = "objcKniBridge6650"
    )
    open external fun addRegularFileWithContents(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                       preferredFilename: kotlin.String
    ): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge6684")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "fileAttributes", bridge = "objcKniBridge6670")
    open external fun fileAttributes(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "fileWrappers", bridge = "objcKniBridge6676")
    open external fun fileWrappers(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "filename", bridge = "objcKniBridge6666")
    open external fun filename(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6682")
    open external override /*1*/ fun init(): platform.Foundation.NSFileWrapper?

    @kotlinx.cinterop.ObjCMethod(selector = "initDirectoryWithFileWrappers:", bridge = "objcKniBridge6632")
    open external fun initDirectoryWithFileWrappers(/*0*/ childrenByPreferredName: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSFileWrapper

    @kotlinx.cinterop.ObjCMethod(selector = "initRegularFileWithContents:", bridge = "objcKniBridge6634")
    open external fun initRegularFileWithContents(/*0*/ contents: platform.Foundation.NSData): platform.Foundation.NSFileWrapper

    @kotlinx.cinterop.ObjCMethod(selector = "initSymbolicLinkWithDestinationURL:", bridge = "objcKniBridge6636")
    open external fun initSymbolicLinkWithDestinationURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSFileWrapper

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6640")
    open external override /*1*/ fun initWithCoder(/*0*/ inCoder: platform.Foundation.NSCoder): platform.Foundation.NSFileWrapper?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSerializedRepresentation:", bridge = "objcKniBridge6638")
    open external fun initWithSerializedRepresentation(/*0*/ serializeRepresentation: platform.Foundation.NSData): platform.Foundation.NSFileWrapper?

    @kotlinx.cinterop.ObjCMethod(selector = "isDirectory", bridge = "objcKniBridge6656")
    open external fun isDirectory(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isRegularFile", bridge = "objcKniBridge6658")
    open external fun isRegularFile(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isSymbolicLink", bridge = "objcKniBridge6660")
    open external fun isSymbolicLink(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "keyForFileWrapper:", bridge = "objcKniBridge6654")
    open external fun keyForFileWrapper(/*0*/ child: platform.Foundation.NSFileWrapper): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "matchesContentsOfURL:", bridge = "objcKniBridge6642")
    open external fun matchesContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "preferredFilename", bridge = "objcKniBridge6662")
    open external fun preferredFilename(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "regularFileContents", bridge = "objcKniBridge6678")
    open external fun regularFileContents(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "removeFileWrapper:", bridge = "objcKniBridge6652")
    open external fun removeFileWrapper(/*0*/ child: platform.Foundation.NSFileWrapper)

    @kotlinx.cinterop.ObjCMethod(selector = "serializedRepresentation", bridge = "objcKniBridge6674")
    open external fun serializedRepresentation(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "setFileAttributes:", bridge = "objcKniBridge6672")
    open external fun setFileAttributes(/*0*/ fileAttributes: kotlin.collections.Map<kotlin.Any?, *>)

    @kotlinx.cinterop.ObjCMethod(selector = "setFilename:", bridge = "objcKniBridge6668")
    open external fun setFilename(/*0*/ filename: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPreferredFilename:", bridge = "objcKniBridge6664")
    open external fun setPreferredFilename(/*0*/ preferredFilename: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "symbolicLinkDestinationURL", bridge = "objcKniBridge6680")
    open external fun symbolicLinkDestinationURL(): platform.Foundation.NSURL?

    final val directory: kotlin.Boolean

    final var fileAttributes: kotlin.collections.Map<kotlin.Any?, *>

    final val fileWrappers: kotlin.collections.Map<kotlin.Any?, *>?

    final var filename: kotlin.String?

    final var preferredFilename: kotlin.String?

    final val regularFile: kotlin.Boolean

    final val regularFileContents: platform.Foundation.NSData?

    final val serializedRepresentation: platform.Foundation.NSData?

    final val symbolicLink: kotlin.Boolean

    final val symbolicLinkDestinationURL: platform.Foundation.NSURL?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFileWrapper>,
        platform.Foundation.NSFileWrapperMeta {
    }
}

open expect class NSFileWrapperMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6626")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFileWrapper?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6624")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFileWrapper?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6622")
    open external override /*1*/ fun new(): platform.Foundation.NSFileWrapper?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge6628")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSFormatter : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(
        selector = "attributedStringForObjectValue:withDefaultAttributes:",
        bridge = "objcKniBridge2096"
    )
    open external fun attributedStringForObjectValue(/*0*/ obj: kotlin.Any, /*1*/
                                                           withDefaultAttributes: kotlin.collections.Map<kotlin.Any?, *>?
    ): platform.Foundation.NSAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge2110")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "editingStringForObjectValue:", bridge = "objcKniBridge2098")
    open external fun editingStringForObjectValue(/*0*/ obj: kotlin.Any): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2112")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "getObjectValue:forString:errorDescription:", bridge = "objcKniBridge2100")
    open external fun getObjectValue(/*0*/ obj: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                           forString: kotlin.String, /*2*/
                                           errorDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2106")
    open external override /*1*/ fun init(): platform.Foundation.NSFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2108")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSFormatter?

    @kotlinx.cinterop.ObjCMethod(
        selector = "isPartialStringValid:newEditingString:errorDescription:",
        bridge = "objcKniBridge2102"
    )
    open external fun isPartialStringValid(/*0*/ partialString: kotlin.String, /*1*/
                                                 newEditingString: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?, /*2*/
                                                 errorDescription: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "stringForObjectValue:", bridge = "objcKniBridge2094")
    open external fun stringForObjectValue(/*0*/ obj: kotlin.Any?): kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSFormatter>,
        platform.Foundation.NSFormatterMeta {
    }
}

open expect class NSFormatterMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2092")
    open external override /*1*/ fun alloc(): platform.Foundation.NSFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2090")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2088")
    open external override /*1*/ fun new(): platform.Foundation.NSFormatter?
}

open expect class NSHTTPCookie : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "comment", bridge = "objcKniBridge4530")
    open external fun comment(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "commentURL", bridge = "objcKniBridge4532")
    open external fun commentURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "domain", bridge = "objcKniBridge4522")
    open external fun domain(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "expiresDate", bridge = "objcKniBridge4518")
    open external fun expiresDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4536")
    open external override /*1*/ fun init(): platform.Foundation.NSHTTPCookie?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithProperties:", bridge = "objcKniBridge4508")
    open external fun initWithProperties(/*0*/ properties: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSHTTPCookie?

    @kotlinx.cinterop.ObjCMethod(selector = "isHTTPOnly", bridge = "objcKniBridge4528")
    open external fun isHTTPOnly(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isSecure", bridge = "objcKniBridge4526")
    open external fun isSecure(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isSessionOnly", bridge = "objcKniBridge4520")
    open external fun isSessionOnly(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge4514")
    open external fun name(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "path", bridge = "objcKniBridge4524")
    open external fun path(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "portList", bridge = "objcKniBridge4534")
    open external fun portList(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "properties", bridge = "objcKniBridge4510")
    open external fun properties(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "value", bridge = "objcKniBridge4516")
    open external fun value(): kotlin.String

    final val HTTPOnly: kotlin.Boolean

    final val comment: kotlin.String?

    final val commentURL: platform.Foundation.NSURL?

    final val domain: kotlin.String

    final val expiresDate: platform.Foundation.NSDate?

    final val name: kotlin.String

    final val path: kotlin.String

    final val portList: kotlin.collections.List<*>?

    final val properties: kotlin.collections.Map<kotlin.Any?, *>?

    final val secure: kotlin.Boolean

    final val sessionOnly: kotlin.Boolean

    final val value: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSHTTPCookie>,
        platform.Foundation.NSHTTPCookieMeta {
    }
}

final expect enum class NSHTTPCookieAcceptPolicy : kotlinx.cinterop.CEnum {
    NSHTTPCookieAcceptPolicyAlways,

    NSHTTPCookieAcceptPolicyNever,

    NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSHTTPCookieAcceptPolicy

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSHTTPCookieMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4506")
    open external override /*1*/ fun alloc(): platform.Foundation.NSHTTPCookie?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4504")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSHTTPCookie?

    @kotlinx.cinterop.ObjCMethod(selector = "cookieWithProperties:", bridge = "objcKniBridge4496")
    open external fun cookieWithProperties(/*0*/ properties: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSHTTPCookie?

    @kotlinx.cinterop.ObjCMethod(selector = "cookiesWithResponseHeaderFields:forURL:", bridge = "objcKniBridge4500")
    open external fun cookiesWithResponseHeaderFields(/*0*/ headerFields: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                                            forURL: platform.Foundation.NSURL
    ): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4502")
    open external override /*1*/ fun new(): platform.Foundation.NSHTTPCookie?

    @kotlinx.cinterop.ObjCMethod(selector = "requestHeaderFieldsWithCookies:", bridge = "objcKniBridge4498")
    open external fun requestHeaderFieldsWithCookies(/*0*/ cookies: kotlin.collections.List<*>): kotlin.collections.Map<kotlin.Any?, *>
}

open expect class NSHTTPCookieStorage : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cookieAcceptPolicy", bridge = "objcKniBridge4562")
    open external fun cookieAcceptPolicy(): platform.Foundation.NSHTTPCookieAcceptPolicy

    @kotlinx.cinterop.ObjCMethod(selector = "cookies", bridge = "objcKniBridge4560")
    open external fun cookies(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "cookiesForURL:", bridge = "objcKniBridge4554")
    open external fun cookiesForURL(/*0*/ URL: platform.Foundation.NSURL): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "deleteCookie:", bridge = "objcKniBridge4550")
    open external fun deleteCookie(/*0*/ cookie: platform.Foundation.NSHTTPCookie)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4566")
    open external override /*1*/ fun init(): platform.Foundation.NSHTTPCookieStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "removeCookiesSinceDate:", bridge = "objcKniBridge4552")
    open external fun removeCookiesSinceDate(/*0*/ date: platform.Foundation.NSDate)

    @kotlinx.cinterop.ObjCMethod(selector = "setCookie:", bridge = "objcKniBridge4548")
    open external fun setCookie(/*0*/ cookie: platform.Foundation.NSHTTPCookie)

    @kotlinx.cinterop.ObjCMethod(selector = "setCookieAcceptPolicy:", bridge = "objcKniBridge4564")
    open external fun setCookieAcceptPolicy(/*0*/ cookieAcceptPolicy: platform.Foundation.NSHTTPCookieAcceptPolicy)

    @kotlinx.cinterop.ObjCMethod(selector = "setCookies:forURL:mainDocumentURL:", bridge = "objcKniBridge4556")
    open external fun setCookies(/*0*/ cookies: kotlin.collections.List<*>, /*1*/
                                       forURL: platform.Foundation.NSURL?, /*2*/
                                       mainDocumentURL: platform.Foundation.NSURL?
    )

    @kotlinx.cinterop.ObjCMethod(selector = "sortedCookiesUsingDescriptors:", bridge = "objcKniBridge4558")
    open external fun sortedCookiesUsingDescriptors(/*0*/ sortOrder: kotlin.collections.List<*>): kotlin.collections.List<*>

    final var cookieAcceptPolicy: platform.Foundation.NSHTTPCookieAcceptPolicy

    final val cookies: kotlin.collections.List<*>?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSHTTPCookieStorage>,
        platform.Foundation.NSHTTPCookieStorageMeta {
    }
}

open expect class NSHTTPCookieStorageMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4546")
    open external override /*1*/ fun alloc(): platform.Foundation.NSHTTPCookieStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4544")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSHTTPCookieStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4542")
    open external override /*1*/ fun new(): platform.Foundation.NSHTTPCookieStorage?

    @kotlinx.cinterop.ObjCMethod(
        selector = "sharedCookieStorageForGroupContainerIdentifier:",
        bridge = "objcKniBridge4538"
    )
    open external fun sharedCookieStorageForGroupContainerIdentifier(/*0*/ identifier: kotlin.String): platform.Foundation.NSHTTPCookieStorage

    @kotlinx.cinterop.ObjCMethod(selector = "sharedHTTPCookieStorage", bridge = "objcKniBridge4540")
    open external fun sharedHTTPCookieStorage(): platform.Foundation.NSHTTPCookieStorage

    final val sharedHTTPCookieStorage: platform.Foundation.NSHTTPCookieStorage
}

open expect class NSHTTPURLResponse : platform.Foundation.NSURLResponse {
    @kotlinx.cinterop.ObjCMethod(selector = "allHeaderFields", bridge = "objcKniBridge5958")
    open external fun allHeaderFields(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5962")
    open external override /*1*/ fun init(): platform.Foundation.NSHTTPURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5964")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSHTTPURLResponse?

    final val allHeaderFields: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSHTTPURLResponse>,
        platform.Foundation.NSHTTPURLResponseMeta {
    }
}

open expect class NSHTTPURLResponseMeta : platform.Foundation.NSURLResponseMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5952")
    open external override /*1*/ fun alloc(): platform.Foundation.NSHTTPURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5950")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSHTTPURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5948")
    open external override /*1*/ fun new(): platform.Foundation.NSHTTPURLResponse?
}

final expect class NSHashEnumerator : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSHashTable : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol, platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "addObject:", bridge = "objcKniBridge4456")
    open external fun addObject(/*0*/ `object`: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "allObjects", bridge = "objcKniBridge4480")
    open external fun allObjects(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "anyObject", bridge = "objcKniBridge4482")
    open external fun anyObject(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "containsObject:", bridge = "objcKniBridge4462")
    open external fun containsObject(/*0*/ anObject: kotlin.Any?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4490")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4492")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4486")
    open external override /*1*/ fun init(): platform.Foundation.NSHashTable?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4488")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSHashTable?

    @kotlinx.cinterop.ObjCMethod(selector = "intersectHashTable:", bridge = "objcKniBridge4470")
    open external fun intersectHashTable(/*0*/ other: platform.Foundation.NSHashTable)

    @kotlinx.cinterop.ObjCMethod(selector = "intersectsHashTable:", bridge = "objcKniBridge4464")
    open external fun intersectsHashTable(/*0*/ other: platform.Foundation.NSHashTable): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isEqualToHashTable:", bridge = "objcKniBridge4466")
    open external fun isEqualToHashTable(/*0*/ other: platform.Foundation.NSHashTable): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isSubsetOfHashTable:", bridge = "objcKniBridge4468")
    open external fun isSubsetOfHashTable(/*0*/ other: platform.Foundation.NSHashTable): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "member:", bridge = "objcKniBridge4452")
    open external fun member(/*0*/ `object`: kotlin.Any?): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "minusHashTable:", bridge = "objcKniBridge4474")
    open external fun minusHashTable(/*0*/ other: platform.Foundation.NSHashTable)

    @kotlinx.cinterop.ObjCMethod(selector = "objectEnumerator", bridge = "objcKniBridge4454")
    open external fun objectEnumerator(): platform.Foundation.NSEnumerator

    @kotlinx.cinterop.ObjCMethod(selector = "pointerFunctions", bridge = "objcKniBridge4476")
    open external fun pointerFunctions(): platform.Foundation.NSPointerFunctions

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge4460")
    open external fun removeAllObjects()

    @kotlinx.cinterop.ObjCMethod(selector = "removeObject:", bridge = "objcKniBridge4458")
    open external fun removeObject(/*0*/ `object`: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "setRepresentation", bridge = "objcKniBridge4484")
    open external fun setRepresentation(): kotlin.collections.Set<*>

    @kotlinx.cinterop.ObjCMethod(selector = "unionHashTable:", bridge = "objcKniBridge4472")
    open external fun unionHashTable(/*0*/ other: platform.Foundation.NSHashTable)

    final val allObjects: kotlin.collections.List<*>

    final val anyObject: kotlin.Any?

    final val pointerFunctions: platform.Foundation.NSPointerFunctions

    final val setRepresentation: kotlin.collections.Set<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSHashTable>,
        platform.Foundation.NSHashTableMeta {
    }
}

final expect class NSHashTableCallBacks : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSHashTableMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta, platform.Foundation.NSFastEnumerationProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4444")
    open external override /*1*/ fun alloc(): platform.Foundation.NSHashTable?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4442")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSHashTable?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4440")
    open external override /*1*/ fun new(): platform.Foundation.NSHashTable?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4446")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "weakObjectsHashTable", bridge = "objcKniBridge4438")
    open external fun weakObjectsHashTable(): platform.Foundation.NSHashTable
}

open expect class NSISO8601DateFormatter : platform.Foundation.NSFormatter, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "dateFromString:", bridge = "objcKniBridge2328")
    open external fun dateFromString(/*0*/ string: kotlin.String): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2340")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2324")
    open external override /*1*/ fun init(): platform.Foundation.NSISO8601DateFormatter

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2338")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSISO8601DateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "setTimeZone:", bridge = "objcKniBridge2332")
    open external fun setTimeZone(/*0*/ timeZone: platform.Foundation.NSTimeZone?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromDate:", bridge = "objcKniBridge2326")
    open external fun stringFromDate(/*0*/ date: platform.Foundation.NSDate): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "timeZone", bridge = "objcKniBridge2330")
    open external fun timeZone(): platform.Foundation.NSTimeZone

    final var timeZone: platform.Foundation.NSTimeZone

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSISO8601DateFormatter>,
        platform.Foundation.NSISO8601DateFormatterMeta {
    }
}

open expect class NSISO8601DateFormatterMeta : platform.Foundation.NSFormatterMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2320")
    open external override /*1*/ fun alloc(): platform.Foundation.NSISO8601DateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2318")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSISO8601DateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2316")
    open external override /*1*/ fun new(): platform.Foundation.NSISO8601DateFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2322")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSIndexPath : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4752")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4754")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "indexPathByRemovingLastIndex", bridge = "objcKniBridge4738")
    open external fun indexPathByRemovingLastIndex(): platform.Foundation.NSIndexPath

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4748")
    open external override /*1*/ fun init(): platform.Foundation.NSIndexPath?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4750")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSIndexPath?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSIndexPath>,
        platform.Foundation.NSIndexPathMeta {
    }
}

open expect class NSIndexPathMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4728")
    open external override /*1*/ fun alloc(): platform.Foundation.NSIndexPath?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4726")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSIndexPath?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4724")
    open external override /*1*/ fun new(): platform.Foundation.NSIndexPath?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4730")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSIndexSet : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "containsIndexes:", bridge = "objcKniBridge886")
    open external fun containsIndexes(/*0*/ indexSet: platform.Foundation.NSIndexSet): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "containsIndexesInRange:", bridge = "objcKniBridge884")
    open external fun containsIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge924")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge928")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge920")
    open external override /*1*/ fun init(): platform.Foundation.NSIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge922")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithIndexSet:", bridge = "objcKniBridge864")
    open external fun initWithIndexSet(/*0*/ indexSet: platform.Foundation.NSIndexSet): platform.Foundation.NSIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "initWithIndexesInRange:", bridge = "objcKniBridge862")
    open external fun initWithIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "intersectsIndexesInRange:", bridge = "objcKniBridge888")
    open external fun intersectsIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isEqualToIndexSet:", bridge = "objcKniBridge868")
    open external fun isEqualToIndexSet(/*0*/ indexSet: platform.Foundation.NSIndexSet): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge926")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSIndexSet>,
        platform.Foundation.NSIndexSetMeta {
    }
}

open expect class NSIndexSetMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge858")
    open external override /*1*/ fun alloc(): platform.Foundation.NSIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge856")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "indexSet", bridge = "objcKniBridge848")
    open external fun indexSet(): platform.Foundation.NSIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "indexSetWithIndexesInRange:", bridge = "objcKniBridge852")
    open external fun indexSetWithIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge854")
    open external override /*1*/ fun new(): platform.Foundation.NSIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge860")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSInputStream : platform.Foundation.NSStream {
    @kotlinx.cinterop.ObjCMethod(selector = "hasBytesAvailable", bridge = "objcKniBridge4872")
    open external fun hasBytesAvailable(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4874")
    open external override /*1*/ fun init(): platform.Foundation.NSInputStream?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithData:", bridge = "objcKniBridge4868")
    open external fun initWithData(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSInputStream

    @kotlinx.cinterop.ObjCMethod(selector = "initWithURL:", bridge = "objcKniBridge4870")
    open external fun initWithURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSInputStream?

    final val hasBytesAvailable: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSInputStream>,
        platform.Foundation.NSInputStreamMeta {
    }
}

open expect class NSInputStreamMeta : platform.Foundation.NSStreamMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4862")
    open external override /*1*/ fun alloc(): platform.Foundation.NSInputStream?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4860")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSInputStream?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4858")
    open external override /*1*/ fun new(): platform.Foundation.NSInputStream?
}

open expect class NSInvocation : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "argumentsRetained", bridge = "objcKniBridge428")
    open external fun argumentsRetained(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge438")
    open external override /*1*/ fun init(): platform.Foundation.NSInvocation?

    @kotlinx.cinterop.ObjCMethod(selector = "invoke", bridge = "objcKniBridge422")
    open external fun invoke()

    @kotlinx.cinterop.ObjCMethod(selector = "invokeWithTarget:", bridge = "objcKniBridge424")
    open external fun invokeWithTarget(/*0*/ target: kotlin.Any)

    @kotlinx.cinterop.ObjCMethod(selector = "methodSignature", bridge = "objcKniBridge426")
    open external fun methodSignature(): platform.Foundation.NSMethodSignature

    @kotlinx.cinterop.ObjCMethod(selector = "retainArguments", bridge = "objcKniBridge412")
    open external fun retainArguments()

    @kotlinx.cinterop.ObjCMethod(selector = "setTarget:", bridge = "objcKniBridge432")
    open external fun setTarget(/*0*/ target: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "target", bridge = "objcKniBridge430")
    open external fun target(): kotlin.Any?

    final val argumentsRetained: kotlin.Boolean

    final val methodSignature: platform.Foundation.NSMethodSignature

    final var target: kotlin.Any?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSInvocation>,
        platform.Foundation.NSInvocationMeta {
    }
}

open expect class NSInvocationMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge410")
    open external override /*1*/ fun alloc(): platform.Foundation.NSInvocation?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge408")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSInvocation?

    @kotlinx.cinterop.ObjCMethod(selector = "invocationWithMethodSignature:", bridge = "objcKniBridge404")
    open external fun invocationWithMethodSignature(/*0*/ sig: platform.Foundation.NSMethodSignature): platform.Foundation.NSInvocation

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge406")
    open external override /*1*/ fun new(): platform.Foundation.NSInvocation?
}

open expect class NSInvocationOperation : platform.Foundation.NSOperation {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5280")
    open external override /*1*/ fun init(): platform.Foundation.NSInvocationOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithInvocation:", bridge = "objcKniBridge5274")
    open external fun initWithInvocation(/*0*/ inv: platform.Foundation.NSInvocation): platform.Foundation.NSInvocationOperation

    @kotlinx.cinterop.ObjCMethod(selector = "invocation", bridge = "objcKniBridge5276")
    open external fun invocation(): platform.Foundation.NSInvocation

    @kotlinx.cinterop.ObjCMethod(selector = "result", bridge = "objcKniBridge5278")
    open external fun result(): kotlin.Any?

    final val invocation: platform.Foundation.NSInvocation

    final val result: kotlin.Any?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSInvocationOperation>,
        platform.Foundation.NSInvocationOperationMeta {
    }
}

open expect class NSInvocationOperationMeta : platform.Foundation.NSOperationMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5270")
    open external override /*1*/ fun alloc(): platform.Foundation.NSInvocationOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5268")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSInvocationOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5266")
    open external override /*1*/ fun new(): platform.Foundation.NSInvocationOperation?
}

open expect class NSItemProvider : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "canLoadObjectOfClass:", bridge = "objcKniBridge1094")
    open external fun canLoadObjectOfClass(/*0*/ aClass: platform.Foundation.NSItemProviderReadingProtocol): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1112")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "hasItemConformingToTypeIdentifier:", bridge = "objcKniBridge1078")
    open external fun hasItemConformingToTypeIdentifier(/*0*/ typeIdentifier: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1070")
    open external override /*1*/ fun init(): platform.Foundation.NSItemProvider

    @kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge1100")
    open external fun initWithContentsOfURL(/*0*/ fileURL: platform.Foundation.NSURL?): platform.Foundation.NSItemProvider?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithItem:typeIdentifier:", bridge = "objcKniBridge1098")
    open external fun initWithItem(/*0*/ item: platform.Foundation.NSSecureCodingProtocol?, /*1*/
                                         typeIdentifier: kotlin.String?
    ): platform.Foundation.NSItemProvider

    @kotlinx.cinterop.ObjCMethod(selector = "initWithObject:", bridge = "objcKniBridge1088")
    open external fun initWithObject(/*0*/ `object`: platform.Foundation.NSItemProviderWritingProtocol): platform.Foundation.NSItemProvider

    @kotlinx.cinterop.ObjCMethod(
        selector = "loadDataRepresentationForTypeIdentifier:completionHandler:",
        bridge = "objcKniBridge1082"
    )
    open external fun loadDataRepresentationForTypeIdentifier(/*0*/ typeIdentifier: kotlin.String, /*1*/
                                                                    completionHandler: (platform.Foundation.NSData?, platform.Foundation.NSError?) -> kotlin.Unit
    ): platform.Foundation.NSProgress

    @kotlinx.cinterop.ObjCMethod(
        selector = "loadFileRepresentationForTypeIdentifier:completionHandler:",
        bridge = "objcKniBridge1084"
    )
    open external fun loadFileRepresentationForTypeIdentifier(/*0*/ typeIdentifier: kotlin.String, /*1*/
                                                                    completionHandler: (platform.Foundation.NSURL?, platform.Foundation.NSError?) -> kotlin.Unit
    ): platform.Foundation.NSProgress

    @kotlinx.cinterop.ObjCMethod(
        selector = "loadInPlaceFileRepresentationForTypeIdentifier:completionHandler:",
        bridge = "objcKniBridge1086"
    )
    open external fun loadInPlaceFileRepresentationForTypeIdentifier(/*0*/ typeIdentifier: kotlin.String, /*1*/
                                                                           completionHandler: (platform.Foundation.NSURL?, kotlin.Boolean, platform.Foundation.NSError?) -> kotlin.Unit
    ): platform.Foundation.NSProgress

    @kotlinx.cinterop.ObjCMethod(selector = "loadObjectOfClass:completionHandler:", bridge = "objcKniBridge1096")
    open external fun loadObjectOfClass(/*0*/ aClass: platform.Foundation.NSItemProviderReadingProtocol, /*1*/
                                              completionHandler: (platform.Foundation.NSItemProviderReadingProtocol?, platform.Foundation.NSError?) -> kotlin.Unit
    ): platform.Foundation.NSProgress

    @kotlinx.cinterop.ObjCMethod(selector = "registeredTypeIdentifiers", bridge = "objcKniBridge1106")
    open external fun registeredTypeIdentifiers(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "setSuggestedName:", bridge = "objcKniBridge1110")
    open external fun setSuggestedName(/*0*/ suggestedName: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "suggestedName", bridge = "objcKniBridge1108")
    open external fun suggestedName(): kotlin.String?

    final val registeredTypeIdentifiers: kotlin.collections.List<*>

    final var suggestedName: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSItemProvider>,
        platform.Foundation.NSItemProviderMeta {
    }
}

open expect class NSItemProviderMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1068")
    open external override /*1*/ fun alloc(): platform.Foundation.NSItemProvider?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1066")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSItemProvider?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1064")
    open external override /*1*/ fun new(): platform.Foundation.NSItemProvider?
}

expect interface NSItemProviderReadingProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSItemProviderReadingProtocolMeta : platform.darwin.NSObjectProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(
        selector = "objectWithItemProviderData:typeIdentifier:error:",
        bridge = "objcKniBridge40"
    )
    fun objectWithItemProviderData(/*0*/ data: platform.Foundation.NSData, /*1*/
                                         typeIdentifier: kotlin.String, /*2*/
                                         error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): platform.Foundation.NSItemProviderReadingProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "readableTypeIdentifiersForItemProvider", bridge = "objcKniBridge42")
    fun readableTypeIdentifiersForItemProvider(): kotlin.collections.List<*>
}

expect interface NSItemProviderWritingProtocol : platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(
        selector = "loadDataWithTypeIdentifier:forItemProviderCompletionHandler:",
        bridge = "objcKniBridge36"
    )
    fun loadDataWithTypeIdentifier(/*0*/ typeIdentifier: kotlin.String, /*1*/
                                         forItemProviderCompletionHandler: (platform.Foundation.NSData?, platform.Foundation.NSError?) -> kotlin.Unit
    ): platform.Foundation.NSProgress?
}

expect interface NSItemProviderWritingProtocolMeta : platform.darwin.NSObjectProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "writableTypeIdentifiersForItemProvider", bridge = "objcKniBridge31")
    fun writableTypeIdentifiersForItemProvider(): kotlin.collections.List<*>
}

open expect class NSJSONSerialization : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4810")
    open external override /*1*/ fun init(): platform.Foundation.NSJSONSerialization?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSJSONSerialization>,
        platform.Foundation.NSJSONSerializationMeta {
    }
}

open expect class NSJSONSerializationMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4808")
    open external override /*1*/ fun alloc(): platform.Foundation.NSJSONSerialization?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4806")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSJSONSerialization?

    @kotlinx.cinterop.ObjCMethod(selector = "isValidJSONObject:", bridge = "objcKniBridge4794")
    open external fun isValidJSONObject(/*0*/ obj: kotlin.Any): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4804")
    open external override /*1*/ fun new(): platform.Foundation.NSJSONSerialization?
}

open expect class NSKeyedArchiver : platform.Foundation.NSCoder {
    @kotlinx.cinterop.ObjCMethod(selector = "classNameForClass:", bridge = "objcKniBridge4972")
    open external fun classNameForClass(/*0*/ cls: kotlinx.cinterop.ObjCClass): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge4992")
    open external fun delegate(): platform.Foundation.NSKeyedArchiverDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeBool:forKey:", bridge = "objcKniBridge4978")
    open external fun encodeBool(/*0*/ value: kotlin.Boolean, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "encodeConditionalObject:forKey:", bridge = "objcKniBridge4976")
    open external fun encodeConditionalObject(/*0*/ `object`: kotlin.Any?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "encodeDouble:forKey:", bridge = "objcKniBridge4988")
    open external fun encodeDouble(/*0*/ value: kotlin.Double, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "encodeFloat:forKey:", bridge = "objcKniBridge4986")
    open external fun encodeFloat(/*0*/ value: kotlin.Float, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "encodeInt:forKey:", bridge = "objcKniBridge4980")
    open external fun encodeInt(/*0*/ value: kotlin.Int, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "encodeObject:forKey:", bridge = "objcKniBridge4974")
    open external fun encodeObject(/*0*/ `object`: kotlin.Any?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "encodedData", bridge = "objcKniBridge5000")
    open external fun encodedData(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "finishEncoding", bridge = "objcKniBridge4968")
    open external fun finishEncoding()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4964")
    open external override /*1*/ fun init(): platform.Foundation.NSKeyedArchiver

    @kotlinx.cinterop.ObjCMethod(selector = "initForWritingWithMutableData:", bridge = "objcKniBridge4966")
    open external fun initForWritingWithMutableData(/*0*/ data: platform.Foundation.NSMutableData): platform.Foundation.NSKeyedArchiver

    @kotlinx.cinterop.ObjCMethod(selector = "initRequiringSecureCoding:", bridge = "objcKniBridge4962")
    open external fun initRequiringSecureCoding(/*0*/ requiresSecureCoding: kotlin.Boolean): platform.Foundation.NSKeyedArchiver

    @kotlinx.cinterop.ObjCMethod(selector = "requiresSecureCoding", bridge = "objcKniBridge5002")
    open external fun requiresSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setClassName:forClass:", bridge = "objcKniBridge4970")
    open external fun setClassName(/*0*/ codedName: kotlin.String?, /*1*/ forClass: kotlinx.cinterop.ObjCClass)

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge4994")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSKeyedArchiverDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setRequiresSecureCoding:", bridge = "objcKniBridge5004")
    open external fun setRequiresSecureCoding(/*0*/ requiresSecureCoding: kotlin.Boolean)

    final var delegate: platform.Foundation.NSKeyedArchiverDelegateProtocol?

    final val encodedData: platform.Foundation.NSData

    final var requiresSecureCoding: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSKeyedArchiver>,
        platform.Foundation.NSKeyedArchiverMeta {
    }
}

expect interface NSKeyedArchiverDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSKeyedArchiverDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSKeyedArchiverMeta : platform.Foundation.NSCoderMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4960")
    open external override /*1*/ fun alloc(): platform.Foundation.NSKeyedArchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4958")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSKeyedArchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "archiveRootObject:toFile:", bridge = "objcKniBridge4950")
    open external fun archiveRootObject(/*0*/ rootObject: kotlin.Any, /*1*/ toFile: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "archivedDataWithRootObject:", bridge = "objcKniBridge4948")
    open external fun archivedDataWithRootObject(/*0*/ rootObject: kotlin.Any): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(
        selector = "archivedDataWithRootObject:requiringSecureCoding:error:",
        bridge = "objcKniBridge4946"
    )
    open external fun archivedDataWithRootObject(/*0*/ `object`: kotlin.Any, /*1*/
                                                       requiringSecureCoding: kotlin.Boolean, /*2*/
                                                       error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "classNameForClass:", bridge = "objcKniBridge4954")
    open external fun classNameForClass(/*0*/ cls: kotlinx.cinterop.ObjCClass): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4956")
    open external override /*1*/ fun new(): platform.Foundation.NSKeyedArchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "setClassName:forClass:", bridge = "objcKniBridge4952")
    open external fun setClassName(/*0*/ codedName: kotlin.String?, /*1*/ forClass: kotlinx.cinterop.ObjCClass)
}

open expect class NSKeyedUnarchiver : platform.Foundation.NSCoder {
    @kotlinx.cinterop.ObjCMethod(selector = "classForClassName:", bridge = "objcKniBridge5036")
    open external fun classForClassName(/*0*/ codedName: kotlin.String): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "containsValueForKey:", bridge = "objcKniBridge5038")
    open external fun containsValueForKey(/*0*/ key: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "decodeBoolForKey:", bridge = "objcKniBridge5042")
    open external fun decodeBoolForKey(/*0*/ key: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "decodeDoubleForKey:", bridge = "objcKniBridge5052")
    open external fun decodeDoubleForKey(/*0*/ key: kotlin.String): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "decodeFloatForKey:", bridge = "objcKniBridge5050")
    open external fun decodeFloatForKey(/*0*/ key: kotlin.String): kotlin.Float

    @kotlinx.cinterop.ObjCMethod(selector = "decodeIntForKey:", bridge = "objcKniBridge5044")
    open external fun decodeIntForKey(/*0*/ key: kotlin.String): kotlin.Int

    @kotlinx.cinterop.ObjCMethod(selector = "decodeObjectForKey:", bridge = "objcKniBridge5040")
    open external fun decodeObjectForKey(/*0*/ key: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "decodingFailurePolicy", bridge = "objcKniBridge5064")
    open external fun decodingFailurePolicy(): platform.Foundation.NSDecodingFailurePolicy

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge5056")
    open external fun delegate(): platform.Foundation.NSKeyedUnarchiverDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "finishDecoding", bridge = "objcKniBridge5032")
    open external fun finishDecoding()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5028")
    open external override /*1*/ fun init(): platform.Foundation.NSKeyedUnarchiver

    @kotlinx.cinterop.ObjCMethod(selector = "initForReadingFromData:error:", bridge = "objcKniBridge5026")
    open external fun initForReadingFromData(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                   error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): platform.Foundation.NSKeyedUnarchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "initForReadingWithData:", bridge = "objcKniBridge5030")
    open external fun initForReadingWithData(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSKeyedUnarchiver

    @kotlinx.cinterop.ObjCMethod(selector = "requiresSecureCoding", bridge = "objcKniBridge5060")
    open external fun requiresSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setClass:forClassName:", bridge = "objcKniBridge5034")
    open external fun setClass(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ forClassName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setDecodingFailurePolicy:", bridge = "objcKniBridge5066")
    open external fun setDecodingFailurePolicy(/*0*/ decodingFailurePolicy: platform.Foundation.NSDecodingFailurePolicy)

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge5058")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSKeyedUnarchiverDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setRequiresSecureCoding:", bridge = "objcKniBridge5062")
    open external fun setRequiresSecureCoding(/*0*/ requiresSecureCoding: kotlin.Boolean)

    final var decodingFailurePolicy: platform.Foundation.NSDecodingFailurePolicy

    final var delegate: platform.Foundation.NSKeyedUnarchiverDelegateProtocol?

    final var requiresSecureCoding: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSKeyedUnarchiver>,
        platform.Foundation.NSKeyedUnarchiverMeta {
    }
}

expect interface NSKeyedUnarchiverDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSKeyedUnarchiverDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSKeyedUnarchiverMeta : platform.Foundation.NSCoderMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5024")
    open external override /*1*/ fun alloc(): platform.Foundation.NSKeyedUnarchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5022")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSKeyedUnarchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "classForClassName:", bridge = "objcKniBridge5018")
    open external fun classForClassName(/*0*/ codedName: kotlin.String): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5020")
    open external override /*1*/ fun new(): platform.Foundation.NSKeyedUnarchiver?

    @kotlinx.cinterop.ObjCMethod(selector = "setClass:forClassName:", bridge = "objcKniBridge5016")
    open external fun setClass(/*0*/ cls: kotlinx.cinterop.ObjCClass?, /*1*/ forClassName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "unarchiveObjectWithData:", bridge = "objcKniBridge5010")
    open external fun unarchiveObjectWithData(/*0*/ data: platform.Foundation.NSData): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "unarchiveObjectWithFile:", bridge = "objcKniBridge5014")
    open external fun unarchiveObjectWithFile(/*0*/ path: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "unarchiveTopLevelObjectWithData:error:", bridge = "objcKniBridge5012")
    open external fun unarchiveTopLevelObjectWithData(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                            error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "unarchivedObjectOfClass:fromData:error:", bridge = "objcKniBridge5006")
    open external fun unarchivedObjectOfClass(/*0*/ cls: kotlinx.cinterop.ObjCClass, /*1*/
                                                    fromData: platform.Foundation.NSData, /*2*/
                                                    error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "unarchivedObjectOfClasses:fromData:error:", bridge = "objcKniBridge5008")
    open external fun unarchivedObjectOfClasses(/*0*/ classes: kotlin.collections.Set<*>, /*1*/
                                                      fromData: platform.Foundation.NSData, /*2*/
                                                      error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Any?
}

open expect class NSLengthFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2648")
    open external override /*1*/ fun init(): platform.Foundation.NSLengthFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2650")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSLengthFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "isForPersonHeightUse", bridge = "objcKniBridge2644")
    open external fun isForPersonHeightUse(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "numberFormatter", bridge = "objcKniBridge2636")
    open external fun numberFormatter(): platform.Foundation.NSNumberFormatter

    @kotlinx.cinterop.ObjCMethod(selector = "setForPersonHeightUse:", bridge = "objcKniBridge2646")
    open external fun setForPersonHeightUse(/*0*/ forPersonHeightUse: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setNumberFormatter:", bridge = "objcKniBridge2638")
    open external fun setNumberFormatter(/*0*/ numberFormatter: platform.Foundation.NSNumberFormatter?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromMeters:", bridge = "objcKniBridge2630")
    open external fun stringFromMeters(/*0*/ numberInMeters: kotlin.Double): kotlin.String

    final var forPersonHeightUse: kotlin.Boolean

    final var numberFormatter: platform.Foundation.NSNumberFormatter

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSLengthFormatter>,
        platform.Foundation.NSLengthFormatterMeta {
    }
}

open expect class NSLengthFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2626")
    open external override /*1*/ fun alloc(): platform.Foundation.NSLengthFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2624")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSLengthFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2622")
    open external override /*1*/ fun new(): platform.Foundation.NSLengthFormatter?
}

open expect class NSLinguisticTagger : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "dominantLanguage", bridge = "objcKniBridge6736")
    open external fun dominantLanguage(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6738")
    open external override /*1*/ fun init(): platform.Foundation.NSLinguisticTagger?

    @kotlinx.cinterop.ObjCMethod(selector = "sentenceRangeForRange:", bridge = "objcKniBridge6714")
    open external fun sentenceRangeForRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "setOrthography:range:", bridge = "objcKniBridge6706")
    open external fun setOrthography(/*0*/ orthography: platform.Foundation.NSOrthography?, /*1*/
                                           range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
    )

    @kotlinx.cinterop.ObjCMethod(selector = "setString:", bridge = "objcKniBridge6734")
    open external fun setString(/*0*/ string: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "string", bridge = "objcKniBridge6732")
    open external fun string(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "tagSchemes", bridge = "objcKniBridge6730")
    open external fun tagSchemes(): kotlin.collections.List<*>

    final val dominantLanguage: kotlin.String?

    final var string: kotlin.String?

    final val tagSchemes: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSLinguisticTagger>,
        platform.Foundation.NSLinguisticTaggerMeta {
    }
}

open expect class NSLinguisticTaggerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6702")
    open external override /*1*/ fun alloc(): platform.Foundation.NSLinguisticTagger?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6700")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSLinguisticTagger?

    @kotlinx.cinterop.ObjCMethod(selector = "availableTagSchemesForLanguage:", bridge = "objcKniBridge6688")
    open external fun availableTagSchemesForLanguage(/*0*/ language: kotlin.String): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "availableTagSchemesForUnit:language:", bridge = "objcKniBridge6686")
    open external fun availableTagSchemesForUnit(/*0*/ unit: platform.Foundation.NSLinguisticTaggerUnit, /*1*/
                                                       language: kotlin.String
    ): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "dominantLanguageForString:", bridge = "objcKniBridge6690")
    open external fun dominantLanguageForString(/*0*/ string: kotlin.String): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6698")
    open external override /*1*/ fun new(): platform.Foundation.NSLinguisticTagger?
}

final expect enum class NSLinguisticTaggerUnit : kotlinx.cinterop.CEnum {
    NSLinguisticTaggerUnitWord,

    NSLinguisticTaggerUnitSentence,

    NSLinguisticTaggerUnitParagraph,

    NSLinguisticTaggerUnitDocument;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSLinguisticTaggerUnit

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSLocale : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1132")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1134")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1130")
    open external override /*1*/ fun init(): platform.Foundation.NSLocale?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1128")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSLocale?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithLocaleIdentifier:", bridge = "objcKniBridge1126")
    open external fun initWithLocaleIdentifier(/*0*/ string: kotlin.String): platform.Foundation.NSLocale

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSLocale>,
        platform.Foundation.NSLocaleMeta {
    }
}

open expect class NSLocaleMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1118")
    open external override /*1*/ fun alloc(): platform.Foundation.NSLocale?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1116")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSLocale?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1114")
    open external override /*1*/ fun new(): platform.Foundation.NSLocale?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1120")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSLock : platform.darwin.NSObject, platform.Foundation.NSLockingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5082")
    open external override /*1*/ fun init(): platform.Foundation.NSLock?

    @kotlinx.cinterop.ObjCMethod(selector = "lock", bridge = "objcKniBridge5084")
    open external override /*1*/ fun lock()

    @kotlinx.cinterop.ObjCMethod(selector = "lockBeforeDate:", bridge = "objcKniBridge5076")
    open external fun lockBeforeDate(/*0*/ limit: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge5078")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge5080")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "tryLock", bridge = "objcKniBridge5074")
    open external fun tryLock(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "unlock", bridge = "objcKniBridge5086")
    open external override /*1*/ fun unlock()

    final var name: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSLock>,
        platform.Foundation.NSLockMeta {
    }
}

open expect class NSLockMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSLockingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5072")
    open external override /*1*/ fun alloc(): platform.Foundation.NSLock?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5070")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSLock?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5068")
    open external override /*1*/ fun new(): platform.Foundation.NSLock?
}

expect interface NSLockingProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "lock", bridge = "objcKniBridge124")
    fun lock()

    @kotlinx.cinterop.ObjCMethod(selector = "unlock", bridge = "objcKniBridge126")
    fun unlock()
}

expect interface NSLockingProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

open expect class NSMachPort : platform.Foundation.NSPort {
    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge5362")
    open external override /*1*/ fun delegate(): platform.Foundation.NSMachPortDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5368")
    open external override /*1*/ fun init(): platform.Foundation.NSMachPort?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5370")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMachPort?

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge5360")
    open external fun setDelegate(/*0*/ anObject: platform.Foundation.NSMachPortDelegateProtocol?)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMachPort>,
        platform.Foundation.NSMachPortMeta {
    }
}

expect interface NSMachPortDelegateProtocol : platform.Foundation.NSPortDelegateProtocol {
}

expect interface NSMachPortDelegateProtocolMeta : platform.Foundation.NSPortDelegateProtocolMeta {
}

open expect class NSMachPortMeta : platform.Foundation.NSPortMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5356")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMachPort?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5354")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMachPort?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5352")
    open external override /*1*/ fun new(): platform.Foundation.NSMachPort?
}

final expect class NSMapEnumerator : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSMapTable : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol, platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5210")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "dictionaryRepresentation", bridge = "objcKniBridge5198")
    open external fun dictionaryRepresentation(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5212")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5206")
    open external override /*1*/ fun init(): platform.Foundation.NSMapTable?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5208")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMapTable?

    @kotlinx.cinterop.ObjCMethod(selector = "keyEnumerator", bridge = "objcKniBridge5192")
    open external fun keyEnumerator(): platform.Foundation.NSEnumerator

    @kotlinx.cinterop.ObjCMethod(selector = "keyPointerFunctions", bridge = "objcKniBridge5200")
    open external fun keyPointerFunctions(): platform.Foundation.NSPointerFunctions

    @kotlinx.cinterop.ObjCMethod(selector = "objectEnumerator", bridge = "objcKniBridge5194")
    open external fun objectEnumerator(): platform.Foundation.NSEnumerator?

    @kotlinx.cinterop.ObjCMethod(selector = "objectForKey:", bridge = "objcKniBridge5186")
    open external fun objectForKey(/*0*/ aKey: kotlin.Any?): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge5196")
    open external fun removeAllObjects()

    @kotlinx.cinterop.ObjCMethod(selector = "removeObjectForKey:", bridge = "objcKniBridge5188")
    open external fun removeObjectForKey(/*0*/ aKey: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "setObject:forKey:", bridge = "objcKniBridge5190")
    open external fun setObject(/*0*/ anObject: kotlin.Any?, /*1*/ forKey: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "valuePointerFunctions", bridge = "objcKniBridge5202")
    open external fun valuePointerFunctions(): platform.Foundation.NSPointerFunctions

    final val keyPointerFunctions: platform.Foundation.NSPointerFunctions

    final val valuePointerFunctions: platform.Foundation.NSPointerFunctions

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMapTable>,
        platform.Foundation.NSMapTableMeta {
    }
}

final expect class NSMapTableKeyCallBacks : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSMapTableMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta, platform.Foundation.NSFastEnumerationProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5178")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMapTable?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5176")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMapTable?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5174")
    open external override /*1*/ fun new(): platform.Foundation.NSMapTable?

    @kotlinx.cinterop.ObjCMethod(selector = "strongToStrongObjectsMapTable", bridge = "objcKniBridge5166")
    open external fun strongToStrongObjectsMapTable(): platform.Foundation.NSMapTable

    @kotlinx.cinterop.ObjCMethod(selector = "strongToWeakObjectsMapTable", bridge = "objcKniBridge5170")
    open external fun strongToWeakObjectsMapTable(): platform.Foundation.NSMapTable

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5180")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "weakToStrongObjectsMapTable", bridge = "objcKniBridge5168")
    open external fun weakToStrongObjectsMapTable(): platform.Foundation.NSMapTable

    @kotlinx.cinterop.ObjCMethod(selector = "weakToWeakObjectsMapTable", bridge = "objcKniBridge5172")
    open external fun weakToWeakObjectsMapTable(): platform.Foundation.NSMapTable
}

final expect class NSMapTableValueCallBacks : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSMassFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2368")
    open external override /*1*/ fun init(): platform.Foundation.NSMassFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2370")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMassFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "isForPersonMassUse", bridge = "objcKniBridge2364")
    open external fun isForPersonMassUse(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "numberFormatter", bridge = "objcKniBridge2356")
    open external fun numberFormatter(): platform.Foundation.NSNumberFormatter

    @kotlinx.cinterop.ObjCMethod(selector = "setForPersonMassUse:", bridge = "objcKniBridge2366")
    open external fun setForPersonMassUse(/*0*/ forPersonMassUse: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setNumberFormatter:", bridge = "objcKniBridge2358")
    open external fun setNumberFormatter(/*0*/ numberFormatter: platform.Foundation.NSNumberFormatter?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromKilograms:", bridge = "objcKniBridge2350")
    open external fun stringFromKilograms(/*0*/ numberInKilograms: kotlin.Double): kotlin.String

    final var forPersonMassUse: kotlin.Boolean

    final var numberFormatter: platform.Foundation.NSNumberFormatter

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMassFormatter>,
        platform.Foundation.NSMassFormatterMeta {
    }
}

open expect class NSMassFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2346")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMassFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2344")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMassFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2342")
    open external override /*1*/ fun new(): platform.Foundation.NSMassFormatter?
}

open expect class NSMeasurement : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "canBeConvertedToUnit:", bridge = "objcKniBridge3516")
    open external fun canBeConvertedToUnit(/*0*/ unit: platform.Foundation.NSUnit): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge3532")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "doubleValue", bridge = "objcKniBridge3526")
    open external fun doubleValue(): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3534")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3528")
    open external override /*1*/ fun init(): platform.Foundation.NSMeasurement?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3530")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMeasurement?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDoubleValue:unit:", bridge = "objcKniBridge3514")
    open external fun initWithDoubleValue(/*0*/ doubleValue: kotlin.Double, /*1*/
                                                unit: platform.Foundation.NSUnit?
    ): platform.Foundation.NSMeasurement

    @kotlinx.cinterop.ObjCMethod(selector = "measurementByAddingMeasurement:", bridge = "objcKniBridge3520")
    open external fun measurementByAddingMeasurement(/*0*/ measurement: platform.Foundation.NSMeasurement): platform.Foundation.NSMeasurement

    @kotlinx.cinterop.ObjCMethod(selector = "measurementByConvertingToUnit:", bridge = "objcKniBridge3518")
    open external fun measurementByConvertingToUnit(/*0*/ unit: platform.Foundation.NSUnit): platform.Foundation.NSMeasurement

    @kotlinx.cinterop.ObjCMethod(selector = "measurementBySubtractingMeasurement:", bridge = "objcKniBridge3522")
    open external fun measurementBySubtractingMeasurement(/*0*/ measurement: platform.Foundation.NSMeasurement): platform.Foundation.NSMeasurement

    @kotlinx.cinterop.ObjCMethod(selector = "unit", bridge = "objcKniBridge3524")
    open external fun unit(): platform.Foundation.NSUnit?

    final val doubleValue: kotlin.Double

    final val unit: platform.Foundation.NSUnit?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMeasurement>,
        platform.Foundation.NSMeasurementMeta {
    }
}

open expect class NSMeasurementFormatter : platform.Foundation.NSFormatter, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3568")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3564")
    open external override /*1*/ fun init(): platform.Foundation.NSMeasurementFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3566")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMeasurementFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "locale", bridge = "objcKniBridge3556")
    open external fun locale(): platform.Foundation.NSLocale

    @kotlinx.cinterop.ObjCMethod(selector = "numberFormatter", bridge = "objcKniBridge3560")
    open external fun numberFormatter(): platform.Foundation.NSNumberFormatter

    @kotlinx.cinterop.ObjCMethod(selector = "setLocale:", bridge = "objcKniBridge3558")
    open external fun setLocale(/*0*/ locale: platform.Foundation.NSLocale?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNumberFormatter:", bridge = "objcKniBridge3562")
    open external fun setNumberFormatter(/*0*/ numberFormatter: platform.Foundation.NSNumberFormatter?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromMeasurement:", bridge = "objcKniBridge3544")
    open external fun stringFromMeasurement(/*0*/ measurement: platform.Foundation.NSMeasurement): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromUnit:", bridge = "objcKniBridge3546")
    open external fun stringFromUnit(/*0*/ unit: platform.Foundation.NSUnit): kotlin.String

    final var locale: platform.Foundation.NSLocale

    final var numberFormatter: platform.Foundation.NSNumberFormatter

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMeasurementFormatter>,
        platform.Foundation.NSMeasurementFormatterMeta {
    }
}

open expect class NSMeasurementFormatterMeta : platform.Foundation.NSFormatterMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3540")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMeasurementFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3538")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMeasurementFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3536")
    open external override /*1*/ fun new(): platform.Foundation.NSMeasurementFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3542")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSMeasurementMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3510")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMeasurement?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3508")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMeasurement?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3506")
    open external override /*1*/ fun new(): platform.Foundation.NSMeasurement?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3512")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSMessagePort : platform.Foundation.NSPort {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5378")
    open external override /*1*/ fun init(): platform.Foundation.NSMessagePort?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5380")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMessagePort?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMessagePort>,
        platform.Foundation.NSMessagePortMeta {
    }
}

open expect class NSMessagePortMeta : platform.Foundation.NSPortMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5376")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMessagePort?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5374")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMessagePort?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5372")
    open external override /*1*/ fun new(): platform.Foundation.NSMessagePort?
}

open expect class NSMetadataItem : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "attributes", bridge = "objcKniBridge6826")
    open external fun attributes(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6828")
    open external override /*1*/ fun init(): platform.Foundation.NSMetadataItem?

    @kotlinx.cinterop.ObjCMethod(selector = "valueForAttribute:", bridge = "objcKniBridge6822")
    open external fun valueForAttribute(/*0*/ key: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "valuesForAttributes:", bridge = "objcKniBridge6824")
    open external fun valuesForAttributes(/*0*/ keys: kotlin.collections.List<*>): kotlin.collections.Map<kotlin.Any?, *>?

    final val attributes: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMetadataItem>,
        platform.Foundation.NSMetadataItemMeta {
    }
}

open expect class NSMetadataItemMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6820")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMetadataItem?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6818")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMetadataItem?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6816")
    open external override /*1*/ fun new(): platform.Foundation.NSMetadataItem?
}

open expect class NSMetadataQuery : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge6764")
    open external fun delegate(): platform.Foundation.NSMetadataQueryDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "disableUpdates", bridge = "objcKniBridge6750")
    open external fun disableUpdates()

    @kotlinx.cinterop.ObjCMethod(selector = "enableUpdates", bridge = "objcKniBridge6752")
    open external fun enableUpdates()

    @kotlinx.cinterop.ObjCMethod(selector = "groupedResults", bridge = "objcKniBridge6812")
    open external fun groupedResults(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "groupingAttributes", bridge = "objcKniBridge6780")
    open external fun groupingAttributes(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6814")
    open external override /*1*/ fun init(): platform.Foundation.NSMetadataQuery?

    @kotlinx.cinterop.ObjCMethod(selector = "isGathering", bridge = "objcKniBridge6802")
    open external fun isGathering(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isStarted", bridge = "objcKniBridge6800")
    open external fun isStarted(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isStopped", bridge = "objcKniBridge6804")
    open external fun isStopped(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "operationQueue", bridge = "objcKniBridge6796")
    open external fun operationQueue(): platform.Foundation.NSOperationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "predicate", bridge = "objcKniBridge6768")
    open external fun predicate(): platform.Foundation.NSPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "results", bridge = "objcKniBridge6808")
    open external fun results(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "searchItems", bridge = "objcKniBridge6792")
    open external fun searchItems(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "searchScopes", bridge = "objcKniBridge6788")
    open external fun searchScopes(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge6766")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSMetadataQueryDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setGroupingAttributes:", bridge = "objcKniBridge6782")
    open external fun setGroupingAttributes(/*0*/ groupingAttributes: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setOperationQueue:", bridge = "objcKniBridge6798")
    open external fun setOperationQueue(/*0*/ operationQueue: platform.Foundation.NSOperationQueue?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPredicate:", bridge = "objcKniBridge6770")
    open external fun setPredicate(/*0*/ predicate: platform.Foundation.NSPredicate?)

    @kotlinx.cinterop.ObjCMethod(selector = "setSearchItems:", bridge = "objcKniBridge6794")
    open external fun setSearchItems(/*0*/ searchItems: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setSearchScopes:", bridge = "objcKniBridge6790")
    open external fun setSearchScopes(/*0*/ searchScopes: kotlin.collections.List<*>)

    @kotlinx.cinterop.ObjCMethod(selector = "setSortDescriptors:", bridge = "objcKniBridge6774")
    open external fun setSortDescriptors(/*0*/ sortDescriptors: kotlin.collections.List<*>)

    @kotlinx.cinterop.ObjCMethod(selector = "setValueListAttributes:", bridge = "objcKniBridge6778")
    open external fun setValueListAttributes(/*0*/ valueListAttributes: kotlin.collections.List<*>)

    @kotlinx.cinterop.ObjCMethod(selector = "sortDescriptors", bridge = "objcKniBridge6772")
    open external fun sortDescriptors(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "startQuery", bridge = "objcKniBridge6746")
    open external fun startQuery(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "stopQuery", bridge = "objcKniBridge6748")
    open external fun stopQuery()

    @kotlinx.cinterop.ObjCMethod(selector = "valueListAttributes", bridge = "objcKniBridge6776")
    open external fun valueListAttributes(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "valueLists", bridge = "objcKniBridge6810")
    open external fun valueLists(): kotlin.collections.Map<kotlin.Any?, *>

    final var delegate: platform.Foundation.NSMetadataQueryDelegateProtocol?

    final val gathering: kotlin.Boolean

    final val groupedResults: kotlin.collections.List<*>

    final var groupingAttributes: kotlin.collections.List<*>?

    final var operationQueue: platform.Foundation.NSOperationQueue?

    final var predicate: platform.Foundation.NSPredicate?

    final val results: kotlin.collections.List<*>

    final var searchItems: kotlin.collections.List<*>?

    final var searchScopes: kotlin.collections.List<*>

    final var sortDescriptors: kotlin.collections.List<*>

    final val started: kotlin.Boolean

    final val stopped: kotlin.Boolean

    final var valueListAttributes: kotlin.collections.List<*>

    final val valueLists: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMetadataQuery>,
        platform.Foundation.NSMetadataQueryMeta {
    }
}

open expect class NSMetadataQueryAttributeValueTuple : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "attribute", bridge = "objcKniBridge6836")
    open external fun attribute(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6842")
    open external override /*1*/ fun init(): platform.Foundation.NSMetadataQueryAttributeValueTuple?

    @kotlinx.cinterop.ObjCMethod(selector = "value", bridge = "objcKniBridge6838")
    open external fun value(): kotlin.Any?

    final val attribute: kotlin.String

    final val value: kotlin.Any?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMetadataQueryAttributeValueTuple>,
        platform.Foundation.NSMetadataQueryAttributeValueTupleMeta {
    }
}

open expect class NSMetadataQueryAttributeValueTupleMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6834")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMetadataQueryAttributeValueTuple?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6832")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMetadataQueryAttributeValueTuple?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6830")
    open external override /*1*/ fun new(): platform.Foundation.NSMetadataQueryAttributeValueTuple?
}

expect interface NSMetadataQueryDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSMetadataQueryDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSMetadataQueryMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6744")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMetadataQuery?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6742")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMetadataQuery?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6740")
    open external override /*1*/ fun new(): platform.Foundation.NSMetadataQuery?
}

open expect class NSMetadataQueryResultGroup : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "attribute", bridge = "objcKniBridge6852")
    open external fun attribute(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6862")
    open external override /*1*/ fun init(): platform.Foundation.NSMetadataQueryResultGroup?

    @kotlinx.cinterop.ObjCMethod(selector = "results", bridge = "objcKniBridge6860")
    open external fun results(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "subgroups", bridge = "objcKniBridge6856")
    open external fun subgroups(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "value", bridge = "objcKniBridge6854")
    open external fun value(): kotlin.Any

    final val attribute: kotlin.String

    final val results: kotlin.collections.List<*>

    final val subgroups: kotlin.collections.List<*>?

    final val value: kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMetadataQueryResultGroup>,
        platform.Foundation.NSMetadataQueryResultGroupMeta {
    }
}

open expect class NSMetadataQueryResultGroupMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6848")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMetadataQueryResultGroup?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6846")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMetadataQueryResultGroup?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6844")
    open external override /*1*/ fun new(): platform.Foundation.NSMetadataQueryResultGroup?
}

open expect class NSMethodSignature : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge460")
    open external override /*1*/ fun init(): platform.Foundation.NSMethodSignature?

    @kotlinx.cinterop.ObjCMethod(selector = "isOneway", bridge = "objcKniBridge450")
    open external fun isOneway(): kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMethodSignature>,
        platform.Foundation.NSMethodSignatureMeta {
    }
}

open expect class NSMethodSignatureMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge446")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMethodSignature?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge444")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMethodSignature?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge442")
    open external override /*1*/ fun new(): platform.Foundation.NSMethodSignature?
}

open expect class NSMutableArray : platform.Foundation.NSArray {
    @kotlinx.cinterop.ObjCMethod(selector = "addObject:", bridge = "objcKniBridge936")
    open external fun addObject(/*0*/ anObject: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge948")
    open external override /*1*/ fun init(): kotlin.collections.MutableList<kotlin.Any?>

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge952")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): kotlin.collections.MutableList<kotlin.Any?>?

    @kotlinx.cinterop.ObjCMethod(selector = "removeLastObject", bridge = "objcKniBridge940")
    open external fun removeLastObject()

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableArray>,
        platform.Foundation.NSMutableArrayMeta {
    }
}

open expect class NSMutableArrayMeta : platform.Foundation.NSArrayMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge934")
    open external override /*1*/ fun alloc(): kotlin.collections.MutableList<kotlin.Any?>?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge932")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): kotlin.collections.MutableList<kotlin.Any?>?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge930")
    open external override /*1*/ fun new(): kotlin.collections.MutableList<kotlin.Any?>?
}

open expect class NSMutableAttributedString : platform.Foundation.NSAttributedString {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2084")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2086")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "replaceCharactersInRange:withString:", bridge = "objcKniBridge2080")
    open external fun replaceCharactersInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                     withString: kotlin.String
    )

    @kotlinx.cinterop.ObjCMethod(selector = "setAttributes:range:", bridge = "objcKniBridge2082")
    open external fun setAttributes(/*0*/ attrs: kotlin.collections.Map<kotlin.Any?, *>?, /*1*/
                                          range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
    )

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableAttributedString>,
        platform.Foundation.NSMutableAttributedStringMeta {
    }
}

open expect class NSMutableAttributedStringMeta : platform.Foundation.NSAttributedStringMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2078")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2076")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableAttributedString?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2074")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableAttributedString?
}

open expect class NSMutableCharacterSet : platform.Foundation.NSCharacterSet, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "addCharactersInRange:", bridge = "objcKniBridge1960")
    open external fun addCharactersInRange(/*0*/ aRange: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

    @kotlinx.cinterop.ObjCMethod(selector = "addCharactersInString:", bridge = "objcKniBridge1964")
    open external fun addCharactersInString(/*0*/ aString: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1978")
    open external override /*2*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1982")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "formIntersectionWithCharacterSet:", bridge = "objcKniBridge1970")
    open external fun formIntersectionWithCharacterSet(/*0*/ otherSet: platform.Foundation.NSCharacterSet)

    @kotlinx.cinterop.ObjCMethod(selector = "formUnionWithCharacterSet:", bridge = "objcKniBridge1968")
    open external fun formUnionWithCharacterSet(/*0*/ otherSet: platform.Foundation.NSCharacterSet)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1976")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1974")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "invert", bridge = "objcKniBridge1972")
    open external fun invert()

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge1980")
    open external override /*2*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "removeCharactersInRange:", bridge = "objcKniBridge1962")
    open external fun removeCharactersInRange(/*0*/ aRange: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

    @kotlinx.cinterop.ObjCMethod(selector = "removeCharactersInString:", bridge = "objcKniBridge1966")
    open external fun removeCharactersInString(/*0*/ aString: kotlin.String)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableCharacterSet>,
        platform.Foundation.NSMutableCharacterSetMeta {
    }
}

open expect class NSMutableCharacterSetMeta : platform.Foundation.NSCharacterSetMeta,
    platform.Foundation.NSCopyingProtocolMeta, platform.Foundation.NSMutableCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1956")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1954")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "alphanumericCharacterSet", bridge = "objcKniBridge1930")
    open external override /*1*/ fun alphanumericCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "capitalizedLetterCharacterSet", bridge = "objcKniBridge1938")
    open external override /*1*/ fun capitalizedLetterCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithBitmapRepresentation:", bridge = "objcKniBridge1948")
    open external override /*1*/ fun characterSetWithBitmapRepresentation(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithCharactersInString:", bridge = "objcKniBridge1946")
    open external override /*1*/ fun characterSetWithCharactersInString(/*0*/ aString: kotlin.String): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithContentsOfFile:", bridge = "objcKniBridge1950")
    open external override /*1*/ fun characterSetWithContentsOfFile(/*0*/ fName: kotlin.String): platform.Foundation.NSMutableCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "characterSetWithRange:", bridge = "objcKniBridge1944")
    open external override /*1*/ fun characterSetWithRange(/*0*/ aRange: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "controlCharacterSet", bridge = "objcKniBridge1914")
    open external override /*1*/ fun controlCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "decimalDigitCharacterSet", bridge = "objcKniBridge1920")
    open external override /*1*/ fun decimalDigitCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "decomposableCharacterSet", bridge = "objcKniBridge1932")
    open external override /*1*/ fun decomposableCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "illegalCharacterSet", bridge = "objcKniBridge1934")
    open external override /*1*/ fun illegalCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "letterCharacterSet", bridge = "objcKniBridge1922")
    open external override /*1*/ fun letterCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "lowercaseLetterCharacterSet", bridge = "objcKniBridge1924")
    open external override /*1*/ fun lowercaseLetterCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1952")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "newlineCharacterSet", bridge = "objcKniBridge1942")
    open external override /*1*/ fun newlineCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "nonBaseCharacterSet", bridge = "objcKniBridge1928")
    open external override /*1*/ fun nonBaseCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "punctuationCharacterSet", bridge = "objcKniBridge1936")
    open external override /*1*/ fun punctuationCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1958")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "symbolCharacterSet", bridge = "objcKniBridge1940")
    open external override /*1*/ fun symbolCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "uppercaseLetterCharacterSet", bridge = "objcKniBridge1926")
    open external override /*1*/ fun uppercaseLetterCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "whitespaceAndNewlineCharacterSet", bridge = "objcKniBridge1918")
    open external override /*1*/ fun whitespaceAndNewlineCharacterSet(): platform.Foundation.NSMutableCharacterSet

    @kotlinx.cinterop.ObjCMethod(selector = "whitespaceCharacterSet", bridge = "objcKniBridge1916")
    open external override /*1*/ fun whitespaceCharacterSet(): platform.Foundation.NSMutableCharacterSet
}

expect interface NSMutableCopyingProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge5")
    fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any
}

expect interface NSMutableCopyingProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

open expect class NSMutableData : platform.Foundation.NSData {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1994")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableData?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1996")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableData?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableData>,
        platform.Foundation.NSMutableDataMeta {
    }
}

open expect class NSMutableDataMeta : platform.Foundation.NSDataMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1988")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableData?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1986")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableData?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1984")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableData?
}

open expect class NSMutableDictionary : platform.Foundation.NSDictionary {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1244")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableDictionary

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1248")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableDictionary?

    @kotlinx.cinterop.ObjCMethod(selector = "removeObjectForKey:", bridge = "objcKniBridge1238")
    open external fun removeObjectForKey(/*0*/ aKey: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "setObject:forKey:", bridge = "objcKniBridge1240")
    open external fun setObject(/*0*/ anObject: kotlin.Any?, /*1*/ forKey: platform.Foundation.NSCopyingProtocol?)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableDictionary>,
        platform.Foundation.NSMutableDictionaryMeta {
    }
}

open expect class NSMutableDictionaryMeta : platform.Foundation.NSDictionaryMeta {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1236")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableDictionary?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1234")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableDictionary?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1232")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableDictionary?
}

open expect class NSMutableIndexSet : platform.Foundation.NSIndexSet {
    @kotlinx.cinterop.ObjCMethod(selector = "addIndexes:", bridge = "objcKniBridge4768")
    open external fun addIndexes(/*0*/ indexSet: platform.Foundation.NSIndexSet)

    @kotlinx.cinterop.ObjCMethod(selector = "addIndexesInRange:", bridge = "objcKniBridge4778")
    open external fun addIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4790")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4792")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithIndexSet:", bridge = "objcKniBridge4786")
    open external override /*1*/ fun initWithIndexSet(/*0*/ indexSet: platform.Foundation.NSIndexSet): platform.Foundation.NSMutableIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "initWithIndexesInRange:", bridge = "objcKniBridge4784")
    open external override /*1*/ fun initWithIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSMutableIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllIndexes", bridge = "objcKniBridge4772")
    open external fun removeAllIndexes()

    @kotlinx.cinterop.ObjCMethod(selector = "removeIndexes:", bridge = "objcKniBridge4770")
    open external fun removeIndexes(/*0*/ indexSet: platform.Foundation.NSIndexSet)

    @kotlinx.cinterop.ObjCMethod(selector = "removeIndexesInRange:", bridge = "objcKniBridge4780")
    open external fun removeIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableIndexSet>,
        platform.Foundation.NSMutableIndexSetMeta {
    }
}

open expect class NSMutableIndexSetMeta : platform.Foundation.NSIndexSetMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4766")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4764")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableIndexSet?

    @kotlinx.cinterop.ObjCMethod(selector = "indexSet", bridge = "objcKniBridge4756")
    open external override /*1*/ fun indexSet(): platform.Foundation.NSMutableIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "indexSetWithIndexesInRange:", bridge = "objcKniBridge4760")
    open external override /*1*/ fun indexSetWithIndexesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSMutableIndexSet

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4762")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableIndexSet?
}

open expect class NSMutableOrderedSet : platform.Foundation.NSOrderedSet {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4918")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableOrderedSet

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4922")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableOrderedSet?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableOrderedSet>,
        platform.Foundation.NSMutableOrderedSetMeta {
    }
}

open expect class NSMutableOrderedSetMeta : platform.Foundation.NSOrderedSetMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4908")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableOrderedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4906")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableOrderedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4904")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableOrderedSet?
}

open expect class NSMutableSet : platform.Foundation.NSSet {
    @kotlinx.cinterop.ObjCMethod(selector = "addObject:", bridge = "objcKniBridge1256")
    open external fun addObject(/*0*/ `object`: kotlin.Any?)

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1262")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableSet

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1266")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableSet?

    @kotlinx.cinterop.ObjCMethod(selector = "removeObject:", bridge = "objcKniBridge1258")
    open external fun removeObject(/*0*/ `object`: kotlin.Any?)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableSet>,
        platform.Foundation.NSMutableSetMeta {
    }
}

open expect class NSMutableSetMeta : platform.Foundation.NSSetMeta {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1254")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableSet?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1252")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableSet?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1250")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableSet?
}

open expect class NSMutableURLRequest : platform.Foundation.NSURLRequest {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5942")
    open external override /*1*/ fun init(): platform.Foundation.NSMutableURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5944")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSMutableURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithURL:", bridge = "objcKniBridge5938")
    open external override /*1*/ fun initWithURL(/*0*/ URL: platform.Foundation.NSURL): platform.Foundation.NSMutableURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "setAllowsCellularAccess:", bridge = "objcKniBridge5936")
    open external fun setAllowsCellularAccess(/*0*/ allowsCellularAccess: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setMainDocumentURL:", bridge = "objcKniBridge5932")
    open external fun setMainDocumentURL(/*0*/ mainDocumentURL: platform.Foundation.NSURL?)

    @kotlinx.cinterop.ObjCMethod(selector = "setURL:", bridge = "objcKniBridge5926")
    open external fun setURL(/*0*/ URL: platform.Foundation.NSURL?)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSMutableURLRequest>,
        platform.Foundation.NSMutableURLRequestMeta {
    }
}

open expect class NSMutableURLRequestMeta : platform.Foundation.NSURLRequestMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5924")
    open external override /*1*/ fun alloc(): platform.Foundation.NSMutableURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5922")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSMutableURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5920")
    open external override /*1*/ fun new(): platform.Foundation.NSMutableURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "requestWithURL:", bridge = "objcKniBridge5916")
    open external override /*1*/ fun requestWithURL(/*0*/ URL: platform.Foundation.NSURL): platform.Foundation.NSMutableURLRequest
}

open expect class NSNetService : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "TXTRecordData", bridge = "objcKniBridge6896")
    open external fun TXTRecordData(): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "addresses", bridge = "objcKniBridge6918")
    open external fun addresses(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge6902")
    open external fun delegate(): platform.Foundation.NSNetServiceDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "domain", bridge = "objcKniBridge6914")
    open external fun domain(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "getInputStream:outputStream:", bridge = "objcKniBridge6892")
    open external fun getInputStream(/*0*/ inputStream: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSInputStream?>>?, /*1*/
                                           outputStream: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSOutputStream?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "hostName", bridge = "objcKniBridge6916")
    open external fun hostName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "includesPeerToPeer", bridge = "objcKniBridge6906")
    open external fun includesPeerToPeer(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6922")
    open external override /*1*/ fun init(): platform.Foundation.NSNetService?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDomain:type:name:", bridge = "objcKniBridge6876")
    open external fun initWithDomain(/*0*/ domain: kotlin.String, /*1*/
                                           type: kotlin.String, /*2*/
                                           name: kotlin.String
    ): platform.Foundation.NSNetService

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDomain:type:name:port:", bridge = "objcKniBridge6874")
    open external fun initWithDomain(/*0*/ domain: kotlin.String, /*1*/
                                           type: kotlin.String, /*2*/
                                           name: kotlin.String, /*3*/
                                           port: kotlin.Int
    ): platform.Foundation.NSNetService

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge6910")
    open external fun name(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "publish", bridge = "objcKniBridge6882")
    open external fun publish()

    @kotlinx.cinterop.ObjCMethod(selector = "resolve", bridge = "objcKniBridge6886")
    open external fun resolve()

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge6904")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSNetServiceDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesPeerToPeer:", bridge = "objcKniBridge6908")
    open external fun setIncludesPeerToPeer(/*0*/ includesPeerToPeer: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setTXTRecordData:", bridge = "objcKniBridge6894")
    open external fun setTXTRecordData(/*0*/ recordData: platform.Foundation.NSData?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "startMonitoring", bridge = "objcKniBridge6898")
    open external fun startMonitoring()

    @kotlinx.cinterop.ObjCMethod(selector = "stop", bridge = "objcKniBridge6888")
    open external fun stop()

    @kotlinx.cinterop.ObjCMethod(selector = "stopMonitoring", bridge = "objcKniBridge6900")
    open external fun stopMonitoring()

    @kotlinx.cinterop.ObjCMethod(selector = "type", bridge = "objcKniBridge6912")
    open external fun type(): kotlin.String

    final val addresses: kotlin.collections.List<*>?

    final var delegate: platform.Foundation.NSNetServiceDelegateProtocol?

    final val domain: kotlin.String

    final val hostName: kotlin.String?

    final var includesPeerToPeer: kotlin.Boolean

    final val name: kotlin.String

    final val type: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNetService>,
        platform.Foundation.NSNetServiceMeta {
    }
}

open expect class NSNetServiceBrowser : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge6944")
    open external fun delegate(): platform.Foundation.NSNetServiceBrowserDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "includesPeerToPeer", bridge = "objcKniBridge6948")
    open external fun includesPeerToPeer(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6930")
    open external override /*1*/ fun init(): platform.Foundation.NSNetServiceBrowser

    @kotlinx.cinterop.ObjCMethod(selector = "searchForBrowsableDomains", bridge = "objcKniBridge6936")
    open external fun searchForBrowsableDomains()

    @kotlinx.cinterop.ObjCMethod(selector = "searchForRegistrationDomains", bridge = "objcKniBridge6938")
    open external fun searchForRegistrationDomains()

    @kotlinx.cinterop.ObjCMethod(selector = "searchForServicesOfType:inDomain:", bridge = "objcKniBridge6940")
    open external fun searchForServicesOfType(/*0*/ type: kotlin.String, /*1*/ inDomain: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge6946")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSNetServiceBrowserDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setIncludesPeerToPeer:", bridge = "objcKniBridge6950")
    open external fun setIncludesPeerToPeer(/*0*/ includesPeerToPeer: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "stop", bridge = "objcKniBridge6942")
    open external fun stop()

    final var delegate: platform.Foundation.NSNetServiceBrowserDelegateProtocol?

    final var includesPeerToPeer: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNetServiceBrowser>,
        platform.Foundation.NSNetServiceBrowserMeta {
    }
}

expect interface NSNetServiceBrowserDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSNetServiceBrowserDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSNetServiceBrowserMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6928")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNetServiceBrowser?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6926")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNetServiceBrowser?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6924")
    open external override /*1*/ fun new(): platform.Foundation.NSNetServiceBrowser?
}

expect interface NSNetServiceDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSNetServiceDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSNetServiceMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6872")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNetService?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6870")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNetService?

    @kotlinx.cinterop.ObjCMethod(selector = "dataFromTXTRecordDictionary:", bridge = "objcKniBridge6866")
    open external fun dataFromTXTRecordDictionary(/*0*/ txtDictionary: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "dictionaryFromTXTRecordData:", bridge = "objcKniBridge6864")
    open external fun dictionaryFromTXTRecordData(/*0*/ txtData: platform.Foundation.NSData): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6868")
    open external override /*1*/ fun new(): platform.Foundation.NSNetService?
}

open expect class NSNotification : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1306")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1308")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1304")
    open external override /*1*/ fun init(): platform.Foundation.NSNotification?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1296")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSNotification?

    @kotlinx.cinterop.ObjCMethod(selector = "object", bridge = "objcKniBridge1300")
    open external fun `object`(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge1302")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>?

    final val `object`: kotlin.Any?

    final val userInfo: kotlin.collections.Map<kotlin.Any?, *>?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNotification>,
        platform.Foundation.NSNotificationMeta {
    }
}

open expect class NSNotificationCenter : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1332")
    open external override /*1*/ fun init(): platform.Foundation.NSNotificationCenter?

    @kotlinx.cinterop.ObjCMethod(selector = "postNotification:", bridge = "objcKniBridge1320")
    open external fun postNotification(/*0*/ notification: platform.Foundation.NSNotification)

    @kotlinx.cinterop.ObjCMethod(selector = "removeObserver:", bridge = "objcKniBridge1326")
    open external fun removeObserver(/*0*/ observer: kotlin.Any)

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNotificationCenter>,
        platform.Foundation.NSNotificationCenterMeta {
    }
}

open expect class NSNotificationCenterMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1316")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNotificationCenter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1314")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNotificationCenter?

    @kotlinx.cinterop.ObjCMethod(selector = "defaultCenter", bridge = "objcKniBridge1310")
    open external fun defaultCenter(): platform.Foundation.NSNotificationCenter

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1312")
    open external override /*1*/ fun new(): platform.Foundation.NSNotificationCenter?

    final val defaultCenter: platform.Foundation.NSNotificationCenter
}

open expect class NSNotificationMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1292")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNotification?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1290")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNotification?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1288")
    open external override /*1*/ fun new(): platform.Foundation.NSNotification?
}

open expect class NSNotificationQueue : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5232")
    open external override /*1*/ fun init(): platform.Foundation.NSNotificationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithNotificationCenter:", bridge = "objcKniBridge5224")
    open external fun initWithNotificationCenter(/*0*/ notificationCenter: platform.Foundation.NSNotificationCenter): platform.Foundation.NSNotificationQueue

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNotificationQueue>,
        platform.Foundation.NSNotificationQueueMeta {
    }
}

open expect class NSNotificationQueueMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5222")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNotificationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5220")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNotificationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "defaultQueue", bridge = "objcKniBridge5216")
    open external fun defaultQueue(): platform.Foundation.NSNotificationQueue

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5218")
    open external override /*1*/ fun new(): platform.Foundation.NSNotificationQueue?

    final val defaultQueue: platform.Foundation.NSNotificationQueue
}

open expect class NSNull : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5248")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5250")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5244")
    open external override /*1*/ fun init(): platform.Foundation.NSNull?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5246")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSNull?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNull>,
        platform.Foundation.NSNullMeta {
    }
}

open expect class NSNullMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5240")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNull?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5238")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNull?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5236")
    open external override /*1*/ fun new(): platform.Foundation.NSNull?

    @kotlinx.cinterop.ObjCMethod(selector = "null", bridge = "objcKniBridge5234")
    open external fun `null`(): platform.Foundation.NSNull

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5242")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSNumber : platform.Foundation.NSValue {
    @kotlinx.cinterop.ObjCMethod(selector = "boolValue", bridge = "objcKniBridge628")
    open external fun boolValue(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "charValue", bridge = "objcKniBridge604")
    open external fun charValue(): kotlin.Byte

    @kotlinx.cinterop.ObjCMethod(selector = "descriptionWithLocale:", bridge = "objcKniBridge602")
    open external fun descriptionWithLocale(/*0*/ locale: kotlin.Any?): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "doubleValue", bridge = "objcKniBridge626")
    open external fun doubleValue(): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "floatValue", bridge = "objcKniBridge624")
    open external fun floatValue(): kotlin.Float

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge640")
    open external override /*1*/ fun init(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithBool:", bridge = "objcKniBridge592")
    open external fun initWithBool(/*0*/ value: kotlin.Boolean): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithChar:", bridge = "objcKniBridge568")
    open external fun initWithChar(/*0*/ value: kotlin.Byte): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge638")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDouble:", bridge = "objcKniBridge590")
    open external fun initWithDouble(/*0*/ value: kotlin.Double): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithFloat:", bridge = "objcKniBridge588")
    open external fun initWithFloat(/*0*/ value: kotlin.Float): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithInt:", bridge = "objcKniBridge576")
    open external fun initWithInt(/*0*/ value: kotlin.Int): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithLong:", bridge = "objcKniBridge580")
    open external fun initWithLong(/*0*/ value: kotlin.Long): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithLongLong:", bridge = "objcKniBridge584")
    open external fun initWithLongLong(/*0*/ value: kotlin.Long): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithShort:", bridge = "objcKniBridge572")
    open external fun initWithShort(/*0*/ value: kotlin.Short): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedChar:", bridge = "objcKniBridge570")
    open external fun initWithUnsignedChar(/*0*/ value: kotlin.UByte): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedInt:", bridge = "objcKniBridge578")
    open external fun initWithUnsignedInt(/*0*/ value: kotlin.UInt): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedLong:", bridge = "objcKniBridge582")
    open external fun initWithUnsignedLong(/*0*/ value: kotlin.ULong): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedLongLong:", bridge = "objcKniBridge586")
    open external fun initWithUnsignedLongLong(/*0*/ value: kotlin.ULong): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUnsignedShort:", bridge = "objcKniBridge574")
    open external fun initWithUnsignedShort(/*0*/ value: kotlin.UShort): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "intValue", bridge = "objcKniBridge612")
    open external fun intValue(): kotlin.Int

    @kotlinx.cinterop.ObjCMethod(selector = "isEqualToNumber:", bridge = "objcKniBridge600")
    open external fun isEqualToNumber(/*0*/ number: platform.Foundation.NSNumber): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "longLongValue", bridge = "objcKniBridge620")
    open external fun longLongValue(): kotlin.Long

    @kotlinx.cinterop.ObjCMethod(selector = "longValue", bridge = "objcKniBridge616")
    open external fun longValue(): kotlin.Long

    @kotlinx.cinterop.ObjCMethod(selector = "shortValue", bridge = "objcKniBridge608")
    open external fun shortValue(): kotlin.Short

    @kotlinx.cinterop.ObjCMethod(selector = "stringValue", bridge = "objcKniBridge634")
    open external fun stringValue(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "unsignedCharValue", bridge = "objcKniBridge606")
    open external fun unsignedCharValue(): kotlin.UByte

    @kotlinx.cinterop.ObjCMethod(selector = "unsignedIntValue", bridge = "objcKniBridge614")
    open external fun unsignedIntValue(): kotlin.UInt

    @kotlinx.cinterop.ObjCMethod(selector = "unsignedLongLongValue", bridge = "objcKniBridge622")
    open external fun unsignedLongLongValue(): kotlin.ULong

    @kotlinx.cinterop.ObjCMethod(selector = "unsignedLongValue", bridge = "objcKniBridge618")
    open external fun unsignedLongValue(): kotlin.ULong

    @kotlinx.cinterop.ObjCMethod(selector = "unsignedShortValue", bridge = "objcKniBridge610")
    open external fun unsignedShortValue(): kotlin.UShort

    final val boolValue: kotlin.Boolean

    final val charValue: kotlin.Byte

    final val doubleValue: kotlin.Double

    final val floatValue: kotlin.Float

    final val intValue: kotlin.Int

    final val longLongValue: kotlin.Long

    final val longValue: kotlin.Long

    final val shortValue: kotlin.Short

    final val stringValue: kotlin.String

    final val unsignedCharValue: kotlin.UByte

    final val unsignedIntValue: kotlin.UInt

    final val unsignedLongLongValue: kotlin.ULong

    final val unsignedLongValue: kotlin.ULong

    final val unsignedShortValue: kotlin.UShort

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNumber>,
        platform.Foundation.NSNumberMeta {
    }
}

open expect class NSNumberFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "allowsFloats", bridge = "objcKniBridge2426")
    open external fun allowsFloats(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "alwaysShowsDecimalSeparator", bridge = "objcKniBridge2434")
    open external fun alwaysShowsDecimalSeparator(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "currencyCode", bridge = "objcKniBridge2506")
    open external fun currencyCode(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "currencyDecimalSeparator", bridge = "objcKniBridge2438")
    open external fun currencyDecimalSeparator(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "currencyGroupingSeparator", bridge = "objcKniBridge2594")
    open external fun currencyGroupingSeparator(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "currencySymbol", bridge = "objcKniBridge2510")
    open external fun currencySymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "decimalSeparator", bridge = "objcKniBridge2430")
    open external fun decimalSeparator(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "exponentSymbol", bridge = "objcKniBridge2534")
    open external fun exponentSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "generatesDecimalNumbers", bridge = "objcKniBridge2402")
    open external fun generatesDecimalNumbers(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "getObjectValue:forString:range:error:", bridge = "objcKniBridge2384")
    open external fun getObjectValue(/*0*/ obj: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                           forString: kotlin.String, /*2*/
                                           range: kotlinx.cinterop.CPointer<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>?, /*3*/
                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "groupingSeparator", bridge = "objcKniBridge2446")
    open external fun groupingSeparator(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2618")
    open external override /*1*/ fun init(): platform.Foundation.NSNumberFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2620")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSNumberFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "internationalCurrencySymbol", bridge = "objcKniBridge2514")
    open external fun internationalCurrencySymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "isLenient", bridge = "objcKniBridge2598")
    open external fun isLenient(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isPartialStringValidationEnabled", bridge = "objcKniBridge2614")
    open external fun isPartialStringValidationEnabled(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "locale", bridge = "objcKniBridge2398")
    open external fun locale(): platform.Foundation.NSLocale

    @kotlinx.cinterop.ObjCMethod(selector = "maximum", bridge = "objcKniBridge2590")
    open external fun maximum(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "minimum", bridge = "objcKniBridge2586")
    open external fun minimum(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "minusSign", bridge = "objcKniBridge2526")
    open external fun minusSign(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "multiplier", bridge = "objcKniBridge2546")
    open external fun multiplier(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "negativeFormat", bridge = "objcKniBridge2410")
    open external fun negativeFormat(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "negativeInfinitySymbol", bridge = "objcKniBridge2482")
    open external fun negativeInfinitySymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "negativePrefix", bridge = "objcKniBridge2498")
    open external fun negativePrefix(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "negativeSuffix", bridge = "objcKniBridge2502")
    open external fun negativeSuffix(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "nilSymbol", bridge = "objcKniBridge2458")
    open external fun nilSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "notANumberSymbol", bridge = "objcKniBridge2466")
    open external fun notANumberSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "numberFromString:", bridge = "objcKniBridge2388")
    open external fun numberFromString(/*0*/ string: kotlin.String): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "paddingCharacter", bridge = "objcKniBridge2554")
    open external fun paddingCharacter(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "perMillSymbol", bridge = "objcKniBridge2522")
    open external fun perMillSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "percentSymbol", bridge = "objcKniBridge2518")
    open external fun percentSymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "plusSign", bridge = "objcKniBridge2530")
    open external fun plusSign(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "positiveFormat", bridge = "objcKniBridge2418")
    open external fun positiveFormat(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "positiveInfinitySymbol", bridge = "objcKniBridge2474")
    open external fun positiveInfinitySymbol(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "positivePrefix", bridge = "objcKniBridge2490")
    open external fun positivePrefix(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "positiveSuffix", bridge = "objcKniBridge2494")
    open external fun positiveSuffix(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "roundingIncrement", bridge = "objcKniBridge2566")
    open external fun roundingIncrement(): platform.Foundation.NSNumber

    @kotlinx.cinterop.ObjCMethod(selector = "setAllowsFloats:", bridge = "objcKniBridge2428")
    open external fun setAllowsFloats(/*0*/ allowsFloats: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setAlwaysShowsDecimalSeparator:", bridge = "objcKniBridge2436")
    open external fun setAlwaysShowsDecimalSeparator(/*0*/ alwaysShowsDecimalSeparator: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setCurrencyCode:", bridge = "objcKniBridge2508")
    open external fun setCurrencyCode(/*0*/ currencyCode: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setCurrencyDecimalSeparator:", bridge = "objcKniBridge2440")
    open external fun setCurrencyDecimalSeparator(/*0*/ currencyDecimalSeparator: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setCurrencyGroupingSeparator:", bridge = "objcKniBridge2596")
    open external fun setCurrencyGroupingSeparator(/*0*/ currencyGroupingSeparator: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setCurrencySymbol:", bridge = "objcKniBridge2512")
    open external fun setCurrencySymbol(/*0*/ currencySymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDecimalSeparator:", bridge = "objcKniBridge2432")
    open external fun setDecimalSeparator(/*0*/ decimalSeparator: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setExponentSymbol:", bridge = "objcKniBridge2536")
    open external fun setExponentSymbol(/*0*/ exponentSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setGeneratesDecimalNumbers:", bridge = "objcKniBridge2404")
    open external fun setGeneratesDecimalNumbers(/*0*/ generatesDecimalNumbers: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setGroupingSeparator:", bridge = "objcKniBridge2448")
    open external fun setGroupingSeparator(/*0*/ groupingSeparator: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setInternationalCurrencySymbol:", bridge = "objcKniBridge2516")
    open external fun setInternationalCurrencySymbol(/*0*/ internationalCurrencySymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLenient:", bridge = "objcKniBridge2600")
    open external fun setLenient(/*0*/ lenient: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocale:", bridge = "objcKniBridge2400")
    open external fun setLocale(/*0*/ locale: platform.Foundation.NSLocale?)

    @kotlinx.cinterop.ObjCMethod(selector = "setMaximum:", bridge = "objcKniBridge2592")
    open external fun setMaximum(/*0*/ maximum: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setMinimum:", bridge = "objcKniBridge2588")
    open external fun setMinimum(/*0*/ minimum: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setMinusSign:", bridge = "objcKniBridge2528")
    open external fun setMinusSign(/*0*/ minusSign: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setMultiplier:", bridge = "objcKniBridge2548")
    open external fun setMultiplier(/*0*/ multiplier: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNegativeFormat:", bridge = "objcKniBridge2412")
    open external fun setNegativeFormat(/*0*/ negativeFormat: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNegativeInfinitySymbol:", bridge = "objcKniBridge2484")
    open external fun setNegativeInfinitySymbol(/*0*/ negativeInfinitySymbol: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setNegativePrefix:", bridge = "objcKniBridge2500")
    open external fun setNegativePrefix(/*0*/ negativePrefix: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNegativeSuffix:", bridge = "objcKniBridge2504")
    open external fun setNegativeSuffix(/*0*/ negativeSuffix: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNilSymbol:", bridge = "objcKniBridge2460")
    open external fun setNilSymbol(/*0*/ nilSymbol: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setNotANumberSymbol:", bridge = "objcKniBridge2468")
    open external fun setNotANumberSymbol(/*0*/ notANumberSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPaddingCharacter:", bridge = "objcKniBridge2556")
    open external fun setPaddingCharacter(/*0*/ paddingCharacter: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPartialStringValidationEnabled:", bridge = "objcKniBridge2616")
    open external fun setPartialStringValidationEnabled(/*0*/ partialStringValidationEnabled: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setPerMillSymbol:", bridge = "objcKniBridge2524")
    open external fun setPerMillSymbol(/*0*/ perMillSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentSymbol:", bridge = "objcKniBridge2520")
    open external fun setPercentSymbol(/*0*/ percentSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPlusSign:", bridge = "objcKniBridge2532")
    open external fun setPlusSign(/*0*/ plusSign: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPositiveFormat:", bridge = "objcKniBridge2420")
    open external fun setPositiveFormat(/*0*/ positiveFormat: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPositiveInfinitySymbol:", bridge = "objcKniBridge2476")
    open external fun setPositiveInfinitySymbol(/*0*/ positiveInfinitySymbol: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setPositivePrefix:", bridge = "objcKniBridge2492")
    open external fun setPositivePrefix(/*0*/ positivePrefix: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPositiveSuffix:", bridge = "objcKniBridge2496")
    open external fun setPositiveSuffix(/*0*/ positiveSuffix: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setRoundingIncrement:", bridge = "objcKniBridge2568")
    open external fun setRoundingIncrement(/*0*/ roundingIncrement: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForNegativeInfinity:", bridge = "objcKniBridge2488")
    open external fun setTextAttributesForNegativeInfinity(/*0*/ textAttributesForNegativeInfinity: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForNegativeValues:", bridge = "objcKniBridge2416")
    open external fun setTextAttributesForNegativeValues(/*0*/ textAttributesForNegativeValues: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForNil:", bridge = "objcKniBridge2464")
    open external fun setTextAttributesForNil(/*0*/ textAttributesForNil: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForNotANumber:", bridge = "objcKniBridge2472")
    open external fun setTextAttributesForNotANumber(/*0*/ textAttributesForNotANumber: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForPositiveInfinity:", bridge = "objcKniBridge2480")
    open external fun setTextAttributesForPositiveInfinity(/*0*/ textAttributesForPositiveInfinity: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForPositiveValues:", bridge = "objcKniBridge2424")
    open external fun setTextAttributesForPositiveValues(/*0*/ textAttributesForPositiveValues: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setTextAttributesForZero:", bridge = "objcKniBridge2456")
    open external fun setTextAttributesForZero(/*0*/ textAttributesForZero: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setUsesGroupingSeparator:", bridge = "objcKniBridge2444")
    open external fun setUsesGroupingSeparator(/*0*/ usesGroupingSeparator: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setUsesSignificantDigits:", bridge = "objcKniBridge2604")
    open external fun setUsesSignificantDigits(/*0*/ usesSignificantDigits: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setZeroSymbol:", bridge = "objcKniBridge2452")
    open external fun setZeroSymbol(/*0*/ zeroSymbol: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromNumber:", bridge = "objcKniBridge2386")
    open external fun stringFromNumber(/*0*/ number: platform.Foundation.NSNumber): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForNegativeInfinity", bridge = "objcKniBridge2486")
    open external fun textAttributesForNegativeInfinity(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForNegativeValues", bridge = "objcKniBridge2414")
    open external fun textAttributesForNegativeValues(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForNil", bridge = "objcKniBridge2462")
    open external fun textAttributesForNil(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForNotANumber", bridge = "objcKniBridge2470")
    open external fun textAttributesForNotANumber(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForPositiveInfinity", bridge = "objcKniBridge2478")
    open external fun textAttributesForPositiveInfinity(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForPositiveValues", bridge = "objcKniBridge2422")
    open external fun textAttributesForPositiveValues(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "textAttributesForZero", bridge = "objcKniBridge2454")
    open external fun textAttributesForZero(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "usesGroupingSeparator", bridge = "objcKniBridge2442")
    open external fun usesGroupingSeparator(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "usesSignificantDigits", bridge = "objcKniBridge2602")
    open external fun usesSignificantDigits(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "zeroSymbol", bridge = "objcKniBridge2450")
    open external fun zeroSymbol(): kotlin.String?

    final var allowsFloats: kotlin.Boolean

    final var alwaysShowsDecimalSeparator: kotlin.Boolean

    final var currencyCode: kotlin.String

    final var currencyDecimalSeparator: kotlin.String

    final var currencyGroupingSeparator: kotlin.String

    final var currencySymbol: kotlin.String

    final var decimalSeparator: kotlin.String

    final var exponentSymbol: kotlin.String

    final var generatesDecimalNumbers: kotlin.Boolean

    final var groupingSeparator: kotlin.String

    final var internationalCurrencySymbol: kotlin.String

    final var lenient: kotlin.Boolean

    final var locale: platform.Foundation.NSLocale

    final var maximum: platform.Foundation.NSNumber?

    final var minimum: platform.Foundation.NSNumber?

    final var minusSign: kotlin.String

    final var multiplier: platform.Foundation.NSNumber?

    final var negativeFormat: kotlin.String

    final var negativeInfinitySymbol: kotlin.String

    final var negativePrefix: kotlin.String

    final var negativeSuffix: kotlin.String

    final var nilSymbol: kotlin.String

    final var notANumberSymbol: kotlin.String

    final var paddingCharacter: kotlin.String

    final var partialStringValidationEnabled: kotlin.Boolean

    final var perMillSymbol: kotlin.String

    final var percentSymbol: kotlin.String

    final var plusSign: kotlin.String

    final var positiveFormat: kotlin.String

    final var positiveInfinitySymbol: kotlin.String

    final var positivePrefix: kotlin.String

    final var positiveSuffix: kotlin.String

    final var roundingIncrement: platform.Foundation.NSNumber

    final var textAttributesForNegativeInfinity: kotlin.collections.Map<kotlin.Any?, *>?

    final var textAttributesForNegativeValues: kotlin.collections.Map<kotlin.Any?, *>?

    final var textAttributesForNil: kotlin.collections.Map<kotlin.Any?, *>?

    final var textAttributesForNotANumber: kotlin.collections.Map<kotlin.Any?, *>?

    final var textAttributesForPositiveInfinity: kotlin.collections.Map<kotlin.Any?, *>?

    final var textAttributesForPositiveValues: kotlin.collections.Map<kotlin.Any?, *>?

    final var textAttributesForZero: kotlin.collections.Map<kotlin.Any?, *>?

    final var usesGroupingSeparator: kotlin.Boolean

    final var usesSignificantDigits: kotlin.Boolean

    final var zeroSymbol: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSNumberFormatter>,
        platform.Foundation.NSNumberFormatterMeta {
    }
}

open expect class NSNumberFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2382")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNumberFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2380")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNumberFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2378")
    open external override /*1*/ fun new(): platform.Foundation.NSNumberFormatter?
}

open expect class NSNumberMeta : platform.Foundation.NSValueMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge566")
    open external override /*1*/ fun alloc(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge564")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge562")
    open external override /*1*/ fun new(): platform.Foundation.NSNumber?
}

final expect class NSOperatingSystemVersion : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSOperation : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "addDependency:", bridge = "objcKniBridge1392")
    open external fun addDependency(/*0*/ op: platform.Foundation.NSOperation)

    @kotlinx.cinterop.ObjCMethod(selector = "cancel", bridge = "objcKniBridge1390")
    open external fun cancel()

    @kotlinx.cinterop.ObjCMethod(selector = "completionBlock", bridge = "objcKniBridge1416")
    open external fun completionBlock(): (() -> kotlin.Unit)?

    @kotlinx.cinterop.ObjCMethod(selector = "dependencies", bridge = "objcKniBridge1410")
    open external fun dependencies(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1432")
    open external override /*1*/ fun init(): platform.Foundation.NSOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "isAsynchronous", bridge = "objcKniBridge1406")
    open external fun isAsynchronous(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isCancelled", bridge = "objcKniBridge1398")
    open external fun isCancelled(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isConcurrent", bridge = "objcKniBridge1404")
    open external fun isConcurrent(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isExecuting", bridge = "objcKniBridge1400")
    open external fun isExecuting(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isFinished", bridge = "objcKniBridge1402")
    open external fun isFinished(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isReady", bridge = "objcKniBridge1408")
    open external fun isReady(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "main", bridge = "objcKniBridge1388")
    open external fun main()

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge1428")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "removeDependency:", bridge = "objcKniBridge1394")
    open external fun removeDependency(/*0*/ op: platform.Foundation.NSOperation)

    @kotlinx.cinterop.ObjCMethod(selector = "setCompletionBlock:", bridge = "objcKniBridge1418")
    open external fun setCompletionBlock(/*0*/ completionBlock: (() -> kotlin.Unit)?)

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge1430")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setThreadPriority:", bridge = "objcKniBridge1422")
    open external fun setThreadPriority(/*0*/ threadPriority: kotlin.Double)

    @kotlinx.cinterop.ObjCMethod(selector = "start", bridge = "objcKniBridge1386")
    open external fun start()

    @kotlinx.cinterop.ObjCMethod(selector = "threadPriority", bridge = "objcKniBridge1420")
    open external fun threadPriority(): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "waitUntilFinished", bridge = "objcKniBridge1396")
    open external fun waitUntilFinished()

    final val asynchronous: kotlin.Boolean

    final val cancelled: kotlin.Boolean

    final var completionBlock: (() -> kotlin.Unit)?

    final val concurrent: kotlin.Boolean

    final val dependencies: kotlin.collections.List<*>

    final val executing: kotlin.Boolean

    final val finished: kotlin.Boolean

    final var name: kotlin.String?

    final val ready: kotlin.Boolean

    final var threadPriority: kotlin.Double

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSOperation>,
        platform.Foundation.NSOperationMeta {
    }
}

open expect class NSOperationMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1384")
    open external override /*1*/ fun alloc(): platform.Foundation.NSOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1382")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSOperation?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1380")
    open external override /*1*/ fun new(): platform.Foundation.NSOperation?
}

open expect class NSOperationQueue : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "addOperation:", bridge = "objcKniBridge1344")
    open external fun addOperation(/*0*/ op: platform.Foundation.NSOperation)

    @kotlinx.cinterop.ObjCMethod(selector = "addOperationWithBlock:", bridge = "objcKniBridge1348")
    open external fun addOperationWithBlock(/*0*/ block: () -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "addOperations:waitUntilFinished:", bridge = "objcKniBridge1346")
    open external fun addOperations(/*0*/ ops: kotlin.collections.List<*>, /*1*/ waitUntilFinished: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "cancelAllOperations", bridge = "objcKniBridge1350")
    open external fun cancelAllOperations()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1378")
    open external override /*1*/ fun init(): platform.Foundation.NSOperationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "isSuspended", bridge = "objcKniBridge1362")
    open external fun isSuspended(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge1366")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "operations", bridge = "objcKniBridge1354")
    open external fun operations(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge1368")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setSuspended:", bridge = "objcKniBridge1364")
    open external fun setSuspended(/*0*/ suspended: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setUnderlyingQueue:", bridge = "objcKniBridge1376")
    open external fun setUnderlyingQueue(/*0*/ underlyingQueue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */)

    @kotlinx.cinterop.ObjCMethod(selector = "underlyingQueue", bridge = "objcKniBridge1374")
    open external fun underlyingQueue(): platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */

    @kotlinx.cinterop.ObjCMethod(selector = "waitUntilAllOperationsAreFinished", bridge = "objcKniBridge1352")
    open external fun waitUntilAllOperationsAreFinished()

    final var name: kotlin.String?

    final val operations: kotlin.collections.List<*>

    final var suspended: kotlin.Boolean

    final var underlyingQueue: platform.darwin.dispatch_queue_t? /* = platform.darwin.NSObject? */

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSOperationQueue>,
        platform.Foundation.NSOperationQueueMeta {
    }
}

open expect class NSOperationQueueMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1342")
    open external override /*1*/ fun alloc(): platform.Foundation.NSOperationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1340")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSOperationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "currentQueue", bridge = "objcKniBridge1334")
    open external fun currentQueue(): platform.Foundation.NSOperationQueue?

    @kotlinx.cinterop.ObjCMethod(selector = "mainQueue", bridge = "objcKniBridge1336")
    open external fun mainQueue(): platform.Foundation.NSOperationQueue

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1338")
    open external override /*1*/ fun new(): platform.Foundation.NSOperationQueue?

    final val currentQueue: platform.Foundation.NSOperationQueue?

    final val mainQueue: platform.Foundation.NSOperationQueue
}

open expect class NSOrderedSet : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4896")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4900")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4888")
    open external override /*1*/ fun init(): platform.Foundation.NSOrderedSet

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4892")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSOrderedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge4898")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSOrderedSet>,
        platform.Foundation.NSOrderedSetMeta {
    }
}

open expect class NSOrderedSetMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSFastEnumerationProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4880")
    open external override /*1*/ fun alloc(): platform.Foundation.NSOrderedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4878")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSOrderedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4876")
    open external override /*1*/ fun new(): platform.Foundation.NSOrderedSet?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4882")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSOrthography : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5300")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "dominantScript", bridge = "objcKniBridge5294")
    open external fun dominantScript(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5302")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5298")
    open external override /*1*/ fun init(): platform.Foundation.NSOrthography?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5292")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSOrthography?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDominantScript:languageMap:", bridge = "objcKniBridge5290")
    open external fun initWithDominantScript(/*0*/ script: kotlin.String, /*1*/
                                                   languageMap: kotlin.collections.Map<kotlin.Any?, *>
    ): platform.Foundation.NSOrthography

    @kotlinx.cinterop.ObjCMethod(selector = "languageMap", bridge = "objcKniBridge5296")
    open external fun languageMap(): kotlin.collections.Map<kotlin.Any?, *>

    final val dominantScript: kotlin.String

    final val languageMap: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSOrthography>,
        platform.Foundation.NSOrthographyMeta {
    }
}

open expect class NSOrthographyMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5286")
    open external override /*1*/ fun alloc(): platform.Foundation.NSOrthography?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5284")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSOrthography?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5282")
    open external override /*1*/ fun new(): platform.Foundation.NSOrthography?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5288")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSOutputStream : platform.Foundation.NSStream {
    @kotlinx.cinterop.ObjCMethod(selector = "hasSpaceAvailable", bridge = "objcKniBridge4826")
    open external fun hasSpaceAvailable(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4828")
    open external override /*1*/ fun init(): platform.Foundation.NSOutputStream?

    @kotlinx.cinterop.ObjCMethod(selector = "initToMemory", bridge = "objcKniBridge4820")
    open external fun initToMemory(): platform.Foundation.NSOutputStream

    @kotlinx.cinterop.ObjCMethod(selector = "initWithURL:append:", bridge = "objcKniBridge4824")
    open external fun initWithURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                        append: kotlin.Boolean
    ): platform.Foundation.NSOutputStream?

    final val hasSpaceAvailable: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSOutputStream>,
        platform.Foundation.NSOutputStreamMeta {
    }
}

open expect class NSOutputStreamMeta : platform.Foundation.NSStreamMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4816")
    open external override /*1*/ fun alloc(): platform.Foundation.NSOutputStream?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4814")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSOutputStream?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4812")
    open external override /*1*/ fun new(): platform.Foundation.NSOutputStream?
}

open expect class NSPersonNameComponents : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge3610")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3612")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "familyName", bridge = "objcKniBridge3590")
    open external fun familyName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "givenName", bridge = "objcKniBridge3582")
    open external fun givenName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3606")
    open external override /*1*/ fun init(): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3608")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "middleName", bridge = "objcKniBridge3586")
    open external fun middleName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "namePrefix", bridge = "objcKniBridge3578")
    open external fun namePrefix(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "nameSuffix", bridge = "objcKniBridge3594")
    open external fun nameSuffix(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "nickname", bridge = "objcKniBridge3598")
    open external fun nickname(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "phoneticRepresentation", bridge = "objcKniBridge3602")
    open external fun phoneticRepresentation(): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "setFamilyName:", bridge = "objcKniBridge3592")
    open external fun setFamilyName(/*0*/ familyName: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setGivenName:", bridge = "objcKniBridge3584")
    open external fun setGivenName(/*0*/ givenName: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setMiddleName:", bridge = "objcKniBridge3588")
    open external fun setMiddleName(/*0*/ middleName: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNamePrefix:", bridge = "objcKniBridge3580")
    open external fun setNamePrefix(/*0*/ namePrefix: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNameSuffix:", bridge = "objcKniBridge3596")
    open external fun setNameSuffix(/*0*/ nameSuffix: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setNickname:", bridge = "objcKniBridge3600")
    open external fun setNickname(/*0*/ nickname: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPhoneticRepresentation:", bridge = "objcKniBridge3604")
    open external fun setPhoneticRepresentation(/*0*/ phoneticRepresentation: platform.Foundation.NSPersonNameComponents?)

    final var familyName: kotlin.String?

    final var givenName: kotlin.String?

    final var middleName: kotlin.String?

    final var namePrefix: kotlin.String?

    final var nameSuffix: kotlin.String?

    final var nickname: kotlin.String?

    final var phoneticRepresentation: platform.Foundation.NSPersonNameComponents?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPersonNameComponents>,
        platform.Foundation.NSPersonNameComponentsMeta {
    }
}

open expect class NSPersonNameComponentsFormatter : platform.Foundation.NSFormatter {
    @kotlinx.cinterop.ObjCMethod(selector = "annotatedStringFromPersonNameComponents:", bridge = "objcKniBridge3624")
    open external fun annotatedStringFromPersonNameComponents(/*0*/ components: platform.Foundation.NSPersonNameComponents): platform.Foundation.NSAttributedString

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3636")
    open external override /*1*/ fun init(): platform.Foundation.NSPersonNameComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3638")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSPersonNameComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "isPhonetic", bridge = "objcKniBridge3632")
    open external fun isPhonetic(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "personNameComponentsFromString:", bridge = "objcKniBridge3626")
    open external fun personNameComponentsFromString(/*0*/ string: kotlin.String): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "setPhonetic:", bridge = "objcKniBridge3634")
    open external fun setPhonetic(/*0*/ phonetic: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "stringFromPersonNameComponents:", bridge = "objcKniBridge3622")
    open external fun stringFromPersonNameComponents(/*0*/ components: platform.Foundation.NSPersonNameComponents): kotlin.String

    final var phonetic: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPersonNameComponentsFormatter>,
        platform.Foundation.NSPersonNameComponentsFormatterMeta {
    }
}

open expect class NSPersonNameComponentsFormatterMeta : platform.Foundation.NSFormatterMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3620")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPersonNameComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3618")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPersonNameComponentsFormatter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3616")
    open external override /*1*/ fun new(): platform.Foundation.NSPersonNameComponentsFormatter?
}

open expect class NSPersonNameComponentsMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3574")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3572")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3570")
    open external override /*1*/ fun new(): platform.Foundation.NSPersonNameComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3576")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSPipe : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "fileHandleForReading", bridge = "objcKniBridge3986")
    open external fun fileHandleForReading(): platform.Foundation.NSFileHandle

    @kotlinx.cinterop.ObjCMethod(selector = "fileHandleForWriting", bridge = "objcKniBridge3988")
    open external fun fileHandleForWriting(): platform.Foundation.NSFileHandle

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3990")
    open external override /*1*/ fun init(): platform.Foundation.NSPipe?

    final val fileHandleForReading: platform.Foundation.NSFileHandle

    final val fileHandleForWriting: platform.Foundation.NSFileHandle

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPipe>,
        platform.Foundation.NSPipeMeta {
    }
}

open expect class NSPipeMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3984")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPipe?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3982")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPipe?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3980")
    open external override /*1*/ fun new(): platform.Foundation.NSPipe?

    @kotlinx.cinterop.ObjCMethod(selector = "pipe", bridge = "objcKniBridge3978")
    open external fun pipe(): platform.Foundation.NSPipe
}

open expect class NSPointerArray : platform.darwin.NSObject, platform.Foundation.NSFastEnumerationProtocol,
    platform.Foundation.NSCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "compact", bridge = "objcKniBridge5330")
    open external fun compact()

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5344")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5346")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5338")
    open external override /*1*/ fun init(): platform.Foundation.NSPointerArray?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5340")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSPointerArray?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithPointerFunctions:", bridge = "objcKniBridge5318")
    open external fun initWithPointerFunctions(/*0*/ functions: platform.Foundation.NSPointerFunctions): platform.Foundation.NSPointerArray

    @kotlinx.cinterop.ObjCMethod(selector = "pointerFunctions", bridge = "objcKniBridge5332")
    open external fun pointerFunctions(): platform.Foundation.NSPointerFunctions

    final val pointerFunctions: platform.Foundation.NSPointerFunctions

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPointerArray>,
        platform.Foundation.NSPointerArrayMeta {
    }
}

open expect class NSPointerArrayMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSFastEnumerationProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5312")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPointerArray?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5310")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPointerArray?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5308")
    open external override /*1*/ fun new(): platform.Foundation.NSPointerArray?

    @kotlinx.cinterop.ObjCMethod(selector = "pointerArrayWithPointerFunctions:", bridge = "objcKniBridge5306")
    open external fun pointerArrayWithPointerFunctions(/*0*/ functions: platform.Foundation.NSPointerFunctions): platform.Foundation.NSPointerArray

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5314")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSPointerFunctions : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4434")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4432")
    open external override /*1*/ fun init(): platform.Foundation.NSPointerFunctions?

    @kotlinx.cinterop.ObjCMethod(selector = "setUsesStrongWriteBarrier:", bridge = "objcKniBridge4426")
    open external fun setUsesStrongWriteBarrier(/*0*/ usesStrongWriteBarrier: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setUsesWeakReadAndWriteBarriers:", bridge = "objcKniBridge4430")
    open external fun setUsesWeakReadAndWriteBarriers(/*0*/ usesWeakReadAndWriteBarriers: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "usesStrongWriteBarrier", bridge = "objcKniBridge4424")
    open external fun usesStrongWriteBarrier(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "usesWeakReadAndWriteBarriers", bridge = "objcKniBridge4428")
    open external fun usesWeakReadAndWriteBarriers(): kotlin.Boolean

    final var usesStrongWriteBarrier: kotlin.Boolean

    final var usesWeakReadAndWriteBarriers: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPointerFunctions>,
        platform.Foundation.NSPointerFunctionsMeta {
    }
}

open expect class NSPointerFunctionsMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4396")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPointerFunctions?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4394")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPointerFunctions?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4392")
    open external override /*1*/ fun new(): platform.Foundation.NSPointerFunctions?
}

open expect class NSPort : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge3938")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge3920")
    open external fun delegate(): platform.Foundation.NSPortDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3940")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3934")
    open external override /*1*/ fun init(): platform.Foundation.NSPort?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3936")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSPort?

    @kotlinx.cinterop.ObjCMethod(selector = "invalidate", bridge = "objcKniBridge3916")
    open external fun invalidate()

    @kotlinx.cinterop.ObjCMethod(selector = "isValid", bridge = "objcKniBridge3930")
    open external fun isValid(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge3918")
    open external fun setDelegate(/*0*/ anObject: platform.Foundation.NSPortDelegateProtocol?)

    final val valid: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPort>,
        platform.Foundation.NSPortMeta {
    }
}

expect interface NSPortDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSPortDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSPortMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3914")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPort?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3912")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPort?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3910")
    open external override /*1*/ fun new(): platform.Foundation.NSPort?

    @kotlinx.cinterop.ObjCMethod(selector = "port", bridge = "objcKniBridge3908")
    open external fun port(): platform.Foundation.NSPort
}

open expect class NSPredicate : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "allowEvaluation", bridge = "objcKniBridge6260")
    open external fun allowEvaluation()

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge6270")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge6268")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "evaluateWithObject:", bridge = "objcKniBridge6256")
    open external fun evaluateWithObject(/*0*/ `object`: kotlin.Any?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "evaluateWithObject:substitutionVariables:", bridge = "objcKniBridge6258")
    open external fun evaluateWithObject(/*0*/ `object`: kotlin.Any?, /*1*/
                                               substitutionVariables: kotlin.collections.Map<kotlin.Any?, *>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6264")
    open external override /*1*/ fun init(): platform.Foundation.NSPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge6266")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "predicateFormat", bridge = "objcKniBridge6262")
    open external fun predicateFormat(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithSubstitutionVariables:", bridge = "objcKniBridge6254")
    open external fun predicateWithSubstitutionVariables(/*0*/ variables: kotlin.collections.Map<kotlin.Any?, *>): platform.Foundation.NSPredicate

    final val predicateFormat: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPredicate>,
        platform.Foundation.NSPredicateMeta {
    }
}

open expect class NSPredicateMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6250")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6248")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6246")
    open external override /*1*/ fun new(): platform.Foundation.NSPredicate?

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithBlock:", bridge = "objcKniBridge6244")
    open external fun predicateWithBlock(/*0*/ block: (kotlin.Any?, kotlin.collections.Map<kotlin.Any?, *>?) -> kotlin.Boolean): platform.Foundation.NSPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithFormat:", bridge = "objcKniBridge6238")
    open external fun predicateWithFormat(/*0*/ predicateFormat: kotlin.String): platform.Foundation.NSPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithFormat:argumentArray:", bridge = "objcKniBridge6236")
    open external fun predicateWithFormat(/*0*/ predicateFormat: kotlin.String, /*1*/
                                                argumentArray: kotlin.collections.List<*>?
    ): platform.Foundation.NSPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "predicateWithValue:", bridge = "objcKniBridge6242")
    open external fun predicateWithValue(/*0*/ value: kotlin.Boolean): platform.Foundation.NSPredicate

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge6252")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSProcessInfo : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "arguments", bridge = "objcKniBridge5428")
    open external fun arguments(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "environment", bridge = "objcKniBridge5426")
    open external fun environment(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "globallyUniqueString", bridge = "objcKniBridge5438")
    open external fun globallyUniqueString(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "hostName", bridge = "objcKniBridge5430")
    open external fun hostName(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5452")
    open external override /*1*/ fun init(): platform.Foundation.NSProcessInfo?

    @kotlinx.cinterop.ObjCMethod(selector = "isOperatingSystemAtLeastVersion:", bridge = "objcKniBridge5424")
    open external fun isOperatingSystemAtLeastVersion(/*0*/ version: kotlinx.cinterop.CValue<platform.Foundation.NSOperatingSystemVersion>): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "operatingSystemName", bridge = "objcKniBridge5422")
    open external fun operatingSystemName(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "operatingSystemVersion", bridge = "objcKniBridge5442")
    open external fun operatingSystemVersion(): kotlinx.cinterop.CValue<platform.Foundation.NSOperatingSystemVersion>

    @kotlinx.cinterop.ObjCMethod(selector = "operatingSystemVersionString", bridge = "objcKniBridge5440")
    open external fun operatingSystemVersionString(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "physicalMemory", bridge = "objcKniBridge5448")
    open external fun physicalMemory(): kotlin.ULong

    @kotlinx.cinterop.ObjCMethod(selector = "processIdentifier", bridge = "objcKniBridge5436")
    open external fun processIdentifier(): kotlin.Int

    @kotlinx.cinterop.ObjCMethod(selector = "processName", bridge = "objcKniBridge5432")
    open external fun processName(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "setProcessName:", bridge = "objcKniBridge5434")
    open external fun setProcessName(/*0*/ processName: kotlin.String)

    final val arguments: kotlin.collections.List<*>

    final val environment: kotlin.collections.Map<kotlin.Any?, *>

    final val globallyUniqueString: kotlin.String

    final val hostName: kotlin.String

    final val operatingSystemVersion: kotlinx.cinterop.CValue<platform.Foundation.NSOperatingSystemVersion>

    final val operatingSystemVersionString: kotlin.String

    final val physicalMemory: kotlin.ULong

    final val processIdentifier: kotlin.Int

    final var processName: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSProcessInfo>,
        platform.Foundation.NSProcessInfoMeta {
    }
}

open expect class NSProcessInfoMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5418")
    open external override /*1*/ fun alloc(): platform.Foundation.NSProcessInfo?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5416")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSProcessInfo?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5414")
    open external override /*1*/ fun new(): platform.Foundation.NSProcessInfo?

    @kotlinx.cinterop.ObjCMethod(selector = "processInfo", bridge = "objcKniBridge5412")
    open external fun processInfo(): platform.Foundation.NSProcessInfo

    final val processInfo: platform.Foundation.NSProcessInfo
}

final expect enum class NSProcessInfoThermalState : kotlinx.cinterop.CEnum {
    NSProcessInfoThermalStateNominal,

    NSProcessInfoThermalStateFair,

    NSProcessInfoThermalStateSerious,

    NSProcessInfoThermalStateCritical;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSProcessInfoThermalState

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSProgress : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cancel", bridge = "objcKniBridge980")
    open external fun cancel()

    @kotlinx.cinterop.ObjCMethod(selector = "cancellationHandler", bridge = "objcKniBridge1014")
    open external fun cancellationHandler(): (() -> kotlin.Unit)?

    @kotlinx.cinterop.ObjCMethod(selector = "estimatedTimeRemaining", bridge = "objcKniBridge1038")
    open external fun estimatedTimeRemaining(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "fileCompletedCount", bridge = "objcKniBridge1058")
    open external fun fileCompletedCount(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "fileTotalCount", bridge = "objcKniBridge1054")
    open external fun fileTotalCount(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "fileURL", bridge = "objcKniBridge1050")
    open external fun fileURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "fractionCompleted", bridge = "objcKniBridge1028")
    open external fun fractionCompleted(): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1062")
    open external override /*1*/ fun init(): platform.Foundation.NSProgress?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithParent:userInfo:", bridge = "objcKniBridge968")
    open external fun initWithParent(/*0*/ parentProgressOrNil: platform.Foundation.NSProgress?, /*1*/
                                           userInfo: kotlin.collections.Map<kotlin.Any?, *>?
    ): platform.Foundation.NSProgress

    @kotlinx.cinterop.ObjCMethod(selector = "isCancellable", bridge = "objcKniBridge1002")
    open external fun isCancellable(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isCancelled", bridge = "objcKniBridge1010")
    open external fun isCancelled(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isFinished", bridge = "objcKniBridge1030")
    open external fun isFinished(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isIndeterminate", bridge = "objcKniBridge1026")
    open external fun isIndeterminate(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isPausable", bridge = "objcKniBridge1006")
    open external fun isPausable(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isPaused", bridge = "objcKniBridge1012")
    open external fun isPaused(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "localizedAdditionalDescription", bridge = "objcKniBridge998")
    open external fun localizedAdditionalDescription(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "localizedDescription", bridge = "objcKniBridge994")
    open external fun localizedDescription(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "pause", bridge = "objcKniBridge982")
    open external fun pause()

    @kotlinx.cinterop.ObjCMethod(selector = "pausingHandler", bridge = "objcKniBridge1018")
    open external fun pausingHandler(): (() -> kotlin.Unit)?

    @kotlinx.cinterop.ObjCMethod(selector = "resignCurrent", bridge = "objcKniBridge974")
    open external fun resignCurrent()

    @kotlinx.cinterop.ObjCMethod(selector = "resume", bridge = "objcKniBridge984")
    open external fun resume()

    @kotlinx.cinterop.ObjCMethod(selector = "resumingHandler", bridge = "objcKniBridge1022")
    open external fun resumingHandler(): (() -> kotlin.Unit)?

    @kotlinx.cinterop.ObjCMethod(selector = "setCancellable:", bridge = "objcKniBridge1004")
    open external fun setCancellable(/*0*/ cancellable: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setCancellationHandler:", bridge = "objcKniBridge1016")
    open external fun setCancellationHandler(/*0*/ cancellationHandler: (() -> kotlin.Unit)?)

    @kotlinx.cinterop.ObjCMethod(selector = "setEstimatedTimeRemaining:", bridge = "objcKniBridge1040")
    open external fun setEstimatedTimeRemaining(/*0*/ estimatedTimeRemaining: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setFileCompletedCount:", bridge = "objcKniBridge1060")
    open external fun setFileCompletedCount(/*0*/ fileCompletedCount: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setFileTotalCount:", bridge = "objcKniBridge1056")
    open external fun setFileTotalCount(/*0*/ fileTotalCount: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setFileURL:", bridge = "objcKniBridge1052")
    open external fun setFileURL(/*0*/ fileURL: platform.Foundation.NSURL?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocalizedAdditionalDescription:", bridge = "objcKniBridge1000")
    open external fun setLocalizedAdditionalDescription(/*0*/ localizedAdditionalDescription: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocalizedDescription:", bridge = "objcKniBridge996")
    open external fun setLocalizedDescription(/*0*/ localizedDescription: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPausable:", bridge = "objcKniBridge1008")
    open external fun setPausable(/*0*/ pausable: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setPausingHandler:", bridge = "objcKniBridge1020")
    open external fun setPausingHandler(/*0*/ pausingHandler: (() -> kotlin.Unit)?)

    @kotlinx.cinterop.ObjCMethod(selector = "setResumingHandler:", bridge = "objcKniBridge1024")
    open external fun setResumingHandler(/*0*/ resumingHandler: (() -> kotlin.Unit)?)

    @kotlinx.cinterop.ObjCMethod(selector = "setThroughput:", bridge = "objcKniBridge1044")
    open external fun setThroughput(/*0*/ throughput: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "throughput", bridge = "objcKniBridge1042")
    open external fun throughput(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge1032")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>

    final var cancellable: kotlin.Boolean

    final var cancellationHandler: (() -> kotlin.Unit)?

    final val cancelled: kotlin.Boolean

    final var estimatedTimeRemaining: platform.Foundation.NSNumber?

    final var fileCompletedCount: platform.Foundation.NSNumber?

    final var fileTotalCount: platform.Foundation.NSNumber?

    final var fileURL: platform.Foundation.NSURL?

    final val finished: kotlin.Boolean

    final val fractionCompleted: kotlin.Double

    final val indeterminate: kotlin.Boolean

    final var localizedAdditionalDescription: kotlin.String

    final var localizedDescription: kotlin.String

    final var pausable: kotlin.Boolean

    final val paused: kotlin.Boolean

    final var pausingHandler: (() -> kotlin.Unit)?

    final var resumingHandler: (() -> kotlin.Unit)?

    final var throughput: platform.Foundation.NSNumber?

    final val userInfo: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSProgress>,
        platform.Foundation.NSProgressMeta {
    }
}

open expect class NSProgressMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge966")
    open external override /*1*/ fun alloc(): platform.Foundation.NSProgress?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge964")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSProgress?

    @kotlinx.cinterop.ObjCMethod(selector = "currentProgress", bridge = "objcKniBridge954")
    open external fun currentProgress(): platform.Foundation.NSProgress?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge962")
    open external override /*1*/ fun new(): platform.Foundation.NSProgress?
}

expect interface NSProgressReportingProtocol : platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "progress", bridge = "objcKniBridge46")
    fun progress(): platform.Foundation.NSProgress
}

expect interface NSProgressReportingProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSPropertyListSerialization : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4944")
    open external override /*1*/ fun init(): platform.Foundation.NSPropertyListSerialization?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPropertyListSerialization>,
        platform.Foundation.NSPropertyListSerializationMeta {
    }
}

open expect class NSPropertyListSerializationMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4942")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPropertyListSerialization?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4940")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPropertyListSerialization?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4938")
    open external override /*1*/ fun new(): platform.Foundation.NSPropertyListSerialization?
}

open expect class NSProxy : kotlinx.cinterop.ObjCObjectBase, platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "class", bridge = "objcKniBridge5472")
    open external override /*1*/ fun `class`(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "conformsToProtocol:", bridge = "objcKniBridge5486")
    open external override /*1*/ fun conformsToProtocol(/*0*/ aProtocol: objcnames.classes.Protocol?): kotlin.Boolean

    @Suppress("NOTHING_TO_OVERRIDE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "debugDescription", bridge = "objcKniBridge5468")
    open external override /*1*/ fun debugDescription(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge5466")
    open external override /*1*/ fun description(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "finalize", bridge = "objcKniBridge5464")
    open external fun finalize()

    @kotlinx.cinterop.ObjCMethod(selector = "forwardInvocation:", bridge = "objcKniBridge5460")
    open external fun forwardInvocation(/*0*/ invocation: platform.Foundation.NSInvocation)

    @kotlinx.cinterop.ObjCMethod(selector = "isEqual:", bridge = "objcKniBridge5470")
    open external override /*1*/ fun isEqual(/*0*/ `object`: kotlin.Any?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isKindOfClass:", bridge = "objcKniBridge5482")
    open external override /*1*/ fun isKindOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isMemberOfClass:", bridge = "objcKniBridge5484")
    open external override /*1*/ fun isMemberOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isProxy", bridge = "objcKniBridge5480")
    open external override /*1*/ fun isProxy(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "superclass", bridge = "objcKniBridge5492")
    open external override /*1*/ fun superclass(): kotlinx.cinterop.ObjCClass?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSProxy>,
        platform.Foundation.NSProxyMeta {
    }
}

open expect class NSProxyMeta : kotlinx.cinterop.ObjCObjectBaseMeta, platform.darwin.NSObjectProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5454")
    open external fun alloc(): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "class", bridge = "objcKniBridge5456")
    open external fun `class`(): kotlinx.cinterop.ObjCClass
}

open expect class NSPurgeableData : platform.Foundation.NSMutableData,
    platform.Foundation.NSDiscardableContentProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "beginContentAccess", bridge = "objcKniBridge2008")
    open external override /*1*/ fun beginContentAccess(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "discardContentIfPossible", bridge = "objcKniBridge2012")
    open external override /*1*/ fun discardContentIfPossible()

    @kotlinx.cinterop.ObjCMethod(selector = "endContentAccess", bridge = "objcKniBridge2010")
    open external override /*1*/ fun endContentAccess()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2004")
    open external override /*1*/ fun init(): platform.Foundation.NSPurgeableData?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2006")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSPurgeableData?

    @kotlinx.cinterop.ObjCMethod(selector = "isContentDiscarded", bridge = "objcKniBridge2014")
    open external override /*1*/ fun isContentDiscarded(): kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSPurgeableData>,
        platform.Foundation.NSPurgeableDataMeta {
    }
}

open expect class NSPurgeableDataMeta : platform.Foundation.NSMutableDataMeta,
    platform.Foundation.NSDiscardableContentProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2002")
    open external override /*1*/ fun alloc(): platform.Foundation.NSPurgeableData?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2000")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSPurgeableData?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1998")
    open external override /*1*/ fun new(): platform.Foundation.NSPurgeableData?
}

open expect class NSRecursiveLock : platform.darwin.NSObject, platform.Foundation.NSLockingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5134")
    open external override /*1*/ fun init(): platform.Foundation.NSRecursiveLock?

    @kotlinx.cinterop.ObjCMethod(selector = "lock", bridge = "objcKniBridge5136")
    open external override /*1*/ fun lock()

    @kotlinx.cinterop.ObjCMethod(selector = "lockBeforeDate:", bridge = "objcKniBridge5128")
    open external fun lockBeforeDate(/*0*/ limit: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge5130")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge5132")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "tryLock", bridge = "objcKniBridge5126")
    open external fun tryLock(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "unlock", bridge = "objcKniBridge5138")
    open external override /*1*/ fun unlock()

    final var name: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSRecursiveLock>,
        platform.Foundation.NSRecursiveLockMeta {
    }
}

open expect class NSRecursiveLockMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSLockingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5124")
    open external override /*1*/ fun alloc(): platform.Foundation.NSRecursiveLock?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5122")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSRecursiveLock?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5120")
    open external override /*1*/ fun new(): platform.Foundation.NSRecursiveLock?
}

open expect class NSRegularExpression : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5538")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5540")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5534")
    open external override /*1*/ fun init(): platform.Foundation.NSRegularExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5536")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSRegularExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "pattern", bridge = "objcKniBridge5528")
    open external fun pattern(): kotlin.String

    final val pattern: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSRegularExpression>,
        platform.Foundation.NSRegularExpressionMeta {
    }
}

open expect class NSRegularExpressionMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5522")
    open external override /*1*/ fun alloc(): platform.Foundation.NSRegularExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5520")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSRegularExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "escapedPatternForString:", bridge = "objcKniBridge5516")
    open external fun escapedPatternForString(/*0*/ string: kotlin.String): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5518")
    open external override /*1*/ fun new(): platform.Foundation.NSRegularExpression?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5524")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

final expect enum class NSRoundingMode : kotlinx.cinterop.CEnum {
    NSRoundPlain,

    NSRoundDown,

    NSRoundUp,

    NSRoundBankers;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSRoundingMode

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSRunLoop : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3864")
    open external override /*1*/ fun init(): platform.Foundation.NSRunLoop?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSRunLoop>,
        platform.Foundation.NSRunLoopMeta {
    }
}

open expect class NSRunLoopMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3848")
    open external override /*1*/ fun alloc(): platform.Foundation.NSRunLoop?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3846")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSRunLoop?

    @kotlinx.cinterop.ObjCMethod(selector = "currentRunLoop", bridge = "objcKniBridge3840")
    open external fun currentRunLoop(): platform.Foundation.NSRunLoop

    @kotlinx.cinterop.ObjCMethod(selector = "mainRunLoop", bridge = "objcKniBridge3842")
    open external fun mainRunLoop(): platform.Foundation.NSRunLoop

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3844")
    open external override /*1*/ fun new(): platform.Foundation.NSRunLoop?

    final val currentRunLoop: platform.Foundation.NSRunLoop

    final val mainRunLoop: platform.Foundation.NSRunLoop
}

open expect class NSScanner : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "caseSensitive", bridge = "objcKniBridge3658")
    open external fun caseSensitive(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "charactersToBeSkipped", bridge = "objcKniBridge3654")
    open external fun charactersToBeSkipped(): platform.Foundation.NSCharacterSet?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge3668")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3666")
    open external override /*1*/ fun init(): platform.Foundation.NSScanner?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithString:", bridge = "objcKniBridge3646")
    open external fun initWithString(/*0*/ string: kotlin.String): platform.Foundation.NSScanner

    @kotlinx.cinterop.ObjCMethod(selector = "locale", bridge = "objcKniBridge3662")
    open external fun locale(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "setCaseSensitive:", bridge = "objcKniBridge3660")
    open external fun setCaseSensitive(/*0*/ caseSensitive: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setCharactersToBeSkipped:", bridge = "objcKniBridge3656")
    open external fun setCharactersToBeSkipped(/*0*/ charactersToBeSkipped: platform.Foundation.NSCharacterSet?)

    @kotlinx.cinterop.ObjCMethod(selector = "setLocale:", bridge = "objcKniBridge3664")
    open external fun setLocale(/*0*/ locale: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "string", bridge = "objcKniBridge3648")
    open external fun string(): kotlin.String

    final var caseSensitive: kotlin.Boolean

    final var charactersToBeSkipped: platform.Foundation.NSCharacterSet?

    final var locale: kotlin.Any?

    final val string: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSScanner>,
        platform.Foundation.NSScannerMeta {
    }
}

open expect class NSScannerMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3644")
    open external override /*1*/ fun alloc(): platform.Foundation.NSScanner?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3642")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSScanner?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3640")
    open external override /*1*/ fun new(): platform.Foundation.NSScanner?
}

expect interface NSSecureCodingProtocol : platform.Foundation.NSCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge10")
    override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSSecureCodingProtocol?
}

expect interface NSSecureCodingProtocolMeta : platform.Foundation.NSCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge7")
    fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSSecureUnarchiveFromDataTransformer : platform.Foundation.NSValueTransformer {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6078")
    open external override /*1*/ fun init(): platform.Foundation.NSSecureUnarchiveFromDataTransformer?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSSecureUnarchiveFromDataTransformer>,
        platform.Foundation.NSSecureUnarchiveFromDataTransformerMeta {
    }
}

open expect class NSSecureUnarchiveFromDataTransformerMeta : platform.Foundation.NSValueTransformerMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6076")
    open external override /*1*/ fun alloc(): platform.Foundation.NSSecureUnarchiveFromDataTransformer?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6074")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSSecureUnarchiveFromDataTransformer?

    @kotlinx.cinterop.ObjCMethod(selector = "allowedTopLevelClasses", bridge = "objcKniBridge6070")
    open external fun allowedTopLevelClasses(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6072")
    open external override /*1*/ fun new(): platform.Foundation.NSSecureUnarchiveFromDataTransformer?

    final val allowedTopLevelClasses: kotlin.collections.List<*>
}

open expect class NSSet : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSFastEnumerationProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1224")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1228")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1216")
    open external override /*1*/ fun init(): kotlin.collections.Set<*>

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1220")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): kotlin.collections.Set<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "member:", bridge = "objcKniBridge1212")
    open external fun member(/*0*/ `object`: kotlin.Any?): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge1226")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "objectEnumerator", bridge = "objcKniBridge1214")
    open external fun objectEnumerator(): platform.Foundation.NSEnumerator

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSSet>,
        platform.Foundation.NSSetMeta {
    }
}

open expect class NSSetMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSFastEnumerationProtocolMeta {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1208")
    open external override /*1*/ fun alloc(): kotlin.collections.Set<*>?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1206")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): kotlin.collections.Set<*>?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1204")
    open external override /*1*/ fun new(): kotlin.collections.Set<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1210")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSSocketPort : platform.Foundation.NSPort {
    @kotlinx.cinterop.ObjCMethod(selector = "address", bridge = "objcKniBridge5406")
    open external fun address(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5388")
    open external override /*1*/ fun init(): platform.Foundation.NSSocketPort

    @kotlinx.cinterop.ObjCMethod(
        selector = "initRemoteWithProtocolFamily:socketType:protocol:address:",
        bridge = "objcKniBridge5398"
    )
    open external fun initRemoteWithProtocolFamily(/*0*/ family: kotlin.Int, /*1*/
                                                         socketType: kotlin.Int, /*2*/
                                                         protocol: kotlin.Int, /*3*/
                                                         address: platform.Foundation.NSData
    ): platform.Foundation.NSSocketPort

    @kotlinx.cinterop.ObjCMethod(selector = "initRemoteWithTCPPort:host:", bridge = "objcKniBridge5396")
    open external fun initRemoteWithTCPPort(/*0*/ port: kotlin.UShort, /*1*/
                                                  host: kotlin.String?
    ): platform.Foundation.NSSocketPort?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5410")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSSocketPort?

    @kotlinx.cinterop.ObjCMethod(
        selector = "initWithProtocolFamily:socketType:protocol:address:",
        bridge = "objcKniBridge5392"
    )
    open external fun initWithProtocolFamily(/*0*/ family: kotlin.Int, /*1*/
                                                   socketType: kotlin.Int, /*2*/
                                                   protocol: kotlin.Int, /*3*/
                                                   address: platform.Foundation.NSData
    ): platform.Foundation.NSSocketPort?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithTCPPort:", bridge = "objcKniBridge5390")
    open external fun initWithTCPPort(/*0*/ port: kotlin.UShort): platform.Foundation.NSSocketPort?

    @kotlinx.cinterop.ObjCMethod(selector = "protocol", bridge = "objcKniBridge5404")
    open external fun protocol(): kotlin.Int

    @kotlinx.cinterop.ObjCMethod(selector = "protocolFamily", bridge = "objcKniBridge5400")
    open external fun protocolFamily(): kotlin.Int

    @kotlinx.cinterop.ObjCMethod(selector = "socketType", bridge = "objcKniBridge5402")
    open external fun socketType(): kotlin.Int

    final val address: platform.Foundation.NSData

    final val protocol: kotlin.Int

    final val protocolFamily: kotlin.Int

    final val socketType: kotlin.Int

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSSocketPort>,
        platform.Foundation.NSSocketPortMeta {
    }
}

open expect class NSSocketPortMeta : platform.Foundation.NSPortMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5386")
    open external override /*1*/ fun alloc(): platform.Foundation.NSSocketPort?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5384")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSSocketPort?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5382")
    open external override /*1*/ fun new(): platform.Foundation.NSSocketPort?
}

open expect class NSSortDescriptor : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "allowEvaluation", bridge = "objcKniBridge5580")
    open external fun allowEvaluation()

    @kotlinx.cinterop.ObjCMethod(selector = "ascending", bridge = "objcKniBridge5588")
    open external fun ascending(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5600")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5598")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5596")
    open external override /*1*/ fun init(): platform.Foundation.NSSortDescriptor?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5578")
    open external override /*1*/ fun initWithCoder(/*0*/ coder: platform.Foundation.NSCoder): platform.Foundation.NSSortDescriptor?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithKey:ascending:", bridge = "objcKniBridge5574")
    open external fun initWithKey(/*0*/ key: kotlin.String?, /*1*/
                                        ascending: kotlin.Boolean
    ): platform.Foundation.NSSortDescriptor

    @kotlinx.cinterop.ObjCMethod(selector = "key", bridge = "objcKniBridge5586")
    open external fun key(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "reversedSortDescriptor", bridge = "objcKniBridge5594")
    open external fun reversedSortDescriptor(): kotlin.Any

    final val ascending: kotlin.Boolean

    final val key: kotlin.String?

    final val reversedSortDescriptor: kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSSortDescriptor>,
        platform.Foundation.NSSortDescriptorMeta {
    }
}

open expect class NSSortDescriptorMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5570")
    open external override /*1*/ fun alloc(): platform.Foundation.NSSortDescriptor?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5568")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSSortDescriptor?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5566")
    open external override /*1*/ fun new(): platform.Foundation.NSSortDescriptor?

    @kotlinx.cinterop.ObjCMethod(selector = "sortDescriptorWithKey:ascending:", bridge = "objcKniBridge5560")
    open external fun sortDescriptorWithKey(/*0*/ key: kotlin.String?, /*1*/
                                                  ascending: kotlin.Boolean
    ): platform.Foundation.NSSortDescriptor

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5572")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSStream : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "close", bridge = "objcKniBridge4838")
    open external fun close()

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge4848")
    open external fun delegate(): platform.Foundation.NSStreamDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4856")
    open external override /*1*/ fun init(): platform.Foundation.NSStream?

    @kotlinx.cinterop.ObjCMethod(selector = "open", bridge = "objcKniBridge4836")
    open external fun open()

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge4850")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSStreamDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "streamError", bridge = "objcKniBridge4854")
    open external fun streamError(): platform.Foundation.NSError?

    final var delegate: platform.Foundation.NSStreamDelegateProtocol?

    final val streamError: platform.Foundation.NSError?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSStream>,
        platform.Foundation.NSStreamMeta {
    }
}

expect interface NSStreamDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSStreamDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSStreamMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4834")
    open external override /*1*/ fun alloc(): platform.Foundation.NSStream?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4832")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSStream?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4830")
    open external override /*1*/ fun new(): platform.Foundation.NSStream?
}

open expect class NSString : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSMutableCopyingProtocol, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge398")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge402")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge392")
    open external override /*1*/ fun init(): kotlin.String

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge394")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge400")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSString>,
        platform.Foundation.NSStringMeta {
    }
}

open expect class NSStringMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSMutableCopyingProtocolMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge386")
    open external override /*1*/ fun alloc(): kotlin.String?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge384")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): kotlin.String?

    @Suppress("RETURN_TYPE_MISMATCH_ON_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge382")
    open external override /*1*/ fun new(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge388")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

final expect class NSSwappedDouble : kotlinx.cinterop.CStructVar {
    final var v: kotlin.ULong

    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class NSSwappedFloat : kotlinx.cinterop.CStructVar {
    final var v: kotlin.UInt

    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

open expect class NSTextCheckingResult : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5510")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5512")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5506")
    open external override /*1*/ fun init(): platform.Foundation.NSTextCheckingResult?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5508")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSTextCheckingResult?

    @kotlinx.cinterop.ObjCMethod(selector = "range", bridge = "objcKniBridge5504")
    open external fun range(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSTextCheckingResult>,
        platform.Foundation.NSTextCheckingResultMeta {
    }
}

open expect class NSTextCheckingResultMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5498")
    open external override /*1*/ fun alloc(): platform.Foundation.NSTextCheckingResult?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5496")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSTextCheckingResult?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5494")
    open external override /*1*/ fun new(): platform.Foundation.NSTextCheckingResult?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5500")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSThread : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cancel", bridge = "objcKniBridge5640")
    open external fun cancel()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5634")
    open external override /*1*/ fun init(): platform.Foundation.NSThread

    @kotlinx.cinterop.ObjCMethod(selector = "initWithBlock:", bridge = "objcKniBridge5638")
    open external fun initWithBlock(/*0*/ block: () -> kotlin.Unit): platform.Foundation.NSThread

    @kotlinx.cinterop.ObjCMethod(selector = "isCancelled", bridge = "objcKniBridge5670")
    open external fun isCancelled(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isExecuting", bridge = "objcKniBridge5666")
    open external fun isExecuting(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isFinished", bridge = "objcKniBridge5668")
    open external fun isFinished(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isMainThread", bridge = "objcKniBridge5664")
    open external fun isMainThread(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "main", bridge = "objcKniBridge5644")
    open external fun main()

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge5656")
    open external fun name(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setName:", bridge = "objcKniBridge5658")
    open external fun setName(/*0*/ name: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setThreadPriority:", bridge = "objcKniBridge5650")
    open external fun setThreadPriority(/*0*/ threadPriority: kotlin.Double)

    @kotlinx.cinterop.ObjCMethod(selector = "start", bridge = "objcKniBridge5642")
    open external fun start()

    @kotlinx.cinterop.ObjCMethod(selector = "threadDictionary", bridge = "objcKniBridge5646")
    open external fun threadDictionary(): platform.Foundation.NSMutableDictionary

    @kotlinx.cinterop.ObjCMethod(selector = "threadPriority", bridge = "objcKniBridge5648")
    open external fun threadPriority(): kotlin.Double

    final val cancelled: kotlin.Boolean

    final val executing: kotlin.Boolean

    final val finished: kotlin.Boolean

    final val isMainThread: kotlin.Boolean

    final var name: kotlin.String?

    final val threadDictionary: platform.Foundation.NSMutableDictionary

    final var threadPriority: kotlin.Double

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSThread>,
        platform.Foundation.NSThreadMeta {
    }
}

open expect class NSThreadMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5632")
    open external override /*1*/ fun alloc(): platform.Foundation.NSThread?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5630")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSThread?

    @kotlinx.cinterop.ObjCMethod(selector = "callStackReturnAddresses", bridge = "objcKniBridge5620")
    open external fun callStackReturnAddresses(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "callStackSymbols", bridge = "objcKniBridge5622")
    open external fun callStackSymbols(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "currentThread", bridge = "objcKniBridge5618")
    open external fun currentThread(): platform.Foundation.NSThread

    @kotlinx.cinterop.ObjCMethod(selector = "detachNewThreadWithBlock:", bridge = "objcKniBridge5602")
    open external fun detachNewThreadWithBlock(/*0*/ block: () -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "exit", bridge = "objcKniBridge5612")
    open external fun exit()

    @kotlinx.cinterop.ObjCMethod(selector = "isMainThread", bridge = "objcKniBridge5624")
    open external fun isMainThread(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isMultiThreaded", bridge = "objcKniBridge5606")
    open external fun isMultiThreaded(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "mainThread", bridge = "objcKniBridge5626")
    open external fun mainThread(): platform.Foundation.NSThread

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5628")
    open external override /*1*/ fun new(): platform.Foundation.NSThread?

    @kotlinx.cinterop.ObjCMethod(selector = "setThreadPriority:", bridge = "objcKniBridge5616")
    open external fun setThreadPriority(/*0*/ p: kotlin.Double): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "sleepUntilDate:", bridge = "objcKniBridge5608")
    open external fun sleepUntilDate(/*0*/ date: platform.Foundation.NSDate)

    @kotlinx.cinterop.ObjCMethod(selector = "threadPriority", bridge = "objcKniBridge5614")
    open external fun threadPriority(): kotlin.Double

    final val callStackReturnAddresses: kotlin.collections.List<*>

    final val callStackSymbols: kotlin.collections.List<*>

    final val currentThread: platform.Foundation.NSThread

    final val isMainThread: kotlin.Boolean

    final val mainThread: platform.Foundation.NSThread
}

open expect class NSTimeZone : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "abbreviationForDate:", bridge = "objcKniBridge1894")
    open external fun abbreviationForDate(/*0*/ aDate: platform.Foundation.NSDate): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge1910")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "data", bridge = "objcKniBridge1904")
    open external fun data(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge1912")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge1906")
    open external override /*1*/ fun init(): platform.Foundation.NSTimeZone?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge1908")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSTimeZone?

    @kotlinx.cinterop.ObjCMethod(selector = "isDaylightSavingTimeForDate:", bridge = "objcKniBridge1896")
    open external fun isDaylightSavingTimeForDate(/*0*/ aDate: platform.Foundation.NSDate): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge1902")
    open external fun name(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "nextDaylightSavingTimeTransitionAfterDate:", bridge = "objcKniBridge1900")
    open external fun nextDaylightSavingTimeTransitionAfterDate(/*0*/ aDate: platform.Foundation.NSDate): platform.Foundation.NSDate?

    final val data: platform.Foundation.NSData

    final val name: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSTimeZone>,
        platform.Foundation.NSTimeZoneMeta {
    }
}

open expect class NSTimeZoneMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge1888")
    open external override /*1*/ fun alloc(): platform.Foundation.NSTimeZone?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge1886")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSTimeZone?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge1884")
    open external override /*1*/ fun new(): platform.Foundation.NSTimeZone?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge1890")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

final expect enum class NSTimeZoneNameStyle : kotlinx.cinterop.CEnum {
    NSTimeZoneNameStyleStandard,

    NSTimeZoneNameStyleShortStandard,

    NSTimeZoneNameStyleDaylightSaving,

    NSTimeZoneNameStyleShortDaylightSaving,

    NSTimeZoneNameStyleGeneric,

    NSTimeZoneNameStyleShortGeneric;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSTimeZoneNameStyle

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSTimer : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "fire", bridge = "objcKniBridge3888")
    open external fun fire()

    @kotlinx.cinterop.ObjCMethod(selector = "fireDate", bridge = "objcKniBridge3892")
    open external fun fireDate(): platform.Foundation.NSDate

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3906")
    open external override /*1*/ fun init(): platform.Foundation.NSTimer?

    @kotlinx.cinterop.ObjCMethod(selector = "invalidate", bridge = "objcKniBridge3890")
    open external fun invalidate()

    @kotlinx.cinterop.ObjCMethod(selector = "isValid", bridge = "objcKniBridge3902")
    open external fun isValid(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setFireDate:", bridge = "objcKniBridge3894")
    open external fun setFireDate(/*0*/ fireDate: platform.Foundation.NSDate)

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge3904")
    open external fun userInfo(): kotlin.Any?

    final var fireDate: platform.Foundation.NSDate

    final val userInfo: kotlin.Any?

    final val valid: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSTimer>,
        platform.Foundation.NSTimerMeta {
    }
}

open expect class NSTimerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3882")
    open external override /*1*/ fun alloc(): platform.Foundation.NSTimer?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3880")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSTimer?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3878")
    open external override /*1*/ fun new(): platform.Foundation.NSTimer?
}

open expect class NSURL : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "absoluteString", bridge = "objcKniBridge730")
    open external fun absoluteString(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "absoluteURL", bridge = "objcKniBridge736")
    open external fun absoluteURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "baseURL", bridge = "objcKniBridge734")
    open external fun baseURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "checkResourceIsReachableAndReturnError:", bridge = "objcKniBridge700")
    open external fun checkResourceIsReachableAndReturnError(/*0*/ error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge776")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "dataRepresentation", bridge = "objcKniBridge728")
    open external fun dataRepresentation(): platform.Foundation.NSData

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge774")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "filePathURL", bridge = "objcKniBridge768")
    open external fun filePathURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "fileReferenceURL", bridge = "objcKniBridge704")
    open external fun fileReferenceURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "fragment", bridge = "objcKniBridge752")
    open external fun fragment(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "hasDirectoryPath", bridge = "objcKniBridge760")
    open external fun hasDirectoryPath(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "host", bridge = "objcKniBridge742")
    open external fun host(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge770")
    open external override /*1*/ fun init(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(
        selector = "initAbsoluteURLWithDataRepresentation:relativeToURL:",
        bridge = "objcKniBridge696"
    )
    open external fun initAbsoluteURLWithDataRepresentation(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                                  relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "initFileURLWithPath:", bridge = "objcKniBridge686")
    open external fun initFileURLWithPath(/*0*/ path: kotlin.String): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "initFileURLWithPath:isDirectory:", bridge = "objcKniBridge684")
    open external fun initFileURLWithPath(/*0*/ path: kotlin.String, /*1*/
                                                isDirectory: kotlin.Boolean
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(
        selector = "initFileURLWithPath:isDirectory:relativeToURL:",
        bridge = "objcKniBridge680"
    )
    open external fun initFileURLWithPath(/*0*/ path: kotlin.String, /*1*/
                                                isDirectory: kotlin.Boolean, /*2*/
                                                relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "initFileURLWithPath:relativeToURL:", bridge = "objcKniBridge682")
    open external fun initFileURLWithPath(/*0*/ path: kotlin.String, /*1*/
                                                relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge772")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithDataRepresentation:relativeToURL:", bridge = "objcKniBridge694")
    open external fun initWithDataRepresentation(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                       relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "initWithScheme:host:path:", bridge = "objcKniBridge678")
    open external fun initWithScheme(/*0*/ scheme: kotlin.String, /*1*/
                                           host: kotlin.String?, /*2*/
                                           path: kotlin.String
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithString:", bridge = "objcKniBridge690")
    open external fun initWithString(/*0*/ URLString: kotlin.String): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithString:relativeToURL:", bridge = "objcKniBridge692")
    open external fun initWithString(/*0*/ URLString: kotlin.String, /*1*/
                                           relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "isFileReferenceURL", bridge = "objcKniBridge702")
    open external fun isFileReferenceURL(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isFileURL", bridge = "objcKniBridge764")
    open external fun isFileURL(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "parameterString", bridge = "objcKniBridge754")
    open external fun parameterString(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "password", bridge = "objcKniBridge748")
    open external fun password(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "path", bridge = "objcKniBridge750")
    open external fun path(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "port", bridge = "objcKniBridge744")
    open external fun port(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "query", bridge = "objcKniBridge756")
    open external fun query(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "relativePath", bridge = "objcKniBridge758")
    open external fun relativePath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "relativeString", bridge = "objcKniBridge732")
    open external fun relativeString(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllCachedResourceValues", bridge = "objcKniBridge716")
    open external fun removeAllCachedResourceValues()

    @kotlinx.cinterop.ObjCMethod(selector = "resourceSpecifier", bridge = "objcKniBridge740")
    open external fun resourceSpecifier(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "resourceValuesForKeys:error:", bridge = "objcKniBridge708")
    open external fun resourceValuesForKeys(/*0*/ keys: kotlin.collections.List<*>, /*1*/
                                                  error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "scheme", bridge = "objcKniBridge738")
    open external fun scheme(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setResourceValues:error:", bridge = "objcKniBridge712")
    open external fun setResourceValues(/*0*/ keyedValues: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                              error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "standardizedURL", bridge = "objcKniBridge766")
    open external fun standardizedURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "startAccessingSecurityScopedResource", bridge = "objcKniBridge724")
    open external fun startAccessingSecurityScopedResource(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "stopAccessingSecurityScopedResource", bridge = "objcKniBridge726")
    open external fun stopAccessingSecurityScopedResource()

    @kotlinx.cinterop.ObjCMethod(selector = "user", bridge = "objcKniBridge746")
    open external fun user(): kotlin.String?

    final val absoluteString: kotlin.String?

    final val absoluteURL: platform.Foundation.NSURL?

    final val baseURL: platform.Foundation.NSURL?

    final val dataRepresentation: platform.Foundation.NSData

    final val filePathURL: platform.Foundation.NSURL?

    final val fileURL: kotlin.Boolean

    final val fragment: kotlin.String?

    final val hasDirectoryPath: kotlin.Boolean

    final val host: kotlin.String?

    final val parameterString: kotlin.String?

    final val password: kotlin.String?

    final val path: kotlin.String?

    final val port: platform.Foundation.NSNumber?

    final val query: kotlin.String?

    final val relativePath: kotlin.String?

    final val relativeString: kotlin.String

    final val resourceSpecifier: kotlin.String?

    final val scheme: kotlin.String?

    final val standardizedURL: platform.Foundation.NSURL?

    final val user: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURL>,
        platform.Foundation.NSURLMeta {
    }
}

open expect class NSURLAuthenticationChallenge : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5718")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "error", bridge = "objcKniBridge5710")
    open external fun error(): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "failureResponse", bridge = "objcKniBridge5708")
    open external fun failureResponse(): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5714")
    open external override /*1*/ fun init(): platform.Foundation.NSURLAuthenticationChallenge?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithAuthenticationChallenge:sender:", bridge = "objcKniBridge5700")
    open external fun initWithAuthenticationChallenge(/*0*/ challenge: platform.Foundation.NSURLAuthenticationChallenge, /*1*/
                                                            sender: platform.Foundation.NSURLAuthenticationChallengeSenderProtocol
    ): platform.Foundation.NSURLAuthenticationChallenge

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5716")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURLAuthenticationChallenge?

    @kotlinx.cinterop.ObjCMethod(selector = "proposedCredential", bridge = "objcKniBridge5704")
    open external fun proposedCredential(): platform.Foundation.NSURLCredential?

    @kotlinx.cinterop.ObjCMethod(selector = "protectionSpace", bridge = "objcKniBridge5702")
    open external fun protectionSpace(): platform.Foundation.NSURLProtectionSpace

    @kotlinx.cinterop.ObjCMethod(selector = "sender", bridge = "objcKniBridge5712")
    open external fun sender(): platform.Foundation.NSURLAuthenticationChallengeSenderProtocol?

    final val error: platform.Foundation.NSError?

    final val failureResponse: platform.Foundation.NSURLResponse?

    final val proposedCredential: platform.Foundation.NSURLCredential?

    final val protectionSpace: platform.Foundation.NSURLProtectionSpace

    final val sender: platform.Foundation.NSURLAuthenticationChallengeSenderProtocol?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLAuthenticationChallenge>,
        platform.Foundation.NSURLAuthenticationChallengeMeta {
    }
}

open expect class NSURLAuthenticationChallengeMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5694")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLAuthenticationChallenge?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5692")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLAuthenticationChallenge?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5690")
    open external override /*1*/ fun new(): platform.Foundation.NSURLAuthenticationChallenge?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5696")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

expect interface NSURLAuthenticationChallengeSenderProtocol : platform.darwin.NSObjectProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "cancelAuthenticationChallenge:", bridge = "objcKniBridge136")
    fun cancelAuthenticationChallenge(/*0*/ challenge: platform.Foundation.NSURLAuthenticationChallenge)

    @kotlinx.cinterop.ObjCMethod(
        selector = "continueWithoutCredentialForAuthenticationChallenge:",
        bridge = "objcKniBridge134"
    )
    fun continueWithoutCredentialForAuthenticationChallenge(/*0*/ challenge: platform.Foundation.NSURLAuthenticationChallenge)

    @kotlinx.cinterop.ObjCMethod(selector = "useCredential:forAuthenticationChallenge:", bridge = "objcKniBridge132")
    fun useCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                            forAuthenticationChallenge: platform.Foundation.NSURLAuthenticationChallenge
    )
}

expect interface NSURLAuthenticationChallengeSenderProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSURLCache : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cachedResponseForRequest:", bridge = "objcKniBridge5794")
    open external fun cachedResponseForRequest(/*0*/ request: platform.Foundation.NSURLRequest): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5816")
    open external override /*1*/ fun init(): platform.Foundation.NSURLCache?

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllCachedResponses", bridge = "objcKniBridge5800")
    open external fun removeAllCachedResponses()

    @kotlinx.cinterop.ObjCMethod(selector = "removeCachedResponseForRequest:", bridge = "objcKniBridge5798")
    open external fun removeCachedResponseForRequest(/*0*/ request: platform.Foundation.NSURLRequest)

    @kotlinx.cinterop.ObjCMethod(selector = "removeCachedResponsesSinceDate:", bridge = "objcKniBridge5802")
    open external fun removeCachedResponsesSinceDate(/*0*/ date: platform.Foundation.NSDate)

    @kotlinx.cinterop.ObjCMethod(selector = "storeCachedResponse:forRequest:", bridge = "objcKniBridge5796")
    open external fun storeCachedResponse(/*0*/ cachedResponse: platform.Foundation.NSCachedURLResponse, /*1*/
                                                forRequest: platform.Foundation.NSURLRequest
    )

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLCache>,
        platform.Foundation.NSURLCacheMeta {
    }
}

open expect class NSURLCacheMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5790")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLCache?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5788")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLCache?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5786")
    open external override /*1*/ fun new(): platform.Foundation.NSURLCache?

    @kotlinx.cinterop.ObjCMethod(selector = "setSharedURLCache:", bridge = "objcKniBridge5784")
    open external fun setSharedURLCache(/*0*/ sharedURLCache: platform.Foundation.NSURLCache)

    @kotlinx.cinterop.ObjCMethod(selector = "sharedURLCache", bridge = "objcKniBridge5782")
    open external fun sharedURLCache(): platform.Foundation.NSURLCache

    final var sharedURLCache: platform.Foundation.NSURLCache
}

final expect enum class NSURLCacheStoragePolicy : kotlinx.cinterop.CEnum {
    NSURLCacheStorageAllowed,

    NSURLCacheStorageAllowedInMemoryOnly,

    NSURLCacheStorageNotAllowed;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSURLCacheStoragePolicy

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSURLComponents : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "URL", bridge = "objcKniBridge4034")
    open external fun URL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "URLRelativeToURL:", bridge = "objcKniBridge4032")
    open external fun URLRelativeToURL(/*0*/ baseURL: platform.Foundation.NSURL?): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4118")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "fragment", bridge = "objcKniBridge4066")
    open external fun fragment(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "host", bridge = "objcKniBridge4050")
    open external fun host(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4026")
    open external override /*1*/ fun init(): platform.Foundation.NSURLComponents

    @kotlinx.cinterop.ObjCMethod(selector = "initWithString:", bridge = "objcKniBridge4030")
    open external fun initWithString(/*0*/ URLString: kotlin.String): platform.Foundation.NSURLComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithURL:resolvingAgainstBaseURL:", bridge = "objcKniBridge4028")
    open external fun initWithURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                        resolvingAgainstBaseURL: kotlin.Boolean
    ): platform.Foundation.NSURLComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "password", bridge = "objcKniBridge4046")
    open external fun password(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "path", bridge = "objcKniBridge4058")
    open external fun path(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedFragment", bridge = "objcKniBridge4090")
    open external fun percentEncodedFragment(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedHost", bridge = "objcKniBridge4078")
    open external fun percentEncodedHost(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedPassword", bridge = "objcKniBridge4074")
    open external fun percentEncodedPassword(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedPath", bridge = "objcKniBridge4082")
    open external fun percentEncodedPath(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedQuery", bridge = "objcKniBridge4086")
    open external fun percentEncodedQuery(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedQueryItems", bridge = "objcKniBridge4114")
    open external fun percentEncodedQueryItems(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "percentEncodedUser", bridge = "objcKniBridge4070")
    open external fun percentEncodedUser(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "port", bridge = "objcKniBridge4054")
    open external fun port(): platform.Foundation.NSNumber?

    @kotlinx.cinterop.ObjCMethod(selector = "query", bridge = "objcKniBridge4062")
    open external fun query(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "queryItems", bridge = "objcKniBridge4110")
    open external fun queryItems(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfFragment", bridge = "objcKniBridge4108")
    open external fun rangeOfFragment(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfHost", bridge = "objcKniBridge4100")
    open external fun rangeOfHost(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfPassword", bridge = "objcKniBridge4098")
    open external fun rangeOfPassword(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfPath", bridge = "objcKniBridge4104")
    open external fun rangeOfPath(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfPort", bridge = "objcKniBridge4102")
    open external fun rangeOfPort(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfQuery", bridge = "objcKniBridge4106")
    open external fun rangeOfQuery(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfScheme", bridge = "objcKniBridge4094")
    open external fun rangeOfScheme(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "rangeOfUser", bridge = "objcKniBridge4096")
    open external fun rangeOfUser(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    @kotlinx.cinterop.ObjCMethod(selector = "scheme", bridge = "objcKniBridge4038")
    open external fun scheme(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setFragment:", bridge = "objcKniBridge4068")
    open external fun setFragment(/*0*/ fragment: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setHost:", bridge = "objcKniBridge4052")
    open external fun setHost(/*0*/ host: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPassword:", bridge = "objcKniBridge4048")
    open external fun setPassword(/*0*/ password: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPath:", bridge = "objcKniBridge4060")
    open external fun setPath(/*0*/ path: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedFragment:", bridge = "objcKniBridge4092")
    open external fun setPercentEncodedFragment(/*0*/ percentEncodedFragment: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedHost:", bridge = "objcKniBridge4080")
    open external fun setPercentEncodedHost(/*0*/ percentEncodedHost: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedPassword:", bridge = "objcKniBridge4076")
    open external fun setPercentEncodedPassword(/*0*/ percentEncodedPassword: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedPath:", bridge = "objcKniBridge4084")
    open external fun setPercentEncodedPath(/*0*/ percentEncodedPath: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedQuery:", bridge = "objcKniBridge4088")
    open external fun setPercentEncodedQuery(/*0*/ percentEncodedQuery: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedQueryItems:", bridge = "objcKniBridge4116")
    open external fun setPercentEncodedQueryItems(/*0*/ percentEncodedQueryItems: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPercentEncodedUser:", bridge = "objcKniBridge4072")
    open external fun setPercentEncodedUser(/*0*/ percentEncodedUser: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPort:", bridge = "objcKniBridge4056")
    open external fun setPort(/*0*/ port: platform.Foundation.NSNumber?)

    @kotlinx.cinterop.ObjCMethod(selector = "setQuery:", bridge = "objcKniBridge4064")
    open external fun setQuery(/*0*/ query: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setQueryItems:", bridge = "objcKniBridge4112")
    open external fun setQueryItems(/*0*/ queryItems: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setScheme:", bridge = "objcKniBridge4040")
    open external fun setScheme(/*0*/ scheme: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setUser:", bridge = "objcKniBridge4044")
    open external fun setUser(/*0*/ user: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "string", bridge = "objcKniBridge4036")
    open external fun string(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "user", bridge = "objcKniBridge4042")
    open external fun user(): kotlin.String?

    final val URL: platform.Foundation.NSURL?

    final var fragment: kotlin.String?

    final var host: kotlin.String?

    final var password: kotlin.String?

    final var path: kotlin.String?

    final var percentEncodedFragment: kotlin.String?

    final var percentEncodedHost: kotlin.String?

    final var percentEncodedPassword: kotlin.String?

    final var percentEncodedPath: kotlin.String?

    final var percentEncodedQuery: kotlin.String?

    final var percentEncodedQueryItems: kotlin.collections.List<*>?

    final var percentEncodedUser: kotlin.String?

    final var port: platform.Foundation.NSNumber?

    final var query: kotlin.String?

    final var queryItems: kotlin.collections.List<*>?

    final val rangeOfFragment: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfHost: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfPassword: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfPath: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfPort: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfQuery: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfScheme: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final val rangeOfUser: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

    final var scheme: kotlin.String?

    final val string: kotlin.String?

    final var user: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLComponents>,
        platform.Foundation.NSURLComponentsMeta {
    }
}

open expect class NSURLComponentsMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4024")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4022")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "componentsWithString:", bridge = "objcKniBridge4018")
    open external fun componentsWithString(/*0*/ URLString: kotlin.String): platform.Foundation.NSURLComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "componentsWithURL:resolvingAgainstBaseURL:", bridge = "objcKniBridge4016")
    open external fun componentsWithURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                              resolvingAgainstBaseURL: kotlin.Boolean
    ): platform.Foundation.NSURLComponents?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4020")
    open external override /*1*/ fun new(): platform.Foundation.NSURLComponents?
}

open expect class NSURLConnection : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cancel", bridge = "objcKniBridge5842")
    open external fun cancel()

    @kotlinx.cinterop.ObjCMethod(selector = "currentRequest", bridge = "objcKniBridge5852")
    open external fun currentRequest(): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5854")
    open external override /*1*/ fun init(): platform.Foundation.NSURLConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithRequest:delegate:", bridge = "objcKniBridge5838")
    open external fun initWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                            delegate: kotlin.Any?
    ): platform.Foundation.NSURLConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithRequest:delegate:startImmediately:", bridge = "objcKniBridge5836")
    open external fun initWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                            delegate: kotlin.Any?, /*2*/
                                            startImmediately: kotlin.Boolean
    ): platform.Foundation.NSURLConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "originalRequest", bridge = "objcKniBridge5850")
    open external fun originalRequest(): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegateQueue:", bridge = "objcKniBridge5848")
    open external fun setDelegateQueue(/*0*/ queue: platform.Foundation.NSOperationQueue?)

    @kotlinx.cinterop.ObjCMethod(selector = "start", bridge = "objcKniBridge5840")
    open external fun start()

    final val currentRequest: platform.Foundation.NSURLRequest

    final val originalRequest: platform.Foundation.NSURLRequest

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLConnection>,
        platform.Foundation.NSURLConnectionMeta {
    }
}

expect interface NSURLConnectionDataDelegateProtocol : platform.Foundation.NSURLConnectionDelegateProtocol {
}

expect interface NSURLConnectionDataDelegateProtocolMeta : platform.Foundation.NSURLConnectionDelegateProtocolMeta {
}

expect interface NSURLConnectionDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSURLConnectionDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

expect interface NSURLConnectionDownloadDelegateProtocol : platform.Foundation.NSURLConnectionDelegateProtocol {
    @kotlinx.cinterop.ObjCMethod(
        selector = "connectionDidFinishDownloading:destinationURL:",
        bridge = "objcKniBridge175"
    )
    fun connectionDidFinishDownloading(/*0*/ connection: platform.Foundation.NSURLConnection, /*1*/
                                             destinationURL: platform.Foundation.NSURL
    )
}

expect interface NSURLConnectionDownloadDelegateProtocolMeta : platform.Foundation.NSURLConnectionDelegateProtocolMeta {
}

open expect class NSURLConnectionMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5834")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5832")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "canHandleRequest:", bridge = "objcKniBridge5828")
    open external fun canHandleRequest(/*0*/ request: platform.Foundation.NSURLRequest): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "connectionWithRequest:delegate:", bridge = "objcKniBridge5826")
    open external fun connectionWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                  delegate: kotlin.Any?
    ): platform.Foundation.NSURLConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5830")
    open external override /*1*/ fun new(): platform.Foundation.NSURLConnection?
}

open expect class NSURLCredential : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5688")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5686")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5682")
    open external override /*1*/ fun init(): platform.Foundation.NSURLCredential?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5684")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURLCredential?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLCredential>,
        platform.Foundation.NSURLCredentialMeta {
    }
}

open expect class NSURLCredentialMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5676")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLCredential?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5674")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLCredential?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5672")
    open external override /*1*/ fun new(): platform.Foundation.NSURLCredential?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5678")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSURLCredentialStorage : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "allCredentials", bridge = "objcKniBridge5876")
    open external fun allCredentials(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "credentialsForProtectionSpace:", bridge = "objcKniBridge5864")
    open external fun credentialsForProtectionSpace(/*0*/ space: platform.Foundation.NSURLProtectionSpace): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "defaultCredentialForProtectionSpace:", bridge = "objcKniBridge5872")
    open external fun defaultCredentialForProtectionSpace(/*0*/ space: platform.Foundation.NSURLProtectionSpace): platform.Foundation.NSURLCredential?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5878")
    open external override /*1*/ fun init(): platform.Foundation.NSURLCredentialStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "removeCredential:forProtectionSpace:", bridge = "objcKniBridge5868")
    open external fun removeCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                             forProtectionSpace: platform.Foundation.NSURLProtectionSpace
    )

    @kotlinx.cinterop.ObjCMethod(
        selector = "removeCredential:forProtectionSpace:options:",
        bridge = "objcKniBridge5870"
    )
    open external fun removeCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                             forProtectionSpace: platform.Foundation.NSURLProtectionSpace, /*2*/
                                             options: kotlin.collections.Map<kotlin.Any?, *>?
    )

    @kotlinx.cinterop.ObjCMethod(selector = "setCredential:forProtectionSpace:", bridge = "objcKniBridge5866")
    open external fun setCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                          forProtectionSpace: platform.Foundation.NSURLProtectionSpace
    )

    @kotlinx.cinterop.ObjCMethod(selector = "setDefaultCredential:forProtectionSpace:", bridge = "objcKniBridge5874")
    open external fun setDefaultCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                                 forProtectionSpace: platform.Foundation.NSURLProtectionSpace
    )

    final val allCredentials: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLCredentialStorage>,
        platform.Foundation.NSURLCredentialStorageMeta {
    }
}

open expect class NSURLCredentialStorageMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5862")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLCredentialStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5860")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLCredentialStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5858")
    open external override /*1*/ fun new(): platform.Foundation.NSURLCredentialStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "sharedCredentialStorage", bridge = "objcKniBridge5856")
    open external fun sharedCredentialStorage(): platform.Foundation.NSURLCredentialStorage

    final val sharedCredentialStorage: platform.Foundation.NSURLCredentialStorage
}

open expect class NSURLMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "URLWithDataRepresentation:relativeToURL:", bridge = "objcKniBridge656")
    open external fun URLWithDataRepresentation(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                      relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "URLWithString:", bridge = "objcKniBridge652")
    open external fun URLWithString(/*0*/ URLString: kotlin.String): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "URLWithString:relativeToURL:", bridge = "objcKniBridge654")
    open external fun URLWithString(/*0*/ URLString: kotlin.String, /*1*/
                                          relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(
        selector = "absoluteURLWithDataRepresentation:relativeToURL:",
        bridge = "objcKniBridge658"
    )
    open external fun absoluteURLWithDataRepresentation(/*0*/ data: platform.Foundation.NSData, /*1*/
                                                              relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge674")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge672")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "bookmarkDataWithContentsOfURL:error:", bridge = "objcKniBridge666")
    open external fun bookmarkDataWithContentsOfURL(/*0*/ bookmarkFileURL: platform.Foundation.NSURL, /*1*/
                                                          error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
    ): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "fileURLWithPath:", bridge = "objcKniBridge648")
    open external fun fileURLWithPath(/*0*/ path: kotlin.String): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "fileURLWithPath:isDirectory:", bridge = "objcKniBridge646")
    open external fun fileURLWithPath(/*0*/ path: kotlin.String, /*1*/
                                            isDirectory: kotlin.Boolean
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "fileURLWithPath:isDirectory:relativeToURL:", bridge = "objcKniBridge642")
    open external fun fileURLWithPath(/*0*/ path: kotlin.String, /*1*/
                                            isDirectory: kotlin.Boolean, /*2*/
                                            relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "fileURLWithPath:relativeToURL:", bridge = "objcKniBridge644")
    open external fun fileURLWithPath(/*0*/ path: kotlin.String, /*1*/
                                            relativeToURL: platform.Foundation.NSURL?
    ): platform.Foundation.NSURL

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge670")
    open external override /*1*/ fun new(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "resourceValuesForKeys:fromBookmarkData:", bridge = "objcKniBridge662")
    open external fun resourceValuesForKeys(/*0*/ keys: kotlin.collections.List<*>, /*1*/
                                                  fromBookmarkData: platform.Foundation.NSData
    ): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge676")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSURLProtectionSpace : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "authenticationMethod", bridge = "objcKniBridge5744")
    open external fun authenticationMethod(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge5752")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge5750")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "host", bridge = "objcKniBridge5736")
    open external fun host(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5746")
    open external override /*1*/ fun init(): platform.Foundation.NSURLProtectionSpace?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge5748")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURLProtectionSpace?

    @kotlinx.cinterop.ObjCMethod(selector = "protocol", bridge = "objcKniBridge5742")
    open external fun protocol(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "proxyType", bridge = "objcKniBridge5740")
    open external fun proxyType(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "realm", bridge = "objcKniBridge5732")
    open external fun realm(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "receivesCredentialSecurely", bridge = "objcKniBridge5734")
    open external fun receivesCredentialSecurely(): kotlin.Boolean

    final val authenticationMethod: kotlin.String

    final val host: kotlin.String

    final val protocol: kotlin.String?

    final val proxyType: kotlin.String?

    final val realm: kotlin.String?

    final val receivesCredentialSecurely: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLProtectionSpace>,
        platform.Foundation.NSURLProtectionSpaceMeta {
    }
}

open expect class NSURLProtectionSpaceMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSSecureCodingProtocolMeta, platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5724")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLProtectionSpace?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5722")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLProtectionSpace?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5720")
    open external override /*1*/ fun new(): platform.Foundation.NSURLProtectionSpace?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge5726")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSURLProtocol : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "cachedResponse", bridge = "objcKniBridge5912")
    open external fun cachedResponse(): platform.Foundation.NSCachedURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "client", bridge = "objcKniBridge5908")
    open external fun client(): platform.Foundation.NSURLProtocolClientProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5914")
    open external override /*1*/ fun init(): platform.Foundation.NSURLProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithRequest:cachedResponse:client:", bridge = "objcKniBridge5902")
    open external fun initWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                            cachedResponse: platform.Foundation.NSCachedURLResponse?, /*2*/
                                            client: platform.Foundation.NSURLProtocolClientProtocol?
    ): platform.Foundation.NSURLProtocol

    @kotlinx.cinterop.ObjCMethod(selector = "request", bridge = "objcKniBridge5910")
    open external fun request(): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "startLoading", bridge = "objcKniBridge5904")
    open external fun startLoading()

    @kotlinx.cinterop.ObjCMethod(selector = "stopLoading", bridge = "objcKniBridge5906")
    open external fun stopLoading()

    final val cachedResponse: platform.Foundation.NSCachedURLResponse?

    final val client: platform.Foundation.NSURLProtocolClientProtocol?

    final val request: platform.Foundation.NSURLRequest

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLProtocol>,
        platform.Foundation.NSURLProtocolMeta {
    }
}

expect interface NSURLProtocolClientProtocol : platform.darwin.NSObjectProtocol {
    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(selector = "URLProtocol:cachedResponseIsValid:", bridge = "objcKniBridge180")
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/
                          cachedResponseIsValid: platform.Foundation.NSCachedURLResponse
    )

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(selector = "URLProtocol:didLoadData:", bridge = "objcKniBridge184")
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/ didLoadData: platform.Foundation.NSData)

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(selector = "URLProtocol:didFailWithError:", bridge = "objcKniBridge188")
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/
                          didFailWithError: platform.Foundation.NSError
    )

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLProtocol:didReceiveAuthenticationChallenge:",
        bridge = "objcKniBridge190"
    )
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/
                          didReceiveAuthenticationChallenge: platform.Foundation.NSURLAuthenticationChallenge
    )

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLProtocol:didCancelAuthenticationChallenge:",
        bridge = "objcKniBridge192"
    )
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/
                          didCancelAuthenticationChallenge: platform.Foundation.NSURLAuthenticationChallenge
    )

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLProtocol:wasRedirectedToRequest:redirectResponse:",
        bridge = "objcKniBridge178"
    )
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/
                          wasRedirectedToRequest: platform.Foundation.NSURLRequest, /*2*/
                          redirectResponse: platform.Foundation.NSURLResponse
    )

    @Suppress("CONFLICTING_OVERLOADS")
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLProtocol:didReceiveResponse:cacheStoragePolicy:",
        bridge = "objcKniBridge182"
    )
    fun URLProtocol(/*0*/ protocol: platform.Foundation.NSURLProtocol, /*1*/
                          didReceiveResponse: platform.Foundation.NSURLResponse, /*2*/
                          cacheStoragePolicy: platform.Foundation.NSURLCacheStoragePolicy
    )

    @kotlinx.cinterop.ObjCMethod(selector = "URLProtocolDidFinishLoading:", bridge = "objcKniBridge186")
    fun URLProtocolDidFinishLoading(/*0*/ protocol: platform.Foundation.NSURLProtocol)
}

expect interface NSURLProtocolClientProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSURLProtocolMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5900")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5898")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "canInitWithRequest:", bridge = "objcKniBridge5880")
    open external fun canInitWithRequest(/*0*/ request: platform.Foundation.NSURLRequest): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "canonicalRequestForRequest:", bridge = "objcKniBridge5882")
    open external fun canonicalRequestForRequest(/*0*/ request: platform.Foundation.NSURLRequest): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5896")
    open external override /*1*/ fun new(): platform.Foundation.NSURLProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "propertyForKey:inRequest:", bridge = "objcKniBridge5886")
    open external fun propertyForKey(/*0*/ key: kotlin.String, /*1*/
                                           inRequest: platform.Foundation.NSURLRequest
    ): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "registerClass:", bridge = "objcKniBridge5892")
    open external fun registerClass(/*0*/ protocolClass: kotlinx.cinterop.ObjCClass): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "removePropertyForKey:inRequest:", bridge = "objcKniBridge5890")
    open external fun removePropertyForKey(/*0*/ key: kotlin.String, /*1*/
                                                 inRequest: platform.Foundation.NSMutableURLRequest
    )

    @kotlinx.cinterop.ObjCMethod(selector = "requestIsCacheEquivalent:toRequest:", bridge = "objcKniBridge5884")
    open external fun requestIsCacheEquivalent(/*0*/ a: platform.Foundation.NSURLRequest, /*1*/
                                                     toRequest: platform.Foundation.NSURLRequest
    ): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "setProperty:forKey:inRequest:", bridge = "objcKniBridge5888")
    open external fun setProperty(/*0*/ value: kotlin.Any, /*1*/
                                        forKey: kotlin.String, /*2*/
                                        inRequest: platform.Foundation.NSMutableURLRequest
    )

    @kotlinx.cinterop.ObjCMethod(selector = "unregisterClass:", bridge = "objcKniBridge5894")
    open external fun unregisterClass(/*0*/ protocolClass: kotlinx.cinterop.ObjCClass)
}

open expect class NSURLQueryItem : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4014")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4012")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4008")
    open external override /*1*/ fun init(): platform.Foundation.NSURLQueryItem?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4010")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURLQueryItem?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithName:value:", bridge = "objcKniBridge4002")
    open external fun initWithName(/*0*/ name: kotlin.String, /*1*/
                                         value: kotlin.String?
    ): platform.Foundation.NSURLQueryItem

    @kotlinx.cinterop.ObjCMethod(selector = "name", bridge = "objcKniBridge4004")
    open external fun name(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "value", bridge = "objcKniBridge4006")
    open external fun value(): kotlin.String?

    final val name: kotlin.String

    final val value: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLQueryItem>,
        platform.Foundation.NSURLQueryItemMeta {
    }
}

open expect class NSURLQueryItemMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3998")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLQueryItem?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3996")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLQueryItem?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3994")
    open external override /*1*/ fun new(): platform.Foundation.NSURLQueryItem?

    @kotlinx.cinterop.ObjCMethod(selector = "queryItemWithName:value:", bridge = "objcKniBridge3992")
    open external fun queryItemWithName(/*0*/ name: kotlin.String, /*1*/
                                              value: kotlin.String?
    ): platform.Foundation.NSURLQueryItem

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4000")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

final expect enum class NSURLRelationship : kotlinx.cinterop.CEnum {
    NSURLRelationshipContains,

    NSURLRelationshipSame,

    NSURLRelationshipOther;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSURLRelationship

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSURLRequest : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol, platform.Foundation.NSMutableCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "URL", bridge = "objcKniBridge4670")
    open external fun URL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "allowsCellularAccess", bridge = "objcKniBridge4680")
    open external fun allowsCellularAccess(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4688")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4686")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4682")
    open external override /*1*/ fun init(): platform.Foundation.NSURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4684")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithURL:", bridge = "objcKniBridge4666")
    open external fun initWithURL(/*0*/ URL: platform.Foundation.NSURL): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "mainDocumentURL", bridge = "objcKniBridge4676")
    open external fun mainDocumentURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "mutableCopyWithZone:", bridge = "objcKniBridge4690")
    open external override /*1*/ fun mutableCopyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    final val URL: platform.Foundation.NSURL?

    final val allowsCellularAccess: kotlin.Boolean

    final val mainDocumentURL: platform.Foundation.NSURL?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLRequest>,
        platform.Foundation.NSURLRequestMeta {
    }
}

open expect class NSURLRequestMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta, platform.Foundation.NSMutableCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4662")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4660")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4658")
    open external override /*1*/ fun new(): platform.Foundation.NSURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "requestWithURL:", bridge = "objcKniBridge4654")
    open external fun requestWithURL(/*0*/ URL: platform.Foundation.NSURL): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4664")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSURLResponse : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol,
    platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "MIMEType", bridge = "objcKniBridge4704")
    open external fun MIMEType(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "URL", bridge = "objcKniBridge4702")
    open external fun URL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4718")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4716")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "expectedContentLength", bridge = "objcKniBridge4706")
    open external fun expectedContentLength(): kotlin.Long

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4712")
    open external override /*1*/ fun init(): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4714")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "suggestedFilename", bridge = "objcKniBridge4710")
    open external fun suggestedFilename(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "textEncodingName", bridge = "objcKniBridge4708")
    open external fun textEncodingName(): kotlin.String?

    final val MIMEType: kotlin.String?

    final val URL: platform.Foundation.NSURL?

    final val expectedContentLength: kotlin.Long

    final val suggestedFilename: kotlin.String?

    final val textEncodingName: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLResponse>,
        platform.Foundation.NSURLResponseMeta {
    }
}

open expect class NSURLResponseMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSSecureCodingProtocolMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4696")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4694")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4692")
    open external override /*1*/ fun new(): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4698")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSURLSession : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "configuration", bridge = "objcKniBridge7124")
    open external fun configuration(): platform.Foundation.NSURLSessionConfiguration

    @kotlinx.cinterop.ObjCMethod(selector = "dataTaskWithRequest:", bridge = "objcKniBridge7100")
    open external fun dataTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest): platform.Foundation.NSURLSessionDataTask

    @kotlinx.cinterop.ObjCMethod(selector = "dataTaskWithURL:", bridge = "objcKniBridge7102")
    open external fun dataTaskWithURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSURLSessionDataTask

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge7122")
    open external fun delegate(): platform.Foundation.NSURLSessionDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "delegateQueue", bridge = "objcKniBridge7120")
    open external fun delegateQueue(): platform.Foundation.NSOperationQueue

    @kotlinx.cinterop.ObjCMethod(selector = "downloadTaskWithRequest:", bridge = "objcKniBridge7110")
    open external fun downloadTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest): platform.Foundation.NSURLSessionDownloadTask

    @kotlinx.cinterop.ObjCMethod(selector = "downloadTaskWithResumeData:", bridge = "objcKniBridge7114")
    open external fun downloadTaskWithResumeData(/*0*/ resumeData: platform.Foundation.NSData): platform.Foundation.NSURLSessionDownloadTask

    @kotlinx.cinterop.ObjCMethod(selector = "downloadTaskWithURL:", bridge = "objcKniBridge7112")
    open external fun downloadTaskWithURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSURLSessionDownloadTask

    @kotlinx.cinterop.ObjCMethod(selector = "finishTasksAndInvalidate", bridge = "objcKniBridge7088")
    open external fun finishTasksAndInvalidate()

    @kotlinx.cinterop.ObjCMethod(selector = "flushWithCompletionHandler:", bridge = "objcKniBridge7094")
    open external fun flushWithCompletionHandler(/*0*/ completionHandler: () -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "getAllTasksWithCompletionHandler:", bridge = "objcKniBridge7098")
    open external fun getAllTasksWithCompletionHandler(/*0*/ completionHandler: (kotlin.collections.List<*>?) -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "getTasksWithCompletionHandler:", bridge = "objcKniBridge7096")
    open external fun getTasksWithCompletionHandler(/*0*/ completionHandler: (kotlin.collections.List<*>?, kotlin.collections.List<*>?, kotlin.collections.List<*>?) -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7130")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSession?

    @kotlinx.cinterop.ObjCMethod(selector = "invalidateAndCancel", bridge = "objcKniBridge7090")
    open external fun invalidateAndCancel()

    @kotlinx.cinterop.ObjCMethod(selector = "resetWithCompletionHandler:", bridge = "objcKniBridge7092")
    open external fun resetWithCompletionHandler(/*0*/ completionHandler: () -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "sessionDescription", bridge = "objcKniBridge7126")
    open external fun sessionDescription(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setSessionDescription:", bridge = "objcKniBridge7128")
    open external fun setSessionDescription(/*0*/ sessionDescription: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "streamTaskWithNetService:", bridge = "objcKniBridge7118")
    open external fun streamTaskWithNetService(/*0*/ service: platform.Foundation.NSNetService): platform.Foundation.NSURLSessionStreamTask

    @kotlinx.cinterop.ObjCMethod(selector = "uploadTaskWithRequest:fromData:", bridge = "objcKniBridge7106")
    open external fun uploadTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                  fromData: platform.Foundation.NSData
    ): platform.Foundation.NSURLSessionUploadTask

    @kotlinx.cinterop.ObjCMethod(selector = "uploadTaskWithRequest:fromFile:", bridge = "objcKniBridge7104")
    open external fun uploadTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                  fromFile: platform.Foundation.NSURL
    ): platform.Foundation.NSURLSessionUploadTask

    @kotlinx.cinterop.ObjCMethod(selector = "uploadTaskWithStreamedRequest:", bridge = "objcKniBridge7108")
    open external fun uploadTaskWithStreamedRequest(/*0*/ request: platform.Foundation.NSURLRequest): platform.Foundation.NSURLSessionUploadTask

    final val configuration: platform.Foundation.NSURLSessionConfiguration

    final val delegate: platform.Foundation.NSURLSessionDelegateProtocol?

    final val delegateQueue: platform.Foundation.NSOperationQueue

    final var sessionDescription: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSession>,
        platform.Foundation.NSURLSessionMeta {
    }
}

open expect class NSURLSessionConfiguration : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "HTTPAdditionalHeaders", bridge = "objcKniBridge7206")
    open external fun HTTPAdditionalHeaders(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "HTTPCookieAcceptPolicy", bridge = "objcKniBridge7202")
    open external fun HTTPCookieAcceptPolicy(): platform.Foundation.NSHTTPCookieAcceptPolicy

    @kotlinx.cinterop.ObjCMethod(selector = "HTTPCookieStorage", bridge = "objcKniBridge7214")
    open external fun HTTPCookieStorage(): platform.Foundation.NSHTTPCookieStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "HTTPShouldSetCookies", bridge = "objcKniBridge7198")
    open external fun HTTPShouldSetCookies(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "HTTPShouldUsePipelining", bridge = "objcKniBridge7194")
    open external fun HTTPShouldUsePipelining(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "URLCache", bridge = "objcKniBridge7222")
    open external fun URLCache(): platform.Foundation.NSURLCache?

    @kotlinx.cinterop.ObjCMethod(selector = "URLCredentialStorage", bridge = "objcKniBridge7218")
    open external fun URLCredentialStorage(): platform.Foundation.NSURLCredentialStorage?

    @kotlinx.cinterop.ObjCMethod(selector = "allowsCellularAccess", bridge = "objcKniBridge7162")
    open external fun allowsCellularAccess(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "connectionProxyDictionary", bridge = "objcKniBridge7182")
    open external fun connectionProxyDictionary(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge7240")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "identifier", bridge = "objcKniBridge7144")
    open external fun identifier(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7238")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionConfiguration?

    @kotlinx.cinterop.ObjCMethod(selector = "isDiscretionary", bridge = "objcKniBridge7170")
    open external fun isDiscretionary(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "protocolClasses", bridge = "objcKniBridge7230")
    open external fun protocolClasses(): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "setAllowsCellularAccess:", bridge = "objcKniBridge7164")
    open external fun setAllowsCellularAccess(/*0*/ allowsCellularAccess: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setConnectionProxyDictionary:", bridge = "objcKniBridge7184")
    open external fun setConnectionProxyDictionary(/*0*/ connectionProxyDictionary: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDiscretionary:", bridge = "objcKniBridge7172")
    open external fun setDiscretionary(/*0*/ discretionary: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setHTTPAdditionalHeaders:", bridge = "objcKniBridge7208")
    open external fun setHTTPAdditionalHeaders(/*0*/ HTTPAdditionalHeaders: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setHTTPCookieAcceptPolicy:", bridge = "objcKniBridge7204")
    open external fun setHTTPCookieAcceptPolicy(/*0*/ HTTPCookieAcceptPolicy: platform.Foundation.NSHTTPCookieAcceptPolicy)

    @kotlinx.cinterop.ObjCMethod(selector = "setHTTPCookieStorage:", bridge = "objcKniBridge7216")
    open external fun setHTTPCookieStorage(/*0*/ HTTPCookieStorage: platform.Foundation.NSHTTPCookieStorage?)

    @kotlinx.cinterop.ObjCMethod(selector = "setHTTPShouldSetCookies:", bridge = "objcKniBridge7200")
    open external fun setHTTPShouldSetCookies(/*0*/ HTTPShouldSetCookies: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setHTTPShouldUsePipelining:", bridge = "objcKniBridge7196")
    open external fun setHTTPShouldUsePipelining(/*0*/ HTTPShouldUsePipelining: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setProtocolClasses:", bridge = "objcKniBridge7232")
    open external fun setProtocolClasses(/*0*/ protocolClasses: kotlin.collections.List<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setSharedContainerIdentifier:", bridge = "objcKniBridge7176")
    open external fun setSharedContainerIdentifier(/*0*/ sharedContainerIdentifier: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShouldUseExtendedBackgroundIdleMode:", bridge = "objcKniBridge7228")
    open external fun setShouldUseExtendedBackgroundIdleMode(/*0*/ shouldUseExtendedBackgroundIdleMode: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setURLCache:", bridge = "objcKniBridge7224")
    open external fun setURLCache(/*0*/ URLCache: platform.Foundation.NSURLCache?)

    @kotlinx.cinterop.ObjCMethod(selector = "setURLCredentialStorage:", bridge = "objcKniBridge7220")
    open external fun setURLCredentialStorage(/*0*/ URLCredentialStorage: platform.Foundation.NSURLCredentialStorage?)

    @kotlinx.cinterop.ObjCMethod(selector = "setWaitsForConnectivity:", bridge = "objcKniBridge7168")
    open external fun setWaitsForConnectivity(/*0*/ waitsForConnectivity: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "sharedContainerIdentifier", bridge = "objcKniBridge7174")
    open external fun sharedContainerIdentifier(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "shouldUseExtendedBackgroundIdleMode", bridge = "objcKniBridge7226")
    open external fun shouldUseExtendedBackgroundIdleMode(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "waitsForConnectivity", bridge = "objcKniBridge7166")
    open external fun waitsForConnectivity(): kotlin.Boolean

    final var HTTPAdditionalHeaders: kotlin.collections.Map<kotlin.Any?, *>?

    final var HTTPCookieAcceptPolicy: platform.Foundation.NSHTTPCookieAcceptPolicy

    final var HTTPCookieStorage: platform.Foundation.NSHTTPCookieStorage?

    final var HTTPShouldSetCookies: kotlin.Boolean

    final var HTTPShouldUsePipelining: kotlin.Boolean

    final var URLCache: platform.Foundation.NSURLCache?

    final var URLCredentialStorage: platform.Foundation.NSURLCredentialStorage?

    final var allowsCellularAccess: kotlin.Boolean

    final var connectionProxyDictionary: kotlin.collections.Map<kotlin.Any?, *>?

    final var discretionary: kotlin.Boolean

    final val identifier: kotlin.String?

    final var protocolClasses: kotlin.collections.List<*>?

    final var sharedContainerIdentifier: kotlin.String?

    final var shouldUseExtendedBackgroundIdleMode: kotlin.Boolean

    final var waitsForConnectivity: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionConfiguration>,
        platform.Foundation.NSURLSessionConfigurationMeta {
    }
}

open expect class NSURLSessionConfigurationMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSCopyingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7142")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionConfiguration?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7140")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionConfiguration?

    @kotlinx.cinterop.ObjCMethod(
        selector = "backgroundSessionConfigurationWithIdentifier:",
        bridge = "objcKniBridge7132"
    )
    open external fun backgroundSessionConfigurationWithIdentifier(/*0*/ identifier: kotlin.String): platform.Foundation.NSURLSessionConfiguration

    @kotlinx.cinterop.ObjCMethod(selector = "defaultSessionConfiguration", bridge = "objcKniBridge7134")
    open external fun defaultSessionConfiguration(): platform.Foundation.NSURLSessionConfiguration

    @kotlinx.cinterop.ObjCMethod(selector = "ephemeralSessionConfiguration", bridge = "objcKniBridge7136")
    open external fun ephemeralSessionConfiguration(): platform.Foundation.NSURLSessionConfiguration

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7138")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionConfiguration?

    final val defaultSessionConfiguration: platform.Foundation.NSURLSessionConfiguration

    final val ephemeralSessionConfiguration: platform.Foundation.NSURLSessionConfiguration
}

expect interface NSURLSessionDataDelegateProtocol : platform.Foundation.NSURLSessionTaskDelegateProtocol {
}

expect interface NSURLSessionDataDelegateProtocolMeta : platform.Foundation.NSURLSessionTaskDelegateProtocolMeta {
}

open expect class NSURLSessionDataTask : platform.Foundation.NSURLSessionTask {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5824")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionDataTask?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionDataTask>,
        platform.Foundation.NSURLSessionDataTaskMeta {
    }
}

open expect class NSURLSessionDataTaskMeta : platform.Foundation.NSURLSessionTaskMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5822")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionDataTask?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5820")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionDataTask?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5818")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionDataTask?
}

expect interface NSURLSessionDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSURLSessionDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

expect interface NSURLSessionDownloadDelegateProtocol : platform.Foundation.NSURLSessionTaskDelegateProtocol {
    @kotlinx.cinterop.ObjCMethod(
        selector = "URLSession:downloadTask:didFinishDownloadingToURL:",
        bridge = "objcKniBridge360"
    )
    fun URLSession(/*0*/ session: platform.Foundation.NSURLSession, /*1*/
                         downloadTask: platform.Foundation.NSURLSessionDownloadTask, /*2*/
                         didFinishDownloadingToURL: platform.Foundation.NSURL
    )
}

expect interface NSURLSessionDownloadDelegateProtocolMeta : platform.Foundation.NSURLSessionTaskDelegateProtocolMeta {
}

open expect class NSURLSessionDownloadTask : platform.Foundation.NSURLSessionTask {
    @kotlinx.cinterop.ObjCMethod(selector = "cancelByProducingResumeData:", bridge = "objcKniBridge7256")
    open external fun cancelByProducingResumeData(/*0*/ completionHandler: (platform.Foundation.NSData?) -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7258")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionDownloadTask?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionDownloadTask>,
        platform.Foundation.NSURLSessionDownloadTaskMeta {
    }
}

open expect class NSURLSessionDownloadTaskMeta : platform.Foundation.NSURLSessionTaskMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7254")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionDownloadTask?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7252")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionDownloadTask?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7250")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionDownloadTask?
}

open expect class NSURLSessionMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7086")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSession?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7084")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSession?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7082")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSession?

    @kotlinx.cinterop.ObjCMethod(selector = "sessionWithConfiguration:", bridge = "objcKniBridge7076")
    open external fun sessionWithConfiguration(/*0*/ configuration: platform.Foundation.NSURLSessionConfiguration): platform.Foundation.NSURLSession

    @kotlinx.cinterop.ObjCMethod(
        selector = "sessionWithConfiguration:delegate:delegateQueue:",
        bridge = "objcKniBridge7078"
    )
    open external fun sessionWithConfiguration(/*0*/ configuration: platform.Foundation.NSURLSessionConfiguration, /*1*/
                                                     delegate: platform.Foundation.NSURLSessionDelegateProtocol?, /*2*/
                                                     delegateQueue: platform.Foundation.NSOperationQueue?
    ): platform.Foundation.NSURLSession

    @kotlinx.cinterop.ObjCMethod(selector = "sharedSession", bridge = "objcKniBridge7080")
    open external fun sharedSession(): platform.Foundation.NSURLSession

    final val sharedSession: platform.Foundation.NSURLSession
}

expect interface NSURLSessionStreamDelegateProtocol : platform.Foundation.NSURLSessionTaskDelegateProtocol {
}

expect interface NSURLSessionStreamDelegateProtocolMeta : platform.Foundation.NSURLSessionTaskDelegateProtocolMeta {
}

open expect class NSURLSessionStreamTask : platform.Foundation.NSURLSessionTask {
    @kotlinx.cinterop.ObjCMethod(selector = "captureStreams", bridge = "objcKniBridge7270")
    open external fun captureStreams()

    @kotlinx.cinterop.ObjCMethod(selector = "closeRead", bridge = "objcKniBridge7274")
    open external fun closeRead()

    @kotlinx.cinterop.ObjCMethod(selector = "closeWrite", bridge = "objcKniBridge7272")
    open external fun closeWrite()

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7280")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionStreamTask?

    @kotlinx.cinterop.ObjCMethod(selector = "startSecureConnection", bridge = "objcKniBridge7276")
    open external fun startSecureConnection()

    @kotlinx.cinterop.ObjCMethod(selector = "stopSecureConnection", bridge = "objcKniBridge7278")
    open external fun stopSecureConnection()

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionStreamTask>,
        platform.Foundation.NSURLSessionStreamTaskMeta {
    }
}

open expect class NSURLSessionStreamTaskMeta : platform.Foundation.NSURLSessionTaskMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7264")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionStreamTask?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7262")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionStreamTask?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7260")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionStreamTask?
}

open expect class NSURLSessionTask : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSProgressReportingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "cancel", bridge = "objcKniBridge4574")
    open external fun cancel()

    @kotlinx.cinterop.ObjCMethod(selector = "class", bridge = "objcKniBridge4628")
    open external override /*2*/ fun `class`(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "conformsToProtocol:", bridge = "objcKniBridge4642")
    open external override /*2*/ fun conformsToProtocol(/*0*/ aProtocol: objcnames.classes.Protocol?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge4622")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "currentRequest", bridge = "objcKniBridge4584")
    open external fun currentRequest(): platform.Foundation.NSURLRequest?

    @Suppress("NOTHING_TO_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(selector = "debugDescription", bridge = "objcKniBridge4652")
    open external override /*2*/ fun debugDescription(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge4650")
    open external override /*2*/ fun description(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "earliestBeginDate", bridge = "objcKniBridge4588")
    open external fun earliestBeginDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "error", bridge = "objcKniBridge4614")
    open external fun error(): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4620")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionTask?

    @kotlinx.cinterop.ObjCMethod(selector = "isEqual:", bridge = "objcKniBridge4626")
    open external override /*2*/ fun isEqual(/*0*/ `object`: kotlin.Any?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isKindOfClass:", bridge = "objcKniBridge4638")
    open external override /*2*/ fun isKindOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isMemberOfClass:", bridge = "objcKniBridge4640")
    open external override /*2*/ fun isMemberOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass?): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isProxy", bridge = "objcKniBridge4636")
    open external override /*2*/ fun isProxy(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "originalRequest", bridge = "objcKniBridge4582")
    open external fun originalRequest(): platform.Foundation.NSURLRequest?

    @kotlinx.cinterop.ObjCMethod(selector = "priority", bridge = "objcKniBridge4616")
    open external fun priority(): kotlin.Float

    @kotlinx.cinterop.ObjCMethod(selector = "progress", bridge = "objcKniBridge4624")
    open external override /*1*/ fun progress(): platform.Foundation.NSProgress

    @kotlinx.cinterop.ObjCMethod(selector = "response", bridge = "objcKniBridge4586")
    open external fun response(): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "resume", bridge = "objcKniBridge4578")
    open external fun resume()

    @kotlinx.cinterop.ObjCMethod(selector = "setEarliestBeginDate:", bridge = "objcKniBridge4590")
    open external fun setEarliestBeginDate(/*0*/ earliestBeginDate: platform.Foundation.NSDate?)

    @kotlinx.cinterop.ObjCMethod(selector = "setPriority:", bridge = "objcKniBridge4618")
    open external fun setPriority(/*0*/ priority: kotlin.Float)

    @kotlinx.cinterop.ObjCMethod(selector = "setTaskDescription:", bridge = "objcKniBridge4610")
    open external fun setTaskDescription(/*0*/ taskDescription: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "superclass", bridge = "objcKniBridge4648")
    open external override /*2*/ fun superclass(): kotlinx.cinterop.ObjCClass?

    @kotlinx.cinterop.ObjCMethod(selector = "suspend", bridge = "objcKniBridge4576")
    open external fun suspend()

    @kotlinx.cinterop.ObjCMethod(selector = "taskDescription", bridge = "objcKniBridge4608")
    open external fun taskDescription(): kotlin.String?

    final val currentRequest: platform.Foundation.NSURLRequest?

    final var earliestBeginDate: platform.Foundation.NSDate?

    final val error: platform.Foundation.NSError?

    final val originalRequest: platform.Foundation.NSURLRequest?

    final var priority: kotlin.Float

    final val response: platform.Foundation.NSURLResponse?

    final var taskDescription: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionTask>,
        platform.Foundation.NSURLSessionTaskMeta {
    }
}

expect interface NSURLSessionTaskDelegateProtocol : platform.Foundation.NSURLSessionDelegateProtocol {
}

expect interface NSURLSessionTaskDelegateProtocolMeta : platform.Foundation.NSURLSessionDelegateProtocolMeta {
}

open expect class NSURLSessionTaskMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSProgressReportingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4572")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionTask?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4570")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionTask?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4568")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionTask?
}

open expect class NSURLSessionTaskMetrics : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7288")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionTaskMetrics

    @kotlinx.cinterop.ObjCMethod(selector = "taskInterval", bridge = "objcKniBridge7292")
    open external fun taskInterval(): platform.Foundation.NSDateInterval

    @kotlinx.cinterop.ObjCMethod(selector = "transactionMetrics", bridge = "objcKniBridge7290")
    open external fun transactionMetrics(): kotlin.collections.List<*>

    final val taskInterval: platform.Foundation.NSDateInterval

    final val transactionMetrics: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionTaskMetrics>,
        platform.Foundation.NSURLSessionTaskMetricsMeta {
    }
}

open expect class NSURLSessionTaskMetricsMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7286")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionTaskMetrics?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7284")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionTaskMetrics?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7282")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionTaskMetrics?
}

final expect enum class NSURLSessionTaskMetricsResourceFetchType : kotlinx.cinterop.CEnum {
    NSURLSessionTaskMetricsResourceFetchTypeUnknown,

    NSURLSessionTaskMetricsResourceFetchTypeNetworkLoad,

    NSURLSessionTaskMetricsResourceFetchTypeServerPush,

    NSURLSessionTaskMetricsResourceFetchTypeLocalCache;

    companion object Companion {
    }

    final class Var : kotlinx.cinterop.CEnumVar {
        final var value: platform.Foundation.NSURLSessionTaskMetricsResourceFetchType

        companion object Companion : kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

open expect class NSURLSessionTaskTransactionMetrics : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "connectEndDate", bridge = "objcKniBridge7320")
    open external fun connectEndDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "connectStartDate", bridge = "objcKniBridge7314")
    open external fun connectStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "domainLookupEndDate", bridge = "objcKniBridge7312")
    open external fun domainLookupEndDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "domainLookupStartDate", bridge = "objcKniBridge7310")
    open external fun domainLookupStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "fetchStartDate", bridge = "objcKniBridge7308")
    open external fun fetchStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7302")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionTaskTransactionMetrics

    @kotlinx.cinterop.ObjCMethod(selector = "isProxyConnection", bridge = "objcKniBridge7332")
    open external fun isProxyConnection(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isReusedConnection", bridge = "objcKniBridge7334")
    open external fun isReusedConnection(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "networkProtocolName", bridge = "objcKniBridge7330")
    open external fun networkProtocolName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "request", bridge = "objcKniBridge7304")
    open external fun request(): platform.Foundation.NSURLRequest

    @kotlinx.cinterop.ObjCMethod(selector = "requestEndDate", bridge = "objcKniBridge7324")
    open external fun requestEndDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "requestStartDate", bridge = "objcKniBridge7322")
    open external fun requestStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "resourceFetchType", bridge = "objcKniBridge7336")
    open external fun resourceFetchType(): platform.Foundation.NSURLSessionTaskMetricsResourceFetchType

    @kotlinx.cinterop.ObjCMethod(selector = "response", bridge = "objcKniBridge7306")
    open external fun response(): platform.Foundation.NSURLResponse?

    @kotlinx.cinterop.ObjCMethod(selector = "responseEndDate", bridge = "objcKniBridge7328")
    open external fun responseEndDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "responseStartDate", bridge = "objcKniBridge7326")
    open external fun responseStartDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "secureConnectionEndDate", bridge = "objcKniBridge7318")
    open external fun secureConnectionEndDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(selector = "secureConnectionStartDate", bridge = "objcKniBridge7316")
    open external fun secureConnectionStartDate(): platform.Foundation.NSDate?

    final val connectEndDate: platform.Foundation.NSDate?

    final val connectStartDate: platform.Foundation.NSDate?

    final val domainLookupEndDate: platform.Foundation.NSDate?

    final val domainLookupStartDate: platform.Foundation.NSDate?

    final val fetchStartDate: platform.Foundation.NSDate?

    final val networkProtocolName: kotlin.String?

    final val proxyConnection: kotlin.Boolean

    final val request: platform.Foundation.NSURLRequest

    final val requestEndDate: platform.Foundation.NSDate?

    final val requestStartDate: platform.Foundation.NSDate?

    final val resourceFetchType: platform.Foundation.NSURLSessionTaskMetricsResourceFetchType

    final val response: platform.Foundation.NSURLResponse?

    final val responseEndDate: platform.Foundation.NSDate?

    final val responseStartDate: platform.Foundation.NSDate?

    final val reusedConnection: kotlin.Boolean

    final val secureConnectionEndDate: platform.Foundation.NSDate?

    final val secureConnectionStartDate: platform.Foundation.NSDate?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionTaskTransactionMetrics>,
        platform.Foundation.NSURLSessionTaskTransactionMetricsMeta {
    }
}

open expect class NSURLSessionTaskTransactionMetricsMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7300")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionTaskTransactionMetrics?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7298")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionTaskTransactionMetrics?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7296")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionTaskTransactionMetrics?
}

open expect class NSURLSessionUploadTask : platform.Foundation.NSURLSessionDataTask {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7248")
    open external override /*1*/ fun init(): platform.Foundation.NSURLSessionUploadTask?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSURLSessionUploadTask>,
        platform.Foundation.NSURLSessionUploadTaskMeta {
    }
}

open expect class NSURLSessionUploadTaskMeta : platform.Foundation.NSURLSessionDataTaskMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7246")
    open external override /*1*/ fun alloc(): platform.Foundation.NSURLSessionUploadTask?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7244")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSURLSessionUploadTask?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7242")
    open external override /*1*/ fun new(): platform.Foundation.NSURLSessionUploadTask?
}

open expect class NSUUID : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "UUIDString", bridge = "objcKniBridge7442")
    open external fun UUIDString(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge7446")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge7448")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7434")
    open external override /*1*/ fun init(): platform.Foundation.NSUUID

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge7444")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUUID?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUUIDString:", bridge = "objcKniBridge7436")
    open external fun initWithUUIDString(/*0*/ string: kotlin.String): platform.Foundation.NSUUID?

    final val UUIDString: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUUID>,
        platform.Foundation.NSUUIDMeta {
    }
}

open expect class NSUUIDMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "UUID", bridge = "objcKniBridge7424")
    open external fun UUID(): platform.Foundation.NSUUID

    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7430")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUUID?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7428")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUUID?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7426")
    open external override /*1*/ fun new(): platform.Foundation.NSUUID?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge7432")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSUbiquitousKeyValueStore : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "arrayForKey:", bridge = "objcKniBridge6968")
    open external fun arrayForKey(/*0*/ aKey: kotlin.String): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "boolForKey:", bridge = "objcKniBridge6978")
    open external fun boolForKey(/*0*/ aKey: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "dataForKey:", bridge = "objcKniBridge6972")
    open external fun dataForKey(/*0*/ aKey: kotlin.String): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "dictionaryForKey:", bridge = "objcKniBridge6970")
    open external fun dictionaryForKey(/*0*/ aKey: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "dictionaryRepresentation", bridge = "objcKniBridge6996")
    open external fun dictionaryRepresentation(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "doubleForKey:", bridge = "objcKniBridge6976")
    open external fun doubleForKey(/*0*/ aKey: kotlin.String): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6998")
    open external override /*1*/ fun init(): platform.Foundation.NSUbiquitousKeyValueStore?

    @kotlinx.cinterop.ObjCMethod(selector = "longLongForKey:", bridge = "objcKniBridge6974")
    open external fun longLongForKey(/*0*/ aKey: kotlin.String): kotlin.Long

    @kotlinx.cinterop.ObjCMethod(selector = "objectForKey:", bridge = "objcKniBridge6960")
    open external fun objectForKey(/*0*/ aKey: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "removeObjectForKey:", bridge = "objcKniBridge6964")
    open external fun removeObjectForKey(/*0*/ aKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setArray:forKey:", bridge = "objcKniBridge6984")
    open external fun setArray(/*0*/ anArray: kotlin.collections.List<*>?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setBool:forKey:", bridge = "objcKniBridge6992")
    open external fun setBool(/*0*/ value: kotlin.Boolean, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setData:forKey:", bridge = "objcKniBridge6982")
    open external fun setData(/*0*/ aData: platform.Foundation.NSData?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setDictionary:forKey:", bridge = "objcKniBridge6986")
    open external fun setDictionary(/*0*/ aDictionary: kotlin.collections.Map<kotlin.Any?, *>?, /*1*/
                                          forKey: kotlin.String
    )

    @kotlinx.cinterop.ObjCMethod(selector = "setDouble:forKey:", bridge = "objcKniBridge6990")
    open external fun setDouble(/*0*/ value: kotlin.Double, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setLongLong:forKey:", bridge = "objcKniBridge6988")
    open external fun setLongLong(/*0*/ value: kotlin.Long, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setObject:forKey:", bridge = "objcKniBridge6962")
    open external fun setObject(/*0*/ anObject: kotlin.Any?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setString:forKey:", bridge = "objcKniBridge6980")
    open external fun setString(/*0*/ aString: kotlin.String?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "stringForKey:", bridge = "objcKniBridge6966")
    open external fun stringForKey(/*0*/ aKey: kotlin.String): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "synchronize", bridge = "objcKniBridge6994")
    open external fun synchronize(): kotlin.Boolean

    final val dictionaryRepresentation: kotlin.collections.Map<kotlin.Any?, *>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUbiquitousKeyValueStore>,
        platform.Foundation.NSUbiquitousKeyValueStoreMeta {
    }
}

open expect class NSUbiquitousKeyValueStoreMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6958")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUbiquitousKeyValueStore?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6956")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUbiquitousKeyValueStore?

    @kotlinx.cinterop.ObjCMethod(selector = "defaultStore", bridge = "objcKniBridge6952")
    open external fun defaultStore(): platform.Foundation.NSUbiquitousKeyValueStore

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6954")
    open external override /*1*/ fun new(): platform.Foundation.NSUbiquitousKeyValueStore?

    final val defaultStore: platform.Foundation.NSUbiquitousKeyValueStore
}

open expect class NSUndoManager : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "beginUndoGrouping", bridge = "objcKniBridge7006")
    open external fun beginUndoGrouping()

    @kotlinx.cinterop.ObjCMethod(selector = "canRedo", bridge = "objcKniBridge7056")
    open external fun canRedo(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "canUndo", bridge = "objcKniBridge7054")
    open external fun canUndo(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "disableUndoRegistration", bridge = "objcKniBridge7010")
    open external fun disableUndoRegistration()

    @kotlinx.cinterop.ObjCMethod(selector = "enableUndoRegistration", bridge = "objcKniBridge7012")
    open external fun enableUndoRegistration()

    @kotlinx.cinterop.ObjCMethod(selector = "endUndoGrouping", bridge = "objcKniBridge7008")
    open external fun endUndoGrouping()

    @kotlinx.cinterop.ObjCMethod(selector = "groupsByEvent", bridge = "objcKniBridge7042")
    open external fun groupsByEvent(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7074")
    open external override /*1*/ fun init(): platform.Foundation.NSUndoManager?

    @kotlinx.cinterop.ObjCMethod(selector = "isRedoing", bridge = "objcKniBridge7060")
    open external fun isRedoing(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isUndoRegistrationEnabled", bridge = "objcKniBridge7040")
    open external fun isUndoRegistrationEnabled(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isUndoing", bridge = "objcKniBridge7058")
    open external fun isUndoing(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "prepareWithInvocationTarget:", bridge = "objcKniBridge7026")
    open external fun prepareWithInvocationTarget(/*0*/ target: kotlin.Any): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "redo", bridge = "objcKniBridge7016")
    open external fun redo()

    @kotlinx.cinterop.ObjCMethod(selector = "redoActionIsDiscardable", bridge = "objcKniBridge7064")
    open external fun redoActionIsDiscardable(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "redoActionName", bridge = "objcKniBridge7068")
    open external fun redoActionName(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "redoMenuItemTitle", bridge = "objcKniBridge7072")
    open external fun redoMenuItemTitle(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "redoMenuTitleForUndoActionName:", bridge = "objcKniBridge7036")
    open external fun redoMenuTitleForUndoActionName(/*0*/ actionName: kotlin.String): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "registerUndoWithTarget:handler:", bridge = "objcKniBridge7028")
    open external fun registerUndoWithTarget(/*0*/ target: kotlin.Any, /*1*/ handler: (kotlin.Any?) -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllActions", bridge = "objcKniBridge7020")
    open external fun removeAllActions()

    @kotlinx.cinterop.ObjCMethod(selector = "removeAllActionsWithTarget:", bridge = "objcKniBridge7022")
    open external fun removeAllActionsWithTarget(/*0*/ target: kotlin.Any)

    @kotlinx.cinterop.ObjCMethod(selector = "runLoopModes", bridge = "objcKniBridge7050")
    open external fun runLoopModes(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "setActionIsDiscardable:", bridge = "objcKniBridge7030")
    open external fun setActionIsDiscardable(/*0*/ discardable: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setActionName:", bridge = "objcKniBridge7032")
    open external fun setActionName(/*0*/ actionName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setGroupsByEvent:", bridge = "objcKniBridge7044")
    open external fun setGroupsByEvent(/*0*/ groupsByEvent: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setRunLoopModes:", bridge = "objcKniBridge7052")
    open external fun setRunLoopModes(/*0*/ runLoopModes: kotlin.collections.List<*>)

    @kotlinx.cinterop.ObjCMethod(selector = "undo", bridge = "objcKniBridge7014")
    open external fun undo()

    @kotlinx.cinterop.ObjCMethod(selector = "undoActionIsDiscardable", bridge = "objcKniBridge7062")
    open external fun undoActionIsDiscardable(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "undoActionName", bridge = "objcKniBridge7066")
    open external fun undoActionName(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "undoMenuItemTitle", bridge = "objcKniBridge7070")
    open external fun undoMenuItemTitle(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "undoMenuTitleForUndoActionName:", bridge = "objcKniBridge7034")
    open external fun undoMenuTitleForUndoActionName(/*0*/ actionName: kotlin.String): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "undoNestedGroup", bridge = "objcKniBridge7018")
    open external fun undoNestedGroup()

    final val canRedo: kotlin.Boolean

    final val canUndo: kotlin.Boolean

    final var groupsByEvent: kotlin.Boolean

    final val redoActionIsDiscardable: kotlin.Boolean

    final val redoActionName: kotlin.String

    final val redoMenuItemTitle: kotlin.String

    final val redoing: kotlin.Boolean

    final var runLoopModes: kotlin.collections.List<*>

    final val undoActionIsDiscardable: kotlin.Boolean

    final val undoActionName: kotlin.String

    final val undoMenuItemTitle: kotlin.String

    final val undoRegistrationEnabled: kotlin.Boolean

    final val undoing: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUndoManager>,
        platform.Foundation.NSUndoManagerMeta {
    }
}

open expect class NSUndoManagerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7004")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUndoManager?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7002")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUndoManager?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7000")
    open external override /*1*/ fun new(): platform.Foundation.NSUndoManager?
}

open expect class NSUnit : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge2732")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2734")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2728")
    open external override /*1*/ fun init(): platform.Foundation.NSUnit?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2730")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnit?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2724")
    open external fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnit

    @kotlinx.cinterop.ObjCMethod(selector = "symbol", bridge = "objcKniBridge2726")
    open external fun symbol(): kotlin.String

    final val symbol: kotlin.String

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnit>,
        platform.Foundation.NSUnitMeta {
    }
}

open expect class NSUnitAcceleration : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2780")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2776")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitAcceleration?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2778")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitAcceleration?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2774")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitAcceleration

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2772")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitAcceleration

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitAcceleration>,
        platform.Foundation.NSUnitAccelerationMeta {
    }
}

open expect class NSUnitAccelerationMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2768")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitAcceleration?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2766")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitAcceleration?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2762")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitAcceleration

    @kotlinx.cinterop.ObjCMethod(selector = "gravity", bridge = "objcKniBridge2760")
    open external fun gravity(): platform.Foundation.NSUnitAcceleration

    @kotlinx.cinterop.ObjCMethod(selector = "metersPerSecondSquared", bridge = "objcKniBridge2758")
    open external fun metersPerSecondSquared(): platform.Foundation.NSUnitAcceleration

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2764")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitAcceleration?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2770")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val gravity: platform.Foundation.NSUnitAcceleration

    final val metersPerSecondSquared: platform.Foundation.NSUnitAcceleration
}

open expect class NSUnitAngle : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2812")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2808")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitAngle?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2810")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitAngle?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2806")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2804")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitAngle

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitAngle>,
        platform.Foundation.NSUnitAngleMeta {
    }
}

open expect class NSUnitAngleMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2800")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitAngle?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2798")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitAngle?

    @kotlinx.cinterop.ObjCMethod(selector = "arcMinutes", bridge = "objcKniBridge2784")
    open external fun arcMinutes(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "arcSeconds", bridge = "objcKniBridge2786")
    open external fun arcSeconds(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2794")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "degrees", bridge = "objcKniBridge2782")
    open external fun degrees(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "gradians", bridge = "objcKniBridge2790")
    open external fun gradians(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2796")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitAngle?

    @kotlinx.cinterop.ObjCMethod(selector = "radians", bridge = "objcKniBridge2788")
    open external fun radians(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "revolutions", bridge = "objcKniBridge2792")
    open external fun revolutions(): platform.Foundation.NSUnitAngle

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2802")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val arcMinutes: platform.Foundation.NSUnitAngle

    final val arcSeconds: platform.Foundation.NSUnitAngle

    final val degrees: platform.Foundation.NSUnitAngle

    final val gradians: platform.Foundation.NSUnitAngle

    final val radians: platform.Foundation.NSUnitAngle

    final val revolutions: platform.Foundation.NSUnitAngle
}

open expect class NSUnitArea : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2860")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2856")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitArea?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2858")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitArea?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2854")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2852")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitArea

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitArea>,
        platform.Foundation.NSUnitAreaMeta {
    }
}

open expect class NSUnitAreaMeta : platform.Foundation.NSDimensionMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "acres", bridge = "objcKniBridge2836")
    open external fun acres(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2848")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitArea?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2846")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitArea?

    @kotlinx.cinterop.ObjCMethod(selector = "ares", bridge = "objcKniBridge2838")
    open external fun ares(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2842")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "hectares", bridge = "objcKniBridge2840")
    open external fun hectares(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2844")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitArea?

    @kotlinx.cinterop.ObjCMethod(selector = "squareCentimeters", bridge = "objcKniBridge2820")
    open external fun squareCentimeters(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareFeet", bridge = "objcKniBridge2830")
    open external fun squareFeet(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareInches", bridge = "objcKniBridge2828")
    open external fun squareInches(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareKilometers", bridge = "objcKniBridge2816")
    open external fun squareKilometers(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareMegameters", bridge = "objcKniBridge2814")
    open external fun squareMegameters(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareMeters", bridge = "objcKniBridge2818")
    open external fun squareMeters(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareMicrometers", bridge = "objcKniBridge2824")
    open external fun squareMicrometers(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareMiles", bridge = "objcKniBridge2834")
    open external fun squareMiles(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareMillimeters", bridge = "objcKniBridge2822")
    open external fun squareMillimeters(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareNanometers", bridge = "objcKniBridge2826")
    open external fun squareNanometers(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "squareYards", bridge = "objcKniBridge2832")
    open external fun squareYards(): platform.Foundation.NSUnitArea

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2850")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val acres: platform.Foundation.NSUnitArea

    final val ares: platform.Foundation.NSUnitArea

    final val hectares: platform.Foundation.NSUnitArea

    final val squareCentimeters: platform.Foundation.NSUnitArea

    final val squareFeet: platform.Foundation.NSUnitArea

    final val squareInches: platform.Foundation.NSUnitArea

    final val squareKilometers: platform.Foundation.NSUnitArea

    final val squareMegameters: platform.Foundation.NSUnitArea

    final val squareMeters: platform.Foundation.NSUnitArea

    final val squareMicrometers: platform.Foundation.NSUnitArea

    final val squareMiles: platform.Foundation.NSUnitArea

    final val squareMillimeters: platform.Foundation.NSUnitArea

    final val squareNanometers: platform.Foundation.NSUnitArea

    final val squareYards: platform.Foundation.NSUnitArea
}

open expect class NSUnitConcentrationMass : platform.Foundation.NSDimension,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2886")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2882")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitConcentrationMass?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2884")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitConcentrationMass?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2880")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitConcentrationMass

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2878")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitConcentrationMass

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitConcentrationMass>,
        platform.Foundation.NSUnitConcentrationMassMeta {
    }
}

open expect class NSUnitConcentrationMassMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2874")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitConcentrationMass?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2872")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitConcentrationMass?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2868")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitConcentrationMass

    @kotlinx.cinterop.ObjCMethod(selector = "gramsPerLiter", bridge = "objcKniBridge2864")
    open external fun gramsPerLiter(): platform.Foundation.NSUnitConcentrationMass

    @kotlinx.cinterop.ObjCMethod(selector = "milligramsPerDeciliter", bridge = "objcKniBridge2866")
    open external fun milligramsPerDeciliter(): platform.Foundation.NSUnitConcentrationMass

    @kotlinx.cinterop.ObjCMethod(selector = "millimolesPerLiterWithGramsPerMole:", bridge = "objcKniBridge2862")
    open external fun millimolesPerLiterWithGramsPerMole(/*0*/ gramsPerMole: kotlin.Double): platform.Foundation.NSUnitConcentrationMass

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2870")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitConcentrationMass?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2876")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val gramsPerLiter: platform.Foundation.NSUnitConcentrationMass

    final val milligramsPerDeciliter: platform.Foundation.NSUnitConcentrationMass
}

open expect class NSUnitConverter : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "baseUnitValueFromValue:", bridge = "objcKniBridge2688")
    open external fun baseUnitValueFromValue(/*0*/ value: kotlin.Double): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2692")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitConverter?

    @kotlinx.cinterop.ObjCMethod(selector = "valueFromBaseUnitValue:", bridge = "objcKniBridge2690")
    open external fun valueFromBaseUnitValue(/*0*/ baseUnitValue: kotlin.Double): kotlin.Double

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitConverter>,
        platform.Foundation.NSUnitConverterMeta {
    }
}

open expect class NSUnitConverterLinear : platform.Foundation.NSUnitConverter,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "coefficient", bridge = "objcKniBridge2706")
    open external fun coefficient(): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "constant", bridge = "objcKniBridge2708")
    open external fun constant(): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2714")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2710")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitConverterLinear?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2712")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitConverterLinear?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoefficient:", bridge = "objcKniBridge2702")
    open external fun initWithCoefficient(/*0*/ coefficient: kotlin.Double): platform.Foundation.NSUnitConverterLinear

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoefficient:constant:", bridge = "objcKniBridge2704")
    open external fun initWithCoefficient(/*0*/ coefficient: kotlin.Double, /*1*/
                                                constant: kotlin.Double
    ): platform.Foundation.NSUnitConverterLinear

    final val coefficient: kotlin.Double

    final val constant: kotlin.Double

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitConverterLinear>,
        platform.Foundation.NSUnitConverterLinearMeta {
    }
}

open expect class NSUnitConverterLinearMeta : platform.Foundation.NSUnitConverterMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2698")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitConverterLinear?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2696")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitConverterLinear?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2694")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitConverterLinear?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2700")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSUnitConverterMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2686")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitConverter?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2684")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitConverter?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2682")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitConverter?
}

open expect class NSUnitDispersion : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2908")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2904")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitDispersion?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2906")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitDispersion?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2902")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitDispersion

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2900")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitDispersion

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitDispersion>,
        platform.Foundation.NSUnitDispersionMeta {
    }
}

open expect class NSUnitDispersionMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2896")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitDispersion?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2894")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitDispersion?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2890")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitDispersion

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2892")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitDispersion?

    @kotlinx.cinterop.ObjCMethod(selector = "partsPerMillion", bridge = "objcKniBridge2888")
    open external fun partsPerMillion(): platform.Foundation.NSUnitDispersion

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2898")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val partsPerMillion: platform.Foundation.NSUnitDispersion
}

open expect class NSUnitDuration : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2934")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2930")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitDuration?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2932")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitDuration?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2928")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitDuration

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2926")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitDuration

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitDuration>,
        platform.Foundation.NSUnitDurationMeta {
    }
}

open expect class NSUnitDurationMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2922")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitDuration?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2920")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitDuration?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2916")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitDuration

    @kotlinx.cinterop.ObjCMethod(selector = "hours", bridge = "objcKniBridge2914")
    open external fun hours(): platform.Foundation.NSUnitDuration

    @kotlinx.cinterop.ObjCMethod(selector = "minutes", bridge = "objcKniBridge2912")
    open external fun minutes(): platform.Foundation.NSUnitDuration

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2918")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitDuration?

    @kotlinx.cinterop.ObjCMethod(selector = "seconds", bridge = "objcKniBridge2910")
    open external fun seconds(): platform.Foundation.NSUnitDuration

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2924")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val hours: platform.Foundation.NSUnitDuration

    final val minutes: platform.Foundation.NSUnitDuration

    final val seconds: platform.Foundation.NSUnitDuration
}

open expect class NSUnitElectricCharge : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2966")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2962")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitElectricCharge?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2964")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitElectricCharge?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2960")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2958")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitElectricCharge

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitElectricCharge>,
        platform.Foundation.NSUnitElectricChargeMeta {
    }
}

open expect class NSUnitElectricChargeMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2954")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitElectricCharge?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2952")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitElectricCharge?

    @kotlinx.cinterop.ObjCMethod(selector = "ampereHours", bridge = "objcKniBridge2942")
    open external fun ampereHours(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2948")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "coulombs", bridge = "objcKniBridge2936")
    open external fun coulombs(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "kiloampereHours", bridge = "objcKniBridge2940")
    open external fun kiloampereHours(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "megaampereHours", bridge = "objcKniBridge2938")
    open external fun megaampereHours(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "microampereHours", bridge = "objcKniBridge2946")
    open external fun microampereHours(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "milliampereHours", bridge = "objcKniBridge2944")
    open external fun milliampereHours(): platform.Foundation.NSUnitElectricCharge

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2950")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitElectricCharge?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2956")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val ampereHours: platform.Foundation.NSUnitElectricCharge

    final val coulombs: platform.Foundation.NSUnitElectricCharge

    final val kiloampereHours: platform.Foundation.NSUnitElectricCharge

    final val megaampereHours: platform.Foundation.NSUnitElectricCharge

    final val microampereHours: platform.Foundation.NSUnitElectricCharge

    final val milliampereHours: platform.Foundation.NSUnitElectricCharge
}

open expect class NSUnitElectricCurrent : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge2996")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge2992")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitElectricCurrent?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge2994")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitElectricCurrent?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge2990")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge2988")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitElectricCurrent

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitElectricCurrent>,
        platform.Foundation.NSUnitElectricCurrentMeta {
    }
}

open expect class NSUnitElectricCurrentMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2984")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitElectricCurrent?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2982")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitElectricCurrent?

    @kotlinx.cinterop.ObjCMethod(selector = "amperes", bridge = "objcKniBridge2972")
    open external fun amperes(): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge2978")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "kiloamperes", bridge = "objcKniBridge2970")
    open external fun kiloamperes(): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "megaamperes", bridge = "objcKniBridge2968")
    open external fun megaamperes(): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "microamperes", bridge = "objcKniBridge2976")
    open external fun microamperes(): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "milliamperes", bridge = "objcKniBridge2974")
    open external fun milliamperes(): platform.Foundation.NSUnitElectricCurrent

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2980")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitElectricCurrent?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2986")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val amperes: platform.Foundation.NSUnitElectricCurrent

    final val kiloamperes: platform.Foundation.NSUnitElectricCurrent

    final val megaamperes: platform.Foundation.NSUnitElectricCurrent

    final val microamperes: platform.Foundation.NSUnitElectricCurrent

    final val milliamperes: platform.Foundation.NSUnitElectricCurrent
}

open expect class NSUnitElectricPotentialDifference : platform.Foundation.NSDimension,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3026")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3022")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitElectricPotentialDifference?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3024")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitElectricPotentialDifference?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3020")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitElectricPotentialDifference

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3018")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitElectricPotentialDifference

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitElectricPotentialDifference>,
        platform.Foundation.NSUnitElectricPotentialDifferenceMeta {
    }
}

open expect class NSUnitElectricPotentialDifferenceMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3014")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitElectricPotentialDifference?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3012")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitElectricPotentialDifference?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3008")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitElectricPotentialDifference

    @kotlinx.cinterop.ObjCMethod(selector = "kilovolts", bridge = "objcKniBridge3000")
    open external fun kilovolts(): platform.Foundation.NSUnitElectricPotentialDifference

    @kotlinx.cinterop.ObjCMethod(selector = "megavolts", bridge = "objcKniBridge2998")
    open external fun megavolts(): platform.Foundation.NSUnitElectricPotentialDifference

    @kotlinx.cinterop.ObjCMethod(selector = "microvolts", bridge = "objcKniBridge3006")
    open external fun microvolts(): platform.Foundation.NSUnitElectricPotentialDifference

    @kotlinx.cinterop.ObjCMethod(selector = "millivolts", bridge = "objcKniBridge3004")
    open external fun millivolts(): platform.Foundation.NSUnitElectricPotentialDifference

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3010")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitElectricPotentialDifference?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3016")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "volts", bridge = "objcKniBridge3002")
    open external fun volts(): platform.Foundation.NSUnitElectricPotentialDifference

    final val kilovolts: platform.Foundation.NSUnitElectricPotentialDifference

    final val megavolts: platform.Foundation.NSUnitElectricPotentialDifference

    final val microvolts: platform.Foundation.NSUnitElectricPotentialDifference

    final val millivolts: platform.Foundation.NSUnitElectricPotentialDifference

    final val volts: platform.Foundation.NSUnitElectricPotentialDifference
}

open expect class NSUnitElectricResistance : platform.Foundation.NSDimension,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3056")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3052")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitElectricResistance?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3054")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitElectricResistance?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3050")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3048")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitElectricResistance

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitElectricResistance>,
        platform.Foundation.NSUnitElectricResistanceMeta {
    }
}

open expect class NSUnitElectricResistanceMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3044")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitElectricResistance?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3042")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitElectricResistance?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3038")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "kiloohms", bridge = "objcKniBridge3030")
    open external fun kiloohms(): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "megaohms", bridge = "objcKniBridge3028")
    open external fun megaohms(): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "microohms", bridge = "objcKniBridge3036")
    open external fun microohms(): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "milliohms", bridge = "objcKniBridge3034")
    open external fun milliohms(): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3040")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitElectricResistance?

    @kotlinx.cinterop.ObjCMethod(selector = "ohms", bridge = "objcKniBridge3032")
    open external fun ohms(): platform.Foundation.NSUnitElectricResistance

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3046")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val kiloohms: platform.Foundation.NSUnitElectricResistance

    final val megaohms: platform.Foundation.NSUnitElectricResistance

    final val microohms: platform.Foundation.NSUnitElectricResistance

    final val milliohms: platform.Foundation.NSUnitElectricResistance

    final val ohms: platform.Foundation.NSUnitElectricResistance
}

open expect class NSUnitEnergy : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3086")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3082")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitEnergy?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3084")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitEnergy?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3080")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3078")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitEnergy

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitEnergy>,
        platform.Foundation.NSUnitEnergyMeta {
    }
}

open expect class NSUnitEnergyMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3074")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitEnergy?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3072")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitEnergy?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3068")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "calories", bridge = "objcKniBridge3064")
    open external fun calories(): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "joules", bridge = "objcKniBridge3060")
    open external fun joules(): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "kilocalories", bridge = "objcKniBridge3062")
    open external fun kilocalories(): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "kilojoules", bridge = "objcKniBridge3058")
    open external fun kilojoules(): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "kilowattHours", bridge = "objcKniBridge3066")
    open external fun kilowattHours(): platform.Foundation.NSUnitEnergy

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3070")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitEnergy?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3076")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val calories: platform.Foundation.NSUnitEnergy

    final val joules: platform.Foundation.NSUnitEnergy

    final val kilocalories: platform.Foundation.NSUnitEnergy

    final val kilojoules: platform.Foundation.NSUnitEnergy

    final val kilowattHours: platform.Foundation.NSUnitEnergy
}

open expect class NSUnitFrequency : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3122")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3118")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitFrequency?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3120")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitFrequency?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3116")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3114")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitFrequency

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitFrequency>,
        platform.Foundation.NSUnitFrequencyMeta {
    }
}

open expect class NSUnitFrequencyMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3110")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitFrequency?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3108")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitFrequency?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3104")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "gigahertz", bridge = "objcKniBridge3090")
    open external fun gigahertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "hertz", bridge = "objcKniBridge3096")
    open external fun hertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "kilohertz", bridge = "objcKniBridge3094")
    open external fun kilohertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "megahertz", bridge = "objcKniBridge3092")
    open external fun megahertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "microhertz", bridge = "objcKniBridge3100")
    open external fun microhertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "millihertz", bridge = "objcKniBridge3098")
    open external fun millihertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "nanohertz", bridge = "objcKniBridge3102")
    open external fun nanohertz(): platform.Foundation.NSUnitFrequency

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3106")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitFrequency?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3112")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "terahertz", bridge = "objcKniBridge3088")
    open external fun terahertz(): platform.Foundation.NSUnitFrequency

    final val gigahertz: platform.Foundation.NSUnitFrequency

    final val hertz: platform.Foundation.NSUnitFrequency

    final val kilohertz: platform.Foundation.NSUnitFrequency

    final val megahertz: platform.Foundation.NSUnitFrequency

    final val microhertz: platform.Foundation.NSUnitFrequency

    final val millihertz: platform.Foundation.NSUnitFrequency

    final val nanohertz: platform.Foundation.NSUnitFrequency

    final val terahertz: platform.Foundation.NSUnitFrequency
}

open expect class NSUnitFuelEfficiency : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3148")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3144")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitFuelEfficiency?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3146")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitFuelEfficiency?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3142")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitFuelEfficiency

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3140")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitFuelEfficiency

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitFuelEfficiency>,
        platform.Foundation.NSUnitFuelEfficiencyMeta {
    }
}

open expect class NSUnitFuelEfficiencyMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3136")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitFuelEfficiency?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3134")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitFuelEfficiency?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3130")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitFuelEfficiency

    @kotlinx.cinterop.ObjCMethod(selector = "litersPer100Kilometers", bridge = "objcKniBridge3124")
    open external fun litersPer100Kilometers(): platform.Foundation.NSUnitFuelEfficiency

    @kotlinx.cinterop.ObjCMethod(selector = "milesPerGallon", bridge = "objcKniBridge3128")
    open external fun milesPerGallon(): platform.Foundation.NSUnitFuelEfficiency

    @kotlinx.cinterop.ObjCMethod(selector = "milesPerImperialGallon", bridge = "objcKniBridge3126")
    open external fun milesPerImperialGallon(): platform.Foundation.NSUnitFuelEfficiency

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3132")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitFuelEfficiency?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3138")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val litersPer100Kilometers: platform.Foundation.NSUnitFuelEfficiency

    final val milesPerGallon: platform.Foundation.NSUnitFuelEfficiency

    final val milesPerImperialGallon: platform.Foundation.NSUnitFuelEfficiency
}

open expect class NSUnitIlluminance : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3234")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3230")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitIlluminance?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3232")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitIlluminance?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3228")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitIlluminance

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3226")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitIlluminance

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitIlluminance>,
        platform.Foundation.NSUnitIlluminanceMeta {
    }
}

open expect class NSUnitIlluminanceMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3222")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitIlluminance?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3220")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitIlluminance?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3216")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitIlluminance

    @kotlinx.cinterop.ObjCMethod(selector = "lux", bridge = "objcKniBridge3214")
    open external fun lux(): platform.Foundation.NSUnitIlluminance

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3218")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitIlluminance?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3224")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val lux: platform.Foundation.NSUnitIlluminance
}

open expect class NSUnitLength : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3212")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3208")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitLength?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3210")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitLength?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3206")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3204")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitLength

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitLength>,
        platform.Foundation.NSUnitLengthMeta {
    }
}

open expect class NSUnitLengthMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3200")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitLength?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3198")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitLength?

    @kotlinx.cinterop.ObjCMethod(selector = "astronomicalUnits", bridge = "objcKniBridge3190")
    open external fun astronomicalUnits(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3194")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "centimeters", bridge = "objcKniBridge3162")
    open external fun centimeters(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "decameters", bridge = "objcKniBridge3156")
    open external fun decameters(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "decimeters", bridge = "objcKniBridge3160")
    open external fun decimeters(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "fathoms", bridge = "objcKniBridge3186")
    open external fun fathoms(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "feet", bridge = "objcKniBridge3174")
    open external fun feet(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "furlongs", bridge = "objcKniBridge3188")
    open external fun furlongs(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "hectometers", bridge = "objcKniBridge3154")
    open external fun hectometers(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "inches", bridge = "objcKniBridge3172")
    open external fun inches(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "kilometers", bridge = "objcKniBridge3152")
    open external fun kilometers(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "lightyears", bridge = "objcKniBridge3182")
    open external fun lightyears(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "megameters", bridge = "objcKniBridge3150")
    open external fun megameters(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "meters", bridge = "objcKniBridge3158")
    open external fun meters(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "micrometers", bridge = "objcKniBridge3166")
    open external fun micrometers(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "miles", bridge = "objcKniBridge3178")
    open external fun miles(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "millimeters", bridge = "objcKniBridge3164")
    open external fun millimeters(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "nanometers", bridge = "objcKniBridge3168")
    open external fun nanometers(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "nauticalMiles", bridge = "objcKniBridge3184")
    open external fun nauticalMiles(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3196")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitLength?

    @kotlinx.cinterop.ObjCMethod(selector = "parsecs", bridge = "objcKniBridge3192")
    open external fun parsecs(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "picometers", bridge = "objcKniBridge3170")
    open external fun picometers(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "scandinavianMiles", bridge = "objcKniBridge3180")
    open external fun scandinavianMiles(): platform.Foundation.NSUnitLength

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3202")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "yards", bridge = "objcKniBridge3176")
    open external fun yards(): platform.Foundation.NSUnitLength

    final val astronomicalUnits: platform.Foundation.NSUnitLength

    final val centimeters: platform.Foundation.NSUnitLength

    final val decameters: platform.Foundation.NSUnitLength

    final val decimeters: platform.Foundation.NSUnitLength

    final val fathoms: platform.Foundation.NSUnitLength

    final val feet: platform.Foundation.NSUnitLength

    final val furlongs: platform.Foundation.NSUnitLength

    final val hectometers: platform.Foundation.NSUnitLength

    final val inches: platform.Foundation.NSUnitLength

    final val kilometers: platform.Foundation.NSUnitLength

    final val lightyears: platform.Foundation.NSUnitLength

    final val megameters: platform.Foundation.NSUnitLength

    final val meters: platform.Foundation.NSUnitLength

    final val micrometers: platform.Foundation.NSUnitLength

    final val miles: platform.Foundation.NSUnitLength

    final val millimeters: platform.Foundation.NSUnitLength

    final val nanometers: platform.Foundation.NSUnitLength

    final val nauticalMiles: platform.Foundation.NSUnitLength

    final val parsecs: platform.Foundation.NSUnitLength

    final val picometers: platform.Foundation.NSUnitLength

    final val scandinavianMiles: platform.Foundation.NSUnitLength

    final val yards: platform.Foundation.NSUnitLength
}

open expect class NSUnitMass : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3286")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3282")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitMass?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3284")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitMass?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3280")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3278")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitMass

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitMass>,
        platform.Foundation.NSUnitMassMeta {
    }
}

open expect class NSUnitMassMeta : platform.Foundation.NSDimensionMeta, platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3274")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitMass?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3272")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitMass?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3268")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "carats", bridge = "objcKniBridge3262")
    open external fun carats(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "centigrams", bridge = "objcKniBridge3242")
    open external fun centigrams(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "decigrams", bridge = "objcKniBridge3240")
    open external fun decigrams(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "grams", bridge = "objcKniBridge3238")
    open external fun grams(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "kilograms", bridge = "objcKniBridge3236")
    open external fun kilograms(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "metricTons", bridge = "objcKniBridge3258")
    open external fun metricTons(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "micrograms", bridge = "objcKniBridge3246")
    open external fun micrograms(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "milligrams", bridge = "objcKniBridge3244")
    open external fun milligrams(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "nanograms", bridge = "objcKniBridge3248")
    open external fun nanograms(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3270")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitMass?

    @kotlinx.cinterop.ObjCMethod(selector = "ounces", bridge = "objcKniBridge3252")
    open external fun ounces(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "ouncesTroy", bridge = "objcKniBridge3264")
    open external fun ouncesTroy(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "picograms", bridge = "objcKniBridge3250")
    open external fun picograms(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "poundsMass", bridge = "objcKniBridge3254")
    open external fun poundsMass(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "shortTons", bridge = "objcKniBridge3260")
    open external fun shortTons(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "slugs", bridge = "objcKniBridge3266")
    open external fun slugs(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "stones", bridge = "objcKniBridge3256")
    open external fun stones(): platform.Foundation.NSUnitMass

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3276")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val carats: platform.Foundation.NSUnitMass

    final val centigrams: platform.Foundation.NSUnitMass

    final val decigrams: platform.Foundation.NSUnitMass

    final val grams: platform.Foundation.NSUnitMass

    final val kilograms: platform.Foundation.NSUnitMass

    final val metricTons: platform.Foundation.NSUnitMass

    final val micrograms: platform.Foundation.NSUnitMass

    final val milligrams: platform.Foundation.NSUnitMass

    final val nanograms: platform.Foundation.NSUnitMass

    final val ounces: platform.Foundation.NSUnitMass

    final val ouncesTroy: platform.Foundation.NSUnitMass

    final val picograms: platform.Foundation.NSUnitMass

    final val poundsMass: platform.Foundation.NSUnitMass

    final val shortTons: platform.Foundation.NSUnitMass

    final val slugs: platform.Foundation.NSUnitMass

    final val stones: platform.Foundation.NSUnitMass
}

open expect class NSUnitMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge2720")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnit?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge2718")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnit?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge2716")
    open external override /*1*/ fun new(): platform.Foundation.NSUnit?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge2722")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSUnitPower : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3328")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3324")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitPower?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3326")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitPower?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3322")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3320")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitPower

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitPower>,
        platform.Foundation.NSUnitPowerMeta {
    }
}

open expect class NSUnitPowerMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3316")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitPower?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3314")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitPower?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3310")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "femtowatts", bridge = "objcKniBridge3306")
    open external fun femtowatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "gigawatts", bridge = "objcKniBridge3290")
    open external fun gigawatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "horsepower", bridge = "objcKniBridge3308")
    open external fun horsepower(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "kilowatts", bridge = "objcKniBridge3294")
    open external fun kilowatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "megawatts", bridge = "objcKniBridge3292")
    open external fun megawatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "microwatts", bridge = "objcKniBridge3300")
    open external fun microwatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "milliwatts", bridge = "objcKniBridge3298")
    open external fun milliwatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "nanowatts", bridge = "objcKniBridge3302")
    open external fun nanowatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3312")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitPower?

    @kotlinx.cinterop.ObjCMethod(selector = "picowatts", bridge = "objcKniBridge3304")
    open external fun picowatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3318")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "terawatts", bridge = "objcKniBridge3288")
    open external fun terawatts(): platform.Foundation.NSUnitPower

    @kotlinx.cinterop.ObjCMethod(selector = "watts", bridge = "objcKniBridge3296")
    open external fun watts(): platform.Foundation.NSUnitPower

    final val femtowatts: platform.Foundation.NSUnitPower

    final val gigawatts: platform.Foundation.NSUnitPower

    final val horsepower: platform.Foundation.NSUnitPower

    final val kilowatts: platform.Foundation.NSUnitPower

    final val megawatts: platform.Foundation.NSUnitPower

    final val microwatts: platform.Foundation.NSUnitPower

    final val milliwatts: platform.Foundation.NSUnitPower

    final val nanowatts: platform.Foundation.NSUnitPower

    final val picowatts: platform.Foundation.NSUnitPower

    final val terawatts: platform.Foundation.NSUnitPower

    final val watts: platform.Foundation.NSUnitPower
}

open expect class NSUnitPressure : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3368")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3364")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitPressure?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3366")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitPressure?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3362")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3360")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitPressure

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitPressure>,
        platform.Foundation.NSUnitPressureMeta {
    }
}

open expect class NSUnitPressureMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3356")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitPressure?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3354")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitPressure?

    @kotlinx.cinterop.ObjCMethod(selector = "bars", bridge = "objcKniBridge3342")
    open external fun bars(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3350")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "gigapascals", bridge = "objcKniBridge3332")
    open external fun gigapascals(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "hectopascals", bridge = "objcKniBridge3338")
    open external fun hectopascals(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "inchesOfMercury", bridge = "objcKniBridge3340")
    open external fun inchesOfMercury(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "kilopascals", bridge = "objcKniBridge3336")
    open external fun kilopascals(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "megapascals", bridge = "objcKniBridge3334")
    open external fun megapascals(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "millibars", bridge = "objcKniBridge3344")
    open external fun millibars(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "millimetersOfMercury", bridge = "objcKniBridge3346")
    open external fun millimetersOfMercury(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3352")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitPressure?

    @kotlinx.cinterop.ObjCMethod(selector = "newtonsPerMetersSquared", bridge = "objcKniBridge3330")
    open external fun newtonsPerMetersSquared(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "poundsForcePerSquareInch", bridge = "objcKniBridge3348")
    open external fun poundsForcePerSquareInch(): platform.Foundation.NSUnitPressure

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3358")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val bars: platform.Foundation.NSUnitPressure

    final val gigapascals: platform.Foundation.NSUnitPressure

    final val hectopascals: platform.Foundation.NSUnitPressure

    final val inchesOfMercury: platform.Foundation.NSUnitPressure

    final val kilopascals: platform.Foundation.NSUnitPressure

    final val megapascals: platform.Foundation.NSUnitPressure

    final val millibars: platform.Foundation.NSUnitPressure

    final val millimetersOfMercury: platform.Foundation.NSUnitPressure

    final val newtonsPerMetersSquared: platform.Foundation.NSUnitPressure

    final val poundsForcePerSquareInch: platform.Foundation.NSUnitPressure
}

open expect class NSUnitSpeed : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3396")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3392")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitSpeed?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3394")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitSpeed?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3390")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitSpeed

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3388")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitSpeed

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitSpeed>,
        platform.Foundation.NSUnitSpeedMeta {
    }
}

open expect class NSUnitSpeedMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3384")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitSpeed?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3382")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitSpeed?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3378")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitSpeed

    @kotlinx.cinterop.ObjCMethod(selector = "kilometersPerHour", bridge = "objcKniBridge3372")
    open external fun kilometersPerHour(): platform.Foundation.NSUnitSpeed

    @kotlinx.cinterop.ObjCMethod(selector = "knots", bridge = "objcKniBridge3376")
    open external fun knots(): platform.Foundation.NSUnitSpeed

    @kotlinx.cinterop.ObjCMethod(selector = "metersPerSecond", bridge = "objcKniBridge3370")
    open external fun metersPerSecond(): platform.Foundation.NSUnitSpeed

    @kotlinx.cinterop.ObjCMethod(selector = "milesPerHour", bridge = "objcKniBridge3374")
    open external fun milesPerHour(): platform.Foundation.NSUnitSpeed

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3380")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitSpeed?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3386")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val kilometersPerHour: platform.Foundation.NSUnitSpeed

    final val knots: platform.Foundation.NSUnitSpeed

    final val metersPerSecond: platform.Foundation.NSUnitSpeed

    final val milesPerHour: platform.Foundation.NSUnitSpeed
}

open expect class NSUnitTemperature : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3422")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3418")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitTemperature?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3420")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitTemperature?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3416")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitTemperature

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3414")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitTemperature

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitTemperature>,
        platform.Foundation.NSUnitTemperatureMeta {
    }
}

open expect class NSUnitTemperatureMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3410")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitTemperature?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3408")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitTemperature?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3404")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitTemperature

    @kotlinx.cinterop.ObjCMethod(selector = "celsius", bridge = "objcKniBridge3400")
    open external fun celsius(): platform.Foundation.NSUnitTemperature

    @kotlinx.cinterop.ObjCMethod(selector = "fahrenheit", bridge = "objcKniBridge3402")
    open external fun fahrenheit(): platform.Foundation.NSUnitTemperature

    @kotlinx.cinterop.ObjCMethod(selector = "kelvin", bridge = "objcKniBridge3398")
    open external fun kelvin(): platform.Foundation.NSUnitTemperature

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3406")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitTemperature?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3412")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    final val celsius: platform.Foundation.NSUnitTemperature

    final val fahrenheit: platform.Foundation.NSUnitTemperature

    final val kelvin: platform.Foundation.NSUnitTemperature
}

open expect class NSUnitVolume : platform.Foundation.NSDimension, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge3504")
    open external override /*2*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge3500")
    open external override /*1*/ fun init(): platform.Foundation.NSUnitVolume?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge3502")
    open external override /*2*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSUnitVolume?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:", bridge = "objcKniBridge3498")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSymbol:converter:", bridge = "objcKniBridge3496")
    open external override /*1*/ fun initWithSymbol(/*0*/ symbol: kotlin.String, /*1*/
                                                          converter: platform.Foundation.NSUnitConverter
    ): platform.Foundation.NSUnitVolume

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUnitVolume>,
        platform.Foundation.NSUnitVolumeMeta {
    }
}

open expect class NSUnitVolumeMeta : platform.Foundation.NSDimensionMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "acreFeet", bridge = "objcKniBridge3454")
    open external fun acreFeet(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge3492")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUnitVolume?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge3490")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUnitVolume?

    @kotlinx.cinterop.ObjCMethod(selector = "baseUnit", bridge = "objcKniBridge3486")
    open external override /*1*/ fun baseUnit(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "bushels", bridge = "objcKniBridge3456")
    open external fun bushels(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "centiliters", bridge = "objcKniBridge3432")
    open external fun centiliters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicCentimeters", bridge = "objcKniBridge3442")
    open external fun cubicCentimeters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicDecimeters", bridge = "objcKniBridge3440")
    open external fun cubicDecimeters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicFeet", bridge = "objcKniBridge3448")
    open external fun cubicFeet(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicInches", bridge = "objcKniBridge3446")
    open external fun cubicInches(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicKilometers", bridge = "objcKniBridge3436")
    open external fun cubicKilometers(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicMeters", bridge = "objcKniBridge3438")
    open external fun cubicMeters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicMiles", bridge = "objcKniBridge3452")
    open external fun cubicMiles(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicMillimeters", bridge = "objcKniBridge3444")
    open external fun cubicMillimeters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cubicYards", bridge = "objcKniBridge3450")
    open external fun cubicYards(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "cups", bridge = "objcKniBridge3464")
    open external fun cups(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "deciliters", bridge = "objcKniBridge3430")
    open external fun deciliters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "fluidOunces", bridge = "objcKniBridge3462")
    open external fun fluidOunces(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "gallons", bridge = "objcKniBridge3470")
    open external fun gallons(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "imperialFluidOunces", bridge = "objcKniBridge3476")
    open external fun imperialFluidOunces(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "imperialGallons", bridge = "objcKniBridge3482")
    open external fun imperialGallons(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "imperialPints", bridge = "objcKniBridge3478")
    open external fun imperialPints(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "imperialQuarts", bridge = "objcKniBridge3480")
    open external fun imperialQuarts(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "imperialTablespoons", bridge = "objcKniBridge3474")
    open external fun imperialTablespoons(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "imperialTeaspoons", bridge = "objcKniBridge3472")
    open external fun imperialTeaspoons(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "kiloliters", bridge = "objcKniBridge3426")
    open external fun kiloliters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "liters", bridge = "objcKniBridge3428")
    open external fun liters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "megaliters", bridge = "objcKniBridge3424")
    open external fun megaliters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "metricCups", bridge = "objcKniBridge3484")
    open external fun metricCups(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "milliliters", bridge = "objcKniBridge3434")
    open external fun milliliters(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge3488")
    open external override /*1*/ fun new(): platform.Foundation.NSUnitVolume?

    @kotlinx.cinterop.ObjCMethod(selector = "pints", bridge = "objcKniBridge3466")
    open external fun pints(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "quarts", bridge = "objcKniBridge3468")
    open external fun quarts(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge3494")
    open external override /*2*/ fun supportsSecureCoding(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "tablespoons", bridge = "objcKniBridge3460")
    open external fun tablespoons(): platform.Foundation.NSUnitVolume

    @kotlinx.cinterop.ObjCMethod(selector = "teaspoons", bridge = "objcKniBridge3458")
    open external fun teaspoons(): platform.Foundation.NSUnitVolume

    final val acreFeet: platform.Foundation.NSUnitVolume

    final val bushels: platform.Foundation.NSUnitVolume

    final val centiliters: platform.Foundation.NSUnitVolume

    final val cubicCentimeters: platform.Foundation.NSUnitVolume

    final val cubicDecimeters: platform.Foundation.NSUnitVolume

    final val cubicFeet: platform.Foundation.NSUnitVolume

    final val cubicInches: platform.Foundation.NSUnitVolume

    final val cubicKilometers: platform.Foundation.NSUnitVolume

    final val cubicMeters: platform.Foundation.NSUnitVolume

    final val cubicMiles: platform.Foundation.NSUnitVolume

    final val cubicMillimeters: platform.Foundation.NSUnitVolume

    final val cubicYards: platform.Foundation.NSUnitVolume

    final val cups: platform.Foundation.NSUnitVolume

    final val deciliters: platform.Foundation.NSUnitVolume

    final val fluidOunces: platform.Foundation.NSUnitVolume

    final val gallons: platform.Foundation.NSUnitVolume

    final val imperialFluidOunces: platform.Foundation.NSUnitVolume

    final val imperialGallons: platform.Foundation.NSUnitVolume

    final val imperialPints: platform.Foundation.NSUnitVolume

    final val imperialQuarts: platform.Foundation.NSUnitVolume

    final val imperialTablespoons: platform.Foundation.NSUnitVolume

    final val imperialTeaspoons: platform.Foundation.NSUnitVolume

    final val kiloliters: platform.Foundation.NSUnitVolume

    final val liters: platform.Foundation.NSUnitVolume

    final val megaliters: platform.Foundation.NSUnitVolume

    final val metricCups: platform.Foundation.NSUnitVolume

    final val milliliters: platform.Foundation.NSUnitVolume

    final val pints: platform.Foundation.NSUnitVolume

    final val quarts: platform.Foundation.NSUnitVolume

    final val tablespoons: platform.Foundation.NSUnitVolume

    final val teaspoons: platform.Foundation.NSUnitVolume
}

open expect class NSUserActivity : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "activityType", bridge = "objcKniBridge7362")
    open external fun activityType(): kotlin.String

    @kotlinx.cinterop.ObjCMethod(selector = "addUserInfoEntriesFromDictionary:", bridge = "objcKniBridge7352")
    open external fun addUserInfoEntriesFromDictionary(/*0*/ otherDictionary: kotlin.collections.Map<kotlin.Any?, *>)

    @kotlinx.cinterop.ObjCMethod(selector = "becomeCurrent", bridge = "objcKniBridge7354")
    open external fun becomeCurrent()

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge7400")
    open external fun delegate(): platform.Foundation.NSUserActivityDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "expirationDate", bridge = "objcKniBridge7388")
    open external fun expirationDate(): platform.Foundation.NSDate?

    @kotlinx.cinterop.ObjCMethod(
        selector = "getContinuationStreamsWithCompletionHandler:",
        bridge = "objcKniBridge7360"
    )
    open external fun getContinuationStreamsWithCompletionHandler(/*0*/ completionHandler: (platform.Foundation.NSInputStream?, platform.Foundation.NSOutputStream?, platform.Foundation.NSError?) -> kotlin.Unit)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7350")
    open external override /*1*/ fun init(): platform.Foundation.NSUserActivity

    @kotlinx.cinterop.ObjCMethod(selector = "initWithActivityType:", bridge = "objcKniBridge7348")
    open external fun initWithActivityType(/*0*/ activityType: kotlin.String): platform.Foundation.NSUserActivity

    @kotlinx.cinterop.ObjCMethod(selector = "invalidate", bridge = "objcKniBridge7358")
    open external fun invalidate()

    @kotlinx.cinterop.ObjCMethod(selector = "isEligibleForHandoff", bridge = "objcKniBridge7404")
    open external fun isEligibleForHandoff(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isEligibleForPublicIndexing", bridge = "objcKniBridge7412")
    open external fun isEligibleForPublicIndexing(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "isEligibleForSearch", bridge = "objcKniBridge7408")
    open external fun isEligibleForSearch(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "keywords", bridge = "objcKniBridge7392")
    open external fun keywords(): kotlin.collections.Set<*>

    @kotlinx.cinterop.ObjCMethod(selector = "needsSave", bridge = "objcKniBridge7376")
    open external fun needsSave(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "referrerURL", bridge = "objcKniBridge7384")
    open external fun referrerURL(): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "requiredUserInfoKeys", bridge = "objcKniBridge7372")
    open external fun requiredUserInfoKeys(): kotlin.collections.Set<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "resignCurrent", bridge = "objcKniBridge7356")
    open external fun resignCurrent()

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge7402")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSUserActivityDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setEligibleForHandoff:", bridge = "objcKniBridge7406")
    open external fun setEligibleForHandoff(/*0*/ eligibleForHandoff: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setEligibleForPublicIndexing:", bridge = "objcKniBridge7414")
    open external fun setEligibleForPublicIndexing(/*0*/ eligibleForPublicIndexing: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setEligibleForSearch:", bridge = "objcKniBridge7410")
    open external fun setEligibleForSearch(/*0*/ eligibleForSearch: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setExpirationDate:", bridge = "objcKniBridge7390")
    open external fun setExpirationDate(/*0*/ expirationDate: platform.Foundation.NSDate?)

    @kotlinx.cinterop.ObjCMethod(selector = "setKeywords:", bridge = "objcKniBridge7394")
    open external fun setKeywords(/*0*/ keywords: kotlin.collections.Set<*>)

    @kotlinx.cinterop.ObjCMethod(selector = "setNeedsSave:", bridge = "objcKniBridge7378")
    open external fun setNeedsSave(/*0*/ needsSave: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setReferrerURL:", bridge = "objcKniBridge7386")
    open external fun setReferrerURL(/*0*/ referrerURL: platform.Foundation.NSURL?)

    @kotlinx.cinterop.ObjCMethod(selector = "setRequiredUserInfoKeys:", bridge = "objcKniBridge7374")
    open external fun setRequiredUserInfoKeys(/*0*/ requiredUserInfoKeys: kotlin.collections.Set<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setSupportsContinuationStreams:", bridge = "objcKniBridge7398")
    open external fun setSupportsContinuationStreams(/*0*/ supportsContinuationStreams: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setTitle:", bridge = "objcKniBridge7366")
    open external fun setTitle(/*0*/ title: kotlin.String?)

    @kotlinx.cinterop.ObjCMethod(selector = "setUserInfo:", bridge = "objcKniBridge7370")
    open external fun setUserInfo(/*0*/ userInfo: kotlin.collections.Map<kotlin.Any?, *>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setWebpageURL:", bridge = "objcKniBridge7382")
    open external fun setWebpageURL(/*0*/ webpageURL: platform.Foundation.NSURL?)

    @kotlinx.cinterop.ObjCMethod(selector = "supportsContinuationStreams", bridge = "objcKniBridge7396")
    open external fun supportsContinuationStreams(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "title", bridge = "objcKniBridge7364")
    open external fun title(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "userInfo", bridge = "objcKniBridge7368")
    open external fun userInfo(): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "webpageURL", bridge = "objcKniBridge7380")
    open external fun webpageURL(): platform.Foundation.NSURL?

    final val activityType: kotlin.String

    final var delegate: platform.Foundation.NSUserActivityDelegateProtocol?

    final var eligibleForHandoff: kotlin.Boolean

    final var eligibleForPublicIndexing: kotlin.Boolean

    final var eligibleForSearch: kotlin.Boolean

    final var expirationDate: platform.Foundation.NSDate?

    final var keywords: kotlin.collections.Set<*>

    final var needsSave: kotlin.Boolean

    final var referrerURL: platform.Foundation.NSURL?

    final var requiredUserInfoKeys: kotlin.collections.Set<*>?

    final var supportsContinuationStreams: kotlin.Boolean

    final var title: kotlin.String?

    final var userInfo: kotlin.collections.Map<kotlin.Any?, *>?

    final var webpageURL: platform.Foundation.NSURL?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUserActivity>,
        platform.Foundation.NSUserActivityMeta {
    }
}

expect interface NSUserActivityDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSUserActivityDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSUserActivityMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge7346")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUserActivity?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge7344")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUserActivity?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge7342")
    open external override /*1*/ fun new(): platform.Foundation.NSUserActivity?
}

open expect class NSUserDefaults : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "URLForKey:", bridge = "objcKniBridge6006")
    open external fun URLForKey(/*0*/ defaultName: kotlin.String): platform.Foundation.NSURL?

    @kotlinx.cinterop.ObjCMethod(selector = "addSuiteNamed:", bridge = "objcKniBridge6020")
    open external fun addSuiteNamed(/*0*/ suiteName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "arrayForKey:", bridge = "objcKniBridge5990")
    open external fun arrayForKey(/*0*/ defaultName: kotlin.String): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "boolForKey:", bridge = "objcKniBridge6004")
    open external fun boolForKey(/*0*/ defaultName: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "dataForKey:", bridge = "objcKniBridge5994")
    open external fun dataForKey(/*0*/ defaultName: kotlin.String): platform.Foundation.NSData?

    @kotlinx.cinterop.ObjCMethod(selector = "dictionaryForKey:", bridge = "objcKniBridge5992")
    open external fun dictionaryForKey(/*0*/ defaultName: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "dictionaryRepresentation", bridge = "objcKniBridge6024")
    open external fun dictionaryRepresentation(): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "doubleForKey:", bridge = "objcKniBridge6002")
    open external fun doubleForKey(/*0*/ defaultName: kotlin.String): kotlin.Double

    @kotlinx.cinterop.ObjCMethod(selector = "floatForKey:", bridge = "objcKniBridge6000")
    open external fun floatForKey(/*0*/ defaultName: kotlin.String): kotlin.Float

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge5976")
    open external override /*1*/ fun init(): platform.Foundation.NSUserDefaults

    @kotlinx.cinterop.ObjCMethod(selector = "initWithSuiteName:", bridge = "objcKniBridge5978")
    open external fun initWithSuiteName(/*0*/ suitename: kotlin.String?): platform.Foundation.NSUserDefaults?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithUser:", bridge = "objcKniBridge5980")
    open external fun initWithUser(/*0*/ username: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "objectForKey:", bridge = "objcKniBridge5982")
    open external fun objectForKey(/*0*/ defaultName: kotlin.String): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "objectIsForcedForKey:", bridge = "objcKniBridge6042")
    open external fun objectIsForcedForKey(/*0*/ key: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "objectIsForcedForKey:inDomain:", bridge = "objcKniBridge6044")
    open external fun objectIsForcedForKey(/*0*/ key: kotlin.String, /*1*/ inDomain: kotlin.String): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "persistentDomainForName:", bridge = "objcKniBridge6034")
    open external fun persistentDomainForName(/*0*/ domainName: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>?

    @kotlinx.cinterop.ObjCMethod(selector = "persistentDomainNames", bridge = "objcKniBridge6032")
    open external fun persistentDomainNames(): kotlin.collections.List<*>

    @kotlinx.cinterop.ObjCMethod(selector = "registerDefaults:", bridge = "objcKniBridge6018")
    open external fun registerDefaults(/*0*/ registrationDictionary: kotlin.collections.Map<kotlin.Any?, *>)

    @kotlinx.cinterop.ObjCMethod(selector = "removeObjectForKey:", bridge = "objcKniBridge5986")
    open external fun removeObjectForKey(/*0*/ defaultName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "removePersistentDomainForName:", bridge = "objcKniBridge6038")
    open external fun removePersistentDomainForName(/*0*/ domainName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "removeSuiteNamed:", bridge = "objcKniBridge6022")
    open external fun removeSuiteNamed(/*0*/ suiteName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "removeVolatileDomainForName:", bridge = "objcKniBridge6030")
    open external fun removeVolatileDomainForName(/*0*/ domainName: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setBool:forKey:", bridge = "objcKniBridge6014")
    open external fun setBool(/*0*/ value: kotlin.Boolean, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setDouble:forKey:", bridge = "objcKniBridge6012")
    open external fun setDouble(/*0*/ value: kotlin.Double, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setFloat:forKey:", bridge = "objcKniBridge6010")
    open external fun setFloat(/*0*/ value: kotlin.Float, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setObject:forKey:", bridge = "objcKniBridge5984")
    open external fun setObject(/*0*/ value: kotlin.Any?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setPersistentDomain:forName:", bridge = "objcKniBridge6036")
    open external fun setPersistentDomain(/*0*/ domain: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                                forName: kotlin.String
    )

    @kotlinx.cinterop.ObjCMethod(selector = "setURL:forKey:", bridge = "objcKniBridge6016")
    open external fun setURL(/*0*/ url: platform.Foundation.NSURL?, /*1*/ forKey: kotlin.String)

    @kotlinx.cinterop.ObjCMethod(selector = "setVolatileDomain:forName:", bridge = "objcKniBridge6028")
    open external fun setVolatileDomain(/*0*/ domain: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                              forName: kotlin.String
    )

    @kotlinx.cinterop.ObjCMethod(selector = "stringArrayForKey:", bridge = "objcKniBridge5996")
    open external fun stringArrayForKey(/*0*/ defaultName: kotlin.String): kotlin.collections.List<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "stringForKey:", bridge = "objcKniBridge5988")
    open external fun stringForKey(/*0*/ defaultName: kotlin.String): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "synchronize", bridge = "objcKniBridge6040")
    open external fun synchronize(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "volatileDomainForName:", bridge = "objcKniBridge6026")
    open external fun volatileDomainForName(/*0*/ domainName: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>

    @kotlinx.cinterop.ObjCMethod(selector = "volatileDomainNames", bridge = "objcKniBridge6046")
    open external fun volatileDomainNames(): kotlin.collections.List<*>

    final val volatileDomainNames: kotlin.collections.List<*>

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSUserDefaults>,
        platform.Foundation.NSUserDefaultsMeta {
    }
}

open expect class NSUserDefaultsMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge5974")
    open external override /*1*/ fun alloc(): platform.Foundation.NSUserDefaults?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge5972")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSUserDefaults?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge5970")
    open external override /*1*/ fun new(): platform.Foundation.NSUserDefaults?

    @kotlinx.cinterop.ObjCMethod(selector = "resetStandardUserDefaults", bridge = "objcKniBridge5966")
    open external fun resetStandardUserDefaults()

    @kotlinx.cinterop.ObjCMethod(selector = "standardUserDefaults", bridge = "objcKniBridge5968")
    open external fun standardUserDefaults(): platform.Foundation.NSUserDefaults

    final val standardUserDefaults: platform.Foundation.NSUserDefaults
}

open expect class NSValue : platform.darwin.NSObject, platform.Foundation.NSCopyingProtocol,
    platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "copyWithZone:", bridge = "objcKniBridge558")
    open external override /*1*/ fun copyWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge560")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge556")
    open external override /*1*/ fun init(): platform.Foundation.NSValue?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge552")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSValue?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSValue>,
        platform.Foundation.NSValueMeta {
    }
}

open expect class NSValueMeta : platform.darwin.NSObjectMeta, platform.Foundation.NSCopyingProtocolMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge544")
    open external override /*1*/ fun alloc(): platform.Foundation.NSValue?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge542")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSValue?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge540")
    open external override /*1*/ fun new(): platform.Foundation.NSValue?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge546")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSValueTransformer : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6068")
    open external override /*1*/ fun init(): platform.Foundation.NSValueTransformer?

    @kotlinx.cinterop.ObjCMethod(selector = "reverseTransformedValue:", bridge = "objcKniBridge6066")
    open external fun reverseTransformedValue(/*0*/ value: kotlin.Any?): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "transformedValue:", bridge = "objcKniBridge6064")
    open external fun transformedValue(/*0*/ value: kotlin.Any?): kotlin.Any?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSValueTransformer>,
        platform.Foundation.NSValueTransformerMeta {
    }
}

open expect class NSValueTransformerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6062")
    open external override /*1*/ fun alloc(): platform.Foundation.NSValueTransformer?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6060")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSValueTransformer?

    @kotlinx.cinterop.ObjCMethod(selector = "allowsReverseTransformation", bridge = "objcKniBridge6056")
    open external fun allowsReverseTransformation(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6058")
    open external override /*1*/ fun new(): platform.Foundation.NSValueTransformer?

    @kotlinx.cinterop.ObjCMethod(selector = "transformedValueClass", bridge = "objcKniBridge6054")
    open external fun transformedValueClass(): kotlinx.cinterop.ObjCClass

    @kotlinx.cinterop.ObjCMethod(selector = "valueTransformerNames", bridge = "objcKniBridge6052")
    open external fun valueTransformerNames(): kotlin.collections.List<*>
}

open expect class NSXMLParser : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "abortParsing", bridge = "objcKniBridge6094")
    open external fun abortParsing()

    @kotlinx.cinterop.ObjCMethod(selector = "allowedExternalEntityURLs", bridge = "objcKniBridge6112")
    open external fun allowedExternalEntityURLs(): kotlin.collections.Set<*>?

    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge6096")
    open external fun delegate(): platform.Foundation.NSXMLParserDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6122")
    open external override /*1*/ fun init(): platform.Foundation.NSXMLParser?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge6086")
    open external fun initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSXMLParser?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithData:", bridge = "objcKniBridge6088")
    open external fun initWithData(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSXMLParser

    @kotlinx.cinterop.ObjCMethod(selector = "initWithStream:", bridge = "objcKniBridge6090")
    open external fun initWithStream(/*0*/ stream: platform.Foundation.NSInputStream): platform.Foundation.NSXMLParser

    @kotlinx.cinterop.ObjCMethod(selector = "parse", bridge = "objcKniBridge6092")
    open external fun parse(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "parserError", bridge = "objcKniBridge6116")
    open external fun parserError(): platform.Foundation.NSError?

    @kotlinx.cinterop.ObjCMethod(selector = "setAllowedExternalEntityURLs:", bridge = "objcKniBridge6114")
    open external fun setAllowedExternalEntityURLs(/*0*/ allowedExternalEntityURLs: kotlin.collections.Set<*>?)

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge6098")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSXMLParserDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "setShouldProcessNamespaces:", bridge = "objcKniBridge6102")
    open external fun setShouldProcessNamespaces(/*0*/ shouldProcessNamespaces: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setShouldReportNamespacePrefixes:", bridge = "objcKniBridge6106")
    open external fun setShouldReportNamespacePrefixes(/*0*/ shouldReportNamespacePrefixes: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "setShouldResolveExternalEntities:", bridge = "objcKniBridge6120")
    open external fun setShouldResolveExternalEntities(/*0*/ shouldResolveExternalEntities: kotlin.Boolean)

    @kotlinx.cinterop.ObjCMethod(selector = "shouldProcessNamespaces", bridge = "objcKniBridge6100")
    open external fun shouldProcessNamespaces(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "shouldReportNamespacePrefixes", bridge = "objcKniBridge6104")
    open external fun shouldReportNamespacePrefixes(): kotlin.Boolean

    @kotlinx.cinterop.ObjCMethod(selector = "shouldResolveExternalEntities", bridge = "objcKniBridge6118")
    open external fun shouldResolveExternalEntities(): kotlin.Boolean

    final var allowedExternalEntityURLs: kotlin.collections.Set<*>?

    final var delegate: platform.Foundation.NSXMLParserDelegateProtocol?

    final val parserError: platform.Foundation.NSError?

    final var shouldProcessNamespaces: kotlin.Boolean

    final var shouldReportNamespacePrefixes: kotlin.Boolean

    final var shouldResolveExternalEntities: kotlin.Boolean

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSXMLParser>,
        platform.Foundation.NSXMLParserMeta {
    }
}

expect interface NSXMLParserDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSXMLParserDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSXMLParserMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6084")
    open external override /*1*/ fun alloc(): platform.Foundation.NSXMLParser?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6082")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSXMLParser?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6080")
    open external override /*1*/ fun new(): platform.Foundation.NSXMLParser?
}

open expect class NSXPCConnection : platform.darwin.NSObject, platform.Foundation.NSXPCProxyCreatingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "endpoint", bridge = "objcKniBridge4318")
    open external fun endpoint(): platform.Foundation.NSXPCListenerEndpoint

    @kotlinx.cinterop.ObjCMethod(selector = "exportedInterface", bridge = "objcKniBridge4320")
    open external fun exportedInterface(): platform.Foundation.NSXPCInterface?

    @kotlinx.cinterop.ObjCMethod(selector = "exportedObject", bridge = "objcKniBridge4324")
    open external fun exportedObject(): kotlin.Any?

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4348")
    open external override /*1*/ fun init(): platform.Foundation.NSXPCConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithListenerEndpoint:", bridge = "objcKniBridge4306")
    open external fun initWithListenerEndpoint(/*0*/ endpoint: platform.Foundation.NSXPCListenerEndpoint): platform.Foundation.NSXPCConnection

    @kotlinx.cinterop.ObjCMethod(selector = "interruptionHandler", bridge = "objcKniBridge4332")
    open external fun interruptionHandler(): (() -> kotlin.Unit)?

    @kotlinx.cinterop.ObjCMethod(selector = "invalidate", bridge = "objcKniBridge4314")
    open external fun invalidate()

    @kotlinx.cinterop.ObjCMethod(selector = "invalidationHandler", bridge = "objcKniBridge4336")
    open external fun invalidationHandler(): (() -> kotlin.Unit)?

    @kotlinx.cinterop.ObjCMethod(selector = "remoteObjectInterface", bridge = "objcKniBridge4328")
    open external fun remoteObjectInterface(): platform.Foundation.NSXPCInterface?

    @kotlinx.cinterop.ObjCMethod(selector = "remoteObjectProxy", bridge = "objcKniBridge4350")
    open external override /*1*/ fun remoteObjectProxy(): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "remoteObjectProxyWithErrorHandler:", bridge = "objcKniBridge4352")
    open external override /*1*/ fun remoteObjectProxyWithErrorHandler(/*0*/ handler: (platform.Foundation.NSError?) -> kotlin.Unit): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "resume", bridge = "objcKniBridge4310")
    open external fun resume()

    @kotlinx.cinterop.ObjCMethod(selector = "serviceName", bridge = "objcKniBridge4316")
    open external fun serviceName(): kotlin.String?

    @kotlinx.cinterop.ObjCMethod(selector = "setExportedInterface:", bridge = "objcKniBridge4322")
    open external fun setExportedInterface(/*0*/ exportedInterface: platform.Foundation.NSXPCInterface?)

    @kotlinx.cinterop.ObjCMethod(selector = "setExportedObject:", bridge = "objcKniBridge4326")
    open external fun setExportedObject(/*0*/ exportedObject: kotlin.Any?)

    @kotlinx.cinterop.ObjCMethod(selector = "setInterruptionHandler:", bridge = "objcKniBridge4334")
    open external fun setInterruptionHandler(/*0*/ interruptionHandler: (() -> kotlin.Unit)?)

    @kotlinx.cinterop.ObjCMethod(selector = "setInvalidationHandler:", bridge = "objcKniBridge4338")
    open external fun setInvalidationHandler(/*0*/ invalidationHandler: (() -> kotlin.Unit)?)

    @kotlinx.cinterop.ObjCMethod(selector = "setRemoteObjectInterface:", bridge = "objcKniBridge4330")
    open external fun setRemoteObjectInterface(/*0*/ remoteObjectInterface: platform.Foundation.NSXPCInterface?)

    @kotlinx.cinterop.ObjCMethod(selector = "suspend", bridge = "objcKniBridge4312")
    open external fun suspend()

    @Suppress("NOTHING_TO_OVERRIDE")
    @kotlinx.cinterop.ObjCMethod(
        selector = "synchronousRemoteObjectProxyWithErrorHandler:",
        bridge = "objcKniBridge4308"
    )
    open external override /*1*/ fun synchronousRemoteObjectProxyWithErrorHandler(/*0*/ handler: (platform.Foundation.NSError?) -> kotlin.Unit): kotlin.Any

    final val endpoint: platform.Foundation.NSXPCListenerEndpoint

    final var exportedInterface: platform.Foundation.NSXPCInterface?

    final var exportedObject: kotlin.Any?

    final var interruptionHandler: (() -> kotlin.Unit)?

    final var invalidationHandler: (() -> kotlin.Unit)?

    final var remoteObjectInterface: platform.Foundation.NSXPCInterface?

    final val serviceName: kotlin.String?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSXPCConnection>,
        platform.Foundation.NSXPCConnectionMeta {
    }
}

open expect class NSXPCConnectionMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSXPCProxyCreatingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4304")
    open external override /*1*/ fun alloc(): platform.Foundation.NSXPCConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4302")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSXPCConnection?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4300")
    open external override /*1*/ fun new(): platform.Foundation.NSXPCConnection?
}

open expect class NSXPCInterface : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4388")
    open external override /*1*/ fun init(): platform.Foundation.NSXPCInterface?

    @kotlinx.cinterop.ObjCMethod(selector = "protocol", bridge = "objcKniBridge4384")
    open external fun protocol(): objcnames.classes.Protocol

    @kotlinx.cinterop.ObjCMethod(selector = "setProtocol:", bridge = "objcKniBridge4386")
    open external fun setProtocol(/*0*/ protocol: objcnames.classes.Protocol)

    final var protocol: objcnames.classes.Protocol

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSXPCInterface>,
        platform.Foundation.NSXPCInterfaceMeta {
    }
}

open expect class NSXPCInterfaceMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4374")
    open external override /*1*/ fun alloc(): platform.Foundation.NSXPCInterface?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4372")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSXPCInterface?

    @kotlinx.cinterop.ObjCMethod(selector = "interfaceWithProtocol:", bridge = "objcKniBridge4368")
    open external fun interfaceWithProtocol(/*0*/ protocol: objcnames.classes.Protocol): platform.Foundation.NSXPCInterface

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4370")
    open external override /*1*/ fun new(): platform.Foundation.NSXPCInterface?
}

open expect class NSXPCListener : platform.darwin.NSObject {
    @kotlinx.cinterop.ObjCMethod(selector = "delegate", bridge = "objcKniBridge6140")
    open external fun delegate(): platform.Foundation.NSXPCListenerDelegateProtocol?

    @kotlinx.cinterop.ObjCMethod(selector = "endpoint", bridge = "objcKniBridge6144")
    open external fun endpoint(): platform.Foundation.NSXPCListenerEndpoint

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge6146")
    open external override /*1*/ fun init(): platform.Foundation.NSXPCListener?

    @kotlinx.cinterop.ObjCMethod(selector = "invalidate", bridge = "objcKniBridge6138")
    open external fun invalidate()

    @kotlinx.cinterop.ObjCMethod(selector = "resume", bridge = "objcKniBridge6134")
    open external fun resume()

    @kotlinx.cinterop.ObjCMethod(selector = "setDelegate:", bridge = "objcKniBridge6142")
    open external fun setDelegate(/*0*/ delegate: platform.Foundation.NSXPCListenerDelegateProtocol?)

    @kotlinx.cinterop.ObjCMethod(selector = "suspend", bridge = "objcKniBridge6136")
    open external fun suspend()

    final var delegate: platform.Foundation.NSXPCListenerDelegateProtocol?

    final val endpoint: platform.Foundation.NSXPCListenerEndpoint

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSXPCListener>,
        platform.Foundation.NSXPCListenerMeta {
    }
}

expect interface NSXPCListenerDelegateProtocol : platform.darwin.NSObjectProtocol {
}

expect interface NSXPCListenerDelegateProtocolMeta : platform.darwin.NSObjectProtocolMeta {
}

open expect class NSXPCListenerEndpoint : platform.darwin.NSObject, platform.Foundation.NSSecureCodingProtocol {
    @kotlinx.cinterop.ObjCMethod(selector = "encodeWithCoder:", bridge = "objcKniBridge4366")
    open external override /*1*/ fun encodeWithCoder(/*0*/ aCoder: platform.Foundation.NSCoder)

    @kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge4362")
    open external override /*1*/ fun init(): platform.Foundation.NSXPCListenerEndpoint?

    @kotlinx.cinterop.ObjCMethod(selector = "initWithCoder:", bridge = "objcKniBridge4364")
    open external override /*1*/ fun initWithCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): platform.Foundation.NSXPCListenerEndpoint?

    companion object Companion : kotlinx.cinterop.ObjCClassOf<platform.Foundation.NSXPCListenerEndpoint>,
        platform.Foundation.NSXPCListenerEndpointMeta {
    }
}

open expect class NSXPCListenerEndpointMeta : platform.darwin.NSObjectMeta,
    platform.Foundation.NSSecureCodingProtocolMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge4358")
    open external override /*1*/ fun alloc(): platform.Foundation.NSXPCListenerEndpoint?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge4356")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSXPCListenerEndpoint?

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge4354")
    open external override /*1*/ fun new(): platform.Foundation.NSXPCListenerEndpoint?

    @kotlinx.cinterop.ObjCMethod(selector = "supportsSecureCoding", bridge = "objcKniBridge4360")
    open external override /*1*/ fun supportsSecureCoding(): kotlin.Boolean
}

open expect class NSXPCListenerMeta : platform.darwin.NSObjectMeta {
    @kotlinx.cinterop.ObjCMethod(selector = "alloc", bridge = "objcKniBridge6132")
    open external override /*1*/ fun alloc(): platform.Foundation.NSXPCListener?

    @kotlinx.cinterop.ObjCMethod(selector = "allocWithZone:", bridge = "objcKniBridge6130")
    open external override /*1*/ fun allocWithZone(/*0*/ zone: kotlinx.cinterop.CPointer<cnames.structs._NSZone>?): platform.Foundation.NSXPCListener?

    @kotlinx.cinterop.ObjCMethod(selector = "anonymousListener", bridge = "objcKniBridge6126")
    open external fun anonymousListener(): platform.Foundation.NSXPCListener

    @kotlinx.cinterop.ObjCMethod(selector = "new", bridge = "objcKniBridge6128")
    open external override /*1*/ fun new(): platform.Foundation.NSXPCListener?

    @kotlinx.cinterop.ObjCMethod(selector = "serviceListener", bridge = "objcKniBridge6124")
    open external fun serviceListener(): platform.Foundation.NSXPCListener
}

expect interface NSXPCProxyCreatingProtocol : kotlinx.cinterop.ObjCObject {
    @kotlinx.cinterop.ObjCMethod(selector = "remoteObjectProxy", bridge = "objcKniBridge92")
    fun remoteObjectProxy(): kotlin.Any

    @kotlinx.cinterop.ObjCMethod(selector = "remoteObjectProxyWithErrorHandler:", bridge = "objcKniBridge94")
    fun remoteObjectProxyWithErrorHandler(/*0*/ handler: (platform.Foundation.NSError?) -> kotlin.Unit): kotlin.Any
}

expect interface NSXPCProxyCreatingProtocolMeta : kotlinx.cinterop.ObjCObjectMeta /* = kotlinx.cinterop.ObjCClass */ {
}

final expect class _NSRange : kotlinx.cinterop.CStructVar {
    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _expressionFlags : kotlinx.cinterop.CStructVar {
    final var _evaluationBlocked: kotlin.UInt

    final var _reservedExpressionFlags: kotlin.UInt

    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _predicateFlags : kotlinx.cinterop.CStructVar {
    final var _evaluationBlocked: kotlin.UInt

    final var _reservedPredicateFlags: kotlin.UInt

    companion object Companion : kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class NSAttributedStringKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSCalendarIdentifier : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSErrorDomain : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSErrorUserInfoKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSExceptionName : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSFileAttributeKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSFileAttributeType : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSFileProtectionType : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSFileProviderServiceName : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSHTTPCookiePropertyKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSKeyValueChangeKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSKeyValueOperator : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSLinguisticTag : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSLinguisticTagScheme : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSLocaleKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSNotificationName : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSProgressFileOperationKind : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSProgressKind : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSProgressUserInfoKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSRange : kotlinx.cinterop.CStructVar {
}

final expect class NSRunLoopMode : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSSocketNativeHandle : kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class NSStreamNetworkServiceTypeValue : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSStreamPropertyKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSStreamSOCKSProxyConfiguration : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSStreamSOCKSProxyVersion : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSStreamSocketSecurityLevel : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSStringEncodingDetectionOptionsKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSStringTransform : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSTextCheckingKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSTimeInterval : kotlin.Number, kotlin.Comparable<kotlin.Double> {
}

final expect class NSURLFileProtectionType : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSURLFileResourceType : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSURLResourceKey : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSURLThumbnailDictionaryItem : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSURLUbiquitousItemDownloadingStatus : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSURLUbiquitousSharedItemPermissions : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSURLUbiquitousSharedItemRole : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSUserActivityPersistentIdentifier : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSValueTransformerName : kotlin.Comparable<kotlin.String>, kotlin.CharSequence {
}

final expect class NSZone : kotlinx.cinterop.COpaque {
}

expect val NSArgumentDomain: kotlin.String

expect val NSAssertionHandlerKey: kotlin.String

expect val NSBuddhistCalendar: kotlin.String

expect val NSBundleExecutableArchitectureI386: kotlin.UInt

expect val NSBundleExecutableArchitecturePPC: kotlin.UInt

expect val NSBundleExecutableArchitecturePPC64: kotlin.UInt

expect val NSBundleExecutableArchitectureX86_64: kotlin.UInt

expect val NSBundleResourceRequestLoadingPriorityUrgent: kotlin.Double

expect val NSChineseCalendar: kotlin.String

expect val NSErrorFailingURLStringKey: kotlin.String

expect val NSExtensionHostDidBecomeActiveNotification: kotlin.String?

expect val NSExtensionHostDidEnterBackgroundNotification: kotlin.String?

expect val NSExtensionHostWillEnterForegroundNotification: kotlin.String?

expect val NSExtensionHostWillResignActiveNotification: kotlin.String?

expect val NSExtensionItemAttachmentsKey: kotlin.String?

expect val NSExtensionItemAttributedContentTextKey: kotlin.String?

expect val NSExtensionItemAttributedTitleKey: kotlin.String?

expect val NSExtensionItemsAndErrorsKey: kotlin.String?

expect val NSExtensionJavaScriptFinalizeArgumentKey: kotlin.String?

expect val NSExtensionJavaScriptPreprocessingResultsKey: kotlin.String?

expect val NSFileHandleNotificationDataItem: kotlin.String

expect val NSFileHandleNotificationFileHandleItem: kotlin.String

expect val NSFileHandleNotificationMonitorModes: kotlin.String

expect val NSFileManagerUnmountDissentingProcessIdentifierErrorKey: kotlin.String

expect var NSFoundationVersionNumber: kotlin.Double

expect val NSFoundationVersionNumber10_0: kotlin.Double

expect val NSFoundationVersionNumber10_1: kotlin.Double

expect val NSFoundationVersionNumber10_10: kotlin.Double

expect val NSFoundationVersionNumber10_10_1: kotlin.Double

expect val NSFoundationVersionNumber10_10_2: kotlin.Double

expect val NSFoundationVersionNumber10_10_3: kotlin.Double

expect val NSFoundationVersionNumber10_10_4: kotlin.Double

expect val NSFoundationVersionNumber10_11_1: kotlin.Double

expect val NSFoundationVersionNumber10_11_2: kotlin.Double

expect val NSFoundationVersionNumber10_11_3: kotlin.Double

expect val NSFoundationVersionNumber10_1_1: kotlin.Double

expect val NSFoundationVersionNumber10_1_2: kotlin.Double

expect val NSFoundationVersionNumber10_1_3: kotlin.Double

expect val NSFoundationVersionNumber10_1_4: kotlin.Double

expect val NSFoundationVersionNumber10_2: kotlin.Double

expect val NSFoundationVersionNumber10_2_1: kotlin.Double

expect val NSFoundationVersionNumber10_2_2: kotlin.Double

expect val NSFoundationVersionNumber10_2_3: kotlin.Double

expect val NSFoundationVersionNumber10_2_4: kotlin.Double

expect val NSFoundationVersionNumber10_2_5: kotlin.Double

expect val NSFoundationVersionNumber10_2_6: kotlin.Double

expect val NSFoundationVersionNumber10_2_7: kotlin.Double

expect val NSFoundationVersionNumber10_2_8: kotlin.Double

expect val NSFoundationVersionNumber10_3: kotlin.Double

expect val NSFoundationVersionNumber10_3_1: kotlin.Double

expect val NSFoundationVersionNumber10_3_2: kotlin.Double

expect val NSFoundationVersionNumber10_3_3: kotlin.Double

expect val NSFoundationVersionNumber10_3_4: kotlin.Double

expect val NSFoundationVersionNumber10_3_5: kotlin.Double

expect val NSFoundationVersionNumber10_3_6: kotlin.Double

expect val NSFoundationVersionNumber10_3_7: kotlin.Double

expect val NSFoundationVersionNumber10_3_8: kotlin.Double

expect val NSFoundationVersionNumber10_3_9: kotlin.Double

expect val NSFoundationVersionNumber10_4: kotlin.Double

expect val NSFoundationVersionNumber10_4_1: kotlin.Double

expect val NSFoundationVersionNumber10_4_10: kotlin.Double

expect val NSFoundationVersionNumber10_4_11: kotlin.Double

expect val NSFoundationVersionNumber10_4_2: kotlin.Double

expect val NSFoundationVersionNumber10_4_3: kotlin.Double

expect val NSFoundationVersionNumber10_4_4_Intel: kotlin.Double

expect val NSFoundationVersionNumber10_4_4_PowerPC: kotlin.Double

expect val NSFoundationVersionNumber10_4_5: kotlin.Double

expect val NSFoundationVersionNumber10_4_6: kotlin.Double

expect val NSFoundationVersionNumber10_4_7: kotlin.Double

expect val NSFoundationVersionNumber10_4_8: kotlin.Double

expect val NSFoundationVersionNumber10_4_9: kotlin.Double

expect val NSFoundationVersionNumber10_5: kotlin.Double

expect val NSFoundationVersionNumber10_5_1: kotlin.Double

expect val NSFoundationVersionNumber10_5_2: kotlin.Double

expect val NSFoundationVersionNumber10_5_3: kotlin.Double

expect val NSFoundationVersionNumber10_5_4: kotlin.Double

expect val NSFoundationVersionNumber10_5_5: kotlin.Double

expect val NSFoundationVersionNumber10_5_6: kotlin.Double

expect val NSFoundationVersionNumber10_5_7: kotlin.Double

expect val NSFoundationVersionNumber10_5_8: kotlin.Double

expect val NSFoundationVersionNumber10_6: kotlin.Double

expect val NSFoundationVersionNumber10_6_1: kotlin.Double

expect val NSFoundationVersionNumber10_6_2: kotlin.Double

expect val NSFoundationVersionNumber10_6_3: kotlin.Double

expect val NSFoundationVersionNumber10_6_4: kotlin.Double

expect val NSFoundationVersionNumber10_6_5: kotlin.Double

expect val NSFoundationVersionNumber10_6_6: kotlin.Double

expect val NSFoundationVersionNumber10_6_7: kotlin.Double

expect val NSFoundationVersionNumber10_6_8: kotlin.Double

expect val NSFoundationVersionNumber10_7: kotlin.Double

expect val NSFoundationVersionNumber10_7_1: kotlin.Double

expect val NSFoundationVersionNumber10_7_2: kotlin.Double

expect val NSFoundationVersionNumber10_7_3: kotlin.Double

expect val NSFoundationVersionNumber10_7_4: kotlin.Double

expect val NSFoundationVersionNumber10_8: kotlin.Double

expect val NSFoundationVersionNumber10_8_1: kotlin.Double

expect val NSFoundationVersionNumber10_8_2: kotlin.Double

expect val NSFoundationVersionNumber10_8_3: kotlin.Double

expect val NSFoundationVersionNumber10_8_4: kotlin.Double

expect val NSFoundationVersionNumber10_9_2: kotlin.Double

expect val NSGlobalDomain: kotlin.String

expect val NSGregorianCalendar: kotlin.String

expect val NSHPUXOperatingSystem: kotlin.UInt

expect val NSHebrewCalendar: kotlin.String

expect val NSISO8601Calendar: kotlin.String

expect val NSIndianCalendar: kotlin.String

expect val NSIntHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSIntMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSIntMapValueCallBacks: platform.Foundation.NSMapTableValueCallBacks

expect val NSIntegerHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSIntegerMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSIntegerMapValueCallBacks: platform.Foundation.NSMapTableValueCallBacks

expect val NSIslamicCalendar: kotlin.String

expect val NSIslamicCivilCalendar: kotlin.String

expect val NSItemProviderErrorDomain: kotlin.String

expect val NSItemProviderPreferredImageSizeKey: kotlin.String

expect val NSJapaneseCalendar: kotlin.String

expect val NSKeyedArchiveRootObjectKey: kotlin.String

expect val NSLoadedClasses: kotlin.String

expect val NSMACHOperatingSystem: kotlin.UInt

expect val NSMetadataItemAcquisitionMakeKey: kotlin.String

expect val NSMetadataItemAcquisitionModelKey: kotlin.String

expect val NSMetadataItemAlbumKey: kotlin.String

expect val NSMetadataItemAltitudeKey: kotlin.String

expect val NSMetadataItemApertureKey: kotlin.String

expect val NSMetadataItemAppleLoopDescriptorsKey: kotlin.String

expect val NSMetadataItemAppleLoopsKeyFilterTypeKey: kotlin.String

expect val NSMetadataItemAppleLoopsLoopModeKey: kotlin.String

expect val NSMetadataItemAppleLoopsRootKeyKey: kotlin.String

expect val NSMetadataItemApplicationCategoriesKey: kotlin.String

expect val NSMetadataItemAttributeChangeDateKey: kotlin.String

expect val NSMetadataItemAudiencesKey: kotlin.String

expect val NSMetadataItemAudioBitRateKey: kotlin.String

expect val NSMetadataItemAudioChannelCountKey: kotlin.String

expect val NSMetadataItemAudioEncodingApplicationKey: kotlin.String

expect val NSMetadataItemAudioSampleRateKey: kotlin.String

expect val NSMetadataItemAudioTrackNumberKey: kotlin.String

expect val NSMetadataItemAuthorAddressesKey: kotlin.String

expect val NSMetadataItemAuthorEmailAddressesKey: kotlin.String

expect val NSMetadataItemAuthorsKey: kotlin.String

expect val NSMetadataItemBitsPerSampleKey: kotlin.String

expect val NSMetadataItemCFBundleIdentifierKey: kotlin.String

expect val NSMetadataItemCameraOwnerKey: kotlin.String

expect val NSMetadataItemCityKey: kotlin.String

expect val NSMetadataItemCodecsKey: kotlin.String

expect val NSMetadataItemColorSpaceKey: kotlin.String

expect val NSMetadataItemCommentKey: kotlin.String

expect val NSMetadataItemComposerKey: kotlin.String

expect val NSMetadataItemContactKeywordsKey: kotlin.String

expect val NSMetadataItemContentCreationDateKey: kotlin.String

expect val NSMetadataItemContentModificationDateKey: kotlin.String

expect val NSMetadataItemContentTypeKey: kotlin.String

expect val NSMetadataItemContentTypeTreeKey: kotlin.String

expect val NSMetadataItemContributorsKey: kotlin.String

expect val NSMetadataItemCopyrightKey: kotlin.String

expect val NSMetadataItemCountryKey: kotlin.String

expect val NSMetadataItemCoverageKey: kotlin.String

expect val NSMetadataItemCreatorKey: kotlin.String

expect val NSMetadataItemDateAddedKey: kotlin.String

expect val NSMetadataItemDeliveryTypeKey: kotlin.String

expect val NSMetadataItemDescriptionKey: kotlin.String

expect val NSMetadataItemDirectorKey: kotlin.String

expect val NSMetadataItemDisplayNameKey: kotlin.String

expect val NSMetadataItemDownloadedDateKey: kotlin.String

expect val NSMetadataItemDueDateKey: kotlin.String

expect val NSMetadataItemDurationSecondsKey: kotlin.String

expect val NSMetadataItemEXIFGPSVersionKey: kotlin.String

expect val NSMetadataItemEXIFVersionKey: kotlin.String

expect val NSMetadataItemEditorsKey: kotlin.String

expect val NSMetadataItemEmailAddressesKey: kotlin.String

expect val NSMetadataItemEncodingApplicationsKey: kotlin.String

expect val NSMetadataItemExecutableArchitecturesKey: kotlin.String

expect val NSMetadataItemExecutablePlatformKey: kotlin.String

expect val NSMetadataItemExposureModeKey: kotlin.String

expect val NSMetadataItemExposureProgramKey: kotlin.String

expect val NSMetadataItemExposureTimeSecondsKey: kotlin.String

expect val NSMetadataItemExposureTimeStringKey: kotlin.String

expect val NSMetadataItemFNumberKey: kotlin.String

expect val NSMetadataItemFSContentChangeDateKey: kotlin.String

expect val NSMetadataItemFSCreationDateKey: kotlin.String

expect val NSMetadataItemFSNameKey: kotlin.String

expect val NSMetadataItemFSSizeKey: kotlin.String

expect val NSMetadataItemFinderCommentKey: kotlin.String

expect val NSMetadataItemFlashOnOffKey: kotlin.String

expect val NSMetadataItemFocalLength35mmKey: kotlin.String

expect val NSMetadataItemFocalLengthKey: kotlin.String

expect val NSMetadataItemFontsKey: kotlin.String

expect val NSMetadataItemGPSAreaInformationKey: kotlin.String

expect val NSMetadataItemGPSDOPKey: kotlin.String

expect val NSMetadataItemGPSDateStampKey: kotlin.String

expect val NSMetadataItemGPSDestBearingKey: kotlin.String

expect val NSMetadataItemGPSDestDistanceKey: kotlin.String

expect val NSMetadataItemGPSDestLatitudeKey: kotlin.String

expect val NSMetadataItemGPSDestLongitudeKey: kotlin.String

expect val NSMetadataItemGPSDifferentalKey: kotlin.String

expect val NSMetadataItemGPSMapDatumKey: kotlin.String

expect val NSMetadataItemGPSMeasureModeKey: kotlin.String

expect val NSMetadataItemGPSProcessingMethodKey: kotlin.String

expect val NSMetadataItemGPSStatusKey: kotlin.String

expect val NSMetadataItemGPSTrackKey: kotlin.String

expect val NSMetadataItemGenreKey: kotlin.String

expect val NSMetadataItemHasAlphaChannelKey: kotlin.String

expect val NSMetadataItemHeadlineKey: kotlin.String

expect val NSMetadataItemISOSpeedKey: kotlin.String

expect val NSMetadataItemIdentifierKey: kotlin.String

expect val NSMetadataItemImageDirectionKey: kotlin.String

expect val NSMetadataItemInformationKey: kotlin.String

expect val NSMetadataItemInstantMessageAddressesKey: kotlin.String

expect val NSMetadataItemInstructionsKey: kotlin.String

expect val NSMetadataItemIsApplicationManagedKey: kotlin.String

expect val NSMetadataItemIsGeneralMIDISequenceKey: kotlin.String

expect val NSMetadataItemIsLikelyJunkKey: kotlin.String

expect val NSMetadataItemIsUbiquitousKey: kotlin.String

expect val NSMetadataItemKeySignatureKey: kotlin.String

expect val NSMetadataItemKeywordsKey: kotlin.String

expect val NSMetadataItemKindKey: kotlin.String

expect val NSMetadataItemLanguagesKey: kotlin.String

expect val NSMetadataItemLastUsedDateKey: kotlin.String

expect val NSMetadataItemLatitudeKey: kotlin.String

expect val NSMetadataItemLayerNamesKey: kotlin.String

expect val NSMetadataItemLensModelKey: kotlin.String

expect val NSMetadataItemLongitudeKey: kotlin.String

expect val NSMetadataItemLyricistKey: kotlin.String

expect val NSMetadataItemMaxApertureKey: kotlin.String

expect val NSMetadataItemMediaTypesKey: kotlin.String

expect val NSMetadataItemMeteringModeKey: kotlin.String

expect val NSMetadataItemMusicalGenreKey: kotlin.String

expect val NSMetadataItemMusicalInstrumentCategoryKey: kotlin.String

expect val NSMetadataItemMusicalInstrumentNameKey: kotlin.String

expect val NSMetadataItemNamedLocationKey: kotlin.String

expect val NSMetadataItemNumberOfPagesKey: kotlin.String

expect val NSMetadataItemOrganizationsKey: kotlin.String

expect val NSMetadataItemOrientationKey: kotlin.String

expect val NSMetadataItemOriginalFormatKey: kotlin.String

expect val NSMetadataItemOriginalSourceKey: kotlin.String

expect val NSMetadataItemPageHeightKey: kotlin.String

expect val NSMetadataItemPageWidthKey: kotlin.String

expect val NSMetadataItemParticipantsKey: kotlin.String

expect val NSMetadataItemPathKey: kotlin.String

expect val NSMetadataItemPerformersKey: kotlin.String

expect val NSMetadataItemPhoneNumbersKey: kotlin.String

expect val NSMetadataItemPixelCountKey: kotlin.String

expect val NSMetadataItemPixelHeightKey: kotlin.String

expect val NSMetadataItemPixelWidthKey: kotlin.String

expect val NSMetadataItemProducerKey: kotlin.String

expect val NSMetadataItemProfileNameKey: kotlin.String

expect val NSMetadataItemProjectsKey: kotlin.String

expect val NSMetadataItemPublishersKey: kotlin.String

expect val NSMetadataItemRecipientAddressesKey: kotlin.String

expect val NSMetadataItemRecipientEmailAddressesKey: kotlin.String

expect val NSMetadataItemRecipientsKey: kotlin.String

expect val NSMetadataItemRecordingDateKey: kotlin.String

expect val NSMetadataItemRecordingYearKey: kotlin.String

expect val NSMetadataItemRedEyeOnOffKey: kotlin.String

expect val NSMetadataItemResolutionHeightDPIKey: kotlin.String

expect val NSMetadataItemResolutionWidthDPIKey: kotlin.String

expect val NSMetadataItemRightsKey: kotlin.String

expect val NSMetadataItemSecurityMethodKey: kotlin.String

expect val NSMetadataItemSpeedKey: kotlin.String

expect val NSMetadataItemStarRatingKey: kotlin.String

expect val NSMetadataItemStateOrProvinceKey: kotlin.String

expect val NSMetadataItemStreamableKey: kotlin.String

expect val NSMetadataItemSubjectKey: kotlin.String

expect val NSMetadataItemTempoKey: kotlin.String

expect val NSMetadataItemTextContentKey: kotlin.String

expect val NSMetadataItemThemeKey: kotlin.String

expect val NSMetadataItemTimeSignatureKey: kotlin.String

expect val NSMetadataItemTimestampKey: kotlin.String

expect val NSMetadataItemTitleKey: kotlin.String

expect val NSMetadataItemTotalBitRateKey: kotlin.String

expect val NSMetadataItemURLKey: kotlin.String

expect val NSMetadataItemVersionKey: kotlin.String

expect val NSMetadataItemVideoBitRateKey: kotlin.String

expect val NSMetadataItemWhereFromsKey: kotlin.String

expect val NSMetadataItemWhiteBalanceKey: kotlin.String

expect val NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope: kotlin.String

expect val NSMetadataQueryIndexedLocalComputerScope: kotlin.String

expect val NSMetadataQueryIndexedNetworkScope: kotlin.String

expect val NSMetadataQueryLocalComputerScope: kotlin.String

expect val NSMetadataQueryNetworkScope: kotlin.String

expect val NSMetadataQueryResultContentRelevanceAttribute: kotlin.String

expect val NSMetadataQueryUbiquitousDataScope: kotlin.String

expect val NSMetadataQueryUbiquitousDocumentsScope: kotlin.String

expect val NSMetadataQueryUpdateAddedItemsKey: kotlin.String

expect val NSMetadataQueryUpdateChangedItemsKey: kotlin.String

expect val NSMetadataQueryUpdateRemovedItemsKey: kotlin.String

expect val NSMetadataQueryUserHomeScope: kotlin.String

expect val NSMetadataUbiquitousItemContainerDisplayNameKey: kotlin.String

expect val NSMetadataUbiquitousItemDownloadRequestedKey: kotlin.String

expect val NSMetadataUbiquitousItemDownloadingErrorKey: kotlin.String

expect val NSMetadataUbiquitousItemDownloadingStatusCurrent: kotlin.String

expect val NSMetadataUbiquitousItemDownloadingStatusDownloaded: kotlin.String

expect val NSMetadataUbiquitousItemDownloadingStatusKey: kotlin.String

expect val NSMetadataUbiquitousItemDownloadingStatusNotDownloaded: kotlin.String

expect val NSMetadataUbiquitousItemHasUnresolvedConflictsKey: kotlin.String

expect val NSMetadataUbiquitousItemIsDownloadedKey: kotlin.String

expect val NSMetadataUbiquitousItemIsDownloadingKey: kotlin.String

expect val NSMetadataUbiquitousItemIsExternalDocumentKey: kotlin.String

expect val NSMetadataUbiquitousItemIsSharedKey: kotlin.String

expect val NSMetadataUbiquitousItemIsUploadedKey: kotlin.String

expect val NSMetadataUbiquitousItemIsUploadingKey: kotlin.String

expect val NSMetadataUbiquitousItemPercentDownloadedKey: kotlin.String

expect val NSMetadataUbiquitousItemPercentUploadedKey: kotlin.String

expect val NSMetadataUbiquitousItemURLInLocalContainerKey: kotlin.String

expect val NSMetadataUbiquitousItemUploadingErrorKey: kotlin.String

expect val NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey: kotlin.String

expect val NSMetadataUbiquitousSharedItemCurrentUserRoleKey: kotlin.String

expect val NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey: kotlin.String

expect val NSMetadataUbiquitousSharedItemOwnerNameComponentsKey: kotlin.String

expect val NSMetadataUbiquitousSharedItemPermissionsReadOnly: kotlin.String

expect val NSMetadataUbiquitousSharedItemPermissionsReadWrite: kotlin.String

expect val NSMetadataUbiquitousSharedItemRoleOwner: kotlin.String

expect val NSMetadataUbiquitousSharedItemRoleParticipant: kotlin.String

expect val NSNetServicesErrorCode: kotlin.String

expect val NSNonOwnedPointerHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSNonOwnedPointerMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSNonOwnedPointerMapValueCallBacks: platform.Foundation.NSMapTableValueCallBacks

expect val NSNonOwnedPointerOrNullMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSNonRetainedObjectHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSNonRetainedObjectMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSNonRetainedObjectMapValueCallBacks: platform.Foundation.NSMapTableValueCallBacks

expect val NSOSF1OperatingSystem: kotlin.UInt

expect val NSObjectHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSObjectMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSObjectMapValueCallBacks: platform.Foundation.NSMapTableValueCallBacks

expect val NSOpenStepUnicodeReservedBase: kotlin.UInt

expect val NSOwnedObjectIdentityHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSOwnedPointerHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSOwnedPointerMapKeyCallBacks: platform.Foundation.NSMapTableKeyCallBacks

expect val NSOwnedPointerMapValueCallBacks: platform.Foundation.NSMapTableValueCallBacks

expect val NSPersianCalendar: kotlin.String

expect val NSPersonNameComponentDelimiter: kotlin.String

expect val NSPersonNameComponentFamilyName: kotlin.String

expect val NSPersonNameComponentGivenName: kotlin.String

expect val NSPersonNameComponentKey: kotlin.String

expect val NSPersonNameComponentMiddleName: kotlin.String

expect val NSPersonNameComponentNickname: kotlin.String

expect val NSPersonNameComponentPrefix: kotlin.String

expect val NSPersonNameComponentSuffix: kotlin.String

expect val NSPointerToStructHashCallBacks: platform.Foundation.NSHashTableCallBacks

expect val NSRegistrationDomain: kotlin.String

expect val NSRepublicOfChinaCalendar: kotlin.String

expect val NSSolarisOperatingSystem: kotlin.UInt

expect val NSSunOSOperatingSystem: kotlin.UInt

expect val NSTimeIntervalSince1970: kotlin.Double

expect val NSURLAuthenticationMethodClientCertificate: kotlin.String

expect val NSURLAuthenticationMethodDefault: kotlin.String

expect val NSURLAuthenticationMethodHTMLForm: kotlin.String

expect val NSURLAuthenticationMethodHTTPBasic: kotlin.String

expect val NSURLAuthenticationMethodHTTPDigest: kotlin.String

expect val NSURLAuthenticationMethodNTLM: kotlin.String

expect val NSURLAuthenticationMethodNegotiate: kotlin.String

expect val NSURLAuthenticationMethodServerTrust: kotlin.String

expect val NSURLCredentialStorageRemoveSynchronizableCredentials: kotlin.String

expect val NSURLErrorBackgroundTaskCancelledReasonKey: kotlin.String

expect val NSURLErrorFailingURLErrorKey: kotlin.String

expect val NSURLErrorFailingURLPeerTrustErrorKey: kotlin.String

expect val NSURLErrorFailingURLStringErrorKey: kotlin.String

expect var NSURLFileScheme: kotlin.String

expect val NSURLProtectionSpaceFTP: kotlin.String

expect val NSURLProtectionSpaceFTPProxy: kotlin.String

expect val NSURLProtectionSpaceHTTP: kotlin.String

expect val NSURLProtectionSpaceHTTPProxy: kotlin.String

expect val NSURLProtectionSpaceHTTPS: kotlin.String

expect val NSURLProtectionSpaceHTTPSProxy: kotlin.String

expect val NSURLProtectionSpaceSOCKSProxy: kotlin.String

expect val NSURLSessionDownloadTaskResumeData: kotlin.String

expect val NSURLSessionTaskPriorityDefault: kotlin.Float

expect val NSURLSessionTaskPriorityHigh: kotlin.Float

expect val NSURLSessionTaskPriorityLow: kotlin.Float

expect val NSUbiquitousKeyValueStoreChangeReasonKey: kotlin.String

expect val NSUbiquitousKeyValueStoreChangedKeysKey: kotlin.String

expect val NSUndoManagerGroupIsDiscardableKey: kotlin.String

expect val NSUserActivityTypeBrowsingWeb: kotlin.String

expect val NSWindows95OperatingSystem: kotlin.UInt

expect val NSWindowsNTOperatingSystem: kotlin.UInt

expect val NSWrapCalendarComponents: kotlin.UInt

expect val NS_BigEndian: kotlin.UInt

expect val NS_LittleEndian: kotlin.UInt

expect val NS_UnknownByteOrder: kotlin.UInt

expect var platform.Foundation.NSMutableURLRequest.HTTPBody: platform.Foundation.NSData?

expect val platform.Foundation.NSURLRequest.HTTPBody: platform.Foundation.NSData?

expect var platform.Foundation.NSMutableURLRequest.HTTPBodyStream: platform.Foundation.NSInputStream?

expect val platform.Foundation.NSURLRequest.HTTPBodyStream: platform.Foundation.NSInputStream?

expect var platform.Foundation.NSMutableURLRequest.HTTPMethod: kotlin.String

expect val platform.Foundation.NSURLRequest.HTTPMethod: kotlin.String?

expect var platform.Foundation.NSMutableURLRequest.HTTPShouldHandleCookies: kotlin.Boolean

expect val platform.Foundation.NSURLRequest.HTTPShouldHandleCookies: kotlin.Boolean

expect var platform.Foundation.NSMutableURLRequest.HTTPShouldUsePipelining: kotlin.Boolean

expect val platform.Foundation.NSURLRequest.HTTPShouldUsePipelining: kotlin.Boolean

expect val platform.Foundation.NSLocaleMeta.ISOCountryCodes: kotlin.collections.List<*>

expect val platform.Foundation.NSLocaleMeta.ISOCurrencyCodes: kotlin.collections.List<*>

expect val platform.Foundation.NSLocaleMeta.ISOLanguageCodes: kotlin.collections.List<*>

expect val platform.Foundation.NSTextCheckingResult.URL: platform.Foundation.NSURL?

expect val platform.Foundation.NSURL.URLByDeletingLastPathComponent: platform.Foundation.NSURL?

expect val platform.Foundation.NSURL.URLByDeletingPathExtension: platform.Foundation.NSURL?

expect val platform.Foundation.NSURL.URLByResolvingSymlinksInPath: platform.Foundation.NSURL?

expect val platform.Foundation.NSURL.URLByStandardizingPath: platform.Foundation.NSURL?

expect val platform.Foundation.NSCharacterSetMeta.URLFragmentAllowedCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSCharacterSetMeta.URLHostAllowedCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSCharacterSetMeta.URLPasswordAllowedCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSCharacterSetMeta.URLPathAllowedCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSCharacterSetMeta.URLQueryAllowedCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSCharacterSetMeta.URLUserAllowedCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSTimeZone.abbreviation: kotlin.String?

expect var platform.Foundation.NSTimeZoneMeta.abbreviationDictionary: kotlin.collections.Map<kotlin.Any?, *>

expect val platform.Foundation.NSString.absolutePath: kotlin.Boolean

expect val platform.darwin.NSObjectMeta.accessInstanceVariablesDirectly: kotlin.Boolean

expect val platform.Foundation.NSTextCheckingResult.addressComponents: kotlin.collections.Map<kotlin.Any?, *>?

expect var platform.Foundation.NSMutableURLRequest.allHTTPHeaderFields: kotlin.collections.Map<kotlin.Any?, *>?

expect val platform.Foundation.NSURLRequest.allHTTPHeaderFields: kotlin.collections.Map<kotlin.Any?, *>?

expect val platform.Foundation.NSDictionary.allKeys: kotlin.collections.List<*>

expect val platform.Foundation.NSOrthography.allLanguages: kotlin.collections.List<*>

expect val platform.Foundation.NSEnumerator.allObjects: kotlin.collections.List<*>

expect val platform.Foundation.NSPointerArray.allObjects: kotlin.collections.List<*>

expect val platform.Foundation.NSSet.allObjects: kotlin.collections.List<*>

expect val platform.Foundation.NSOrthography.allScripts: kotlin.collections.List<*>

expect val platform.Foundation.NSDictionary.allValues: kotlin.collections.List<*>

expect val platform.Foundation.NSCoder.allowedClasses: kotlin.collections.Set<*>?

expect val platform.Foundation.NSCoder.allowsKeyedCoding: kotlin.Boolean

expect val platform.Foundation.NSLocale.alternateQuotationBeginDelimiter: kotlin.String

expect val platform.Foundation.NSLocale.alternateQuotationEndDelimiter: kotlin.String

expect val platform.Foundation.NSTextCheckingResult.alternativeStrings: kotlin.collections.List<*>?

expect val platform.Foundation.NSOrderedSet.array: kotlin.collections.List<*>

expect val platform.Foundation.NSScanner.atEnd: kotlin.Boolean

expect val platform.darwin.NSObject.autoContentAccessingProxy: kotlin.Any

expect val platform.Foundation.NSLocaleMeta.autoupdatingCurrentLocale: platform.Foundation.NSLocale

expect val platform.Foundation.NSLocaleMeta.availableLocaleIdentifiers: kotlin.collections.List<*>

expect val platform.Foundation.NSString.boolValue: kotlin.Boolean

expect val platform.Foundation.NSLocale.calendarIdentifier: kotlin.String

expect val platform.Foundation.NSString.capitalizedString: kotlin.String

expect val platform.Foundation.NSURLCredential.certificates: kotlin.collections.List<*>

expect val platform.darwin.NSObject.classForCoder: kotlinx.cinterop.ObjCClass

expect val platform.darwin.NSObject.classForKeyedArchiver: kotlinx.cinterop.ObjCClass?

expect val platform.Foundation.NSLocale.collationIdentifier: kotlin.String?

expect val platform.Foundation.NSLocale.collatorIdentifier: kotlin.String

expect val platform.Foundation.NSLocaleMeta.commonISOCurrencyCodes: kotlin.collections.List<*>

expect val platform.Foundation.NSTextCheckingResult.components: kotlin.collections.Map<kotlin.Any?, *>?

expect val platform.Foundation.NSLocale.countryCode: kotlin.String?

expect val platform.Foundation.NSLocale.currencyCode: kotlin.String?

expect val platform.Foundation.NSLocale.currencySymbol: kotlin.String

expect val platform.Foundation.NSLocaleMeta.currentLocale: platform.Foundation.NSLocale

expect val platform.Foundation.NSTextCheckingResult.date: platform.Foundation.NSDate?

expect val platform.Foundation.NSTimeZone.daylightSavingTime: kotlin.Boolean

expect val platform.Foundation.NSLocale.decimalSeparator: kotlin.String

expect val platform.Foundation.NSNumber.decimalValue: kotlinx.cinterop.CValue<platform.Foundation.NSDecimal>

expect val platform.Foundation.NSCoder.decodingFailurePolicy: platform.Foundation.NSDecodingFailurePolicy

expect val platform.Foundation.NSString.decomposedStringWithCanonicalMapping: kotlin.String

expect val platform.Foundation.NSString.decomposedStringWithCompatibilityMapping: kotlin.String

expect var platform.Foundation.NSTimeZoneMeta.defaultTimeZone: platform.Foundation.NSTimeZone

expect val platform.Foundation.NSArray.description: kotlin.String

expect val platform.Foundation.NSData.description: kotlin.String

expect val platform.Foundation.NSDate.description: kotlin.String

expect val platform.Foundation.NSDictionary.description: kotlin.String

expect val platform.Foundation.NSOrderedSet.description: kotlin.String

expect val platform.Foundation.NSSet.description: kotlin.String

expect val platform.Foundation.NSString.description: kotlin.String

expect val platform.Foundation.NSTimeZone.description: kotlin.String

expect val platform.Foundation.NSDictionary.descriptionInStringsFileFormat: kotlin.String

expect val platform.Foundation.NSDateMeta.distantFuture: platform.Foundation.NSDate

expect val platform.Foundation.NSDateMeta.distantPast: platform.Foundation.NSDate

expect val platform.Foundation.NSURLProtectionSpace.distinguishedNames: kotlin.collections.List<*>?

expect val platform.Foundation.NSOrthography.dominantLanguage: kotlin.String

expect val platform.Foundation.NSString.doubleValue: kotlin.Double

expect val platform.Foundation.NSCoder.error: platform.Foundation.NSError?

expect val platform.Foundation.NSLocale.exemplarCharacterSet: platform.Foundation.NSCharacterSet

expect val platform.Foundation.NSFileHandle.fileDescriptor: kotlin.Int

expect val platform.Foundation.NSFileHandleMeta.fileHandleWithNullDevice: platform.Foundation.NSFileHandle

expect val platform.Foundation.NSFileHandleMeta.fileHandleWithStandardError: platform.Foundation.NSFileHandle

expect val platform.Foundation.NSFileHandleMeta.fileHandleWithStandardInput: platform.Foundation.NSFileHandle

expect val platform.Foundation.NSFileHandleMeta.fileHandleWithStandardOutput: platform.Foundation.NSFileHandle

expect val platform.Foundation.NSArray.firstObject: kotlin.Any?

expect val platform.Foundation.NSOrderedSet.firstObject: kotlin.Any?

expect val platform.Foundation.NSString.floatValue: kotlin.Float

expect val platform.Foundation.NSTextCheckingResult.grammarDetails: kotlin.collections.List<*>?

expect val platform.Foundation.NSLocale.groupingSeparator: kotlin.String

expect val platform.Foundation.NSURLCredential.hasPassword: kotlin.Boolean

expect val platform.Foundation.NSString.intValue: kotlin.Int

expect val platform.Foundation.NSTimeZoneMeta.knownTimeZoneNames: kotlin.collections.List<*>

expect val platform.Foundation.NSLocale.languageCode: kotlin.String

expect val platform.Foundation.NSArray.lastObject: kotlin.Any?

expect val platform.Foundation.NSOrderedSet.lastObject: kotlin.Any?

expect val platform.Foundation.NSString.lastPathComponent: kotlin.String

expect val platform.Foundation.NSURL.lastPathComponent: kotlin.String?

expect val platform.Foundation.NSTimeZoneMeta.localTimeZone: platform.Foundation.NSTimeZone

expect val platform.Foundation.NSLocale.localeIdentifier: kotlin.String

expect val platform.Foundation.NSString.localizedCapitalizedString: kotlin.String

expect val platform.Foundation.NSString.localizedLowercaseString: kotlin.String

expect val platform.Foundation.NSString.localizedUppercaseString: kotlin.String

expect val platform.Foundation.NSString.longLongValue: kotlin.Long

expect val platform.Foundation.NSString.lowercaseString: kotlin.String

expect val platform.Foundation.NSMutableAttributedString.mutableString: kotlin.String

expect val platform.Foundation.NSTimeZone.nextDaylightSavingTimeTransition: platform.Foundation.NSDate?

expect val platform.Foundation.NSValue.nonretainedObjectValue: kotlin.Any?

expect val platform.Foundation.NSTextCheckingResult.orthography: platform.Foundation.NSOrthography?

expect val platform.Foundation.NSURLCredential.password: kotlin.String?

expect val platform.Foundation.NSString.pathComponents: kotlin.collections.List<*>

expect val platform.Foundation.NSURL.pathComponents: kotlin.collections.List<*>?

expect val platform.Foundation.NSString.pathExtension: kotlin.String

expect val platform.Foundation.NSURL.pathExtension: kotlin.String?

expect val platform.Foundation.NSTextCheckingResult.phoneNumber: kotlin.String?

expect val platform.Foundation.NSString.precomposedStringWithCanonicalMapping: kotlin.String

expect val platform.Foundation.NSString.precomposedStringWithCompatibilityMapping: kotlin.String

expect val platform.Foundation.NSLocaleMeta.preferredLanguages: kotlin.collections.List<*>

expect val platform.Foundation.NSXMLParser.publicID: kotlin.String?

expect val platform.Foundation.NSLocale.quotationBeginDelimiter: kotlin.String

expect val platform.Foundation.NSLocale.quotationEndDelimiter: kotlin.String

expect val platform.Foundation.NSValue.rangeValue: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

expect var platform.Foundation.NSFileHandle.readabilityHandler: ((platform.Foundation.NSFileHandle?) -> kotlin.Unit)?

expect val platform.Foundation.NSTextCheckingResult.regularExpression: platform.Foundation.NSRegularExpression?

expect val platform.Foundation.NSTextCheckingResult.replacementString: kotlin.String?

expect val platform.Foundation.NSCoder.requiresSecureCoding: kotlin.Boolean

expect val platform.Foundation.NSOrderedSet.reversedOrderedSet: platform.Foundation.NSOrderedSet

expect val platform.Foundation.NSLocale.scriptCode: kotlin.String?

expect val platform.Foundation.NSOrderedSet.set: kotlin.collections.Set<*>

expect val platform.Foundation.NSArray.sortedArrayHint: platform.Foundation.NSData

expect val platform.Foundation.NSString.stringByAbbreviatingWithTildeInPath: kotlin.String

expect val platform.Foundation.NSString.stringByDeletingLastPathComponent: kotlin.String

expect val platform.Foundation.NSString.stringByDeletingPathExtension: kotlin.String

expect val platform.Foundation.NSString.stringByExpandingTildeInPath: kotlin.String

expect val platform.Foundation.NSString.stringByRemovingPercentEncoding: kotlin.String?

expect val platform.Foundation.NSString.stringByResolvingSymlinksInPath: kotlin.String

expect val platform.Foundation.NSString.stringByStandardizingPath: kotlin.String

expect val platform.Foundation.NSXMLParser.systemID: kotlin.String?

expect val platform.Foundation.NSLocaleMeta.systemLocale: platform.Foundation.NSLocale

expect val platform.Foundation.NSTimeZoneMeta.systemTimeZone: platform.Foundation.NSTimeZone

expect val platform.Foundation.NSCoder.systemVersion: kotlin.UInt

expect val platform.Foundation.NSURLProtocol.task: platform.Foundation.NSURLSessionTask?

expect val platform.Foundation.NSFileManager.temporaryDirectory: platform.Foundation.NSURL

expect val platform.Foundation.NSProcessInfo.thermalState: platform.Foundation.NSProcessInfoThermalState

expect val platform.Foundation.NSTextCheckingResult.timeZone: platform.Foundation.NSTimeZone?

expect val platform.Foundation.NSTimeZoneMeta.timeZoneDataVersion: kotlin.String

expect val platform.Foundation.NSString.uppercaseString: kotlin.String

expect val platform.Foundation.NSURLCredential.user: kotlin.String?

expect val platform.Foundation.NSLocale.usesMetricSystem: kotlin.Boolean

expect val platform.Foundation.NSLocale.variantCode: kotlin.String?

expect var platform.Foundation.NSFileHandle.writeabilityHandler: ((platform.Foundation.NSFileHandle?) -> kotlin.Unit)?

expect fun NSAllHashTableObjects(/*0*/ table: platform.Foundation.NSHashTable): kotlin.collections.List<*>

expect fun NSAllMapTableKeys(/*0*/ table: platform.Foundation.NSMapTable): kotlin.collections.List<*>

expect fun NSAllMapTableValues(/*0*/ table: platform.Foundation.NSMapTable): kotlin.collections.List<*>

expect fun NSClassFromString(/*0*/ aClassName: kotlin.String): kotlinx.cinterop.ObjCClass?

expect fun NSCompareHashTables(/*0*/ table1: platform.Foundation.NSHashTable, /*1*/
                                     table2: platform.Foundation.NSHashTable
): kotlin.Boolean

expect fun NSCompareMapTables(/*0*/ table1: platform.Foundation.NSMapTable, /*1*/
                                    table2: platform.Foundation.NSMapTable
): kotlin.Boolean

expect fun NSConvertHostDoubleToSwapped(/*0*/ x: kotlin.Double): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>

expect fun NSConvertHostFloatToSwapped(/*0*/ x: kotlin.Float): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>

expect fun NSConvertSwappedDoubleToHost(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>): kotlin.Double

expect fun NSConvertSwappedFloatToHost(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>): kotlin.Float

expect fun NSCopyHashTableWithZone(/*0*/ table: platform.Foundation.NSHashTable, /*1*/
                                         zone: kotlinx.cinterop.CValuesRef<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?
): platform.Foundation.NSHashTable

expect fun NSCopyMapTableWithZone(/*0*/ table: platform.Foundation.NSMapTable, /*1*/
                                        zone: kotlinx.cinterop.CValuesRef<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?
): platform.Foundation.NSMapTable

expect fun NSDecimalCompact(/*0*/ number: kotlinx.cinterop.CValuesRef<platform.Foundation.NSDecimal>?)

expect fun NSDecimalCopy(/*0*/ destination: kotlinx.cinterop.CValuesRef<platform.Foundation.NSDecimal>?, /*1*/
                               source: kotlinx.cinterop.CValuesRef<platform.Foundation.NSDecimal>?
)

expect fun NSDecimalIsNotANumber(/*0*/ dcm: kotlinx.cinterop.CValuesRef<platform.Foundation.NSDecimal>?): kotlin.Boolean

expect fun NSDecimalString(/*0*/ dcm: kotlinx.cinterop.CValuesRef<platform.Foundation.NSDecimal>?, /*1*/
                                 locale: kotlin.Any?
): kotlin.String

expect fun NSDefaultMallocZone(): kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?

expect fun NSEndHashTableEnumeration(/*0*/ enumerator: kotlinx.cinterop.CValuesRef<platform.Foundation.NSHashEnumerator>?)

expect fun NSEndMapTableEnumeration(/*0*/ enumerator: kotlinx.cinterop.CValuesRef<platform.Foundation.NSMapEnumerator>?)

expect fun NSEnumerateHashTable(/*0*/ table: platform.Foundation.NSHashTable): kotlinx.cinterop.CValue<platform.Foundation.NSHashEnumerator>

expect fun NSEnumerateMapTable(/*0*/ table: platform.Foundation.NSMapTable): kotlinx.cinterop.CValue<platform.Foundation.NSMapEnumerator>

expect fun NSEqualRanges(/*0*/ range1: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                               range2: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
): kotlin.Boolean

expect fun NSFreeHashTable(/*0*/ table: platform.Foundation.NSHashTable)

expect fun NSFreeMapTable(/*0*/ table: platform.Foundation.NSMapTable)

expect fun NSFullUserName(): kotlin.String

expect fun NSHashInsert(/*0*/ table: platform.Foundation.NSHashTable, /*1*/ pointer: kotlinx.cinterop.CValuesRef<*>?)

expect fun NSHashInsertKnownAbsent(/*0*/ table: platform.Foundation.NSHashTable, /*1*/
                                         pointer: kotlinx.cinterop.CValuesRef<*>?
)

expect fun NSHashRemove(/*0*/ table: platform.Foundation.NSHashTable, /*1*/ pointer: kotlinx.cinterop.CValuesRef<*>?)

expect fun NSHomeDirectory(): kotlin.String

expect fun NSHomeDirectoryForUser(/*0*/ userName: kotlin.String?): kotlin.String?

expect fun NSHostByteOrder(): kotlin.Long

expect fun NSIntersectionRange(/*0*/ range1: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                     range2: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

expect fun NSLog(/*0*/ format: kotlin.String, /*1*/
                       vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/
)

expect fun NSMapInsert(/*0*/ table: platform.Foundation.NSMapTable, /*1*/
                             key: kotlinx.cinterop.CValuesRef<*>?, /*2*/
                             value: kotlinx.cinterop.CValuesRef<*>?
)

expect fun NSMapInsertKnownAbsent(/*0*/ table: platform.Foundation.NSMapTable, /*1*/
                                        key: kotlinx.cinterop.CValuesRef<*>?, /*2*/
                                        value: kotlinx.cinterop.CValuesRef<*>?
)

expect fun NSMapRemove(/*0*/ table: platform.Foundation.NSMapTable, /*1*/ key: kotlinx.cinterop.CValuesRef<*>?)

expect fun NSOpenStepRootDirectory(): kotlin.String

expect fun NSProtocolFromString(/*0*/ namestr: kotlin.String): objcnames.classes.Protocol?

expect fun NSRangeFromString(/*0*/ aString: kotlin.String): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

expect fun NSRecycleZone(/*0*/ zone: kotlinx.cinterop.CValuesRef<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?)

expect fun NSResetHashTable(/*0*/ table: platform.Foundation.NSHashTable)

expect fun NSResetMapTable(/*0*/ table: platform.Foundation.NSMapTable)

expect fun NSSetZoneName(/*0*/ zone: kotlinx.cinterop.CValuesRef<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?, /*1*/
                               name: kotlin.String
)

expect fun NSStringFromClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass): kotlin.String

expect fun NSStringFromHashTable(/*0*/ table: platform.Foundation.NSHashTable): kotlin.String

expect fun NSStringFromMapTable(/*0*/ table: platform.Foundation.NSMapTable): kotlin.String

expect fun NSStringFromProtocol(/*0*/ proto: objcnames.classes.Protocol): kotlin.String

expect fun NSStringFromRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlin.String

expect fun NSStringFromSelector(/*0*/ aSelector: kotlinx.cinterop.CValuesRef<*>?): kotlin.String

expect fun NSSwapBigDoubleToHost(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>): kotlin.Double

expect fun NSSwapBigFloatToHost(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>): kotlin.Float

expect fun NSSwapBigIntToHost(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NSSwapBigLongLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapBigLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapBigShortToHost(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NSSwapDouble(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>

expect fun NSSwapFloat(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>

expect fun NSSwapHostDoubleToBig(/*0*/ x: kotlin.Double): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>

expect fun NSSwapHostDoubleToLittle(/*0*/ x: kotlin.Double): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>

expect fun NSSwapHostFloatToBig(/*0*/ x: kotlin.Float): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>

expect fun NSSwapHostFloatToLittle(/*0*/ x: kotlin.Float): kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>

expect fun NSSwapHostIntToBig(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NSSwapHostIntToLittle(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NSSwapHostLongLongToBig(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapHostLongLongToLittle(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapHostLongToBig(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapHostLongToLittle(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapHostShortToBig(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NSSwapHostShortToLittle(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NSSwapInt(/*0*/ inv: kotlin.UInt): kotlin.UInt

expect fun NSSwapLittleDoubleToHost(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedDouble>): kotlin.Double

expect fun NSSwapLittleFloatToHost(/*0*/ x: kotlinx.cinterop.CValue<platform.Foundation.NSSwappedFloat>): kotlin.Float

expect fun NSSwapLittleIntToHost(/*0*/ x: kotlin.UInt): kotlin.UInt

expect fun NSSwapLittleLongLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapLittleLongToHost(/*0*/ x: kotlin.ULong): kotlin.ULong

expect fun NSSwapLittleShortToHost(/*0*/ x: kotlin.UShort): kotlin.UShort

expect fun NSSwapLong(/*0*/ inv: kotlin.ULong): kotlin.ULong

expect fun NSSwapLongLong(/*0*/ inv: kotlin.ULong): kotlin.ULong

expect fun NSSwapShort(/*0*/ inv: kotlin.UShort): kotlin.UShort

expect fun NSTemporaryDirectory(): kotlin.String

expect fun NSUnionRange(/*0*/ range1: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                              range2: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

expect fun NSUserName(): kotlin.String

expect fun NSZoneFree(/*0*/ zone: kotlinx.cinterop.CValuesRef<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?, /*1*/
                            ptr: kotlinx.cinterop.CValuesRef<*>?
)

expect fun NSZoneFromPointer(/*0*/ ptr: kotlinx.cinterop.CValuesRef<*>?): kotlinx.cinterop.CPointer<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?

expect fun NSZoneName(/*0*/ zone: kotlinx.cinterop.CValuesRef<platform.Foundation.NSZone /* = cnames.structs._NSZone */>?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "HTTPBody", bridge = "objcKniBridge8369")
external expect fun platform.Foundation.NSMutableURLRequest.HTTPBody(): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "HTTPBody", bridge = "objcKniBridge8359")
external expect fun platform.Foundation.NSURLRequest.HTTPBody(): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "HTTPBodyStream", bridge = "objcKniBridge8371")
external expect fun platform.Foundation.NSMutableURLRequest.HTTPBodyStream(): platform.Foundation.NSInputStream?

@kotlinx.cinterop.ObjCMethod(selector = "HTTPBodyStream", bridge = "objcKniBridge8360")
external expect fun platform.Foundation.NSURLRequest.HTTPBodyStream(): platform.Foundation.NSInputStream?

@kotlinx.cinterop.ObjCMethod(selector = "HTTPMethod", bridge = "objcKniBridge8365")
external expect fun platform.Foundation.NSMutableURLRequest.HTTPMethod(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "HTTPMethod", bridge = "objcKniBridge8357")
external expect fun platform.Foundation.NSURLRequest.HTTPMethod(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "HTTPShouldHandleCookies", bridge = "objcKniBridge8373")
external expect fun platform.Foundation.NSMutableURLRequest.HTTPShouldHandleCookies(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "HTTPShouldHandleCookies", bridge = "objcKniBridge8361")
external expect fun platform.Foundation.NSURLRequest.HTTPShouldHandleCookies(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "HTTPShouldUsePipelining", bridge = "objcKniBridge8375")
external expect fun platform.Foundation.NSMutableURLRequest.HTTPShouldUsePipelining(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "HTTPShouldUsePipelining", bridge = "objcKniBridge8362")
external expect fun platform.Foundation.NSURLRequest.HTTPShouldUsePipelining(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "ISOCountryCodes", bridge = "objcKniBridge7971")
external expect fun platform.Foundation.NSLocaleMeta.ISOCountryCodes(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "ISOCurrencyCodes", bridge = "objcKniBridge7972")
external expect fun platform.Foundation.NSLocaleMeta.ISOCurrencyCodes(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "ISOLanguageCodes", bridge = "objcKniBridge7970")
external expect fun platform.Foundation.NSLocaleMeta.ISOLanguageCodes(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "URL", bridge = "objcKniBridge8255")
external expect fun platform.Foundation.NSTextCheckingResult.URL(): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByAppendingPathComponent:", bridge = "objcKniBridge8066")
external expect fun platform.Foundation.NSURL.URLByAppendingPathComponent(/*0*/ pathComponent: kotlin.String): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByAppendingPathComponent:isDirectory:", bridge = "objcKniBridge8067")
external expect fun platform.Foundation.NSURL.URLByAppendingPathComponent(/*0*/ pathComponent: kotlin.String, /*1*/
                                                                                isDirectory: kotlin.Boolean
): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByAppendingPathExtension:", bridge = "objcKniBridge8068")
external expect fun platform.Foundation.NSURL.URLByAppendingPathExtension(/*0*/ pathExtension: kotlin.String): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByDeletingLastPathComponent", bridge = "objcKniBridge8072")
external expect fun platform.Foundation.NSURL.URLByDeletingLastPathComponent(): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByDeletingPathExtension", bridge = "objcKniBridge8073")
external expect fun platform.Foundation.NSURL.URLByDeletingPathExtension(): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByResolvingSymlinksInPath", bridge = "objcKniBridge8075")
external expect fun platform.Foundation.NSURL.URLByResolvingSymlinksInPath(): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLByStandardizingPath", bridge = "objcKniBridge8074")
external expect fun platform.Foundation.NSURL.URLByStandardizingPath(): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "URLFragmentAllowedCharacterSet", bridge = "objcKniBridge8060")
external expect fun platform.Foundation.NSCharacterSetMeta.URLFragmentAllowedCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "URLHostAllowedCharacterSet", bridge = "objcKniBridge8057")
external expect fun platform.Foundation.NSCharacterSetMeta.URLHostAllowedCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "URLPasswordAllowedCharacterSet", bridge = "objcKniBridge8056")
external expect fun platform.Foundation.NSCharacterSetMeta.URLPasswordAllowedCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "URLPathAllowedCharacterSet", bridge = "objcKniBridge8058")
external expect fun platform.Foundation.NSCharacterSetMeta.URLPathAllowedCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "URLQueryAllowedCharacterSet", bridge = "objcKniBridge8059")
external expect fun platform.Foundation.NSCharacterSetMeta.URLQueryAllowedCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "URLUserAllowedCharacterSet", bridge = "objcKniBridge8055")
external expect fun platform.Foundation.NSCharacterSetMeta.URLUserAllowedCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "abbreviation", bridge = "objcKniBridge8319")
external expect fun platform.Foundation.NSTimeZone.abbreviation(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "abbreviationDictionary", bridge = "objcKniBridge8308")
external expect fun platform.Foundation.NSTimeZoneMeta.abbreviationDictionary(): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "acceptConnectionInBackgroundAndNotify", bridge = "objcKniBridge8025")
external expect fun platform.Foundation.NSFileHandle.acceptConnectionInBackgroundAndNotify()

@kotlinx.cinterop.ObjCMethod(selector = "acceptConnectionInBackgroundAndNotifyForModes:", bridge = "objcKniBridge8024")
external expect fun platform.Foundation.NSFileHandle.acceptConnectionInBackgroundAndNotifyForModes(/*0*/ modes: kotlin.collections.List<*>?)

@kotlinx.cinterop.ObjCMethod(selector = "accessInstanceVariablesDirectly", bridge = "objcKniBridge8191")
external expect fun platform.darwin.NSObjectMeta.accessInstanceVariablesDirectly(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "addAttributes:range:", bridge = "objcKniBridge7920")
external expect fun platform.Foundation.NSMutableAttributedString.addAttributes(/*0*/ attrs: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                                                                      range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
)

@kotlinx.cinterop.ObjCMethod(selector = "addEntriesFromDictionary:", bridge = "objcKniBridge7737")
external expect fun platform.Foundation.NSMutableDictionary.addEntriesFromDictionary(/*0*/ otherDictionary: kotlin.collections.Map<kotlin.Any?, *>)

@kotlinx.cinterop.ObjCMethod(selector = "addObject:", bridge = "objcKniBridge8149")
external expect fun platform.Foundation.NSMutableOrderedSet.addObject(/*0*/ `object`: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "addObjectsFromArray:", bridge = "objcKniBridge7538")
external expect fun platform.Foundation.NSMutableArray.addObjectsFromArray(/*0*/ otherArray: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "addObjectsFromArray:", bridge = "objcKniBridge8151")
external expect fun platform.Foundation.NSMutableOrderedSet.addObjectsFromArray(/*0*/ array: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "addObjectsFromArray:", bridge = "objcKniBridge7777")
external expect fun platform.Foundation.NSMutableSet.addObjectsFromArray(/*0*/ array: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "addValue:forHTTPHeaderField:", bridge = "objcKniBridge8364")
external expect fun platform.Foundation.NSMutableURLRequest.addValue(/*0*/ value: kotlin.String, /*1*/
                                                                           forHTTPHeaderField: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "addressCheckingResultWithRange:components:", bridge = "objcKniBridge8267")
external expect fun platform.Foundation.NSTextCheckingResultMeta.addressCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                      components: kotlin.collections.Map<kotlin.Any?, *>
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "addressComponents", bridge = "objcKniBridge8261")
external expect fun platform.Foundation.NSTextCheckingResult.addressComponents(): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "allHTTPHeaderFields", bridge = "objcKniBridge8367")
external expect fun platform.Foundation.NSMutableURLRequest.allHTTPHeaderFields(): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "allHTTPHeaderFields", bridge = "objcKniBridge8358")
external expect fun platform.Foundation.NSURLRequest.allHTTPHeaderFields(): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "allKeys", bridge = "objcKniBridge7714")
external expect fun platform.Foundation.NSDictionary.allKeys(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allKeysForObject:", bridge = "objcKniBridge7698")
external expect fun platform.Foundation.NSDictionary.allKeysForObject(/*0*/ anObject: kotlin.Any?): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allLanguages", bridge = "objcKniBridge8235")
external expect fun platform.Foundation.NSOrthography.allLanguages(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allObjects", bridge = "objcKniBridge7455")
external expect fun platform.Foundation.NSEnumerator.allObjects(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allObjects", bridge = "objcKniBridge8239")
external expect fun platform.Foundation.NSPointerArray.allObjects(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allObjects", bridge = "objcKniBridge7765")
external expect fun platform.Foundation.NSSet.allObjects(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allScripts", bridge = "objcKniBridge8234")
external expect fun platform.Foundation.NSOrthography.allScripts(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allValues", bridge = "objcKniBridge7715")
external expect fun platform.Foundation.NSDictionary.allValues(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "allowedClasses", bridge = "objcKniBridge7855")
external expect fun platform.Foundation.NSCoder.allowedClasses(): kotlin.collections.Set<*>?

@kotlinx.cinterop.ObjCMethod(selector = "allowsKeyedCoding", bridge = "objcKniBridge7853")
external expect fun platform.Foundation.NSCoder.allowsKeyedCoding(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "alternateQuotationBeginDelimiter", bridge = "objcKniBridge7955")
external expect fun platform.Foundation.NSLocale.alternateQuotationBeginDelimiter(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "alternateQuotationEndDelimiter", bridge = "objcKniBridge7956")
external expect fun platform.Foundation.NSLocale.alternateQuotationEndDelimiter(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "alternativeStrings", bridge = "objcKniBridge8257")
external expect fun platform.Foundation.NSTextCheckingResult.alternativeStrings(): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "anyObject", bridge = "objcKniBridge7750")
external expect fun platform.Foundation.NSSet.anyObject(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "appendAttributedString:", bridge = "objcKniBridge7924")
external expect fun platform.Foundation.NSMutableAttributedString.appendAttributedString(/*0*/ attrString: platform.Foundation.NSAttributedString)

@kotlinx.cinterop.ObjCMethod(selector = "appendData:", bridge = "objcKniBridge7898")
external expect fun platform.Foundation.NSMutableData.appendData(/*0*/ other: platform.Foundation.NSData)

@kotlinx.cinterop.ObjCMethod(selector = "array", bridge = "objcKniBridge7521")
external expect fun platform.Foundation.NSArrayMeta.array(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "array", bridge = "objcKniBridge8126")
external expect fun platform.Foundation.NSOrderedSet.array(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "arrayByAddingObject:", bridge = "objcKniBridge7481")
external expect fun platform.Foundation.NSArray.arrayByAddingObject(/*0*/ anObject: kotlin.Any?): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "arrayByAddingObjectsFromArray:", bridge = "objcKniBridge7482")
external expect fun platform.Foundation.NSArray.arrayByAddingObjectsFromArray(/*0*/ otherArray: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithArray:", bridge = "objcKniBridge7525")
external expect fun platform.Foundation.NSArrayMeta.arrayWithArray(/*0*/ array: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithContentsOfFile:", bridge = "objcKniBridge7532")
external expect fun platform.Foundation.NSArrayMeta.arrayWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithContentsOfFile:", bridge = "objcKniBridge7560")
external expect fun platform.Foundation.NSMutableArrayMeta.arrayWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.collections.MutableList<kotlin.Any?>?

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithContentsOfURL:", bridge = "objcKniBridge7533")
external expect fun platform.Foundation.NSArrayMeta.arrayWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithContentsOfURL:error:", bridge = "objcKniBridge7530")
external expect fun platform.Foundation.NSArrayMeta.arrayWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithContentsOfURL:", bridge = "objcKniBridge7561")
external expect fun platform.Foundation.NSMutableArrayMeta.arrayWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.MutableList<kotlin.Any?>?

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithObject:", bridge = "objcKniBridge7522")
external expect fun platform.Foundation.NSArrayMeta.arrayWithObject(/*0*/ anObject: kotlin.Any?): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "arrayWithObjects:", bridge = "objcKniBridge7524")
external expect fun platform.Foundation.NSArrayMeta.arrayWithObjects(/*0*/ firstObj: kotlin.Any?): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "attributedSubstringFromRange:", bridge = "objcKniBridge7909")
external expect fun platform.Foundation.NSAttributedString.attributedSubstringFromRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSAttributedString

@kotlinx.cinterop.ObjCMethod(selector = "autoContentAccessingProxy", bridge = "objcKniBridge7454")
external expect fun platform.darwin.NSObject.autoContentAccessingProxy(): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "automaticallyNotifiesObserversForKey:", bridge = "objcKniBridge8223")
external expect fun platform.darwin.NSObjectMeta.automaticallyNotifiesObserversForKey(/*0*/ key: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "autoupdatingCurrentLocale", bridge = "objcKniBridge7958")
external expect fun platform.Foundation.NSLocaleMeta.autoupdatingCurrentLocale(): platform.Foundation.NSLocale

@kotlinx.cinterop.ObjCMethod(selector = "availableLocaleIdentifiers", bridge = "objcKniBridge7969")
external expect fun platform.Foundation.NSLocaleMeta.availableLocaleIdentifiers(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "awakeAfterUsingCoder:", bridge = "objcKniBridge7452")
external expect fun platform.darwin.NSObject.awakeAfterUsingCoder(/*0*/ aDecoder: platform.Foundation.NSCoder): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "backgroundSessionConfiguration:", bridge = "objcKniBridge8396")
external expect fun platform.Foundation.NSURLSessionConfigurationMeta.backgroundSessionConfiguration(/*0*/ identifier: kotlin.String): platform.Foundation.NSURLSessionConfiguration

@kotlinx.cinterop.ObjCMethod(selector = "base64Encoding", bridge = "objcKniBridge7896")
external expect fun platform.Foundation.NSData.base64Encoding(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "beginEditing", bridge = "objcKniBridge7927")
external expect fun platform.Foundation.NSMutableAttributedString.beginEditing()

@kotlinx.cinterop.ObjCMethod(selector = "boolValue", bridge = "objcKniBridge7659")
external expect fun platform.Foundation.NSString.boolValue(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "calendarIdentifier", bridge = "objcKniBridge7945")
external expect fun platform.Foundation.NSLocale.calendarIdentifier(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "canInitWithTask:", bridge = "objcKniBridge8353")
external expect fun platform.Foundation.NSURLProtocolMeta.canInitWithTask(/*0*/ task: platform.Foundation.NSURLSessionTask): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "cancelPerformSelectorsWithTarget:", bridge = "objcKniBridge8009")
external expect fun platform.Foundation.NSRunLoop.cancelPerformSelectorsWithTarget(/*0*/ target: kotlin.Any)

@kotlinx.cinterop.ObjCMethod(selector = "cancelPreviousPerformRequestsWithTarget:", bridge = "objcKniBridge8006")
external expect fun platform.darwin.NSObjectMeta.cancelPreviousPerformRequestsWithTarget(/*0*/ aTarget: kotlin.Any)

@kotlinx.cinterop.ObjCMethod(selector = "canonicalLanguageIdentifierFromString:", bridge = "objcKniBridge7964")
external expect fun platform.Foundation.NSLocaleMeta.canonicalLanguageIdentifierFromString(/*0*/ string: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "canonicalLocaleIdentifierFromString:", bridge = "objcKniBridge7963")
external expect fun platform.Foundation.NSLocaleMeta.canonicalLocaleIdentifierFromString(/*0*/ string: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "capitalizedString", bridge = "objcKniBridge7662")
external expect fun platform.Foundation.NSString.capitalizedString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "capitalizedStringWithLocale:", bridge = "objcKniBridge7600")
external expect fun platform.Foundation.NSString.capitalizedStringWithLocale(/*0*/ locale: platform.Foundation.NSLocale?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "certificates", bridge = "objcKniBridge8343")
external expect fun platform.Foundation.NSURLCredential.certificates(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "checkPromisedItemIsReachableAndReturnError:", bridge = "objcKniBridge8054")
external expect fun platform.Foundation.NSURL.checkPromisedItemIsReachableAndReturnError(/*0*/ error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "classFallbacksForKeyedArchiver", bridge = "objcKniBridge8227")
external expect fun platform.darwin.NSObjectMeta.classFallbacksForKeyedArchiver(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "classForCoder", bridge = "objcKniBridge7453")
external expect fun platform.darwin.NSObject.classForCoder(): kotlinx.cinterop.ObjCClass

@kotlinx.cinterop.ObjCMethod(selector = "classForKeyedArchiver", bridge = "objcKniBridge8228")
external expect fun platform.darwin.NSObject.classForKeyedArchiver(): kotlinx.cinterop.ObjCClass?

@kotlinx.cinterop.ObjCMethod(selector = "classForKeyedUnarchiver", bridge = "objcKniBridge8229")
external expect fun platform.darwin.NSObjectMeta.classForKeyedUnarchiver(): kotlinx.cinterop.ObjCClass

@kotlinx.cinterop.ObjCMethod(selector = "collationIdentifier", bridge = "objcKniBridge7946")
external expect fun platform.Foundation.NSLocale.collationIdentifier(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "collatorIdentifier", bridge = "objcKniBridge7952")
external expect fun platform.Foundation.NSLocale.collatorIdentifier(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "commonISOCurrencyCodes", bridge = "objcKniBridge7973")
external expect fun platform.Foundation.NSLocaleMeta.commonISOCurrencyCodes(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "components", bridge = "objcKniBridge8254")
external expect fun platform.Foundation.NSTextCheckingResult.components(): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "componentsFromLocaleIdentifier:", bridge = "objcKniBridge7961")
external expect fun platform.Foundation.NSLocaleMeta.componentsFromLocaleIdentifier(/*0*/ string: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "componentsJoinedByString:", bridge = "objcKniBridge7483")
external expect fun platform.Foundation.NSArray.componentsJoinedByString(/*0*/ separator: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "componentsSeparatedByCharactersInSet:", bridge = "objcKniBridge7617")
external expect fun platform.Foundation.NSString.componentsSeparatedByCharactersInSet(/*0*/ separator: platform.Foundation.NSCharacterSet): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "componentsSeparatedByString:", bridge = "objcKniBridge7616")
external expect fun platform.Foundation.NSString.componentsSeparatedByString(/*0*/ separator: kotlin.String): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "containsObject:", bridge = "objcKniBridge7484")
external expect fun platform.Foundation.NSArray.containsObject(/*0*/ anObject: kotlin.Any?): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "containsObject:", bridge = "objcKniBridge8101")
external expect fun platform.Foundation.NSOrderedSet.containsObject(/*0*/ `object`: kotlin.Any?): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "containsObject:", bridge = "objcKniBridge7751")
external expect fun platform.Foundation.NSSet.containsObject(/*0*/ anObject: kotlin.Any?): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "containsString:", bridge = "objcKniBridge7583")
external expect fun platform.Foundation.NSString.containsString(/*0*/ str: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "containsValueForKey:", bridge = "objcKniBridge7834")
external expect fun platform.Foundation.NSCoder.containsValueForKey(/*0*/ key: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(
    selector = "correctionCheckingResultWithRange:replacementString:",
    bridge = "objcKniBridge8272"
)
external expect fun platform.Foundation.NSTextCheckingResultMeta.correctionCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                         replacementString: kotlin.String
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(
    selector = "correctionCheckingResultWithRange:replacementString:alternativeStrings:",
    bridge = "objcKniBridge8273"
)
external expect fun platform.Foundation.NSTextCheckingResultMeta.correctionCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                         replacementString: kotlin.String, /*2*/
                                                                                                         alternativeStrings: kotlin.collections.List<*>
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "countryCode", bridge = "objcKniBridge7941")
external expect fun platform.Foundation.NSLocale.countryCode(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "currencyCode", bridge = "objcKniBridge7951")
external expect fun platform.Foundation.NSLocale.currencyCode(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "currencySymbol", bridge = "objcKniBridge7950")
external expect fun platform.Foundation.NSLocale.currencySymbol(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "currentLocale", bridge = "objcKniBridge7959")
external expect fun platform.Foundation.NSLocaleMeta.currentLocale(): platform.Foundation.NSLocale

@kotlinx.cinterop.ObjCMethod(selector = "dashCheckingResultWithRange:replacementString:", bridge = "objcKniBridge8270")
external expect fun platform.Foundation.NSTextCheckingResultMeta.dashCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                   replacementString: kotlin.String
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "data", bridge = "objcKniBridge7870")
external expect fun platform.Foundation.NSDataMeta.data(): platform.Foundation.NSData

@kotlinx.cinterop.ObjCMethod(selector = "dataTaskWithRequest:completionHandler:", bridge = "objcKniBridge8389")
external expect fun platform.Foundation.NSURLSession.dataTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                                               completionHandler: (platform.Foundation.NSData?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionDataTask

@kotlinx.cinterop.ObjCMethod(selector = "dataTaskWithURL:completionHandler:", bridge = "objcKniBridge8390")
external expect fun platform.Foundation.NSURLSession.dataTaskWithURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                           completionHandler: (platform.Foundation.NSData?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionDataTask

@kotlinx.cinterop.ObjCMethod(selector = "dataWithContentsOfFile:", bridge = "objcKniBridge7876")
external expect fun platform.Foundation.NSDataMeta.dataWithContentsOfFile(/*0*/ path: kotlin.String): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "dataWithContentsOfMappedFile:", bridge = "objcKniBridge7893")
external expect fun platform.Foundation.NSDataMeta.dataWithContentsOfMappedFile(/*0*/ path: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "dataWithContentsOfURL:", bridge = "objcKniBridge7877")
external expect fun platform.Foundation.NSDataMeta.dataWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "dataWithData:", bridge = "objcKniBridge7887")
external expect fun platform.Foundation.NSDataMeta.dataWithData(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSData

@kotlinx.cinterop.ObjCMethod(selector = "date", bridge = "objcKniBridge7802")
external expect fun platform.Foundation.NSDateMeta.date(): platform.Foundation.NSDate

@kotlinx.cinterop.ObjCMethod(selector = "date", bridge = "objcKniBridge8251")
external expect fun platform.Foundation.NSTextCheckingResult.date(): platform.Foundation.NSDate?

@kotlinx.cinterop.ObjCMethod(selector = "dateCheckingResultWithRange:date:", bridge = "objcKniBridge8265")
external expect fun platform.Foundation.NSTextCheckingResultMeta.dateCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                   date: platform.Foundation.NSDate
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "decimalSeparator", bridge = "objcKniBridge7948")
external expect fun platform.Foundation.NSLocale.decimalSeparator(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "decimalValue", bridge = "objcKniBridge7994")
external expect fun platform.Foundation.NSNumber.decimalValue(): kotlinx.cinterop.CValue<platform.Foundation.NSDecimal>

@kotlinx.cinterop.ObjCMethod(selector = "decodeBoolForKey:", bridge = "objcKniBridge7837")
external expect fun platform.Foundation.NSCoder.decodeBoolForKey(/*0*/ key: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "decodeDoubleForKey:", bridge = "objcKniBridge7842")
external expect fun platform.Foundation.NSCoder.decodeDoubleForKey(/*0*/ key: kotlin.String): kotlin.Double

@kotlinx.cinterop.ObjCMethod(selector = "decodeFloatForKey:", bridge = "objcKniBridge7841")
external expect fun platform.Foundation.NSCoder.decodeFloatForKey(/*0*/ key: kotlin.String): kotlin.Float

@kotlinx.cinterop.ObjCMethod(selector = "decodeIntForKey:", bridge = "objcKniBridge7838")
external expect fun platform.Foundation.NSCoder.decodeIntForKey(/*0*/ key: kotlin.String): kotlin.Int

@kotlinx.cinterop.ObjCMethod(selector = "decodeObject", bridge = "objcKniBridge7820")
external expect fun platform.Foundation.NSCoder.decodeObject(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeObjectForKey:", bridge = "objcKniBridge7835")
external expect fun platform.Foundation.NSCoder.decodeObjectForKey(/*0*/ key: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeObjectOfClass:forKey:", bridge = "objcKniBridge7846")
external expect fun platform.Foundation.NSCoder.decodeObjectOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass, /*1*/
                                                                          forKey: kotlin.String
): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeObjectOfClasses:forKey:", bridge = "objcKniBridge7848")
external expect fun platform.Foundation.NSCoder.decodeObjectOfClasses(/*0*/ classes: kotlin.collections.Set<*>?, /*1*/
                                                                            forKey: kotlin.String
): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodePropertyListForKey:", bridge = "objcKniBridge7850")
external expect fun platform.Foundation.NSCoder.decodePropertyListForKey(/*0*/ key: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeTopLevelObjectAndReturnError:", bridge = "objcKniBridge7821")
external expect fun platform.Foundation.NSCoder.decodeTopLevelObjectAndReturnError(/*0*/ error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeTopLevelObjectForKey:error:", bridge = "objcKniBridge7836")
external expect fun platform.Foundation.NSCoder.decodeTopLevelObjectForKey(/*0*/ key: kotlin.String, /*1*/
                                                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeTopLevelObjectOfClass:forKey:error:", bridge = "objcKniBridge7847")
external expect fun platform.Foundation.NSCoder.decodeTopLevelObjectOfClass(/*0*/ aClass: kotlinx.cinterop.ObjCClass, /*1*/
                                                                                  forKey: kotlin.String, /*2*/
                                                                                  error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodeTopLevelObjectOfClasses:forKey:error:", bridge = "objcKniBridge7849")
external expect fun platform.Foundation.NSCoder.decodeTopLevelObjectOfClasses(/*0*/ classes: kotlin.collections.Set<*>?, /*1*/
                                                                                    forKey: kotlin.String, /*2*/
                                                                                    error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "decodingFailurePolicy", bridge = "objcKniBridge7856")
external expect fun platform.Foundation.NSCoder.decodingFailurePolicy(): platform.Foundation.NSDecodingFailurePolicy

@kotlinx.cinterop.ObjCMethod(selector = "decomposedStringWithCanonicalMapping", bridge = "objcKniBridge7671")
external expect fun platform.Foundation.NSString.decomposedStringWithCanonicalMapping(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "decomposedStringWithCompatibilityMapping", bridge = "objcKniBridge7673")
external expect fun platform.Foundation.NSString.decomposedStringWithCompatibilityMapping(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "defaultOrthographyForLanguage:", bridge = "objcKniBridge8232")
external expect fun platform.Foundation.NSOrthographyMeta.defaultOrthographyForLanguage(/*0*/ language: kotlin.String): platform.Foundation.NSOrthography

@kotlinx.cinterop.ObjCMethod(selector = "defaultTimeZone", bridge = "objcKniBridge8312")
external expect fun platform.Foundation.NSTimeZoneMeta.defaultTimeZone(): platform.Foundation.NSTimeZone

@kotlinx.cinterop.ObjCMethod(selector = "deleteCharactersInRange:", bridge = "objcKniBridge7925")
external expect fun platform.Foundation.NSMutableAttributedString.deleteCharactersInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge7517")
external expect fun platform.Foundation.NSArray.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge7869")
external expect fun platform.Foundation.NSData.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge7800")
external expect fun platform.Foundation.NSDate.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge7716")
external expect fun platform.Foundation.NSDictionary.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge8128")
external expect fun platform.Foundation.NSOrderedSet.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge7766")
external expect fun platform.Foundation.NSSet.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge7675")
external expect fun platform.Foundation.NSString.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "description", bridge = "objcKniBridge8323")
external expect fun platform.Foundation.NSTimeZone.description(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "descriptionInStringsFileFormat", bridge = "objcKniBridge7717")
external expect fun platform.Foundation.NSDictionary.descriptionInStringsFileFormat(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "descriptionWithLocale:", bridge = "objcKniBridge7485")
external expect fun platform.Foundation.NSArray.descriptionWithLocale(/*0*/ locale: kotlin.Any?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "descriptionWithLocale:", bridge = "objcKniBridge7797")
external expect fun platform.Foundation.NSDate.descriptionWithLocale(/*0*/ locale: kotlin.Any?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "descriptionWithLocale:", bridge = "objcKniBridge7699")
external expect fun platform.Foundation.NSDictionary.descriptionWithLocale(/*0*/ locale: kotlin.Any?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "descriptionWithLocale:", bridge = "objcKniBridge8121")
external expect fun platform.Foundation.NSOrderedSet.descriptionWithLocale(/*0*/ locale: kotlin.Any?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "descriptionWithLocale:", bridge = "objcKniBridge7752")
external expect fun platform.Foundation.NSSet.descriptionWithLocale(/*0*/ locale: kotlin.Any?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "dictionary", bridge = "objcKniBridge7725")
external expect fun platform.Foundation.NSDictionaryMeta.dictionary(): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithContentsOfFile:", bridge = "objcKniBridge7719")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithContentsOfFile:", bridge = "objcKniBridge7743")
external expect fun platform.Foundation.NSMutableDictionaryMeta.dictionaryWithContentsOfFile(/*0*/ path: kotlin.String): platform.Foundation.NSMutableDictionary?

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithContentsOfURL:", bridge = "objcKniBridge7720")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithContentsOfURL:error:", bridge = "objcKniBridge7736")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithContentsOfURL:", bridge = "objcKniBridge7744")
external expect fun platform.Foundation.NSMutableDictionaryMeta.dictionaryWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSMutableDictionary?

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithDictionary:", bridge = "objcKniBridge7729")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithDictionary(/*0*/ dict: kotlin.collections.Map<kotlin.Any?, *>): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithObject:forKey:", bridge = "objcKniBridge7726")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithObject(/*0*/ `object`: kotlin.Any?, /*1*/
                                                                                    forKey: platform.Foundation.NSCopyingProtocol?
): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithObjects:forKeys:", bridge = "objcKniBridge7730")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithObjects(/*0*/ objects: kotlin.collections.List<*>, /*1*/
                                                                                     forKeys: kotlin.collections.List<*>
): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithObjectsAndKeys:", bridge = "objcKniBridge7728")
external expect fun platform.Foundation.NSDictionaryMeta.dictionaryWithObjectsAndKeys(/*0*/ firstObject: kotlin.Any): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithSharedKeySet:", bridge = "objcKniBridge7748")
external expect fun platform.Foundation.NSMutableDictionaryMeta.dictionaryWithSharedKeySet(/*0*/ keyset: kotlin.Any): platform.Foundation.NSMutableDictionary

@kotlinx.cinterop.ObjCMethod(selector = "dictionaryWithValuesForKeys:", bridge = "objcKniBridge8189")
external expect fun platform.darwin.NSObject.dictionaryWithValuesForKeys(/*0*/ keys: kotlin.collections.List<*>): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "didChangeValueForKey:", bridge = "objcKniBridge8217")
external expect fun platform.darwin.NSObject.didChangeValueForKey(/*0*/ key: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "distantFuture", bridge = "objcKniBridge7810")
external expect fun platform.Foundation.NSDateMeta.distantFuture(): platform.Foundation.NSDate

@kotlinx.cinterop.ObjCMethod(selector = "distantPast", bridge = "objcKniBridge7811")
external expect fun platform.Foundation.NSDateMeta.distantPast(): platform.Foundation.NSDate

@kotlinx.cinterop.ObjCMethod(selector = "distinguishedNames", bridge = "objcKniBridge8346")
external expect fun platform.Foundation.NSURLProtectionSpace.distinguishedNames(): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "dominantLanguage", bridge = "objcKniBridge8233")
external expect fun platform.Foundation.NSOrthography.dominantLanguage(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "dominantLanguageForScript:", bridge = "objcKniBridge8231")
external expect fun platform.Foundation.NSOrthography.dominantLanguageForScript(/*0*/ script: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "doubleValue", bridge = "objcKniBridge7654")
external expect fun platform.Foundation.NSString.doubleValue(): kotlin.Double

@kotlinx.cinterop.ObjCMethod(selector = "downloadTaskWithRequest:completionHandler:", bridge = "objcKniBridge8393")
external expect fun platform.Foundation.NSURLSession.downloadTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                                                   completionHandler: (platform.Foundation.NSURL?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionDownloadTask

@kotlinx.cinterop.ObjCMethod(selector = "downloadTaskWithResumeData:completionHandler:", bridge = "objcKniBridge8395")
external expect fun platform.Foundation.NSURLSession.downloadTaskWithResumeData(/*0*/ resumeData: platform.Foundation.NSData, /*1*/
                                                                                      completionHandler: (platform.Foundation.NSURL?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionDownloadTask

@kotlinx.cinterop.ObjCMethod(selector = "downloadTaskWithURL:completionHandler:", bridge = "objcKniBridge8394")
external expect fun platform.Foundation.NSURLSession.downloadTaskWithURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                               completionHandler: (platform.Foundation.NSURL?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionDownloadTask

@kotlinx.cinterop.ObjCMethod(selector = "earlierDate:", bridge = "objcKniBridge7793")
external expect fun platform.Foundation.NSDate.earlierDate(/*0*/ anotherDate: platform.Foundation.NSDate): platform.Foundation.NSDate

@kotlinx.cinterop.ObjCMethod(selector = "encodeBool:forKey:", bridge = "objcKniBridge7827")
external expect fun platform.Foundation.NSCoder.encodeBool(/*0*/ value: kotlin.Boolean, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "encodeBycopyObject:", bridge = "objcKniBridge7814")
external expect fun platform.Foundation.NSCoder.encodeBycopyObject(/*0*/ anObject: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "encodeByrefObject:", bridge = "objcKniBridge7815")
external expect fun platform.Foundation.NSCoder.encodeByrefObject(/*0*/ anObject: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "encodeConditionalObject:", bridge = "objcKniBridge7816")
external expect fun platform.Foundation.NSCoder.encodeConditionalObject(/*0*/ `object`: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "encodeConditionalObject:forKey:", bridge = "objcKniBridge7826")
external expect fun platform.Foundation.NSCoder.encodeConditionalObject(/*0*/ `object`: kotlin.Any?, /*1*/
                                                                              forKey: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "encodeDouble:forKey:", bridge = "objcKniBridge7832")
external expect fun platform.Foundation.NSCoder.encodeDouble(/*0*/ value: kotlin.Double, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "encodeFloat:forKey:", bridge = "objcKniBridge7831")
external expect fun platform.Foundation.NSCoder.encodeFloat(/*0*/ value: kotlin.Float, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "encodeInt:forKey:", bridge = "objcKniBridge7828")
external expect fun platform.Foundation.NSCoder.encodeInt(/*0*/ value: kotlin.Int, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "encodeObject:", bridge = "objcKniBridge7812")
external expect fun platform.Foundation.NSCoder.encodeObject(/*0*/ `object`: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "encodeObject:forKey:", bridge = "objcKniBridge7825")
external expect fun platform.Foundation.NSCoder.encodeObject(/*0*/ `object`: kotlin.Any?, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "encodeRootObject:", bridge = "objcKniBridge7813")
external expect fun platform.Foundation.NSCoder.encodeRootObject(/*0*/ rootObject: kotlin.Any)

@kotlinx.cinterop.ObjCMethod(selector = "endActivity:", bridge = "objcKniBridge8241")
external expect fun platform.Foundation.NSProcessInfo.endActivity(/*0*/ activity: platform.darwin.NSObjectProtocol)

@kotlinx.cinterop.ObjCMethod(selector = "endEditing", bridge = "objcKniBridge7928")
external expect fun platform.Foundation.NSMutableAttributedString.endEditing()

@kotlinx.cinterop.ObjCMethod(selector = "error", bridge = "objcKniBridge7857")
external expect fun platform.Foundation.NSCoder.error(): platform.Foundation.NSError?

@kotlinx.cinterop.ObjCMethod(selector = "escapedTemplateForString:", bridge = "objcKniBridge8285")
external expect fun platform.Foundation.NSRegularExpressionMeta.escapedTemplateForString(/*0*/ string: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "exemplarCharacterSet", bridge = "objcKniBridge7944")
external expect fun platform.Foundation.NSLocale.exemplarCharacterSet(): platform.Foundation.NSCharacterSet

@kotlinx.cinterop.ObjCMethod(selector = "failWithError:", bridge = "objcKniBridge7851")
external expect fun platform.Foundation.NSCoder.failWithError(/*0*/ error: platform.Foundation.NSError)

@kotlinx.cinterop.ObjCMethod(selector = "fileCreationDate", bridge = "objcKniBridge8092")
external expect fun platform.Foundation.NSDictionary.fileCreationDate(): platform.Foundation.NSDate?

@kotlinx.cinterop.ObjCMethod(selector = "fileDescriptor", bridge = "objcKniBridge8033")
external expect fun platform.Foundation.NSFileHandle.fileDescriptor(): kotlin.Int

@kotlinx.cinterop.ObjCMethod(selector = "fileExtensionHidden", bridge = "objcKniBridge8087")
external expect fun platform.Foundation.NSDictionary.fileExtensionHidden(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "fileGroupOwnerAccountID", bridge = "objcKniBridge8094")
external expect fun platform.Foundation.NSDictionary.fileGroupOwnerAccountID(): platform.Foundation.NSNumber?

@kotlinx.cinterop.ObjCMethod(selector = "fileGroupOwnerAccountName", bridge = "objcKniBridge8084")
external expect fun platform.Foundation.NSDictionary.fileGroupOwnerAccountName(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleForReadingAtPath:", bridge = "objcKniBridge8010")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleForReadingAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSFileHandle?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleForReadingFromURL:error:", bridge = "objcKniBridge8013")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleForReadingFromURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                           error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): platform.Foundation.NSFileHandle?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleForUpdatingAtPath:", bridge = "objcKniBridge8012")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleForUpdatingAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSFileHandle?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleForUpdatingURL:error:", bridge = "objcKniBridge8015")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleForUpdatingURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                        error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): platform.Foundation.NSFileHandle?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleForWritingAtPath:", bridge = "objcKniBridge8011")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleForWritingAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSFileHandle?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleForWritingToURL:error:", bridge = "objcKniBridge8014")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleForWritingToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                         error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): platform.Foundation.NSFileHandle?

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleWithNullDevice", bridge = "objcKniBridge8019")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleWithNullDevice(): platform.Foundation.NSFileHandle

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleWithStandardError", bridge = "objcKniBridge8018")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleWithStandardError(): platform.Foundation.NSFileHandle

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleWithStandardInput", bridge = "objcKniBridge8016")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleWithStandardInput(): platform.Foundation.NSFileHandle

@kotlinx.cinterop.ObjCMethod(selector = "fileHandleWithStandardOutput", bridge = "objcKniBridge8017")
external expect fun platform.Foundation.NSFileHandleMeta.fileHandleWithStandardOutput(): platform.Foundation.NSFileHandle

@kotlinx.cinterop.ObjCMethod(selector = "fileIsAppendOnly", bridge = "objcKniBridge8091")
external expect fun platform.Foundation.NSDictionary.fileIsAppendOnly(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "fileIsImmutable", bridge = "objcKniBridge8090")
external expect fun platform.Foundation.NSDictionary.fileIsImmutable(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "fileManager:willProcessPath:", bridge = "objcKniBridge8078")
external expect fun platform.darwin.NSObject.fileManager(/*0*/ fm: platform.Foundation.NSFileManager, /*1*/
                                                               willProcessPath: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "fileManager:shouldProceedAfterError:", bridge = "objcKniBridge8077")
external expect fun platform.darwin.NSObject.fileManager(/*0*/ fm: platform.Foundation.NSFileManager, /*1*/
                                                               shouldProceedAfterError: kotlin.collections.Map<kotlin.Any?, *>
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "fileModificationDate", bridge = "objcKniBridge8080")
external expect fun platform.Foundation.NSDictionary.fileModificationDate(): platform.Foundation.NSDate?

@kotlinx.cinterop.ObjCMethod(selector = "fileOwnerAccountID", bridge = "objcKniBridge8093")
external expect fun platform.Foundation.NSDictionary.fileOwnerAccountID(): platform.Foundation.NSNumber?

@kotlinx.cinterop.ObjCMethod(selector = "fileOwnerAccountName", bridge = "objcKniBridge8083")
external expect fun platform.Foundation.NSDictionary.fileOwnerAccountName(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "fileSize", bridge = "objcKniBridge8079")
external expect fun platform.Foundation.NSDictionary.fileSize(): kotlin.ULong

@kotlinx.cinterop.ObjCMethod(selector = "fileType", bridge = "objcKniBridge8081")
external expect fun platform.Foundation.NSDictionary.fileType(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "fileURLWithPathComponents:", bridge = "objcKniBridge8065")
external expect fun platform.Foundation.NSURLMeta.fileURLWithPathComponents(/*0*/ components: kotlin.collections.List<*>): platform.Foundation.NSURL?

@kotlinx.cinterop.ObjCMethod(selector = "filterUsingPredicate:", bridge = "objcKniBridge8382")
external expect fun platform.Foundation.NSMutableArray.filterUsingPredicate(/*0*/ predicate: platform.Foundation.NSPredicate)

@kotlinx.cinterop.ObjCMethod(selector = "filterUsingPredicate:", bridge = "objcKniBridge8386")
external expect fun platform.Foundation.NSMutableOrderedSet.filterUsingPredicate(/*0*/ p: platform.Foundation.NSPredicate)

@kotlinx.cinterop.ObjCMethod(selector = "filterUsingPredicate:", bridge = "objcKniBridge8384")
external expect fun platform.Foundation.NSMutableSet.filterUsingPredicate(/*0*/ predicate: platform.Foundation.NSPredicate)

@kotlinx.cinterop.ObjCMethod(selector = "filteredArrayUsingPredicate:", bridge = "objcKniBridge8381")
external expect fun platform.Foundation.NSArray.filteredArrayUsingPredicate(/*0*/ predicate: platform.Foundation.NSPredicate): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "filteredOrderedSetUsingPredicate:", bridge = "objcKniBridge8385")
external expect fun platform.Foundation.NSOrderedSet.filteredOrderedSetUsingPredicate(/*0*/ p: platform.Foundation.NSPredicate): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "filteredSetUsingPredicate:", bridge = "objcKniBridge8383")
external expect fun platform.Foundation.NSSet.filteredSetUsingPredicate(/*0*/ predicate: platform.Foundation.NSPredicate): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "firstObject", bridge = "objcKniBridge7518")
external expect fun platform.Foundation.NSArray.firstObject(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "firstObject", bridge = "objcKniBridge8123")
external expect fun platform.Foundation.NSOrderedSet.firstObject(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "firstObjectCommonWithArray:", bridge = "objcKniBridge7487")
external expect fun platform.Foundation.NSArray.firstObjectCommonWithArray(/*0*/ otherArray: kotlin.collections.List<*>): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "floatValue", bridge = "objcKniBridge7655")
external expect fun platform.Foundation.NSString.floatValue(): kotlin.Float

@kotlinx.cinterop.ObjCMethod(selector = "getCachedResponseForDataTask:completionHandler:", bridge = "objcKniBridge8331")
external expect fun platform.Foundation.NSURLCache.getCachedResponseForDataTask(/*0*/ dataTask: platform.Foundation.NSURLSessionDataTask, /*1*/
                                                                                      completionHandler: (platform.Foundation.NSCachedURLResponse?) -> kotlin.Unit
)

@kotlinx.cinterop.ObjCMethod(selector = "getCookiesForTask:completionHandler:", bridge = "objcKniBridge8096")
external expect fun platform.Foundation.NSHTTPCookieStorage.getCookiesForTask(/*0*/ task: platform.Foundation.NSURLSessionTask, /*1*/
                                                                                    completionHandler: (kotlin.collections.List<*>?) -> kotlin.Unit
)

@kotlinx.cinterop.ObjCMethod(
    selector = "getCredentialsForProtectionSpace:task:completionHandler:",
    bridge = "objcKniBridge8348"
)
external expect fun platform.Foundation.NSURLCredentialStorage.getCredentialsForProtectionSpace(/*0*/ protectionSpace: platform.Foundation.NSURLProtectionSpace, /*1*/
                                                                                                      task: platform.Foundation.NSURLSessionTask, /*2*/
                                                                                                      completionHandler: (kotlin.collections.Map<kotlin.Any?, *>?) -> kotlin.Unit
)

@kotlinx.cinterop.ObjCMethod(
    selector = "getDefaultCredentialForProtectionSpace:task:completionHandler:",
    bridge = "objcKniBridge8351"
)
external expect fun platform.Foundation.NSURLCredentialStorage.getDefaultCredentialForProtectionSpace(/*0*/ space: platform.Foundation.NSURLProtectionSpace, /*1*/
                                                                                                            task: platform.Foundation.NSURLSessionTask, /*2*/
                                                                                                            completionHandler: (platform.Foundation.NSURLCredential?) -> kotlin.Unit
)

@kotlinx.cinterop.ObjCMethod(selector = "getObjects:", bridge = "objcKniBridge7531")
external expect fun platform.Foundation.NSArray.getObjects(/*0*/ objects: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?)

@kotlinx.cinterop.ObjCMethod(selector = "getObjects:range:", bridge = "objcKniBridge7488")
external expect fun platform.Foundation.NSArray.getObjects(/*0*/ objects: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                                                 range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
)

@kotlinx.cinterop.ObjCMethod(selector = "getObjects:andKeys:", bridge = "objcKniBridge7718")
external expect fun platform.Foundation.NSDictionary.getObjects(/*0*/ objects: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                                                      andKeys: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?
)

@kotlinx.cinterop.ObjCMethod(selector = "getObjects:range:", bridge = "objcKniBridge8098")
external expect fun platform.Foundation.NSOrderedSet.getObjects(/*0*/ objects: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                                                      range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
)

@kotlinx.cinterop.ObjCMethod(selector = "grammarCheckingResultWithRange:details:", bridge = "objcKniBridge8264")
external expect fun platform.Foundation.NSTextCheckingResultMeta.grammarCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                      details: kotlin.collections.List<*>
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "grammarDetails", bridge = "objcKniBridge8250")
external expect fun platform.Foundation.NSTextCheckingResult.grammarDetails(): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "groupingSeparator", bridge = "objcKniBridge7949")
external expect fun platform.Foundation.NSLocale.groupingSeparator(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "hasPassword", bridge = "objcKniBridge8339")
external expect fun platform.Foundation.NSURLCredential.hasPassword(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "hasPrefix:", bridge = "objcKniBridge7580")
external expect fun platform.Foundation.NSString.hasPrefix(/*0*/ str: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "hasSuffix:", bridge = "objcKniBridge7581")
external expect fun platform.Foundation.NSString.hasSuffix(/*0*/ str: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "init", bridge = "objcKniBridge7786")
external expect fun platform.Foundation.NSNotification.init(): platform.Foundation.NSNotification

@kotlinx.cinterop.ObjCMethod(selector = "initToFileAtPath:append:", bridge = "objcKniBridge8297")
external expect fun platform.Foundation.NSOutputStream.initToFileAtPath(/*0*/ path: kotlin.String, /*1*/
                                                                              append: kotlin.Boolean
): platform.Foundation.NSOutputStream?

@kotlinx.cinterop.ObjCMethod(selector = "initWithArray:", bridge = "objcKniBridge7527")
external expect fun platform.Foundation.NSArray.initWithArray(/*0*/ array: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithArray:copyItems:", bridge = "objcKniBridge7528")
external expect fun platform.Foundation.NSArray.initWithArray(/*0*/ array: kotlin.collections.List<*>, /*1*/
                                                                    copyItems: kotlin.Boolean
): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithArray:", bridge = "objcKniBridge8144")
external expect fun platform.Foundation.NSOrderedSet.initWithArray(/*0*/ array: kotlin.collections.List<*>): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithArray:copyItems:", bridge = "objcKniBridge8145")
external expect fun platform.Foundation.NSOrderedSet.initWithArray(/*0*/ set: kotlin.collections.List<*>, /*1*/
                                                                         copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithArray:range:copyItems:", bridge = "objcKniBridge8146")
external expect fun platform.Foundation.NSOrderedSet.initWithArray(/*0*/ set: kotlin.collections.List<*>, /*1*/
                                                                         range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*2*/
                                                                         copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithArray:", bridge = "objcKniBridge7776")
external expect fun platform.Foundation.NSSet.initWithArray(/*0*/ array: kotlin.collections.List<*>): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithAttributedString:", bridge = "objcKniBridge7915")
external expect fun platform.Foundation.NSAttributedString.initWithAttributedString(/*0*/ attrStr: platform.Foundation.NSAttributedString): platform.Foundation.NSAttributedString

@kotlinx.cinterop.ObjCMethod(selector = "initWithBase64Encoding:", bridge = "objcKniBridge7895")
external expect fun platform.Foundation.NSData.initWithBase64Encoding(/*0*/ base64String: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfFile:", bridge = "objcKniBridge7534")
external expect fun platform.Foundation.NSArray.initWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfFile:", bridge = "objcKniBridge7884")
external expect fun platform.Foundation.NSData.initWithContentsOfFile(/*0*/ path: kotlin.String): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfFile:", bridge = "objcKniBridge7721")
external expect fun platform.Foundation.NSDictionary.initWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfFile:", bridge = "objcKniBridge7562")
external expect fun platform.Foundation.NSMutableArray.initWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.collections.MutableList<kotlin.Any?>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfFile:", bridge = "objcKniBridge7745")
external expect fun platform.Foundation.NSMutableDictionary.initWithContentsOfFile(/*0*/ path: kotlin.String): platform.Foundation.NSMutableDictionary?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfFile:", bridge = "objcKniBridge7688")
external expect fun platform.Foundation.NSString.initWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfMappedFile:", bridge = "objcKniBridge7894")
external expect fun platform.Foundation.NSData.initWithContentsOfMappedFile(/*0*/ path: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge7535")
external expect fun platform.Foundation.NSArray.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:error:", bridge = "objcKniBridge7529")
external expect fun platform.Foundation.NSArray.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                            error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge7885")
external expect fun platform.Foundation.NSData.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge7722")
external expect fun platform.Foundation.NSDictionary.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:error:", bridge = "objcKniBridge7735")
external expect fun platform.Foundation.NSDictionary.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge7563")
external expect fun platform.Foundation.NSMutableArray.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.collections.MutableList<kotlin.Any?>?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge7746")
external expect fun platform.Foundation.NSMutableDictionary.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSMutableDictionary?

@kotlinx.cinterop.ObjCMethod(selector = "initWithContentsOfURL:", bridge = "objcKniBridge7689")
external expect fun platform.Foundation.NSString.initWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "initWithData:", bridge = "objcKniBridge7886")
external expect fun platform.Foundation.NSData.initWithData(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSData

@kotlinx.cinterop.ObjCMethod(selector = "initWithDictionary:", bridge = "objcKniBridge7732")
external expect fun platform.Foundation.NSDictionary.initWithDictionary(/*0*/ otherDictionary: kotlin.collections.Map<kotlin.Any?, *>): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "initWithDictionary:copyItems:", bridge = "objcKniBridge7733")
external expect fun platform.Foundation.NSDictionary.initWithDictionary(/*0*/ otherDictionary: kotlin.collections.Map<kotlin.Any?, *>, /*1*/
                                                                              copyItems: kotlin.Boolean
): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "initWithFileAtPath:", bridge = "objcKniBridge8293")
external expect fun platform.Foundation.NSInputStream.initWithFileAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSInputStream?

@kotlinx.cinterop.ObjCMethod(selector = "initWithFileDescriptor:", bridge = "objcKniBridge8032")
external expect fun platform.Foundation.NSFileHandle.initWithFileDescriptor(/*0*/ fd: kotlin.Int): platform.Foundation.NSFileHandle

@kotlinx.cinterop.ObjCMethod(selector = "initWithFormat:", bridge = "objcKniBridge7631")
external expect fun platform.Foundation.NSString.initWithFormat(/*0*/ format: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "initWithFormat:locale:", bridge = "objcKniBridge7633")
external expect fun platform.Foundation.NSString.initWithFormat(/*0*/ format: kotlin.String, /*1*/
                                                                      locale: kotlin.Any?
): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "initWithName:", bridge = "objcKniBridge8326")
external expect fun platform.Foundation.NSTimeZone.initWithName(/*0*/ tzName: kotlin.String): platform.Foundation.NSTimeZone?

@kotlinx.cinterop.ObjCMethod(selector = "initWithName:data:", bridge = "objcKniBridge8327")
external expect fun platform.Foundation.NSTimeZone.initWithName(/*0*/ tzName: kotlin.String, /*1*/
                                                                      data: platform.Foundation.NSData?
): platform.Foundation.NSTimeZone?

@kotlinx.cinterop.ObjCMethod(selector = "initWithObject:", bridge = "objcKniBridge8139")
external expect fun platform.Foundation.NSOrderedSet.initWithObject(/*0*/ `object`: kotlin.Any?): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithObjects:", bridge = "objcKniBridge7526")
external expect fun platform.Foundation.NSArray.initWithObjects(/*0*/ firstObj: kotlin.Any?): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithObjects:forKeys:", bridge = "objcKniBridge7734")
external expect fun platform.Foundation.NSDictionary.initWithObjects(/*0*/ objects: kotlin.collections.List<*>, /*1*/
                                                                           forKeys: kotlin.collections.List<*>
): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "initWithObjects:", bridge = "objcKniBridge8140")
external expect fun platform.Foundation.NSOrderedSet.initWithObjects(/*0*/ firstObj: kotlin.Any?): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithObjects:", bridge = "objcKniBridge7773")
external expect fun platform.Foundation.NSSet.initWithObjects(/*0*/ firstObj: kotlin.Any?): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithObjectsAndKeys:", bridge = "objcKniBridge7731")
external expect fun platform.Foundation.NSDictionary.initWithObjectsAndKeys(/*0*/ firstObject: kotlin.Any): kotlin.collections.Map<kotlin.Any?, *>

@kotlinx.cinterop.ObjCMethod(selector = "initWithOrderedSet:", bridge = "objcKniBridge8141")
external expect fun platform.Foundation.NSOrderedSet.initWithOrderedSet(/*0*/ set: platform.Foundation.NSOrderedSet): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithOrderedSet:copyItems:", bridge = "objcKniBridge8142")
external expect fun platform.Foundation.NSOrderedSet.initWithOrderedSet(/*0*/ set: platform.Foundation.NSOrderedSet, /*1*/
                                                                              copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithOrderedSet:range:copyItems:", bridge = "objcKniBridge8143")
external expect fun platform.Foundation.NSOrderedSet.initWithOrderedSet(/*0*/ set: platform.Foundation.NSOrderedSet, /*1*/
                                                                              range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*2*/
                                                                              copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithSet:", bridge = "objcKniBridge8147")
external expect fun platform.Foundation.NSOrderedSet.initWithSet(/*0*/ set: kotlin.collections.Set<*>): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithSet:copyItems:", bridge = "objcKniBridge8148")
external expect fun platform.Foundation.NSOrderedSet.initWithSet(/*0*/ set: kotlin.collections.Set<*>, /*1*/
                                                                       copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "initWithSet:", bridge = "objcKniBridge7774")
external expect fun platform.Foundation.NSSet.initWithSet(/*0*/ set: kotlin.collections.Set<*>): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithSet:copyItems:", bridge = "objcKniBridge7775")
external expect fun platform.Foundation.NSSet.initWithSet(/*0*/ set: kotlin.collections.Set<*>, /*1*/
                                                                copyItems: kotlin.Boolean
): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "initWithString:", bridge = "objcKniBridge7913")
external expect fun platform.Foundation.NSAttributedString.initWithString(/*0*/ str: kotlin.String): platform.Foundation.NSAttributedString

@kotlinx.cinterop.ObjCMethod(selector = "initWithString:attributes:", bridge = "objcKniBridge7914")
external expect fun platform.Foundation.NSAttributedString.initWithString(/*0*/ str: kotlin.String, /*1*/
                                                                                attributes: kotlin.collections.Map<kotlin.Any?, *>?
): platform.Foundation.NSAttributedString

@kotlinx.cinterop.ObjCMethod(selector = "initWithString:", bridge = "objcKniBridge7630")
external expect fun platform.Foundation.NSString.initWithString(/*0*/ aString: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "initWithTask:cachedResponse:client:", bridge = "objcKniBridge8354")
external expect fun platform.Foundation.NSURLProtocol.initWithTask(/*0*/ task: platform.Foundation.NSURLSessionTask, /*1*/
                                                                         cachedResponse: platform.Foundation.NSCachedURLResponse?, /*2*/
                                                                         client: platform.Foundation.NSURLProtocolClientProtocol?
): platform.Foundation.NSURLProtocol

@kotlinx.cinterop.ObjCMethod(selector = "inputStreamWithData:", bridge = "objcKniBridge8294")
external expect fun platform.Foundation.NSInputStreamMeta.inputStreamWithData(/*0*/ data: platform.Foundation.NSData): platform.Foundation.NSInputStream?

@kotlinx.cinterop.ObjCMethod(selector = "inputStreamWithFileAtPath:", bridge = "objcKniBridge8295")
external expect fun platform.Foundation.NSInputStreamMeta.inputStreamWithFileAtPath(/*0*/ path: kotlin.String): platform.Foundation.NSInputStream?

@kotlinx.cinterop.ObjCMethod(selector = "inputStreamWithURL:", bridge = "objcKniBridge8296")
external expect fun platform.Foundation.NSInputStreamMeta.inputStreamWithURL(/*0*/ url: platform.Foundation.NSURL): platform.Foundation.NSInputStream?

@kotlinx.cinterop.ObjCMethod(selector = "insertObjects:atIndexes:", bridge = "objcKniBridge7553")
external expect fun platform.Foundation.NSMutableArray.insertObjects(/*0*/ objects: kotlin.collections.List<*>, /*1*/
                                                                           atIndexes: platform.Foundation.NSIndexSet
)

@kotlinx.cinterop.ObjCMethod(selector = "insertObjects:atIndexes:", bridge = "objcKniBridge8154")
external expect fun platform.Foundation.NSMutableOrderedSet.insertObjects(/*0*/ objects: kotlin.collections.List<*>, /*1*/
                                                                                atIndexes: platform.Foundation.NSIndexSet
)

@kotlinx.cinterop.ObjCMethod(selector = "intValue", bridge = "objcKniBridge7656")
external expect fun platform.Foundation.NSString.intValue(): kotlin.Int

@kotlinx.cinterop.ObjCMethod(selector = "intersectOrderedSet:", bridge = "objcKniBridge8164")
external expect fun platform.Foundation.NSMutableOrderedSet.intersectOrderedSet(/*0*/ other: platform.Foundation.NSOrderedSet)

@kotlinx.cinterop.ObjCMethod(selector = "intersectSet:", bridge = "objcKniBridge8167")
external expect fun platform.Foundation.NSMutableOrderedSet.intersectSet(/*0*/ other: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(selector = "intersectSet:", bridge = "objcKniBridge7778")
external expect fun platform.Foundation.NSMutableSet.intersectSet(/*0*/ otherSet: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(selector = "intersectsOrderedSet:", bridge = "objcKniBridge8102")
external expect fun platform.Foundation.NSOrderedSet.intersectsOrderedSet(/*0*/ other: platform.Foundation.NSOrderedSet): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "intersectsSet:", bridge = "objcKniBridge8103")
external expect fun platform.Foundation.NSOrderedSet.intersectsSet(/*0*/ set: kotlin.collections.Set<*>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "intersectsSet:", bridge = "objcKniBridge7753")
external expect fun platform.Foundation.NSSet.intersectsSet(/*0*/ otherSet: kotlin.collections.Set<*>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isAbsolutePath", bridge = "objcKniBridge8041")
external expect fun platform.Foundation.NSString.isAbsolutePath(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isAtEnd", bridge = "objcKniBridge7991")
external expect fun platform.Foundation.NSScanner.isAtEnd(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isDaylightSavingTime", bridge = "objcKniBridge8320")
external expect fun platform.Foundation.NSTimeZone.isDaylightSavingTime(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToArray:", bridge = "objcKniBridge7493")
external expect fun platform.Foundation.NSArray.isEqualToArray(/*0*/ otherArray: kotlin.collections.List<*>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToAttributedString:", bridge = "objcKniBridge7912")
external expect fun platform.Foundation.NSAttributedString.isEqualToAttributedString(/*0*/ other: platform.Foundation.NSAttributedString): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToData:", bridge = "objcKniBridge7861")
external expect fun platform.Foundation.NSData.isEqualToData(/*0*/ other: platform.Foundation.NSData): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToDate:", bridge = "objcKniBridge7796")
external expect fun platform.Foundation.NSDate.isEqualToDate(/*0*/ otherDate: platform.Foundation.NSDate): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToDictionary:", bridge = "objcKniBridge7701")
external expect fun platform.Foundation.NSDictionary.isEqualToDictionary(/*0*/ otherDictionary: kotlin.collections.Map<kotlin.Any?, *>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToOrderedSet:", bridge = "objcKniBridge8100")
external expect fun platform.Foundation.NSOrderedSet.isEqualToOrderedSet(/*0*/ other: platform.Foundation.NSOrderedSet): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToSet:", bridge = "objcKniBridge7754")
external expect fun platform.Foundation.NSSet.isEqualToSet(/*0*/ otherSet: kotlin.collections.Set<*>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToString:", bridge = "objcKniBridge7579")
external expect fun platform.Foundation.NSString.isEqualToString(/*0*/ aString: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToTimeZone:", bridge = "objcKniBridge8309")
external expect fun platform.Foundation.NSTimeZone.isEqualToTimeZone(/*0*/ aTimeZone: platform.Foundation.NSTimeZone): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isEqualToValue:", bridge = "objcKniBridge7460")
external expect fun platform.Foundation.NSValue.isEqualToValue(/*0*/ value: platform.Foundation.NSValue): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isSubsetOfOrderedSet:", bridge = "objcKniBridge8104")
external expect fun platform.Foundation.NSOrderedSet.isSubsetOfOrderedSet(/*0*/ other: platform.Foundation.NSOrderedSet): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isSubsetOfSet:", bridge = "objcKniBridge8105")
external expect fun platform.Foundation.NSOrderedSet.isSubsetOfSet(/*0*/ set: kotlin.collections.Set<*>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "isSubsetOfSet:", bridge = "objcKniBridge7755")
external expect fun platform.Foundation.NSSet.isSubsetOfSet(/*0*/ otherSet: kotlin.collections.Set<*>): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "keyPathsForValuesAffectingValueForKey:", bridge = "objcKniBridge8222")
external expect fun platform.darwin.NSObjectMeta.keyPathsForValuesAffectingValueForKey(/*0*/ key: kotlin.String): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "knownTimeZoneNames", bridge = "objcKniBridge8315")
external expect fun platform.Foundation.NSTimeZoneMeta.knownTimeZoneNames(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "languageCode", bridge = "objcKniBridge7940")
external expect fun platform.Foundation.NSLocale.languageCode(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "languagesForScript:", bridge = "objcKniBridge8230")
external expect fun platform.Foundation.NSOrthography.languagesForScript(/*0*/ script: kotlin.String): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "lastObject", bridge = "objcKniBridge7519")
external expect fun platform.Foundation.NSArray.lastObject(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "lastObject", bridge = "objcKniBridge8124")
external expect fun platform.Foundation.NSOrderedSet.lastObject(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "lastPathComponent", bridge = "objcKniBridge8042")
external expect fun platform.Foundation.NSString.lastPathComponent(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "lastPathComponent", bridge = "objcKniBridge8070")
external expect fun platform.Foundation.NSURL.lastPathComponent(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "laterDate:", bridge = "objcKniBridge7794")
external expect fun platform.Foundation.NSDate.laterDate(/*0*/ anotherDate: platform.Foundation.NSDate): platform.Foundation.NSDate

@kotlinx.cinterop.ObjCMethod(selector = "lineRangeForRange:", bridge = "objcKniBridge7602")
external expect fun platform.Foundation.NSString.lineRangeForRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "linkCheckingResultWithRange:URL:", bridge = "objcKniBridge8268")
external expect fun platform.Foundation.NSTextCheckingResultMeta.linkCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                   URL: platform.Foundation.NSURL
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "localTimeZone", bridge = "objcKniBridge8314")
external expect fun platform.Foundation.NSTimeZoneMeta.localTimeZone(): platform.Foundation.NSTimeZone

@kotlinx.cinterop.ObjCMethod(selector = "localeIdentifier", bridge = "objcKniBridge7939")
external expect fun platform.Foundation.NSLocale.localeIdentifier(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "localeIdentifierFromComponents:", bridge = "objcKniBridge7962")
external expect fun platform.Foundation.NSLocaleMeta.localeIdentifierFromComponents(/*0*/ dict: kotlin.collections.Map<kotlin.Any?, *>): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "localeWithLocaleIdentifier:", bridge = "objcKniBridge7957")
external expect fun platform.Foundation.NSLocaleMeta.localeWithLocaleIdentifier(/*0*/ ident: kotlin.String): platform.Foundation.NSLocale

@kotlinx.cinterop.ObjCMethod(selector = "localizedCapitalizedString", bridge = "objcKniBridge7665")
external expect fun platform.Foundation.NSString.localizedCapitalizedString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "localizedCaseInsensitiveContainsString:", bridge = "objcKniBridge7584")
external expect fun platform.Foundation.NSString.localizedCaseInsensitiveContainsString(/*0*/ str: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "localizedLowercaseString", bridge = "objcKniBridge7664")
external expect fun platform.Foundation.NSString.localizedLowercaseString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "localizedName:locale:", bridge = "objcKniBridge8310")
external expect fun platform.Foundation.NSTimeZone.localizedName(/*0*/ style: platform.Foundation.NSTimeZoneNameStyle, /*1*/
                                                                       locale: platform.Foundation.NSLocale?
): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedScannerWithString:", bridge = "objcKniBridge7990")
external expect fun platform.Foundation.NSScannerMeta.localizedScannerWithString(/*0*/ string: kotlin.String): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "localizedStandardContainsString:", bridge = "objcKniBridge7585")
external expect fun platform.Foundation.NSString.localizedStandardContainsString(/*0*/ str: kotlin.String): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "localizedStandardRangeOfString:", bridge = "objcKniBridge7586")
external expect fun platform.Foundation.NSString.localizedStandardRangeOfString(/*0*/ str: kotlin.String): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForCalendarIdentifier:", bridge = "objcKniBridge7935")
external expect fun platform.Foundation.NSLocale.localizedStringForCalendarIdentifier(/*0*/ calendarIdentifier: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForCollationIdentifier:", bridge = "objcKniBridge7936")
external expect fun platform.Foundation.NSLocale.localizedStringForCollationIdentifier(/*0*/ collationIdentifier: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForCollatorIdentifier:", bridge = "objcKniBridge7938")
external expect fun platform.Foundation.NSLocale.localizedStringForCollatorIdentifier(/*0*/ collatorIdentifier: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForCountryCode:", bridge = "objcKniBridge7932")
external expect fun platform.Foundation.NSLocale.localizedStringForCountryCode(/*0*/ countryCode: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForCurrencyCode:", bridge = "objcKniBridge7937")
external expect fun platform.Foundation.NSLocale.localizedStringForCurrencyCode(/*0*/ currencyCode: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForLanguageCode:", bridge = "objcKniBridge7931")
external expect fun platform.Foundation.NSLocale.localizedStringForLanguageCode(/*0*/ languageCode: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForLocaleIdentifier:", bridge = "objcKniBridge7930")
external expect fun platform.Foundation.NSLocale.localizedStringForLocaleIdentifier(/*0*/ localeIdentifier: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForScriptCode:", bridge = "objcKniBridge7933")
external expect fun platform.Foundation.NSLocale.localizedStringForScriptCode(/*0*/ scriptCode: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringForVariantCode:", bridge = "objcKniBridge7934")
external expect fun platform.Foundation.NSLocale.localizedStringForVariantCode(/*0*/ variantCode: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "localizedStringWithFormat:", bridge = "objcKniBridge7643")
external expect fun platform.Foundation.NSStringMeta.localizedStringWithFormat(/*0*/ format: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "localizedUppercaseString", bridge = "objcKniBridge7663")
external expect fun platform.Foundation.NSString.localizedUppercaseString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "longLongValue", bridge = "objcKniBridge7658")
external expect fun platform.Foundation.NSString.longLongValue(): kotlin.Long

@kotlinx.cinterop.ObjCMethod(selector = "lowercaseString", bridge = "objcKniBridge7661")
external expect fun platform.Foundation.NSString.lowercaseString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "lowercaseStringWithLocale:", bridge = "objcKniBridge7599")
external expect fun platform.Foundation.NSString.lowercaseStringWithLocale(/*0*/ locale: platform.Foundation.NSLocale?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "minusOrderedSet:", bridge = "objcKniBridge8165")
external expect fun platform.Foundation.NSMutableOrderedSet.minusOrderedSet(/*0*/ other: platform.Foundation.NSOrderedSet)

@kotlinx.cinterop.ObjCMethod(selector = "minusSet:", bridge = "objcKniBridge8168")
external expect fun platform.Foundation.NSMutableOrderedSet.minusSet(/*0*/ other: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(selector = "minusSet:", bridge = "objcKniBridge7779")
external expect fun platform.Foundation.NSMutableSet.minusSet(/*0*/ otherSet: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(selector = "mutableArrayValueForKey:", bridge = "objcKniBridge8177")
external expect fun platform.darwin.NSObject.mutableArrayValueForKey(/*0*/ key: kotlin.String): kotlin.collections.MutableList<kotlin.Any?>

@kotlinx.cinterop.ObjCMethod(selector = "mutableArrayValueForKeyPath:", bridge = "objcKniBridge8183")
external expect fun platform.darwin.NSObject.mutableArrayValueForKeyPath(/*0*/ keyPath: kotlin.String): kotlin.collections.MutableList<kotlin.Any?>

@kotlinx.cinterop.ObjCMethod(selector = "mutableOrderedSetValueForKey:", bridge = "objcKniBridge8178")
external expect fun platform.darwin.NSObject.mutableOrderedSetValueForKey(/*0*/ key: kotlin.String): platform.Foundation.NSMutableOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "mutableOrderedSetValueForKeyPath:", bridge = "objcKniBridge8184")
external expect fun platform.darwin.NSObject.mutableOrderedSetValueForKeyPath(/*0*/ keyPath: kotlin.String): platform.Foundation.NSMutableOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "mutableSetValueForKey:", bridge = "objcKniBridge8179")
external expect fun platform.darwin.NSObject.mutableSetValueForKey(/*0*/ key: kotlin.String): platform.Foundation.NSMutableSet

@kotlinx.cinterop.ObjCMethod(selector = "mutableSetValueForKeyPath:", bridge = "objcKniBridge8185")
external expect fun platform.darwin.NSObject.mutableSetValueForKeyPath(/*0*/ keyPath: kotlin.String): platform.Foundation.NSMutableSet

@kotlinx.cinterop.ObjCMethod(selector = "mutableString", bridge = "objcKniBridge7929")
external expect fun platform.Foundation.NSMutableAttributedString.mutableString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "nextDaylightSavingTimeTransition", bridge = "objcKniBridge8322")
external expect fun platform.Foundation.NSTimeZone.nextDaylightSavingTimeTransition(): platform.Foundation.NSDate?

@kotlinx.cinterop.ObjCMethod(selector = "nonretainedObjectValue", bridge = "objcKniBridge7461")
external expect fun platform.Foundation.NSValue.nonretainedObjectValue(): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "numberWithBool:", bridge = "objcKniBridge7475")
external expect fun platform.Foundation.NSNumberMeta.numberWithBool(/*0*/ value: kotlin.Boolean): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithChar:", bridge = "objcKniBridge7463")
external expect fun platform.Foundation.NSNumberMeta.numberWithChar(/*0*/ value: kotlin.Byte): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithDouble:", bridge = "objcKniBridge7474")
external expect fun platform.Foundation.NSNumberMeta.numberWithDouble(/*0*/ value: kotlin.Double): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithFloat:", bridge = "objcKniBridge7473")
external expect fun platform.Foundation.NSNumberMeta.numberWithFloat(/*0*/ value: kotlin.Float): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithInt:", bridge = "objcKniBridge7467")
external expect fun platform.Foundation.NSNumberMeta.numberWithInt(/*0*/ value: kotlin.Int): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithLong:", bridge = "objcKniBridge7469")
external expect fun platform.Foundation.NSNumberMeta.numberWithLong(/*0*/ value: kotlin.Long): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithLongLong:", bridge = "objcKniBridge7471")
external expect fun platform.Foundation.NSNumberMeta.numberWithLongLong(/*0*/ value: kotlin.Long): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithShort:", bridge = "objcKniBridge7465")
external expect fun platform.Foundation.NSNumberMeta.numberWithShort(/*0*/ value: kotlin.Short): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithUnsignedChar:", bridge = "objcKniBridge7464")
external expect fun platform.Foundation.NSNumberMeta.numberWithUnsignedChar(/*0*/ value: kotlin.UByte): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithUnsignedInt:", bridge = "objcKniBridge7468")
external expect fun platform.Foundation.NSNumberMeta.numberWithUnsignedInt(/*0*/ value: kotlin.UInt): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithUnsignedLong:", bridge = "objcKniBridge7470")
external expect fun platform.Foundation.NSNumberMeta.numberWithUnsignedLong(/*0*/ value: kotlin.ULong): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithUnsignedLongLong:", bridge = "objcKniBridge7472")
external expect fun platform.Foundation.NSNumberMeta.numberWithUnsignedLongLong(/*0*/ value: kotlin.ULong): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "numberWithUnsignedShort:", bridge = "objcKniBridge7466")
external expect fun platform.Foundation.NSNumberMeta.numberWithUnsignedShort(/*0*/ value: kotlin.UShort): platform.Foundation.NSNumber

@kotlinx.cinterop.ObjCMethod(selector = "objectEnumerator", bridge = "objcKniBridge7494")
external expect fun platform.Foundation.NSArray.objectEnumerator(): platform.Foundation.NSEnumerator

@kotlinx.cinterop.ObjCMethod(selector = "objectEnumerator", bridge = "objcKniBridge7702")
external expect fun platform.Foundation.NSDictionary.objectEnumerator(): platform.Foundation.NSEnumerator

@kotlinx.cinterop.ObjCMethod(selector = "objectEnumerator", bridge = "objcKniBridge8107")
external expect fun platform.Foundation.NSOrderedSet.objectEnumerator(): platform.Foundation.NSEnumerator

@kotlinx.cinterop.ObjCMethod(selector = "objectForKeyedSubscript:", bridge = "objcKniBridge7707")
external expect fun platform.Foundation.NSDictionary.objectForKeyedSubscript(/*0*/ key: kotlin.Any?): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "objectsAtIndexes:", bridge = "objcKniBridge7503")
external expect fun platform.Foundation.NSArray.objectsAtIndexes(/*0*/ indexes: platform.Foundation.NSIndexSet): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "objectsAtIndexes:", bridge = "objcKniBridge8099")
external expect fun platform.Foundation.NSOrderedSet.objectsAtIndexes(/*0*/ indexes: platform.Foundation.NSIndexSet): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "objectsForKeys:notFoundMarker:", bridge = "objcKniBridge7703")
external expect fun platform.Foundation.NSDictionary.objectsForKeys(/*0*/ keys: kotlin.collections.List<*>, /*1*/
                                                                          notFoundMarker: kotlin.Any?
): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "orderedSet", bridge = "objcKniBridge8129")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSet(): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithArray:", bridge = "objcKniBridge8135")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithArray(/*0*/ array: kotlin.collections.List<*>): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithArray:range:copyItems:", bridge = "objcKniBridge8136")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithArray(/*0*/ array: kotlin.collections.List<*>, /*1*/
                                                                                   range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*2*/
                                                                                   copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithObject:", bridge = "objcKniBridge8130")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithObject(/*0*/ `object`: kotlin.Any?): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithObjects:", bridge = "objcKniBridge8132")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithObjects(/*0*/ firstObj: kotlin.Any?): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithOrderedSet:", bridge = "objcKniBridge8133")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithOrderedSet(/*0*/ set: platform.Foundation.NSOrderedSet): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithOrderedSet:range:copyItems:", bridge = "objcKniBridge8134")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithOrderedSet(/*0*/ set: platform.Foundation.NSOrderedSet, /*1*/
                                                                                        range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*2*/
                                                                                        copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithSet:", bridge = "objcKniBridge8137")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithSet(/*0*/ set: kotlin.collections.Set<*>): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orderedSetWithSet:copyItems:", bridge = "objcKniBridge8138")
external expect fun platform.Foundation.NSOrderedSetMeta.orderedSetWithSet(/*0*/ set: kotlin.collections.Set<*>, /*1*/
                                                                                 copyItems: kotlin.Boolean
): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "orthography", bridge = "objcKniBridge8249")
external expect fun platform.Foundation.NSTextCheckingResult.orthography(): platform.Foundation.NSOrthography?

@kotlinx.cinterop.ObjCMethod(selector = "orthographyCheckingResultWithRange:orthography:", bridge = "objcKniBridge8262")
external expect fun platform.Foundation.NSTextCheckingResultMeta.orthographyCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                          orthography: platform.Foundation.NSOrthography
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "orthographyWithDominantScript:languageMap:", bridge = "objcKniBridge8236")
external expect fun platform.Foundation.NSOrthographyMeta.orthographyWithDominantScript(/*0*/ script: kotlin.String, /*1*/
                                                                                              languageMap: kotlin.collections.Map<kotlin.Any?, *>
): platform.Foundation.NSOrthography

@kotlinx.cinterop.ObjCMethod(selector = "outputStreamToFileAtPath:append:", bridge = "objcKniBridge8300")
external expect fun platform.Foundation.NSOutputStreamMeta.outputStreamToFileAtPath(/*0*/ path: kotlin.String, /*1*/
                                                                                          append: kotlin.Boolean
): platform.Foundation.NSOutputStream

@kotlinx.cinterop.ObjCMethod(selector = "outputStreamToMemory", bridge = "objcKniBridge8298")
external expect fun platform.Foundation.NSOutputStreamMeta.outputStreamToMemory(): platform.Foundation.NSOutputStream

@kotlinx.cinterop.ObjCMethod(selector = "outputStreamWithURL:append:", bridge = "objcKniBridge8301")
external expect fun platform.Foundation.NSOutputStreamMeta.outputStreamWithURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                                     append: kotlin.Boolean
): platform.Foundation.NSOutputStream?

@kotlinx.cinterop.ObjCMethod(selector = "paragraphRangeForRange:", bridge = "objcKniBridge7604")
external expect fun platform.Foundation.NSString.paragraphRangeForRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "password", bridge = "objcKniBridge8338")
external expect fun platform.Foundation.NSURLCredential.password(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "pathComponents", bridge = "objcKniBridge8040")
external expect fun platform.Foundation.NSString.pathComponents(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "pathComponents", bridge = "objcKniBridge8069")
external expect fun platform.Foundation.NSURL.pathComponents(): kotlin.collections.List<*>?

@kotlinx.cinterop.ObjCMethod(selector = "pathExtension", bridge = "objcKniBridge8044")
external expect fun platform.Foundation.NSString.pathExtension(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "pathExtension", bridge = "objcKniBridge8071")
external expect fun platform.Foundation.NSURL.pathExtension(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "pathWithComponents:", bridge = "objcKniBridge8034")
external expect fun platform.Foundation.NSStringMeta.pathWithComponents(/*0*/ components: kotlin.collections.List<*>): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "pathsMatchingExtensions:", bridge = "objcKniBridge8051")
external expect fun platform.Foundation.NSArray.pathsMatchingExtensions(/*0*/ filterTypes: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "performBlock:", bridge = "objcKniBridge8002")
external expect fun platform.Foundation.NSRunLoop.performBlock(/*0*/ block: () -> kotlin.Unit)

@kotlinx.cinterop.ObjCMethod(selector = "performInModes:block:", bridge = "objcKniBridge8001")
external expect fun platform.Foundation.NSRunLoop.performInModes(/*0*/ modes: kotlin.collections.List<*>, /*1*/
                                                                       block: () -> kotlin.Unit
)

@kotlinx.cinterop.ObjCMethod(selector = "phoneNumber", bridge = "objcKniBridge8259")
external expect fun platform.Foundation.NSTextCheckingResult.phoneNumber(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "phoneNumberCheckingResultWithRange:phoneNumber:", bridge = "objcKniBridge8275")
external expect fun platform.Foundation.NSTextCheckingResultMeta.phoneNumberCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                          phoneNumber: kotlin.String
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "precomposedStringWithCanonicalMapping", bridge = "objcKniBridge7672")
external expect fun platform.Foundation.NSString.precomposedStringWithCanonicalMapping(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "precomposedStringWithCompatibilityMapping", bridge = "objcKniBridge7674")
external expect fun platform.Foundation.NSString.precomposedStringWithCompatibilityMapping(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "preferredLanguages", bridge = "objcKniBridge7974")
external expect fun platform.Foundation.NSLocaleMeta.preferredLanguages(): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "promisedItemResourceValuesForKeys:error:", bridge = "objcKniBridge8053")
external expect fun platform.Foundation.NSURL.promisedItemResourceValuesForKeys(/*0*/ keys: kotlin.collections.List<*>, /*1*/
                                                                                      error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "propertyList", bridge = "objcKniBridge7678")
external expect fun platform.Foundation.NSString.propertyList(): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "propertyListFromStringsFileFormat", bridge = "objcKniBridge7679")
external expect fun platform.Foundation.NSString.propertyListFromStringsFileFormat(): kotlin.collections.Map<kotlin.Any?, *>?

@kotlinx.cinterop.ObjCMethod(selector = "publicID", bridge = "objcKniBridge8377")
external expect fun platform.Foundation.NSXMLParser.publicID(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "quotationBeginDelimiter", bridge = "objcKniBridge7953")
external expect fun platform.Foundation.NSLocale.quotationBeginDelimiter(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "quotationEndDelimiter", bridge = "objcKniBridge7954")
external expect fun platform.Foundation.NSLocale.quotationEndDelimiter(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "quoteCheckingResultWithRange:replacementString:", bridge = "objcKniBridge8269")
external expect fun platform.Foundation.NSTextCheckingResultMeta.quoteCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                    replacementString: kotlin.String
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "rangeOfCharacterFromSet:", bridge = "objcKniBridge7591")
external expect fun platform.Foundation.NSString.rangeOfCharacterFromSet(/*0*/ searchSet: platform.Foundation.NSCharacterSet): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "rangeOfComposedCharacterSequencesForRange:", bridge = "objcKniBridge7595")
external expect fun platform.Foundation.NSString.rangeOfComposedCharacterSequencesForRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "rangeOfString:", bridge = "objcKniBridge7587")
external expect fun platform.Foundation.NSString.rangeOfString(/*0*/ searchString: kotlin.String): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "rangeValue", bridge = "objcKniBridge7480")
external expect fun platform.Foundation.NSValue.rangeValue(): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "rangeWithName:", bridge = "objcKniBridge8247")
external expect fun platform.Foundation.NSTextCheckingResult.rangeWithName(/*0*/ name: kotlin.String): kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>

@kotlinx.cinterop.ObjCMethod(selector = "readInBackgroundAndNotify", bridge = "objcKniBridge8021")
external expect fun platform.Foundation.NSFileHandle.readInBackgroundAndNotify()

@kotlinx.cinterop.ObjCMethod(selector = "readInBackgroundAndNotifyForModes:", bridge = "objcKniBridge8020")
external expect fun platform.Foundation.NSFileHandle.readInBackgroundAndNotifyForModes(/*0*/ modes: kotlin.collections.List<*>?)

@kotlinx.cinterop.ObjCMethod(selector = "readToEndOfFileInBackgroundAndNotify", bridge = "objcKniBridge8023")
external expect fun platform.Foundation.NSFileHandle.readToEndOfFileInBackgroundAndNotify()

@kotlinx.cinterop.ObjCMethod(selector = "readToEndOfFileInBackgroundAndNotifyForModes:", bridge = "objcKniBridge8022")
external expect fun platform.Foundation.NSFileHandle.readToEndOfFileInBackgroundAndNotifyForModes(/*0*/ modes: kotlin.collections.List<*>?)

@kotlinx.cinterop.ObjCMethod(selector = "readabilityHandler", bridge = "objcKniBridge8028")
external expect fun platform.Foundation.NSFileHandle.readabilityHandler(): ((platform.Foundation.NSFileHandle?) -> kotlin.Unit)?

@kotlinx.cinterop.ObjCMethod(selector = "regularExpression", bridge = "objcKniBridge8258")
external expect fun platform.Foundation.NSTextCheckingResult.regularExpression(): platform.Foundation.NSRegularExpression?

@kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge7540")
external expect fun platform.Foundation.NSMutableArray.removeAllObjects()

@kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge7738")
external expect fun platform.Foundation.NSMutableDictionary.removeAllObjects()

@kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge8161")
external expect fun platform.Foundation.NSMutableOrderedSet.removeAllObjects()

@kotlinx.cinterop.ObjCMethod(selector = "removeAllObjects", bridge = "objcKniBridge7780")
external expect fun platform.Foundation.NSMutableSet.removeAllObjects()

@kotlinx.cinterop.ObjCMethod(selector = "removeCachedResponseForDataTask:", bridge = "objcKniBridge8332")
external expect fun platform.Foundation.NSURLCache.removeCachedResponseForDataTask(/*0*/ dataTask: platform.Foundation.NSURLSessionDataTask)

@kotlinx.cinterop.ObjCMethod(
    selector = "removeCredential:forProtectionSpace:options:task:",
    bridge = "objcKniBridge8350"
)
external expect fun platform.Foundation.NSURLCredentialStorage.removeCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                                                                      forProtectionSpace: platform.Foundation.NSURLProtectionSpace, /*2*/
                                                                                      options: kotlin.collections.Map<kotlin.Any?, *>?, /*3*/
                                                                                      task: platform.Foundation.NSURLSessionTask
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObject:", bridge = "objcKniBridge7542")
external expect fun platform.Foundation.NSMutableArray.removeObject(/*0*/ anObject: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "removeObject:inRange:", bridge = "objcKniBridge7541")
external expect fun platform.Foundation.NSMutableArray.removeObject(/*0*/ anObject: kotlin.Any?, /*1*/
                                                                          inRange: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObject:", bridge = "objcKniBridge8162")
external expect fun platform.Foundation.NSMutableOrderedSet.removeObject(/*0*/ `object`: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectIdenticalTo:", bridge = "objcKniBridge7544")
external expect fun platform.Foundation.NSMutableArray.removeObjectIdenticalTo(/*0*/ anObject: kotlin.Any?)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectIdenticalTo:inRange:", bridge = "objcKniBridge7543")
external expect fun platform.Foundation.NSMutableArray.removeObjectIdenticalTo(/*0*/ anObject: kotlin.Any?, /*1*/
                                                                                     inRange: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsAtIndexes:", bridge = "objcKniBridge7554")
external expect fun platform.Foundation.NSMutableArray.removeObjectsAtIndexes(/*0*/ indexes: platform.Foundation.NSIndexSet)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsAtIndexes:", bridge = "objcKniBridge8160")
external expect fun platform.Foundation.NSMutableOrderedSet.removeObjectsAtIndexes(/*0*/ indexes: platform.Foundation.NSIndexSet)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsForKeys:", bridge = "objcKniBridge7739")
external expect fun platform.Foundation.NSMutableDictionary.removeObjectsForKeys(/*0*/ keyArray: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsInArray:", bridge = "objcKniBridge7546")
external expect fun platform.Foundation.NSMutableArray.removeObjectsInArray(/*0*/ otherArray: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsInArray:", bridge = "objcKniBridge8163")
external expect fun platform.Foundation.NSMutableOrderedSet.removeObjectsInArray(/*0*/ array: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsInRange:", bridge = "objcKniBridge7547")
external expect fun platform.Foundation.NSMutableArray.removeObjectsInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

@kotlinx.cinterop.ObjCMethod(selector = "removeObjectsInRange:", bridge = "objcKniBridge8159")
external expect fun platform.Foundation.NSMutableOrderedSet.removeObjectsInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

@kotlinx.cinterop.ObjCMethod(selector = "removeObserver:forKeyPath:", bridge = "objcKniBridge8209")
external expect fun platform.Foundation.NSArray.removeObserver(/*0*/ observer: platform.darwin.NSObject, /*1*/
                                                                     forKeyPath: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObserver:fromObjectsAtIndexes:forKeyPath:", bridge = "objcKniBridge8206")
external expect fun platform.Foundation.NSArray.removeObserver(/*0*/ observer: platform.darwin.NSObject, /*1*/
                                                                     fromObjectsAtIndexes: platform.Foundation.NSIndexSet, /*2*/
                                                                     forKeyPath: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObserver:forKeyPath:", bridge = "objcKniBridge8212")
external expect fun platform.Foundation.NSOrderedSet.removeObserver(/*0*/ observer: platform.darwin.NSObject, /*1*/
                                                                          forKeyPath: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObserver:forKeyPath:", bridge = "objcKniBridge8215")
external expect fun platform.Foundation.NSSet.removeObserver(/*0*/ observer: platform.darwin.NSObject, /*1*/
                                                                   forKeyPath: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "removeObserver:forKeyPath:", bridge = "objcKniBridge8203")
external expect fun platform.darwin.NSObject.removeObserver(/*0*/ observer: platform.darwin.NSObject, /*1*/
                                                                  forKeyPath: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "replaceCharactersInRange:withAttributedString:", bridge = "objcKniBridge7922")
external expect fun platform.Foundation.NSMutableAttributedString.replaceCharactersInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                 withAttributedString: platform.Foundation.NSAttributedString
)

@kotlinx.cinterop.ObjCMethod(selector = "replaceObjectsAtIndexes:withObjects:", bridge = "objcKniBridge7555")
external expect fun platform.Foundation.NSMutableArray.replaceObjectsAtIndexes(/*0*/ indexes: platform.Foundation.NSIndexSet, /*1*/
                                                                                     withObjects: kotlin.collections.List<*>
)

@kotlinx.cinterop.ObjCMethod(selector = "replaceObjectsAtIndexes:withObjects:", bridge = "objcKniBridge8158")
external expect fun platform.Foundation.NSMutableOrderedSet.replaceObjectsAtIndexes(/*0*/ indexes: platform.Foundation.NSIndexSet, /*1*/
                                                                                          withObjects: kotlin.collections.List<*>
)

@kotlinx.cinterop.ObjCMethod(selector = "replaceObjectsInRange:withObjectsFromArray:", bridge = "objcKniBridge7549")
external expect fun platform.Foundation.NSMutableArray.replaceObjectsInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                   withObjectsFromArray: kotlin.collections.List<*>
)

@kotlinx.cinterop.ObjCMethod(
    selector = "replaceObjectsInRange:withObjectsFromArray:range:",
    bridge = "objcKniBridge7548"
)
external expect fun platform.Foundation.NSMutableArray.replaceObjectsInRange(/*0*/ _range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                   withObjectsFromArray: kotlin.collections.List<*>, /*2*/
                                                                                   range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>
)

@kotlinx.cinterop.ObjCMethod(
    selector = "replacementCheckingResultWithRange:replacementString:",
    bridge = "objcKniBridge8271"
)
external expect fun platform.Foundation.NSTextCheckingResultMeta.replacementCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                          replacementString: kotlin.String
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "replacementObjectForCoder:", bridge = "objcKniBridge7451")
external expect fun platform.darwin.NSObject.replacementObjectForCoder(/*0*/ aCoder: platform.Foundation.NSCoder): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "replacementObjectForKeyedArchiver:", bridge = "objcKniBridge8226")
external expect fun platform.darwin.NSObject.replacementObjectForKeyedArchiver(/*0*/ archiver: platform.Foundation.NSKeyedArchiver): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "replacementString", bridge = "objcKniBridge8256")
external expect fun platform.Foundation.NSTextCheckingResult.replacementString(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "requiresSecureCoding", bridge = "objcKniBridge7854")
external expect fun platform.Foundation.NSCoder.requiresSecureCoding(): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "resetBytesInRange:", bridge = "objcKniBridge7901")
external expect fun platform.Foundation.NSMutableData.resetBytesInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>)

@kotlinx.cinterop.ObjCMethod(selector = "resetSystemTimeZone", bridge = "objcKniBridge8307")
external expect fun platform.Foundation.NSTimeZoneMeta.resetSystemTimeZone()

@kotlinx.cinterop.ObjCMethod(selector = "reverseObjectEnumerator", bridge = "objcKniBridge7495")
external expect fun platform.Foundation.NSArray.reverseObjectEnumerator(): platform.Foundation.NSEnumerator

@kotlinx.cinterop.ObjCMethod(selector = "reverseObjectEnumerator", bridge = "objcKniBridge8108")
external expect fun platform.Foundation.NSOrderedSet.reverseObjectEnumerator(): platform.Foundation.NSEnumerator

@kotlinx.cinterop.ObjCMethod(selector = "reversedOrderedSet", bridge = "objcKniBridge8125")
external expect fun platform.Foundation.NSOrderedSet.reversedOrderedSet(): platform.Foundation.NSOrderedSet

@kotlinx.cinterop.ObjCMethod(selector = "run", bridge = "objcKniBridge7998")
external expect fun platform.Foundation.NSRunLoop.run()

@kotlinx.cinterop.ObjCMethod(selector = "runUntilDate:", bridge = "objcKniBridge7999")
external expect fun platform.Foundation.NSRunLoop.runUntilDate(/*0*/ limitDate: platform.Foundation.NSDate)

@kotlinx.cinterop.ObjCMethod(selector = "scanCharactersFromSet:intoString:", bridge = "objcKniBridge7986")
external expect fun platform.Foundation.NSScanner.scanCharactersFromSet(/*0*/ set: platform.Foundation.NSCharacterSet, /*1*/
                                                                              intoString: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "scanDecimal:", bridge = "objcKniBridge7995")
external expect fun platform.Foundation.NSScanner.scanDecimal(/*0*/ dcm: kotlinx.cinterop.CPointer<platform.Foundation.NSDecimal>?): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "scanString:intoString:", bridge = "objcKniBridge7985")
external expect fun platform.Foundation.NSScanner.scanString(/*0*/ string: kotlin.String, /*1*/
                                                                   intoString: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "scanUpToCharactersFromSet:intoString:", bridge = "objcKniBridge7988")
external expect fun platform.Foundation.NSScanner.scanUpToCharactersFromSet(/*0*/ set: platform.Foundation.NSCharacterSet, /*1*/
                                                                                  intoString: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "scanUpToString:intoString:", bridge = "objcKniBridge7987")
external expect fun platform.Foundation.NSScanner.scanUpToString(/*0*/ string: kotlin.String, /*1*/
                                                                       intoString: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.String?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "scannerWithString:", bridge = "objcKniBridge7989")
external expect fun platform.Foundation.NSScannerMeta.scannerWithString(/*0*/ string: kotlin.String): platform.Foundation.NSScanner

@kotlinx.cinterop.ObjCMethod(selector = "scriptCode", bridge = "objcKniBridge7942")
external expect fun platform.Foundation.NSLocale.scriptCode(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(
    selector = "sendAsynchronousRequest:queue:completionHandler:",
    bridge = "objcKniBridge8334"
)
external expect fun platform.Foundation.NSURLConnectionMeta.sendAsynchronousRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                                                          queue: platform.Foundation.NSOperationQueue, /*2*/
                                                                                          completionHandler: (platform.Foundation.NSURLResponse?, platform.Foundation.NSData?, platform.Foundation.NSError?) -> kotlin.Unit
)

@kotlinx.cinterop.ObjCMethod(selector = "sendSynchronousRequest:returningResponse:error:", bridge = "objcKniBridge8333")
external expect fun platform.Foundation.NSURLConnectionMeta.sendSynchronousRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                                                         returningResponse: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSURLResponse?>>?, /*2*/
                                                                                         error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): platform.Foundation.NSData?

@kotlinx.cinterop.ObjCMethod(selector = "set", bridge = "objcKniBridge8127")
external expect fun platform.Foundation.NSOrderedSet.set(): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "set", bridge = "objcKniBridge7767")
external expect fun platform.Foundation.NSSetMeta.set(): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setAbbreviationDictionary:", bridge = "objcKniBridge8316")
external expect fun platform.Foundation.NSTimeZoneMeta.setAbbreviationDictionary(/*0*/ abbreviationDictionary: kotlin.collections.Map<kotlin.Any?, *>)

@kotlinx.cinterop.ObjCMethod(selector = "setAllHTTPHeaderFields:", bridge = "objcKniBridge8368")
external expect fun platform.Foundation.NSMutableURLRequest.setAllHTTPHeaderFields(/*0*/ allHTTPHeaderFields: kotlin.collections.Map<kotlin.Any?, *>?)

@kotlinx.cinterop.ObjCMethod(selector = "setArray:", bridge = "objcKniBridge7550")
external expect fun platform.Foundation.NSMutableArray.setArray(/*0*/ otherArray: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "setAttributedString:", bridge = "objcKniBridge7926")
external expect fun platform.Foundation.NSMutableAttributedString.setAttributedString(/*0*/ attrString: platform.Foundation.NSAttributedString)

@kotlinx.cinterop.ObjCMethod(selector = "setByAddingObject:", bridge = "objcKniBridge7758")
external expect fun platform.Foundation.NSSet.setByAddingObject(/*0*/ anObject: kotlin.Any?): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setByAddingObjectsFromArray:", bridge = "objcKniBridge7760")
external expect fun platform.Foundation.NSSet.setByAddingObjectsFromArray(/*0*/ other: kotlin.collections.List<*>): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setByAddingObjectsFromSet:", bridge = "objcKniBridge7759")
external expect fun platform.Foundation.NSSet.setByAddingObjectsFromSet(/*0*/ other: kotlin.collections.Set<*>): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setCredential:forProtectionSpace:task:", bridge = "objcKniBridge8349")
external expect fun platform.Foundation.NSURLCredentialStorage.setCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                                                                   forProtectionSpace: platform.Foundation.NSURLProtectionSpace, /*2*/
                                                                                   task: platform.Foundation.NSURLSessionTask
)

@kotlinx.cinterop.ObjCMethod(selector = "setData:", bridge = "objcKniBridge7902")
external expect fun platform.Foundation.NSMutableData.setData(/*0*/ data: platform.Foundation.NSData)

@kotlinx.cinterop.ObjCMethod(selector = "setDefaultCredential:forProtectionSpace:task:", bridge = "objcKniBridge8352")
external expect fun platform.Foundation.NSURLCredentialStorage.setDefaultCredential(/*0*/ credential: platform.Foundation.NSURLCredential, /*1*/
                                                                                          forProtectionSpace: platform.Foundation.NSURLProtectionSpace, /*2*/
                                                                                          task: platform.Foundation.NSURLSessionTask
)

@kotlinx.cinterop.ObjCMethod(selector = "setDefaultTimeZone:", bridge = "objcKniBridge8313")
external expect fun platform.Foundation.NSTimeZoneMeta.setDefaultTimeZone(/*0*/ defaultTimeZone: platform.Foundation.NSTimeZone)

@kotlinx.cinterop.ObjCMethod(selector = "setDictionary:", bridge = "objcKniBridge7740")
external expect fun platform.Foundation.NSMutableDictionary.setDictionary(/*0*/ otherDictionary: kotlin.collections.Map<kotlin.Any?, *>)

@kotlinx.cinterop.ObjCMethod(selector = "setHTTPBody:", bridge = "objcKniBridge8370")
external expect fun platform.Foundation.NSMutableURLRequest.setHTTPBody(/*0*/ HTTPBody: platform.Foundation.NSData?)

@kotlinx.cinterop.ObjCMethod(selector = "setHTTPBodyStream:", bridge = "objcKniBridge8372")
external expect fun platform.Foundation.NSMutableURLRequest.setHTTPBodyStream(/*0*/ HTTPBodyStream: platform.Foundation.NSInputStream?)

@kotlinx.cinterop.ObjCMethod(selector = "setHTTPMethod:", bridge = "objcKniBridge8366")
external expect fun platform.Foundation.NSMutableURLRequest.setHTTPMethod(/*0*/ HTTPMethod: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "setHTTPShouldHandleCookies:", bridge = "objcKniBridge8374")
external expect fun platform.Foundation.NSMutableURLRequest.setHTTPShouldHandleCookies(/*0*/ HTTPShouldHandleCookies: kotlin.Boolean)

@kotlinx.cinterop.ObjCMethod(selector = "setHTTPShouldUsePipelining:", bridge = "objcKniBridge8376")
external expect fun platform.Foundation.NSMutableURLRequest.setHTTPShouldUsePipelining(/*0*/ HTTPShouldUsePipelining: kotlin.Boolean)

@kotlinx.cinterop.ObjCMethod(selector = "setNilValueForKey:", bridge = "objcKniBridge8188")
external expect fun platform.darwin.NSObject.setNilValueForKey(/*0*/ key: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "setObject:forKeyedSubscript:", bridge = "objcKniBridge7741")
external expect fun platform.Foundation.NSMutableDictionary.setObject(/*0*/ obj: kotlin.Any?, /*1*/
                                                                            forKeyedSubscript: platform.Foundation.NSCopyingProtocol?
)

@kotlinx.cinterop.ObjCMethod(selector = "setReadabilityHandler:", bridge = "objcKniBridge8029")
external expect fun platform.Foundation.NSFileHandle.setReadabilityHandler(/*0*/ readabilityHandler: ((platform.Foundation.NSFileHandle?) -> kotlin.Unit)?)

@kotlinx.cinterop.ObjCMethod(selector = "setSet:", bridge = "objcKniBridge7782")
external expect fun platform.Foundation.NSMutableSet.setSet(/*0*/ otherSet: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(selector = "setValue:forKey:", bridge = "objcKniBridge8193")
external expect fun platform.Foundation.NSArray.setValue(/*0*/ value: kotlin.Any?, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "setValue:forKey:", bridge = "objcKniBridge8195")
external expect fun platform.Foundation.NSMutableDictionary.setValue(/*0*/ value: kotlin.Any?, /*1*/
                                                                           forKey: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "setValue:forHTTPHeaderField:", bridge = "objcKniBridge8363")
external expect fun platform.Foundation.NSMutableURLRequest.setValue(/*0*/ value: kotlin.String?, /*1*/
                                                                           forHTTPHeaderField: kotlin.String
)

@kotlinx.cinterop.ObjCMethod(selector = "setValue:forKey:", bridge = "objcKniBridge8197")
external expect fun platform.Foundation.NSOrderedSet.setValue(/*0*/ value: kotlin.Any?, /*1*/ forKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "setValue:forKey:", bridge = "objcKniBridge8199")
external expect fun platform.Foundation.NSSet.setValue(/*0*/ value: kotlin.Any?, /*1*/ forKey: kotlin.String)

@Suppress("CONFLICTING_OVERLOADS")
@kotlinx.cinterop.ObjCMethod(selector = "setValue:forKey:", bridge = "objcKniBridge8175")
external expect fun platform.darwin.NSObject.setValue(/*0*/ value: kotlin.Any?, /*1*/ forKey: kotlin.String)

@Suppress("CONFLICTING_OVERLOADS")
@kotlinx.cinterop.ObjCMethod(selector = "setValue:forKeyPath:", bridge = "objcKniBridge8181")
external expect fun platform.darwin.NSObject.setValue(/*0*/ value: kotlin.Any?, /*1*/ forKeyPath: kotlin.String)

@Suppress("CONFLICTING_OVERLOADS")
@kotlinx.cinterop.ObjCMethod(selector = "setValue:forUndefinedKey:", bridge = "objcKniBridge8187")
external expect fun platform.darwin.NSObject.setValue(/*0*/ value: kotlin.Any?, /*1*/ forUndefinedKey: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "setValuesForKeysWithDictionary:", bridge = "objcKniBridge8190")
external expect fun platform.darwin.NSObject.setValuesForKeysWithDictionary(/*0*/ keyedValues: kotlin.collections.Map<kotlin.Any?, *>)

@kotlinx.cinterop.ObjCMethod(selector = "setWithArray:", bridge = "objcKniBridge7772")
external expect fun platform.Foundation.NSSetMeta.setWithArray(/*0*/ array: kotlin.collections.List<*>): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setWithObject:", bridge = "objcKniBridge7768")
external expect fun platform.Foundation.NSSetMeta.setWithObject(/*0*/ `object`: kotlin.Any?): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setWithObjects:", bridge = "objcKniBridge7770")
external expect fun platform.Foundation.NSSetMeta.setWithObjects(/*0*/ firstObj: kotlin.Any?): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setWithSet:", bridge = "objcKniBridge7771")
external expect fun platform.Foundation.NSSetMeta.setWithSet(/*0*/ set: kotlin.collections.Set<*>): kotlin.collections.Set<*>

@kotlinx.cinterop.ObjCMethod(selector = "setWriteabilityHandler:", bridge = "objcKniBridge8031")
external expect fun platform.Foundation.NSFileHandle.setWriteabilityHandler(/*0*/ writeabilityHandler: ((platform.Foundation.NSFileHandle?) -> kotlin.Unit)?)

@kotlinx.cinterop.ObjCMethod(selector = "sharedKeySetForKeys:", bridge = "objcKniBridge7747")
external expect fun platform.Foundation.NSDictionaryMeta.sharedKeySetForKeys(/*0*/ keys: kotlin.collections.List<*>): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "sortUsingDescriptors:", bridge = "objcKniBridge8288")
external expect fun platform.Foundation.NSMutableArray.sortUsingDescriptors(/*0*/ sortDescriptors: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "sortUsingDescriptors:", bridge = "objcKniBridge8290")
external expect fun platform.Foundation.NSMutableOrderedSet.sortUsingDescriptors(/*0*/ sortDescriptors: kotlin.collections.List<*>)

@kotlinx.cinterop.ObjCMethod(selector = "sortedArrayHint", bridge = "objcKniBridge7520")
external expect fun platform.Foundation.NSArray.sortedArrayHint(): platform.Foundation.NSData

@kotlinx.cinterop.ObjCMethod(selector = "sortedArrayUsingDescriptors:", bridge = "objcKniBridge8287")
external expect fun platform.Foundation.NSArray.sortedArrayUsingDescriptors(/*0*/ sortDescriptors: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "sortedArrayUsingDescriptors:", bridge = "objcKniBridge8289")
external expect fun platform.Foundation.NSOrderedSet.sortedArrayUsingDescriptors(/*0*/ sortDescriptors: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "sortedArrayUsingDescriptors:", bridge = "objcKniBridge8286")
external expect fun platform.Foundation.NSSet.sortedArrayUsingDescriptors(/*0*/ sortDescriptors: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "spellCheckingResultWithRange:", bridge = "objcKniBridge8263")
external expect fun platform.Foundation.NSTextCheckingResultMeta.spellCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "storeCachedResponse:forDataTask:", bridge = "objcKniBridge8330")
external expect fun platform.Foundation.NSURLCache.storeCachedResponse(/*0*/ cachedResponse: platform.Foundation.NSCachedURLResponse, /*1*/
                                                                             forDataTask: platform.Foundation.NSURLSessionDataTask
)

@kotlinx.cinterop.ObjCMethod(selector = "storeCookies:forTask:", bridge = "objcKniBridge8095")
external expect fun platform.Foundation.NSHTTPCookieStorage.storeCookies(/*0*/ cookies: kotlin.collections.List<*>, /*1*/
                                                                               forTask: platform.Foundation.NSURLSessionTask
)

@kotlinx.cinterop.ObjCMethod(selector = "string", bridge = "objcKniBridge7638")
external expect fun platform.Foundation.NSStringMeta.string(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByAbbreviatingWithTildeInPath", bridge = "objcKniBridge8046")
external expect fun platform.Foundation.NSString.stringByAbbreviatingWithTildeInPath(): kotlin.String

@kotlinx.cinterop.ObjCMethod(
    selector = "stringByAddingPercentEncodingWithAllowedCharacters:",
    bridge = "objcKniBridge8061"
)
external expect fun platform.Foundation.NSString.stringByAddingPercentEncodingWithAllowedCharacters(/*0*/
    allowedCharacters: platform.Foundation.NSCharacterSet
): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "stringByAppendingFormat:", bridge = "objcKniBridge7597")
external expect fun platform.Foundation.NSString.stringByAppendingFormat(/*0*/ format: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByAppendingPathComponent:", bridge = "objcKniBridge8035")
external expect fun platform.Foundation.NSString.stringByAppendingPathComponent(/*0*/ str: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByAppendingPathExtension:", bridge = "objcKniBridge8036")
external expect fun platform.Foundation.NSString.stringByAppendingPathExtension(/*0*/ str: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "stringByAppendingString:", bridge = "objcKniBridge7596")
external expect fun platform.Foundation.NSString.stringByAppendingString(/*0*/ aString: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByDeletingLastPathComponent", bridge = "objcKniBridge8043")
external expect fun platform.Foundation.NSString.stringByDeletingLastPathComponent(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByDeletingPathExtension", bridge = "objcKniBridge8045")
external expect fun platform.Foundation.NSString.stringByDeletingPathExtension(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByExpandingTildeInPath", bridge = "objcKniBridge8047")
external expect fun platform.Foundation.NSString.stringByExpandingTildeInPath(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByRemovingPercentEncoding", bridge = "objcKniBridge8064")
external expect fun platform.Foundation.NSString.stringByRemovingPercentEncoding(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "stringByReplacingCharactersInRange:withString:", bridge = "objcKniBridge7623")
external expect fun platform.Foundation.NSString.stringByReplacingCharactersInRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                          withString: kotlin.String
): kotlin.String

@kotlinx.cinterop.ObjCMethod(
    selector = "stringByReplacingOccurrencesOfString:withString:",
    bridge = "objcKniBridge7622"
)
external expect fun platform.Foundation.NSString.stringByReplacingOccurrencesOfString(/*0*/ target: kotlin.String, /*1*/
                                                                                            withString: kotlin.String
): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByResolvingSymlinksInPath", bridge = "objcKniBridge8049")
external expect fun platform.Foundation.NSString.stringByResolvingSymlinksInPath(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByStandardizingPath", bridge = "objcKniBridge8048")
external expect fun platform.Foundation.NSString.stringByStandardizingPath(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringByTrimmingCharactersInSet:", bridge = "objcKniBridge7618")
external expect fun platform.Foundation.NSString.stringByTrimmingCharactersInSet(/*0*/ set: platform.Foundation.NSCharacterSet): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringWithContentsOfFile:", bridge = "objcKniBridge7690")
external expect fun platform.Foundation.NSStringMeta.stringWithContentsOfFile(/*0*/ path: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "stringWithContentsOfURL:", bridge = "objcKniBridge7691")
external expect fun platform.Foundation.NSStringMeta.stringWithContentsOfURL(/*0*/ url: platform.Foundation.NSURL): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "stringWithFormat:", bridge = "objcKniBridge7642")
external expect fun platform.Foundation.NSStringMeta.stringWithFormat(/*0*/ format: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringWithString:", bridge = "objcKniBridge7639")
external expect fun platform.Foundation.NSStringMeta.stringWithString(/*0*/ string: kotlin.String): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "stringsByAppendingPaths:", bridge = "objcKniBridge8037")
external expect fun platform.Foundation.NSString.stringsByAppendingPaths(/*0*/ paths: kotlin.collections.List<*>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "strongObjectsPointerArray", bridge = "objcKniBridge8237")
external expect fun platform.Foundation.NSPointerArrayMeta.strongObjectsPointerArray(): platform.Foundation.NSPointerArray

@kotlinx.cinterop.ObjCMethod(selector = "subarrayWithRange:", bridge = "objcKniBridge7499")
external expect fun platform.Foundation.NSArray.subarrayWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlin.collections.List<*>

@kotlinx.cinterop.ObjCMethod(selector = "subdataWithRange:", bridge = "objcKniBridge7862")
external expect fun platform.Foundation.NSData.subdataWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSData

@kotlinx.cinterop.ObjCMethod(selector = "substringWithRange:", bridge = "objcKniBridge7569")
external expect fun platform.Foundation.NSString.substringWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "systemID", bridge = "objcKniBridge8378")
external expect fun platform.Foundation.NSXMLParser.systemID(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "systemLocale", bridge = "objcKniBridge7960")
external expect fun platform.Foundation.NSLocaleMeta.systemLocale(): platform.Foundation.NSLocale

@kotlinx.cinterop.ObjCMethod(selector = "systemTimeZone", bridge = "objcKniBridge8311")
external expect fun platform.Foundation.NSTimeZoneMeta.systemTimeZone(): platform.Foundation.NSTimeZone

@kotlinx.cinterop.ObjCMethod(selector = "systemVersion", bridge = "objcKniBridge7852")
external expect fun platform.Foundation.NSCoder.systemVersion(): kotlin.UInt

@kotlinx.cinterop.ObjCMethod(selector = "task", bridge = "objcKniBridge8355")
external expect fun platform.Foundation.NSURLProtocol.task(): platform.Foundation.NSURLSessionTask?

@kotlinx.cinterop.ObjCMethod(selector = "temporaryDirectory", bridge = "objcKniBridge8076")
external expect fun platform.Foundation.NSFileManager.temporaryDirectory(): platform.Foundation.NSURL

@kotlinx.cinterop.ObjCMethod(selector = "thermalState", bridge = "objcKniBridge8244")
external expect fun platform.Foundation.NSProcessInfo.thermalState(): platform.Foundation.NSProcessInfoThermalState

@kotlinx.cinterop.ObjCMethod(selector = "timeZone", bridge = "objcKniBridge8252")
external expect fun platform.Foundation.NSTextCheckingResult.timeZone(): platform.Foundation.NSTimeZone?

@kotlinx.cinterop.ObjCMethod(selector = "timeZoneDataVersion", bridge = "objcKniBridge8317")
external expect fun platform.Foundation.NSTimeZoneMeta.timeZoneDataVersion(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "timeZoneWithAbbreviation:", bridge = "objcKniBridge8329")
external expect fun platform.Foundation.NSTimeZoneMeta.timeZoneWithAbbreviation(/*0*/ abbreviation: kotlin.String): platform.Foundation.NSTimeZone?

@kotlinx.cinterop.ObjCMethod(selector = "timeZoneWithName:", bridge = "objcKniBridge8324")
external expect fun platform.Foundation.NSTimeZoneMeta.timeZoneWithName(/*0*/ tzName: kotlin.String): platform.Foundation.NSTimeZone?

@kotlinx.cinterop.ObjCMethod(selector = "timeZoneWithName:data:", bridge = "objcKniBridge8325")
external expect fun platform.Foundation.NSTimeZoneMeta.timeZoneWithName(/*0*/ tzName: kotlin.String, /*1*/
                                                                              data: platform.Foundation.NSData?
): platform.Foundation.NSTimeZone?

@kotlinx.cinterop.ObjCMethod(
    selector = "transitInformationCheckingResultWithRange:components:",
    bridge = "objcKniBridge8276"
)
external expect fun platform.Foundation.NSTextCheckingResultMeta.transitInformationCheckingResultWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>, /*1*/
                                                                                                                 components: kotlin.collections.Map<kotlin.Any?, *>
): platform.Foundation.NSTextCheckingResult

@kotlinx.cinterop.ObjCMethod(selector = "unionOrderedSet:", bridge = "objcKniBridge8166")
external expect fun platform.Foundation.NSMutableOrderedSet.unionOrderedSet(/*0*/ other: platform.Foundation.NSOrderedSet)

@kotlinx.cinterop.ObjCMethod(selector = "unionSet:", bridge = "objcKniBridge8169")
external expect fun platform.Foundation.NSMutableOrderedSet.unionSet(/*0*/ other: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(selector = "unionSet:", bridge = "objcKniBridge7781")
external expect fun platform.Foundation.NSMutableSet.unionSet(/*0*/ otherSet: kotlin.collections.Set<*>)

@kotlinx.cinterop.ObjCMethod(
    selector = "uploadTaskWithRequest:fromData:completionHandler:",
    bridge = "objcKniBridge8392"
)
external expect fun platform.Foundation.NSURLSession.uploadTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                                                 fromData: platform.Foundation.NSData?, /*2*/
                                                                                 completionHandler: (platform.Foundation.NSData?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionUploadTask

@kotlinx.cinterop.ObjCMethod(
    selector = "uploadTaskWithRequest:fromFile:completionHandler:",
    bridge = "objcKniBridge8391"
)
external expect fun platform.Foundation.NSURLSession.uploadTaskWithRequest(/*0*/ request: platform.Foundation.NSURLRequest, /*1*/
                                                                                 fromFile: platform.Foundation.NSURL, /*2*/
                                                                                 completionHandler: (platform.Foundation.NSData?, platform.Foundation.NSURLResponse?, platform.Foundation.NSError?) -> kotlin.Unit
): platform.Foundation.NSURLSessionUploadTask

@kotlinx.cinterop.ObjCMethod(selector = "uppercaseString", bridge = "objcKniBridge7660")
external expect fun platform.Foundation.NSString.uppercaseString(): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "uppercaseStringWithLocale:", bridge = "objcKniBridge7598")
external expect fun platform.Foundation.NSString.uppercaseStringWithLocale(/*0*/ locale: platform.Foundation.NSLocale?): kotlin.String

@kotlinx.cinterop.ObjCMethod(selector = "user", bridge = "objcKniBridge8337")
external expect fun platform.Foundation.NSURLCredential.user(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "usesMetricSystem", bridge = "objcKniBridge7947")
external expect fun platform.Foundation.NSLocale.usesMetricSystem(): kotlin.Boolean

@Suppress("CONFLICTING_OVERLOADS")
@kotlinx.cinterop.ObjCMethod(selector = "validateValue:forKey:error:", bridge = "objcKniBridge8176")
external expect fun platform.darwin.NSObject.validateValue(/*0*/ ioValue: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                                                 forKey: kotlin.String, /*2*/
                                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Boolean

@Suppress("CONFLICTING_OVERLOADS")
@kotlinx.cinterop.ObjCMethod(selector = "validateValue:forKeyPath:error:", bridge = "objcKniBridge8182")
external expect fun platform.darwin.NSObject.validateValue(/*0*/ ioValue: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<kotlin.Any?>>?, /*1*/
                                                                 forKeyPath: kotlin.String, /*2*/
                                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "valueForHTTPHeaderField:", bridge = "objcKniBridge8356")
external expect fun platform.Foundation.NSURLRequest.valueForHTTPHeaderField(/*0*/ field: kotlin.String): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "valueForKey:", bridge = "objcKniBridge8192")
external expect fun platform.Foundation.NSArray.valueForKey(/*0*/ key: kotlin.String): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "valueForKey:", bridge = "objcKniBridge8194")
external expect fun platform.Foundation.NSDictionary.valueForKey(/*0*/ key: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "valueForKey:", bridge = "objcKniBridge8196")
external expect fun platform.Foundation.NSOrderedSet.valueForKey(/*0*/ key: kotlin.String): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "valueForKey:", bridge = "objcKniBridge8198")
external expect fun platform.Foundation.NSSet.valueForKey(/*0*/ key: kotlin.String): kotlin.Any

@kotlinx.cinterop.ObjCMethod(selector = "valueForKey:", bridge = "objcKniBridge8174")
external expect fun platform.darwin.NSObject.valueForKey(/*0*/ key: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "valueForKeyPath:", bridge = "objcKniBridge8180")
external expect fun platform.darwin.NSObject.valueForKeyPath(/*0*/ keyPath: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "valueForUndefinedKey:", bridge = "objcKniBridge8186")
external expect fun platform.darwin.NSObject.valueForUndefinedKey(/*0*/ key: kotlin.String): kotlin.Any?

@kotlinx.cinterop.ObjCMethod(selector = "valueWithNonretainedObject:", bridge = "objcKniBridge7458")
external expect fun platform.Foundation.NSValueMeta.valueWithNonretainedObject(/*0*/ anObject: kotlin.Any?): platform.Foundation.NSValue

@kotlinx.cinterop.ObjCMethod(selector = "valueWithRange:", bridge = "objcKniBridge7479")
external expect fun platform.Foundation.NSValueMeta.valueWithRange(/*0*/ range: kotlinx.cinterop.CValue<platform.Foundation.NSRange /* = platform.Foundation._NSRange */>): platform.Foundation.NSValue

@kotlinx.cinterop.ObjCMethod(selector = "variantCode", bridge = "objcKniBridge7943")
external expect fun platform.Foundation.NSLocale.variantCode(): kotlin.String?

@kotlinx.cinterop.ObjCMethod(selector = "waitForDataInBackgroundAndNotify", bridge = "objcKniBridge8027")
external expect fun platform.Foundation.NSFileHandle.waitForDataInBackgroundAndNotify()

@kotlinx.cinterop.ObjCMethod(selector = "waitForDataInBackgroundAndNotifyForModes:", bridge = "objcKniBridge8026")
external expect fun platform.Foundation.NSFileHandle.waitForDataInBackgroundAndNotifyForModes(/*0*/ modes: kotlin.collections.List<*>?)

@kotlinx.cinterop.ObjCMethod(selector = "weakObjectsPointerArray", bridge = "objcKniBridge8238")
external expect fun platform.Foundation.NSPointerArrayMeta.weakObjectsPointerArray(): platform.Foundation.NSPointerArray

@kotlinx.cinterop.ObjCMethod(selector = "willChangeValueForKey:", bridge = "objcKniBridge8216")
external expect fun platform.darwin.NSObject.willChangeValueForKey(/*0*/ key: kotlin.String)

@kotlinx.cinterop.ObjCMethod(selector = "writeToFile:atomically:", bridge = "objcKniBridge7536")
external expect fun platform.Foundation.NSArray.writeToFile(/*0*/ path: kotlin.String, /*1*/
                                                                  atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToFile:atomically:", bridge = "objcKniBridge7863")
external expect fun platform.Foundation.NSData.writeToFile(/*0*/ path: kotlin.String, /*1*/
                                                                 atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToFile:atomically:", bridge = "objcKniBridge7723")
external expect fun platform.Foundation.NSDictionary.writeToFile(/*0*/ path: kotlin.String, /*1*/
                                                                       atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToFile:atomically:", bridge = "objcKniBridge7686")
external expect fun platform.Foundation.NSString.writeToFile(/*0*/ path: kotlin.String, /*1*/
                                                                   atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToURL:atomically:", bridge = "objcKniBridge7537")
external expect fun platform.Foundation.NSArray.writeToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                 atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToURL:error:", bridge = "objcKniBridge7500")
external expect fun platform.Foundation.NSArray.writeToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                 error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToURL:atomically:", bridge = "objcKniBridge7864")
external expect fun platform.Foundation.NSData.writeToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToURL:atomically:", bridge = "objcKniBridge7724")
external expect fun platform.Foundation.NSDictionary.writeToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                      atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToURL:error:", bridge = "objcKniBridge7704")
external expect fun platform.Foundation.NSDictionary.writeToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                      error: kotlinx.cinterop.CPointer<kotlinx.cinterop.ObjCObjectVar<platform.Foundation.NSError?>>?
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeToURL:atomically:", bridge = "objcKniBridge7687")
external expect fun platform.Foundation.NSString.writeToURL(/*0*/ url: platform.Foundation.NSURL, /*1*/
                                                                  atomically: kotlin.Boolean
): kotlin.Boolean

@kotlinx.cinterop.ObjCMethod(selector = "writeabilityHandler", bridge = "objcKniBridge8030")
external expect fun platform.Foundation.NSFileHandle.writeabilityHandler(): ((platform.Foundation.NSFileHandle?) -> kotlin.Unit)?


