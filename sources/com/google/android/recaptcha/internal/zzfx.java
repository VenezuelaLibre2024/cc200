package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes.dex */
class zzfx extends zzfy {
    public final zzft zzb;
    public final Character zzc;

    public zzfx(zzft zzftVar, Character ch) {
        this.zzb = zzftVar;
        if (ch != null) {
            ch.charValue();
            if (zzftVar.zzd('=')) {
                throw new IllegalArgumentException(zzfi.zza("Padding character %s was already in alphabet", ch));
            }
        }
        this.zzc = ch;
    }

    public zzfx(String str, String str2, Character ch) {
        this(new zzft(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfx) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zzb.equals(zzfxVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzfxVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return (ch == null ? 0 : ch.hashCode()) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                str = ".omitPadding()";
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                str = "')";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzft zzftVar;
        CharSequence zze = zze(charSequence);
        if (!this.zzb.zzc(zze.length())) {
            throw new zzfw("Invalid input length " + zze.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            long j10 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                zzftVar = this.zzb;
                if (i12 >= zzftVar.zzc) {
                    break;
                }
                j10 <<= zzftVar.zzb;
                if (i10 + i12 < zze.length()) {
                    j10 |= this.zzb.zzb(zze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzftVar.zzd;
            int i15 = i13 * zzftVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((j10 >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += this.zzb.zzc;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzff.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public final int zzc(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public final int zzd(int i10) {
        zzft zzftVar = this.zzb;
        return zzftVar.zzc * zzga.zza(i10, zzftVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public final CharSequence zze(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzff.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzff.zza(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzft zzftVar = this.zzb;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzftVar.zzb) - i12);
            zzft zzftVar2 = this.zzb;
            appendable.append(zzftVar2.zza(((int) j11) & zzftVar2.zza));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }
}
