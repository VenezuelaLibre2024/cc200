.class public Lc7/k6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/l7;


# static fields
.field public static volatile I:Lc7/k6;


# instance fields
.field public volatile A:Ljava/lang/Boolean;

.field public B:Ljava/lang/Boolean;

.field public C:Ljava/lang/Boolean;

.field public volatile D:Z

.field public E:I

.field public F:I

.field public G:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final H:J

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Lc7/c;

.field public final g:Lc7/h;

.field public final h:Lc7/i5;

.field public final i:Lc7/v4;

.field public final j:Lc7/d6;

.field public final k:Lc7/gb;

.field public final l:Lc7/qc;

.field public final m:Lc7/u4;

.field public final n:Lo6/d;

.field public final o:Lc7/p9;

.field public final p:Lc7/w7;

.field public final q:Lc7/b0;

.field public final r:Lc7/k9;

.field public final s:Ljava/lang/String;

.field public t:Lc7/s4;

.field public u:Lc7/y9;

.field public v:Lc7/z;

.field public w:Lc7/p4;

.field public x:Z

.field public y:Ljava/lang/Boolean;

.field public z:J


# direct methods
.method public constructor <init>(Lc7/u7;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc7/k6;->x:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lc7/k6;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lc7/u7;->a:Landroid/content/Context;

    new-instance v2, Lc7/c;

    invoke-direct {v2, v1}, Lc7/c;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lc7/k6;->f:Lc7/c;

    sput-object v2, Lc7/j4;->a:Lc7/c;

    iget-object v1, p1, Lc7/u7;->a:Landroid/content/Context;

    iput-object v1, p0, Lc7/k6;->a:Landroid/content/Context;

    iget-object v2, p1, Lc7/u7;->b:Ljava/lang/String;

    iput-object v2, p0, Lc7/k6;->b:Ljava/lang/String;

    iget-object v2, p1, Lc7/u7;->c:Ljava/lang/String;

    iput-object v2, p0, Lc7/k6;->c:Ljava/lang/String;

    iget-object v2, p1, Lc7/u7;->d:Ljava/lang/String;

    iput-object v2, p0, Lc7/k6;->d:Ljava/lang/String;

    iget-boolean v2, p1, Lc7/u7;->h:Z

    iput-boolean v2, p0, Lc7/k6;->e:Z

    iget-object v2, p1, Lc7/u7;->e:Ljava/lang/Boolean;

    iput-object v2, p0, Lc7/k6;->A:Ljava/lang/Boolean;

    iget-object v2, p1, Lc7/u7;->j:Ljava/lang/String;

    iput-object v2, p0, Lc7/k6;->s:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, p0, Lc7/k6;->D:Z

    iget-object v3, p1, Lc7/u7;->g:Lcom/google/android/gms/internal/measurement/zzdd;

    if-eqz v3, :cond_1

    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v4, :cond_1

    const-string v5, "measurementEnabled"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/Boolean;

    iput-object v4, p0, Lc7/k6;->B:Ljava/lang/Boolean;

    :cond_0
    iget-object v3, v3, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    const-string v4, "measurementDeactivated"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Boolean;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/Boolean;

    iput-object v3, p0, Lc7/k6;->C:Ljava/lang/Boolean;

    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzgv;->zzb(Landroid/content/Context;)V

    invoke-static {}, Lo6/g;->d()Lo6/d;

    move-result-object v3

    iput-object v3, p0, Lc7/k6;->n:Lo6/d;

    iget-object v4, p1, Lc7/u7;->i:Ljava/lang/Long;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    :goto_0
    iput-wide v3, p0, Lc7/k6;->H:J

    new-instance v3, Lc7/h;

    invoke-direct {v3, p0}, Lc7/h;-><init>(Lc7/k6;)V

    iput-object v3, p0, Lc7/k6;->g:Lc7/h;

    new-instance v3, Lc7/i5;

    invoke-direct {v3, p0}, Lc7/i5;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/i7;->l()V

    iput-object v3, p0, Lc7/k6;->h:Lc7/i5;

    new-instance v3, Lc7/v4;

    invoke-direct {v3, p0}, Lc7/v4;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/i7;->l()V

    iput-object v3, p0, Lc7/k6;->i:Lc7/v4;

    new-instance v3, Lc7/qc;

    invoke-direct {v3, p0}, Lc7/qc;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/i7;->l()V

    iput-object v3, p0, Lc7/k6;->l:Lc7/qc;

    new-instance v3, Lc7/t7;

    invoke-direct {v3, p1, p0}, Lc7/t7;-><init>(Lc7/u7;Lc7/k6;)V

    new-instance v4, Lc7/u4;

    invoke-direct {v4, v3}, Lc7/u4;-><init>(Lc7/t4;)V

    iput-object v4, p0, Lc7/k6;->m:Lc7/u4;

    new-instance v3, Lc7/b0;

    invoke-direct {v3, p0}, Lc7/b0;-><init>(Lc7/k6;)V

    iput-object v3, p0, Lc7/k6;->q:Lc7/b0;

    new-instance v3, Lc7/p9;

    invoke-direct {v3, p0}, Lc7/p9;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/e3;->r()V

    iput-object v3, p0, Lc7/k6;->o:Lc7/p9;

    new-instance v3, Lc7/w7;

    invoke-direct {v3, p0}, Lc7/w7;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/e3;->r()V

    iput-object v3, p0, Lc7/k6;->p:Lc7/w7;

    new-instance v3, Lc7/gb;

    invoke-direct {v3, p0}, Lc7/gb;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/e3;->r()V

    iput-object v3, p0, Lc7/k6;->k:Lc7/gb;

    new-instance v3, Lc7/k9;

    invoke-direct {v3, p0}, Lc7/k9;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/i7;->l()V

    iput-object v3, p0, Lc7/k6;->r:Lc7/k9;

    new-instance v3, Lc7/d6;

    invoke-direct {v3, p0}, Lc7/d6;-><init>(Lc7/k6;)V

    invoke-virtual {v3}, Lc7/i7;->l()V

    iput-object v3, p0, Lc7/k6;->j:Lc7/d6;

    iget-object v4, p1, Lc7/u7;->g:Lcom/google/android/gms/internal/measurement/zzdd;

    if-eqz v4, :cond_3

    iget-wide v4, v4, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-eqz v4, :cond_3

    move v0, v2

    :cond_3
    xor-int/2addr v0, v2

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v1

    invoke-virtual {v1}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    iget-object v4, v1, Lc7/w7;->c:Lc7/e9;

    if-nez v4, :cond_4

    new-instance v4, Lc7/e9;

    invoke-direct {v4, v1}, Lc7/e9;-><init>(Lc7/w7;)V

    iput-object v4, v1, Lc7/w7;->c:Lc7/e9;

    :cond_4
    if-eqz v0, :cond_6

    iget-object v0, v1, Lc7/w7;->c:Lc7/e9;

    invoke-virtual {v2, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, v1, Lc7/w7;->c:Lc7/e9;

    invoke-virtual {v2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Registered activity lifecycle callback"

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Application context is not an Application"

    :goto_1
    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_6
    new-instance v0, Lc7/l6;

    invoke-direct {v0, p0, p1}, Lc7/l6;-><init>(Lc7/k6;Lc7/u7;)V

    invoke-virtual {v3, v0}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lc7/k6;
    .locals 12

    if-eqz p1, :cond_1

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzf:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdd;

    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zza:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzb:J

    iget-boolean v6, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzc:Z

    iget-object v7, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzd:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget-object v10, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    const/4 v11, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/measurement/zzdd;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lc7/k6;->I:Lc7/k6;

    if-nez v0, :cond_3

    const-class v0, Lc7/k6;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lc7/k6;->I:Lc7/k6;

    if-nez v1, :cond_2

    new-instance v1, Lc7/u7;

    invoke-direct {v1, p0, p1, p2}, Lc7/u7;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)V

    new-instance p0, Lc7/k6;

    invoke-direct {p0, v1}, Lc7/k6;-><init>(Lc7/u7;)V

    sput-object p0, Lc7/k6;->I:Lc7/k6;

    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    if-eqz p1, :cond_4

    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz p0, :cond_4

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0, p2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lc7/k6;->I:Lc7/k6;

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lc7/k6;->I:Lc7/k6;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lc7/k6;->h(Z)V

    :cond_4
    :goto_0
    sget-object p0, Lc7/k6;->I:Lc7/k6;

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lc7/k6;->I:Lc7/k6;

    return-object p0
.end method

.method public static b(Lc7/e3;)V
    .locals 3

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lc7/e3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Component not initialized: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic c(Lc7/k6;Lc7/u7;)V
    .locals 3

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    new-instance v0, Lc7/z;

    invoke-direct {v0, p0}, Lc7/z;-><init>(Lc7/k6;)V

    invoke-virtual {v0}, Lc7/i7;->l()V

    iput-object v0, p0, Lc7/k6;->v:Lc7/z;

    new-instance v0, Lc7/p4;

    iget-wide v1, p1, Lc7/u7;->f:J

    invoke-direct {v0, p0, v1, v2}, Lc7/p4;-><init>(Lc7/k6;J)V

    invoke-virtual {v0}, Lc7/e3;->r()V

    iput-object v0, p0, Lc7/k6;->w:Lc7/p4;

    new-instance p1, Lc7/s4;

    invoke-direct {p1, p0}, Lc7/s4;-><init>(Lc7/k6;)V

    invoke-virtual {p1}, Lc7/e3;->r()V

    iput-object p1, p0, Lc7/k6;->t:Lc7/s4;

    new-instance p1, Lc7/y9;

    invoke-direct {p1, p0}, Lc7/y9;-><init>(Lc7/k6;)V

    invoke-virtual {p1}, Lc7/e3;->r()V

    iput-object p1, p0, Lc7/k6;->u:Lc7/y9;

    iget-object p1, p0, Lc7/k6;->l:Lc7/qc;

    invoke-virtual {p1}, Lc7/i7;->m()V

    iget-object p1, p0, Lc7/k6;->h:Lc7/i5;

    invoke-virtual {p1}, Lc7/i7;->m()V

    iget-object p1, p0, Lc7/k6;->w:Lc7/p4;

    invoke-virtual {p1}, Lc7/e3;->s()V

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->E()Lc7/x4;

    move-result-object p1

    const-wide/32 v1, 0x14822

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "App measurement initialized, version"

    invoke-virtual {p1, v2, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->E()Lc7/x4;

    move-result-object p1

    const-string v1, "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"

    invoke-virtual {p1, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lc7/p4;->A()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lc7/k6;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/qc;->A0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->E()Lc7/x4;

    move-result-object p1

    const-string v0, "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->E()Lc7/x4;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string v0, "Debug-level message logging enabled"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    iget p1, p0, Lc7/k6;->E:I

    iget-object v0, p0, Lc7/k6;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq p1, v0, :cond_2

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    iget v0, p0, Lc7/k6;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lc7/k6;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Not all components initialized"

    invoke-virtual {p1, v2, v0, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lc7/k6;->x:Z

    return-void
.end method

.method public static d(Lc7/i7;)V
    .locals 3

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lc7/i7;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Component not initialized: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lc7/j7;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Component not created"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final A()Lc7/i5;
    .locals 1

    iget-object v0, p0, Lc7/k6;->h:Lc7/i5;

    invoke-static {v0}, Lc7/k6;->e(Lc7/j7;)V

    iget-object v0, p0, Lc7/k6;->h:Lc7/i5;

    return-object v0
.end method

.method public final B()Lc7/d6;
    .locals 1

    iget-object v0, p0, Lc7/k6;->j:Lc7/d6;

    return-object v0
.end method

.method public final C()Lc7/w7;
    .locals 1

    iget-object v0, p0, Lc7/k6;->p:Lc7/w7;

    invoke-static {v0}, Lc7/k6;->b(Lc7/e3;)V

    iget-object v0, p0, Lc7/k6;->p:Lc7/w7;

    return-object v0
.end method

.method public final D()Lc7/p9;
    .locals 1

    iget-object v0, p0, Lc7/k6;->o:Lc7/p9;

    invoke-static {v0}, Lc7/k6;->b(Lc7/e3;)V

    iget-object v0, p0, Lc7/k6;->o:Lc7/p9;

    return-object v0
.end method

.method public final E()Lc7/y9;
    .locals 1

    iget-object v0, p0, Lc7/k6;->u:Lc7/y9;

    invoke-static {v0}, Lc7/k6;->b(Lc7/e3;)V

    iget-object v0, p0, Lc7/k6;->u:Lc7/y9;

    return-object v0
.end method

.method public final F()Lc7/gb;
    .locals 1

    iget-object v0, p0, Lc7/k6;->k:Lc7/gb;

    invoke-static {v0}, Lc7/k6;->b(Lc7/e3;)V

    iget-object v0, p0, Lc7/k6;->k:Lc7/gb;

    return-object v0
.end method

.method public final G()Lc7/qc;
    .locals 1

    iget-object v0, p0, Lc7/k6;->l:Lc7/qc;

    invoke-static {v0}, Lc7/k6;->e(Lc7/j7;)V

    iget-object v0, p0, Lc7/k6;->l:Lc7/qc;

    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/k6;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/k6;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/k6;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/k6;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final L()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call on client side"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final M()V
    .locals 1

    iget-object v0, p0, Lc7/k6;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/measurement/zzdd;)V
    .locals 9

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    sget-object v1, Lc7/i0;->I0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/qc;->Q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v2, Lc7/tc;

    iget-object v3, v0, Lc7/j7;->a:Lc7/k6;

    invoke-direct {v2, v3}, Lc7/tc;-><init>(Lc7/k6;)V

    invoke-virtual {v0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v2, v1, v4}, Ly/a;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    invoke-virtual {v0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Registered app receiver"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->G()Lc7/n7;

    move-result-object v0

    invoke-virtual {v0}, Lc7/n7;->b()I

    move-result v1

    iget-object v2, p0, Lc7/k6;->g:Lc7/h;

    const-string v3, "google_analytics_default_allow_ad_storage"

    invoke-virtual {v2, v3}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, p0, Lc7/k6;->g:Lc7/h;

    const-string v4, "google_analytics_default_allow_analytics_storage"

    invoke-virtual {v3, v4}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    const/16 v4, -0xa

    const/4 v5, 0x0

    const/16 v6, 0x1e

    if-nez v2, :cond_1

    if-eqz v3, :cond_2

    :cond_1
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lc7/i5;->s(I)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v1, Lc7/n7;

    invoke-direct {v1, v2, v3, v4}, Lc7/n7;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    if-eqz v1, :cond_3

    if-eq v1, v6, :cond_3

    const/16 v2, 0xa

    if-eq v1, v2, :cond_3

    if-eq v1, v6, :cond_3

    if-eq v1, v6, :cond_3

    const/16 v2, 0x28

    if-ne v1, v2, :cond_4

    :cond_3
    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v1

    new-instance v2, Lc7/n7;

    invoke-direct {v2, v5, v5, v4}, Lc7/n7;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;I)V

    iget-wide v7, p0, Lc7/k6;->H:J

    invoke-virtual {v1, v2, v7, v8}, Lc7/w7;->G(Lc7/n7;J)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    if-eqz p1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v1

    invoke-virtual {v1, v6}, Lc7/i5;->s(I)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    invoke-static {v1, v6}, Lc7/n7;->c(Landroid/os/Bundle;I)Lc7/n7;

    move-result-object v1

    invoke-virtual {v1}, Lc7/n7;->z()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    :goto_0
    move-object v1, v5

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    iget-wide v2, p0, Lc7/k6;->H:J

    invoke-virtual {v0, v1, v2, v3}, Lc7/w7;->G(Lc7/n7;J)V

    move-object v0, v1

    :cond_6
    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc7/w7;->F(Lc7/n7;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    sget-object v2, Lc7/i0;->P0:Lc7/m4;

    invoke-virtual {v0, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->F()Lc7/w;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w;->a()I

    move-result v0

    iget-object v2, p0, Lc7/k6;->g:Lc7/h;

    const-string v3, "google_analytics_default_allow_ad_user_data"

    invoke-virtual {v2, v3}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v4, v0}, Lc7/n7;->k(II)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    new-instance v0, Lc7/w;

    invoke-direct {v0, v2, v4}, Lc7/w;-><init>(Ljava/lang/Boolean;I)V

    :goto_2
    invoke-virtual {p1, v0}, Lc7/w7;->E(Lc7/w;)V

    goto/16 :goto_3

    :cond_7
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    if-eqz v0, :cond_8

    if-ne v0, v6, :cond_9

    :cond_8
    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    new-instance v0, Lc7/w;

    invoke-direct {v0, v5, v4}, Lc7/w;-><init>(Ljava/lang/Boolean;I)V

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    if-eqz p1, :cond_a

    iget-object v2, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v2, :cond_a

    invoke-static {v6, v0}, Lc7/n7;->k(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    invoke-static {v0, v6}, Lc7/w;->b(Landroid/os/Bundle;I)Lc7/w;

    move-result-object v0

    invoke-virtual {v0}, Lc7/w;->j()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v2

    invoke-virtual {v2, v0}, Lc7/w7;->E(Lc7/w;)V

    :cond_a
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    if-eqz p1, :cond_b

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->o:Lc7/o5;

    invoke-virtual {v0}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zzg:Landroid/os/Bundle;

    invoke-static {v0}, Lc7/w;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v2

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdd;->zze:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "allow_personalized_ads"

    invoke-virtual {v2, p1, v3, v0, v1}, Lc7/w7;->X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_b
    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqf;->zza()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lc7/k6;->g:Lc7/h;

    sget-object v0, Lc7/i0;->a1:Lc7/m4;

    invoke-virtual {p1, v0}, Lc7/h;->o(Lc7/m4;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string v0, "TCF client enabled."

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p1}, Lc7/w7;->p0()V

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p1}, Lc7/w7;->n0()V

    :cond_c
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->g:Lc7/n5;

    invoke-virtual {p1}, Lc7/n5;->a()J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long p1, v2, v6

    if-nez p1, :cond_d

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    iget-wide v2, p0, Lc7/k6;->H:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "Persisting first open"

    invoke-virtual {p1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->g:Lc7/n5;

    iget-wide v2, p0, Lc7/k6;->H:J

    invoke-virtual {p1, v2, v3}, Lc7/n5;->b(J)V

    :cond_d
    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    iget-object p1, p1, Lc7/w7;->n:Lc7/uc;

    invoke-virtual {p1}, Lc7/uc;->c()V

    invoke-virtual {p0}, Lc7/k6;->n()Z

    move-result p1

    if-nez p1, :cond_12

    invoke-virtual {p0}, Lc7/k6;->k()Z

    move-result p1

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, Lc7/qc;->z0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_e

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "App is missing INTERNET permission"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_e
    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, Lc7/qc;->z0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_f

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "App is missing ACCESS_NETWORK_STATE permission"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_f
    iget-object p1, p0, Lc7/k6;->a:Landroid/content/Context;

    invoke-static {p1}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object p1

    invoke-virtual {p1}, Lq6/b;->f()Z

    move-result p1

    if-nez p1, :cond_11

    iget-object p1, p0, Lc7/k6;->g:Lc7/h;

    invoke-virtual {p1}, Lc7/h;->O()Z

    move-result p1

    if-nez p1, :cond_11

    iget-object p1, p0, Lc7/k6;->a:Landroid/content/Context;

    invoke-static {p1}, Lc7/qc;->Y(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "AppMeasurementReceiver not registered/enabled"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_10
    iget-object p1, p0, Lc7/k6;->a:Landroid/content/Context;

    invoke-static {p1, v1}, Lc7/qc;->Z(Landroid/content/Context;Z)Z

    move-result p1

    if-nez p1, :cond_11

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "AppMeasurementService not registered/enabled"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_11
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "Uploading is not possible. App measurement disabled"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_12
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_15

    :cond_13
    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->M()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v2

    invoke-virtual {v2}, Lc7/i5;->L()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lc7/qc;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->E()Lc7/x4;

    move-result-object p1

    const-string v0, "Rechecking which service to use due to a GMP App Id change"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    invoke-virtual {p1}, Lc7/i5;->N()V

    invoke-virtual {p0}, Lc7/k6;->x()Lc7/s4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/s4;->C()V

    iget-object p1, p0, Lc7/k6;->u:Lc7/y9;

    invoke-virtual {p1}, Lc7/y9;->U()V

    iget-object p1, p0, Lc7/k6;->u:Lc7/y9;

    invoke-virtual {p1}, Lc7/y9;->T()V

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->g:Lc7/n5;

    iget-wide v0, p0, Lc7/k6;->H:J

    invoke-virtual {p1, v0, v1}, Lc7/n5;->b(J)V

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {p1, v5}, Lc7/o5;->b(Ljava/lang/String;)V

    :cond_14
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc7/i5;->C(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc7/i5;->z(Ljava/lang/String;)V

    :cond_15
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    invoke-virtual {p1}, Lc7/i5;->G()Lc7/n7;

    move-result-object p1

    sget-object v0, Lc7/n7$a;->j:Lc7/n7$a;

    invoke-virtual {p1, v0}, Lc7/n7;->l(Lc7/n7$a;)Z

    move-result p1

    if-nez p1, :cond_16

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {p1, v5}, Lc7/o5;->b(Ljava/lang/String;)V

    :cond_16
    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->i:Lc7/o5;

    invoke-virtual {v0}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc7/w7;->P(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    invoke-virtual {p1}, Lc7/qc;->R0()Z

    move-result p1

    if-nez p1, :cond_17

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {p1}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_17

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string v0, "Remote config removed with active feature rollouts"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {p1, v5}, Lc7/o5;->b(Ljava/lang/String;)V

    :cond_17
    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1b

    :cond_18
    invoke-virtual {p0}, Lc7/k6;->k()Z

    move-result p1

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->x()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    invoke-virtual {v0}, Lc7/h;->N()Z

    move-result v0

    if-nez v0, :cond_19

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lc7/i5;->A(Z)V

    :cond_19
    if-eqz p1, :cond_1a

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object p1

    invoke-virtual {p1}, Lc7/w7;->j0()V

    :cond_1a
    invoke-virtual {p0}, Lc7/k6;->F()Lc7/gb;

    move-result-object p1

    iget-object p1, p1, Lc7/gb;->e:Lc7/pb;

    invoke-virtual {p1}, Lc7/pb;->a()V

    invoke-virtual {p0}, Lc7/k6;->E()Lc7/y9;

    move-result-object p1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p1, v0}, Lc7/y9;->L(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {p0}, Lc7/k6;->E()Lc7/y9;

    move-result-object p1

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->A:Lc7/k5;

    invoke-virtual {v0}, Lc7/k5;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc7/y9;->x(Landroid/os/Bundle;)V

    :cond_1b
    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result p1

    if-eqz p1, :cond_1c

    iget-object p1, p0, Lc7/k6;->g:Lc7/h;

    sget-object v0, Lc7/i0;->I0:Lc7/m4;

    invoke-virtual {p1, v0}, Lc7/h;->o(Lc7/m4;)Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    invoke-virtual {p1}, Lc7/qc;->Q0()Z

    move-result p1

    if-eqz p1, :cond_1c

    new-instance p1, Ljava/lang/Thread;

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lc7/j6;

    invoke-direct {v1, v0}, Lc7/j6;-><init>(Lc7/w7;)V

    invoke-direct {p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_1c
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->q:Lc7/l5;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lc7/l5;->a(Z)V

    return-void
.end method

.method public final synthetic g(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 5

    const-string p1, "gbraid"

    const-string p5, "gclid"

    const-string v0, ""

    const/4 v1, 0x1

    const/16 v2, 0xc8

    if-eq p2, v2, :cond_0

    const/16 v2, 0xcc

    if-eq p2, v2, :cond_0

    const/16 v2, 0x130

    if-ne p2, v2, :cond_1

    :cond_0
    if-nez p3, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p4, "Network Request for Deferred Deep Link failed. response, exception"

    invoke-virtual {p1, p4, p2, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object p2

    iget-object p2, p2, Lc7/i5;->v:Lc7/l5;

    invoke-virtual {p2, v1}, Lc7/l5;->a(Z)V

    if-eqz p4, :cond_9

    array-length p2, p4

    if-nez p2, :cond_3

    goto/16 :goto_2

    :cond_3
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p4}, Ljava/lang/String;-><init>([B)V

    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "deeplink"

    invoke-virtual {p3, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "timestamp"

    const-wide/16 v2, 0x0

    invoke-virtual {p3, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string p2, "Deferred Deep Link is empty."

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zza()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lc7/k6;->g:Lc7/h;

    sget-object v4, Lc7/i0;->W0:Lc7/m4;

    invoke-virtual {v3, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v3

    invoke-virtual {v3, p2}, Lc7/qc;->F0(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p3, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    invoke-virtual {p1, p3, p4, v0, p2}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {p3, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc7/qc;->F0(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string p3, "Deferred Deep Link validation failed. gclid, deep link"

    invoke-virtual {p1, p3, p4, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_7
    :goto_1
    invoke-virtual {p3, p5, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "_cis"

    const-string p4, "ddp"

    invoke-virtual {p3, p1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lc7/k6;->p:Lc7/w7;

    const-string p4, "auto"

    const-string p5, "_cmp"

    invoke-virtual {p1, p4, p5, p3}, Lc7/w7;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object p1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_8

    invoke-virtual {p1, p2, v1, v2}, Lc7/qc;->d0(Ljava/lang/String;D)Z

    move-result p2

    if-eqz p2, :cond_8

    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.google.analytics.action.DEEPLINK_ACTION"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_8
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string p3, "Failed to parse the Deferred Deep Link response. exception"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_9
    :goto_2
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->A()Lc7/x4;

    move-result-object p1

    const-string p2, "Deferred Deep Link response empty."

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final h(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lc7/k6;->A:Ljava/lang/Boolean;

    return-void
.end method

.method public final i()V
    .locals 1

    iget v0, p0, Lc7/k6;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc7/k6;->E:I

    return-void
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lc7/k6;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/k6;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 1

    invoke-virtual {p0}, Lc7/k6;->s()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()Z
    .locals 1

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-boolean v0, p0, Lc7/k6;->D:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lc7/k6;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 5

    iget-boolean v0, p0, Lc7/k6;->x:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/k6;->y:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lc7/k6;->z:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lc7/k6;->n:Lo6/d;

    invoke-interface {v0}, Lo6/d;->b()J

    move-result-wide v0

    iget-wide v2, p0, Lc7/k6;->z:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    :cond_0
    iget-object v0, p0, Lc7/k6;->n:Lo6/d;

    invoke-interface {v0}, Lo6/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lc7/k6;->z:J

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    const-string v1, "android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lc7/qc;->z0(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v3}, Lc7/qc;->z0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc7/k6;->a:Landroid/content/Context;

    invoke-static {v0}, Lq6/c;->a(Landroid/content/Context;)Lq6/b;

    move-result-object v0

    invoke-virtual {v0}, Lq6/b;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    invoke-virtual {v0}, Lc7/h;->O()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc7/k6;->a:Landroid/content/Context;

    invoke-static {v0}, Lc7/qc;->Y(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc7/k6;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lc7/qc;->Z(Landroid/content/Context;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lc7/k6;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v0

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/p4;->B()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lc7/qc;->f0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    :cond_4
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lc7/k6;->y:Ljava/lang/Boolean;

    :cond_5
    iget-object v0, p0, Lc7/k6;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "AppMeasurement is not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lc7/k6;->e:Z

    return v0
.end method

.method public final p()Z
    .locals 12

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/k6;->q()Lc7/k9;

    move-result-object v0

    invoke-static {v0}, Lc7/k6;->d(Lc7/i7;)V

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc7/i5;->p(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, p0, Lc7/k6;->g:Lc7/h;

    invoke-virtual {v2}, Lc7/h;->L()Z

    move-result v2

    const/4 v9, 0x0

    if-eqz v2, :cond_d

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_d

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, Lc7/k6;->q()Lc7/k9;

    move-result-object v2

    invoke-virtual {v2}, Lc7/k9;->r()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Network is not available for Deferred Deep Link request. Skipping"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return v9

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v3, p0, Lc7/k6;->g:Lc7/h;

    sget-object v4, Lc7/i0;->R0:Lc7/m4;

    invoke-virtual {v3, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {p0}, Lc7/k6;->E()Lc7/y9;

    move-result-object v3

    invoke-virtual {v3}, Lc7/j7;->i()V

    invoke-virtual {v3}, Lc7/e3;->q()V

    invoke-virtual {v3}, Lc7/y9;->a0()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_2

    :goto_0
    move v3, v5

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lc7/j7;->f()Lc7/qc;

    move-result-object v3

    invoke-virtual {v3}, Lc7/qc;->B0()I

    move-result v3

    const v4, 0x392d8

    if-lt v3, v4, :cond_3

    goto :goto_0

    :cond_3
    move v3, v9

    :goto_1
    if-eqz v3, :cond_b

    const/4 v3, 0x0

    invoke-virtual {p0}, Lc7/k6;->C()Lc7/w7;

    move-result-object v4

    invoke-virtual {v4}, Lc7/j7;->i()V

    invoke-virtual {v4}, Lc7/f4;->o()Lc7/y9;

    move-result-object v4

    invoke-virtual {v4}, Lc7/y9;->Q()Lc7/k;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v3, v4, Lc7/k;->h:Landroid/os/Bundle;

    :cond_4
    if-nez v3, :cond_7

    iget v0, p0, Lc7/k6;->F:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lc7/k6;->F:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_5

    move v9, v5

    :cond_5
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    if-eqz v9, :cond_6

    const-string v1, "Retrying."

    goto :goto_2

    :cond_6
    const-string v1, "Skipping."

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to retrieve DMA consent from the service, "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " retryCount"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lc7/k6;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return v9

    :cond_7
    const/16 v4, 0x64

    invoke-static {v3, v4}, Lc7/n7;->c(Landroid/os/Bundle;I)Lc7/n7;

    move-result-object v6

    const-string v7, "&gcs="

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lc7/n7;->v()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Lc7/w;->b(Landroid/os/Bundle;I)Lc7/w;

    move-result-object v4

    const-string v6, "&dma="

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lc7/w;->g()Ljava/lang/Boolean;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v6, v7, :cond_8

    move v6, v9

    goto :goto_3

    :cond_8
    move v6, v5

    :goto_3
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lc7/w;->h()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_9

    const-string v6, "&dma_cps="

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lc7/w;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-static {v3}, Lc7/w;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v3, v4, :cond_a

    move v5, v9

    :cond_a
    const-string v3, "&npa="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->F()Lc7/x4;

    move-result-object v3

    const-string v4, "Consent query parameters to Bow"

    invoke-virtual {v3, v4, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    invoke-virtual {p0}, Lc7/k6;->G()Lc7/qc;

    move-result-object v3

    invoke-virtual {p0}, Lc7/k6;->w()Lc7/p4;

    const-wide/32 v4, 0x14822

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->w:Lc7/n5;

    invoke-virtual {v1}, Lc7/n5;->a()J

    move-result-wide v7

    const-wide/16 v10, 0x1

    sub-long/2addr v7, v10

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object v1, v3

    move-wide v2, v4

    move-object v4, v0

    move-object v5, v6

    move-wide v6, v7

    move-object v8, v10

    invoke-virtual/range {v1 .. v8}, Lc7/qc;->F(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/net/URL;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {p0}, Lc7/k6;->q()Lc7/k9;

    move-result-object v2

    new-instance v7, Lc7/m6;

    invoke-direct {v7, p0}, Lc7/m6;-><init>(Lc7/k6;)V

    invoke-virtual {v2}, Lc7/j7;->i()V

    invoke-virtual {v2}, Lc7/i7;->k()V

    invoke-static {v4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v8

    new-instance v10, Lc7/m9;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v10

    move-object v3, v0

    invoke-direct/range {v1 .. v7}, Lc7/m9;-><init>(Lc7/k9;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lc7/j9;)V

    invoke-virtual {v8, v10}, Lc7/d6;->u(Ljava/lang/Runnable;)V

    :cond_c
    return v9

    :cond_d
    :goto_4
    invoke-virtual {p0}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return v9
.end method

.method public final q()Lc7/k9;
    .locals 1

    iget-object v0, p0, Lc7/k6;->r:Lc7/k9;

    invoke-static {v0}, Lc7/k6;->d(Lc7/i7;)V

    iget-object v0, p0, Lc7/k6;->r:Lc7/k9;

    return-object v0
.end method

.method public final r(Z)V
    .locals 1

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iput-boolean p1, p0, Lc7/k6;->D:Z

    return-void
.end method

.method public final s()I
    .locals 3

    invoke-virtual {p0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    invoke-virtual {v0}, Lc7/h;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lc7/k6;->C:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    return v0

    :cond_1
    invoke-virtual {p0}, Lc7/k6;->l()Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0x8

    return v0

    :cond_2
    invoke-virtual {p0}, Lc7/k6;->A()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->J()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x3

    return v0

    :cond_4
    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    const-string v2, "firebase_analytics_collection_enabled"

    invoke-virtual {v0, v2}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    return v1

    :cond_5
    const/4 v0, 0x4

    return v0

    :cond_6
    iget-object v0, p0, Lc7/k6;->B:Ljava/lang/Boolean;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    return v1

    :cond_7
    const/4 v0, 0x5

    return v0

    :cond_8
    iget-object v0, p0, Lc7/k6;->A:Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lc7/k6;->A:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    return v1

    :cond_9
    const/4 v0, 0x7

    return v0

    :cond_a
    return v1
.end method

.method public final t()Lc7/b0;
    .locals 2

    iget-object v0, p0, Lc7/k6;->q:Lc7/b0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Component not created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u()Lc7/h;
    .locals 1

    iget-object v0, p0, Lc7/k6;->g:Lc7/h;

    return-object v0
.end method

.method public final v()Lc7/z;
    .locals 1

    iget-object v0, p0, Lc7/k6;->v:Lc7/z;

    invoke-static {v0}, Lc7/k6;->d(Lc7/i7;)V

    iget-object v0, p0, Lc7/k6;->v:Lc7/z;

    return-object v0
.end method

.method public final w()Lc7/p4;
    .locals 1

    iget-object v0, p0, Lc7/k6;->w:Lc7/p4;

    invoke-static {v0}, Lc7/k6;->b(Lc7/e3;)V

    iget-object v0, p0, Lc7/k6;->w:Lc7/p4;

    return-object v0
.end method

.method public final x()Lc7/s4;
    .locals 1

    iget-object v0, p0, Lc7/k6;->t:Lc7/s4;

    invoke-static {v0}, Lc7/k6;->b(Lc7/e3;)V

    iget-object v0, p0, Lc7/k6;->t:Lc7/s4;

    return-object v0
.end method

.method public final y()Lc7/u4;
    .locals 1

    iget-object v0, p0, Lc7/k6;->m:Lc7/u4;

    return-object v0
.end method

.method public final z()Lc7/v4;
    .locals 1

    iget-object v0, p0, Lc7/k6;->i:Lc7/v4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc7/i7;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/k6;->i:Lc7/v4;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lc7/k6;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final zzb()Lo6/d;
    .locals 1

    iget-object v0, p0, Lc7/k6;->n:Lo6/d;

    return-object v0
.end method

.method public final zzd()Lc7/c;
    .locals 1

    iget-object v0, p0, Lc7/k6;->f:Lc7/c;

    return-object v0
.end method

.method public final zzj()Lc7/v4;
    .locals 1

    iget-object v0, p0, Lc7/k6;->i:Lc7/v4;

    invoke-static {v0}, Lc7/k6;->d(Lc7/i7;)V

    iget-object v0, p0, Lc7/k6;->i:Lc7/v4;

    return-object v0
.end method

.method public final zzl()Lc7/d6;
    .locals 1

    iget-object v0, p0, Lc7/k6;->j:Lc7/d6;

    invoke-static {v0}, Lc7/k6;->d(Lc7/i7;)V

    iget-object v0, p0, Lc7/k6;->j:Lc7/d6;

    return-object v0
.end method
