.class public Lvb/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvb/a$c;
    }
.end annotation


# static fields
.field public static final j:Lwb/e;


# instance fields
.field public a:Lzb/a;

.field public final b:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Ljava/util/List<",
            "Lac/b;",
            ">;>;"
        }
    .end annotation
.end field

.field public final c:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Ljava/util/ArrayList<",
            "Lfc/e;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Ljava/util/ArrayList<",
            "Lec/b;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Lvb/c;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lwb/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwb/g<",
            "Landroid/media/MediaFormat;",
            ">;"
        }
    .end annotation
.end field

.field public volatile h:D

.field public final i:Lvb/a$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lvb/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwb/e;

    invoke-direct {v1, v0}, Lwb/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lvb/a;->j:Lwb/e;

    return-void
.end method

.method public constructor <init>(Lvb/a$c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwb/g;

    invoke-direct {v0}, Lwb/g;-><init>()V

    iput-object v0, p0, Lvb/a;->b:Lwb/g;

    new-instance v0, Lwb/g;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v2}, Lwb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lvb/a;->c:Lwb/g;

    new-instance v0, Lwb/g;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v2}, Lwb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lvb/a;->d:Lwb/g;

    new-instance v0, Lwb/g;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v1}, Lwb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lvb/a;->e:Lwb/g;

    new-instance v0, Lwb/g;

    invoke-direct {v0}, Lwb/g;-><init>()V

    iput-object v0, p0, Lvb/a;->f:Lwb/g;

    new-instance v0, Lwb/g;

    invoke-direct {v0}, Lwb/g;-><init>()V

    iput-object v0, p0, Lvb/a;->g:Lwb/g;

    iput-object p1, p0, Lvb/a;->i:Lvb/a$c;

    return-void
.end method


# virtual methods
.method public final a(Lvb/d;)V
    .locals 3

    iget-object v0, p0, Lvb/a;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {v1, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfc/e;

    iget-object v2, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lac/b;

    invoke-interface {v1}, Lfc/e;->release()V

    invoke-interface {v2, p1}, Lac/b;->f(Lvb/d;)V

    iget-object v1, p0, Lvb/a;->e:Lwb/g;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lvb/d;Lbc/e;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvb/d;",
            "Lbc/e;",
            "Ljava/util/List<",
            "Lac/b;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lvb/c;->h:Lvb/c;

    new-instance v1, Landroid/media/MediaFormat;

    invoke-direct {v1}, Landroid/media/MediaFormat;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v2, Lvb/b;

    invoke-direct {v2}, Lvb/b;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lac/b;

    invoke-interface {v5, p1}, Lac/b;->e(Lvb/d;)Landroid/media/MediaFormat;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v2, v5, p1, v6}, Lvb/b;->h(Lac/b;Lvb/d;Landroid/media/MediaFormat;)Landroid/media/MediaFormat;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    if-ne v2, v4, :cond_2

    invoke-interface {p2, v3, v1}, Lbc/e;->a(Ljava/util/List;Landroid/media/MediaFormat;)Lvb/c;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getTrackFormat returned null for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " sources off "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_1
    iget-object p2, p0, Lvb/a;->g:Lwb/g;

    invoke-virtual {p2, p1, v1}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    iget-object p2, p0, Lvb/a;->a:Lzb/a;

    invoke-interface {p2, p1, v0}, Lzb/a;->a(Lvb/d;Lvb/c;)V

    iget-object p2, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {p2, p1, v0}, Lwb/g;->h(Lvb/d;Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Lvb/d;ILec/b;)Lec/b;
    .locals 2

    if-lez p2, :cond_0

    iget-object v0, p0, Lvb/a;->d:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lec/b;

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p2, p1, v0, v1}, Lec/b;->a(Lvb/d;J)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const-wide/16 p1, 0x0

    :goto_0
    new-instance v0, Lvb/a$a;

    invoke-direct {v0, p0, p1, p2, p3}, Lvb/a$a;-><init>(Lvb/a;JLec/b;)V

    return-object v0
.end method

.method public final d(Lvb/d;Lub/c;)Lfc/e;
    .locals 3

    iget-object v0, p0, Lvb/a;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {v1, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v1, v0, :cond_1

    iget-object v2, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {v2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfc/e;

    invoke-interface {v1}, Lfc/e;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lvb/a;->a(Lvb/d;)V

    invoke-virtual {p0, p1, p2}, Lvb/a;->d(Lvb/d;Lub/c;)Lfc/e;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {p2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfc/e;

    return-object p1

    :cond_1
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, p1, p2}, Lvb/a;->m(Lvb/d;Lub/c;)V

    iget-object p2, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {p2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfc/e;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "This should never happen. last:"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", current:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()J
    .locals 6

    invoke-virtual {p0}, Lvb/a;->k()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {v0}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/c;

    invoke-virtual {v0}, Lvb/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Lvb/a;->j()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {v3}, Lwb/g;->f()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvb/c;

    invoke-virtual {v3}, Lvb/c;->b()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    const-wide v2, 0x7fffffffffffffffL

    if-eqz v0, :cond_2

    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-virtual {p0, v0}, Lvb/a;->f(Lvb/d;)J

    move-result-wide v4

    goto :goto_2

    :cond_2
    move-wide v4, v2

    :goto_2
    if-eqz v1, :cond_3

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-virtual {p0, v0}, Lvb/a;->f(Lvb/d;)J

    move-result-wide v2

    :cond_3
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f(Lvb/d;)J
    .locals 6

    iget-object v0, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/c;

    invoke-virtual {v0}, Lvb/c;->b()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Lvb/a;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v4, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v4, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lac/b;

    if-ge v3, v0, :cond_1

    invoke-interface {v4}, Lac/b;->i()J

    move-result-wide v4

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Lac/b;->d()J

    move-result-wide v4

    :goto_1
    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-wide v1
.end method

.method public final g(Lvb/d;)D
    .locals 6

    iget-object v0, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/c;

    invoke-virtual {v0}, Lvb/c;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {p0, p1}, Lvb/a;->h(Lvb/d;)J

    move-result-wide v0

    invoke-virtual {p0}, Lvb/a;->e()J

    move-result-wide v2

    sget-object p1, Lvb/a;->j:Lwb/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getTrackProgress - readUs:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", totalUs:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lwb/e;->g(Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    const-wide/16 v2, 0x1

    :cond_1
    long-to-double v0, v0

    long-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public final h(Lvb/d;)J
    .locals 6

    iget-object v0, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvb/c;

    invoke-virtual {v0}, Lvb/c;->b()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Lvb/a;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v4, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v4, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lac/b;

    if-gt v3, v0, :cond_1

    invoke-interface {v4}, Lac/b;->i()J

    move-result-wide v4

    add-long/2addr v1, v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-wide v1
.end method

.method public final i()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lac/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v1}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v1}, Lwb/g;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v0}, Lwb/g;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v0}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final l(Lvb/d;)Z
    .locals 3

    iget-object v0, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lvb/a;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    if-ne v0, v2, :cond_1

    iget-object v2, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {v2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    if-ne v0, v2, :cond_1

    iget-object v2, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {v2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfc/e;

    invoke-interface {p1}, Lfc/e;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final m(Lvb/d;Lub/c;)V
    .locals 9

    iget-object v0, p0, Lvb/a;->e:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lvb/a;->f:Lwb/g;

    invoke-virtual {v1, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvb/c;

    iget-object v2, p0, Lvb/a;->b:Lwb/g;

    invoke-virtual {v2, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lac/b;

    invoke-virtual {v1}, Lvb/c;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v4, p1}, Lac/b;->g(Lvb/d;)V

    :cond_0
    invoke-virtual {p2}, Lub/c;->p()Lec/b;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v2}, Lvb/a;->c(Lvb/d;ILec/b;)Lec/b;

    move-result-object v6

    iget-object v0, p0, Lvb/a;->d:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lvb/a$b;->b:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    new-instance p2, Lfc/c;

    invoke-direct {p2}, Lfc/c;-><init>()V

    goto :goto_1

    :cond_1
    sget-object v0, Lvb/a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v1, :cond_3

    if-ne v0, v2, :cond_2

    new-instance v0, Lfc/a;

    iget-object v5, p0, Lvb/a;->a:Lzb/a;

    invoke-virtual {p2}, Lub/c;->m()Ldc/a;

    move-result-object v7

    invoke-virtual {p2}, Lub/c;->l()Lyb/a;

    move-result-object v8

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Lfc/a;-><init>(Lac/b;Lzb/a;Lec/b;Ldc/a;Lyb/a;)V

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance v0, Lfc/f;

    iget-object v1, p0, Lvb/a;->a:Lzb/a;

    invoke-virtual {p2}, Lub/c;->s()I

    move-result p2

    invoke-direct {v0, v4, v1, v6, p2}, Lfc/f;-><init>(Lac/b;Lzb/a;Lec/b;I)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_4
    new-instance p2, Lfc/d;

    iget-object v0, p0, Lvb/a;->a:Lzb/a;

    invoke-direct {p2, v4, v0, p1, v6}, Lfc/d;-><init>(Lac/b;Lzb/a;Lvb/d;Lec/b;)V

    :goto_1
    iget-object v0, p0, Lvb/a;->g:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/MediaFormat;

    invoke-interface {p2, v0}, Lfc/e;->b(Landroid/media/MediaFormat;)V

    iget-object v0, p0, Lvb/a;->c:Lwb/g;

    invoke-virtual {v0, p1}, Lwb/g;->e(Lvb/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final n(D)V
    .locals 1

    iput-wide p1, p0, Lvb/a;->h:D

    iget-object v0, p0, Lvb/a;->i:Lvb/a$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lvb/a$c;->a(D)V

    :cond_0
    return-void
.end method

.method public o(Lub/c;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-virtual/range {p1 .. p1}, Lub/c;->o()Lzb/a;

    move-result-object v2

    iput-object v2, v1, Lvb/a;->a:Lzb/a;

    iget-object v2, v1, Lvb/a;->b:Lwb/g;

    invoke-virtual/range {p1 .. p1}, Lub/c;->r()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwb/g;->j(Ljava/lang/Object;)V

    iget-object v2, v1, Lvb/a;->b:Lwb/g;

    invoke-virtual/range {p1 .. p1}, Lub/c;->k()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwb/g;->i(Ljava/lang/Object;)V

    iget-object v2, v1, Lvb/a;->a:Lzb/a;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lzb/a;->d(I)V

    invoke-virtual/range {p0 .. p0}, Lvb/a;->i()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lac/b;

    invoke-interface {v4}, Lac/b;->m()[D

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v2, v1, Lvb/a;->a:Lzb/a;

    aget-wide v6, v4, v3

    aget-wide v8, v4, v5

    invoke-interface {v2, v6, v7, v8, v9}, Lzb/a;->e(DD)V

    :cond_1
    sget-object v2, Lvb/d;->i:Lvb/d;

    invoke-virtual/range {p1 .. p1}, Lub/c;->n()Lbc/e;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lub/c;->k()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v1, v2, v4, v6}, Lvb/a;->b(Lvb/d;Lbc/e;Ljava/util/List;)V

    sget-object v2, Lvb/d;->h:Lvb/d;

    invoke-virtual/range {p1 .. p1}, Lub/c;->t()Lbc/e;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lub/c;->r()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v1, v2, v4, v6}, Lvb/a;->b(Lvb/d;Lbc/e;Ljava/util/List;)V

    iget-object v2, v1, Lvb/a;->f:Lwb/g;

    invoke-virtual {v2}, Lwb/g;->g()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvb/c;

    iget-object v4, v1, Lvb/a;->f:Lwb/g;

    invoke-virtual {v4}, Lwb/g;->f()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvb/c;

    invoke-virtual {v2}, Lvb/c;->b()Z

    move-result v6

    invoke-virtual {v4}, Lvb/c;->b()Z

    move-result v7

    if-eqz v7, :cond_2

    add-int/lit8 v6, v6, 0x1

    :cond_2
    sget-object v7, Lvb/a;->j:Lwb/e;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Duration (us): "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Lvb/a;->e()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lwb/e;->g(Ljava/lang/String;)V

    invoke-virtual {v2}, Lvb/c;->b()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual/range {p1 .. p1}, Lub/c;->s()I

    move-result v7

    if-eqz v7, :cond_3

    move v7, v5

    goto :goto_0

    :cond_3
    move v7, v3

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lub/c;->q()Lhc/b;

    move-result-object v8

    invoke-interface {v8, v2, v4}, Lhc/b;->a(Lvb/c;Lvb/c;)Z

    move-result v2

    if-nez v2, :cond_5

    if-eqz v7, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lwb/h;

    const-string v2, "Validator returned false."

    invoke-direct {v0, v2}, Lwb/h;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_1
    move v2, v3

    move v4, v2

    const-wide/16 v9, 0x0

    :goto_2
    if-eqz v2, :cond_7

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    :try_start_0
    iget-object v0, v1, Lvb/a;->a:Lzb/a;

    invoke-interface {v0}, Lzb/a;->stop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Lvb/d;->h:Lvb/d;

    invoke-virtual {v1, v0}, Lvb/a;->a(Lvb/d;)V

    sget-object v0, Lvb/d;->i:Lvb/d;

    invoke-virtual {v1, v0}, Lvb/a;->a(Lvb/d;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    iget-object v0, v1, Lvb/a;->a:Lzb/a;

    invoke-interface {v0}, Lzb/a;->release()V

    return-void

    :cond_7
    :goto_3
    :try_start_2
    sget-object v2, Lvb/a;->j:Lwb/e;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "new step: "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lwb/e;->g(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v4

    if-nez v4, :cond_10

    invoke-virtual/range {p0 .. p0}, Lvb/a;->e()J

    move-result-wide v11

    const-wide/16 v13, 0x64

    add-long/2addr v11, v13

    sget-object v4, Lvb/d;->i:Lvb/d;

    invoke-virtual {v1, v4}, Lvb/a;->h(Lvb/d;)J

    move-result-wide v13

    cmp-long v13, v13, v11

    if-lez v13, :cond_8

    move v13, v5

    goto :goto_4

    :cond_8
    move v13, v3

    :goto_4
    sget-object v14, Lvb/d;->h:Lvb/d;

    invoke-virtual {v1, v14}, Lvb/a;->h(Lvb/d;)J

    move-result-wide v15

    cmp-long v11, v15, v11

    if-lez v11, :cond_9

    move v11, v5

    goto :goto_5

    :cond_9
    move v11, v3

    :goto_5
    invoke-virtual {v1, v4}, Lvb/a;->l(Lvb/d;)Z

    move-result v12

    invoke-virtual {v1, v14}, Lvb/a;->l(Lvb/d;)Z

    move-result v15

    const/16 v16, 0x0

    if-eqz v12, :cond_a

    move-object/from16 v5, v16

    goto :goto_6

    :cond_a
    invoke-virtual {v1, v4, v0}, Lvb/a;->d(Lvb/d;Lub/c;)Lfc/e;

    move-result-object v17

    move-object/from16 v5, v17

    :goto_6
    if-eqz v15, :cond_b

    :goto_7
    move-object/from16 v7, v16

    goto :goto_8

    :cond_b
    invoke-virtual {v1, v14, v0}, Lvb/a;->d(Lvb/d;Lub/c;)Lfc/e;

    move-result-object v16

    goto :goto_7

    :goto_8
    if-nez v12, :cond_c

    invoke-interface {v5, v13}, Lfc/e;->c(Z)Z

    move-result v5

    or-int/2addr v5, v3

    goto :goto_9

    :cond_c
    move v5, v3

    :goto_9
    if-nez v15, :cond_d

    invoke-interface {v7, v11}, Lfc/e;->c(Z)Z

    move-result v7

    or-int/2addr v5, v7

    :cond_d
    const-wide/16 v7, 0x1

    add-long/2addr v9, v7

    const-wide/16 v7, 0xa

    rem-long v16, v9, v7

    const-wide/16 v18, 0x0

    cmp-long v11, v16, v18

    if-nez v11, :cond_e

    invoke-virtual {v1, v4}, Lvb/a;->g(Lvb/d;)D

    move-result-wide v3

    invoke-virtual {v1, v14}, Lvb/a;->g(Lvb/d;)D

    move-result-wide v13

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "progress - video:"

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, " audio:"

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lwb/e;->g(Ljava/lang/String;)V

    add-double/2addr v13, v3

    int-to-double v2, v6

    div-double/2addr v13, v2

    invoke-virtual {v1, v13, v14}, Lvb/a;->n(D)V

    :cond_e
    if-nez v5, :cond_f

    const-wide/16 v2, 0xa

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    :cond_f
    move v2, v12

    move v4, v15

    const/4 v3, 0x0

    const/4 v5, 0x1

    goto/16 :goto_2

    :cond_10
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_3
    sget-object v2, Lvb/d;->h:Lvb/d;

    invoke-virtual {v1, v2}, Lvb/a;->a(Lvb/d;)V

    sget-object v2, Lvb/d;->i:Lvb/d;

    invoke-virtual {v1, v2}, Lvb/a;->a(Lvb/d;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    iget-object v2, v1, Lvb/a;->a:Lzb/a;

    invoke-interface {v2}, Lzb/a;->release()V

    throw v0
.end method
