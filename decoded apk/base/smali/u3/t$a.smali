.class public final Lu3/t$a;
.super Ljava/lang/Exception;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final h:Ls3/m1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls3/m1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lu3/t$a;->h:Ls3/m1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ls3/m1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lu3/t$a;->h:Ls3/m1;

    return-void
.end method
