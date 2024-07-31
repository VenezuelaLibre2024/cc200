.class public final Lce/k3;
.super Ljd/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/k3$a;
    }
.end annotation


# static fields
.field public static final j:Lce/k3$a;


# instance fields
.field public i:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lce/k3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lce/k3$a;-><init>(Ltd/g;)V

    sput-object v0, Lce/k3;->j:Lce/k3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lce/k3;->j:Lce/k3$a;

    invoke-direct {p0, v0}, Ljd/a;-><init>(Ljd/g$c;)V

    return-void
.end method
