.class public final Lc7/ac;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/b5;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lc7/yb;


# direct methods
.method public constructor <init>(Lc7/yb;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/ac;->a:Ljava/lang/String;

    iput-object p1, p0, Lc7/ac;->b:Lc7/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Throwable;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lc7/ac;->b:Lc7/yb;

    iget-object v5, p0, Lc7/ac;->a:Ljava/lang/String;

    const/4 v1, 0x1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lc7/yb;->E(ZILjava/lang/Throwable;[BLjava/lang/String;)V

    return-void
.end method
