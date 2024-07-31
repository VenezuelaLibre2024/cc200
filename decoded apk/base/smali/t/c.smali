.class public Lt/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ls/d$b;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/os/Bundle;

.field public e:Lt/a;

.field public f:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls/d$b;

    invoke-direct {v0}, Ls/d$b;-><init>()V

    iput-object v0, p0, Lt/c;->b:Ls/d$b;

    new-instance v0, Lt/a$a;

    invoke-direct {v0}, Lt/a$a;-><init>()V

    iput-object v0, p0, Lt/c;->e:Lt/a;

    const/4 v0, 0x0

    iput v0, p0, Lt/c;->f:I

    iput-object p1, p0, Lt/c;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public a(Ls/f;)Lt/b;
    .locals 3

    const-string v0, "CustomTabsSession is required for launching a TWA"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lt/c;->b:Ls/d$b;

    invoke-virtual {v0, p1}, Ls/d$b;->g(Ls/f;)Ls/d$b;

    iget-object p1, p0, Lt/c;->b:Ls/d$b;

    invoke-virtual {p1}, Ls/d$b;->b()Ls/d;

    move-result-object p1

    iget-object p1, p1, Ls/d;->a:Landroid/content/Intent;

    iget-object v0, p0, Lt/c;->a:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 v0, 0x1

    const-string v1, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lt/c;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lt/c;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_0
    iget-object v0, p0, Lt/c;->d:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const-string v1, "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lt/c;->e:Lt/a;

    invoke-interface {v1}, Lt/a;->a()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "androidx.browser.trusted.extra.DISPLAY_MODE"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    iget v1, p0, Lt/c;->f:I

    const-string v2, "androidx.browser.trusted.extra.SCREEN_ORIENTATION"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    new-instance v1, Lt/b;

    invoke-direct {v1, p1, v0}, Lt/b;-><init>(Landroid/content/Intent;Ljava/util/List;)V

    return-object v1
.end method

.method public b(Ljava/util/List;)Lt/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lt/c;"
        }
    .end annotation

    iput-object p1, p0, Lt/c;->c:Ljava/util/List;

    return-object p0
.end method

.method public c(Ls/a;)Lt/c;
    .locals 1

    iget-object v0, p0, Lt/c;->b:Ls/d$b;

    invoke-virtual {v0, p1}, Ls/d$b;->e(Ls/a;)Ls/d$b;

    return-object p0
.end method

.method public d(Lt/a;)Lt/c;
    .locals 0

    iput-object p1, p0, Lt/c;->e:Lt/a;

    return-object p0
.end method

.method public e(I)Lt/c;
    .locals 0

    iput p1, p0, Lt/c;->f:I

    return-object p0
.end method
