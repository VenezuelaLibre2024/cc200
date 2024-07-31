package p322w8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: w8.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C5445q implements Continuation {

    /* renamed from: a */
    public static final Continuation f20296a = new C5445q();

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        String mo21598a;
        mo21598a = ((InterfaceC5440l) task.getResult()).mo21598a();
        return mo21598a;
    }
}
