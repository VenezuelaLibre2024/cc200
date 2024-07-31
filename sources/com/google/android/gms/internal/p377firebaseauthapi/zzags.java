package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p337x7.C5738z1;

/* loaded from: classes.dex */
public final class zzags extends AbstractC2601a implements zzacr {
    public static final Parcelable.Creator<zzags> CREATOR = new zzagr();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzags() {
        this.zzi = true;
        this.zzj = true;
    }

    public zzags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.zze = C2394s.m9613f(str3);
        this.zzf = null;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb2.append("id_token=");
            sb2.append(this.zzc);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb2.append("access_token=");
            sb2.append(this.zzd);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb2.append("identifier=");
            sb2.append(this.zzf);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb2.append("oauth_token_secret=");
            sb2.append(this.zzh);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb2.append("code=");
            sb2.append(this.zzk);
            sb2.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb2.append("nonce=");
            sb2.append(str9);
            sb2.append("&");
        }
        sb2.append("providerId=");
        sb2.append(this.zze);
        this.zzg = sb2.toString();
        this.zzj = true;
    }

    public zzags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }

    public zzags(C5738z1 c5738z1, String str) {
        C2394s.m9619l(c5738z1);
        this.zzl = C2394s.m9613f(c5738z1.m22839d());
        this.zzm = C2394s.m9613f(str);
        this.zze = C2394s.m9613f(c5738z1.m22838c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, this.zza, false);
        C2603c.m10456F(parcel, 3, this.zzb, false);
        C2603c.m10456F(parcel, 4, this.zzc, false);
        C2603c.m10456F(parcel, 5, this.zzd, false);
        C2603c.m10456F(parcel, 6, this.zze, false);
        C2603c.m10456F(parcel, 7, this.zzf, false);
        C2603c.m10456F(parcel, 8, this.zzg, false);
        C2603c.m10456F(parcel, 9, this.zzh, false);
        C2603c.m10471g(parcel, 10, this.zzi);
        C2603c.m10471g(parcel, 11, this.zzj);
        C2603c.m10456F(parcel, 12, this.zzk, false);
        C2603c.m10456F(parcel, 13, this.zzl, false);
        C2603c.m10456F(parcel, 14, this.zzm, false);
        C2603c.m10456F(parcel, 15, this.zzn, false);
        C2603c.m10471g(parcel, 16, this.zzo);
        C2603c.m10456F(parcel, 17, this.zzp, false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final zzags zza(String str) {
        this.zzb = C2394s.m9613f(str);
        return this;
    }

    public final zzags zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 java.lang.String, still in use, count: 2, list:
          (r1v10 java.lang.String) from 0x0058: IF  (r1v10 java.lang.String) != (null java.lang.String)  -> B:19:0x0052 A[HIDDEN]
          (r1v10 java.lang.String) from 0x0052: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String) binds: [B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final java.lang.String zza() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.zzj
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.zzi
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.zzb
            if (r1 == 0) goto L1c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r3.zzg
            if (r1 == 0) goto L25
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L25:
            java.lang.String r1 = r3.zzn
            if (r1 == 0) goto L2e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L2e:
            java.lang.String r1 = r3.zzp
            if (r1 == 0) goto L37
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r3.zzl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = r3.zzl
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L46:
            java.lang.String r1 = r3.zzm
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L56
            java.lang.String r1 = r3.zzm
        L52:
            r0.put(r2, r1)
            goto L5b
        L56:
            java.lang.String r1 = r3.zza
            if (r1 == 0) goto L5b
            goto L52
        L5b:
            boolean r1 = r3.zzo
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p377firebaseauthapi.zzags.zza():java.lang.String");
    }

    public final zzags zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final zzags zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzags zzc(boolean z10) {
        this.zzi = true;
        return this;
    }
}
