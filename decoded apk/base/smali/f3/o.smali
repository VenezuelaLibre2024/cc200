.class public abstract Lf3/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf3/o$a;,
        Lf3/o$b;,
        Lf3/o$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lf3/o$a;
    .locals 1

    new-instance v0, Lf3/i$b;

    invoke-direct {v0}, Lf3/i$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lf3/o$b;
.end method

.method public abstract c()Lf3/o$c;
.end method