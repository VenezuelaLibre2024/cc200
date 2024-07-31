package p187n;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p133j0.C3205d;

/* renamed from: n.a0 */
/* loaded from: classes.dex */
public final class C3617a0 {

    /* renamed from: a */
    public TextView f12760a;

    /* renamed from: b */
    public TextClassifier f12761b;

    /* renamed from: n.a0$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static TextClassifier m13390a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C3617a0(TextView textView) {
        this.f12760a = (TextView) C3205d.m11414j(textView);
    }

    /* renamed from: a */
    public TextClassifier m13388a() {
        TextClassifier textClassifier = this.f12761b;
        return textClassifier == null ? a.m13390a(this.f12760a) : textClassifier;
    }

    /* renamed from: b */
    public void m13389b(TextClassifier textClassifier) {
        this.f12761b = textClassifier;
    }
}
