.class public final enum Lce/r0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/r0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lce/r0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lce/r0;

.field public static final enum i:Lce/r0;

.field public static final enum j:Lce/r0;

.field public static final enum k:Lce/r0;

.field public static final synthetic l:[Lce/r0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lce/r0;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lce/r0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lce/r0;->h:Lce/r0;

    new-instance v0, Lce/r0;

    const-string v1, "LAZY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/r0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lce/r0;->i:Lce/r0;

    new-instance v0, Lce/r0;

    const-string v1, "ATOMIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lce/r0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lce/r0;->j:Lce/r0;

    new-instance v0, Lce/r0;

    const-string v1, "UNDISPATCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lce/r0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lce/r0;->k:Lce/r0;

    invoke-static {}, Lce/r0;->b()[Lce/r0;

    move-result-object v0

    sput-object v0, Lce/r0;->l:[Lce/r0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic b()[Lce/r0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lce/r0;

    sget-object v1, Lce/r0;->h:Lce/r0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lce/r0;->i:Lce/r0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lce/r0;->j:Lce/r0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lce/r0;->k:Lce/r0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lce/r0;
    .locals 1

    const-class v0, Lce/r0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lce/r0;

    return-object p0
.end method

.method public static values()[Lce/r0;
    .locals 1

    sget-object v0, Lce/r0;->l:[Lce/r0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lce/r0;

    return-object v0
.end method


# virtual methods
.method public final c(Lsd/p;Ljava/lang/Object;Ljd/d;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsd/p<",
            "-TR;-",
            "Ljd/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Ljd/d<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, Lce/r0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lgd/i;

    invoke-direct {p1}, Lgd/i;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2, p3}, Lie/b;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)V

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Ljd/f;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)V

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lie/a;->d(Lsd/p;Ljava/lang/Object;Ljd/d;Lsd/l;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final f()Z
    .locals 1

    sget-object v0, Lce/r0;->i:Lce/r0;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
