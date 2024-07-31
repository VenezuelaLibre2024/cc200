.class public final Lf4/k$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lf4/o;

.field public final b:Lf4/r;

.field public final c:Lx3/b0;

.field public final d:Lx3/c0;

.field public e:I


# direct methods
.method public constructor <init>(Lf4/o;Lf4/r;Lx3/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/k$a;->a:Lf4/o;

    iput-object p2, p0, Lf4/k$a;->b:Lf4/r;

    iput-object p3, p0, Lf4/k$a;->c:Lx3/b0;

    iget-object p1, p1, Lf4/o;->f:Ls3/m1;

    iget-object p1, p1, Ls3/m1;->s:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lx3/c0;

    invoke-direct {p1}, Lx3/c0;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lf4/k$a;->d:Lx3/c0;

    return-void
.end method
