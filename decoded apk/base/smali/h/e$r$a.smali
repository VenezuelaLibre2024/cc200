.class public Lh/e$r$a;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh/e$r;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lh/e$r;


# direct methods
.method public constructor <init>(Lh/e$r;)V
    .locals 0

    iput-object p1, p0, Lh/e$r$a;->a:Lh/e$r;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lh/e$r$a;->a:Lh/e$r;

    invoke-virtual {p1}, Lh/e$r;->d()V

    return-void
.end method
