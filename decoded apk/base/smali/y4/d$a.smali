.class public final Ly4/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ls3/m1;

.field public final b:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ly4/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ly4/k;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lw3/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ly4/e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls3/m1;Ljava/util/List;Ly4/k;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ly4/b;",
            ">;",
            "Ly4/k;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lw3/m$b;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ly4/e;",
            ">;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/d$a;->a:Ls3/m1;

    invoke-static {p2}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Ly4/d$a;->b:Li7/u;

    iput-object p3, p0, Ly4/d$a;->c:Ly4/k;

    iput-object p4, p0, Ly4/d$a;->d:Ljava/lang/String;

    iput-object p5, p0, Ly4/d$a;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Ly4/d$a;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Ly4/d$a;->h:Ljava/util/List;

    iput-object p8, p0, Ly4/d$a;->i:Ljava/util/List;

    iput-wide p9, p0, Ly4/d$a;->g:J

    return-void
.end method
