.class public final Lue/e;
.super Lxe/f$j;
.source ""

# interfaces
.implements Lre/j;


# instance fields
.field public final b:Lue/g;

.field public final c:Lre/f0;

.field public d:Ljava/net/Socket;

.field public e:Ljava/net/Socket;

.field public f:Lre/t;

.field public g:Lre/z;

.field public h:Lxe/f;

.field public i:Lbf/e;

.field public j:Lbf/d;

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lue/k;",
            ">;>;"
        }
    .end annotation
.end field

.field public q:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lue/g;Lre/f0;)V
    .locals 2

    invoke-direct {p0}, Lxe/f$j;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lue/e;->o:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lue/e;->p:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lue/e;->q:J

    iput-object p1, p0, Lue/e;->b:Lue/g;

    iput-object p2, p0, Lue/e;->c:Lre/f0;

    return-void
.end method


# virtual methods
.method public a(Lxe/f;)V
    .locals 1

    iget-object v0, p0, Lue/e;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lxe/f;->e0()I

    move-result p1

    iput p1, p0, Lue/e;->o:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lxe/i;)V
    .locals 2

    sget-object v0, Lxe/b;->m:Lxe/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lxe/i;->d(Lxe/b;Ljava/io/IOException;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lue/e;->d:Ljava/net/Socket;

    invoke-static {v0}, Lse/e;->g(Ljava/net/Socket;)V

    return-void
.end method

.method public d(IIIIZLre/e;Lre/s;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    iget-object v0, v7, Lue/e;->g:Lre/z;

    if-nez v0, :cond_b

    iget-object v0, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->b()Ljava/util/List;

    move-result-object v0

    new-instance v10, Lue/b;

    invoke-direct {v10, v0}, Lue/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, Lre/l;->j:Lre/l;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lye/f;->q(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lue/i;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lue/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, Lue/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lue/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lre/z;->m:Lre/z;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    :goto_1
    :try_start_0
    iget-object v0, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-virtual/range {v1 .. v6}, Lue/e;->g(IIILre/e;Lre/s;)V

    iget-object v0, v7, Lue/e;->d:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v13, p1

    move/from16 v14, p2

    goto :goto_2

    :cond_4
    move/from16 v13, p1

    move/from16 v14, p2

    :try_start_1
    invoke-virtual {v7, v13, v14, v8, v9}, Lue/e;->e(IILre/e;Lre/s;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move/from16 v15, p4

    :try_start_2
    invoke-virtual {v7, v10, v15, v8, v9}, Lue/e;->j(Lue/b;ILre/e;Lre/s;)V

    iget-object v0, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Lue/e;->g:Lre/z;

    invoke-virtual {v9, v8, v0, v1, v2}, Lre/s;->e(Lre/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lre/z;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    iget-object v0, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, Lue/e;->d:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Too many tunnel connections attempted: 21"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    new-instance v1, Lue/i;

    invoke-direct {v1, v0}, Lue/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_6
    :goto_4
    iget-object v0, v7, Lue/e;->h:Lxe/f;

    if-eqz v0, :cond_7

    iget-object v1, v7, Lue/e;->b:Lue/g;

    monitor-enter v1

    :try_start_3
    iget-object v0, v7, Lue/e;->h:Lxe/f;

    invoke-virtual {v0}, Lxe/f;->e0()I

    move-result v0

    iput v0, v7, Lue/e;->o:I

    monitor-exit v1

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_7
    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v13, p1

    move/from16 v14, p2

    :goto_6
    move/from16 v15, p4

    :goto_7
    iget-object v1, v7, Lue/e;->e:Ljava/net/Socket;

    invoke-static {v1}, Lse/e;->g(Ljava/net/Socket;)V

    iget-object v1, v7, Lue/e;->d:Ljava/net/Socket;

    invoke-static {v1}, Lse/e;->g(Ljava/net/Socket;)V

    iput-object v11, v7, Lue/e;->e:Ljava/net/Socket;

    iput-object v11, v7, Lue/e;->d:Ljava/net/Socket;

    iput-object v11, v7, Lue/e;->i:Lbf/e;

    iput-object v11, v7, Lue/e;->j:Lbf/d;

    iput-object v11, v7, Lue/e;->f:Lre/t;

    iput-object v11, v7, Lue/e;->g:Lre/z;

    iput-object v11, v7, Lue/e;->h:Lxe/f;

    iget-object v1, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lre/s;->f(Lre/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lre/z;Ljava/io/IOException;)V

    if-nez v12, :cond_8

    new-instance v12, Lue/i;

    invoke-direct {v12, v0}, Lue/i;-><init>(Ljava/io/IOException;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v12, v0}, Lue/i;->a(Ljava/io/IOException;)V

    :goto_8
    if-eqz p5, :cond_9

    invoke-virtual {v10, v0}, Lue/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_1

    :cond_9
    throw v12

    :cond_a
    new-instance v0, Lue/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lue/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(IILre/e;Lre/s;)V
    .locals 4

    iget-object v0, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v0

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lre/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lue/e;->d:Ljava/net/Socket;

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {p4, p3, v1, v0}, Lre/s;->g(Lre/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    iget-object p3, p0, Lue/e;->d:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object p2

    iget-object p3, p0, Lue/e;->d:Ljava/net/Socket;

    iget-object p4, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {p4}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p2, p3, p4, p1}, Lye/f;->h(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object p1, p0, Lue/e;->d:Ljava/net/Socket;

    invoke-static {p1}, Lbf/l;->i(Ljava/net/Socket;)Lbf/t;

    move-result-object p1

    invoke-static {p1}, Lbf/l;->b(Lbf/t;)Lbf/e;

    move-result-object p1

    iput-object p1, p0, Lue/e;->i:Lbf/e;

    iget-object p1, p0, Lue/e;->d:Ljava/net/Socket;

    invoke-static {p1}, Lbf/l;->f(Ljava/net/Socket;)Lbf/s;

    move-result-object p1

    invoke-static {p1}, Lbf/l;->a(Lbf/s;)Lbf/d;

    move-result-object p1

    iput-object p1, p0, Lue/e;->j:Lbf/d;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {p4}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final f(Lue/b;)V
    .locals 7

    iget-object v0, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lue/e;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v4

    invoke-virtual {v4}, Lre/v;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v5

    invoke-virtual {v5}, Lre/v;->w()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Lue/b;->a(Ljavax/net/ssl/SSLSocket;)Lre/l;

    move-result-object p1

    invoke-virtual {p1}, Lre/l;->f()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v3

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v4

    invoke-virtual {v4}, Lre/v;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lre/a;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Lye/f;->g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    invoke-static {v3}, Lre/t;->b(Ljavax/net/ssl/SSLSession;)Lre/t;

    move-result-object v4

    invoke-virtual {v0}, Lre/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v6

    invoke-virtual {v6}, Lre/v;->l()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lre/t;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "Hostname "

    if-nez v2, :cond_1

    const/4 v2, 0x0

    :try_start_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lre/g;->c(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Laf/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Lre/a;->a()Lre/g;

    move-result-object v3

    invoke-virtual {v0}, Lre/a;->l()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lre/t;->d()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Lre/g;->a(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p1}, Lre/l;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lye/f;->n(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    iput-object v1, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-static {v1}, Lbf/l;->i(Ljava/net/Socket;)Lbf/t;

    move-result-object p1

    invoke-static {p1}, Lbf/l;->b(Lbf/t;)Lbf/e;

    move-result-object p1

    iput-object p1, p0, Lue/e;->i:Lbf/e;

    iget-object p1, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-static {p1}, Lbf/l;->f(Ljava/net/Socket;)Lbf/s;

    move-result-object p1

    invoke-static {p1}, Lbf/l;->a(Lbf/s;)Lbf/d;

    move-result-object p1

    iput-object p1, p0, Lue/e;->j:Lbf/d;

    iput-object v4, p0, Lue/e;->f:Lre/t;

    if-eqz v2, :cond_4

    invoke-static {v2}, Lre/z;->b(Ljava/lang/String;)Lre/z;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p1, Lre/z;->j:Lre/z;

    :goto_0
    iput-object p1, p0, Lue/e;->g:Lre/z;
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Lye/f;->a(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    :goto_1
    :try_start_3
    invoke-static {p1}, Lse/e;->z(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_5
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz v2, :cond_6

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v0

    invoke-virtual {v0, v2}, Lye/f;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_6
    invoke-static {v2}, Lse/e;->g(Ljava/net/Socket;)V

    throw p1
.end method

.method public final g(IIILre/e;Lre/s;)V
    .locals 6

    invoke-virtual {p0}, Lue/e;->i()Lre/b0;

    move-result-object v0

    invoke-virtual {v0}, Lre/b0;->h()Lre/v;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    invoke-virtual {p0, p1, p2, p4, p5}, Lue/e;->e(IILre/e;Lre/s;)V

    invoke-virtual {p0, p2, p3, v0, v1}, Lue/e;->h(IILre/b0;Lre/v;)Lre/b0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lue/e;->d:Ljava/net/Socket;

    invoke-static {v3}, Lse/e;->g(Ljava/net/Socket;)V

    const/4 v3, 0x0

    iput-object v3, p0, Lue/e;->d:Ljava/net/Socket;

    iput-object v3, p0, Lue/e;->j:Lbf/d;

    iput-object v3, p0, Lue/e;->i:Lbf/e;

    iget-object v4, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v4}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v5}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Lre/s;->e(Lre/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lre/z;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final h(IILre/b0;Lre/v;)Lre/b0;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Lse/e;->r(Lre/v;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_0
    new-instance v0, Lwe/a;

    iget-object v1, p0, Lue/e;->i:Lbf/e;

    iget-object v2, p0, Lue/e;->j:Lbf/d;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lwe/a;-><init>(Lre/y;Lue/e;Lbf/e;Lbf/d;)V

    iget-object v1, p0, Lue/e;->i:Lbf/e;

    invoke-interface {v1}, Lbf/t;->c()Lbf/u;

    move-result-object v1

    int-to-long v4, p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Lbf/u;->g(JLjava/util/concurrent/TimeUnit;)Lbf/u;

    iget-object v1, p0, Lue/e;->j:Lbf/d;

    invoke-interface {v1}, Lbf/s;->c()Lbf/u;

    move-result-object v1

    int-to-long v4, p2

    invoke-virtual {v1, v4, v5, v2}, Lbf/u;->g(JLjava/util/concurrent/TimeUnit;)Lbf/u;

    invoke-virtual {p3}, Lre/b0;->d()Lre/u;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Lwe/a;->B(Lre/u;Ljava/lang/String;)V

    invoke-virtual {v0}, Lwe/a;->a()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lwe/a;->d(Z)Lre/d0$a;

    move-result-object v1

    invoke-virtual {v1, p3}, Lre/d0$a;->q(Lre/b0;)Lre/d0$a;

    move-result-object p3

    invoke-virtual {p3}, Lre/d0$a;->c()Lre/d0;

    move-result-object p3

    invoke-virtual {v0, p3}, Lwe/a;->A(Lre/d0;)V

    invoke-virtual {p3}, Lre/d0;->f()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_3

    const/16 v1, 0x197

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->h()Lre/c;

    move-result-object v0

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-interface {v0, v1, p3}, Lre/c;->a(Lre/f0;Lre/d0;)Lre/b0;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Connection"

    invoke-virtual {p3, v1}, Lre/d0;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "close"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected response code for CONNECT: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lre/d0;->f()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, p0, Lue/e;->i:Lbf/e;

    invoke-interface {p1}, Lbf/e;->A()Lbf/c;

    move-result-object p1

    invoke-virtual {p1}, Lbf/c;->B()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lue/e;->j:Lbf/d;

    invoke-interface {p1}, Lbf/d;->b()Lbf/c;

    move-result-object p1

    invoke-virtual {p1}, Lbf/c;->B()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v3

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()Lre/b0;
    .locals 4

    new-instance v0, Lre/b0$a;

    invoke-direct {v0}, Lre/b0$a;-><init>()V

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lre/b0$a;->h(Lre/v;)Lre/b0$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lre/b0$a;->e(Ljava/lang/String;Lre/c0;)Lre/b0$a;

    move-result-object v0

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lse/e;->r(Lre/v;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    move-result-object v0

    invoke-static {}, Lse/f;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-virtual {v0, v2, v1}, Lre/b0$a;->c(Ljava/lang/String;Ljava/lang/String;)Lre/b0$a;

    move-result-object v0

    invoke-virtual {v0}, Lre/b0$a;->a()Lre/b0;

    move-result-object v0

    new-instance v1, Lre/d0$a;

    invoke-direct {v1}, Lre/d0$a;-><init>()V

    invoke-virtual {v1, v0}, Lre/d0$a;->q(Lre/b0;)Lre/d0$a;

    move-result-object v1

    sget-object v2, Lre/z;->j:Lre/z;

    invoke-virtual {v1, v2}, Lre/d0$a;->o(Lre/z;)Lre/d0$a;

    move-result-object v1

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, Lre/d0$a;->g(I)Lre/d0$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, Lre/d0$a;->l(Ljava/lang/String;)Lre/d0$a;

    move-result-object v1

    sget-object v2, Lse/e;->d:Lre/e0;

    invoke-virtual {v1, v2}, Lre/d0$a;->b(Lre/e0;)Lre/d0$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, Lre/d0$a;->r(J)Lre/d0$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Lre/d0$a;->p(J)Lre/d0$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, Lre/d0$a;->i(Ljava/lang/String;Ljava/lang/String;)Lre/d0$a;

    move-result-object v1

    invoke-virtual {v1}, Lre/d0$a;->c()Lre/d0;

    move-result-object v1

    iget-object v2, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v2}, Lre/f0;->a()Lre/a;

    move-result-object v2

    invoke-virtual {v2}, Lre/a;->h()Lre/c;

    move-result-object v2

    iget-object v3, p0, Lue/e;->c:Lre/f0;

    invoke-interface {v2, v3, v1}, Lre/c;->a(Lre/f0;Lre/d0;)Lre/b0;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method public final j(Lue/b;ILre/e;Lre/s;)V
    .locals 1

    iget-object v0, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v0}, Lre/f0;->a()Lre/a;

    move-result-object v0

    invoke-virtual {v0}, Lre/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {p1}, Lre/f0;->a()Lre/a;

    move-result-object p1

    invoke-virtual {p1}, Lre/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, Lre/z;->m:Lre/z;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lue/e;->d:Ljava/net/Socket;

    iput-object p1, p0, Lue/e;->e:Ljava/net/Socket;

    iput-object p3, p0, Lue/e;->g:Lre/z;

    invoke-virtual {p0, p2}, Lue/e;->t(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lue/e;->d:Ljava/net/Socket;

    iput-object p1, p0, Lue/e;->e:Ljava/net/Socket;

    sget-object p1, Lre/z;->j:Lre/z;

    iput-object p1, p0, Lue/e;->g:Lre/z;

    return-void

    :cond_1
    invoke-virtual {p4, p3}, Lre/s;->y(Lre/e;)V

    invoke-virtual {p0, p1}, Lue/e;->f(Lue/b;)V

    iget-object p1, p0, Lue/e;->f:Lre/t;

    invoke-virtual {p4, p3, p1}, Lre/s;->x(Lre/e;Lre/t;)V

    iget-object p1, p0, Lue/e;->g:Lre/z;

    sget-object p3, Lre/z;->l:Lre/z;

    if-ne p1, p3, :cond_2

    invoke-virtual {p0, p2}, Lue/e;->t(I)V

    :cond_2
    return-void
.end method

.method public k()Lre/t;
    .locals 1

    iget-object v0, p0, Lue/e;->f:Lre/t;

    return-object v0
.end method

.method public l(Lre/a;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lre/a;",
            "Ljava/util/List<",
            "Lre/f0;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lue/e;->p:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lue/e;->o:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_7

    iget-boolean v0, p0, Lue/e;->k:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lse/a;->a:Lse/a;

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lse/a;->e(Lre/a;Lre/a;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Lre/a;->l()Lre/v;

    move-result-object v0

    invoke-virtual {v0}, Lre/v;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lue/e;->q()Lre/f0;

    move-result-object v1

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-virtual {v1}, Lre/v;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lue/e;->h:Lxe/f;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-eqz p2, :cond_7

    invoke-virtual {p0, p2}, Lue/e;->r(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lre/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Laf/d;->a:Laf/d;

    if-eq p2, v0, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1}, Lre/a;->l()Lre/v;

    move-result-object p2

    invoke-virtual {p0, p2}, Lue/e;->u(Lre/v;)Z

    move-result p2

    if-nez p2, :cond_6

    return v2

    :cond_6
    :try_start_0
    invoke-virtual {p1}, Lre/a;->a()Lre/g;

    move-result-object p2

    invoke-virtual {p1}, Lre/a;->l()Lre/v;

    move-result-object p1

    invoke-virtual {p1}, Lre/v;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lue/e;->k()Lre/t;

    move-result-object v0

    invoke-virtual {v0}, Lre/t;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lre/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_7
    :goto_0
    return v2
.end method

.method public m(Z)Z
    .locals 4

    iget-object v0, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lue/e;->h:Lxe/f;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lxe/f;->c0(J)Z

    move-result p1

    return p1

    :cond_1
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    :try_start_0
    iget-object p1, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v2, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v2, p0, Lue/e;->i:Lbf/e;

    invoke-interface {v2}, Lbf/e;->B()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    :try_start_2
    iget-object v2, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_2
    iget-object v2, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v2, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v0

    :catchall_0
    move-exception v2

    iget-object v3, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v2
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v1

    :catch_1
    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lue/e;->h:Lxe/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(Lre/y;Lre/w$a;)Lve/c;
    .locals 4

    iget-object v0, p0, Lue/e;->h:Lxe/f;

    if-eqz v0, :cond_0

    new-instance v0, Lxe/g;

    iget-object v1, p0, Lue/e;->h:Lxe/f;

    invoke-direct {v0, p1, p0, p2, v1}, Lxe/g;-><init>(Lre/y;Lue/e;Lre/w$a;Lxe/f;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lue/e;->e:Ljava/net/Socket;

    invoke-interface {p2}, Lre/w$a;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, p0, Lue/e;->i:Lbf/e;

    invoke-interface {v0}, Lbf/t;->c()Lbf/u;

    move-result-object v0

    invoke-interface {p2}, Lre/w$a;->a()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lbf/u;->g(JLjava/util/concurrent/TimeUnit;)Lbf/u;

    iget-object v0, p0, Lue/e;->j:Lbf/d;

    invoke-interface {v0}, Lbf/s;->c()Lbf/u;

    move-result-object v0

    invoke-interface {p2}, Lre/w$a;->b()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2, v3}, Lbf/u;->g(JLjava/util/concurrent/TimeUnit;)Lbf/u;

    new-instance p2, Lwe/a;

    iget-object v0, p0, Lue/e;->i:Lbf/e;

    iget-object v1, p0, Lue/e;->j:Lbf/d;

    invoke-direct {p2, p1, p0, v0, v1}, Lwe/a;-><init>(Lre/y;Lue/e;Lbf/e;Lbf/d;)V

    return-object p2
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lue/e;->b:Lue/g;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lue/e;->k:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public q()Lre/f0;
    .locals 1

    iget-object v0, p0, Lue/e;->c:Lre/f0;

    return-object v0
.end method

.method public final r(Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lre/f0;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/f0;

    invoke-virtual {v3}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v4}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v4

    sget-object v5, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v4, v5, :cond_0

    iget-object v4, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v4}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    invoke-virtual {v3}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public s()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lue/e;->e:Ljava/net/Socket;

    return-object v0
.end method

.method public final t(I)V
    .locals 5

    iget-object v0, p0, Lue/e;->e:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v0, Lxe/f$h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lxe/f$h;-><init>(Z)V

    iget-object v1, p0, Lue/e;->e:Ljava/net/Socket;

    iget-object v2, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v2}, Lre/f0;->a()Lre/a;

    move-result-object v2

    invoke-virtual {v2}, Lre/a;->l()Lre/v;

    move-result-object v2

    invoke-virtual {v2}, Lre/v;->l()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lue/e;->i:Lbf/e;

    iget-object v4, p0, Lue/e;->j:Lbf/d;

    invoke-virtual {v0, v1, v2, v3, v4}, Lxe/f$h;->d(Ljava/net/Socket;Ljava/lang/String;Lbf/e;Lbf/d;)Lxe/f$h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lxe/f$h;->b(Lxe/f$j;)Lxe/f$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxe/f$h;->c(I)Lxe/f$h;

    move-result-object p1

    invoke-virtual {p1}, Lxe/f$h;->a()Lxe/f;

    move-result-object p1

    iput-object p1, p0, Lue/e;->h:Lxe/f;

    invoke-virtual {p1}, Lxe/f;->y0()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-virtual {v1}, Lre/v;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-virtual {v1}, Lre/v;->w()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue/e;->f:Lre/t;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lre/t;->a()Lre/i;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lue/e;->g:Lre/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Lre/v;)Z
    .locals 4

    invoke-virtual {p1}, Lre/v;->w()I

    move-result v0

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-virtual {v1}, Lre/v;->w()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, Lre/v;->l()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1}, Lre/f0;->a()Lre/a;

    move-result-object v1

    invoke-virtual {v1}, Lre/a;->l()Lre/v;

    move-result-object v1

    invoke-virtual {v1}, Lre/v;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lue/e;->f:Lre/t;

    if-eqz v0, :cond_1

    sget-object v0, Laf/d;->a:Laf/d;

    invoke-virtual {p1}, Lre/v;->l()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lue/e;->f:Lre/t;

    invoke-virtual {v3}, Lre/t;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, v3}, Laf/d;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v2, v1

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method public v(Ljava/io/IOException;)V
    .locals 4

    iget-object v0, p0, Lue/e;->b:Lue/g;

    monitor-enter v0

    :try_start_0
    instance-of v1, p1, Lxe/n;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    check-cast p1, Lxe/n;

    iget-object p1, p1, Lxe/n;->h:Lxe/b;

    sget-object v1, Lxe/b;->m:Lxe/b;

    if-ne p1, v1, :cond_0

    iget p1, p0, Lue/e;->n:I

    add-int/2addr p1, v2

    iput p1, p0, Lue/e;->n:I

    if-le p1, v2, :cond_4

    iput-boolean v2, p0, Lue/e;->k:Z

    iget p1, p0, Lue/e;->l:I

    :goto_0
    add-int/2addr p1, v2

    iput p1, p0, Lue/e;->l:I

    goto :goto_1

    :cond_0
    sget-object v1, Lxe/b;->n:Lxe/b;

    if-eq p1, v1, :cond_4

    iput-boolean v2, p0, Lue/e;->k:Z

    iget p1, p0, Lue/e;->l:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lue/e;->n()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Lxe/a;

    if-eqz v1, :cond_4

    :cond_2
    iput-boolean v2, p0, Lue/e;->k:Z

    iget v1, p0, Lue/e;->m:I

    if-nez v1, :cond_4

    if-eqz p1, :cond_3

    iget-object v1, p0, Lue/e;->b:Lue/g;

    iget-object v3, p0, Lue/e;->c:Lre/f0;

    invoke-virtual {v1, v3, p1}, Lue/g;->c(Lre/f0;Ljava/io/IOException;)V

    :cond_3
    iget p1, p0, Lue/e;->l:I

    goto :goto_0

    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
