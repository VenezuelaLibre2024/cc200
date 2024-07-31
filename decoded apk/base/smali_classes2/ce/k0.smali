.class public abstract Lce/k0;
.super Ljd/a;
.source ""

# interfaces
.implements Ljd/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/k0$a;
    }
.end annotation


# static fields
.field public static final i:Lce/k0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lce/k0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lce/k0$a;-><init>(Ltd/g;)V

    sput-object v0, Lce/k0;->i:Lce/k0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ljd/e;->e:Ljd/e$b;

    invoke-direct {p0, v0}, Ljd/a;-><init>(Ljd/g$c;)V

    return-void
.end method


# virtual methods
.method public abstract H0(Ljd/g;Ljava/lang/Runnable;)V
.end method

.method public I0(Ljd/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public J0(I)Lce/k0;
    .locals 1

    invoke-static {p1}, Lhe/t;->a(I)V

    new-instance v0, Lhe/s;

    invoke-direct {v0, p0, p1}, Lhe/s;-><init>(Lce/k0;I)V

    return-object v0
.end method

.method public b0(Ljd/g$c;)Ljd/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g$c<",
            "*>;)",
            "Ljd/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/e$a;->b(Ljd/e;Ljd/g$c;)Ljd/g;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Ljd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhe/l;

    invoke-virtual {p1}, Lhe/l;->t()V

    return-void
.end method

.method public d(Ljd/g$c;)Ljd/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ljd/g$b;",
            ">(",
            "Ljd/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljd/e$a;->a(Ljd/e;Ljd/g$c;)Ljd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final s0(Ljd/d;)Ljd/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/d<",
            "-TT;>;)",
            "Ljd/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lhe/l;

    invoke-direct {v0, p0, p1}, Lhe/l;-><init>(Lce/k0;Ljd/d;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lce/u0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lce/u0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
