.class public final Lc4/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/m;


# instance fields
.field public final h:J

.field public final i:Lx3/m;


# direct methods
.method public constructor <init>(JLx3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc4/d;->h:J

    iput-object p3, p0, Lc4/d;->i:Lx3/m;

    return-void
.end method

.method public static synthetic a(Lc4/d;)J
    .locals 2

    iget-wide v0, p0, Lc4/d;->h:J

    return-wide v0
.end method


# virtual methods
.method public e(II)Lx3/b0;
    .locals 1

    iget-object v0, p0, Lc4/d;->i:Lx3/m;

    invoke-interface {v0, p1, p2}, Lx3/m;->e(II)Lx3/b0;

    move-result-object p1

    return-object p1
.end method

.method public j(Lx3/z;)V
    .locals 2

    iget-object v0, p0, Lc4/d;->i:Lx3/m;

    new-instance v1, Lc4/d$a;

    invoke-direct {v1, p0, p1}, Lc4/d$a;-><init>(Lc4/d;Lx3/z;)V

    invoke-interface {v0, v1}, Lx3/m;->j(Lx3/z;)V

    return-void
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lc4/d;->i:Lx3/m;

    invoke-interface {v0}, Lx3/m;->n()V

    return-void
.end method
