.class public Lp9/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ln7/g;

.field public final b:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Lx7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Lv7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/String;

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Lp8/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ln7/g;Ly8/b;Ly8/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln7/g;",
            "Ly8/b<",
            "Lx7/b;",
            ">;",
            "Ly8/b<",
            "Lv7/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x927c0

    iput-wide v0, p0, Lp9/f;->e:J

    const-wide/32 v2, 0xea60

    iput-wide v2, p0, Lp9/f;->f:J

    iput-wide v0, p0, Lp9/f;->g:J

    const-wide/32 v0, 0x1d4c0

    iput-wide v0, p0, Lp9/f;->h:J

    iput-object p1, p0, Lp9/f;->d:Ljava/lang/String;

    iput-object p2, p0, Lp9/f;->a:Ln7/g;

    iput-object p3, p0, Lp9/f;->b:Ly8/b;

    iput-object p4, p0, Lp9/f;->c:Ly8/b;

    if-eqz p4, :cond_0

    invoke-interface {p4}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p4}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/b;

    new-instance p2, Lp9/f$a;

    invoke-direct {p2, p0}, Lp9/f$a;-><init>(Lp9/f;)V

    invoke-interface {p1, p2}, Lv7/b;->b(Lv7/a;)V

    :cond_0
    return-void
.end method

.method public static f(Ln7/g;Ljava/lang/String;)Lp9/f;
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Null is not a valid value for the FirebaseApp."

    invoke-static {v2, v3}, Lh6/s;->b(ZLjava/lang/Object;)V

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v1, "Null is not a valid value for the Firebase Storage URL."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gs://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p0, p1}, Lq9/i;->d(Ln7/g;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {p0, v0}, Lp9/f;->g(Ln7/g;Landroid/net/Uri;)Lp9/f;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to parse url:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FirebaseStorage"

    invoke-static {v0, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The storage Uri could not be parsed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Please use a gs:// URL for your Firebase Storage bucket."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Ln7/g;Landroid/net/Uri;)Lp9/f;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The storage Uri cannot contain a path element."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    const-string p1, "Provided FirebaseApp must not be null."

    invoke-static {p0, p1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class p1, Lp9/g;

    invoke-virtual {p0, p1}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp9/g;

    const-string p1, "Firebase Storage component is not present."

    invoke-static {p0, p1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lp9/g;->a(Ljava/lang/String;)Lp9/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ln7/g;
    .locals 1

    iget-object v0, p0, Lp9/f;->a:Ln7/g;

    return-object v0
.end method

.method public b()Lv7/b;
    .locals 1

    iget-object v0, p0, Lp9/f;->c:Ly8/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c()Lx7/b;
    .locals 1

    iget-object v0, p0, Lp9/f;->b:Ly8/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp9/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lp8/a;
    .locals 1

    iget-object v0, p0, Lp9/f;->i:Lp8/a;

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lp9/f;->f:J

    return-wide v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lp9/f;->g:J

    return-wide v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lp9/f;->h:J

    return-wide v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Lp9/f;->e:J

    return-wide v0
.end method

.method public l()Lp9/p;
    .locals 2

    invoke-virtual {p0}, Lp9/f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "gs"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lp9/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp9/f;->m(Landroid/net/Uri;)Lp9/p;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FirebaseApp was not initialized with a bucket name."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(Landroid/net/Uri;)Lp9/p;
    .locals 2

    const-string v0, "uri must not be null"

    invoke-static {p1, v0}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp9/f;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "The supplied bucketname does not match the storage bucket of the current instance."

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    new-instance v0, Lp9/p;

    invoke-direct {v0, p1, p0}, Lp9/p;-><init>(Landroid/net/Uri;Lp9/f;)V

    return-object v0
.end method

.method public n(Ljava/lang/String;)Lp9/p;
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "location must not be null or empty"

    invoke-static {v0, v1}, Lh6/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gs://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp9/f;->l()Lp9/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp9/p;->c(Ljava/lang/String;)Lp9/p;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "location should not be a full URL."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o(J)V
    .locals 0

    iput-wide p1, p0, Lp9/f;->g:J

    return-void
.end method

.method public p(J)V
    .locals 0

    iput-wide p1, p0, Lp9/f;->h:J

    return-void
.end method

.method public q(J)V
    .locals 0

    iput-wide p1, p0, Lp9/f;->e:J

    return-void
.end method

.method public r(Ljava/lang/String;I)V
    .locals 1

    new-instance v0, Lp8/a;

    invoke-direct {v0, p1, p2}, Lp8/a;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lp9/f;->i:Lp8/a;

    return-void
.end method
