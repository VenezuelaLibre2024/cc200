.class public abstract Lj4/o;
.super Ls3/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj4/o$a;,
        Lj4/o$c;,
        Lj4/o$b;
    }
.end annotation


# static fields
.field public static final J0:[B


# instance fields
.field public final A:Lv3/g;

.field public A0:Z

.field public final B:Lj4/h;

.field public B0:Z

.field public final C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public C0:Z

.field public final D:Landroid/media/MediaCodec$BufferInfo;

.field public D0:Z

.field public final E:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lj4/o$c;",
            ">;"
        }
    .end annotation
.end field

.field public E0:Ls3/q;

.field public F:Ls3/m1;

.field public F0:Lv3/e;

.field public G:Ls3/m1;

.field public G0:Lj4/o$c;

.field public H:Lw3/n;

.field public H0:J

.field public I:Lw3/n;

.field public I0:Z

.field public J:Landroid/media/MediaCrypto;

.field public K:Z

.field public L:J

.field public M:F

.field public N:F

.field public O:Lj4/l;

.field public P:Ls3/m1;

.field public Q:Landroid/media/MediaFormat;

.field public R:Z

.field public S:F

.field public T:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lj4/n;",
            ">;"
        }
    .end annotation
.end field

.field public U:Lj4/o$b;

.field public V:Lj4/n;

.field public W:I

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:Z

.field public c0:Z

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:Z

.field public h0:Lj4/i;

.field public i0:J

.field public j0:I

.field public k0:I

.field public l0:Ljava/nio/ByteBuffer;

.field public m0:Z

.field public n0:Z

.field public o0:Z

.field public p0:Z

.field public q0:Z

.field public r0:Z

.field public s0:I

.field public t0:I

.field public final u:Lj4/l$b;

.field public u0:I

.field public final v:Lj4/q;

.field public v0:Z

.field public final w:Z

.field public w0:Z

.field public final x:F

.field public x0:Z

.field public final y:Lv3/g;

.field public y0:J

.field public final z:Lv3/g;

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x26

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lj4/o;->J0:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(ILj4/l$b;Lj4/q;ZF)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/f;-><init>(I)V

    iput-object p2, p0, Lj4/o;->u:Lj4/l$b;

    invoke-static {p3}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj4/q;

    iput-object p1, p0, Lj4/o;->v:Lj4/q;

    iput-boolean p4, p0, Lj4/o;->w:Z

    iput p5, p0, Lj4/o;->x:F

    invoke-static {}, Lv3/g;->z()Lv3/g;

    move-result-object p1

    iput-object p1, p0, Lj4/o;->y:Lv3/g;

    new-instance p1, Lv3/g;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lv3/g;-><init>(I)V

    iput-object p1, p0, Lj4/o;->z:Lv3/g;

    new-instance p1, Lv3/g;

    const/4 p3, 0x2

    invoke-direct {p1, p3}, Lv3/g;-><init>(I)V

    iput-object p1, p0, Lj4/o;->A:Lv3/g;

    new-instance p1, Lj4/h;

    invoke-direct {p1}, Lj4/h;-><init>()V

    iput-object p1, p0, Lj4/o;->B:Lj4/h;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lj4/o;->C:Ljava/util/ArrayList;

    new-instance p3, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {p3}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object p3, p0, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lj4/o;->M:F

    iput p3, p0, Lj4/o;->N:F

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p3, p0, Lj4/o;->L:J

    new-instance p5, Ljava/util/ArrayDeque;

    invoke-direct {p5}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p5, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    sget-object p5, Lj4/o$c;->e:Lj4/o$c;

    invoke-virtual {p0, p5}, Lj4/o;->m1(Lj4/o$c;)V

    invoke-virtual {p1, p2}, Lv3/g;->w(I)V

    iget-object p1, p1, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lj4/o;->S:F

    iput p2, p0, Lj4/o;->W:I

    iput p2, p0, Lj4/o;->s0:I

    const/4 p1, -0x1

    iput p1, p0, Lj4/o;->j0:I

    iput p1, p0, Lj4/o;->k0:I

    iput-wide p3, p0, Lj4/o;->i0:J

    iput-wide p3, p0, Lj4/o;->y0:J

    iput-wide p3, p0, Lj4/o;->z0:J

    iput-wide p3, p0, Lj4/o;->H0:J

    iput p2, p0, Lj4/o;->t0:I

    iput p2, p0, Lj4/o;->u0:I

    return-void
.end method

.method public static M0(Ljava/lang/IllegalStateException;)Z
    .locals 3

    sget v0, Lp5/n0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    invoke-static {p0}, Lj4/o;->N0(Ljava/lang/IllegalStateException;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/IllegalStateException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length v0, p0

    const/4 v2, 0x0

    if-lez v0, :cond_1

    aget-object p0, p0, v2

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "android.media.MediaCodec"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    return v1
.end method

.method public static N0(Ljava/lang/IllegalStateException;)Z
    .locals 0

    instance-of p0, p0, Landroid/media/MediaCodec$CodecException;

    return p0
.end method

.method public static O0(Ljava/lang/IllegalStateException;)Z
    .locals 1

    instance-of v0, p0, Landroid/media/MediaCodec$CodecException;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/media/MediaCodec$CodecException;

    invoke-virtual {p0}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d0(Ljava/lang/String;Ls3/m1;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    iget-object p1, p1, Ls3/m1;->u:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "OMX.MTK.VIDEO.DECODER.AVC"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.mp3.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp5/n0;->c:Ljava/lang/String;

    const-string v0, "samsung"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lp5/n0;->b:Ljava/lang/String;

    const-string v0, "baffin"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "grand"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fortuna"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "gprimelte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "j2y18lte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ms01"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    const-string v1, "OMX.google.vorbis.decoder"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-gt v0, v1, :cond_3

    sget-object v0, Lp5/n0;->b:Ljava/lang/String;

    const-string v1, "hb2000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "stvm8"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "OMX.amlogic.avc.decoder.awesome"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.amlogic.avc.decoder.awesome.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x15

    if-ne v0, v1, :cond_0

    const-string v0, "OMX.google.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static h0(Lj4/n;)Z
    .locals 3

    iget-object v0, p0, Lj4/n;->a:Ljava/lang/String;

    sget v1, Lp5/n0;->a:I

    const/16 v2, 0x19

    if-gt v1, v2, :cond_0

    const-string v2, "OMX.rk.video_decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_0
    const/16 v2, 0x11

    if-gt v1, v2, :cond_1

    const-string v2, "OMX.allwinner.video.decoder.avc"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    const/16 v2, 0x1d

    if-gt v1, v2, :cond_2

    const-string v1, "OMX.broadcom.video_decoder.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.broadcom.video_decoder.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.avc.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.avc.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.hevc.tunnel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "OMX.bcm.vdec.hevc.tunnel.secure"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    sget-object v0, Lp5/n0;->c:Ljava/lang/String;

    const-string v1, "Amazon"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lp5/n0;->d:Ljava/lang/String;

    const-string v1, "AFTS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean p0, p0, Lj4/n;->g:Z

    if-eqz p0, :cond_4

    :cond_3
    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static i0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    if-ne v0, v1, :cond_0

    const-string v1, "OMX.SEC.avc.dec"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "OMX.SEC.avc.dec.secure"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    sget-object v0, Lp5/n0;->d:Ljava/lang/String;

    const-string v1, "SM-G800"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "OMX.Exynos.avc.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static j0(Ljava/lang/String;Ls3/m1;)Z
    .locals 3

    sget v0, Lp5/n0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x12

    if-gt v0, v2, :cond_0

    iget p1, p1, Ls3/m1;->F:I

    if-ne p1, v1, :cond_0

    const-string p1, "OMX.MTK.AUDIO.DECODER.MP3"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static k0(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    const-string v0, "c2.android.aac.decoder"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static v1(Ls3/m1;)Z
    .locals 1

    iget p0, p0, Ls3/m1;->N:I

    if-eqz p0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public abstract A0(FLs3/m1;[Ls3/m1;)F
.end method

.method public final B0()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lj4/o;->Q:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public abstract C0(Lj4/q;Ls3/m1;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj4/q;",
            "Ls3/m1;",
            "Z)",
            "Ljava/util/List<",
            "Lj4/n;",
            ">;"
        }
    .end annotation
.end method

.method public final D0(Lw3/n;)Lw3/c0;
    .locals 3

    invoke-interface {p1}, Lw3/n;->i()Lv3/b;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of v0, p1, Lw3/c0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting FrameworkCryptoConfig but found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lj4/o;->F:Ls3/m1;

    const/16 v1, 0x1771

    invoke-virtual {p0, v0, p1, v1}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    check-cast p1, Lw3/c0;

    return-object p1
.end method

.method public abstract E0(Lj4/n;Ls3/m1;Landroid/media/MediaCrypto;F)Lj4/l$a;
.end method

.method public final F0()J
    .locals 2

    iget-object v0, p0, Lj4/o;->G0:Lj4/o$c;

    iget-wide v0, v0, Lj4/o$c;->c:J

    return-wide v0
.end method

.method public G0()F
    .locals 1

    iget v0, p0, Lj4/o;->M:F

    return v0
.end method

.method public H0(Lv3/g;)V
    .locals 0

    return-void
.end method

.method public final I0()Z
    .locals 1

    iget v0, p0, Lj4/o;->k0:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final J0(Ls3/m1;)V
    .locals 2

    invoke-virtual {p0}, Lj4/o;->m0()V

    iget-object p1, p1, Ls3/m1;->s:Ljava/lang/String;

    const-string v0, "audio/mp4a-latm"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const-string v0, "audio/mpeg"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "audio/opus"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lj4/o;->B:Lj4/h;

    invoke-virtual {p1, v1}, Lj4/h;->H(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj4/o;->B:Lj4/h;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Lj4/h;->H(I)V

    :goto_0
    iput-boolean v1, p0, Lj4/o;->o0:Z

    return-void
.end method

.method public final K0(Lj4/n;Landroid/media/MediaCrypto;)V
    .locals 12

    iget-object v1, p1, Lj4/n;->a:Ljava/lang/String;

    sget v0, Lp5/n0;->a:I

    const/high16 v2, -0x40800000    # -1.0f

    const/16 v3, 0x17

    if-ge v0, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, p0, Lj4/o;->N:F

    iget-object v4, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {p0}, Ls3/f;->N()[Ls3/m1;

    move-result-object v5

    invoke-virtual {p0, v3, v4, v5}, Lj4/o;->A0(FLs3/m1;[Ls3/m1;)F

    move-result v3

    :goto_0
    iget v4, p0, Lj4/o;->x:F

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iget-object v5, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {p0, p1, v5, p2, v2}, Lj4/o;->E0(Lj4/n;Ls3/m1;Landroid/media/MediaCrypto;F)Lj4/l$a;

    move-result-object p2

    const/16 v5, 0x1f

    if-lt v0, v5, :cond_2

    invoke-virtual {p0}, Ls3/f;->M()Lt3/s1;

    move-result-object v0

    invoke-static {p2, v0}, Lj4/o$a;->a(Lj4/l$a;Lt3/s1;)V

    :cond_2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "createCodec:"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/k0;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lj4/o;->u:Lj4/l$b;

    invoke-interface {v0, p2}, Lj4/l$b;->a(Lj4/l$a;)Lj4/l;

    move-result-object v0

    iput-object v0, p0, Lj4/o;->O:Lj4/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lp5/k0;->c()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {p1, v0}, Lj4/n;->o(Ls3/m1;)Z

    move-result v0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v0, :cond_3

    new-array v0, v7, [Ljava/lang/Object;

    iget-object v10, p0, Lj4/o;->F:Ls3/m1;

    invoke-static {v10}, Ls3/m1;->i(Ls3/m1;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v0, v8

    aput-object v1, v0, v9

    const-string v10, "Format exceeds selected codec\'s capabilities [%s, %s]"

    invoke-static {v10, v0}, Lp5/n0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v10, "MediaCodecRenderer"

    invoke-static {v10, v0}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iput-object p1, p0, Lj4/o;->V:Lj4/n;

    iput v2, p0, Lj4/o;->S:F

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    iput-object v0, p0, Lj4/o;->P:Ls3/m1;

    invoke-virtual {p0, v1}, Lj4/o;->c0(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lj4/o;->W:I

    iget-object v0, p0, Lj4/o;->P:Ls3/m1;

    invoke-static {v1, v0}, Lj4/o;->d0(Ljava/lang/String;Ls3/m1;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->X:Z

    invoke-static {v1}, Lj4/o;->i0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->Y:Z

    invoke-static {v1}, Lj4/o;->k0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->Z:Z

    invoke-static {v1}, Lj4/o;->f0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->a0:Z

    invoke-static {v1}, Lj4/o;->g0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->b0:Z

    invoke-static {v1}, Lj4/o;->e0(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->c0:Z

    iget-object v0, p0, Lj4/o;->P:Ls3/m1;

    invoke-static {v1, v0}, Lj4/o;->j0(Ljava/lang/String;Ls3/m1;)Z

    move-result v0

    iput-boolean v0, p0, Lj4/o;->d0:Z

    invoke-static {p1}, Lj4/o;->h0(Lj4/n;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lj4/o;->z0()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move v0, v8

    goto :goto_3

    :cond_5
    :goto_2
    move v0, v9

    :goto_3
    iput-boolean v0, p0, Lj4/o;->g0:Z

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    invoke-interface {v0}, Lj4/l;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    iput-boolean v9, p0, Lj4/o;->r0:Z

    iput v9, p0, Lj4/o;->s0:I

    iget v0, p0, Lj4/o;->W:I

    if-eqz v0, :cond_6

    move v8, v9

    :cond_6
    iput-boolean v8, p0, Lj4/o;->e0:Z

    :cond_7
    iget-object p1, p1, Lj4/n;->a:Ljava/lang/String;

    const-string v0, "c2.android.mp3.decoder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Lj4/i;

    invoke-direct {p1}, Lj4/i;-><init>()V

    iput-object p1, p0, Lj4/o;->h0:Lj4/i;

    :cond_8
    invoke-virtual {p0}, Ls3/f;->getState()I

    move-result p1

    if-ne p1, v7, :cond_9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    const-wide/16 v10, 0x3e8

    add-long/2addr v7, v10

    iput-wide v7, p0, Lj4/o;->i0:J

    :cond_9
    iget-object p1, p0, Lj4/o;->F0:Lv3/e;

    iget v0, p1, Lv3/e;->a:I

    add-int/2addr v0, v9

    iput v0, p1, Lv3/e;->a:I

    sub-long v7, v5, v3

    move-object v0, p0

    move-object v2, p2

    move-wide v3, v5

    move-wide v5, v7

    invoke-virtual/range {v0 .. v6}, Lj4/o;->S0(Ljava/lang/String;Lj4/l$a;JJ)V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lp5/k0;->c()V

    throw p1
.end method

.method public final L0(J)Z
    .locals 5

    iget-object v0, p0, Lj4/o;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lj4/o;->C:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, v3, p1

    if-nez v3, :cond_0

    iget-object p1, p0, Lj4/o;->C:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public P()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lj4/o;->F:Ls3/m1;

    sget-object v0, Lj4/o$c;->e:Lj4/o$c;

    invoke-virtual {p0, v0}, Lj4/o;->m1(Lj4/o$c;)V

    iget-object v0, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    invoke-virtual {p0}, Lj4/o;->v0()Z

    return-void
.end method

.method public final P0()V
    .locals 6

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lj4/o;->o0:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lj4/o;->I:Lw3/n;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lj4/o;->t1(Ls3/m1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {p0, v0}, Lj4/o;->J0(Ls3/m1;)V

    return-void

    :cond_1
    iget-object v0, p0, Lj4/o;->I:Lw3/n;

    invoke-virtual {p0, v0}, Lj4/o;->l1(Lw3/n;)V

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    iget-object v0, v0, Ls3/m1;->s:Ljava/lang/String;

    iget-object v1, p0, Lj4/o;->H:Lw3/n;

    if-eqz v1, :cond_7

    iget-object v2, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    const/4 v3, 0x1

    if-nez v2, :cond_5

    invoke-virtual {p0, v1}, Lj4/o;->D0(Lw3/n;)Lw3/c0;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v0, p0, Lj4/o;->H:Lw3/n;

    invoke-interface {v0}, Lw3/n;->a()Lw3/n$a;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    iget-object v4, v1, Lw3/c0;->a:Ljava/util/UUID;

    iget-object v5, v1, Lw3/c0;->b:[B

    invoke-direct {v2, v4, v5}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    iput-object v2, p0, Lj4/o;->J:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v1, v1, Lw3/c0;->c:Z

    if-nez v1, :cond_4

    invoke-virtual {v2, v0}, Landroid/media/MediaCrypto;->requiresSecureDecoderComponent(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lj4/o;->K:Z

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object v0

    throw v0

    :cond_5
    :goto_1
    sget-boolean v0, Lw3/c0;->d:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lj4/o;->H:Lw3/n;

    invoke-interface {v0}, Lw3/n;->getState()I

    move-result v0

    if-eq v0, v3, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    return-void

    :cond_6
    iget-object v0, p0, Lj4/o;->H:Lw3/n;

    invoke-interface {v0}, Lw3/n;->a()Lw3/n$a;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw3/n$a;

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    iget v2, v0, Lw3/n$a;->h:I

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object v0

    throw v0

    :cond_7
    :try_start_1
    iget-object v0, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    iget-boolean v1, p0, Lj4/o;->K:Z

    invoke-virtual {p0, v0, v1}, Lj4/o;->Q0(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Lj4/o$b; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    const/16 v2, 0xfa1

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object v0

    throw v0

    :cond_8
    :goto_2
    return-void
.end method

.method public Q(ZZ)V
    .locals 0

    new-instance p1, Lv3/e;

    invoke-direct {p1}, Lv3/e;-><init>()V

    iput-object p1, p0, Lj4/o;->F0:Lv3/e;

    return-void
.end method

.method public final Q0(Landroid/media/MediaCrypto;Z)V
    .locals 7

    iget-object v0, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    :try_start_0
    invoke-virtual {p0, p2}, Lj4/o;->w0(Z)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v2, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    iget-boolean v3, p0, Lj4/o;->w:Z

    if-eqz v3, :cond_0

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj4/n;

    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iput-object v1, p0, Lj4/o;->U:Lj4/o$b;
    :try_end_0
    .catch Lj4/v$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Lj4/o$b;

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    const v2, -0xc34e

    invoke-direct {v0, v1, p1, p2, v2}, Lj4/o$b;-><init>(Ls3/m1;Ljava/lang/Throwable;ZI)V

    throw v0

    :cond_2
    :goto_1
    iget-object v0, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj4/n;

    :goto_2
    iget-object v2, p0, Lj4/o;->O:Lj4/l;

    if-nez v2, :cond_7

    iget-object v2, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj4/n;

    invoke-virtual {p0, v2}, Lj4/o;->r1(Lj4/n;)Z

    move-result v3

    if-nez v3, :cond_3

    return-void

    :cond_3
    :try_start_1
    invoke-virtual {p0, v2, p1}, Lj4/o;->K0(Lj4/n;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v3

    const-string v4, "MediaCodecRenderer"

    if-ne v2, v0, :cond_4

    :try_start_2
    const-string v3, "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."

    invoke-static {v4, v3}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v5, 0x32

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    invoke-virtual {p0, v2, p1}, Lj4/o;->K0(Lj4/n;Landroid/media/MediaCrypto;)V

    goto :goto_2

    :cond_4
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Failed to initialize decoder: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v3}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v4, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    new-instance v4, Lj4/o$b;

    iget-object v5, p0, Lj4/o;->F:Ls3/m1;

    invoke-direct {v4, v5, v3, p2, v2}, Lj4/o$b;-><init>(Ls3/m1;Ljava/lang/Throwable;ZLj4/n;)V

    invoke-virtual {p0, v4}, Lj4/o;->R0(Ljava/lang/Exception;)V

    iget-object v2, p0, Lj4/o;->U:Lj4/o$b;

    if-nez v2, :cond_5

    iput-object v4, p0, Lj4/o;->U:Lj4/o$b;

    goto :goto_3

    :cond_5
    invoke-static {v2, v4}, Lj4/o$b;->a(Lj4/o$b;Lj4/o$b;)Lj4/o$b;

    move-result-object v2

    iput-object v2, p0, Lj4/o;->U:Lj4/o$b;

    :goto_3
    iget-object v2, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lj4/o;->U:Lj4/o$b;

    throw p1

    :cond_7
    iput-object v1, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    return-void

    :cond_8
    new-instance p1, Lj4/o$b;

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    const v2, -0xc34f

    invoke-direct {p1, v0, v1, p2, v2}, Lj4/o$b;-><init>(Ls3/m1;Ljava/lang/Throwable;ZI)V

    throw p1
.end method

.method public R(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lj4/o;->A0:Z

    iput-boolean p1, p0, Lj4/o;->B0:Z

    iput-boolean p1, p0, Lj4/o;->D0:Z

    iget-boolean p2, p0, Lj4/o;->o0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lj4/o;->B:Lj4/h;

    invoke-virtual {p2}, Lj4/h;->l()V

    iget-object p2, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {p2}, Lv3/g;->l()V

    iput-boolean p1, p0, Lj4/o;->p0:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj4/o;->u0()Z

    :goto_0
    iget-object p1, p0, Lj4/o;->G0:Lj4/o$c;

    iget-object p1, p1, Lj4/o$c;->d:Lp5/i0;

    invoke-virtual {p1}, Lp5/i0;->k()I

    move-result p1

    if-lez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj4/o;->C0:Z

    :cond_1
    iget-object p1, p0, Lj4/o;->G0:Lj4/o$c;

    iget-object p1, p1, Lj4/o$c;->d:Lp5/i0;

    invoke-virtual {p1}, Lp5/i0;->c()V

    iget-object p1, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method public abstract R0(Ljava/lang/Exception;)V
.end method

.method public S()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lj4/o;->m0()V

    invoke-virtual {p0}, Lj4/o;->f1()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lj4/o;->p1(Lw3/n;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p0, v0}, Lj4/o;->p1(Lw3/n;)V

    throw v1
.end method

.method public abstract S0(Ljava/lang/String;Lj4/l$a;JJ)V
.end method

.method public T()V
    .locals 0

    return-void
.end method

.method public abstract T0(Ljava/lang/String;)V
.end method

.method public U()V
    .locals 0

    return-void
.end method

.method public U0(Ls3/n1;)Lv3/i;
    .locals 11

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj4/o;->C0:Z

    iget-object v1, p1, Ls3/n1;->b:Ls3/m1;

    invoke-static {v1}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ls3/m1;

    iget-object v1, v5, Ls3/m1;->s:Ljava/lang/String;

    if-eqz v1, :cond_13

    iget-object p1, p1, Ls3/n1;->a:Lw3/n;

    invoke-virtual {p0, p1}, Lj4/o;->p1(Lw3/n;)V

    iput-object v5, p0, Lj4/o;->F:Ls3/m1;

    iget-boolean p1, p0, Lj4/o;->o0:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lj4/o;->q0:Z

    return-object v1

    :cond_0
    iget-object p1, p0, Lj4/o;->O:Lj4/l;

    if-nez p1, :cond_1

    iput-object v1, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Lj4/o;->P0()V

    return-object v1

    :cond_1
    iget-object v1, p0, Lj4/o;->V:Lj4/n;

    iget-object v4, p0, Lj4/o;->P:Ls3/m1;

    iget-object v2, p0, Lj4/o;->H:Lw3/n;

    iget-object v3, p0, Lj4/o;->I:Lw3/n;

    invoke-virtual {p0, v1, v5, v2, v3}, Lj4/o;->r0(Lj4/n;Ls3/m1;Lw3/n;Lw3/n;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lj4/o;->o0()V

    new-instance p1, Lv3/i;

    iget-object v3, v1, Lj4/n;->a:Ljava/lang/String;

    const/4 v6, 0x0

    const/16 v7, 0x80

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lv3/i;-><init>(Ljava/lang/String;Ls3/m1;Ls3/m1;II)V

    return-object p1

    :cond_2
    iget-object v2, p0, Lj4/o;->I:Lw3/n;

    iget-object v3, p0, Lj4/o;->H:Lw3/n;

    const/4 v6, 0x0

    if-eq v2, v3, :cond_3

    move v2, v0

    goto :goto_0

    :cond_3
    move v2, v6

    :goto_0
    if-eqz v2, :cond_5

    sget v3, Lp5/n0;->a:I

    const/16 v7, 0x17

    if-lt v3, v7, :cond_4

    goto :goto_1

    :cond_4
    move v3, v6

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v0

    :goto_2
    invoke-static {v3}, Lp5/a;->f(Z)V

    invoke-virtual {p0, v1, v4, v5}, Lj4/o;->b0(Lj4/n;Ls3/m1;Ls3/m1;)Lv3/i;

    move-result-object v3

    iget v7, v3, Lv3/i;->d:I

    const/4 v8, 0x3

    const/16 v9, 0x10

    const/4 v10, 0x2

    if-eqz v7, :cond_f

    if-eq v7, v0, :cond_c

    if-eq v7, v10, :cond_8

    if-ne v7, v8, :cond_7

    invoke-virtual {p0, v5}, Lj4/o;->w1(Ls3/m1;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    iput-object v5, p0, Lj4/o;->P:Ls3/m1;

    if-eqz v2, :cond_10

    invoke-virtual {p0}, Lj4/o;->p0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_8
    invoke-virtual {p0, v5}, Lj4/o;->w1(Ls3/m1;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    :cond_9
    iput-boolean v0, p0, Lj4/o;->r0:Z

    iput v0, p0, Lj4/o;->s0:I

    iget v7, p0, Lj4/o;->W:I

    if-eq v7, v10, :cond_b

    if-ne v7, v0, :cond_a

    iget v7, v5, Ls3/m1;->x:I

    iget v9, v4, Ls3/m1;->x:I

    if-ne v7, v9, :cond_a

    iget v7, v5, Ls3/m1;->y:I

    iget v9, v4, Ls3/m1;->y:I

    if-ne v7, v9, :cond_a

    goto :goto_3

    :cond_a
    move v0, v6

    :cond_b
    :goto_3
    iput-boolean v0, p0, Lj4/o;->e0:Z

    iput-object v5, p0, Lj4/o;->P:Ls3/m1;

    if-eqz v2, :cond_10

    invoke-virtual {p0}, Lj4/o;->p0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_c
    invoke-virtual {p0, v5}, Lj4/o;->w1(Ls3/m1;)Z

    move-result v0

    if-nez v0, :cond_d

    :goto_4
    move v7, v9

    goto :goto_6

    :cond_d
    iput-object v5, p0, Lj4/o;->P:Ls3/m1;

    if-eqz v2, :cond_e

    invoke-virtual {p0}, Lj4/o;->p0()Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_5

    :cond_e
    invoke-virtual {p0}, Lj4/o;->n0()Z

    move-result v0

    if-nez v0, :cond_10

    :goto_5
    move v7, v10

    goto :goto_6

    :cond_f
    invoke-virtual {p0}, Lj4/o;->o0()V

    :cond_10
    move v7, v6

    :goto_6
    iget v0, v3, Lv3/i;->d:I

    if-eqz v0, :cond_12

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    if-ne v0, p1, :cond_11

    iget p1, p0, Lj4/o;->u0:I

    if-ne p1, v8, :cond_12

    :cond_11
    new-instance p1, Lv3/i;

    iget-object v3, v1, Lj4/n;->a:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lv3/i;-><init>(Ljava/lang/String;Ls3/m1;Ls3/m1;II)V

    return-object p1

    :cond_12
    return-object v3

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    const/16 v0, 0xfa5

    invoke-virtual {p0, p1, v5, v0}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object p1

    throw p1
.end method

.method public V([Ls3/m1;JJ)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Lj4/o;->G0:Lj4/o$c;

    iget-wide v1, v1, Lj4/o$c;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    new-instance v1, Lj4/o$c;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lj4/o$c;-><init>(JJJ)V

    invoke-virtual {p0, v1}, Lj4/o;->m1(Lj4/o$c;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-wide v1, v0, Lj4/o;->y0:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lj4/o;->H0:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_2

    cmp-long v1, v5, v1

    if-ltz v1, :cond_2

    :cond_1
    new-instance v1, Lj4/o$c;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    move-object v5, v1

    move-wide v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v5 .. v11}, Lj4/o$c;-><init>(JJJ)V

    invoke-virtual {p0, v1}, Lj4/o;->m1(Lj4/o$c;)V

    iget-object v1, v0, Lj4/o;->G0:Lj4/o$c;

    iget-wide v1, v1, Lj4/o$c;->c:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lj4/o;->Y0()V

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lj4/o;->E:Ljava/util/ArrayDeque;

    new-instance v9, Lj4/o$c;

    iget-wide v3, v0, Lj4/o;->y0:J

    move-object v2, v9

    move-wide v5, p2

    move-wide/from16 v7, p4

    invoke-direct/range {v2 .. v8}, Lj4/o$c;-><init>(JJJ)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public abstract V0(Ls3/m1;Landroid/media/MediaFormat;)V
.end method

.method public W0(J)V
    .locals 0

    return-void
.end method

.method public X0(J)V
    .locals 2

    iput-wide p1, p0, Lj4/o;->H0:J

    :goto_0
    iget-object v0, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj4/o$c;

    iget-wide v0, v0, Lj4/o$c;->a:J

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj4/o$c;

    invoke-virtual {p0, v0}, Lj4/o;->m1(Lj4/o$c;)V

    invoke-virtual {p0}, Lj4/o;->Y0()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Y0()V
    .locals 0

    return-void
.end method

.method public final Z()V
    .locals 5

    iget-boolean v0, p0, Lj4/o;->A0:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lp5/a;->f(Z)V

    invoke-virtual {p0}, Ls3/f;->K()Ls3/n1;

    move-result-object v0

    iget-object v2, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {v2}, Lv3/g;->l()V

    :cond_0
    iget-object v2, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {v2}, Lv3/g;->l()V

    iget-object v2, p0, Lj4/o;->A:Lv3/g;

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v2, v3}, Ls3/f;->W(Ls3/n1;Lv3/g;I)I

    move-result v2

    const/4 v4, -0x5

    if-eq v2, v4, :cond_5

    const/4 v4, -0x4

    if-eq v2, v4, :cond_2

    const/4 v0, -0x3

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_2
    iget-object v2, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {v2}, Lv3/a;->q()Z

    move-result v2

    if-eqz v2, :cond_3

    iput-boolean v1, p0, Lj4/o;->A0:Z

    return-void

    :cond_3
    iget-boolean v2, p0, Lj4/o;->C0:Z

    if-eqz v2, :cond_4

    iget-object v2, p0, Lj4/o;->F:Ls3/m1;

    invoke-static {v2}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls3/m1;

    iput-object v2, p0, Lj4/o;->G:Ls3/m1;

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v4}, Lj4/o;->V0(Ls3/m1;Landroid/media/MediaFormat;)V

    iput-boolean v3, p0, Lj4/o;->C0:Z

    :cond_4
    iget-object v2, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {v2}, Lv3/g;->x()V

    iget-object v2, p0, Lj4/o;->B:Lj4/h;

    iget-object v3, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {v2, v3}, Lj4/h;->B(Lv3/g;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-boolean v1, p0, Lj4/o;->p0:Z

    return-void

    :cond_5
    invoke-virtual {p0, v0}, Lj4/o;->U0(Ls3/n1;)Lv3/i;

    return-void
.end method

.method public abstract Z0(Lv3/g;)V
.end method

.method public final a(Ls3/m1;)I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj4/o;->v:Lj4/q;

    invoke-virtual {p0, v0, p1}, Lj4/o;->u1(Lj4/q;Ls3/m1;)I

    move-result p1
    :try_end_0
    .catch Lj4/v$c; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    const/16 v1, 0xfa2

    invoke-virtual {p0, v0, p1, v1}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object p1

    throw p1
.end method

.method public final a0(JJ)Z
    .locals 18

    move-object/from16 v15, p0

    iget-boolean v0, v15, Lj4/o;->B0:Z

    const/4 v14, 0x1

    xor-int/2addr v0, v14

    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v0}, Lj4/h;->G()Z

    move-result v0

    const/4 v13, 0x0

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    iget-object v6, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    iget v7, v15, Lj4/o;->k0:I

    const/4 v8, 0x0

    invoke-virtual {v0}, Lj4/h;->F()I

    move-result v9

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v0}, Lj4/h;->D()J

    move-result-wide v10

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v0}, Lv3/a;->p()Z

    move-result v12

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v0}, Lv3/a;->q()Z

    move-result v16

    iget-object v3, v15, Lj4/o;->G:Ls3/m1;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v13, v16

    move-object/from16 v14, v17

    invoke-virtual/range {v0 .. v14}, Lj4/o;->b1(JJLj4/l;Ljava/nio/ByteBuffer;IIIJZZLs3/m1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v0}, Lj4/h;->E()J

    move-result-wide v0

    invoke-virtual {v15, v0, v1}, Lj4/o;->X0(J)V

    iget-object v0, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v0}, Lj4/h;->l()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    move v0, v13

    :goto_0
    iget-boolean v1, v15, Lj4/o;->A0:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, v15, Lj4/o;->B0:Z

    return v0

    :cond_2
    const/4 v1, 0x1

    iget-boolean v2, v15, Lj4/o;->p0:Z

    if-eqz v2, :cond_3

    iget-object v2, v15, Lj4/o;->B:Lj4/h;

    iget-object v3, v15, Lj4/o;->A:Lv3/g;

    invoke-virtual {v2, v3}, Lj4/h;->B(Lv3/g;)Z

    move-result v2

    invoke-static {v2}, Lp5/a;->f(Z)V

    iput-boolean v0, v15, Lj4/o;->p0:Z

    :cond_3
    iget-boolean v2, v15, Lj4/o;->q0:Z

    if-eqz v2, :cond_5

    iget-object v2, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v2}, Lj4/h;->G()Z

    move-result v2

    if-eqz v2, :cond_4

    return v1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lj4/o;->m0()V

    iput-boolean v0, v15, Lj4/o;->q0:Z

    invoke-virtual/range {p0 .. p0}, Lj4/o;->P0()V

    iget-boolean v2, v15, Lj4/o;->o0:Z

    if-nez v2, :cond_5

    return v0

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lj4/o;->Z()V

    iget-object v2, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v2}, Lj4/h;->G()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v2}, Lv3/g;->x()V

    :cond_6
    iget-object v2, v15, Lj4/o;->B:Lj4/h;

    invoke-virtual {v2}, Lj4/h;->G()Z

    move-result v2

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lj4/o;->A0:Z

    if-nez v2, :cond_8

    iget-boolean v2, v15, Lj4/o;->q0:Z

    if-eqz v2, :cond_7

    goto :goto_1

    :cond_7
    move v14, v0

    goto :goto_2

    :cond_8
    :goto_1
    move v14, v1

    :goto_2
    return v14
.end method

.method public final a1()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget v0, p0, Lj4/o;->u0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    iput-boolean v1, p0, Lj4/o;->B0:Z

    invoke-virtual {p0}, Lj4/o;->g1()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj4/o;->e1()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lj4/o;->t0()V

    invoke-virtual {p0}, Lj4/o;->x1()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lj4/o;->t0()V

    :goto_0
    return-void
.end method

.method public abstract b0(Lj4/n;Ls3/m1;Ls3/m1;)Lv3/i;
.end method

.method public abstract b1(JJLj4/l;Ljava/nio/ByteBuffer;IIIJZZLs3/m1;)Z
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lj4/o;->B0:Z

    return v0
.end method

.method public final c0(Ljava/lang/String;)I
    .locals 3

    sget v0, Lp5/n0;->a:I

    const/16 v1, 0x19

    if-gt v0, v1, :cond_1

    const-string v1, "OMX.Exynos.avc.dec.secure"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lp5/n0;->d:Ljava/lang/String;

    const-string v2, "SM-T585"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A510"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-A520"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "SM-J700"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 p1, 0x2

    return p1

    :cond_1
    const/16 v1, 0x18

    if-ge v0, v1, :cond_4

    const-string v0, "OMX.Nvidia.h264.decode"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "OMX.Nvidia.h264.decode.secure"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_2
    sget-object p1, Lp5/n0;->b:Ljava/lang/String;

    const-string v0, "flounder"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "flounder_lte"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "grouper"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tilapia"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final c1()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj4/o;->x0:Z

    iget-object v1, p0, Lj4/o;->O:Lj4/l;

    invoke-interface {v1}, Lj4/l;->b()Landroid/media/MediaFormat;

    move-result-object v1

    iget v2, p0, Lj4/o;->W:I

    if-eqz v2, :cond_0

    const-string v2, "width"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_0

    const-string v2, "height"

    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v3, :cond_0

    iput-boolean v0, p0, Lj4/o;->f0:Z

    return-void

    :cond_0
    iget-boolean v2, p0, Lj4/o;->d0:Z

    if-eqz v2, :cond_1

    const-string v2, "channel-count"

    invoke-virtual {v1, v2, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    iput-object v1, p0, Lj4/o;->Q:Landroid/media/MediaFormat;

    iput-boolean v0, p0, Lj4/o;->R:Z

    return-void
.end method

.method public final d1(I)Z
    .locals 3

    invoke-virtual {p0}, Ls3/f;->K()Ls3/n1;

    move-result-object v0

    iget-object v1, p0, Lj4/o;->y:Lv3/g;

    invoke-virtual {v1}, Lv3/g;->l()V

    iget-object v1, p0, Lj4/o;->y:Lv3/g;

    or-int/lit8 p1, p1, 0x4

    invoke-virtual {p0, v0, v1, p1}, Ls3/f;->W(Ls3/n1;Lv3/g;I)I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, -0x5

    if-ne p1, v2, :cond_0

    invoke-virtual {p0, v0}, Lj4/o;->U0(Ls3/n1;)Lv3/i;

    return v1

    :cond_0
    const/4 v0, -0x4

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lj4/o;->y:Lv3/g;

    invoke-virtual {p1}, Lv3/a;->q()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v1, p0, Lj4/o;->A0:Z

    invoke-virtual {p0}, Lj4/o;->a1()V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public e()Z
    .locals 4

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls3/f;->O()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj4/o;->I0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lj4/o;->i0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lj4/o;->i0:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e1()V
    .locals 0

    invoke-virtual {p0}, Lj4/o;->f1()V

    invoke-virtual {p0}, Lj4/o;->P0()V

    return-void
.end method

.method public f1()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lj4/o;->O:Lj4/l;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lj4/l;->release()V

    iget-object v1, p0, Lj4/o;->F0:Lv3/e;

    iget v2, v1, Lv3/e;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lv3/e;->b:I

    iget-object v1, p0, Lj4/o;->V:Lj4/n;

    iget-object v1, v1, Lj4/n;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lj4/o;->T0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    iput-object v0, p0, Lj4/o;->O:Lj4/l;

    :try_start_1
    iget-object v1, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iput-object v0, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lj4/o;->l1(Lw3/n;)V

    invoke-virtual {p0}, Lj4/o;->i1()V

    return-void

    :catchall_0
    move-exception v1

    iput-object v0, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lj4/o;->l1(Lw3/n;)V

    invoke-virtual {p0}, Lj4/o;->i1()V

    throw v1

    :catchall_1
    move-exception v1

    iput-object v0, p0, Lj4/o;->O:Lj4/l;

    :try_start_2
    iget-object v2, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :cond_2
    iput-object v0, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lj4/o;->l1(Lw3/n;)V

    invoke-virtual {p0}, Lj4/o;->i1()V

    throw v1

    :catchall_2
    move-exception v1

    iput-object v0, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    invoke-virtual {p0, v0}, Lj4/o;->l1(Lw3/n;)V

    invoke-virtual {p0}, Lj4/o;->i1()V

    throw v1
.end method

.method public g1()V
    .locals 0

    return-void
.end method

.method public h1()V
    .locals 4

    invoke-virtual {p0}, Lj4/o;->j1()V

    invoke-virtual {p0}, Lj4/o;->k1()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lj4/o;->i0:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lj4/o;->w0:Z

    iput-boolean v2, p0, Lj4/o;->v0:Z

    iput-boolean v2, p0, Lj4/o;->e0:Z

    iput-boolean v2, p0, Lj4/o;->f0:Z

    iput-boolean v2, p0, Lj4/o;->m0:Z

    iput-boolean v2, p0, Lj4/o;->n0:Z

    iget-object v3, p0, Lj4/o;->C:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-wide v0, p0, Lj4/o;->y0:J

    iput-wide v0, p0, Lj4/o;->z0:J

    iput-wide v0, p0, Lj4/o;->H0:J

    iget-object v0, p0, Lj4/o;->h0:Lj4/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj4/i;->c()V

    :cond_0
    iput v2, p0, Lj4/o;->t0:I

    iput v2, p0, Lj4/o;->u0:I

    iget-boolean v0, p0, Lj4/o;->r0:Z

    iput v0, p0, Lj4/o;->s0:I

    return-void
.end method

.method public i1()V
    .locals 2

    invoke-virtual {p0}, Lj4/o;->h1()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj4/o;->E0:Ls3/q;

    iput-object v0, p0, Lj4/o;->h0:Lj4/i;

    iput-object v0, p0, Lj4/o;->T:Ljava/util/ArrayDeque;

    iput-object v0, p0, Lj4/o;->V:Lj4/n;

    iput-object v0, p0, Lj4/o;->P:Ls3/m1;

    iput-object v0, p0, Lj4/o;->Q:Landroid/media/MediaFormat;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj4/o;->R:Z

    iput-boolean v0, p0, Lj4/o;->x0:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lj4/o;->S:F

    iput v0, p0, Lj4/o;->W:I

    iput-boolean v0, p0, Lj4/o;->X:Z

    iput-boolean v0, p0, Lj4/o;->Y:Z

    iput-boolean v0, p0, Lj4/o;->Z:Z

    iput-boolean v0, p0, Lj4/o;->a0:Z

    iput-boolean v0, p0, Lj4/o;->b0:Z

    iput-boolean v0, p0, Lj4/o;->c0:Z

    iput-boolean v0, p0, Lj4/o;->d0:Z

    iput-boolean v0, p0, Lj4/o;->g0:Z

    iput-boolean v0, p0, Lj4/o;->r0:Z

    iput v0, p0, Lj4/o;->s0:I

    iput-boolean v0, p0, Lj4/o;->K:Z

    return-void
.end method

.method public final j1()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Lj4/o;->j0:I

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    const/4 v1, 0x0

    iput-object v1, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final k1()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lj4/o;->k0:I

    const/4 v0, 0x0

    iput-object v0, p0, Lj4/o;->l0:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public l0(Ljava/lang/Throwable;Lj4/n;)Lj4/m;
    .locals 1

    new-instance v0, Lj4/m;

    invoke-direct {v0, p1, p2}, Lj4/m;-><init>(Ljava/lang/Throwable;Lj4/n;)V

    return-object v0
.end method

.method public final l1(Lw3/n;)V
    .locals 1

    iget-object v0, p0, Lj4/o;->H:Lw3/n;

    invoke-static {v0, p1}, Lw3/n;->g(Lw3/n;Lw3/n;)V

    iput-object p1, p0, Lj4/o;->H:Lw3/n;

    return-void
.end method

.method public final m0()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj4/o;->q0:Z

    iget-object v1, p0, Lj4/o;->B:Lj4/h;

    invoke-virtual {v1}, Lj4/h;->l()V

    iget-object v1, p0, Lj4/o;->A:Lv3/g;

    invoke-virtual {v1}, Lv3/g;->l()V

    iput-boolean v0, p0, Lj4/o;->p0:Z

    iput-boolean v0, p0, Lj4/o;->o0:Z

    return-void
.end method

.method public final m1(Lj4/o$c;)V
    .locals 4

    iput-object p1, p0, Lj4/o;->G0:Lj4/o$c;

    iget-wide v0, p1, Lj4/o$c;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj4/o;->I0:Z

    invoke-virtual {p0, v0, v1}, Lj4/o;->W0(J)V

    :cond_0
    return-void
.end method

.method public final n0()Z
    .locals 2

    iget-boolean v0, p0, Lj4/o;->v0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lj4/o;->t0:I

    iget-boolean v0, p0, Lj4/o;->Y:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj4/o;->a0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput v1, p0, Lj4/o;->u0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lj4/o;->u0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method public final n1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj4/o;->D0:Z

    return-void
.end method

.method public final o0()V
    .locals 1

    iget-boolean v0, p0, Lj4/o;->v0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lj4/o;->t0:I

    const/4 v0, 0x3

    iput v0, p0, Lj4/o;->u0:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj4/o;->e1()V

    :goto_0
    return-void
.end method

.method public final o1(Ls3/q;)V
    .locals 0

    iput-object p1, p0, Lj4/o;->E0:Ls3/q;

    return-void
.end method

.method public final p0()Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-boolean v0, p0, Lj4/o;->v0:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iput v1, p0, Lj4/o;->t0:I

    iget-boolean v0, p0, Lj4/o;->Y:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj4/o;->a0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lj4/o;->u0:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x3

    iput v0, p0, Lj4/o;->u0:I

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {p0}, Lj4/o;->x1()V

    :goto_1
    return v1
.end method

.method public final p1(Lw3/n;)V
    .locals 1

    iget-object v0, p0, Lj4/o;->I:Lw3/n;

    invoke-static {v0, p1}, Lw3/n;->g(Lw3/n;Lw3/n;)V

    iput-object p1, p0, Lj4/o;->I:Lw3/n;

    return-void
.end method

.method public final q0(JJ)Z
    .locals 19

    move-object/from16 v15, p0

    invoke-virtual/range {p0 .. p0}, Lj4/o;->I0()Z

    move-result v0

    const/16 v16, 0x1

    const/4 v14, 0x0

    if-nez v0, :cond_b

    iget-boolean v0, v15, Lj4/o;->b0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, v15, Lj4/o;->w0:Z

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, v15, Lj4/o;->O:Lj4/l;

    iget-object v1, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lj4/l;->g(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual/range {p0 .. p0}, Lj4/o;->a1()V

    iget-boolean v0, v15, Lj4/o;->B0:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lj4/o;->f1()V

    :cond_0
    return v14

    :cond_1
    iget-object v0, v15, Lj4/o;->O:Lj4/l;

    iget-object v1, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    invoke-interface {v0, v1}, Lj4/l;->g(Landroid/media/MediaCodec$BufferInfo;)I

    move-result v0

    :goto_0
    if-gez v0, :cond_5

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lj4/o;->c1()V

    return v16

    :cond_2
    iget-boolean v0, v15, Lj4/o;->g0:Z

    if-eqz v0, :cond_4

    iget-boolean v0, v15, Lj4/o;->A0:Z

    if-nez v0, :cond_3

    iget v0, v15, Lj4/o;->t0:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lj4/o;->a1()V

    :cond_4
    return v14

    :cond_5
    iget-boolean v1, v15, Lj4/o;->f0:Z

    if-eqz v1, :cond_6

    iput-boolean v14, v15, Lj4/o;->f0:Z

    iget-object v1, v15, Lj4/o;->O:Lj4/l;

    invoke-interface {v1, v0, v14}, Lj4/l;->h(IZ)V

    return v16

    :cond_6
    iget-object v1, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-nez v2, :cond_7

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_7

    invoke-virtual/range {p0 .. p0}, Lj4/o;->a1()V

    return v14

    :cond_7
    iput v0, v15, Lj4/o;->k0:I

    iget-object v1, v15, Lj4/o;->O:Lj4/l;

    invoke-interface {v1, v0}, Lj4/l;->n(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v15, Lj4/o;->l0:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_8

    iget-object v1, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v15, Lj4/o;->l0:Ljava/nio/ByteBuffer;

    iget-object v1, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget v2, v1, Landroid/media/MediaCodec$BufferInfo;->offset:I

    iget v1, v1, Landroid/media/MediaCodec$BufferInfo;->size:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_8
    iget-boolean v0, v15, Lj4/o;->c0:Z

    if-eqz v0, :cond_9

    iget-object v0, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_9

    iget v1, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_9

    iget-wide v1, v15, Lj4/o;->y0:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_9

    iput-wide v1, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    :cond_9
    iget-object v0, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v15, v0, v1}, Lj4/o;->L0(J)Z

    move-result v0

    iput-boolean v0, v15, Lj4/o;->m0:Z

    iget-wide v0, v15, Lj4/o;->z0:J

    iget-object v2, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v2, v2, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_a

    move/from16 v0, v16

    goto :goto_1

    :cond_a
    move v0, v14

    :goto_1
    iput-boolean v0, v15, Lj4/o;->n0:Z

    invoke-virtual {v15, v2, v3}, Lj4/o;->y1(J)V

    :cond_b
    iget-boolean v0, v15, Lj4/o;->b0:Z

    if-eqz v0, :cond_d

    iget-boolean v0, v15, Lj4/o;->w0:Z

    if-eqz v0, :cond_d

    :try_start_1
    iget-object v5, v15, Lj4/o;->O:Lj4/l;

    iget-object v6, v15, Lj4/o;->l0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lj4/o;->k0:I

    iget-object v0, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lj4/o;->m0:Z

    iget-boolean v13, v15, Lj4/o;->n0:Z

    iget-object v3, v15, Lj4/o;->G:Ls3/m1;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v17, v3

    move-wide/from16 v3, p3

    move/from16 v18, v14

    move-object/from16 v14, v17

    :try_start_2
    invoke-virtual/range {v0 .. v14}, Lj4/o;->b1(JJLj4/l;Ljava/nio/ByteBuffer;IIIJZZLs3/m1;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_1
    move/from16 v18, v14

    :catch_2
    invoke-virtual/range {p0 .. p0}, Lj4/o;->a1()V

    iget-boolean v0, v15, Lj4/o;->B0:Z

    if-eqz v0, :cond_c

    invoke-virtual/range {p0 .. p0}, Lj4/o;->f1()V

    :cond_c
    return v18

    :cond_d
    move/from16 v18, v14

    iget-object v5, v15, Lj4/o;->O:Lj4/l;

    iget-object v6, v15, Lj4/o;->l0:Ljava/nio/ByteBuffer;

    iget v7, v15, Lj4/o;->k0:I

    iget-object v0, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget v8, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v9, 0x1

    iget-wide v10, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget-boolean v12, v15, Lj4/o;->m0:Z

    iget-boolean v13, v15, Lj4/o;->n0:Z

    iget-object v14, v15, Lj4/o;->G:Ls3/m1;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual/range {v0 .. v14}, Lj4/o;->b1(JJLj4/l;Ljava/nio/ByteBuffer;IIIJZZLs3/m1;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_10

    iget-object v0, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget-wide v0, v0, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    invoke-virtual {v15, v0, v1}, Lj4/o;->X0(J)V

    iget-object v0, v15, Lj4/o;->D:Landroid/media/MediaCodec$BufferInfo;

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_e

    move/from16 v14, v16

    goto :goto_3

    :cond_e
    move/from16 v14, v18

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lj4/o;->k1()V

    if-nez v14, :cond_f

    return v16

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lj4/o;->a1()V

    :cond_10
    return v18
.end method

.method public final q1(J)Z
    .locals 4

    iget-wide v0, p0, Lj4/o;->L:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    iget-wide p1, p0, Lj4/o;->L:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final r0(Lj4/n;Ls3/m1;Lw3/n;Lw3/n;)Z
    .locals 4

    const/4 v0, 0x0

    if-ne p3, p4, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p4, :cond_8

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p4}, Lw3/n;->b()Ljava/util/UUID;

    move-result-object v2

    invoke-interface {p3}, Lw3/n;->b()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    sget v2, Lp5/n0;->a:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_3

    return v1

    :cond_3
    sget-object v2, Ls3/i;->e:Ljava/util/UUID;

    invoke-interface {p3}, Lw3/n;->b()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    invoke-interface {p4}, Lw3/n;->b()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p4}, Lj4/o;->D0(Lw3/n;)Lw3/c0;

    move-result-object p3

    if-nez p3, :cond_5

    return v1

    :cond_5
    iget-boolean p3, p3, Lw3/c0;->c:Z

    if-eqz p3, :cond_6

    move p2, v0

    goto :goto_0

    :cond_6
    iget-object p2, p2, Ls3/m1;->s:Ljava/lang/String;

    invoke-interface {p4, p2}, Lw3/n;->h(Ljava/lang/String;)Z

    move-result p2

    :goto_0
    iget-boolean p1, p1, Lj4/n;->g:Z

    if-nez p1, :cond_7

    if-eqz p2, :cond_7

    return v1

    :cond_7
    return v0

    :cond_8
    :goto_1
    return v1
.end method

.method public r1(Lj4/n;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final s0()Z
    .locals 15

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_1d

    iget v0, p0, Lj4/o;->t0:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1d

    iget-boolean v3, p0, Lj4/o;->A0:Z

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj4/o;->s1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lj4/o;->o0()V

    :cond_1
    iget v0, p0, Lj4/o;->j0:I

    if-gez v0, :cond_3

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    invoke-interface {v0}, Lj4/l;->f()I

    move-result v0

    iput v0, p0, Lj4/o;->j0:I

    if-gez v0, :cond_2

    return v1

    :cond_2
    iget-object v3, p0, Lj4/o;->z:Lv3/g;

    iget-object v4, p0, Lj4/o;->O:Lj4/l;

    invoke-interface {v4, v0}, Lj4/l;->k(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v3, Lv3/g;->j:Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/g;->l()V

    :cond_3
    iget v0, p0, Lj4/o;->t0:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5

    iget-boolean v0, p0, Lj4/o;->g0:Z

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    iput-boolean v3, p0, Lj4/o;->w0:Z

    iget-object v4, p0, Lj4/o;->O:Lj4/l;

    iget v5, p0, Lj4/o;->j0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lj4/l;->m(IIIJI)V

    invoke-virtual {p0}, Lj4/o;->j1()V

    :goto_0
    iput v2, p0, Lj4/o;->t0:I

    return v1

    :cond_5
    iget-boolean v0, p0, Lj4/o;->e0:Z

    if-eqz v0, :cond_6

    iput-boolean v1, p0, Lj4/o;->e0:Z

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-object v0, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    sget-object v1, Lj4/o;->J0:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lj4/o;->O:Lj4/l;

    iget v5, p0, Lj4/o;->j0:I

    const/4 v6, 0x0

    array-length v7, v1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lj4/l;->m(IIIJI)V

    invoke-virtual {p0}, Lj4/o;->j1()V

    iput-boolean v3, p0, Lj4/o;->v0:Z

    return v3

    :cond_6
    iget v0, p0, Lj4/o;->s0:I

    if-ne v0, v3, :cond_8

    move v0, v1

    :goto_1
    iget-object v4, p0, Lj4/o;->P:Ls3/m1;

    iget-object v4, v4, Ls3/m1;->u:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_7

    iget-object v4, p0, Lj4/o;->P:Ls3/m1;

    iget-object v4, v4, Ls3/m1;->u:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    iget-object v5, p0, Lj4/o;->z:Lv3/g;

    iget-object v5, v5, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput v2, p0, Lj4/o;->s0:I

    :cond_8
    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-object v0, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    invoke-virtual {p0}, Ls3/f;->K()Ls3/n1;

    move-result-object v4

    :try_start_0
    iget-object v5, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {p0, v4, v5, v1}, Ls3/f;->W(Ls3/n1;Lv3/g;I)I

    move-result v5
    :try_end_0
    .catch Lv3/g$a; {:try_start_0 .. :try_end_0} :catch_2

    invoke-virtual {p0}, Ls3/f;->j()Z

    move-result v6

    if-nez v6, :cond_9

    iget-object v6, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v6}, Lv3/a;->t()Z

    move-result v6

    if-eqz v6, :cond_a

    :cond_9
    iget-wide v6, p0, Lj4/o;->y0:J

    iput-wide v6, p0, Lj4/o;->z0:J

    :cond_a
    const/4 v6, -0x3

    if-ne v5, v6, :cond_b

    return v1

    :cond_b
    const/4 v6, -0x5

    if-ne v5, v6, :cond_d

    iget v0, p0, Lj4/o;->s0:I

    if-ne v0, v2, :cond_c

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/g;->l()V

    iput v3, p0, Lj4/o;->s0:I

    :cond_c
    invoke-virtual {p0, v4}, Lj4/o;->U0(Ls3/n1;)Lv3/i;

    return v3

    :cond_d
    iget-object v4, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v4}, Lv3/a;->q()Z

    move-result v4

    if-eqz v4, :cond_11

    iget v0, p0, Lj4/o;->s0:I

    if-ne v0, v2, :cond_e

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/g;->l()V

    iput v3, p0, Lj4/o;->s0:I

    :cond_e
    iput-boolean v3, p0, Lj4/o;->A0:Z

    iget-boolean v0, p0, Lj4/o;->v0:Z

    if-nez v0, :cond_f

    invoke-virtual {p0}, Lj4/o;->a1()V

    return v1

    :cond_f
    :try_start_1
    iget-boolean v0, p0, Lj4/o;->g0:Z

    if-eqz v0, :cond_10

    goto :goto_2

    :cond_10
    iput-boolean v3, p0, Lj4/o;->w0:Z

    iget-object v4, p0, Lj4/o;->O:Lj4/l;

    iget v5, p0, Lj4/o;->j0:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    invoke-interface/range {v4 .. v10}, Lj4/l;->m(IIIJI)V

    invoke-virtual {p0}, Lj4/o;->j1()V
    :try_end_1
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    return v1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lp5/n0;->U(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object v0

    throw v0

    :cond_11
    iget-boolean v4, p0, Lj4/o;->v0:Z

    if-nez v4, :cond_13

    iget-object v4, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v4}, Lv3/a;->s()Z

    move-result v4

    if-nez v4, :cond_13

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/g;->l()V

    iget v0, p0, Lj4/o;->s0:I

    if-ne v0, v2, :cond_12

    iput v3, p0, Lj4/o;->s0:I

    :cond_12
    return v3

    :cond_13
    iget-object v2, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v2}, Lv3/g;->y()Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v4, p0, Lj4/o;->z:Lv3/g;

    iget-object v4, v4, Lv3/g;->i:Lv3/c;

    invoke-virtual {v4, v0}, Lv3/c;->b(I)V

    :cond_14
    iget-boolean v0, p0, Lj4/o;->X:Z

    if-eqz v0, :cond_16

    if-nez v2, :cond_16

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-object v0, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp5/w;->b(Ljava/nio/ByteBuffer;)V

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-object v0, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    if-nez v0, :cond_15

    return v3

    :cond_15
    iput-boolean v1, p0, Lj4/o;->X:Z

    :cond_16
    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-wide v4, v0, Lv3/g;->l:J

    iget-object v6, p0, Lj4/o;->h0:Lj4/i;

    if-eqz v6, :cond_17

    iget-object v4, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {v6, v4, v0}, Lj4/i;->d(Ls3/m1;Lv3/g;)J

    move-result-wide v4

    iget-wide v6, p0, Lj4/o;->y0:J

    iget-object v0, p0, Lj4/o;->h0:Lj4/i;

    iget-object v8, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {v0, v8}, Lj4/i;->b(Ls3/m1;)J

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iput-wide v6, p0, Lj4/o;->y0:J

    :cond_17
    move-wide v12, v4

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/a;->p()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lj4/o;->C:Ljava/util/ArrayList;

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    iget-boolean v0, p0, Lj4/o;->C0:Z

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lj4/o;->E:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj4/o$c;

    goto :goto_3

    :cond_19
    iget-object v0, p0, Lj4/o;->G0:Lj4/o$c;

    :goto_3
    iget-object v0, v0, Lj4/o$c;->d:Lp5/i0;

    iget-object v4, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {v0, v12, v13, v4}, Lp5/i0;->a(JLjava/lang/Object;)V

    iput-boolean v1, p0, Lj4/o;->C0:Z

    :cond_1a
    iget-wide v4, p0, Lj4/o;->y0:J

    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lj4/o;->y0:J

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/g;->x()V

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {v0}, Lv3/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {p0, v0}, Lj4/o;->H0(Lv3/g;)V

    :cond_1b
    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    invoke-virtual {p0, v0}, Lj4/o;->Z0(Lv3/g;)V

    if-eqz v2, :cond_1c

    :try_start_2
    iget-object v8, p0, Lj4/o;->O:Lj4/l;

    iget v9, p0, Lj4/o;->j0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-object v11, v0, Lv3/g;->i:Lv3/c;

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lj4/l;->c(IILv3/c;JI)V

    goto :goto_4

    :cond_1c
    iget-object v8, p0, Lj4/o;->O:Lj4/l;

    iget v9, p0, Lj4/o;->j0:I

    const/4 v10, 0x0

    iget-object v0, p0, Lj4/o;->z:Lv3/g;

    iget-object v0, v0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v11

    const/4 v14, 0x0

    invoke-interface/range {v8 .. v14}, Lj4/l;->m(IIIJI)V
    :try_end_2
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_4
    invoke-virtual {p0}, Lj4/o;->j1()V

    iput-boolean v3, p0, Lj4/o;->v0:Z

    iput v1, p0, Lj4/o;->s0:I

    iget-object v0, p0, Lj4/o;->F0:Lv3/e;

    iget v1, v0, Lv3/e;->c:I

    add-int/2addr v1, v3

    iput v1, v0, Lv3/e;->c:I

    return v3

    :catch_1
    move-exception v0

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {v0}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Lp5/n0;->U(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object v0

    throw v0

    :catch_2
    move-exception v0

    invoke-virtual {p0, v0}, Lj4/o;->R0(Ljava/lang/Exception;)V

    invoke-virtual {p0, v1}, Lj4/o;->d1(I)Z

    invoke-virtual {p0}, Lj4/o;->t0()V

    return v3

    :cond_1d
    :goto_5
    return v1
.end method

.method public s1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t(FF)V
    .locals 0

    iput p1, p0, Lj4/o;->M:F

    iput p2, p0, Lj4/o;->N:F

    iget-object p1, p0, Lj4/o;->P:Ls3/m1;

    invoke-virtual {p0, p1}, Lj4/o;->w1(Ls3/m1;)Z

    return-void
.end method

.method public final t0()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    invoke-interface {v0}, Lj4/l;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lj4/o;->h1()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lj4/o;->h1()V

    throw v0
.end method

.method public t1(Ls3/m1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final u0()Z
    .locals 1

    invoke-virtual {p0}, Lj4/o;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj4/o;->P0()V

    :cond_0
    return v0
.end method

.method public abstract u1(Lj4/q;Ls3/m1;)I
.end method

.method public v0()Z
    .locals 5

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lj4/o;->u0:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eq v0, v2, :cond_5

    iget-boolean v2, p0, Lj4/o;->Y:Z

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lj4/o;->Z:Z

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lj4/o;->x0:Z

    if-eqz v2, :cond_5

    :cond_1
    iget-boolean v2, p0, Lj4/o;->a0:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lj4/o;->w0:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    sget v0, Lp5/n0;->a:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    move v4, v1

    :goto_0
    invoke-static {v4}, Lp5/a;->f(Z)V

    if-lt v0, v2, :cond_4

    :try_start_0
    invoke-virtual {p0}, Lj4/o;->x1()V
    :try_end_0
    .catch Ls3/q; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "MediaCodecRenderer"

    const-string v2, "Failed to update the DRM session, releasing the codec instead."

    invoke-static {v1, v2, v0}, Lp5/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lj4/o;->f1()V

    return v3

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lj4/o;->t0()V

    return v1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lj4/o;->f1()V

    return v3
.end method

.method public final w()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final w0(Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lj4/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lj4/o;->v:Lj4/q;

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    invoke-virtual {p0, v0, v1, p1}, Lj4/o;->C0(Lj4/q;Ls3/m1;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj4/o;->v:Lj4/q;

    iget-object v0, p0, Lj4/o;->F:Ls3/m1;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lj4/o;->C0(Lj4/q;Ls3/m1;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Drm session requires secure decoder for "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    iget-object v1, v1, Ls3/m1;->s:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", but no secure decoder available. Trying to proceed with "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "MediaCodecRenderer"

    invoke-static {v1, p1}, Lp5/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final w1(Ls3/m1;)Z
    .locals 4

    sget v0, Lp5/n0;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    if-eqz v0, :cond_6

    iget v0, p0, Lj4/o;->u0:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    invoke-virtual {p0}, Ls3/f;->getState()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lj4/o;->N:F

    invoke-virtual {p0}, Ls3/f;->N()[Ls3/m1;

    move-result-object v2

    invoke-virtual {p0, v0, p1, v2}, Lj4/o;->A0(FLs3/m1;[Ls3/m1;)F

    move-result p1

    iget v0, p0, Lj4/o;->S:F

    cmpl-float v2, v0, p1

    if-nez v2, :cond_2

    return v1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v3, p1, v2

    if-nez v3, :cond_3

    invoke-virtual {p0}, Lj4/o;->o0()V

    const/4 p1, 0x0

    return p1

    :cond_3
    cmpl-float v0, v0, v2

    if-nez v0, :cond_5

    iget v0, p0, Lj4/o;->x:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_4

    goto :goto_0

    :cond_4
    return v1

    :cond_5
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "operating-rate"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget-object v2, p0, Lj4/o;->O:Lj4/l;

    invoke-interface {v2, v0}, Lj4/l;->d(Landroid/os/Bundle;)V

    iput p1, p0, Lj4/o;->S:F

    :cond_6
    :goto_1
    return v1
.end method

.method public x(JJ)V
    .locals 5

    iget-boolean v0, p0, Lj4/o;->D0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lj4/o;->D0:Z

    invoke-virtual {p0}, Lj4/o;->a1()V

    :cond_0
    iget-object v0, p0, Lj4/o;->E0:Ls3/q;

    if-nez v0, :cond_a

    const/4 v0, 0x1

    :try_start_0
    iget-boolean v2, p0, Lj4/o;->B0:Z

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lj4/o;->g1()V

    return-void

    :cond_1
    iget-object v2, p0, Lj4/o;->F:Ls3/m1;

    if-nez v2, :cond_2

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lj4/o;->d1(I)Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lj4/o;->P0()V

    iget-boolean v2, p0, Lj4/o;->o0:Z

    if-eqz v2, :cond_4

    const-string v2, "bypassRender"

    invoke-static {v2}, Lp5/k0;->a(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lj4/o;->a0(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lp5/k0;->c()V

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lj4/o;->O:Lj4/l;

    if-eqz v2, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-string v4, "drainAndFeed"

    invoke-static {v4}, Lp5/k0;->a(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lj4/o;->q0(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0, v2, v3}, Lj4/o;->q1(J)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    invoke-virtual {p0}, Lj4/o;->s0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, v2, v3}, Lj4/o;->q1(J)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_6
    iget-object p3, p0, Lj4/o;->F0:Lv3/e;

    iget p4, p3, Lv3/e;->d:I

    invoke-virtual {p0, p1, p2}, Ls3/f;->Y(J)I

    move-result p1

    add-int/2addr p4, p1

    iput p4, p3, Lv3/e;->d:I

    invoke-virtual {p0, v0}, Lj4/o;->d1(I)Z

    :goto_3
    iget-object p1, p0, Lj4/o;->F0:Lv3/e;

    invoke-virtual {p1}, Lv3/e;->c()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lj4/o;->M0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0, p1}, Lj4/o;->R0(Ljava/lang/Exception;)V

    sget p2, Lp5/n0;->a:I

    const/16 p3, 0x15

    if-lt p2, p3, :cond_7

    invoke-static {p1}, Lj4/o;->O0(Ljava/lang/IllegalStateException;)Z

    move-result p2

    if-eqz p2, :cond_7

    move v1, v0

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lj4/o;->f1()V

    :cond_8
    invoke-virtual {p0}, Lj4/o;->y0()Lj4/n;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lj4/o;->l0(Ljava/lang/Throwable;Lj4/n;)Lj4/m;

    move-result-object p1

    iget-object p2, p0, Lj4/o;->F:Ls3/m1;

    const/16 p3, 0xfa3

    invoke-virtual {p0, p1, p2, v1, p3}, Ls3/f;->I(Ljava/lang/Throwable;Ls3/m1;ZI)Ls3/q;

    move-result-object p1

    throw p1

    :cond_9
    throw p1

    :cond_a
    const/4 p1, 0x0

    iput-object p1, p0, Lj4/o;->E0:Ls3/q;

    throw v0
.end method

.method public final x0()Lj4/l;
    .locals 1

    iget-object v0, p0, Lj4/o;->O:Lj4/l;

    return-object v0
.end method

.method public final x1()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lj4/o;->J:Landroid/media/MediaCrypto;

    iget-object v1, p0, Lj4/o;->I:Lw3/n;

    invoke-virtual {p0, v1}, Lj4/o;->D0(Lw3/n;)Lw3/c0;

    move-result-object v1

    iget-object v1, v1, Lw3/c0;->b:[B

    invoke-virtual {v0, v1}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lj4/o;->I:Lw3/n;

    invoke-virtual {p0, v0}, Lj4/o;->l1(Lw3/n;)V

    const/4 v0, 0x0

    iput v0, p0, Lj4/o;->t0:I

    iput v0, p0, Lj4/o;->u0:I

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lj4/o;->F:Ls3/m1;

    const/16 v2, 0x1776

    invoke-virtual {p0, v0, v1, v2}, Ls3/f;->H(Ljava/lang/Throwable;Ls3/m1;I)Ls3/q;

    move-result-object v0

    throw v0
.end method

.method public final y0()Lj4/n;
    .locals 1

    iget-object v0, p0, Lj4/o;->V:Lj4/n;

    return-object v0
.end method

.method public final y1(J)V
    .locals 1

    iget-object v0, p0, Lj4/o;->G0:Lj4/o$c;

    iget-object v0, v0, Lj4/o$c;->d:Lp5/i0;

    invoke-virtual {v0, p1, p2}, Lp5/i0;->i(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/m1;

    if-nez p1, :cond_0

    iget-boolean p2, p0, Lj4/o;->I0:Z

    if-eqz p2, :cond_0

    iget-object p2, p0, Lj4/o;->Q:Landroid/media/MediaFormat;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lj4/o;->G0:Lj4/o$c;

    iget-object p1, p1, Lj4/o$c;->d:Lp5/i0;

    invoke-virtual {p1}, Lp5/i0;->h()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/m1;

    :cond_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iput-object p1, p0, Lj4/o;->G:Ls3/m1;

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    if-nez p1, :cond_2

    iget-boolean p1, p0, Lj4/o;->R:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj4/o;->G:Ls3/m1;

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Lj4/o;->G:Ls3/m1;

    iget-object v0, p0, Lj4/o;->Q:Landroid/media/MediaFormat;

    invoke-virtual {p0, p1, v0}, Lj4/o;->V0(Ls3/m1;Landroid/media/MediaFormat;)V

    iput-boolean p2, p0, Lj4/o;->R:Z

    iput-boolean p2, p0, Lj4/o;->I0:Z

    :cond_3
    return-void
.end method

.method public z0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
