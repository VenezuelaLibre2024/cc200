.class public final Lce/z1;
.super Lce/l;
.source ""


# instance fields
.field public final h:Lsd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/l<",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lce/l;-><init>()V

    iput-object p1, p0, Lce/z1;->h:Lsd/l;

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lce/z1;->h:Lsd/l;

    invoke-interface {v0, p1}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/z1;->e(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InvokeOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lce/z1;->h:Lsd/l;

    invoke-static {v1}, Lce/u0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lce/u0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
