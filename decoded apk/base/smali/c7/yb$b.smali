.class public final Lc7/yb$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/yb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J


# direct methods
.method public constructor <init>(Lc7/yb;)V
    .locals 1

    invoke-virtual {p1}, Lc7/yb;->j0()Lc7/qc;

    move-result-object v0

    invoke-virtual {v0}, Lc7/qc;->N0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lc7/yb$b;-><init>(Lc7/yb;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Lc7/yb;Lc7/hc;)V
    .locals 0

    invoke-direct {p0, p1}, Lc7/yb$b;-><init>(Lc7/yb;)V

    return-void
.end method

.method public constructor <init>(Lc7/yb;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc7/yb$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lc7/yb;->zzb()Lo6/d;

    move-result-object p1

    invoke-interface {p1}, Lo6/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lc7/yb$b;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lc7/yb;Ljava/lang/String;Lc7/hc;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc7/yb$b;-><init>(Lc7/yb;Ljava/lang/String;)V

    return-void
.end method
