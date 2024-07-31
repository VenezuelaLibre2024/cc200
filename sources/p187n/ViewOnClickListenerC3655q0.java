package p187n;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p089g.C1931a;
import p089g.C1936f;
import p201o0.AbstractC3827c;
import p345y.C5782a;

/* renamed from: n.q0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC3655q0 extends AbstractC3827c implements View.OnClickListener {

    /* renamed from: A */
    public int f12993A;

    /* renamed from: B */
    public int f12994B;

    /* renamed from: C */
    public int f12995C;

    /* renamed from: D */
    public int f12996D;

    /* renamed from: E */
    public int f12997E;

    /* renamed from: F */
    public int f12998F;

    /* renamed from: s */
    public final SearchView f12999s;

    /* renamed from: t */
    public final SearchableInfo f13000t;

    /* renamed from: u */
    public final Context f13001u;

    /* renamed from: v */
    public final WeakHashMap<String, Drawable.ConstantState> f13002v;

    /* renamed from: w */
    public final int f13003w;

    /* renamed from: x */
    public boolean f13004x;

    /* renamed from: y */
    public int f13005y;

    /* renamed from: z */
    public ColorStateList f13006z;

    /* renamed from: n.q0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f13007a;

        /* renamed from: b */
        public final TextView f13008b;

        /* renamed from: c */
        public final ImageView f13009c;

        /* renamed from: d */
        public final ImageView f13010d;

        /* renamed from: e */
        public final ImageView f13011e;

        public a(View view) {
            this.f13007a = (TextView) view.findViewById(R.id.text1);
            this.f13008b = (TextView) view.findViewById(R.id.text2);
            this.f13009c = (ImageView) view.findViewById(R.id.icon1);
            this.f13010d = (ImageView) view.findViewById(R.id.icon2);
            this.f13011e = (ImageView) view.findViewById(C1936f.f7456q);
        }
    }

    public ViewOnClickListenerC3655q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f13004x = false;
        this.f13005y = 1;
        this.f12993A = -1;
        this.f12994B = -1;
        this.f12995C = -1;
        this.f12996D = -1;
        this.f12997E = -1;
        this.f12998F = -1;
        this.f12999s = searchView;
        this.f13000t = searchableInfo;
        this.f13003w = searchView.getSuggestionCommitIconResId();
        this.f13001u = context;
        this.f13002v = weakHashMap;
    }

    /* renamed from: o */
    public static String m13669o(Cursor cursor, String str) {
        return m13670w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: w */
    public static String m13670w(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* renamed from: A */
    public final void m13671A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f13002v.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    public final void m13672B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // p201o0.AbstractC3825a, p201o0.C3826b.a
    /* renamed from: a */
    public void mo13673a(Cursor cursor) {
        if (this.f13004x) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo13673a(cursor);
            if (cursor != null) {
                this.f12993A = cursor.getColumnIndex("suggest_text_1");
                this.f12994B = cursor.getColumnIndex("suggest_text_2");
                this.f12995C = cursor.getColumnIndex("suggest_text_2_url");
                this.f12996D = cursor.getColumnIndex("suggest_icon_1");
                this.f12997E = cursor.getColumnIndex("suggest_icon_2");
                this.f12998F = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p201o0.AbstractC3825a, p201o0.C3826b.a
    /* renamed from: c */
    public CharSequence mo13674c(Cursor cursor) {
        String m13669o;
        String m13669o2;
        if (cursor == null) {
            return null;
        }
        String m13669o3 = m13669o(cursor, "suggest_intent_query");
        if (m13669o3 != null) {
            return m13669o3;
        }
        if (this.f13000t.shouldRewriteQueryFromData() && (m13669o2 = m13669o(cursor, "suggest_intent_data")) != null) {
            return m13669o2;
        }
        if (!this.f13000t.shouldRewriteQueryFromText() || (m13669o = m13669o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m13669o;
    }

    @Override // p201o0.C3826b.a
    /* renamed from: d */
    public Cursor mo13675d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f12999s.getVisibility() == 0 && this.f12999s.getWindowVisibility() == 0) {
            try {
                Cursor m13688v = m13688v(this.f13000t, charSequence2, 50);
                if (m13688v != null) {
                    m13688v.getCount();
                    return m13688v;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // p201o0.AbstractC3825a
    /* renamed from: e */
    public void mo13676e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f12998F;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f13007a != null) {
            m13691z(aVar.f13007a, m13670w(cursor, this.f12993A));
        }
        if (aVar.f13008b != null) {
            String m13670w = m13670w(cursor, this.f12995C);
            CharSequence m13679l = m13670w != null ? m13679l(m13670w) : m13670w(cursor, this.f12994B);
            if (TextUtils.isEmpty(m13679l)) {
                TextView textView = aVar.f13007a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f13007a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f13007a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f13007a.setMaxLines(1);
                }
            }
            m13691z(aVar.f13008b, m13679l);
        }
        ImageView imageView = aVar.f13009c;
        if (imageView != null) {
            m13690y(imageView, m13686t(cursor), 4);
        }
        ImageView imageView2 = aVar.f13010d;
        if (imageView2 != null) {
            m13690y(imageView2, m13687u(cursor), 8);
        }
        int i12 = this.f13005y;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f13011e.setVisibility(8);
            return;
        }
        aVar.f13011e.setVisibility(0);
        aVar.f13011e.setTag(aVar.f13007a.getText());
        aVar.f13011e.setOnClickListener(this);
    }

    @Override // p201o0.AbstractC3825a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo14539g = mo14539g(this.f13001u, mo14537b(), viewGroup);
            if (mo14539g != null) {
                ((a) mo14539g.getTag()).f13007a.setText(e10.toString());
            }
            return mo14539g;
        }
    }

    @Override // p201o0.AbstractC3825a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View mo13677h = mo13677h(this.f13001u, mo14537b(), viewGroup);
            if (mo13677h != null) {
                ((a) mo13677h.getTag()).f13007a.setText(e10.toString());
            }
            return mo13677h;
        }
    }

    @Override // p201o0.AbstractC3827c, p201o0.AbstractC3825a
    /* renamed from: h */
    public View mo13677h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo13677h = super.mo13677h(context, cursor, viewGroup);
        mo13677h.setTag(new a(mo13677h));
        ((ImageView) mo13677h.findViewById(C1936f.f7456q)).setImageResource(this.f13003w);
        return mo13677h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: k */
    public final Drawable m13678k(String str) {
        Drawable.ConstantState constantState = this.f13002v.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    public final CharSequence m13679l(CharSequence charSequence) {
        if (this.f13006z == null) {
            TypedValue typedValue = new TypedValue();
            this.f13001u.getTheme().resolveAttribute(C1931a.f7326K, typedValue, true);
            this.f13006z = this.f13001u.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f13006z, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    public final Drawable m13680m(ComponentName componentName) {
        String nameNotFoundException;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f13001u.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e10) {
            nameNotFoundException = e10.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", nameNotFoundException);
        return null;
    }

    /* renamed from: n */
    public final Drawable m13681n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f13002v.containsKey(flattenToShortString)) {
            Drawable m13680m = m13680m(componentName);
            this.f13002v.put(flattenToShortString, m13680m != null ? m13680m.getConstantState() : null);
            return m13680m;
        }
        Drawable.ConstantState constantState = this.f13002v.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f13001u.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m13672B(mo14537b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m13672B(mo14537b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f12999s.m944S((CharSequence) tag);
        }
    }

    /* renamed from: p */
    public final Drawable m13682p() {
        Drawable m13681n = m13681n(this.f13000t.getSearchActivity());
        return m13681n != null ? m13681n : this.f13001u.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    public final Drawable m13683q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m13684r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f13001u.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    /* renamed from: r */
    public Drawable m13684r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f13001u.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: s */
    public final Drawable m13685s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f13001u.getPackageName() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + parseInt;
            Drawable m13678k = m13678k(str2);
            if (m13678k != null) {
                return m13678k;
            }
            Drawable drawable = C5782a.getDrawable(this.f13001u, parseInt);
            m13671A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m13678k2 = m13678k(str);
            if (m13678k2 != null) {
                return m13678k2;
            }
            Drawable m13683q = m13683q(Uri.parse(str));
            m13671A(str, m13683q);
            return m13683q;
        }
    }

    /* renamed from: t */
    public final Drawable m13686t(Cursor cursor) {
        int i10 = this.f12996D;
        if (i10 == -1) {
            return null;
        }
        Drawable m13685s = m13685s(cursor.getString(i10));
        return m13685s != null ? m13685s : m13682p();
    }

    /* renamed from: u */
    public final Drawable m13687u(Cursor cursor) {
        int i10 = this.f12997E;
        if (i10 == -1) {
            return null;
        }
        return m13685s(cursor.getString(i10));
    }

    /* renamed from: v */
    public Cursor m13688v(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f13001u.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: x */
    public void m13689x(int i10) {
        this.f13005y = i10;
    }

    /* renamed from: y */
    public final void m13690y(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    public final void m13691z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
