.class public Lv3/g;
.super Lv3/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/g$a;
    }
.end annotation


# instance fields
.field public final i:Lv3/c;

.field public j:Ljava/nio/ByteBuffer;

.field public k:Z

.field public l:J

.field public m:Ljava/nio/ByteBuffer;

.field public final n:I

.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.decoder"

    invoke-static {v0}, Ls3/j1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lv3/g;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Lv3/a;-><init>()V

    new-instance v0, Lv3/c;

    invoke-direct {v0}, Lv3/c;-><init>()V

    iput-object v0, p0, Lv3/g;->i:Lv3/c;

    iput p1, p0, Lv3/g;->n:I

    iput p2, p0, Lv3/g;->o:I

    return-void
.end method

.method public static z()Lv3/g;
    .locals 2

    new-instance v0, Lv3/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv3/g;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public A(I)V
    .locals 1

    iget-object v0, p0, Lv3/g;->m:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lv3/g;->m:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lv3/g;->m:Ljava/nio/ByteBuffer;

    :goto_1
    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lv3/a;->l()V

    iget-object v0, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_0
    iget-object v0, p0, Lv3/g;->m:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lv3/g;->k:Z

    return-void
.end method

.method public final v(I)Ljava/nio/ByteBuffer;
    .locals 2

    iget v0, p0, Lv3/g;->n:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    :goto_0
    new-instance v1, Lv3/g$a;

    invoke-direct {v1, v0, p1}, Lv3/g$a;-><init>(II)V

    throw v1
.end method

.method public w(I)V
    .locals 3

    iget v0, p0, Lv3/g;->o:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lv3/g;->v(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v2

    add-int/2addr p1, v2

    if-lt v1, p1, :cond_1

    iput-object v0, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lv3/g;->v(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    if-lez v2, :cond_2

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_2
    iput-object p1, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public final x()V
    .locals 1

    iget-object v0, p0, Lv3/g;->j:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_0
    iget-object v0, p0, Lv3/g;->m:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :cond_1
    return-void
.end method

.method public final y()Z
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, v0}, Lv3/a;->n(I)Z

    move-result v0

    return v0
.end method
