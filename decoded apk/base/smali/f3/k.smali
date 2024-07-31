.class public abstract Lf3/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf3/k$a;,
        Lf3/k$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lf3/k$a;
    .locals 1

    new-instance v0, Lf3/e$b;

    invoke-direct {v0}, Lf3/e$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lf3/a;
.end method

.method public abstract c()Lf3/k$b;
.end method
