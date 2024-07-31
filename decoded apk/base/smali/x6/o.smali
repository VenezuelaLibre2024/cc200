.class public final Lx6/o;
.super Lr6/a;
.source ""


# instance fields
.field public final e:Landroid/view/ViewGroup;

.field public final f:Landroid/content/Context;

.field public g:Lr6/e;

.field public final h:Lcom/google/android/gms/maps/GoogleMapOptions;

.field public final i:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 1

    invoke-direct {p0}, Lr6/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx6/o;->i:Ljava/util/List;

    iput-object p1, p0, Lx6/o;->e:Landroid/view/ViewGroup;

    iput-object p2, p0, Lx6/o;->f:Landroid/content/Context;

    iput-object p3, p0, Lx6/o;->h:Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method


# virtual methods
.method public final a(Lr6/e;)V
    .locals 0

    iput-object p1, p0, Lx6/o;->g:Lr6/e;

    invoke-virtual {p0}, Lx6/o;->q()V

    return-void
.end method

.method public final p(Lx6/f;)V
    .locals 1

    invoke-virtual {p0}, Lr6/a;->b()Lr6/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr6/a;->b()Lr6/c;

    move-result-object v0

    check-cast v0, Lx6/n;

    invoke-virtual {v0, p1}, Lx6/n;->a(Lx6/f;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx6/o;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final q()V
    .locals 4

    iget-object v0, p0, Lx6/o;->g:Lr6/e;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lr6/a;->b()Lr6/c;

    move-result-object v0

    if-nez v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lx6/o;->f:Landroid/content/Context;

    invoke-static {v0}, Lx6/e;->a(Landroid/content/Context;)I

    iget-object v0, p0, Lx6/o;->f:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ly6/e0;->a(Landroid/content/Context;Lx6/e$a;)Ly6/g0;

    move-result-object v0

    iget-object v1, p0, Lx6/o;->f:Landroid/content/Context;

    invoke-static {v1}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object v1

    iget-object v2, p0, Lx6/o;->h:Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-interface {v0, v1, v2}, Ly6/g0;->L(Lr6/b;Lcom/google/android/gms/maps/GoogleMapOptions;)Ly6/c;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lx6/o;->g:Lr6/e;

    new-instance v2, Lx6/n;

    iget-object v3, p0, Lx6/o;->e:Landroid/view/ViewGroup;

    invoke-direct {v2, v3, v0}, Lx6/n;-><init>(Landroid/view/ViewGroup;Ly6/c;)V

    invoke-interface {v1, v2}, Lr6/e;->a(Lr6/c;)V

    iget-object v0, p0, Lx6/o;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx6/f;

    invoke-virtual {p0}, Lr6/a;->b()Lr6/c;

    move-result-object v2

    check-cast v2, Lx6/n;

    invoke-virtual {v2, v1}, Lx6/n;->a(Lx6/f;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx6/o;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Le6/g; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :catch_1
    move-exception v0

    new-instance v1, Lz6/v;

    invoke-direct {v1, v0}, Lz6/v;-><init>(Landroid/os/RemoteException;)V

    throw v1

    :cond_2
    return-void
.end method
