.class public Lx/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/m$h;,
        Lx/m$a;,
        Lx/m$b;,
        Lx/m$d;,
        Lx/m$e;,
        Lx/m$f;,
        Lx/m$c;,
        Lx/m$g;,
        Lx/m$i;,
        Lx/m$j;,
        Lx/m$k;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/Notification$Builder;

.field public final c:Lx/l$e;

.field public d:Landroid/widget/RemoteViews;

.field public e:Landroid/widget/RemoteViews;

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Landroid/os/Bundle;

.field public h:I

.field public i:Landroid/widget/RemoteViews;


# direct methods
.method public constructor <init>(Lx/l$e;)V
    .locals 13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/m;->f:Ljava/util/List;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lx/m;->g:Landroid/os/Bundle;

    iput-object p1, p0, Lx/m;->c:Lx/l$e;

    iget-object v0, p1, Lx/l$e;->a:Landroid/content/Context;

    iput-object v0, p0, Lx/m;->a:Landroid/content/Context;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    iget-object v3, p1, Lx/l$e;->L:Ljava/lang/String;

    invoke-static {v0, v3}, Lx/m$h;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    iget-object v3, p1, Lx/l$e;->a:Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v0, p1, Lx/l$e;->T:Landroid/app/Notification;

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-wide v4, v0, Landroid/app/Notification;->when:J

    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v0, Landroid/app/Notification;->icon:I

    iget v5, v0, Landroid/app/Notification;->iconLevel:I

    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    iget-object v5, p1, Lx/l$e;->i:Landroid/widget/RemoteViews;

    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v0, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v0, Landroid/app/Notification;->ledARGB:I

    iget v5, v0, Landroid/app/Notification;->ledOnMS:I

    iget v6, v0, Landroid/app/Notification;->ledOffMS:I

    invoke-virtual {v3, v4, v5, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v0, Landroid/app/Notification;->flags:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v7

    :goto_1
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v0, Landroid/app/Notification;->flags:I

    const/16 v8, 0x10

    and-int/2addr v4, v8

    if-eqz v4, :cond_3

    move v4, v6

    goto :goto_3

    :cond_3
    move v4, v7

    :goto_3
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, v0, Landroid/app/Notification;->defaults:I

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, Lx/l$e;->e:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, Lx/l$e;->f:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, Lx/l$e;->k:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, Lx/l$e;->g:Landroid/app/PendingIntent;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, Lx/l$e;->h:Landroid/app/PendingIntent;

    iget v9, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v9, v9, 0x80

    if-eqz v9, :cond_4

    move v9, v6

    goto :goto_4

    :cond_4
    move v9, v7

    :goto_4
    invoke-virtual {v3, v4, v9}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p1, Lx/l$e;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, p1, Lx/l$e;->l:I

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, p1, Lx/l$e;->u:I

    iget v9, p1, Lx/l$e;->v:I

    iget-boolean v10, p1, Lx/l$e;->w:Z

    invoke-virtual {v3, v4, v9, v10}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    const/16 v3, 0x15

    if-ge v1, v3, :cond_5

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v9, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v10, v0, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v4, v9, v10}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    :cond_5
    const/16 v4, 0x14

    if-lt v1, v8, :cond_c

    iget-object v1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->r:Ljava/lang/CharSequence;

    invoke-static {v1, v8}, Lx/m$a;->c(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-boolean v8, p1, Lx/l$e;->o:Z

    invoke-static {v1, v8}, Lx/m$a;->d(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v8, p1, Lx/l$e;->m:I

    invoke-static {v1, v8}, Lx/m$a;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v1, p1, Lx/l$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lx/l$a;

    invoke-virtual {p0, v8}, Lx/m;->b(Lx/l$a;)V

    goto :goto_5

    :cond_6
    iget-object v1, p1, Lx/l$e;->E:Landroid/os/Bundle;

    if-eqz v1, :cond_7

    iget-object v8, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-virtual {v8, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_b

    iget-boolean v1, p1, Lx/l$e;->A:Z

    if-eqz v1, :cond_8

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    const-string v8, "android.support.localOnly"

    invoke-virtual {v1, v8, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_8
    iget-object v1, p1, Lx/l$e;->x:Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v8, p0, Lx/m;->g:Landroid/os/Bundle;

    const-string v9, "android.support.groupKey"

    invoke-virtual {v8, v9, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v1, p1, Lx/l$e;->y:Z

    if-eqz v1, :cond_9

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    const-string v8, "android.support.isGroupSummary"

    goto :goto_6

    :cond_9
    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    const-string v8, "android.support.useSideChannel"

    :goto_6
    invoke-virtual {v1, v8, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_a
    iget-object v1, p1, Lx/l$e;->z:Ljava/lang/String;

    if-eqz v1, :cond_b

    iget-object v8, p0, Lx/m;->g:Landroid/os/Bundle;

    const-string v9, "android.support.sortKey"

    invoke-virtual {v8, v9, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    iget-object v1, p1, Lx/l$e;->I:Landroid/widget/RemoteViews;

    iput-object v1, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    iget-object v1, p1, Lx/l$e;->J:Landroid/widget/RemoteViews;

    iput-object v1, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    :cond_c
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x11

    if-lt v1, v8, :cond_d

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-boolean v9, p1, Lx/l$e;->n:Z

    invoke-static {v8, v9}, Lx/m$b;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    :cond_d
    const/16 v8, 0x13

    if-lt v1, v8, :cond_e

    if-ge v1, v3, :cond_e

    iget-object v8, p1, Lx/l$e;->c:Ljava/util/ArrayList;

    invoke-static {v8}, Lx/m;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    iget-object v9, p1, Lx/l$e;->W:Ljava/util/ArrayList;

    invoke-static {v8, v9}, Lx/m;->e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_e

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_e

    iget-object v9, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    new-array v10, v10, [Ljava/lang/String;

    invoke-interface {v8, v10}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/String;

    const-string v10, "android.people"

    invoke-virtual {v9, v10, v8}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_e
    if-lt v1, v4, :cond_f

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-boolean v8, p1, Lx/l$e;->A:Z

    invoke-static {v4, v8}, Lx/m$d;->i(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->x:Ljava/lang/String;

    invoke-static {v4, v8}, Lx/m$d;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->z:Ljava/lang/String;

    invoke-static {v4, v8}, Lx/m$d;->j(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-boolean v8, p1, Lx/l$e;->y:Z

    invoke-static {v4, v8}, Lx/m$d;->h(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget v4, p1, Lx/l$e;->P:I

    iput v4, p0, Lx/m;->h:I

    :cond_f
    const/16 v4, 0x1c

    if-lt v1, v3, :cond_14

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->D:Ljava/lang/String;

    invoke-static {v3, v8}, Lx/m$e;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget v8, p1, Lx/l$e;->F:I

    invoke-static {v3, v8}, Lx/m$e;->c(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget v8, p1, Lx/l$e;->G:I

    invoke-static {v3, v8}, Lx/m$e;->f(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->H:Landroid/app/Notification;

    invoke-static {v3, v8}, Lx/m$e;->d(Landroid/app/Notification$Builder;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget-object v9, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {v3, v8, v9}, Lx/m$e;->e(Landroid/app/Notification$Builder;Landroid/net/Uri;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    if-ge v1, v4, :cond_10

    iget-object v1, p1, Lx/l$e;->c:Ljava/util/ArrayList;

    invoke-static {v1}, Lx/m;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iget-object v3, p1, Lx/l$e;->W:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lx/m;->e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    goto :goto_7

    :cond_10
    iget-object v1, p1, Lx/l$e;->W:Ljava/util/ArrayList;

    :goto_7
    if-eqz v1, :cond_11

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_11

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, Lx/m$e;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    goto :goto_8

    :cond_11
    iget-object v1, p1, Lx/l$e;->K:Landroid/widget/RemoteViews;

    iput-object v1, p0, Lx/m;->i:Landroid/widget/RemoteViews;

    iget-object v1, p1, Lx/l$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_14

    invoke-virtual {p1}, Lx/l$e;->g()Landroid/os/Bundle;

    move-result-object v1

    const-string v3, "android.car.EXTENSIONS"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_12

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :cond_12
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    move v10, v7

    :goto_9
    iget-object v11, p1, Lx/l$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_13

    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v11

    iget-object v12, p1, Lx/l$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lx/l$a;

    invoke-static {v12}, Lx/n;->b(Lx/l$a;)Landroid/os/Bundle;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_13
    const-string v10, "invisible_actions"

    invoke-virtual {v1, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {p1}, Lx/l$e;->g()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v9, v3, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-virtual {v1, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v1, v3, :cond_15

    iget-object v3, p1, Lx/l$e;->V:Ljava/lang/Object;

    if-eqz v3, :cond_15

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, Lx/m$f;->b(Landroid/app/Notification$Builder;Ljava/lang/Object;)Landroid/app/Notification$Builder;

    :cond_15
    const/16 v3, 0x18

    if-lt v1, v3, :cond_18

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->E:Landroid/os/Bundle;

    invoke-static {v3, v8}, Lx/m$c;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    iget-object v3, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v8, p1, Lx/l$e;->t:[Ljava/lang/CharSequence;

    invoke-static {v3, v8}, Lx/m$g;->e(Landroid/app/Notification$Builder;[Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v3, p1, Lx/l$e;->I:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_16

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, Lx/m$g;->c(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_16
    iget-object v3, p1, Lx/l$e;->J:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_17

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, Lx/m$g;->b(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_17
    iget-object v3, p1, Lx/l$e;->K:Landroid/widget/RemoteViews;

    if-eqz v3, :cond_18

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v8, v3}, Lx/m$g;->d(Landroid/app/Notification$Builder;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    :cond_18
    const/4 v3, 0x0

    if-lt v1, v2, :cond_1a

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget v9, p1, Lx/l$e;->M:I

    invoke-static {v8, v9}, Lx/m$h;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v9, p1, Lx/l$e;->s:Ljava/lang/CharSequence;

    invoke-static {v8, v9}, Lx/m$h;->e(Landroid/app/Notification$Builder;Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v9, p1, Lx/l$e;->N:Ljava/lang/String;

    invoke-static {v8, v9}, Lx/m$h;->f(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-wide v9, p1, Lx/l$e;->O:J

    invoke-static {v8, v9, v10}, Lx/m$h;->g(Landroid/app/Notification$Builder;J)Landroid/app/Notification$Builder;

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget v9, p1, Lx/l$e;->P:I

    invoke-static {v8, v9}, Lx/m$h;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    iget-boolean v8, p1, Lx/l$e;->C:Z

    if-eqz v8, :cond_19

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-boolean v9, p1, Lx/l$e;->B:Z

    invoke-static {v8, v9}, Lx/m$h;->c(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    :cond_19
    iget-object v8, p1, Lx/l$e;->L:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1a

    iget-object v8, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v8, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v8

    invoke-virtual {v8, v7, v7, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v7

    invoke-virtual {v7, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    :cond_1a
    if-lt v1, v4, :cond_1b

    iget-object v1, p1, Lx/l$e;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx/r;

    iget-object v7, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v4}, Lx/r;->j()Landroid/app/Person;

    move-result-object v4

    invoke-static {v7, v4}, Lx/m$i;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_a

    :cond_1b
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v1, v4, :cond_1c

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-boolean v7, p1, Lx/l$e;->R:Z

    invoke-static {v4, v7}, Lx/m$j;->a(Landroid/app/Notification$Builder;Z)Landroid/app/Notification$Builder;

    iget-object v4, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v7, p1, Lx/l$e;->S:Lx/l$d;

    invoke-static {v7}, Lx/l$d;->a(Lx/l$d;)Landroid/app/Notification$BubbleMetadata;

    move-result-object v7

    invoke-static {v4, v7}, Lx/m$j;->b(Landroid/app/Notification$Builder;Landroid/app/Notification$BubbleMetadata;)Landroid/app/Notification$Builder;

    :cond_1c
    const/16 v4, 0x1f

    if-lt v1, v4, :cond_1d

    iget v4, p1, Lx/l$e;->Q:I

    if-eqz v4, :cond_1d

    iget-object v7, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v7, v4}, Lx/m$k;->b(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_1d
    iget-boolean p1, p1, Lx/l$e;->U:Z

    if-eqz p1, :cond_20

    iget-object p1, p0, Lx/m;->c:Lx/l$e;

    iget-boolean p1, p1, Lx/l$e;->y:Z

    if-eqz p1, :cond_1e

    iput v5, p0, Lx/m;->h:I

    goto :goto_b

    :cond_1e
    iput v6, p0, Lx/m;->h:I

    :goto_b
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    iget p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, -0x2

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, -0x3

    iput p1, v0, Landroid/app/Notification;->defaults:I

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    if-lt v1, v2, :cond_20

    iget-object p1, p0, Lx/m;->c:Lx/l$e;

    iget-object p1, p1, Lx/l$e;->x:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1f

    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    const-string v0, "silent"

    invoke-static {p1, v0}, Lx/m$d;->g(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_1f
    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget v0, p0, Lx/m;->h:I

    invoke-static {p1, v0}, Lx/m$h;->d(Landroid/app/Notification$Builder;I)Landroid/app/Notification$Builder;

    :cond_20
    return-void
.end method

.method public static e(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Lu/b;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Lu/b;-><init>(I)V

    invoke-virtual {v0, p0}, Lu/b;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p1}, Lu/b;->addAll(Ljava/util/Collection;)Z

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public static g(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx/r;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx/r;

    invoke-virtual {v1}, Lx/r;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()Landroid/app/Notification$Builder;
    .locals 1

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public final b(Lx/l$a;)V
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_9

    invoke-virtual {p1}, Lx/l$a;->f()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    const/16 v2, 0x17

    const/4 v3, 0x0

    if-lt v0, v2, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->y()Landroid/graphics/drawable/Icon;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lx/l$a;->j()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, Lx/l$a;->a()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lx/m$f;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroidx/core/graphics/drawable/IconCompat;->n()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    invoke-virtual {p1}, Lx/l$a;->j()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, Lx/l$a;->a()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lx/m$d;->e(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    :goto_2
    invoke-virtual {p1}, Lx/l$a;->g()[Lx/t;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lx/l$a;->g()[Lx/t;

    move-result-object v1

    invoke-static {v1}, Lx/t;->b([Lx/t;)[Landroid/app/RemoteInput;

    move-result-object v1

    array-length v2, v1

    :goto_3
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    invoke-static {v0, v4}, Lx/m$d;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lx/l$a;->d()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v1, Landroid/os/Bundle;

    invoke-virtual {p1}, Lx/l$a;->d()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_4

    :cond_4
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    :goto_4
    invoke-virtual {p1}, Lx/l$a;->b()Z

    move-result v2

    const-string v3, "android.support.allowGeneratedReplies"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_5

    invoke-virtual {p1}, Lx/l$a;->b()Z

    move-result v3

    invoke-static {v0, v3}, Lx/m$g;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_5
    invoke-virtual {p1}, Lx/l$a;->h()I

    move-result v3

    const-string v4, "android.support.action.semanticAction"

    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/16 v3, 0x1c

    if-lt v2, v3, :cond_6

    invoke-virtual {p1}, Lx/l$a;->h()I

    move-result v3

    invoke-static {v0, v3}, Lx/m$i;->b(Landroid/app/Notification$Action$Builder;I)Landroid/app/Notification$Action$Builder;

    :cond_6
    const/16 v3, 0x1d

    if-lt v2, v3, :cond_7

    invoke-virtual {p1}, Lx/l$a;->l()Z

    move-result v3

    invoke-static {v0, v3}, Lx/m$j;->c(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_7
    const/16 v3, 0x1f

    if-lt v2, v3, :cond_8

    invoke-virtual {p1}, Lx/l$a;->k()Z

    move-result v2

    invoke-static {v0, v2}, Lx/m$k;->a(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_8
    invoke-virtual {p1}, Lx/l$a;->i()Z

    move-result p1

    const-string v2, "android.support.action.showsUserInterface"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v0, v1}, Lx/m$d;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    iget-object p1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$d;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object v0

    invoke-static {p1, v0}, Lx/m$d;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    goto :goto_5

    :cond_9
    const/16 v1, 0x10

    if-lt v0, v1, :cond_a

    iget-object v0, p0, Lx/m;->f:Ljava/util/List;

    iget-object v1, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v1, p1}, Lx/n;->f(Landroid/app/Notification$Builder;Lx/l$a;)Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_5
    return-void
.end method

.method public c()Landroid/app/Notification;
    .locals 5

    iget-object v0, p0, Lx/m;->c:Lx/l$e;

    iget-object v0, v0, Lx/l$e;->q:Lx/l$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lx/l$j;->b(Lx/k;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Lx/l$j;->t(Lx/k;)Landroid/widget/RemoteViews;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lx/m;->d()Landroid/app/Notification;

    move-result-object v2

    if-eqz v1, :cond_2

    :goto_1
    iput-object v1, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lx/m;->c:Lx/l$e;

    iget-object v1, v1, Lx/l$e;->I:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v1, v3, :cond_4

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0}, Lx/l$j;->s(Lx/k;)Landroid/widget/RemoteViews;

    move-result-object v4

    if-eqz v4, :cond_4

    iput-object v4, v2, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_4
    const/16 v4, 0x15

    if-lt v1, v4, :cond_5

    if-eqz v0, :cond_5

    iget-object v4, p0, Lx/m;->c:Lx/l$e;

    iget-object v4, v4, Lx/l$e;->q:Lx/l$j;

    invoke-virtual {v4, p0}, Lx/l$j;->u(Lx/k;)Landroid/widget/RemoteViews;

    move-result-object v4

    if-eqz v4, :cond_5

    iput-object v4, v2, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    :cond_5
    if-lt v1, v3, :cond_6

    if-eqz v0, :cond_6

    invoke-static {v2}, Lx/l;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v1}, Lx/l$j;->a(Landroid/os/Bundle;)V

    :cond_6
    return-object v2
.end method

.method public d()Landroid/app/Notification;
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v1, 0x18

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    iget v1, p0, Lx/m;->h:I

    if-eqz v1, :cond_2

    invoke-static {v0}, Lx/m$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_1

    iget v1, p0, Lx/m;->h:I

    if-ne v1, v3, :cond_1

    invoke-virtual {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    :cond_1
    invoke-static {v0}, Lx/m$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_2

    iget v1, p0, Lx/m;->h:I

    if-ne v1, v2, :cond_2

    invoke-virtual {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    :cond_2
    return-object v0

    :cond_3
    const/16 v1, 0x15

    if-lt v0, v1, :cond_9

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lx/m$c;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    iget-object v1, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_4

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    :cond_4
    iget-object v1, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_5

    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_5
    iget-object v1, p0, Lx/m;->i:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_6

    iput-object v1, v0, Landroid/app/Notification;->headsUpContentView:Landroid/widget/RemoteViews;

    :cond_6
    iget v1, p0, Lx/m;->h:I

    if-eqz v1, :cond_8

    invoke-static {v0}, Lx/m$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_7

    iget v1, p0, Lx/m;->h:I

    if-ne v1, v3, :cond_7

    invoke-virtual {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    :cond_7
    invoke-static {v0}, Lx/m$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_8

    iget v1, p0, Lx/m;->h:I

    if-ne v1, v2, :cond_8

    invoke-virtual {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    :cond_8
    return-object v0

    :cond_9
    const/16 v1, 0x14

    if-lt v0, v1, :cond_e

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lx/m$c;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    iget-object v1, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_a

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    :cond_a
    iget-object v1, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_b

    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_b
    iget v1, p0, Lx/m;->h:I

    if-eqz v1, :cond_d

    invoke-static {v0}, Lx/m$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_c

    iget v1, p0, Lx/m;->h:I

    if-ne v1, v3, :cond_c

    invoke-virtual {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    :cond_c
    invoke-static {v0}, Lx/m$d;->f(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    iget v1, v0, Landroid/app/Notification;->flags:I

    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_d

    iget v1, p0, Lx/m;->h:I

    if-ne v1, v2, :cond_d

    invoke-virtual {p0, v0}, Lx/m;->h(Landroid/app/Notification;)V

    :cond_d
    return-object v0

    :cond_e
    const/16 v1, 0x13

    const-string v2, "android.support.actionExtras"

    if-lt v0, v1, :cond_12

    iget-object v0, p0, Lx/m;->f:Ljava/util/List;

    invoke-static {v0}, Lx/n;->a(Ljava/util/List;)Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_f
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lx/m$c;->a(Landroid/app/Notification$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    iget-object v1, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_10

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    :cond_10
    iget-object v1, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_11

    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_11
    return-object v0

    :cond_12
    const/16 v1, 0x10

    if-lt v0, v1, :cond_18

    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-static {v0}, Lx/m$a;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification;

    move-result-object v0

    invoke-static {v0}, Lx/l;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v3, Landroid/os/Bundle;

    iget-object v4, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iget-object v4, p0, Lx/m;->g:Landroid/os/Bundle;

    invoke-virtual {v4}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_13
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual {v3, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    :cond_14
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object v1, p0, Lx/m;->f:Ljava/util/List;

    invoke-static {v1}, Lx/n;->a(Ljava/util/List;)Landroid/util/SparseArray;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-static {v0}, Lx/l;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_15
    iget-object v1, p0, Lx/m;->d:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_16

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    :cond_16
    iget-object v1, p0, Lx/m;->e:Landroid/widget/RemoteViews;

    if-eqz v1, :cond_17

    iput-object v1, v0, Landroid/app/Notification;->bigContentView:Landroid/widget/RemoteViews;

    :cond_17
    return-object v0

    :cond_18
    iget-object v0, p0, Lx/m;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public f()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lx/m;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final h(Landroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iput-object v0, p1, Landroid/app/Notification;->vibrate:[J

    iget v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Landroid/app/Notification;->defaults:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p1, Landroid/app/Notification;->defaults:I

    return-void
.end method
