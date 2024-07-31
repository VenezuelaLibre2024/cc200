.class public final Lk0/b0$s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation


# instance fields
.field public final a:Lk0/w;


# direct methods
.method public constructor <init>(Lk0/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/b0$s;->a:Lk0/w;

    return-void
.end method


# virtual methods
.method public onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    invoke-static {p2}, Lk0/c;->g(Landroid/view/ContentInfo;)Lk0/c;

    move-result-object v0

    iget-object v1, p0, Lk0/b0$s;->a:Lk0/w;

    invoke-interface {v1, p1, v0}, Lk0/w;->a(Landroid/view/View;Lk0/c;)Lk0/c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p1}, Lk0/c;->f()Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
