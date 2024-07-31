.class public final Lle/b$a$b;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle/b$a;->b(Lgd/s;Ljava/lang/Object;Lsd/l;)Ljava/lang/Object;
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
.field public final synthetic h:Lle/b;

.field public final synthetic i:Lle/b$a;


# direct methods
.method public constructor <init>(Lle/b;Lle/b$a;)V
    .locals 0

    iput-object p1, p0, Lle/b$a$b;->h:Lle/b;

    iput-object p2, p0, Lle/b$a$b;->i:Lle/b$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lle/b$a$b;->h:Lle/b;

    iget-object v0, p0, Lle/b$a$b;->i:Lle/b$a;

    invoke-static {}, Lce/t0;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lle/c;->c()Lhe/l0;

    move-result-object v1

    if-eq p1, v1, :cond_1

    iget-object v0, v0, Lle/b$a;->i:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_2
    invoke-static {}, Lle/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    iget-object v0, p0, Lle/b$a$b;->h:Lle/b;

    iget-object v1, p0, Lle/b$a$b;->i:Lle/b$a;

    iget-object v1, v1, Lle/b$a;->i:Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lle/b$a$b;->h:Lle/b;

    iget-object v0, p0, Lle/b$a$b;->i:Lle/b$a;

    iget-object v0, v0, Lle/b$a;->i:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lle/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lle/b$a$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
