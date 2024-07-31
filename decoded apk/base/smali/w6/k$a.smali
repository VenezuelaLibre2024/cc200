.class public final Lw6/k$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public b:I

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lw6/k$a;->a:Ljava/util/List;

    const/4 v0, 0x5

    iput v0, p0, Lw6/k$a;->b:I

    const-string v0, ""

    iput-object v0, p0, Lw6/k$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lw6/h;)Lw6/k$a;
    .locals 2

    const-string v0, "geofence can\'t be null."

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Lcom/google/android/gms/internal/location/zzdh;

    const-string v1, "Geofence must be created using Geofence.Builder."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lw6/k$a;->a:Ljava/util/List;

    check-cast p1, Lcom/google/android/gms/internal/location/zzdh;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Ljava/util/List;)Lw6/k$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw6/h;",
            ">;)",
            "Lw6/k$a;"
        }
    .end annotation

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw6/h;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lw6/k$a;->a(Lw6/h;)Lw6/k$a;

    goto :goto_0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public c()Lw6/k;
    .locals 5

    iget-object v0, p0, Lw6/k$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "No geofence has been added to this request."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    new-instance v0, Lw6/k;

    iget-object v1, p0, Lw6/k$a;->a:Ljava/util/List;

    iget v2, p0, Lw6/k$a;->b:I

    iget-object v3, p0, Lw6/k$a;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lw6/k;-><init>(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(I)Lw6/k$a;
    .locals 0

    and-int/lit8 p1, p1, 0x7

    iput p1, p0, Lw6/k$a;->b:I

    return-object p0
.end method
