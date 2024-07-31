.class public final Lre/y$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public A:I

.field public a:Lre/o;

.field public b:Ljava/net/Proxy;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/l;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/w;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lre/s$b;

.field public h:Ljava/net/ProxySelector;

.field public i:Lre/n;

.field public j:Lte/d;

.field public k:Ljavax/net/SocketFactory;

.field public l:Ljavax/net/ssl/SSLSocketFactory;

.field public m:Laf/c;

.field public n:Ljavax/net/ssl/HostnameVerifier;

.field public o:Lre/g;

.field public p:Lre/c;

.field public q:Lre/c;

.field public r:Lre/k;

.field public s:Lre/q;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lre/y$b;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lre/y$b;->f:Ljava/util/List;

    new-instance v0, Lre/o;

    invoke-direct {v0}, Lre/o;-><init>()V

    iput-object v0, p0, Lre/y$b;->a:Lre/o;

    sget-object v0, Lre/y;->I:Ljava/util/List;

    iput-object v0, p0, Lre/y$b;->c:Ljava/util/List;

    sget-object v0, Lre/y;->J:Ljava/util/List;

    iput-object v0, p0, Lre/y$b;->d:Ljava/util/List;

    sget-object v0, Lre/s;->a:Lre/s;

    invoke-static {v0}, Lre/s;->l(Lre/s;)Lre/s$b;

    move-result-object v0

    iput-object v0, p0, Lre/y$b;->g:Lre/s$b;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Lre/y$b;->h:Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    new-instance v0, Lze/a;

    invoke-direct {v0}, Lze/a;-><init>()V

    iput-object v0, p0, Lre/y$b;->h:Ljava/net/ProxySelector;

    :cond_0
    sget-object v0, Lre/n;->a:Lre/n;

    iput-object v0, p0, Lre/y$b;->i:Lre/n;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Lre/y$b;->k:Ljavax/net/SocketFactory;

    sget-object v0, Laf/d;->a:Laf/d;

    iput-object v0, p0, Lre/y$b;->n:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Lre/g;->c:Lre/g;

    iput-object v0, p0, Lre/y$b;->o:Lre/g;

    sget-object v0, Lre/c;->a:Lre/c;

    iput-object v0, p0, Lre/y$b;->p:Lre/c;

    iput-object v0, p0, Lre/y$b;->q:Lre/c;

    new-instance v0, Lre/k;

    invoke-direct {v0}, Lre/k;-><init>()V

    iput-object v0, p0, Lre/y$b;->r:Lre/k;

    sget-object v0, Lre/q;->a:Lre/q;

    iput-object v0, p0, Lre/y$b;->s:Lre/q;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lre/y$b;->t:Z

    iput-boolean v0, p0, Lre/y$b;->u:Z

    iput-boolean v0, p0, Lre/y$b;->v:Z

    const/4 v0, 0x0

    iput v0, p0, Lre/y$b;->w:I

    const/16 v1, 0x2710

    iput v1, p0, Lre/y$b;->x:I

    iput v1, p0, Lre/y$b;->y:I

    iput v1, p0, Lre/y$b;->z:I

    iput v0, p0, Lre/y$b;->A:I

    return-void
.end method


# virtual methods
.method public a()Lre/y;
    .locals 1

    new-instance v0, Lre/y;

    invoke-direct {v0, p0}, Lre/y;-><init>(Lre/y$b;)V

    return-object v0
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)Lre/y$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lse/e;->d(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lre/y$b;->x:I

    return-object p0
.end method

.method public c(JLjava/util/concurrent/TimeUnit;)Lre/y$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lse/e;->d(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lre/y$b;->y:I

    return-object p0
.end method

.method public d(JLjava/util/concurrent/TimeUnit;)Lre/y$b;
    .locals 1

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lse/e;->d(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lre/y$b;->z:I

    return-object p0
.end method
