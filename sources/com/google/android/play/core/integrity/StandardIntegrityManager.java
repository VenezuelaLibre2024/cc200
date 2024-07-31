package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface StandardIntegrityManager {

    /* loaded from: classes.dex */
    public static abstract class PrepareIntegrityTokenRequest {

        /* loaded from: classes.dex */
        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j10);
        }

        public static Builder builder() {
            return new C1225f();
        }

        /* renamed from: a */
        public abstract long mo5108a();
    }

    /* loaded from: classes.dex */
    public static abstract class StandardIntegrityToken {
        public abstract String token();
    }

    /* loaded from: classes.dex */
    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* loaded from: classes.dex */
    public static abstract class StandardIntegrityTokenRequest {

        /* loaded from: classes.dex */
        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        public static Builder builder() {
            return new C1228i();
        }

        /* renamed from: a */
        public abstract String mo5109a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
