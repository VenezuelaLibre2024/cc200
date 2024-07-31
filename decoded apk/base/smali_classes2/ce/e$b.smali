.class public final Lce/e$b;
.super Lce/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final h:[Lce/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lce/e<",
            "TT;>.a;"
        }
    .end annotation
.end field

.field public final synthetic i:Lce/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/e<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lce/e;[Lce/e$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lce/e<",
            "TT;>.a;)V"
        }
    .end annotation

    iput-object p1, p0, Lce/e$b;->i:Lce/e;

    invoke-direct {p0}, Lce/l;-><init>()V

    iput-object p2, p0, Lce/e$b;->h:[Lce/e$a;

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0}, Lce/e$b;->f()V

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lce/e$b;->h:[Lce/e$a;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lce/e$a;->y()Lce/i1;

    move-result-object v3

    invoke-interface {v3}, Lce/i1;->dispose()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/e$b;->e(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DisposeHandlersOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lce/e$b;->h:[Lce/e$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
