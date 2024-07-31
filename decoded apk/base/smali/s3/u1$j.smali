.class public final Ls3/u1$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls3/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/u1$j$a;
    }
.end annotation


# static fields
.field public static final k:Ls3/u1$j;

.field public static final l:Ljava/lang/String;

.field public static final m:Ljava/lang/String;

.field public static final n:Ljava/lang/String;

.field public static final o:Ls3/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls3/h$a<",
            "Ls3/u1$j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Landroid/net/Uri;

.field public final i:Ljava/lang/String;

.field public final j:Landroid/os/Bundle;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls3/u1$j$a;

    invoke-direct {v0}, Ls3/u1$j$a;-><init>()V

    invoke-virtual {v0}, Ls3/u1$j$a;->d()Ls3/u1$j;

    move-result-object v0

    sput-object v0, Ls3/u1$j;->k:Ls3/u1$j;

    const/4 v0, 0x0

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$j;->l:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$j;->m:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp5/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/u1$j;->n:Ljava/lang/String;

    sget-object v0, Ls3/x1;->a:Ls3/x1;

    sput-object v0, Ls3/u1$j;->o:Ls3/h$a;

    return-void
.end method

.method public constructor <init>(Ls3/u1$j$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls3/u1$j$a;->a(Ls3/u1$j$a;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$j;->h:Landroid/net/Uri;

    invoke-static {p1}, Ls3/u1$j$a;->b(Ls3/u1$j$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ls3/u1$j;->i:Ljava/lang/String;

    invoke-static {p1}, Ls3/u1$j$a;->c(Ls3/u1$j$a;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Ls3/u1$j;->j:Landroid/os/Bundle;

    return-void
.end method

.method public synthetic constructor <init>(Ls3/u1$j$a;Ls3/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/u1$j;-><init>(Ls3/u1$j$a;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls3/u1$j;
    .locals 0

    invoke-static {p0}, Ls3/u1$j;->b(Landroid/os/Bundle;)Ls3/u1$j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/os/Bundle;)Ls3/u1$j;
    .locals 2

    new-instance v0, Ls3/u1$j$a;

    invoke-direct {v0}, Ls3/u1$j$a;-><init>()V

    sget-object v1, Ls3/u1$j;->l:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ls3/u1$j$a;->f(Landroid/net/Uri;)Ls3/u1$j$a;

    move-result-object v0

    sget-object v1, Ls3/u1$j;->m:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls3/u1$j$a;->g(Ljava/lang/String;)Ls3/u1$j$a;

    move-result-object v0

    sget-object v1, Ls3/u1$j;->n:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Ls3/u1$j$a;->e(Landroid/os/Bundle;)Ls3/u1$j$a;

    move-result-object p0

    invoke-virtual {p0}, Ls3/u1$j$a;->d()Ls3/u1$j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls3/u1$j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls3/u1$j;

    iget-object v1, p0, Ls3/u1$j;->h:Landroid/net/Uri;

    iget-object v3, p1, Ls3/u1$j;->h:Landroid/net/Uri;

    invoke-static {v1, v3}, Lp5/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls3/u1$j;->i:Ljava/lang/String;

    iget-object p1, p1, Ls3/u1$j;->i:Ljava/lang/String;

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
    .locals 3

    iget-object v0, p0, Ls3/u1$j;->h:Landroid/net/Uri;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ls3/u1$j;->i:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method
