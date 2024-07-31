.class public final Lle/b$b$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle/b$b;->a(Lke/b;Ljava/lang/Object;Ljava/lang/Object;)Lsd/l;
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

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lle/b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lle/b$b$a;->h:Lle/b;

    iput-object p2, p0, Lle/b$b$a;->i:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lle/b$b$a;->h:Lle/b;

    iget-object v0, p0, Lle/b$b$a;->i:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lle/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lle/b$b$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
