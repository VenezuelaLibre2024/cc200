.class public final Lvn/hunghd/flutterdownloader/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn/hunghd/flutterdownloader/a$a;
    }
.end annotation


# static fields
.field public static final p:Lvn/hunghd/flutterdownloader/a$a;


# instance fields
.field public h:Lio/flutter/plugin/common/MethodChannel;

.field public i:Lff/h;

.field public j:Landroid/content/Context;

.field public k:J

.field public l:I

.field public m:I

.field public n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn/hunghd/flutterdownloader/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn/hunghd/flutterdownloader/a$a;-><init>(Ltd/g;)V

    sput-object v0, Lvn/hunghd/flutterdownloader/a;->p:Lvn/hunghd/flutterdownloader/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lvn/hunghd/flutterdownloader/a;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZ)Lc2/u;
    .locals 3

    new-instance v0, Lc2/l$a;

    const-class v1, Lvn/hunghd/flutterdownloader/DownloadWorker;

    invoke-direct {v0, v1}, Lc2/l$a;-><init>(Ljava/lang/Class;)V

    new-instance v1, Lc2/b$a;

    invoke-direct {v1}, Lc2/b$a;-><init>()V

    invoke-virtual {v1, p8}, Lc2/b$a;->c(Z)Lc2/b$a;

    move-result-object p8

    if-eqz p11, :cond_0

    sget-object p11, Lc2/k;->i:Lc2/k;

    goto :goto_0

    :cond_0
    sget-object p11, Lc2/k;->j:Lc2/k;

    :goto_0
    invoke-virtual {p8, p11}, Lc2/b$a;->b(Lc2/k;)Lc2/b$a;

    move-result-object p8

    invoke-virtual {p8}, Lc2/b$a;->a()Lc2/b;

    move-result-object p8

    invoke-virtual {v0, p8}, Lc2/u$a;->f(Lc2/b;)Lc2/u$a;

    move-result-object p8

    check-cast p8, Lc2/l$a;

    const-string p11, "flutter_download_task"

    invoke-virtual {p8, p11}, Lc2/u$a;->a(Ljava/lang/String;)Lc2/u$a;

    move-result-object p8

    check-cast p8, Lc2/l$a;

    sget-object p11, Lc2/a;->h:Lc2/a;

    const-wide/16 v0, 0xa

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p8, p11, v0, v1, v2}, Lc2/u$a;->e(Lc2/a;JLjava/util/concurrent/TimeUnit;)Lc2/u$a;

    move-result-object p8

    check-cast p8, Lc2/l$a;

    new-instance p11, Landroidx/work/b$a;

    invoke-direct {p11}, Landroidx/work/b$a;-><init>()V

    const-string v0, "url"

    invoke-virtual {p11, v0, p1}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    const-string p11, "saved_file"

    invoke-virtual {p1, p11, p2}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "file_name"

    invoke-virtual {p1, p2, p3}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "headers"

    invoke-virtual {p1, p2, p4}, Landroidx/work/b$a;->h(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "show_notification"

    invoke-virtual {p1, p2, p5}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "open_file_from_notification"

    invoke-virtual {p1, p2, p6}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "is_resume"

    invoke-virtual {p1, p2, p7}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object p1

    iget-wide p2, p0, Lvn/hunghd/flutterdownloader/a;->k:J

    const-string p4, "callback_handle"

    invoke-virtual {p1, p4, p2, p3}, Landroidx/work/b$a;->g(Ljava/lang/String;J)Landroidx/work/b$a;

    move-result-object p1

    iget p2, p0, Lvn/hunghd/flutterdownloader/a;->l:I

    const-string p3, "step"

    invoke-virtual {p1, p3, p2}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object p1

    iget p2, p0, Lvn/hunghd/flutterdownloader/a;->m:I

    const/4 p3, 0x0

    const/4 p4, 0x1

    if-ne p2, p4, :cond_1

    move p2, p4

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    const-string p5, "debug"

    invoke-virtual {p1, p5, p2}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object p1

    iget p2, p0, Lvn/hunghd/flutterdownloader/a;->n:I

    if-ne p2, p4, :cond_2

    move p3, p4

    :cond_2
    const-string p2, "ignoreSsl"

    invoke-virtual {p1, p2, p3}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "save_in_public_storage"

    invoke-virtual {p1, p2, p9}, Landroidx/work/b$a;->e(Ljava/lang/String;Z)Landroidx/work/b$a;

    move-result-object p1

    const-string p2, "timeout"

    invoke-virtual {p1, p2, p10}, Landroidx/work/b$a;->f(Ljava/lang/String;I)Landroidx/work/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/b$a;->a()Landroidx/work/b;

    move-result-object p1

    invoke-virtual {p8, p1}, Lc2/u$a;->g(Landroidx/work/b;)Lc2/u$a;

    move-result-object p1

    check-cast p1, Lc2/l$a;

    invoke-virtual {p1}, Lc2/u$a;->b()Lc2/u;

    move-result-object p1

    const-string p2, "Builder(DownloadWorker::\u2026   )\n            .build()"

    invoke-static {p1, p2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const-string v0, "task_id"

    invoke-virtual {p0, p1, v0}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v0

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc2/t;->b(Ljava/util/UUID;)Lc2/m;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v0

    const-string v1, "flutter_download_task"

    invoke-virtual {v0, v1}, Lc2/t;->a(Ljava/lang/String;)Lc2/m;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/io/File;)V
    .locals 14

    const-string v0, "_id"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x1

    new-array v8, v1, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v1, "file.absolutePath"

    invoke-static {p1, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    aput-object p1, v8, v1

    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v1, "EXTERNAL_CONTENT_URI"

    invoke-static {p1, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    const-string v1, "requireContext().contentResolver"

    invoke-static {v9, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "_data = ?"

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, v7

    move-object v4, v10

    move-object v5, v8

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    const-string v12, "withAppendedId(MediaStor\u2026EXTERNAL_CONTENT_URI, id)"

    const/4 v13, 0x0

    if-eqz v11, :cond_0

    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p1

    invoke-interface {v11, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {p1, v0, v1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1, v12}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, p1, v13, v13}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, v7

    move-object v4, v10

    move-object v5, v8

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v2, v0, v1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v12}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v0, v13, v13}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_0
    if-eqz v11, :cond_3

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    :cond_3
    return-void
.end method

.method public final e(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 25

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    const-string v1, "url"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ljava/lang/String;

    const-string v1, "saved_dir"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Ljava/lang/String;

    const-string v1, "file_name"

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Ljava/lang/String;

    const-string v1, "headers"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v20, v1

    check-cast v20, Ljava/lang/String;

    const-string v1, "timeout"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v10

    const-string v1, "show_notification"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v21

    const-string v1, "open_file_from_notification"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v22

    const-string v1, "requires_storage_not_low"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string v1, "save_in_public_storage"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    const-string v1, "allow_cellular"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object/from16 v2, v19

    move-object/from16 v3, v18

    move-object/from16 v4, v20

    move/from16 v5, v21

    move/from16 v6, v22

    move/from16 v9, v23

    move/from16 v11, v24

    invoke-virtual/range {v0 .. v11}, Lvn/hunghd/flutterdownloader/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZ)Lc2/u;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc2/t;->c(Lc2/u;)Lc2/m;

    invoke-virtual {v0}, Lc2/u;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v0, "request.id.toString()"

    invoke-static {v14, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    invoke-interface {v0, v14}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    sget-object v0, Lff/a;->i:Lff/a;

    const/4 v1, 0x0

    invoke-virtual {v12, v14, v0, v1}, Lvn/hunghd/flutterdownloader/a;->r(Ljava/lang/String;Lff/a;I)V

    iget-object v13, v12, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v13}, Ltd/m;->c(Ljava/lang/Object;)V

    const/16 v17, 0x0

    move-object/from16 v16, v0

    invoke-virtual/range {v13 .. v24}, Lff/h;->b(Ljava/lang/String;Ljava/lang/String;Lff/a;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    return-void
.end method

.method public final f(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<*>"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lvn/hunghd/flutterdownloader/a;->m:I

    const/4 v3, 0x2

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lvn/hunghd/flutterdownloader/a;->n:I

    iget-object p1, p0, Lvn/hunghd/flutterdownloader/a;->j:Landroid/content/Context;

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    const-string v4, "vn.hunghd.downloader.pref"

    invoke-virtual {p1, v4, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "callback_dispatcher_handle_key"

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_1
    invoke-interface {p2, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 6

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lff/h;->c()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lff/b;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v2}, Lff/b;->m()Ljava/lang/String;

    move-result-object v4

    const-string v5, "task_id"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->l()Lff/a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "status"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->g()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "progress"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->o()Ljava/lang/String;

    move-result-object v4

    const-string v5, "url"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "file_name"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->j()Ljava/lang/String;

    move-result-object v4

    const-string v5, "saved_dir"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->n()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "time_created"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lff/b;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v4, "allow_cellular"

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    const-string v0, "query"

    invoke-virtual {p0, p1, v0}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lff/h;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lff/b;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Lff/b;->m()Ljava/lang/String;

    move-result-object v3

    const-string v4, "task_id"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->l()Lff/a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "status"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->g()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "progress"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->o()Ljava/lang/String;

    move-result-object v3

    const-string v4, "url"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "file_name"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->j()Ljava/lang/String;

    move-result-object v3

    const-string v4, "saved_dir"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->n()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "time_created"

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lff/b;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "allow_cellular"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lvn/hunghd/flutterdownloader/a;->h:Lio/flutter/plugin/common/MethodChannel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, Lvn/hunghd/flutterdownloader/a;->j:Landroid/content/Context;

    new-instance p1, Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "vn.hunghd/downloader"

    invoke-direct {p1, p2, v1}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object p1, p0, Lvn/hunghd/flutterdownloader/a;->h:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    sget-object p1, Lvn/hunghd/flutterdownloader/b;->h:Lvn/hunghd/flutterdownloader/b$a;

    iget-object p2, p0, Lvn/hunghd/flutterdownloader/a;->j:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lvn/hunghd/flutterdownloader/b$a;->a(Landroid/content/Context;)Lvn/hunghd/flutterdownloader/b;

    move-result-object p1

    new-instance p2, Lff/h;

    invoke-direct {p2, p1}, Lff/h;-><init>(Lvn/hunghd/flutterdownloader/b;)V

    iput-object p2, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    sget-object p1, Lgd/s;->a:Lgd/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final j(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 8

    const-string v0, "task_id"

    invoke-virtual {p0, p1, v0}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lff/h;->d(Ljava/lang/String;)Lff/b;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not found task with id "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "invalid_task_id"

    invoke-interface {p2, v0, p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lff/b;->l()Lff/a;

    move-result-object p1

    sget-object v2, Lff/a;->k:Lff/a;

    if-eq p1, v2, :cond_1

    const-string p1, "invalid_status"

    const-string v0, "only completed tasks can be opened"

    invoke-interface {p2, p1, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lff/b;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lff/b;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lff/b;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "/"

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lae/o;->J(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v2, p1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lff/f;->a:Lff/f;

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Lff/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, p1, v0}, Lff/f;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    const-string v0, "task_id"

    invoke-virtual {p0, p1, v0}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v0}, Ltd/m;->c(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lff/h;->j(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v0

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc2/t;->b(Ljava/util/UUID;)Lc2/m;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object p1, p1, Lio/flutter/plugin/common/MethodCall;->arguments:Ljava/lang/Object;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<*>"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lvn/hunghd/flutterdownloader/a;->k:J

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lvn/hunghd/flutterdownloader/a;->l:I

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 9

    const-string v0, "task_id"

    invoke-virtual {p0, p1, v0}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "should_delete_content"

    invoke-virtual {p0, p1, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lff/h;->d(Ljava/lang/String;)Lff/b;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lff/b;->l()Lff/a;

    move-result-object v3

    sget-object v4, Lff/a;->i:Lff/a;

    if-eq v3, v4, :cond_0

    invoke-virtual {v1}, Lff/b;->l()Lff/a;

    move-result-object v3

    sget-object v4, Lff/a;->j:Lff/a;

    if-ne v3, v4, :cond_1

    :cond_0
    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v3

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3, v4}, Lc2/t;->b(Ljava/util/UUID;)Lc2/m;

    :cond_1
    if-eqz p1, :cond_3

    invoke-virtual {v1}, Lff/b;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {v1}, Lff/b;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Lff/b;->o()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "/"

    invoke-static/range {v3 .. v8}, Lae/o;->J(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1}, Lff/b;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p1, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lff/b;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_3

    :try_start_0
    invoke-virtual {p0, v3}, Lvn/hunghd/flutterdownloader/a;->d(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "FlutterDownloader"

    const-string v4, "Failed to delete file in media store, will fall back to normal delete()"

    invoke-static {p1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :cond_3
    iget-object p1, p0, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {p1}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lff/h;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lx/o;->f(Landroid/content/Context;)Lx/o;

    move-result-object p1

    invoke-virtual {v1}, Lff/b;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Lx/o;->b(I)V

    invoke-interface {p2, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    const-string p1, "invalid_task_id"

    const-string v0, "not found task corresponding to given task id"

    invoke-interface {p2, p1, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/flutter/plugin/common/MethodCall;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Required key \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' was null"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final o()Landroid/content/Context;
    .locals 2

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->j:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    const-string v1, "binding.binaryMessenger"

    invoke-static {p1, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lvn/hunghd/flutterdownloader/a;->i(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lvn/hunghd/flutterdownloader/a;->j:Landroid/content/Context;

    iget-object v0, p0, Lvn/hunghd/flutterdownloader/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    :cond_0
    iput-object p1, p0, Lvn/hunghd/flutterdownloader/a;->h:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string p1, "loadTasks"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lvn/hunghd/flutterdownloader/a;->g(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "initialize"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->f(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_2
    const-string p1, "cancelAll"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p0, p2}, Lvn/hunghd/flutterdownloader/a;->c(Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "loadTasksWithRawQuery"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->h(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_4
    const-string v1, "retry"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->q(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto/16 :goto_1

    :sswitch_5
    const-string v1, "pause"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_6
    const-string v1, "open"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->j(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_7
    const-string v1, "registerCallback"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->l(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_8
    const-string v1, "resume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_9
    const-string v1, "remove"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->m(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_a
    const-string v1, "cancel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->b(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :sswitch_b
    const-string v1, "enqueue"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    invoke-virtual {p0, p1, p2}, Lvn/hunghd/flutterdownloader/a;->e(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    goto :goto_1

    :cond_c
    :goto_0
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5f0671f8 -> :sswitch_b
        -0x5185d186 -> :sswitch_a
        -0x37b5077c -> :sswitch_9
        -0x37b237d3 -> :sswitch_8
        -0x18089ff8 -> :sswitch_7
        0x34264a -> :sswitch_6
        0x65825f6 -> :sswitch_5
        0x67622a8 -> :sswitch_4
        0xdbb46ce -> :sswitch_3
        0x1c6788c7 -> :sswitch_2
        0x33ebcb90 -> :sswitch_1
        0x522fe648 -> :sswitch_0
    .end sparse-switch
.end method

.method public final p(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 16

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    move-object/from16 v13, p2

    const-string v1, "task_id"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ljava/lang/String;

    iget-object v1, v12, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v14}, Lff/h;->d(Ljava/lang/String;)Lff/b;

    move-result-object v15

    const-string v1, "requires_storage_not_low"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string v1, "timeout"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    const/4 v0, 0x0

    if-eqz v15, :cond_3

    invoke-virtual {v15}, Lff/b;->l()Lff/a;

    move-result-object v1

    sget-object v2, Lff/a;->n:Lff/a;

    if-ne v1, v2, :cond_2

    invoke-virtual {v15}, Lff/b;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v15}, Lff/b;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15}, Lff/b;->o()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "/"

    invoke-static/range {v2 .. v7}, Lae/o;->J(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v15}, Lff/b;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15}, Lff/b;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v15}, Lff/b;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15}, Lff/b;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15}, Lff/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15}, Lff/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15}, Lff/b;->k()Z

    move-result v5

    invoke-virtual {v15}, Lff/b;->e()Z

    move-result v6

    const/4 v7, 0x1

    invoke-virtual {v15}, Lff/b;->i()Z

    move-result v9

    invoke-virtual {v15}, Lff/b;->a()Z

    move-result v11

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v11}, Lvn/hunghd/flutterdownloader/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZ)Lc2/u;

    move-result-object v0

    invoke-virtual {v0}, Lc2/u;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v1, "request.id.toString()"

    invoke-static {v4, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v13, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    sget-object v5, Lff/a;->j:Lff/a;

    invoke-virtual {v15}, Lff/b;->g()I

    move-result v1

    invoke-virtual {v12, v4, v5, v1}, Lvn/hunghd/flutterdownloader/a;->r(Ljava/lang/String;Lff/a;I)V

    iget-object v2, v12, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lff/b;->g()I

    move-result v6

    const/4 v7, 0x0

    move-object v3, v14

    invoke-virtual/range {v2 .. v7}, Lff/h;->h(Ljava/lang/String;Ljava/lang/String;Lff/a;IZ)V

    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc2/t;->c(Lc2/u;)Lc2/m;

    goto :goto_1

    :cond_1
    iget-object v1, v12, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v14, v2}, Lff/h;->j(Ljava/lang/String;Z)V

    const-string v1, "invalid_data"

    const-string v2, "not found partial downloaded data, this task cannot be resumed"

    goto :goto_0

    :cond_2
    const-string v1, "invalid_status"

    const-string v2, "only paused task can be resumed"

    goto :goto_0

    :cond_3
    const-string v1, "invalid_task_id"

    const-string v2, "not found task corresponding to given task id"

    :goto_0
    invoke-interface {v13, v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final q(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 16

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    move-object/from16 v13, p2

    const-string v1, "task_id"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Ljava/lang/String;

    iget-object v1, v12, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v1}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v14}, Lff/h;->d(Ljava/lang/String;)Lff/b;

    move-result-object v15

    const-string v1, "requires_storage_not_low"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string v1, "timeout"

    invoke-virtual {v12, v0, v1}, Lvn/hunghd/flutterdownloader/a;->n(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    const/4 v0, 0x0

    if-eqz v15, :cond_2

    invoke-virtual {v15}, Lff/b;->l()Lff/a;

    move-result-object v1

    sget-object v2, Lff/a;->l:Lff/a;

    if-eq v1, v2, :cond_1

    invoke-virtual {v15}, Lff/b;->l()Lff/a;

    move-result-object v1

    sget-object v2, Lff/a;->m:Lff/a;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "invalid_status"

    const-string v2, "only failed and canceled task can be retried"

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v15}, Lff/b;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15}, Lff/b;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15}, Lff/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15}, Lff/b;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15}, Lff/b;->k()Z

    move-result v5

    invoke-virtual {v15}, Lff/b;->e()Z

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v15}, Lff/b;->i()Z

    move-result v9

    invoke-virtual {v15}, Lff/b;->a()Z

    move-result v11

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v11}, Lvn/hunghd/flutterdownloader/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZIZ)Lc2/u;

    move-result-object v0

    invoke-virtual {v0}, Lc2/u;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v1, "request.id.toString()"

    invoke-static {v4, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v13, v4}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    sget-object v5, Lff/a;->i:Lff/a;

    invoke-virtual {v15}, Lff/b;->g()I

    move-result v1

    invoke-virtual {v12, v4, v5, v1}, Lvn/hunghd/flutterdownloader/a;->r(Ljava/lang/String;Lff/a;I)V

    iget-object v2, v12, Lvn/hunghd/flutterdownloader/a;->i:Lff/h;

    invoke-static {v2}, Ltd/m;->c(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lff/b;->g()I

    move-result v6

    move-object v3, v14

    invoke-virtual/range {v2 .. v7}, Lff/h;->h(Ljava/lang/String;Ljava/lang/String;Lff/a;IZ)V

    invoke-virtual/range {p0 .. p0}, Lvn/hunghd/flutterdownloader/a;->o()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lc2/t;->e(Landroid/content/Context;)Lc2/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc2/t;->c(Lc2/u;)Lc2/m;

    goto :goto_2

    :cond_2
    const-string v1, "invalid_task_id"

    const-string v2, "not found task corresponding to given task id"

    :goto_1
    invoke-interface {v13, v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public final r(Ljava/lang/String;Lff/a;I)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "task_id"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "status"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "progress"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lvn/hunghd/flutterdownloader/a;->h:Lio/flutter/plugin/common/MethodChannel;

    if-eqz p1, :cond_0

    const-string p2, "updateProgress"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
