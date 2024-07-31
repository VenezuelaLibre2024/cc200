.class public final Ld5/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld5/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final h:J

.field public final i:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ld5/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLi7/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Li7/u<",
            "Ld5/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld5/f$b;->h:J

    iput-object p3, p0, Ld5/f$b;->i:Li7/u;

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 2

    iget-wide v0, p0, Ld5/f$b;->h:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public c(I)J
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lp5/a;->a(Z)V

    iget-wide v0, p0, Ld5/f$b;->h:J

    return-wide v0
.end method

.method public f(J)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ld5/b;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Ld5/f$b;->h:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Ld5/f$b;->i:Li7/u;

    goto :goto_0

    :cond_0
    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public h()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
