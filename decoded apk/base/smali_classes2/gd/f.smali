.class public final Lgd/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lgd/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgd/f;

    invoke-direct {v0}, Lgd/f;-><init>()V

    sput-object v0, Lgd/f;->a:Lgd/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lgd/e;
    .locals 4

    new-instance v0, Lgd/e;

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/16 v3, 0x16

    invoke-direct {v0, v1, v2, v3}, Lgd/e;-><init>(III)V

    return-object v0
.end method
