.class public Lw2/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/String;

.field public d:Lx/l$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Lw2/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/b;->a:Landroid/content/Context;

    iput-object p3, p0, Lw2/b;->b:Ljava/lang/Integer;

    iput-object p2, p0, Lw2/b;->c:Ljava/lang/String;

    new-instance p3, Lx/l$e;

    invoke-direct {p3, p1, p2}, Lx/l$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Lx/l$e;->I(I)Lx/l$e;

    move-result-object p1

    iput-object p1, p0, Lw2/b;->d:Lx/l$e;

    const/4 p1, 0x0

    invoke-virtual {p0, p4, p1}, Lw2/b;->e(Lw2/d;Z)V

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Notification;
    .locals 1

    iget-object v0, p0, Lw2/b;->d:Lx/l$e;

    invoke-virtual {v0}, Lx/l$e;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/app/PendingIntent;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnspecifiedImmutableFlag"
        }
    .end annotation

    iget-object v0, p0, Lw2/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lw2/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10200000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/high16 v1, 0x8000000

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-le v2, v3, :cond_0

    const/high16 v1, 0xc000000

    :cond_0
    iget-object v2, p0, Lw2/b;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    iget-object v0, p0, Lw2/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lw2/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lw2/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lx/o;->f(Landroid/content/Context;)Lx/o;

    move-result-object v0

    new-instance v1, Landroid/app/NotificationChannel;

    iget-object v2, p0, Lw2/b;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    invoke-virtual {v0, v1}, Lx/o;->e(Landroid/app/NotificationChannel;)V

    :cond_0
    return-void
.end method

.method public final e(Lw2/d;Z)V
    .locals 3

    invoke-virtual {p1}, Lw2/d;->a()Lw2/a;

    move-result-object v0

    invoke-virtual {v0}, Lw2/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lw2/d;->a()Lw2/a;

    move-result-object v1

    invoke-virtual {v1}, Lw2/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lw2/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v1, "ic_launcher.png"

    const-string v2, "mipmap"

    invoke-virtual {p0, v1, v2}, Lw2/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Lw2/b;->d:Lx/l$e;

    invoke-virtual {p1}, Lw2/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lx/l$e;->u(Ljava/lang/CharSequence;)Lx/l$e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lx/l$e;->N(I)Lx/l$e;

    move-result-object v0

    invoke-virtual {p1}, Lw2/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx/l$e;->t(Ljava/lang/CharSequence;)Lx/l$e;

    move-result-object v0

    invoke-virtual {p0}, Lw2/b;->b()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx/l$e;->s(Landroid/app/PendingIntent;)Lx/l$e;

    move-result-object v0

    invoke-virtual {p1}, Lw2/d;->f()Z

    move-result p1

    invoke-virtual {v0, p1}, Lx/l$e;->G(Z)Lx/l$e;

    move-result-object p1

    iput-object p1, p0, Lw2/b;->d:Lx/l$e;

    if-eqz p2, :cond_1

    iget-object p1, p0, Lw2/b;->a:Landroid/content/Context;

    invoke-static {p1}, Lx/o;->f(Landroid/content/Context;)Lx/o;

    move-result-object p1

    iget-object p2, p0, Lw2/b;->b:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lw2/b;->d:Lx/l$e;

    invoke-virtual {v0}, Lx/l$e;->c()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lx/o;->i(ILandroid/app/Notification;)V

    :cond_1
    return-void
.end method

.method public f(Lw2/d;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw2/b;->e(Lw2/d;Z)V

    return-void
.end method
