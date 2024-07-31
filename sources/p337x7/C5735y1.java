package p337x7;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzbj;
import com.google.android.gms.internal.p377firebaseauthapi.zzbp;
import com.google.android.gms.internal.p377firebaseauthapi.zzce;
import com.google.android.gms.internal.p377firebaseauthapi.zzkj;
import com.google.android.gms.internal.p377firebaseauthapi.zzkq;
import com.google.android.gms.internal.p377firebaseauthapi.zzlx;
import com.google.android.gms.internal.p377firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: x7.y1 */
/* loaded from: classes.dex */
public final class C5735y1 {

    /* renamed from: c */
    public static C5735y1 f21274c;

    /* renamed from: a */
    public final String f21275a;

    /* renamed from: b */
    public final zzlx f21276b;

    public C5735y1(Context context, String str, boolean z10) {
        zzlx zzlxVar;
        this.f21275a = str;
        try {
            zzkj.zza();
            zzlx.zza zza = new zzlx.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkq.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzlxVar = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzlxVar = null;
        }
        this.f21276b = zzlxVar;
    }

    /* renamed from: c */
    public static C5735y1 m22833c(Context context, String str) {
        C5735y1 c5735y1 = f21274c;
        if (c5735y1 == null || !zzw.zza(c5735y1.f21275a, str)) {
            f21274c = new C5735y1(context, str, true);
        }
        return f21274c;
    }

    /* renamed from: a */
    public final String m22834a() {
        if (this.f21276b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zza = zzbj.zza(byteArrayOutputStream);
        try {
            synchronized (this.f21276b) {
                this.f21276b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final String m22835b(String str) {
        String str2;
        zzlx zzlxVar = this.f21276b;
        if (zzlxVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzlxVar) {
                str2 = new String(((zzbp) this.f21276b.zza().zza(zzbp.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
