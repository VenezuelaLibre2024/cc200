.class public final Ld0/i$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:J

.field public b:I

.field public c:J

.field public d:I

.field public e:J

.field public f:F

.field public g:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2}, Ld0/i$c;->b(J)Ld0/i$c;

    const/16 p1, 0x66

    iput p1, p0, Ld0/i$c;->b:I

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Ld0/i$c;->c:J

    const p1, 0x7fffffff

    iput p1, p0, Ld0/i$c;->d:I

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ld0/i$c;->e:J

    const/4 p1, 0x0

    iput p1, p0, Ld0/i$c;->f:F

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Ld0/i$c;->g:J

    return-void
.end method


# virtual methods
.method public a()Ld0/i;
    .locals 14

    iget-wide v0, p0, Ld0/i$c;->a:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-wide v0, p0, Ld0/i$c;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "passive location requests must have an explicit minimum update interval"

    invoke-static {v0, v1}, Lj0/d;->l(ZLjava/lang/String;)V

    new-instance v0, Ld0/i;

    iget-wide v3, p0, Ld0/i$c;->a:J

    iget v5, p0, Ld0/i$c;->b:I

    iget-wide v6, p0, Ld0/i$c;->c:J

    iget v8, p0, Ld0/i$c;->d:I

    iget-wide v1, p0, Ld0/i$c;->e:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget v11, p0, Ld0/i$c;->f:F

    iget-wide v12, p0, Ld0/i$c;->g:J

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Ld0/i;-><init>(JIJIJFJ)V

    return-object v0
.end method

.method public b(J)Ld0/i$c;
    .locals 7

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    const-string v6, "intervalMillis"

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, Lj0/d;->f(JJJLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, Ld0/i$c;->a:J

    return-object p0
.end method

.method public c(F)Ld0/i$c;
    .locals 3

    iput p1, p0, Ld0/i$c;->f:F

    const/4 v0, 0x0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    const-string v2, "minUpdateDistanceMeters"

    invoke-static {p1, v0, v1, v2}, Lj0/d;->d(FFFLjava/lang/String;)F

    move-result p1

    iput p1, p0, Ld0/i$c;->f:F

    return-object p0
.end method

.method public d(I)Ld0/i$c;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x68

    if-eq p1, v2, :cond_1

    const/16 v2, 0x66

    if-eq p1, v2, :cond_1

    const/16 v2, 0x64

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v0

    const-string v0, "quality must be a defined QUALITY constant, not %d"

    invoke-static {v2, v0, v1}, Lj0/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput p1, p0, Ld0/i$c;->b:I

    return-object p0
.end method
