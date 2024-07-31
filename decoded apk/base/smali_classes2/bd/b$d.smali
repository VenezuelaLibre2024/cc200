.class public Lbd/b$d;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbd/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "[B>;"
    }
.end annotation


# instance fields
.field public final a:Lbd/a;

.field public final b:Z

.field public final c:Landroid/content/ContentResolver;

.field public final d:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Lbd/a;ZLandroid/content/ContentResolver;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lbd/b$d;->a:Lbd/a;

    iput-boolean p2, p0, Lbd/b$d;->b:Z

    iput-object p3, p0, Lbd/b$d;->c:Landroid/content/ContentResolver;

    iput-object p4, p0, Lbd/b$d;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)[B
    .locals 2

    iget-object p1, p0, Lbd/b$d;->a:Lbd/a;

    iget-object p1, p1, Lbd/a;->h:Ljava/lang/String;

    iget-boolean v0, p0, Lbd/b$d;->b:Z

    iget-object v1, p0, Lbd/b$d;->c:Landroid/content/ContentResolver;

    invoke-static {p1, v0, v1}, Lbd/b;->h(Ljava/lang/String;ZLandroid/content/ContentResolver;)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B)V
    .locals 1

    iget-object v0, p0, Lbd/b$d;->d:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lbd/b$d;->a([Ljava/lang/Void;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lbd/b$d;->b([B)V

    return-void
.end method
