.class public final Lc7/m9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Ljava/net/URL;

.field public final i:[B

.field public final j:Lc7/j9;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:Lc7/k9;


# direct methods
.method public constructor <init>(Lc7/k9;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lc7/j9;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/net/URL;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc7/j9;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lc7/m9;->m:Lc7/k9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Lc7/m9;->h:Ljava/net/URL;

    const/4 p1, 0x0

    iput-object p1, p0, Lc7/m9;->i:[B

    iput-object p6, p0, Lc7/m9;->j:Lc7/j9;

    iput-object p2, p0, Lc7/m9;->k:Ljava/lang/String;

    iput-object p1, p0, Lc7/m9;->l:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final synthetic a(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 6

    iget-object v0, p0, Lc7/m9;->j:Lc7/j9;

    iget-object v1, p0, Lc7/m9;->k:Ljava/lang/String;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v0 .. v5}, Lc7/j9;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method

.method public final b(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Exception;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lc7/m9;->m:Lc7/k9;

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    new-instance v7, Lc7/l9;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lc7/l9;-><init>(Lc7/m9;ILjava/lang/Exception;[BLjava/util/Map;)V

    invoke-virtual {v0, v7}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/m9;->m:Lc7/k9;

    invoke-virtual {v0}, Lc7/j7;->g()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lc7/m9;->h:Ljava/net/URL;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzcd;->zza()Lcom/google/android/gms/internal/measurement/zzcd;

    move-result-object v3

    const-string v4, "client-measurement"

    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/internal/measurement/zzcd;->zza(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;

    move-result-object v2

    instance-of v3, v2, Ljava/net/HttpURLConnection;

    if-eqz v3, :cond_0

    check-cast v2, Ljava/net/HttpURLConnection;

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setDefaultUseCaches(Z)V

    const v3, 0xea60

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const v3, 0xee48

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v4, p0, Lc7/m9;->m:Lc7/k9;

    invoke-static {v4, v2}, Lc7/k9;->p(Lc7/k9;Ljava/net/HttpURLConnection;)[B

    move-result-object v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    invoke-virtual {p0, v0, v1, v4, v3}, Lc7/m9;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void

    :catchall_0
    move-exception v4

    goto :goto_0

    :catch_0
    move-exception v4

    goto :goto_1

    :catchall_1
    move-exception v4

    move-object v3, v1

    goto :goto_0

    :catch_1
    move-exception v4

    move-object v3, v1

    goto :goto_1

    :cond_0
    :try_start_3
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Failed to obtain HTTP connection"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v4

    move-object v2, v1

    move-object v3, v2

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    invoke-virtual {p0, v0, v1, v1, v3}, Lc7/m9;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    throw v4

    :catch_2
    move-exception v4

    move-object v2, v1

    move-object v3, v2

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    invoke-virtual {p0, v0, v4, v1, v3}, Lc7/m9;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
