.class public Lba/f;
.super Lba/a;
.source ""

# interfaces
.implements Lba/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Laa/b;",
        ">",
        "Lba/a<",
        "TT;>;",
        "Lba/e<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:Lba/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lba/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lba/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lba/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lba/a;-><init>()V

    iput-object p1, p0, Lba/f;->b:Lba/b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 0

    return-void
.end method

.method public b(F)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Ljava/util/Set<",
            "+",
            "Laa/a<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lba/f;->b:Lba/b;

    invoke-interface {v0, p1}, Lba/b;->b(F)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lba/f;->b:Lba/b;

    invoke-interface {v0}, Lba/b;->c()V

    return-void
.end method

.method public d(Laa/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lba/f;->b:Lba/b;

    invoke-interface {v0, p1}, Lba/b;->d(Laa/b;)Z

    move-result p1

    return p1
.end method

.method public g()I
    .locals 1

    iget-object v0, p0, Lba/f;->b:Lba/b;

    invoke-interface {v0}, Lba/b;->g()I

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(Laa/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lba/f;->b:Lba/b;

    invoke-interface {v0, p1}, Lba/b;->i(Laa/b;)Z

    move-result p1

    return p1
.end method
