.class public final Ls3/u1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/u1$j;,
        Ls3/u1$e;,
        Ls3/u1$d;,
        Ls3/u1$k;,
        Ls3/u1$l;,
        Ls3/u1$g;,
        Ls3/u1$i;,
        Ls3/u1$h;,
        Ls3/u1$b;,
        Ls3/u1$f;,
        Ls3/u1$c;
    }
.end annotation


# static fields
.field public static final p:Ls3/u1;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ljava/lang/String;

.field public static final u:Ljava/lang/String;

.field public static final v:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/u1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ls3/u1$h;

.field public final j:Ls3/u1$i;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final k:Ls3/u1$g;

.field public final l:Ls3/z1;

.field public final m:Ls3/u1$d;

.field public final n:Ls3/u1$e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final o:Ls3/u1$j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/u1$c;

    invoke-direct {v0}, Ls3/u1$c;-><init>()V

    invoke-virtual {v0}, Ls3/u1$c;->a()Ls3/u1;

    move-result-object v0

    sput-object v0, Ls3/u1;->p:Ls3/u1;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1;->q:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1;->r:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1;->s:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1;->t:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1;->u:Ljava/lang/String;

    sget-object v0, Ls3/t1;->a:Ls3/t1;

    sput-object v0, Ls3/u1;->v:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ls3/u1$e;Ls3/u1$i;Ls3/u1$g;Ls3/z1;Ls3/u1$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/u1;->h:Ljava/lang/String;

    iput-object p3, p0, Ls3/u1;->i:Ls3/u1$h;

    iput-object p3, p0, Ls3/u1;->j:Ls3/u1$i;

    iput-object p4, p0, Ls3/u1;->k:Ls3/u1$g;

    iput-object p5, p0, Ls3/u1;->l:Ls3/z1;

    iput-object p2, p0, Ls3/u1;->m:Ls3/u1$d;

    iput-object p2, p0, Ls3/u1;->n:Ls3/u1$e;

    iput-object p6, p0, Ls3/u1;->o:Ls3/u1$j;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ls3/u1$e;Ls3/u1$i;Ls3/u1$g;Ls3/z1;Ls3/u1$j;Ls3/u1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Ls3/u1;-><init>(Ljava/lang/String;Ls3/u1$e;Ls3/u1$i;Ls3/u1$g;Ls3/z1;Ls3/u1$j;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/u1;
    .locals 0

    invoke-static {p0}, Ls3/u1;->c(Landroid/os/Bundle;)Ls3/u1;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/os/Bundle;)Ls3/u1;
    .locals 8

    sget-object v0, Ls3/u1;->q:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lp5/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    sget-object v0, Ls3/u1;->r:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ls3/u1$g;->m:Ls3/u1$g;

    goto :goto_0

    :cond_0
    sget-object v1, Ls3/u1$g;->s:Ls3/h$a;

    invoke-interface {v1, v0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Ls3/u1$g;

    :goto_0
    move-object v5, v0

    sget-object v0, Ls3/u1;->s:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Ls3/z1;->P:Ls3/z1;

    goto :goto_1

    :cond_1
    sget-object v1, Ls3/z1;->x0:Ls3/h$a;

    invoke-interface {v1, v0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Ls3/z1;

    :goto_1
    move-object v6, v0

    sget-object v0, Ls3/u1;->t:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Ls3/u1$e;->t:Ls3/u1$e;

    goto :goto_2

    :cond_2
    sget-object v1, Ls3/u1$d;->s:Ls3/h$a;

    invoke-interface {v1, v0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object v0

    check-cast v0, Ls3/u1$e;

    :goto_2
    move-object v3, v0

    sget-object v0, Ls3/u1;->u:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_3

    sget-object p0, Ls3/u1$j;->k:Ls3/u1$j;

    goto :goto_3

    :cond_3
    sget-object v0, Ls3/u1$j;->o:Ls3/h$a;

    invoke-interface {v0, p0}, Ls3/h$a;->a(Landroid/os/Bundle;)Ls3/h;

    move-result-object p0

    check-cast p0, Ls3/u1$j;

    :goto_3
    move-object v7, p0

    new-instance p0, Ls3/u1;

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ls3/u1;-><init>(Ljava/lang/String;Ls3/u1$e;Ls3/u1$i;Ls3/u1$g;Ls3/z1;Ls3/u1$j;)V

    return-object p0
.end method

.method public static d(Landroid/net/Uri;)Ls3/u1;
    .locals 1

    new-instance v0, Ls3/u1$c;

    invoke-direct {v0}, Ls3/u1$c;-><init>()V

    invoke-virtual {v0, p0}, Ls3/u1$c;->e(Landroid/net/Uri;)Ls3/u1$c;

    move-result-object p0

    invoke-virtual {p0}, Ls3/u1$c;->a()Ls3/u1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Ls3/u1$c;
    .locals 2

    new-instance v0, Ls3/u1$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls3/u1$c;-><init>(Ls3/u1;Ls3/u1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls3/u1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls3/u1;

    iget-object v1, p0, Ls3/u1;->h:Ljava/lang/String;

    iget-object v3, p1, Ls3/u1;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1;->m:Ls3/u1$d;

    iget-object v3, p1, Ls3/u1;->m:Ls3/u1$d;

    invoke-virtual {v1, v3}, Ls3/u1$d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1;->i:Ls3/u1$h;

    iget-object v3, p1, Ls3/u1;->i:Ls3/u1$h;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1;->k:Ls3/u1$g;

    iget-object v3, p1, Ls3/u1;->k:Ls3/u1$g;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1;->l:Ls3/z1;

    iget-object v3, p1, Ls3/u1;->l:Ls3/z1;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1;->o:Ls3/u1$j;

    iget-object p1, p1, Ls3/u1;->o:Ls3/u1$j;

    invoke-static {v1, p1}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ls3/u1;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1;->i:Ls3/u1$h;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ls3/u1$h;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1;->k:Ls3/u1$g;

    invoke-virtual {v1}, Ls3/u1$g;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1;->m:Ls3/u1$d;

    invoke-virtual {v1}, Ls3/u1$d;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1;->l:Ls3/z1;

    invoke-virtual {v1}, Ls3/z1;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls3/u1;->o:Ls3/u1$j;

    invoke-virtual {v1}, Ls3/u1$j;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
