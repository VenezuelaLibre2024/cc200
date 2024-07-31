.class public final synthetic Lc7/l9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/m9;

.field public synthetic i:I

.field public synthetic j:Ljava/lang/Exception;

.field public synthetic k:[B

.field public synthetic l:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lc7/m9;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/l9;->h:Lc7/m9;

    iput p2, p0, Lc7/l9;->i:I

    iput-object p3, p0, Lc7/l9;->j:Ljava/lang/Exception;

    iput-object p4, p0, Lc7/l9;->k:[B

    iput-object p5, p0, Lc7/l9;->l:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/l9;->h:Lc7/m9;

    iget v1, p0, Lc7/l9;->i:I

    iget-object v2, p0, Lc7/l9;->j:Ljava/lang/Exception;

    iget-object v3, p0, Lc7/l9;->k:[B

    iget-object v4, p0, Lc7/l9;->l:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3, v4}, Lc7/m9;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
