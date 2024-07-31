.class public Lp9/o$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lp9/o;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp9/o;

    invoke-direct {v0}, Lp9/o;-><init>()V

    iput-object v0, p0, Lp9/o$b;->a:Lp9/o;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp9/o;

    invoke-direct {v0}, Lp9/o;-><init>()V

    iput-object v0, p0, Lp9/o$b;->a:Lp9/o;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lp9/o$b;->c(Lorg/json/JSONObject;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp9/o$b;->b:Z

    :cond_0
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lp9/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lp9/o$b;-><init>(Lorg/json/JSONObject;)V

    iget-object p1, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {p1, p2}, Lp9/o;->b(Lp9/o;Lp9/p;)Lp9/p;

    return-void
.end method


# virtual methods
.method public a()Lp9/o;
    .locals 4

    new-instance v0, Lp9/o;

    iget-object v1, p0, Lp9/o$b;->a:Lp9/o;

    iget-boolean v2, p0, Lp9/o$b;->b:Z

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lp9/o;-><init>(Lp9/o;ZLp9/o$a;)V

    return-object v0
.end method

.method public final b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Lorg/json/JSONObject;)V
    .locals 4

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "generation"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->i(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->j(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "bucket"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->k(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "metageneration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->l(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "timeCreated"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->m(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "updated"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->n(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "size"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lp9/o;->o(Lp9/o;J)J

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    const-string v1, "md5Hash"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->p(Lp9/o;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lp9/o$b;->i(Ljava/lang/String;Ljava/lang/String;)Lp9/o$b;

    goto :goto_0

    :cond_0
    const-string v0, "contentType"

    invoke-virtual {p0, p1, v0}, Lp9/o$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lp9/o$b;->h(Ljava/lang/String;)Lp9/o$b;

    :cond_1
    const-string v0, "cacheControl"

    invoke-virtual {p0, p1, v0}, Lp9/o$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lp9/o$b;->d(Ljava/lang/String;)Lp9/o$b;

    :cond_2
    const-string v0, "contentDisposition"

    invoke-virtual {p0, p1, v0}, Lp9/o$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lp9/o$b;->e(Ljava/lang/String;)Lp9/o$b;

    :cond_3
    const-string v0, "contentEncoding"

    invoke-virtual {p0, p1, v0}, Lp9/o$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lp9/o$b;->f(Ljava/lang/String;)Lp9/o$b;

    :cond_4
    const-string v0, "contentLanguage"

    invoke-virtual {p0, p1, v0}, Lp9/o$b;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0, p1}, Lp9/o$b;->g(Ljava/lang/String;)Lp9/o$b;

    :cond_5
    return-void
.end method

.method public d(Ljava/lang/String;)Lp9/o$b;
    .locals 1

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {p1}, Lp9/o$c;->d(Ljava/lang/Object;)Lp9/o$c;

    move-result-object p1

    invoke-static {v0, p1}, Lp9/o;->e(Lp9/o;Lp9/o$c;)Lp9/o$c;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lp9/o$b;
    .locals 1

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {p1}, Lp9/o$c;->d(Ljava/lang/Object;)Lp9/o$c;

    move-result-object p1

    invoke-static {v0, p1}, Lp9/o;->d(Lp9/o;Lp9/o$c;)Lp9/o$c;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lp9/o$b;
    .locals 1

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {p1}, Lp9/o$c;->d(Ljava/lang/Object;)Lp9/o$c;

    move-result-object p1

    invoke-static {v0, p1}, Lp9/o;->c(Lp9/o;Lp9/o$c;)Lp9/o$c;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lp9/o$b;
    .locals 1

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {p1}, Lp9/o$c;->d(Ljava/lang/Object;)Lp9/o$c;

    move-result-object p1

    invoke-static {v0, p1}, Lp9/o;->a(Lp9/o;Lp9/o$c;)Lp9/o$c;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lp9/o$b;
    .locals 1

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {p1}, Lp9/o$c;->d(Ljava/lang/Object;)Lp9/o$c;

    move-result-object p1

    invoke-static {v0, p1}, Lp9/o;->h(Lp9/o;Lp9/o$c;)Lp9/o$c;

    return-object p0
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Lp9/o$b;
    .locals 2

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {v0}, Lp9/o;->f(Lp9/o;)Lp9/o$c;

    move-result-object v0

    invoke-virtual {v0}, Lp9/o$c;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Lp9/o$c;->d(Ljava/lang/Object;)Lp9/o$c;

    move-result-object v1

    invoke-static {v0, v1}, Lp9/o;->g(Lp9/o;Lp9/o$c;)Lp9/o$c;

    :cond_0
    iget-object v0, p0, Lp9/o$b;->a:Lp9/o;

    invoke-static {v0}, Lp9/o;->f(Lp9/o;)Lp9/o$c;

    move-result-object v0

    invoke-virtual {v0}, Lp9/o$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
