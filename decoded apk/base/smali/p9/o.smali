.class public Lp9/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp9/o$b;,
        Lp9/o$c;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lp9/f;

.field public c:Lp9/p;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Lp9/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:J

.field public k:Ljava/lang/String;

.field public l:Lp9/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public m:Lp9/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lp9/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lp9/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/o$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lp9/o$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp9/o$c<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp9/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->b:Lp9/f;

    iput-object v0, p0, Lp9/o;->c:Lp9/p;

    iput-object v0, p0, Lp9/o;->d:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v2

    iput-object v2, p0, Lp9/o;->f:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->g:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->h:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->i:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->k:Ljava/lang/String;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->l:Lp9/o$c;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->m:Lp9/o$c;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->n:Lp9/o$c;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->o:Lp9/o$c;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->p:Lp9/o$c;

    return-void
.end method

.method public constructor <init>(Lp9/o;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp9/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->b:Lp9/f;

    iput-object v0, p0, Lp9/o;->c:Lp9/p;

    iput-object v0, p0, Lp9/o;->d:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v2

    iput-object v2, p0, Lp9/o;->f:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->g:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->h:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->i:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->k:Ljava/lang/String;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->l:Lp9/o$c;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->m:Lp9/o$c;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->n:Lp9/o$c;

    invoke-static {v1}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->o:Lp9/o$c;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lp9/o$c;->c(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v0

    iput-object v0, p0, Lp9/o;->p:Lp9/o$c;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lp9/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->a:Ljava/lang/String;

    iget-object v0, p1, Lp9/o;->b:Lp9/f;

    iput-object v0, p0, Lp9/o;->b:Lp9/f;

    iget-object v0, p1, Lp9/o;->c:Lp9/p;

    iput-object v0, p0, Lp9/o;->c:Lp9/p;

    iget-object v0, p1, Lp9/o;->d:Ljava/lang/String;

    iput-object v0, p0, Lp9/o;->d:Ljava/lang/String;

    iget-object v0, p1, Lp9/o;->f:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->f:Lp9/o$c;

    iget-object v0, p1, Lp9/o;->l:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->l:Lp9/o$c;

    iget-object v0, p1, Lp9/o;->m:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->m:Lp9/o$c;

    iget-object v0, p1, Lp9/o;->n:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->n:Lp9/o$c;

    iget-object v0, p1, Lp9/o;->o:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->o:Lp9/o$c;

    iget-object v0, p1, Lp9/o;->p:Lp9/o$c;

    iput-object v0, p0, Lp9/o;->p:Lp9/o$c;

    if-eqz p2, :cond_0

    iget-object p2, p1, Lp9/o;->k:Ljava/lang/String;

    iput-object p2, p0, Lp9/o;->k:Ljava/lang/String;

    iget-wide v0, p1, Lp9/o;->j:J

    iput-wide v0, p0, Lp9/o;->j:J

    iget-object p2, p1, Lp9/o;->i:Ljava/lang/String;

    iput-object p2, p0, Lp9/o;->i:Ljava/lang/String;

    iget-object p2, p1, Lp9/o;->h:Ljava/lang/String;

    iput-object p2, p0, Lp9/o;->h:Ljava/lang/String;

    iget-object p2, p1, Lp9/o;->g:Ljava/lang/String;

    iput-object p2, p0, Lp9/o;->g:Ljava/lang/String;

    iget-object p1, p1, Lp9/o;->e:Ljava/lang/String;

    iput-object p1, p0, Lp9/o;->e:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lp9/o;ZLp9/o$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp9/o;-><init>(Lp9/o;Z)V

    return-void
.end method

.method public static synthetic a(Lp9/o;Lp9/o$c;)Lp9/o$c;
    .locals 0

    iput-object p1, p0, Lp9/o;->o:Lp9/o$c;

    return-object p1
.end method

.method public static synthetic b(Lp9/o;Lp9/p;)Lp9/p;
    .locals 0

    iput-object p1, p0, Lp9/o;->c:Lp9/p;

    return-object p1
.end method

.method public static synthetic c(Lp9/o;Lp9/o$c;)Lp9/o$c;
    .locals 0

    iput-object p1, p0, Lp9/o;->n:Lp9/o$c;

    return-object p1
.end method

.method public static synthetic d(Lp9/o;Lp9/o$c;)Lp9/o$c;
    .locals 0

    iput-object p1, p0, Lp9/o;->m:Lp9/o$c;

    return-object p1
.end method

.method public static synthetic e(Lp9/o;Lp9/o$c;)Lp9/o$c;
    .locals 0

    iput-object p1, p0, Lp9/o;->l:Lp9/o$c;

    return-object p1
.end method

.method public static synthetic f(Lp9/o;)Lp9/o$c;
    .locals 0

    iget-object p0, p0, Lp9/o;->p:Lp9/o$c;

    return-object p0
.end method

.method public static synthetic g(Lp9/o;Lp9/o$c;)Lp9/o$c;
    .locals 0

    iput-object p1, p0, Lp9/o;->p:Lp9/o$c;

    return-object p1
.end method

.method public static synthetic h(Lp9/o;Lp9/o$c;)Lp9/o$c;
    .locals 0

    iput-object p1, p0, Lp9/o;->f:Lp9/o$c;

    return-object p1
.end method

.method public static synthetic i(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->e:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic j(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->a:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic k(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->d:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic l(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->g:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic m(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->h:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic n(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->i:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic o(Lp9/o;J)J
    .locals 0

    iput-wide p1, p0, Lp9/o;->j:J

    return-wide p1
.end method

.method public static synthetic p(Lp9/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lp9/o;->k:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->e:Ljava/lang/String;

    return-object v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->k:Ljava/lang/String;

    return-object v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->g:Ljava/lang/String;

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lp9/o;->E()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public F()J
    .locals 2

    iget-wide v0, p0, Lp9/o;->j:J

    return-wide v0
.end method

.method public G()J
    .locals 2

    iget-object v0, p0, Lp9/o;->i:Ljava/lang/String;

    invoke-static {v0}, Lq9/i;->e(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public q()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lp9/o;->f:Lp9/o$c;

    invoke-virtual {v1}, Lp9/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lp9/o;->w()Ljava/lang/String;

    move-result-object v1

    const-string v2, "contentType"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lp9/o;->p:Lp9/o$c;

    invoke-virtual {v1}, Lp9/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lp9/o;->p:Lp9/o$c;

    invoke-virtual {v2}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v2, "metadata"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lp9/o;->l:Lp9/o$c;

    invoke-virtual {v1}, Lp9/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lp9/o;->s()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cacheControl"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lp9/o;->m:Lp9/o$c;

    invoke-virtual {v1}, Lp9/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lp9/o;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "contentDisposition"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lp9/o;->n:Lp9/o$c;

    invoke-virtual {v1}, Lp9/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lp9/o;->u()Ljava/lang/String;

    move-result-object v1

    const-string v2, "contentEncoding"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lp9/o;->o:Lp9/o$c;

    invoke-virtual {v1}, Lp9/o$c;->b()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lp9/o;->v()Ljava/lang/String;

    move-result-object v1

    const-string v2, "contentLanguage"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    return-object v1
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->d:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->l:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->m:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->n:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->o:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/o;->f:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public x()J
    .locals 2

    iget-object v0, p0, Lp9/o;->h:Ljava/lang/String;

    invoke-static {v0}, Lq9/i;->e(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public y(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lp9/o;->p:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public z()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp9/o;->p:Lp9/o$c;

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
