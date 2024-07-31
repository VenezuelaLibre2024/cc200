.class public Lt7/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt7/n;-><init>(Landroid/content/Context;Lt7/k;Lu7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lt7/k;

.field public final synthetic b:Lu7/a;

.field public final synthetic c:Lt7/n;


# direct methods
.method public constructor <init>(Lt7/n;Lt7/k;Lu7/a;)V
    .locals 0

    iput-object p1, p0, Lt7/n$a;->c:Lt7/n;

    iput-object p2, p0, Lt7/n$a;->a:Lt7/k;

    iput-object p3, p0, Lt7/n$a;->b:Lu7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    iget-object v0, p0, Lt7/n$a;->c:Lt7/n;

    invoke-static {v0, p1}, Lt7/n;->a(Lt7/n;Z)Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt7/n$a;->a:Lt7/k;

    invoke-virtual {p1}, Lt7/k;->c()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt7/n$a;->c:Lt7/n;

    invoke-static {p1}, Lt7/n;->b(Lt7/n;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt7/n$a;->a:Lt7/k;

    iget-object v0, p0, Lt7/n$a;->c:Lt7/n;

    invoke-static {v0}, Lt7/n;->c(Lt7/n;)J

    move-result-wide v0

    iget-object v2, p0, Lt7/n$a;->b:Lu7/a;

    invoke-interface {v2}, Lu7/a;->a()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Lt7/k;->g(J)V

    :cond_1
    :goto_0
    return-void
.end method
