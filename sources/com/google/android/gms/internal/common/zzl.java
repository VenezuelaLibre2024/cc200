package com.google.android.gms.internal.common;

/* loaded from: classes.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = this.zza;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
