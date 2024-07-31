package p176m0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p133j0.C3203b;
import p133j0.C3205d;
import p148k0.C3308b0;
import p148k0.C3309c;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: m0.c */
/* loaded from: classes.dex */
public final class C3494c {

    /* renamed from: m0.c$a */
    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ c f12256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f12256a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f12256a.mo12995a(C3495d.m13002f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* renamed from: m0.c$b */
    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ c f12257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f12257a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C3494c.m13000e(str, bundle, this.f12257a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: m0.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        boolean mo12995a(C3495d c3495d, int i10, Bundle bundle);
    }

    /* renamed from: b */
    public static c m12997b(final View view) {
        C3205d.m11414j(view);
        return new c() { // from class: m0.b
            @Override // p176m0.C3494c.c
            /* renamed from: a */
            public final boolean mo12995a(C3495d c3495d, int i10, Bundle bundle) {
                boolean m13001f;
                m13001f = C3494c.m13001f(view, c3495d, i10, bundle);
                return m13001f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m12998c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m12999d(inputConnection, editorInfo, m12997b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m12999d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        C3203b.m11402d(inputConnection, "inputConnection must be non-null");
        C3203b.m11402d(editorInfo, "editorInfo must be non-null");
        C3203b.m11402d(cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : C3492a.m12986a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    public static boolean m13000e(String str, Bundle bundle, c cVar) {
        boolean z10;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z10 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z10 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th) {
            th = th;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i10 = bundle.getInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            if (uri != null && clipDescription != null) {
                r02 = cVar.mo12995a(new C3495d(uri, clipDescription, uri2), i10, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r02, null);
            }
            return r02;
        } catch (Throwable th2) {
            th = th2;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m13001f(View view, C3495d c3495d, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                c3495d.m13006d();
                InputContentInfo inputContentInfo = (InputContentInfo) c3495d.m13007e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return C3308b0.m12002P(view, new C3309c.a(new ClipData(c3495d.m13004b(), new ClipData.Item(c3495d.m13003a())), 2).m12187d(c3495d.m13005c()).m12185b(bundle).m12184a()) == null;
    }
}
