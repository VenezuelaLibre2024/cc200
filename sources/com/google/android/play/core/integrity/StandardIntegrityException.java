package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C1234b;
import java.util.Locale;
import p079f6.C1842b;

/* loaded from: classes.dex */
public class StandardIntegrityException extends C1842b {

    /* renamed from: a */
    private final Throwable f4619a;

    public StandardIntegrityException(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i10), C1234b.m5145a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f4619a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f4619a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
