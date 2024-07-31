.class public Lx/l$c;
.super Lx/l$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$c$a;
    }
.end annotation


# instance fields
.field public e:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/l$j;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lx/l$j;->a(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lx/l$c;->e:Ljava/lang/CharSequence;

    const-string v1, "android.bigText"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Lx/k;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {p1}, Lx/l$c$a;->b(Landroid/app/Notification$Builder;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    iget-object v0, p0, Lx/l$j;->b:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lx/l$c$a;->c(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    iget-object v0, p0, Lx/l$c;->e:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lx/l$c$a;->a(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    iget-boolean v0, p0, Lx/l$j;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx/l$j;->c:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lx/l$c$a;->d(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    :cond_0
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$BigTextStyle"

    return-object v0
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lx/l$j;->v(Landroid/os/Bundle;)V

    const-string v0, "android.bigText"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$c;->e:Ljava/lang/CharSequence;

    return-void
.end method

.method public x(Ljava/lang/CharSequence;)Lx/l$c;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$c;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public y(Ljava/lang/CharSequence;)Lx/l$c;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$j;->b:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public z(Ljava/lang/CharSequence;)Lx/l$c;
    .locals 0

    invoke-static {p1}, Lx/l$e;->k(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lx/l$j;->c:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx/l$j;->d:Z

    return-object p0
.end method
