.class public final Lk0/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lk0/c$c;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v0, Lk0/c$b;

    invoke-direct {v0, p1, p2}, Lk0/c$b;-><init>(Landroid/content/ClipData;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lk0/c$d;

    invoke-direct {v0, p1, p2}, Lk0/c$d;-><init>(Landroid/content/ClipData;I)V

    :goto_0
    iput-object v0, p0, Lk0/c$a;->a:Lk0/c$c;

    return-void
.end method


# virtual methods
.method public a()Lk0/c;
    .locals 1

    iget-object v0, p0, Lk0/c$a;->a:Lk0/c$c;

    invoke-interface {v0}, Lk0/c$c;->a()Lk0/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)Lk0/c$a;
    .locals 1

    iget-object v0, p0, Lk0/c$a;->a:Lk0/c$c;

    invoke-interface {v0, p1}, Lk0/c$c;->b(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public c(I)Lk0/c$a;
    .locals 1

    iget-object v0, p0, Lk0/c$a;->a:Lk0/c$c;

    invoke-interface {v0, p1}, Lk0/c$c;->d(I)V

    return-object p0
.end method

.method public d(Landroid/net/Uri;)Lk0/c$a;
    .locals 1

    iget-object v0, p0, Lk0/c$a;->a:Lk0/c$c;

    invoke-interface {v0, p1}, Lk0/c$c;->c(Landroid/net/Uri;)V

    return-object p0
.end method
