.class public final Lge/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lge/g;

.field public static final i:Ljd/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lge/g;

    invoke-direct {v0}, Lge/g;-><init>()V

    sput-object v0, Lge/g;->h:Lge/g;

    sget-object v0, Ljd/h;->h:Ljd/h;

    sput-object v0, Lge/g;->i:Ljd/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Ljd/g;
    .locals 1

    sget-object v0, Lge/g;->i:Ljd/g;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
