.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzaag;
.super Lcom/google/android/gms/internal/firebase-auth-api/zzadf;
.source ""


# direct methods
.method public constructor <init>(Ln7/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzace;

    invoke-direct {v0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzace;-><init>(Ln7/g;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzace;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zzb:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static zza(Ln7/g;Lcom/google/android/gms/internal/firebase-auth-api/zzafb;)Lx7/i;
    .locals 6

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lx7/e;

    const-string v2, "firebase"

    invoke-direct {v1, p1, v2}, Lx7/e;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafb;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzl()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    new-instance v3, Lx7/e;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/firebase-auth-api/zzafr;

    invoke-direct {v3, v4}, Lx7/e;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafr;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lx7/i;

    invoke-direct {v1, p0, v0}, Lx7/i;-><init>(Ln7/g;Ljava/util/List;)V

    new-instance p0, Lx7/k;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzb()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zza()J

    move-result-wide v4

    invoke-direct {p0, v2, v3, v4, v5}, Lx7/k;-><init>(JJ)V

    invoke-virtual {v1, p0}, Lx7/i;->m0(Lx7/k;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzn()Z

    move-result p0

    invoke-virtual {v1, p0}, Lx7/i;->n0(Z)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zze()Lw7/z1;

    move-result-object p0

    invoke-virtual {v1, p0}, Lx7/i;->l0(Lw7/z1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzk()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lx7/o0;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p0}, Lw7/a0;->h0(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzafb;->zzd()Lcom/google/android/gms/internal/firebase-auth-api/zzaq;

    move-result-object p0

    invoke-virtual {v1, p0}, Lx7/i;->o0(Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafi;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaaq;-><init>()V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzabi;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzafj;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzaat;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabh;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Lw7/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lw7/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x7

    invoke-virtual {p3, v0}, Lw7/e;->Q(I)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacb;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzacb;-><init>(Ljava/lang/String;Ljava/lang/String;Lw7/e;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaj;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaaj;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaaj;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;

    invoke-direct {v0, p2, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaal;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaak;

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzaak;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaak;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabn;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabn;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabn;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Ljava/lang/String;Lw7/e;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Lw7/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lw7/e;->Q(I)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    const-string v6, "sendPasswordResetEmail"

    move-object v1, v0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;-><init>(Ljava/lang/String;Lw7/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaba;

    invoke-direct {v0, p3, p4, p5, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzaba;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p7}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p7}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaba;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Ljava/lang/String;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabs;

    invoke-virtual {p2}, Lw7/a0;->zze()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabs;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabs;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/c0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaar;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaar;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaar;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/c1;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/c1;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaby;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaby;-><init>(Lw7/c1;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaby;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/h;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/h;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lw7/a0;->j0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lw7/h;->I()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x4277

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p3, Lw7/j;

    if-eqz v0, :cond_2

    check-cast p3, Lw7/j;

    invoke-virtual {p3}, Lw7/j;->O()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaas;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaas;-><init>(Lw7/j;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaas;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p4, Lcom/google/android/gms/internal/firebase-auth-api/zzaax;

    invoke-direct {p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaax;-><init>(Lw7/j;)V

    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaax;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p4, p3, Lw7/o0;

    if-eqz p4, :cond_3

    check-cast p3, Lw7/o0;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance p4, Lcom/google/android/gms/internal/firebase-auth-api/zzaau;

    invoke-direct {p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaau;-><init>(Lw7/o0;)V

    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaau;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lcom/google/android/gms/internal/firebase-auth-api/zzaav;

    invoke-direct {p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaav;-><init>(Lw7/h;)V

    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaav;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/j;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/j;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaay;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaay;-><init>(Lw7/j;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaay;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/o0;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/o0;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabc;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabc;-><init>(Lw7/o0;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabc;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/o0;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/o0;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabz;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabz;-><init>(Lw7/o0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabz;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/p0;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/p0;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaao;

    const/4 v1, 0x0

    invoke-direct {v0, p3, p4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaao;-><init>(Lw7/i0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lw7/v0;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/v0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaao;

    invoke-direct {v0, p3, p4, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzaao;-><init>(Lw7/i0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/a0;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzabe;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabe;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/e;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/e;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabg;

    invoke-direct {v0, p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzabg;-><init>(Ljava/lang/String;Lw7/e;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabg;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/h;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/h;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabk;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabk;-><init>(Lw7/h;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/j;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/j;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabp;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabp;-><init>(Lw7/j;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/o0;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/o0;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabo;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabo;-><init>(Lw7/o0;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/p0;Lw7/a0;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/p0;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaap;

    invoke-virtual {p3}, Lw7/a0;->zze()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, p4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaap;-><init>(Lw7/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lw7/v0;Lw7/a0;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/v0;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaap;

    invoke-virtual {p3}, Lw7/a0;->zze()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzaap;-><init>(Lw7/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ln7/g;Lx7/t1;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lx7/t1;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabl;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabl;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lw7/a0;Lx7/y;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a0;",
            "Lx7/y;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaan;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzaan;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaan;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lx7/p;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/internal/firebase-auth-api/zzagi;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzabq;-><init>(Lx7/p;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lx7/p;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/firebase/auth/b$b;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/app/Activity;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v11, Lcom/google/android/gms/internal/firebase-auth-api/zzabr;

    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzabr;-><init>(Lx7/p;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Z)V

    move-object v0, p2

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    invoke-virtual {v11, v1, v3, v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lcom/google/firebase/auth/b$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-object v0, p0

    invoke-virtual {p0, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    return-object v1
.end method

.method public final zza(Lx7/p;Lw7/r0;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/b$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lcom/google/android/gms/tasks/Task;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            "Lw7/r0;",
            "Ljava/lang/String;",
            "JZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/firebase/auth/b$b;",
            "Ljava/util/concurrent/Executor;",
            "Landroid/app/Activity;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v11, Lcom/google/android/gms/internal/firebase-auth-api/zzabt;

    invoke-virtual {p1}, Lx7/p;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v0, v11

    move-object v1, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/zzabt;-><init>(Lw7/r0;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2}, Lw7/j0;->b()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p11

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    invoke-virtual {v11, v1, v3, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lcom/google/firebase/auth/b$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-object v0, p0

    invoke-virtual {p0, v11}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    return-object v1
.end method

.method public final zza(Ln7/g;Lcom/google/android/gms/internal/firebase-auth-api/zzafz;Lcom/google/firebase/auth/b$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzacd;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacd;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zzafz;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzafz;->zzd()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p4, p5, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lcom/google/firebase/auth/b$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzacd;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final zzb(Ln7/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaai;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaai;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaai;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/t1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/t1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabm;

    invoke-direct {v0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzabm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabm;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Ljava/lang/String;Lw7/e;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Lw7/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x6

    invoke-virtual {p3, v0}, Lw7/e;->Q(I)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    const-string v6, "sendSignInLinkToEmail"

    move-object v1, v0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;-><init>(Ljava/lang/String;Lw7/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabj;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Lw7/a0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabd;

    invoke-direct {v0, p3, p4, p5, p6}, Lcom/google/android/gms/internal/firebase-auth-api/zzabd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p7}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p7}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabd;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Lw7/a0;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lw7/a0;->j0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lw7/a0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x4278

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzach;->zza(Lcom/google/android/gms/common/api/Status;)Ln7/m;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    const-string v0, "password"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabu;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabu;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p3, Lcom/google/android/gms/internal/firebase-auth-api/zzabv;

    invoke-direct {p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabv;-><init>()V

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Lw7/a0;Lw7/h;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/h;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaw;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaaw;-><init>(Lw7/h;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaaw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Lw7/a0;Lw7/j;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/j;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabb;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabb;-><init>(Lw7/j;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ln7/g;Lw7/a0;Lw7/o0;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/o0;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;-><init>(Lw7/o0;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabf;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Ln7/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/u0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaam;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaam;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaam;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Ln7/g;Lw7/a0;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabx;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabx;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabx;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Ln7/g;Lw7/a0;Lw7/h;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Lw7/h;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaaz;

    invoke-direct {v0, p3, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzaaz;-><init>(Lw7/h;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaaz;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzd(Ln7/g;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaca;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzaca;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaca;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzd(Ln7/g;Lw7/a0;Ljava/lang/String;Lx7/h1;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lw7/a0;",
            "Ljava/lang/String;",
            "Lx7/h1;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzabw;

    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zzabw;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ln7/g;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lw7/a0;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zzacw;->zza(Lx7/x;)Lcom/google/android/gms/internal/firebase-auth-api/zzacw;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzabw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza(Lcom/google/android/gms/internal/firebase-auth-api/zzadh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
