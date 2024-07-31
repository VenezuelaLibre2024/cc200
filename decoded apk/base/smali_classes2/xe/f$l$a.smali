.class public Lxe/f$l$a;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f$l;->b(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:Lxe/i;

.field public final synthetic j:Lxe/f$l;


# direct methods
.method public varargs constructor <init>(Lxe/f$l;Ljava/lang/String;[Ljava/lang/Object;Lxe/i;)V
    .locals 0

    iput-object p1, p0, Lxe/f$l$a;->j:Lxe/f$l;

    iput-object p4, p0, Lxe/f$l$a;->i:Lxe/i;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lxe/f$l$a;->j:Lxe/f$l;

    iget-object v0, v0, Lxe/f$l;->j:Lxe/f;

    iget-object v0, v0, Lxe/f;->i:Lxe/f$j;

    iget-object v1, p0, Lxe/f$l$a;->i:Lxe/i;

    invoke-virtual {v0, v1}, Lxe/f$j;->b(Lxe/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v1

    const/4 v2, 0x4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Http2Connection.Listener failure for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lxe/f$l$a;->j:Lxe/f$l;

    iget-object v4, v4, Lxe/f$l;->j:Lxe/f;

    iget-object v4, v4, Lxe/f;->k:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lye/f;->s(ILjava/lang/String;Ljava/lang/Throwable;)V

    :try_start_1
    iget-object v1, p0, Lxe/f$l$a;->i:Lxe/i;

    sget-object v2, Lxe/b;->j:Lxe/b;

    invoke-virtual {v1, v2, v0}, Lxe/i;->d(Lxe/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-void
.end method
