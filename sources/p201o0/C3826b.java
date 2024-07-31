package p201o0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public class C3826b extends Filter {

    /* renamed from: a */
    public a f13769a;

    /* renamed from: o0.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo13673a(Cursor cursor);

        /* renamed from: b */
        Cursor mo14537b();

        /* renamed from: c */
        CharSequence mo13674c(Cursor cursor);

        /* renamed from: d */
        Cursor mo13675d(CharSequence charSequence);
    }

    public C3826b(a aVar) {
        this.f13769a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f13769a.mo13674c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo13675d = this.f13769a.mo13675d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo13675d != null) {
            filterResults.count = mo13675d.getCount();
        } else {
            filterResults.count = 0;
            mo13675d = null;
        }
        filterResults.values = mo13675d;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo14537b = this.f13769a.mo14537b();
        Object obj = filterResults.values;
        if (obj == null || obj == mo14537b) {
            return;
        }
        this.f13769a.mo13673a((Cursor) obj);
    }
}
