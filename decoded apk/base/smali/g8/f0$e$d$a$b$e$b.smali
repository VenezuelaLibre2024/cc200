.class public abstract Lg8/f0$e$d$a$b$e$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/f0$e$d$a$b$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/f0$e$d$a$b$e$b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lg8/f0$e$d$a$b$e$b$a;
    .locals 1

    new-instance v0, Lg8/s$b;

    invoke-direct {v0}, Lg8/s$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()I
.end method

.method public abstract d()J
.end method

.method public abstract e()J
.end method

.method public abstract f()Ljava/lang/String;
.end method
