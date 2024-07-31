.class public final Lgd/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgd/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lgd/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lgd/p$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgd/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgd/p$a;-><init>(Ltd/g;)V

    sput-object v0, Lgd/p;->h:Lgd/p$a;

    return-void
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method
