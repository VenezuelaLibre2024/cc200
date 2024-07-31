.class public Lx3/z$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lx3/z$a;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lx3/z$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lx3/z$b;->a:J

    new-instance p1, Lx3/z$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    sget-object p2, Lx3/a0;->c:Lx3/a0;

    goto :goto_0

    :cond_0
    new-instance p2, Lx3/a0;

    invoke-direct {p2, v0, v1, p3, p4}, Lx3/a0;-><init>(JJ)V

    :goto_0
    invoke-direct {p1, p2}, Lx3/z$a;-><init>(Lx3/a0;)V

    iput-object p1, p0, Lx3/z$b;->b:Lx3/z$a;

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lx3/z$b;->a:J

    return-wide v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(J)Lx3/z$a;
    .locals 0

    iget-object p1, p0, Lx3/z$b;->b:Lx3/z$a;

    return-object p1
.end method
