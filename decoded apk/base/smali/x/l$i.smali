.class public Lx/l$i;
.super Lx/l$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/l$i$e;,
        Lx/l$i$d;,
        Lx/l$i$b;,
        Lx/l$i$c;,
        Lx/l$i$a;
    }
.end annotation


# instance fields
.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx/l$i$e;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx/l$i$e;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lx/r;

.field public h:Ljava/lang/CharSequence;

.field public i:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lx/l$j;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$i;->f:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lx/r;)V
    .locals 1

    invoke-direct {p0}, Lx/l$j;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx/l$i;->f:Ljava/util/List;

    invoke-virtual {p1}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lx/l$i;->g:Lx/r;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "User\'s name must not be empty."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static y(Landroid/app/Notification;)Lx/l$i;
    .locals 1

    invoke-static {p0}, Lx/l$j;->p(Landroid/app/Notification;)Lx/l$j;

    move-result-object p0

    instance-of v0, p0, Lx/l$i;

    if-eqz v0, :cond_0

    check-cast p0, Lx/l$i;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public A()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public B()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx/l$i$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    return-object v0
.end method

.method public C()Lx/r;
    .locals 1

    iget-object v0, p0, Lx/l$i;->g:Lx/r;

    return-object v0
.end method

.method public final D()Z
    .locals 4

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v2, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx/l$i$e;

    invoke-virtual {v2}, Lx/l$i$e;->g()Lx/r;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lx/l$i$e;->g()Lx/r;

    move-result-object v2

    invoke-virtual {v2}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public E()Z
    .locals 3

    iget-object v0, p0, Lx/l$j;->a:Lx/l$e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, v0, Lx/l$e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v2, 0x1c

    if-ge v0, v2, :cond_1

    iget-object v0, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    iget-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    return v1
.end method

.method public final F(I)Landroid/text/style/TextAppearanceSpan;
    .locals 7

    new-instance v6, Landroid/text/style/TextAppearanceSpan;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    return-object v6
.end method

.method public final G(Lx/l$i$e;)Ljava/lang/CharSequence;
    .locals 7

    invoke-static {}, Li0/a;->c()Li0/a;

    move-result-object v0

    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    const/high16 v3, -0x1000000

    goto :goto_1

    :cond_1
    const/4 v3, -0x1

    :goto_1
    invoke-virtual {p1}, Lx/l$i$e;->g()Lx/r;

    move-result-object v4

    const-string v5, ""

    if-nez v4, :cond_2

    move-object v4, v5

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lx/l$i$e;->g()Lx/r;

    move-result-object v4

    invoke-virtual {v4}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v4

    :goto_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v4, p0, Lx/l$i;->g:Lx/r;

    invoke-virtual {v4}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v2, :cond_3

    iget-object v2, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {v2}, Lx/l$e;->e()I

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lx/l$j;->a:Lx/l$e;

    invoke-virtual {v2}, Lx/l$e;->e()I

    move-result v2

    move v3, v2

    :cond_3
    invoke-virtual {v0, v4}, Li0/a;->h(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0, v3}, Lx/l$i;->F(I)Landroid/text/style/TextAppearanceSpan;

    move-result-object v3

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    sub-int/2addr v4, v2

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    const/16 v6, 0x21

    invoke-virtual {v1, v3, v4, v2, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p1}, Lx/l$i$e;->h()Ljava/lang/CharSequence;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lx/l$i$e;->h()Ljava/lang/CharSequence;

    move-result-object v5

    :goto_3
    const-string p1, "  "

    invoke-virtual {v1, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {v0, v5}, Li0/a;->h(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    return-object v1
.end method

.method public H(Ljava/lang/CharSequence;)Lx/l$i;
    .locals 0

    iput-object p1, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public I(Z)Lx/l$i;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    return-object p0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lx/l$j;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lx/l$i;->g:Lx/r;

    invoke-virtual {v0}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, "android.selfDisplayName"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lx/l$i;->g:Lx/r;

    invoke-virtual {v0}, Lx/r;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messagingStyleUser"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    const-string v1, "android.hiddenConversationTitle"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    const-string v1, "android.conversationTitle"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-static {v0}, Lx/l$i$e;->a(Ljava/util/List;)[Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messages"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_1
    iget-object v0, p0, Lx/l$i;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lx/l$i;->f:Ljava/util/List;

    invoke-static {v0}, Lx/l$i$e;->a(Ljava/util/List;)[Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.messages.historic"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_2
    iget-object v0, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "android.isGroupConversation"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    return-void
.end method

.method public b(Lx/k;)V
    .locals 7

    invoke-virtual {p0}, Lx/l$i;->E()Z

    move-result v0

    invoke-virtual {p0, v0}, Lx/l$i;->I(Z)Lx/l$i;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_6

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lx/l$i;->g:Lx/r;

    invoke-virtual {v0}, Lx/r;->j()Landroid/app/Person;

    move-result-object v0

    invoke-static {v0}, Lx/l$i$d;->a(Landroid/app/Person;)Landroid/app/Notification$MessagingStyle;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/l$i;->g:Lx/r;

    invoke-virtual {v0}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lx/l$i$b;->b(Ljava/lang/CharSequence;)Landroid/app/Notification$MessagingStyle;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx/l$i$e;

    invoke-virtual {v3}, Lx/l$i$e;->k()Landroid/app/Notification$MessagingStyle$Message;

    move-result-object v3

    invoke-static {v0, v3}, Lx/l$i$b;->a(Landroid/app/Notification$MessagingStyle;Landroid/app/Notification$MessagingStyle$Message;)Landroid/app/Notification$MessagingStyle;

    goto :goto_1

    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_2

    iget-object v2, p0, Lx/l$i;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx/l$i$e;

    invoke-virtual {v3}, Lx/l$i$e;->k()Landroid/app/Notification$MessagingStyle$Message;

    move-result-object v3

    invoke-static {v0, v3}, Lx/l$i$c;->a(Landroid/app/Notification$MessagingStyle;Landroid/app/Notification$MessagingStyle$Message;)Landroid/app/Notification$MessagingStyle;

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_4

    :cond_3
    iget-object v2, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    invoke-static {v0, v2}, Lx/l$i$b;->c(Landroid/app/Notification$MessagingStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$MessagingStyle;

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v1, :cond_5

    iget-object v1, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Lx/l$i$d;->b(Landroid/app/Notification$MessagingStyle;Z)Landroid/app/Notification$MessagingStyle;

    :cond_5
    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {v0, p1}, Lx/l$i$a;->d(Landroid/app/Notification$Style;Landroid/app/Notification$Builder;)V

    goto/16 :goto_a

    :cond_6
    invoke-virtual {p0}, Lx/l$i;->z()Lx/l$i$e;

    move-result-object v1

    iget-object v2, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    :goto_3
    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    goto :goto_4

    :cond_7
    if-eqz v1, :cond_8

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    invoke-virtual {v1}, Lx/l$i$e;->g()Lx/r;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object v2

    invoke-virtual {v1}, Lx/l$i$e;->g()Lx/r;

    move-result-object v3

    invoke-virtual {v3}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v3

    goto :goto_3

    :cond_8
    :goto_4
    if-eqz v1, :cond_a

    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object v2

    iget-object v3, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    if-eqz v3, :cond_9

    invoke-virtual {p0, v1}, Lx/l$i;->G(Lx/l$i$e;)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Lx/l$i$e;->h()Ljava/lang/CharSequence;

    move-result-object v1

    :goto_5
    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    :cond_a
    const/16 v1, 0x10

    if-lt v0, v1, :cond_10

    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    iget-object v1, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_c

    invoke-virtual {p0}, Lx/l$i;->D()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_6

    :cond_b
    move v1, v2

    goto :goto_7

    :cond_c
    :goto_6
    move v1, v3

    :goto_7
    iget-object v4, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v3

    :goto_8
    if-ltz v4, :cond_f

    iget-object v5, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx/l$i$e;

    if-eqz v1, :cond_d

    invoke-virtual {p0, v5}, Lx/l$i;->G(Lx/l$i$e;)Ljava/lang/CharSequence;

    move-result-object v5

    goto :goto_9

    :cond_d
    invoke-virtual {v5}, Lx/l$i$e;->h()Ljava/lang/CharSequence;

    move-result-object v5

    :goto_9
    iget-object v6, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v3

    if-eq v4, v6, :cond_e

    const-string v6, "\n"

    invoke-virtual {v0, v2, v6}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_e
    invoke-virtual {v0, v2, v5}, Landroid/text/SpannableStringBuilder;->insert(ILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v4, v4, -0x1

    goto :goto_8

    :cond_f
    invoke-interface {p1}, Lx/k;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    invoke-static {p1}, Lx/l$i$a;->b(Landroid/app/Notification$Builder;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lx/l$i$a;->c(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object p1

    invoke-static {p1, v0}, Lx/l$i$a;->a(Landroid/app/Notification$BigTextStyle;Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    :cond_10
    :goto_a
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const-string v0, "androidx.core.app.NotificationCompat$MessagingStyle"

    return-object v0
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lx/l$j;->v(Landroid/os/Bundle;)V

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-string v0, "android.messagingStyleUser"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lx/r;->b(Landroid/os/Bundle;)Lx/r;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lx/r$b;

    invoke-direct {v0}, Lx/r$b;-><init>()V

    const-string v1, "android.selfDisplayName"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx/r$b;->f(Ljava/lang/CharSequence;)Lx/r$b;

    move-result-object v0

    invoke-virtual {v0}, Lx/r$b;->a()Lx/r;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lx/l$i;->g:Lx/r;

    const-string v0, "android.conversationTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    const-string v0, "android.hiddenConversationTitle"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lx/l$i;->h:Ljava/lang/CharSequence;

    :cond_1
    const-string v0, "android.messages"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-static {v0}, Lx/l$i$e;->f([Landroid/os/Parcelable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    const-string v0, "android.messages.historic"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lx/l$i;->f:Ljava/util/List;

    invoke-static {v0}, Lx/l$i$e;->f([Landroid/os/Parcelable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    const-string v0, "android.isGroupConversation"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lx/l$i;->i:Ljava/lang/Boolean;

    :cond_4
    return-void
.end method

.method public x(Lx/l$i$e;)Lx/l$i;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x19

    if-le p1, v0, :cond_0

    iget-object p1, p0, Lx/l$i;->e:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final z()Lx/l$i$e;
    .locals 3

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx/l$i$e;

    invoke-virtual {v1}, Lx/l$i$e;->g()Lx/r;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lx/l$i$e;->g()Lx/r;

    move-result-object v2

    invoke-virtual {v2}, Lx/r;->e()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lx/l$i;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx/l$i$e;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
