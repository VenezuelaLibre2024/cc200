.class public final Lcom/google/android/exoplayer2/source/dash/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/r;
.implements Lu4/n0$a;
.implements Lw4/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/dash/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu4/r;",
        "Lu4/n0$a<",
        "Lw4/i<",
        "Lcom/google/android/exoplayer2/source/dash/a;",
        ">;>;",
        "Lw4/i$b<",
        "Lcom/google/android/exoplayer2/source/dash/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final F:Ljava/util/regex/Pattern;

.field public static final G:Ljava/util/regex/Pattern;


# instance fields
.field public A:[Lx4/i;

.field public B:Lu4/n0;

.field public C:Ly4/c;

.field public D:I

.field public E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/f;",
            ">;"
        }
    .end annotation
.end field

.field public final h:I

.field public final i:Lcom/google/android/exoplayer2/source/dash/a$a;

.field public final j:Lo5/m0;

.field public final k:Lw3/v;

.field public final l:Lo5/d0;

.field public final m:Lx4/b;

.field public final n:J

.field public final o:Lo5/f0;

.field public final p:Lo5/b;

.field public final q:Lu4/u0;

.field public final r:[Lcom/google/android/exoplayer2/source/dash/b$a;

.field public final s:Lu4/h;

.field public final t:Lcom/google/android/exoplayer2/source/dash/d;

.field public final u:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;",
            "Lcom/google/android/exoplayer2/source/dash/d$c;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Lu4/a0$a;

.field public final w:Lw3/u$a;

.field public final x:Lt3/s1;

.field public y:Lu4/r$a;

.field public z:[Lw4/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "CC([1-4])=(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/source/dash/b;->F:Ljava/util/regex/Pattern;

    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/exoplayer2/source/dash/b;->G:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(ILy4/c;Lx4/b;ILcom/google/android/exoplayer2/source/dash/a$a;Lo5/m0;Lw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;JLo5/f0;Lo5/b;Lu4/h;Lcom/google/android/exoplayer2/source/dash/d$b;Lt3/s1;)V
    .locals 8

    move-object v0, p0

    move-object v1, p2

    move v2, p4

    move-object v3, p7

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v6, p1

    iput v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->h:I

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/b;->C:Ly4/c;

    move-object v6, p3

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->m:Lx4/b;

    iput v2, v0, Lcom/google/android/exoplayer2/source/dash/b;->D:I

    move-object v6, p5

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->i:Lcom/google/android/exoplayer2/source/dash/a$a;

    move-object v6, p6

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->j:Lo5/m0;

    iput-object v3, v0, Lcom/google/android/exoplayer2/source/dash/b;->k:Lw3/v;

    move-object/from16 v6, p8

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->w:Lw3/u$a;

    move-object/from16 v6, p9

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->l:Lo5/d0;

    move-object/from16 v6, p10

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->v:Lu4/a0$a;

    move-wide/from16 v6, p11

    iput-wide v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->n:J

    move-object/from16 v6, p13

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->o:Lo5/f0;

    iput-object v4, v0, Lcom/google/android/exoplayer2/source/dash/b;->p:Lo5/b;

    iput-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b;->s:Lu4/h;

    move-object/from16 v6, p17

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->x:Lt3/s1;

    new-instance v6, Lcom/google/android/exoplayer2/source/dash/d;

    move-object/from16 v7, p16

    invoke-direct {v6, p2, v7, v4}, Lcom/google/android/exoplayer2/source/dash/d;-><init>(Ly4/c;Lcom/google/android/exoplayer2/source/dash/d$b;Lo5/b;)V

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->t:Lcom/google/android/exoplayer2/source/dash/d;

    const/4 v4, 0x0

    invoke-static {v4}, Lcom/google/android/exoplayer2/source/dash/b;->E(I)[Lw4/i;

    move-result-object v6

    iput-object v6, v0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    new-array v4, v4, [Lx4/i;

    iput-object v4, v0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lx4/i;

    new-instance v4, Ljava/util/IdentityHashMap;

    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v4, v0, Lcom/google/android/exoplayer2/source/dash/b;->u:Ljava/util/IdentityHashMap;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    invoke-interface {v5, v4}, Lu4/h;->a([Lu4/n0;)Lu4/n0;

    move-result-object v4

    iput-object v4, v0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    invoke-virtual {p2, p4}, Ly4/c;->d(I)Ly4/g;

    move-result-object v1

    iget-object v2, v1, Ly4/g;->d:Ljava/util/List;

    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/b;->E:Ljava/util/List;

    iget-object v1, v1, Ly4/g;->c:Ljava/util/List;

    invoke-static {p7, v1, v2}, Lcom/google/android/exoplayer2/source/dash/b;->u(Lw3/v;Ljava/util/List;Ljava/util/List;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lu4/u0;

    iput-object v2, v0, Lcom/google/android/exoplayer2/source/dash/b;->q:Lu4/u0;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [Lcom/google/android/exoplayer2/source/dash/b$a;

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/b;->r:[Lcom/google/android/exoplayer2/source/dash/b$a;

    return-void
.end method

.method public static C(Ljava/util/List;[I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;[I)Z"
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, p1, v2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly4/a;

    iget-object v3, v3, Ly4/a;->c:Ljava/util/List;

    move v4, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly4/j;

    iget-object v5, v5, Ly4/j;->e:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static D(ILjava/util/List;[[I[Z[[Ls3/m1;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;[[I[Z[[",
            "Ls3/m1;",
            ")I"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v0, p0, :cond_2

    aget-object v2, p2, v0

    invoke-static {p1, v2}, Lcom/google/android/exoplayer2/source/dash/b;->C(Ljava/util/List;[I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    aput-boolean v2, p3, v0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    aget-object v2, p2, v0

    invoke-static {p1, v2}, Lcom/google/android/exoplayer2/source/dash/b;->y(Ljava/util/List;[I)[Ls3/m1;

    move-result-object v2

    aput-object v2, p4, v0

    aget-object v2, p4, v0

    array-length v2, v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static E(I)[Lw4/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;"
        }
    .end annotation

    new-array p0, p0, [Lw4/i;

    return-object p0
.end method

.method public static G(Ly4/e;Ljava/util/regex/Pattern;Ls3/m1;)[Ls3/m1;
    .locals 9

    iget-object p0, p0, Ly4/e;->b:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p0, :cond_0

    new-array p0, v1, [Ls3/m1;

    aput-object p2, p0, v0

    return-object p0

    :cond_0
    const-string v2, ";"

    invoke-static {p0, v2}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v2, p0

    new-array v2, v2, [Ls3/m1;

    move v3, v0

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_2

    aget-object v4, p0, v3

    invoke-virtual {p1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-nez v5, :cond_1

    new-array p0, v1, [Ls3/m1;

    aput-object p2, p0, v0

    return-object p0

    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p2}, Ls3/m1;->b()Ls3/m1$b;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p2, Ls3/m1;->h:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ":"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v6

    invoke-virtual {v6, v5}, Ls3/m1$b;->H(I)Ls3/m1$b;

    move-result-object v5

    const/4 v6, 0x2

    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ls3/m1$b;->X(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v4

    invoke-virtual {v4}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method public static n(Ljava/util/List;[Lu4/s0;[Lcom/google/android/exoplayer2/source/dash/b$a;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/f;",
            ">;[",
            "Lu4/s0;",
            "[",
            "Lcom/google/android/exoplayer2/source/dash/b$a;",
            "I)V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly4/f;

    new-instance v3, Ls3/m1$b;

    invoke-direct {v3}, Ls3/m1$b;-><init>()V

    invoke-virtual {v2}, Ly4/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v3

    const-string v4, "application/x-emsg"

    invoke-virtual {v3, v4}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v3

    invoke-virtual {v3}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ly4/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lu4/s0;

    const/4 v5, 0x1

    new-array v5, v5, [Ls3/m1;

    aput-object v3, v5, v0

    invoke-direct {v4, v2, v5}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v4, p1, p3

    add-int/lit8 v2, p3, 0x1

    invoke-static {v1}, Lcom/google/android/exoplayer2/source/dash/b$a;->c(I)Lcom/google/android/exoplayer2/source/dash/b$a;

    move-result-object v3

    aput-object v3, p2, p3

    add-int/lit8 v1, v1, 0x1

    move p3, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static o(Lw3/v;Ljava/util/List;[[II[Z[[Ls3/m1;[Lu4/s0;[Lcom/google/android/exoplayer2/source/dash/b$a;)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/v;",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;[[II[Z[[",
            "Ls3/m1;",
            "[",
            "Lu4/s0;",
            "[",
            "Lcom/google/android/exoplayer2/source/dash/b$a;",
            ")I"
        }
    .end annotation

    move-object/from16 v0, p1

    const/4 v1, 0x0

    move/from16 v2, p3

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_7

    aget-object v5, p2, v3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    array-length v7, v5

    move v8, v1

    :goto_1
    if-ge v8, v7, :cond_0

    aget v9, v5, v8

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly4/a;

    iget-object v9, v9, Ly4/a;->c:Ljava/util/List;

    invoke-interface {v6, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    new-array v8, v7, [Ls3/m1;

    move v9, v1

    :goto_2
    if-ge v9, v7, :cond_1

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly4/j;

    iget-object v10, v10, Ly4/j;->b:Ls3/m1;

    move-object/from16 v11, p0

    invoke-interface {v11, v10}, Lw3/v;->e(Ls3/m1;)I

    move-result v12

    invoke-virtual {v10, v12}, Ls3/m1;->c(I)Ls3/m1;

    move-result-object v10

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_1
    move-object/from16 v11, p0

    aget v6, v5, v1

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly4/a;

    iget v7, v6, Ly4/a;->a:I

    const/4 v9, -0x1

    if-eq v7, v9, :cond_2

    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "unset:"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_3
    add-int/lit8 v10, v4, 0x1

    aget-boolean v12, p4, v3

    if-eqz v12, :cond_3

    add-int/lit8 v12, v10, 0x1

    goto :goto_4

    :cond_3
    move v12, v10

    move v10, v9

    :goto_4
    aget-object v13, p5, v3

    array-length v13, v13

    if-eqz v13, :cond_4

    add-int/lit8 v13, v12, 0x1

    goto :goto_5

    :cond_4
    move v13, v12

    move v12, v9

    :goto_5
    new-instance v14, Lu4/s0;

    invoke-direct {v14, v7, v8}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v14, p6, v4

    iget v6, v6, Ly4/a;->b:I

    invoke-static {v6, v5, v4, v10, v12}, Lcom/google/android/exoplayer2/source/dash/b$a;->d(I[IIII)Lcom/google/android/exoplayer2/source/dash/b$a;

    move-result-object v6

    aput-object v6, p7, v4

    if-eq v10, v9, :cond_5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ":emsg"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ls3/m1$b;

    invoke-direct {v8}, Ls3/m1$b;-><init>()V

    invoke-virtual {v8, v6}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v8

    const-string v14, "application/x-emsg"

    invoke-virtual {v8, v14}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object v8

    invoke-virtual {v8}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object v8

    new-instance v14, Lu4/s0;

    const/4 v15, 0x1

    new-array v15, v15, [Ls3/m1;

    aput-object v8, v15, v1

    invoke-direct {v14, v6, v15}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v14, p6, v10

    invoke-static {v5, v4}, Lcom/google/android/exoplayer2/source/dash/b$a;->b([II)Lcom/google/android/exoplayer2/source/dash/b$a;

    move-result-object v6

    aput-object v6, p7, v10

    :cond_5
    if-eq v12, v9, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ":cc"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lu4/s0;

    aget-object v8, p5, v3

    invoke-direct {v7, v6, v8}, Lu4/s0;-><init>(Ljava/lang/String;[Ls3/m1;)V

    aput-object v7, p6, v12

    invoke-static {v5, v4}, Lcom/google/android/exoplayer2/source/dash/b$a;->a([II)Lcom/google/android/exoplayer2/source/dash/b$a;

    move-result-object v4

    aput-object v4, p7, v12

    :cond_6
    add-int/lit8 v3, v3, 0x1

    move v4, v13

    goto/16 :goto_0

    :cond_7
    return v4
.end method

.method public static u(Lw3/v;Ljava/util/List;Ljava/util/List;)Landroid/util/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/v;",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;",
            "Ljava/util/List<",
            "Ly4/f;",
            ">;)",
            "Landroid/util/Pair<",
            "Lu4/u0;",
            "[",
            "Lcom/google/android/exoplayer2/source/dash/b$a;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/dash/b;->z(Ljava/util/List;)[[I

    move-result-object v2

    array-length v3, v2

    new-array v4, v3, [Z

    new-array v5, v3, [[Ls3/m1;

    invoke-static {v3, p1, v2, v4, v5}, Lcom/google/android/exoplayer2/source/dash/b;->D(ILjava/util/List;[[I[Z[[Ls3/m1;)I

    move-result v0

    add-int/2addr v0, v3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    new-array v8, v0, [Lu4/s0;

    new-array v9, v0, [Lcom/google/android/exoplayer2/source/dash/b$a;

    move-object v0, p0

    move-object v1, p1

    move-object v6, v8

    move-object v7, v9

    invoke-static/range {v0 .. v7}, Lcom/google/android/exoplayer2/source/dash/b;->o(Lw3/v;Ljava/util/List;[[II[Z[[Ls3/m1;[Lu4/s0;[Lcom/google/android/exoplayer2/source/dash/b$a;)I

    move-result p0

    invoke-static {p2, v8, v9, p0}, Lcom/google/android/exoplayer2/source/dash/b;->n(Ljava/util/List;[Lu4/s0;[Lcom/google/android/exoplayer2/source/dash/b$a;I)V

    new-instance p0, Lu4/u0;

    invoke-direct {p0, v8}, Lu4/u0;-><init>([Lu4/s0;)V

    invoke-static {p0, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static v(Ljava/util/List;)Ly4/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;)",
            "Ly4/e;"
        }
    .end annotation

    const-string v0, "urn:mpeg:dash:adaptation-set-switching:2016"

    invoke-static {p0, v0}, Lcom/google/android/exoplayer2/source/dash/b;->w(Ljava/util/List;Ljava/lang/String;)Ly4/e;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/util/List;Ljava/lang/String;)Ly4/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ly4/e;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly4/e;

    iget-object v2, v1, Ly4/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static x(Ljava/util/List;)Ly4/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/e;",
            ">;)",
            "Ly4/e;"
        }
    .end annotation

    const-string v0, "http://dashif.org/guidelines/trickmode"

    invoke-static {p0, v0}, Lcom/google/android/exoplayer2/source/dash/b;->w(Ljava/util/List;Ljava/lang/String;)Ly4/e;

    move-result-object p0

    return-object p0
.end method

.method public static y(Ljava/util/List;[I)[Ls3/m1;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;[I)[",
            "Ls3/m1;"
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    aget v3, p1, v2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly4/a;

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly4/a;

    iget-object v3, v3, Ly4/a;->d:Ljava/util/List;

    move v5, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly4/e;

    iget-object v7, v6, Ly4/e;->a:Ljava/lang/String;

    const-string v8, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    new-instance p0, Ls3/m1$b;

    invoke-direct {p0}, Ls3/m1$b;-><init>()V

    const-string p1, "application/cea-608"

    invoke-virtual {p0, p1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, v4, Ly4/a;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":cea608"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p0

    sget-object p1, Lcom/google/android/exoplayer2/source/dash/b;->F:Ljava/util/regex/Pattern;

    :goto_2
    invoke-static {v6, p1, p0}, Lcom/google/android/exoplayer2/source/dash/b;->G(Ly4/e;Ljava/util/regex/Pattern;Ls3/m1;)[Ls3/m1;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object v7, v6, Ly4/e;->a:Ljava/lang/String;

    const-string v8, "urn:scte:dash:cc:cea-708:2015"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    new-instance p0, Ls3/m1$b;

    invoke-direct {p0}, Ls3/m1$b;-><init>()V

    const-string p1, "application/cea-708"

    invoke-virtual {p0, p1}, Ls3/m1$b;->g0(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget v0, v4, Ly4/a;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":cea708"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls3/m1$b;->U(Ljava/lang/String;)Ls3/m1$b;

    move-result-object p0

    invoke-virtual {p0}, Ls3/m1$b;->G()Ls3/m1;

    move-result-object p0

    sget-object p1, Lcom/google/android/exoplayer2/source/dash/b;->G:Ljava/util/regex/Pattern;

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3
    new-array p0, v1, [Ls3/m1;

    return-object p0
.end method

.method public static z(Ljava/util/List;)[[I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly4/a;",
            ">;)[[I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1, v0}, Landroid/util/SparseIntArray;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3, v0}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_0

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly4/a;

    iget v6, v6, Ly4/a;->a:I

    invoke-virtual {v1, v6, v5}, Landroid/util/SparseIntArray;->put(II)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_1
    if-ge v5, v0, :cond_6

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly4/a;

    iget-object v7, v6, Ly4/a;->e:Ljava/util/List;

    invoke-static {v7}, Lcom/google/android/exoplayer2/source/dash/b;->x(Ljava/util/List;)Ly4/e;

    move-result-object v7

    if-nez v7, :cond_1

    iget-object v7, v6, Ly4/a;->f:Ljava/util/List;

    invoke-static {v7}, Lcom/google/android/exoplayer2/source/dash/b;->x(Ljava/util/List;)Ly4/e;

    move-result-object v7

    :cond_1
    const/4 v8, -0x1

    if-eqz v7, :cond_2

    iget-object v7, v7, Ly4/e;->b:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v1, v7, v8}, Landroid/util/SparseIntArray;->get(II)I

    move-result v7

    if-eq v7, v8, :cond_2

    goto :goto_2

    :cond_2
    move v7, v5

    :goto_2
    if-ne v7, v5, :cond_4

    iget-object v6, v6, Ly4/a;->f:Ljava/util/List;

    invoke-static {v6}, Lcom/google/android/exoplayer2/source/dash/b;->v(Ljava/util/List;)Ly4/e;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object v6, v6, Ly4/e;->b:Ljava/lang/String;

    const-string v9, ","

    invoke-static {v6, v9}, Lp5/n0;->Q0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v9, v6

    move v10, v4

    :goto_3
    if-ge v10, v9, :cond_4

    aget-object v11, v6, v10

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v1, v11, v8}, Landroid/util/SparseIntArray;->get(II)I

    move-result v11

    if-eq v11, v8, :cond_3

    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    if-eq v7, v5, :cond_5

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v3, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3, v5, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-interface {v2, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p0

    new-array v0, p0, [[I

    :goto_4
    if-ge v4, p0, :cond_7

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lk7/e;->l(Ljava/util/Collection;)[I

    move-result-object v1

    aput-object v1, v0, v4

    aget-object v1, v0, v4

    invoke-static {v1}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    return-object v0
.end method


# virtual methods
.method public final A(I[I)I
    .locals 4

    aget p1, p2, p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/b;->r:[Lcom/google/android/exoplayer2/source/dash/b$a;

    aget-object p1, v1, p1

    iget p1, p1, Lcom/google/android/exoplayer2/source/dash/b$a;->e:I

    const/4 v1, 0x0

    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_2

    aget v2, p2, v1

    if-ne v2, p1, :cond_1

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/b;->r:[Lcom/google/android/exoplayer2/source/dash/b$a;

    aget-object v2, v3, v2

    iget v2, v2, Lcom/google/android/exoplayer2/source/dash/b$a;->c:I

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final B([Ln5/s;)[I
    .locals 4

    array-length v0, p1

    new-array v0, v0, [I

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/b;->q:Lu4/u0;

    aget-object v3, p1, v1

    invoke-interface {v3}, Ln5/v;->b()Lu4/s0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lu4/u0;->c(Lu4/s0;)I

    move-result v2

    aput v2, v0, v1

    goto :goto_1

    :cond_0
    const/4 v2, -0x1

    aput v2, v0, v1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public F(Lw4/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->y:Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    return-void
.end method

.method public H()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->t:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/dash/d;->o()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p0}, Lw4/i;->P(Lw4/i$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->y:Lu4/r$a;

    return-void
.end method

.method public final I([Ln5/s;[Z[Lu4/m0;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_4

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    aget-boolean v1, p2, v0

    if-nez v1, :cond_3

    :cond_0
    aget-object v1, p3, v0

    instance-of v1, v1, Lw4/i;

    if-eqz v1, :cond_1

    aget-object v1, p3, v0

    check-cast v1, Lw4/i;

    invoke-virtual {v1, p0}, Lw4/i;->P(Lw4/i$b;)V

    goto :goto_1

    :cond_1
    aget-object v1, p3, v0

    instance-of v1, v1, Lw4/i$a;

    if-eqz v1, :cond_2

    aget-object v1, p3, v0

    check-cast v1, Lw4/i$a;

    invoke-virtual {v1}, Lw4/i$a;->c()V

    :cond_2
    :goto_1
    const/4 v1, 0x0

    aput-object v1, p3, v0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final J([Ln5/s;[Lu4/m0;[I)V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_5

    aget-object v2, p2, v1

    instance-of v2, v2, Lu4/k;

    if-nez v2, :cond_0

    aget-object v2, p2, v1

    instance-of v2, v2, Lw4/i$a;

    if-eqz v2, :cond_4

    :cond_0
    invoke-virtual {p0, v1, p3}, Lcom/google/android/exoplayer2/source/dash/b;->A(I[I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    aget-object v2, p2, v1

    instance-of v2, v2, Lu4/k;

    goto :goto_1

    :cond_1
    aget-object v3, p2, v1

    instance-of v3, v3, Lw4/i$a;

    if-eqz v3, :cond_2

    aget-object v3, p2, v1

    check-cast v3, Lw4/i$a;

    iget-object v3, v3, Lw4/i$a;->h:Lw4/i;

    aget-object v2, p2, v2

    if-ne v3, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    if-nez v2, :cond_4

    aget-object v2, p2, v1

    instance-of v2, v2, Lw4/i$a;

    if-eqz v2, :cond_3

    aget-object v2, p2, v1

    check-cast v2, Lw4/i$a;

    invoke-virtual {v2}, Lw4/i$a;->c()V

    :cond_3
    const/4 v2, 0x0

    aput-object v2, p2, v1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final K([Ln5/s;[Lu4/m0;[ZJ[I)V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    const/4 v3, 0x1

    if-ge v1, v2, :cond_4

    aget-object v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    aget-object v4, p2, v1

    if-nez v4, :cond_2

    aput-boolean v3, p3, v1

    aget v3, p6, v1

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/b;->r:[Lcom/google/android/exoplayer2/source/dash/b$a;

    aget-object v3, v4, v3

    iget v4, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->c:I

    if-nez v4, :cond_1

    invoke-virtual {p0, v3, v2, p4, p5}, Lcom/google/android/exoplayer2/source/dash/b;->r(Lcom/google/android/exoplayer2/source/dash/b$a;Ln5/s;J)Lw4/i;

    move-result-object v2

    aput-object v2, p2, v1

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/b;->E:Ljava/util/List;

    iget v3, v3, Lcom/google/android/exoplayer2/source/dash/b$a;->d:I

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly4/f;

    invoke-interface {v2}, Ln5/v;->b()Lu4/s0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v2

    new-instance v4, Lx4/i;

    iget-object v5, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Ly4/c;

    iget-boolean v5, v5, Ly4/c;->d:Z

    invoke-direct {v4, v3, v2, v5}, Lx4/i;-><init>(Ly4/f;Ls3/m1;Z)V

    aput-object v4, p2, v1

    goto :goto_1

    :cond_2
    aget-object v3, p2, v1

    instance-of v3, v3, Lw4/i;

    if-eqz v3, :cond_3

    aget-object v3, p2, v1

    check-cast v3, Lw4/i;

    invoke-virtual {v3}, Lw4/i;->D()Lw4/j;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/dash/a;

    invoke-interface {v3, v2}, Lcom/google/android/exoplayer2/source/dash/a;->b(Ln5/s;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    array-length p3, p1

    if-ge v0, p3, :cond_7

    aget-object p3, p2, v0

    if-nez p3, :cond_6

    aget-object p3, p1, v0

    if-eqz p3, :cond_6

    aget p3, p6, v0

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/b;->r:[Lcom/google/android/exoplayer2/source/dash/b$a;

    aget-object p3, v1, p3

    iget v1, p3, Lcom/google/android/exoplayer2/source/dash/b$a;->c:I

    if-ne v1, v3, :cond_6

    invoke-virtual {p0, v0, p6}, Lcom/google/android/exoplayer2/source/dash/b;->A(I[I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_5

    new-instance p3, Lu4/k;

    invoke-direct {p3}, Lu4/k;-><init>()V

    aput-object p3, p2, v0

    goto :goto_3

    :cond_5
    aget-object v1, p2, v1

    check-cast v1, Lw4/i;

    iget p3, p3, Lcom/google/android/exoplayer2/source/dash/b$a;->b:I

    invoke-virtual {v1, p4, p5, p3}, Lw4/i;->S(JI)Lw4/i$a;

    move-result-object p3

    aput-object p3, p2, v0

    :cond_6
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public L(Ly4/c;I)V
    .locals 9

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->C:Ly4/c;

    iput p2, p0, Lcom/google/android/exoplayer2/source/dash/b;->D:I

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->t:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/d;->q(Ly4/c;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lw4/i;->D()Lw4/j;

    move-result-object v4

    check-cast v4, Lcom/google/android/exoplayer2/source/dash/a;

    invoke-interface {v4, p1, p2}, Lcom/google/android/exoplayer2/source/dash/a;->e(Ly4/c;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->y:Lu4/r$a;

    invoke-interface {v0, p0}, Lu4/n0$a;->e(Lu4/n0;)V

    :cond_1
    invoke-virtual {p1, p2}, Ly4/c;->d(I)Ly4/g;

    move-result-object v0

    iget-object v0, v0, Ly4/g;->d:Ljava/util/List;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->E:Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lx4/i;

    array-length v2, v0

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_5

    aget-object v4, v0, v3

    iget-object v5, p0, Lcom/google/android/exoplayer2/source/dash/b;->E:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly4/f;

    invoke-virtual {v6}, Ly4/f;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lx4/i;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {p1}, Ly4/c;->e()I

    move-result v5

    const/4 v7, 0x1

    sub-int/2addr v5, v7

    iget-boolean v8, p1, Ly4/c;->d:Z

    if-eqz v8, :cond_3

    if-ne p2, v5, :cond_3

    goto :goto_2

    :cond_3
    move v7, v1

    :goto_2
    invoke-virtual {v4, v6, v7}, Lx4/i;->d(Ly4/f;Z)V

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    invoke-interface {v0}, Lu4/n0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(J)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    invoke-interface {v0, p1, p2}, Lu4/n0;->c(J)Z

    move-result p1

    return p1
.end method

.method public d(JLs3/m3;)J
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lw4/i;->h:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Lw4/i;->d(JLs3/m3;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-wide p1
.end method

.method public bridge synthetic e(Lu4/n0;)V
    .locals 0

    check-cast p1, Lw4/i;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/dash/b;->F(Lw4/i;)V

    return-void
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    invoke-interface {v0}, Lu4/n0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    invoke-interface {v0, p1, p2}, Lu4/n0;->g(J)V

    return-void
.end method

.method public declared-synchronized h(Lw4/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->u:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/source/dash/d$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/dash/d$c;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public i(Lu4/r$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->y:Lu4/r$a;

    invoke-interface {p1, p0}, Lu4/r$a;->k(Lu4/r;)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    invoke-interface {v0}, Lu4/n0;->isLoading()Z

    move-result v0

    return v0
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->o:Lo5/f0;

    invoke-interface {v0}, Lo5/f0;->a()V

    return-void
.end method

.method public m(J)J
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2}, Lw4/i;->R(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lx4/i;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lx4/i;->c(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-wide p1
.end method

.method public p()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public q([Ln5/s;[Z[Lu4/m0;[ZJ)J
    .locals 7

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/source/dash/b;->B([Ln5/s;)[I

    move-result-object v6

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/source/dash/b;->I([Ln5/s;[Z[Lu4/m0;)V

    invoke-virtual {p0, p1, p3, v6}, Lcom/google/android/exoplayer2/source/dash/b;->J([Ln5/s;[Lu4/m0;[I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-wide v4, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/exoplayer2/source/dash/b;->K([Ln5/s;[Lu4/m0;[ZJ[I)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    array-length p4, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_2

    aget-object v1, p3, v0

    instance-of v2, v1, Lw4/i;

    if-eqz v2, :cond_0

    check-cast v1, Lw4/i;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    instance-of v2, v1, Lx4/i;

    if-eqz v2, :cond_1

    check-cast v1, Lx4/i;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    invoke-static {p3}, Lcom/google/android/exoplayer2/source/dash/b;->E(I)[Lw4/i;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lx4/i;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->A:[Lx4/i;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->s:Lu4/h;

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    invoke-interface {p1, p2}, Lu4/h;->a([Lu4/n0;)Lu4/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/b;->B:Lu4/n0;

    return-wide p5
.end method

.method public final r(Lcom/google/android/exoplayer2/source/dash/b$a;Ln5/s;J)Lw4/i;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/source/dash/b$a;",
            "Ln5/s;",
            "J)",
            "Lw4/i<",
            "Lcom/google/android/exoplayer2/source/dash/a;",
            ">;"
        }
    .end annotation

    move-object/from16 v14, p0

    move-object/from16 v0, p1

    iget v1, v0, Lcom/google/android/exoplayer2/source/dash/b$a;->f:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move/from16 v25, v3

    goto :goto_0

    :cond_0
    move/from16 v25, v4

    :goto_0
    const/4 v5, 0x0

    if-eqz v25, :cond_1

    iget-object v6, v14, Lcom/google/android/exoplayer2/source/dash/b;->q:Lu4/u0;

    invoke-virtual {v6, v1}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v1

    move v6, v3

    goto :goto_1

    :cond_1
    move v6, v4

    move-object v1, v5

    :goto_1
    iget v7, v0, Lcom/google/android/exoplayer2/source/dash/b$a;->g:I

    if-eq v7, v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    if-eqz v2, :cond_3

    iget-object v8, v14, Lcom/google/android/exoplayer2/source/dash/b;->q:Lu4/u0;

    invoke-virtual {v8, v7}, Lu4/u0;->b(I)Lu4/s0;

    move-result-object v7

    iget v8, v7, Lu4/s0;->h:I

    add-int/2addr v6, v8

    goto :goto_3

    :cond_3
    move-object v7, v5

    :goto_3
    new-array v8, v6, [Ls3/m1;

    new-array v6, v6, [I

    if-eqz v25, :cond_4

    invoke-virtual {v1, v4}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v1

    aput-object v1, v8, v4

    const/4 v1, 0x5

    aput v1, v6, v4

    move v1, v3

    goto :goto_4

    :cond_4
    move v1, v4

    :goto_4
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_5

    :goto_5
    iget v2, v7, Lu4/s0;->h:I

    if-ge v4, v2, :cond_5

    invoke-virtual {v7, v4}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object v2

    aput-object v2, v8, v1

    const/4 v2, 0x3

    aput v2, v6, v1

    aget-object v2, v8, v1

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v3

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_5
    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->C:Ly4/c;

    iget-boolean v1, v1, Ly4/c;->d:Z

    if-eqz v1, :cond_6

    if-eqz v25, :cond_6

    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->t:Lcom/google/android/exoplayer2/source/dash/d;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/source/dash/d;->k()Lcom/google/android/exoplayer2/source/dash/d$c;

    move-result-object v5

    :cond_6
    move-object v13, v5

    iget-object v15, v14, Lcom/google/android/exoplayer2/source/dash/b;->i:Lcom/google/android/exoplayer2/source/dash/a$a;

    iget-object v1, v14, Lcom/google/android/exoplayer2/source/dash/b;->o:Lo5/f0;

    iget-object v2, v14, Lcom/google/android/exoplayer2/source/dash/b;->C:Ly4/c;

    iget-object v3, v14, Lcom/google/android/exoplayer2/source/dash/b;->m:Lx4/b;

    iget v4, v14, Lcom/google/android/exoplayer2/source/dash/b;->D:I

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/b$a;->a:[I

    iget v7, v0, Lcom/google/android/exoplayer2/source/dash/b$a;->b:I

    iget-wide v10, v14, Lcom/google/android/exoplayer2/source/dash/b;->n:J

    iget-object v12, v14, Lcom/google/android/exoplayer2/source/dash/b;->j:Lo5/m0;

    move-object/from16 v30, v8

    iget-object v8, v14, Lcom/google/android/exoplayer2/source/dash/b;->x:Lt3/s1;

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, p2

    move/from16 v22, v7

    move-wide/from16 v23, v10

    move-object/from16 v26, v9

    move-object/from16 v27, v13

    move-object/from16 v28, v12

    move-object/from16 v29, v8

    invoke-interface/range {v15 .. v29}, Lcom/google/android/exoplayer2/source/dash/a$a;->a(Lo5/f0;Ly4/c;Lx4/b;I[ILn5/s;IJZLjava/util/List;Lcom/google/android/exoplayer2/source/dash/d$c;Lo5/m0;Lt3/s1;)Lcom/google/android/exoplayer2/source/dash/a;

    move-result-object v5

    new-instance v15, Lw4/i;

    iget v2, v0, Lcom/google/android/exoplayer2/source/dash/b$a;->b:I

    iget-object v7, v14, Lcom/google/android/exoplayer2/source/dash/b;->p:Lo5/b;

    iget-object v10, v14, Lcom/google/android/exoplayer2/source/dash/b;->k:Lw3/v;

    iget-object v11, v14, Lcom/google/android/exoplayer2/source/dash/b;->w:Lw3/u$a;

    iget-object v12, v14, Lcom/google/android/exoplayer2/source/dash/b;->l:Lo5/d0;

    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->v:Lu4/a0$a;

    move-object v1, v15

    move-object v3, v6

    move-object/from16 v4, v30

    move-object/from16 v6, p0

    move-wide/from16 v8, p3

    move-object/from16 p2, v15

    move-object v15, v13

    move-object v13, v0

    invoke-direct/range {v1 .. v13}, Lw4/i;-><init>(I[I[Ls3/m1;Lw4/j;Lu4/n0$a;Lo5/b;JLw3/v;Lw3/u$a;Lo5/d0;Lu4/a0$a;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, v14, Lcom/google/android/exoplayer2/source/dash/b;->u:Ljava/util/IdentityHashMap;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v15}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public s()Lu4/u0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->q:Lu4/u0;

    return-object v0
.end method

.method public t(JZ)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/b;->z:[Lw4/i;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Lw4/i;->t(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
