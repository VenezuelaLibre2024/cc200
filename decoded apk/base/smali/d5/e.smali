.class public final Ld5/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# static fields
.field public static final j:Ld5/e;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;

.field public static final m:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ld5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final i:J


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ld5/e;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Ld5/e;-><init>(Ljava/util/List;J)V

    sput-object v0, Ld5/e;->j:Ld5/e;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld5/e;->k:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld5/e;->l:Ljava/lang/String;

    sget-object v0, Ld5/d;->a:Ld5/d;

    sput-object v0, Ld5/e;->m:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld5/b;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Ld5/e;->h:Li7/u;

    iput-wide p2, p0, Ld5/e;->i:J

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ld5/e;
    .locals 0

    invoke-static {p0}, Ld5/e;->b(Landroid/os/Bundle;)Ld5/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/os/Bundle;)Ld5/e;
    .locals 3

    sget-object v0, Ld5/e;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Ld5/b;->Q:Ls3/h$a;

    invoke-static {v1, v0}, Lp5/c;->b(Ls3/h$a;Ljava/util/List;)Li7/u;

    move-result-object v0

    :goto_0
    sget-object v1, Ld5/e;->l:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    new-instance p0, Ld5/e;

    invoke-direct {p0, v0, v1, v2}, Ld5/e;-><init>(Ljava/util/List;J)V

    return-object p0
.end method
