.class public final Lw3/j0;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final h:Lo5/n;

.field public final i:Landroid/net/Uri;

.field public final j:Ljava/util/Map;
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

.field public final k:J


# direct methods
.method public constructor <init>(Lo5/n;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo5/n;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;J",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p6}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lw3/j0;->h:Lo5/n;

    iput-object p2, p0, Lw3/j0;->i:Landroid/net/Uri;

    iput-object p3, p0, Lw3/j0;->j:Ljava/util/Map;

    iput-wide p4, p0, Lw3/j0;->k:J

    return-void
.end method
