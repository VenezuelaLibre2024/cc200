.class public Ly4/j$c;
.super Ly4/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final i:Landroid/net/Uri;

.field public final j:J

.field public final k:Ljava/lang/String;

.field public final l:Ly4/i;

.field public final m:Ly4/m;


# direct methods
.method public constructor <init>(JLs3/m1;Ljava/util/List;Ly4/k$e;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ls3/m1;",
            "Ljava/util/List<",
            "Ly4/b;",
            ">;",
            "Ly4/k$e;",
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
            "J)V"
        }
    .end annotation

    move-object v10, p0

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ly4/j;-><init>(JLs3/m1;Ljava/util/List;Ly4/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ly4/j$a;)V

    const/4 v0, 0x0

    move-object v1, p4

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly4/b;

    iget-object v0, v0, Ly4/b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, v10, Ly4/j$c;->i:Landroid/net/Uri;

    invoke-virtual/range {p5 .. p5}, Ly4/k$e;->c()Ly4/i;

    move-result-object v0

    iput-object v0, v10, Ly4/j$c;->l:Ly4/i;

    move-object/from16 v1, p9

    iput-object v1, v10, Ly4/j$c;->k:Ljava/lang/String;

    move-wide/from16 v1, p10

    iput-wide v1, v10, Ly4/j$c;->j:J

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ly4/m;

    new-instance v3, Ly4/i;

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object p1, v3

    move-object p2, v4

    move-wide p3, v5

    move-wide/from16 p5, p10

    invoke-direct/range {p1 .. p6}, Ly4/i;-><init>(Ljava/lang/String;JJ)V

    invoke-direct {v0, v3}, Ly4/m;-><init>(Ly4/i;)V

    :goto_0
    iput-object v0, v10, Ly4/j$c;->m:Ly4/m;

    return-void
.end method


# virtual methods
.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly4/j$c;->k:Ljava/lang/String;

    return-object v0
.end method

.method public l()Lx4/f;
    .locals 1

    iget-object v0, p0, Ly4/j$c;->m:Ly4/m;

    return-object v0
.end method

.method public m()Ly4/i;
    .locals 1

    iget-object v0, p0, Ly4/j$c;->l:Ly4/i;

    return-object v0
.end method
