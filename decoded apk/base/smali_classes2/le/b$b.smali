.class public final Lle/b$b;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle/b;-><init>(Z)V
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
.field public final synthetic h:Lle/b;


# direct methods
.method public constructor <init>(Lle/b;)V
    .locals 0

    iput-object p1, p0, Lle/b$b;->h:Lle/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lke/b;Ljava/lang/Object;Ljava/lang/Object;)Lsd/l;
    .locals 0
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

    new-instance p1, Lle/b$b$a;

    iget-object p3, p0, Lle/b$b;->h:Lle/b;

    invoke-direct {p1, p3, p2}, Lle/b$b$a;-><init>(Lle/b;Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lke/b;

    invoke-virtual {p0, p1, p2, p3}, Lle/b$b;->a(Lke/b;Ljava/lang/Object;Ljava/lang/Object;)Lsd/l;

    move-result-object p1

    return-object p1
.end method
