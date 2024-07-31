.class public final Led/c$a;
.super Landroid/widget/Toast$Callback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/c;->onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Led/c;


# direct methods
.method public constructor <init>(Led/c;)V
    .locals 0

    iput-object p1, p0, Led/c$a;->a:Led/c;

    invoke-direct {p0}, Landroid/widget/Toast$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onToastHidden()V
    .locals 2

    invoke-super {p0}, Landroid/widget/Toast$Callback;->onToastHidden()V

    iget-object v0, p0, Led/c$a;->a:Led/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Led/c;->b(Led/c;Landroid/widget/Toast;)V

    return-void
.end method
