.class public final Lae/o$b;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lae/o;->T(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lzd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/p<",
        "Ljava/lang/CharSequence;",
        "Ljava/lang/Integer;",
        "Lgd/j<",
        "+",
        "Ljava/lang/Integer;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lae/o$b;->h:Ljava/util/List;

    iput-boolean p2, p0, Lae/o$b;->i:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)Lgd/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "I)",
            "Lgd/j<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lae/o$b;->h:Ljava/util/List;

    iget-boolean v1, p0, Lae/o$b;->i:Z

    const/4 v2, 0x0

    invoke-static {p1, v0, p2, v1, v2}, Lae/o;->t(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lgd/j;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lgd/j;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Lgd/j;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lae/o$b;->a(Ljava/lang/CharSequence;I)Lgd/j;

    move-result-object p1

    return-object p1
.end method
