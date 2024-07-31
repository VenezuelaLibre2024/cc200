.class public Lxd/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Character;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lxd/a$a;


# instance fields
.field public final h:C

.field public final i:C

.field public final j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxd/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxd/a$a;-><init>(Ltd/g;)V

    sput-object v0, Lxd/a;->k:Lxd/a$a;

    return-void
.end method

.method public constructor <init>(CCI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    iput-char p1, p0, Lxd/a;->h:C

    invoke-static {p1, p2, p3}, Lnd/c;->c(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, Lxd/a;->i:C

    iput p3, p0, Lxd/a;->j:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()C
    .locals 1

    iget-char v0, p0, Lxd/a;->h:C

    return v0
.end method

.method public final b()C
    .locals 1

    iget-char v0, p0, Lxd/a;->i:C

    return v0
.end method

.method public c()Lhd/l;
    .locals 4

    new-instance v0, Lxd/b;

    iget-char v1, p0, Lxd/a;->h:C

    iget-char v2, p0, Lxd/a;->i:C

    iget v3, p0, Lxd/a;->j:I

    invoke-direct {v0, v1, v2, v3}, Lxd/b;-><init>(CCI)V

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lxd/a;->c()Lhd/l;

    move-result-object v0

    return-object v0
.end method
