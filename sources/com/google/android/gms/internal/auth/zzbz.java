package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import p182m6.AbstractC3538b;

/* loaded from: classes.dex */
public abstract class zzbz extends AbstractC3538b {
    @Override // p182m6.AbstractC3538b
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            Log.e("AUTH", "Error serializing object.", e10);
            return null;
        }
    }
}
