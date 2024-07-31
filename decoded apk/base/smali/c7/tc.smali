.class public final Lc7/tc;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field public final a:Lc7/k6;


# direct methods
.method public constructor <init>(Lc7/k6;)V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Lc7/tc;->a:Lc7/k6;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-nez p2, :cond_0

    iget-object p1, p0, Lc7/tc;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "App receiver called with null intent"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lc7/tc;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "App receiver called with null action"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p2, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lc7/tc;->a:Lc7/k6;

    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p2, "App receiver called with unknown action"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lc7/tc;->a:Lc7/k6;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lc7/k6;->u()Lc7/h;

    move-result-object p2

    sget-object v0, Lc7/i0;->I0:Lc7/m4;

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Lc7/h;->A(Ljava/lang/String;Lc7/m4;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->F()Lc7/x4;

    move-result-object p2

    const-string v0, "App receiver notified triggers are available"

    invoke-virtual {p2, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object p2

    new-instance v0, Lc7/vc;

    invoke-direct {v0, p1}, Lc7/vc;-><init>(Lc7/k6;)V

    invoke-virtual {p2, v0}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    :cond_4
    :goto_0
    return-void
.end method
