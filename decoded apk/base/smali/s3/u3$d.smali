.class public final Ls3/u3$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final A:Ls3/u1;

.field public static final B:Ljava/lang/String;

.field public static final C:Ljava/lang/String;

.field public static final D:Ljava/lang/String;

.field public static final E:Ljava/lang/String;

.field public static final F:Ljava/lang/String;

.field public static final G:Ljava/lang/String;

.field public static final H:Ljava/lang/String;

.field public static final I:Ljava/lang/String;

.field public static final J:Ljava/lang/String;

.field public static final K:Ljava/lang/String;

.field public static final L:Ljava/lang/String;

.field public static final M:Ljava/lang/String;

.field public static final N:Ljava/lang/String;

.field public static final O:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/u3$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final y:Ljava/lang/Object;

.field public static final z:Ljava/lang/Object;


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public j:Ls3/u1;

.field public k:Ljava/lang/Object;

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z

.field public q:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public r:Ls3/u1$g;

.field public s:Z

.field public t:J

.field public u:J

.field public v:I

.field public w:I

.field public x:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls3/u3$d;->y:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls3/u3$d;->z:Ljava/lang/Object;

    new-instance v0, Ls3/u1$c;

    invoke-direct {v0}, Ls3/u1$c;-><init>()V

    const-string v1, "com.google.android.exoplayer2.Timeline"

    invoke-virtual {v0, v1}, Ls3/u1$c;->c(Ljava/lang/String;)Ls3/u1$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ls3/u1$c;->e(Landroid/net/Uri;)Ls3/u1$c;

    move-result-object v0

    invoke-virtual {v0}, Ls3/u1$c;->a()Ls3/u1;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->A:Ls3/u1;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->B:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->C:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->D:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->E:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->F:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->G:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->H:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->I:Ljava/lang/String;

    const/16 v0, 0x9

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->J:Ljava/lang/String;

    const/16 v0, 0xa

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->K:Ljava/lang/String;

    const/16 v0, 0xb

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->L:Ljava/lang/String;

    const/16 v0, 0xc

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->M:Ljava/lang/String;

    const/16 v0, 0xd

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u3$d;->N:Ljava/lang/String;

    sget-object v0, Ls3/w3;->a:Ls3/w3;

    sput-object v0, Ls3/u3$d;->O:Ls3/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ls3/u3$d;->y:Ljava/lang/Object;

    iput-object v0, p0, Ls3/u3$d;->h:Ljava/lang/Object;

    sget-object v0, Ls3/u3$d;->A:Ls3/u1;

    iput-object v0, p0, Ls3/u3$d;->j:Ls3/u1;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/u3$d;
    .locals 0

    invoke-static {p0}, Ls3/u3$d;->b(Landroid/os/Bundle;)Ls3/u3$d;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Ls3/u3$d;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Ls3/u3$d;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Ls3/u1;->v:Ls3/h$a;

    invoke-interface {v2, v1}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v1

    check-cast v1, Ls3/u1;

    goto :goto_0

    :cond_0
    sget-object v1, Ls3/u1;->p:Ls3/u1;

    :goto_0
    move-object v4, v1

    sget-object v1, Ls3/u3$d;->C:Ljava/lang/String;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v1, Ls3/u3$d;->D:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v1, Ls3/u3$d;->E:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v1, Ls3/u3$d;->F:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    sget-object v1, Ls3/u3$d;->G:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    sget-object v1, Ls3/u3$d;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v14, Ls3/u1$g;->s:Ls3/h$a;

    invoke-interface {v14, v1}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v1

    check-cast v1, Ls3/u1$g;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    move-object v14, v1

    sget-object v1, Ls3/u3$d;->I:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    sget-object v15, Ls3/u3$d;->J:Ljava/lang/String;

    move-wide/from16 v23, v6

    const-wide/16 v5, 0x0

    invoke-virtual {v0, v15, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v15

    sget-object v7, Ls3/u3$d;->K:Ljava/lang/String;

    invoke-virtual {v0, v7, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v17

    sget-object v2, Ls3/u3$d;->L:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v19

    sget-object v2, Ls3/u3$d;->M:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v20

    sget-object v2, Ls3/u3$d;->N:Ljava/lang/String;

    invoke-virtual {v0, v2, v5, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v21

    new-instance v0, Ls3/u3$d;

    move-object v2, v0

    invoke-direct {v0}, Ls3/u3$d;-><init>()V

    sget-object v3, Ls3/u3$d;->z:Ljava/lang/Object;

    const/4 v5, 0x0

    move-wide/from16 v6, v23

    invoke-virtual/range {v2 .. v22}, Ls3/u3$d;->h(Ljava/lang/Object;Ls3/u1;Ljava/lang/Object;JJJZZLs3/u1$g;JJIIJ)Ls3/u3$d;

    iput-boolean v1, v0, Ls3/u3$d;->s:Z

    return-object v0
.end method


# virtual methods
.method public c()J
    .locals 2

    iget-wide v0, p0, Ls3/u3$d;->n:J

    invoke-static {v0, v1}, Lp5/n0;->a0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Ls3/u3$d;->t:J

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Ls3/u3$d;->t:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls3/u3$d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    check-cast p1, Ls3/u3$d;

    iget-object v2, p0, Ls3/u3$d;->h:Ljava/lang/Object;

    iget-object v3, p1, Ls3/u3$d;->h:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/u3$d;->j:Ls3/u1;

    iget-object v3, p1, Ls3/u3$d;->j:Ls3/u1;

    invoke-static {v2, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/u3$d;->k:Ljava/lang/Object;

    iget-object v3, p1, Ls3/u3$d;->k:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/u3$d;->r:Ls3/u1$g;

    iget-object v3, p1, Ls3/u3$d;->r:Ls3/u1$g;

    invoke-static {v2, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Ls3/u3$d;->l:J

    iget-wide v4, p1, Ls3/u3$d;->l:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls3/u3$d;->m:J

    iget-wide v4, p1, Ls3/u3$d;->m:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls3/u3$d;->n:J

    iget-wide v4, p1, Ls3/u3$d;->n:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Ls3/u3$d;->o:Z

    iget-boolean v3, p1, Ls3/u3$d;->o:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ls3/u3$d;->p:Z

    iget-boolean v3, p1, Ls3/u3$d;->p:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ls3/u3$d;->s:Z

    iget-boolean v3, p1, Ls3/u3$d;->s:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls3/u3$d;->t:J

    iget-wide v4, p1, Ls3/u3$d;->t:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls3/u3$d;->u:J

    iget-wide v4, p1, Ls3/u3$d;->u:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Ls3/u3$d;->v:I

    iget v3, p1, Ls3/u3$d;->v:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls3/u3$d;->w:I

    iget v3, p1, Ls3/u3$d;->w:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls3/u3$d;->x:J

    iget-wide v4, p1, Ls3/u3$d;->x:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Ls3/u3$d;->u:J

    invoke-static {v0, v1}, Lp5/n0;->Y0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g()Z
    .locals 4

    iget-boolean v0, p0, Ls3/u3$d;->q:Z

    iget-object v1, p0, Ls3/u3$d;->r:Ls3/u1$g;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-ne v0, v1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-static {v0}, Lp5/a;->f(Z)V

    iget-object v0, p0, Ls3/u3$d;->r:Ls3/u1$g;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    return v2
.end method

.method public h(Ljava/lang/Object;Ls3/u1;Ljava/lang/Object;JJJZZLs3/u1$g;JJIIJ)Ls3/u3$d;
    .locals 5

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p12

    move-object v3, p1

    iput-object v3, v0, Ls3/u3$d;->h:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    sget-object v3, Ls3/u3$d;->A:Ls3/u1;

    :goto_0
    iput-object v3, v0, Ls3/u3$d;->j:Ls3/u1;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ls3/u1;->i:Ls3/u1$h;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ls3/u1$h;->i:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, v0, Ls3/u3$d;->i:Ljava/lang/Object;

    move-object v1, p3

    iput-object v1, v0, Ls3/u3$d;->k:Ljava/lang/Object;

    move-wide v3, p4

    iput-wide v3, v0, Ls3/u3$d;->l:J

    move-wide v3, p6

    iput-wide v3, v0, Ls3/u3$d;->m:J

    move-wide v3, p8

    iput-wide v3, v0, Ls3/u3$d;->n:J

    move v1, p10

    iput-boolean v1, v0, Ls3/u3$d;->o:Z

    move/from16 v1, p11

    iput-boolean v1, v0, Ls3/u3$d;->p:Z

    const/4 v1, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    iput-boolean v3, v0, Ls3/u3$d;->q:Z

    iput-object v2, v0, Ls3/u3$d;->r:Ls3/u1$g;

    move-wide/from16 v2, p13

    iput-wide v2, v0, Ls3/u3$d;->t:J

    move-wide/from16 v2, p15

    iput-wide v2, v0, Ls3/u3$d;->u:J

    move/from16 v2, p17

    iput v2, v0, Ls3/u3$d;->v:I

    move/from16 v2, p18

    iput v2, v0, Ls3/u3$d;->w:I

    move-wide/from16 v2, p19

    iput-wide v2, v0, Ls3/u3$d;->x:J

    iput-boolean v1, v0, Ls3/u3$d;->s:Z

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Ls3/u3$d;->h:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls3/u3$d;->j:Ls3/u1;

    invoke-virtual {v0}, Ls3/u1;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls3/u3$d;->k:Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ls3/u3$d;->r:Ls3/u1$g;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ls3/u1$g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls3/u3$d;->l:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls3/u3$d;->m:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls3/u3$d;->n:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls3/u3$d;->o:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls3/u3$d;->p:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v2, p0, Ls3/u3$d;->s:Z

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls3/u3$d;->t:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls3/u3$d;->u:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Ls3/u3$d;->v:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget v2, p0, Ls3/u3$d;->w:I

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ls3/u3$d;->x:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
