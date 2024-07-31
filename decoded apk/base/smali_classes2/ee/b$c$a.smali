.class public final Lee/b$c$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lee/b$c;->a(Lke/b;Ljava/lang/Object;Ljava/lang/Object;)Lsd/l;
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
.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final synthetic j:Lke/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/b<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lee/b;Lke/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lee/b<",
            "TE;>;",
            "Lke/b<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lee/b$c$a;->h:Ljava/lang/Object;

    iput-object p2, p0, Lee/b$c$a;->i:Lee/b;

    iput-object p3, p0, Lee/b$c$a;->j:Lke/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lee/b$c$a;->h:Ljava/lang/Object;

    invoke-static {}, Lee/c;->z()Lhe/l0;

    move-result-object v0

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lee/b$c$a;->i:Lee/b;

    iget-object p1, p1, Lee/b;->c:Lsd/l;

    iget-object v0, p0, Lee/b$c$a;->h:Ljava/lang/Object;

    iget-object v1, p0, Lee/b$c$a;->j:Lke/b;

    invoke-interface {v1}, Lke/b;->getContext()Ljd/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lhe/d0;->b(Lsd/l;Ljava/lang/Object;Ljd/g;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lee/b$c$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
