.class public final Lv4/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/c$a;
    }
.end annotation


# static fields
.field public static final n:Lv4/c;

.field public static final o:Lv4/c$a;

.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Lv4/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/Object;

.field public final i:I

.field public final j:J

.field public final k:J

.field public final l:I

.field public final m:[Lv4/c$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v8, Lv4/c;

    const/4 v9, 0x0

    new-array v2, v9, [Lv4/c$a;

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lv4/c;-><init>(Ljava/lang/Object;[Lv4/c$a;JJI)V

    sput-object v8, Lv4/c;->n:Lv4/c;

    new-instance v0, Lv4/c$a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lv4/c$a;-><init>(J)V

    invoke-virtual {v0, v9}, Lv4/c$a;->i(I)Lv4/c$a;

    move-result-object v0

    sput-object v0, Lv4/c;->o:Lv4/c$a;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv4/c;->p:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv4/c;->q:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv4/c;->r:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv4/c;->s:Ljava/lang/String;

    sget-object v0, Lv4/a;->a:Lv4/a;

    sput-object v0, Lv4/c;->t:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Lv4/c$a;JJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/c;->h:Ljava/lang/Object;

    iput-wide p3, p0, Lv4/c;->j:J

    iput-wide p5, p0, Lv4/c;->k:J

    array-length p1, p2

    add-int/2addr p1, p7

    iput p1, p0, Lv4/c;->i:I

    iput-object p2, p0, Lv4/c;->m:[Lv4/c$a;

    iput p7, p0, Lv4/c;->l:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lv4/c;
    .locals 0

    invoke-static {p0}, Lv4/c;->b(Landroid/os/Bundle;)Lv4/c;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Lv4/c;
    .locals 11

    sget-object v0, Lv4/c;->p:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Lv4/c$a;

    move-object v5, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Lv4/c$a;

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    sget-object v3, Lv4/c$a;->x:Ls3/h$a;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    invoke-interface {v3, v4}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v3

    check-cast v3, Lv4/c$a;

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_1
    sget-object v0, Lv4/c;->q:Ljava/lang/String;

    sget-object v1, Lv4/c;->n:Lv4/c;

    iget-wide v2, v1, Lv4/c;->j:J

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v0, Lv4/c;->r:Ljava/lang/String;

    iget-wide v2, v1, Lv4/c;->k:J

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object v0, Lv4/c;->s:Ljava/lang/String;

    iget v1, v1, Lv4/c;->l:I

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v10

    new-instance p0, Lv4/c;

    const/4 v4, 0x0

    move-object v3, p0

    invoke-direct/range {v3 .. v10}, Lv4/c;-><init>(Ljava/lang/Object;[Lv4/c$a;JJI)V

    return-object p0
.end method


# virtual methods
.method public c(I)Lv4/c$a;
    .locals 2

    iget v0, p0, Lv4/c;->l:I

    if-ge p1, v0, :cond_0

    sget-object p1, Lv4/c;->o:Lv4/c$a;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lv4/c;->m:[Lv4/c$a;

    sub-int/2addr p1, v0

    aget-object p1, v1, p1

    :goto_0
    return-object p1
.end method

.method public d(JJ)I
    .locals 6

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    const/4 v3, -0x1

    if-eqz v2, :cond_4

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p3, v4

    if-eqz v2, :cond_0

    cmp-long p3, p1, p3

    if-ltz p3, :cond_0

    goto :goto_1

    :cond_0
    iget p3, p0, Lv4/c;->l:I

    :goto_0
    iget p4, p0, Lv4/c;->i:I

    if-ge p3, p4, :cond_3

    invoke-virtual {p0, p3}, Lv4/c;->c(I)Lv4/c$a;

    move-result-object p4

    iget-wide v4, p4, Lv4/c$a;->h:J

    cmp-long p4, v4, v0

    if-eqz p4, :cond_1

    invoke-virtual {p0, p3}, Lv4/c;->c(I)Lv4/c$a;

    move-result-object p4

    iget-wide v4, p4, Lv4/c$a;->h:J

    cmp-long p4, v4, p1

    if-lez p4, :cond_2

    :cond_1
    invoke-virtual {p0, p3}, Lv4/c;->c(I)Lv4/c$a;

    move-result-object p4

    invoke-virtual {p4}, Lv4/c$a;->h()Z

    move-result p4

    if-nez p4, :cond_3

    :cond_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    iget p1, p0, Lv4/c;->i:I

    if-ge p3, p1, :cond_4

    move v3, p3

    :cond_4
    :goto_1
    return v3
.end method

.method public e(JJ)I
    .locals 7

    iget v0, p0, Lv4/c;->i:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move v6, v0

    invoke-virtual/range {v1 .. v6}, Lv4/c;->f(JJI)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Lv4/c;->c(I)Lv4/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lv4/c$a;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, -0x1

    :goto_1
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lv4/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lv4/c;

    iget-object v2, p0, Lv4/c;->h:Ljava/lang/Object;

    iget-object v3, p1, Lv4/c;->h:Ljava/lang/Object;

    invoke-static {v2, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lv4/c;->i:I

    iget v3, p1, Lv4/c;->i:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lv4/c;->j:J

    iget-wide v4, p1, Lv4/c;->j:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lv4/c;->k:J

    iget-wide v4, p1, Lv4/c;->k:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lv4/c;->l:I

    iget v3, p1, Lv4/c;->l:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lv4/c;->m:[Lv4/c$a;

    iget-object p1, p1, Lv4/c;->m:[Lv4/c$a;

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

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

.method public final f(JJI)Z
    .locals 6

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p1, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    invoke-virtual {p0, p5}, Lv4/c;->c(I)Lv4/c$a;

    move-result-object p5

    iget-wide v4, p5, Lv4/c$a;->h:J

    cmp-long p5, v4, v0

    const/4 v0, 0x1

    if-nez p5, :cond_3

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p5, p3, v1

    if-eqz p5, :cond_1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    :cond_1
    move v3, v0

    :cond_2
    return v3

    :cond_3
    cmp-long p1, p1, v4

    if-gez p1, :cond_4

    move v3, v0

    :cond_4
    return v3
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lv4/c;->i:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv4/c;->h:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lv4/c;->j:J

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lv4/c;->k:J

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv4/c;->l:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv4/c;->m:[Lv4/c$a;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdPlaybackState(adsId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv4/c;->h:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", adResumePositionUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lv4/c;->j:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", adGroups=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lv4/c;->m:[Lv4/c$a;

    array-length v3, v3

    const-string v4, "])"

    if-ge v2, v3, :cond_8

    const-string v3, "adGroup(timeUs="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lv4/c;->m:[Lv4/c$a;

    aget-object v3, v3, v2

    iget-wide v5, v3, Lv4/c$a;->h:J

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", ads=["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v3, v1

    :goto_1
    iget-object v5, p0, Lv4/c;->m:[Lv4/c$a;

    aget-object v5, v5, v2

    iget-object v5, v5, Lv4/c$a;->l:[I

    array-length v5, v5

    const-string v6, ", "

    const/4 v7, 0x1

    if-ge v3, v5, :cond_6

    const-string v5, "ad(state="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lv4/c;->m:[Lv4/c$a;

    aget-object v5, v5, v2

    iget-object v5, v5, Lv4/c$a;->l:[I

    aget v5, v5, v3

    if-eqz v5, :cond_4

    if-eq v5, v7, :cond_3

    const/4 v8, 0x2

    if-eq v5, v8, :cond_2

    const/4 v8, 0x3

    if-eq v5, v8, :cond_1

    const/4 v8, 0x4

    if-eq v5, v8, :cond_0

    const/16 v5, 0x3f

    goto :goto_2

    :cond_0
    const/16 v5, 0x21

    goto :goto_2

    :cond_1
    const/16 v5, 0x50

    goto :goto_2

    :cond_2
    const/16 v5, 0x53

    goto :goto_2

    :cond_3
    const/16 v5, 0x52

    goto :goto_2

    :cond_4
    const/16 v5, 0x5f

    :goto_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, ", durationUs="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lv4/c;->m:[Lv4/c$a;

    aget-object v5, v5, v2

    iget-object v5, v5, Lv4/c$a;->m:[J

    aget-wide v8, v5, v3

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v5, 0x29

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lv4/c;->m:[Lv4/c$a;

    aget-object v5, v5, v2

    iget-object v5, v5, Lv4/c$a;->l:[I

    array-length v5, v5

    sub-int/2addr v5, v7

    if-ge v3, v5, :cond_5

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lv4/c;->m:[Lv4/c$a;

    array-length v3, v3

    sub-int/2addr v3, v7

    if-ge v2, v3, :cond_7

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
