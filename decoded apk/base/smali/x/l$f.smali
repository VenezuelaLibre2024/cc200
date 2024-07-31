.class public Lx/l$f;
.super Lx/l$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$f$g;,
        Lx/l$f$e;,
        Lx/l$f$a;,
        Lx/l$f$d;,
        Lx/l$f$f;,
        Lx/l$f$c;,
        Lx/l$f$b;
    }
.end annotation


# instance fields
.field public e:I

.field public f:Lx/r;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroid/app/PendingIntent;

.field public j:Z

.field public k:Ljava/lang/Integer;

.field public l:Ljava/lang/Integer;

.field public m:Landroidx/core/graphics/drawable/IconCompat;

.field public n:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/l$j;-><init>()V

    return-void
.end method

.method public static x(Lx/l$a;)Landroid/app/Notification$Action;
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-lt v0, v2, :cond_1

    invoke-virtual {p0}, Lx/l$a;->f()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->y()Landroid/graphics/drawable/Icon;

    move-result-object v2

    :goto_0
    invoke-virtual {p0}, Lx/l$a;->j()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {p0}, Lx/l$a;->a()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lx/l$f$d;->a(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v2

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lx/l$a;->f()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->q()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->n()I

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    invoke-virtual {p0}, Lx/l$a;->j()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {p0}, Lx/l$a;->a()Landroid/app/PendingIntent;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lx/l$f$b;->e(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Action$Builder;

    move-result-object v2

    :goto_2
    invoke-virtual {p0}, Lx/l$a;->d()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v3, Landroid/os/Bundle;

    invoke-virtual {p0}, Lx/l$a;->d()Landroid/os/Bundle;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_3

    :cond_3
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    :goto_3
    invoke-virtual {p0}, Lx/l$a;->b()Z

    move-result v4

    const-string v5, "android.support.allowGeneratedReplies"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/16 v4, 0x18

    if-lt v0, v4, :cond_4

    invoke-virtual {p0}, Lx/l$a;->b()Z

    move-result v4

    invoke-static {v2, v4}, Lx/l$f$e;->b(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_4
    const/16 v4, 0x1f

    if-lt v0, v4, :cond_5

    invoke-virtual {p0}, Lx/l$a;->k()Z

    move-result v0

    invoke-static {v2, v0}, Lx/l$f$g;->e(Landroid/app/Notification$Action$Builder;Z)Landroid/app/Notification$Action$Builder;

    :cond_5
    invoke-static {v2, v3}, Lx/l$f$b;->b(Landroid/app/Notification$Action$Builder;Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    invoke-virtual {p0}, Lx/l$a;->g()[Lx/t;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Lx/t;->b([Lx/t;)[Landroid/app/RemoteInput;

    move-result-object p0

    array-length v0, p0

    :goto_4
    if-ge v1, v0, :cond_6

    aget-object v3, p0, v1

    invoke-static {v2, v3}, Lx/l$f$b;->c(Landroid/app/Notification$Action$Builder;Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_6
    invoke-static {v2}, Lx/l$f$b;->d(Landroid/app/Notification$Action$Builder;)Landroid/app/Notification$Action;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Lx/l$a;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lx/l$a;->d()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_action_priority"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final B(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lx/l$a;
    .locals 2

    if-nez p3, :cond_0

    iget-object p3, p0, Lx/l$j;->a:Lx/l$e;

    iget-object p3, p3, Lx/l$e;->a:Landroid/content/Context;

    invoke-static {p3, p4}, Ly/a;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_0
    new-instance p4, Landroid/text/SpannableStringBuilder;

    invoke-direct {p4}, Landroid/text/SpannableStringBuilder;-><init>()V

    iget-object v0, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v0, v0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    new-instance p2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/4 p3, 0x0

    invoke-virtual {p4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    const/16 v1, 0x12

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    new-instance p2, Lx/l$a$a;

    iget-object p3, p0, Lx/l$j;->a:Lx/l$e;

    iget-object p3, p3, Lx/l$e;->a:Landroid/content/Context;

    invoke-static {p3, p1}, Landroidx/core/graphics/drawable/IconCompat;->k(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    invoke-direct {p2, p1, p4, p5}, Lx/l$a$a;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p2}, Lx/l$a$a;->b()Lx/l$a;

    move-result-object p1

    invoke-virtual {p1}, Lx/l$a;->d()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x1

    const-string p4, "key_action_priority"

    invoke-virtual {p2, p4, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object p1
.end method

.method public final C()Lx/l$a;
    .locals 8

    sget v0, Lw/d;->d:I

    sget v1, Lw/d;->b:I

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_0

    sget v0, Lw/d;->c:I

    sget v1, Lw/d;->a:I

    :cond_0
    iget-object v7, p0, Lx/l$f;->g:Landroid/app/PendingIntent;

    if-nez v7, :cond_1

    const/4 v0, 0x0

    goto :goto_2

    :cond_1
    iget-boolean v2, p0, Lx/l$f;->j:Z

    if-eqz v2, :cond_2

    move v3, v0

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    if-eqz v2, :cond_3

    sget v0, Lw/h;->b:I

    goto :goto_1

    :cond_3
    sget v0, Lw/h;->a:I

    :goto_1
    move v4, v0

    iget-object v5, p0, Lx/l$f;->k:Ljava/lang/Integer;

    sget v6, Lw/b;->a:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lx/l$f;->B(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lx/l$a;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final D()Lx/l$a;
    .locals 7

    sget v0, Lw/d;->f:I

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    sget v0, Lw/d;->e:I

    :cond_0
    move v2, v0

    iget-object v6, p0, Lx/l$f;->h:Landroid/app/PendingIntent;

    if-nez v6, :cond_1

    sget v3, Lw/h;->d:I

    iget-object v4, p0, Lx/l$f;->l:Ljava/lang/Integer;

    sget v5, Lw/b;->b:I

    iget-object v6, p0, Lx/l$f;->i:Landroid/app/PendingIntent;

    :goto_0
    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lx/l$f;->B(IILjava/lang/Integer;ILandroid/app/PendingIntent;)Lx/l$a;

    move-result-object v0

    return-object v0

    :cond_1
    sget v3, Lw/h;->c:I

    iget-object v4, p0, Lx/l$f;->l:Ljava/lang/Integer;

    sget v5, Lw/b;->b:I

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lx/l$j;->a(Landroid/os/Bundle;)V

    iget v0, p0, Lx/l$f;->e:I

    const-string v1, "android.callType"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-boolean v0, p0, Lx/l$f;->j:Z

    const-string v1, "android.callIsVideo"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, Lx/l$f;->f:Lx/r;

    if-eqz v0, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lx/r;->j()Landroid/app/Person;

    move-result-object v0

    const-string v1, "android.callPerson"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lx/r;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.callPersonCompat"

    :goto_0
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    iget-object v0, p0, Lx/l$f;->m:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz v0, :cond_3

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v1, v1, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;->z(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v1, "android.verificationIcon"

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->x()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.verificationIconCompat"

    :goto_1
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_3
    iget-object v0, p0, Lx/l$f;->n:Ljava/lang/CharSequence;

    const-string v1, "android.verificationText"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lx/l$f;->g:Landroid/app/PendingIntent;

    const-string v1, "android.answerIntent"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lx/l$f;->h:Landroid/app/PendingIntent;

    const-string v1, "android.declineIntent"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lx/l$f;->i:Landroid/app/PendingIntent;

    const-string v1, "android.hangUpIntent"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lx/l$f;->k:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "android.answerColor"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_4
    iget-object v0, p0, Lx/l$f;->l:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "android.declineColor"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public b(Lx/k;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_7

    iget v0, p0, Lx/l$f;->e:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const-string v0, "NotifCompat"

    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized call type in CallStyle: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lx/l$f;->e:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/l$f;->f:Lx/r;

    invoke-virtual {v0}, Lx/r;->j()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Lx/l$f;->i:Landroid/app/PendingIntent;

    iget-object v2, p0, Lx/l$f;->g:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, Lx/l$f$g;->c(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx/l$f;->f:Lx/r;

    invoke-virtual {v0}, Lx/r;->j()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Lx/l$f;->i:Landroid/app/PendingIntent;

    invoke-static {v0, v1}, Lx/l$f$g;->b(Landroid/app/Person;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lx/l$f;->f:Lx/r;

    invoke-virtual {v0}, Lx/r;->j()Landroid/app/Person;

    move-result-object v0

    iget-object v1, p0, Lx/l$f;->h:Landroid/app/PendingIntent;

    iget-object v2, p0, Lx/l$f;->g:Landroid/app/PendingIntent;

    invoke-static {v0, v1, v2}, Lx/l$f$g;->a(Landroid/app/Person;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification$CallStyle;

    move-result-object v1

    :cond_3
    :goto_0
    if-eqz v1, :cond_10

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-static {v0}, Lx/l$f$e;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {v1, p1}, Lx/l$f$a;->a(Landroid/app/Notification$CallStyle;Landroid/app/Notification$Builder;)V

    iget-object p1, p0, Lx/l$f;->k:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v1, p1}, Lx/l$f$g;->d(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    :cond_4
    iget-object p1, p0, Lx/l$f;->l:Ljava/lang/Integer;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v1, p1}, Lx/l$f$g;->f(Landroid/app/Notification$CallStyle;I)Landroid/app/Notification$CallStyle;

    :cond_5
    iget-object p1, p0, Lx/l$f;->n:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Lx/l$f$g;->i(Landroid/app/Notification$CallStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$CallStyle;

    iget-object p1, p0, Lx/l$f;->m:Landroidx/core/graphics/drawable/IconCompat;

    if-eqz p1, :cond_6

    iget-object v0, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v0, v0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroidx/core/graphics/drawable/IconCompat;->z(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    invoke-static {v1, p1}, Lx/l$f$g;->h(Landroid/app/Notification$CallStyle;Landroid/graphics/drawable/Icon;)Landroid/app/Notification$CallStyle;

    :cond_6
    iget-boolean p1, p0, Lx/l$f;->j:Z

    invoke-static {v1, p1}, Lx/l$f$g;->g(Landroid/app/Notification$CallStyle;Z)Landroid/app/Notification$CallStyle;

    goto/16 :goto_4

    :cond_7
    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    iget-object v2, p0, Lx/l$f;->f:Lx/r;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_1

    :cond_8
    move-object v2, v1

    :goto_1
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v2, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v2, v2, Lx/l$e;->E:Landroid/os/Bundle;

    if-eqz v2, :cond_9

    const-string v3, "android.text"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v1, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v1, v1, Lx/l$e;->E:Landroid/os/Bundle;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    :cond_9
    if-nez v1, :cond_a

    invoke-virtual {p0}, Lx/l$f;->z()Ljava/lang/String;

    move-result-object v1

    :cond_a
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    iget-object v1, p0, Lx/l$f;->f:Lx/r;

    const/16 v2, 0x15

    if-eqz v1, :cond_d

    const/16 v3, 0x17

    if-lt v0, v3, :cond_b

    invoke-virtual {v1}, Lx/r;->c()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lx/l$f;->f:Lx/r;

    invoke-virtual {v1}, Lx/r;->c()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    iget-object v3, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v3, v3, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroidx/core/graphics/drawable/IconCompat;->z(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {p1, v1}, Lx/l$f$d;->b(Landroid/app/Notification$Builder;Landroid/graphics/drawable/Icon;)V

    :cond_b
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_c

    iget-object v1, p0, Lx/l$f;->f:Lx/r;

    invoke-virtual {v1}, Lx/r;->j()Landroid/app/Person;

    move-result-object v1

    invoke-static {p1, v1}, Lx/l$f$f;->a(Landroid/app/Notification$Builder;Landroid/app/Person;)Landroid/app/Notification$Builder;

    goto :goto_2

    :cond_c
    if-lt v0, v2, :cond_d

    iget-object v1, p0, Lx/l$f;->f:Lx/r;

    invoke-virtual {v1}, Lx/r;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lx/l$f$c;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_d
    :goto_2
    const/16 v1, 0x14

    if-lt v0, v1, :cond_f

    invoke-virtual {p0}, Lx/l$f;->y()Ljava/util/ArrayList;

    move-result-object v1

    const/16 v3, 0x18

    if-lt v0, v3, :cond_e

    invoke-static {p1}, Lx/l$f$e;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;

    :cond_e
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx/l$a;

    invoke-static {v1}, Lx/l$f;->x(Lx/l$a;)Landroid/app/Notification$Action;

    move-result-object v1

    invoke-static {p1, v1}, Lx/l$f$b;->a(Landroid/app/Notification$Builder;Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    goto :goto_3

    :cond_f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v2, :cond_10

    const-string v0, "call"

    invoke-static {p1, v0}, Lx/l$f$c;->b(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    :cond_10
    :goto_4
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$CallStyle"

    return-object v0
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lx/l$j;->v(Landroid/os/Bundle;)V

    const-string v0, "android.callType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lx/l$f;->e:I

    const-string v0, "android.callIsVideo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lx/l$f;->j:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const-string v1, "android.callPerson"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/app/Person;

    invoke-static {v1}, Lx/r;->a(Landroid/app/Person;)Lx/r;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "android.callPersonCompat"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v1}, Lx/r;->b(Landroid/os/Bundle;)Lx/r;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lx/l$f;->f:Lx/r;

    :cond_1
    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    const-string v0, "android.verificationIcon"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Icon;

    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->c(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, "android.verificationIconCompat"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/os/Bundle;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lx/l$f;->m:Landroidx/core/graphics/drawable/IconCompat;

    :cond_3
    const-string v0, "android.verificationText"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lx/l$f;->n:Ljava/lang/CharSequence;

    const-string v0, "android.answerIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, Lx/l$f;->g:Landroid/app/PendingIntent;

    const-string v0, "android.declineIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, Lx/l$f;->h:Landroid/app/PendingIntent;

    const-string v0, "android.hangUpIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iput-object v0, p0, Lx/l$f;->i:Landroid/app/PendingIntent;

    const-string v0, "android.answerColor"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_4
    move-object v0, v2

    :goto_2
    iput-object v0, p0, Lx/l$f;->k:Ljava/lang/Integer;

    const-string v0, "android.declineColor"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_5
    iput-object v2, p0, Lx/l$f;->l:Ljava/lang/Integer;

    return-void
.end method

.method public y()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lx/l$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lx/l$f;->D()Lx/l$a;

    move-result-object v0

    invoke-virtual {p0}, Lx/l$f;->C()Lx/l$a;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x2

    iget-object v3, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v3, v3, Lx/l$e;->b:Ljava/util/ArrayList;

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx/l$a;

    invoke-virtual {v5}, Lx/l$a;->l()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v5}, Lx/l$f;->A(Lx/l$a;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    if-le v0, v4, :cond_3

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    :cond_3
    :goto_1
    if-eqz v1, :cond_0

    if-ne v0, v4, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    if-eqz v1, :cond_5

    if-lt v0, v4, :cond_5

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v2
.end method

.method public final z()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lx/l$f;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v0, v0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lw/h;->g:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v0, v0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lw/h;->f:I

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lx/l$j;->a:Lx/l$e;

    iget-object v0, v0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lw/h;->e:I

    goto :goto_0
.end method
