.class public Ly4/k$e;
.super Ly4/k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Ly4/k$e;-><init>(Ly4/i;JJJJ)V

    return-void
.end method

.method public constructor <init>(Ly4/i;JJJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ly4/k;-><init>(Ly4/i;JJ)V

    iput-wide p6, p0, Ly4/k$e;->d:J

    iput-wide p8, p0, Ly4/k$e;->e:J

    return-void
.end method


# virtual methods
.method public c()Ly4/i;
    .locals 7

    iget-wide v4, p0, Ly4/k$e;->e:J

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v6, Ly4/i;

    const/4 v1, 0x0

    iget-wide v2, p0, Ly4/k$e;->d:J

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ly4/i;-><init>(Ljava/lang/String;JJ)V

    :goto_0
    return-object v0
.end method
