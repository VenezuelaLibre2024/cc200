.class public abstract Lw0/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lw0/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lw0/d;
    .locals 1

    sget-object v0, Lw0/d;->a:Lw0/d;

    if-nez v0, :cond_0

    new-instance v0, Lw0/e;

    invoke-direct {v0}, Lw0/e;-><init>()V

    sput-object v0, Lw0/d;->a:Lw0/d;

    :cond_0
    sget-object v0, Lw0/d;->a:Lw0/d;

    return-object v0
.end method
