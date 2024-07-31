.class public Ld9/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld9/a;


# static fields
.field public static a:Ld9/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ld9/b;
    .locals 1

    sget-object v0, Ld9/b;->a:Ld9/b;

    if-nez v0, :cond_0

    new-instance v0, Ld9/b;

    invoke-direct {v0}, Ld9/b;-><init>()V

    sput-object v0, Ld9/b;->a:Ld9/b;

    :cond_0
    sget-object v0, Ld9/b;->a:Ld9/b;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
