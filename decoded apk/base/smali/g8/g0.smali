.class public abstract Lg8/g0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/g0$b;,
        Lg8/g0$c;,
        Lg8/g0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lg8/g0$a;Lg8/g0$c;Lg8/g0$b;)Lg8/g0;
    .locals 1

    new-instance v0, Lg8/b0;

    invoke-direct {v0, p0, p1, p2}, Lg8/b0;-><init>(Lg8/g0$a;Lg8/g0$c;Lg8/g0$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Lg8/g0$a;
.end method

.method public abstract c()Lg8/g0$b;
.end method

.method public abstract d()Lg8/g0$c;
.end method
