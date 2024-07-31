package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface RequestedWithHeaderMode {
        public static final int APP_PACKAGE_NAME = 1;
        public static final int NO_HEADER = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    int getRequestedWithHeaderMode();

    boolean getSafeBrowsingEnabled();

    int getWebAuthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z10);

    void setDisabledActionModeMenuItems(int i10);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z10);

    void setForceDark(int i10);

    void setForceDarkBehavior(int i10);

    void setOffscreenPreRaster(boolean z10);

    void setRequestedWithHeaderMode(int i10);

    void setSafeBrowsingEnabled(boolean z10);

    void setWebAuthnSupport(int i10);

    void setWillSuppressErrorPage(boolean z10);
}
