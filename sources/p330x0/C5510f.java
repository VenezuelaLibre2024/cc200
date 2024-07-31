package p330x0;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0261e;
import p133j0.C3205d;

/* renamed from: x0.f */
/* loaded from: classes.dex */
public final class C5510f {

    /* renamed from: a */
    public final b f20618a;

    /* renamed from: x0.f$a */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a */
        public final TextView f20619a;

        /* renamed from: b */
        public final C5508d f20620b;

        /* renamed from: c */
        public boolean f20621c = true;

        public a(TextView textView) {
            this.f20619a = textView;
            this.f20620b = new C5508d(textView);
        }

        @Override // p330x0.C5510f.b
        /* renamed from: a */
        public InputFilter[] mo22174a(InputFilter[] inputFilterArr) {
            return !this.f20621c ? m22179f(inputFilterArr) : m22177d(inputFilterArr);
        }

        @Override // p330x0.C5510f.b
        /* renamed from: b */
        public void mo22175b(boolean z10) {
            if (z10) {
                m22183j();
            }
        }

        @Override // p330x0.C5510f.b
        /* renamed from: c */
        public void mo22176c(boolean z10) {
            this.f20621c = z10;
            m22183j();
            m22182i();
        }

        /* renamed from: d */
        public final InputFilter[] m22177d(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f20620b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f20620b;
            return inputFilterArr2;
        }

        /* renamed from: e */
        public final SparseArray<InputFilter> m22178e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                if (inputFilterArr[i10] instanceof C5508d) {
                    sparseArray.put(i10, inputFilterArr[i10]);
                }
            }
            return sparseArray;
        }

        /* renamed from: f */
        public final InputFilter[] m22179f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> m22178e = m22178e(inputFilterArr);
            if (m22178e.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m22178e.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (m22178e.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: g */
        public void m22180g(boolean z10) {
            this.f20621c = z10;
        }

        /* renamed from: h */
        public final TransformationMethod m22181h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C5512h ? ((C5512h) transformationMethod).m22191a() : transformationMethod;
        }

        /* renamed from: i */
        public final void m22182i() {
            this.f20619a.setFilters(mo22174a(this.f20619a.getFilters()));
        }

        /* renamed from: j */
        public void m22183j() {
            this.f20619a.setTransformationMethod(m22185l(this.f20619a.getTransformationMethod()));
        }

        /* renamed from: k */
        public final TransformationMethod m22184k(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C5512h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C5512h(transformationMethod);
        }

        /* renamed from: l */
        public TransformationMethod m22185l(TransformationMethod transformationMethod) {
            return this.f20621c ? m22184k(transformationMethod) : m22181h(transformationMethod);
        }
    }

    /* renamed from: x0.f$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public InputFilter[] mo22174a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* renamed from: b */
        public void mo22175b(boolean z10) {
        }

        /* renamed from: c */
        public void mo22176c(boolean z10) {
        }
    }

    /* renamed from: x0.f$c */
    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a */
        public final a f20622a;

        public c(TextView textView) {
            this.f20622a = new a(textView);
        }

        @Override // p330x0.C5510f.b
        /* renamed from: a */
        public InputFilter[] mo22174a(InputFilter[] inputFilterArr) {
            return m22186d() ? inputFilterArr : this.f20622a.mo22174a(inputFilterArr);
        }

        @Override // p330x0.C5510f.b
        /* renamed from: b */
        public void mo22175b(boolean z10) {
            if (m22186d()) {
                return;
            }
            this.f20622a.mo22175b(z10);
        }

        @Override // p330x0.C5510f.b
        /* renamed from: c */
        public void mo22176c(boolean z10) {
            if (m22186d()) {
                this.f20622a.m22180g(z10);
            } else {
                this.f20622a.mo22176c(z10);
            }
        }

        /* renamed from: d */
        public final boolean m22186d() {
            return !C0261e.m1246h();
        }
    }

    public C5510f(TextView textView, boolean z10) {
        C3205d.m11415k(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f20618a = new b();
        } else {
            this.f20618a = !z10 ? new c(textView) : new a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] m22171a(InputFilter[] inputFilterArr) {
        return this.f20618a.mo22174a(inputFilterArr);
    }

    /* renamed from: b */
    public void m22172b(boolean z10) {
        this.f20618a.mo22175b(z10);
    }

    /* renamed from: c */
    public void m22173c(boolean z10) {
        this.f20618a.mo22176c(z10);
    }
}
