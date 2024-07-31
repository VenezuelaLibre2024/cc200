.class public final Li7/u$a;
.super Li7/s$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Li7/s$a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Li7/u$a;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Li7/s$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Li7/s$b;
    .locals 0

    invoke-virtual {p0, p1}, Li7/u$a;->h(Ljava/lang/Object;)Li7/u$a;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Object;)Li7/u$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Li7/u$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Li7/s$a;->d(Ljava/lang/Object;)Li7/s$a;

    return-object p0
.end method

.method public varargs i([Ljava/lang/Object;)Li7/u$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TE;)",
            "Li7/u$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Li7/s$a;->e([Ljava/lang/Object;)Li7/s$b;

    return-object p0
.end method

.method public j(Ljava/lang/Iterable;)Li7/u$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Li7/u$a<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Li7/s$a;->b(Ljava/lang/Iterable;)Li7/s$b;

    return-object p0
.end method

.method public k()Li7/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/u<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Li7/s$a;->c:Z

    iget-object v0, p0, Li7/s$a;->a:[Ljava/lang/Object;

    iget v1, p0, Li7/s$a;->b:I

    invoke-static {v0, v1}, Li7/u;->m([Ljava/lang/Object;I)Li7/u;

    move-result-object v0

    return-object v0
.end method
