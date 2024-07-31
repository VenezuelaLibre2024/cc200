package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C1233a;
import java.util.Locale;
import p079f6.C1842b;

/* loaded from: classes.dex */
public class IntegrityServiceException extends C1842b {

    /* renamed from: a */
    private final Throwable f4618a;

    public IntegrityServiceException(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), C1233a.m5144a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f4618a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f4618a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
