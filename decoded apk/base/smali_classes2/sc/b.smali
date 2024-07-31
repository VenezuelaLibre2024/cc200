.class public Lsc/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/graphics/Bitmap$CompressFormat;

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lsc/c;

.field public h:Landroid/net/Uri;

.field public i:Landroid/net/Uri;


# direct methods
.method public constructor <init>(IILandroid/graphics/Bitmap$CompressFormat;ILjava/lang/String;Ljava/lang/String;Lsc/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsc/b;->a:I

    iput p2, p0, Lsc/b;->b:I

    iput-object p3, p0, Lsc/b;->c:Landroid/graphics/Bitmap$CompressFormat;

    iput p4, p0, Lsc/b;->d:I

    iput-object p5, p0, Lsc/b;->e:Ljava/lang/String;

    iput-object p6, p0, Lsc/b;->f:Ljava/lang/String;

    iput-object p7, p0, Lsc/b;->g:Lsc/c;

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Bitmap$CompressFormat;
    .locals 1

    iget-object v0, p0, Lsc/b;->c:Landroid/graphics/Bitmap$CompressFormat;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lsc/b;->d:I

    return v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lsc/b;->h:Landroid/net/Uri;

    return-object v0
.end method

.method public d()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lsc/b;->i:Landroid/net/Uri;

    return-object v0
.end method

.method public e()Lsc/c;
    .locals 1

    iget-object v0, p0, Lsc/b;->g:Lsc/c;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsc/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsc/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lsc/b;->a:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lsc/b;->b:I

    return v0
.end method

.method public j(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lsc/b;->h:Landroid/net/Uri;

    return-void
.end method

.method public k(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lsc/b;->i:Landroid/net/Uri;

    return-void
.end method
