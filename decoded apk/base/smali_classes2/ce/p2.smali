.class public final Lce/p2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lce/i1;
.implements Lce/u;


# static fields
.field public static final h:Lce/p2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/p2;

    invoke-direct {v0}, Lce/p2;-><init>()V

    sput-object v0, Lce/p2;->h:Lce/p2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public dispose()V
    .locals 0

    return-void
.end method

.method public getParent()Lce/c2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
