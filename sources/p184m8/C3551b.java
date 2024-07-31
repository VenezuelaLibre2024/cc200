package p184m8;

/* renamed from: m8.b */
/* loaded from: classes.dex */
public class C3551b implements InterfaceC3553d {

    /* renamed from: a */
    public final int f12449a;

    public C3551b(int i10) {
        this.f12449a = i10;
    }

    @Override // p184m8.InterfaceC3553d
    /* renamed from: a */
    public StackTraceElement[] mo13197a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f12449a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        int i11 = i10 / 2;
        int i12 = i10 - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i12);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i11, stackTraceElementArr2, i12, i11);
        return stackTraceElementArr2;
    }
}
