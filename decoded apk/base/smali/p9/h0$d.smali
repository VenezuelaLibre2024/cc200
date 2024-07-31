.class public Lp9/h0$d;
.super Lp9/e0$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp9/e0<",
        "Lp9/h0$d;",
        ">.b;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final synthetic d:Lp9/h0;


# direct methods
.method public constructor <init>(Lp9/h0;Ljava/lang/Exception;J)V
    .locals 0

    iput-object p1, p0, Lp9/h0$d;->d:Lp9/h0;

    invoke-direct {p0, p1, p2}, Lp9/e0$b;-><init>(Lp9/e0;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lp9/h0$d;->c:J

    return-void
.end method
