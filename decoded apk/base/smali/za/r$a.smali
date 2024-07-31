.class public final Lza/r$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lza/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method public constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lza/r$a;->a:Z

    iput p2, p0, Lza/r$a;->b:I

    return-void
.end method

.method public static a(I)Lza/r$a;
    .locals 2

    new-instance v0, Lza/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lza/r$a;-><init>(ZI)V

    return-object v0
.end method

.method public static b(I)Lza/r$a;
    .locals 2

    new-instance v0, Lza/r$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lza/r$a;-><init>(ZI)V

    return-object v0
.end method
