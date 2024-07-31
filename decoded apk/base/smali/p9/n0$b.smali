.class public Lp9/n0$b;
.super Lp9/e0$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp9/e0<",
        "Lp9/n0$b;",
        ">.b;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final d:Landroid/net/Uri;

.field public final e:Lp9/o;

.field public final synthetic f:Lp9/n0;


# direct methods
.method public constructor <init>(Lp9/n0;Ljava/lang/Exception;JLandroid/net/Uri;Lp9/o;)V
    .locals 0

    iput-object p1, p0, Lp9/n0$b;->f:Lp9/n0;

    invoke-direct {p0, p1, p2}, Lp9/e0$b;-><init>(Lp9/e0;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lp9/n0$b;->c:J

    iput-object p5, p0, Lp9/n0$b;->d:Landroid/net/Uri;

    iput-object p6, p0, Lp9/n0$b;->e:Lp9/o;

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lp9/n0$b;->c:J

    return-wide v0
.end method

.method public e()Lp9/o;
    .locals 1

    iget-object v0, p0, Lp9/n0$b;->e:Lp9/o;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lp9/n0$b;->f:Lp9/n0;

    invoke-virtual {v0}, Lp9/n0;->q0()J

    move-result-wide v0

    return-wide v0
.end method
