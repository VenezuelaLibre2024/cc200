.class public final Lg5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld5/h;


# instance fields
.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld5/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/b;->h:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public c(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public f(J)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ld5/b;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lg5/b;->h:Ljava/util/List;

    return-object p1
.end method

.method public h()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
