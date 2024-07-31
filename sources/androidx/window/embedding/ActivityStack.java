package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import td.C4747g;
import td.C4753m;

@ExperimentalWindowApi
/* loaded from: classes.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> list, boolean z10) {
        C4753m.m18653f(list, "activities");
        this.activities = list;
        this.isEmpty = z10;
    }

    public /* synthetic */ ActivityStack(List list, boolean z10, int i10, C4747g c4747g) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean contains(Activity activity) {
        C4753m.m18653f(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return (C4753m.m18648a(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) ? false : true;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(C4753m.m18660m("activities=", getActivities$window_release()));
        sb2.append("isEmpty=" + this.isEmpty + '}');
        String sb3 = sb2.toString();
        C4753m.m18652e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
