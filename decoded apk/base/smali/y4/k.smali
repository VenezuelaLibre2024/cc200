.class public abstract Ly4/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/k$d;,
        Ly4/k$c;,
        Ly4/k$b;,
        Ly4/k$a;,
        Ly4/k$e;
    }
.end annotation


# instance fields
.field public final a:Ly4/i;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Ly4/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/k;->a:Ly4/i;

    iput-wide p2, p0, Ly4/k;->b:J

    iput-wide p4, p0, Ly4/k;->c:J

    return-void
.end method


# virtual methods
.method public a(Ly4/j;)Ly4/i;
    .locals 0

    iget-object p1, p0, Ly4/k;->a:Ly4/i;

    return-object p1
.end method

.method public b()J
    .locals 6

    iget-wide v0, p0, Ly4/k;->c:J

    iget-wide v4, p0, Ly4/k;->b:J

    const-wide/32 v2, 0xf4240

    invoke-static/range {v0 .. v5}, Lp5/n0;->N0(JJJ)J

    move-result-wide v0

    return-wide v0
.end method
