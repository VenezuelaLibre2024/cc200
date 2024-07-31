.class public Lca/f$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final a:Lca/f$g;

.field public final b:Lz6/m;

.field public final c:Lcom/google/android/gms/maps/model/LatLng;

.field public final d:Lcom/google/android/gms/maps/model/LatLng;

.field public e:Z

.field public f:Lda/b;

.field public final synthetic g:Lca/f;


# direct methods
.method public constructor <init>(Lca/f;Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lca/f$c;->g:Lca/f;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lca/f$c;->a:Lca/f$g;

    invoke-static {p2}, Lca/f$g;->c(Lca/f$g;)Lz6/m;

    move-result-object p1

    iput-object p1, p0, Lca/f$c;->b:Lz6/m;

    iput-object p3, p0, Lca/f$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p4, p0, Lca/f$c;->d:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public synthetic constructor <init>(Lca/f;Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lca/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lca/f$c;-><init>(Lca/f;Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-static {}, Lca/f;->access$2200()Landroid/animation/TimeInterpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lca/f$c;->g:Lca/f;

    invoke-static {v1}, Lca/f;->access$2300(Lca/f;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b(Lda/b;)V
    .locals 0

    iput-object p1, p0, Lca/f$c;->f:Lda/b;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lca/f$c;->e:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-boolean p1, p0, Lca/f$c;->e:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lca/f$c;->g:Lca/f;

    invoke-static {p1}, Lca/f;->access$300(Lca/f;)Lca/f$e;

    move-result-object p1

    iget-object v0, p0, Lca/f$c;->b:Lz6/m;

    invoke-virtual {p1, v0}, Lca/f$e;->d(Lz6/m;)V

    iget-object p1, p0, Lca/f$c;->g:Lca/f;

    invoke-static {p1}, Lca/f;->access$2000(Lca/f;)Lca/f$e;

    move-result-object p1

    iget-object v0, p0, Lca/f$c;->b:Lz6/m;

    invoke-virtual {p1, v0}, Lca/f$e;->d(Lz6/m;)V

    iget-object p1, p0, Lca/f$c;->f:Lda/b;

    iget-object v0, p0, Lca/f$c;->b:Lz6/m;

    invoke-virtual {p1, v0}, Lda/b;->d(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Lca/f$c;->a:Lca/f$g;

    iget-object v0, p0, Lca/f$c;->d:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1, v0}, Lca/f$g;->b(Lca/f$g;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 12

    iget-object v0, p0, Lca/f$c;->d:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lca/f$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lca/f$c;->b:Lz6/m;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget-object v0, p0, Lca/f$c;->d:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->h:D

    iget-object v3, p0, Lca/f$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v4, v3, Lcom/google/android/gms/maps/model/LatLng;->h:D

    sub-double/2addr v1, v4

    float-to-double v6, p1

    mul-double/2addr v1, v6

    add-double/2addr v1, v4

    iget-wide v4, v0, Lcom/google/android/gms/maps/model/LatLng;->i:D

    iget-wide v8, v3, Lcom/google/android/gms/maps/model/LatLng;->i:D

    sub-double/2addr v4, v8

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v8

    const-wide v10, 0x4066800000000000L    # 180.0

    cmpl-double p1, v8, v10

    if-lez p1, :cond_1

    invoke-static {v4, v5}, Ljava/lang/Math;->signum(D)D

    move-result-wide v8

    const-wide v10, 0x4076800000000000L    # 360.0

    mul-double/2addr v8, v10

    sub-double/2addr v4, v8

    :cond_1
    mul-double/2addr v4, v6

    iget-object p1, p0, Lca/f$c;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v6, p1, Lcom/google/android/gms/maps/model/LatLng;->i:D

    add-double/2addr v4, v6

    new-instance p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p1, v1, v2, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v0, p0, Lca/f$c;->b:Lz6/m;

    invoke-virtual {v0, p1}, Lz6/m;->n(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_2
    :goto_0
    return-void
.end method
