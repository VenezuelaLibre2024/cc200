.class public final Ls3/u1$i;
.super Ls3/u1$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ls3/u1$f;",
            "Ls3/u1$b;",
            "Ljava/util/List<",
            "Lt4/c;",
            ">;",
            "Ljava/lang/String;",
            "Li7/u<",
            "Ls3/u1$l;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ls3/u1$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;Ls3/u1$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;Ls3/u1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Ls3/u1$i;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls3/u1$f;Ls3/u1$b;Ljava/util/List;Ljava/lang/String;Li7/u;Ljava/lang/Object;)V

    return-void
.end method
