.class public abstract Ls3/h3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# static fields
.field public static final h:Ljava/lang/String;

.field public static final i:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/h3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/h3;->h:Ljava/lang/String;

    sget-object v0, Ls3/g3;->a:Ls3/g3;

    sput-object v0, Ls3/h3;->i:Ls3/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/h3;
    .locals 0

    invoke-static {p0}, Ls3/h3;->b(Landroid/os/Bundle;)Ls3/h3;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Ls3/h3;
    .locals 3

    sget-object v0, Ls3/h3;->h:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Ls3/s3;->n:Ls3/h$a;

    :goto_0
    invoke-interface {v0, p0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object p0

    check-cast p0, Ls3/h3;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown RatingType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object v0, Ls3/o3;->n:Ls3/h$a;

    goto :goto_0

    :cond_2
    sget-object v0, Ls3/v2;->l:Ls3/h$a;

    goto :goto_0

    :cond_3
    sget-object v0, Ls3/p1;->n:Ls3/h$a;

    goto :goto_0
.end method
