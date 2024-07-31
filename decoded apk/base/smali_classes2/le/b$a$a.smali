.class public final Lle/b$a$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle/b$a;->a(Lgd/s;Lsd/l;)V
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

    iput-object p1, p0, Lle/b$a$a;->h:Lle/b;

    iput-object p2, p0, Lle/b$a$a;->i:Lle/b$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lle/b$a$a;->h:Lle/b;

    iget-object v0, p0, Lle/b$a$a;->i:Lle/b$a;

    iget-object v0, v0, Lle/b$a;->i:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lle/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lle/b$a$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
