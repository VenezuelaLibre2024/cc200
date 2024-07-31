.class public Lbd/b$e;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x3
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/util/ArrayList<",
        "Ljava/util/HashMap;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lio/flutter/plugin/common/MethodChannel$Result;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public final synthetic g:Lbd/b;


# direct methods
.method public constructor <init>(Lbd/b;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;ZZZZ)V
    .locals 0

    iput-object p1, p0, Lbd/b$e;->g:Lbd/b;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lbd/b$e;->a:Ljava/lang/String;

    iput-object p3, p0, Lbd/b$e;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-boolean p4, p0, Lbd/b$e;->c:Z

    iput-boolean p5, p0, Lbd/b$e;->d:Z

    iput-boolean p6, p0, Lbd/b$e;->e:Z

    iput-boolean p7, p0, Lbd/b$e;->f:Z

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/util/HashMap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbd/b$e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "getContacts"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "getContactsForPhone"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "getContactsForEmail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "openDeviceContactPicker"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move v3, v2

    :goto_0
    const/4 v0, 0x0

    packed-switch v3, :pswitch_data_0

    return-object v0

    :pswitch_0
    iget-object v1, p0, Lbd/b$e;->g:Lbd/b;

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1, p1, v0}, Lbd/b;->e(Lbd/b;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_2

    :pswitch_1
    iget-object v0, p0, Lbd/b$e;->g:Lbd/b;

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lbd/b;->f(Lbd/b;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    :goto_1
    iget-boolean v1, p0, Lbd/b$e;->f:Z

    invoke-static {v0, p1, v1}, Lbd/b;->d(Lbd/b;Landroid/database/Cursor;Z)Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_3

    :pswitch_2
    iget-object v0, p0, Lbd/b$e;->g:Lbd/b;

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lbd/b;->g(Lbd/b;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    iget-object v1, p0, Lbd/b$e;->g:Lbd/b;

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lbd/b;->e(Lbd/b;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    :goto_2
    iget-boolean v0, p0, Lbd/b$e;->f:Z

    invoke-static {v1, p1, v0}, Lbd/b;->d(Lbd/b;Landroid/database/Cursor;Z)Ljava/util/ArrayList;

    move-result-object p1

    :goto_3
    iget-boolean v0, p0, Lbd/b$e;->c:Z

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbd/a;

    iget-object v3, v1, Lbd/a;->h:Ljava/lang/String;

    iget-boolean v4, p0, Lbd/b$e;->d:Z

    iget-object v5, p0, Lbd/b$e;->g:Lbd/b;

    invoke-static {v5}, Lbd/b;->a(Lbd/b;)Landroid/content/ContentResolver;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lbd/b;->h(Ljava/lang/String;ZLandroid/content/ContentResolver;)[B

    move-result-object v3

    if-eqz v3, :cond_4

    iput-object v3, v1, Lbd/a;->x:[B

    goto :goto_4

    :cond_4
    new-array v3, v2, [B

    iput-object v3, v1, Lbd/a;->x:[B

    goto :goto_4

    :cond_5
    iget-boolean v0, p0, Lbd/b$e;->e:Z

    if-eqz v0, :cond_6

    new-instance v0, Lbd/b$e$a;

    invoke-direct {v0, p0}, Lbd/b$e$a;-><init>(Lbd/b$e;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbd/a;

    invoke-virtual {v1}, Lbd/a;->f()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x6d221892 -> :sswitch_3
        -0x1d3c72c4 -> :sswitch_2
        -0x1ca380f2 -> :sswitch_1
        0x5a079dc9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/HashMap;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lbd/b$e;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {p1}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbd/b$e;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    invoke-virtual {p0, p1}, Lbd/b$e;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lbd/b$e;->b(Ljava/util/ArrayList;)V

    return-void
.end method
