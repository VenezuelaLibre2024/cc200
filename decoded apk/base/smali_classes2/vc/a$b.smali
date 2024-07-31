.class public Lvc/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lvc/a;",
            ">;"
        }
    .end annotation
.end field

.field public final i:J

.field public final j:J

.field public final k:F

.field public final l:F

.field public final m:F

.field public final n:F


# direct methods
.method public constructor <init>(Lvc/a;JFFFF)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lvc/a$b;->h:Ljava/lang/ref/WeakReference;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lvc/a$b;->j:J

    iput-wide p2, p0, Lvc/a$b;->i:J

    iput p4, p0, Lvc/a$b;->k:F

    iput p5, p0, Lvc/a$b;->l:F

    iput p6, p0, Lvc/a$b;->m:F

    iput p7, p0, Lvc/a$b;->n:F

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lvc/a$b;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvc/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lvc/a$b;->i:J

    iget-wide v5, p0, Lvc/a$b;->j:J

    sub-long/2addr v1, v5

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-float v1, v1

    const/4 v2, 0x0

    iget v3, p0, Lvc/a$b;->l:F

    iget-wide v4, p0, Lvc/a$b;->i:J

    long-to-float v4, v4

    invoke-static {v1, v2, v3, v4}, Luc/b;->a(FFFF)F

    move-result v2

    iget-wide v3, p0, Lvc/a$b;->i:J

    long-to-float v3, v3

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1

    iget v1, p0, Lvc/a$b;->k:F

    add-float/2addr v1, v2

    iget v2, p0, Lvc/a$b;->m:F

    iget v3, p0, Lvc/a$b;->n:F

    invoke-virtual {v0, v1, v2, v3}, Lvc/a;->F(FFF)V

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lvc/a;->B()V

    :goto_0
    return-void
.end method
