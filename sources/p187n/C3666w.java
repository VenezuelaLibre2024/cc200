package p187n;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p148k0.C3308b0;
import p148k0.C3309c;

/* renamed from: n.w */
/* loaded from: classes.dex */
public final class C3666w {

    /* renamed from: n.w$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m13713a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C3308b0.m12002P(textView, new C3309c.a(dragEvent.getClipData(), 3).m12184a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        public static boolean m13714b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C3308b0.m12002P(view, new C3309c.a(dragEvent.getClipData(), 3).m12184a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m13710a(View view, DragEvent dragEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && C3308b0.m12050x(view) != null) {
            Activity m13712c = m13712c(view);
            if (m13712c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.m13713a(dragEvent, (TextView) view, m13712c) : a.m13714b(dragEvent, view, m13712c);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m13711b(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 31 || C3308b0.m12050x(textView) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C3308b0.m12002P(textView, new C3309c.a(primaryClip, 1).m12186c(i10 != 16908322 ? 1 : 0).m12184a());
        }
        return true;
    }

    /* renamed from: c */
    public static Activity m13712c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
