package com.google.android.gms.internal.p377firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import p207o6.C3946o;

/* loaded from: classes.dex */
public class zzafi implements zzacq<zzafi> {
    private static final String zza = "zzafi";
    private String zzb;

    public zzafi() {
    }

    public zzafi(String str) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafi zza(String str) {
        try {
            this.zzb = C3946o.m14965a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
