.class public Lda/b$a;
.super Lda/a$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lda/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public c:Lx6/c$f;

.field public d:Lx6/c$g;

.field public e:Lx6/c$j;

.field public f:Lx6/c$k;

.field public g:Lx6/c$a;

.field public final synthetic h:Lda/b;


# direct methods
.method public constructor <init>(Lda/b;)V
    .locals 0

    iput-object p1, p0, Lda/b$a;->h:Lda/b;

    invoke-direct {p0, p1}, Lda/a$b;-><init>(Lda/a;)V

    return-void
.end method

.method public static synthetic d(Lda/b$a;)Lx6/c$a;
    .locals 0

    iget-object p0, p0, Lda/b$a;->g:Lx6/c$a;

    return-object p0
.end method

.method public static synthetic e(Lda/b$a;)Lx6/c$f;
    .locals 0

    iget-object p0, p0, Lda/b$a;->c:Lx6/c$f;

    return-object p0
.end method

.method public static synthetic f(Lda/b$a;)Lx6/c$g;
    .locals 0

    iget-object p0, p0, Lda/b$a;->d:Lx6/c$g;

    return-object p0
.end method

.method public static synthetic g(Lda/b$a;)Lx6/c$j;
    .locals 0

    iget-object p0, p0, Lda/b$a;->e:Lx6/c$j;

    return-object p0
.end method

.method public static synthetic h(Lda/b$a;)Lx6/c$k;
    .locals 0

    iget-object p0, p0, Lda/b$a;->f:Lx6/c$k;

    return-object p0
.end method


# virtual methods
.method public i(Lz6/n;)Lz6/m;
    .locals 1

    iget-object v0, p0, Lda/b$a;->h:Lda/b;

    iget-object v0, v0, Lda/a;->h:Lx6/c;

    invoke-virtual {v0, p1}, Lx6/c;->b(Lz6/n;)Lz6/m;

    move-result-object p1

    invoke-super {p0, p1}, Lda/a$b;->a(Ljava/lang/Object;)V

    return-object p1
.end method

.method public j(Lz6/m;)Z
    .locals 0

    invoke-super {p0, p1}, Lda/a$b;->c(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public k(Lx6/c$f;)V
    .locals 0

    iput-object p1, p0, Lda/b$a;->c:Lx6/c$f;

    return-void
.end method

.method public l(Lx6/c$g;)V
    .locals 0

    iput-object p1, p0, Lda/b$a;->d:Lx6/c$g;

    return-void
.end method

.method public m(Lx6/c$j;)V
    .locals 0

    iput-object p1, p0, Lda/b$a;->e:Lx6/c$j;

    return-void
.end method

.method public n(Lx6/c$k;)V
    .locals 0

    iput-object p1, p0, Lda/b$a;->f:Lx6/c$k;

    return-void
.end method
