.class public Lvc/a$a;
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
    name = "a"
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

.field public final o:F

.field public final p:F

.field public final q:Z


# direct methods
.method public constructor <init>(Lvc/a;JFFFFFFZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lvc/a$a;->h:Ljava/lang/ref/WeakReference;

    iput-wide p2, p0, Lvc/a$a;->i:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lvc/a$a;->j:J

    iput p4, p0, Lvc/a$a;->k:F

    iput p5, p0, Lvc/a$a;->l:F

    iput p6, p0, Lvc/a$a;->m:F

    iput p7, p0, Lvc/a$a;->n:F

    iput p8, p0, Lvc/a$a;->o:F

    iput p9, p0, Lvc/a$a;->p:F

    iput-boolean p10, p0, Lvc/a$a;->q:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lvc/a$a;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvc/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lvc/a$a;->i:J

    iget-wide v5, p0, Lvc/a$a;->j:J

    sub-long/2addr v1, v5

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-float v1, v1

    iget v2, p0, Lvc/a$a;->m:F

    iget-wide v3, p0, Lvc/a$a;->i:J

    long-to-float v3, v3

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Luc/b;->b(FFFF)F

    move-result v2

    iget v3, p0, Lvc/a$a;->n:F

    iget-wide v5, p0, Lvc/a$a;->i:J

    long-to-float v5, v5

    invoke-static {v1, v4, v3, v5}, Luc/b;->b(FFFF)F

    move-result v3

    iget v5, p0, Lvc/a$a;->p:F

    iget-wide v6, p0, Lvc/a$a;->i:J

    long-to-float v6, v6

    invoke-static {v1, v4, v5, v6}, Luc/b;->a(FFFF)F

    move-result v4

    iget-wide v5, p0, Lvc/a$a;->i:J

    long-to-float v5, v5

    cmpg-float v1, v1, v5

    if-gez v1, :cond_2

    iget-object v1, v0, Lvc/b;->l:[F

    const/4 v5, 0x0

    aget v5, v1, v5

    iget v6, p0, Lvc/a$a;->k:F

    sub-float/2addr v5, v6

    sub-float/2addr v2, v5

    const/4 v5, 0x1

    aget v1, v1, v5

    iget v5, p0, Lvc/a$a;->l:F

    sub-float/2addr v1, v5

    sub-float/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Lvc/b;->o(FF)V

    iget-boolean v1, p0, Lvc/a$a;->q:Z

    if-nez v1, :cond_1

    iget v1, p0, Lvc/a$a;->o:F

    add-float/2addr v1, v4

    invoke-static {v0}, Lvc/a;->r(Lvc/a;)Landroid/graphics/RectF;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    invoke-static {v0}, Lvc/a;->r(Lvc/a;)Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lvc/a;->F(FFF)V

    :cond_1
    invoke-virtual {v0}, Lvc/a;->x()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method