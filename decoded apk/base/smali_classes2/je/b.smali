.class public final Lje/b;
.super Lce/s1;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final k:Lje/b;

.field public static final l:Lce/k0;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lje/b;

    invoke-direct {v0}, Lje/b;-><init>()V

    sput-object v0, Lje/b;->k:Lje/b;

    sget-object v0, Lje/m;->j:Lje/m;

    invoke-static {}, Lhe/m0;->a()I

    move-result v1

    const/16 v2, 0x40

    invoke-static {v2, v1}, Lxd/k;->a(II)I

    move-result v4

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lhe/m0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lje/m;->J0(I)Lce/k0;

    move-result-object v0

    sput-object v0, Lje/b;->l:Lce/k0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lce/s1;-><init>()V

    return-void
.end method


# virtual methods
.method public H0(Ljd/g;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lje/b;->l:Lce/k0;

    invoke-virtual {v0, p1, p2}, Lce/k0;->H0(Ljd/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ljd/h;->h:Ljd/h;

    invoke-virtual {p0, v0, p1}, Lje/b;->H0(Ljd/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
