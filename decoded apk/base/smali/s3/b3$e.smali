.class public final Ls3/b3$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/b3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ljava/lang/String;

.field public static final u:Ljava/lang/String;

.field public static final v:Ljava/lang/String;

.field public static final w:Ljava/lang/String;

.field public static final x:Ljava/lang/String;

.field public static final y:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/b3$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/Object;

.field public final i:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final j:I

.field public final k:Ls3/u1;

.field public final l:Ljava/lang/Object;

.field public final m:I

.field public final n:J

.field public final o:J

.field public final p:I

.field public final q:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->r:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->s:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->t:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->u:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->v:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->w:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/b3$e;->x:Ljava/lang/String;

    sget-object v0, Ls3/d3;->a:Ls3/d3;

    sput-object v0, Ls3/b3$e;->y:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILs3/u1;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/b3$e;->h:Ljava/lang/Object;

    iput p2, p0, Ls3/b3$e;->i:I

    iput p2, p0, Ls3/b3$e;->j:I

    iput-object p3, p0, Ls3/b3$e;->k:Ls3/u1;

    iput-object p4, p0, Ls3/b3$e;->l:Ljava/lang/Object;

    iput p5, p0, Ls3/b3$e;->m:I

    iput-wide p6, p0, Ls3/b3$e;->n:J

    iput-wide p8, p0, Ls3/b3$e;->o:J

    iput p10, p0, Ls3/b3$e;->p:I

    iput p11, p0, Ls3/b3$e;->q:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/b3$e;
    .locals 0

    invoke-static {p0}, Ls3/b3$e;->b(Landroid/os/Bundle;)Ls3/b3$e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Ls3/b3$e;
    .locals 14

    sget-object v0, Ls3/b3$e;->r:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    sget-object v0, Ls3/b3$e;->s:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Ls3/u1;->v:Ls3/h$a;

    invoke-interface {v2, v0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Ls3/u1;

    :goto_0
    move-object v5, v0

    sget-object v0, Ls3/b3$e;->t:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    sget-object v0, Ls3/b3$e;->u:Ljava/lang/String;

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Ls3/b3$e;->v:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    sget-object v0, Ls3/b3$e;->w:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v12

    sget-object v0, Ls3/b3$e;->x:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    new-instance p0, Ls3/b3$e;

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Ls3/b3$e;-><init>(Ljava/lang/Object;ILs3/u1;Ljava/lang/Object;IJJII)V

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls3/b3$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls3/b3$e;

    iget v2, p0, Ls3/b3$e;->j:I

    iget v3, p1, Ls3/b3$e;->j:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls3/b3$e;->m:I

    iget v3, p1, Ls3/b3$e;->m:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ls3/b3$e;->n:J

    iget-wide v4, p1, Ls3/b3$e;->n:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Ls3/b3$e;->o:J

    iget-wide v4, p1, Ls3/b3$e;->o:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Ls3/b3$e;->p:I

    iget v3, p1, Ls3/b3$e;->p:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ls3/b3$e;->q:I

    iget v3, p1, Ls3/b3$e;->q:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ls3/b3$e;->h:Ljava/lang/Object;

    iget-object v3, p1, Ls3/b3$e;->h:Ljava/lang/Object;

    invoke-static {v2, v3}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/b3$e;->l:Ljava/lang/Object;

    iget-object v3, p1, Ls3/b3$e;->l:Ljava/lang/Object;

    invoke-static {v2, v3}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ls3/b3$e;->k:Ls3/u1;

    iget-object p1, p1, Ls3/b3$e;->k:Ls3/u1;

    invoke-static {v2, p1}, Lh7/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Ls3/b3$e;->h:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Ls3/b3$e;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Ls3/b3$e;->k:Ls3/u1;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Ls3/b3$e;->l:Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget v1, p0, Ls3/b3$e;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-wide v1, p0, Ls3/b3$e;->n:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-wide v1, p0, Ls3/b3$e;->o:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Ls3/b3$e;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Ls3/b3$e;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Lh7/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
