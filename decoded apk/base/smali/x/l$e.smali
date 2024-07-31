.class public Lx/l$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$e$a;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Ljava/lang/String;

.field public E:Landroid/os/Bundle;

.field public F:I

.field public G:I

.field public H:Landroid/app/Notification;

.field public I:Landroid/widget/RemoteViews;

.field public J:Landroid/widget/RemoteViews;

.field public K:Landroid/widget/RemoteViews;

.field public L:Ljava/lang/String;

.field public M:I

.field public N:Ljava/lang/String;

.field public O:J

.field public P:I

.field public Q:I

.field public R:Z

.field public S:Lx/l$d;

.field public T:Landroid/app/Notification;

.field public U:Z

.field public V:Ljava/lang/Object;

.field public W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx/l$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx/r;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lx/l$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroid/widget/RemoteViews;

.field public j:Landroid/graphics/Bitmap;

.field public k:Ljava/lang/CharSequence;

.field public l:I

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Lx/l$j;

.field public r:Ljava/lang/CharSequence;

.field public s:Ljava/lang/CharSequence;

.field public t:[Ljava/lang/CharSequence;

.field public u:I

.field public v:I

.field public w:Z

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx/l$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$e;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$e;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$e;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx/l$e;->n:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lx/l$e;->A:Z

    iput v1, p0, Lx/l$e;->F:I

    iput v1, p0, Lx/l$e;->G:I

    iput v1, p0, Lx/l$e;->M:I

    iput v1, p0, Lx/l$e;->P:I

    iput v1, p0, Lx/l$e;->Q:I

    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput-object p1, p0, Lx/l$e;->a:Landroid/content/Context;

    iput-object p2, p0, Lx/l$e;->L:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    iget-object p1, p0, Lx/l$e;->T:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    iput v1, p0, Lx/l$e;->m:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx/l$e;->W:Ljava/util/ArrayList;

    iput-boolean v0, p0, Lx/l$e;->R:Z

    return-void
.end method

.method public static k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method public A(I)Lx/l$e;
    .locals 0

    iput p1, p0, Lx/l$e;->P:I

    return-object p0
.end method

.method public B(Z)Lx/l$e;
    .locals 0

    iput-boolean p1, p0, Lx/l$e;->y:Z

    return-object p0
.end method

.method public C(Landroid/graphics/Bitmap;)Lx/l$e;
    .locals 0

    invoke-virtual {p0, p1}, Lx/l$e;->l(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lx/l$e;->j:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public D(III)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->ledARGB:I

    iput p2, v0, Landroid/app/Notification;->ledOnMS:I

    iput p3, v0, Landroid/app/Notification;->ledOffMS:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget p2, v0, Landroid/app/Notification;->flags:I

    and-int/lit8 p2, p2, -0x2

    or-int/2addr p1, p2

    iput p1, v0, Landroid/app/Notification;->flags:I

    return-object p0
.end method

.method public E(Z)Lx/l$e;
    .locals 0

    iput-boolean p1, p0, Lx/l$e;->A:Z

    return-object p0
.end method

.method public F(I)Lx/l$e;
    .locals 0

    iput p1, p0, Lx/l$e;->l:I

    return-object p0
.end method

.method public G(Z)Lx/l$e;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lx/l$e;->x(IZ)V

    return-object p0
.end method

.method public H(Z)Lx/l$e;
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0, p1}, Lx/l$e;->x(IZ)V

    return-object p0
.end method

.method public I(I)Lx/l$e;
    .locals 0

    iput p1, p0, Lx/l$e;->m:I

    return-object p0
.end method

.method public J(IIZ)Lx/l$e;
    .locals 0

    iput p1, p0, Lx/l$e;->u:I

    iput p2, p0, Lx/l$e;->v:I

    iput-boolean p3, p0, Lx/l$e;->w:Z

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lx/l$e;
    .locals 0

    iput-object p1, p0, Lx/l$e;->N:Ljava/lang/String;

    return-object p0
.end method

.method public L(Z)Lx/l$e;
    .locals 0

    iput-boolean p1, p0, Lx/l$e;->n:Z

    return-object p0
.end method

.method public M(Z)Lx/l$e;
    .locals 0

    iput-boolean p1, p0, Lx/l$e;->U:Z

    return-object p0
.end method

.method public N(I)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public O(Landroid/net/Uri;)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    const/4 p1, -0x1

    iput p1, v0, Landroid/app/Notification;->audioStreamType:I

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p1, v0, :cond_0

    invoke-static {}, Lx/l$e$a;->b()Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lx/l$e$a;->c(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lx/l$e$a;->e(Landroid/media/AudioAttributes$Builder;I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    invoke-static {p1}, Lx/l$e$a;->a(Landroid/media/AudioAttributes$Builder;)Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    :cond_0
    return-object p0
.end method

.method public P(Lx/l$j;)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->q:Lx/l$j;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lx/l$e;->q:Lx/l$j;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Lx/l$j;->w(Lx/l$e;)V

    :cond_0
    return-object p0
.end method

.method public Q(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$e;->r:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public R(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public S(J)Lx/l$e;
    .locals 0

    iput-wide p1, p0, Lx/l$e;->O:J

    return-object p0
.end method

.method public T(Z)Lx/l$e;
    .locals 0

    iput-boolean p1, p0, Lx/l$e;->o:Z

    return-object p0
.end method

.method public U([J)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    return-object p0
.end method

.method public V(I)Lx/l$e;
    .locals 0

    iput p1, p0, Lx/l$e;->G:I

    return-object p0
.end method

.method public W(J)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method

.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Lx/l$e;
    .locals 2

    iget-object v0, p0, Lx/l$e;->b:Ljava/util/ArrayList;

    new-instance v1, Lx/l$a;

    invoke-direct {v1, p1, p2, p3}, Lx/l$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b(Lx/l$a;)Lx/l$e;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lx/l$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public c()Landroid/app/Notification;
    .locals 1

    new-instance v0, Lx/m;

    invoke-direct {v0, p0}, Lx/m;-><init>(Lx/l$e;)V

    invoke-virtual {v0}, Lx/m;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/widget/RemoteViews;
    .locals 1

    iget-object v0, p0, Lx/l$e;->J:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lx/l$e;->F:I

    return v0
.end method

.method public f()Landroid/widget/RemoteViews;
    .locals 1

    iget-object v0, p0, Lx/l$e;->I:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public g()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lx/l$e;->E:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lx/l$e;->E:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Lx/l$e;->E:Landroid/os/Bundle;

    return-object v0
.end method

.method public h()Landroid/widget/RemoteViews;
    .locals 1

    iget-object v0, p0, Lx/l$e;->K:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lx/l$e;->m:I

    return v0
.end method

.method public j()J
    .locals 2

    iget-boolean v0, p0, Lx/l$e;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iget-wide v0, v0, Landroid/app/Notification;->when:J

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public final l(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    if-eqz p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lw/c;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Lw/c;->a:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-gt v2, v0, :cond_1

    return-object p1

    :cond_1
    int-to-double v1, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v5, v3

    div-double/2addr v1, v5

    int-to-double v5, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v7, v0

    div-double/2addr v5, v7

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v5, v3

    mul-double/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {p1, v2, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public m(Z)Lx/l$e;
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0, p1}, Lx/l$e;->x(IZ)V

    return-object p0
.end method

.method public n(Ljava/lang/String;)Lx/l$e;
    .locals 0

    iput-object p1, p0, Lx/l$e;->D:Ljava/lang/String;

    return-object p0
.end method

.method public o(Ljava/lang/String;)Lx/l$e;
    .locals 0

    iput-object p1, p0, Lx/l$e;->L:Ljava/lang/String;

    return-object p0
.end method

.method public p(Z)Lx/l$e;
    .locals 2

    iput-boolean p1, p0, Lx/l$e;->p:Z

    invoke-virtual {p0}, Lx/l$e;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.chronometerCountDown"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p0
.end method

.method public q(I)Lx/l$e;
    .locals 0

    iput p1, p0, Lx/l$e;->F:I

    return-object p0
.end method

.method public r(Z)Lx/l$e;
    .locals 0

    iput-boolean p1, p0, Lx/l$e;->B:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx/l$e;->C:Z

    return-object p0
.end method

.method public s(Landroid/app/PendingIntent;)Lx/l$e;
    .locals 0

    iput-object p1, p0, Lx/l$e;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public t(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$e;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public u(Ljava/lang/CharSequence;)Lx/l$e;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$e;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public v(I)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->defaults:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    iget p1, v0, Landroid/app/Notification;->flags:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroid/app/Notification;->flags:I

    :cond_0
    return-object p0
.end method

.method public w(Landroid/app/PendingIntent;)Lx/l$e;
    .locals 1

    iget-object v0, p0, Lx/l$e;->T:Landroid/app/Notification;

    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public final x(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lx/l$e;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lx/l$e;->T:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    not-int p1, p1

    and-int/2addr p1, v0

    :goto_0
    iput p1, p2, Landroid/app/Notification;->flags:I

    return-void
.end method

.method public y(Landroid/app/PendingIntent;Z)Lx/l$e;
    .locals 0

    iput-object p1, p0, Lx/l$e;->h:Landroid/app/PendingIntent;

    const/16 p1, 0x80

    invoke-virtual {p0, p1, p2}, Lx/l$e;->x(IZ)V

    return-object p0
.end method

.method public z(Ljava/lang/String;)Lx/l$e;
    .locals 0

    iput-object p1, p0, Lx/l$e;->x:Ljava/lang/String;

    return-object p0
.end method
