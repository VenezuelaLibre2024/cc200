.class public final Lce/n1$c;
.super Lhe/r0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhe/r0<",
        "Lce/n1$b;",
        ">;"
    }
.end annotation


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lhe/r0;-><init>()V

    iput-wide p1, p0, Lce/n1$c;->c:J

    return-void
.end method
