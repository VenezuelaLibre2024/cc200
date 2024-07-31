.class public final Lje/e;
.super Lje/g;
.source ""


# static fields
.field public static final a:Lje/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lje/e;

    invoke-direct {v0}, Lje/e;-><init>()V

    sput-object v0, Lje/e;->a:Lje/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lje/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
