.class public Lca/f$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Laa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laa/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lca/f$g;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/android/gms/maps/model/LatLng;

.field public final synthetic d:Lca/f;


# direct methods
.method public constructor <init>(Lca/f;Laa/a;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laa/a<",
            "TT;>;",
            "Ljava/util/Set<",
            "Lca/f$g;",
            ">;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lca/f$d;->d:Lca/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lca/f$d;->a:Laa/a;

    iput-object p3, p0, Lca/f$d;->b:Ljava/util/Set;

    iput-object p4, p0, Lca/f$d;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public static synthetic a(Lca/f$d;Lca/f$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lca/f$d;->b(Lca/f$f;)V

    return-void
.end method


# virtual methods
.method public final b(Lca/f$f;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/f<",
            "TT;>.f;)V"
        }
    .end annotation

    iget-object v0, p0, Lca/f$d;->d:Lca/f;

    iget-object v1, p0, Lca/f$d;->a:Laa/a;

    invoke-virtual {v0, v1}, Lca/f;->shouldRenderAsCluster(Laa/a;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-object v0, p0, Lca/f$d;->a:Laa/a;

    invoke-interface {v0}, Laa/a;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laa/b;

    iget-object v3, p0, Lca/f$d;->d:Lca/f;

    invoke-static {v3}, Lca/f;->access$300(Lca/f;)Lca/f$e;

    move-result-object v3

    invoke-virtual {v3, v2}, Lca/f$e;->b(Ljava/lang/Object;)Lz6/m;

    move-result-object v3

    if-nez v3, :cond_2

    new-instance v3, Lz6/n;

    invoke-direct {v3}, Lz6/n;-><init>()V

    iget-object v4, p0, Lca/f$d;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v4, :cond_0

    invoke-virtual {v3, v4}, Lz6/n;->c0(Lcom/google/android/gms/maps/model/LatLng;)Lz6/n;

    goto :goto_1

    :cond_0
    invoke-interface {v2}, Laa/b;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {v3, v4}, Lz6/n;->c0(Lcom/google/android/gms/maps/model/LatLng;)Lz6/n;

    invoke-interface {v2}, Laa/b;->getZIndex()Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Laa/b;->getZIndex()Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v3, v4}, Lz6/n;->h0(F)Lz6/n;

    :cond_1
    :goto_1
    iget-object v4, p0, Lca/f$d;->d:Lca/f;

    invoke-virtual {v4, v2, v3}, Lca/f;->onBeforeClusterItemRendered(Laa/b;Lz6/n;)V

    iget-object v4, p0, Lca/f$d;->d:Lca/f;

    invoke-static {v4}, Lca/f;->access$1800(Lca/f;)Laa/c;

    move-result-object v4

    invoke-virtual {v4}, Laa/c;->g()Lda/b$a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lda/b$a;->i(Lz6/n;)Lz6/m;

    move-result-object v3

    new-instance v4, Lca/f$g;

    invoke-direct {v4, v3, v1}, Lca/f$g;-><init>(Lz6/m;Lca/f$a;)V

    iget-object v5, p0, Lca/f$d;->d:Lca/f;

    invoke-static {v5}, Lca/f;->access$300(Lca/f;)Lca/f$e;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Lca/f$e;->c(Ljava/lang/Object;Lz6/m;)V

    iget-object v5, p0, Lca/f$d;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v5, :cond_3

    invoke-interface {v2}, Laa/b;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-virtual {p1, v4, v5, v6}, Lca/f$f;->b(Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_2

    :cond_2
    new-instance v4, Lca/f$g;

    invoke-direct {v4, v3, v1}, Lca/f$g;-><init>(Lz6/m;Lca/f$a;)V

    iget-object v5, p0, Lca/f$d;->d:Lca/f;

    invoke-virtual {v5, v2, v3}, Lca/f;->onClusterItemUpdated(Laa/b;Lz6/m;)V

    :cond_3
    :goto_2
    iget-object v5, p0, Lca/f$d;->d:Lca/f;

    invoke-virtual {v5, v2, v3}, Lca/f;->onClusterItemRendered(Laa/b;Lz6/m;)V

    iget-object v2, p0, Lca/f$d;->b:Ljava/util/Set;

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lca/f$d;->d:Lca/f;

    invoke-static {v0}, Lca/f;->access$2000(Lca/f;)Lca/f$e;

    move-result-object v0

    iget-object v2, p0, Lca/f$d;->a:Laa/a;

    invoke-virtual {v0, v2}, Lca/f$e;->b(Ljava/lang/Object;)Lz6/m;

    move-result-object v0

    if-nez v0, :cond_7

    new-instance v0, Lz6/n;

    invoke-direct {v0}, Lz6/n;-><init>()V

    iget-object v2, p0, Lca/f$d;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v2, :cond_6

    iget-object v2, p0, Lca/f$d;->a:Laa/a;

    invoke-interface {v2}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    :cond_6
    invoke-virtual {v0, v2}, Lz6/n;->c0(Lcom/google/android/gms/maps/model/LatLng;)Lz6/n;

    move-result-object v0

    iget-object v2, p0, Lca/f$d;->d:Lca/f;

    iget-object v3, p0, Lca/f$d;->a:Laa/a;

    invoke-virtual {v2, v3, v0}, Lca/f;->onBeforeClusterRendered(Laa/a;Lz6/n;)V

    iget-object v2, p0, Lca/f$d;->d:Lca/f;

    invoke-static {v2}, Lca/f;->access$1800(Lca/f;)Laa/c;

    move-result-object v2

    invoke-virtual {v2}, Laa/c;->f()Lda/b$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lda/b$a;->i(Lz6/n;)Lz6/m;

    move-result-object v0

    iget-object v2, p0, Lca/f$d;->d:Lca/f;

    invoke-static {v2}, Lca/f;->access$2000(Lca/f;)Lca/f$e;

    move-result-object v2

    iget-object v3, p0, Lca/f$d;->a:Laa/a;

    invoke-virtual {v2, v3, v0}, Lca/f$e;->c(Ljava/lang/Object;Lz6/m;)V

    new-instance v2, Lca/f$g;

    invoke-direct {v2, v0, v1}, Lca/f$g;-><init>(Lz6/m;Lca/f$a;)V

    iget-object v1, p0, Lca/f$d;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v1, :cond_8

    iget-object v3, p0, Lca/f$d;->a:Laa/a;

    invoke-interface {v3}, Laa/a;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-virtual {p1, v2, v1, v3}, Lca/f$f;->b(Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_3

    :cond_7
    new-instance v2, Lca/f$g;

    invoke-direct {v2, v0, v1}, Lca/f$g;-><init>(Lz6/m;Lca/f$a;)V

    iget-object p1, p0, Lca/f$d;->d:Lca/f;

    iget-object v1, p0, Lca/f$d;->a:Laa/a;

    invoke-virtual {p1, v1, v0}, Lca/f;->onClusterUpdated(Laa/a;Lz6/m;)V

    :cond_8
    :goto_3
    iget-object p1, p0, Lca/f$d;->d:Lca/f;

    iget-object v1, p0, Lca/f$d;->a:Laa/a;

    invoke-virtual {p1, v1, v0}, Lca/f;->onClusterRendered(Laa/a;Lz6/m;)V

    iget-object p1, p0, Lca/f$d;->b:Ljava/util/Set;

    invoke-interface {p1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method
