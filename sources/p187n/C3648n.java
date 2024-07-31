package p187n;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: n.n */
/* loaded from: classes.dex */
public class C3648n {
    /* renamed from: a */
    public static InputConnection m13620a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC3633f1) {
                    editorInfo.hintText = ((InterfaceC3633f1) parent).m13503a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
