.class public final Ls3/u1$l$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1$l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/net/Uri;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ls3/u1$l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls3/u1$l;->a:Landroid/net/Uri;

    iput-object v0, p0, Ls3/u1$l$a;->a:Landroid/net/Uri;

    iget-object v0, p1, Ls3/u1$l;->b:Ljava/lang/String;

    iput-object v0, p0, Ls3/u1$l$a;->b:Ljava/lang/String;

    iget-object v0, p1, Ls3/u1$l;->c:Ljava/lang/String;

    iput-object v0, p0, Ls3/u1$l$a;->c:Ljava/lang/String;

    iget v0, p1, Ls3/u1$l;->d:I

    iput v0, p0, Ls3/u1$l$a;->d:I

    iget v0, p1, Ls3/u1$l;->e:I

    iput v0, p0, Ls3/u1$l$a;->e:I

    iget-object v0, p1, Ls3/u1$l;->f:Ljava/lang/String;

    iput-object v0, p0, Ls3/u1$l$a;->f:Ljava/lang/String;

    iget-object p1, p1, Ls3/u1$l;->g:Ljava/lang/String;

    iput-object p1, p0, Ls3/u1$l$a;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$l;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$l$a;-><init>(Ls3/u1$l;)V

    return-void
.end method

.method public static synthetic a(Ls3/u1$l$a;)Ls3/u1$k;
    .locals 0

    invoke-virtual {p0}, Ls3/u1$l$a;->i()Ls3/u1$k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ls3/u1$l$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Ls3/u1$l$a;->a:Landroid/net/Uri;

    return-object p0
.end method

.method public static synthetic c(Ls3/u1$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/u1$l$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic d(Ls3/u1$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/u1$l$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic e(Ls3/u1$l$a;)I
    .locals 0

    iget p0, p0, Ls3/u1$l$a;->d:I

    return p0
.end method

.method public static synthetic f(Ls3/u1$l$a;)I
    .locals 0

    iget p0, p0, Ls3/u1$l$a;->e:I

    return p0
.end method

.method public static synthetic g(Ls3/u1$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/u1$l$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic h(Ls3/u1$l$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ls3/u1$l$a;->g:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final i()Ls3/u1$k;
    .locals 2

    new-instance v0, Ls3/u1$k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/u1$k;-><init>(Ls3/u1$l$a;Ls3/u1$a;)V

    return-object v0
.end method
