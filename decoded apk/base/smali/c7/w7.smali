.class public final Lc7/w7;
.super Lc7/e3;
.source ""


# instance fields
.field public c:Lc7/e9;

.field public d:Lc7/s7;

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lc7/r7;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Object;

.field public i:Z

.field public j:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Lc7/qb;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lc7/n7;

.field public final l:Ljava/util/concurrent/atomic/AtomicLong;

.field public m:J

.field public final n:Lc7/uc;

.field public o:Z

.field public p:Lc7/u;

.field public q:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

.field public r:Lc7/u;

.field public final s:Lc7/pc;


# direct methods
.method public constructor <init>(Lc7/k6;)V
    .locals 3

    invoke-direct {p0, p1}, Lc7/e3;-><init>(Lc7/k6;)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lc7/w7;->e:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc7/w7;->h:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc7/w7;->i:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/w7;->o:Z

    new-instance v0, Lc7/w8;

    invoke-direct {v0, p0}, Lc7/w8;-><init>(Lc7/w7;)V

    iput-object v0, p0, Lc7/w7;->s:Lc7/pc;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lc7/w7;->g:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lc7/n7;->c:Lc7/n7;

    iput-object v0, p0, Lc7/w7;->k:Lc7/n7;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc7/w7;->m:J

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lc7/w7;->l:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Lc7/uc;

    invoke-direct {v0, p1}, Lc7/uc;-><init>(Lc7/k6;)V

    iput-object v0, p0, Lc7/w7;->n:Lc7/uc;

    return-void
.end method

.method public static synthetic J(Lc7/w7;Lc7/n7;JZZ)V
    .locals 3

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->G()Lc7/n7;

    move-result-object v0

    iget-wide v1, p0, Lc7/w7;->m:J

    cmp-long v1, p2, v1

    if-gtz v1, :cond_0

    invoke-virtual {v0}, Lc7/n7;->b()I

    move-result v0

    invoke-virtual {p1}, Lc7/n7;->b()I

    move-result v1

    invoke-static {v0, v1}, Lc7/n7;->k(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p0

    invoke-virtual {p0}, Lc7/v4;->E()Lc7/x4;

    move-result-object p0

    const-string p2, "Dropped out-of-date consent setting, proposed settings"

    invoke-virtual {p0, p2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/i5;->v(Lc7/n7;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-wide p2, p0, Lc7/w7;->m:J

    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object p1

    invoke-virtual {p1, p4}, Lc7/y9;->P(Z)V

    if-eqz p5, :cond_2

    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object p0

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0, p1}, Lc7/y9;->L(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p0

    invoke-virtual {p0}, Lc7/v4;->E()Lc7/x4;

    move-result-object p0

    invoke-virtual {p1}, Lc7/n7;->b()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Lower precedence consent source ignored, proposed source"

    invoke-virtual {p0, p2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public static synthetic K(Lc7/w7;Lc7/n7;Lc7/n7;)V
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [Lc7/n7$a;

    sget-object v2, Lc7/n7$a;->j:Lc7/n7$a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v4, Lc7/n7$a;->i:Lc7/n7$a;

    const/4 v5, 0x1

    aput-object v4, v1, v5

    invoke-virtual {p1, p2, v1}, Lc7/n7;->m(Lc7/n7;[Lc7/n7$a;)Z

    move-result v1

    new-array v0, v0, [Lc7/n7$a;

    aput-object v2, v0, v3

    aput-object v4, v0, v5

    invoke-virtual {p1, p2, v0}, Lc7/n7;->r(Lc7/n7;[Lc7/n7$a;)Z

    move-result p1

    if-nez v1, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lc7/f4;->k()Lc7/p4;

    move-result-object p0

    invoke-virtual {p0}, Lc7/p4;->D()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic L(Lc7/w7;Ljava/lang/Boolean;Z)V
    .locals 0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lc7/w7;->O(Ljava/lang/Boolean;Z)V

    return-void
.end method

.method public static bridge synthetic M(Lc7/w7;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lc7/w7;->i:Z

    return-void
.end method

.method public static synthetic u0(Lc7/w7;)V
    .locals 0

    invoke-virtual {p0}, Lc7/w7;->r0()V

    return-void
.end method

.method public static bridge synthetic w(Lc7/w7;)Lc7/u;
    .locals 0

    iget-object p0, p0, Lc7/w7;->p:Lc7/u;

    return-object p0
.end method


# virtual methods
.method public final synthetic A(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 2

    const-string p1, "IABTCF_TCString"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc7/w7;->r:Lc7/u;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc7/u;

    const-wide/16 v0, 0x1f4

    invoke-virtual {p1, v0, v1}, Lc7/u;->b(J)V

    :cond_0
    return-void
.end method

.method public final synthetic B(Landroid/os/Bundle;)V
    .locals 8

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->A:Lc7/k5;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0}, Lc7/k5;->b(Landroid/os/Bundle;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->A:Lc7/k5;

    invoke-virtual {v0}, Lc7/k5;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_3

    instance-of v6, v5, Ljava/lang/String;

    if-nez v6, :cond_3

    instance-of v6, v5, Ljava/lang/Long;

    if-nez v6, :cond_3

    instance-of v6, v5, Ljava/lang/Double;

    if-nez v6, :cond_3

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    invoke-static {v5}, Lc7/qc;->c0(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    iget-object v6, p0, Lc7/w7;->s:Lc7/pc;

    const/16 v7, 0x1b

    invoke-static {v6, v7, v4, v4, v3}, Lc7/qc;->M(Lc7/pc;ILjava/lang/String;Ljava/lang/String;I)V

    :cond_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->H()Lc7/x4;

    move-result-object v3

    const-string v4, "Invalid default event parameter type. Name, value"

    invoke-virtual {v3, v4, v2, v5}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->H()Lc7/x4;

    move-result-object v3

    const-string v4, "Invalid default event parameter name. Name"

    invoke-virtual {v3, v4, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    if-nez v5, :cond_5

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v6

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v7

    invoke-virtual {v7, v4, v3}, Lc7/h;->m(Ljava/lang/String;Z)I

    move-result v3

    const-string v4, "param"

    invoke-virtual {v6, v4, v2, v3, v5}, Lc7/qc;->g0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v3

    invoke-virtual {v3, v0, v2, v5}, Lc7/qc;->J(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object p1

    invoke-virtual {p1}, Lc7/h;->B()I

    move-result p1

    invoke-static {v0, p1}, Lc7/qc;->b0(Landroid/os/Bundle;I)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    iget-object p1, p0, Lc7/w7;->s:Lc7/pc;

    const/16 v1, 0x1a

    invoke-static {p1, v1, v4, v4, v3}, Lc7/qc;->M(Lc7/pc;ILjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->H()Lc7/x4;

    move-result-object p1

    const-string v1, "Too many default event parameters set. Discarding beyond event parameter limit"

    invoke-virtual {p1, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->A:Lc7/k5;

    invoke-virtual {p1, v0}, Lc7/k5;->b(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc7/y9;->x(Landroid/os/Bundle;)V

    return-void
.end method

.method public final C(Landroid/os/Bundle;IJ)V
    .locals 3

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-static {p1}, Lc7/n7;->i(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->H()Lc7/x4;

    move-result-object v1

    const-string v2, "Ignoring invalid consent setting"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->H()Lc7/x4;

    move-result-object v0

    const-string v1, "Valid consent values are \'granted\', \'denied\'"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    invoke-static {p1, p2}, Lc7/n7;->c(Landroid/os/Bundle;I)Lc7/n7;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->P0:Lc7/m4;

    invoke-virtual {v1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lc7/n7;->z()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0, p3, p4}, Lc7/w7;->G(Lc7/n7;J)V

    :cond_1
    invoke-static {p1, p2}, Lc7/w;->b(Landroid/os/Bundle;I)Lc7/w;

    move-result-object p3

    invoke-virtual {p3}, Lc7/w;->j()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-virtual {p0, p3}, Lc7/w7;->E(Lc7/w;)V

    :cond_2
    invoke-static {p1}, Lc7/w;->d(Landroid/os/Bundle;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_4

    const/16 p3, -0x1e

    if-ne p2, p3, :cond_3

    const-string p2, "tcf"

    goto :goto_0

    :cond_3
    const-string p2, "app"

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    const-string p4, "allow_personalized_ads"

    invoke-virtual {p0, p2, p4, p1, p3}, Lc7/w7;->X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {p0, v0, p3, p4}, Lc7/w7;->G(Lc7/n7;J)V

    return-void
.end method

.method public final D(Landroid/os/Bundle;J)V
    .locals 12

    const-class v0, Ljava/lang/Long;

    const-class v1, Ljava/lang/String;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    const-string p1, "app_id"

    invoke-virtual {v2, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->G()Lc7/x4;

    move-result-object v3

    const-string v4, "Package name should be null when calling setConditionalUserProperty"

    invoke-virtual {v3, v4}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v2, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2, p1, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "origin"

    invoke-static {v2, p1, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "name"

    invoke-static {v2, v4, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v5, Ljava/lang/Object;

    const-string v6, "value"

    invoke-static {v2, v6, v5, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "trigger_event_name"

    invoke-static {v2, v5, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v10, "trigger_timeout"

    invoke-static {v2, v10, v0, v9}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "timed_out_event_name"

    invoke-static {v2, v9, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v9, Landroid/os/Bundle;

    const-string v11, "timed_out_event_params"

    invoke-static {v2, v11, v9, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "triggered_event_name"

    invoke-static {v2, v9, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v9, Landroid/os/Bundle;

    const-string v11, "triggered_event_params"

    invoke-static {v2, v11, v9, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v8, "time_to_live"

    invoke-static {v2, v8, v0, v7}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "expired_event_name"

    invoke-static {v2, v0, v1, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Landroid/os/Bundle;

    const-string v1, "expired_event_params"

    invoke-static {v2, v1, v0, v3}, Lc7/k7;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "creation_timestamp"

    invoke-virtual {v2, p1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v6}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p3

    invoke-virtual {p3, p1}, Lc7/qc;->m0(Ljava/lang/String;)I

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object p3

    invoke-virtual {p3, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "Invalid conditional user property name"

    invoke-virtual {p2, p3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lc7/qc;->r(Ljava/lang/String;Ljava/lang/Object;)I

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Invalid conditional user property value"

    invoke-virtual {p3, v0, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lc7/qc;->v0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unable to normalize conditional user property value"

    invoke-virtual {p3, v0, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-static {v2, p3}, Lc7/k7;->b(Landroid/os/Bundle;Ljava/lang/Object;)V

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide p2

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-wide/16 v3, 0x1

    const-wide v5, 0x39ef8b000L

    if-nez v0, :cond_5

    cmp-long v0, p2, v5

    if-gtz v0, :cond_4

    cmp-long v0, p2, v3

    if-gez v0, :cond_5

    :cond_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "Invalid conditional user property timeout"

    invoke-virtual {v0, p3, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {v2, v8}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide p2

    cmp-long v0, p2, v5

    if-gtz v0, :cond_7

    cmp-long v0, p2, v3

    if-gez v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object p1

    new-instance p2, Lc7/t8;

    invoke-direct {p2, p0, v2}, Lc7/t8;-><init>(Lc7/w7;Landroid/os/Bundle;)V

    invoke-virtual {p1, p2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void

    :cond_7
    :goto_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "Invalid conditional user property time to live"

    invoke-virtual {v0, p3, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final E(Lc7/w;)V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/d9;

    invoke-direct {v1, p0, p1}, Lc7/d9;-><init>(Lc7/w7;Lc7/w;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final F(Lc7/n7;)V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p1}, Lc7/n7;->y()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc7/n7;->x()Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object p1

    invoke-virtual {p1}, Lc7/y9;->Z()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->l()Z

    move-result v0

    if-eq p1, v0, :cond_4

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0, p1}, Lc7/k6;->r(Z)V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->I()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lc7/w7;->O(Ljava/lang/Boolean;Z)V

    :cond_4
    return-void
.end method

.method public final G(Lc7/n7;J)V
    .locals 15

    move-object v10, p0

    move-object/from16 v0, p1

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-virtual/range {p1 .. p1}, Lc7/n7;->b()I

    move-result v8

    const/16 v9, -0xa

    if-eq v8, v9, :cond_0

    invoke-virtual/range {p1 .. p1}, Lc7/n7;->s()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lc7/n7;->u()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->H()Lc7/x4;

    move-result-object v0

    const-string v1, "Discarding empty consent settings"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, v10, Lc7/w7;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v11, v10, Lc7/w7;->k:Lc7/n7;

    invoke-virtual {v11}, Lc7/n7;->b()I

    move-result v2

    invoke-static {v8, v2}, Lc7/n7;->k(II)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    iget-object v2, v10, Lc7/w7;->k:Lc7/n7;

    invoke-virtual {v0, v2}, Lc7/n7;->t(Lc7/n7;)Z

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lc7/n7;->y()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v10, Lc7/w7;->k:Lc7/n7;

    invoke-virtual {v5}, Lc7/n7;->y()Z

    move-result v5

    if-nez v5, :cond_1

    move v4, v3

    :cond_1
    iget-object v5, v10, Lc7/w7;->k:Lc7/n7;

    invoke-virtual {v0, v5}, Lc7/n7;->p(Lc7/n7;)Lc7/n7;

    move-result-object v0

    iput-object v0, v10, Lc7/w7;->k:Lc7/n7;

    move v12, v4

    move v4, v2

    goto :goto_0

    :cond_2
    move v3, v4

    move v12, v3

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->E()Lc7/x4;

    move-result-object v1

    const-string v2, "Ignoring lower-priority consent settings, proposed settings"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object v1, v10, Lc7/w7;->l:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v6

    if-eqz v4, :cond_4

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lc7/w7;->P(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v13

    new-instance v14, Lc7/c9;

    move-object v1, v14

    move-object v2, p0

    move-object v3, v0

    move-wide/from16 v4, p2

    move v8, v12

    move-object v9, v11

    invoke-direct/range {v1 .. v9}, Lc7/c9;-><init>(Lc7/w7;Lc7/n7;JJZLc7/n7;)V

    invoke-virtual {v13, v14}, Lc7/d6;->B(Ljava/lang/Runnable;)V

    return-void

    :cond_4
    new-instance v13, Lc7/f9;

    move-object v1, v13

    move-object v2, p0

    move-object v3, v0

    move-wide v4, v6

    move v6, v12

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Lc7/f9;-><init>(Lc7/w7;Lc7/n7;JZLc7/n7;)V

    const/16 v0, 0x1e

    if-eq v8, v0, :cond_6

    if-ne v8, v9, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0, v13}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void

    :cond_6
    :goto_1
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0, v13}, Lc7/d6;->B(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final H(Lc7/r7;)V
    .locals 1

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/w7;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string v0, "OnEventListener already registered"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final I(Lc7/s7;)V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lc7/w7;->d:Lc7/s7;

    if-eq p1, v0, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "EventInterceptor already set."

    invoke-static {v0, v1}, Lh6/s;->p(ZLjava/lang/Object;)V

    :cond_1
    iput-object p1, p0, Lc7/w7;->d:Lc7/s7;

    return-void
.end method

.method public final N(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/a9;

    invoke-direct {v1, p0, p1}, Lc7/a9;-><init>(Lc7/w7;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final O(Ljava/lang/Boolean;Z)V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Setting app measurement enabled (FE)"

    invoke-virtual {v0, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/i5;->q(Ljava/lang/Boolean;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc7/i5;->y(Ljava/lang/Boolean;)V

    :cond_0
    iget-object p2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->l()Z

    move-result p2

    if-nez p2, :cond_1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    invoke-virtual {p0}, Lc7/w7;->r0()V

    :cond_2
    return-void
.end method

.method public final P(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lc7/w7;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final Q(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V
    .locals 11

    invoke-virtual {p0}, Lc7/j7;->i()V

    move-object v10, p0

    iget-object v0, v10, Lc7/w7;->d:Lc7/s7;

    if-eqz v0, :cond_1

    invoke-static {p2}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    move v7, v0

    const/4 v6, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v9}, Lc7/w7;->R(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method

.method public final R(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-wide/from16 v10, p3

    move-object/from16 v12, p5

    const-string v0, "com.google.android.gms.tagmanager.TagManagerService"

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p5 .. p5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/e3;->q()V

    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->k()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Event not sent since app measurement is disabled"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/p4;->C()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Dropping non-safelisted event. event name, origin"

    invoke-virtual {v0, v1, v9, v8}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-boolean v1, v7, Lc7/w7;->f:Z

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-nez v1, :cond_3

    iput-boolean v15, v7, Lc7/w7;->f:Z

    :try_start_0
    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->o()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v15, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    const-string v1, "initialize"

    new-array v2, v15, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    aput-object v3, v2, v14

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v15, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v2

    aput-object v2, v1, v14

    invoke-virtual {v0, v13, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->G()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to invoke Tag Manager\'s initialize() method"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->E()Lc7/x4;

    move-result-object v0

    const-string v1, "Tag Manager is not found and thus will not be used"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_3
    :goto_1
    const-string v0, "_cmp"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "gclid"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_lgclid"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzok;->zza()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->W0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "gbraid"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_gbraid"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    :cond_5
    if-eqz p6, :cond_6

    invoke-static/range {p2 .. p2}, Lc7/qc;->G0(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->A:Lc7/k5;

    invoke-virtual {v1}, Lc7/k5;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Lc7/qc;->I(Landroid/os/Bundle;Landroid/os/Bundle;)V

    :cond_6
    const/16 v0, 0x28

    if-nez p8, :cond_b

    const-string v1, "_iap"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->G()Lc7/qc;

    move-result-object v1

    const-string v2, "event"

    invoke-virtual {v1, v2, v9}, Lc7/qc;->x0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x2

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    sget-object v3, Lc7/o7;->a:[Ljava/lang/String;

    sget-object v5, Lc7/o7;->b:[Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v5, v9}, Lc7/qc;->k0(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8

    const/16 v4, 0xd

    goto :goto_2

    :cond_8
    invoke-virtual {v1, v2, v0, v9}, Lc7/qc;->e0(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    move v4, v14

    :goto_2
    if-eqz v4, :cond_b

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->C()Lc7/x4;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v2

    invoke-virtual {v2, v9}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Invalid public event name. Event will not be logged (FE)"

    invoke-virtual {v1, v3, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->G()Lc7/qc;

    invoke-static {v9, v0, v15}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_a

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v14

    :cond_a
    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->G()Lc7/qc;

    iget-object v1, v7, Lc7/w7;->s:Lc7/pc;

    const-string v2, "_ev"

    invoke-static {v1, v4, v2, v0, v14}, Lc7/qc;->M(Lc7/pc;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v1

    invoke-virtual {v1, v14}, Lc7/p9;->x(Z)Lc7/q9;

    move-result-object v1

    const-string v2, "_sc"

    if-eqz v1, :cond_c

    invoke-virtual {v12, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_c

    iput-boolean v15, v1, Lc7/q9;->d:Z

    :cond_c
    if-eqz p6, :cond_d

    if-nez p8, :cond_d

    move v3, v15

    goto :goto_3

    :cond_d
    move v3, v14

    :goto_3
    invoke-static {v1, v12, v3}, Lc7/qc;->L(Lc7/q9;Landroid/os/Bundle;Z)V

    const-string v1, "am"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    invoke-static/range {p2 .. p2}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v1

    if-eqz p6, :cond_e

    iget-object v3, v7, Lc7/w7;->d:Lc7/s7;

    if-eqz v3, :cond_e

    if-nez v1, :cond_e

    if-nez v16, :cond_e

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, v9}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v2

    invoke-virtual {v2, v12}, Lc7/u4;->a(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Passing event to registered event handler (FE)"

    invoke-virtual {v0, v3, v1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v7, Lc7/w7;->d:Lc7/s7;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v7, Lc7/w7;->d:Lc7/s7;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p5

    move-wide/from16 v5, p3

    invoke-interface/range {v1 .. v6}, Lc7/s7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void

    :cond_e
    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->n()Z

    move-result v1

    if-nez v1, :cond_f

    return-void

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    invoke-virtual {v1, v9}, Lc7/qc;->q(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->C()Lc7/x4;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v3

    invoke-virtual {v3, v9}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid event name. Event will not be logged (FE)"

    invoke-virtual {v2, v4, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    invoke-static {v9, v0, v15}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object v0

    if-eqz v9, :cond_10

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v14

    :cond_10
    iget-object v2, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v2}, Lc7/k6;->G()Lc7/qc;

    iget-object v2, v7, Lc7/w7;->s:Lc7/pc;

    const-string v3, "_ev"

    move-object/from16 p1, v2

    move-object/from16 p2, p9

    move/from16 p3, v1

    move-object/from16 p4, v3

    move-object/from16 p5, v0

    move/from16 p6, v14

    invoke-static/range {p1 .. p6}, Lc7/qc;->N(Lc7/pc;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_11
    const-string v0, "_o"

    const-string v1, "_sn"

    const-string v3, "_si"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo6/e;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    move-object/from16 v2, p9

    move-object/from16 v3, p2

    move-object/from16 v4, p5

    move/from16 v6, p8

    invoke-virtual/range {v1 .. v6}, Lc7/qc;->A(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v12

    invoke-static {v12}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v1

    invoke-virtual {v1, v14}, Lc7/p9;->x(Z)Lc7/q9;

    move-result-object v1

    const-string v5, "_ae"

    if-eqz v1, :cond_12

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual/range {p0 .. p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v1

    iget-object v1, v1, Lc7/gb;->f:Lc7/nb;

    iget-object v2, v1, Lc7/nb;->d:Lc7/gb;

    invoke-virtual {v2}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v2

    invoke-interface {v2}, Lo6/d;->b()J

    move-result-wide v13

    iget-wide v3, v1, Lc7/nb;->b:J

    sub-long v2, v13, v3

    iput-wide v13, v1, Lc7/nb;->b:J

    const-wide/16 v13, 0x0

    cmp-long v1, v2, v13

    if-lez v1, :cond_12

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    invoke-virtual {v1, v12, v2, v3}, Lc7/qc;->H(Landroid/os/Bundle;J)V

    :cond_12
    const-string v1, "auto"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "_ffr"

    if-nez v1, :cond_16

    const-string v1, "_ssr"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    invoke-virtual {v12, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo6/o;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    const/4 v2, 0x0

    goto :goto_4

    :cond_13
    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    :cond_14
    :goto_4
    invoke-virtual {v1}, Lc7/j7;->e()Lc7/i5;

    move-result-object v3

    iget-object v3, v3, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {v3}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v1}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->A()Lc7/x4;

    move-result-object v1

    const-string v2, "Not logging duplicate session_start_with_rollout event"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_5

    :cond_15
    invoke-virtual {v1}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {v1, v2}, Lc7/o5;->b(Ljava/lang/String;)V

    move v1, v15

    :goto_5
    if-nez v1, :cond_17

    return-void

    :cond_16
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    invoke-virtual {v1}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {v1}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_17

    invoke-virtual {v12, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_17
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v13, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->N0:Lc7/m4;

    invoke-virtual {v1, v2}, Lc7/h;->o(Lc7/m4;)Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-virtual/range {p0 .. p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v1

    invoke-virtual {v1}, Lc7/gb;->A()Z

    move-result v1

    goto :goto_6

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->u:Lc7/l5;

    invoke-virtual {v1}, Lc7/l5;->b()Z

    move-result v1

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    iget-object v2, v2, Lc7/i5;->r:Lc7/n5;

    invoke-virtual {v2}, Lc7/n5;->a()J

    move-result-wide v2

    const-wide/16 v17, 0x0

    cmp-long v2, v2, v17

    if-lez v2, :cond_19

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Lc7/i5;->t(J)Z

    move-result v2

    if-eqz v2, :cond_19

    if-eqz v1, :cond_19

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "Current session is expired, remove the session number, ID, and engagement time"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v19

    const-string v2, "auto"

    const-string v3, "_sid"

    move-object/from16 v1, p0

    move-wide/from16 v8, v17

    move-object v14, v5

    move-wide/from16 v5, v19

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_sno"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->a()J

    move-result-wide v5

    const-string v2, "auto"

    const-string v3, "_se"

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v1, v1, Lc7/i5;->s:Lc7/n5;

    invoke-virtual {v1, v8, v9}, Lc7/n5;->b(J)V

    goto :goto_7

    :cond_19
    move-object v14, v5

    move-wide/from16 v8, v17

    :goto_7
    const-string v1, "extend_session"

    invoke-virtual {v12, v1, v8, v9}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_1a

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    const-string v2, "EXTEND_SESSION param attached: initiate a new session or extend the current active session"

    invoke-virtual {v1, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v1, v7, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->F()Lc7/gb;

    move-result-object v1

    iget-object v1, v1, Lc7/gb;->e:Lc7/pb;

    invoke-virtual {v1, v10, v11, v15}, Lc7/pb;->b(JZ)V

    :cond_1a
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v12}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_1b
    :goto_8
    if-ge v3, v2, :cond_1c

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    invoke-virtual {v12, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lc7/qc;->s0(Ljava/lang/Object;)[Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_1b

    invoke-virtual {v12, v4, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_8

    :cond_1c
    const/4 v8, 0x0

    :goto_9
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v1

    if-ge v8, v1, :cond_21

    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v8, :cond_1d

    move v2, v15

    goto :goto_a

    :cond_1d
    const/4 v2, 0x0

    :goto_a
    if-eqz v2, :cond_1e

    const-string v2, "_ep"

    move-object/from16 v9, p1

    goto :goto_b

    :cond_1e
    move-object/from16 v9, p1

    move-object/from16 v2, p2

    :goto_b
    invoke-virtual {v1, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p7, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v3

    const/4 v12, 0x0

    invoke-virtual {v3, v1, v12}, Lc7/qc;->z(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_c

    :cond_1f
    const/4 v12, 0x0

    :goto_c
    move-object v5, v1

    new-instance v6, Lc7/g0;

    new-instance v3, Lc7/a0;

    invoke-direct {v3, v5}, Lc7/a0;-><init>(Landroid/os/Bundle;)V

    move-object v1, v6

    move-object/from16 v4, p1

    move-object v12, v5

    move-object v15, v6

    move-wide/from16 v5, p3

    invoke-direct/range {v1 .. v6}, Lc7/g0;-><init>(Ljava/lang/String;Lc7/a0;Ljava/lang/String;J)V

    invoke-virtual/range {p0 .. p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v1

    move-object/from16 v5, p9

    invoke-virtual {v1, v15, v5}, Lc7/y9;->z(Lc7/g0;Ljava/lang/String;)V

    if-nez v16, :cond_20

    iget-object v1, v7, Lc7/w7;->e:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_d
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc7/r7;

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4, v12}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v5, p3

    invoke-interface/range {v1 .. v6}, Lc7/r7;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    move-object/from16 v5, p9

    goto :goto_d

    :cond_20
    add-int/lit8 v8, v8, 0x1

    const/4 v15, 0x1

    goto :goto_9

    :cond_21
    invoke-virtual/range {p0 .. p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc7/p9;->x(Z)Lc7/q9;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object/from16 v1, p2

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-virtual/range {p0 .. p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v1

    invoke-interface {v1}, Lo6/d;->b()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v3, v1, v2}, Lc7/gb;->z(ZZJ)Z

    :cond_22
    return-void
.end method

.method public final S(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 9

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v8, Lc7/n8;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p5

    move-wide v6, p3

    invoke-direct/range {v1 .. v7}, Lc7/n8;-><init>(Lc7/w7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    invoke-virtual {v0, v8}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "name"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "creation_timestamp"

    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    if-eqz p2, :cond_0

    const-string p1, "expired_event_name"

    invoke-virtual {v2, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "expired_event_params"

    invoke-virtual {v2, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object p1

    new-instance p2, Lc7/s8;

    invoke-direct {p2, p0, v2}, Lc7/s8;-><init>(Lc7/w7;Landroid/os/Bundle;)V

    invoke-virtual {p1, p2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final U(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 11

    invoke-virtual {p0}, Lc7/j7;->h()V

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v4

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    move-object v10, p4

    invoke-virtual/range {v1 .. v10}, Lc7/w7;->v0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method

.method public final V(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 11

    if-nez p1, :cond_0

    const-string v0, "app"

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    if-nez p3, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p3

    :goto_1
    const-string v0, "screen_view"

    move-object v3, p2

    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    move-wide/from16 v4, p6

    invoke-virtual {v0, v6, v4, v5}, Lc7/p9;->D(Landroid/os/Bundle;J)V

    return-void

    :cond_2
    move-wide/from16 v4, p6

    move-object v0, p0

    if-eqz p5, :cond_4

    iget-object v1, v0, Lc7/w7;->d:Lc7/s7;

    if-eqz v1, :cond_4

    invoke-static {p2}, Lc7/qc;->C0(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v1, 0x1

    :goto_3
    move v8, v1

    const/4 v10, 0x0

    move-object v1, p0

    move-object v3, p2

    move-wide/from16 v4, p6

    move/from16 v7, p5

    move v9, p4

    invoke-virtual/range {v1 .. v10}, Lc7/w7;->v0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method

.method public final W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 8

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    const-string v0, "allow_personalized_ads"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "_npa"

    if-eqz v0, :cond_3

    instance-of v0, p3, Ljava/lang/String;

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "false"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const-wide/16 v2, 0x1

    if-eqz p2, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x0

    :goto_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->o:Lc7/o5;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v2, v4, v2

    if-nez v2, :cond_1

    const-string p3, "true"

    :cond_1
    invoke-virtual {v0, p3}, Lc7/o5;->b(Ljava/lang/String;)V

    move-object v6, p2

    goto :goto_1

    :cond_2
    if-nez p3, :cond_3

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object p2

    iget-object p2, p2, Lc7/i5;->o:Lc7/o5;

    const-string v0, "unset"

    invoke-virtual {p2, v0}, Lc7/o5;->b(Ljava/lang/String;)V

    move-object v6, p3

    :goto_1
    move-object v3, v1

    goto :goto_2

    :cond_3
    move-object v3, p2

    move-object v6, p3

    :goto_2
    iget-object p2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->k()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p2, "User property not set since app measurement is disabled"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object p2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->n()Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    new-instance p2, Lc7/lc;

    move-object v2, p2

    move-wide v4, p4

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc7/y9;->F(Lc7/lc;)V

    return-void
.end method

.method public final X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 8

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v1 .. v7}, Lc7/w7;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public final Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
    .locals 6

    if-nez p1, :cond_0

    const-string p1, "app"

    :cond_0
    move-object v1, p1

    const/4 p1, 0x6

    const/4 v0, 0x0

    const/16 v2, 0x18

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc7/qc;->m0(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p4

    const-string v3, "user property"

    invoke-virtual {p4, v3, p2}, Lc7/qc;->x0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    sget-object v4, Lc7/p7;->a:[Ljava/lang/String;

    invoke-virtual {p4, v3, v4, p2}, Lc7/qc;->j0(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    const/16 p1, 0xf

    goto :goto_0

    :cond_3
    invoke-virtual {p4, v3, v2, p2}, Lc7/qc;->e0(Ljava/lang/String;ILjava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_0

    :cond_4
    move p1, v0

    :goto_0
    const-string p4, "_ev"

    const/4 v3, 0x1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    invoke-static {p2, v2, v3}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p3

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    :cond_5
    iget-object p2, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p2}, Lc7/k6;->G()Lc7/qc;

    iget-object p2, p0, Lc7/w7;->s:Lc7/pc;

    invoke-static {p2, p1, p4, p3, v0}, Lc7/qc;->M(Lc7/pc;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_6
    if-eqz p3, :cond_b

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lc7/qc;->r(Ljava/lang/String;Ljava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    invoke-static {p2, v2, v3}, Lc7/qc;->E(Ljava/lang/String;IZ)Ljava/lang/String;

    move-result-object p2

    instance-of p5, p3, Ljava/lang/String;

    if-nez p5, :cond_7

    instance-of p5, p3, Ljava/lang/CharSequence;

    if-eqz p5, :cond_8

    :cond_7
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    :cond_8
    iget-object p3, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {p3}, Lc7/k6;->G()Lc7/qc;

    iget-object p3, p0, Lc7/w7;->s:Lc7/pc;

    invoke-static {p3, p1, p4, p2, v0}, Lc7/qc;->M(Lc7/pc;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    :cond_9
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lc7/qc;->v0(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_a

    move-object v0, p0

    move-object v2, p2

    move-wide v3, p5

    invoke-virtual/range {v0 .. v5}, Lc7/w7;->S(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    :cond_a
    return-void

    :cond_b
    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    move-wide v3, p5

    invoke-virtual/range {v0 .. v5}, Lc7/w7;->S(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    return-void
.end method

.method public final synthetic Z(Ljava/util/List;)V
    .locals 6

    invoke-virtual {p0}, Lc7/j7;->i()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->E()Landroid/util/SparseArray;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc7/qb;

    iget v2, v1, Lc7/qb;->j:I

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->contains(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget v2, v1, Lc7/qb;->j:I

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-wide v4, v1, Lc7/qb;->i:J

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    :cond_1
    invoke-virtual {p0}, Lc7/w7;->q0()Ljava/util/PriorityQueue;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lc7/w7;->o0()V

    :cond_3
    return-void
.end method

.method public final bridge synthetic a()Lc7/h;
    .locals 1

    invoke-super {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    return-object v0
.end method

.method public final a0()Ljava/lang/Boolean;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v5, Lc7/f8;

    invoke-direct {v5, p0, v1}, Lc7/f8;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "boolean test flag value"

    invoke-virtual/range {v0 .. v5}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public final b0()Ljava/lang/Double;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v5, Lc7/b9;

    invoke-direct {v5, p0, v1}, Lc7/b9;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "double test flag value"

    invoke-virtual/range {v0 .. v5}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    return-object v0
.end method

.method public final bridge synthetic c()Lc7/z;
    .locals 1

    invoke-super {p0}, Lc7/j7;->c()Lc7/z;

    move-result-object v0

    return-object v0
.end method

.method public final c0()Ljava/lang/Integer;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v5, Lc7/y8;

    invoke-direct {v5, p0, v1}, Lc7/y8;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "int test flag value"

    invoke-virtual/range {v0 .. v5}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final bridge synthetic d()Lc7/u4;
    .locals 1

    invoke-super {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v0

    return-object v0
.end method

.method public final d0()Ljava/lang/Long;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v5, Lc7/z8;

    invoke-direct {v5, p0, v1}, Lc7/z8;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "long test flag value"

    invoke-virtual/range {v0 .. v5}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    return-object v0
.end method

.method public final bridge synthetic e()Lc7/i5;
    .locals 1

    invoke-super {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    return-object v0
.end method

.method public final e0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/w7;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final bridge synthetic f()Lc7/qc;
    .locals 1

    invoke-super {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v0

    return-object v0
.end method

.method public final f0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->D()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p9;->K()Lc7/q9;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc7/q9;->b:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic g()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->g()V

    return-void
.end method

.method public final g0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->D()Lc7/p9;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p9;->K()Lc7/q9;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc7/q9;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic h()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->h()V

    return-void
.end method

.method public final h0()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->H()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->H()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->K()Ljava/lang/String;

    move-result-object v1

    const-string v2, "google_app_id"

    new-instance v3, Lc7/e6;

    invoke-direct {v3, v0, v1}, Lc7/e6;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lc7/e6;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "getGoogleAppId failed with exception"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic i()V
    .locals 0

    invoke-super {p0}, Lc7/f4;->i()V

    return-void
.end method

.method public final i0()Ljava/lang/String;
    .locals 6

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v5, Lc7/r8;

    invoke-direct {v5, p0, v1}, Lc7/r8;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-wide/16 v2, 0x3a98

    const-string v4, "String test flag value"

    invoke-virtual/range {v0 .. v5}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final bridge synthetic j()Lc7/b0;
    .locals 1

    invoke-super {p0}, Lc7/f4;->j()Lc7/b0;

    move-result-object v0

    return-object v0
.end method

.method public final j0()V
    .locals 3

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    const-string v1, "google_analytics_deferred_deep_link_enabled"

    invoke-virtual {v0, v1}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v2, "Deferred Deep Link feature enabled."

    invoke-virtual {v0, v2}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v2, Lc7/b8;

    invoke-direct {v2, p0}, Lc7/b8;-><init>(Lc7/w7;)V

    invoke-virtual {v0, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    :cond_2
    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    invoke-virtual {v0}, Lc7/y9;->S()V

    iput-boolean v1, p0, Lc7/w7;->o:Z

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->K()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lc7/j7;->c()Lc7/z;

    move-result-object v1

    invoke-virtual {v1}, Lc7/i7;->k()V

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "_po"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "auto"

    const-string v2, "_ou"

    invoke-virtual {p0, v0, v2, v1}, Lc7/w7;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    return-void
.end method

.method public final bridge synthetic k()Lc7/p4;
    .locals 1

    invoke-super {p0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v0

    return-object v0
.end method

.method public final k0()V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc7/w7;->c:Lc7/e9;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iget-object v1, p0, Lc7/w7;->c:Lc7/e9;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method public final bridge synthetic l()Lc7/s4;
    .locals 1

    invoke-super {p0}, Lc7/f4;->l()Lc7/s4;

    move-result-object v0

    return-object v0
.end method

.method public final l0()V
    .locals 8

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->I0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/d6;->E()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Cannot get trigger URIs from analytics worker thread"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lc7/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Cannot get trigger URIs from main thread"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Getting trigger URIs (FE)"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v2

    const-wide/16 v4, 0x1388

    new-instance v7, Lc7/x7;

    invoke-direct {v7, p0, v0}, Lc7/x7;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;)V

    const-string v6, "get trigger URIs"

    move-object v3, v0

    invoke-virtual/range {v2 .. v7}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Timed out waiting for get trigger URIs"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v1

    new-instance v2, Lc7/a8;

    invoke-direct {v2, p0, v0}, Lc7/a8;-><init>(Lc7/w7;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final bridge synthetic m()Lc7/w7;
    .locals 1

    invoke-super {p0}, Lc7/f4;->m()Lc7/w7;

    move-result-object v0

    return-object v0
.end method

.method public final m0()V
    .locals 5

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->v:Lc7/l5;

    invoke-virtual {v0}, Lc7/l5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->w:Lc7/n5;

    invoke-virtual {v0}, Lc7/n5;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v2

    iget-object v2, v2, Lc7/i5;->w:Lc7/n5;

    const-wide/16 v3, 0x1

    add-long/2addr v3, v0

    invoke-virtual {v2, v3, v4}, Lc7/n5;->b(J)V

    const-wide/16 v2, 0x5

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->v:Lc7/l5;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc7/l5;->a(Z)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->R0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lc7/w7;->p:Lc7/u;

    if-nez v0, :cond_2

    new-instance v0, Lc7/p8;

    iget-object v1, p0, Lc7/j7;->a:Lc7/k6;

    invoke-direct {v0, p0, v1}, Lc7/p8;-><init>(Lc7/w7;Lc7/l7;)V

    iput-object v0, p0, Lc7/w7;->p:Lc7/u;

    :cond_2
    iget-object v0, p0, Lc7/w7;->p:Lc7/u;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lc7/u;->b(J)V

    return-void

    :cond_3
    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->p()Z

    return-void
.end method

.method public final bridge synthetic n()Lc7/p9;
    .locals 1

    invoke-super {p0}, Lc7/f4;->n()Lc7/p9;

    move-result-object v0

    return-object v0
.end method

.method public final n0()V
    .locals 5

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Handle tcf update."

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->B()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v1

    const-string v2, " google_analytics_tcf_data_enabled"

    invoke-virtual {v1, v2}, Lc7/h;->x(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_0
    invoke-static {v0, v1}, Lc7/ob;->c(Landroid/content/SharedPreferences;Z)Lc7/ob;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc7/i5;->w(Lc7/ob;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lc7/ob;->b()Landroid/os/Bundle;

    move-result-object v1

    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    if-eq v1, v2, :cond_1

    const/16 v2, -0x1e

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    invoke-virtual {p0, v1, v2, v3, v4}, Lc7/w7;->C(Landroid/os/Bundle;IJ)V

    :cond_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Lc7/ob;->e()Ljava/lang/String;

    move-result-object v0

    const-string v2, "_tcfd"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "auto"

    const-string v2, "_tcf"

    invoke-virtual {p0, v0, v2, v1}, Lc7/w7;->x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public final bridge synthetic o()Lc7/y9;
    .locals 1

    invoke-super {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    return-object v0
.end method

.method public final o0()V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/w7;->q0()Ljava/util/PriorityQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lc7/w7;->i:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lc7/w7;->q0()Ljava/util/PriorityQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc7/qb;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    move-result-object v1

    invoke-virtual {v1}, Lc7/qc;->L0()Ll1/a;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    const/4 v2, 0x1

    iput-boolean v2, p0, Lc7/w7;->i:Z

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    iget-object v3, v0, Lc7/qb;->h:Ljava/lang/String;

    const-string v4, "Registering trigger URI"

    invoke-virtual {v2, v4, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v0, Lc7/qb;->h:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll1/a;->c(Landroid/net/Uri;)Ll7/f;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    iput-boolean v2, p0, Lc7/w7;->i:Z

    invoke-virtual {p0}, Lc7/w7;->q0()Ljava/util/PriorityQueue;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v3

    invoke-virtual {v3}, Lc7/i5;->E()Landroid/util/SparseArray;

    move-result-object v3

    iget v4, v0, Lc7/qb;->j:I

    iget-wide v5, v0, Lc7/qb;->i:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v4

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v5

    new-array v5, v5, [I

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v6

    new-array v6, v6, [J

    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v2, v7, :cond_4

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v7

    aput v7, v5, v2

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    aput-wide v7, v6, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "uriSources"

    invoke-virtual {v2, v3, v5}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v3, "uriTimestamps"

    invoke-virtual {v2, v3, v6}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V

    iget-object v3, v4, Lc7/i5;->p:Lc7/k5;

    invoke-virtual {v3, v2}, Lc7/k5;->b(Landroid/os/Bundle;)V

    new-instance v2, Lc7/i8;

    invoke-direct {v2, p0}, Lc7/i8;-><init>(Lc7/w7;)V

    new-instance v3, Lc7/h8;

    invoke-direct {v3, p0, v0}, Lc7/h8;-><init>(Lc7/w7;Lc7/qb;)V

    invoke-static {v1, v3, v2}, Ll7/d;->a(Ll7/f;Ll7/c;Ljava/util/concurrent/Executor;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public final bridge synthetic p()Lc7/gb;
    .locals 1

    invoke-super {p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    return-object v0
.end method

.method public final p0()V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Register tcfPrefChangeListener."

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lc7/w7;->q:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    if-nez v0, :cond_0

    new-instance v0, Lc7/l8;

    iget-object v1, p0, Lc7/j7;->a:Lc7/k6;

    invoke-direct {v0, p0, v1}, Lc7/l8;-><init>(Lc7/w7;Lc7/l7;)V

    iput-object v0, p0, Lc7/w7;->r:Lc7/u;

    new-instance v0, Lc7/e8;

    invoke-direct {v0, p0}, Lc7/e8;-><init>(Lc7/w7;)V

    iput-object v0, p0, Lc7/w7;->q:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    invoke-virtual {v0}, Lc7/i5;->B()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lc7/w7;->q:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public final q0()Ljava/util/PriorityQueue;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/PriorityQueue<",
            "Lc7/qb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc7/w7;->j:Ljava/util/PriorityQueue;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/PriorityQueue;

    sget-object v1, Lc7/v7;->a:Lc7/v7;

    sget-object v2, Lc7/y7;->h:Lc7/y7;

    invoke-static {v1, v2}, Lc7/g8;->a(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/PriorityQueue;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lc7/w7;->j:Ljava/util/PriorityQueue;

    :cond_0
    iget-object v0, p0, Lc7/w7;->j:Ljava/util/PriorityQueue;

    return-object v0
.end method

.method public final r0()V
    .locals 8

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v0

    iget-object v0, v0, Lc7/i5;->o:Lc7/o5;

    invoke-virtual {v0}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "unset"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v6

    const-string v3, "app"

    const-string v4, "_npa"

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lc7/w7;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    goto :goto_2

    :cond_0
    const-string v1, "true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1

    goto :goto_1

    :cond_1
    const-wide/16 v0, 0x0

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    goto :goto_0

    :cond_2
    :goto_2
    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lc7/w7;->o:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Recording app launch after enabling measurement for the first time (FE)"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/w7;->j0()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoj;->zza()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->n0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    iget-object v0, v0, Lc7/gb;->e:Lc7/pb;

    invoke-virtual {v0}, Lc7/pb;->a()V

    :cond_3
    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v1, Lc7/j8;

    invoke-direct {v1, p0}, Lc7/j8;-><init>(Lc7/w7;)V

    invoke-virtual {v0, v1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Updating Scion state (FE)"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object v0

    invoke-virtual {v0}, Lc7/y9;->W()V

    return-void
.end method

.method public final s0(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lc7/w7;->D(Landroid/os/Bundle;J)V

    return-void
.end method

.method public final t0(Lc7/r7;)V
    .locals 1

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc7/w7;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->G()Lc7/x4;

    move-result-object p1

    const-string v0, "OnEventListener had not been registered"

    invoke-virtual {p1, v0}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final v()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v0(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 13

    invoke-static/range {p5 .. p5}, Lc7/qc;->y(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v11

    new-instance v12, Lc7/o8;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide/from16 v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lc7/o8;-><init>(Lc7/w7;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    invoke-virtual {v11, v12}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 9

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v7

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v8}, Lc7/w7;->V(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/d6;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Cannot get conditional user properties from analytics worker thread"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    :cond_0
    invoke-static {}, Lc7/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Cannot get conditional user properties from main thread"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    :cond_1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v1, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v1}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v1

    const-wide/16 v8, 0x1388

    new-instance v10, Lc7/v8;

    const/4 v5, 0x0

    move-object v2, v10

    move-object v3, p0

    move-object v4, v0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lc7/v8;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "get conditional user properties"

    move-object v2, v1

    move-object v3, v0

    move-wide v4, v8

    move-object v7, v10

    invoke-virtual/range {v2 .. v7}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const/4 p2, 0x0

    const-string v0, "Timed out waiting for get conditional user properties"

    invoke-virtual {p1, v0, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_2
    invoke-static {p1}, Lc7/qc;->o0(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final x0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lc7/w7;->Q(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0}, Lc7/d6;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Cannot get user properties from analytics worker thread"

    :goto_0
    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lc7/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Cannot get user properties from main thread"

    goto :goto_0

    :cond_1
    new-instance v7, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->zzl()Lc7/d6;

    move-result-object v8

    const-wide/16 v9, 0x1388

    new-instance v11, Lc7/u8;

    const/4 v3, 0x0

    move-object v0, v11

    move-object v1, p0

    move-object v2, v7

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lc7/u8;-><init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "get user properties"

    move-object v0, v8

    move-object v1, v7

    move-wide v2, v9

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Lc7/d6;->q(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string p3, "Timed out waiting for handle get user properties, includeInternal"

    invoke-virtual {p1, p3, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p2, Lu/a;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p3

    invoke-direct {p2, p3}, Lu/a;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lc7/lc;

    invoke-virtual {p3}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object p3, p3, Lc7/lc;->i:Ljava/lang/String;

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    return-object p2
.end method

.method public final z(JZ)V
    .locals 5

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/e3;->q()V

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->A()Lc7/x4;

    move-result-object v0

    const-string v1, "Resetting analytics data (FE)"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object v0

    invoke-virtual {v0}, Lc7/j7;->i()V

    iget-object v0, v0, Lc7/gb;->f:Lc7/nb;

    invoke-virtual {v0}, Lc7/nb;->b()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->s0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->D()V

    :cond_0
    iget-object v0, p0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->k()Z

    move-result v0

    invoke-virtual {p0}, Lc7/j7;->e()Lc7/i5;

    move-result-object v1

    iget-object v2, v1, Lc7/i5;->g:Lc7/n5;

    invoke-virtual {v2, p1, p2}, Lc7/n5;->b(J)V

    invoke-virtual {v1}, Lc7/j7;->e()Lc7/i5;

    move-result-object p1

    iget-object p1, p1, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {p1}, Lc7/o5;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 p2, 0x0

    if-nez p1, :cond_1

    iget-object p1, v1, Lc7/i5;->x:Lc7/o5;

    invoke-virtual {p1, p2}, Lc7/o5;->b(Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoj;->zza()Z

    move-result p1

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lc7/j7;->a()Lc7/h;

    move-result-object p1

    sget-object v4, Lc7/i0;->n0:Lc7/m4;

    invoke-virtual {p1, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v1, Lc7/i5;->r:Lc7/n5;

    invoke-virtual {p1, v2, v3}, Lc7/n5;->b(J)V

    :cond_2
    iget-object p1, v1, Lc7/i5;->s:Lc7/n5;

    invoke-virtual {p1, v2, v3}, Lc7/n5;->b(J)V

    invoke-virtual {v1}, Lc7/j7;->a()Lc7/h;

    move-result-object p1

    invoke-virtual {p1}, Lc7/h;->N()Z

    move-result p1

    if-nez p1, :cond_3

    xor-int/lit8 p1, v0, 0x1

    invoke-virtual {v1, p1}, Lc7/i5;->A(Z)V

    :cond_3
    iget-object p1, v1, Lc7/i5;->y:Lc7/o5;

    invoke-virtual {p1, p2}, Lc7/o5;->b(Ljava/lang/String;)V

    iget-object p1, v1, Lc7/i5;->z:Lc7/n5;

    invoke-virtual {p1, v2, v3}, Lc7/n5;->b(J)V

    iget-object p1, v1, Lc7/i5;->A:Lc7/k5;

    invoke-virtual {p1, p2}, Lc7/k5;->b(Landroid/os/Bundle;)V

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lc7/f4;->o()Lc7/y9;

    move-result-object p1

    invoke-virtual {p1}, Lc7/y9;->V()V

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzoj;->zza()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object p1

    sget-object p2, Lc7/i0;->n0:Lc7/m4;

    invoke-virtual {p1, p2}, Lc7/h;->o(Lc7/m4;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lc7/f4;->p()Lc7/gb;

    move-result-object p1

    iget-object p1, p1, Lc7/gb;->e:Lc7/pb;

    invoke-virtual {p1}, Lc7/pb;->a()V

    :cond_5
    xor-int/lit8 p1, v0, 0x1

    iput-boolean p1, p0, Lc7/w7;->o:Z

    return-void
.end method

.method public final bridge synthetic zza()Landroid/content/Context;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Lo6/d;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzd()Lc7/c;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzd()Lc7/c;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzj()Lc7/v4;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzl()Lc7/d6;
    .locals 1

    invoke-super {p0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    return-object v0
.end method
