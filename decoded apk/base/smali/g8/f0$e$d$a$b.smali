.class public abstract Lg8/f0$e$d$a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/f0$e$d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/f0$e$d$a$b$b;,
        Lg8/f0$e$d$a$b$a;,
        Lg8/f0$e$d$a$b$d;,
        Lg8/f0$e$d$a$b$c;,
        Lg8/f0$e$d$a$b$e;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lg8/f0$e$d$a$b$b;
    .locals 1

    new-instance v0, Lg8/n$b;

    invoke-direct {v0}, Lg8/n$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lg8/f0$a;
.end method

.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg8/f0$e$d$a$b$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d()Lg8/f0$e$d$a$b$c;
.end method

.method public abstract e()Lg8/f0$e$d$a$b$d;
.end method

.method public abstract f()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg8/f0$e$d$a$b$e;",
            ">;"
        }
    .end annotation
.end method
