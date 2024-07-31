package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p089g.C1931a;
import p101h.DialogC2265g;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public class DialogC0184a extends DialogC2265g {

    /* renamed from: m */
    public final AlertController f638m;

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final AlertController.C0181f f639a;

        /* renamed from: b */
        public final int f640b;

        public a(Context context) {
            this(context, DialogC0184a.m673j(context, 0));
        }

        public a(Context context, int i10) {
            this.f639a = new AlertController.C0181f(new ContextThemeWrapper(context, DialogC0184a.m673j(context, i10)));
            this.f640b = i10;
        }

        /* renamed from: a */
        public DialogC0184a m676a() {
            DialogC0184a dialogC0184a = new DialogC0184a(this.f639a.f599a, this.f640b);
            this.f639a.m670a(dialogC0184a.f638m);
            dialogC0184a.setCancelable(this.f639a.f616r);
            if (this.f639a.f616r) {
                dialogC0184a.setCanceledOnTouchOutside(true);
            }
            dialogC0184a.setOnCancelListener(this.f639a.f617s);
            dialogC0184a.setOnDismissListener(this.f639a.f618t);
            DialogInterface.OnKeyListener onKeyListener = this.f639a.f619u;
            if (onKeyListener != null) {
                dialogC0184a.setOnKeyListener(onKeyListener);
            }
            return dialogC0184a;
        }

        /* renamed from: b */
        public Context m677b() {
            return this.f639a.f599a;
        }

        /* renamed from: c */
        public a m678c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0181f c0181f = this.f639a;
            c0181f.f621w = listAdapter;
            c0181f.f622x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public a m679d(View view) {
            this.f639a.f605g = view;
            return this;
        }

        /* renamed from: e */
        public a m680e(Drawable drawable) {
            this.f639a.f602d = drawable;
            return this;
        }

        /* renamed from: f */
        public a m681f(CharSequence charSequence) {
            this.f639a.f606h = charSequence;
            return this;
        }

        /* renamed from: g */
        public a m682g(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0181f c0181f = this.f639a;
            c0181f.f610l = c0181f.f599a.getText(i10);
            this.f639a.f612n = onClickListener;
            return this;
        }

        /* renamed from: h */
        public a m683h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0181f c0181f = this.f639a;
            c0181f.f610l = charSequence;
            c0181f.f612n = onClickListener;
            return this;
        }

        /* renamed from: i */
        public a m684i(DialogInterface.OnCancelListener onCancelListener) {
            this.f639a.f617s = onCancelListener;
            return this;
        }

        /* renamed from: j */
        public a m685j(DialogInterface.OnKeyListener onKeyListener) {
            this.f639a.f619u = onKeyListener;
            return this;
        }

        /* renamed from: k */
        public a m686k(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0181f c0181f = this.f639a;
            c0181f.f607i = c0181f.f599a.getText(i10);
            this.f639a.f609k = onClickListener;
            return this;
        }

        /* renamed from: l */
        public a m687l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0181f c0181f = this.f639a;
            c0181f.f607i = charSequence;
            c0181f.f609k = onClickListener;
            return this;
        }

        /* renamed from: m */
        public a m688m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0181f c0181f = this.f639a;
            c0181f.f621w = listAdapter;
            c0181f.f622x = onClickListener;
            c0181f.f591I = i10;
            c0181f.f590H = true;
            return this;
        }

        /* renamed from: n */
        public a m689n(CharSequence charSequence) {
            this.f639a.f604f = charSequence;
            return this;
        }
    }

    public DialogC0184a(Context context, int i10) {
        super(context, m673j(context, i10));
        this.f638m = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: j */
    public static int m673j(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1931a.f7343o, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: i */
    public ListView m674i() {
        return this.f638m.m647d();
    }

    /* renamed from: k */
    public void m675k(View view) {
        this.f638m.m661s(view);
    }

    @Override // p101h.DialogC2265g, androidx.activity.DialogC0155h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f638m.m648e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f638m.m649g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f638m.m650h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // p101h.DialogC2265g, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f638m.m659q(charSequence);
    }
}
