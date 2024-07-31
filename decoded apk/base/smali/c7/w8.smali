.class public final Lc7/w8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/pc;


# instance fields
.field public final synthetic a:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;)V
    .locals 0

    iput-object p1, p0, Lc7/w8;->a:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "auto"

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/w8;->a:Lc7/w7;

    invoke-virtual {v0, v1, p2, p3, p1}, Lc7/w7;->U(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lc7/w8;->a:Lc7/w7;

    invoke-virtual {p1, v1, p2, p3}, Lc7/w7;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
