@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "UNUSED_PARAMETER", "REDUNDANT_NULLABLE")

package platform.posix

import kotlinx.cinterop.* 

final expect enum class ACTION: kotlinx.cinterop.CEnum {
    FIND,

    ENTER;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.posix.ACTION
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.posix.ACTION

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class DIR: kotlinx.cinterop.CStructVar {
    final var __dd_fd: kotlin.Int

    final var __dd_flags: kotlin.Int

    final var __dd_len: kotlin.Int

    final var __dd_loc: kotlin.Long

    final val __dd_lock: platform.posix.__darwin_pthread_mutex_t /* = platform.posix._opaque_pthread_mutex_t */

    final var __dd_seek: kotlin.Long

    final var __dd_size: kotlin.Long

    final var __dd_td: kotlinx.cinterop.CPointer<cnames.structs._telldir>?

    final var __padding: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class FTS: kotlinx.cinterop.CStructVar {
    final var fts_child: kotlinx.cinterop.CPointer<platform.posix._ftsent>?

    final var fts_cur: kotlinx.cinterop.CPointer<platform.posix._ftsent>?

    final var fts_nitems: kotlin.Int

    final var fts_options: kotlin.Int

    final var fts_pathlen: kotlin.Int

    final var fts_rfd: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class FTW: kotlinx.cinterop.CStructVar {
    final var base: kotlin.Int

    final var level: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class VISIT: kotlinx.cinterop.CEnum {
    preorder,

    postorder,

    endorder,

    leaf;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.posix.VISIT
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.posix.VISIT

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class _RuneCharClass: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _RuneEntry: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _RuneLocale: kotlinx.cinterop.CStructVar {
    final var __charclasses: kotlinx.cinterop.CPointer<platform.posix._RuneCharClass>?

    final val __maplower_ext: platform.posix._RuneRange

    final val __mapupper_ext: platform.posix._RuneRange

    final var __ncharclasses: kotlin.Int

    final val __runetype_ext: platform.posix._RuneRange

    final var __variable_len: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _RuneRange: kotlinx.cinterop.CStructVar {
    final var __nranges: kotlin.Int

    final var __ranges: kotlinx.cinterop.CPointer<platform.posix._RuneEntry>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_fp_control: kotlinx.cinterop.CStructVar {
    final var __denorm: kotlin.UShort

    final var __invalid: kotlin.UShort

    final var __ovrfl: kotlin.UShort

    final var __pc: kotlin.UShort

    final var __precis: kotlin.UShort

    final var __rc: kotlin.UShort

    final var __undfl: kotlin.UShort

    final var __zdiv: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_fp_status: kotlinx.cinterop.CStructVar {
    final var __busy: kotlin.UShort

    final var __c0: kotlin.UShort

    final var __c1: kotlin.UShort

    final var __c2: kotlin.UShort

    final var __c3: kotlin.UShort

    final var __denorm: kotlin.UShort

    final var __errsumm: kotlin.UShort

    final var __invalid: kotlin.UShort

    final var __ovrfl: kotlin.UShort

    final var __precis: kotlin.UShort

    final var __stkflt: kotlin.UShort

    final var __tos: kotlin.UShort

    final var __undfl: kotlin.UShort

    final var __zdiv: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_i386_avx512_state: kotlinx.cinterop.CStructVar {
    final val __fpu_fcw: platform.posix.__darwin_fp_control

    final val __fpu_fsw: platform.posix.__darwin_fp_status

    final val __fpu_k0: platform.posix.__darwin_opmask_reg

    final val __fpu_k1: platform.posix.__darwin_opmask_reg

    final val __fpu_k2: platform.posix.__darwin_opmask_reg

    final val __fpu_k3: platform.posix.__darwin_opmask_reg

    final val __fpu_k4: platform.posix.__darwin_opmask_reg

    final val __fpu_k5: platform.posix.__darwin_opmask_reg

    final val __fpu_k6: platform.posix.__darwin_opmask_reg

    final val __fpu_k7: platform.posix.__darwin_opmask_reg

    final var __fpu_reserved1: kotlin.Int

    final val __fpu_stmm0: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm1: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm2: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm3: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm4: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm5: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm6: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm7: platform.posix.__darwin_mmst_reg

    final val __fpu_xmm0: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm1: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm2: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm3: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm4: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm5: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm6: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm7: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh0: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh1: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh2: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh3: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh4: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh5: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh6: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh7: platform.posix.__darwin_xmm_reg

    final val __fpu_zmmh0: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh1: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh2: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh3: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh4: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh5: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh6: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh7: platform.posix.__darwin_ymm_reg

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_i386_avx_state: kotlinx.cinterop.CStructVar {
    final val __fpu_fcw: platform.posix.__darwin_fp_control

    final val __fpu_fsw: platform.posix.__darwin_fp_status

    final var __fpu_reserved1: kotlin.Int

    final val __fpu_stmm0: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm1: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm2: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm3: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm4: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm5: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm6: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm7: platform.posix.__darwin_mmst_reg

    final val __fpu_xmm0: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm1: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm2: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm3: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm4: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm5: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm6: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm7: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh0: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh1: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh2: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh3: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh4: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh5: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh6: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh7: platform.posix.__darwin_xmm_reg

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_i386_exception_state: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_i386_float_state: kotlinx.cinterop.CStructVar {
    final val __fpu_fcw: platform.posix.__darwin_fp_control

    final val __fpu_fsw: platform.posix.__darwin_fp_status

    final var __fpu_reserved1: kotlin.Int

    final val __fpu_stmm0: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm1: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm2: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm3: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm4: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm5: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm6: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm7: platform.posix.__darwin_mmst_reg

    final val __fpu_xmm0: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm1: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm2: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm3: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm4: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm5: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm6: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm7: platform.posix.__darwin_xmm_reg

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_i386_thread_state: kotlinx.cinterop.CStructVar {
    final var __cs: kotlin.UInt

    final var __ds: kotlin.UInt

    final var __eax: kotlin.UInt

    final var __ebp: kotlin.UInt

    final var __ebx: kotlin.UInt

    final var __ecx: kotlin.UInt

    final var __edi: kotlin.UInt

    final var __edx: kotlin.UInt

    final var __eflags: kotlin.UInt

    final var __eip: kotlin.UInt

    final var __es: kotlin.UInt

    final var __esi: kotlin.UInt

    final var __esp: kotlin.UInt

    final var __fs: kotlin.UInt

    final var __gs: kotlin.UInt

    final var __ss: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mcontext32: kotlinx.cinterop.CStructVar {
    final val __es: platform.posix.__darwin_i386_exception_state

    final val __fs: platform.posix.__darwin_i386_float_state

    final val __ss: platform.posix.__darwin_i386_thread_state

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mcontext64: kotlinx.cinterop.CStructVar {
    final val __es: platform.posix.__darwin_x86_exception_state64

    final val __fs: platform.posix.__darwin_x86_float_state64

    final val __ss: platform.posix.__darwin_x86_thread_state64

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mcontext_avx32: kotlinx.cinterop.CStructVar {
    final val __es: platform.posix.__darwin_i386_exception_state

    final val __fs: platform.posix.__darwin_i386_avx_state

    final val __ss: platform.posix.__darwin_i386_thread_state

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mcontext_avx512_32: kotlinx.cinterop.CStructVar {
    final val __es: platform.posix.__darwin_i386_exception_state

    final val __fs: platform.posix.__darwin_i386_avx512_state

    final val __ss: platform.posix.__darwin_i386_thread_state

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mcontext_avx512_64: kotlinx.cinterop.CStructVar {
    final val __es: platform.posix.__darwin_x86_exception_state64

    final val __fs: platform.posix.__darwin_x86_avx512_state64

    final val __ss: platform.posix.__darwin_x86_thread_state64

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mcontext_avx64: kotlinx.cinterop.CStructVar {
    final val __es: platform.posix.__darwin_x86_exception_state64

    final val __fs: platform.posix.__darwin_x86_avx_state64

    final val __ss: platform.posix.__darwin_x86_thread_state64

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_mmst_reg: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_opmask_reg: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_pthread_handler_rec: kotlinx.cinterop.CStructVar {
    final var __next: kotlinx.cinterop.CPointer<platform.posix.__darwin_pthread_handler_rec>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_sigaltstack: kotlinx.cinterop.CStructVar {
    final var ss_flags: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_ucontext: kotlinx.cinterop.CStructVar {
    final val __mcontext_data: platform.posix.__darwin_mcontext64

    final var uc_link: kotlinx.cinterop.CPointer<platform.posix.__darwin_ucontext>?

    final var uc_mcontext: kotlinx.cinterop.CPointer<platform.posix.__darwin_mcontext64>?

    final var uc_onstack: kotlin.Int

    final val uc_stack: platform.posix.__darwin_sigaltstack

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_avx512_state64: kotlinx.cinterop.CStructVar {
    final val __fpu_fcw: platform.posix.__darwin_fp_control

    final val __fpu_fsw: platform.posix.__darwin_fp_status

    final val __fpu_k0: platform.posix.__darwin_opmask_reg

    final val __fpu_k1: platform.posix.__darwin_opmask_reg

    final val __fpu_k2: platform.posix.__darwin_opmask_reg

    final val __fpu_k3: platform.posix.__darwin_opmask_reg

    final val __fpu_k4: platform.posix.__darwin_opmask_reg

    final val __fpu_k5: platform.posix.__darwin_opmask_reg

    final val __fpu_k6: platform.posix.__darwin_opmask_reg

    final val __fpu_k7: platform.posix.__darwin_opmask_reg

    final var __fpu_reserved1: kotlin.Int

    final val __fpu_stmm0: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm1: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm2: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm3: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm4: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm5: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm6: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm7: platform.posix.__darwin_mmst_reg

    final val __fpu_xmm0: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm1: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm10: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm11: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm12: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm13: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm14: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm15: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm2: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm3: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm4: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm5: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm6: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm7: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm8: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm9: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh0: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh1: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh10: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh11: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh12: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh13: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh14: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh15: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh2: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh3: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh4: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh5: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh6: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh7: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh8: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh9: platform.posix.__darwin_xmm_reg

    final val __fpu_zmm16: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm17: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm18: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm19: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm20: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm21: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm22: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm23: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm24: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm25: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm26: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm27: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm28: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm29: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm30: platform.posix.__darwin_zmm_reg

    final val __fpu_zmm31: platform.posix.__darwin_zmm_reg

    final val __fpu_zmmh0: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh1: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh10: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh11: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh12: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh13: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh14: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh15: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh2: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh3: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh4: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh5: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh6: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh7: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh8: platform.posix.__darwin_ymm_reg

    final val __fpu_zmmh9: platform.posix.__darwin_ymm_reg

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_avx_state64: kotlinx.cinterop.CStructVar {
    final val __fpu_fcw: platform.posix.__darwin_fp_control

    final val __fpu_fsw: platform.posix.__darwin_fp_status

    final var __fpu_reserved1: kotlin.Int

    final val __fpu_stmm0: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm1: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm2: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm3: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm4: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm5: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm6: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm7: platform.posix.__darwin_mmst_reg

    final val __fpu_xmm0: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm1: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm10: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm11: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm12: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm13: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm14: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm15: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm2: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm3: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm4: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm5: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm6: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm7: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm8: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm9: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh0: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh1: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh10: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh11: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh12: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh13: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh14: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh15: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh2: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh3: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh4: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh5: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh6: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh7: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh8: platform.posix.__darwin_xmm_reg

    final val __fpu_ymmh9: platform.posix.__darwin_xmm_reg

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_cpmu_state64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_debug_state32: kotlinx.cinterop.CStructVar {
    final var __dr0: kotlin.UInt

    final var __dr1: kotlin.UInt

    final var __dr2: kotlin.UInt

    final var __dr3: kotlin.UInt

    final var __dr4: kotlin.UInt

    final var __dr5: kotlin.UInt

    final var __dr6: kotlin.UInt

    final var __dr7: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_debug_state64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_exception_state64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_float_state64: kotlinx.cinterop.CStructVar {
    final val __fpu_fcw: platform.posix.__darwin_fp_control

    final val __fpu_fsw: platform.posix.__darwin_fp_status

    final var __fpu_reserved1: kotlin.Int

    final val __fpu_stmm0: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm1: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm2: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm3: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm4: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm5: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm6: platform.posix.__darwin_mmst_reg

    final val __fpu_stmm7: platform.posix.__darwin_mmst_reg

    final val __fpu_xmm0: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm1: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm10: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm11: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm12: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm13: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm14: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm15: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm2: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm3: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm4: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm5: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm6: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm7: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm8: platform.posix.__darwin_xmm_reg

    final val __fpu_xmm9: platform.posix.__darwin_xmm_reg

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_x86_thread_state64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_xmm_reg: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_ymm_reg: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __darwin_zmm_reg: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __double2: kotlinx.cinterop.CStructVar {
    final var __cosval: kotlin.Double

    final var __sinval: kotlin.Double

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __float2: kotlinx.cinterop.CStructVar {
    final var __cosval: kotlin.Float

    final var __sinval: kotlin.Float

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __mbstate_t: kotlinx.cinterop.CStructVar {
    final var _mbstateL: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __msfilterreq: kotlinx.cinterop.CStructVar {
    final val msfr_group: platform.posix.sockaddr_storage

    final var msfr_srcs: kotlinx.cinterop.CPointer<platform.posix.sockaddr_storage>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class __ns_flag: kotlinx.cinterop.CEnum {
    ns_f_qr,

    ns_f_opcode,

    ns_f_aa,

    ns_f_tc,

    ns_f_rd,

    ns_f_ra,

    ns_f_z,

    ns_f_ad,

    ns_f_cd,

    ns_f_rcode,

    ns_f_max;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.posix.__ns_flag
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.posix.__ns_flag

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class __ns_msg: kotlinx.cinterop.CStructVar {
    final var _rrnum: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __ns_rr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __res_9_state: kotlinx.cinterop.CStructVar {
    final val _u: platform.posix.anonymousStruct3

    final var _vcsock: kotlin.Int

    final var ndots: kotlin.UInt

    final var nscount: kotlin.Int

    final var nsort: kotlin.UInt

    final var res_h_errno: kotlin.Int

    final var retrans: kotlin.Int

    final var retry: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __sFILE: kotlinx.cinterop.CStructVar {
    final val _bf: platform.posix.__sbuf

    final var _blksize: kotlin.Int

    final var _extra: kotlinx.cinterop.CPointer<cnames.structs.__sFILEX>?

    final var _file: kotlin.Short

    final var _flags: kotlin.Short

    final val _lb: platform.posix.__sbuf

    final var _lbfsize: kotlin.Int

    final var _r: kotlin.Int

    final val _ub: platform.posix.__sbuf

    final var _ur: kotlin.Int

    final var _w: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __sbuf: kotlinx.cinterop.CStructVar {
    final var _size: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __shmid_ds_new: kotlinx.cinterop.CStructVar {
    final val shm_perm: platform.posix.ipc_perm

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __sigaction: kotlinx.cinterop.CStructVar {
    final val __sigaction_u: platform.posix.__sigaction_u

    final var sa_flags: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __sigaction_u: kotlinx.cinterop.CStructVar {
    final var __sa_handler: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __siginfo: kotlinx.cinterop.CStructVar {
    final var si_band: kotlin.Long

    final var si_code: kotlin.Int

    final var si_errno: kotlin.Int

    final var si_signo: kotlin.Int

    final var si_status: kotlin.Int

    final val si_value: platform.posix.sigval

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class __va_list_tag: kotlinx.cinterop.CStructVar {
    final var fp_offset: kotlin.UInt

    final var gp_offset: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _ftsent: kotlinx.cinterop.CStructVar {
    final var fts_cycle: kotlinx.cinterop.CPointer<platform.posix._ftsent>?

    final var fts_errno: kotlin.Int

    final var fts_flags: kotlin.UShort

    final var fts_info: kotlin.UShort

    final var fts_instr: kotlin.UShort

    final var fts_level: kotlin.Short

    final var fts_link: kotlinx.cinterop.CPointer<platform.posix._ftsent>?

    final var fts_namelen: kotlin.UShort

    final var fts_number: kotlin.Long

    final var fts_parent: kotlinx.cinterop.CPointer<platform.posix._ftsent>?

    final var fts_pathlen: kotlin.UShort

    final var fts_statp: kotlinx.cinterop.CPointer<platform.posix.stat>?

    final var fts_symfd: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_attr_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_cond_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_condattr_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_mutex_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_mutexattr_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_once_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_rwlock_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_rwlockattr_t: kotlinx.cinterop.CStructVar {
    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _opaque_pthread_t: kotlinx.cinterop.CStructVar {
    final var __cleanup_stack: kotlinx.cinterop.CPointer<platform.posix.__darwin_pthread_handler_rec>?

    final var __sig: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class _res_9_ns_flagdata: kotlinx.cinterop.CStructVar {
    final var mask: kotlin.Int

    final var shift: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class accessx_descriptor: kotlinx.cinterop.CStructVar {
    final var ad_flags: kotlin.Int

    final var ad_name_offset: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class addrinfo: kotlinx.cinterop.CStructVar {
    final var ai_addr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var ai_family: kotlin.Int

    final var ai_flags: kotlin.Int

    final var ai_next: kotlinx.cinterop.CPointer<platform.posix.addrinfo>?

    final var ai_protocol: kotlin.Int

    final var ai_socktype: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct1: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct10: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct11: kotlinx.cinterop.CStructVar {
    final val ip6_un1: platform.posix.ip6_hdrctl

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct12: kotlinx.cinterop.CStructVar {
    final val ih_gwaddr: platform.posix.in_addr

    final val ih_idseq: platform.posix.ih_idseq

    final val ih_pmtu: platform.posix.ih_pmtu

    final val ih_rtradv: platform.posix.ih_rtradv

    final var ih_void: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct13: kotlinx.cinterop.CStructVar {
    final val id_ip: platform.posix.id_ip

    final val id_radv: platform.posix.icmp_ra_addr

    final val id_ts: platform.posix.id_ts

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct2: kotlinx.cinterop.CStructVar {
    final val addr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct3: kotlinx.cinterop.CStructVar {
    final val _ext: platform.posix.anonymousStruct4

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct4: kotlinx.cinterop.CStructVar {
    final var ext: kotlinx.cinterop.CPointer<cnames.structs.__res_9_state_ext>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct5: kotlinx.cinterop.CStructVar {
    final var w_Coredump: kotlin.UInt

    final var w_Filler: kotlin.UInt

    final var w_Retcode: kotlin.UInt

    final var w_Termsig: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct6: kotlinx.cinterop.CStructVar {
    final var w_Filler: kotlin.UInt

    final var w_Stopsig: kotlin.UInt

    final var w_Stopval: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct7: kotlinx.cinterop.CStructVar {
    final var ifk_value: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct8: kotlinx.cinterop.CStructVar {
    final val ifru_addr: platform.posix.sockaddr

    final val ifru_broadaddr: platform.posix.sockaddr

    final val ifru_devmtu: platform.posix.ifdevmtu

    final val ifru_dstaddr: platform.posix.sockaddr

    final var ifru_flags: kotlin.Short

    final var ifru_intval: kotlin.Int

    final val ifru_kpi: platform.posix.ifkpi

    final var ifru_media: kotlin.Int

    final var ifru_metric: kotlin.Int

    final var ifru_mtu: kotlin.Int

    final var ifru_phys: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class anonymousStruct9: kotlinx.cinterop.CStructVar {
    final var ifcu_req: kotlinx.cinterop.CPointer<platform.posix.ifreq>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class atomic_flag: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class clockinfo: kotlinx.cinterop.CStructVar {
    final var hz: kotlin.Int

    final var profhz: kotlin.Int

    final var stathz: kotlin.Int

    final var tick: kotlin.Int

    final var tickadj: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class cmsghdr: kotlinx.cinterop.CStructVar {
    final var cmsg_level: kotlin.Int

    final var cmsg_type: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dirent: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class div_t: kotlinx.cinterop.CStructVar {
    final var quot: kotlin.Int

    final var rem: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class dl_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class entry: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ether_addr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ether_header: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class exception: kotlinx.cinterop.CStructVar {
    final var arg1: kotlin.Double

    final var arg2: kotlin.Double

    final var retval: kotlin.Double

    final var type: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fbootstraptransfer: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fchecklv: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fcodeblobs: kotlinx.cinterop.CStructVar {
    final var __padding: kotlin.Int

    final var f_arch: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fd_set: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fenv_t: kotlinx.cinterop.CStructVar {
    final var __control: kotlin.UShort

    final var __mxcsr: kotlin.UInt

    final var __status: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class flock: kotlinx.cinterop.CStructVar {
    final var l_type: kotlin.Short

    final var l_whence: kotlin.Short

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class flocktimeout: kotlinx.cinterop.CStructVar {
    final val fl: platform.posix.flock

    final val timeout: platform.posix.timespec

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fpunchhole: kotlinx.cinterop.CStructVar {
    final var fp_flags: kotlin.UInt

    final var reserved: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fsignatures: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class fstore: kotlinx.cinterop.CStructVar {
    final var fst_flags: kotlin.UInt

    final var fst_posmode: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ftrimactivefile: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class group: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class group_req: kotlinx.cinterop.CStructVar {
    final val gr_group: platform.posix.sockaddr_storage

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class group_source_req: kotlinx.cinterop.CStructVar {
    final val gsr_group: platform.posix.sockaddr_storage

    final val gsr_source: platform.posix.sockaddr_storage

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class guid_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class hostent: kotlinx.cinterop.CStructVar {
    final var h_addrtype: kotlin.Int

    final var h_length: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp: kotlinx.cinterop.CStructVar {
    final val icmp_dun: platform.posix.anonymousStruct13

    final val icmp_hun: platform.posix.anonymousStruct12

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6_filter: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6_hdr: kotlinx.cinterop.CStructVar {
    final val icmp6_dataun: platform.posix.anonymousStruct10

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6_namelookup: kotlinx.cinterop.CStructVar {
    final val icmp6_nl_hdr: platform.posix.icmp6_hdr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6_nodeinfo: kotlinx.cinterop.CStructVar {
    final val icmp6_ni_hdr: platform.posix.icmp6_hdr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6_router_renum: kotlinx.cinterop.CStructVar {
    final val rr_hdr: platform.posix.icmp6_hdr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6errstat: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp6stat: kotlinx.cinterop.CStructVar {
    final val icp6s_outerrhist: platform.posix.icmp6errstat

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class icmp_ra_addr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class id_ip: kotlinx.cinterop.CStructVar {
    final val idi_ip: platform.posix.ip

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class id_ts: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class idtype_t: kotlinx.cinterop.CEnum {
    P_ALL,

    P_PID,

    P_PGID;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.posix.idtype_t
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.posix.idtype_t

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class if_clonereq: kotlinx.cinterop.CStructVar {
    final var ifcr_count: kotlin.Int

    final var ifcr_total: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class if_data: kotlinx.cinterop.CStructVar {
    final val ifi_lastchange: platform.posix.timeval32

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class if_data64: kotlinx.cinterop.CStructVar {
    final val ifi_lastchange: platform.posix.timeval32

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class if_msghdr: kotlinx.cinterop.CStructVar {
    final var ifm_addrs: kotlin.Int

    final val ifm_data: platform.posix.if_data

    final var ifm_flags: kotlin.Int

    final var ifm_index: kotlin.UShort

    final var ifm_msglen: kotlin.UShort

    final var ifm_type: kotlin.UByte

    final var ifm_version: kotlin.UByte

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class if_msghdr2: kotlinx.cinterop.CStructVar {
    final var ifm_addrs: kotlin.Int

    final val ifm_data: platform.posix.if_data64

    final var ifm_flags: kotlin.Int

    final var ifm_snd_drops: kotlin.Int

    final var ifm_snd_len: kotlin.Int

    final var ifm_snd_maxlen: kotlin.Int

    final var ifm_timer: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class if_nameindex: kotlinx.cinterop.CStructVar {
    final var if_index: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifa_msghdr: kotlinx.cinterop.CStructVar {
    final var ifam_addrs: kotlin.Int

    final var ifam_flags: kotlin.Int

    final var ifam_index: kotlin.UShort

    final var ifam_metric: kotlin.Int

    final var ifam_msglen: kotlin.UShort

    final var ifam_type: kotlin.UByte

    final var ifam_version: kotlin.UByte

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifaliasreq: kotlinx.cinterop.CStructVar {
    final val ifra_addr: platform.posix.sockaddr

    final val ifra_broadaddr: platform.posix.sockaddr

    final val ifra_mask: platform.posix.sockaddr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifconf: kotlinx.cinterop.CStructVar {
    final val ifc_ifcu: platform.posix.anonymousStruct9

    final var ifc_len: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifdevmtu: kotlinx.cinterop.CStructVar {
    final var ifdm_current: kotlin.Int

    final var ifdm_max: kotlin.Int

    final var ifdm_min: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifdrv: kotlinx.cinterop.CStructVar {
    final var ifd_cmd: kotlin.ULong

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifkpi: kotlinx.cinterop.CStructVar {
    final val ifk_data: platform.posix.anonymousStruct7

    final var ifk_module_id: kotlin.UInt

    final var ifk_type: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifma_msghdr: kotlinx.cinterop.CStructVar {
    final var ifmam_addrs: kotlin.Int

    final var ifmam_flags: kotlin.Int

    final var ifmam_index: kotlin.UShort

    final var ifmam_msglen: kotlin.UShort

    final var ifmam_type: kotlin.UByte

    final var ifmam_version: kotlin.UByte

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifma_msghdr2: kotlinx.cinterop.CStructVar {
    final var ifmam_addrs: kotlin.Int

    final var ifmam_flags: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifmediareq: kotlinx.cinterop.CStructVar {
    final var ifm_active: kotlin.Int

    final var ifm_count: kotlin.Int

    final var ifm_current: kotlin.Int

    final var ifm_mask: kotlin.Int

    final var ifm_status: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifqueue: kotlinx.cinterop.CStructVar {
    final var ifq_drops: kotlin.Int

    final var ifq_len: kotlin.Int

    final var ifq_maxlen: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifreq: kotlinx.cinterop.CStructVar {
    final val ifr_ifru: platform.posix.anonymousStruct8

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ifstat: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ih_idseq: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ih_pmtu: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ih_rtradv: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class imaxdiv_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class in6_addr: kotlinx.cinterop.CStructVar {
    final val __u6_addr: platform.posix.anonymousStruct1

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class in6_pktinfo: kotlinx.cinterop.CStructVar {
    final val ipi6_addr: platform.posix.in6_addr

    final var ipi6_ifindex: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class in_addr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class in_pktinfo: kotlinx.cinterop.CStructVar {
    final val ipi_addr: platform.posix.in_addr

    final var ipi_ifindex: kotlin.UInt

    final val ipi_spec_dst: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class iovec: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip: kotlinx.cinterop.CStructVar {
    final val ip_dst: platform.posix.in_addr

    final val ip_src: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_dest: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_ext: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_frag: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_hbh: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_hdr: kotlinx.cinterop.CStructVar {
    final val ip6_ctlun: platform.posix.anonymousStruct11

    final val ip6_dst: platform.posix.in6_addr

    final val ip6_src: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_hdrctl: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_mtuinfo: kotlinx.cinterop.CStructVar {
    final val ip6m_addr: platform.posix.sockaddr_in6

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_opt: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_opt_jumbo: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_opt_nsap: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_opt_router: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_opt_tunnel: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_rthdr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip6_rthdr0: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip_mreq: kotlinx.cinterop.CStructVar {
    final val imr_interface: platform.posix.in_addr

    final val imr_multiaddr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip_mreq_source: kotlinx.cinterop.CStructVar {
    final val imr_interface: platform.posix.in_addr

    final val imr_multiaddr: platform.posix.in_addr

    final val imr_sourceaddr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip_mreqn: kotlinx.cinterop.CStructVar {
    final val imr_address: platform.posix.in_addr

    final var imr_ifindex: kotlin.Int

    final val imr_multiaddr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip_opts: kotlinx.cinterop.CStructVar {
    final val ip_dst: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ip_timestamp: kotlinx.cinterop.CStructVar {
    final val ipt_timestamp: platform.posix.ipt_timestamp

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ipc_perm: kotlinx.cinterop.CStructVar {
    final var _seq: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ipt_ta: kotlinx.cinterop.CStructVar {
    final val ipt_addr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ipt_timestamp: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ipv6_mreq: kotlinx.cinterop.CStructVar {
    final var ipv6mr_interface: kotlin.UInt

    final val ipv6mr_multiaddr: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class itimerval: kotlinx.cinterop.CStructVar {
    final val it_interval: platform.posix.timeval

    final val it_value: platform.posix.timeval

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kauth_ace: kotlinx.cinterop.CStructVar {
    final val ace_applicable: platform.posix.guid_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kauth_acl: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kauth_cache_sizes: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kauth_filesec: kotlinx.cinterop.CStructVar {
    final val fsec_acl: platform.posix.kauth_acl

    final val fsec_group: platform.posix.guid_t

    final val fsec_owner: platform.posix.guid_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kauth_identity_extlookup: kotlinx.cinterop.CStructVar {
    final val el_gguid: platform.posix.guid_t

    final val el_gsid: platform.posix.ntsid_t

    final val el_uguid: platform.posix.guid_t

    final val el_usid: platform.posix.ntsid_t

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class kev_dl_proto_data: kotlinx.cinterop.CStructVar {
    final val link_data: platform.posix.net_event_data

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class lconv: kotlinx.cinterop.CStructVar {
    final var frac_digits: kotlin.Byte

    final var int_frac_digits: kotlin.Byte

    final var int_n_cs_precedes: kotlin.Byte

    final var int_n_sep_by_space: kotlin.Byte

    final var int_n_sign_posn: kotlin.Byte

    final var int_p_cs_precedes: kotlin.Byte

    final var int_p_sep_by_space: kotlin.Byte

    final var int_p_sign_posn: kotlin.Byte

    final var n_cs_precedes: kotlin.Byte

    final var n_sep_by_space: kotlin.Byte

    final var n_sign_posn: kotlin.Byte

    final var p_cs_precedes: kotlin.Byte

    final var p_sep_by_space: kotlin.Byte

    final var p_sign_posn: kotlin.Byte

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ldiv_t: kotlinx.cinterop.CStructVar {
    final var quot: kotlin.Long

    final var rem: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class linger: kotlinx.cinterop.CStructVar {
    final var l_linger: kotlin.Int

    final var l_onoff: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class lldiv_t: kotlinx.cinterop.CStructVar {
    final var quot: kotlin.Long

    final var rem: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class log2phys: kotlinx.cinterop.CStructVar {
    final var l2p_flags: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class mld_hdr: kotlinx.cinterop.CStructVar {
    final val mld_addr: platform.posix.in6_addr

    final val mld_icmp6_hdr: platform.posix.icmp6_hdr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class msghdr: kotlinx.cinterop.CStructVar {
    final var msg_flags: kotlin.Int

    final var msg_iov: kotlinx.cinterop.CPointer<platform.posix.iovec>?

    final var msg_iovlen: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_neighbor_advert: kotlinx.cinterop.CStructVar {
    final val nd_na_hdr: platform.posix.icmp6_hdr

    final val nd_na_target: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_neighbor_solicit: kotlinx.cinterop.CStructVar {
    final val nd_ns_hdr: platform.posix.icmp6_hdr

    final val nd_ns_target: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_dnssl: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_hdr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_mtu: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_nonce: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_prefix_info: kotlinx.cinterop.CStructVar {
    final val nd_opt_pi_prefix: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_rd_hdr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_rdnss: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_opt_route_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_redirect: kotlinx.cinterop.CStructVar {
    final val nd_rd_dst: platform.posix.in6_addr

    final val nd_rd_hdr: platform.posix.icmp6_hdr

    final val nd_rd_target: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_router_advert: kotlinx.cinterop.CStructVar {
    final val nd_ra_hdr: platform.posix.icmp6_hdr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class nd_router_solicit: kotlinx.cinterop.CStructVar {
    final val nd_rs_hdr: platform.posix.icmp6_hdr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class net_event_data: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class netent: kotlinx.cinterop.CStructVar {
    final var n_addrtype: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ni_reply_fqdn: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ntsid_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class option: kotlinx.cinterop.CStructVar {
    final var has_arg: kotlin.Int

    final var `val`: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ostat: kotlinx.cinterop.CStructVar {
    final val st_atimespec: platform.posix.timespec

    final val st_ctimespec: platform.posix.timespec

    final val st_mtimespec: platform.posix.timespec

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class passwd: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class pollfd: kotlinx.cinterop.CStructVar {
    final var events: kotlin.Short

    final var fd: kotlin.Int

    final var revents: kotlin.Short

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class proc_rlimit_control_wakeupmon: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class protoent: kotlinx.cinterop.CStructVar {
    final var p_proto: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class radvisory: kotlinx.cinterop.CStructVar {
    final var ra_count: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class regex_t: kotlinx.cinterop.CStructVar {
    final var re_g: kotlinx.cinterop.CPointer<cnames.structs.re_guts>?

    final var re_magic: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class regmatch_t: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class res_9_ns_tcp_tsig_state: kotlinx.cinterop.CStructVar {
    final var counter: kotlin.Int

    final var key: kotlinx.cinterop.CPointer<cnames.structs.dst_key>?

    final var siglen: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class res_9_ns_tsig_key: kotlinx.cinterop.CStructVar {
    final var len: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect enum class res_9_sendhookact: kotlinx.cinterop.CEnum {
    res_9_goahead,

    res_9_nextns,

    res_9_modified,

    res_9_done,

    res_9_error;

    open override /*1*/ val value: kotlin.UInt

    companion object Companion {
        final fun byValue(/*0*/ value: kotlin.UInt): platform.posix.res_9_sendhookact
    }

    final class Var: kotlinx.cinterop.CEnumVar {
        final var value: platform.posix.res_9_sendhookact

        companion object Companion: kotlinx.cinterop.CPrimitiveVar.Type {
        }
    }
}

final expect class res_9_sockaddr_union: kotlinx.cinterop.CStructVar {
    final val sin: platform.posix.sockaddr_in

    final val sin6: platform.posix.sockaddr_in6

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class res_9_sym: kotlinx.cinterop.CStructVar {
    final var number: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rlimit: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rpcent: kotlinx.cinterop.CStructVar {
    final var r_number: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rr_pco_match: kotlinx.cinterop.CStructVar {
    final val rpm_prefix: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rr_pco_use: kotlinx.cinterop.CStructVar {
    final val rpu_prefix: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rr_result: kotlinx.cinterop.CStructVar {
    final val rrr_prefix: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rslvmulti_req: kotlinx.cinterop.CStructVar {
    final var sa: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rusage: kotlinx.cinterop.CStructVar {
    final var ru_idrss: kotlin.Long

    final var ru_inblock: kotlin.Long

    final var ru_isrss: kotlin.Long

    final var ru_ixrss: kotlin.Long

    final var ru_majflt: kotlin.Long

    final var ru_maxrss: kotlin.Long

    final var ru_minflt: kotlin.Long

    final var ru_msgrcv: kotlin.Long

    final var ru_msgsnd: kotlin.Long

    final var ru_nivcsw: kotlin.Long

    final var ru_nsignals: kotlin.Long

    final var ru_nswap: kotlin.Long

    final var ru_nvcsw: kotlin.Long

    final var ru_oublock: kotlin.Long

    final val ru_stime: platform.posix.timeval

    final val ru_utime: platform.posix.timeval

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rusage_info_v0: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rusage_info_v1: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rusage_info_v2: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rusage_info_v3: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class rusage_info_v4: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sa_endpoints: kotlinx.cinterop.CStructVar {
    final var sae_dstaddr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var sae_srcaddr: kotlinx.cinterop.CPointer<platform.posix.sockaddr>?

    final var sae_srcif: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sched_param: kotlinx.cinterop.CStructVar {
    final var sched_priority: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class servent: kotlinx.cinterop.CStructVar {
    final var s_port: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sf_hdtr: kotlinx.cinterop.CStructVar {
    final var hdr_cnt: kotlin.Int

    final var headers: kotlinx.cinterop.CPointer<platform.posix.iovec>?

    final var trailers: kotlinx.cinterop.CPointer<platform.posix.iovec>?

    final var trl_cnt: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sigaction: kotlinx.cinterop.CStructVar {
    final val __sigaction_u: platform.posix.__sigaction_u

    final var sa_flags: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sigevent: kotlinx.cinterop.CStructVar {
    final var sigev_notify: kotlin.Int

    final var sigev_notify_function: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlinx.cinterop.CValue<platform.posix.sigval>) -> kotlin.Unit>>?

    final var sigev_signo: kotlin.Int

    final val sigev_value: platform.posix.sigval

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sigstack: kotlinx.cinterop.CStructVar {
    final var ss_onstack: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sigval: kotlinx.cinterop.CStructVar {
    final var sival_int: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sigvec: kotlinx.cinterop.CStructVar {
    final var sv_flags: kotlin.Int

    final var sv_handler: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?

    final var sv_mask: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class so_np_extensions: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sockaddr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sockaddr_in: kotlinx.cinterop.CStructVar {
    final val sin_addr: platform.posix.in_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sockaddr_in6: kotlinx.cinterop.CStructVar {
    final val sin6_addr: platform.posix.in6_addr

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sockaddr_storage: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class sockproto: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class stat: kotlinx.cinterop.CStructVar {
    final val st_atimespec: platform.posix.timespec

    final val st_ctimespec: platform.posix.timespec

    final val st_mtimespec: platform.posix.timespec

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class tcp_connection_info: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class tcphdr: kotlinx.cinterop.CStructVar {
    final var th_dport: kotlin.UShort

    final var th_flags: kotlin.UByte

    final var th_off: kotlin.UInt

    final var th_sport: kotlin.UShort

    final var th_sum: kotlin.UShort

    final var th_urp: kotlin.UShort

    final var th_win: kotlin.UShort

    final var th_x2: kotlin.UInt

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class termios: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class timespec: kotlinx.cinterop.CStructVar {
    final var tv_nsec: kotlin.Long

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class timeval: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class timeval32: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class timeval64: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class timezone: kotlinx.cinterop.CStructVar {
    final var tz_dsttime: kotlin.Int

    final var tz_minuteswest: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class tm: kotlinx.cinterop.CStructVar {
    final var tm_gmtoff: kotlin.Long

    final var tm_hour: kotlin.Int

    final var tm_isdst: kotlin.Int

    final var tm_mday: kotlin.Int

    final var tm_min: kotlin.Int

    final var tm_mon: kotlin.Int

    final var tm_sec: kotlin.Int

    final var tm_wday: kotlin.Int

    final var tm_yday: kotlin.Int

    final var tm_year: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class tms: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class ttysize: kotlinx.cinterop.CStructVar {
    final var ts_cols: kotlin.UShort

    final var ts_lines: kotlin.UShort

    final var ts_xxx: kotlin.UShort

    final var ts_yyy: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class udphdr: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class utimbuf: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class utsname: kotlinx.cinterop.CStructVar {
    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class wait: kotlinx.cinterop.CStructVar {
    final val w_S: platform.posix.anonymousStruct6

    final val w_T: platform.posix.anonymousStruct5

    final var w_status: kotlin.Int

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class winsize: kotlinx.cinterop.CStructVar {
    final var ws_col: kotlin.UShort

    final var ws_row: kotlin.UShort

    final var ws_xpixel: kotlin.UShort

    final var ws_ypixel: kotlin.UShort

    companion object Companion: kotlinx.cinterop.CStructVar.Type {
    }
}

final expect class Dl_info: kotlinx.cinterop.CStructVar {
}

final expect class ENTRY: kotlinx.cinterop.CStructVar {
}

final expect class FILE: kotlinx.cinterop.CStructVar {
}

final expect class FTSENT: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_ct_rune_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class __darwin_fp_control_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_fp_status_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_intptr_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class __darwin_mbstate_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_nl_item: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class __darwin_pthread_attr_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_cond_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_condattr_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_mutex_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_mutexattr_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_once_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_rwlock_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_pthread_rwlockattr_t: kotlinx.cinterop.CStructVar {
}

final expect class __darwin_ptrdiff_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class __darwin_ssize_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class __darwin_time_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class __darwin_wchar_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class __darwin_wctrans_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class __darwin_wint_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class __int16_t: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class __int32_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class __int64_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class __int8_t: kotlin.Number, kotlin.Comparable<kotlin.Byte> {
}

final expect class acl_entry_id_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class double_t: kotlin.Number, kotlin.Comparable<kotlin.Double> {
}

final expect class errno_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class ether_addr_t: kotlinx.cinterop.CStructVar {
}

final expect class ether_header_t: kotlinx.cinterop.CStructVar {
}

final expect class fbootstraptransfer_t: kotlinx.cinterop.CStructVar {
}

final expect class fchecklv_t: kotlinx.cinterop.CStructVar {
}

final expect class fcodeblobs_t: kotlinx.cinterop.CStructVar {
}

final expect class float_t: kotlin.Number, kotlin.Comparable<kotlin.Float> {
}

final expect class fpunchhole_t: kotlinx.cinterop.CStructVar {
}

final expect class fsignatures_t: kotlinx.cinterop.CStructVar {
}

final expect class fstore_t: kotlinx.cinterop.CStructVar {
}

final expect class ftrimactivefile_t: kotlinx.cinterop.CStructVar {
}

final expect class in6_addr_t: kotlinx.cinterop.CStructVar {
}

final expect class int16_t: kotlin.Number, kotlin.Comparable<kotlin.Short> {
}

final expect class int32_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class int64_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class int8_t: kotlin.Number, kotlin.Comparable<kotlin.Byte> {
}

final expect class intmax_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect class ptrdiff_t: kotlin.Number, kotlin.Comparable<kotlin.Long> {
}

final expect enum class res_9_ns_flag: kotlinx.cinterop.CEnum {
}

final expect class res_9_ns_flagVar: kotlinx.cinterop.CEnumVar {
}

final expect class res_9_ns_msg: kotlinx.cinterop.CStructVar {
}

final expect class res_9_ns_rr: kotlinx.cinterop.CStructVar {
}

final expect class rusage_info_current: kotlinx.cinterop.CStructVar {
}

final expect class sa_endpoints_t: kotlinx.cinterop.CStructVar {
}

final expect class sem_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class sig_atomic_t: kotlin.Number, kotlin.Comparable<kotlin.Int> {
}

final expect class siginfo_t: kotlinx.cinterop.CStructVar {
}

final expect class stack_t: kotlinx.cinterop.CStructVar {
}

final expect class ucontext_t: kotlinx.cinterop.CStructVar {
}

expect val DBL_EPSILON: kotlin.Double

expect val DBL_MAX: kotlin.Double

expect val DBL_MIN: kotlin.Double

expect val DBL_TRUE_MIN: kotlin.Double

expect val FLT_EPSILON: kotlin.Float

expect val FLT_MAX: kotlin.Float

expect val FLT_MIN: kotlin.Float

expect val FLT_TRUE_MIN: kotlin.Float

expect val HUGE: kotlin.Float

expect val HUGE_VAL: kotlin.Double

expect val HUGE_VALF: kotlin.Float

expect val IDENTITYSVC_ENTITLEMENT: kotlin.String

expect val INFINITY: kotlin.Float

expect val KAUTH_FILESEC_XATTR: kotlin.String

expect val MAXFLOAT: kotlin.Float

expect val M_1_PI: kotlin.Double

expect val M_2_PI: kotlin.Double

expect val M_2_SQRTPI: kotlin.Double

expect val M_E: kotlin.Double

expect val M_LN10: kotlin.Double

expect val M_LN2: kotlin.Double

expect val M_LOG10E: kotlin.Double

expect val M_LOG2E: kotlin.Double

expect val M_PI: kotlin.Double

expect val M_PI_2: kotlin.Double

expect val M_PI_4: kotlin.Double

expect val M_SQRT1_2: kotlin.Double

expect val M_SQRT2: kotlin.Double

expect val NAN: kotlin.Float

expect val NS_TSIG_ALG_HMAC_MD5: kotlin.String

expect val PRIX16: kotlin.String

expect val PRIX32: kotlin.String

expect val PRIX64: kotlin.String

expect val PRIX8: kotlin.String

expect val PRIXFAST16: kotlin.String

expect val PRIXFAST32: kotlin.String

expect val PRIXFAST64: kotlin.String

expect val PRIXFAST8: kotlin.String

expect val PRIXLEAST16: kotlin.String

expect val PRIXLEAST32: kotlin.String

expect val PRIXLEAST64: kotlin.String

expect val PRIXLEAST8: kotlin.String

expect val PRIXMAX: kotlin.String

expect val PRIXPTR: kotlin.String

expect val PRId16: kotlin.String

expect val PRId32: kotlin.String

expect val PRId64: kotlin.String

expect val PRId8: kotlin.String

expect val PRIdFAST16: kotlin.String

expect val PRIdFAST32: kotlin.String

expect val PRIdFAST64: kotlin.String

expect val PRIdFAST8: kotlin.String

expect val PRIdLEAST16: kotlin.String

expect val PRIdLEAST32: kotlin.String

expect val PRIdLEAST64: kotlin.String

expect val PRIdLEAST8: kotlin.String

expect val PRIdMAX: kotlin.String

expect val PRIdPTR: kotlin.String

expect val PRIi16: kotlin.String

expect val PRIi32: kotlin.String

expect val PRIi64: kotlin.String

expect val PRIi8: kotlin.String

expect val PRIiFAST16: kotlin.String

expect val PRIiFAST32: kotlin.String

expect val PRIiFAST64: kotlin.String

expect val PRIiFAST8: kotlin.String

expect val PRIiLEAST16: kotlin.String

expect val PRIiLEAST32: kotlin.String

expect val PRIiLEAST64: kotlin.String

expect val PRIiLEAST8: kotlin.String

expect val PRIiMAX: kotlin.String

expect val PRIiPTR: kotlin.String

expect val PRIo16: kotlin.String

expect val PRIo32: kotlin.String

expect val PRIo64: kotlin.String

expect val PRIo8: kotlin.String

expect val PRIoFAST16: kotlin.String

expect val PRIoFAST32: kotlin.String

expect val PRIoFAST64: kotlin.String

expect val PRIoFAST8: kotlin.String

expect val PRIoLEAST16: kotlin.String

expect val PRIoLEAST32: kotlin.String

expect val PRIoLEAST64: kotlin.String

expect val PRIoLEAST8: kotlin.String

expect val PRIoMAX: kotlin.String

expect val PRIoPTR: kotlin.String

expect val PRIu16: kotlin.String

expect val PRIu32: kotlin.String

expect val PRIu64: kotlin.String

expect val PRIu8: kotlin.String

expect val PRIuFAST16: kotlin.String

expect val PRIuFAST32: kotlin.String

expect val PRIuFAST64: kotlin.String

expect val PRIuFAST8: kotlin.String

expect val PRIuLEAST16: kotlin.String

expect val PRIuLEAST32: kotlin.String

expect val PRIuLEAST64: kotlin.String

expect val PRIuLEAST8: kotlin.String

expect val PRIuMAX: kotlin.String

expect val PRIuPTR: kotlin.String

expect val PRIx16: kotlin.String

expect val PRIx32: kotlin.String

expect val PRIx64: kotlin.String

expect val PRIx8: kotlin.String

expect val PRIxFAST16: kotlin.String

expect val PRIxFAST32: kotlin.String

expect val PRIxFAST64: kotlin.String

expect val PRIxFAST8: kotlin.String

expect val PRIxLEAST16: kotlin.String

expect val PRIxLEAST32: kotlin.String

expect val PRIxLEAST64: kotlin.String

expect val PRIxLEAST8: kotlin.String

expect val PRIxMAX: kotlin.String

expect val PRIxPTR: kotlin.String

expect val P_tmpdir: kotlin.String

expect val QOS_CLASS_BACKGROUND: kotlin.UInt

expect val QOS_CLASS_DEFAULT: kotlin.UInt

expect val QOS_CLASS_UNSPECIFIED: kotlin.UInt

expect val QOS_CLASS_USER_INITIATED: kotlin.UInt

expect val QOS_CLASS_USER_INTERACTIVE: kotlin.UInt

expect val QOS_CLASS_UTILITY: kotlin.UInt

expect val SCNd16: kotlin.String

expect val SCNd32: kotlin.String

expect val SCNd64: kotlin.String

expect val SCNd8: kotlin.String

expect val SCNdFAST16: kotlin.String

expect val SCNdFAST32: kotlin.String

expect val SCNdFAST64: kotlin.String

expect val SCNdFAST8: kotlin.String

expect val SCNdLEAST16: kotlin.String

expect val SCNdLEAST32: kotlin.String

expect val SCNdLEAST64: kotlin.String

expect val SCNdLEAST8: kotlin.String

expect val SCNdMAX: kotlin.String

expect val SCNdPTR: kotlin.String

expect val SCNi16: kotlin.String

expect val SCNi32: kotlin.String

expect val SCNi64: kotlin.String

expect val SCNi8: kotlin.String

expect val SCNiFAST16: kotlin.String

expect val SCNiFAST32: kotlin.String

expect val SCNiFAST64: kotlin.String

expect val SCNiFAST8: kotlin.String

expect val SCNiLEAST16: kotlin.String

expect val SCNiLEAST32: kotlin.String

expect val SCNiLEAST64: kotlin.String

expect val SCNiLEAST8: kotlin.String

expect val SCNiMAX: kotlin.String

expect val SCNiPTR: kotlin.String

expect val SCNo16: kotlin.String

expect val SCNo32: kotlin.String

expect val SCNo64: kotlin.String

expect val SCNo8: kotlin.String

expect val SCNoFAST16: kotlin.String

expect val SCNoFAST32: kotlin.String

expect val SCNoFAST64: kotlin.String

expect val SCNoFAST8: kotlin.String

expect val SCNoLEAST16: kotlin.String

expect val SCNoLEAST32: kotlin.String

expect val SCNoLEAST64: kotlin.String

expect val SCNoLEAST8: kotlin.String

expect val SCNoMAX: kotlin.String

expect val SCNoPTR: kotlin.String

expect val SCNu16: kotlin.String

expect val SCNu32: kotlin.String

expect val SCNu64: kotlin.String

expect val SCNu8: kotlin.String

expect val SCNuFAST16: kotlin.String

expect val SCNuFAST32: kotlin.String

expect val SCNuFAST64: kotlin.String

expect val SCNuFAST8: kotlin.String

expect val SCNuLEAST16: kotlin.String

expect val SCNuLEAST32: kotlin.String

expect val SCNuLEAST64: kotlin.String

expect val SCNuLEAST8: kotlin.String

expect val SCNuMAX: kotlin.String

expect val SCNuPTR: kotlin.String

expect val SCNx16: kotlin.String

expect val SCNx32: kotlin.String

expect val SCNx64: kotlin.String

expect val SCNx8: kotlin.String

expect val SCNxFAST16: kotlin.String

expect val SCNxFAST32: kotlin.String

expect val SCNxFAST64: kotlin.String

expect val SCNxFAST8: kotlin.String

expect val SCNxLEAST16: kotlin.String

expect val SCNxLEAST32: kotlin.String

expect val SCNxLEAST64: kotlin.String

expect val SCNxLEAST8: kotlin.String

expect val SCNxMAX: kotlin.String

expect val SCNxPTR: kotlin.String

expect val X_TLOSS: kotlin.Double

expect var _CurrentRuneLocale: kotlinx.cinterop.CPointer<platform.posix._RuneLocale>?

expect val _DefaultRuneLocale: platform.posix._RuneLocale

expect val _FE_DFL_DISABLE_SSE_DENORMS_ENV: platform.posix.fenv_t

expect val _FE_DFL_ENV: platform.posix.fenv_t

expect val _MASTERPASSWD: kotlin.String

expect val _MP_DB: kotlin.String

expect val _PASSWD: kotlin.String

expect val _PATH_BSHELL: kotlin.String

expect val _PATH_CONSOLE: kotlin.String

expect val _PATH_CSHELL: kotlin.String

expect val _PATH_DATANAME: kotlin.String

expect val _PATH_DEFPATH: kotlin.String

expect val _PATH_DEFTAPE: kotlin.String

expect val _PATH_DEV: kotlin.String

expect val _PATH_DEVDB: kotlin.String

expect val _PATH_DEVNULL: kotlin.String

expect val _PATH_DRUM: kotlin.String

expect val _PATH_FORKSPECIFIER: kotlin.String

expect val _PATH_FSIRAND: kotlin.String

expect val _PATH_GROUP: kotlin.String

expect val _PATH_HEQUIV: kotlin.String

expect val _PATH_HOSTS: kotlin.String

expect val _PATH_KMEM: kotlin.String

expect val _PATH_KVMDB: kotlin.String

expect val _PATH_LOCALE: kotlin.String

expect val _PATH_LOG: kotlin.String

expect val _PATH_MAILDIR: kotlin.String

expect val _PATH_MAN: kotlin.String

expect val _PATH_MASTERPASSWD: kotlin.String

expect val _PATH_MASTERPASSWD_LOCK: kotlin.String

expect val _PATH_MEM: kotlin.String

expect val _PATH_MP_DB: kotlin.String

expect val _PATH_NETWORKS: kotlin.String

expect val _PATH_NOLOGIN: kotlin.String

expect val _PATH_PASSWD: kotlin.String

expect val _PATH_PROTOCOLS: kotlin.String

expect val _PATH_PWD: kotlin.String

expect val _PATH_PWD_MKDB: kotlin.String

expect val _PATH_RESCONF: kotlin.String

expect val _PATH_RSH: kotlin.String

expect val _PATH_RSRCFORKSPEC: kotlin.String

expect val _PATH_RSRCNAME: kotlin.String

expect val _PATH_SENDMAIL: kotlin.String

expect val _PATH_SERVICES: kotlin.String

expect val _PATH_SHELLS: kotlin.String

expect val _PATH_SMP_DB: kotlin.String

expect val _PATH_STDPATH: kotlin.String

expect val _PATH_TMP: kotlin.String

expect val _PATH_TTY: kotlin.String

expect val _PATH_UNIX: kotlin.String

expect val _PATH_UUCPLOCK: kotlin.String

expect val _PATH_VARDB: kotlin.String

expect val _PATH_VARRUN: kotlin.String

expect val _PATH_VARTMP: kotlin.String

expect val _PATH_VI: kotlin.String

expect val _RUNE_MAGIC_A: kotlin.String

expect val _SMP_DB: kotlin.String

expect val __DARWIN_SUF_EXTSN: kotlin.String

expect val __KAME_VERSION: kotlin.String

expect val __PRI_64_LENGTH_MODIFIER__: kotlin.String

expect val __PRI_8_LENGTH_MODIFIER__: kotlin.String

expect val __PRI_MAX_LENGTH_MODIFIER__: kotlin.String

expect val __SCN_64_LENGTH_MODIFIER__: kotlin.String

expect val __SCN_MAX_LENGTH_MODIFIER__: kotlin.String

expect var __mb_cur_max: kotlin.Int

expect var __stderrp: kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect var __stdinp: kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect var __stdoutp: kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect val _res: platform.posix.__res_9_state

expect var daylight: kotlin.Int

expect var getdate_err: kotlin.Int

expect var h_errno: kotlin.Int

expect val in6addr_any: platform.posix.in6_addr

expect val in6addr_linklocal_allnodes: platform.posix.in6_addr

expect val in6addr_linklocal_allrouters: platform.posix.in6_addr

expect val in6addr_loopback: platform.posix.in6_addr

expect val in6addr_nodelocal_allnodes: platform.posix.in6_addr

expect var opterr: kotlin.Int

expect var optind: kotlin.Int

expect var optopt: kotlin.Int

expect var optreset: kotlin.Int

expect var signgam: kotlin.Int

expect val sys_nerr: kotlin.Int

expect var timezone_: kotlin.Long

expect fun _Exit(/*0*/ arg0: kotlin.Int)

expect fun ___mb_cur_max(): kotlin.Int

expect fun __assert_rtn(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.String?)

expect fun __cospi(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun __cospif(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun __darwin_fd_isset(/*0*/ _n: kotlin.Int, /*1*/ _p: kotlinx.cinterop.CValuesRef<platform.posix.fd_set>?): kotlin.Int

expect fun __exp10(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun __exp10f(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun __fpclassifyd(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun __fpclassifyf(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun __inline_isfinited(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun __inline_isfinitef(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun __inline_isinfd(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun __inline_isinff(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun __inline_isnand(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun __inline_isnanf(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun __inline_isnormald(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun __inline_isnormalf(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun __inline_signbitd(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun __inline_signbitf(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun __math_errhandling(): kotlin.Int

expect fun __opendir2(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.DIR>?

expect fun __sigbits(/*0*/ __signo: kotlin.Int): kotlin.Int

expect fun __sincos_stret(/*0*/ arg0: kotlin.Double): kotlinx.cinterop.CValue<platform.posix.__double2>

expect fun __sincosf_stret(/*0*/ arg0: kotlin.Float): kotlinx.cinterop.CValue<platform.posix.__float2>

expect fun __sincospi_stret(/*0*/ arg0: kotlin.Double): kotlinx.cinterop.CValue<platform.posix.__double2>

expect fun __sincospif_stret(/*0*/ arg0: kotlin.Float): kotlinx.cinterop.CValue<platform.posix.__float2>

expect fun __sinpi(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun __sinpif(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun __sputc(/*0*/ _c: kotlin.Int, /*1*/ _p: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun __srget(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun __swbuf(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun __tanpi(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun __tanpif(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun _exit(/*0*/ arg0: kotlin.Int)

expect fun _res_9_h_errno_set(/*0*/ res: kotlinx.cinterop.CValuesRef<platform.posix.__res_9_state>?, /*1*/ err: kotlin.Int)

expect fun a64l(/*0*/ arg0: kotlin.String?): kotlin.Long

expect fun abort()

expect fun abs(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun access(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun acct(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun acl_delete_def_file(/*0*/ path_p: kotlin.String?): kotlin.Int

expect fun acl_free(/*0*/ obj_p: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun acos(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun acosf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun acosh(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun acoshf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun adjtime(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?): kotlin.Int

expect fun alarm(/*0*/ arg0: kotlin.UInt): kotlin.UInt

expect fun arc4random_stir()

expect fun asin(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun asinf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun asinh(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun asinhf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun atan(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun atan2(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun atan2f(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun atanf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun atanh(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun atanhf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun atexit(/*0*/ arg0: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> kotlin.Unit>>?): kotlin.Int

expect fun atof(/*0*/ arg0: kotlin.String?): kotlin.Double

expect fun atoi(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun atol(/*0*/ arg0: kotlin.String?): kotlin.Long

expect fun atoll(/*0*/ arg0: kotlin.String?): kotlin.Long

external expect fun atomic_flag_clear(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.atomic_flag>?)

external expect fun atomic_flag_test_and_set(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.atomic_flag>?): kotlin.Boolean

expect fun bindresvport(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.sockaddr_in>?): kotlin.Int

expect fun bindresvport_sa(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.sockaddr>?): kotlin.Int

expect fun bsd_signal(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?

expect fun cbrt(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun cbrtf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun ceil(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun ceilf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun cfmakeraw(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.termios>?)

expect fun cgetclose(): kotlin.Int

expect fun cgetmatch(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun cgetset(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun chdir(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun chroot(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun clearerr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?)

expect fun close(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun closedir(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.DIR>?): kotlin.Int

expect fun closelog()

expect fun copysign(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun copysignf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun cos(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun cosf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun cosh(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun coshf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun daemon(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun deinit_sockets()

expect fun digittoint(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun dirfd(/*0*/ dirp: kotlinx.cinterop.CValuesRef<platform.posix.DIR>?): kotlin.Int

expect fun div(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CValue<platform.posix.div_t>

expect fun dladdr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.Dl_info /* = platform.posix.dl_info */>?): kotlin.Int

expect fun dlclose(/*0*/ __handle: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun dlopen_preflight(/*0*/ __path: kotlin.String?): kotlin.Boolean

expect fun dprintf(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun drand48(): kotlin.Double

expect fun dup(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun dup2(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun endgrent()

expect fun endhostent()

expect fun endnetent()

expect fun endnetgrent()

expect fun endprotoent()

expect fun endpwent()

expect fun endrpcent()

expect fun endservent()

expect fun endusershell()

expect fun erf(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun erfc(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun erfcf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun erff(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun err(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun err_set_exit(/*0*/ arg0: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?)

expect fun err_set_file(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?)

expect fun errc(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.String?, /*3*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun errx(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun ether_aton(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.ether_addr>?

expect fun ether_hostton(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.ether_addr>?): kotlin.Int

expect fun exchangedata(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.UInt): kotlin.Int

expect fun execl(/*0*/ __path: kotlin.String?, /*1*/ __arg0: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun execle(/*0*/ __path: kotlin.String?, /*1*/ __arg0: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun execlp(/*0*/ __file: kotlin.String?, /*1*/ __arg0: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun exit(/*0*/ arg0: kotlin.Int)

expect fun exp(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun exp2(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun exp2f(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun expf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun expm1(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun expm1f(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun fabs(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun fabsf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun faccessat(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.Int): kotlin.Int

expect fun fchdir(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun fclose(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun fcntl(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun fdim(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun fdimf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun fdopen(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect fun fdopendir(/*0*/ arg0: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.DIR>?

expect fun feclearexcept(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun fegetenv(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.fenv_t>?): kotlin.Int

expect fun fegetround(): kotlin.Int

expect fun feholdexcept(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.fenv_t>?): kotlin.Int

expect fun feof(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun feraiseexcept(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun ferror(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun fesetenv(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.fenv_t>?): kotlin.Int

expect fun fesetround(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun fetestexcept(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun feupdateenv(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.fenv_t>?): kotlin.Int

expect fun fflush(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun ffs(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun ffsctl(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.ULong, /*2*/ arg2: kotlinx.cinterop.CValuesRef<*>?, /*3*/ arg3: kotlin.UInt): kotlin.Int

expect fun ffsl(/*0*/ arg0: kotlin.Long): kotlin.Int

expect fun ffsll(/*0*/ arg0: kotlin.Long): kotlin.Int

expect fun fgetc(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun fileno(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun flock(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun flockfile(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?)

expect fun floor(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun floorf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun fls(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun flsl(/*0*/ arg0: kotlin.Long): kotlin.Int

expect fun flsll(/*0*/ arg0: kotlin.Long): kotlin.Int

expect fun fma(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double, /*2*/ arg2: kotlin.Double): kotlin.Double

expect fun fmaf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float, /*2*/ arg2: kotlin.Float): kotlin.Float

expect fun fmax(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun fmaxf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun fmin(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun fminf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun fmod(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun fmodf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun fnmatch(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun fopen(/*0*/ __filename: kotlin.String?, /*1*/ __mode: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect fun fpathconf(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Long

expect fun fprintf(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun fpurge(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun fputc(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun fputs(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun free(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?)

expect fun freeaddrinfo(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.addrinfo>?)

expect fun freehostent(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.hostent>?)

expect fun freopen(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect fun fscanf(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun fsctl(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.ULong, /*2*/ arg2: kotlinx.cinterop.CValuesRef<*>?, /*3*/ arg3: kotlin.UInt): kotlin.Int

expect fun fseek(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?, /*1*/ arg1: kotlin.Long, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun fstat(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.stat>?): kotlin.Int

expect fun fstatat(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.stat>?, /*3*/ arg3: kotlin.Int): kotlin.Int

expect fun fsync(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun fsync_volume_np(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun ftell(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Long

expect fun ftrylockfile(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun fts_children(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FTS>?, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.FTSENT /* = platform.posix._ftsent */>?

expect fun fts_close(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FTS>?): kotlin.Int

expect fun fts_read(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FTS>?): kotlinx.cinterop.CPointer<platform.posix.FTSENT /* = platform.posix._ftsent */>?

expect fun fts_set(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FTS>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FTSENT /* = platform.posix._ftsent */>?, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun funlockfile(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?)

expect fun futimens(/*0*/ __fd: kotlin.Int, /*1*/ __times: kotlinx.cinterop.CValuesRef<platform.posix.timespec>?): kotlin.Int

expect fun futimes(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?): kotlin.Int

expect fun fwide(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun getc(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

external expect fun getc_unlocked(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun getchar(): kotlin.Int

expect fun getchar_unlocked(): kotlin.Int

expect fun getcontext(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.ucontext_t /* = platform.posix.__darwin_ucontext */>?): kotlin.Int

expect fun getdate(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.tm>?

expect fun getdtablesize(): kotlin.Int

expect fun getgrent(): kotlinx.cinterop.CPointer<platform.posix.group>?

expect fun getgrnam(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.group>?

expect fun gethostbyname(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.hostent>?

expect fun gethostbyname2(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.hostent>?

expect fun gethostent(): kotlinx.cinterop.CPointer<platform.posix.hostent>?

expect fun gethostid(): kotlin.Long

expect fun getiopolicy_np(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun getitimer(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.itimerval>?): kotlin.Int

expect fun getnetbyname(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.netent>?

expect fun getnetent(): kotlinx.cinterop.CPointer<platform.posix.netent>?

expect fun getpagesize(): kotlin.Int

expect fun getprotobyname(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.protoent>?

expect fun getprotobynumber(/*0*/ arg0: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.protoent>?

expect fun getprotoent(): kotlinx.cinterop.CPointer<platform.posix.protoent>?

expect fun getpwent(): kotlinx.cinterop.CPointer<platform.posix.passwd>?

expect fun getpwnam(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.passwd>?

expect fun getrlimit(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.rlimit>?): kotlin.Int

expect fun getrpcbyname(/*0*/ name: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.rpcent>?

expect fun getrpcbynumber(/*0*/ number: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.rpcent>?

expect fun getrpcent(): kotlinx.cinterop.CPointer<platform.posix.rpcent>?

expect fun getrusage(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.rusage>?): kotlin.Int

expect fun getservbyname(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.servent>?

expect fun getservbyport(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.servent>?

expect fun getservent(): kotlinx.cinterop.CPointer<platform.posix.servent>?

expect fun gettimeofday(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun getw(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun grantpt(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun hdestroy()

expect fun herror(/*0*/ arg0: kotlin.String?)

expect fun hsearch(/*0*/ arg0: kotlinx.cinterop.CValue<platform.posix.ENTRY /* = platform.posix.entry */>, /*1*/ arg1: platform.posix.ACTION): kotlinx.cinterop.CPointer<platform.posix.ENTRY /* = platform.posix.entry */>?

expect fun hypot(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun hypotf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun if_freenameindex(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.if_nameindex>?)

expect fun if_nameindex(): kotlinx.cinterop.CPointer<platform.posix.if_nameindex>?

expect fun if_nametoindex(/*0*/ arg0: kotlin.String?): kotlin.UInt

expect fun ilogb(/*0*/ arg0: kotlin.Double): kotlin.Int

expect fun ilogbf(/*0*/ arg0: kotlin.Float): kotlin.Int

expect fun inet6_option_space(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun inet6_rth_add(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.in6_addr>?): kotlin.Int

expect fun inet6_rth_getaddr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.in6_addr>?

expect fun inet6_rth_reverse(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun inet6_rth_segments(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun inet6_rthdr_add(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.cmsghdr>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.in6_addr>?, /*2*/ arg2: kotlin.UInt): kotlin.Int

expect fun inet6_rthdr_getaddr(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.cmsghdr>?, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.in6_addr>?

expect fun inet6_rthdr_getflags(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.cmsghdr>?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun inet6_rthdr_init(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlin.Int): kotlinx.cinterop.CPointer<platform.posix.cmsghdr>?

expect fun inet6_rthdr_lasthop(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.cmsghdr>?, /*1*/ arg1: kotlin.UInt): kotlin.Int

expect fun inet6_rthdr_segments(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.cmsghdr>?): kotlin.Int

expect fun init_sockets(): kotlin.Int

expect fun initgroups(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun innetgr(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.String?, /*3*/ arg3: kotlin.String?): kotlin.Int

expect fun insque(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?)

expect fun ioctl(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.ULong, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun iruserok(/*0*/ arg0: kotlin.ULong, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.String?, /*3*/ arg3: kotlin.String?): kotlin.Int

expect fun iruserok_sa(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.String?, /*4*/ arg4: kotlin.String?): kotlin.Int

expect fun isalnum(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isalpha(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isascii(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isatty(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun isblank(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun iscntrl(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isdigit(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isgraph(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun ishexnumber(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isideogram(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun islower(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isnumber(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isphonogram(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isprint(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun ispunct(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isrune(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun issetugid(): kotlin.Int

expect fun isspace(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isspecial(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isupper(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun isxdigit(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun j0(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun j1(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun jn(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun labs(/*0*/ arg0: kotlin.Long): kotlin.Long

expect fun ldexp(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Int): kotlin.Double

expect fun ldexpf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Int): kotlin.Float

expect fun ldiv(/*0*/ arg0: kotlin.Long, /*1*/ arg1: kotlin.Long): kotlinx.cinterop.CValue<platform.posix.ldiv_t>

expect fun lgamma(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun lgammaf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun link(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun linkat(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.String?, /*4*/ arg4: kotlin.Int): kotlin.Int

expect fun listen(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun llabs(/*0*/ arg0: kotlin.Long): kotlin.Long

expect fun lldiv(/*0*/ arg0: kotlin.Long, /*1*/ arg1: kotlin.Long): kotlinx.cinterop.CValue<platform.posix.lldiv_t>

expect fun llrint(/*0*/ arg0: kotlin.Double): kotlin.Long

expect fun llrintf(/*0*/ arg0: kotlin.Float): kotlin.Long

expect fun llround(/*0*/ arg0: kotlin.Double): kotlin.Long

expect fun llroundf(/*0*/ arg0: kotlin.Float): kotlin.Long

expect fun localeconv(): kotlinx.cinterop.CPointer<platform.posix.lconv>?

expect fun log(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun log10(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun log10f(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun log1p(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun log1pf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun log2(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun log2f(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun logb(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun logbf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun logf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun longjmperror()

expect fun lrand48(): kotlin.Long

expect fun lrint(/*0*/ arg0: kotlin.Double): kotlin.Long

expect fun lrintf(/*0*/ arg0: kotlin.Float): kotlin.Long

expect fun lround(/*0*/ arg0: kotlin.Double): kotlin.Long

expect fun lroundf(/*0*/ arg0: kotlin.Float): kotlin.Long

expect fun lstat(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.stat>?): kotlin.Int

expect fun lutimes(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?): kotlin.Int

expect fun makecontext(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.ucontext_t /* = platform.posix.__darwin_ucontext */>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?, /*2*/ arg2: kotlin.Int, /*3*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun mlockall(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun mrand48(): kotlin.Long

expect fun munlockall(): kotlin.Int

expect fun nan(/*0*/ arg0: kotlin.String?): kotlin.Double

expect fun nanf(/*0*/ arg0: kotlin.String?): kotlin.Float

expect fun nanosleep(/*0*/ __rqtp: kotlinx.cinterop.CValuesRef<platform.posix.timespec>?, /*1*/ __rmtp: kotlinx.cinterop.CValuesRef<platform.posix.timespec>?): kotlin.Int

expect fun nearbyint(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun nearbyintf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun nextafter(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun nextafterf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun nfssvc(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun nice(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun open(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun open_dprotected_np(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.Int, /*4*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun opendir(/*0*/ arg0: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.DIR>?

expect fun openlog(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.Int)

expect fun pathconf(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlin.Long

expect fun pause(): kotlin.Int

expect fun pclose(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun perror(/*0*/ arg0: kotlin.String?)

expect fun popen(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect fun posix_errno(): kotlin.Int

expect fun posix_h_errno(): kotlin.Int

expect fun posix_openpt(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun pow(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun powf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun printf(/*0*/ arg0: kotlin.String?, /*1*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun psignal(/*0*/ arg0: kotlin.UInt, /*1*/ arg1: kotlin.String?)

expect fun pthread_atfork(/*0*/ arg0: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> kotlin.Unit>>?, /*1*/ arg1: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> kotlin.Unit>>?, /*2*/ arg2: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> kotlin.Unit>>?): kotlin.Int

expect fun pthread_exit(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?)

expect fun pthread_getconcurrency(): kotlin.Int

expect fun pthread_setconcurrency(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun pthread_testcancel()

expect fun putc(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun putc_unlocked(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun putchar(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun putchar_unlocked(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun puts(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun putw(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun raise(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun rand(): kotlin.Int

expect fun random(): kotlin.Long

expect fun readdir(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.DIR>?): kotlinx.cinterop.CPointer<platform.posix.dirent>?

expect fun reboot(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun regcomp(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.regex_t>?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun regfree(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.regex_t>?)

expect fun remainder(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun remainderf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Float): kotlin.Float

expect fun remove(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun remque(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?)

expect fun rename(/*0*/ __old: kotlin.String?, /*1*/ __new: kotlin.String?): kotlin.Int

expect fun renameat(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.String?): kotlin.Int

expect fun renameatx_np(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int, /*3*/ arg3: kotlin.String?, /*4*/ arg4: kotlin.UInt): kotlin.Int

expect fun renamex_np(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.UInt): kotlin.Int

expect fun res_9_close()

expect fun res_9_dn_count_labels(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun res_9_dnok(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun res_9_hnok(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun res_9_init(): kotlin.Int

expect fun res_9_isourserver(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.sockaddr_in>?): kotlin.Int

expect fun res_9_mailok(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun res_9_ns_msg_getflag(/*0*/ arg0: kotlinx.cinterop.CValue<platform.posix.res_9_ns_msg /* = platform.posix.__ns_msg */>, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun res_9_ns_samedomain(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun res_9_ns_samename(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun res_9_ns_subdomain(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun res_9_ownok(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun res_buildprotolist()

expect fun res_destroyprotolist()

expect fun res_destroyservicelist()

expect fun revoke(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun rewind(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?)

expect fun rewinddir(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.DIR>?)

expect fun rint(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun rintf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun rmdir(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun round(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun roundf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun ruserok(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.String?, /*3*/ arg3: kotlin.String?): kotlin.Int

expect fun scalb(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Double): kotlin.Double

expect fun scalbln(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Long): kotlin.Double

expect fun scalblnf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Long): kotlin.Float

expect fun scalbn(/*0*/ arg0: kotlin.Double, /*1*/ arg1: kotlin.Int): kotlin.Double

expect fun scalbnf(/*0*/ arg0: kotlin.Float, /*1*/ arg1: kotlin.Int): kotlin.Float

expect fun scanf(/*0*/ arg0: kotlin.String?, /*1*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun sched_get_priority_max(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sched_get_priority_min(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sched_yield(): kotlin.Int

expect fun seekdir(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.DIR>?, /*1*/ arg1: kotlin.Long)

expect fun select(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.fd_set>?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.fd_set>?, /*3*/ arg3: kotlinx.cinterop.CValuesRef<platform.posix.fd_set>?, /*4*/ arg4: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?): kotlin.Int

expect fun sem_unlink(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun set_posix_errno(/*0*/ value: kotlin.Int)

expect fun set_posix_h_errno(/*0*/ value: kotlin.Int)

expect fun setcontext(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.ucontext_t /* = platform.posix.__darwin_ucontext */>?): kotlin.Int

expect fun setdomainname(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun setenv(/*0*/ __name: kotlin.String?, /*1*/ __value: kotlin.String?, /*2*/ __overwrite: kotlin.Int): kotlin.Int

expect fun setgrent()

expect fun sethostent(/*0*/ arg0: kotlin.Int)

expect fun sethostid(/*0*/ arg0: kotlin.Long)

expect fun sethostname(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun setiopolicy_np(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun setitimer(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.itimerval>?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.itimerval>?): kotlin.Int

expect fun setkey(/*0*/ arg0: kotlin.String?)

expect fun setlinebuf(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun setlogin(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun setlogmask(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun setnetent(/*0*/ arg0: kotlin.Int)

expect fun setnetgrent(/*0*/ arg0: kotlin.String?)

expect fun setprogname(/*0*/ arg0: kotlin.String?)

expect fun setprotoent(/*0*/ arg0: kotlin.Int)

expect fun setpwent()

expect fun setrlimit(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.rlimit>?): kotlin.Int

expect fun setrpcent(/*0*/ stayopen: kotlin.Int)

expect fun setservent(/*0*/ arg0: kotlin.Int)

expect fun settimeofday(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.timezone>?): kotlin.Int

expect fun setusershell()

expect fun shm_open(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun shm_unlink(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun shmctl(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.__shmid_ds_new>?): kotlin.Int

expect fun shmdt(/*0*/ arg0: kotlinx.cinterop.CValuesRef<*>?): kotlin.Int

expect fun shmsys(/*0*/ arg0: kotlin.Int, /*1*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun shutdown(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun sigaction(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.sigaction>?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.sigaction>?): kotlin.Int

expect fun sigaltstack(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.stack_t /* = platform.posix.__darwin_sigaltstack */>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.stack_t /* = platform.posix.__darwin_sigaltstack */>?): kotlin.Int

expect fun sigblock(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sighold(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sigignore(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun siginterrupt(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun signal(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?

expect fun sigpause(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sigrelse(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sigset(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?): kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(kotlin.Int) -> kotlin.Unit>>?

expect fun sigsetmask(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun sigvec(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.sigvec>?, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.sigvec>?): kotlin.Int

expect fun sin(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun sinf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun sinh(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun sinhf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun sleep(/*0*/ arg0: kotlin.UInt): kotlin.UInt

expect fun sockatmark(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun socket(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun sqrt(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun sqrtf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun srand(/*0*/ arg0: kotlin.UInt)

expect fun srand48(/*0*/ arg0: kotlin.Long)

expect fun sranddev()

expect fun srandom(/*0*/ arg0: kotlin.UInt)

expect fun srandomdev()

expect fun sscanf(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun stat(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.stat>?): kotlin.Int

expect fun strcasecmp(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun strcmp(/*0*/ __s1: kotlin.String?, /*1*/ __s2: kotlin.String?): kotlin.Int

expect fun strcoll(/*0*/ __s1: kotlin.String?, /*1*/ __s2: kotlin.String?): kotlin.Int

expect fun strcspn(/*0*/ __s: kotlin.String?, /*1*/ __charset: kotlin.String?): kotlin.ULong

expect fun strlen(/*0*/ __s: kotlin.String?): kotlin.ULong

expect fun strspn(/*0*/ __s: kotlin.String?, /*1*/ __charset: kotlin.String?): kotlin.ULong

expect fun swapcontext(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.ucontext_t /* = platform.posix.__darwin_ucontext */>?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.ucontext_t /* = platform.posix.__darwin_ucontext */>?): kotlin.Int

expect fun swapon(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun symlink(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.String?): kotlin.Int

expect fun symlinkat(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlin.String?): kotlin.Int

expect fun sync()

expect fun sync_volume_np(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun syscall(/*0*/ arg0: kotlin.Int, /*1*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/): kotlin.Int

expect fun sysconf(/*0*/ arg0: kotlin.Int): kotlin.Long

expect fun syslog(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun tan(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun tanf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun tanh(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun tanhf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun tcdrain(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun tcflow(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun tcflush(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun tcgetattr(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.termios>?): kotlin.Int

expect fun tcsendbreak(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int): kotlin.Int

expect fun tcsetattr(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Int, /*2*/ arg2: kotlinx.cinterop.CValuesRef<platform.posix.termios>?): kotlin.Int

expect fun telldir(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.DIR>?): kotlin.Long

expect fun tgamma(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun tgammaf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun tmpfile(): kotlinx.cinterop.CPointer<platform.posix.FILE /* = platform.posix.__sFILE */>?

expect fun toascii(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun tolower(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun toupper(/*0*/ _c: kotlin.Int): kotlin.Int

expect fun trunc(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun truncf(/*0*/ arg0: kotlin.Float): kotlin.Float

expect fun ttyslot(): kotlin.Int

expect fun tzset()

expect fun tzsetwall()

expect fun uname(/*0*/ arg0: kotlinx.cinterop.CValuesRef<platform.posix.utsname>?): kotlin.Int

expect fun undelete(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun ungetc(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.FILE /* = platform.posix.__sFILE */>?): kotlin.Int

expect fun unlink(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun unlinkat(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ arg2: kotlin.Int): kotlin.Int

expect fun unlockpt(/*0*/ arg0: kotlin.Int): kotlin.Int

expect fun unsetenv(/*0*/ arg0: kotlin.String?): kotlin.Int

expect fun utime(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.utimbuf>?): kotlin.Int

expect fun utimensat(/*0*/ __fd: kotlin.Int, /*1*/ __path: kotlin.String?, /*2*/ __times: kotlinx.cinterop.CValuesRef<platform.posix.timespec>?, /*3*/ __flag: kotlin.Int): kotlin.Int

expect fun utimes(/*0*/ arg0: kotlin.String?, /*1*/ arg1: kotlinx.cinterop.CValuesRef<platform.posix.timeval>?): kotlin.Int

expect fun vfork(): kotlin.Int

expect fun warn(/*0*/ arg0: kotlin.String?, /*1*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun warnc(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.String?, /*2*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun warnx(/*0*/ arg0: kotlin.String?, /*1*/ vararg variadicArguments: kotlin.Any? /*kotlin.Array<out kotlin.Any?>*/)

expect fun y0(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun y1(/*0*/ arg0: kotlin.Double): kotlin.Double

expect fun yn(/*0*/ arg0: kotlin.Int, /*1*/ arg1: kotlin.Double): kotlin.Double


