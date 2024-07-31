.class public Lbd/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public h:Lio/flutter/plugin/common/MethodChannel$Result;

.field public i:Z

.field public final synthetic j:Lbd/b;


# direct methods
.method public constructor <init>(Lbd/b;)V
    .locals 0

    iput-object p1, p0, Lbd/b$b;->j:Lbd/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbd/b;Lbd/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lbd/b$b;-><init>(Lbd/b;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lbd/b$b;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lbd/b$b;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 7

    iget-object v0, p0, Lbd/b$b;->j:Lbd/b;

    invoke-static {v0}, Lbd/b;->a(Lbd/b;)Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {}, Lbd/b;->c()[Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v5, v0

    const-string v4, "contact_id = ?"

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lbd/b$b;->j:Lbd/b;

    iget-boolean v1, p0, Lbd/b$b;->i:Z

    invoke-static {v0, p1, v1}, Lbd/b;->d(Lbd/b;Landroid/database/Cursor;Z)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbd/a;

    invoke-virtual {p1}, Lbd/a;->f()Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception v0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0
.end method

.method public c()V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.INSERT"

    sget-object v2, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "finishActivityOnSaveCompleted"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const v1, 0xcecd

    invoke-virtual {p0, v0, v1}, Lbd/b$b;->h(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public d()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.PICK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "vnd.android.cursor.dir/contact"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const v1, 0xcecf

    invoke-virtual {p0, v0, v1}, Lbd/b$b;->h(Landroid/content/Intent;I)V

    return-void
.end method

.method public e(Lbd/a;)V
    .locals 3

    iget-object p1, p1, Lbd/a;->h:Ljava/lang/String;

    const/4 v0, 0x2

    :try_start_0
    invoke-virtual {p0, p1}, Lbd/b$b;->b(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1, p1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.EDIT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "vnd.android.cursor.item/contact"

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "finishActivityOnSaveCompleted"

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const p1, 0xcece

    invoke-virtual {p0, v1, p1}, Lbd/b$b;->h(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd/b$b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd/b$b;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lbd/b$b;->i:Z

    return-void
.end method

.method public g(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Lbd/b$b;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method

.method public h(Landroid/content/Intent;I)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 10

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0xcece

    if-eq p1, v2, :cond_4

    const v2, 0xcecd

    if-ne p1, v2, :cond_0

    goto :goto_1

    :cond_0
    const v2, 0xcecf

    if-ne p1, v2, :cond_3

    if-nez p2, :cond_1

    invoke-virtual {p0, v1}, Lbd/b$b;->a(Ljava/lang/Object;)V

    return v0

    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    iget-object p2, p0, Lbd/b$b;->j:Lbd/b;

    invoke-static {p2}, Lbd/b;->a(Lbd/b;)Landroid/content/ContentResolver;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v4

    iget-object v2, p0, Lbd/b$b;->j:Lbd/b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-boolean v8, p0, Lbd/b$b;->i:Z

    iget-object v9, p0, Lbd/b$b;->h:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v3, "openDeviceContactPicker"

    invoke-static/range {v2 .. v9}, Lbd/b;->b(Lbd/b;Ljava/lang/String;Ljava/lang/String;ZZZZLio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_0

    :cond_2
    const-string p1, "flutter_contacts"

    const-string p3, "onActivityResult - cursor.moveToFirst() returns false"

    invoke-static {p1, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v1}, Lbd/b$b;->a(Ljava/lang/Object;)V

    :goto_0
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    return v0

    :cond_3
    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd/b$b;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    :try_start_0
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd/b$b;->b(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd/b$b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    invoke-virtual {p0, v1}, Lbd/b$b;->a(Ljava/lang/Object;)V

    :goto_2
    return v0
.end method
