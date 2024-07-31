.class public Lre/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/y$b;
    }
.end annotation


# static fields
.field public static final I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:Z

.field public final D:I

.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final h:Lre/o;

.field public final i:Ljava/net/Proxy;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/l;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lre/s$b;

.field public final o:Ljava/net/ProxySelector;

.field public final p:Lre/n;

.field public final q:Lte/d;

.field public final r:Ljavax/net/SocketFactory;

.field public final s:Ljavax/net/ssl/SSLSocketFactory;

.field public final t:Laf/c;

.field public final u:Ljavax/net/ssl/HostnameVerifier;

.field public final v:Lre/g;

.field public final w:Lre/c;

.field public final x:Lre/c;

.field public final y:Lre/k;

.field public final z:Lre/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lre/z;

    sget-object v2, Lre/z;->l:Lre/z;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lre/z;->j:Lre/z;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lse/e;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lre/y;->I:Ljava/util/List;

    new-array v0, v0, [Lre/l;

    sget-object v1, Lre/l;->h:Lre/l;

    aput-object v1, v0, v3

    sget-object v1, Lre/l;->j:Lre/l;

    aput-object v1, v0, v4

    invoke-static {v0}, Lse/e;->t([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lre/y;->J:Ljava/util/List;

    new-instance v0, Lre/y$a;

    invoke-direct {v0}, Lre/y$a;-><init>()V

    sput-object v0, Lse/a;->a:Lse/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lre/y$b;

    invoke-direct {v0}, Lre/y$b;-><init>()V

    invoke-direct {p0, v0}, Lre/y;-><init>(Lre/y$b;)V

    return-void
.end method

.method public constructor <init>(Lre/y$b;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lre/y$b;->a:Lre/o;

    iput-object v0, p0, Lre/y;->h:Lre/o;

    iget-object v0, p1, Lre/y$b;->b:Ljava/net/Proxy;

    iput-object v0, p0, Lre/y;->i:Ljava/net/Proxy;

    iget-object v0, p1, Lre/y$b;->c:Ljava/util/List;

    iput-object v0, p0, Lre/y;->j:Ljava/util/List;

    iget-object v0, p1, Lre/y$b;->d:Ljava/util/List;

    iput-object v0, p0, Lre/y;->k:Ljava/util/List;

    iget-object v1, p1, Lre/y$b;->e:Ljava/util/List;

    invoke-static {v1}, Lse/e;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lre/y;->l:Ljava/util/List;

    iget-object v1, p1, Lre/y$b;->f:Ljava/util/List;

    invoke-static {v1}, Lse/e;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lre/y;->m:Ljava/util/List;

    iget-object v1, p1, Lre/y$b;->g:Lre/s$b;

    iput-object v1, p0, Lre/y;->n:Lre/s$b;

    iget-object v1, p1, Lre/y$b;->h:Ljava/net/ProxySelector;

    iput-object v1, p0, Lre/y;->o:Ljava/net/ProxySelector;

    iget-object v1, p1, Lre/y$b;->i:Lre/n;

    iput-object v1, p0, Lre/y;->p:Lre/n;

    iget-object v1, p1, Lre/y$b;->j:Lte/d;

    iput-object v1, p0, Lre/y;->q:Lte/d;

    iget-object v1, p1, Lre/y$b;->k:Ljavax/net/SocketFactory;

    iput-object v1, p0, Lre/y;->r:Ljavax/net/SocketFactory;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/l;

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lre/l;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lre/y$b;->l:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_4

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Lse/e;->C()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    invoke-static {v0}, Lre/y;->u(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Lre/y;->s:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Laf/c;->b(Ljavax/net/ssl/X509TrustManager;)Laf/c;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    iput-object v0, p0, Lre/y;->s:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Lre/y$b;->m:Laf/c;

    :goto_2
    iput-object v0, p0, Lre/y;->t:Laf/c;

    iget-object v0, p0, Lre/y;->s:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v0

    iget-object v1, p0, Lre/y;->s:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {v0, v1}, Lye/f;->f(Ljavax/net/ssl/SSLSocketFactory;)V

    :cond_5
    iget-object v0, p1, Lre/y$b;->n:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lre/y;->u:Ljavax/net/ssl/HostnameVerifier;

    iget-object v0, p1, Lre/y$b;->o:Lre/g;

    iget-object v1, p0, Lre/y;->t:Laf/c;

    invoke-virtual {v0, v1}, Lre/g;->f(Laf/c;)Lre/g;

    move-result-object v0

    iput-object v0, p0, Lre/y;->v:Lre/g;

    iget-object v0, p1, Lre/y$b;->p:Lre/c;

    iput-object v0, p0, Lre/y;->w:Lre/c;

    iget-object v0, p1, Lre/y$b;->q:Lre/c;

    iput-object v0, p0, Lre/y;->x:Lre/c;

    iget-object v0, p1, Lre/y$b;->r:Lre/k;

    iput-object v0, p0, Lre/y;->y:Lre/k;

    iget-object v0, p1, Lre/y$b;->s:Lre/q;

    iput-object v0, p0, Lre/y;->z:Lre/q;

    iget-boolean v0, p1, Lre/y$b;->t:Z

    iput-boolean v0, p0, Lre/y;->A:Z

    iget-boolean v0, p1, Lre/y$b;->u:Z

    iput-boolean v0, p0, Lre/y;->B:Z

    iget-boolean v0, p1, Lre/y$b;->v:Z

    iput-boolean v0, p0, Lre/y;->C:Z

    iget v0, p1, Lre/y$b;->w:I

    iput v0, p0, Lre/y;->D:I

    iget v0, p1, Lre/y$b;->x:I

    iput v0, p0, Lre/y;->E:I

    iget v0, p1, Lre/y$b;->y:I

    iput v0, p0, Lre/y;->F:I

    iget v0, p1, Lre/y$b;->z:I

    iput v0, p0, Lre/y;->G:I

    iget p1, p1, Lre/y$b;->A:I

    iput p1, p0, Lre/y;->H:I

    iget-object p1, p0, Lre/y;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lre/y;->m:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null network interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/y;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Null interceptor: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/y;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static u(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    :try_start_0
    invoke-static {}, Lye/f;->l()Lye/f;

    move-result-object v0

    invoke-virtual {v0}, Lye/f;->m()Ljavax/net/ssl/SSLContext;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    invoke-virtual {v0, p0, v1, p0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "No System TLS"

    invoke-direct {v0, v1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lre/y;->F:I

    return v0
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lre/y;->C:Z

    return v0
.end method

.method public C()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, Lre/y;->r:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public D()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, Lre/y;->s:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public F()I
    .locals 1

    iget v0, p0, Lre/y;->G:I

    return v0
.end method

.method public b()Lre/c;
    .locals 1

    iget-object v0, p0, Lre/y;->x:Lre/c;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lre/y;->D:I

    return v0
.end method

.method public e()Lre/g;
    .locals 1

    iget-object v0, p0, Lre/y;->v:Lre/g;

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lre/y;->E:I

    return v0
.end method

.method public g()Lre/k;
    .locals 1

    iget-object v0, p0, Lre/y;->y:Lre/k;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lre/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lre/y;->k:Ljava/util/List;

    return-object v0
.end method

.method public i()Lre/n;
    .locals 1

    iget-object v0, p0, Lre/y;->p:Lre/n;

    return-object v0
.end method

.method public k()Lre/o;
    .locals 1

    iget-object v0, p0, Lre/y;->h:Lre/o;

    return-object v0
.end method

.method public l()Lre/q;
    .locals 1

    iget-object v0, p0, Lre/y;->z:Lre/q;

    return-object v0
.end method

.method public m()Lre/s$b;
    .locals 1

    iget-object v0, p0, Lre/y;->n:Lre/s$b;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lre/y;->B:Z

    return v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lre/y;->A:Z

    return v0
.end method

.method public p()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, Lre/y;->u:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lre/y;->l:Ljava/util/List;

    return-object v0
.end method

.method public r()Lte/d;
    .locals 1

    iget-object v0, p0, Lre/y;->q:Lte/d;

    return-object v0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lre/y;->m:Ljava/util/List;

    return-object v0
.end method

.method public t(Lre/b0;)Lre/e;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lre/a0;->h(Lre/y;Lre/b0;Z)Lre/a0;

    move-result-object p1

    return-object p1
.end method

.method public v()I
    .locals 1

    iget v0, p0, Lre/y;->H:I

    return v0
.end method

.method public w()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lre/z;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lre/y;->j:Ljava/util/List;

    return-object v0
.end method

.method public x()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, Lre/y;->i:Ljava/net/Proxy;

    return-object v0
.end method

.method public y()Lre/c;
    .locals 1

    iget-object v0, p0, Lre/y;->w:Lre/c;

    return-object v0
.end method

.method public z()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, Lre/y;->o:Ljava/net/ProxySelector;

    return-object v0
.end method
