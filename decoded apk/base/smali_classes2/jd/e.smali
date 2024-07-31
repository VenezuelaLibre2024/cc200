.class public interface abstract Ljd/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljd/e$b;,
        Ljd/e$a;
    }
.end annotation


# static fields
.field public static final e:Ljd/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljd/e$b;->h:Ljd/e$b;

    sput-object v0, Ljd/e;->e:Ljd/e$b;

    return-void
.end method


# virtual methods
.method public abstract c0(Ljd/d;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract s0(Ljd/d;)Ljd/d;
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
.end method
