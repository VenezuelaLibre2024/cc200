.class public final Ln/w;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/w$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-ge v0, v2, :cond_4

    const/16 v2, 0x18

    if-lt v0, v2, :cond_4

    invoke-virtual {p1}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {p0}, Lk0/b0;->x(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Ln/w;->c(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t handle drop: no activity: view="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ReceiveContent"

    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    instance-of p0, p0, Landroid/widget/TextView;

    xor-int/2addr p0, v3

    return p0

    :cond_2
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    instance-of v1, p0, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    check-cast p0, Landroid/widget/TextView;

    invoke-static {p1, p0, v0}, Ln/w$a;->a(Landroid/view/DragEvent;Landroid/widget/TextView;Landroid/app/Activity;)Z

    move-result p0

    goto :goto_0

    :cond_3
    invoke-static {p1, p0, v0}, Ln/w$a;->b(Landroid/view/DragEvent;Landroid/view/View;Landroid/app/Activity;)Z

    move-result p0

    :goto_0
    return p0

    :cond_4
    :goto_1
    return v1
.end method

.method public static b(Landroid/widget/TextView;I)Z
    .locals 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-ge v0, v2, :cond_4

    invoke-static {p0}, Lk0/b0;->x(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const v0, 0x1020022

    if-eq p1, v0, :cond_0

    const v2, 0x1020031

    if-eq p1, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "clipboard"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ClipboardManager;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v2

    :goto_0
    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    move-result v4

    if-lez v4, :cond_3

    new-instance v4, Lk0/c$a;

    invoke-direct {v4, v2, v3}, Lk0/c$a;-><init>(Landroid/content/ClipData;I)V

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    invoke-virtual {v4, v1}, Lk0/c$a;->c(I)Lk0/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lk0/c$a;->a()Lk0/c;

    move-result-object p1

    invoke-static {p0, p1}, Lk0/b0;->P(Landroid/view/View;Lk0/c;)Lk0/c;

    :cond_3
    return v3

    :cond_4
    :goto_2
    return v1
.end method

.method public static c(Landroid/view/View;)Landroid/app/Activity;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
