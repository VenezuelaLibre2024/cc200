.class public Ls3/u1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/u1$d$a;
    }
.end annotation


# static fields
.field public static final m:Ls3/u1$d;

.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/u1$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:J

.field public final i:J

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/u1$d$a;

    invoke-direct {v0}, Ls3/u1$d$a;-><init>()V

    invoke-virtual {v0}, Ls3/u1$d$a;->f()Ls3/u1$d;

    move-result-object v0

    sput-object v0, Ls3/u1$d;->m:Ls3/u1$d;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$d;->n:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$d;->o:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$d;->p:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$d;->q:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$d;->r:Ljava/lang/String;

    sget-object v0, Ls3/v1;->a:Ls3/v1;

    sput-object v0, Ls3/u1$d;->s:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ls3/u1$d$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls3/u1$d$a;->a(Ls3/u1$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Ls3/u1$d;->h:J

    invoke-static {p1}, Ls3/u1$d$a;->b(Ls3/u1$d$a;)J

    move-result-wide v0

    iput-wide v0, p0, Ls3/u1$d;->i:J

    invoke-static {p1}, Ls3/u1$d$a;->c(Ls3/u1$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ls3/u1$d;->j:Z

    invoke-static {p1}, Ls3/u1$d$a;->d(Ls3/u1$d$a;)Z

    move-result v0

    iput-boolean v0, p0, Ls3/u1$d;->k:Z

    invoke-static {p1}, Ls3/u1$d$a;->e(Ls3/u1$d$a;)Z

    move-result p1

    iput-boolean p1, p0, Ls3/u1$d;->l:Z

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$d$a;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$d;-><init>(Ls3/u1$d$a;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/u1$e;
    .locals 0

    invoke-static {p0}, Ls3/u1$d;->c(Landroid/os/Bundle;)Ls3/u1$e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/os/Bundle;)Ls3/u1$e;
    .locals 5

    new-instance v0, Ls3/u1$d$a;

    invoke-direct {v0}, Ls3/u1$d$a;-><init>()V

    sget-object v1, Ls3/u1$d;->n:Ljava/lang/String;

    sget-object v2, Ls3/u1$d;->m:Ls3/u1$d;

    iget-wide v3, v2, Ls3/u1$d;->h:J

    invoke-virtual {p0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ls3/u1$d$a;->k(J)Ls3/u1$d$a;

    move-result-object v0

    sget-object v1, Ls3/u1$d;->o:Ljava/lang/String;

    iget-wide v3, v2, Ls3/u1$d;->i:J

    invoke-virtual {p0, v1, v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ls3/u1$d$a;->h(J)Ls3/u1$d$a;

    move-result-object v0

    sget-object v1, Ls3/u1$d;->p:Ljava/lang/String;

    iget-boolean v3, v2, Ls3/u1$d;->j:Z

    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Ls3/u1$d$a;->j(Z)Ls3/u1$d$a;

    move-result-object v0

    sget-object v1, Ls3/u1$d;->q:Ljava/lang/String;

    iget-boolean v3, v2, Ls3/u1$d;->k:Z

    invoke-virtual {p0, v1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Ls3/u1$d$a;->i(Z)Ls3/u1$d$a;

    move-result-object v0

    sget-object v1, Ls3/u1$d;->r:Ljava/lang/String;

    iget-boolean v2, v2, Ls3/u1$d;->l:Z

    invoke-virtual {p0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {v0, p0}, Ls3/u1$d$a;->l(Z)Ls3/u1$d$a;

    move-result-object p0

    invoke-virtual {p0}, Ls3/u1$d$a;->g()Ls3/u1$e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls3/u1$d$a;
    .locals 2

    new-instance v0, Ls3/u1$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/u1$d$a;-><init>(Ls3/u1$d;Ls3/u1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls3/u1$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls3/u1$d;

    iget-wide v3, p0, Ls3/u1$d;->h:J

    iget-wide v5, p1, Ls3/u1$d;->h:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ls3/u1$d;->i:J

    iget-wide v5, p1, Ls3/u1$d;->i:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Ls3/u1$d;->j:Z

    iget-boolean v3, p1, Ls3/u1$d;->j:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ls3/u1$d;->k:Z

    iget-boolean v3, p1, Ls3/u1$d;->k:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ls3/u1$d;->l:Z

    iget-boolean p1, p1, Ls3/u1$d;->l:Z

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Ls3/u1$d;->h:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ls3/u1$d;->i:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls3/u1$d;->j:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls3/u1$d;->k:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls3/u1$d;->l:Z

    add-int/2addr v0, v1

    return v0
.end method
