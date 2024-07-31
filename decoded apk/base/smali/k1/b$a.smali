.class public final Lk1/b$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/b;->b(Lce/x0;Ljava/lang/Object;)Ll7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/l<",
        "Ljava/lang/Throwable;",
        "Lgd/s;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lv/b$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv/b$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic i:Lce/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/x0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv/b$a;Lce/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv/b$a<",
            "TT;>;",
            "Lce/x0<",
            "+TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lk1/b$a;->h:Lv/b$a;

    iput-object p2, p0, Lk1/b$a;->i:Lce/x0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    if-eqz p1, :cond_1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lk1/b$a;->h:Lv/b$a;

    invoke-virtual {p1}, Lv/b$a;->c()Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk1/b$a;->h:Lv/b$a;

    invoke-virtual {v0, p1}, Lv/b$a;->e(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lk1/b$a;->h:Lv/b$a;

    iget-object v0, p0, Lk1/b$a;->i:Lce/x0;

    invoke-interface {v0}, Lce/x0;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lv/b$a;->b(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lk1/b$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
