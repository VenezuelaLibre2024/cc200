.class public final Ls3/u1$f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/UUID;

.field public b:Landroid/net/Uri;

.field public c:Li7/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/v<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:[B


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Li7/v;->j()Li7/v;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$f$a;->c:Li7/v;

    invoke-static {}, Li7/u;->u()Li7/u;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$f$a;->g:Li7/u;

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0}, Ls3/u1$f$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Ls3/u1$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls3/u1$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Ls3/u1$f$a;->a:Ljava/util/UUID;

    iget-object v0, p1, Ls3/u1$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Ls3/u1$f$a;->b:Landroid/net/Uri;

    iget-object v0, p1, Ls3/u1$f;->e:Li7/v;

    iput-object v0, p0, Ls3/u1$f$a;->c:Li7/v;

    iget-boolean v0, p1, Ls3/u1$f;->f:Z

    iput-boolean v0, p0, Ls3/u1$f$a;->d:Z

    iget-boolean v0, p1, Ls3/u1$f;->g:Z

    iput-boolean v0, p0, Ls3/u1$f$a;->e:Z

    iget-boolean v0, p1, Ls3/u1$f;->h:Z

    iput-boolean v0, p0, Ls3/u1$f$a;->f:Z

    iget-object v0, p1, Ls3/u1$f;->j:Li7/u;

    iput-object v0, p0, Ls3/u1$f$a;->g:Li7/u;

    invoke-static {p1}, Ls3/u1$f;->a(Ls3/u1$f;)[B

    move-result-object p1

    iput-object p1, p0, Ls3/u1$f$a;->h:[B

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$f;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$f$a;-><init>(Ls3/u1$f;)V

    return-void
.end method

.method public static synthetic a(Ls3/u1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/u1$f$a;->d:Z

    return p0
.end method

.method public static synthetic b(Ls3/u1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/u1$f$a;->e:Z

    return p0
.end method

.method public static synthetic c(Ls3/u1$f$a;)Li7/u;
    .locals 0

    iget-object p0, p0, Ls3/u1$f$a;->g:Li7/u;

    return-object p0
.end method

.method public static synthetic d(Ls3/u1$f$a;)[B
    .locals 0

    iget-object p0, p0, Ls3/u1$f$a;->h:[B

    return-object p0
.end method

.method public static synthetic e(Ls3/u1$f$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Ls3/u1$f$a;->b:Landroid/net/Uri;

    return-object p0
.end method

.method public static synthetic f(Ls3/u1$f$a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Ls3/u1$f$a;->a:Ljava/util/UUID;

    return-object p0
.end method

.method public static synthetic g(Ls3/u1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/u1$f$a;->f:Z

    return p0
.end method

.method public static synthetic h(Ls3/u1$f$a;)Li7/v;
    .locals 0

    iget-object p0, p0, Ls3/u1$f$a;->c:Li7/v;

    return-object p0
.end method


# virtual methods
.method public i()Ls3/u1$f;
    .locals 2

    new-instance v0, Ls3/u1$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/u1$f;-><init>(Ls3/u1$f$a;Ls3/u1$a;)V

    return-object v0
.end method
