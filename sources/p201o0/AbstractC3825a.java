package p201o0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p201o0.C3826b;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public abstract class AbstractC3825a extends BaseAdapter implements Filterable, C3826b.a {

    /* renamed from: h */
    public boolean f13759h;

    /* renamed from: i */
    public boolean f13760i;

    /* renamed from: j */
    public Cursor f13761j;

    /* renamed from: k */
    public Context f13762k;

    /* renamed from: l */
    public int f13763l;

    /* renamed from: m */
    public a f13764m;

    /* renamed from: n */
    public DataSetObserver f13765n;

    /* renamed from: o */
    public C3826b f13766o;

    /* renamed from: o0.a$a */
    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AbstractC3825a.this.m14540i();
        }
    }

    /* renamed from: o0.a$b */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC3825a abstractC3825a = AbstractC3825a.this;
            abstractC3825a.f13759h = true;
            abstractC3825a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC3825a abstractC3825a = AbstractC3825a.this;
            abstractC3825a.f13759h = false;
            abstractC3825a.notifyDataSetInvalidated();
        }
    }

    public AbstractC3825a(Context context, Cursor cursor, boolean z10) {
        m14538f(context, cursor, z10 ? 1 : 2);
    }

    /* renamed from: a */
    public void mo13673a(Cursor cursor) {
        Cursor m14541j = m14541j(cursor);
        if (m14541j != null) {
            m14541j.close();
        }
    }

    @Override // p201o0.C3826b.a
    /* renamed from: b */
    public Cursor mo14537b() {
        return this.f13761j;
    }

    /* renamed from: c */
    public abstract CharSequence mo13674c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo13676e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public void m14538f(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f13760i = true;
        } else {
            this.f13760i = false;
        }
        boolean z10 = cursor != null;
        this.f13761j = cursor;
        this.f13759h = z10;
        this.f13762k = context;
        this.f13763l = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f13764m = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f13764m = null;
        }
        this.f13765n = bVar;
        if (z10) {
            a aVar = this.f13764m;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f13765n;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo14539g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f13759h || (cursor = this.f13761j) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f13759h) {
            return null;
        }
        this.f13761j.moveToPosition(i10);
        if (view == null) {
            view = mo14539g(this.f13762k, this.f13761j, viewGroup);
        }
        mo13676e(view, this.f13762k, this.f13761j);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f13766o == null) {
            this.f13766o = new C3826b(this);
        }
        return this.f13766o;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f13759h || (cursor = this.f13761j) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f13761j;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f13759h && (cursor = this.f13761j) != null && cursor.moveToPosition(i10)) {
            return this.f13761j.getLong(this.f13763l);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f13759h) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f13761j.moveToPosition(i10)) {
            if (view == null) {
                view = mo13677h(this.f13762k, this.f13761j, viewGroup);
            }
            mo13676e(view, this.f13762k, this.f13761j);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    /* renamed from: h */
    public abstract View mo13677h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    public void m14540i() {
        Cursor cursor;
        if (!this.f13760i || (cursor = this.f13761j) == null || cursor.isClosed()) {
            return;
        }
        this.f13759h = this.f13761j.requery();
    }

    /* renamed from: j */
    public Cursor m14541j(Cursor cursor) {
        Cursor cursor2 = this.f13761j;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f13764m;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f13765n;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f13761j = cursor;
        if (cursor != null) {
            a aVar2 = this.f13764m;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f13765n;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f13763l = cursor.getColumnIndexOrThrow("_id");
            this.f13759h = true;
            notifyDataSetChanged();
        } else {
            this.f13763l = -1;
            this.f13759h = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
