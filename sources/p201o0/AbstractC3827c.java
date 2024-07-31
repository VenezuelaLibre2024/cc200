package p201o0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public abstract class AbstractC3827c extends AbstractC3825a {

    /* renamed from: p */
    public int f13770p;

    /* renamed from: q */
    public int f13771q;

    /* renamed from: r */
    public LayoutInflater f13772r;

    @Deprecated
    public AbstractC3827c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f13771q = i10;
        this.f13770p = i10;
        this.f13772r = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p201o0.AbstractC3825a
    /* renamed from: g */
    public View mo14539g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13772r.inflate(this.f13771q, viewGroup, false);
    }

    @Override // p201o0.AbstractC3825a
    /* renamed from: h */
    public View mo13677h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13772r.inflate(this.f13770p, viewGroup, false);
    }
}
