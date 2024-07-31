.class public Lv/b$d$a;
.super Lv/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic o:Lv/b$d;


# direct methods
.method public constructor <init>(Lv/b$d;)V
    .locals 0

    iput-object p1, p0, Lv/b$d$a;->o:Lv/b$d;

    invoke-direct {p0}, Lv/a;-><init>()V

    return-void
.end method


# virtual methods
.method public s()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lv/b$d$a;->o:Lv/b$d;

    iget-object v0, v0, Lv/b$d;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv/b$a;

    if-nez v0, :cond_0

    const-string v0, "Completer object has been garbage collected, future will fail soon"

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tag=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Lv/b$a;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
