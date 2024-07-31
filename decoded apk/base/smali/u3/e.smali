.class public final Lu3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu3/e$c;,
        Lu3/e$b;,
        Lu3/e$e;,
        Lu3/e$d;
    }
.end annotation


# static fields
.field public static final n:Lu3/e;

.field public static final o:Ljava/lang/String;

.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Lu3/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public m:Lu3/e$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu3/e$e;

    invoke-direct {v0}, Lu3/e$e;-><init>()V

    invoke-virtual {v0}, Lu3/e$e;->a()Lu3/e;

    move-result-object v0

    sput-object v0, Lu3/e;->n:Lu3/e;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu3/e;->o:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu3/e;->p:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu3/e;->q:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu3/e;->r:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu3/e;->s:Ljava/lang/String;

    sget-object v0, Lu3/d;->a:Lu3/d;

    sput-object v0, Lu3/e;->t:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu3/e;->h:I

    iput p2, p0, Lu3/e;->i:I

    iput p3, p0, Lu3/e;->j:I

    iput p4, p0, Lu3/e;->k:I

    iput p5, p0, Lu3/e;->l:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILu3/e$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu3/e;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lu3/e;
    .locals 0

    invoke-static {p0}, Lu3/e;->c(Landroid/os/Bundle;)Lu3/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/os/Bundle;)Lu3/e;
    .locals 3

    new-instance v0, Lu3/e$e;

    invoke-direct {v0}, Lu3/e$e;-><init>()V

    sget-object v1, Lu3/e;->o:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu3/e$e;->c(I)Lu3/e$e;

    :cond_0
    sget-object v1, Lu3/e;->p:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu3/e$e;->d(I)Lu3/e$e;

    :cond_1
    sget-object v1, Lu3/e;->q:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu3/e$e;->f(I)Lu3/e$e;

    :cond_2
    sget-object v1, Lu3/e;->r:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lu3/e$e;->b(I)Lu3/e$e;

    :cond_3
    sget-object v1, Lu3/e;->s:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lu3/e$e;->e(I)Lu3/e$e;

    :cond_4
    invoke-virtual {v0}, Lu3/e$e;->a()Lu3/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lu3/e$d;
    .locals 2

    iget-object v0, p0, Lu3/e;->m:Lu3/e$d;

    if-nez v0, :cond_0

    new-instance v0, Lu3/e$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu3/e$d;-><init>(Lu3/e;Lu3/e$a;)V

    iput-object v0, p0, Lu3/e;->m:Lu3/e$d;

    :cond_0
    iget-object v0, p0, Lu3/e;->m:Lu3/e$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lu3/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lu3/e;

    iget v2, p0, Lu3/e;->h:I

    iget v3, p1, Lu3/e;->h:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu3/e;->i:I

    iget v3, p1, Lu3/e;->i:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu3/e;->j:I

    iget v3, p1, Lu3/e;->j:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu3/e;->k:I

    iget v3, p1, Lu3/e;->k:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lu3/e;->l:I

    iget p1, p1, Lu3/e;->l:I

    if-ne v2, p1, :cond_2

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
    .locals 2

    iget v0, p0, Lu3/e;->h:I

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu3/e;->i:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu3/e;->j:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu3/e;->k:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lu3/e;->l:I

    add-int/2addr v1, v0

    return v1
.end method
