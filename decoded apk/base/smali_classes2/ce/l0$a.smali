.class public final Lce/l0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljd/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/g$c<",
        "Lce/l0;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic h:Lce/l0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/l0$a;

    invoke-direct {v0}, Lce/l0$a;-><init>()V

    sput-object v0, Lce/l0$a;->h:Lce/l0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
