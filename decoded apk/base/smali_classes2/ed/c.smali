.class public final Led/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# instance fields
.field public h:Landroid/content/Context;

.field public i:Landroid/widget/Toast;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led/c;->h:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(Led/c;)V
    .locals 0

    invoke-static {p0}, Led/c;->c(Led/c;)V

    return-void
.end method

.method public static final synthetic b(Led/c;Landroid/widget/Toast;)V
    .locals 0

    iput-object p1, p0, Led/c;->i:Landroid/widget/Toast;

    return-void
.end method

.method public static final c(Led/c;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 10

    const-string v0, "call"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v1, "showToast"

    invoke-static {v0, v1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    const-string v0, "msg"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "length"

    invoke-virtual {p1, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "gravity"

    invoke-virtual {p1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "bgcolor"

    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    const-string v5, "textcolor"

    invoke-virtual {p1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    const-string v6, "fontSize"

    invoke-virtual {p1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    const-string v6, "top"

    invoke-static {v3, v6}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v7, 0x11

    const/16 v8, 0x30

    if-eqz v6, :cond_0

    move v3, v8

    goto :goto_0

    :cond_0
    const-string v6, "center"

    invoke-static {v3, v6}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v7

    goto :goto_0

    :cond_1
    const/16 v3, 0x50

    :goto_0
    const-string v6, "long"

    invoke-static {v1, v6}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v4, :cond_6

    iget-object v6, p0, Led/c;->h:Landroid/content/Context;

    const-string v9, "layout_inflater"

    invoke-virtual {v6, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const-string v9, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-static {v6, v9}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/view/LayoutInflater;

    sget v9, Led/f;->a:I

    invoke-virtual {v6, v9, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    sget v6, Led/e;->a:I

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x15

    if-lt v0, v9, :cond_2

    iget-object v0, p0, Led/c;->h:Landroid/content/Context;

    sget v9, Led/d;->a:I

    invoke-virtual {v0, v9}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Led/c;->h:Landroid/content/Context;

    sget v9, Led/d;->a:I

    invoke-static {v0, v9}, Ly/a;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v4, v9}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_4
    new-instance p1, Landroid/widget/Toast;

    iget-object v0, p0, Led/c;->h:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Led/c;->i:Landroid/widget/Toast;

    invoke-virtual {p1, v1}, Landroid/widget/Toast;->setDuration(I)V

    iget-object p1, p0, Led/c;->i:Landroid/widget/Toast;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    goto :goto_2

    :cond_6
    :try_start_0
    iget-object v4, p0, Led/c;->h:Landroid/content/Context;

    invoke-static {v4, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    move-result-object v2

    :cond_7
    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    const v0, 0x102000b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "mToast?.view!!.findViewById(android.R.id.message,)"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_8
    if-eqz v5, :cond_9

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_9
    :goto_2
    const/4 p1, 0x0

    if-eq v3, v7, :cond_b

    const/16 v0, 0x64

    if-eq v3, v8, :cond_a

    :try_start_1
    iget-object v1, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz v1, :cond_c

    :goto_3
    invoke-virtual {v1, v3, p1, v0}, Landroid/widget/Toast;->setGravity(III)V

    goto :goto_4

    :cond_a
    iget-object v1, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz v1, :cond_c

    goto :goto_3

    :cond_b
    iget-object v0, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v3, p1, p1}, Landroid/widget/Toast;->setGravity(III)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_c
    :goto_4
    iget-object p1, p0, Led/c;->h:Landroid/content/Context;

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_d

    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Activity;

    new-instance v0, Led/b;

    invoke-direct {v0, p0}, Led/b;-><init>(Led/c;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_5

    :cond_d
    iget-object p1, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_e
    :goto_5
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_11

    iget-object p1, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz p1, :cond_11

    new-instance v0, Led/c$a;

    invoke-direct {v0, p0}, Led/c$a;-><init>(Led/c;)V

    invoke-virtual {p1, v0}, Landroid/widget/Toast;->addCallback(Landroid/widget/Toast$Callback;)V

    goto :goto_6

    :cond_f
    const-string p1, "cancel"

    invoke-static {v0, p1}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    iget-object p1, p0, Led/c;->i:Landroid/widget/Toast;

    if-eqz p1, :cond_11

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/widget/Toast;->cancel()V

    :cond_10
    iput-object v2, p0, Led/c;->i:Landroid/widget/Toast;

    :cond_11
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_7

    :cond_12
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_7
    return-void
.end method
