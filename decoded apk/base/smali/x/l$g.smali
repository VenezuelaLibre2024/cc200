.class public Lx/l$g;
.super Lx/l$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$g$c;,
        Lx/l$g$b;,
        Lx/l$g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/l$j;-><init>()V

    return-void
.end method

.method public static z(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx/l$a;",
            ">;)",
            "Ljava/util/List<",
            "Lx/l$a;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx/l$a;

    invoke-virtual {v1}, Lx/l$a;->l()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public b(Lx/k;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {}, Lx/l$g$c;->a()Landroid/app/Notification$DecoratedCustomViewStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lx/l$g$b;->a(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    :cond_0
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"

    return-object v0
.end method

.method public s(Lx/k;)Landroid/widget/RemoteViews;
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    const/16 v1, 0x18

    if-lt p1, v1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {p1}, Lx/l$e;->d()Landroid/widget/RemoteViews;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {p1}, Lx/l$e;->f()Landroid/widget/RemoteViews;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_2

    return-object v0

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lx/l$g;->x(Landroid/widget/RemoteViews;Z)Landroid/widget/RemoteViews;

    move-result-object p1

    return-object p1
.end method

.method public t(Lx/k;)Landroid/widget/RemoteViews;
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    const/16 v1, 0x18

    if-lt p1, v1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {p1}, Lx/l$e;->f()Landroid/widget/RemoteViews;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object p1, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {p1}, Lx/l$e;->f()Landroid/widget/RemoteViews;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lx/l$g;->x(Landroid/widget/RemoteViews;Z)Landroid/widget/RemoteViews;

    move-result-object p1

    return-object p1
.end method

.method public u(Lx/k;)Landroid/widget/RemoteViews;
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x0

    const/16 v1, 0x18

    if-lt p1, v1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {p1}, Lx/l$e;->h()Landroid/widget/RemoteViews;

    move-result-object p1

    if-eqz p1, :cond_1

    move-object v1, p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {v1}, Lx/l$e;->f()Landroid/widget/RemoteViews;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_2

    return-object v0

    :cond_2
    const/4 p1, 0x1

    invoke-virtual {p0, v1, p1}, Lx/l$g;->x(Landroid/widget/RemoteViews;Z)Landroid/widget/RemoteViews;

    move-result-object p1

    return-object p1
.end method

.method public final x(Landroid/widget/RemoteViews;Z)Landroid/widget/RemoteViews;
    .locals 7

    sget v0, Lw/g;->c:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lx/l$j;->c(ZIZ)Landroid/widget/RemoteViews;

    move-result-object v0

    sget v3, Lw/e;->L:I

    invoke-virtual {v0, v3}, Landroid/widget/RemoteViews;->removeAllViews(I)V

    iget-object v3, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v3, v3, Lx/l$e;->b:Ljava/util/ArrayList;

    invoke-static {v3}, Lx/l$g;->z(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    if-eqz p2, :cond_0

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p2

    const/4 v4, 0x3

    invoke-static {p2, v4}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-lez p2, :cond_0

    move v4, v2

    :goto_0
    if-ge v4, p2, :cond_1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx/l$a;

    invoke-virtual {p0, v5}, Lx/l$g;->y(Lx/l$a;)Landroid/widget/RemoteViews;

    move-result-object v5

    sget v6, Lw/e;->L:I

    invoke-virtual {v0, v6, v5}, Landroid/widget/RemoteViews;->addView(ILandroid/widget/RemoteViews;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    sget p2, Lw/e;->L:I

    invoke-virtual {v0, p2, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    sget p2, Lw/e;->I:I

    invoke-virtual {v0, p2, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    invoke-virtual {p0, v0, p1}, Lx/l$j;->d(Landroid/widget/RemoteViews;Landroid/widget/RemoteViews;)V

    return-object v0
.end method

.method public final y(Lx/l$a;)Landroid/widget/RemoteViews;
    .locals 5

    iget-object v0, p1, Lx/l$a;->k:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Landroid/widget/RemoteViews;

    iget-object v2, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v2, v2, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_1

    sget v3, Lw/g;->b:I

    goto :goto_1

    :cond_1
    sget v3, Lw/g;->a:I

    :goto_1
    invoke-direct {v1, v2, v3}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lx/l$a;->f()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    if-eqz v2, :cond_2

    sget v3, Lw/e;->J:I

    sget v4, Lw/b;->c:I

    invoke-virtual {p0, v2, v4}, Lx/l$j;->m(Landroidx/core/graphics/drawable/IconCompat;I)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    :cond_2
    sget v2, Lw/e;->K:I

    iget-object v3, p1, Lx/l$a;->j:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    if-nez v0, :cond_3

    sget v0, Lw/e;->H:I

    iget-object v2, p1, Lx/l$a;->k:Landroid/app/PendingIntent;

    invoke-virtual {v1, v0, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-lt v0, v2, :cond_4

    sget v0, Lw/e;->H:I

    iget-object p1, p1, Lx/l$a;->j:Ljava/lang/CharSequence;

    invoke-static {v1, v0, p1}, Lx/l$g$a;->a(Landroid/widget/RemoteViews;ILjava/lang/CharSequence;)V

    :cond_4
    return-object v1
.end method
