.class public final Li7/k$g;
.super Li7/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/e<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field public i:I

.field public final synthetic j:Li7/k;


# direct methods
.method public constructor <init>(Li7/k;I)V
    .locals 0

    iput-object p1, p0, Li7/k$g;->j:Li7/k;

    invoke-direct {p0}, Li7/e;-><init>()V

    invoke-static {p1, p2}, Li7/k;->b(Li7/k;I)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Li7/k$g;->h:Ljava/lang/Object;

    iput p2, p0, Li7/k$g;->i:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Li7/k$g;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Li7/k$g;->j:Li7/k;

    invoke-virtual {v1}, Li7/k;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Li7/k$g;->h:Ljava/lang/Object;

    iget-object v1, p0, Li7/k$g;->j:Li7/k;

    iget v2, p0, Li7/k$g;->i:I

    invoke-static {v1, v2}, Li7/k;->b(Li7/k;I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Li7/k$g;->j:Li7/k;

    iget-object v1, p0, Li7/k$g;->h:Ljava/lang/Object;

    invoke-static {v0, v1}, Li7/k;->i(Li7/k;Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Li7/k$g;->i:I

    :cond_1
    return-void
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Li7/k$g;->h:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Li7/k$g;->j:Li7/k;

    invoke-virtual {v0}, Li7/k;->w()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Li7/k$g;->h:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li7/n0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Li7/k$g;->a()V

    iget v0, p0, Li7/k$g;->i:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Li7/n0;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Li7/k$g;->j:Li7/k;

    invoke-static {v1, v0}, Li7/k;->j(Li7/k;I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    iget-object v0, p0, Li7/k$g;->j:Li7/k;

    invoke-virtual {v0}, Li7/k;->w()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Li7/k$g;->h:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/n0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Li7/k$g;->a()V

    iget v0, p0, Li7/k$g;->i:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Li7/k$g;->j:Li7/k;

    iget-object v1, p0, Li7/k$g;->h:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Li7/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Li7/n0;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, Li7/k$g;->j:Li7/k;

    invoke-static {v1, v0}, Li7/k;->j(Li7/k;I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Li7/k$g;->j:Li7/k;

    iget v2, p0, Li7/k$g;->i:I

    invoke-static {v1, v2, p1}, Li7/k;->f(Li7/k;ILjava/lang/Object;)V

    return-object v0
.end method
