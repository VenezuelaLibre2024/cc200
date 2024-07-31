.class public final Lce/c2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/g$c<",
        "Lce/c2;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic h:Lce/c2$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/c2$b;

    invoke-direct {v0}, Lce/c2$b;-><init>()V

    sput-object v0, Lce/c2$b;->h:Lce/c2$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
