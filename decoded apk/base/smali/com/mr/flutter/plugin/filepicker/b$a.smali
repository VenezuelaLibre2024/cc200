.class public Lcom/mr/flutter/plugin/filepicker/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/mr/flutter/plugin/filepicker/b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/flutter/plugin/filepicker/b;-><init>(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public askForPermission(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b$a;->a:Landroid/app/Activity;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1, p2}, Lx/b;->g(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method

.method public isPermissionGranted(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b$a;->a:Landroid/app/Activity;

    invoke-static {v0, p1}, Ly/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
