package p079f6;

import com.google.android.gms.common.api.Status;

/* renamed from: f6.b */
/* loaded from: classes.dex */
public class C1842b extends Exception {

    @Deprecated
    public final Status mStatus;

    public C1842b(Status status) {
        super(status.m4987J() + ": " + (status.m4988K() != null ? status.m4988K() : ""));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.m4987J();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.m4988K();
    }
}
