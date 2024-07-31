.class public abstract Ly4/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/j$b;,
        Ly4/j$c;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Ls3/m1;

.field public final c:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ly4/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:J

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/e;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/e;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ly4/i;


# direct methods
.method public constructor <init>(JLs3/m1;Ljava/util/List;Ly4/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ly4/b;",
            ">;",
            "Ly4/k;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp5/a;->a(Z)V

    iput-wide p1, p0, Ly4/j;->a:J

    iput-object p3, p0, Ly4/j;->b:Ls3/m1;

    invoke-static {p4}, Li7/u;->p(Ljava/util/Collection;)Li7/u;

    move-result-object p1

    iput-object p1, p0, Ly4/j;->c:Li7/u;

    if-nez p6, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ly4/j;->e:Ljava/util/List;

    iput-object p7, p0, Ly4/j;->f:Ljava/util/List;

    iput-object p8, p0, Ly4/j;->g:Ljava/util/List;

    invoke-virtual {p5, p0}, Ly4/k;->a(Ly4/j;)Ly4/i;

    move-result-object p1

    iput-object p1, p0, Ly4/j;->h:Ly4/i;

    invoke-virtual {p5}, Ly4/k;->b()J

    move-result-wide p1

    iput-wide p1, p0, Ly4/j;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JLs3/m1;Ljava/util/List;Ly4/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ly4/j$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Ly4/j;-><init>(JLs3/m1;Ljava/util/List;Ly4/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static o(JLs3/m1;Ljava/util/List;Ly4/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ly4/j;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ly4/b;",
            ">;",
            "Ly4/k;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ly4/j;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Ly4/k$e;

    if-eqz v1, :cond_0

    new-instance v1, Ly4/j$c;

    move-object v7, v0

    check-cast v7, Ly4/k$e;

    const-wide/16 v12, -0x1

    move-object v2, v1

    move-wide v3, p0

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v2 .. v13}, Ly4/j$c;-><init>(JLs3/m1;Ljava/util/List;Ly4/k$e;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;J)V

    return-object v1

    :cond_0
    instance-of v1, v0, Ly4/k$a;

    if-eqz v1, :cond_1

    new-instance v1, Ly4/j$b;

    move-object v7, v0

    check-cast v7, Ly4/k$a;

    move-object v2, v1

    move-wide v3, p0

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v10}, Ly4/j$b;-><init>(JLs3/m1;Ljava/util/List;Ly4/k$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()Lx4/f;
.end method

.method public abstract m()Ly4/i;
.end method

.method public n()Ly4/i;
    .locals 1

    iget-object v0, p0, Ly4/j;->h:Ly4/i;

    return-object v0
.end method
