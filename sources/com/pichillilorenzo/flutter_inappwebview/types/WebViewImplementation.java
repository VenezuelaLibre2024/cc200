package com.pichillilorenzo.flutter_inappwebview.types;

/* loaded from: classes2.dex */
public enum WebViewImplementation {
    NATIVE(0);

    private final int value;

    WebViewImplementation(int i10) {
        this.value = i10;
    }

    public static WebViewImplementation fromValue(int i10) {
        for (WebViewImplementation webViewImplementation : values()) {
            if (i10 == webViewImplementation.value) {
                return webViewImplementation;
            }
        }
        throw new IllegalArgumentException("No enum constant: " + i10);
    }

    public boolean equalsValue(int i10) {
        return this.value == i10;
    }

    public int rawValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }
}
