.class public Lu3/a0$m$a;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/a0$m;-><init>(Lu3/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu3/a0;

.field public final synthetic b:Lu3/a0$m;


# direct methods
.method public constructor <init>(Lu3/a0$m;Lu3/a0;)V
    .locals 0

    iput-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iput-object p2, p0, Lu3/a0$m$a;->a:Lu3/a0;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    iget-object p2, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p2, p2, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p2}, Lu3/a0;->E(Lu3/a0;)Landroid/media/AudioTrack;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p1, p1, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p1}, Lu3/a0;->F(Lu3/a0;)Lu3/t$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p1, p1, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p1}, Lu3/a0;->z(Lu3/a0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p1, p1, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p1}, Lu3/a0;->F(Lu3/a0;)Lu3/t$c;

    move-result-object p1

    invoke-interface {p1}, Lu3/t$c;->f()V

    :cond_1
    return-void
.end method

.method public onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object v0, v0, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {v0}, Lu3/a0;->E(Lu3/a0;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p1, p1, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p1}, Lu3/a0;->F(Lu3/a0;)Lu3/t$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p1, p1, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p1}, Lu3/a0;->z(Lu3/a0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu3/a0$m$a;->b:Lu3/a0$m;

    iget-object p1, p1, Lu3/a0$m;->c:Lu3/a0;

    invoke-static {p1}, Lu3/a0;->F(Lu3/a0;)Lu3/t$c;

    move-result-object p1

    invoke-interface {p1}, Lu3/t$c;->f()V

    :cond_1
    return-void
.end method
