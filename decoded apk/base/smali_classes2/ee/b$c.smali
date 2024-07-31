.class public final Lee/b$c;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lee/b;-><init>(ILsd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/q<",
        "Lke/b<",
        "*>;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Lsd/l<",
        "-",
        "Ljava/lang/Throwable;",
        "+",
        "Lgd/s;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lee/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lee/b<",
            "TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lee/b$c;->h:Lee/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lke/b;Ljava/lang/Object;Ljava/lang/Object;)Lsd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/b<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Lsd/l<",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;"
        }
    .end annotation

    new-instance p2, Lee/b$c$a;

    iget-object v0, p0, Lee/b$c;->h:Lee/b;

    invoke-direct {p2, p3, v0, p1}, Lee/b$c$a;-><init>(Ljava/lang/Object;Lee/b;Lke/b;)V

    return-object p2
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lke/b;

    invoke-virtual {p0, p1, p2, p3}, Lee/b$c;->a(Lke/b;Ljava/lang/Object;Ljava/lang/Object;)Lsd/l;

    move-result-object p1

    return-object p1
.end method
