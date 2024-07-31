.class public final Lc7/e5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lc7/b5;

.field public final i:I

.field public final j:Ljava/lang/Throwable;

.field public final k:[B

.field public final l:Ljava/lang/String;

.field public final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lc7/b5;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc7/b5;",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lc7/e5;->h:Lc7/b5;

    iput p3, p0, Lc7/e5;->i:I

    iput-object p4, p0, Lc7/e5;->j:Ljava/lang/Throwable;

    iput-object p5, p0, Lc7/e5;->k:[B

    iput-object p1, p0, Lc7/e5;->l:Ljava/lang/String;

    iput-object p6, p0, Lc7/e5;->m:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lc7/b5;ILjava/lang/Throwable;[BLjava/util/Map;Lc7/d5;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lc7/e5;-><init>(Ljava/lang/String;Lc7/b5;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc7/e5;->h:Lc7/b5;

    iget-object v1, p0, Lc7/e5;->l:Ljava/lang/String;

    iget v2, p0, Lc7/e5;->i:I

    iget-object v3, p0, Lc7/e5;->j:Ljava/lang/Throwable;

    iget-object v4, p0, Lc7/e5;->k:[B

    iget-object v5, p0, Lc7/e5;->m:Ljava/util/Map;

    invoke-interface/range {v0 .. v5}, Lc7/b5;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
