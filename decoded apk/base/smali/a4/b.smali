.class public final La4/b;
.super Lx3/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La4/b$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Lx3/t;IJJ)V
    .locals 16

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, La4/a;

    invoke-direct {v1, v0}, La4/a;-><init>(Lx3/t;)V

    new-instance v2, La4/b$b;

    const/4 v3, 0x0

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, La4/b$b;-><init>(Lx3/t;ILa4/b$a;)V

    invoke-virtual/range {p1 .. p1}, Lx3/t;->f()J

    move-result-wide v3

    iget-wide v7, v0, Lx3/t;->j:J

    invoke-virtual/range {p1 .. p1}, Lx3/t;->d()J

    move-result-wide v13

    iget v0, v0, Lx3/t;->c:I

    const/4 v5, 0x6

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v15

    const-wide/16 v5, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    invoke-direct/range {v0 .. v15}, Lx3/a;-><init>(Lx3/a$d;Lx3/a$f;JJJJJJI)V

    return-void
.end method
