.class public Lx/l$b;
.super Lx/l$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$b$a;,
        Lx/l$b$c;,
        Lx/l$b$b;
    }
.end annotation


# instance fields
.field public e:Landroidx/core/graphics/drawable/IconCompat;

.field public f:Landroidx/core/graphics/drawable/IconCompat;

.field public g:Z

.field public h:Ljava/lang/CharSequence;

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/l$j;-><init>()V

    return-void
.end method

.method public static A(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "android.picture"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lx/l$b;->x(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v0, "android.pictureIcon"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    invoke-static {p0}, Lx/l$b;->x(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static x(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 2

    if-eqz p0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    instance-of v0, p0, Landroid/graphics/drawable/Icon;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/Icon;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-static {p0}, Landroidx/core/graphics/drawable/IconCompat;->g(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public B(Ljava/lang/CharSequence;)Lx/l$b;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$j;->b:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public C(Ljava/lang/CharSequence;)Lx/l$b;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$j;->c:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx/l$j;->d:Z

    return-object p0
.end method

.method public b(Lx/k;)V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_9

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-static {v1}, Lx/l$b$a;->b(Landroid/app/Notification$Builder;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v1

    iget-object v2, p0, Lx/l$j;->b:Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Lx/l$b$a;->c(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v1

    iget-object v2, p0, Lx/l$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v3, 0x1

    const/16 v4, 0x1f

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-lt v0, v4, :cond_1

    instance-of v2, p1, Lx/m;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lx/m;

    invoke-virtual {v2}, Lx/m;->f()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    iget-object v6, p0, Lx/l$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {v6, v2}, Landroidx/core/graphics/drawable/IconCompat;->z(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    invoke-static {v1, v2}, Lx/l$b$c;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->q()I

    move-result v2

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lx/l$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->m()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v1, v2}, Lx/l$b$a;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v1

    :cond_2
    :goto_1
    iget-boolean v2, p0, Lx/l$b;->g:Z

    if-eqz v2, :cond_7

    iget-object v2, p0, Lx/l$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v2, :cond_4

    :cond_3
    invoke-static {v1, v5}, Lx/l$b$a;->d(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_4
    const/16 v6, 0x17

    if-lt v0, v6, :cond_6

    instance-of v2, p1, Lx/m;

    if-eqz v2, :cond_5

    check-cast p1, Lx/m;

    invoke-virtual {p1}, Lx/m;->f()Landroid/content/Context;

    move-result-object v5

    :cond_5
    iget-object p1, p0, Lx/l$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1, v5}, Landroidx/core/graphics/drawable/IconCompat;->z(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v1, p1}, Lx/l$b$b;->a(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/drawable/Icon;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->q()I

    move-result p1

    if-ne p1, v3, :cond_3

    iget-object p1, p0, Lx/l$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->m()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {v1, p1}, Lx/l$b$a;->d(Landroid/app/Notification$BigPictureStyle;Landroid/graphics/Bitmap;)V

    :cond_7
    :goto_2
    iget-boolean p1, p0, Lx/l$j;->d:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Lx/l$j;->c:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Lx/l$b$a;->e(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    :cond_8
    if-lt v0, v4, :cond_9

    iget-boolean p1, p0, Lx/l$b;->i:Z

    invoke-static {v1, p1}, Lx/l$b$c;->c(Landroid/app/Notification$BigPictureStyle;Z)V

    iget-object p1, p0, Lx/l$b;->h:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Lx/l$b$c;->b(Landroid/app/Notification$BigPictureStyle;Ljava/lang/CharSequence;)V

    :cond_9
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$BigPictureStyle"

    return-object v0
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lx/l$j;->v(Landroid/os/Bundle;)V

    const-string v0, "android.largeIcon.big"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lx/l$b;->x(Landroid/os/Parcelable;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, Lx/l$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx/l$b;->g:Z

    :cond_0
    invoke-static {p1}, Lx/l$b;->A(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, Lx/l$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    const-string v0, "android.showBigPictureWhenCollapsed"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lx/l$b;->i:Z

    return-void
.end method

.method public y(Landroid/graphics/Bitmap;)Lx/l$b;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->g(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lx/l$b;->f:Landroidx/core/graphics/drawable/IconCompat;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx/l$b;->g:Z

    return-object p0
.end method

.method public z(Landroid/graphics/Bitmap;)Lx/l$b;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->g(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lx/l$b;->e:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method
