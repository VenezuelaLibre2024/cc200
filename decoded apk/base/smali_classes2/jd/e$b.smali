.class public final Ljd/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/g$c<",
        "Ljd/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic h:Ljd/e$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljd/e$b;

    invoke-direct {v0}, Ljd/e$b;-><init>()V

    sput-object v0, Ljd/e$b;->h:Ljd/e$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
