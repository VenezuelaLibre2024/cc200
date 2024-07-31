.class public interface abstract Lce/c2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/c2$a;,
        Lce/c2$b;
    }
.end annotation


# static fields
.field public static final c:Lce/c2$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lce/c2$b;->h:Lce/c2$b;

    sput-object v0, Lce/c2;->c:Lce/c2$b;

    return-void
.end method


# virtual methods
.method public abstract K()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract P(Ljd/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract a()Z
.end method

.method public abstract getParent()Lce/c2;
.end method

.method public abstract h0(Lce/w;)Lce/u;
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract l(ZZLsd/l;)Lce/i1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Lce/i1;"
        }
    .end annotation
.end method

.method public abstract start()Z
.end method

.method public abstract w()Lzd/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzd/b<",
            "Lce/c2;",
            ">;"
        }
    .end annotation
.end method

.method public abstract x0(Lsd/l;)Lce/i1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lgd/s;",
            ">;)",
            "Lce/i1;"
        }
    .end annotation
.end method

.method public abstract y0(Ljava/util/concurrent/CancellationException;)V
.end method
