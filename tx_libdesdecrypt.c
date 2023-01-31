#include <defs.h>

int sub_E30();
int __fastcall makedata(int *a1, int *a2, int a3);
int __fastcall handle_data(int *a1, int a2);
int __fastcall makekey(int *a1, int *a2, int a3);
int __fastcall makefirstkey(void *src); // idb
int Ddes(int a1, const char *a2, int a3, ...);
int __fastcall DdesN(int a1, int a2, int a3, int a4);
int des(int a1, const char *a2, int a3, ...);
int __fastcall desN(int a1, const char **a2, int a3, int a4);
int __fastcall Ddes3(int a1, void *a2, int a3, unsigned int a4);
int __fastcall des3(int a1, void *a2, int a3, unsigned int a4);
int __fastcall Java_com_tencent_qqmusic_business_lyricnew_QRCDesDecrypt_desDecrypt(int a1, int a2, int a3, int a4);
int __fastcall sub_1750(int *a1);
signed int __fastcall sub_1768(_DWORD *a1, int a2);
__int64 *__fastcall sub_193C(__int64 *result);
signed int __fastcall sub_19A8(int a1, int a2, signed int a3);
signed int __fastcall sub_1ABC(int a1, int a2, int a3, int a4, unsigned int a5);
signed int __fastcall Unwind_VRS_Get(int a1, unsigned int a2, unsigned int a3, int a4, unsigned int a5);
int __fastcall sub_1B58(int a1, unsigned int a2, int a3, int a4);
signed int __fastcall Unwind_VRS_Set(signed int result, _DWORD *a2, unsigned int a3, int a4, _DWORD *a5);
signed int __fastcall sub_1BC4(signed int a1, unsigned int a2, int a3);
signed int __fastcall sub_1BF0(char a1, _DWORD *a2, unsigned int *a3, int a4);
signed int __fastcall _aeabi_unwind_cpp_pr2(char a1, _DWORD *a2, unsigned int *a3);
signed int __fastcall _aeabi_unwind_cpp_pr1(char a1, _DWORD *a2, unsigned int *a3);
signed int __fastcall _aeabi_unwind_cpp_pr0(char a1, _DWORD *a2, unsigned int *a3);
signed int __fastcall Unwind_VRS_Pop(unsigned int *a1, int a2, unsigned int a3, int a4);
int __fastcall Unwind_GetCFA(int a1);
signed int __fastcall _gnu_Unwind_RaiseException(int a1, _DWORD *a2);
signed int __fastcall _gnu_Unwind_ForcedUnwind(int a1, int a2, int a3, int a4);
void __fastcall __noreturn _gnu_Unwind_Resume(int a1, int a2, int a3, unsigned int a4);
signed int __fastcall _gnu_Unwind_Resume_or_Rethrow(int a1, _DWORD *a2);
int __fastcall Unwind_DeleteException(int result);
signed int __fastcall _gnu_Unwind_Backtrace(int (__fastcall *a1)(int *, int), int a2, _DWORD *a3);
void __fastcall restore_core_regs(int *a1);
__int64 *__fastcall _gnu_Unwind_Restore_VFP(__int64 *result);
_QWORD *__fastcall _gnu_Unwind_Save_VFP(_QWORD *result);
__int64 *__fastcall _gnu_Unwind_Restore_VFP_D(__int64 *result);
_QWORD *__fastcall _gnu_Unwind_Save_VFP_D(_QWORD *result);
__int64 *__fastcall _gnu_Unwind_Restore_VFP_D_16_to_31(__int64 *result);
_QWORD *__fastcall _gnu_Unwind_Save_VFP_D_16_to_31(_QWORD *result);
int __fastcall _gnu_Unwind_Restore_WMMXD(int *a1);
void _gnu_Unwind_Save_WMMXD();
int __fastcall _gnu_Unwind_Restore_WMMXC(int *a1);
void _gnu_Unwind_Save_WMMXC();
signed int __fastcall __Unwind_RaiseException(int a1, int a2, int a3, int a4);
void __fastcall __noreturn __Unwind_Resume(int a1, int a2, int a3, int a4);
signed int __fastcall __noreturn __Unwind_Resume_or_Rethrow(int a1, int a2, int a3, int a4);
signed int __fastcall __Unwind_ForcedUnwind(int a1, int a2, int a3, int a4);
signed int __fastcall __Unwind_Backtrace(int (__fastcall *a1)(int *, int), int a2, int a3, int a4);
signed int __fastcall sub_26D4(unsigned int *a1);
signed int __fastcall _gnu_unwind_execute(unsigned int *a1, unsigned int *a2, int a3, int a4);
signed int __fastcall _gnu_unwind_frame(int a1, unsigned int *a2, int a3, int a4);
int __fastcall Unwind_GetRegionStart(int a1, int a2, int a3, int a4);
int __fastcall Unwind_GetLanguageSpecificData(int a1, int a2, int a3, int a4);
void __noreturn Unwind_GetDataRelBase();
void __noreturn Unwind_GetTextRelBase();

//-------------------------------------------------------------------------
// Data declarations

_UNKNOWN unk_2BA4; // weak
int dword_2CB0[64] =
{
  2147483648,
  1073741824,
  536870912,
  268435456,
  134217728,
  67108864,
  33554432,
  16777216,
  8388608,
  4194304,
  2097152,
  1048576,
  524288,
  262144,
  131072,
  65536,
  32768,
  16384,
  8192,
  4096,
  2048,
  1024,
  512,
  256,
  128,
  64,
  32,
  16,
  8,
  4,
  2,
  1,
  2147483648,
  1073741824,
  536870912,
  268435456,
  134217728,
  67108864,
  33554432,
  16777216,
  8388608,
  4194304,
  2097152,
  1048576,
  524288,
  262144,
  131072,
  65536,
  32768,
  16384,
  8192,
  4096,
  2048,
  1024,
  512,
  256,
  128,
  64,
  32,
  16,
  8,
  4,
  2,
  1
}; // idb
unsigned __int8 byte_2DB0[856] =
{
  32u,
  1u,
  2u,
  3u,
  4u,
  5u,
  4u,
  5u,
  6u,
  7u,
  8u,
  9u,
  8u,
  9u,
  10u,
  11u,
  12u,
  13u,
  12u,
  13u,
  14u,
  15u,
  16u,
  17u,
  16u,
  17u,
  18u,
  19u,
  20u,
  21u,
  20u,
  21u,
  22u,
  23u,
  24u,
  25u,
  24u,
  25u,
  26u,
  27u,
  28u,
  29u,
  28u,
  29u,
  30u,
  31u,
  32u,
  1u,
  14u,
  0u,
  4u,
  15u,
  13u,
  7u,
  1u,
  4u,
  2u,
  14u,
  15u,
  2u,
  11u,
  13u,
  8u,
  1u,
  3u,
  10u,
  10u,
  6u,
  6u,
  12u,
  12u,
  11u,
  5u,
  9u,
  9u,
  5u,
  0u,
  3u,
  7u,
  8u,
  4u,
  15u,
  1u,
  12u,
  14u,
  8u,
  8u,
  2u,
  13u,
  4u,
  6u,
  9u,
  2u,
  1u,
  11u,
  7u,
  15u,
  5u,
  12u,
  11u,
  9u,
  3u,
  7u,
  14u,
  3u,
  10u,
  10u,
  0u,
  5u,
  6u,
  0u,
  13u,
  15u,
  3u,
  1u,
  13u,
  8u,
  4u,
  14u,
  7u,
  6u,
  15u,
  11u,
  2u,
  3u,
  8u,
  4u,
  15u,
  9u,
  12u,
  7u,
  0u,
  2u,
  1u,
  13u,
  10u,
  12u,
  6u,
  0u,
  9u,
  5u,
  11u,
  10u,
  5u,
  0u,
  13u,
  14u,
  8u,
  7u,
  10u,
  11u,
  1u,
  10u,
  3u,
  4u,
  15u,
  13u,
  4u,
  1u,
  2u,
  5u,
  11u,
  8u,
  6u,
  12u,
  7u,
  6u,
  12u,
  9u,
  0u,
  3u,
  5u,
  2u,
  14u,
  15u,
  9u,
  10u,
  13u,
  0u,
  7u,
  9u,
  0u,
  14u,
  9u,
  6u,
  3u,
  3u,
  4u,
  15u,
  6u,
  5u,
  10u,
  1u,
  2u,
  13u,
  8u,
  12u,
  5u,
  7u,
  14u,
  11u,
  12u,
  4u,
  11u,
  2u,
  15u,
  8u,
  1u,
  13u,
  1u,
  6u,
  10u,
  4u,
  13u,
  9u,
  0u,
  8u,
  6u,
  15u,
  9u,
  3u,
  8u,
  0u,
  7u,
  11u,
  4u,
  1u,
  15u,
  2u,
  14u,
  12u,
  3u,
  5u,
  11u,
  10u,
  5u,
  14u,
  2u,
  7u,
  12u,
  7u,
  13u,
  13u,
  8u,
  14u,
  11u,
  3u,
  5u,
  0u,
  6u,
  6u,
  15u,
  9u,
  0u,
  10u,
  3u,
  1u,
  4u,
  2u,
  7u,
  8u,
  2u,
  5u,
  12u,
  11u,
  1u,
  12u,
  10u,
  4u,
  14u,
  15u,
  9u,
  10u,
  3u,
  6u,
  15u,
  9u,
  0u,
  0u,
  6u,
  12u,
  10u,
  11u,
  10u,
  7u,
  13u,
  13u,
  8u,
  15u,
  9u,
  1u,
  4u,
  3u,
  5u,
  14u,
  11u,
  5u,
  12u,
  2u,
  7u,
  8u,
  2u,
  4u,
  14u,
  2u,
  14u,
  12u,
  11u,
  4u,
  2u,
  1u,
  12u,
  7u,
  4u,
  10u,
  7u,
  11u,
  13u,
  6u,
  1u,
  8u,
  5u,
  5u,
  0u,
  3u,
  15u,
  15u,
  10u,
  13u,
  3u,
  0u,
  9u,
  14u,
  8u,
  9u,
  6u,
  4u,
  11u,
  2u,
  8u,
  1u,
  12u,
  11u,
  7u,
  10u,
  1u,
  13u,
  14u,
  7u,
  2u,
  8u,
  13u,
  15u,
  6u,
  9u,
  15u,
  12u,
  0u,
  5u,
  9u,
  6u,
  10u,
  3u,
  4u,
  0u,
  5u,
  14u,
  3u,
  12u,
  10u,
  1u,
  15u,
  10u,
  4u,
  15u,
  2u,
  9u,
  7u,
  2u,
  12u,
  6u,
  9u,
  8u,
  5u,
  0u,
  6u,
  13u,
  1u,
  3u,
  13u,
  4u,
  14u,
  14u,
  0u,
  7u,
  11u,
  5u,
  3u,
  11u,
  8u,
  9u,
  4u,
  14u,
  3u,
  15u,
  2u,
  5u,
  12u,
  2u,
  9u,
  8u,
  5u,
  12u,
  15u,
  3u,
  10u,
  7u,
  11u,
  0u,
  14u,
  4u,
  1u,
  10u,
  7u,
  1u,
  6u,
  13u,
  0u,
  11u,
  8u,
  6u,
  13u,
  4u,
  13u,
  11u,
  0u,
  2u,
  11u,
  14u,
  7u,
  15u,
  4u,
  0u,
  9u,
  8u,
  1u,
  13u,
  10u,
  3u,
  14u,
  12u,
  3u,
  9u,
  5u,
  7u,
  12u,
  5u,
  2u,
  10u,
  15u,
  6u,
  8u,
  1u,
  6u,
  1u,
  6u,
  4u,
  11u,
  11u,
  13u,
  13u,
  8u,
  12u,
  1u,
  3u,
  4u,
  7u,
  10u,
  14u,
  7u,
  10u,
  9u,
  15u,
  5u,
  6u,
  0u,
  8u,
  15u,
  0u,
  14u,
  5u,
  2u,
  9u,
  3u,
  2u,
  12u,
  13u,
  1u,
  2u,
  15u,
  8u,
  13u,
  4u,
  8u,
  6u,
  10u,
  15u,
  3u,
  11u,
  7u,
  1u,
  4u,
  10u,
  12u,
  9u,
  5u,
  3u,
  6u,
  14u,
  11u,
  5u,
  0u,
  0u,
  14u,
  12u,
  9u,
  7u,
  2u,
  7u,
  2u,
  11u,
  1u,
  4u,
  14u,
  1u,
  7u,
  9u,
  4u,
  12u,
  10u,
  14u,
  8u,
  2u,
  13u,
  0u,
  15u,
  6u,
  12u,
  10u,
  9u,
  13u,
  0u,
  15u,
  3u,
  3u,
  5u,
  5u,
  6u,
  8u,
  11u,
  16u,
  7u,
  20u,
  21u,
  29u,
  12u,
  28u,
  17u,
  1u,
  15u,
  23u,
  26u,
  5u,
  18u,
  31u,
  10u,
  2u,
  8u,
  24u,
  14u,
  32u,
  27u,
  3u,
  9u,
  19u,
  13u,
  30u,
  6u,
  22u,
  11u,
  4u,
  25u,
  58u,
  50u,
  42u,
  34u,
  26u,
  18u,
  10u,
  2u,
  60u,
  52u,
  44u,
  36u,
  28u,
  20u,
  12u,
  4u,
  62u,
  54u,
  46u,
  38u,
  30u,
  22u,
  14u,
  6u,
  64u,
  56u,
  48u,
  40u,
  32u,
  24u,
  16u,
  8u,
  57u,
  49u,
  41u,
  33u,
  25u,
  17u,
  9u,
  1u,
  59u,
  51u,
  43u,
  35u,
  27u,
  19u,
  11u,
  3u,
  61u,
  53u,
  45u,
  37u,
  29u,
  21u,
  13u,
  5u,
  63u,
  55u,
  47u,
  39u,
  31u,
  23u,
  15u,
  7u,
  40u,
  8u,
  48u,
  16u,
  56u,
  24u,
  64u,
  32u,
  39u,
  7u,
  47u,
  15u,
  55u,
  23u,
  63u,
  31u,
  38u,
  6u,
  46u,
  14u,
  54u,
  22u,
  62u,
  30u,
  37u,
  5u,
  45u,
  13u,
  53u,
  21u,
  61u,
  29u,
  36u,
  4u,
  44u,
  12u,
  52u,
  20u,
  60u,
  28u,
  35u,
  3u,
  43u,
  11u,
  51u,
  19u,
  59u,
  27u,
  34u,
  2u,
  42u,
  10u,
  50u,
  18u,
  58u,
  26u,
  33u,
  1u,
  41u,
  9u,
  49u,
  17u,
  57u,
  25u,
  1u,
  1u,
  2u,
  2u,
  2u,
  2u,
  2u,
  2u,
  1u,
  2u,
  2u,
  2u,
  2u,
  2u,
  2u,
  1u,
  0u,
  0u,
  0u,
  0u,
  0u,
  0u,
  0u,
  128u,
  0u,
  0u,
  0u,
  192u,
  14u,
  17u,
  11u,
  24u,
  1u,
  5u,
  3u,
  28u,
  15u,
  6u,
  21u,
  10u,
  23u,
  19u,
  12u,
  4u,
  26u,
  8u,
  16u,
  7u,
  27u,
  20u,
  13u,
  2u,
  41u,
  52u,
  31u,
  37u,
  47u,
  55u,
  30u,
  40u,
  51u,
  45u,
  33u,
  48u,
  44u,
  49u,
  39u,
  56u,
  34u,
  53u,
  46u,
  42u,
  50u,
  36u,
  29u,
  32u,
  57u,
  49u,
  41u,
  33u,
  25u,
  17u,
  9u,
  1u,
  58u,
  50u,
  42u,
  34u,
  26u,
  18u,
  10u,
  2u,
  59u,
  51u,
  43u,
  35u,
  27u,
  19u,
  11u,
  3u,
  60u,
  52u,
  44u,
  36u,
  63u,
  55u,
  47u,
  39u,
  31u,
  23u,
  15u,
  7u,
  62u,
  54u,
  46u,
  38u,
  30u,
  22u,
  14u,
  6u,
  61u,
  53u,
  45u,
  37u,
  29u,
  21u,
  13u,
  5u,
  28u,
  20u,
  12u,
  4u,
  0u,
  0u,
  0u,
  0u
}; // idb
int (*_aeabi_unwind_cpp_pr1_ptr[2])() = { &_aeabi_unwind_cpp_pr1, &_aeabi_unwind_cpp_pr2 }; // weak
int (*_aeabi_unwind_cpp_pr2_ptr)() = &_aeabi_unwind_cpp_pr2; // weak
_UNKNOWN unk_5000; // weak
int g_bufkey; // weak
int dword_5008; // weak
_DWORD g_outkey[32]; // idb
// extern _UNKNOWN __gnu_Unwind_Find_exidx; weak
// extern _UNKNOWN _cxa_call_unexpected; weak


//----- (00000E30) --------------------------------------------------------
int sub_E30()
{
  return _cxa_finalize(&unk_5000);
}
// DBC: using guessed type int __fastcall _cxa_finalize(_DWORD);

//----- (00000E40) --------------------------------------------------------
int __fastcall makedata(int *a1, int *a2, int a3)
{
  signed int v3; // r4
  int v4; // r12
  int v5; // r6
  int *v6; // r7
  int v7; // r5
  int v8; // r9
  int v9; // r9
  bool v10; // zf
  int v11; // r4
  unsigned int v12; // r5
  unsigned int v13; // r6
  int v14; // r10
  char v15; // r8
  int v16; // r11
  unsigned int v17; // r5
  int i; // r2
  int v19; // r5
  int v20; // r7
  int v21; // r2
  int v22; // r4
  int v23; // r6
  bool v24; // zf
  int v26; // [sp+14h] [bp-34h]
  int v27; // [sp+18h] [bp-30h]

  v3 = 0;
  v4 = *a2;
  v5 = 0;
  v26 = 0;
  v27 = 0;
  v6 = dword_2CB0;
  v7 = 0;
  do
  {
    while ( v3 > 23 )
    {
      v8 = byte_2DB0[v3++];
      v9 = dword_2CB0[v8 - 1];
      v10 = (v4 & v9) == 0;
      if ( v4 & v9 )
        v9 = *(v6 - 24);
      ++v6;
      if ( !v10 )
        v5 |= v9;
      if ( v3 == 48 )
        goto LABEL_11;
    }
    if ( v4 & dword_2CB0[byte_2DB0[v3] - 1] )
      v7 |= *v6;
    ++v3;
    ++v6;
  }
  while ( v3 != 48 );
LABEL_11:
  v11 = 0;
  v12 = v7 ^ g_outkey[2 * a3];
  v13 = v5 ^ g_outkey[2 * a3 + 1];
  LOBYTE(v27) = v13 >> 26;
  v14 = (v12 >> 20) & 0x3F;
  v15 = BYTE1(v12) & 0x3F;
  v16 = (v12 >> 14) & 0x3F;
  v17 = v12 >> 26;
  BYTE2(v27) = (v13 >> 14) & 0x3F;
  HIBYTE(v27) = BYTE1(v13) & 0x3F;
  BYTE1(v27) = (v13 >> 20) & 0x3F;
  HIBYTE(v26) = v15;
  BYTE2(v26) = v16;
  BYTE1(v26) = v14;
  LOBYTE(v26) = v17;
  for ( i = 0; ; v17 = *((unsigned __int8 *)&v26 + i) )
  {
    v19 = *((unsigned __int8 *)&dword_2CB0[16 * i++ + 76] + v17);
    v11 = 16 * (v19 | v11);
    if ( i == 7 )
      break;
  }
  v20 = 0;
  v21 = 0;
  v22 = v11 | *((unsigned __int8 *)&dword_2CB0[188] + (BYTE1(v13) & 0x3F));
  do
  {
    v23 = dword_2CB0[byte_2DB0[v21 + 560] - 1];
    v24 = (v22 & v23) == 0;
    if ( v22 & v23 )
      v23 = dword_2CB0[v21];
    ++v21;
    if ( !v24 )
      v20 |= v23;
  }
  while ( v21 != 32 );
  *a2 = v20;
  *a2 = v20 ^ *a1;
  *a1 = v4;
  return 0;
}

//----- (00001034) --------------------------------------------------------
int __fastcall handle_data(int *a1, int a2)
{
  int v2; // r3
  int *v3; // r4
  int *v4; // r6
  int v5; // r10
  int v6; // r12
  signed int v7; // r2
  unsigned int v8; // r0
  int v9; // r5
  unsigned int v10; // r0
  int v11; // r5
  int v12; // r5
  int v13; // r2
  int v14; // r6
  int v15; // r7
  signed int v16; // r3
  unsigned int v17; // r1
  bool v18; // cf
  bool v19; // zf
  int v20; // r1
  unsigned int v21; // r1
  int v22; // r1
  int v24; // r2
  signed int v25; // r5
  int v26; // r2

  v2 = 0;
  v3 = a1;
  v4 = a1 + 1;
  v5 = 0;
  v6 = 0;
  v7 = 0;
  do
  {
    while ( v7 <= 31 )
    {
      v8 = byte_2DB0[v7 + 592];
      v9 = dword_2CB0[v8 - 1];
      if ( v8 <= 0x20 )
      {
        if ( !(v9 & *v3) )
          goto LABEL_5;
LABEL_4:
        v6 |= dword_2CB0[v2];
        goto LABEL_5;
      }
      if ( v9 & v3[1] )
        goto LABEL_4;
LABEL_5:
      ++v7;
      ++v2;
      if ( v7 == 64 )
        goto LABEL_10;
    }
    v10 = byte_2DB0[v7 + 592];
    v11 = dword_2CB0[v10 - 1];
    if ( v10 > 0x20 )
    {
      if ( v11 & v3[1] )
        goto LABEL_9;
      goto LABEL_5;
    }
    if ( !(v11 & *v3) )
      goto LABEL_5;
LABEL_9:
    ++v7;
    v5 |= dword_2CB0[v2];
    ++v2;
  }
  while ( v7 != 64 );
LABEL_10:
  *v3 = v6;
  v3[1] = v5;
  if ( a2 )
  {
    if ( a2 == 1 )
    {
      v25 = 15;
      do
      {
        v26 = v25--;
        makedata(v3, v4, v26);
      }
      while ( v25 != -1 );
      v6 = *v3;
      v5 = v3[1];
    }
  }
  else
  {
    v12 = 0;
    do
    {
      v24 = v12++;
      makedata(v3, v4, v24);
    }
    while ( v12 != 16 );
    v6 = *v3;
    v5 = v3[1];
  }
  v13 = 0;
  *v3 = v5;
  v14 = 0;
  v15 = 0;
  v16 = 0;
  while ( 2 )
  {
    while ( v16 <= 31 )
    {
      v17 = byte_2DB0[v16 + 656];
      v18 = v17 >= 0x20;
      v19 = v17 == 32;
      v20 = v17 - 1;
      if ( v19 || !v18 )
      {
        if ( !(dword_2CB0[v20] & *v3) )
          goto LABEL_18;
LABEL_17:
        v15 |= dword_2CB0[v13];
        goto LABEL_18;
      }
      if ( v6 & dword_2CB0[v20] )
        goto LABEL_17;
LABEL_18:
      ++v16;
      ++v13;
      if ( v16 == 64 )
        goto LABEL_24;
    }
    v21 = byte_2DB0[v16 + 656];
    v18 = v21 >= 0x20;
    v19 = v21 == 32;
    v22 = v21 - 1;
    if ( !v19 && v18 )
    {
      if ( v6 & dword_2CB0[v22] )
        goto LABEL_23;
      goto LABEL_18;
    }
    if ( !(dword_2CB0[v22] & *v3) )
      goto LABEL_18;
LABEL_23:
    ++v16;
    v14 |= dword_2CB0[v13];
    ++v13;
    if ( v16 != 64 )
      continue;
    break;
  }
LABEL_24:
  *v3 = v15;
  v3[1] = v14;
  return 0;
}

//----- (0000125C) --------------------------------------------------------
int __fastcall makekey(int *a1, int *a2, int a3)
{
  int v3; // r12
  int v4; // r6
  int v5; // r5
  int v6; // r3
  _DWORD *v7; // r2
  unsigned int v8; // r7
  unsigned int v9; // r7
  unsigned int v10; // r5
  unsigned int v11; // r5
  signed int v12; // r3
  int *v13; // r12
  int v14; // r7
  int v15; // r6
  int v16; // r7
  bool v17; // zf

  v3 = *((unsigned __int8 *)&dword_2CB0[244] + a3);
  v4 = *a2;
  v5 = dword_2CB0[v3 + 248];
  v6 = *a1;
  v7 = &g_outkey[2 * a3];
  *a1 <<= v3;
  v8 = v5 & v6;
  *a2 <<= v3;
  if ( v3 == 1 )
    v9 = v8 >> 27;
  else
    v9 = v8 >> 26;
  *a1 |= v9 & 0xFFFFFFF0;
  v10 = v5 & v4;
  if ( v3 == 1 )
    v11 = v10 >> 27;
  else
    v11 = v10 >> 26;
  *a2 |= v11 & 0xFFFFFFF0;
  v12 = 0;
  v13 = dword_2CB0;
  do
  {
    while ( v12 > 23 )
    {
      v14 = byte_2DB0[v12 + 748];
      v15 = *a2;
      ++v12;
      v16 = dword_2CB0[v14 - 28];
      v17 = (v16 & *a2) == 0;
      if ( v16 & *a2 )
      {
        v15 = *(v13 - 24);
        v16 = v7[1];
      }
      ++v13;
      if ( !v17 )
        v7[1] = v16 | v15;
      if ( v12 == 48 )
        return 0;
    }
    if ( dword_2CB0[byte_2DB0[v12 + 748] - 1] & *a1 )
      *v7 |= *v13;
    ++v12;
    ++v13;
  }
  while ( v12 != 48 );
  return 0;
}

//----- (000013A8) --------------------------------------------------------
int __fastcall makefirstkey(void *src)
{
  int v1; // r4
  int v2; // lr
  int v3; // r12
  int v4; // r3
  unsigned int v5; // r2
  bool v6; // cf
  bool v7; // zf
  int v8; // r2
  unsigned int v9; // r2
  int v10; // r2
  unsigned int v11; // r2
  int v12; // r4
  int v13; // r2
  int v15; // [sp+0h] [bp-28h]
  int v16; // [sp+4h] [bp-24h]

  v1 = 0;
  g_bufkey = 0;
  dword_5008 = 0;
  v15 = 0;
  v16 = 0;
  memcpy(&v15, src, 8u);
  memset(g_outkey, 0, 0x80u);
  v2 = 0;
  v3 = 0;
  v4 = 0;
  do
  {
    while ( 1 )
    {
      v9 = byte_2DB0[v4 + 796];
      v6 = v9 >= 0x20;
      v7 = v9 == 32;
      v10 = dword_2CB0[v9 - 1];
      if ( !v7 && v6 )
      {
        if ( !(v16 & v10) )
          goto LABEL_4;
        break;
      }
      if ( v15 & v10 )
        break;
      v11 = byte_2DB0[v4 + 824];
      v6 = v11 >= 0x20;
      v7 = v11 == 32;
      v8 = dword_2CB0[v11 - 1];
      if ( v7 || !v6 )
        goto LABEL_12;
LABEL_6:
      if ( v16 & v8 )
        goto LABEL_7;
LABEL_8:
      ++v4;
      ++v1;
      if ( v4 == 28 )
        goto LABEL_14;
    }
    v2 |= dword_2CB0[v1];
LABEL_4:
    v5 = byte_2DB0[v4 + 824];
    v6 = v5 >= 0x20;
    v7 = v5 == 32;
    v8 = dword_2CB0[v5 - 1];
    if ( !v7 && v6 )
      goto LABEL_6;
LABEL_12:
    if ( v15 & v8 )
    {
LABEL_7:
      v3 |= dword_2CB0[v1];
      goto LABEL_8;
    }
    ++v4;
    ++v1;
  }
  while ( v4 != 28 );
LABEL_14:
  g_bufkey = v2;
  dword_5008 = v3;
  v12 = 0;
  do
  {
    v13 = v12++;
    makekey(&g_bufkey, &dword_5008, v13);
  }
  while ( v12 != 16 );
  return 0;
}
// 5004: using guessed type int g_bufkey;
// 5008: using guessed type int dword_5008;

//----- (000014F8) --------------------------------------------------------
int Ddes(int a1, const char *a2, int a3, ...)
{
  int v3; // r5
  int v4; // r6
  int v5; // r4
  int *v6; // r0

  v3 = a3;
  v4 = a1;
  makefirstkey((void *)a2);
  if ( v3 > 0 )
  {
    v5 = 0;
    do
    {
      v6 = (int *)(v4 + v5);
      v5 += 8;
      handle_data(v6, 1);
    }
    while ( v3 > v5 );
  }
  return 0;
}

//----- (00001538) --------------------------------------------------------
int __fastcall DdesN(int a1, int a2, int a3, int a4)
{
  int v4; // r4
  int v5; // r5
  int v6; // r7
  int v7; // r6
  const char *v8; // t1

  v4 = a3;
  v5 = a1;
  v6 = a4;
  if ( a3 > 0 )
  {
    v7 = a2 + 4 * a3;
    do
    {
      v8 = *(const char **)(v7 - 4);
      v7 -= 4;
      Ddes(v5, v8, v6);
      --v4;
    }
    while ( v4 );
  }
  return 0;
}

//----- (00001570) --------------------------------------------------------
int des(int a1, const char *a2, int a3, ...)
{
  int v3; // r5
  int v4; // r6
  int v5; // r4
  int *v6; // r0

  v3 = a3;
  v4 = a1;
  makefirstkey((void *)a2);
  if ( v3 > 0 )
  {
    v5 = 0;
    do
    {
      v6 = (int *)(v4 + v5);
      v5 += 8;
      handle_data(v6, 0);
    }
    while ( v3 > v5 );
  }
  return 0;
}

//----- (000015B0) --------------------------------------------------------
int __fastcall desN(int a1, const char **a2, int a3, int a4)
{
  int v4; // r5
  int v5; // r4
  int v6; // r8
  const char **v7; // r7
  int v8; // r6
  const char *v9; // t1

  v4 = a3;
  v5 = a1;
  v6 = a4;
  if ( a3 )
  {
    v7 = a2;
    v8 = 0;
    do
    {
      v9 = *v7;
      ++v7;
      ++v8;
      des(v5, v9, v6);
    }
    while ( v8 != v4 );
  }
  return 0;
}

//----- (000015F0) --------------------------------------------------------
int __fastcall Ddes3(int a1, void *a2, int a3, unsigned int a4)
{
  int v4; // r5
  int v5; // r4
  unsigned int v6; // r7
  int v7; // r8
  unsigned int v8; // r6
  int *v9; // r0

  v4 = a3;
  v5 = a1;
  v6 = a4;
  makefirstkey(a2);
  if ( v4 )
  {
    v7 = 0;
    do
    {
      if ( v6 )
      {
        v8 = 0;
        do
        {
          v9 = (int *)(v5 + v8);
          v8 += 8;
          handle_data(v9, 1);
        }
        while ( v6 > v8 );
      }
      ++v7;
    }
    while ( v7 != v4 );
  }
  return 0;
}

//----- (0000164C) --------------------------------------------------------
int __fastcall des3(int a1, void *a2, int a3, unsigned int a4)
{
  int v4; // r5
  int v5; // r4
  unsigned int v6; // r7
  int v7; // r8
  unsigned int v8; // r6
  int *v9; // r0

  v4 = a3;
  v5 = a1;
  v6 = a4;
  makefirstkey(a2);
  if ( v4 )
  {
    v7 = 0;
    do
    {
      if ( v6 )
      {
        v8 = 0;
        do
        {
          v9 = (int *)(v5 + v8);
          v8 += 8;
          handle_data(v9, 0);
        }
        while ( v6 > v8 );
      }
      ++v7;
    }
    while ( v7 != v4 );
  }
  return 0;
}

//----- (000016A8) --------------------------------------------------------
int __fastcall Java_com_tencent_qqmusic_business_lyricnew_QRCDesDecrypt_desDecrypt(int a1, int a2, int a3, int a4)
{
  int v4; // r5
  int v5; // r6
  int v6; // r4
  int v7; // r0
  int v8; // r7
  int result; // r0

  v4 = a3;
  v5 = a4;
  v6 = a1;
  v7 = (*(int (**)(void))(*(_DWORD *)a1 + 736))();
  v8 = v7;
  result = Ddes(v7, "!@#)(NHLiuy*$%^&", v5);
  if ( result != 1 )
  {
    result = des(v8, "123ZXC!@#)(*$%^&", v5);
    if ( result != 1 )
    {
      result = Ddes(v8, "!@#)(*$%^&abcDEF", v5);
      if ( result != 1 )
      {
        (*(void (__fastcall **)(int, int, int, _DWORD))(*(_DWORD *)v6 + 768))(v6, v4, v8, 0);
        result = 0;
      }
    }
  }
  return result;
}

//----- (00001750) --------------------------------------------------------
int __fastcall sub_1750(int *a1)
{
  int v1; // r3
  unsigned int v2; // r3

  v1 = *a1;
  if ( *a1 & 0x40000000 )
    v2 = v1 | 0x80000000;
  else
    v2 = v1 & 0x7FFFFFFF;
  return (int)a1 + v2;
}

//----- (00001768) --------------------------------------------------------
signed int __fastcall sub_1768(_DWORD *a1, int a2)
{
  _DWORD *v2; // r4
  unsigned int v3; // r6
  int *v4; // r9
  int v5; // r11
  int v6; // r10
  int v7; // r7
  int v8; // r8
  int v9; // r0
  unsigned int v10; // r3
  unsigned int v11; // r0
  int v12; // ST00_4
  int v13; // r0
  signed int result; // r0
  int v15; // r0
  int v16; // r3
  bool v17; // zf
  int *v18; // r0
  signed int v19; // r3
  int v20; // r0
  int *v21; // r0
  int v22; // r3
  int (**v23)(); // r3
  int v24; // [sp+4h] [bp-34h]
  int v25; // [sp+Ch] [bp-2Ch]

  v2 = a1;
  v3 = a2 - 2;
  if ( &__gnu_Unwind_Find_exidx )
  {
    v4 = (int *)_gnu_Unwind_Find_exidx(a2 - 2, &v25);
    if ( !v4 )
      goto LABEL_34;
  }
  else
  {
    v4 = (int *)&unk_2BA4;
    v25 = 33;
  }
  if ( !v25 )
    goto LABEL_17;
  v5 = v25 - 1;
  v6 = 0;
  v24 = v25 - 1;
  while ( 1 )
  {
    while ( 1 )
    {
      v7 = (v6 + v5) / 2;
      v8 = (int)&v4[2 * v7];
      v9 = sub_1750(&v4[2 * v7]);
      v10 = v9;
      if ( v7 == v24 )
      {
        v11 = -1;
      }
      else
      {
        v12 = v9;
        v13 = sub_1750(&v4[2 * (v7 + 1)]);
        v10 = v12;
        v11 = v13 - 1;
      }
      if ( v3 >= v10 )
        break;
      if ( v7 == v6 )
        goto LABEL_17;
      v5 = v7 - 1;
    }
    if ( v3 <= v11 )
      break;
    v6 = v7 + 1;
  }
  if ( !v8 )
  {
LABEL_17:
    v2[4] = 0;
    return 9;
  }
  v15 = sub_1750(&v4[2 * v7]);
  v16 = *(_DWORD *)(v8 + 4);
  v17 = v16 == 1;
  if ( v16 == 1 )
  {
    v16 = 0;
    v2[4] = 0;
  }
  v2[18] = v15;
  if ( v17 )
    return 5;
  v18 = (int *)(v8 + 4);
  if ( v16 >= 0 )
  {
    v20 = sub_1750(v18);
    v19 = 0;
    v2[19] = v20;
  }
  else
  {
    v2[19] = v18;
    v19 = 1;
  }
  v21 = (int *)v2[19];
  v2[20] = v19;
  if ( *v21 >= 0 )
  {
    v2[4] = sub_1750(v21);
    result = 0;
  }
  else
  {
    v22 = ((unsigned int)*v21 >> 24) & 0xF;
    if ( ((unsigned int)*v21 >> 24) & 0xF )
    {
      result = 0;
      if ( v22 == 1 )
      {
        v23 = _aeabi_unwind_cpp_pr1_ptr;
      }
      else
      {
        if ( v22 != 2 )
        {
LABEL_34:
          v2[4] = 0;
          return 9;
        }
        v23 = &_aeabi_unwind_cpp_pr2_ptr;
      }
      v2[4] = *v23;
    }
    else
    {
      result = 0;
      v2[4] = _aeabi_unwind_cpp_pr0;
    }
  }
  return result;
}
// DEC: using guessed type int __fastcall _gnu_Unwind_Find_exidx(_DWORD, _DWORD);
// 4FC4: using guessed type int (*_aeabi_unwind_cpp_pr1_ptr[2])();
// 4FC8: using guessed type int (*_aeabi_unwind_cpp_pr2_ptr)();

//----- (0000193C) --------------------------------------------------------
__int64 *__fastcall sub_193C(__int64 *result)
{
  int v1; // r3
  __int64 *v2; // r4
  __int64 *v3; // r0

  v1 = *(_DWORD *)result;
  v2 = result;
  if ( !(*(_DWORD *)result & 1) )
  {
    v3 = result + 9;
    if ( v1 & 2 )
      result = _gnu_Unwind_Restore_VFP_D(v3);
    else
      result = _gnu_Unwind_Restore_VFP(v3);
  }
  if ( !(*(_DWORD *)v2 & 4) )
    result = _gnu_Unwind_Restore_VFP_D_16_to_31(v2 + 26);
  if ( !(*(_DWORD *)v2 & 8) )
    result = (__int64 *)_gnu_Unwind_Restore_WMMXD((int *)v2 + 108);
  if ( !(*(_DWORD *)v2 & 0x10) )
    result = (__int64 *)_gnu_Unwind_Restore_WMMXC((int *)v2 + 140);
  return result;
}

//----- (000019A8) --------------------------------------------------------
signed int __fastcall sub_19A8(int a1, int a2, signed int a3)
{
  int *v3; // lr
  int (__fastcall *v4)(signed int, signed int, int, int, int *, int); // r8
  int v5; // r9
  int v6; // r4
  signed int v7; // r5
  int v8; // r0
  int v9; // r1
  int v10; // r2
  int v11; // r3
  int v12; // r0
  int v13; // r1
  int v14; // r2
  int v15; // r3
  int v16; // r0
  int v17; // r1
  int v18; // r2
  int v19; // r3
  int v20; // r1
  int v21; // r2
  int v22; // r3
  int v23; // r7
  signed int v24; // r0
  signed int v25; // r10
  int v26; // r3
  int v27; // r0
  int v29; // [sp+8h] [bp-4A0h]
  int v30; // [sp+Ch] [bp-49Ch]
  int v31; // [sp+10h] [bp-498h]
  int v32; // [sp+14h] [bp-494h]
  int v33; // [sp+18h] [bp-490h]
  int v34; // [sp+1Ch] [bp-48Ch]
  int v35; // [sp+20h] [bp-488h]
  int v36; // [sp+24h] [bp-484h]
  int v37; // [sp+28h] [bp-480h]
  int v38; // [sp+2Ch] [bp-47Ch]
  int v39; // [sp+30h] [bp-478h]
  int v40; // [sp+34h] [bp-474h]
  int v41; // [sp+38h] [bp-470h]
  int v42; // [sp+3Ch] [bp-46Ch]
  int v43; // [sp+40h] [bp-468h]
  int v44; // [sp+44h] [bp-464h]
  int v45; // [sp+48h] [bp-460h]
  int v46; // [sp+4Ch] [bp-45Ch]
  char dest; // [sp+248h] [bp-260h]
  int v48; // [sp+280h] [bp-228h]

  v3 = (int *)(a2 + 4);
  v4 = *(int (__fastcall **)(signed int, signed int, int, int, int *, int))(a1 + 12);
  v5 = *(_DWORD *)(a1 + 24);
  v6 = a1;
  v7 = a3;
  v8 = *(_DWORD *)(a2 + 4);
  v9 = *(_DWORD *)(a2 + 8);
  v10 = v3[2];
  v11 = v3[3];
  v3 += 4;
  v30 = v8;
  v31 = v9;
  v32 = v10;
  v33 = v11;
  v12 = *v3;
  v13 = v3[1];
  v14 = v3[2];
  v15 = v3[3];
  v3 += 4;
  v34 = v12;
  v35 = v13;
  v36 = v14;
  v37 = v15;
  v16 = *v3;
  v17 = v3[1];
  v18 = v3[2];
  v19 = v3[3];
  v3 += 4;
  v38 = v16;
  v39 = v17;
  v40 = v18;
  v41 = v19;
  v20 = v3[1];
  v21 = v3[2];
  v22 = v3[3];
  v23 = 0;
  v42 = *v3;
  v43 = v20;
  v44 = v21;
  v45 = v22;
  v29 = 0;
  while ( 1 )
  {
    v24 = sub_1768((_DWORD *)v6, v45);
    v25 = v7 ? 10 : 9;
    v7 = v24;
    if ( v24 )
    {
      v25 |= 0x10u;
      v26 = v43;
    }
    else
    {
      *(_DWORD *)(v6 + 20) = v45;
      memcpy(&dest, &v29, 0x240u);
      v27 = (*(int (__fastcall **)(signed int, int, char *))(v6 + 16))(v25, v6, &dest);
      v26 = v48;
      v23 = v27;
    }
    v46 = v26;
    if ( v4(1, v25, v6, v6, &v29, v5) )
      break;
    if ( v7 )
      return v7;
    memcpy(&v29, &dest, 0x240u);
    if ( v23 != 8 )
    {
      if ( v23 == 7 )
        restore_core_regs(&v30);
      return 9;
    }
  }
  return 9;
}

//----- (00001ABC) --------------------------------------------------------
signed int __fastcall sub_1ABC(int a1, int a2, int a3, int a4, unsigned int a5)
{
  int v5; // r5
  int v6; // r4
  int v7; // r0
  int v8; // r0
  unsigned int v9; // r1
  unsigned int v10; // r2
  int v11; // r3

  v5 = a1;
  v6 = a2;
  do
  {
    if ( sub_1768((_DWORD *)v5, *(_DWORD *)(v6 + 64)) )
      goto LABEL_5;
    *(_DWORD *)(v5 + 20) = *(_DWORD *)(v6 + 64);
    v7 = (*(int (__fastcall **)(signed int, int, int))(v5 + 16))(1, v5, v6);
  }
  while ( v7 == 8 );
  if ( v7 != 7 )
LABEL_5:
    abort();
  restore_core_regs((int *)(v6 + 4));
  return Unwind_VRS_Get(v8, v9, v10, v11, a5);
}

//----- (00001B14) --------------------------------------------------------
signed int __fastcall Unwind_VRS_Get(int a1, unsigned int a2, unsigned int a3, int a4, unsigned int a5)
{
  signed int result; // r0
  bool v6; // zf
  int v7; // r0
  signed int v8; // r3

  if ( a2 )
  {
    if ( a2 <= 4 )
      result = 1;
    else
      result = 2;
  }
  else
  {
    v6 = a3 == 15;
    if ( a3 <= 0xF )
      v6 = a4 == 0;
    if ( v6 )
    {
      v7 = a1 + 4 * a3;
      a3 = a5;
      a2 = *(_DWORD *)(v7 + 4);
      v8 = 0;
    }
    else
    {
      v8 = 1;
    }
    if ( v6 )
    {
      *(_DWORD *)a3 = a2;
      result = v8;
    }
    else
    {
      result = 2;
    }
  }
  return result;
}

//----- (00001B58) --------------------------------------------------------
int __fastcall sub_1B58(int a1, unsigned int a2, int a3, int a4)
{
  int v5; // [sp+Ch] [bp-Ch]

  v5 = a4;
  Unwind_VRS_Get(a1, 0, a2, 0, (unsigned int)&v5);
  return v5;
}

//----- (00001B80) --------------------------------------------------------
signed int __fastcall Unwind_VRS_Set(signed int result, _DWORD *a2, unsigned int a3, int a4, _DWORD *a5)
{
  bool v5; // zf
  signed int v6; // r3

  if ( a2 )
  {
    if ( (unsigned int)a2 <= 4 )
      result = 1;
    else
      result = 2;
  }
  else
  {
    v5 = a3 == 15;
    if ( a3 <= 0xF )
      v5 = a4 == 0;
    if ( v5 )
    {
      a2 = a5;
      result += 4 * a3;
      v6 = 0;
    }
    else
    {
      v6 = 1;
    }
    if ( v5 )
      *(_DWORD *)(result + 4) = *a2;
    else
      result = 2;
    if ( v5 )
      result = v6;
  }
  return result;
}

//----- (00001BC4) --------------------------------------------------------
signed int __fastcall sub_1BC4(signed int a1, unsigned int a2, int a3)
{
  int v4; // [sp+Ch] [bp-Ch]

  v4 = a3;
  return Unwind_VRS_Set(a1, 0, a2, 0, &v4);
}

//----- (00001BF0) --------------------------------------------------------
signed int __fastcall sub_1BF0(char a1, _DWORD *a2, unsigned int *a3, int a4)
{
  _DWORD *v4; // r4
  int *v5; // r7
  unsigned int *v6; // r6
  int v7; // r2
  int *v8; // r7
  int v9; // t1
  int v10; // r8
  unsigned int v11; // r2
  unsigned int v12; // r3
  int v13; // r9
  int v14; // r3
  int v15; // r11
  int *v16; // r5
  int v17; // r10
  unsigned int v18; // r7
  unsigned int v19; // r0
  _BOOL4 v20; // r0
  unsigned int v21; // r10
  int v22; // r0
  int v23; // r0
  void *v24; // r5
  signed int v25; // r0
  unsigned int v26; // r1
  void *v27; // r2
  int v28; // r3
  int v29; // r1
  int v30; // r7
  int *v31; // r0
  int v32; // r7
  bool v33; // zf
  int *v34; // r11
  int i; // r10
  int v36; // r1
  int v37; // t1
  int v38; // r0
  int v40; // r10
  int v41; // r0
  int v42; // r7
  int v43; // r2
  int v44; // r3
  int v45; // r0
  int v46; // [sp+4h] [bp-44h]
  int v47; // [sp+8h] [bp-40h]
  int v48; // [sp+Ch] [bp-3Ch]
  int v49; // [sp+10h] [bp-38h]
  unsigned int v50; // [sp+14h] [bp-34h]
  int *v51; // [sp+18h] [bp-30h]
  char v52; // [sp+1Ch] [bp-2Ch]
  char v53; // [sp+1Dh] [bp-2Bh]

  v4 = a2;
  v5 = (int *)a2[19];
  v6 = a3;
  v9 = *v5;
  v8 = v5 + 1;
  v7 = v9;
  v48 = a1 & 8;
  v10 = a1 & 3;
  v51 = v8;
  v46 = a4;
  if ( a4 )
  {
    v12 = BYTE2(v7);
    v50 = v7 << 16;
    v8 += BYTE2(v7);
    v11 = 2;
    v53 = v12;
    v52 = 2;
  }
  else
  {
    v11 = v7 << 8;
    v53 = 0;
    v12 = 3;
    v50 = v11;
    v52 = 3;
  }
  if ( v10 == 2 )
    v8 = (int *)a2[14];
  v13 = a2[20] & 1;
  if ( !v13 )
  {
    v11 = (unsigned int)(a2 + 22);
    v47 = (int)(a2 + 22);
    while ( 1 )
    {
      while ( 1 )
      {
        v17 = *v8;
        if ( !*v8 )
          goto LABEL_69;
        v14 = v4[18];
        v15 = v46 == 2 ? v8[1] : *((unsigned __int16 *)v8 + 1);
        if ( v46 == 2 )
        {
          v16 = v8 + 2;
        }
        else
        {
          v17 = *(unsigned __int16 *)v8;
          v16 = v8 + 1;
        }
        v18 = (v15 & 0xFFFFFFFE) + v14;
        v19 = sub_1B58((int)v6, 0xFu, v46, v14);
        if ( v18 <= v19 )
        {
          v12 = v17 & 0xFFFFFFFE;
          v20 = v19 < v18 + (v17 & 0xFFFFFFFE);
        }
        else
        {
          v20 = 0;
        }
        v21 = v17 & 1 | 2 * (v15 & 1);
        if ( v21 == 1 )
          break;
        if ( v21 < 1 )
        {
          if ( v10 )
            v22 = v20;
          else
            v22 = 0;
          v8 = v16 + 1;
          if ( v22 )
          {
            v23 = sub_1750(v16);
            v4[14] = v8;
            v24 = (void *)v23;
            if ( !_cxa_begin_cleanup(v4) )
              return 9;
            v25 = (signed int)v6;
            v26 = 15;
            v27 = v24;
LABEL_73:
            sub_1BC4(v25, v26, (int)v27);
            return 7;
          }
        }
        else
        {
          if ( v21 != 2 )
            return 9;
          v32 = *v16 & 0x7FFFFFFF;
          if ( v10 )
          {
            v40 = v4[8];
            if ( v40 == sub_1B58((int)v6, 0xDu, v11, v12) && v16 == (int *)v4[10] )
            {
              v4[12] = 4;
              v4[10] = v32;
              v4[11] = 0;
              v4[13] = v16 + 1;
              if ( *v16 >= 0 )
              {
                v31 = &v16[v32 + 1];
                goto LABEL_63;
              }
              v13 = 1;
            }
          }
          else if ( v20 )
          {
            v11 = v48;
            v33 = v48 == 0;
            if ( v48 )
              v33 = v32 == 0;
            if ( v33 )
            {
              v34 = v16;
              for ( i = 0; i != v32; ++i )
              {
                v37 = v34[1];
                ++v34;
                v36 = v37;
                if ( v37 )
                  v36 = *(int *)((char *)v34 + v36);
                v49 = v47;
                if ( _cxa_type_match(v4, v36, 0, &v49) )
                {
                  if ( i != v32 )
                    goto LABEL_65;
                  break;
                }
              }
LABEL_58:
              v38 = sub_1B58((int)v6, 0xDu, v11, v12);
              v4[9] = v49;
              v4[10] = v16;
              v4[8] = v38;
              return 6;
            }
          }
LABEL_65:
          v12 = *v16;
          v42 = v32 + 1;
          if ( *v16 < 0 )
            ++v16;
          v8 = &v16[v42];
        }
      }
      if ( v10 )
      {
        v30 = v4[8];
        if ( v30 == sub_1B58((int)v6, 0xDu, v11, v12) )
        {
          v12 = v4[10];
          if ( v16 == (int *)v12 )
          {
            v31 = v16;
LABEL_63:
            v41 = sub_1750(v31);
            sub_1BC4((signed int)v6, 0xFu, v41);
            v25 = (signed int)v6;
            v26 = 0;
            v27 = v4;
            goto LABEL_73;
          }
        }
      }
      else if ( v20 )
      {
        v11 = *v16;
        v28 = v16[1];
        if ( v28 == -2 )
          return 9;
        v49 = v47;
        if ( v28 != -1 )
        {
          v29 = v28 ? *(int *)((char *)v16 + v28 + 4) : 0;
          if ( !_cxa_type_match(v4, v29, v11 >> 31, &v49) )
            v49 = 0;
        }
        v12 = v49;
        if ( v49 )
          goto LABEL_58;
      }
      v8 = v16 + 2;
    }
  }
  v13 = 0;
LABEL_69:
  if ( _gnu_unwind_execute(v6, &v50, v11, v12) )
    return 9;
  if ( v13 )
  {
    v45 = sub_1B58((int)v6, 0xFu, v43, v44);
    sub_1BC4((signed int)v6, 0xEu, v45);
    v25 = (signed int)v6;
    v26 = 15;
    v27 = &_cxa_call_unexpected;
    goto LABEL_73;
  }
  return 8;
}
// E04: using guessed type int __fastcall _cxa_begin_cleanup(_DWORD);
// E10: using guessed type int __fastcall _cxa_type_match(_DWORD, _DWORD, _DWORD, _DWORD);

//----- (00001F84) --------------------------------------------------------
signed int __fastcall _aeabi_unwind_cpp_pr2(char a1, _DWORD *a2, unsigned int *a3)
{
  return sub_1BF0(a1, a2, a3, 2);
}

//----- (00001F8C) --------------------------------------------------------
signed int __fastcall _aeabi_unwind_cpp_pr1(char a1, _DWORD *a2, unsigned int *a3)
{
  return sub_1BF0(a1, a2, a3, 1);
}

//----- (00001F94) --------------------------------------------------------
signed int __fastcall _aeabi_unwind_cpp_pr0(char a1, _DWORD *a2, unsigned int *a3)
{
  return sub_1BF0(a1, a2, a3, 0);
}

//----- (00001F9C) --------------------------------------------------------
signed int __fastcall Unwind_VRS_Pop(unsigned int *a1, int a2, unsigned int a3, int a4)
{
  int v4; // r12
  unsigned int *v5; // r4
  unsigned int v6; // r5
  int v7; // r7
  unsigned int v8; // r7
  int *v9; // r2
  unsigned int v10; // r7
  bool v11; // zf
  int v12; // r0
  int v13; // t1
  int v14; // r1
  bool v15; // zf
  unsigned int v16; // r6
  int v17; // r5
  unsigned int v18; // r2
  unsigned int v19; // r0
  _BOOL4 v20; // r8
  int v21; // r10
  unsigned int v22; // r2
  _QWORD *v23; // r0
  int *v24; // r1
  int *v25; // r3
  int v26; // r5
  char *v27; // r0
  unsigned int v28; // r2
  int v29; // t1
  bool v30; // cf
  signed int v31; // r0
  int v32; // r10
  char *v33; // r0
  int *v34; // r1
  unsigned int v35; // r2
  int v36; // t1
  unsigned int v37; // r6
  int v38; // r5
  int *v39; // r3
  int v40; // r5
  unsigned int v41; // r2
  char *v42; // r6
  int v43; // t1
  bool v44; // zf
  int *v45; // r2
  int v46; // r3
  int v47; // t1
  int v49; // [sp+0h] [bp-1B8h]
  __int64 v50[16]; // [sp+10h] [bp-1A8h]
  char v51[128]; // [sp+90h] [bp-128h]
  char v52[136]; // [sp+110h] [bp-A8h]
  char v53; // [sp+198h] [bp-20h]

  v5 = a1;
  v6 = a3;
  switch ( a2 )
  {
    case 0:
      if ( a4 )
        return 2;
      v8 = a3 << 16;
      v9 = (int *)a1[14];
      v10 = v8 >> 16;
      do
      {
        v12 = v10 & (1 << a4);
        v11 = (v10 & (1 << a4)) == 0;
        if ( v10 & (1 << a4) )
        {
          v12 = (int)&v5[a4];
          v13 = *v9;
          ++v9;
          v4 = v13;
        }
        ++a4;
        if ( !v11 )
          *(_DWORD *)(v12 + 4) = v4;
      }
      while ( a4 != 16 );
      v7 = v10 & 0x2000;
      if ( v7 )
        return 0;
      v5[14] = (unsigned int)v9;
      return v7;
    case 1:
      v14 = a4 - 5;
      if ( a4 != 5 )
        v14 = 1;
      v15 = a4 == 1;
      if ( a4 != 1 )
        v15 = a4 == 5;
      if ( !v15 )
        return 2;
      v16 = a3 >> 16;
      v17 = (unsigned __int16)a3;
      v18 = (unsigned __int16)a3 + (a3 >> 16);
      v19 = a4 == 1 ? 16 : 32;
      if ( v18 > v19 )
        return 2;
      v20 = (unsigned int)(a4 - 1) <= 0;
      v21 = v16 > 0xF;
      if ( v21 & v20 )
        return 2;
      if ( v16 > 0xF )
      {
        v21 = v17;
      }
      else if ( v18 > 0x10 )
      {
        v21 = v18 - 16;
      }
      v7 = v21;
      if ( v21 )
        v7 = 1;
      if ( v7 & v14 )
        return 2;
      if ( v16 <= 0xF )
      {
        v22 = *v5;
        if ( *v5 & 1 )
        {
          *v5 = v22 & 0xFFFFFFFE;
          v23 = v5 + 18;
          if ( a4 == 5 )
          {
            *v5 = v22 & 0xFFFFFFFE | 2;
            _gnu_Unwind_Save_VFP_D(v23);
          }
          else
          {
            *v5 = v22 & 0xFFFFFFFC;
            _gnu_Unwind_Save_VFP(v23);
          }
        }
      }
      if ( v7 && *v5 & 4 )
      {
        *v5 &= 0xFFFFFFFB;
        _gnu_Unwind_Save_VFP_D_16_to_31((_QWORD *)v5 + 26);
      }
      if ( v20 )
      {
        _gnu_Unwind_Save_VFP(v52);
        if ( !v7 )
          goto LABEL_47;
        goto LABEL_46;
      }
      if ( v16 <= 0xF )
        _gnu_Unwind_Save_VFP_D(v52);
      if ( v7 )
      {
        _gnu_Unwind_Save_VFP_D_16_to_31(v50);
LABEL_46:
        v17 = 16 - v16;
      }
LABEL_47:
      v24 = (int *)v5[14];
      v25 = (int *)v5[14];
      if ( v17 > 0 )
      {
        v26 = 2 * v17;
        v27 = &v52[8 * v16];
        v28 = v26;
        while ( 1 )
        {
          v30 = v28-- >= 1;
          if ( !v30 )
            break;
          v29 = *v24;
          ++v24;
          *(_DWORD *)v27 = v29;
          v27 += 4;
        }
        v25 += v26;
      }
      if ( v7 )
      {
        if ( v16 < 0x10 )
          v31 = 16;
        else
          v31 = v16;
        v32 = 2 * v21;
        v33 = &v53 + 8 * v31 - 520;
        v34 = v25;
        v35 = v32;
        while ( 1 )
        {
          v30 = v35-- >= 1;
          if ( !v30 )
            break;
          v36 = *v34;
          ++v34;
          *(_DWORD *)v33 = v36;
          v33 += 4;
        }
        v25 += v32;
      }
      if ( v20 )
        ++v25;
      v5[14] = (unsigned int)v25;
      if ( v20 )
      {
        _gnu_Unwind_Restore_VFP((__int64 *)v52);
        return 0;
      }
      if ( v16 <= 0xF )
        _gnu_Unwind_Restore_VFP_D((__int64 *)v52);
      if ( v7 )
      {
        _gnu_Unwind_Restore_VFP_D_16_to_31(v50);
        return 0;
      }
      return v7;
    case 2:
      return 1;
    case 3:
      if ( a4 != 3 )
        return 2;
      v37 = a3 >> 16;
      v38 = (unsigned __int16)a3;
      if ( (unsigned __int16)a3 + (a3 >> 16) > 0x10 )
        return 2;
      if ( *a1 & 8 )
      {
        *a1 &= 0xFFFFFFF7;
        _gnu_Unwind_Save_WMMXD();
      }
      _gnu_Unwind_Save_WMMXD();
      v39 = (int *)v5[14];
      v40 = 2 * v38;
      v41 = v5[14];
      v42 = &v51[8 * v37];
      v7 = v40;
      while ( v7 )
      {
        v43 = *v39;
        ++v39;
        --v7;
        *(_DWORD *)v42 = v43;
        v42 += 4;
      }
      v5[14] = v41 + 4 * v40;
      _gnu_Unwind_Restore_WMMXD((int *)v51);
      return v7;
    case 4:
      v44 = a3 == 16;
      if ( a3 <= 0x10 )
        v44 = a4 == 0;
      if ( !v44 )
        return 2;
      if ( *a1 & 0x10 )
      {
        *a1 &= 0xFFFFFFEF;
        _gnu_Unwind_Save_WMMXC();
      }
      _gnu_Unwind_Save_WMMXC();
      v45 = (int *)v5[14];
      v46 = 0;
      do
      {
        if ( v6 & (1 << v46) )
        {
          v47 = *v45;
          ++v45;
          *(&v49 + v46) = v47;
        }
        ++v46;
      }
      while ( v46 != 4 );
      v5[14] = (unsigned int)v45;
      _gnu_Unwind_Restore_WMMXC(&v49);
      return 0;
    default:
      return 2;
  }
}
// 1F9C: using guessed type char var_A8[136];
// 1F9C: using guessed type char var_128[128];

//----- (000022F4) --------------------------------------------------------
int __fastcall Unwind_GetCFA(int a1)
{
  return *(_DWORD *)(a1 + 68);
}

//----- (000022FC) --------------------------------------------------------
signed int __fastcall _gnu_Unwind_RaiseException(int a1, _DWORD *a2)
{
  int *v2; // lr
  int v3; // r5
  int v4; // r4
  int v5; // r0
  int v6; // r1
  int v7; // r2
  int v8; // r3
  int v9; // r0
  int v10; // r1
  int v11; // r2
  int v12; // r3
  int v13; // r0
  int v14; // r1
  int v15; // r2
  int v16; // r3
  int v17; // r1
  int v18; // r2
  int v19; // r3
  int v20; // r7
  int v21; // r2
  int v22; // r3
  unsigned int v24; // [sp+0h] [bp-258h]
  int v25; // [sp+4h] [bp-254h]
  int v26; // [sp+8h] [bp-250h]
  int v27; // [sp+Ch] [bp-24Ch]
  int v28; // [sp+10h] [bp-248h]
  int v29; // [sp+14h] [bp-244h]
  int v30; // [sp+18h] [bp-240h]
  int v31; // [sp+1Ch] [bp-23Ch]
  int v32; // [sp+20h] [bp-238h]
  int v33; // [sp+24h] [bp-234h]
  int v34; // [sp+28h] [bp-230h]
  int v35; // [sp+2Ch] [bp-22Ch]
  int v36; // [sp+30h] [bp-228h]
  int v37; // [sp+34h] [bp-224h]
  int v38; // [sp+38h] [bp-220h]
  int v39; // [sp+3Ch] [bp-21Ch]
  int v40; // [sp+40h] [bp-218h]

  v2 = a2 + 1;
  a2[16] = a2[15];
  v3 = a1;
  v4 = (int)a2;
  v5 = a2[1];
  v6 = a2[2];
  v7 = v2[2];
  v8 = v2[3];
  v2 += 4;
  v25 = v5;
  v26 = v6;
  v27 = v7;
  v28 = v8;
  v9 = *v2;
  v10 = v2[1];
  v11 = v2[2];
  v12 = v2[3];
  v2 += 4;
  v29 = v9;
  v30 = v10;
  v31 = v11;
  v32 = v12;
  v13 = *v2;
  v14 = v2[1];
  v15 = v2[2];
  v16 = v2[3];
  v2 += 4;
  v33 = v13;
  v34 = v14;
  v35 = v15;
  v36 = v16;
  v17 = v2[1];
  v18 = v2[2];
  v19 = v2[3];
  v37 = *v2;
  v38 = v17;
  v39 = v18;
  v40 = v19;
  v24 = -1;
  while ( !sub_1768((_DWORD *)v3, v40) )
  {
    v20 = (*(int (**)(void))(v3 + 16))();
    if ( v20 != 8 )
    {
      sub_193C((__int64 *)&v24);
      if ( v20 == 6 )
        sub_1ABC(v3, v4, v21, v22, v24);
      return 9;
    }
  }
  return 9;
}

//----- (000023A0) --------------------------------------------------------
signed int __fastcall _gnu_Unwind_ForcedUnwind(int a1, int a2, int a3, int a4)
{
  int v4; // r2

  *(_DWORD *)(a1 + 24) = a3;
  v4 = *(_DWORD *)(a4 + 60);
  *(_DWORD *)(a1 + 12) = a2;
  *(_DWORD *)(a4 + 64) = v4;
  return sub_19A8(a1, a4, 0);
}

//----- (000023BC) --------------------------------------------------------
void __fastcall __noreturn _gnu_Unwind_Resume(int a1, int a2, int a3, unsigned int a4)
{
  int v4; // r4
  int v5; // r5
  int v6; // r0
  int v7; // r2
  int v8; // r3
  unsigned int v9; // [sp+0h] [bp-10h]

  v9 = a4;
  *(_DWORD *)(a2 + 64) = *(_DWORD *)(a1 + 20);
  v4 = a1;
  v5 = a2;
  if ( *(_DWORD *)(a1 + 12) )
  {
    sub_19A8(a1, a2, 1);
    goto LABEL_8;
  }
  v6 = (*(int (__fastcall **)(signed int, int, int))(a1 + 16))(2, a1, a2);
  if ( v6 == 7 )
  {
    restore_core_regs((int *)(v5 + 4));
  }
  else if ( v6 != 8 )
  {
    goto LABEL_8;
  }
  sub_1ABC(v4, v5, v7, v8, v9);
LABEL_8:
  abort();
}

//----- (00002428) --------------------------------------------------------
signed int __fastcall _gnu_Unwind_Resume_or_Rethrow(int a1, _DWORD *a2)
{
  if ( !*(_DWORD *)(a1 + 12) )
    return _gnu_Unwind_RaiseException(a1, a2);
  a2[16] = a2[15];
  return sub_19A8(a1, (int)a2, 0);
}

//----- (0000244C) --------------------------------------------------------
int __fastcall Unwind_DeleteException(int result)
{
  int (__fastcall *v1)(signed int, int); // r3

  v1 = *(int (__fastcall **)(signed int, int))(result + 8);
  if ( v1 )
    result = v1(1, result);
  return result;
}

//----- (0000246C) --------------------------------------------------------
signed int __fastcall _gnu_Unwind_Backtrace(int (__fastcall *a1)(int *, int), int a2, _DWORD *a3)
{
  int *v3; // lr
  int (__fastcall *v4)(int *, int); // r5
  int v5; // r4
  int v6; // r0
  int v7; // r1
  int v8; // r2
  int v9; // r3
  int v10; // r0
  int v11; // r1
  int v12; // r2
  int v13; // r3
  int v14; // r0
  int v15; // r1
  int v16; // r2
  int v17; // r3
  int v18; // r1
  int v19; // r2
  int v20; // r3
  int v21; // r0
  bool v22; // zf
  signed int v23; // r6
  int v25; // [sp+0h] [bp-2A8h]
  int (__fastcall *v26)(signed int, int *, int *); // [sp+10h] [bp-298h]
  int v27; // [sp+58h] [bp-250h]
  int v28; // [sp+5Ch] [bp-24Ch]
  int v29; // [sp+60h] [bp-248h]
  int v30; // [sp+64h] [bp-244h]
  int v31; // [sp+68h] [bp-240h]
  int v32; // [sp+6Ch] [bp-23Ch]
  int v33; // [sp+70h] [bp-238h]
  int v34; // [sp+74h] [bp-234h]
  int v35; // [sp+78h] [bp-230h]
  int v36; // [sp+7Ch] [bp-22Ch]
  int v37; // [sp+80h] [bp-228h]
  int v38; // [sp+84h] [bp-224h]
  int v39; // [sp+88h] [bp-220h]
  int v40; // [sp+8Ch] [bp-21Ch]
  int v41; // [sp+90h] [bp-218h]
  int v42; // [sp+94h] [bp-214h]
  int v43; // [sp+98h] [bp-210h]

  v3 = a3 + 1;
  a3[16] = a3[15];
  v4 = a1;
  v5 = a2;
  v6 = a3[1];
  v7 = a3[2];
  v8 = a3[3];
  v9 = v3[3];
  v3 += 4;
  v28 = v6;
  v29 = v7;
  v30 = v8;
  v31 = v9;
  v10 = *v3;
  v11 = v3[1];
  v12 = v3[2];
  v13 = v3[3];
  v3 += 4;
  v32 = v10;
  v33 = v11;
  v34 = v12;
  v35 = v13;
  v14 = *v3;
  v15 = v3[1];
  v16 = v3[2];
  v17 = v3[3];
  v3 += 4;
  v36 = v14;
  v37 = v15;
  v38 = v16;
  v39 = v17;
  v18 = v3[1];
  v19 = v3[2];
  v20 = v3[3];
  v40 = *v3;
  v41 = v18;
  v42 = v19;
  v43 = v20;
  v27 = -1;
  while ( !sub_1768(&v25, v43) )
  {
    sub_1BC4((signed int)&v27, 0xCu, (int)&v25);
    if ( v4(&v27, v5) )
      break;
    v21 = v26(8, &v25, &v27);
    v22 = v21 == 9;
    if ( v21 != 9 )
      v22 = v21 == 5;
    v23 = v21;
    if ( v22 )
      goto LABEL_10;
  }
  v23 = 9;
LABEL_10:
  sub_193C((__int64 *)&v27);
  return v23;
}

//----- (0000252C) --------------------------------------------------------
void __fastcall restore_core_regs(int *a1)
{
  int v1; // ST04_4
  int v2; // r0
  int v3; // [sp+8h] [bp-4h]

  v1 = a1[13];
  v2 = *a1;
  JUMPOUT(__CS__, v3);
}

//----- (00002540) --------------------------------------------------------
__int64 *__fastcall _gnu_Unwind_Restore_VFP(__int64 *result)
{
  __int64 v1; // d0

  v1 = *result;
  return result;
}

//----- (00002548) --------------------------------------------------------
_QWORD *__fastcall _gnu_Unwind_Save_VFP(_QWORD *result)
{
  __int64 v1; // d0
  __int64 v2; // d1
  __int64 v3; // d2
  __int64 v4; // d3
  __int64 v5; // d4
  __int64 v6; // d5
  __int64 v7; // d6
  __int64 v8; // d7
  __int64 v9; // d8
  __int64 v10; // d9
  __int64 v11; // d10
  __int64 v12; // d11
  __int64 v13; // d12
  __int64 v14; // d13
  __int64 v15; // d14
  __int64 v16; // d15

  *result = v1;
  result[1] = v2;
  result[2] = v3;
  result[3] = v4;
  result[4] = v5;
  result[5] = v6;
  result[6] = v7;
  result[7] = v8;
  result[8] = v9;
  result[9] = v10;
  result[10] = v11;
  result[11] = v12;
  result[12] = v13;
  result[13] = v14;
  result[14] = v15;
  result[15] = v16;
  return result;
}

//----- (00002550) --------------------------------------------------------
__int64 *__fastcall _gnu_Unwind_Restore_VFP_D(__int64 *result)
{
  __int64 v1; // d0

  v1 = *result;
  return result;
}

//----- (00002558) --------------------------------------------------------
_QWORD *__fastcall _gnu_Unwind_Save_VFP_D(_QWORD *result)
{
  __int64 v1; // d0
  __int64 v2; // d1
  __int64 v3; // d2
  __int64 v4; // d3
  __int64 v5; // d4
  __int64 v6; // d5
  __int64 v7; // d6
  __int64 v8; // d7
  __int64 v9; // d8
  __int64 v10; // d9
  __int64 v11; // d10
  __int64 v12; // d11
  __int64 v13; // d12
  __int64 v14; // d13
  __int64 v15; // d14
  __int64 v16; // d15

  *result = v1;
  result[1] = v2;
  result[2] = v3;
  result[3] = v4;
  result[4] = v5;
  result[5] = v6;
  result[6] = v7;
  result[7] = v8;
  result[8] = v9;
  result[9] = v10;
  result[10] = v11;
  result[11] = v12;
  result[12] = v13;
  result[13] = v14;
  result[14] = v15;
  result[15] = v16;
  return result;
}

//----- (00002560) --------------------------------------------------------
__int64 *__fastcall _gnu_Unwind_Restore_VFP_D_16_to_31(__int64 *result)
{
  __int64 v1; // d16

  v1 = *result;
  return result;
}

//----- (00002568) --------------------------------------------------------
_QWORD *__fastcall _gnu_Unwind_Save_VFP_D_16_to_31(_QWORD *result)
{
  __int64 v1; // d16
  __int64 v2; // d17
  __int64 v3; // d18
  __int64 v4; // d19
  __int64 v5; // d20
  __int64 v6; // d21
  __int64 v7; // d22
  __int64 v8; // d23
  __int64 v9; // d24
  __int64 v10; // d25
  __int64 v11; // d26
  __int64 v12; // d27
  __int64 v13; // d28
  __int64 v14; // d29
  __int64 v15; // d30
  __int64 v16; // d31

  *result = v1;
  result[1] = v2;
  result[2] = v3;
  result[3] = v4;
  result[4] = v5;
  result[5] = v6;
  result[6] = v7;
  result[7] = v8;
  result[8] = v9;
  result[9] = v10;
  result[10] = v11;
  result[11] = v12;
  result[12] = v13;
  result[13] = v14;
  result[14] = v15;
  result[15] = v16;
  return result;
}

//----- (00002570) --------------------------------------------------------
int __fastcall _gnu_Unwind_Restore_WMMXD(int *a1)
{
  int *v5; // r0
  int result; // r0

  _T1 = *a1;
  v5 = a1 + 2;
  __asm { LDCL    p1, c0, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c1, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c2, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c3, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c4, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c5, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c6, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c7, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c8, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c9, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c10, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c11, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c12, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c13, [R0],#8 }
  _T1 = *v5;
  v5 += 2;
  __asm { LDCL    p1, c14, [R0],#8 }
  _T1 = *v5;
  result = (int)(v5 + 2);
  __asm { LDCL    p1, c15, [R0],#8 }
  return result;
}

//----- (000025B4) --------------------------------------------------------
void _gnu_Unwind_Save_WMMXD()
{
  __asm
  {
    STCL    p1, c0, [R0],#8
    STCL    p1, c1, [R0],#8
    STCL    p1, c2, [R0],#8
    STCL    p1, c3, [R0],#8
    STCL    p1, c4, [R0],#8
    STCL    p1, c5, [R0],#8
    STCL    p1, c6, [R0],#8
    STCL    p1, c7, [R0],#8
    STCL    p1, c8, [R0],#8
    STCL    p1, c9, [R0],#8
    STCL    p1, c10, [R0],#8
    STCL    p1, c11, [R0],#8
    STCL    p1, c12, [R0],#8
    STCL    p1, c13, [R0],#8
    STCL    p1, c14, [R0],#8
    STCL    p1, c15, [R0],#8
  }
}

//----- (000025F8) --------------------------------------------------------
int __fastcall _gnu_Unwind_Restore_WMMXC(int *a1)
{
  int *v5; // r0
  int result; // r0

  _T1 = *a1;
  v5 = a1 + 1;
  __asm { LDC2    p1, c8, [R0],#4 }
  _T1 = *v5;
  ++v5;
  __asm { LDC2    p1, c9, [R0],#4 }
  _T1 = *v5;
  ++v5;
  __asm { LDC2    p1, c10, [R0],#4 }
  _T1 = *v5;
  result = (int)(v5 + 1);
  __asm { LDC2    p1, c11, [R0],#4 }
  return result;
}

//----- (0000260C) --------------------------------------------------------
void _gnu_Unwind_Save_WMMXC()
{
  __asm
  {
    STC2    p1, c8, [R0],#4
    STC2    p1, c9, [R0],#4
    STC2    p1, c10, [R0],#4
    STC2    p1, c11, [R0],#4
  }
}

//----- (00002620) --------------------------------------------------------
signed int __fastcall __Unwind_RaiseException(int a1, int a2, int a3, int a4)
{
  int v5; // [sp+4h] [bp-44h]
  int v6; // [sp+8h] [bp-40h]
  int v7; // [sp+Ch] [bp-3Ch]
  int v8; // [sp+10h] [bp-38h]
  int v9; // [sp+14h] [bp-34h]

  v6 = a1;
  v7 = a2;
  v8 = a3;
  v9 = a4;
  v5 = 0;
  return _gnu_Unwind_RaiseException(a1, &v5);
}

//----- (00002644) --------------------------------------------------------
void __fastcall __noreturn __Unwind_Resume(int a1, int a2, int a3, int a4)
{
  int v4; // [sp+4h] [bp-44h]
  int v5; // [sp+8h] [bp-40h]
  int v6; // [sp+Ch] [bp-3Ch]
  int v7; // [sp+10h] [bp-38h]
  int v8; // [sp+14h] [bp-34h]

  v5 = a1;
  v6 = a2;
  v7 = a3;
  v8 = a4;
  v4 = 0;
  _gnu_Unwind_Resume(a1, (int)&v4, a3, 0);
}

//----- (00002668) --------------------------------------------------------
signed int __fastcall __noreturn __Unwind_Resume_or_Rethrow(int a1, int a2, int a3, int a4)
{
  int v5; // [sp+4h] [bp-44h]
  int v6; // [sp+8h] [bp-40h]
  int v7; // [sp+Ch] [bp-3Ch]
  int v8; // [sp+10h] [bp-38h]
  int v9; // [sp+14h] [bp-34h]

  v6 = a1;
  v7 = a2;
  v8 = a3;
  v9 = a4;
  v5 = 0;
  return _gnu_Unwind_Resume_or_Rethrow(a1, &v5);
}

//----- (0000268C) --------------------------------------------------------
signed int __fastcall __Unwind_ForcedUnwind(int a1, int a2, int a3, int a4)
{
  int v5; // [sp+4h] [bp-44h]
  int v6; // [sp+8h] [bp-40h]
  int v7; // [sp+Ch] [bp-3Ch]
  int v8; // [sp+10h] [bp-38h]
  int v9; // [sp+14h] [bp-34h]

  v6 = a1;
  v7 = a2;
  v8 = a3;
  v9 = a4;
  v5 = 0;
  return _gnu_Unwind_ForcedUnwind(a1, a2, a3, (int)&v5);
}

//----- (000026B0) --------------------------------------------------------
signed int __fastcall __Unwind_Backtrace(int (__fastcall *a1)(int *, int), int a2, int a3, int a4)
{
  int v5; // [sp+4h] [bp-44h]
  int (__fastcall *v6)(int *, int); // [sp+8h] [bp-40h]
  int v7; // [sp+Ch] [bp-3Ch]
  int v8; // [sp+10h] [bp-38h]
  int v9; // [sp+14h] [bp-34h]

  v6 = a1;
  v7 = a2;
  v8 = a3;
  v9 = a4;
  v5 = 0;
  return _gnu_Unwind_Backtrace(a1, a2, &v5);
}

//----- (000026D4) --------------------------------------------------------
signed int __fastcall sub_26D4(unsigned int *a1)
{
  unsigned int *v1; // r3
  char v2; // r2
  unsigned int *v3; // r2
  signed int result; // r0
  unsigned int v5; // kr00_4

  v1 = a1;
  if ( *((_BYTE *)a1 + 8) )
  {
    v2 = *((_BYTE *)a1 + 8) - 1;
LABEL_5:
    *((_BYTE *)a1 + 8) = v2;
    v5 = *a1 << 8;
    result = (unsigned __int64)*a1 >> 24;
    *v1 = v5;
    return result;
  }
  if ( *((_BYTE *)a1 + 9) )
  {
    --*((_BYTE *)a1 + 9);
    v3 = (unsigned int *)a1[1];
    *a1 = *v3;
    a1[1] = (unsigned int)(v3 + 1);
    v2 = 3;
    goto LABEL_5;
  }
  return 176;
}

//----- (0000272C) --------------------------------------------------------
signed int __fastcall _gnu_unwind_execute(unsigned int *a1, unsigned int *a2, int a3, int a4)
{
  unsigned int *v4; // r5
  unsigned int *v5; // r6
  signed int v6; // r7
  signed int v7; // r0
  char v8; // r4
  int v10; // r8
  int v11; // r8
  int v12; // r8
  int v13; // r3
  int v14; // r4
  int v15; // r2
  bool v16; // zf
  int v17; // r2
  unsigned int *v18; // r0
  signed int v19; // r1
  signed int v20; // r0
  char v21; // r0
  char v22; // r4
  _DWORD *v23; // r1
  int v24; // r0
  char v25; // r0
  int v26; // r2
  int v27; // r3
  int v28; // r4
  int v29; // r2
  char v30; // r0
  signed int v31; // r0
  signed int v32; // r3
  int v33; // r2
  char v34; // r0
  int v35; // r2
  int v36; // r3
  int v37; // r2
  int v38; // [sp+Ch] [bp-24h]

  v38 = a4;
  v4 = a1;
  v5 = a2;
  v6 = 0;
  while ( 1 )
  {
    v7 = sub_26D4(v5);
    v8 = v7;
    if ( v7 == 176 )
      break;
    if ( v7 & 0x80 )
    {
      v13 = v7 & 0xF0;
      switch ( v13 )
      {
        case 128:
          v14 = sub_26D4(v5) | (v7 << 8);
          if ( v14 == 0x8000 || Unwind_VRS_Pop(v4, 0, 16 * v14 & 0xFFFF, 0) )
            return 9;
          if ( 16 * (_WORD)v14 & 0x8000 )
            v6 = 1;
          break;
        case 144:
          v15 = v7 & 0xF;
          v16 = v15 == 13;
          if ( v15 != 13 )
            v16 = v15 == 15;
          if ( v16 )
            return 9;
          Unwind_VRS_Get((int)v4, 0, v15, 0, (unsigned int)&v38);
          Unwind_VRS_Set((signed int)v4, 0, 0xDu, 0, &v38);
          break;
        case 160:
          v17 = (4080 >> (~(_BYTE)v7 & 7)) & 0xFF0;
          if ( v7 & 8 )
            v17 |= 0x4000u;
          v18 = v4;
          v19 = 0;
          goto LABEL_57;
        case 176:
          if ( v7 == 177 )
          {
            v20 = sub_26D4(v5);
            v17 = v20;
            if ( !v20 )
              return 9;
            v19 = v20 & 0xF0;
            if ( v20 & 0xF0 )
              return 9;
            v18 = v4;
            goto LABEL_57;
          }
          if ( v7 != 178 )
          {
            if ( v7 == 179 )
            {
              v25 = sub_26D4(v5);
              v19 = 1;
              v26 = v25 & 0xF0;
              v27 = (v25 & 0xF) + 1;
              v18 = v4;
              goto LABEL_50;
            }
            if ( (v7 & 0xFC) == 180 )
              v28 = v7 & 3;
            else
              v28 = v7 & 7;
            v29 = v28 + 1;
            if ( (v7 & 0xFC) == 180 )
            {
              v18 = v4;
              v19 = 2;
              v17 = v29 | 0x40000;
            }
            else
            {
              v18 = v4;
              v19 = 1;
              v17 = v29 | 0x80000;
            }
LABEL_57:
            v32 = v19;
            goto LABEL_66;
          }
          Unwind_VRS_Get((int)v4, 0, 0xDu, 0, (unsigned int)&v38);
          v21 = sub_26D4(v5);
          v22 = 2;
          while ( 1 )
          {
            v23 = (_DWORD *)(v21 & 0x80);
            v16 = v23 == 0;
            v24 = v21 & 0x7F;
            if ( v16 )
              break;
            v38 += v24 << v22;
            v22 += 7;
            v21 = sub_26D4(v5);
          }
          v38 += 516 + (v24 << v22);
          Unwind_VRS_Set((signed int)v4, v23, 0xDu, (int)v23, &v38);
          break;
        case 192:
          if ( v7 == 198 )
          {
            v30 = sub_26D4(v5);
            v19 = 3;
            v26 = v30 & 0xF0;
            v27 = (v30 & 0xF) + 1;
            v18 = v4;
LABEL_50:
            v17 = v27 | (v26 << 12);
            goto LABEL_57;
          }
          if ( v7 != 199 )
          {
            if ( (v7 & 0xF8) != 192 )
            {
              if ( v7 == 200 )
              {
                v34 = sub_26D4(v5);
                v35 = (unsigned __int8)(v34 & 0xF0) + 16;
              }
              else
              {
                if ( v7 != 201 )
                  return 9;
                v34 = sub_26D4(v5);
                v35 = v34 & 0xF0;
              }
              v36 = (v34 & 0xF) + 1;
              v18 = v4;
              v19 = 1;
              v17 = v36 | (v35 << 12);
LABEL_65:
              v32 = 5;
              goto LABEL_66;
            }
            v33 = (v7 & 0xF) + 1;
            v18 = v4;
            v19 = 3;
            v17 = v33 | 0xA0000;
            goto LABEL_57;
          }
          v31 = sub_26D4(v5);
          v17 = v31;
          if ( !v31 )
            return 9;
          v32 = v31 & 0xF0;
          if ( v31 & 0xF0 )
            return 9;
          v18 = v4;
          v19 = 4;
LABEL_66:
          if ( Unwind_VRS_Pop(v18, v19, v17, v32) )
            return 9;
          break;
        default:
          if ( (v7 & 0xF8) != 208 )
            return 9;
          v37 = (v7 & 7) + 1;
          v18 = v4;
          v19 = 1;
          v17 = v37 | 0x80000;
          goto LABEL_65;
      }
    }
    else
    {
      v10 = (unsigned __int8)(4 * v7);
      Unwind_VRS_Get((int)v4, 0, 0xDu, 0, (unsigned int)&v38);
      v11 = v10 + 4;
      if ( v8 & 0x40 )
        v12 = v38 - v11;
      else
        v12 = v38 + v11;
      v38 = v12;
      Unwind_VRS_Set((signed int)v4, 0, 0xDu, 0, &v38);
    }
  }
  if ( !v6 )
  {
    Unwind_VRS_Get((int)v4, 0, 0xEu, 0, (unsigned int)&v38);
    Unwind_VRS_Set((signed int)v4, 0, 0xFu, 0, &v38);
  }
  return 0;
}

//----- (00002AC0) --------------------------------------------------------
signed int __fastcall _gnu_unwind_frame(int a1, unsigned int *a2, int a3, int a4)
{
  int v4; // r3
  int v5; // r3
  unsigned int *v7; // [sp+4h] [bp-14h]
  int v8; // [sp+8h] [bp-10h]
  int v9; // [sp+Ch] [bp-Ch]

  v7 = a2;
  v8 = a3;
  v9 = a4;
  v4 = *(_DWORD *)(a1 + 76);
  v7 = (unsigned int *)(*(_DWORD *)(v4 + 4) << 8);
  v8 = v4 + 8;
  LOBYTE(v9) = 3;
  v5 = *(unsigned __int8 *)(v4 + 7);
  BYTE1(v9) = v5;
  return _gnu_unwind_execute(a2, (unsigned int *)&v7, 3, v5);
}

//----- (00002B00) --------------------------------------------------------
int __fastcall Unwind_GetRegionStart(int a1, int a2, int a3, int a4)
{
  int v5; // [sp+Ch] [bp-Ch]

  v5 = a4;
  Unwind_VRS_Get(a1, 0, 0xCu, 0, (unsigned int)&v5);
  return *(_DWORD *)(v5 + 72);
}

//----- (00002B2C) --------------------------------------------------------
int __fastcall Unwind_GetLanguageSpecificData(int a1, int a2, int a3, int a4)
{
  int v5; // [sp+Ch] [bp-Ch]

  v5 = a4;
  Unwind_VRS_Get(a1, 0, 0xCu, 0, (unsigned int)&v5);
  return *(_DWORD *)(v5 + 76) + 4 * *(unsigned __int8 *)(*(_DWORD *)(v5 + 76) + 7) + 8;
}

void __noreturn Unwind_GetDataRelBase()
{
  abort();
}

void __noreturn Unwind_GetTextRelBase()
{
  abort();
}
