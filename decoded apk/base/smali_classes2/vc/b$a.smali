.class public Lvc/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lrc/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/b;->p(Landroid/net/Uri;Landroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvc/b;


# direct methods
.method public constructor <init>(Lvc/b;)V
    .locals 0

    iput-object p1, p0, Lvc/b$a;->a:Lvc/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Lsc/c;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lvc/b$a;->a:Lvc/b;

    invoke-static {v0, p3}, Lvc/b;->c(Lvc/b;Landroid/net/Uri;)Landroid/net/Uri;

    iget-object v0, p0, Lvc/b$a;->a:Lvc/b;

    invoke-static {v0, p4}, Lvc/b;->d(Lvc/b;Landroid/net/Uri;)Landroid/net/Uri;

    iget-object v0, p0, Lvc/b$a;->a:Lvc/b;

    invoke-virtual {p3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Lvc/b;->e(Lvc/b;Ljava/lang/String;)Ljava/lang/String;

    iget-object p3, p0, Lvc/b$a;->a:Lvc/b;

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-static {p3, p4}, Lvc/b;->f(Lvc/b;Ljava/lang/String;)Ljava/lang/String;

    iget-object p3, p0, Lvc/b$a;->a:Lvc/b;

    invoke-static {p3, p2}, Lvc/b;->g(Lvc/b;Lsc/c;)Lsc/c;

    iget-object p2, p0, Lvc/b$a;->a:Lvc/b;

    const/4 p3, 0x1

    iput-boolean p3, p2, Lvc/b;->t:Z

    invoke-virtual {p2, p1}, Lvc/b;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "TransformImageView"

    const-string v1, "onFailure: setImageUri"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lvc/b$a;->a:Lvc/b;

    iget-object v0, v0, Lvc/b;->q:Lvc/b$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lvc/b$b;->c(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method
