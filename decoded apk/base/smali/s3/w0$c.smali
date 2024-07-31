.class public final Ls3/w0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq5/w;
.implements Lu3/s;
.implements Ld5/n;
.implements Lk4/e;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lr5/f$a;
.implements Ls3/d$b;
.implements Ls3/b$b;
.implements Ls3/p3$b;
.implements Ls3/r$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic h:Ls3/w0;


# direct methods
.method public constructor <init>(Ls3/w0;)V
    .locals 0

    iput-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls3/w0;Ls3/w0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/w0$c;-><init>(Ls3/w0;)V

    return-void
.end method

.method public static synthetic C(Lk4/a;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0$c;->N(Lk4/a;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic D(Lq5/y;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0$c;->R(Lq5/y;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic E(IZLs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls3/w0$c;->Q(IZLs3/b3$d;)V

    return-void
.end method

.method public static synthetic F(Ld5/e;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0$c;->L(Ld5/e;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic G(Ljava/util/List;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0$c;->K(Ljava/util/List;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic H(Ls3/w0$c;Ls3/b3$d;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/w0$c;->M(Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic I(Ls3/o;Ls3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0$c;->P(Ls3/o;Ls3/b3$d;)V

    return-void
.end method

.method public static synthetic J(ZLs3/b3$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls3/w0$c;->O(ZLs3/b3$d;)V

    return-void
.end method

.method public static synthetic K(Ljava/util/List;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onCues(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic L(Ld5/e;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onCues(Ld5/e;)V

    return-void
.end method

.method private synthetic M(Ls3/b3$d;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->u0(Ls3/w0;)Ls3/z1;

    move-result-object v0

    invoke-interface {p1, v0}, Ls3/b3$d;->onMediaMetadataChanged(Ls3/z1;)V

    return-void
.end method

.method public static synthetic N(Lk4/a;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onMetadata(Lk4/a;)V

    return-void
.end method

.method public static synthetic O(ZLs3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onSkipSilenceEnabledChanged(Z)V

    return-void
.end method

.method public static synthetic P(Ls3/o;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onDeviceInfoChanged(Ls3/o;)V

    return-void
.end method

.method public static synthetic Q(IZLs3/b3$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Ls3/b3$d;->onDeviceVolumeChanged(IZ)V

    return-void
.end method

.method public static synthetic R(Lq5/y;Ls3/b3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls3/b3$d;->onVideoSizeChanged(Lq5/y;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ls3/m1;Lv3/i;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->K0(Ls3/w0;Ls3/m1;)Ls3/m1;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt3/a;->c(Ls3/m1;Lv3/i;)V

    return-void
.end method

.method public d(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lt3/a;->d(Ljava/lang/String;JJ)V

    return-void
.end method

.method public e(Ls3/m1;Lv3/i;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->n0(Ls3/w0;Ls3/m1;)Ls3/m1;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt3/a;->e(Ls3/m1;Lv3/i;)V

    return-void
.end method

.method public f(Lv3/e;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->I0(Ls3/w0;Lv3/e;)Lv3/e;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->f(Lv3/e;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->g(Ljava/lang/String;)V

    return-void
.end method

.method public h(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lt3/a;->h(Ljava/lang/String;JJ)V

    return-void
.end method

.method public i(IJ)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lt3/a;->i(IJ)V

    return-void
.end method

.method public j(Lv3/e;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->j(Lv3/e;)V

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/w0;->n0(Ls3/w0;Ls3/m1;)Ls3/m1;

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1, v0}, Ls3/w0;->O0(Ls3/w0;Lv3/e;)Lv3/e;

    return-void
.end method

.method public k(Ljava/lang/Object;J)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lt3/a;->k(Ljava/lang/Object;J)V

    iget-object p2, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p2}, Ls3/w0;->N0(Ls3/w0;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object p1

    const/16 p2, 0x1a

    sget-object p3, Ls3/f1;->a:Ls3/f1;

    invoke-virtual {p1, p2, p3}, Lp5/q;->k(ILp5/q$a;)V

    :cond_0
    return-void
.end method

.method public l(J)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lt3/a;->l(J)V

    return-void
.end method

.method public m(Lv3/e;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->O0(Ls3/w0;Lv3/e;)Lv3/e;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->m(Lv3/e;)V

    return-void
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->n(Ljava/lang/Exception;)V

    return-void
.end method

.method public o(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->o(Ljava/lang/Exception;)V

    return-void
.end method

.method public onCues(Ld5/e;)V
    .locals 2

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->q0(Ls3/w0;Ld5/e;)Ld5/e;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    new-instance v1, Ls3/y0;

    invoke-direct {v1, p1}, Ls3/y0;-><init>(Ld5/e;)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method

.method public onCues(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld5/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    new-instance v1, Ls3/z0;

    invoke-direct {v1, p1}, Ls3/z0;-><init>(Ljava/util/List;)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method

.method public onMetadata(Lk4/a;)V
    .locals 3

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->r0(Ls3/w0;)Ls3/z1;

    move-result-object v1

    invoke-virtual {v1}, Ls3/z1;->b()Ls3/z1$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls3/z1$b;->L(Lk4/a;)Ls3/z1$b;

    move-result-object v1

    invoke-virtual {v1}, Ls3/z1$b;->H()Ls3/z1;

    move-result-object v1

    invoke-static {v0, v1}, Ls3/w0;->s0(Ls3/w0;Ls3/z1;)Ls3/z1;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->t0(Ls3/w0;)Ls3/z1;

    move-result-object v0

    iget-object v1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v1}, Ls3/w0;->u0(Ls3/w0;)Ls3/z1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/z1;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v1, v0}, Ls3/w0;->v0(Ls3/w0;Ls3/z1;)Ls3/z1;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    const/16 v1, 0xe

    new-instance v2, Ls3/d1;

    invoke-direct {v2, p0}, Ls3/d1;-><init>(Ls3/w0$c;)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->i(ILp5/q$a;)V

    :cond_0
    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    const/16 v1, 0x1c

    new-instance v2, Ls3/a1;

    invoke-direct {v2, p1}, Ls3/a1;-><init>(Lk4/a;)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->i(ILp5/q$a;)V

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object p1

    invoke-virtual {p1}, Lp5/q;->f()V

    return-void
.end method

.method public onSkipSilenceEnabledChanged(Z)V
    .locals 3

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->o0(Ls3/w0;)Z

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->p0(Ls3/w0;Z)Z

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    const/16 v1, 0x17

    new-instance v2, Ls3/e1;

    invoke-direct {v2, p1}, Ls3/e1;-><init>(Z)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->z0(Ls3/w0;Landroid/graphics/SurfaceTexture;)V

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1, p2, p3}, Ls3/w0;->y0(Ls3/w0;II)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/w0;->x0(Ls3/w0;Ljava/lang/Object;)V

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Ls3/w0;->y0(Ls3/w0;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1, p2, p3}, Ls3/w0;->y0(Ls3/w0;II)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public onVideoSizeChanged(Lq5/y;)V
    .locals 2

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->L0(Ls3/w0;Lq5/y;)Lq5/y;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    new-instance v1, Ls3/b1;

    invoke-direct {v1, p1}, Ls3/b1;-><init>(Lq5/y;)V

    const/16 p1, 0x19

    invoke-virtual {v0, p1, v1}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method

.method public p(Lv3/e;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lt3/a;->p(Lv3/e;)V

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/w0;->K0(Ls3/w0;Ls3/m1;)Ls3/m1;

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1, v0}, Ls3/w0;->I0(Ls3/w0;Lv3/e;)Lv3/e;

    return-void
.end method

.method public q(IJJ)V
    .locals 7

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lt3/a;->q(IJJ)V

    return-void
.end method

.method public r(JI)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->J0(Ls3/w0;)Lt3/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lt3/a;->r(JI)V

    return-void
.end method

.method public s(I)V
    .locals 3

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1}, Ls3/w0;->D0(Ls3/w0;)Ls3/p3;

    move-result-object p1

    invoke-static {p1}, Ls3/w0;->E0(Ls3/p3;)Ls3/o;

    move-result-object p1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->F0(Ls3/w0;)Ls3/o;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls3/o;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->G0(Ls3/w0;Ls3/o;)Ls3/o;

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    const/16 v1, 0x1d

    new-instance v2, Ls3/c1;

    invoke-direct {v2, p1}, Ls3/c1;-><init>(Ls3/o;)V

    invoke-virtual {v0, v1, v2}, Lp5/q;->k(ILp5/q$a;)V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1, p3, p4}, Ls3/w0;->y0(Ls3/w0;II)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->w0(Ls3/w0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-static {v0, p1}, Ls3/w0;->x0(Ls3/w0;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1}, Ls3/w0;->w0(Ls3/w0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/w0;->x0(Ls3/w0;Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Ls3/w0;->y0(Ls3/w0;II)V

    return-void
.end method

.method public u()V
    .locals 4

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Ls3/w0;->C0(Ls3/w0;ZII)V

    return-void
.end method

.method public v(Z)V
    .locals 0

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1}, Ls3/w0;->H0(Ls3/w0;)V

    return-void
.end method

.method public w(F)V
    .locals 0

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {p1}, Ls3/w0;->A0(Ls3/w0;)V

    return-void
.end method

.method public x(I)V
    .locals 3

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-virtual {v0}, Ls3/w0;->j()Z

    move-result v0

    iget-object v1, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0, p1}, Ls3/w0;->B0(ZI)I

    move-result v2

    invoke-static {v1, v0, p1, v2}, Ls3/w0;->C0(Ls3/w0;ZII)V

    return-void
.end method

.method public y(Landroid/view/Surface;)V
    .locals 1

    iget-object p1, p0, Ls3/w0$c;->h:Ls3/w0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/w0;->x0(Ls3/w0;Ljava/lang/Object;)V

    return-void
.end method

.method public z(IZ)V
    .locals 2

    iget-object v0, p0, Ls3/w0$c;->h:Ls3/w0;

    invoke-static {v0}, Ls3/w0;->M0(Ls3/w0;)Lp5/q;

    move-result-object v0

    new-instance v1, Ls3/x0;

    invoke-direct {v1, p1, p2}, Ls3/x0;-><init>(IZ)V

    const/16 p1, 0x1e

    invoke-virtual {v0, p1, v1}, Lp5/q;->k(ILp5/q$a;)V

    return-void
.end method
